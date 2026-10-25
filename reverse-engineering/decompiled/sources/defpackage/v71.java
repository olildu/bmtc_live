package defpackage;

import androidx.datastore.core.DataStore;
import app.chalo.citydata.repository.CityDataRepository;
import app.chalo.citydata.repository.local.RouteLocalDataSource;
import app.chalo.contract.ProductReceiptContract;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.notification.managers.NotificationCentralProcessingManager;
import app.chalo.notification.managers.NotificationDisplayDataManager;
import app.chalo.productdatasync.repository.IProductDataSyncRepository;
import app.chalo.recent.database.repository.recent.PlacesRecentRepository;
import app.chalo.recent.database.repository.recent.RecentRepositoryProvider;
import app.chalo.recent.database.repository.recent.RouteRecentRepository;
import app.chalo.recent.database.repository.recent.StopAndRouteBasedRecentRepository;
import app.chalo.recent.database.repository.recent.StopBasedTripRecentRepository;
import app.chalo.recent.localsource.recent.RecentPlaceLocalDataSource;
import app.chalo.recent.localsource.recent.RecentRouteLocalDataSource;
import app.chalo.recent.localsource.recent.RecentStopAndRouteBasedLocalDataSource;
import app.chalo.recent.localsource.recent.RecentStopLocalDataStore;
import app.chalo.recent.localsource.recent.RecentsAndFavMigrationLocalDataSource;
import app.chalo.sos.data.remote.RaiseSOSRemoteDataSource;
import app.chalo.sos.data.repository.RaiseSOSRepository;
import app.chalo.sos.feature.SosFeaturePlatformDelegateProvider;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationNavigationManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationReportProblemManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager;
import app.chalo.validationsdk.blevalidation.unifiedtito.data.TITOUnifiedFlowValidationDataManager;
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
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v71 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19811a;

    public /* synthetic */ v71(int i) {
        this.f19811a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19811a) {
            case 0:
                BeanDefinition singleOf = (BeanDefinition) obj;
                Intrinsics.i(singleOf, "$this$singleOf");
                singleOf.f = CollectionsKt.d0(Reflection.a(CityDataRepository.class), singleOf.f);
                break;
            case 1:
                BeanDefinition singleOf2 = (BeanDefinition) obj;
                Intrinsics.i(singleOf2, "$this$singleOf");
                singleOf2.f = CollectionsKt.d0(Reflection.a(PlacesRecentRepository.class), singleOf2.f);
                break;
            case 2:
                BeanDefinition singleOf3 = (BeanDefinition) obj;
                Intrinsics.i(singleOf3, "$this$singleOf");
                singleOf3.f = CollectionsKt.d0(Reflection.a(RecentPlaceLocalDataSource.class), singleOf3.f);
                break;
            case 3:
                BeanDefinition singleOf4 = (BeanDefinition) obj;
                Intrinsics.i(singleOf4, "$this$singleOf");
                singleOf4.f = CollectionsKt.d0(Reflection.a(RecentRepositoryProvider.class), singleOf4.f);
                break;
            case 4:
                BeanDefinition factoryOf = (BeanDefinition) obj;
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(RecentRouteLocalDataSource.class), factoryOf.f);
                break;
            case 5:
                BeanDefinition factoryOf2 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf2, "$this$factoryOf");
                factoryOf2.f = CollectionsKt.d0(Reflection.a(RecentStopAndRouteBasedLocalDataSource.class), factoryOf2.f);
                break;
            case 6:
                BeanDefinition factoryOf3 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf3, "$this$factoryOf");
                factoryOf3.f = CollectionsKt.d0(Reflection.a(RecentsAndFavMigrationLocalDataSource.class), factoryOf3.f);
                break;
            case 7:
                BeanDefinition factoryOf4 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf4, "$this$factoryOf");
                factoryOf4.f = CollectionsKt.d0(Reflection.a(RecentStopLocalDataStore.class), factoryOf4.f);
                break;
            case 8:
                BeanDefinition singleOf5 = (BeanDefinition) obj;
                Intrinsics.i(singleOf5, "$this$singleOf");
                singleOf5.f = CollectionsKt.d0(Reflection.a(RouteLocalDataSource.class), singleOf5.f);
                break;
            case 9:
                BeanDefinition singleOf6 = (BeanDefinition) obj;
                Intrinsics.i(singleOf6, "$this$singleOf");
                singleOf6.f = CollectionsKt.d0(Reflection.a(RouteRecentRepository.class), singleOf6.f);
                break;
            case 10:
                BeanDefinition singleOf7 = (BeanDefinition) obj;
                Intrinsics.i(singleOf7, "$this$singleOf");
                singleOf7.f = CollectionsKt.d0(Reflection.a(StopAndRouteBasedRecentRepository.class), singleOf7.f);
                break;
            case 11:
                BeanDefinition singleOf8 = (BeanDefinition) obj;
                Intrinsics.i(singleOf8, "$this$singleOf");
                singleOf8.f = CollectionsKt.d0(Reflection.a(StopBasedTripRecentRepository.class), singleOf8.f);
                break;
            case 12:
                Module module = (Module) obj;
                Intrinsics.i(module, "$this$module");
                StringQualifier stringQualifier = new StringQualifier("keyCityData.preferences_pb");
                t71 t71Var = new t71(26);
                Kind kind = Kind.Singleton;
                EmptyList emptyList = EmptyList.f17557a;
                ClassReference classReferenceA = Reflection.a(DataStore.class);
                StringQualifier stringQualifier2 = ScopeRegistry.e;
                new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(DataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier2, classReferenceA, stringQualifier, t71Var, kind, emptyList), module), "recents_and_fav_data_store_migration_tracker.preferences_pb"), new t71(27), kind, emptyList), module));
                break;
            case 13:
                BeanDefinition factoryOf5 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf5, "$this$factoryOf");
                factoryOf5.f = CollectionsKt.d0(Reflection.a(NotificationCentralProcessingManager.class), factoryOf5.f);
                break;
            case 14:
                BeanDefinition factoryOf6 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf6, "$this$factoryOf");
                factoryOf6.f = CollectionsKt.d0(Reflection.a(NotificationDisplayDataManager.class), factoryOf6.f);
                break;
            case 15:
                BeanDefinition factoryOf7 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf7, "$this$factoryOf");
                factoryOf7.f = CollectionsKt.d0(Reflection.a(TITOUnifiedFlowValidationDataManager.class), factoryOf7.f);
                break;
            case 16:
                BeanDefinition factoryOf8 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf8, "$this$factoryOf");
                factoryOf8.f = CollectionsKt.d0(Reflection.a(ProductValidationAnalyticManager.class), factoryOf8.f);
                break;
            case 17:
                BeanDefinition factoryOf9 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf9, "$this$factoryOf");
                factoryOf9.f = CollectionsKt.d0(Reflection.a(ProductValidationNavigationManager.class), factoryOf9.f);
                break;
            case 18:
                BeanDefinition factoryOf10 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf10, "$this$factoryOf");
                factoryOf10.f = CollectionsKt.d0(Reflection.a(ProductValidationReportProblemManager.class), factoryOf10.f);
                break;
            case 19:
                BeanDefinition factoryOf11 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf11, "$this$factoryOf");
                factoryOf11.f = CollectionsKt.d0(Reflection.a(ProductValidationUIManager.class), factoryOf11.f);
                break;
            case 20:
                BeanDefinition factoryOf12 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf12, "$this$factoryOf");
                factoryOf12.f = CollectionsKt.d0(Reflection.a(ProductValidationAnalyticManager.class), factoryOf12.f);
                break;
            case 21:
                BeanDefinition factoryOf13 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf13, "$this$factoryOf");
                factoryOf13.f = CollectionsKt.d0(Reflection.a(ProductValidationNavigationManager.class), factoryOf13.f);
                break;
            case 22:
                BeanDefinition factoryOf14 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf14, "$this$factoryOf");
                factoryOf14.f = CollectionsKt.d0(Reflection.a(ProductValidationUIManager.class), factoryOf14.f);
                break;
            case 23:
                BeanDefinition factoryOf15 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf15, "$this$factoryOf");
                factoryOf15.f = CollectionsKt.d0(Reflection.a(HomeScreenAnalyticsHelper.class), factoryOf15.f);
                break;
            case 24:
                BeanDefinition factoryOf16 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf16, "$this$factoryOf");
                factoryOf16.f = CollectionsKt.d0(Reflection.a(ProductValidationReportProblemManager.class), factoryOf16.f);
                break;
            case 25:
                BeanDefinition singleOf9 = (BeanDefinition) obj;
                Intrinsics.i(singleOf9, "$this$singleOf");
                singleOf9.f = CollectionsKt.d0(Reflection.a(SosFeaturePlatformDelegateProvider.class), singleOf9.f);
                break;
            case 26:
                BeanDefinition factoryOf17 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf17, "$this$factoryOf");
                factoryOf17.f = CollectionsKt.d0(Reflection.a(RaiseSOSRepository.class), factoryOf17.f);
                break;
            case 27:
                BeanDefinition factoryOf18 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf18, "$this$factoryOf");
                factoryOf18.f = CollectionsKt.d0(Reflection.a(RaiseSOSRemoteDataSource.class), factoryOf18.f);
                break;
            case 28:
                BeanDefinition factoryOf19 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf19, "$this$factoryOf");
                factoryOf19.f = CollectionsKt.d0(Reflection.a(ProductReceiptContract.class), factoryOf19.f);
                break;
            default:
                BeanDefinition factoryOf20 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf20, "$this$factoryOf");
                factoryOf20.f = CollectionsKt.d0(Reflection.a(IProductDataSyncRepository.class), factoryOf20.f);
                break;
        }
        return Unit.f17538a;
    }
}
