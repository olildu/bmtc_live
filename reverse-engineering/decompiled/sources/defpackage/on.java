package defpackage;

import androidx.compose.material3.internal.ChildParentSemanticsKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.chalo.checkout.analytics.CheckoutAnalyticsHelper;
import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.checkout.data.repository.CheckoutRepository;
import app.chalo.checkout.data.repository.ICheckoutRepository;
import app.chalo.checkout.data.repository.remote.CheckoutRemoteDataSource;
import app.chalo.checkout.data.repository.remote.ICheckoutRemoteDataSource;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$1;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$2;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$3;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$4;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$5;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$10;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$11;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$12;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$13;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$14;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$15;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$16;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$17;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$18;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$19;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$2;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$20;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$21;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$22;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$23;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$24;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$25;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$26;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$27;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$28;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$29;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$3;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$30;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$31;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$32;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$33;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$34;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$4;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$5;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$6;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$7;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$8;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$9;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$singleOf$1;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$singleOf$2;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$singleOf$3;
import app.chalo.checkout.di.CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$singleOf$default$1;
import app.chalo.checkout.di.CheckoutSharedModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1;
import app.chalo.checkout.domain.ConvertInaiUpiAppDetailToIndividualCheckoutItemUseCase;
import app.chalo.checkout.domain.ConvertPaymentMethodsApiModelToAppModelForInaiUseCase;
import app.chalo.checkout.domain.ConvertPaymentMethodsApiToAppModelForPhonePeUseCase;
import app.chalo.checkout.domain.ConvertPaymentMethodsApiToAppModelForRazorpayUseCase;
import app.chalo.checkout.domain.CreateInaiPaymentDataUseCase;
import app.chalo.checkout.domain.CreateOrderForChaloPaymentUseCase;
import app.chalo.checkout.domain.FilterValidPaymentMethodsUseCase;
import app.chalo.checkout.domain.GetAdjustEventTokenRemoteConfigUseCase;
import app.chalo.checkout.domain.GetInaiCheckoutUseCase;
import app.chalo.checkout.domain.GetLazyPayCheckoutUrlUseCase;
import app.chalo.checkout.domain.GetOrderStatusUseCase;
import app.chalo.checkout.domain.GetPaymentMethodsUseCase;
import app.chalo.checkout.domain.GetPaymentStatusUseCase;
import app.chalo.checkout.domain.MakeChaloWalletPaymentUseCase;
import app.chalo.checkout.domain.TriggerSuperPassBookedDynamicEvent;
import app.chalo.checkout.domain.ValidateCheckoutCardDataUseCase;
import app.chalo.checkout.domain.checkoutitem.CommonCheckoutItemUseCase;
import app.chalo.checkout.domain.checkoutitem.GetChaloPayCheckoutItemUseCase;
import app.chalo.checkout.domain.checkoutitem.PaymentMethodsCheckoutItemsUseCase;
import app.chalo.checkout.domain.phonepe.CreatePhonePePaymentModeDataUseCase;
import app.chalo.checkout.domain.phonepe.CreatePhonePeTransactionRequestUseCase;
import app.chalo.checkout.domain.phonepe.GetPhonePeUpiAppsUseCase;
import app.chalo.checkout.domain.provider.CheckoutItemsProvider;
import app.chalo.checkout.domain.provider.ICheckoutItemsProvider;
import app.chalo.checkout.domain.razorpay.CreateRazorPayDataUseCase;
import app.chalo.checkout.domain.razorpay.GetRazorPaySupportedUpiAppsUseCase;
import app.chalo.checkout.domain.razorpay.ValidateRazorPayDataUseCase;
import app.chalo.checkout.domain.razorpay.ValidateVPAUseCase;
import app.chalo.checkout.juspay.JusPaySdkHelper;
import app.chalo.checkout.juspay.JusPaySdkHelperImpl;
import app.chalo.checkout.paymentprovider.inai.InaiSdkCreator;
import app.chalo.checkout.paymentprovider.inai.InaiSdkCreatorAndroid;
import app.chalo.checkout.paymentprovider.phonepe.PhonepeSdk;
import app.chalo.checkout.paymentprovider.phonepe.PhonepeSdkManager;
import app.chalo.checkout.paymentprovider.phonepe.PhonepeSdkProvider;
import app.chalo.checkout.paymentprovider.phonepe.PhonepeSdkSetter;
import app.chalo.checkout.paymentprovider.razorpay.RazorPaySdkProvider;
import app.chalo.checkout.paymentprovider.razorpay.RazorpaySdkManager;
import app.chalo.checkout.paymentprovider.razorpay.RazorpaySdkSetter;
import app.chalo.checkout.shared.CheckoutSharedComponentViewModel;
import app.chalo.checkout.ui.screen.card.CheckoutCardComponent;
import app.chalo.checkout.ui.screen.card.CheckoutCardDataState;
import app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.inai.InaiCheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.phonepe.PhonePeCheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.razorpay.CheckoutComponent;
import app.chalo.checkout.ui.screen.checkout.razorpay.CheckoutViewState;
import app.chalo.checkout.ui.screen.netbanking.CheckoutNetBankingComponent;
import app.chalo.checkout.ui.screen.payment.PaymentMainComponent;
import app.chalo.checkout.ui.screen.postpayment.CheckoutPostPaymentComponent;
import app.chalo.checkout.ui.screen.postpayment.PostPaymentDataState;
import app.chalo.checkout.ui.screen.upi.CheckoutUpiAppsComponent;
import app.chalo.checkout.ui.screen.wallet.CheckoutWalletAppsComponent;
import app.chalo.checkout.utility.IRazorPayHelper;
import app.chalo.checkout.utility.InstalledUpiAppsHelperManager;
import app.chalo.checkout.utility.InstalledUpiAppsHelperProvider;
import app.chalo.checkout.utility.InstalledUpiAppsHelperSetter;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import io.ktor.http.HttpMethod;
import io.ktor.http.cio.internals.AsciiCharTree;
import io.ktor.http.cio.internals.CharsKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.module.dsl.OptionDSLKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class on implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18654a;

    public /* synthetic */ on(int i) {
        this.f18654a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f18654a;
        int i2 = 26;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("chalo_pay_table");
                return unit;
            case 1:
                HttpMethod it = (HttpMethod) obj;
                AsciiCharTree asciiCharTree = CharsKt.f16835a;
                Intrinsics.i(it, "it");
                return Integer.valueOf(it.f16800a.length());
            case 2:
                CheckoutCardDataState it2 = (CheckoutCardDataState) obj;
                Intrinsics.i(it2, "it");
                return CheckoutCardDataState.a(it2, null, null, Boolean.TRUE, null, null, null, null, 123);
            case 3:
                CheckoutCardDataState it3 = (CheckoutCardDataState) obj;
                Intrinsics.i(it3, "it");
                return CheckoutCardDataState.a(it3, null, null, null, Boolean.TRUE, null, null, null, 119);
            case 4:
                CheckoutCardDataState it4 = (CheckoutCardDataState) obj;
                Intrinsics.i(it4, "it");
                return CheckoutCardDataState.a(it4, null, null, null, null, Boolean.TRUE, null, null, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION);
            case 5:
                CheckoutCardDataState it5 = (CheckoutCardDataState) obj;
                Intrinsics.i(it5, "it");
                return CheckoutCardDataState.a(it5, null, null, null, null, null, Boolean.TRUE, null, 95);
            case 6:
                CheckoutViewState it6 = (CheckoutViewState) obj;
                Intrinsics.i(it6, "it");
                return CheckoutViewState.a(it6, Boolean.FALSE, 5);
            case 7:
                CheckoutViewState it7 = (CheckoutViewState) obj;
                Intrinsics.i(it7, "it");
                return CheckoutViewState.a(it7, Boolean.TRUE, 5);
            case 8:
                Intrinsics.i((CheckoutViewState) obj, "it");
                return new CheckoutViewState(Boolean.TRUE, Boolean.FALSE, true);
            case 9:
                CheckoutViewState it8 = (CheckoutViewState) obj;
                Intrinsics.i(it8, "it");
                return CheckoutViewState.a(it8, Boolean.FALSE, 5);
            case 10:
                CheckoutViewState it9 = (CheckoutViewState) obj;
                Intrinsics.i(it9, "it");
                return CheckoutViewState.a(it9, Boolean.TRUE, 5);
            case 11:
                CheckoutViewState it10 = (CheckoutViewState) obj;
                Intrinsics.i(it10, "it");
                return CheckoutViewState.a(it10, Boolean.FALSE, 5);
            case 12:
                CheckoutViewState it11 = (CheckoutViewState) obj;
                Intrinsics.i(it11, "it");
                return CheckoutViewState.a(it11, null, 2);
            case 13:
                CheckoutViewState it12 = (CheckoutViewState) obj;
                Intrinsics.i(it12, "it");
                return CheckoutViewState.a(it12, Boolean.FALSE, 5);
            case 14:
                PostPaymentDataState it13 = (PostPaymentDataState) obj;
                Intrinsics.i(it13, "it");
                return PostPaymentDataState.a(it13, false, null, null, 3);
            case 15:
                PostPaymentDataState it14 = (PostPaymentDataState) obj;
                Intrinsics.i(it14, "it");
                return PostPaymentDataState.a(it14, false, null, null, 3);
            case 16:
                return PostPaymentDataState.a((PostPaymentDataState) obj, true, null, null, 6);
            case 17:
                return unit;
            case 18:
                Module module = (Module) obj;
                Intrinsics.i(module, "$this$module");
                on onVar = new on(20);
                CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$1 checkoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$1 = new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$1();
                Kind kind = Kind.Factory;
                EmptyList emptyList = EmptyList.f17557a;
                ClassReference classReferenceA = Reflection.a(CheckoutAnalyticsHelper.class);
                StringQualifier stringQualifier = ScopeRegistry.e;
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, classReferenceA, null, checkoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$1, kind, emptyList), module)), onVar);
                on onVar2 = new on(22);
                CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$singleOf$1 checkoutSharedModuleKt$commonModule$lambda$0$$inlined$singleOf$1 = new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$singleOf$1();
                Kind kind2 = Kind.Singleton;
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(RazorpaySdkManager.class), null, checkoutSharedModuleKt$commonModule$lambda$0$$inlined$singleOf$1, kind2, emptyList), module)), onVar2);
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(PhonepeSdkManager.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$singleOf$2(), kind2, emptyList), module)), new on(23));
                new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(IRazorPayHelper.class), null, new m3(25), kind, emptyList), module));
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CheckoutRemoteDataSource.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$2(), kind, emptyList), module)), new on(24));
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CheckoutRepository.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$3(), kind, emptyList), module)), new on(25));
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetRazorPaySupportedUpiAppsUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ValidateRazorPayDataUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$2(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ValidateVPAUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$3(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ConvertInaiUpiAppDetailToIndividualCheckoutItemUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$4(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ConvertPaymentMethodsApiModelToAppModelForInaiUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$5(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ConvertPaymentMethodsApiToAppModelForRazorpayUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$6(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ConvertPaymentMethodsApiToAppModelForPhonePeUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$7(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CreateOrderForChaloPaymentUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$8(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FilterValidPaymentMethodsUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$9(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetAdjustEventTokenRemoteConfigUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$10(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetInaiCheckoutUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$11(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetLazyPayCheckoutUrlUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$12(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetOrderStatusUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$13(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetPaymentMethodsUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$14(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetPaymentStatusUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$15(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(MakeChaloWalletPaymentUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$16(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ValidateCheckoutCardDataUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$17(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(InstalledUpiAppsHelperManager.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$singleOf$3(), kind2, emptyList), module)), new on(i2));
                new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CheckoutSharedComponentViewModel.class), null, new m3(22), kind, emptyList), module));
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CheckoutItemsProvider.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$4(), kind, emptyList), module)), new on(19));
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PaymentMethodsCheckoutItemsUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$18(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CommonCheckoutItemUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$19(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CreateRazorPayDataUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$20(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CreateInaiPaymentDataUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$21(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CreatePhonePePaymentModeDataUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$22(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CreatePhonePeTransactionRequestUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$23(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetPhonePeUpiAppsUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$24(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetChaloPayCheckoutItemUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$25(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CheckoutWalletAppsComponent.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$26(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CheckoutComponent.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$27(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CustomUrlCheckoutComponent.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$28(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(InaiCheckoutComponent.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$29(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PhonePeCheckoutComponent.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$30(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CheckoutUpiAppsComponent.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$31(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CheckoutNetBankingComponent.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$32(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CheckoutCardComponent.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$33(), kind, emptyList), module)), null);
                new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PaymentMainComponent.class), null, new m3(23), kind, emptyList), module));
                new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CheckoutPostPaymentComponent.class), null, new m3(24), kind, emptyList), module));
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(GetAdjustEventTokenRemoteConfigUseCase.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$singleOf$default$1(), kind2, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(TriggerSuperPassBookedDynamicEvent.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$34(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(JusPaySdkHelperImpl.class), null, new CheckoutSharedModuleKt$commonModule$lambda$0$$inlined$factoryOf$5(), kind, emptyList), module)), new on(21));
                return unit;
            case 19:
                BeanDefinition factoryOf = (BeanDefinition) obj;
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(ICheckoutItemsProvider.class), factoryOf.f);
                return unit;
            case 20:
                BeanDefinition factoryOf2 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf2, "$this$factoryOf");
                factoryOf2.f = CollectionsKt.d0(Reflection.a(ICheckoutAnalyticsHelper.class), factoryOf2.f);
                return unit;
            case 21:
                BeanDefinition factoryOf3 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf3, "$this$factoryOf");
                factoryOf3.f = CollectionsKt.d0(Reflection.a(JusPaySdkHelper.class), factoryOf3.f);
                return unit;
            case 22:
                BeanDefinition singleOf = (BeanDefinition) obj;
                Intrinsics.i(singleOf, "$this$singleOf");
                OptionDSLKt.a(singleOf, CollectionsKt.S(Reflection.a(RazorPaySdkProvider.class), Reflection.a(RazorpaySdkSetter.class)));
                return unit;
            case 23:
                BeanDefinition singleOf2 = (BeanDefinition) obj;
                Intrinsics.i(singleOf2, "$this$singleOf");
                OptionDSLKt.a(singleOf2, CollectionsKt.S(Reflection.a(PhonepeSdkProvider.class), Reflection.a(PhonepeSdkSetter.class)));
                return unit;
            case 24:
                BeanDefinition factoryOf4 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf4, "$this$factoryOf");
                factoryOf4.f = CollectionsKt.d0(Reflection.a(ICheckoutRemoteDataSource.class), factoryOf4.f);
                return unit;
            case 25:
                BeanDefinition factoryOf5 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf5, "$this$factoryOf");
                factoryOf5.f = CollectionsKt.d0(Reflection.a(ICheckoutRepository.class), factoryOf5.f);
                return unit;
            case 26:
                BeanDefinition singleOf3 = (BeanDefinition) obj;
                Intrinsics.i(singleOf3, "$this$singleOf");
                OptionDSLKt.a(singleOf3, CollectionsKt.S(Reflection.a(InstalledUpiAppsHelperSetter.class), Reflection.a(InstalledUpiAppsHelperProvider.class)));
                return unit;
            case 27:
                Module module2 = (Module) obj;
                Intrinsics.i(module2, "$this$module");
                on onVar3 = new on(28);
                CheckoutSharedModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1 checkoutSharedModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1 = new CheckoutSharedModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1();
                Kind kind3 = Kind.Factory;
                EmptyList emptyList2 = EmptyList.f17557a;
                ClassReference classReferenceA2 = Reflection.a(InaiSdkCreatorAndroid.class);
                StringQualifier stringQualifier2 = ScopeRegistry.e;
                OptionDSLKt.c(new KoinDefinition(module2, i71.w(new BeanDefinition(stringQualifier2, classReferenceA2, null, checkoutSharedModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1, kind3, emptyList2), module2)), onVar3);
                new KoinDefinition(module2, i71.w(new BeanDefinition(stringQualifier2, Reflection.a(PhonepeSdk.class), null, new m3(i2), kind3, emptyList2), module2));
                return unit;
            case 28:
                BeanDefinition factoryOf6 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf6, "$this$factoryOf");
                factoryOf6.f = CollectionsKt.d0(Reflection.a(InaiSdkCreator.class), factoryOf6.f);
                return unit;
            default:
                return ChildParentSemanticsKt.childSemantics$lambda$0((SemanticsPropertyReceiver) obj);
        }
    }
}
