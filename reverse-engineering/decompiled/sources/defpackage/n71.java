package defpackage;

import androidx.datastore.core.DataStore;
import app.chalo.AndroidDeviceImpl;
import app.chalo.Device;
import app.chalo.ads.AdsterSdkInitializer;
import app.chalo.ads.AndroidAdsStartup;
import app.chalo.ads.AndroidNativeInlineAdPrefetcher;
import app.chalo.ads.ExitInterstitialAdLoaderFactory;
import app.chalo.ads.ExitInterstitialAdManager;
import app.chalo.ads.ExitInterstitialCapStore;
import app.chalo.ads.ExitInterstitialPreloadEntryPoint;
import app.chalo.ads.NativeInlineAdPrefetchEntryPoint;
import app.chalo.ads.UnifiedAdFailureReporter;
import app.chalo.ads.UnifiedAdLifecycleReporter;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.compose.components.chalomap.PolylineUtilsAndroid;
import app.chalo.compose.components.chalomap.iconprovider.ChaloMapMarkerIconProvider;
import app.chalo.contract.RemoteConfigFetcherContractAndroid;
import app.chalo.di.SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1;
import app.chalo.di.SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$2;
import app.chalo.di.SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$3;
import app.chalo.di.SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$4;
import app.chalo.di.SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$5;
import app.chalo.di.SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$6;
import app.chalo.di.SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$7;
import app.chalo.di.SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$1;
import app.chalo.di.SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$singleOf$1;
import app.chalo.di.SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$singleOf$2;
import app.chalo.di.SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$singleOf$3;
import app.chalo.di.SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$singleOf$4;
import app.chalo.di.SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$singleOf$5;
import app.chalo.di.a;
import app.chalo.features.adjust.AdjustManager;
import app.chalo.features.foreground.ActiveSceneInStackResolver;
import app.chalo.features.freshchat.FreshchatRestoreIdDataMigration;
import app.chalo.features.language.AndroidLanguagePlatformHelper;
import app.chalo.features.language.LanguagePlatformHelper;
import app.chalo.features.network.NetworkStateManager;
import app.chalo.features.nfc.BasicNFCManagerAndroid;
import app.chalo.features.thoughtnudge.ThoughtNudgeNotificationManagerAndroid;
import app.chalo.fileupload.data.remote.UploadFileRemoteDataSource;
import app.chalo.fileupload.data.repository.UploadFileRepository;
import app.chalo.helper.ChaloPackageManagerHelperAndroid;
import app.chalo.helper.CoroutineScopeHelper;
import app.chalo.helper.UrlOpenHelperAndroid;
import app.chalo.juspay.JuspayControllerProvider;
import app.chalo.juspay.JuspayControllerSetter;
import app.chalo.juspay.JuspaySignatureRemoteDataSource;
import app.chalo.juspay.JuspaySignatureRepository;
import app.chalo.location.ChaloLocationDelegateAndroid;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LastKnownLocationStorage;
import app.chalo.login.LoginAuthGuard;
import app.chalo.network.ChaloUrlProvider;
import app.chalo.network.CommonHeaderProvider;
import app.chalo.notification.core.GCMReceiverDelegate;
import app.chalo.notification.core.GCMReceiverDelegateAndroid;
import app.chalo.permissions.gps.GpsRequestHandlerProvider;
import app.chalo.permissions.gps.GpsRequestHandlerSetter;
import app.chalo.plotline.PlotlineContract;
import app.chalo.plotline.PlotlineNotificationManagerAndroid;
import app.chalo.plotline.PlotlineTrackContextProvider;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.iconassetprovider.IconAssetProvider;
import app.chalo.providers.iconassetprovider.IconAssetProviderAndroid;
import app.chalo.providers.lottieassetprovider.LottieAssetProviderAndroid;
import app.chalo.providers.stringprovider.AndroidPlatformStringOverrideProvider;
import app.chalo.providers.stringprovider.PlatformStringOverrideProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.thoughtnudge.ThoughtNudgeNotificationManager;
import app.chalo.utils.AndroidSystemHelper;
import app.chalo.utils.CommonHtmlParser;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.abtestanalytics.ABTestAnalyticsContract;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
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
import org.koin.dsl.DefinitionBindingKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n71 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18459a;

    public /* synthetic */ n71(int i) {
        this.f18459a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f18459a;
        int i2 = 2;
        int i3 = 0;
        int i4 = 1;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                BeanDefinition singleOf = (BeanDefinition) obj;
                Intrinsics.i(singleOf, "$this$singleOf");
                singleOf.f = CollectionsKt.d0(Reflection.a(UnifiedAdFailureReporter.class), singleOf.f);
                break;
            case 1:
                BeanDefinition singleOf2 = (BeanDefinition) obj;
                Intrinsics.i(singleOf2, "$this$singleOf");
                singleOf2.f = CollectionsKt.d0(Reflection.a(NetworkStateManager.class), singleOf2.f);
                break;
            case 2:
                BeanDefinition factoryOf = (BeanDefinition) obj;
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(CoroutineScopeHelper.class), factoryOf.f);
                break;
            case 3:
                BeanDefinition singleOf3 = (BeanDefinition) obj;
                Intrinsics.i(singleOf3, "$this$singleOf");
                singleOf3.f = CollectionsKt.d0(Reflection.a(ChaloLocationManager.class), singleOf3.f);
                break;
            case 4:
                BeanDefinition factoryOf2 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf2, "$this$factoryOf");
                factoryOf2.f = CollectionsKt.d0(Reflection.a(UploadFileRemoteDataSource.class), factoryOf2.f);
                break;
            case 5:
                BeanDefinition singleOf4 = (BeanDefinition) obj;
                Intrinsics.i(singleOf4, "$this$singleOf");
                singleOf4.f = CollectionsKt.d0(Reflection.a(UnifiedAdLifecycleReporter.class), singleOf4.f);
                break;
            case 6:
                BeanDefinition factoryOf3 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf3, "$this$factoryOf");
                factoryOf3.f = CollectionsKt.d0(Reflection.a(UploadFileRepository.class), factoryOf3.f);
                break;
            case 7:
                BeanDefinition factoryOf4 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf4, "$this$factoryOf");
                factoryOf4.f = CollectionsKt.d0(Reflection.a(JuspaySignatureRemoteDataSource.class), factoryOf4.f);
                break;
            case 8:
                BeanDefinition factoryOf5 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf5, "$this$factoryOf");
                factoryOf5.f = CollectionsKt.d0(Reflection.a(ChaloMapMarkerIconProvider.class), factoryOf5.f);
                break;
            case 9:
                BeanDefinition singleOf5 = (BeanDefinition) obj;
                Intrinsics.i(singleOf5, "$this$singleOf");
                OptionDSLKt.a(singleOf5, CollectionsKt.S(Reflection.a(GpsRequestHandlerProvider.class), Reflection.a(GpsRequestHandlerSetter.class)));
                break;
            case 10:
                BeanDefinition singleOf6 = (BeanDefinition) obj;
                Intrinsics.i(singleOf6, "$this$singleOf");
                singleOf6.f = CollectionsKt.d0(Reflection.a(KotlinToastManager.class), singleOf6.f);
                break;
            case 11:
                BeanDefinition factoryOf6 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf6, "$this$factoryOf");
                factoryOf6.f = CollectionsKt.d0(Reflection.a(CommonHtmlParser.class), factoryOf6.f);
                break;
            case 12:
                BeanDefinition factoryOf7 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf7, "$this$factoryOf");
                factoryOf7.f = CollectionsKt.d0(Reflection.a(JuspaySignatureRepository.class), factoryOf7.f);
                break;
            case 13:
                BeanDefinition factoryOf8 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf8, "$this$factoryOf");
                factoryOf8.f = CollectionsKt.d0(Reflection.a(ABTestAnalyticsContract.class), factoryOf8.f);
                break;
            case 14:
                BeanDefinition singleOf7 = (BeanDefinition) obj;
                Intrinsics.i(singleOf7, "$this$singleOf");
                singleOf7.f = CollectionsKt.d0(Reflection.a(AdjustManager.class), singleOf7.f);
                break;
            case 15:
                BeanDefinition singleOf8 = (BeanDefinition) obj;
                Intrinsics.i(singleOf8, "$this$singleOf");
                singleOf8.f = CollectionsKt.d0(Reflection.a(ActiveSceneInStackResolver.class), singleOf8.f);
                break;
            case 16:
                BeanDefinition factoryOf9 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf9, "$this$factoryOf");
                factoryOf9.f = CollectionsKt.d0(Reflection.a(LoginAuthGuard.class), factoryOf9.f);
                break;
            case 17:
                BeanDefinition factoryOf10 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf10, "$this$factoryOf");
                factoryOf10.f = CollectionsKt.d0(Reflection.a(CoroutineContextProvider.class), factoryOf10.f);
                break;
            case 18:
                BeanDefinition singleOf9 = (BeanDefinition) obj;
                Intrinsics.i(singleOf9, "$this$singleOf");
                singleOf9.f = CollectionsKt.d0(Reflection.a(CommonHeaderProvider.class), singleOf9.f);
                break;
            case 19:
                BeanDefinition singleOf10 = (BeanDefinition) obj;
                Intrinsics.i(singleOf10, "$this$singleOf");
                singleOf10.f = CollectionsKt.d0(Reflection.a(ChaloUrlProvider.class), singleOf10.f);
                break;
            case 20:
                BeanDefinition singleOf11 = (BeanDefinition) obj;
                Intrinsics.i(singleOf11, "$this$singleOf");
                OptionDSLKt.a(singleOf11, CollectionsKt.S(Reflection.a(JuspayControllerProvider.class), Reflection.a(JuspayControllerSetter.class)));
                break;
            case 21:
                BeanDefinition singleOf12 = (BeanDefinition) obj;
                Intrinsics.i(singleOf12, "$this$singleOf");
                singleOf12.f = CollectionsKt.d0(Reflection.a(PlotlineContract.class), singleOf12.f);
                break;
            case 22:
                BeanDefinition singleOf13 = (BeanDefinition) obj;
                Intrinsics.i(singleOf13, "$this$singleOf");
                singleOf13.f = CollectionsKt.d0(Reflection.a(PlotlineTrackContextProvider.class), singleOf13.f);
                break;
            case 23:
                BeanDefinition singleOf14 = (BeanDefinition) obj;
                Intrinsics.i(singleOf14, "$this$singleOf");
                singleOf14.f = CollectionsKt.d0(Reflection.a(AnalyticsContract.class), singleOf14.f);
                break;
            case 24:
                BeanDefinition singleOf15 = (BeanDefinition) obj;
                Intrinsics.i(singleOf15, "$this$singleOf");
                singleOf15.f = CollectionsKt.d0(Reflection.a(ChaloNavigationManager.class), singleOf15.f);
                break;
            case 25:
                Module module = (Module) obj;
                Intrinsics.i(module, "$this$module");
                o71 o71Var = new o71(24);
                Kind kind = Kind.Singleton;
                EmptyList emptyList = EmptyList.f17557a;
                ClassReference classReferenceA = Reflection.a(AdsterSdkInitializer.class);
                StringQualifier stringQualifier = ScopeRegistry.e;
                new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, classReferenceA, null, o71Var, kind, emptyList), module));
                new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(AndroidAdsStartup.class), null, new o71(18), kind, emptyList), module));
                new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(ExitInterstitialAdLoaderFactory.class), null, new o71(25), kind, emptyList), module));
                int i5 = 29;
                new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(DataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(ExitInterstitialAdManager.class), null, new o71(i5), kind, emptyList), module), "exitInterstitialAdCapStore"), new r71(i3), kind, emptyList), module));
                new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(ExitInterstitialCapStore.class), null, new r71(i4), kind, emptyList), module));
                new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(ExitInterstitialPreloadEntryPoint.class), null, new r71(i2), kind, emptyList), module));
                int i6 = 3;
                new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(AndroidNativeInlineAdPrefetcher.class), null, new r71(i6), kind, emptyList), module));
                int i7 = 4;
                new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(DataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(DataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(NativeInlineAdPrefetchEntryPoint.class), null, new r71(i7), kind, emptyList), module), "language_store.preferences_pb"), new r71(6), kind, emptyList), module), "last_known_location_cache"), new a(i4), kind, emptyList), module));
                int i8 = 5;
                new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(DataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(DataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(DataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(DataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(DataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(DataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(DataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(DataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(DataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(DataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(DataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(DataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(LastKnownLocationStorage.class), null, new r71(i8), kind, emptyList), module), "keyChaloConfigDataStore.preferences_pb"), new r71(7), kind, emptyList), module), "chaloTimeStore.preferences_pb"), new r71(9), kind, emptyList), module), "user_prefs.preferences_pb"), new r71(10), kind, emptyList), module), "productReclaimDataStoreKey.preferences_pb"), new r71(11), kind, emptyList), module), "reportProblemFeature.preferences_pb"), new r71(12), kind, emptyList), module), "config.preferences_pb"), new r71(13), kind, emptyList), module), "session_store.preferences_pb"), new o71(16), kind, emptyList), module), "product_config_store.preferences_pb"), new o71(17), kind, emptyList), module), "proof_config_store.preferences_pb"), new o71(19), kind, emptyList), module), "proof_document_props_store.preferences_pb"), new o71(20), kind, emptyList), module), "rideFeedbackTrackerDataStore"), new o71(21), kind, emptyList), module), "appUsageTrackingDataStoreKey.preferences_pb"), new o71(22), kind, emptyList), module));
                int i9 = 26;
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(AndroidSystemHelper.class), null, new SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$singleOf$1(), kind, emptyList), module)), new n71(i9));
                int i10 = 27;
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(AndroidDeviceImpl.class), null, new SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$singleOf$2(), kind, emptyList), module)), new n71(i10));
                DefinitionBindingKt.a(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(AndroidPlatformStringOverrideProvider.class), null, new o71(23), kind, emptyList), module)), Reflection.a(PlatformStringOverrideProvider.class));
                int i11 = 28;
                n71 n71Var = new n71(i11);
                SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1 sharedBaseModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1 = new SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1();
                Kind kind2 = Kind.Factory;
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(AndroidLanguagePlatformHelper.class), null, sharedBaseModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1, kind2, emptyList), module)), n71Var);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(IconAssetProviderAndroid.class), null, new SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$2(), kind2, emptyList), module)), new n71(i5));
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ChaloLocationDelegateAndroid.class), null, new SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$3(), kind2, emptyList), module)), new q71(i3));
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(LottieAssetProviderAndroid.class), null, new SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$4(), kind2, emptyList), module)), new q71(i4));
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PolylineUtilsAndroid.class), null, new SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$5(), kind2, emptyList), module)), new q71(i2));
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(BasicNFCManagerAndroid.class), null, new SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$singleOf$3(), kind, emptyList), module)), new q71(i6));
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ChaloPackageManagerHelperAndroid.class), null, new SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$6(), kind2, emptyList), module)), new q71(i7));
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(UrlOpenHelperAndroid.class), null, new SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$7(), kind2, emptyList), module)), new q71(i8));
                DefinitionBindingKt.a(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(GCMReceiverDelegateAndroid.class), null, new o71(i9), kind, emptyList), module)), Reflection.a(GCMReceiverDelegate.class));
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FreshchatRestoreIdDataMigration.class), null, new SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$default$1(), kind2, emptyList), module)), null);
                new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(FirebaseRemoteConfig.class), null, new o71(i10), kind, emptyList), module));
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(RemoteConfigFetcherContractAndroid.class), null, new SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$singleOf$4(), kind, emptyList), module)), new q71(6));
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(PlotlineNotificationManagerAndroid.class), null, new SharedBaseModule_androidKt$platformModule$lambda$0$$inlined$singleOf$5(), kind, emptyList), module)), new q71(7));
                DefinitionBindingKt.a(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(ThoughtNudgeNotificationManagerAndroid.class), null, new o71(i11), kind, emptyList), module)), Reflection.a(ThoughtNudgeNotificationManager.class));
                break;
            case 26:
                BeanDefinition singleOf16 = (BeanDefinition) obj;
                Intrinsics.i(singleOf16, "$this$singleOf");
                singleOf16.f = CollectionsKt.d0(Reflection.a(SystemHelper.class), singleOf16.f);
                break;
            case 27:
                BeanDefinition singleOf17 = (BeanDefinition) obj;
                Intrinsics.i(singleOf17, "$this$singleOf");
                singleOf17.f = CollectionsKt.d0(Reflection.a(Device.class), singleOf17.f);
                break;
            case 28:
                BeanDefinition factoryOf11 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf11, "$this$factoryOf");
                factoryOf11.f = CollectionsKt.d0(Reflection.a(LanguagePlatformHelper.class), factoryOf11.f);
                break;
            default:
                BeanDefinition factoryOf12 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf12, "$this$factoryOf");
                factoryOf12.f = CollectionsKt.d0(Reflection.a(IconAssetProvider.class), factoryOf12.f);
                break;
        }
        return unit;
    }
}
