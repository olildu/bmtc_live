package defpackage;

import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsStopUiModel;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaStatus;
import app.chalo.livetracking.routedetails.data.model.ui.StopEtaUiModel;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultIntent;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsDataState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsComponentDataState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsDataState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wt0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19960a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wt0(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.f19960a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x011c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.f19960a) {
            case 0:
                PremiumBusFareDetailsDataState premiumBusFareDetailsDataState = (PremiumBusFareDetailsDataState) this.c;
                String str = (String) this.d;
                List list = (List) this.e;
                PremiumBusFareDetailsComponentDataState it = (PremiumBusFareDetailsComponentDataState) obj;
                Intrinsics.i(it, "it");
                if (!premiumBusFareDetailsDataState.e()) {
                    z = false;
                } else if (this.b >= premiumBusFareDetailsDataState.o) {
                    z = true;
                } else {
                    z = false;
                }
                return PremiumBusFareDetailsComponentDataState.a(it, null, premiumBusFareDetailsDataState, false, null, str, list, z, 13);
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                Ref.ObjectRef objectRef = (Ref.ObjectRef) this.d;
                Ref.ObjectRef objectRef2 = (Ref.ObjectRef) this.e;
                RouteDetailsDataState it2 = (RouteDetailsDataState) obj;
                Intrinsics.i(it2, "it");
                List list2 = it2.j;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list2, 10));
                int i = 0;
                for (Object obj2 : list2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    RouteDetailsStopUiModel routeDetailsStopUiModel = (RouteDetailsStopUiModel) obj2;
                    arrayList2.add(i == this.b ? RouteDetailsStopUiModel.a(routeDetailsStopUiModel, true, false, false, false, false, (StopEtaStatus) objectRef.element, (StopEtaUiModel) objectRef2.element, null, null, 15607) : RouteDetailsStopUiModel.a(routeDetailsStopUiModel, false, false, false, false, false, StopEtaStatus.ETA_NOT_AVAILABLE, StopEtaUiModel.NotAvailable.f4416a, null, null, 15607));
                    i = i2;
                }
                return RouteDetailsDataState.a(it2, false, null, null, null, null, null, null, null, null, arrayList2, null, null, null, false, false, null, null, null, null, false, null, null, false, false, false, arrayList, null, false, false, null, null, false, null, false, null, false, -268435969, 127);
            default:
                Function1 function1 = (Function1) this.c;
                TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel = (TripPlannerItineraryAppResponseModel) this.d;
                TripPlannerLegAppModel.Bus bus = (TripPlannerLegAppModel.Bus) this.e;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i3 = this.b;
                if (zBooleanValue) {
                    function1.invoke(new StopTripPlannerResultIntent.OnTrackBusClicked(tripPlannerItineraryAppResponseModel, bus, i3));
                } else {
                    function1.invoke(new StopTripPlannerResultIntent.OnTrackingNotAvailableViewDetailsClicked(tripPlannerItineraryAppResponseModel, bus, i3));
                }
                return Unit.f17538a;
        }
    }

    public /* synthetic */ wt0(ArrayList arrayList, int i, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        this.f19960a = 1;
        this.c = arrayList;
        this.b = i;
        this.d = objectRef;
        this.e = objectRef2;
    }
}
