package app.chalo.livetracking.routedetails.data.model.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/RouteDetailsMapStopUiModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteDetailsMapStopUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StopEtaStatus f4407a;

    public RouteDetailsMapStopUiModel(StopEtaStatus etaStatus) {
        Intrinsics.i(etaStatus, "etaStatus");
        this.f4407a = etaStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailsMapStopUiModel) || this.f4407a != ((RouteDetailsMapStopUiModel) obj).f4407a) {
            return false;
        }
        Object obj2 = StopEtaUiModel.NotAvailable.f4416a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return StopEtaUiModel.NotAvailable.f4416a.hashCode() + (this.f4407a.hashCode() * 31);
    }

    public final String toString() {
        return "RouteDetailsMapStopUiModel(stopName=, etaStatus=" + this.f4407a + ", etaModel=" + StopEtaUiModel.NotAvailable.f4416a + ")";
    }
}
