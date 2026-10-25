package defpackage;

import app.chalo.chalobususerprofile.data.repository.PremiumBusUserSurveyPreferenceRepository;
import app.chalo.checkout.utility.CheckoutPostPaymentSuperPassDetailsHelper;
import app.chalo.contract.CityMetaDataManager;
import app.chalo.contract.GroupTicketConfigEligibilityHelper;
import app.chalo.contract.NavigationContract;
import app.chalo.contract.ProductBookingHelper;
import app.chalo.contract.ProductConfigFetchHelperContract;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.helper.UnsyncedActivationsSyncHelper;
import app.chalo.home.helper.HomeScreenConfigDataHelper;
import app.chalo.home.manager.AppRatingProcessManagerProvider;
import app.chalo.home.manager.AppRatingProcessManagerSetter;
import app.chalo.home.manager.AppRatingProcessSkeleton;
import app.chalo.home.ui.HomeTabScreensNavigationAndStateManager;
import app.chalo.livetracking.routedetails.LiveTrackingNavigationContract;
import app.chalo.manager.homescreen.HomeScreenConfigManager;
import app.chalo.multimodalticket.validation.MultiModalGroupTicketValidationAnalyticsManagerFactory;
import app.chalo.premiumbus.PremiumBusAnalyticsHelper;
import app.chalo.premiumbus.helper.InstantTicketConfigHelper;
import app.chalo.productdatasync.repository.remote.IProductDataSyncRemoteDataSource;
import app.chalo.productpurchase.passpurchase.ui.factory.SuperPassPurchaseInitialStateFactory;
import app.chalo.productpurchase.productselection.data.remote.ProductPurchaseRemoteDataSource;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import app.chalo.stoptripdetails.analytics.StopTripDetailsAnalyticsEventHelper;
import app.chalo.superpass.data.features.IDigitalTripReceiptFeature;
import app.chalo.superpass.data.features.IVisualValidationFeature;
import app.chalo.superpass.data.remote.DigitalTripReceiptRemoteDataSource;
import app.chalo.usecase.SuperPassHistoryCallHelper;
import app.chalo.validationsdk.blevalidation.GetValidationProcessFlowDetailsForValidationProductHelper;
import app.chalo.validationsdk.blevalidation.config.ProductValidationConfigProvider;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.module.dsl.OptionDSLKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x71 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19994a;

    public /* synthetic */ x71(int i) {
        this.f19994a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19994a;
        Unit unit = Unit.f17538a;
        BeanDefinition factoryOf = (BeanDefinition) obj;
        switch (i) {
            case 0:
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(IProductDataSyncRemoteDataSource.class), factoryOf.f);
                break;
            case 1:
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(ProductsSyncContract.class), factoryOf.f);
                break;
            case 2:
                Intrinsics.i(factoryOf, "$this$singleOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(CityMetaDataManager.class), factoryOf.f);
                break;
            case 3:
                Intrinsics.i(factoryOf, "$this$singleOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(PremiumBusUserSurveyPreferenceRepository.class), factoryOf.f);
                break;
            case 4:
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(StopTripDetailsAnalyticsEventHelper.class), factoryOf.f);
                break;
            case 5:
                Intrinsics.i(factoryOf, "$this$singleOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(PremiumBusUserSurveyPreferenceRepository.class), factoryOf.f);
                break;
            case 6:
                Intrinsics.i(factoryOf, "$this$singleOf");
                OptionDSLKt.a(factoryOf, CollectionsKt.S(Reflection.a(AppRatingProcessManagerProvider.class), Reflection.a(AppRatingProcessManagerSetter.class)));
                break;
            case 7:
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(AppRatingProcessSkeleton.class), factoryOf.f);
                break;
            case 8:
                Intrinsics.i(factoryOf, "$this$singleOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(HomeTabScreensNavigationAndStateManager.class), factoryOf.f);
                break;
            case 9:
                Intrinsics.i(factoryOf, "$this$singleOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(ProductBookingHelper.class), factoryOf.f);
                break;
            case 10:
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(IDigitalTripReceiptFeature.class), factoryOf.f);
                break;
            case 11:
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(DigitalTripReceiptRemoteDataSource.class), factoryOf.f);
                break;
            case 12:
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(IVisualValidationFeature.class), factoryOf.f);
                break;
            case 13:
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(UnsyncedActivationsSyncHelper.class), factoryOf.f);
                break;
            case 14:
                Intrinsics.i(factoryOf, "$this$singleOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(LiveTrackingNavigationContract.class), factoryOf.f);
                break;
            case 15:
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(ProductPurchaseRemoteDataSource.class), factoryOf.f);
                break;
            case 16:
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(ProductPurchaseRepository.class), factoryOf.f);
                break;
            case 17:
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(ProductConfigFetchHelperContract.class), factoryOf.f);
                break;
            case 18:
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(GroupTicketConfigEligibilityHelper.class), factoryOf.f);
                break;
            case 19:
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(CheckoutPostPaymentSuperPassDetailsHelper.class), factoryOf.f);
                break;
            case 20:
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(SuperPassPurchaseInitialStateFactory.class), factoryOf.f);
                break;
            case 21:
                Intrinsics.i(factoryOf, "$this$singleOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(InstantTicketConfigHelper.class), factoryOf.f);
                break;
            case 22:
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(HomeScreenConfigDataHelper.class), factoryOf.f);
                break;
            case 23:
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(SuperPassHistoryCallHelper.class), factoryOf.f);
                break;
            case 24:
                Intrinsics.i(factoryOf, "$this$singleOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(HomeScreenConfigManager.class), factoryOf.f);
                break;
            case 25:
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(ProductValidationConfigProvider.class), factoryOf.f);
                break;
            case 26:
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(MultiModalGroupTicketValidationAnalyticsManagerFactory.class), factoryOf.f);
                break;
            case 27:
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(GetValidationProcessFlowDetailsForValidationProductHelper.class), factoryOf.f);
                break;
            case 28:
                Intrinsics.i(factoryOf, "$this$singleOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(NavigationContract.class), factoryOf.f);
                break;
            default:
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(PremiumBusAnalyticsHelper.class), factoryOf.f);
                break;
        }
        return unit;
    }
}
