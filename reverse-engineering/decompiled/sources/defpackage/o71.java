package defpackage;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import app.chalo.R;
import app.chalo.ads.AdTargetingProvider;
import app.chalo.ads.AdsterSdkInitializer;
import app.chalo.ads.AndroidAdsStartup;
import app.chalo.ads.DefaultExitInterstitialAdLoaderFactory;
import app.chalo.ads.DefaultUnifiedAdDebugFixtureCatalog;
import app.chalo.ads.DefaultUnifiedAdDebugFixtureResolver;
import app.chalo.ads.ExitInterstitialAdLoaderFactory;
import app.chalo.ads.ExitInterstitialAdManager;
import app.chalo.ads.UnifiedAdDebugFixtureCatalog;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.LocationPermissionPolicyOverride;
import app.chalo.behaviour.policy.PolicyConfigFetcher;
import app.chalo.behaviour.policy.PolicyResolutionContextProvider;
import app.chalo.behaviour.policy.PolicyResolverCache;
import app.chalo.behaviour.policy.ResolveCitySelectionPolicyUseCase;
import app.chalo.behaviour.policy.ResolveLocationPermissionPolicyUseCase;
import app.chalo.behaviour.policy.ResolveProductPurchasePolicyUseCase;
import app.chalo.behaviour.policy.ResolveProfilePolicyUseCase;
import app.chalo.behaviour.policy.ResolveSplashPolicyUseCase;
import app.chalo.behaviour.policy.ResolveSupportPolicyUseCase;
import app.chalo.behaviour.policy.ResolveWalletPolicyUseCase;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.behaviour.policy.TripPlannerPolicyManager;
import app.chalo.behaviour.policy.TripPlannerPolicyOverride;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.contract.AppUsageTrackingContractImpl;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.datastore.LocalDataStore;
import app.chalo.domain.FireAppOpenEventIfRequiredUseCase;
import app.chalo.domain.IsLocationMandatoryForUserUseCase;
import app.chalo.features.boostratings.IBoostRatingsFeature;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.features.freshchat.FreshChatInitManager;
import app.chalo.features.freshchat.FreshChatInitializerImpl;
import app.chalo.features.thoughtnudge.ThoughtNudgeNotificationManagerAndroid;
import app.chalo.helper.ChaloAppFeatureHelperImpl;
import app.chalo.notification.core.AppNotificationResolverUseCase;
import app.chalo.notification.core.GCMReceiverDelegate;
import app.chalo.notification.core.GCMReceiverDelegateAndroid;
import app.chalo.notification.core.GCMReceiverImpl;
import app.chalo.plotline.PlotlineNotificationManager;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.AndroidPlatformStringOverrideProvider;
import app.chalo.ridefeedbacktracker.RideFeedbackTrackerImpl;
import app.chalo.thoughtnudge.ThoughtNudgeNotificationManager;
import app.chalo.usecase.IsNotificationPermissionGrantedUseCase;
import app.chalo.userprofiling.ruleengine.UserProfilingHooksRuleEngine;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.abtestanalytics.ABTestAnalyticsContract;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o71 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18575a;

    public /* synthetic */ o71(int i) {
        this.f18575a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Scope single = (Scope) obj;
        ParametersHolder it = (ParametersHolder) obj2;
        switch (this.f18575a) {
            case 0:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new ResolveLocationPermissionPolicyUseCase((PolicyResolutionContextProvider) single.d(Reflection.a(PolicyResolutionContextProvider.class), null, null), (PolicyConfigFetcher) single.d(Reflection.a(PolicyConfigFetcher.class), null, null), (LocationPermissionPolicyOverride) single.d(Reflection.a(LocationPermissionPolicyOverride.class), null, null), (PolicyResolverCache) single.d(Reflection.a(PolicyResolverCache.class), null, null));
            case 1:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new DefaultUnifiedAdDebugFixtureCatalog();
            case 2:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new TripPlannerPolicyManager((TripPlannerPolicyOverride) single.d(Reflection.a(TripPlannerPolicyOverride.class), null, null));
            case 3:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new ChaloAppFeatureHelperImpl((ResolveSplashPolicyUseCase) single.d(Reflection.a(ResolveSplashPolicyUseCase.class), null, null), (ResolveCitySelectionPolicyUseCase) single.d(Reflection.a(ResolveCitySelectionPolicyUseCase.class), null, null), (ResolveSupportPolicyUseCase) single.d(Reflection.a(ResolveSupportPolicyUseCase.class), null, null), (ResolveWalletPolicyUseCase) single.d(Reflection.a(ResolveWalletPolicyUseCase.class), null, null), (ResolveProductPurchasePolicyUseCase) single.d(Reflection.a(ResolveProductPurchasePolicyUseCase.class), null, null), (ResolveProfilePolicyUseCase) single.d(Reflection.a(ResolveProfilePolicyUseCase.class), null, null), (ResolveLocationPermissionPolicyUseCase) single.d(Reflection.a(ResolveLocationPermissionPolicyUseCase.class), null, null), (TripPlannerPolicyManager) single.d(Reflection.a(TripPlannerPolicyManager.class), null, null));
            case 4:
                Intrinsics.i(single, "$this$factory");
                Intrinsics.i(it, "it");
                return new IsLocationMandatoryForUserUseCase((CityProvider) single.d(Reflection.a(CityProvider.class), null, null), new LocalDataStore((DataStore) single.d(Reflection.a(DataStore.class), null, new StringQualifier("config.preferences_pb"))), (BasicInfoContract) single.d(Reflection.a(BasicInfoContract.class), null, null), (ChaloBuildConfig) single.d(Reflection.a(ChaloBuildConfig.class), null, null), (ChaloConfigFeature) single.d(Reflection.a(ChaloConfigFeature.class), null, null), (CrashlyticsLogger) single.d(Reflection.a(CrashlyticsLogger.class), null, null), (ABTestAnalyticsContract) single.d(Reflection.a(ABTestAnalyticsContract.class), null, null));
            case 5:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new LocalDataStore((DataStore) single.d(Reflection.a(DataStore.class), null, new StringQualifier("product_config_store.preferences_pb")));
            case 6:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new LocalDataStore((DataStore) single.d(Reflection.a(DataStore.class), null, new StringQualifier("proof_document_props_store.preferences_pb")));
            case 7:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new LocalDataStore((DataStore) single.d(Reflection.a(DataStore.class), null, new StringQualifier("proof_config_store.preferences_pb")));
            case 8:
                Intrinsics.i(single, "$this$factory");
                Intrinsics.i(it, "it");
                return new RideFeedbackTrackerImpl(new LocalDataStore((DataStore) single.d(Reflection.a(DataStore.class), null, new StringQualifier("rideFeedbackTrackerDataStore"))), (CrashlyticsLogger) single.d(Reflection.a(CrashlyticsLogger.class), null, null));
            case 9:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new DefaultUnifiedAdDebugFixtureResolver((SdkIntegrationPolicyManager) single.d(Reflection.a(SdkIntegrationPolicyManager.class), null, null), (ChaloBuildConfig) single.d(Reflection.a(ChaloBuildConfig.class), null, null), (UnifiedAdDebugFixtureCatalog) single.d(Reflection.a(UnifiedAdDebugFixtureCatalog.class), null, null));
            case 10:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new AppUsageTrackingContractImpl(new LocalDataStore((DataStore) single.d(Reflection.a(DataStore.class), null, new StringQualifier("appUsageTrackingDataStoreKey.preferences_pb"))), (BasicInfoContract) single.d(Reflection.a(BasicInfoContract.class), null, null));
            case 11:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new FireAppOpenEventIfRequiredUseCase((AnalyticsContract) single.d(Reflection.a(AnalyticsContract.class), null, null), new LocalDataStore((DataStore) single.d(Reflection.a(DataStore.class), null, new StringQualifier("config.preferences_pb"))), (IBoostRatingsFeature) single.d(Reflection.a(IBoostRatingsFeature.class), null, null), (ChaloTimeProvider) single.d(Reflection.a(ChaloTimeProvider.class), null, null), (SystemHelper) single.d(Reflection.a(SystemHelper.class), null, null), (BasicInfoContract) single.d(Reflection.a(BasicInfoContract.class), null, null), (CoroutineContextProvider) single.d(Reflection.a(CoroutineContextProvider.class), null, null), (UserProfilingHooksRuleEngine) single.d(Reflection.a(UserProfilingHooksRuleEngine.class), null, null));
            case 12:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new FreshChatInitializerImpl(LazyKt.b(new m4(single, 3)), LazyKt.b(new m4(single, 4)), (CoroutineContextProvider) single.d(Reflection.a(CoroutineContextProvider.class), null, null));
            case 13:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new GCMReceiverImpl((GCMReceiverDelegate) single.d(Reflection.a(GCMReceiverDelegate.class), null, null), (AnalyticsContract) single.d(Reflection.a(AnalyticsContract.class), null, null), (AppNotificationResolverUseCase) single.d(Reflection.a(AppNotificationResolverUseCase.class), null, null), LazyKt.b(new m4(single, 5)), LazyKt.b(new m4(single, 6)), (CoroutineContextProvider) single.d(Reflection.a(CoroutineContextProvider.class), null, null), (FreshChatInitManager) single.d(Reflection.a(FreshChatInitManager.class), null, null), (PlotlineNotificationManager) single.d(Reflection.a(PlotlineNotificationManager.class), null, null), (ThoughtNudgeNotificationManager) single.d(Reflection.a(ThoughtNudgeNotificationManager.class), null, null));
            case 14:
                Intrinsics.i(single, "$this$factory");
                Intrinsics.i(it, "it");
                return new xm0(single, 16);
            case 15:
                Intrinsics.i(single, "$this$factory");
                Intrinsics.i(it, "it");
                return new p71(single, 0);
            case 16:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, CollectionsKt.R(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(ModuleExtKt.a(single), "session_store", null, 4, null)), null, new m4(single, 12), 5, null);
            case 17:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, CollectionsKt.R(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(ModuleExtKt.a(single), "product_config_store", null, 4, null)), null, new m4(single, 18), 5, null);
            case 18:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new AndroidAdsStartup((SdkIntegrationPolicyManager) single.d(Reflection.a(SdkIntegrationPolicyManager.class), null, null), ModuleExtKt.a(single), (ChaloBuildConfig) single.d(Reflection.a(ChaloBuildConfig.class), null, null), LazyKt.b(new m4(single, 22)));
            case 19:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, CollectionsKt.R(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(ModuleExtKt.a(single), "proof_config_store", null, 4, null)), null, new m4(single, 10), 5, null);
            case 20:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, CollectionsKt.R(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(ModuleExtKt.a(single), "proof_document_props_store", null, 4, null)), null, new m4(single, 8), 5, null);
            case 21:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, null, null, new m4(single, 17), 7, null);
            case 22:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, null, null, new m4(single, 21), 7, null);
            case 23:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new AndroidPlatformStringOverrideProvider(ModuleExtKt.a(single));
            case 24:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new AdsterSdkInitializer(ModuleExtKt.a(single), (SdkIntegrationPolicyManager) single.d(Reflection.a(SdkIntegrationPolicyManager.class), null, null));
            case 25:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new DefaultExitInterstitialAdLoaderFactory();
            case 26:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new GCMReceiverDelegateAndroid(ModuleExtKt.a(single), (IsNotificationPermissionGrantedUseCase) single.d(Reflection.a(IsNotificationPermissionGrantedUseCase.class), null, null), (CrashlyticsLogger) single.d(Reflection.a(CrashlyticsLogger.class), null, null), LazyKt.b(new m4(single, 9)));
            case 27:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
                Intrinsics.h(firebaseRemoteConfig, "getInstance(...)");
                FirebaseRemoteConfigSettings firebaseRemoteConfigSettingsBuild = new FirebaseRemoteConfigSettings.Builder().build();
                Intrinsics.h(firebaseRemoteConfigSettingsBuild, "build(...)");
                firebaseRemoteConfig.setDefaultsAsync(R.xml.remote_config_defaults);
                firebaseRemoteConfig.setConfigSettingsAsync(firebaseRemoteConfigSettingsBuild);
                return firebaseRemoteConfig;
            case 28:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new ThoughtNudgeNotificationManagerAndroid(ModuleExtKt.a(single), (AnalyticsContract) single.d(Reflection.a(AnalyticsContract.class), null, null), (SdkIntegrationPolicyManager) single.d(Reflection.a(SdkIntegrationPolicyManager.class), null, null));
            default:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new ExitInterstitialAdManager(ModuleExtKt.a(single), (CoroutineContextProvider) single.d(Reflection.a(CoroutineContextProvider.class), null, null), (AdsterSdkInitializer) single.d(Reflection.a(AdsterSdkInitializer.class), null, null), (AdTargetingProvider) single.d(Reflection.a(AdTargetingProvider.class), null, null), (AnalyticsContract) single.d(Reflection.a(AnalyticsContract.class), null, null), (ExitInterstitialAdLoaderFactory) single.d(Reflection.a(ExitInterstitialAdLoaderFactory.class), null, null));
        }
    }
}
