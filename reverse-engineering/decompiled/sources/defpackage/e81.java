package defpackage;

import androidx.datastore.core.DataStore;
import app.chalo.ble_communication.feature.bluetoothsystem.ManualBluetoothTurnOnDelegateProvider;
import app.chalo.ble_communication.feature.bluetoothsystem.ManualBluetoothTurnOnDelegateProviderImpl;
import app.chalo.datastore.LocalDataStore;
import app.chalo.features.encryption.EncryptionFeature;
import app.chalo.multimodalticket.data.local.MultiModalGroupTicketLocalDataSource;
import app.chalo.multimodalticket.data.remote.MultiModalGroupTicketRemoteDataSource;
import app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository;
import app.chalo.ondc.local.OndcLocalDataSource;
import app.chalo.ondc.remote.OndcRemoteDataSource;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.routeselection.data.remote.RouteSelectionRemoteDataSource;
import app.chalo.routeselection.data.repository.RouteSelectionRepository;
import app.chalo.security.EncryptionFeatureImpl;
import app.chalo.security.FetchEncryptionKeysUseCase;
import app.chalo.security.di.SharedSecurityModuleKt$commonModule$lambda$0$$inlined$factoryOf$1;
import app.chalo.security.di.SharedSecurityModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1;
import app.chalo.security.di.SharedSecurityModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$2;
import app.chalo.security.di.SharedSecurityModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$3;
import app.chalo.security.di.SharedSecurityModuleKt$commonModule$lambda$0$$inlined$singleOf$1;
import app.chalo.security.di.SharedSecurityModuleKt$commonModule$lambda$0$$inlined$singleOf$2;
import app.chalo.security.di.SharedSecurityModuleKt$commonModule$lambda$0$$inlined$singleOf$default$1;
import app.chalo.security.di.SharedSecurityModuleKt$commonModule$lambda$0$$inlined$singleOf$default$2;
import app.chalo.security.di.SharedSecurityModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1;
import app.chalo.security.di.SharedSecurityModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$2;
import app.chalo.security.di.SharedSecurityModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$3;
import app.chalo.security.encryption.storage.EncryptedKeyStorage;
import app.chalo.security.encryption.storage.KeyStorageContract;
import app.chalo.security.encryption.utils.AESCryptoUtils;
import app.chalo.security.encryption.utils.AESCryptoUtilsAndroid;
import app.chalo.security.encryption.utils.KeyEncrypter;
import app.chalo.security.encryption.utils.KeyEncrypterAndroid;
import app.chalo.security.encryption.utils.KeyStoreUtils;
import app.chalo.security.encryption.utils.RSACryptoUtils;
import app.chalo.security.encryption.utils.RSACryptoUtilsAndroid;
import app.chalo.security.encryption.utils.VaultEncryptionKeyUtils;
import app.chalo.security.root.GetRootCheckRemoteConfigUseCase;
import app.chalo.security.sync.ClientSecretManager;
import app.chalo.security.sync.KeySyncBackgroundWorkerTaskDelegate;
import app.chalo.security.sync.KeySyncManager;
import app.chalo.security.sync.config.dao.ConfigDao;
import app.chalo.security.sync.keystorage.KeyDao;
import app.chalo.security.sync.usecase.GetKeySyncRemoteConfigUseCase;
import app.chalo.validationsdk.blevalidation.data.local.ProductValidationsDataStore;
import app.chalo.validationsdk.blevalidation.data.remote.ProductValidationsRemoteDataSource;
import app.chalo.validationsdk.blevalidation.data.remote.ProductValidationsRemoteDataSourceImpl;
import app.chalo.validationsdk.blevalidation.domain.ValidationSceneResolverUseCase;
import app.chalo.validationsdk.blevalidation.domain.configuration.CheckIsBleValidationEnabledUseCase;
import app.chalo.validationsdk.blevalidation.domain.configuration.GetRegularBusProductValidationMethodUseCase;
import app.chalo.validationsdk.blevalidation.domain.configuration.GetRegularBusProductValidationMethodsConfigForCurrentCityUseCase;
import app.chalo.validationsdk.blevalidation.domain.configuration.GetTimeRemainingToShowQRValidationOptionUseCase;
import app.chalo.validationsdk.blevalidation.domain.configuration.ShouldShowBleTutorialUseCase;
import app.chalo.validationsdk.blevalidation.domain.configuration.ShouldShowOptionToSwitchToQrAfterDenyingBlePermUseCase;
import app.chalo.validationsdk.blevalidation.domain.configuration.TrackBleTutorialShownUseCase;
import app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegate;
import app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegateImpl;
import app.chalo.validationsdk.blevalidation.domain.validationprocess.DefaultValidationQRGeneratorAndroid;
import app.chalo.validationsdk.blevalidation.domain.validationprocess.FetchProductPunchDataForOngoingValidationOnlineUseCase;
import app.chalo.validationsdk.blevalidation.domain.validationprocess.FetchTitoTapinInfoForActivationUseCase;
import app.chalo.validationsdk.blevalidation.domain.validationprocess.GetProductValidationDataFromDataReceivedOverBleConnectionUseCase;
import app.chalo.validationsdk.blevalidation.domain.validationprocess.GetRegularBusBLEValidationPayloadUseCase;
import app.chalo.validationsdk.blevalidation.domain.validationprocess.GetTitoTapOutBlePayloadUseCase;
import app.chalo.validationsdk.blevalidation.helper.BleValidationDynamicInfoHelper;
import app.chalo.validationsdk.blevalidation.helper.BleValidationPrerequisitesStateHelper;
import app.chalo.validationsdk.blevalidation.helper.BleValidationProcessCompletionHelper;
import app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper;
import app.chalo.validationsdk.blevalidation.helper.BmrclMetroValidationQrGenerator;
import app.chalo.validationsdk.blevalidation.helper.GenerateQRCodeForValidationHelper;
import app.chalo.validationsdk.blevalidation.helper.GenerateQRCodeForValidationHelperImpl;
import app.chalo.validationsdk.blevalidation.helper.GetTwoWayBleCommPilotConfigUseCase;
import app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger;
import app.chalo.validationsdk.blevalidation.helper.ValidationQrGenerator;
import app.chalo.validationsdk.blevalidation.nfc.DeviceNfcTapPaySuppressorManager;
import app.chalo.validationsdk.blevalidation.nfc.DeviceNfcTapPaySuppressorProvider;
import app.chalo.validationsdk.blevalidation.nfc.DeviceNfcTapPaySuppressorSetter;
import app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponent;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationComponent;
import app.chalo.validationsdk.di.SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$1;
import app.chalo.validationsdk.di.SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$2;
import app.chalo.validationsdk.di.SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$3;
import app.chalo.validationsdk.di.SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1;
import app.chalo.validationsdk.di.SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$10;
import app.chalo.validationsdk.di.SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$11;
import app.chalo.validationsdk.di.SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$12;
import app.chalo.validationsdk.di.SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$13;
import app.chalo.validationsdk.di.SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$14;
import app.chalo.validationsdk.di.SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$15;
import app.chalo.validationsdk.di.SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$16;
import app.chalo.validationsdk.di.SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$17;
import app.chalo.validationsdk.di.SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$2;
import app.chalo.validationsdk.di.SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$3;
import app.chalo.validationsdk.di.SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$4;
import app.chalo.validationsdk.di.SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$5;
import app.chalo.validationsdk.di.SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$6;
import app.chalo.validationsdk.di.SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$7;
import app.chalo.validationsdk.di.SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$8;
import app.chalo.validationsdk.di.SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$9;
import app.chalo.validationsdk.di.SharedValidationModuleKt$commonModule$lambda$0$$inlined$singleOf$1;
import app.chalo.validationsdk.di.SharedValidationModuleKt$commonModule$lambda$0$$inlined$singleOf$2;
import app.chalo.validationsdk.di.SharedValidationModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1;
import app.chalo.validationsdk.di.SharedValidationModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$1;
import app.chalo.validationsdk.di.SharedValidationModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$2;
import app.chalo.validationsdk.di.SharedValidationModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$3;
import app.chalo.validationsdk.di.SharedValidationModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$4;
import app.chalo.validationsdk.di.SharedValidationModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$5;
import app.chalo.validationsdk.di.SharedValidationModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$6;
import app.chalo.validationsdk.di.SharedValidationModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$7;
import app.chalo.validationsdk.di.VehicleBasedValidationModuleKt$vehicleBasedValidationModule$$inlined$factoryOf$1;
import app.chalo.validationsdk.di.VehicleBasedValidationModuleKt$vehicleBasedValidationModule$$inlined$factoryOf$2;
import app.chalo.validationsdk.di.VehicleBasedValidationModuleKt$vehicleBasedValidationModule$$inlined$factoryOf$default$1;
import app.chalo.validationsdk.di.VehicleBasedValidationModuleKt$vehicleBasedValidationModule$$inlined$factoryOf$default$2;
import app.chalo.validationsdk.di.VehicleBasedValidationModuleKt$vehicleBasedValidationModule$$inlined$factoryOf$default$3;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent;
import app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationUIStateFactory;
import app.chalo.validationsdk.vehiclebasedvalidation.data.remote.VehicleBasedValidationRemoteDataSourceImpl;
import app.chalo.validationsdk.vehiclebasedvalidation.data.repository.VehicleBasedValidationRepositoryImpl;
import app.chalo.validationsdk.vehiclebasedvalidation.domain.ValidateONDCTicketAndFetchReceiptUseCase;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerValidationComponent;
import app.chalo.validationsdk.vehiclebasedvalidation.ui.QRScannerValidationUiStateFactory;
import app.chalo.vault.dao.ConfigDaoImpl;
import app.chalo.vault.dao.KeyDaoImpl;
import app.chalo.vault.dao.QuickPayDaoImpl;
import app.chalo.vault.dao.WalletDaoImpl;
import app.chalo.vault.db.ChaloCoreDatabaseAndroid;
import app.chalo.vault.di.SharedVaultModuleKt$commonModule$lambda$0$$inlined$factoryOf$1;
import app.chalo.vault.di.SharedVaultModuleKt$commonModule$lambda$0$$inlined$factoryOf$2;
import app.chalo.vault.di.SharedVaultModuleKt$commonModule$lambda$0$$inlined$factoryOf$3;
import app.chalo.vault.di.SharedVaultModuleKt$commonModule$lambda$0$$inlined$factoryOf$4;
import app.chalo.vault.di.SharedVaultModule_androidKt$platformModule$lambda$0$$inlined$singleOf$1;
import app.chalo.walletframework.quickpay.data.repository.dao.QuickPayDao;
import app.chalo.worker.BackgroundWorkerTaskDelegate;
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
public final /* synthetic */ class e81 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15529a;

    public /* synthetic */ e81(int i) {
        this.f15529a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f15529a;
        int i2 = 16;
        int i3 = 15;
        int i4 = 20;
        int i5 = 19;
        int i6 = 18;
        int i7 = 22;
        int i8 = 1;
        int i9 = 0;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                BeanDefinition factoryOf = (BeanDefinition) obj;
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(OndcLocalDataSource.class), factoryOf.f);
                break;
            case 1:
                BeanDefinition factoryOf2 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf2, "$this$factoryOf");
                factoryOf2.f = CollectionsKt.d0(Reflection.a(MultiModalGroupTicketLocalDataSource.class), factoryOf2.f);
                break;
            case 2:
                BeanDefinition factoryOf3 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf3, "$this$factoryOf");
                factoryOf3.f = CollectionsKt.d0(Reflection.a(MultiModalGroupTicketRepository.class), factoryOf3.f);
                break;
            case 3:
                BeanDefinition factoryOf4 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf4, "$this$factoryOf");
                factoryOf4.f = CollectionsKt.d0(Reflection.a(MultiModalGroupTicketRemoteDataSource.class), factoryOf4.f);
                break;
            case 4:
                BeanDefinition factoryOf5 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf5, "$this$factoryOf");
                factoryOf5.f = CollectionsKt.d0(Reflection.a(OndcRemoteDataSource.class), factoryOf5.f);
                break;
            case 5:
                BeanDefinition factoryOf6 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf6, "$this$factoryOf");
                factoryOf6.f = CollectionsKt.d0(Reflection.a(OndcRepository.class), factoryOf6.f);
                break;
            case 6:
                BeanDefinition factoryOf7 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf7, "$this$factoryOf");
                factoryOf7.f = CollectionsKt.d0(Reflection.a(RouteSelectionRemoteDataSource.class), factoryOf7.f);
                break;
            case 7:
                BeanDefinition factoryOf8 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf8, "$this$factoryOf");
                factoryOf8.f = CollectionsKt.d0(Reflection.a(RouteSelectionRepository.class), factoryOf8.f);
                break;
            case 8:
                Module module = (Module) obj;
                Intrinsics.i(module, "$this$module");
                StringQualifier stringQualifier = new StringQualifier("product_booking_prefs.preferences_pb");
                d81 d81Var = new d81(i3);
                Kind kind = Kind.Singleton;
                EmptyList emptyList = EmptyList.f17557a;
                ClassReference classReferenceA = Reflection.a(DataStore.class);
                StringQualifier stringQualifier2 = ScopeRegistry.e;
                new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(LocalDataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(LocalDataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier2, classReferenceA, stringQualifier, d81Var, kind, emptyList), module), "premiumBusStore.preferences_pb"), new d81(i2), kind, emptyList), module), "ride_hailing_store.preferences_pb"), new d81(17), kind, emptyList), module));
                break;
            case 9:
                Module module2 = (Module) obj;
                Intrinsics.i(module2, "$this$module");
                e81 e81Var = new e81(10);
                SharedSecurityModuleKt$commonModule$lambda$0$$inlined$singleOf$1 sharedSecurityModuleKt$commonModule$lambda$0$$inlined$singleOf$1 = new SharedSecurityModuleKt$commonModule$lambda$0$$inlined$singleOf$1();
                Kind kind2 = Kind.Singleton;
                EmptyList emptyList2 = EmptyList.f17557a;
                ClassReference classReferenceA2 = Reflection.a(EncryptedKeyStorage.class);
                StringQualifier stringQualifier3 = ScopeRegistry.e;
                OptionDSLKt.c(new KoinDefinition(module2, i71.m(new BeanDefinition(stringQualifier3, classReferenceA2, null, sharedSecurityModuleKt$commonModule$lambda$0$$inlined$singleOf$1, kind2, emptyList2), module2)), e81Var);
                SharedSecurityModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1 sharedSecurityModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1 = new SharedSecurityModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1();
                Kind kind3 = Kind.Factory;
                OptionDSLKt.c(new KoinDefinition(module2, i71.w(new BeanDefinition(stringQualifier3, Reflection.a(GetKeySyncRemoteConfigUseCase.class), null, sharedSecurityModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1, kind3, emptyList2), module2)), null);
                OptionDSLKt.c(new KoinDefinition(module2, i71.w(new BeanDefinition(stringQualifier3, Reflection.a(GetRootCheckRemoteConfigUseCase.class), null, new SharedSecurityModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$2(), kind3, emptyList2), module2)), null);
                OptionDSLKt.c(new KoinDefinition(module2, i71.m(new BeanDefinition(stringQualifier3, Reflection.a(ClientSecretManager.class), null, new SharedSecurityModuleKt$commonModule$lambda$0$$inlined$singleOf$default$1(), kind2, emptyList2), module2)), null);
                OptionDSLKt.c(new KoinDefinition(module2, i71.m(new BeanDefinition(stringQualifier3, Reflection.a(KeySyncManager.class), null, new SharedSecurityModuleKt$commonModule$lambda$0$$inlined$singleOf$default$2(), kind2, emptyList2), module2)), null);
                OptionDSLKt.c(new KoinDefinition(module2, i71.m(new BeanDefinition(stringQualifier3, Reflection.a(EncryptionFeatureImpl.class), null, new SharedSecurityModuleKt$commonModule$lambda$0$$inlined$singleOf$2(), kind2, emptyList2), module2)), new e81(11));
                OptionDSLKt.c(new KoinDefinition(module2, i71.w(new BeanDefinition(stringQualifier3, Reflection.a(FetchEncryptionKeysUseCase.class), null, new SharedSecurityModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$3(), kind3, emptyList2), module2)), null);
                OptionDSLKt.c(new KoinDefinition(module2, i71.w(new BeanDefinition(stringQualifier3, Reflection.a(KeySyncBackgroundWorkerTaskDelegate.class), null, new SharedSecurityModuleKt$commonModule$lambda$0$$inlined$factoryOf$1(), kind3, emptyList2), module2)), new e81(12));
                break;
            case 10:
                BeanDefinition singleOf = (BeanDefinition) obj;
                Intrinsics.i(singleOf, "$this$singleOf");
                singleOf.f = CollectionsKt.d0(Reflection.a(KeyStorageContract.class), singleOf.f);
                break;
            case 11:
                BeanDefinition singleOf2 = (BeanDefinition) obj;
                Intrinsics.i(singleOf2, "$this$singleOf");
                singleOf2.f = CollectionsKt.d0(Reflection.a(EncryptionFeature.class), singleOf2.f);
                break;
            case 12:
                BeanDefinition factoryOf9 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf9, "$this$factoryOf");
                factoryOf9.f = CollectionsKt.d0(Reflection.a(BackgroundWorkerTaskDelegate.class), factoryOf9.f);
                OptionDSLKt.b(factoryOf9, "key_sync_worker_task");
                break;
            case 13:
                Module module3 = (Module) obj;
                Intrinsics.i(module3, "$this$module");
                e81 e81Var2 = new e81(14);
                SharedSecurityModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1 sharedSecurityModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1 = new SharedSecurityModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1();
                Kind kind4 = Kind.Factory;
                EmptyList emptyList3 = EmptyList.f17557a;
                ClassReference classReferenceA3 = Reflection.a(AESCryptoUtilsAndroid.class);
                StringQualifier stringQualifier4 = ScopeRegistry.e;
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, classReferenceA3, null, sharedSecurityModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1, kind4, emptyList3), module3)), e81Var2);
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(RSACryptoUtilsAndroid.class), null, new SharedSecurityModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$2(), kind4, emptyList3), module3)), new e81(i3));
                new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(KeyStoreUtils.class), null, new d81(i6), kind4, emptyList3), module3));
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(KeyEncrypterAndroid.class), null, new SharedSecurityModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$3(), kind4, emptyList3), module3)), new e81(i2));
                new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(VaultEncryptionKeyUtils.class), null, new d81(i5), kind4, emptyList3), module3));
                new KoinDefinition(module3, i71.m(new BeanDefinition(stringQualifier4, Reflection.a(DataStore.class), new StringQualifier("vaultpref.preferences_pb"), new d81(i4), Kind.Singleton, emptyList3), module3));
                break;
            case 14:
                BeanDefinition factoryOf10 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf10, "$this$factoryOf");
                factoryOf10.f = CollectionsKt.d0(Reflection.a(AESCryptoUtils.class), factoryOf10.f);
                break;
            case 15:
                BeanDefinition factoryOf11 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf11, "$this$factoryOf");
                factoryOf11.f = CollectionsKt.d0(Reflection.a(RSACryptoUtils.class), factoryOf11.f);
                break;
            case 16:
                BeanDefinition factoryOf12 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf12, "$this$factoryOf");
                factoryOf12.f = CollectionsKt.d0(Reflection.a(KeyEncrypter.class), factoryOf12.f);
                break;
            case 17:
                Module module4 = (Module) obj;
                Intrinsics.i(module4, "$this$module");
                SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1 sharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1 = new SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1();
                Kind kind5 = Kind.Factory;
                EmptyList emptyList4 = EmptyList.f17557a;
                ClassReference classReferenceA4 = Reflection.a(FetchProductPunchDataForOngoingValidationOnlineUseCase.class);
                StringQualifier stringQualifier5 = ScopeRegistry.e;
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, classReferenceA4, null, sharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1, kind5, emptyList4), module4)), null);
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(FetchTitoTapinInfoForActivationUseCase.class), null, new SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$2(), kind5, emptyList4), module4)), null);
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(GetProductValidationDataFromDataReceivedOverBleConnectionUseCase.class), null, new SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$3(), kind5, emptyList4), module4)), null);
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(GetRegularBusProductValidationMethodsConfigForCurrentCityUseCase.class), null, new SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$4(), kind5, emptyList4), module4)), null);
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(GetRegularBusProductValidationMethodUseCase.class), null, new SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$5(), kind5, emptyList4), module4)), null);
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(GetTimeRemainingToShowQRValidationOptionUseCase.class), null, new SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$6(), kind5, emptyList4), module4)), null);
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(GetTwoWayBleCommPilotConfigUseCase.class), null, new SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$7(), kind5, emptyList4), module4)), null);
                int i10 = 21;
                d81 d81Var2 = new d81(i10);
                Kind kind6 = Kind.Singleton;
                new KoinDefinition(module4, i71.m(new BeanDefinition(stringQualifier5, Reflection.a(ProductValidationsDataStore.class), null, d81Var2, kind6, emptyList4), module4));
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(ProductValidationsRemoteDataSourceImpl.class), null, new SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$1(), kind5, emptyList4), module4)), new e81(i6));
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(ShouldShowBleTutorialUseCase.class), null, new SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$8(), kind5, emptyList4), module4)), null);
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(ShouldShowOptionToSwitchToQrAfterDenyingBlePermUseCase.class), null, new SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$9(), kind5, emptyList4), module4)), null);
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(TrackBleTutorialShownUseCase.class), null, new SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$10(), kind5, emptyList4), module4)), null);
                OptionDSLKt.c(new KoinDefinition(module4, i71.m(new BeanDefinition(stringQualifier5, Reflection.a(ManualBluetoothTurnOnDelegateProviderImpl.class), null, new SharedValidationModuleKt$commonModule$lambda$0$$inlined$singleOf$1(), kind6, emptyList4), module4)), new e81(i5));
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(QRValidationComponent.class), null, new SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$11(), kind5, emptyList4), module4)), null);
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(MultiProductValidationComponent.class), null, new SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$12(), kind5, emptyList4), module4)), null);
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(MultiProductValidationUIStateFactory.class), null, new SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$13(), kind5, emptyList4), module4)), null);
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(QRValidationLifecycleDelegateImpl.class), null, new SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$2(), kind5, emptyList4), module4)), new e81(i4));
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(BleValidationProcessCompletionHelper.class), null, new SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$14(), kind5, emptyList4), module4)), null);
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(BmrclMetroValidationQrGenerator.class), null, new SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$15(), kind5, emptyList4), module4)), null);
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(GenerateQRCodeForValidationHelperImpl.class), null, new SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$3(), kind5, emptyList4), module4)), new e81(i10));
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(ValidationSceneResolverUseCase.class), null, new SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$16(), kind5, emptyList4), module4)), null);
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(CheckIsBleValidationEnabledUseCase.class), null, new SharedValidationModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$17(), kind5, emptyList4), module4)), null);
                OptionDSLKt.c(new KoinDefinition(module4, i71.m(new BeanDefinition(stringQualifier5, Reflection.a(DeviceNfcTapPaySuppressorManager.class), null, new SharedValidationModuleKt$commonModule$lambda$0$$inlined$singleOf$2(), kind6, emptyList4), module4)), new e81(i7));
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(VehicleBasedValidationRemoteDataSourceImpl.class), null, new VehicleBasedValidationModuleKt$vehicleBasedValidationModule$$inlined$factoryOf$1(), kind5, emptyList4), module4)), new do1(7));
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(VehicleBasedValidationRepositoryImpl.class), null, new VehicleBasedValidationModuleKt$vehicleBasedValidationModule$$inlined$factoryOf$2(), kind5, emptyList4), module4)), new do1(8));
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(ValidateONDCTicketAndFetchReceiptUseCase.class), null, new VehicleBasedValidationModuleKt$vehicleBasedValidationModule$$inlined$factoryOf$default$1(), kind5, emptyList4), module4)), null);
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(QRScannerValidationUiStateFactory.class), null, new VehicleBasedValidationModuleKt$vehicleBasedValidationModule$$inlined$factoryOf$default$2(), kind5, emptyList4), module4)), null);
                OptionDSLKt.c(new KoinDefinition(module4, i71.w(new BeanDefinition(stringQualifier5, Reflection.a(QRScannerValidationComponent.class), null, new VehicleBasedValidationModuleKt$vehicleBasedValidationModule$$inlined$factoryOf$default$3(), kind5, emptyList4), module4)), null);
                break;
            case 18:
                BeanDefinition factoryOf13 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf13, "$this$factoryOf");
                factoryOf13.f = CollectionsKt.d0(Reflection.a(ProductValidationsRemoteDataSource.class), factoryOf13.f);
                break;
            case 19:
                BeanDefinition singleOf3 = (BeanDefinition) obj;
                Intrinsics.i(singleOf3, "$this$singleOf");
                singleOf3.f = CollectionsKt.d0(Reflection.a(ManualBluetoothTurnOnDelegateProvider.class), singleOf3.f);
                break;
            case 20:
                BeanDefinition factoryOf14 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf14, "$this$factoryOf");
                factoryOf14.f = CollectionsKt.d0(Reflection.a(QRValidationLifecycleDelegate.class), factoryOf14.f);
                break;
            case 21:
                BeanDefinition factoryOf15 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf15, "$this$factoryOf");
                factoryOf15.f = CollectionsKt.d0(Reflection.a(GenerateQRCodeForValidationHelper.class), factoryOf15.f);
                break;
            case 22:
                BeanDefinition singleOf4 = (BeanDefinition) obj;
                Intrinsics.i(singleOf4, "$this$singleOf");
                OptionDSLKt.a(singleOf4, CollectionsKt.S(Reflection.a(DeviceNfcTapPaySuppressorSetter.class), Reflection.a(DeviceNfcTapPaySuppressorProvider.class)));
                break;
            case 23:
                Module module5 = (Module) obj;
                Intrinsics.i(module5, "$this$module");
                StringQualifier stringQualifier6 = new StringQualifier("product_validation_prefs.preferences_pb");
                d81 d81Var3 = new d81(i7);
                Kind kind7 = Kind.Singleton;
                EmptyList emptyList5 = EmptyList.f17557a;
                ClassReference classReferenceA5 = Reflection.a(DataStore.class);
                StringQualifier stringQualifier7 = ScopeRegistry.e;
                new KoinDefinition(module5, i71.m(new BeanDefinition(stringQualifier7, classReferenceA5, stringQualifier6, d81Var3, kind7, emptyList5), module5));
                SharedValidationModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$1 sharedValidationModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$1 = new SharedValidationModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$1();
                Kind kind8 = Kind.Factory;
                OptionDSLKt.c(new KoinDefinition(module5, i71.w(new BeanDefinition(stringQualifier7, Reflection.a(BleValidationDynamicInfoHelper.class), null, sharedValidationModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$1, kind8, emptyList5), module5)), null);
                OptionDSLKt.c(new KoinDefinition(module5, i71.w(new BeanDefinition(stringQualifier7, Reflection.a(BleValidationPrerequisitesStateHelper.class), null, new SharedValidationModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$2(), kind8, emptyList5), module5)), null);
                OptionDSLKt.c(new KoinDefinition(module5, i71.w(new BeanDefinition(stringQualifier7, Reflection.a(BleValidationWithTwoWayPilotHelper.class), null, new SharedValidationModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$3(), kind8, emptyList5), module5)), null);
                OptionDSLKt.c(new KoinDefinition(module5, i71.w(new BeanDefinition(stringQualifier7, Reflection.a(DefaultValidationQRGeneratorAndroid.class), null, new SharedValidationModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1(), kind8, emptyList5), module5)), new e81(24));
                OptionDSLKt.c(new KoinDefinition(module5, i71.w(new BeanDefinition(stringQualifier7, Reflection.a(GetRegularBusBLEValidationPayloadUseCase.class), null, new SharedValidationModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$4(), kind8, emptyList5), module5)), null);
                OptionDSLKt.c(new KoinDefinition(module5, i71.w(new BeanDefinition(stringQualifier7, Reflection.a(GetTitoTapOutBlePayloadUseCase.class), null, new SharedValidationModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$5(), kind8, emptyList5), module5)), null);
                OptionDSLKt.c(new KoinDefinition(module5, i71.w(new BeanDefinition(stringQualifier7, Reflection.a(TwoWayBleCommPilotLogger.class), null, new SharedValidationModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$6(), kind8, emptyList5), module5)), null);
                new KoinDefinition(module5, i71.w(new BeanDefinition(stringQualifier7, Reflection.a(BleValidationFragmentComponent.class), null, new d81(23), kind8, emptyList5), module5));
                OptionDSLKt.c(new KoinDefinition(module5, i71.w(new BeanDefinition(stringQualifier7, Reflection.a(TwoWayBleCommPilotLogger.class), null, new SharedValidationModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$7(), kind8, emptyList5), module5)), null);
                break;
            case 24:
                BeanDefinition factoryOf16 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf16, "$this$factoryOf");
                factoryOf16.f = CollectionsKt.d0(Reflection.a(ValidationQrGenerator.class), factoryOf16.f);
                break;
            case 25:
                Module module6 = (Module) obj;
                Intrinsics.i(module6, "$this$module");
                e81 e81Var3 = new e81(26);
                Module module7 = new Module();
                e81Var3.invoke(module7);
                Module module8 = new Module();
                OptionDSLKt.c(new KoinDefinition(module8, i71.m(new BeanDefinition(ScopeRegistry.e, Reflection.a(ChaloCoreDatabaseAndroid.class), null, new SharedVaultModule_androidKt$platformModule$lambda$0$$inlined$singleOf$1(), Kind.Singleton, EmptyList.f17557a), module8)), new h81(i8));
                CollectionsKt.k(module6.e, new Module[]{module7, module8});
                break;
            case 26:
                Module module9 = (Module) obj;
                Intrinsics.i(module9, "$this$module");
                e81 e81Var4 = new e81(27);
                SharedVaultModuleKt$commonModule$lambda$0$$inlined$factoryOf$1 sharedVaultModuleKt$commonModule$lambda$0$$inlined$factoryOf$1 = new SharedVaultModuleKt$commonModule$lambda$0$$inlined$factoryOf$1();
                Kind kind9 = Kind.Factory;
                EmptyList emptyList6 = EmptyList.f17557a;
                ClassReference classReferenceA6 = Reflection.a(ConfigDaoImpl.class);
                StringQualifier stringQualifier8 = ScopeRegistry.e;
                OptionDSLKt.c(new KoinDefinition(module9, i71.w(new BeanDefinition(stringQualifier8, classReferenceA6, null, sharedVaultModuleKt$commonModule$lambda$0$$inlined$factoryOf$1, kind9, emptyList6), module9)), e81Var4);
                OptionDSLKt.c(new KoinDefinition(module9, i71.w(new BeanDefinition(stringQualifier8, Reflection.a(KeyDaoImpl.class), null, new SharedVaultModuleKt$commonModule$lambda$0$$inlined$factoryOf$2(), kind9, emptyList6), module9)), new e81(28));
                OptionDSLKt.c(new KoinDefinition(module9, i71.w(new BeanDefinition(stringQualifier8, Reflection.a(QuickPayDaoImpl.class), null, new SharedVaultModuleKt$commonModule$lambda$0$$inlined$factoryOf$3(), kind9, emptyList6), module9)), new e81(29));
                OptionDSLKt.c(new KoinDefinition(module9, i71.w(new BeanDefinition(stringQualifier8, Reflection.a(WalletDaoImpl.class), null, new SharedVaultModuleKt$commonModule$lambda$0$$inlined$factoryOf$4(), kind9, emptyList6), module9)), new h81(i9));
                break;
            case 27:
                BeanDefinition factoryOf17 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf17, "$this$factoryOf");
                factoryOf17.f = CollectionsKt.d0(Reflection.a(ConfigDao.class), factoryOf17.f);
                break;
            case 28:
                BeanDefinition factoryOf18 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf18, "$this$factoryOf");
                factoryOf18.f = CollectionsKt.d0(Reflection.a(KeyDao.class), factoryOf18.f);
                break;
            default:
                BeanDefinition factoryOf19 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf19, "$this$factoryOf");
                factoryOf19.f = CollectionsKt.d0(Reflection.a(QuickPayDao.class), factoryOf19.f);
                break;
        }
        return unit;
    }
}
