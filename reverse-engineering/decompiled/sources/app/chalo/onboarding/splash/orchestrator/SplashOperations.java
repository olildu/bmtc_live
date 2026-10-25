package app.chalo.onboarding.splash.orchestrator;

import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.Device;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.OnBoardingStartScreen;
import app.chalo.contract.AppUsageTrackingContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.data.ClusterConfig;
import app.chalo.datastore.LocalDataStore;
import app.chalo.domain.FireAppOpenEventIfRequiredUseCase;
import app.chalo.domain.GetClusterConfigForCityUseCase;
import app.chalo.features.chaloconfig.ChaloConfigCacheStatus;
import app.chalo.features.chalotime.domain.ChaloTimeRefreshManagerUseCase;
import app.chalo.features.freshchat.FreshChatInitializer;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.language.data.Language;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.helper.MandatoryFirstHistoryCallGuard;
import app.chalo.helper.UnsyncedActivationsSyncHelper;
import app.chalo.homescreen.domain.CheckIfCanLaunchHomeScreenUseCase;
import app.chalo.login.manager.DpdpaConsentManager;
import app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManager;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.usecase.CheckIsUserLoggedInUseCase;
import app.chalo.usecase.FormatTimeInMillisToGivenFormatUseCase;
import app.chalo.usecase.IsNotificationPermissionGrantedUseCase;
import app.chalo.utils.SystemHelper;
import defpackage.g61;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/onboarding/splash/orchestrator/SplashOperations;", "", "Companion", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SplashOperations {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloTimeRefreshManagerUseCase f6690a;
    public final CityProvider b;
    public final GetClusterConfigForCityUseCase c;
    public final Device d;
    public final AnalyticsContract e;
    public final CrashlyticsLogger f;
    public final IsNotificationPermissionGrantedUseCase g;
    public final FireAppOpenEventIfRequiredUseCase h;
    public final AppUsageTrackingContract i;
    public final LanguageFeature j;
    public final OnboardingBackgroundOperationManager k;
    public final CheckIsUserLoggedInUseCase l;
    public final DpdpaConsentManager m;
    public final CheckIfCanLaunchHomeScreenUseCase n;
    public final MandatoryFirstHistoryCallGuard o;
    public final SystemHelper p;
    public final FormatTimeInMillisToGivenFormatUseCase q;
    public final LocalDataStore r;
    public final BasicInfoContract s;
    public final UnsyncedActivationsSyncHelper t;
    public final FreshChatInitializer u;
    public final ChaloAppFeatureHelper v;
    public final Lazy w = LazyKt.b(new g61(this, 11));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lapp/chalo/onboarding/splash/orchestrator/SplashOperations$Companion;", "", "", "TAG", "Ljava/lang/String;", "APP_OPEN_TIME", "GURUGRAM_CITY_ID", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6691a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[OnBoardingStartScreen.values().length];
            try {
                iArr[OnBoardingStartScreen.LANGUAGE_SELECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OnBoardingStartScreen.LOGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6691a = iArr;
            int[] iArr2 = new int[ChaloConfigCacheStatus.values().length];
            try {
                iArr2[ChaloConfigCacheStatus.NO_DATA_CACHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ChaloConfigCacheStatus.CACHE_STATUS_UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ChaloConfigCacheStatus.DATA_CACHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ChaloConfigCacheStatus.OLD_LANGUAGE_DATA_CACHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ChaloConfigCacheStatus.CACHE_EXPIRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
        }
    }

    public SplashOperations(ChaloTimeRefreshManagerUseCase chaloTimeRefreshManagerUseCase, CityProvider cityProvider, GetClusterConfigForCityUseCase getClusterConfigForCityUseCase, Device device, AnalyticsContract analyticsContract, CrashlyticsLogger crashlyticsLogger, IsNotificationPermissionGrantedUseCase isNotificationPermissionGrantedUseCase, FireAppOpenEventIfRequiredUseCase fireAppOpenEventIfRequiredUseCase, AppUsageTrackingContract appUsageTrackingContract, LanguageFeature languageFeature, OnboardingBackgroundOperationManager onboardingBackgroundOperationManager, CheckIsUserLoggedInUseCase checkIsUserLoggedInUseCase, DpdpaConsentManager dpdpaConsentManager, CheckIfCanLaunchHomeScreenUseCase checkIfCanLaunchHomeScreenUseCase, MandatoryFirstHistoryCallGuard mandatoryFirstHistoryCallGuard, SystemHelper systemHelper, FormatTimeInMillisToGivenFormatUseCase formatTimeInMillisToGivenFormatUseCase, LocalDataStore localDataStore, BasicInfoContract basicInfoContract, UnsyncedActivationsSyncHelper unsyncedActivationsSyncHelper, FreshChatInitializer freshChatInitializer, ChaloAppFeatureHelper chaloAppFeatureHelper) {
        this.f6690a = chaloTimeRefreshManagerUseCase;
        this.b = cityProvider;
        this.c = getClusterConfigForCityUseCase;
        this.d = device;
        this.e = analyticsContract;
        this.f = crashlyticsLogger;
        this.g = isNotificationPermissionGrantedUseCase;
        this.h = fireAppOpenEventIfRequiredUseCase;
        this.i = appUsageTrackingContract;
        this.j = languageFeature;
        this.k = onboardingBackgroundOperationManager;
        this.l = checkIsUserLoggedInUseCase;
        this.m = dpdpaConsentManager;
        this.n = checkIfCanLaunchHomeScreenUseCase;
        this.o = mandatoryFirstHistoryCallGuard;
        this.p = systemHelper;
        this.q = formatTimeInMillisToGivenFormatUseCase;
        this.r = localDataStore;
        this.s = basicInfoContract;
        this.t = unsyncedActivationsSyncHelper;
        this.u = freshChatInitializer;
        this.v = chaloAppFeatureHelper;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(SplashOperations splashOperations, ContinuationImpl continuationImpl) {
        SplashOperations$setAnalyticsProperties$1 splashOperations$setAnalyticsProperties$1;
        AnalyticsContract analyticsContract = splashOperations.e;
        Lazy lazy = splashOperations.w;
        if (continuationImpl instanceof SplashOperations$setAnalyticsProperties$1) {
            splashOperations$setAnalyticsProperties$1 = (SplashOperations$setAnalyticsProperties$1) continuationImpl;
            int i = splashOperations$setAnalyticsProperties$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                splashOperations$setAnalyticsProperties$1.label = i - Integer.MIN_VALUE;
            } else {
                splashOperations$setAnalyticsProperties$1 = new SplashOperations$setAnalyticsProperties$1(splashOperations, continuationImpl);
            }
        } else {
            splashOperations$setAnalyticsProperties$1 = new SplashOperations$setAnalyticsProperties$1(splashOperations, continuationImpl);
        }
        Object objV = splashOperations$setAnalyticsProperties$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = splashOperations$setAnalyticsProperties$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            Flow flowA = splashOperations.j.a();
            splashOperations$setAnalyticsProperties$1.label = 1;
            objV = FlowKt.v(flowA, splashOperations$setAnalyticsProperties$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
        }
        Boolean bool = (Boolean) objV;
        if (!(bool != null ? bool.booleanValue() : false)) {
            analyticsContract.d((Map) lazy.getValue());
            analyticsContract.a((Map) lazy.getValue());
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object b(SplashOperations splashOperations, ContinuationImpl continuationImpl) {
        SplashOperations$updateAppOpenTimeIfNeeded$1 splashOperations$updateAppOpenTimeIfNeeded$1;
        Preferences.Key<Long> key;
        LocalDataStore localDataStore = splashOperations.r;
        if (continuationImpl instanceof SplashOperations$updateAppOpenTimeIfNeeded$1) {
            splashOperations$updateAppOpenTimeIfNeeded$1 = (SplashOperations$updateAppOpenTimeIfNeeded$1) continuationImpl;
            int i = splashOperations$updateAppOpenTimeIfNeeded$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                splashOperations$updateAppOpenTimeIfNeeded$1.label = i - Integer.MIN_VALUE;
            } else {
                splashOperations$updateAppOpenTimeIfNeeded$1 = new SplashOperations$updateAppOpenTimeIfNeeded$1(splashOperations, continuationImpl);
            }
        } else {
            splashOperations$updateAppOpenTimeIfNeeded$1 = new SplashOperations$updateAppOpenTimeIfNeeded$1(splashOperations, continuationImpl);
        }
        Object objA = splashOperations$updateAppOpenTimeIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = splashOperations$updateAppOpenTimeIfNeeded$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objA);
            splashOperations$updateAppOpenTimeIfNeeded$1.label = 1;
            objA = localDataStore.a("appOpenTime", splashOperations$updateAppOpenTimeIfNeeded$1);
            if (objA != coroutineSingletons) {
            }
        }
        if (i2 == 1) {
            ResultKt.b(objA);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA);
                return unit;
            }
            key = (Preferences.Key) splashOperations$updateAppOpenTimeIfNeeded$1.L$1;
            localDataStore = (LocalDataStore) splashOperations$updateAppOpenTimeIfNeeded$1.L$0;
            ResultKt.b(objA);
        }
        splashOperations$updateAppOpenTimeIfNeeded$1.L$0 = null;
        splashOperations$updateAppOpenTimeIfNeeded$1.L$1 = null;
        splashOperations$updateAppOpenTimeIfNeeded$1.label = 3;
        return localDataStore.g(key, objA, splashOperations$updateAppOpenTimeIfNeeded$1) == coroutineSingletons ? coroutineSingletons : unit;
        if (!((Boolean) objA).booleanValue()) {
            Preferences.Key<Long> keyLongKey = PreferencesKeys.longKey("appOpenTime");
            BasicInfoContract basicInfoContract = splashOperations.s;
            splashOperations$updateAppOpenTimeIfNeeded$1.L$0 = localDataStore;
            splashOperations$updateAppOpenTimeIfNeeded$1.L$1 = keyLongKey;
            splashOperations$updateAppOpenTimeIfNeeded$1.label = 2;
            Object objC = basicInfoContract.c(splashOperations$updateAppOpenTimeIfNeeded$1);
            if (objC != coroutineSingletons) {
                objA = objC;
                key = keyLongKey;
                splashOperations$updateAppOpenTimeIfNeeded$1.L$0 = null;
                splashOperations$updateAppOpenTimeIfNeeded$1.L$1 = null;
                splashOperations$updateAppOpenTimeIfNeeded$1.label = 3;
                if (localDataStore.g(key, objA, splashOperations$updateAppOpenTimeIfNeeded$1) == coroutineSingletons) {
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:58:0x0107  */
    /* JADX WARN: Code duplicated, block: B:61:0x0116 A[PHI: r12 r13 r14
      0x0116: PHI (r12v12 kotlin.jvm.functions.Function1) = (r12v10 kotlin.jvm.functions.Function1), (r12v26 kotlin.jvm.functions.Function1) binds: [B:59:0x0113, B:18:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0116: PHI (r13v11 app.chalo.constants.Source) = (r13v8 app.chalo.constants.Source), (r13v27 app.chalo.constants.Source) binds: [B:59:0x0113, B:18:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x0116: PHI (r14v27 java.lang.Object) = (r14v26 java.lang.Object), (r14v1 java.lang.Object) binds: [B:59:0x0113, B:18:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x011e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0124  */
    /* JADX WARN: Code duplicated, block: B:67:0x0132  */
    /* JADX WARN: Code duplicated, block: B:71:0x0139  */
    /* JADX WARN: Code duplicated, block: B:73:0x0147  */
    /* JADX WARN: Code duplicated, block: B:75:0x014b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0151  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015c, code lost:
    
        if (r14 == r1) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(app.chalo.constants.Source r12, kotlin.jvm.functions.Function1 r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.onboarding.splash.orchestrator.SplashOperations.c(app.chalo.constants.Source, kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ContinuationImpl continuationImpl) {
        SplashOperations$ensureDefaultLanguageSelected$1 splashOperations$ensureDefaultLanguageSelected$1;
        if (continuationImpl instanceof SplashOperations$ensureDefaultLanguageSelected$1) {
            splashOperations$ensureDefaultLanguageSelected$1 = (SplashOperations$ensureDefaultLanguageSelected$1) continuationImpl;
            int i = splashOperations$ensureDefaultLanguageSelected$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                splashOperations$ensureDefaultLanguageSelected$1.label = i - Integer.MIN_VALUE;
            } else {
                splashOperations$ensureDefaultLanguageSelected$1 = new SplashOperations$ensureDefaultLanguageSelected$1(this, continuationImpl);
            }
        } else {
            splashOperations$ensureDefaultLanguageSelected$1 = new SplashOperations$ensureDefaultLanguageSelected$1(this, continuationImpl);
        }
        Object objV = splashOperations$ensureDefaultLanguageSelected$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = splashOperations$ensureDefaultLanguageSelected$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objV);
            Flow flowB = this.j.b();
            splashOperations$ensureDefaultLanguageSelected$1.label = 1;
            objV = FlowKt.v(flowB, splashOperations$ensureDefaultLanguageSelected$1);
            if (objV != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objV);
            return unit;
        }
        ResultKt.b(objV);
        Boolean bool = (Boolean) objV;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        String message = "language selected: " + zBooleanValue;
        Intrinsics.i(message, "message");
        if (!zBooleanValue) {
            Language language = Language.ENGLISH;
            splashOperations$ensureDefaultLanguageSelected$1.label = 2;
            if (this.k.d(language, splashOperations$ensureDefaultLanguageSelected$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum e(ContinuationImpl continuationImpl) {
        SplashOperations$getSpecialSplashLogoResId$1 splashOperations$getSpecialSplashLogoResId$1;
        String lowerCase;
        String str;
        if (continuationImpl instanceof SplashOperations$getSpecialSplashLogoResId$1) {
            splashOperations$getSpecialSplashLogoResId$1 = (SplashOperations$getSpecialSplashLogoResId$1) continuationImpl;
            int i = splashOperations$getSpecialSplashLogoResId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                splashOperations$getSpecialSplashLogoResId$1.label = i - Integer.MIN_VALUE;
            } else {
                splashOperations$getSpecialSplashLogoResId$1 = new SplashOperations$getSpecialSplashLogoResId$1(this, continuationImpl);
            }
        } else {
            splashOperations$getSpecialSplashLogoResId$1 = new SplashOperations$getSpecialSplashLogoResId$1(this, continuationImpl);
        }
        Object obj = splashOperations$getSpecialSplashLogoResId$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = splashOperations$getSpecialSplashLogoResId$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            String strH = this.b.h();
            if (strH != null) {
                lowerCase = strH.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase == null) {
                lowerCase = "";
            }
            splashOperations$getSpecialSplashLogoResId$1.L$0 = lowerCase;
            splashOperations$getSpecialSplashLogoResId$1.label = 1;
            Object objA = this.c.a(lowerCase, splashOperations$getSpecialSplashLogoResId$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = lowerCase;
            obj = objA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) splashOperations$getSpecialSplashLogoResId$1.L$0;
            ResultKt.b(obj);
        }
        if (((ClusterConfig) obj).c) {
            return IconType.KSRTC_LOGO;
        }
        if (Intrinsics.d(str, "gurugram")) {
            return IconType.GURUGRAM_LOGO;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(ContinuationImpl continuationImpl) {
        SplashOperations$initUserProperties$1 splashOperations$initUserProperties$1;
        String str;
        Map map;
        Map map2;
        String str2;
        Map map3;
        Map map4;
        if (continuationImpl instanceof SplashOperations$initUserProperties$1) {
            splashOperations$initUserProperties$1 = (SplashOperations$initUserProperties$1) continuationImpl;
            int i = splashOperations$initUserProperties$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                splashOperations$initUserProperties$1.label = i - Integer.MIN_VALUE;
            } else {
                splashOperations$initUserProperties$1 = new SplashOperations$initUserProperties$1(this, continuationImpl);
            }
        } else {
            splashOperations$initUserProperties$1 = new SplashOperations$initUserProperties$1(this, continuationImpl);
        }
        Object obj = splashOperations$initUserProperties$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = splashOperations$initUserProperties$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                str = (String) splashOperations$initUserProperties$1.L$2;
                map2 = (Map) splashOperations$initUserProperties$1.L$1;
                map = (Map) splashOperations$initUserProperties$1.L$0;
                ResultKt.b(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) splashOperations$initUserProperties$1.L$2;
                map4 = (Map) splashOperations$initUserProperties$1.L$1;
                map3 = (Map) splashOperations$initUserProperties$1.L$0;
                ResultKt.b(obj);
            }
            map4.put(str2, String.valueOf(((Boolean) obj).booleanValue()));
            AnalyticsContract analyticsContract = this.e;
            analyticsContract.d(map3);
            analyticsContract.a(map3);
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        HashMap map5 = new HashMap();
        String deviceId = this.d.getDeviceId();
        if (deviceId.length() == 0) {
            this.f.a("SplashOperations", "Device id is null");
            deviceId = "";
        }
        map5.put(CLConstants.SALT_FIELD_DEVICE_ID, deviceId);
        splashOperations$initUserProperties$1.L$0 = map5;
        splashOperations$initUserProperties$1.L$1 = map5;
        str = "isNotifPermGranted";
        splashOperations$initUserProperties$1.L$2 = "isNotifPermGranted";
        splashOperations$initUserProperties$1.label = 1;
        Object objA = this.g.a(splashOperations$initUserProperties$1);
        if (objA != coroutineSingletons) {
            map = map5;
            obj = objA;
            map2 = map;
        }
        return coroutineSingletons;
        map2.put(str, String.valueOf(((Boolean) obj).booleanValue()));
        splashOperations$initUserProperties$1.L$0 = map;
        splashOperations$initUserProperties$1.L$1 = map;
        splashOperations$initUserProperties$1.L$2 = "migrationRequired";
        splashOperations$initUserProperties$1.label = 2;
        Object objB = this.o.b(splashOperations$initUserProperties$1);
        if (objB != coroutineSingletons) {
            str2 = "migrationRequired";
            obj = objB;
            map3 = map;
            map4 = map3;
            map4.put(str2, String.valueOf(((Boolean) obj).booleanValue()));
            AnalyticsContract analyticsContract2 = this.e;
            analyticsContract2.d(map3);
            analyticsContract2.a(map3);
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(ContinuationImpl continuationImpl) {
        SplashOperations$kickOffRemoteConfigFetchIfNeeded$1 splashOperations$kickOffRemoteConfigFetchIfNeeded$1;
        if (continuationImpl instanceof SplashOperations$kickOffRemoteConfigFetchIfNeeded$1) {
            splashOperations$kickOffRemoteConfigFetchIfNeeded$1 = (SplashOperations$kickOffRemoteConfigFetchIfNeeded$1) continuationImpl;
            int i = splashOperations$kickOffRemoteConfigFetchIfNeeded$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                splashOperations$kickOffRemoteConfigFetchIfNeeded$1.label = i - Integer.MIN_VALUE;
            } else {
                splashOperations$kickOffRemoteConfigFetchIfNeeded$1 = new SplashOperations$kickOffRemoteConfigFetchIfNeeded$1(this, continuationImpl);
            }
        } else {
            splashOperations$kickOffRemoteConfigFetchIfNeeded$1 = new SplashOperations$kickOffRemoteConfigFetchIfNeeded$1(this, continuationImpl);
        }
        Object objA = splashOperations$kickOffRemoteConfigFetchIfNeeded$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = splashOperations$kickOffRemoteConfigFetchIfNeeded$1.label;
        Unit unit = Unit.f17538a;
        OnboardingBackgroundOperationManager onboardingBackgroundOperationManager = this.k;
        if (i2 == 0) {
            ResultKt.b(objA);
            splashOperations$kickOffRemoteConfigFetchIfNeeded$1.label = 1;
            objA = onboardingBackgroundOperationManager.a(splashOperations$kickOffRemoteConfigFetchIfNeeded$1);
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
            return unit;
        }
        ResultKt.b(objA);
        ChaloConfigCacheStatus chaloConfigCacheStatus = (ChaloConfigCacheStatus) objA;
        String message = "cache status in kickoff: " + chaloConfigCacheStatus;
        Intrinsics.i(message, "message");
        int i3 = WhenMappings.b[chaloConfigCacheStatus.ordinal()];
        if (i3 == 1 || i3 == 2) {
            splashOperations$kickOffRemoteConfigFetchIfNeeded$1.label = 2;
            if (onboardingBackgroundOperationManager.e(false, splashOperations$kickOffRemoteConfigFetchIfNeeded$1) == obj) {
                return obj;
            }
        } else if (i3 != 3 && i3 != 4 && i3 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d4, code lost:
    
        if (kotlinx.coroutines.CoroutineScopeKt.c(r14, r0) == r1) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(app.chalo.constants.Source r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.onboarding.splash.orchestrator.SplashOperations.h(app.chalo.constants.Source, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(ContinuationImpl continuationImpl) {
        SplashOperations$setDefaultLanguageIfRequired$1 splashOperations$setDefaultLanguageIfRequired$1;
        if (continuationImpl instanceof SplashOperations$setDefaultLanguageIfRequired$1) {
            splashOperations$setDefaultLanguageIfRequired$1 = (SplashOperations$setDefaultLanguageIfRequired$1) continuationImpl;
            int i = splashOperations$setDefaultLanguageIfRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                splashOperations$setDefaultLanguageIfRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                splashOperations$setDefaultLanguageIfRequired$1 = new SplashOperations$setDefaultLanguageIfRequired$1(this, continuationImpl);
            }
        } else {
            splashOperations$setDefaultLanguageIfRequired$1 = new SplashOperations$setDefaultLanguageIfRequired$1(this, continuationImpl);
        }
        Object objR = splashOperations$setDefaultLanguageIfRequired$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = splashOperations$setDefaultLanguageIfRequired$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objR);
            splashOperations$setDefaultLanguageIfRequired$1.label = 1;
            objR = this.v.r(splashOperations$setDefaultLanguageIfRequired$1);
            if (objR != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objR);
            return unit;
        }
        ResultKt.b(objR);
        int i3 = WhenMappings.f6691a[((OnBoardingStartScreen) objR).ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            splashOperations$setDefaultLanguageIfRequired$1.label = 2;
            if (d(splashOperations$setDefaultLanguageIfRequired$1) == obj) {
                return obj;
            }
        }
        return unit;
    }
}
