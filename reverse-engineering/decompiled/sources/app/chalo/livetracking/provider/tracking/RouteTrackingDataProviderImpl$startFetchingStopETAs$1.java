package app.chalo.livetracking.provider.tracking;

import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.compose.components.chalomap.LiveBusDelayedState;
import app.chalo.livetracking.provider.tracking.model.EstimatedEtaAppModel;
import app.chalo.livetracking.provider.tracking.model.FixedEtaAppModel;
import app.chalo.livetracking.provider.tracking.model.StopLiveEtaAppModel;
import app.chalo.livetracking.routedetails.data.model.app.response.VehicleSeatAvailabilityDetailsAppModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "Lapp/chalo/livetracking/provider/tracking/LiveStopEtaResult$Success;", "etaResult", "seatAvailabilityList", "", "Lapp/chalo/livetracking/routedetails/data/model/app/response/VehicleSeatAvailabilityDetailsAppModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.provider.tracking.RouteTrackingDataProviderImpl$startFetchingStopETAs$1", f = "RouteTrackingDataProviderImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RouteTrackingDataProviderImpl$startFetchingStopETAs$1 extends SuspendLambda implements Function3<LiveStopEtaResult.Success, List<? extends VehicleSeatAvailabilityDetailsAppModel>, Continuation<? super LiveStopEtaResult.Success>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RouteTrackingDataProviderImpl$startFetchingStopETAs$1 routeTrackingDataProviderImpl$startFetchingStopETAs$1 = new RouteTrackingDataProviderImpl$startFetchingStopETAs$1(3, (Continuation) obj3);
        routeTrackingDataProviderImpl$startFetchingStopETAs$1.L$0 = (LiveStopEtaResult.Success) obj;
        routeTrackingDataProviderImpl$startFetchingStopETAs$1.L$1 = (List) obj2;
        return routeTrackingDataProviderImpl$startFetchingStopETAs$1.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        SeatAvailabilityLevel seatAvailabilityLevel;
        Object next2;
        SeatAvailabilityLevel seatAvailabilityLevel2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        LiveStopEtaResult.Success success = (LiveStopEtaResult.Success) this.L$0;
        List seatAvailabilityDetailsList = (List) this.L$1;
        StopLiveEtaAppModel estimatedEta = success.f4339a;
        Intrinsics.i(estimatedEta, "<this>");
        Intrinsics.i(seatAvailabilityDetailsList, "seatAvailabilityDetailsList");
        if (estimatedEta instanceof StopLiveEtaAppModel.FixedEta) {
            List<FixedEtaAppModel> list = ((StopLiveEtaAppModel.FixedEta) estimatedEta).f4373a;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            for (FixedEtaAppModel fixedEtaAppModel : list) {
                Iterator it = seatAvailabilityDetailsList.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (!Intrinsics.d(((VehicleSeatAvailabilityDetailsAppModel) next2).f4397a, fixedEtaAppModel.c));
                VehicleSeatAvailabilityDetailsAppModel vehicleSeatAvailabilityDetailsAppModel = (VehicleSeatAvailabilityDetailsAppModel) next2;
                if (vehicleSeatAvailabilityDetailsAppModel == null || (seatAvailabilityLevel2 = vehicleSeatAvailabilityDetailsAppModel.b) == null) {
                    seatAvailabilityLevel2 = SeatAvailabilityLevel.UNKNOWN;
                }
                SeatAvailabilityLevel seatAvailabilityLevel3 = seatAvailabilityLevel2;
                long j = fixedEtaAppModel.f4367a;
                boolean z = fixedEtaAppModel.b;
                String vehicleNumber = fixedEtaAppModel.c;
                LiveBusDelayedState delayedState = fixedEtaAppModel.d;
                Intrinsics.i(vehicleNumber, "vehicleNumber");
                Intrinsics.i(delayedState, "delayedState");
                Intrinsics.i(seatAvailabilityLevel3, "seatAvailabilityLevel");
                arrayList.add(new FixedEtaAppModel(j, z, vehicleNumber, delayedState, seatAvailabilityLevel3));
            }
            estimatedEta = new StopLiveEtaAppModel.FixedEta(arrayList);
        } else if (estimatedEta instanceof StopLiveEtaAppModel.EstimatedEta) {
            ArrayList arrayList2 = ((StopLiveEtaAppModel.EstimatedEta) estimatedEta).f4372a;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.v(arrayList2, 10));
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                EstimatedEtaAppModel estimatedEtaAppModel = (EstimatedEtaAppModel) obj2;
                Iterator it2 = seatAvailabilityDetailsList.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.d(((VehicleSeatAvailabilityDetailsAppModel) next).f4397a, estimatedEtaAppModel.d));
                VehicleSeatAvailabilityDetailsAppModel vehicleSeatAvailabilityDetailsAppModel2 = (VehicleSeatAvailabilityDetailsAppModel) next;
                if (vehicleSeatAvailabilityDetailsAppModel2 == null || (seatAvailabilityLevel = vehicleSeatAvailabilityDetailsAppModel2.b) == null) {
                    seatAvailabilityLevel = SeatAvailabilityLevel.UNKNOWN;
                }
                long j2 = estimatedEtaAppModel.f4365a;
                long j3 = estimatedEtaAppModel.b;
                boolean z2 = estimatedEtaAppModel.c;
                String vehicleNumber2 = estimatedEtaAppModel.d;
                Intrinsics.i(vehicleNumber2, "vehicleNumber");
                Intrinsics.i(seatAvailabilityLevel, "seatAvailabilityLevel");
                arrayList3.add(new EstimatedEtaAppModel(j2, j3, z2, vehicleNumber2, seatAvailabilityLevel));
            }
            estimatedEta = new StopLiveEtaAppModel.EstimatedEta(arrayList3);
        } else if (!estimatedEta.equals(StopLiveEtaAppModel.NotAvailable.f4374a) && !estimatedEta.equals(StopLiveEtaAppModel.AllBusPassed.f4371a)) {
            throw new NoWhenBranchMatchedException();
        }
        return new LiveStopEtaResult.Success(estimatedEta);
    }
}
