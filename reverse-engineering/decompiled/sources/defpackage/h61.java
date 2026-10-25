package defpackage;

import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.material3.SearchBarState;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import app.chalo.analytics.AnalyticsManager;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.analytics.eventcredits.MixpanelEventsCreditsResolver;
import app.chalo.analytics.sender.AndroidMixpanelAnalyticsSender;
import app.chalo.analytics.senders.AnalyticsSendersProvider;
import app.chalo.analytics.utils.AnalyticsSystemHelper;
import app.chalo.analytics.utils.MixpanelSenderConfig;
import app.chalo.behaviour.policy.BrandId;
import app.chalo.behaviour.policy.CitySelectionPolicyOverride;
import app.chalo.behaviour.policy.JuspayPolicyOverride;
import app.chalo.behaviour.policy.LanguagePolicyOverride;
import app.chalo.behaviour.policy.PolicyConfigFetcher;
import app.chalo.behaviour.policy.PolicyResolutionContextProvider;
import app.chalo.behaviour.policy.PolicyResolverCache;
import app.chalo.behaviour.policy.ProductPurchasePolicyOverride;
import app.chalo.behaviour.policy.ProfilePolicyOverride;
import app.chalo.behaviour.policy.ResolveCitySelectionPolicyUseCase;
import app.chalo.behaviour.policy.ResolveJuspayPolicyUseCase;
import app.chalo.behaviour.policy.ResolveLanguagePolicyUseCase;
import app.chalo.behaviour.policy.ResolveProductPurchasePolicyUseCase;
import app.chalo.behaviour.policy.ResolveProfilePolicyUseCase;
import app.chalo.behaviour.policy.ResolveResourceUrlPolicyUseCase;
import app.chalo.behaviour.policy.ResolveSplashPolicyUseCase;
import app.chalo.behaviour.policy.ResolveSupportPolicyUseCase;
import app.chalo.behaviour.policy.ResolveWalletPolicyUseCase;
import app.chalo.behaviour.policy.ResourceUrlPolicyOverride;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.behaviour.policy.SdkIntegrationPolicyOverride;
import app.chalo.behaviour.policy.SplashPolicyOverride;
import app.chalo.behaviour.policy.SupportPolicyOverride;
import app.chalo.behaviour.policy.WalletPolicyOverride;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.ProductBookingHelper;
import app.chalo.contract.ProductInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.datastore.LocalDataStore;
import app.chalo.deeplink.DeepLinkAppOpenTracker;
import app.chalo.deeplink.DeepLinkConsentManager;
import app.chalo.deeplink.DeepLinkGuard;
import app.chalo.deeplink.DeepLinkNavigationHandler;
import app.chalo.deeplink.DeepLinkNavigationMapper;
import app.chalo.deeplink.DeepLinkPendingStore;
import app.chalo.deeplink.DeepLinkResumeManager;
import app.chalo.deeplink.DeepLinkRuntime;
import app.chalo.domain.GetInstantTicketFeatureConfigUseCase;
import app.chalo.domain.IsNewCardExperienceEnabledUseCase;
import app.chalo.features.boostratings.BoostRatingsFeatureImpl;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.features.chaloconfig.data.ChaloConfigRepository;
import app.chalo.features.chaloconfig.data.local.ChaloConfigLocalDataSourceImpl;
import app.chalo.features.chaloconfig.domain.ChaloConfigDataSnapshotTracker;
import app.chalo.features.chalotime.data.local.ChaloTimeLocalDataSourceImpl;
import app.chalo.features.foreground.ApplicationForegroundManager;
import app.chalo.features.freshchat.FreshchatSupportLauncher;
import app.chalo.features.language.LanguagePlatformHelper;
import app.chalo.features.language.impl.LanguageFeatureImpl;
import app.chalo.features.onetimeoffer.UserPreferencesDataStore;
import app.chalo.features.productsync.localDataStore.ReclaimDataStoreWrapperImpl;
import app.chalo.features.reportproblem.ReportProblemFeature;
import app.chalo.features.reportproblem.ReportProblemResponseConverter;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.helper.MandatoryFirstHistoryCallGuard;
import app.chalo.helper.UrlOpenHelper;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.usecase.CheckIsUserLoggedInUseCase;
import app.chalo.usecase.ClearProductStoresUseCase;
import app.chalo.usecase.GetPremiumBusCurrentCityConfigUseCase;
import app.chalo.utils.SystemHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersCacheKt;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.SerializerCache;
import kotlinx.serialization.modules.SerializersModuleKt;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h61 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15796a;

    public /* synthetic */ h61(int i) {
        this.f15796a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15796a) {
            case 0:
                return SearchBarState.Companion.Saver$lambda$0((SaverScope) obj, (SearchBarState) obj2);
            case 1:
                return SelectionRegistrarImpl.Saver$lambda$0((SaverScope) obj, (SelectionRegistrarImpl) obj2);
            case 2:
                KClass clazz = (KClass) obj;
                List types = (List) obj2;
                SerializerCache serializerCache = SerializersCacheKt.f18094a;
                Intrinsics.i(clazz, "clazz");
                Intrinsics.i(types, "types");
                ArrayList arrayListE = SerializersKt.e(SerializersModuleKt.f18244a, types, true);
                Intrinsics.f(arrayListE);
                return SerializersKt.a(clazz, arrayListE, new af(types, 15));
            case 3:
                KClass clazz2 = (KClass) obj;
                List types2 = (List) obj2;
                SerializerCache serializerCache2 = SerializersCacheKt.f18094a;
                Intrinsics.i(clazz2, "clazz");
                Intrinsics.i(types2, "types");
                ArrayList arrayListE2 = SerializersKt.e(SerializersModuleKt.f18244a, types2, true);
                Intrinsics.f(arrayListE2);
                KSerializer kSerializerA = SerializersKt.a(clazz2, arrayListE2, new af(types2, 16));
                if (kSerializerA != null) {
                    return BuiltinSerializersKt.c(kSerializerA);
                }
                return null;
            case 4:
                Scope single = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new AnalyticsManager(((AnalyticsSendersProvider) single.d(Reflection.a(AnalyticsSendersProvider.class), null, null)).a(), (DataStore) single.d(Reflection.a(DataStore.class), null, new StringQualifier("analytics.preferences_pb")), (AnalyticsSystemHelper) single.d(Reflection.a(AnalyticsSystemHelper.class), null, null));
            case 5:
                Scope single2 = (Scope) obj;
                ParametersHolder it2 = (ParametersHolder) obj2;
                Intrinsics.i(single2, "$this$single");
                Intrinsics.i(it2, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, CollectionsKt.R(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(ModuleExtKt.a(single2), "analytics", null, 4, null)), null, new m4(single2, 2), 5, null);
            case 6:
                Scope single3 = (Scope) obj;
                ParametersHolder it3 = (ParametersHolder) obj2;
                Intrinsics.i(single3, "$this$single");
                Intrinsics.i(it3, "it");
                return new AndroidMixpanelAnalyticsSender(ModuleExtKt.a(single3), (MixpanelSenderConfig) single3.d(Reflection.a(MixpanelSenderConfig.class), null, null), (MixpanelEventsCreditsResolver) single3.d(Reflection.a(MixpanelEventsCreditsResolver.class), null, null));
            case 7:
                Scope single4 = (Scope) obj;
                ParametersHolder it4 = (ParametersHolder) obj2;
                Intrinsics.i(single4, "$this$single");
                Intrinsics.i(it4, "it");
                return new DeepLinkGuard((CheckIsUserLoggedInUseCase) single4.d(Reflection.a(CheckIsUserLoggedInUseCase.class), null, null), (CityProvider) single4.d(Reflection.a(CityProvider.class), null, null), (DeepLinkConsentManager) single4.d(Reflection.a(DeepLinkConsentManager.class), null, null), (DeepLinkAppOpenTracker) single4.d(Reflection.a(DeepLinkAppOpenTracker.class), null, null), (DeepLinkPendingStore) single4.d(Reflection.a(DeepLinkPendingStore.class), null, null), (ProductInfoContract) single4.d(Reflection.a(ProductInfoContract.class), null, null), (BasicInfoContract) single4.d(Reflection.a(BasicInfoContract.class), null, null), (GetInstantTicketFeatureConfigUseCase) single4.d(Reflection.a(GetInstantTicketFeatureConfigUseCase.class), null, null), (GetPremiumBusCurrentCityConfigUseCase) single4.d(Reflection.a(GetPremiumBusCurrentCityConfigUseCase.class), null, null), (IsNewCardExperienceEnabledUseCase) single4.d(Reflection.a(IsNewCardExperienceEnabledUseCase.class), null, null), (ProductBookingHelper) single4.d(Reflection.a(ProductBookingHelper.class), null, null), (MandatoryFirstHistoryCallGuard) single4.d(Reflection.a(MandatoryFirstHistoryCallGuard.class), null, null));
            case 8:
                Scope single5 = (Scope) obj;
                ParametersHolder it5 = (ParametersHolder) obj2;
                Intrinsics.i(single5, "$this$single");
                Intrinsics.i(it5, "it");
                return new DeepLinkNavigationHandler((DeepLinkRuntime) single5.d(Reflection.a(DeepLinkRuntime.class), null, null), (DeepLinkNavigationMapper) single5.d(Reflection.a(DeepLinkNavigationMapper.class), null, null), (ChaloNavigationManager) single5.d(Reflection.a(ChaloNavigationManager.class), null, null), (DeepLinkGuard) single5.d(Reflection.a(DeepLinkGuard.class), null, null), (DeepLinkResumeManager) single5.d(Reflection.a(DeepLinkResumeManager.class), null, null), (UserProfileDetailsProvider) single5.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (DeepLinkConsentManager) single5.d(Reflection.a(DeepLinkConsentManager.class), null, null), (FreshchatSupportLauncher) single5.d(Reflection.a(FreshchatSupportLauncher.class), null, null), (ChaloAppFeatureHelper) single5.d(Reflection.a(ChaloAppFeatureHelper.class), null, null), (UrlOpenHelper) single5.d(Reflection.a(UrlOpenHelper.class), null, null), (AnalyticsContract) single5.d(Reflection.a(AnalyticsContract.class), null, null), (CoroutineContextProvider) single5.d(Reflection.a(CoroutineContextProvider.class), null, null), EmptyList.f17557a);
            case 9:
                Scope single6 = (Scope) obj;
                ParametersHolder it6 = (ParametersHolder) obj2;
                Intrinsics.i(single6, "$this$single");
                Intrinsics.i(it6, "it");
                return new LanguageFeatureImpl((DataStore) single6.d(Reflection.a(DataStore.class), null, new StringQualifier("language_store.preferences_pb")), (LanguagePlatformHelper) single6.d(Reflection.a(LanguagePlatformHelper.class), null, null), (StringProvider) single6.d(Reflection.a(StringProvider.class), null, null), (CoroutineContextProvider) single6.d(Reflection.a(CoroutineContextProvider.class), null, null), (ResolveLanguagePolicyUseCase) single6.d(Reflection.a(ResolveLanguagePolicyUseCase.class), null, null));
            case 10:
                Scope factory = (Scope) obj;
                ParametersHolder it7 = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it7, "it");
                return new ChaloConfigLocalDataSourceImpl(new LocalDataStore((DataStore) factory.d(Reflection.a(DataStore.class), null, new StringQualifier("keyChaloConfigDataStore.preferences_pb"))));
            case 11:
                Scope factory2 = (Scope) obj;
                ParametersHolder it8 = (ParametersHolder) obj2;
                Intrinsics.i(factory2, "$this$factory");
                Intrinsics.i(it8, "it");
                return new ChaloTimeLocalDataSourceImpl((DataStore) factory2.d(Reflection.a(DataStore.class), null, new StringQualifier("chaloTimeStore.preferences_pb")));
            case 12:
                Scope single7 = (Scope) obj;
                ParametersHolder it9 = (ParametersHolder) obj2;
                Intrinsics.i(single7, "$this$single");
                Intrinsics.i(it9, "it");
                return new ClearProductStoresUseCase((LocalDataStore) single7.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("product_config_store.preferences_pb")), (LocalDataStore) single7.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("proof_config_store.preferences_pb")), (LocalDataStore) single7.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("proof_document_props_store.preferences_pb")));
            case 13:
                Scope factory3 = (Scope) obj;
                ParametersHolder it10 = (ParametersHolder) obj2;
                Intrinsics.i(factory3, "$this$factory");
                Intrinsics.i(it10, "it");
                return new UserPreferencesDataStore((DataStore) factory3.d(Reflection.a(DataStore.class), null, new StringQualifier("user_prefs.preferences_pb")), (UserProfileDetailsProvider) factory3.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (CityProvider) factory3.d(Reflection.a(CityProvider.class), null, null));
            case 14:
                Scope single8 = (Scope) obj;
                ParametersHolder it11 = (ParametersHolder) obj2;
                Intrinsics.i(single8, "$this$single");
                Intrinsics.i(it11, "it");
                return new ReclaimDataStoreWrapperImpl(new LocalDataStore((DataStore) single8.d(Reflection.a(DataStore.class), null, new StringQualifier("productReclaimDataStoreKey.preferences_pb"))));
            case 15:
                Scope scope = (Scope) obj;
                return new ReportProblemFeature((ReportProblemResponseConverter) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", ReportProblemResponseConverter.class), null, null), new LocalDataStore((DataStore) scope.d(Reflection.a(DataStore.class), null, new StringQualifier("reportProblemFeature.preferences_pb"))), new LocalDataStore((DataStore) scope.d(Reflection.a(DataStore.class), null, new StringQualifier("config.preferences_pb"))), (ApplicationForegroundManager) scope.d(Reflection.a(ApplicationForegroundManager.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null), (CityProvider) scope.d(Reflection.a(CityProvider.class), null, null), (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (ChaloConfigFeature) scope.d(Reflection.a(ChaloConfigFeature.class), null, null), (ChaloBuildConfig) scope.d(Reflection.a(ChaloBuildConfig.class), null, null), (CrashlyticsLogger) scope.d(Reflection.a(CrashlyticsLogger.class), null, null), (ChaloAppFeatureHelper) scope.d(Reflection.a(ChaloAppFeatureHelper.class), null, null), (UrlOpenHelper) scope.d(Reflection.a(UrlOpenHelper.class), null, null), (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null));
            case 16:
                Scope single9 = (Scope) obj;
                ParametersHolder it12 = (ParametersHolder) obj2;
                Intrinsics.i(single9, "$this$single");
                Intrinsics.i(it12, "it");
                return new BoostRatingsFeatureImpl(new LocalDataStore((DataStore) single9.d(Reflection.a(DataStore.class), null, new StringQualifier("session_store.preferences_pb"))), new LocalDataStore((DataStore) single9.d(Reflection.a(DataStore.class), null, new StringQualifier("config.preferences_pb"))), (ChaloConfigFeature) single9.d(Reflection.a(ChaloConfigFeature.class), null, null), (CrashlyticsLogger) single9.d(Reflection.a(CrashlyticsLogger.class), null, null), (SystemHelper) single9.d(Reflection.a(SystemHelper.class), null, null), (UserProfileDetailsProvider) single9.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (ProductInfoContract) single9.d(Reflection.a(ProductInfoContract.class), null, null), (CityProvider) single9.d(Reflection.a(CityProvider.class), null, null));
            case 17:
                Scope single10 = (Scope) obj;
                ParametersHolder it13 = (ParametersHolder) obj2;
                Intrinsics.i(single10, "$this$single");
                Intrinsics.i(it13, "it");
                return new PolicyResolutionContextProvider(((BrandId) single10.d(Reflection.a(BrandId.class), null, null)).f998a, (ChaloBuildConfig) single10.d(Reflection.a(ChaloBuildConfig.class), null, null), (CityProvider) single10.d(Reflection.a(CityProvider.class), null, null));
            case 18:
                Scope single11 = (Scope) obj;
                ParametersHolder it14 = (ParametersHolder) obj2;
                Intrinsics.i(single11, "$this$single");
                Intrinsics.i(it14, "it");
                return new PolicyConfigFetcher((ChaloConfigRepository) single11.d(Reflection.a(ChaloConfigRepository.class), null, null), (BasicInfoContract) single11.d(Reflection.a(BasicInfoContract.class), null, null), (ChaloBuildConfig) single11.d(Reflection.a(ChaloBuildConfig.class), null, null), (CrashlyticsLogger) single11.d(Reflection.a(CrashlyticsLogger.class), null, null));
            case 19:
                Scope factory4 = (Scope) obj;
                ParametersHolder it15 = (ParametersHolder) obj2;
                Intrinsics.i(factory4, "$this$factory");
                Intrinsics.i(it15, "it");
                return new PolicyResolverCache((ChaloConfigDataSnapshotTracker) factory4.d(Reflection.a(ChaloConfigDataSnapshotTracker.class), null, null));
            case 20:
                Scope single12 = (Scope) obj;
                ParametersHolder it16 = (ParametersHolder) obj2;
                Intrinsics.i(single12, "$this$single");
                Intrinsics.i(it16, "it");
                return new ResolveSplashPolicyUseCase((PolicyResolutionContextProvider) single12.d(Reflection.a(PolicyResolutionContextProvider.class), null, null), (PolicyConfigFetcher) single12.d(Reflection.a(PolicyConfigFetcher.class), null, null), (SplashPolicyOverride) single12.d(Reflection.a(SplashPolicyOverride.class), null, null), (PolicyResolverCache) single12.d(Reflection.a(PolicyResolverCache.class), null, null));
            case 21:
                Scope single13 = (Scope) obj;
                ParametersHolder it17 = (ParametersHolder) obj2;
                Intrinsics.i(single13, "$this$single");
                Intrinsics.i(it17, "it");
                return new ResolveCitySelectionPolicyUseCase((PolicyConfigFetcher) single13.d(Reflection.a(PolicyConfigFetcher.class), null, null), (PolicyResolutionContextProvider) single13.d(Reflection.a(PolicyResolutionContextProvider.class), null, null), (CitySelectionPolicyOverride) single13.d(Reflection.a(CitySelectionPolicyOverride.class), null, null), (PolicyResolverCache) single13.d(Reflection.a(PolicyResolverCache.class), null, null));
            case 22:
                Scope single14 = (Scope) obj;
                ParametersHolder it18 = (ParametersHolder) obj2;
                Intrinsics.i(single14, "$this$single");
                Intrinsics.i(it18, "it");
                return new ResolveSupportPolicyUseCase((PolicyResolutionContextProvider) single14.d(Reflection.a(PolicyResolutionContextProvider.class), null, null), (PolicyConfigFetcher) single14.d(Reflection.a(PolicyConfigFetcher.class), null, null), (SupportPolicyOverride) single14.d(Reflection.a(SupportPolicyOverride.class), null, null), (PolicyResolverCache) single14.d(Reflection.a(PolicyResolverCache.class), null, null));
            case 23:
                Scope single15 = (Scope) obj;
                ParametersHolder it19 = (ParametersHolder) obj2;
                Intrinsics.i(single15, "$this$single");
                Intrinsics.i(it19, "it");
                return new ResolveWalletPolicyUseCase((PolicyResolutionContextProvider) single15.d(Reflection.a(PolicyResolutionContextProvider.class), null, null), (PolicyConfigFetcher) single15.d(Reflection.a(PolicyConfigFetcher.class), null, null), (WalletPolicyOverride) single15.d(Reflection.a(WalletPolicyOverride.class), null, null), (PolicyResolverCache) single15.d(Reflection.a(PolicyResolverCache.class), null, null));
            case 24:
                Scope single16 = (Scope) obj;
                ParametersHolder it20 = (ParametersHolder) obj2;
                Intrinsics.i(single16, "$this$single");
                Intrinsics.i(it20, "it");
                return new ResolveJuspayPolicyUseCase((PolicyResolutionContextProvider) single16.d(Reflection.a(PolicyResolutionContextProvider.class), null, null), (PolicyConfigFetcher) single16.d(Reflection.a(PolicyConfigFetcher.class), null, null), (JuspayPolicyOverride) single16.d(Reflection.a(JuspayPolicyOverride.class), null, null), (PolicyResolverCache) single16.d(Reflection.a(PolicyResolverCache.class), null, null));
            case 25:
                Scope single17 = (Scope) obj;
                ParametersHolder it21 = (ParametersHolder) obj2;
                Intrinsics.i(single17, "$this$single");
                Intrinsics.i(it21, "it");
                return new ResolveLanguagePolicyUseCase((PolicyConfigFetcher) single17.d(Reflection.a(PolicyConfigFetcher.class), null, null), (PolicyResolutionContextProvider) single17.d(Reflection.a(PolicyResolutionContextProvider.class), null, null), (LanguagePolicyOverride) single17.d(Reflection.a(LanguagePolicyOverride.class), null, null), (PolicyResolverCache) single17.d(Reflection.a(PolicyResolverCache.class), null, null));
            case 26:
                Scope single18 = (Scope) obj;
                ParametersHolder it22 = (ParametersHolder) obj2;
                Intrinsics.i(single18, "$this$single");
                Intrinsics.i(it22, "it");
                return new ResolveProductPurchasePolicyUseCase((PolicyResolutionContextProvider) single18.d(Reflection.a(PolicyResolutionContextProvider.class), null, null), (PolicyConfigFetcher) single18.d(Reflection.a(PolicyConfigFetcher.class), null, null), (ProductPurchasePolicyOverride) single18.d(Reflection.a(ProductPurchasePolicyOverride.class), null, null), (PolicyResolverCache) single18.d(Reflection.a(PolicyResolverCache.class), null, null));
            case 27:
                Scope single19 = (Scope) obj;
                ParametersHolder it23 = (ParametersHolder) obj2;
                Intrinsics.i(single19, "$this$single");
                Intrinsics.i(it23, "it");
                return new ResolveProfilePolicyUseCase((PolicyResolutionContextProvider) single19.d(Reflection.a(PolicyResolutionContextProvider.class), null, null), (PolicyConfigFetcher) single19.d(Reflection.a(PolicyConfigFetcher.class), null, null), (ProfilePolicyOverride) single19.d(Reflection.a(ProfilePolicyOverride.class), null, null), (PolicyResolverCache) single19.d(Reflection.a(PolicyResolverCache.class), null, null));
            case 28:
                Scope single20 = (Scope) obj;
                ParametersHolder it24 = (ParametersHolder) obj2;
                Intrinsics.i(single20, "$this$single");
                Intrinsics.i(it24, "it");
                return new ResolveResourceUrlPolicyUseCase((PolicyResolutionContextProvider) single20.d(Reflection.a(PolicyResolutionContextProvider.class), null, null), (PolicyConfigFetcher) single20.d(Reflection.a(PolicyConfigFetcher.class), null, null), (ResourceUrlPolicyOverride) single20.d(Reflection.a(ResourceUrlPolicyOverride.class), null, null), (PolicyResolverCache) single20.d(Reflection.a(PolicyResolverCache.class), null, null));
            default:
                Scope single21 = (Scope) obj;
                ParametersHolder it25 = (ParametersHolder) obj2;
                Intrinsics.i(single21, "$this$single");
                Intrinsics.i(it25, "it");
                return new SdkIntegrationPolicyManager((SdkIntegrationPolicyOverride) single21.d(Reflection.a(SdkIntegrationPolicyOverride.class), null, null));
        }
    }
}
