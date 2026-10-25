package app.chalo.premiumbus.ui.changestop;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.domain.FetchRouteDataFromRemoteUseCase;
import app.chalo.compose.components.chalomap.LatLngBoundsUtils;
import app.chalo.compose.components.chalomap.MapCameraViewState;
import app.chalo.constants.Source;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager;
import app.chalo.livetracking.tripplanner.domain.TripPlannerItineraryLiveInfoManager;
import app.chalo.location.LatLng;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.premiumbus.data.models.app.EligibleStopAppModel;
import app.chalo.premiumbus.domain.FetchEligibleStopChangesUseCase;
import app.chalo.premiumbus.domain.FetchEligibleStopsFailureReason;
import app.chalo.premiumbus.domain.ProcessStopChangeRequestUseCase;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.PremiumBusActivationArgs;
import app.chalo.scenes.args.PremiumBusChangeStopArgs;
import app.chalo.utils.SystemHelper;
import com.arkivanov.decompose.ComponentContext;
import defpackage.et0;
import defpackage.gt0;
import defpackage.hj0;
import defpackage.vo1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent;", "Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopDataState;", "Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopViewState;", "Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopEffect;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusChangeStopComponent extends ChaloBaseStateMviComponent<PremiumBusChangeStopIntent, PremiumBusChangeStopDataState, PremiumBusChangeStopViewState, PremiumBusChangeStopEffect> {
    public final PremiumBusChangeStopArgs k;
    public final FetchEligibleStopChangesUseCase l;
    public final ProcessStopChangeRequestUseCase m;
    public final FetchRouteDataFromRemoteUseCase n;
    public final TripPlannerItineraryLiveInfoManager o;
    public final LiveTrackingDataManager p;
    public final LatLngBoundsUtils q;
    public final KotlinToastManager r;
    public final StringProvider s;
    public final ChaloNavigationManager t;
    public final SystemHelper u;
    public final PremiumBusChangeStopUIStateFactory v;
    public final AnalyticsContract w;
    public Job x;
    public Job y;
    public Job z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7525a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[FetchEligibleStopsFailureReason.values().length];
            try {
                iArr[FetchEligibleStopsFailureReason.SERVER_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FetchEligibleStopsFailureReason.LOCAL_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FetchEligibleStopsFailureReason.PARSE_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FetchEligibleStopsFailureReason.UNKNOWN_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7525a = iArr;
            int[] iArr2 = new int[ChangeStopFailureType.values().length];
            try {
                iArr2[ChangeStopFailureType.GENERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ChangeStopFailureType.LOAD_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ChangeStopFailureType.STOP_CHANGE_WINDOW_PASSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ChangeStopFailureType.STOP_NOT_ELIGIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    public PremiumBusChangeStopComponent(ComponentContext componentContext, PremiumBusChangeStopArgs premiumBusChangeStopArgs, FetchEligibleStopChangesUseCase fetchEligibleStopChangesUseCase, ProcessStopChangeRequestUseCase processStopChangeRequestUseCase, FetchRouteDataFromRemoteUseCase fetchRouteDataFromRemoteUseCase, TripPlannerItineraryLiveInfoManager tripPlannerItineraryLiveInfoManager, LiveTrackingDataManager liveTrackingDataManager, LatLngBoundsUtils latLngBoundsUtils, KotlinToastManager kotlinToastManager, StringProvider stringProvider, ChaloNavigationManager chaloNavigationManager, SystemHelper systemHelper, PremiumBusChangeStopUIStateFactory premiumBusChangeStopUIStateFactory, AnalyticsContract analyticsContract) {
        super(componentContext);
        this.k = premiumBusChangeStopArgs;
        this.l = fetchEligibleStopChangesUseCase;
        this.m = processStopChangeRequestUseCase;
        this.n = fetchRouteDataFromRemoteUseCase;
        this.o = tripPlannerItineraryLiveInfoManager;
        this.p = liveTrackingDataManager;
        this.q = latLngBoundsUtils;
        this.r = kotlinToastManager;
        this.s = stringProvider;
        this.t = chaloNavigationManager;
        this.u = systemHelper;
        this.v = premiumBusChangeStopUIStateFactory;
        this.w = analyticsContract;
        F0(new PremiumBusChangeStopIntent.InitializationIntent(premiumBusChangeStopArgs));
    }

    public final void F0(PremiumBusChangeStopIntent intent) {
        String str;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof PremiumBusChangeStopIntent.InitializationIntent;
        int i = 3;
        ContextScope contextScope = this.j;
        Object obj = null;
        if (z) {
            PremiumBusChangeStopArgs premiumBusChangeStopArgs = ((PremiumBusChangeStopIntent.InitializationIntent) intent).f7532a;
            E0(new et0(premiumBusChangeStopArgs, i));
            Source source = Source.PREMIUM_BUS_CHANGE_STOP_SCREEN;
            Source source2 = premiumBusChangeStopArgs.h;
            String str2 = premiumBusChangeStopArgs.b;
            Pair pair = new Pair("bookingId", str2);
            Pair pair2 = new Pair("from stop id", premiumBusChangeStopArgs.c);
            Pair pair3 = new Pair("to stop id", premiumBusChangeStopArgs.d);
            String str3 = premiumBusChangeStopArgs.e;
            AnalyticsContractImplKt.a(this.w, "pb change stop screen shown", source, source2, MapsKt.i(pair, pair2, pair3, new Pair("route id", str3), new Pair("vehicleNo", premiumBusChangeStopArgs.f), new Pair("isLiveTrackingActive", Boolean.valueOf(premiumBusChangeStopArgs.g))), 48);
            Job job = this.x;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            this.x = BuildersKt.d(contextScope, null, null, new PremiumBusChangeStopComponent$fetchEligibleStopsAndRouteInfo$1(this, str3, str2, null), 3);
            return;
        }
        if (intent instanceof PremiumBusChangeStopIntent.StopSelectedIntent) {
            E0(new hj0(((PremiumBusChangeStopIntent.StopSelectedIntent) intent).f7535a, 26));
            return;
        }
        boolean zEquals = intent.equals(PremiumBusChangeStopIntent.ConfirmStopIntent.f7530a);
        StateFlow stateFlow = this.f;
        if (zEquals) {
            PremiumBusChangeStopDataState premiumBusChangeStopDataState = (PremiumBusChangeStopDataState) stateFlow.getValue();
            String str4 = premiumBusChangeStopDataState.g;
            if (Intrinsics.d(str4, premiumBusChangeStopDataState.b)) {
                return;
            }
            BuildersKt.d(contextScope, null, null, new PremiumBusChangeStopComponent$handleConfirmStopIntent$1(premiumBusChangeStopDataState, str4, this, null), 3);
            return;
        }
        boolean zEquals2 = intent.equals(PremiumBusChangeStopIntent.BackPressed.f7529a);
        ChaloNavigationManager chaloNavigationManager = this.t;
        if (zEquals2) {
            ChaloNavigationManagerKt.c(chaloNavigationManager);
            return;
        }
        if (intent.equals(PremiumBusChangeStopIntent.OnResultScreenAnimationComplete.f7533a)) {
            ChangeStopScreenState changeStopScreenState = ((PremiumBusChangeStopDataState) stateFlow.getValue()).o;
            if (Intrinsics.d(changeStopScreenState, ChangeStopScreenState.Confirming.f7518a) || Intrinsics.d(changeStopScreenState, ChangeStopScreenState.Loading.f7520a) || Intrinsics.d(changeStopScreenState, ChangeStopScreenState.StopSelection.f7521a)) {
                return;
            }
            if (!(changeStopScreenState instanceof ChangeStopScreenState.Failure)) {
                if (!Intrinsics.d(changeStopScreenState, ChangeStopScreenState.Success.f7522a)) {
                    throw new NoWhenBranchMatchedException();
                }
                String str5 = ((PremiumBusChangeStopDataState) stateFlow.getValue()).f7528a;
                if (str5 == null || str5.length() == 0) {
                    BuildersKt.d(contextScope, null, null, new PremiumBusChangeStopComponent$handleOnResultScreenAnimationCompleteIntent$2(this, null), 3);
                    return;
                } else {
                    ChaloNavigationManagerKt.e(chaloNavigationManager, new PremiumBusActivationArgs(Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN, str5, "mobileTicket", "premiumReserveTicket", false), new ChaloNavOptions(new PopUpToConfig.Scene(ChaloScenes.PremiumBusActivation, true), 3), 4);
                    return;
                }
            }
            int i2 = WhenMappings.b[((ChangeStopScreenState.Failure) changeStopScreenState).f7519a.ordinal()];
            if (i2 == 1) {
                E0(new gt0(13));
                return;
            } else {
                if (i2 != 2) {
                    if (i2 != 3 && i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ChaloNavigationManagerKt.c(chaloNavigationManager);
                    return;
                }
                return;
            }
        }
        if (intent.equals(PremiumBusChangeStopIntent.RetryLoadIntent.f7534a)) {
            E0(new gt0(11));
            PremiumBusChangeStopArgs premiumBusChangeStopArgs2 = this.k;
            String str6 = premiumBusChangeStopArgs2.b;
            String str7 = premiumBusChangeStopArgs2.e;
            Job job2 = this.x;
            if (job2 != null) {
                ((JobSupport) job2).cancel(null);
            }
            this.x = BuildersKt.d(contextScope, null, null, new PremiumBusChangeStopComponent$fetchEligibleStopsAndRouteInfo$1(this, str7, str6, null), 3);
            return;
        }
        if (!(intent instanceof PremiumBusChangeStopIntent.DirectionsClickedIntent)) {
            throw new NoWhenBranchMatchedException();
        }
        PremiumBusChangeStopDataState premiumBusChangeStopDataState2 = (PremiumBusChangeStopDataState) stateFlow.getValue();
        Map map = premiumBusChangeStopDataState2.j;
        String str8 = ((PremiumBusChangeStopIntent.DirectionsClickedIntent) intent).f7531a;
        LatLng latLng = (LatLng) map.get(str8);
        if (latLng == null) {
            return;
        }
        for (Object obj2 : premiumBusChangeStopDataState2.f) {
            if (Intrinsics.d(((EligibleStopAppModel) obj2).f7080a, str8)) {
                obj = obj2;
                break;
            }
        }
        EligibleStopAppModel eligibleStopAppModel = (EligibleStopAppModel) obj;
        if (eligibleStopAppModel == null || (str = eligibleStopAppModel.b) == null) {
            return;
        }
        AnalyticsContractImplKt.a(this.w, "pb change stop directions clicked", Source.PREMIUM_BUS_CHANGE_STOP_SCREEN, Source.NONE, vo1.s("stop id", str8), 48);
        this.u.h(latLng, str);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        PremiumBusChangeStopComponent$convertToUiState$2 premiumBusChangeStopComponent$convertToUiState$2 = new PremiumBusChangeStopComponent$convertToUiState$2(1, this, PremiumBusChangeStopComponent.class, "processIntent", "processIntent(Lapp/chalo/premiumbus/ui/changestop/PremiumBusChangeStopIntent;)V", 0);
        return this.v.g((PremiumBusChangeStopDataState) obj, premiumBusChangeStopComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new PremiumBusChangeStopDataState(null, null, null, null, null, EmptyList.f17557a, null, MapsKt.d(), "", MapsKt.d(), null, null, null, MapCameraViewState.InitialState.NoState.f1881a, ChangeStopScreenState.Loading.f7520a);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void x0() {
        Job job = this.x;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        Job job2 = this.y;
        if (job2 != null) {
            ((JobSupport) job2).cancel(null);
        }
        Job job3 = this.z;
        if (job3 != null) {
            ((JobSupport) job3).cancel(null);
        }
        this.o.e();
    }
}
