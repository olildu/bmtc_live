package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import app.chalo.ads.AdTargetingProvider;
import app.chalo.ads.AndroidNativeInlineAdPrefetcher;
import app.chalo.ads.AndroidNativeInlineAdPrefetcherImpl;
import app.chalo.ads.DataStoreExitInterstitialCapStore;
import app.chalo.ads.DisabledAdsPreloadEntryPoint;
import app.chalo.ads.ExitInterstitialAdManager;
import app.chalo.ads.ExitInterstitialConfigProvider;
import app.chalo.ads.ExitInterstitialPreloadEntryPointAndroid;
import app.chalo.ads.NativeInlineAdPrefetchEntryPointAndroid;
import app.chalo.analytics.StaticMixpanelTokenProvider;
import app.chalo.behaviour.policy.AccountDeletionUrlOverride;
import app.chalo.behaviour.policy.CitySelectionPolicyOverride;
import app.chalo.behaviour.policy.JuspayPolicyOverride;
import app.chalo.behaviour.policy.LanguagePolicyOverride;
import app.chalo.behaviour.policy.LocationPermissionPolicyOverride;
import app.chalo.behaviour.policy.OnBoardingStartScreen;
import app.chalo.behaviour.policy.ProductPurchasePolicyOverride;
import app.chalo.behaviour.policy.ProfilePolicyOverride;
import app.chalo.behaviour.policy.ReportProblemPathOverride;
import app.chalo.behaviour.policy.ResourceUrlPolicyOverride;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.behaviour.policy.SdkIntegrationPolicyOverride;
import app.chalo.behaviour.policy.SplashPolicyOverride;
import app.chalo.behaviour.policy.SupportPolicyOverride;
import app.chalo.behaviour.policy.TicketReceiptFormatConfig;
import app.chalo.behaviour.policy.TripPlannerPolicyOverride;
import app.chalo.behaviour.policy.WalletPolicyOverride;
import app.chalo.di.SharedBrandBmtcModuleKt;
import app.chalo.features.language.data.Language;
import app.chalo.features.language.impl.LanguageFeatureImpl;
import app.chalo.location.DataStoreLastKnownLocationStorage;
import app.chalo.location.LatLng;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.uistate.color.palette.BmtcBrandColorPalette;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import app.chalo.utils.PersistedMapMigration;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r71 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19185a;

    public /* synthetic */ r71(int i) {
        this.f19185a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String string;
        String string2;
        String string3;
        int i = this.f19185a;
        DisabledAdsPreloadEntryPoint disabledAdsPreloadEntryPoint = DisabledAdsPreloadEntryPoint.f768a;
        switch (i) {
            case 0:
                Scope single = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, null, null, new m4(single, 15), 7, null);
            case 1:
                Scope single2 = (Scope) obj;
                ParametersHolder it2 = (ParametersHolder) obj2;
                Intrinsics.i(single2, "$this$single");
                Intrinsics.i(it2, "it");
                return new DataStoreExitInterstitialCapStore((DataStore) single2.d(Reflection.a(DataStore.class), null, new StringQualifier("exitInterstitialAdCapStore")));
            case 2:
                Scope scope = (Scope) obj;
                return ((SdkIntegrationPolicyManager) scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", SdkIntegrationPolicyManager.class), null, null)).f1078a.e ? new ExitInterstitialPreloadEntryPointAndroid((ExitInterstitialAdManager) scope.d(Reflection.a(ExitInterstitialAdManager.class), null, null), (ExitInterstitialConfigProvider) scope.d(Reflection.a(ExitInterstitialConfigProvider.class), null, null), (CoroutineContextProvider) scope.d(Reflection.a(CoroutineContextProvider.class), null, null)) : disabledAdsPreloadEntryPoint;
            case 3:
                Scope single3 = (Scope) obj;
                ParametersHolder it3 = (ParametersHolder) obj2;
                Intrinsics.i(single3, "$this$single");
                Intrinsics.i(it3, "it");
                return new AndroidNativeInlineAdPrefetcherImpl(ModuleExtKt.a(single3), (CoroutineContextProvider) single3.d(Reflection.a(CoroutineContextProvider.class), null, null));
            case 4:
                Scope scope2 = (Scope) obj;
                return ((SdkIntegrationPolicyManager) scope2.d(i71.k(scope2, "$this$single", (ParametersHolder) obj2, "it", SdkIntegrationPolicyManager.class), null, null)).f1078a.e ? new NativeInlineAdPrefetchEntryPointAndroid(ModuleExtKt.a(scope2), (CoroutineContextProvider) scope2.d(Reflection.a(CoroutineContextProvider.class), null, null), (AndroidNativeInlineAdPrefetcher) scope2.d(Reflection.a(AndroidNativeInlineAdPrefetcher.class), null, null), (AdTargetingProvider) scope2.d(Reflection.a(AdTargetingProvider.class), null, null), (GetMiscellaneousCityWiseFlagsConfigUseCase) scope2.d(Reflection.a(GetMiscellaneousCityWiseFlagsConfigUseCase.class), null, null)) : disabledAdsPreloadEntryPoint;
            case 5:
                Scope single4 = (Scope) obj;
                ParametersHolder it4 = (ParametersHolder) obj2;
                Intrinsics.i(single4, "$this$single");
                Intrinsics.i(it4, "it");
                return new DataStoreLastKnownLocationStorage((DataStore) single4.d(Reflection.a(DataStore.class), null, new StringQualifier("last_known_location_cache")), ((CoroutineContextProvider) single4.d(Reflection.a(CoroutineContextProvider.class), null, null)).b());
            case 6:
                Scope single5 = (Scope) obj;
                ParametersHolder it5 = (ParametersHolder) obj2;
                Intrinsics.i(single5, "$this$single");
                Intrinsics.i(it5, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, CollectionsKt.R(new PersistedMapMigration(ArraysKt.j0(new String[]{"current_language_key", "lang_info_shown", "language_selected"}), ModuleExtKt.a(single5), "config", "config_properties", new r71(8))), null, new m4(single5, 20), 5, null);
            case 7:
                Scope single6 = (Scope) obj;
                ParametersHolder it6 = (ParametersHolder) obj2;
                Intrinsics.i(single6, "$this$single");
                Intrinsics.i(it6, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, EmptyList.f17557a, null, new m4(single6, 11), 5, null);
            case 8:
                Map data = (Map) obj;
                MutablePreferences mutablePrefs = (MutablePreferences) obj2;
                Intrinsics.i(data, "data");
                Intrinsics.i(mutablePrefs, "mutablePrefs");
                Object obj3 = data.get("current_language_key");
                if (obj3 != null && (string3 = obj3.toString()) != null) {
                    mutablePrefs.set(LanguageFeatureImpl.f, string3);
                }
                Object obj4 = data.get("lang_info_shown");
                if (obj4 != null && (string2 = obj4.toString()) != null) {
                    mutablePrefs.set(LanguageFeatureImpl.g, Boolean.valueOf(Boolean.parseBoolean(string2)));
                }
                Object obj5 = data.get("language_selected");
                if (obj5 != null && (string = obj5.toString()) != null) {
                    mutablePrefs.set(LanguageFeatureImpl.h, Boolean.valueOf(Boolean.parseBoolean(string)));
                }
                return Unit.f17538a;
            case 9:
                Scope single7 = (Scope) obj;
                ParametersHolder it7 = (ParametersHolder) obj2;
                Intrinsics.i(single7, "$this$single");
                Intrinsics.i(it7, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, CollectionsKt.S(new PersistedMapMigration(EmptySet.f17559a, ModuleExtKt.a(single7), "chaloTimeStore", "chaloTimeStore_map"), new PersistedMapMigration(SetsKt.g("keyCachedAppVersionCodeForChaloTime"), ModuleExtKt.a(single7), "config", "config_properties", new qe0(28))), null, new m4(single7, 23), 5, null);
            case 10:
                Scope single8 = (Scope) obj;
                ParametersHolder it8 = (ParametersHolder) obj2;
                Intrinsics.i(single8, "$this$single");
                Intrinsics.i(it8, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, null, null, new m4(single8, 14), 7, null);
            case 11:
                Scope single9 = (Scope) obj;
                ParametersHolder it9 = (ParametersHolder) obj2;
                Intrinsics.i(single9, "$this$single");
                Intrinsics.i(it9, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, null, null, new m4(single9, 19), 7, null);
            case 12:
                Scope single10 = (Scope) obj;
                ParametersHolder it10 = (ParametersHolder) obj2;
                Intrinsics.i(single10, "$this$single");
                Intrinsics.i(it10, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, CollectionsKt.R(new PersistedMapMigration(EmptySet.f17559a, ModuleExtKt.a(single10), "reportProblemFeature", "reportProblemFeature_properties")), null, new m4(single10, 13), 5, null);
            case 13:
                Scope single11 = (Scope) obj;
                ParametersHolder it11 = (ParametersHolder) obj2;
                Intrinsics.i(single11, "$this$single");
                Intrinsics.i(it11, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, CollectionsKt.R(new PersistedMapMigration(ArraysKt.j0(new String[]{"keyReportProblemFeatureVersionCode", "keyReportProblemFeatureCachedResponseCity", "boostRatingsAsked", "boostRatingsRemindLaterTS", "appSessionCount", "keyCachedAppVersionCode", "installStatus", "keySoundFragmentTutorialShown", "keyBleTutorialShown"}), ModuleExtKt.a(single11), "config", "config_properties")), null, new m4(single11, 7), 5, null);
            case 14:
                Scope single12 = (Scope) obj;
                ParametersHolder it12 = (ParametersHolder) obj2;
                Intrinsics.i(single12, "$this$single");
                Intrinsics.i(it12, "it");
                Object systemService = ModuleExtKt.a(single12).getSystemService("bluetooth");
                Intrinsics.g(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
                BluetoothAdapter adapter = ((BluetoothManager) systemService).getAdapter();
                Intrinsics.h(adapter, "getAdapter(...)");
                return adapter;
            case 15:
                ParametersHolder it13 = (ParametersHolder) obj2;
                Module module = SharedBrandBmtcModuleKt.f2479a;
                Intrinsics.i((Scope) obj, "$this$single");
                Intrinsics.i(it13, "it");
                return new StaticMixpanelTokenProvider();
            case 16:
                ParametersHolder it14 = (ParametersHolder) obj2;
                Module module2 = SharedBrandBmtcModuleKt.f2479a;
                Intrinsics.i((Scope) obj, "$this$single");
                Intrinsics.i(it14, "it");
                return new SplashPolicyOverride(OnBoardingStartScreen.LANGUAGE_SELECTION);
            case 17:
                ParametersHolder it15 = (ParametersHolder) obj2;
                Module module3 = SharedBrandBmtcModuleKt.f2479a;
                Intrinsics.i((Scope) obj, "$this$single");
                Intrinsics.i(it15, "it");
                return new CitySelectionPolicyOverride(SetsKt.g("bengaluru"), SetsKt.g("bengaluru"), new LatLng(12.9716d, 77.5946d), TicketReceiptFormatConfig.BMTC);
            case 18:
                ParametersHolder it16 = (ParametersHolder) obj2;
                Module module4 = SharedBrandBmtcModuleKt.f2479a;
                Intrinsics.i((Scope) obj, "$this$single");
                Intrinsics.i(it16, "it");
                return new SupportPolicyOverride(new ReportProblemPathOverride.WebView());
            case 19:
                ParametersHolder it17 = (ParametersHolder) obj2;
                Module module5 = SharedBrandBmtcModuleKt.f2479a;
                Intrinsics.i((Scope) obj, "$this$single");
                Intrinsics.i(it17, "it");
                return new WalletPolicyOverride();
            case 20:
                ParametersHolder it18 = (ParametersHolder) obj2;
                Module module6 = SharedBrandBmtcModuleKt.f2479a;
                Intrinsics.i((Scope) obj, "$this$single");
                Intrinsics.i(it18, "it");
                return new JuspayPolicyOverride();
            case 21:
                ParametersHolder it19 = (ParametersHolder) obj2;
                Module module7 = SharedBrandBmtcModuleKt.f2479a;
                Intrinsics.i((Scope) obj, "$this$single");
                Intrinsics.i(it19, "it");
                return new LanguagePolicyOverride(CollectionsKt.S(Language.ENGLISH, Language.KANNADA));
            case 22:
                ParametersHolder it20 = (ParametersHolder) obj2;
                Module module8 = SharedBrandBmtcModuleKt.f2479a;
                Intrinsics.i((Scope) obj, "$this$single");
                Intrinsics.i(it20, "it");
                return new AccountDeletionUrlOverride();
            case 23:
                ParametersHolder it21 = (ParametersHolder) obj2;
                Module module9 = SharedBrandBmtcModuleKt.f2479a;
                Intrinsics.i((Scope) obj, "$this$single");
                Intrinsics.i(it21, "it");
                return new ProductPurchasePolicyOverride();
            case 24:
                ParametersHolder it22 = (ParametersHolder) obj2;
                Module module10 = SharedBrandBmtcModuleKt.f2479a;
                Intrinsics.i((Scope) obj, "$this$single");
                Intrinsics.i(it22, "it");
                return new ProfilePolicyOverride();
            case 25:
                ParametersHolder it23 = (ParametersHolder) obj2;
                Module module11 = SharedBrandBmtcModuleKt.f2479a;
                Intrinsics.i((Scope) obj, "$this$single");
                Intrinsics.i(it23, "it");
                return new ResourceUrlPolicyOverride();
            case 26:
                ParametersHolder it24 = (ParametersHolder) obj2;
                Module module12 = SharedBrandBmtcModuleKt.f2479a;
                Intrinsics.i((Scope) obj, "$this$single");
                Intrinsics.i(it24, "it");
                return new SdkIntegrationPolicyOverride();
            case 27:
                ParametersHolder it25 = (ParametersHolder) obj2;
                Module module13 = SharedBrandBmtcModuleKt.f2479a;
                Intrinsics.i((Scope) obj, "$this$single");
                Intrinsics.i(it25, "it");
                return new LocationPermissionPolicyOverride();
            case 28:
                ParametersHolder it26 = (ParametersHolder) obj2;
                Module module14 = SharedBrandBmtcModuleKt.f2479a;
                Intrinsics.i((Scope) obj, "$this$single");
                Intrinsics.i(it26, "it");
                return new TripPlannerPolicyOverride();
            default:
                ParametersHolder it27 = (ParametersHolder) obj2;
                Module module15 = SharedBrandBmtcModuleKt.f2479a;
                Intrinsics.i((Scope) obj, "$this$single");
                Intrinsics.i(it27, "it");
                return new BmtcBrandColorPalette();
        }
    }
}
