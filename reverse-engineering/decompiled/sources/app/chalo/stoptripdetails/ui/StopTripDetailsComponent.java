package app.chalo.stoptripdetails.ui;

import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.home.nearbytrips.domain.NearbyTripsDataOrderManagerNew;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.RouteDetailsArgs;
import app.chalo.scenes.args.StopTripDetailsArgs;
import app.chalo.stoptripdetails.analytics.StopTripDetailsAnalyticsEventHelper;
import app.chalo.stoptripdetails.data.domain.FetchStopTripDetailsUseCase;
import app.chalo.stoptripdetails.data.model.app.StopTripAppModel;
import app.chalo.stoptripdetails.domain.GetEstimatedTimeUseCase;
import app.chalo.stoptripdetails.domain.GetRelevantScheduledTripFromStopTripsList;
import app.chalo.usecase.FetchCurrentLocationUseCase;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.mb1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/stoptripdetails/ui/StopTripDetailsComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/stoptripdetails/ui/StopTripDetailsIntent;", "Lapp/chalo/stoptripdetails/ui/StopTripDetailsViewState;", "Lapp/chalo/stoptripdetails/ui/StopTripDetailsSideEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StopTripDetailsComponent extends ChaloBaseStateMviComponent<StopTripDetailsIntent, StopTripDetailsViewState, StopTripDetailsViewState, StopTripDetailsSideEffect> {
    public final FetchStopTripDetailsUseCase k;
    public final StringProvider l;
    public final GetEstimatedTimeUseCase m;
    public final FetchCurrentLocationUseCase n;
    public final StopTripDetailsAnalyticsEventHelper o;
    public final GetRelevantScheduledTripFromStopTripsList p;
    public final CoroutineContextProvider q;
    public final NearbyTripsDataOrderManagerNew r;
    public final BasicInfoContract s;
    public final TimeUtilsContract t;
    public final SystemHelper u;
    public final ChaloNavigationManager v;
    public int w;
    public Job x;

    /* JADX INFO: renamed from: app.chalo.stoptripdetails.ui.StopTripDetailsComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.stoptripdetails.ui.StopTripDetailsComponent$1", f = "StopTripDetailsComponent.kt", l = {73}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return StopTripDetailsComponent.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                NearbyTripsDataOrderManagerNew nearbyTripsDataOrderManagerNew = StopTripDetailsComponent.this.r;
                this.label = 1;
                if (nearbyTripsDataOrderManagerNew.b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/stoptripdetails/ui/StopTripDetailsComponent$Companion;", "", "", "DEFAULT_DELAY_IN_MILLIS", "J", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public StopTripDetailsComponent(ComponentContext componentContext, StopTripDetailsArgs stopTripDetailsArgs, FetchStopTripDetailsUseCase fetchStopTripDetailsUseCase, StringProvider stringProvider, GetEstimatedTimeUseCase getEstimatedTimeUseCase, FetchCurrentLocationUseCase fetchCurrentLocationUseCase, StopTripDetailsAnalyticsEventHelper stopTripDetailsAnalyticsEventHelper, GetRelevantScheduledTripFromStopTripsList getRelevantScheduledTripFromStopTripsList, CoroutineContextProvider coroutineContextProvider, NearbyTripsDataOrderManagerNew nearbyTripsDataOrderManagerNew, BasicInfoContract basicInfoContract, TimeUtilsContract timeUtilsContract, SystemHelper systemHelper, ChaloNavigationManager chaloNavigationManager) {
        super(componentContext);
        this.k = fetchStopTripDetailsUseCase;
        this.l = stringProvider;
        this.m = getEstimatedTimeUseCase;
        this.n = fetchCurrentLocationUseCase;
        this.o = stopTripDetailsAnalyticsEventHelper;
        this.p = getRelevantScheduledTripFromStopTripsList;
        this.q = coroutineContextProvider;
        this.r = nearbyTripsDataOrderManagerNew;
        this.s = basicInfoContract;
        this.t = timeUtilsContract;
        this.u = systemHelper;
        this.v = chaloNavigationManager;
        BuildersKt.d(this.j, null, null, new AnonymousClass1(null), 3);
        StopTripAppModel stopTripAppModel = new StopTripAppModel(stopTripDetailsArgs.b, stopTripDetailsArgs.c, stopTripDetailsArgs.d, stopTripDetailsArgs.e);
        String str = stopTripDetailsArgs.h;
        Source source = stopTripDetailsArgs.f;
        G0(new StopTripDetailsIntent.ViewCreatedIntentStop(stopTripAppModel, str, source != null ? source.getSourceName() : null, stopTripDetailsArgs.i));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c4 -> B:25:0x00cd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object F0(app.chalo.stoptripdetails.ui.StopTripDetailsComponent r22, java.util.List r23, app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode r24, java.lang.String r25, java.lang.String r26, kotlin.coroutines.jvm.internal.ContinuationImpl r27) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.stoptripdetails.ui.StopTripDetailsComponent.F0(app.chalo.stoptripdetails.ui.StopTripDetailsComponent, java.util.List, app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void G0(StopTripDetailsIntent intent) {
        Job job;
        Intrinsics.i(intent, "intent");
        C0(intent);
        String strA = null;
        if (intent instanceof StopTripDetailsIntent.RouteDetailItemClickedIntentStop) {
            StopTripDetailsIntent.RouteDetailItemClickedIntentStop routeDetailItemClickedIntentStop = (StopTripDetailsIntent.RouteDetailItemClickedIntentStop) intent;
            RouteDetailsIntentModel routeDetailsIntentModel = new RouteDetailsIntentModel(routeDetailItemClickedIntentStop.f9514a, routeDetailItemClickedIntentStop.b, Source.TRIP_SCHEDULES_DIRECTION_SCREEN.getSourceName(), 166);
            try {
                Json json = ChaloJson.b;
                json.getClass();
                strA = json.a(RouteDetailsIntentModel.INSTANCE.serializer(), routeDetailsIntentModel);
            } catch (Exception unused) {
            }
            if (strA != null) {
                this.v.b(new ChaloNavigationRequest.Navigate(new RouteDetailsArgs(strA), null, "RouteDetailsTag", 2));
                return;
            }
            return;
        }
        boolean z = intent instanceof StopTripDetailsIntent.ViewCreatedIntentStop;
        ContextScope contextScope = this.j;
        if (!z) {
            if (!(intent instanceof StopTripDetailsIntent.ErrorScreenRetryButtonClickIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            Job job2 = this.x;
            if (job2 != null && ((AbstractCoroutine) job2).isActive() && (job = this.x) != null) {
                ((JobSupport) job).cancel(null);
            }
            E0(new mb1(6));
            StateFlow stateFlow = this.f;
            this.x = BuildersKt.d(contextScope, null, null, new StopTripDetailsComponent$fetchAllDeparturesAndLiveInfo$1(this, ((StopTripDetailsViewState) stateFlow.getValue()).f9520a, null, ((StopTripDetailsViewState) stateFlow.getValue()).b, ((StopTripDetailsViewState) stateFlow.getValue()).c, null), 3);
            return;
        }
        StopTripDetailsIntent.ViewCreatedIntentStop viewCreatedIntentStop = (StopTripDetailsIntent.ViewCreatedIntentStop) intent;
        String str = viewCreatedIntentStop.c;
        String str2 = viewCreatedIntentStop.d;
        StopTripDetailsAnalyticsEventHelper stopTripDetailsAnalyticsEventHelper = this.o;
        if (str != null && str.length() != 0) {
            StopTripAppModel stopTripAppModel = viewCreatedIntentStop.f9515a;
            stopTripDetailsAnalyticsEventHelper.f(stopTripAppModel.f9499a, stopTripAppModel.b, stopTripAppModel.d.getMode(), str);
        }
        if (str != null) {
            stopTripDetailsAnalyticsEventHelper.e(str);
            if (str2 != null && str2.length() != 0) {
                stopTripDetailsAnalyticsEventHelper.d(Source.STOP_TRIP_DETAILS_SCREEN.getSourceName(), str, str2);
            }
        }
        BuildersKt.d(contextScope, null, null, new StopTripDetailsComponent$handleViewCreatedIntent$2(this, viewCreatedIntentStop, null), 3);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (StopTripDetailsViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new StopTripDetailsViewState("", ChaloTransitMode.UNKNOWN, "", null, TripScheduleScreenType.LOADING, EmptyList.f17557a);
    }
}
