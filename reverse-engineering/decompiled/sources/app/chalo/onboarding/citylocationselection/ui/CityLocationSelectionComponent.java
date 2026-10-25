package app.chalo.onboarding.citylocationselection.ui;

import androidx.media3.exoplayer.ExoPlayer;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.CityAutoSelectionApplicable;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.CityMetaDataManager;
import app.chalo.domain.GetClusterConfigForCityUseCase;
import app.chalo.features.chaloconfig.ChaloConfigCacheStatus;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LatLng;
import app.chalo.manager.homescreen.HomeScreenConfigManager;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource;
import app.chalo.onboarding.cityprovider.ProcessCityChangeUseCase;
import app.chalo.onboarding.cityprovider.UpdateCurrentCityUseCase;
import app.chalo.onboarding.languageconfig.OnboardingBackgroundOperationManager;
import app.chalo.onboarding.languageconfig.RemoteConfigRunState;
import app.chalo.permissions.gps.GpsRequestHandlerProvider;
import app.chalo.permissions.handler.PermissionHandler;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.CitySelectionArgs;
import app.chalo.universalsearch.data.UniversalSearchCitySelectionResult;
import app.chalo.utils.AppLocationPermissionState;
import app.chalo.utils.KUUID;
import app.chalo.utils.LocationPermissionCallbackHandler;
import app.chalo.utils.SystemHelper;
import com.arkivanov.decompose.ComponentContext;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.ap;
import defpackage.ch;
import defpackage.ko;
import defpackage.n21;
import defpackage.zo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionState;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionSideEffect;", "Companion", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CityLocationSelectionComponent extends ChaloBaseStateMviComponent<CityLocationSelectionIntent, CityLocationSelectionState, CityLocationSelectionState, CityLocationSelectionSideEffect> {
    public final UniversalSearchResultStateManager A;
    public final ProcessCityChangeUseCase B;
    public final CityProvider C;
    public final OnboardingBackgroundOperationManager D;
    public final ChaloAppFeatureHelper E;
    public Job F;
    public Job G;
    public boolean H;
    public boolean I;
    public Job J;
    public Job K;
    public Job L;
    public boolean M;
    public final CitySelectionArgs.CityLocationSelectionArgs k;
    public final ChaloLocationManager l;
    public final CityMetaDataManager m;
    public final UpdateCurrentCityUseCase n;
    public final StringProvider o;
    public final AnalyticsContract p;
    public final HomeScreenConfigManager q;
    public final BasicInfoContract r;
    public final CityMetaPropsLocalDataSource s;
    public final GetClusterConfigForCityUseCase t;
    public final KotlinToastManager u;
    public final ChaloNavigationManager v;
    public final PermissionHandlerProvider w;
    public final LocationPermissionCallbackHandler x;
    public final SystemHelper y;
    public final GpsRequestHandlerProvider z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionComponent$Companion;", "", "", "WELCOME_SCREEN_TIMEOUT", "J", "", "LOCATION_SEARCH", "Ljava/lang/String;", "LOCATION_AUTO", "GURUGRAM_CITY_ID", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6574a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[CityLocationSelectionSource.values().length];
            try {
                iArr[CityLocationSelectionSource.LoginScreen.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CityLocationSelectionSource.LanguageSelectionScreen.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CityLocationSelectionSource.SplashScreen.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CityLocationSelectionSource.OldCitySelectionScreen.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CityLocationSelectionSource.HomeScreen.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CityLocationSelectionSource.RegularBusScreen.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CityLocationSelectionSource.CityDiscontinuedScreen.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CityLocationSelectionSource.Unknown.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f6574a = iArr;
            int[] iArr2 = new int[ChaloConfigCacheStatus.values().length];
            try {
                iArr2[ChaloConfigCacheStatus.DATA_CACHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ChaloConfigCacheStatus.OLD_LANGUAGE_DATA_CACHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ChaloConfigCacheStatus.NO_DATA_CACHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ChaloConfigCacheStatus.CACHE_EXPIRED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ChaloConfigCacheStatus.CACHE_STATUS_UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            b = iArr2;
            int[] iArr3 = new int[AppLocationPermissionState.values().length];
            try {
                iArr3[AppLocationPermissionState.FINE_LOCATION_PROVIDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[AppLocationPermissionState.COARSE_LOCATION_PROVIDED_AND_UPGRADE_NOT_TRIGGERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[AppLocationPermissionState.COARSE_LOCATION_PROVIDED_AND_UPGRADE_DENIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[AppLocationPermissionState.NO_PERMISSION_GRANTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            c = iArr3;
        }
    }

    public CityLocationSelectionComponent(CitySelectionArgs.CityLocationSelectionArgs cityLocationSelectionArgs, ComponentContext componentContext, ChaloLocationManager chaloLocationManager, CityMetaDataManager cityMetaDataManager, UpdateCurrentCityUseCase updateCurrentCityUseCase, StringProvider stringProvider, AnalyticsContract analyticsContract, HomeScreenConfigManager homeScreenConfigManager, BasicInfoContract basicInfoContract, CityMetaPropsLocalDataSource cityMetaPropsLocalDataSource, GetClusterConfigForCityUseCase getClusterConfigForCityUseCase, KotlinToastManager kotlinToastManager, ChaloNavigationManager chaloNavigationManager, PermissionHandlerProvider permissionHandlerProvider, LocationPermissionCallbackHandler locationPermissionCallbackHandler, SystemHelper systemHelper, GpsRequestHandlerProvider gpsRequestHandlerProvider, UniversalSearchResultStateManager universalSearchResultStateManager, ProcessCityChangeUseCase processCityChangeUseCase, CityProvider cityProvider, OnboardingBackgroundOperationManager onboardingBackgroundOperationManager, ChaloAppFeatureHelper chaloAppFeatureHelper) {
        super(componentContext);
        this.k = cityLocationSelectionArgs;
        this.l = chaloLocationManager;
        this.m = cityMetaDataManager;
        this.n = updateCurrentCityUseCase;
        this.o = stringProvider;
        this.p = analyticsContract;
        this.q = homeScreenConfigManager;
        this.r = basicInfoContract;
        this.s = cityMetaPropsLocalDataSource;
        this.t = getClusterConfigForCityUseCase;
        this.u = kotlinToastManager;
        this.v = chaloNavigationManager;
        this.w = permissionHandlerProvider;
        this.x = locationPermissionCallbackHandler;
        this.y = systemHelper;
        this.z = gpsRequestHandlerProvider;
        this.A = universalSearchResultStateManager;
        this.B = processCityChangeUseCase;
        this.C = cityProvider;
        this.D = onboardingBackgroundOperationManager;
        this.E = chaloAppFeatureHelper;
        this.I = true;
        M0(new CityLocationSelectionIntent.InitializationIntent(CityLocationSelectionContractKt.a(cityLocationSelectionArgs.c), cityLocationSelectionArgs.d));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6 A[PHI: r6
      0x00a6: PHI (r6v16 java.lang.Object) = (r6v15 java.lang.Object), (r6v1 java.lang.Object) binds: [B:40:0x00a3, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object F0(CityLocationSelectionComponent cityLocationSelectionComponent, ContinuationImpl continuationImpl) {
        CityLocationSelectionComponent$ensureRemoteConfigReadiness$1 cityLocationSelectionComponent$ensureRemoteConfigReadiness$1;
        Object objJ0;
        Object objJ1;
        Object objJ2;
        OnboardingBackgroundOperationManager onboardingBackgroundOperationManager = cityLocationSelectionComponent.D;
        if (continuationImpl instanceof CityLocationSelectionComponent$ensureRemoteConfigReadiness$1) {
            cityLocationSelectionComponent$ensureRemoteConfigReadiness$1 = (CityLocationSelectionComponent$ensureRemoteConfigReadiness$1) continuationImpl;
            int i = cityLocationSelectionComponent$ensureRemoteConfigReadiness$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityLocationSelectionComponent$ensureRemoteConfigReadiness$1.label = i - Integer.MIN_VALUE;
            } else {
                cityLocationSelectionComponent$ensureRemoteConfigReadiness$1 = new CityLocationSelectionComponent$ensureRemoteConfigReadiness$1(cityLocationSelectionComponent, continuationImpl);
            }
        } else {
            cityLocationSelectionComponent$ensureRemoteConfigReadiness$1 = new CityLocationSelectionComponent$ensureRemoteConfigReadiness$1(cityLocationSelectionComponent, continuationImpl);
        }
        Object objH0 = cityLocationSelectionComponent$ensureRemoteConfigReadiness$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (cityLocationSelectionComponent$ensureRemoteConfigReadiness$1.label) {
            case 0:
                ResultKt.b(objH0);
                RemoteConfigRunState remoteConfigRunStateC = onboardingBackgroundOperationManager.c();
                String message = "config run state: " + remoteConfigRunStateC;
                Intrinsics.i(message, "message");
                cityLocationSelectionComponent.O0(remoteConfigRunStateC, false);
                if (remoteConfigRunStateC instanceof RemoteConfigRunState.Terminal) {
                    cityLocationSelectionComponent$ensureRemoteConfigReadiness$1.label = 1;
                    objH0 = cityLocationSelectionComponent.H0(cityLocationSelectionComponent$ensureRemoteConfigReadiness$1);
                    if (objH0 != obj) {
                        if (!((Boolean) objH0).booleanValue()) {
                            cityLocationSelectionComponent$ensureRemoteConfigReadiness$1.label = 2;
                            objJ0 = cityLocationSelectionComponent.J0(cityLocationSelectionComponent$ensureRemoteConfigReadiness$1);
                            if (objJ0 != obj) {
                                return objJ0;
                            }
                        }
                        return Boolean.TRUE;
                    }
                } else if (remoteConfigRunStateC.equals(RemoteConfigRunState.InProgress.f6639a)) {
                    cityLocationSelectionComponent$ensureRemoteConfigReadiness$1.label = 3;
                    if (onboardingBackgroundOperationManager.b(cityLocationSelectionComponent$ensureRemoteConfigReadiness$1) != obj) {
                        cityLocationSelectionComponent$ensureRemoteConfigReadiness$1.label = 4;
                        objH0 = cityLocationSelectionComponent.H0(cityLocationSelectionComponent$ensureRemoteConfigReadiness$1);
                        if (objH0 != obj) {
                            if (!((Boolean) objH0).booleanValue()) {
                                cityLocationSelectionComponent$ensureRemoteConfigReadiness$1.label = 5;
                                objJ1 = cityLocationSelectionComponent.J0(cityLocationSelectionComponent$ensureRemoteConfigReadiness$1);
                                if (objJ1 == obj) {
                                    return objJ1;
                                }
                            }
                            return Boolean.TRUE;
                        }
                    }
                } else {
                    if (!remoteConfigRunStateC.equals(RemoteConfigRunState.NotStarted.f6641a) && !(remoteConfigRunStateC instanceof RemoteConfigRunState.InfraFailure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cityLocationSelectionComponent$ensureRemoteConfigReadiness$1.label = 6;
                    objH0 = cityLocationSelectionComponent.H0(cityLocationSelectionComponent$ensureRemoteConfigReadiness$1);
                    if (objH0 != obj) {
                        if (!((Boolean) objH0).booleanValue()) {
                            cityLocationSelectionComponent$ensureRemoteConfigReadiness$1.label = 7;
                            objJ2 = cityLocationSelectionComponent.J0(cityLocationSelectionComponent$ensureRemoteConfigReadiness$1);
                            if (objJ2 != obj) {
                                return objJ2;
                            }
                        }
                        return Boolean.TRUE;
                    }
                }
                return obj;
            case 1:
                ResultKt.b(objH0);
                if (!((Boolean) objH0).booleanValue()) {
                    cityLocationSelectionComponent$ensureRemoteConfigReadiness$1.label = 2;
                    objJ0 = cityLocationSelectionComponent.J0(cityLocationSelectionComponent$ensureRemoteConfigReadiness$1);
                    if (objJ0 != obj) {
                        return obj;
                    }
                    return objJ0;
                }
                return Boolean.TRUE;
            case 2:
                ResultKt.b(objH0);
                return objH0;
            case 3:
                ResultKt.b(objH0);
                cityLocationSelectionComponent$ensureRemoteConfigReadiness$1.label = 4;
                objH0 = cityLocationSelectionComponent.H0(cityLocationSelectionComponent$ensureRemoteConfigReadiness$1);
                if (objH0 != obj) {
                    if (!((Boolean) objH0).booleanValue()) {
                        cityLocationSelectionComponent$ensureRemoteConfigReadiness$1.label = 5;
                        objJ1 = cityLocationSelectionComponent.J0(cityLocationSelectionComponent$ensureRemoteConfigReadiness$1);
                        if (objJ1 == obj) {
                            return objJ1;
                        }
                    }
                    return Boolean.TRUE;
                }
                return obj;
            case 4:
                ResultKt.b(objH0);
                if (!((Boolean) objH0).booleanValue()) {
                    cityLocationSelectionComponent$ensureRemoteConfigReadiness$1.label = 5;
                    objJ1 = cityLocationSelectionComponent.J0(cityLocationSelectionComponent$ensureRemoteConfigReadiness$1);
                    if (objJ1 == obj) {
                        return obj;
                    }
                    return objJ1;
                }
                return Boolean.TRUE;
            case 5:
                ResultKt.b(objH0);
                return objH0;
            case 6:
                ResultKt.b(objH0);
                if (!((Boolean) objH0).booleanValue()) {
                    cityLocationSelectionComponent$ensureRemoteConfigReadiness$1.label = 7;
                    objJ2 = cityLocationSelectionComponent.J0(cityLocationSelectionComponent$ensureRemoteConfigReadiness$1);
                    if (objJ2 != obj) {
                        return obj;
                    }
                    return objJ2;
                }
                return Boolean.TRUE;
            case 7:
                ResultKt.b(objH0);
                return objH0;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void G0() {
        CityAutoSelectionApplicable cityAutoSelectionApplicable = ((CityLocationSelectionState) this.f.getValue()).j;
        boolean zD = Intrinsics.d(cityAutoSelectionApplicable, CityAutoSelectionApplicable.No.f999a);
        ContextScope contextScope = this.j;
        if (zD) {
            BuildersKt.d(contextScope, null, null, new CityLocationSelectionComponent$checkIfLocationAvailableAndFetchCity$1(this, null), 3);
        } else {
            if (!(cityAutoSelectionApplicable instanceof CityAutoSelectionApplicable.Yes)) {
                throw new NoWhenBranchMatchedException();
            }
            LatLng latLng = ((CityAutoSelectionApplicable.Yes) cityAutoSelectionApplicable).f1000a;
            this.H = true;
            BuildersKt.d(contextScope, null, null, new CityLocationSelectionComponent$fetchCityIdAndNameFromLocation$1(this, latLng, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H0(ContinuationImpl continuationImpl) {
        CityLocationSelectionComponent$doesRemoteConfigCacheExists$1 cityLocationSelectionComponent$doesRemoteConfigCacheExists$1;
        if (continuationImpl instanceof CityLocationSelectionComponent$doesRemoteConfigCacheExists$1) {
            cityLocationSelectionComponent$doesRemoteConfigCacheExists$1 = (CityLocationSelectionComponent$doesRemoteConfigCacheExists$1) continuationImpl;
            int i = cityLocationSelectionComponent$doesRemoteConfigCacheExists$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityLocationSelectionComponent$doesRemoteConfigCacheExists$1.label = i - Integer.MIN_VALUE;
            } else {
                cityLocationSelectionComponent$doesRemoteConfigCacheExists$1 = new CityLocationSelectionComponent$doesRemoteConfigCacheExists$1(this, continuationImpl);
            }
        } else {
            cityLocationSelectionComponent$doesRemoteConfigCacheExists$1 = new CityLocationSelectionComponent$doesRemoteConfigCacheExists$1(this, continuationImpl);
        }
        Object objA = cityLocationSelectionComponent$doesRemoteConfigCacheExists$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityLocationSelectionComponent$doesRemoteConfigCacheExists$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objA);
            cityLocationSelectionComponent$doesRemoteConfigCacheExists$1.label = 1;
            objA = this.D.a(cityLocationSelectionComponent$doesRemoteConfigCacheExists$1);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        int i3 = WhenMappings.b[((ChaloConfigCacheStatus) objA).ordinal()];
        if (i3 != 1 && i3 != 2) {
            z = false;
            if (i3 != 3 && i3 != 4 && i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Boolean.valueOf(z);
    }

    public final void I0(String str, String str2) {
        BuildersKt.d(this.j, null, null, new CityLocationSelectionComponent$fetchConfigDataAndProceed$1(this, str, str2, this.r.e() + ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J0(ContinuationImpl continuationImpl) {
        CityLocationSelectionComponent$forceFetchRemoteConfigAndAwaitSuccess$1 cityLocationSelectionComponent$forceFetchRemoteConfigAndAwaitSuccess$1;
        Object objH0;
        if (continuationImpl instanceof CityLocationSelectionComponent$forceFetchRemoteConfigAndAwaitSuccess$1) {
            cityLocationSelectionComponent$forceFetchRemoteConfigAndAwaitSuccess$1 = (CityLocationSelectionComponent$forceFetchRemoteConfigAndAwaitSuccess$1) continuationImpl;
            int i = cityLocationSelectionComponent$forceFetchRemoteConfigAndAwaitSuccess$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityLocationSelectionComponent$forceFetchRemoteConfigAndAwaitSuccess$1.label = i - Integer.MIN_VALUE;
            } else {
                cityLocationSelectionComponent$forceFetchRemoteConfigAndAwaitSuccess$1 = new CityLocationSelectionComponent$forceFetchRemoteConfigAndAwaitSuccess$1(this, continuationImpl);
            }
        } else {
            cityLocationSelectionComponent$forceFetchRemoteConfigAndAwaitSuccess$1 = new CityLocationSelectionComponent$forceFetchRemoteConfigAndAwaitSuccess$1(this, continuationImpl);
        }
        Object objB = cityLocationSelectionComponent$forceFetchRemoteConfigAndAwaitSuccess$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityLocationSelectionComponent$forceFetchRemoteConfigAndAwaitSuccess$1.label;
        OnboardingBackgroundOperationManager onboardingBackgroundOperationManager = this.D;
        if (i2 == 0) {
            ResultKt.b(objB);
            cityLocationSelectionComponent$forceFetchRemoteConfigAndAwaitSuccess$1.label = 1;
            if (onboardingBackgroundOperationManager.e(true, cityLocationSelectionComponent$forceFetchRemoteConfigAndAwaitSuccess$1) != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            ResultKt.b(objB);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objB);
                return objB;
            }
            ResultKt.b(objB);
        }
        O0((RemoteConfigRunState) objB, true);
        cityLocationSelectionComponent$forceFetchRemoteConfigAndAwaitSuccess$1.label = 3;
        objH0 = H0(cityLocationSelectionComponent$forceFetchRemoteConfigAndAwaitSuccess$1);
        if (objH0 != obj) {
            return obj;
        }
        return objH0;
        cityLocationSelectionComponent$forceFetchRemoteConfigAndAwaitSuccess$1.label = 2;
        objB = onboardingBackgroundOperationManager.b(cityLocationSelectionComponent$forceFetchRemoteConfigAndAwaitSuccess$1);
        if (objB != obj) {
            O0((RemoteConfigRunState) objB, true);
            cityLocationSelectionComponent$forceFetchRemoteConfigAndAwaitSuccess$1.label = 3;
            objH0 = H0(cityLocationSelectionComponent$forceFetchRemoteConfigAndAwaitSuccess$1);
            if (objH0 != obj) {
                return objH0;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K0(long j, Continuation continuation) {
        CityLocationSelectionComponent$navigateToNextScreen$1 cityLocationSelectionComponent$navigateToNextScreen$1;
        if (continuation instanceof CityLocationSelectionComponent$navigateToNextScreen$1) {
            cityLocationSelectionComponent$navigateToNextScreen$1 = (CityLocationSelectionComponent$navigateToNextScreen$1) continuation;
            int i = cityLocationSelectionComponent$navigateToNextScreen$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cityLocationSelectionComponent$navigateToNextScreen$1.label = i - Integer.MIN_VALUE;
            } else {
                cityLocationSelectionComponent$navigateToNextScreen$1 = new CityLocationSelectionComponent$navigateToNextScreen$1(this, continuation);
            }
        } else {
            cityLocationSelectionComponent$navigateToNextScreen$1 = new CityLocationSelectionComponent$navigateToNextScreen$1(this, continuation);
        }
        Object obj = cityLocationSelectionComponent$navigateToNextScreen$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cityLocationSelectionComponent$navigateToNextScreen$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            long jE = this.r.e();
            long j2 = jE < j ? j - jE : 0L;
            cityLocationSelectionComponent$navigateToNextScreen$1.label = 1;
            if (DelayKt.b(j2, cityLocationSelectionComponent$navigateToNextScreen$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        q0(new zo(this, 0));
        return Unit.f17538a;
    }

    public final void L0() {
        Job job = this.L;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        String strA = KUUID.a();
        CityLocationSelectionComponent$navigateToUniversalSearch$1 cityLocationSelectionComponent$navigateToUniversalSearch$1 = new CityLocationSelectionComponent$navigateToUniversalSearch$1(this, strA, null);
        ContextScope contextScope = this.j;
        this.L = BuildersKt.d(contextScope, null, null, cityLocationSelectionComponent$navigateToUniversalSearch$1, 3);
        BuildersKt.d(contextScope, null, null, new CityLocationSelectionComponent$navigateToUniversalSearch$2(this, strA, null), 3);
    }

    public final void M0(CityLocationSelectionIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof CityLocationSelectionIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        if (z) {
            CityLocationSelectionIntent.InitializationIntent initializationIntent = (CityLocationSelectionIntent.InitializationIntent) intent;
            if (this.d) {
                return;
            }
            this.d = true;
            BuildersKt.d(contextScope, null, null, new CityLocationSelectionComponent$handleInitializationIntent$1(initializationIntent, this, null), 3);
            return;
        }
        boolean zEquals = intent.equals(CityLocationSelectionIntent.OnEnableDeviceLocationClicked.f6586a);
        StateFlow stateFlow = this.f;
        if (zEquals) {
            AnalyticsContractImplKt.a(this.p, "enable device location clicked", Source.CITY_SELECTION_SCREEN, ((CityLocationSelectionState) stateFlow.getValue()).b.toSource(), null, 56);
            P0();
            return;
        }
        if (intent.equals(CityLocationSelectionIntent.OnEnterManuallyClicked.f6587a)) {
            AnalyticsContractImplKt.a(this.p, "enter location manually clicked", Source.CITY_SELECTION_SCREEN, ((CityLocationSelectionState) stateFlow.getValue()).b.toSource(), null, 56);
            L0();
            return;
        }
        if (intent.equals(CityLocationSelectionIntent.OnLocationPermissionGranted.f6591a) || intent.equals(CityLocationSelectionIntent.OnGpsEnabled.f6589a)) {
            G0();
            return;
        }
        if (intent instanceof CityLocationSelectionIntent.StartLocationUpdates) {
            CityLocationSelectionSource cityLocationSelectionSource = ((CityLocationSelectionIntent.StartLocationUpdates) intent).f6593a;
            if (this.I || this.H) {
                return;
            }
            switch (WhenMappings.f6574a[cityLocationSelectionSource.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 7:
                case 8:
                    BuildersKt.d(contextScope, null, null, new CityLocationSelectionComponent$startLocationUpdates$1(this, null), 3);
                    return;
                case 4:
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (intent.equals(CityLocationSelectionIntent.RetryCityFetch.f6592a)) {
            AnalyticsContractImplKt.a(this.p, "retry city fetch clicked", Source.CITY_SELECTION_SCREEN, ((CityLocationSelectionState) stateFlow.getValue()).b.toSource(), null, 56);
            G0();
            return;
        }
        if (intent.equals(CityLocationSelectionIntent.OnChangeLocationClicked.f6585a)) {
            AnalyticsContractImplKt.a(this.p, "change location clicked", Source.CITY_SELECTION_SCREEN, ((CityLocationSelectionState) stateFlow.getValue()).b.toSource(), null, 56);
            this.H = true;
            L0();
            return;
        }
        if (intent.equals(CityLocationSelectionIntent.OnExploreChaloCitiesClicked.f6588a)) {
            AnalyticsContractImplKt.a(this.p, "explore chalo cities clicked", Source.CITY_SELECTION_SCREEN, ((CityLocationSelectionState) stateFlow.getValue()).b.toSource(), null, 56);
            switch (WhenMappings.f6574a[((CityLocationSelectionState) stateFlow.getValue()).b.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    q0(new zo(this, 1));
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (intent instanceof CityLocationSelectionIntent.UniversalSearchResultReceived) {
            UniversalSearchCitySelectionResult universalSearchCitySelectionResult = ((CityLocationSelectionIntent.UniversalSearchResultReceived) intent).f6594a;
            E0(new ko(22));
            if (universalSearchCitySelectionResult instanceof UniversalSearchCitySelectionResult.CitySelected) {
                E0(new ch(universalSearchCitySelectionResult, 27));
                UniversalSearchCitySelectionResult.CitySelected citySelected = (UniversalSearchCitySelectionResult.CitySelected) universalSearchCitySelectionResult;
                I0(citySelected.c, citySelected.d);
                return;
            } else {
                if (!(universalSearchCitySelectionResult instanceof UniversalSearchCitySelectionResult.CityNotServiceable)) {
                    throw new NoWhenBranchMatchedException();
                }
                N0(((UniversalSearchCitySelectionResult.CityNotServiceable) universalSearchCitySelectionResult).b, FirebaseAnalytics.Event.SEARCH);
                E0(new ap(((CityLocationSelectionState) stateFlow.getValue()).l ? CityLocationSelectionLayoutType.FetchError : CityLocationSelectionLayoutType.NoCityAvailable, 0));
                return;
            }
        }
        if (intent.equals(CityLocationSelectionIntent.UserRefusedLocationPermission.f6595a)) {
            AnalyticsContractImplKt.a(this.p, "user refused location permission", Source.CITY_SELECTION_SCREEN, ((CityLocationSelectionState) stateFlow.getValue()).b.toSource(), null, 56);
            E0(new ko(18));
            return;
        }
        CityLocationSelectionIntent.UserRefusedLocationPermissionViaSettings userRefusedLocationPermissionViaSettings = CityLocationSelectionIntent.UserRefusedLocationPermissionViaSettings.f6596a;
        if (intent.equals(userRefusedLocationPermissionViaSettings)) {
            AnalyticsContractImplKt.a(this.p, "user refused location permission via settings", Source.CITY_SELECTION_SCREEN, ((CityLocationSelectionState) stateFlow.getValue()).b.toSource(), null, 56);
            E0(new ko(19));
            return;
        }
        if (intent.equals(CityLocationSelectionIntent.OnGpsRequestDenied.f6590a)) {
            AnalyticsContractImplKt.a(this.p, "user refused to turn gps on", Source.CITY_SELECTION_SCREEN, ((CityLocationSelectionState) stateFlow.getValue()).b.toSource(), null, 56);
            E0(new ko(20));
            return;
        }
        if (intent.equals(CityLocationSelectionIntent.ConfigFetchError.f6581a)) {
            BuildersKt.d(contextScope, null, null, new CityLocationSelectionComponent$handleConfigFetchError$1(this, null), 3);
            return;
        }
        if (intent.equals(CityLocationSelectionIntent.LocationSettingsDialogCancelClicked.f6583a)) {
            E0(new ko(16));
            M0(userRefusedLocationPermissionViaSettings);
            E0(new ko(15));
        } else {
            if (!intent.equals(CityLocationSelectionIntent.LocationSettingsDialogSettingClicked.f6584a)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new ko(21));
            this.y.i();
            E0(new ko(15));
        }
    }

    public final void N0(LatLng latLng, String str) {
        Source source = Source.CITY_SELECTION_SCREEN;
        Source source2 = ((CityLocationSelectionState) this.f.getValue()).b.toSource();
        double d = latLng.f5134a;
        double d2 = latLng.b;
        StringBuilder sbI = n21.i(d, "(", ", ");
        sbI.append(d2);
        sbI.append(")");
        AnalyticsContractImplKt.a(this.p, "city not serviceable screen", source, source2, MapsKt.i(new Pair("latLngUsed", sbI.toString()), new Pair("flowType", str)), 48);
    }

    public final void O0(RemoteConfigRunState remoteConfigRunState, boolean z) {
        AnalyticsContractImplKt.b(this.p, "city location remote config state", Source.ONBOARDING_LOCATION_SHARING_SCREEN, MapsKt.i(new Pair(RemoteConfigConstants.ResponseFieldKey.STATE, remoteConfigRunState.toString()), new Pair("isRetry", String.valueOf(z))), false, 24);
    }

    public final void P0() {
        PermissionHandler permissionHandlerC = this.w.c();
        if (permissionHandlerC == null) {
            return;
        }
        Job job = this.J;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.J = BuildersKt.d(this.j, null, null, new CityLocationSelectionComponent$requestAndHandleLocationPermission$1(permissionHandlerC, this, null), 3);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (CityLocationSelectionState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new CityLocationSelectionState(null, 2047);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new CityLocationSelectionState(null, 2047);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void y0() {
        if (this.M) {
            this.M = false;
            E0(new ko(17));
        }
        M0(new CityLocationSelectionIntent.StartLocationUpdates(CityLocationSelectionContractKt.a(this.k.c)));
    }
}
