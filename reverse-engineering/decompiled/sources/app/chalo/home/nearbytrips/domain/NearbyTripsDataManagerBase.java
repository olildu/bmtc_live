package app.chalo.home.nearbytrips.domain;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.helper.CoroutineScopeHelper;
import app.chalo.location.LatLng;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.stoptripdetails.data.model.app.LocationSummaryPayloadResponseAppModel;
import app.chalo.stoptripdetails.data.model.app.NearbyTripLiveInfoRequest;
import app.chalo.stoptripdetails.domain.GetEstimatedTimeUseCase;
import app.chalo.stoptripdetails.domain.GetRelevantScheduledTripFromStopTripsList;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.CollectionUtilsKt;
import app.chalo.utils.GeometryUtils;
import app.chalo.utils.StopTripDetailsUtils;
import app.chalo.utils.timeutil.TimeUtilsContract;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/home/nearbytrips/domain/NearbyTripsDataManagerBase;", "", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NearbyTripsDataManagerBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContextProvider f3118a;
    public final CoroutineScopeHelper b;
    public final FetchNearbyTripsUseCase c;
    public final NearbyTripsDataOrderManagerNew d;
    public final GetEstimatedTimeUseCase e;
    public final GetRelevantScheduledTripFromStopTripsList f;
    public final TimeUtilsContract g;
    public final MutableStateFlow h;
    public final StateFlow i;
    public Job j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/home/nearbytrips/domain/NearbyTripsDataManagerBase$Companion;", "", "", "DEFAULT_RADIUS_TO_CONSIDER_SAME_LOCATION_IN_KM", "D", "", "HOMESCREEN_NEARBY_CARD_ETA_TIMEOUT_IN_MILLIS", "J", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public NearbyTripsDataManagerBase(CoroutineContextProvider coroutineContextProvider, CoroutineScopeHelper coroutineScopeHelper, FetchNearbyTripsUseCase fetchNearbyTripsUseCase, NearbyTripsDataOrderManagerNew nearbyTripsDataOrderManagerNew, GetEstimatedTimeUseCase getEstimatedTimeUseCase, GetRelevantScheduledTripFromStopTripsList getRelevantScheduledTripFromStopTripsList, TimeUtilsContract timeUtilsContract) {
        this.f3118a = coroutineContextProvider;
        this.b = coroutineScopeHelper;
        this.c = fetchNearbyTripsUseCase;
        this.d = nearbyTripsDataOrderManagerNew;
        this.e = getEstimatedTimeUseCase;
        this.f = getRelevantScheduledTripFromStopTripsList;
        this.g = timeUtilsContract;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new NearbyTripsDataManagerState(null, NearbyTripsFetchStatus.UnInitialised.f3137a));
        this.h = mutableStateFlowA;
        this.i = FlowKt.c(mutableStateFlowA);
    }

    public final void a(LatLng requestLatLng, ChaloTransitMode transitMode, ContextScope scope) {
        Intrinsics.i(requestLatLng, "requestLatLng");
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(scope, "scope");
        if (e(requestLatLng, 0.1d)) {
            Job job = this.j;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            this.j = BuildersKt.d(scope, this.f3118a.b(), null, new NearbyTripsDataManagerBase$fetchNearbyTrips$1(this, requestLatLng, transitMode, 1000, 1, false, null), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(LatLng latLng, int i, ChaloTransitMode chaloTransitMode, boolean z, boolean z2, double d, ContinuationImpl continuationImpl) {
        NearbyTripsDataManagerBase$fetchNearbyTripsAsync$1 nearbyTripsDataManagerBase$fetchNearbyTripsAsync$1;
        MutableStateFlow mutableStateFlow;
        Object value;
        LatLng latLng2;
        int i2;
        if (continuationImpl instanceof NearbyTripsDataManagerBase$fetchNearbyTripsAsync$1) {
            nearbyTripsDataManagerBase$fetchNearbyTripsAsync$1 = (NearbyTripsDataManagerBase$fetchNearbyTripsAsync$1) continuationImpl;
            int i3 = nearbyTripsDataManagerBase$fetchNearbyTripsAsync$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nearbyTripsDataManagerBase$fetchNearbyTripsAsync$1.label = i3 - Integer.MIN_VALUE;
            } else {
                nearbyTripsDataManagerBase$fetchNearbyTripsAsync$1 = new NearbyTripsDataManagerBase$fetchNearbyTripsAsync$1(this, continuationImpl);
            }
        } else {
            nearbyTripsDataManagerBase$fetchNearbyTripsAsync$1 = new NearbyTripsDataManagerBase$fetchNearbyTripsAsync$1(this, continuationImpl);
        }
        Object objF = nearbyTripsDataManagerBase$fetchNearbyTripsAsync$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = nearbyTripsDataManagerBase$fetchNearbyTripsAsync$1.label;
        if (i4 == 0) {
            ResultKt.b(objF);
            if (z || e(latLng, d)) {
                do {
                    mutableStateFlow = this.h;
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.c(value, NearbyTripsDataManagerState.a((NearbyTripsDataManagerState) value, new NearbyTripsFetchStatus.InProgress(latLng))));
                NearbyTripsApiType nearbyTripsApiType = z2 ? NearbyTripsApiType.NEW_WITH_ROUTE_STATUS_UPDATE : NearbyTripsApiType.NEW;
                nearbyTripsDataManagerBase$fetchNearbyTripsAsync$1.L$0 = latLng;
                nearbyTripsDataManagerBase$fetchNearbyTripsAsync$1.L$1 = chaloTransitMode;
                nearbyTripsDataManagerBase$fetchNearbyTripsAsync$1.I$0 = i;
                nearbyTripsDataManagerBase$fetchNearbyTripsAsync$1.label = 1;
                objF = this.c.f(latLng, chaloTransitMode, i, null, nearbyTripsApiType, nearbyTripsDataManagerBase$fetchNearbyTripsAsync$1);
                if (objF == coroutineSingletons) {
                    return coroutineSingletons;
                }
                latLng2 = latLng;
                i2 = i;
            }
            return Unit.f17538a;
        }
        if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i2 = nearbyTripsDataManagerBase$fetchNearbyTripsAsync$1.I$0;
        chaloTransitMode = (ChaloTransitMode) nearbyTripsDataManagerBase$fetchNearbyTripsAsync$1.L$1;
        latLng2 = (LatLng) nearbyTripsDataManagerBase$fetchNearbyTripsAsync$1.L$0;
        ResultKt.b(objF);
        d(latLng2, i2, chaloTransitMode, (ChaloUseCaseResult) objF);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(LocationSummaryPayloadResponseAppModel locationSummaryPayloadResponseAppModel, ContinuationImpl continuationImpl) {
        NearbyTripsDataManagerBase$getLiveInfo$1 nearbyTripsDataManagerBase$getLiveInfo$1;
        if (continuationImpl instanceof NearbyTripsDataManagerBase$getLiveInfo$1) {
            nearbyTripsDataManagerBase$getLiveInfo$1 = (NearbyTripsDataManagerBase$getLiveInfo$1) continuationImpl;
            int i = nearbyTripsDataManagerBase$getLiveInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nearbyTripsDataManagerBase$getLiveInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                nearbyTripsDataManagerBase$getLiveInfo$1 = new NearbyTripsDataManagerBase$getLiveInfo$1(this, continuationImpl);
            }
        } else {
            nearbyTripsDataManagerBase$getLiveInfo$1 = new NearbyTripsDataManagerBase$getLiveInfo$1(this, continuationImpl);
        }
        Object objF = nearbyTripsDataManagerBase$getLiveInfo$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nearbyTripsDataManagerBase$getLiveInfo$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            nearbyTripsDataManagerBase$getLiveInfo$1.label = 1;
            objF = f(locationSummaryPayloadResponseAppModel, nearbyTripsDataManagerBase$getLiveInfo$1);
            if (objF != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
            return objF;
        }
        ResultKt.b(objF);
        nearbyTripsDataManagerBase$getLiveInfo$1.label = 2;
        Object objC = this.d.c((NearbyTripLiveInfoRequest) objF, nearbyTripsDataManagerBase$getLiveInfo$1);
        return objC == obj ? obj : objC;
    }

    public final void d(LatLng latLng, int i, ChaloTransitMode chaloTransitMode, ChaloUseCaseResult chaloUseCaseResult) {
        Object value;
        NearbyTripsDataHolder nearbyTripsDataHolder;
        Object value2;
        boolean z = chaloUseCaseResult instanceof ChaloUseCaseResult.Failure;
        MutableStateFlow mutableStateFlow = this.h;
        if (z) {
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value2, NearbyTripsDataManagerState.a((NearbyTripsDataManagerState) value2, new NearbyTripsFetchStatus.Error.Failure(latLng, (NearbyTripsFetchFailedReasons) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a))));
            return;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        List<LocationSummaryPayloadResponseAppModel> listB = CollectionUtilsKt.b(i, (List) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
        ArrayList arrayList = new ArrayList(CollectionsKt.v(listB, 10));
        for (LocationSummaryPayloadResponseAppModel locationSummaryPayloadResponseAppModel : listB) {
            List summary = StopTripDetailsUtils.a(locationSummaryPayloadResponseAppModel.b, chaloTransitMode, this.f);
            String str = locationSummaryPayloadResponseAppModel.f9494a;
            String str2 = locationSummaryPayloadResponseAppModel.c;
            Double d = locationSummaryPayloadResponseAppModel.d;
            StopAppModel stopAppModel = locationSummaryPayloadResponseAppModel.e;
            String stopId = locationSummaryPayloadResponseAppModel.f;
            Intrinsics.i(summary, "summary");
            Intrinsics.i(stopId, "stopId");
            arrayList.add(new LocationSummaryPayloadResponseAppModel(str, summary, str2, d, stopAppModel, stopId));
        }
        do {
            value = mutableStateFlow.getValue();
            nearbyTripsDataHolder = new NearbyTripsDataHolder(latLng, arrayList);
            ((NearbyTripsDataManagerState) value).getClass();
        } while (!mutableStateFlow.c(value, new NearbyTripsDataManagerState(nearbyTripsDataHolder, NearbyTripsFetchStatus.Fetched.f3135a)));
    }

    public final boolean e(LatLng latLng, double d) {
        LatLng latLng2;
        LatLng latLng3;
        StateFlow stateFlow = this.i;
        NearbyTripsFetchStatus nearbyTripsFetchStatus = ((NearbyTripsDataManagerState) stateFlow.getValue()).b;
        if ((nearbyTripsFetchStatus instanceof NearbyTripsFetchStatus.UnInitialised) || (nearbyTripsFetchStatus instanceof NearbyTripsFetchStatus.Error)) {
            return true;
        }
        NearbyTripsFetchStatus nearbyTripsFetchStatus2 = ((NearbyTripsDataManagerState) stateFlow.getValue()).b;
        NearbyTripsFetchStatus.InProgress inProgress = nearbyTripsFetchStatus2 instanceof NearbyTripsFetchStatus.InProgress ? (NearbyTripsFetchStatus.InProgress) nearbyTripsFetchStatus2 : null;
        if (inProgress != null && (latLng3 = inProgress.f3136a) != null && GeometryUtils.c(latLng3, latLng) > d) {
            return true;
        }
        NearbyTripsDataHolder nearbyTripsDataHolder = ((NearbyTripsDataManagerState) stateFlow.getValue()).f3122a;
        return (nearbyTripsDataHolder == null || (latLng2 = nearbyTripsDataHolder.f3117a) == null || GeometryUtils.c(latLng2, latLng) <= d) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0092 -> B:21:0x0093). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(app.chalo.stoptripdetails.data.model.app.LocationSummaryPayloadResponseAppModel r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerBase$toNearbyLiveInfoRequest$1
            if (r0 == 0) goto L13
            r0 = r13
            app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerBase$toNearbyLiveInfoRequest$1 r0 = (app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerBase$toNearbyLiveInfoRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerBase$toNearbyLiveInfoRequest$1 r0 = new app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerBase$toNearbyLiveInfoRequest$1
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L4b
            if (r2 != r3) goto L43
            java.lang.Object r12 = r0.L$6
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.Object r2 = r0.L$5
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.L$4
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.L$3
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.L$2
            app.chalo.stoptripdetails.data.model.app.StopTripDetailsAppModel r6 = (app.chalo.stoptripdetails.data.model.app.StopTripDetailsAppModel) r6
            java.lang.Object r7 = r0.L$1
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.L$0
            java.util.Collection r8 = (java.util.Collection) r8
            kotlin.ResultKt.b(r13)
            goto L93
        L43:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L4b:
            kotlin.ResultKt.b(r13)
            java.lang.String r13 = r12.f
            java.util.List r12 = r12.b
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.v(r12, r4)
            r2.<init>(r4)
            java.util.Iterator r12 = r12.iterator()
            r7 = r12
            r12 = r2
            r2 = r13
        L66:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto Lac
            java.lang.Object r13 = r7.next()
            r6 = r13
            app.chalo.stoptripdetails.data.model.app.StopTripDetailsAppModel r6 = (app.chalo.stoptripdetails.data.model.app.StopTripDetailsAppModel) r6
            java.lang.String r4 = r6.getF9501a()
            java.lang.String r5 = r6.d
            r0.L$0 = r12
            r0.L$1 = r7
            r0.L$2 = r6
            r0.L$3 = r5
            r0.L$4 = r4
            r0.L$5 = r2
            r0.L$6 = r12
            r0.label = r3
            app.chalo.stoptripdetails.domain.GetEstimatedTimeUseCase r13 = r11.e
            java.lang.Object r13 = r13.a(r6, r0)
            if (r13 != r1) goto L92
            return r1
        L92:
            r8 = r12
        L93:
            app.chalo.stoptripdetails.data.model.app.EstimatedTime r13 = (app.chalo.stoptripdetails.data.model.app.EstimatedTime) r13
            app.chalo.stoptripdetails.data.model.app.EstimatedTimeType r13 = r13.b
            app.chalo.utils.timeutil.TimeUtilsContract r9 = r11.g
            r10 = 0
            int r9 = r9.B(r10)
            int r6 = r6.b(r9)
            app.chalo.stoptripdetails.data.model.app.NearbyTripSummaryStaticData r9 = new app.chalo.stoptripdetails.data.model.app.NearbyTripSummaryStaticData
            r9.<init>(r4, r5, r13, r6)
            r12.add(r9)
            r12 = r8
            goto L66
        Lac:
            java.util.List r12 = (java.util.List) r12
            app.chalo.stoptripdetails.data.model.app.NearbyTripLiveInfoRequest r13 = new app.chalo.stoptripdetails.data.model.app.NearbyTripLiveInfoRequest
            r13.<init>(r2, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerBase.f(app.chalo.stoptripdetails.data.model.app.LocationSummaryPayloadResponseAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
