package app.chalo.titoridedetail.manager;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.compose.components.chalomap.LiveBusDelayedState;
import app.chalo.compose.components.chalomap.MapUtilsKt;
import app.chalo.compose.components.chalomap.PolylineUtils;
import app.chalo.constants.Source;
import app.chalo.helper.CoroutineScopeHelper;
import app.chalo.livetracking.frameworklivetracking.LiveTrackingDataManager;
import app.chalo.livetracking.frameworklivetracking.domain.CheckLiveBusDelayedUseCase;
import app.chalo.livetracking.provider.tracking.RouteTrackingDataProvider;
import app.chalo.livetracking.routedetails.RouteDetailsUtils;
import app.chalo.location.LatLng;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.tito.data.TITOValidationDataRepository;
import app.chalo.titoridedetail.data.app.TITOValidationAppModel;
import app.chalo.titoridedetail.data.app.TapInDetailAppModel;
import app.chalo.titoridedetail.data.app.TitoRideDataAppModel;
import app.chalo.titoridedetail.data.app.TitoRideDetailBusDataAppModel;
import app.chalo.utils.GeometryUtils;
import app.chalo.utils.timeutil.TimeUtilsContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/manager/TitoRideDataManagerImpl;", "Lapp/chalo/titoridedetail/manager/TitoRideDataManager;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TitoRideDataManagerImpl implements TitoRideDataManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScopeHelper f9694a;
    public final LiveTrackingDataManager b;
    public final RouteTrackingDataProvider c;
    public final StringProvider d;
    public final CheckLiveBusDelayedUseCase e;
    public final TITOValidationDataRepository f;
    public final AnalyticsContract g;
    public final PolylineUtils h;
    public final TimeUtilsContract i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public Job l;
    public Job m;
    public final MutexImpl n;

    public TitoRideDataManagerImpl(CoroutineScopeHelper coroutineScopeHelper, LiveTrackingDataManager liveTrackingDataManager, RouteTrackingDataProvider routeTrackingDataProvider, StringProvider stringProvider, CheckLiveBusDelayedUseCase checkLiveBusDelayedUseCase, TITOValidationDataRepository tITOValidationDataRepository, AnalyticsContract analyticsContract, PolylineUtils polylineUtils, TimeUtilsContract timeUtilsContract) {
        this.f9694a = coroutineScopeHelper;
        this.b = liveTrackingDataManager;
        this.c = routeTrackingDataProvider;
        this.d = stringProvider;
        this.e = checkLiveBusDelayedUseCase;
        this.f = tITOValidationDataRepository;
        this.g = analyticsContract;
        this.h = polylineUtils;
        this.i = timeUtilsContract;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(null);
        this.j = mutableStateFlowA;
        this.k = FlowKt.c(mutableStateFlowA);
        this.n = MutexKt.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(TitoRideDataManagerImpl titoRideDataManagerImpl, String str, LatLng latLng, long j, boolean z, RouteAppModel routeAppModel, ContinuationImpl continuationImpl) {
        TitoRideDataManagerImpl$getVehicleLiveData$1 titoRideDataManagerImpl$getVehicleLiveData$1;
        titoRideDataManagerImpl.getClass();
        if (continuationImpl instanceof TitoRideDataManagerImpl$getVehicleLiveData$1) {
            titoRideDataManagerImpl$getVehicleLiveData$1 = (TitoRideDataManagerImpl$getVehicleLiveData$1) continuationImpl;
            int i = titoRideDataManagerImpl$getVehicleLiveData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                titoRideDataManagerImpl$getVehicleLiveData$1.label = i - Integer.MIN_VALUE;
            } else {
                titoRideDataManagerImpl$getVehicleLiveData$1 = new TitoRideDataManagerImpl$getVehicleLiveData$1(titoRideDataManagerImpl, continuationImpl);
            }
        } else {
            titoRideDataManagerImpl$getVehicleLiveData$1 = new TitoRideDataManagerImpl$getVehicleLiveData$1(titoRideDataManagerImpl, continuationImpl);
        }
        Object objA = titoRideDataManagerImpl$getVehicleLiveData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = titoRideDataManagerImpl$getVehicleLiveData$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            CheckLiveBusDelayedUseCase checkLiveBusDelayedUseCase = titoRideDataManagerImpl.e;
            titoRideDataManagerImpl$getVehicleLiveData$1.L$0 = str;
            titoRideDataManagerImpl$getVehicleLiveData$1.L$1 = latLng;
            titoRideDataManagerImpl$getVehicleLiveData$1.L$2 = routeAppModel;
            titoRideDataManagerImpl$getVehicleLiveData$1.Z$0 = z;
            titoRideDataManagerImpl$getVehicleLiveData$1.label = 1;
            objA = checkLiveBusDelayedUseCase.a(j, titoRideDataManagerImpl$getVehicleLiveData$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = titoRideDataManagerImpl$getVehicleLiveData$1.Z$0;
            routeAppModel = (RouteAppModel) titoRideDataManagerImpl$getVehicleLiveData$1.L$2;
            latLng = (LatLng) titoRideDataManagerImpl$getVehicleLiveData$1.L$1;
            str = (String) titoRideDataManagerImpl$getVehicleLiveData$1.L$0;
            ResultKt.b(objA);
        }
        boolean z2 = z;
        LiveBusDelayedState liveBusDelayedState = (LiveBusDelayedState) objA;
        String str2 = routeAppModel.m;
        PolylineUtils polylineUtils = titoRideDataManagerImpl.h;
        List list = routeAppModel.e;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((StopAppModel) it.next()).c);
        }
        LatLng latLngA = RouteDetailsUtils.a(latLng, MapUtilsKt.a(str2, polylineUtils, arrayList));
        Float f = latLngA != null ? new Float((float) GeometryUtils.a(latLng, latLngA)) : null;
        return new TitoRideDetailBusDataAppModel(str, latLng, z2, liveBusDelayedState, f != null ? f.floatValue() : 0.0f);
    }

    @Override // app.chalo.titoridedetail.manager.TitoRideDataManager
    /* JADX INFO: renamed from: a, reason: from getter */
    public final StateFlow getK() {
        return this.k;
    }

    @Override // app.chalo.titoridedetail.manager.TitoRideDataManager
    public final void b(ContextScope parentScope) {
        Intrinsics.i(parentScope, "parentScope");
        this.f9694a.b(parentScope);
    }

    @Override // app.chalo.titoridedetail.manager.TitoRideDataManager
    public final void c(String tapId, boolean z, Source source, Source previousScreenSource) {
        CoroutineScope coroutineScopeA;
        TITOValidationAppModel tITOValidationAppModel;
        TapInDetailAppModel tapInDetailAppModel;
        Intrinsics.i(tapId, "tapId");
        Intrinsics.i(source, "source");
        Intrinsics.i(previousScreenSource, "previousScreenSource");
        TitoRideDataAppModel titoRideDataAppModel = (TitoRideDataAppModel) this.j.getValue();
        if ((!tapId.equals((titoRideDataAppModel == null || (tITOValidationAppModel = titoRideDataAppModel.f9677a) == null || (tapInDetailAppModel = tITOValidationAppModel.f9672a) == null) ? null : tapInDetailAppModel.f9673a) || z) && (coroutineScopeA = this.f9694a.a()) != null) {
            BuildersKt.d(coroutineScopeA, null, null, new TitoRideDataManagerImpl$fetchActiveTitoRideData$1(this, tapId, source, previousScreenSource, null), 3);
        }
    }
}
