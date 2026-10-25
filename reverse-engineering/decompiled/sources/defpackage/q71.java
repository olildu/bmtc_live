package defpackage;

import android.bluetooth.BluetoothAdapter;
import androidx.datastore.core.DataStore;
import app.chalo.analytics.MixpanelTokenProvider;
import app.chalo.behaviour.policy.AccountDeletionUrlOverride;
import app.chalo.behaviour.policy.CitySelectionPolicyOverride;
import app.chalo.behaviour.policy.JuspayPolicyOverride;
import app.chalo.behaviour.policy.LanguagePolicyOverride;
import app.chalo.behaviour.policy.LocationPermissionPolicyOverride;
import app.chalo.behaviour.policy.ProductPurchasePolicyOverride;
import app.chalo.behaviour.policy.ProfilePolicyOverride;
import app.chalo.behaviour.policy.ResourceUrlPolicyOverride;
import app.chalo.behaviour.policy.SdkIntegrationPolicyOverride;
import app.chalo.behaviour.policy.SplashPolicyOverride;
import app.chalo.behaviour.policy.SupportPolicyOverride;
import app.chalo.behaviour.policy.TripPlannerPolicyOverride;
import app.chalo.behaviour.policy.WalletPolicyOverride;
import app.chalo.ble_communication.di.SharedBleFeatureModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1;
import app.chalo.ble_communication.di.SharedBleFeatureModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1;
import app.chalo.ble_communication.di.SharedBleFeatureModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$2;
import app.chalo.ble_communication.di.SharedBleFeatureModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$3;
import app.chalo.ble_communication.di.SharedBleFeatureModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$4;
import app.chalo.ble_communication.di.SharedBleFeatureModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$1;
import app.chalo.ble_communication.di.SharedBleFeatureModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$2;
import app.chalo.ble_communication.di.SharedBleFeatureModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$3;
import app.chalo.ble_communication.di.SharedBleFeatureModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$4;
import app.chalo.ble_communication.domain.BLEOperationExecutor;
import app.chalo.ble_communication.domain.GetBLELoggingConfigUseCase;
import app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeature;
import app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeatureAndroid;
import app.chalo.ble_communication.feature.bluetoothsystem.BluetoothPermissionAndSystemFeature;
import app.chalo.ble_communication.feature.bluetoothsystem.BluetoothPermissionAndSystemFeatureAndroid;
import app.chalo.ble_communication.feature.bluetoothsystem.CheckBluetoothPermissionHelperAndroid;
import app.chalo.ble_communication.feature.logging.BLELoggingFeature;
import app.chalo.ble_communication.passengerside.feature.BLEPassengerSideCommunicationFeature;
import app.chalo.ble_communication.passengerside.feature.BLEPassengerSideCommunicationFeatureImpl;
import app.chalo.ble_communication.passengerside.feature.PassengerSideConnectionPoolManager;
import app.chalo.ble_communication.passengerside.feature.PassengerSideConnectionResolver;
import app.chalo.blevalidation.CheckBluetoothPermissionHelper;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$1;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$10;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$11;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$2;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$3;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$4;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$5;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$6;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$7;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$8;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$9;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$10;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$11;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$12;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$13;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$14;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$15;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$2;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$3;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$4;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$5;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$6;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$7;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$8;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$9;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$1;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$10;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$11;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$12;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$2;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$3;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$4;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$5;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$6;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$7;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$8;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$9;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$default$1;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$default$2;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$default$3;
import app.chalo.city_data_di.SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$default$4;
import app.chalo.citydata.domain.FetchAllMetroStopsUseCase;
import app.chalo.citydata.domain.FetchCityIdFromLatLngUseCase;
import app.chalo.citydata.domain.FetchNearbyStopsUseCase;
import app.chalo.citydata.domain.FetchRouteDataFromRemoteUseCase;
import app.chalo.citydata.domain.FetchRoutesDataFromRemoteAndRefreshCacheIfRequiredUseCase;
import app.chalo.citydata.domain.FetchStopDetailsUseCase;
import app.chalo.citydata.domain.FetchStopImagesUseCase;
import app.chalo.citydata.domain.GetCachedRouteUseCase;
import app.chalo.citydata.domain.GetCityDataRemoteConfigUseCase;
import app.chalo.citydata.domain.GetRouteDataFromLocalOrRemoteUseCase;
import app.chalo.citydata.domain.GetRoutesToSyncUseCase;
import app.chalo.citydata.domain.IsDynamicCityDataFetchEnabledUseCase;
import app.chalo.citydata.domain.ManageRoutesDataUseCase;
import app.chalo.citydata.domain.ShouldUpdateRouteDataCacheUseCase;
import app.chalo.citydata.domain.SyncRoutesDataUseCase;
import app.chalo.citydata.manager.CityDataManagerKotlin;
import app.chalo.citydata.manager.CityDataManagerKotlinImpl;
import app.chalo.citydata.repository.CityDataRepositoryImpl;
import app.chalo.citydata.repository.local.RouteLocalDataSourceImpl;
import app.chalo.citydata.repository.local.store.CityDataLocalStore;
import app.chalo.citydata.repository.remote.CityDataRemoteDataSource;
import app.chalo.citydata.repository.remote.CityDataRemoteDataSourceImpl;
import app.chalo.compose.components.chalomap.PolylineUtils;
import app.chalo.compose.utils.CommonContext;
import app.chalo.contract.RemoteConfigFetcherContract;
import app.chalo.core.database.AppDatabase;
import app.chalo.core.database.AppDatabaseAndroidImpl;
import app.chalo.core.di.SharedCoreModule_androidKt$platformModule$lambda$0$$inlined$singleOf$1;
import app.chalo.core.init.ApplicationInitManager;
import app.chalo.di.SharedBrandBmtcModuleKt;
import app.chalo.features.nfc.BasicNFCManager;
import app.chalo.helper.ChaloPackageManagerHelper;
import app.chalo.helper.UrlOpenHelper;
import app.chalo.location.ChaloLocationDelegate;
import app.chalo.navigation.parent.ParentComponent;
import app.chalo.network.logging.ChaloInternalNetworkInspector;
import app.chalo.plotline.PlotlineNotificationManager;
import app.chalo.providers.lottieassetprovider.BrandLottieType;
import app.chalo.providers.lottieassetprovider.LottieAssetProvider;
import app.chalo.recent.RecentsAndFavMigrationsTrackingDatastoreHelper;
import app.chalo.recent.database.migration.RecentsStoreMigrationHelper;
import app.chalo.recent.database.migration.RecentsStoreMigrationHelperImpl;
import app.chalo.recent.database.repository.recent.PlacesRecentRepositoryImpl;
import app.chalo.recent.database.repository.recent.RecentLocationPairRepository;
import app.chalo.recent.database.repository.recent.RecentLocationPairRepositoryImpl;
import app.chalo.recent.database.repository.recent.RecentRepositoryProviderImpl;
import app.chalo.recent.database.repository.recent.RouteRecentRepositoryImpl;
import app.chalo.recent.database.repository.recent.StopAndRouteBasedRecentRepositoryImpl;
import app.chalo.recent.database.repository.recent.StopBasedTripRecentRepositoryImpl;
import app.chalo.recent.database.repository.recent.StopRecentRepository;
import app.chalo.recent.database.repository.recent.StopRecentRepositoryImpl;
import app.chalo.recent.database.repository.recent.TripRecentRepository;
import app.chalo.recent.database.repository.recent.TripRecentRepositoryImpl;
import app.chalo.recent.domain.FetchRecentDataFromDbBasedOnSpecialStatusUseCase;
import app.chalo.recent.localsource.recent.RecentLocationPairLocalDataSource;
import app.chalo.recent.localsource.recent.RecentLocationPairLocalDataSourceImpl;
import app.chalo.recent.localsource.recent.RecentPlaceLocalDataSourceImpl;
import app.chalo.recent.localsource.recent.RecentRouteLocalDataSourceImpl;
import app.chalo.recent.localsource.recent.RecentStopAndRouteBasedTripLocalDataSourceImpl;
import app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSource;
import app.chalo.recent.localsource.recent.RecentStopBasedTripLocalDataSourceImpl;
import app.chalo.recent.localsource.recent.RecentStopLocalDataStoreImpl;
import app.chalo.recent.localsource.recent.RecentTripLocalDataSource;
import app.chalo.recent.localsource.recent.RecentTripLocalDataSourceImpl;
import app.chalo.recent.localsource.recent.RecentsAndFavMigrationLocalDataSourceImpl;
import app.chalo.stoptripdetails.domain.GetEstimatedTimeUseCase;
import app.chalo.stoptripdetails.domain.GetRelevantScheduledTripFromStopTripsList;
import app.chalo.stoptripdetails.domain.GetTimeTableDisclaimerTextUseCase;
import app.chalo.stoptripdetails.remote.StopTripDetailsRemoteDataSource;
import app.chalo.stoptripdetails.remote.StopTripDetailsRemoteDataSourceImpl;
import app.chalo.stoptripdetails.repo.StopTripDetailsRepository;
import app.chalo.stoptripdetails.repo.StopTripDetailsRepositoryImpl;
import app.chalo.uistate.color.palette.BrandColorPalette;
import app.chalo.worker.ApplicationBackgroundWorkersManager;
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
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q71 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19097a;

    public /* synthetic */ q71(int i) {
        this.f19097a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19097a;
        int i2 = 9;
        int i3 = 2;
        int i4 = 1;
        int i5 = 29;
        int i6 = 27;
        int i7 = 28;
        int i8 = 25;
        int i9 = 0;
        int i10 = 24;
        int i11 = 21;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                BeanDefinition factoryOf = (BeanDefinition) obj;
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(ChaloLocationDelegate.class), factoryOf.f);
                break;
            case 1:
                BeanDefinition factoryOf2 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf2, "$this$factoryOf");
                factoryOf2.f = CollectionsKt.d0(Reflection.a(LottieAssetProvider.class), factoryOf2.f);
                break;
            case 2:
                BeanDefinition factoryOf3 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf3, "$this$factoryOf");
                factoryOf3.f = CollectionsKt.d0(Reflection.a(PolylineUtils.class), factoryOf3.f);
                break;
            case 3:
                BeanDefinition singleOf = (BeanDefinition) obj;
                Intrinsics.i(singleOf, "$this$singleOf");
                singleOf.f = CollectionsKt.d0(Reflection.a(BasicNFCManager.class), singleOf.f);
                break;
            case 4:
                BeanDefinition factoryOf4 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf4, "$this$factoryOf");
                factoryOf4.f = CollectionsKt.d0(Reflection.a(ChaloPackageManagerHelper.class), factoryOf4.f);
                break;
            case 5:
                BeanDefinition factoryOf5 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf5, "$this$factoryOf");
                factoryOf5.f = CollectionsKt.d0(Reflection.a(UrlOpenHelper.class), factoryOf5.f);
                break;
            case 6:
                BeanDefinition singleOf2 = (BeanDefinition) obj;
                Intrinsics.i(singleOf2, "$this$singleOf");
                singleOf2.f = CollectionsKt.d0(Reflection.a(RemoteConfigFetcherContract.class), singleOf2.f);
                break;
            case 7:
                BeanDefinition singleOf3 = (BeanDefinition) obj;
                Intrinsics.i(singleOf3, "$this$singleOf");
                singleOf3.f = CollectionsKt.d0(Reflection.a(PlotlineNotificationManager.class), singleOf3.f);
                break;
            case 8:
                Module module = (Module) obj;
                Intrinsics.i(module, "$this$module");
                Module module2 = new Module();
                OptionDSLKt.c(new KoinDefinition(module2, i71.w(new BeanDefinition(ScopeRegistry.e, Reflection.a(GetBLELoggingConfigUseCase.class), null, new SharedBleFeatureModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1(), Kind.Factory, EmptyList.f17557a), module2)), null);
                q71 q71Var = new q71(i2);
                Module module3 = new Module();
                q71Var.invoke(module3);
                CollectionsKt.k(module.e, new Module[]{module2, module3});
                break;
            case 9:
                Module module4 = (Module) obj;
                Intrinsics.i(module4, "$this$module");
                q71 q71Var2 = new q71(10);
                SharedBleFeatureModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1 sharedBleFeatureModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1 = new SharedBleFeatureModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1();
                Kind kind = Kind.Factory;
                EmptyList emptyList = EmptyList.f17557a;
                ClassReference classReferenceA = Reflection.a(BluetoothPermissionAndSystemFeatureAndroid.class);
                StringQualifier stringQualifier = ScopeRegistry.e;
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier, classReferenceA, null, sharedBleFeatureModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1, kind, emptyList), module4)), q71Var2);
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier, Reflection.a(BluetoothHardwareOperationsFeatureAndroid.class), null, new SharedBleFeatureModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$2(), kind, emptyList), module4)), new q71(11));
                new KoinDefinition(module4, i71.m(new BeanDefinition(stringQualifier, Reflection.a(BluetoothAdapter.class), null, new r71(14), Kind.Singleton, emptyList), module4));
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier, Reflection.a(BLEOperationExecutor.class), null, new SharedBleFeatureModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$1(), kind, emptyList), module4)), null);
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier, Reflection.a(BLELoggingFeature.class), null, new SharedBleFeatureModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$2(), kind, emptyList), module4)), null);
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier, Reflection.a(BLEPassengerSideCommunicationFeatureImpl.class), null, new SharedBleFeatureModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$3(), kind, emptyList), module4)), new q71(12));
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PassengerSideConnectionPoolManager.class), null, new SharedBleFeatureModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$3(), kind, emptyList), module4)), null);
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PassengerSideConnectionResolver.class), null, new SharedBleFeatureModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$4(), kind, emptyList), module4)), null);
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier, Reflection.a(CheckBluetoothPermissionHelperAndroid.class), null, new SharedBleFeatureModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$4(), kind, emptyList), module4)), new q71(13));
                break;
            case 10:
                BeanDefinition factoryOf6 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf6, "$this$factoryOf");
                factoryOf6.f = CollectionsKt.d0(Reflection.a(BluetoothPermissionAndSystemFeature.class), factoryOf6.f);
                break;
            case 11:
                BeanDefinition factoryOf7 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf7, "$this$factoryOf");
                factoryOf7.f = CollectionsKt.d0(Reflection.a(BluetoothHardwareOperationsFeature.class), factoryOf7.f);
                break;
            case 12:
                BeanDefinition factoryOf8 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf8, "$this$factoryOf");
                factoryOf8.f = CollectionsKt.d0(Reflection.a(BLEPassengerSideCommunicationFeature.class), factoryOf8.f);
                break;
            case 13:
                BeanDefinition factoryOf9 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf9, "$this$factoryOf");
                factoryOf9.f = CollectionsKt.d0(Reflection.a(CheckBluetoothPermissionHelper.class), factoryOf9.f);
                break;
            case 14:
                Module module5 = (Module) obj;
                Module module6 = SharedBrandBmtcModuleKt.f2479a;
                Intrinsics.i(module5, "$this$module");
                r71 r71Var = new r71(22);
                Kind kind2 = Kind.Singleton;
                EmptyList emptyList2 = EmptyList.f17557a;
                ClassReference classReferenceA2 = Reflection.a(AccountDeletionUrlOverride.class);
                StringQualifier stringQualifier2 = ScopeRegistry.e;
                new KoinDefinition(module5, i71.m(new BeanDefinition(stringQualifier2, classReferenceA2, null, r71Var, kind2, emptyList2), module5));
                new KoinDefinition(module5, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(BrandColorPalette.class), null, new r71(i5), kind2, emptyList2), module5));
                new KoinDefinition(module5, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(BrandLottieType.class), null, new s71(i9), kind2, emptyList2), module5));
                new KoinDefinition(module5, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(MixpanelTokenProvider.class), null, new r71(15), kind2, emptyList2), module5));
                new KoinDefinition(module5, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(SplashPolicyOverride.class), null, new r71(16), kind2, emptyList2), module5));
                new KoinDefinition(module5, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(CitySelectionPolicyOverride.class), null, new r71(17), kind2, emptyList2), module5));
                new KoinDefinition(module5, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(SupportPolicyOverride.class), null, new r71(18), kind2, emptyList2), module5));
                new KoinDefinition(module5, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(WalletPolicyOverride.class), null, new r71(19), kind2, emptyList2), module5));
                new KoinDefinition(module5, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(JuspayPolicyOverride.class), null, new r71(20), kind2, emptyList2), module5));
                new KoinDefinition(module5, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(LanguagePolicyOverride.class), null, new r71(i11), kind2, emptyList2), module5));
                new KoinDefinition(module5, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(ProductPurchasePolicyOverride.class), null, new r71(23), kind2, emptyList2), module5));
                new KoinDefinition(module5, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(ProfilePolicyOverride.class), null, new r71(i10), kind2, emptyList2), module5));
                new KoinDefinition(module5, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(ResourceUrlPolicyOverride.class), null, new r71(i8), kind2, emptyList2), module5));
                new KoinDefinition(module5, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(SdkIntegrationPolicyOverride.class), null, new r71(26), kind2, emptyList2), module5));
                new KoinDefinition(module5, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(LocationPermissionPolicyOverride.class), null, new r71(i6), kind2, emptyList2), module5));
                new KoinDefinition(module5, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(TripPlannerPolicyOverride.class), null, new r71(i7), kind2, emptyList2), module5));
                break;
            case 15:
                BeanDefinition factoryOf10 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf10, "$this$factoryOf");
                factoryOf10.f = CollectionsKt.d0(Reflection.a(ParentComponent.class), factoryOf10.f);
                break;
            case 16:
                Module module7 = (Module) obj;
                Intrinsics.i(module7, "$this$module");
                t71 t71Var = new t71(19);
                Kind kind3 = Kind.Singleton;
                EmptyList emptyList3 = EmptyList.f17557a;
                ClassReference classReferenceA3 = Reflection.a(CommonContext.class);
                StringQualifier stringQualifier3 = ScopeRegistry.e;
                new KoinDefinition(module7, i71.m(new BeanDefinition(stringQualifier3, Reflection.a(DataStore.class), i71.n(module7, i71.m(new BeanDefinition(stringQualifier3, classReferenceA3, null, t71Var, kind3, emptyList3), module7), "ENV_CHANGE_STORE_KEY.preferences_pb"), new t71(20), kind3, emptyList3), module7));
                new KoinDefinition(module7, i71.m(new BeanDefinition(stringQualifier3, Reflection.a(ApplicationInitManager.class), null, new t71(i11), kind3, emptyList3), module7));
                OptionDSLKt.c(new KoinDefinition(module7, i71.m(new BeanDefinition(stringQualifier3, Reflection.a(AppDatabaseAndroidImpl.class), null, new SharedCoreModule_androidKt$platformModule$lambda$0$$inlined$singleOf$1(), kind3, emptyList3), module7)), new q71(17));
                new KoinDefinition(module7, i71.m(new BeanDefinition(stringQualifier3, Reflection.a(ApplicationBackgroundWorkersManager.class), null, new t71(22), kind3, emptyList3), module7));
                new KoinDefinition(module7, i71.m(new BeanDefinition(stringQualifier3, Reflection.a(ChaloInternalNetworkInspector.class), null, new t71(23), kind3, emptyList3), module7));
                break;
            case 17:
                BeanDefinition singleOf4 = (BeanDefinition) obj;
                Intrinsics.i(singleOf4, "$this$singleOf");
                singleOf4.f = CollectionsKt.d0(Reflection.a(AppDatabase.class), singleOf4.f);
                break;
            case 18:
                Module module8 = (Module) obj;
                Intrinsics.i(module8, "$this$module");
                SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1 sharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1 = new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1();
                Kind kind4 = Kind.Factory;
                EmptyList emptyList4 = EmptyList.f17557a;
                ClassReference classReferenceA4 = Reflection.a(GetEstimatedTimeUseCase.class);
                StringQualifier stringQualifier4 = ScopeRegistry.e;
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, classReferenceA4, null, sharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1, kind4, emptyList4), module8)), null);
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(GetRelevantScheduledTripFromStopTripsList.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$2(), kind4, emptyList4), module8)), null);
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(GetTimeTableDisclaimerTextUseCase.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$3(), kind4, emptyList4), module8)), null);
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(StopTripDetailsRemoteDataSourceImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$1(), kind4, emptyList4), module8)), new q71(i7));
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(StopTripDetailsRepositoryImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$2(), kind4, emptyList4), module8)), new q71(i11));
                t71 t71Var2 = new t71(i10);
                Kind kind5 = Kind.Singleton;
                new KoinDefinition(module8, i71.m(new BeanDefinition(stringQualifier4, Reflection.a(CityDataLocalStore.class), null, t71Var2, kind5, emptyList4), module8));
                OptionDSLKt.c(new KoinDefinition(module8, i71.m(new BeanDefinition(stringQualifier4, Reflection.a(CityDataManagerKotlinImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$1(), kind5, emptyList4), module8)), new q71(i6));
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(CityDataRemoteDataSourceImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$3(), kind4, emptyList4), module8)), new q71(i5));
                OptionDSLKt.c(new KoinDefinition(module8, i71.m(new BeanDefinition(stringQualifier4, Reflection.a(CityDataRepositoryImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$2(), kind5, emptyList4), module8)), new v71(i9));
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(FetchRecentDataFromDbBasedOnSpecialStatusUseCase.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$4(), kind4, emptyList4), module8)), null);
                OptionDSLKt.c(new KoinDefinition(module8, i71.m(new BeanDefinition(stringQualifier4, Reflection.a(FetchRouteDataFromRemoteUseCase.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$default$1(), kind5, emptyList4), module8)), null);
                OptionDSLKt.c(new KoinDefinition(module8, i71.m(new BeanDefinition(stringQualifier4, Reflection.a(FetchRoutesDataFromRemoteAndRefreshCacheIfRequiredUseCase.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$default$2(), kind5, emptyList4), module8)), null);
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(FetchStopDetailsUseCase.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$5(), kind4, emptyList4), module8)), null);
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(FetchStopImagesUseCase.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$6(), kind4, emptyList4), module8)), null);
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(GetCachedRouteUseCase.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$7(), kind4, emptyList4), module8)), null);
                OptionDSLKt.c(new KoinDefinition(module8, i71.m(new BeanDefinition(stringQualifier4, Reflection.a(GetCityDataRemoteConfigUseCase.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$default$3(), kind5, emptyList4), module8)), null);
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(GetRouteDataFromLocalOrRemoteUseCase.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$8(), kind4, emptyList4), module8)), null);
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(GetRoutesToSyncUseCase.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$9(), kind4, emptyList4), module8)), null);
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(IsDynamicCityDataFetchEnabledUseCase.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$10(), kind4, emptyList4), module8)), null);
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(ManageRoutesDataUseCase.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$11(), kind4, emptyList4), module8)), null);
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(ShouldUpdateRouteDataCacheUseCase.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$12(), kind4, emptyList4), module8)), null);
                OptionDSLKt.c(new KoinDefinition(module8, i71.m(new BeanDefinition(stringQualifier4, Reflection.a(SyncRoutesDataUseCase.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$default$4(), kind5, emptyList4), module8)), null);
                OptionDSLKt.c(new KoinDefinition(module8, i71.m(new BeanDefinition(stringQualifier4, Reflection.a(PlacesRecentRepositoryImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$3(), kind5, emptyList4), module8)), new v71(i4));
                OptionDSLKt.c(new KoinDefinition(module8, i71.m(new BeanDefinition(stringQualifier4, Reflection.a(RecentPlaceLocalDataSourceImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$4(), kind5, emptyList4), module8)), new v71(i3));
                OptionDSLKt.c(new KoinDefinition(module8, i71.m(new BeanDefinition(stringQualifier4, Reflection.a(RecentRepositoryProviderImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$5(), kind5, emptyList4), module8)), new v71(3));
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(RecentRouteLocalDataSourceImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$4(), kind4, emptyList4), module8)), new v71(4));
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(RecentStopAndRouteBasedTripLocalDataSourceImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$5(), kind4, emptyList4), module8)), new v71(5));
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(RecentsAndFavMigrationLocalDataSourceImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$6(), kind4, emptyList4), module8)), new v71(6));
                new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(RecentsAndFavMigrationsTrackingDatastoreHelper.class), null, new t71(i8), kind4, emptyList4), module8));
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(RecentStopLocalDataStoreImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$7(), kind4, emptyList4), module8)), new v71(7));
                OptionDSLKt.c(new KoinDefinition(module8, i71.m(new BeanDefinition(stringQualifier4, Reflection.a(RouteLocalDataSourceImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$6(), kind5, emptyList4), module8)), new v71(8));
                OptionDSLKt.c(new KoinDefinition(module8, i71.m(new BeanDefinition(stringQualifier4, Reflection.a(RouteRecentRepositoryImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$7(), kind5, emptyList4), module8)), new v71(i2));
                OptionDSLKt.c(new KoinDefinition(module8, i71.m(new BeanDefinition(stringQualifier4, Reflection.a(StopAndRouteBasedRecentRepositoryImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$8(), kind5, emptyList4), module8)), new v71(10));
                OptionDSLKt.c(new KoinDefinition(module8, i71.m(new BeanDefinition(stringQualifier4, Reflection.a(StopBasedTripRecentRepositoryImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$9(), kind5, emptyList4), module8)), new v71(11));
                OptionDSLKt.c(new KoinDefinition(module8, i71.m(new BeanDefinition(stringQualifier4, Reflection.a(StopRecentRepositoryImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$10(), kind5, emptyList4), module8)), new q71(19));
                OptionDSLKt.c(new KoinDefinition(module8, i71.m(new BeanDefinition(stringQualifier4, Reflection.a(TripRecentRepositoryImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$11(), kind5, emptyList4), module8)), new q71(20));
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(RecentStopBasedTripLocalDataSourceImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$8(), kind4, emptyList4), module8)), new q71(22));
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(RecentTripLocalDataSourceImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$9(), kind4, emptyList4), module8)), new q71(23));
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(FetchCityIdFromLatLngUseCase.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$13(), kind4, emptyList4), module8)), null);
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(FetchAllMetroStopsUseCase.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$14(), kind4, emptyList4), module8)), null);
                OptionDSLKt.c(new KoinDefinition(module8, i71.m(new BeanDefinition(stringQualifier4, Reflection.a(RecentsStoreMigrationHelperImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$singleOf$12(), kind5, emptyList4), module8)), new q71(i10));
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(FetchNearbyStopsUseCase.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$15(), kind4, emptyList4), module8)), null);
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(RecentLocationPairRepositoryImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$10(), kind4, emptyList4), module8)), new q71(i8));
                OptionDSLKt.c(new KoinDefinition(module8, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(RecentLocationPairLocalDataSourceImpl.class), null, new SharedFrameworkCityDataModuleKt$commonModule$lambda$0$$inlined$factoryOf$11(), kind4, emptyList4), module8)), new q71(26));
                break;
            case 19:
                BeanDefinition singleOf5 = (BeanDefinition) obj;
                Intrinsics.i(singleOf5, "$this$singleOf");
                singleOf5.f = CollectionsKt.d0(Reflection.a(StopRecentRepository.class), singleOf5.f);
                break;
            case 20:
                BeanDefinition singleOf6 = (BeanDefinition) obj;
                Intrinsics.i(singleOf6, "$this$singleOf");
                singleOf6.f = CollectionsKt.d0(Reflection.a(TripRecentRepository.class), singleOf6.f);
                break;
            case 21:
                BeanDefinition factoryOf11 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf11, "$this$factoryOf");
                factoryOf11.f = CollectionsKt.d0(Reflection.a(StopTripDetailsRepository.class), factoryOf11.f);
                break;
            case 22:
                BeanDefinition factoryOf12 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf12, "$this$factoryOf");
                factoryOf12.f = CollectionsKt.d0(Reflection.a(RecentStopBasedTripLocalDataSource.class), factoryOf12.f);
                break;
            case 23:
                BeanDefinition factoryOf13 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf13, "$this$factoryOf");
                factoryOf13.f = CollectionsKt.d0(Reflection.a(RecentTripLocalDataSource.class), factoryOf13.f);
                break;
            case 24:
                BeanDefinition singleOf7 = (BeanDefinition) obj;
                Intrinsics.i(singleOf7, "$this$singleOf");
                singleOf7.f = CollectionsKt.d0(Reflection.a(RecentsStoreMigrationHelper.class), singleOf7.f);
                break;
            case 25:
                BeanDefinition factoryOf14 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf14, "$this$factoryOf");
                factoryOf14.f = CollectionsKt.d0(Reflection.a(RecentLocationPairRepository.class), factoryOf14.f);
                break;
            case 26:
                BeanDefinition factoryOf15 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf15, "$this$factoryOf");
                factoryOf15.f = CollectionsKt.d0(Reflection.a(RecentLocationPairLocalDataSource.class), factoryOf15.f);
                break;
            case 27:
                BeanDefinition singleOf8 = (BeanDefinition) obj;
                Intrinsics.i(singleOf8, "$this$singleOf");
                singleOf8.f = CollectionsKt.d0(Reflection.a(CityDataManagerKotlin.class), singleOf8.f);
                break;
            case 28:
                BeanDefinition factoryOf16 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf16, "$this$factoryOf");
                factoryOf16.f = CollectionsKt.d0(Reflection.a(StopTripDetailsRemoteDataSource.class), factoryOf16.f);
                break;
            default:
                BeanDefinition factoryOf17 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf17, "$this$factoryOf");
                factoryOf17.f = CollectionsKt.d0(Reflection.a(CityDataRemoteDataSource.class), factoryOf17.f);
                break;
        }
        return unit;
    }
}
