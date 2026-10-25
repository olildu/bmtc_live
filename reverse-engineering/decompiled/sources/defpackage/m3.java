package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.BottomAppBarState;
import androidx.compose.material3.BottomSheetDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.carousel.CarouselPagerState;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.LayoutDirection;
import app.chalo.ads.AdTargetingProvider;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.ResolveSupportPolicyUseCase;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.checkout.data.resolver.product.ICheckoutProductDataResolver;
import app.chalo.checkout.domain.ConvertInaiUpiAppDetailToIndividualCheckoutItemUseCase;
import app.chalo.checkout.domain.CreateOrderForChaloPaymentUseCase;
import app.chalo.checkout.domain.FilterValidPaymentMethodsUseCase;
import app.chalo.checkout.domain.GetAdjustEventTokenRemoteConfigUseCase;
import app.chalo.checkout.domain.GetInaiCheckoutUseCase;
import app.chalo.checkout.domain.GetOrderStatusUseCase;
import app.chalo.checkout.domain.GetPaymentMethodsUseCase;
import app.chalo.checkout.domain.GetPaymentStatusUseCase;
import app.chalo.checkout.domain.MakeChaloWalletPaymentUseCase;
import app.chalo.checkout.domain.TriggerSuperPassBookedDynamicEvent;
import app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase;
import app.chalo.checkout.domain.checkoutitem.GetChaloPayCheckoutItemUseCase;
import app.chalo.checkout.domain.checkoutitem.PaymentMethodsCheckoutItemsUseCase;
import app.chalo.checkout.juspay.JusPaySdkHelper;
import app.chalo.checkout.paymentprovider.phonepe.PhonepeSdk;
import app.chalo.checkout.paymentprovider.phonepe.PhonepeSdkProvider;
import app.chalo.checkout.paymentprovider.razorpay.RazorPaySdkProvider;
import app.chalo.checkout.paymentprovider.razorpay.RazorpaySdk;
import app.chalo.checkout.shared.CheckoutSharedComponentViewModel;
import app.chalo.checkout.ui.screen.payment.PaymentMainComponent;
import app.chalo.checkout.ui.screen.postpayment.CheckoutPostPaymentComponent;
import app.chalo.checkout.utility.CheckoutMTicketDetailsHelper;
import app.chalo.checkout.utility.CheckoutPostPaymentSuperPassDetailsHelper;
import app.chalo.checkout.utility.InstalledUpiAppsHelperProvider;
import app.chalo.checkout.utility.RazorPayHelper;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.features.adjust.AdjustManager;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.features.chalotime.domain.ChaloTimeRefreshManagerUseCase;
import app.chalo.features.onetimeoffer.UpdateOneTimeProductOfferAvailedIfNeededUseCase;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.helper.UrlOpenHelper;
import app.chalo.instantticket.data.InstantTicketRepository;
import app.chalo.instantticket.domain.InitiateInstantTicketFetchAndStoreUseCase;
import app.chalo.juspay.JuspayControllerProvider;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomDrawerValue;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetState;
import app.chalo.livetracking.routedetails.ui.routedetailsbottomsheet.BottomSheetValue;
import app.chalo.livetracking.universalsearch.ui.compose.ComposableSingletons$AddToFavoriteComposeDialogKt;
import app.chalo.metro.domain.FetchAndStoreMetroTicketUseCase;
import app.chalo.metro.domain.UpdateMetroBookingUseCase;
import app.chalo.metro.repository.MetroRepository;
import app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository;
import app.chalo.multimodalticket.domain.FetchMultiModalGroupTicketAndStoreLocallyUseCase;
import app.chalo.network.config.KPlatformSocketConfig;
import app.chalo.network.config.NetworkConfig;
import app.chalo.network.interceptor.TimeoutInterceptor;
import app.chalo.network.mock.AndroidMockApiFixtureLoader;
import app.chalo.ondc.domain.FetchAndStoreOndcMetroTicketUseCase;
import app.chalo.ondc.domain.FetchAndStoreOndcTicketUseCase;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.premiumbus.domain.FetchPremiumReserveTicketAndStoreLocallyUseCase;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketByIdUseCase;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.checkout.CheckoutResultStateManager;
import app.chalo.resultstatemanager.wallet.loadmoney.WalletLoadMoneyResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.CheckoutPaymentMainArgs;
import app.chalo.scenes.args.CheckoutPostPaymentArgs;
import app.chalo.usecase.ArePermissionsGrantedUseCase;
import app.chalo.usecase.ConvertAmountInSubcurrencyToCurrencyUseCase;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import app.chalo.usecase.IsNotificationPermissionGrantedUseCase;
import app.chalo.utils.SystemHelper;
import app.chalo.validationsdk.blevalidation.GetValidationProcessFlowDetailsForValidationProductHelper;
import app.chalo.validationsdk.blevalidation.domain.ValidationSceneResolverUseCase;
import app.chalo.walletframework.chalopay.ChaloPayManager;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.decompose.router.children.NavState;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.maps.android.compose.CameraPositionState;
import io.ktor.client.engine.okhttp.OkHttp;
import io.ktor.client.engine.okhttp.OkHttpEngine;
import io.ktor.http.HttpMethod;
import io.ktor.http.cio.internals.AsciiCharTree;
import io.ktor.http.cio.internals.CharsKt;
import java.net.CookieManager;
import java.net.CookiePolicy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m3 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18366a;

    public /* synthetic */ m3(int i) {
        this.f18366a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4 = this.f18366a;
        Unit unit = Unit.f17538a;
        OkHttp okHttp = OkHttp.f16626a;
        switch (i4) {
            case 0:
                return AnchoredDraggableState.Companion.Saver$lambda$0((SaverScope) obj, (AnchoredDraggableState) obj2);
            case 1:
                return androidx.compose.foundation.gestures.AnchoredDraggableState.Companion.Saver$lambda$6((SaverScope) obj, (androidx.compose.foundation.gestures.AnchoredDraggableState) obj2);
            case 2:
                return androidx.compose.foundation.gestures.AnchoredDraggableState.Companion.Saver$lambda$3((SaverScope) obj, (androidx.compose.foundation.gestures.AnchoredDraggableState) obj2);
            case 3:
                return androidx.compose.foundation.gestures.AnchoredDraggableState.Companion.Saver$lambda$0((SaverScope) obj, (androidx.compose.foundation.gestures.AnchoredDraggableState) obj2);
            case 4:
                Scope single = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new AndroidMockApiFixtureLoader(ModuleExtKt.a(single));
            case 5:
                Scope single2 = (Scope) obj;
                ParametersHolder it2 = (ParametersHolder) obj2;
                Intrinsics.i(single2, "$this$single");
                Intrinsics.i(it2, "it");
                return Boolean.valueOf((ModuleExtKt.a(single2).getApplicationInfo().flags & 2) != 0);
            case 6:
                Scope factory = (Scope) obj;
                ParametersHolder it3 = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it3, "it");
                return (OkHttpEngine) okHttp.a(new l4(ModuleExtKt.a(factory), new TimeoutInterceptor((NetworkConfig) factory.d(Reflection.a(NetworkConfig.class), null, null)), 1, 0));
            case 7:
                Scope factory2 = (Scope) obj;
                ParametersHolder it4 = (ParametersHolder) obj2;
                Intrinsics.i(factory2, "$this$factory");
                Intrinsics.i(it4, "it");
                return (OkHttpEngine) okHttp.a(new l4(ModuleExtKt.a(factory2), new TimeoutInterceptor((NetworkConfig) factory2.d(Reflection.a(NetworkConfig.class), null, null)), 2, 0));
            case 8:
                Scope factory3 = (Scope) obj;
                ParametersHolder it5 = (ParametersHolder) obj2;
                Intrinsics.i(factory3, "$this$factory");
                Intrinsics.i(it5, "it");
                return (OkHttpEngine) okHttp.a(new l4(ModuleExtKt.a(factory3), new TimeoutInterceptor((NetworkConfig) factory3.d(Reflection.a(NetworkConfig.class), null, null)), 1, 0));
            case 9:
                ParametersHolder it6 = (ParametersHolder) obj2;
                Intrinsics.i((Scope) obj, "$this$single");
                Intrinsics.i(it6, "it");
                CookieManager cookieManager = new CookieManager();
                cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
                return new KPlatformSocketConfig(new OkHttpClient.Builder().cookieJar(new JavaNetCookieJar(cookieManager)).build());
            case 10:
                return Integer.valueOf(Arrangement.spacedBy_0680j_4$lambda$0(((Integer) obj).intValue(), (LayoutDirection) obj2));
            case 11:
                CharSequence s = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                Intrinsics.i(s, "s");
                return Character.valueOf(s.charAt(iIntValue));
            case 12:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Number) pair.d()).longValue() < ((Number) pair2.d()).longValue()) {
                    i = -1;
                } else {
                    i = ((Number) pair.d()).longValue() == ((Number) pair2.d()).longValue() ? 0 : 1;
                }
                return Integer.valueOf(i);
            case 13:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Number) pair3.d()).longValue() < ((Number) pair4.d()).longValue()) {
                    i2 = -1;
                } else {
                    i2 = ((Number) pair3.d()).longValue() == ((Number) pair4.d()).longValue() ? 0 : 1;
                }
                return Integer.valueOf(i2);
            case 14:
                return BottomAppBarState.Companion.Saver$lambda$0((SaverScope) obj, (BottomAppBarState) obj2);
            case 15:
                SaverScope Saver = (SaverScope) obj;
                BottomDrawerState it7 = (BottomDrawerState) obj2;
                Intrinsics.i(Saver, "$this$Saver");
                Intrinsics.i(it7, "it");
                return (BottomDrawerValue) it7.c.getValue();
            case 16:
                SaverScope Saver2 = (SaverScope) obj;
                BottomSheetState it8 = (BottomSheetState) obj2;
                Intrinsics.i(Saver2, "$this$Saver");
                Intrinsics.i(it8, "it");
                return (BottomSheetValue) it8.c.getValue();
            case 17:
                SaverScope Saver3 = (SaverScope) obj;
                CameraPositionState it9 = (CameraPositionState) obj2;
                Saver saver = CameraPositionState.h;
                Intrinsics.i(Saver3, "$this$Saver");
                Intrinsics.i(it9, "it");
                return (CameraPosition) it9.c.getValue();
            case 18:
                return CarouselPagerState.Saver$lambda$0((SaverScope) obj, (CarouselPagerState) obj2);
            case 19:
                return CarouselState.Saver$lambda$1((SaverScope) obj, (CarouselState) obj2);
            case 20:
                Composer composer = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                composer.startReplaceGroup(1331811164);
                if (ComposerKt.isTraceInProgress()) {
                    i3 = -1;
                    ComposerKt.traceEventStart(1331811164, iIntValue2, -1, "app.chalo.compose.components.ChaloRoundedBottomSheet.<anonymous> (ChaloRoundedBottomSheet.kt:65)");
                } else {
                    i3 = -1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-192583189, 0, i3, "app.chalo.compose.insets.rememberNavigationBottomInset (NavigationBottomInsets.android.kt:11)");
                }
                WindowInsets windowInsets = BottomSheetDefaults.INSTANCE.getWindowInsets(composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return windowInsets;
            case 21:
                HttpMethod m = (HttpMethod) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                AsciiCharTree asciiCharTree = CharsKt.f16835a;
                Intrinsics.i(m, "m");
                return Character.valueOf(m.f16800a.charAt(iIntValue3));
            case 22:
                Scope scope = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                return new CheckoutSharedComponentViewModel((ComponentContext) parametersHolder.a(1, i71.k(scope, "$this$factory", parametersHolder, "<destruct>", ComponentContext.class)), (GetInaiCheckoutUseCase) scope.d(Reflection.a(GetInaiCheckoutUseCase.class), null, null));
            case 23:
                Scope scope2 = (Scope) obj;
                return new PaymentMainComponent((ComponentContext) scope2.d(i71.k(scope2, "$this$factory", (ParametersHolder) obj2, "it", ComponentContext.class), null, null), (CheckoutPaymentMainArgs) scope2.d(Reflection.a(CheckoutPaymentMainArgs.class), null, null), (ICheckoutProductDataResolver) scope2.d(Reflection.a(ICheckoutProductDataResolver.class), null, null), (CheckoutPaymentDataResolver) scope2.d(Reflection.a(CheckoutPaymentDataResolver.class), null, null), (GetPaymentMethodsUseCase) scope2.d(Reflection.a(GetPaymentMethodsUseCase.class), null, null), (PaymentMethodsCheckoutItemsUseCase) scope2.d(Reflection.a(PaymentMethodsCheckoutItemsUseCase.class), null, null), (FilterValidPaymentMethodsUseCase) scope2.d(Reflection.a(FilterValidPaymentMethodsUseCase.class), null, null), (GetOrderStatusUseCase) scope2.d(Reflection.a(GetOrderStatusUseCase.class), null, null), (GetPaymentStatusUseCase) scope2.d(Reflection.a(GetPaymentStatusUseCase.class), null, null), (ConvertInaiUpiAppDetailToIndividualCheckoutItemUseCase) scope2.d(Reflection.a(ConvertInaiUpiAppDetailToIndividualCheckoutItemUseCase.class), null, null), (ICheckoutAnalyticsHelper) scope2.d(Reflection.a(ICheckoutAnalyticsHelper.class), null, null), (CurrencyFeature) scope2.d(Reflection.a(CurrencyFeature.class), null, null), (CityProvider) scope2.d(Reflection.a(CityProvider.class), null, null), (CommonCheckoutItemUseCase) scope2.d(Reflection.a(CommonCheckoutItemUseCase.class), null, null), (ChaloPayManager) scope2.d(Reflection.a(ChaloPayManager.class), null, null), (ChaloConfigFeature) scope2.d(Reflection.a(ChaloConfigFeature.class), null, null), (UserProfileDetailsProvider) scope2.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (StringProvider) scope2.d(Reflection.a(StringProvider.class), null, null), (CreateOrderForChaloPaymentUseCase) scope2.d(Reflection.a(CreateOrderForChaloPaymentUseCase.class), null, null), (MakeChaloWalletPaymentUseCase) scope2.d(Reflection.a(MakeChaloWalletPaymentUseCase.class), null, null), (WalletRepository) scope2.d(Reflection.a(WalletRepository.class), null, null), (CoroutineContextProvider) scope2.d(Reflection.a(CoroutineContextProvider.class), null, null), (InstalledUpiAppsHelperProvider) scope2.d(Reflection.a(InstalledUpiAppsHelperProvider.class), null, null), (ChaloConfigFeature) scope2.d(Reflection.a(ChaloConfigFeature.class), null, null), (ChaloNavigationManager) scope2.d(Reflection.a(ChaloNavigationManager.class), null, null), (CheckoutResultStateManager) scope2.d(Reflection.a(CheckoutResultStateManager.class), null, null), (WalletLoadMoneyResultStateManager) scope2.d(Reflection.a(WalletLoadMoneyResultStateManager.class), null, null), (GetChaloPayCheckoutItemUseCase) scope2.d(Reflection.a(GetChaloPayCheckoutItemUseCase.class), null, null), (IsNotificationPermissionGrantedUseCase) scope2.d(Reflection.a(IsNotificationPermissionGrantedUseCase.class), null, null), (UpdateMetroBookingUseCase) scope2.d(Reflection.a(UpdateMetroBookingUseCase.class), null, null), (PermissionHandlerProvider) scope2.d(Reflection.a(PermissionHandlerProvider.class), null, null), (JusPaySdkHelper) scope2.d(Reflection.a(JusPaySdkHelper.class), null, null), (ArePermissionsGrantedUseCase) scope2.d(Reflection.a(ArePermissionsGrantedUseCase.class), null, null), (ChaloBuildConfig) scope2.d(Reflection.a(ChaloBuildConfig.class), null, null), (JuspayControllerProvider) scope2.d(Reflection.a(JuspayControllerProvider.class), null, null), (KotlinToastManager) scope2.d(Reflection.a(KotlinToastManager.class), null, null), (SystemHelper) scope2.d(Reflection.a(SystemHelper.class), null, null), (AdTargetingProvider) scope2.d(Reflection.a(AdTargetingProvider.class), null, null), (UrlOpenHelper) scope2.d(Reflection.a(UrlOpenHelper.class), null, null), (AnalyticsContract) scope2.d(Reflection.a(AnalyticsContract.class), null, null), (WalletResolver) scope2.d(Reflection.a(WalletResolver.class), null, null), (ResolveSupportPolicyUseCase) scope2.d(Reflection.a(ResolveSupportPolicyUseCase.class), null, null));
            case 24:
                Scope scope3 = (Scope) obj;
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                return new CheckoutPostPaymentComponent((ComponentContext) parametersHolder2.a(0, i71.k(scope3, "$this$factory", parametersHolder2, "<destruct>", ComponentContext.class)), (CheckoutPostPaymentArgs) parametersHolder2.a(1, Reflection.a(CheckoutPostPaymentArgs.class)), (GetAdjustEventTokenRemoteConfigUseCase) scope3.d(Reflection.a(GetAdjustEventTokenRemoteConfigUseCase.class), null, null), (AdjustManager) scope3.d(Reflection.a(AdjustManager.class), null, null), (ConvertAmountInSubcurrencyToCurrencyUseCase) scope3.d(Reflection.a(ConvertAmountInSubcurrencyToCurrencyUseCase.class), null, null), (ICheckoutProductDataResolver) scope3.d(Reflection.a(ICheckoutProductDataResolver.class), null, null), (CheckoutPaymentDataResolver) scope3.d(Reflection.a(CheckoutPaymentDataResolver.class), null, null), (BasicInfoContract) scope3.d(Reflection.a(BasicInfoContract.class), null, null), (ChaloTimeRefreshManagerUseCase) scope3.d(Reflection.a(ChaloTimeRefreshManagerUseCase.class), null, null), (StringProvider) scope3.d(Reflection.a(StringProvider.class), null, null), (ICheckoutAnalyticsHelper) scope3.d(Reflection.a(ICheckoutAnalyticsHelper.class), null, null), (TriggerSuperPassBookedDynamicEvent) scope3.d(Reflection.a(TriggerSuperPassBookedDynamicEvent.class), null, null), (GetMiscellaneousCityWiseFlagsConfigUseCase) scope3.d(Reflection.a(GetMiscellaneousCityWiseFlagsConfigUseCase.class), null, null), (UpdateOneTimeProductOfferAvailedIfNeededUseCase) scope3.d(Reflection.a(UpdateOneTimeProductOfferAvailedIfNeededUseCase.class), null, null), (ProductsSyncContract) scope3.d(Reflection.a(ProductsSyncContract.class), null, null), (CheckoutResultStateManager) scope3.d(Reflection.a(CheckoutResultStateManager.class), null, null), (ChaloNavigationManager) scope3.d(Reflection.a(ChaloNavigationManager.class), null, null), (CheckoutPostPaymentSuperPassDetailsHelper) scope3.d(Reflection.a(CheckoutPostPaymentSuperPassDetailsHelper.class), null, null), (InitiateInstantTicketFetchAndStoreUseCase) scope3.d(Reflection.a(InitiateInstantTicketFetchAndStoreUseCase.class), null, null), (FetchPremiumReserveTicketAndStoreLocallyUseCase) scope3.d(Reflection.a(FetchPremiumReserveTicketAndStoreLocallyUseCase.class), null, null), (InstantTicketRepository) scope3.d(Reflection.a(InstantTicketRepository.class), null, null), (GetPremiumReserveTicketByIdUseCase) scope3.d(Reflection.a(GetPremiumReserveTicketByIdUseCase.class), null, null), (FetchAndStoreOndcTicketUseCase) scope3.d(Reflection.a(FetchAndStoreOndcTicketUseCase.class), null, null), (OndcRepository) scope3.d(Reflection.a(OndcRepository.class), null, null), (FetchAndStoreOndcMetroTicketUseCase) scope3.d(Reflection.a(FetchAndStoreOndcMetroTicketUseCase.class), null, null), (MetroRepository) scope3.d(Reflection.a(MetroRepository.class), null, null), (FetchAndStoreMetroTicketUseCase) scope3.d(Reflection.a(FetchAndStoreMetroTicketUseCase.class), null, null), (GetValidationProcessFlowDetailsForValidationProductHelper) scope3.d(Reflection.a(GetValidationProcessFlowDetailsForValidationProductHelper.class), null, null), (ValidationSceneResolverUseCase) scope3.d(Reflection.a(ValidationSceneResolverUseCase.class), null, null), (CheckoutMTicketDetailsHelper) scope3.d(Reflection.a(CheckoutMTicketDetailsHelper.class), null, null), (FetchMultiModalGroupTicketAndStoreLocallyUseCase) scope3.d(Reflection.a(FetchMultiModalGroupTicketAndStoreLocallyUseCase.class), null, null), (MultiModalGroupTicketRepository) scope3.d(Reflection.a(MultiModalGroupTicketRepository.class), null, null));
            case 25:
                Scope factory4 = (Scope) obj;
                ParametersHolder it10 = (ParametersHolder) obj2;
                Intrinsics.i(factory4, "$this$factory");
                Intrinsics.i(it10, "it");
                RazorpaySdk razorpaySdkC = ((RazorPaySdkProvider) factory4.d(Reflection.a(RazorPaySdkProvider.class), null, null)).c();
                Intrinsics.f(razorpaySdkC);
                return new RazorPayHelper(razorpaySdkC, (CoroutineContextProvider) factory4.d(Reflection.a(CoroutineContextProvider.class), null, null));
            case 26:
                Scope scope4 = (Scope) obj;
                PhonepeSdk phonepeSdkC = ((PhonepeSdkProvider) scope4.d(i71.k(scope4, "$this$factory", (ParametersHolder) obj2, "it", PhonepeSdkProvider.class), null, null)).c();
                Intrinsics.f(phonepeSdkC);
                return phonepeSdkC;
            case 27:
                Intrinsics.i((NavState) obj, "<unused var>");
                return unit;
            case 28:
                String acc = (String) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                Intrinsics.i(acc, "acc");
                Intrinsics.i(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ComposableLambda composableLambda = ComposableSingletons$AddToFavoriteComposeDialogKt.f5091a;
                if (composer2.shouldExecute((iIntValue4 & 3) != 2, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1242797036, iIntValue4, -1, "app.chalo.livetracking.universalsearch.ui.compose.ComposableSingletons$AddToFavoriteComposeDialogKt.lambda$-1242797036.<anonymous> (AddToFavoriteComposeDialog.kt:76)");
                    }
                    TextKt.m2623TextNvy7gAk("Enter label here..", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 6, 0, 262142);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
        }
    }
}
