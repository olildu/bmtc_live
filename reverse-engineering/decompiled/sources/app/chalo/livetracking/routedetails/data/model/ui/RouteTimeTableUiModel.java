package app.chalo.livetracking.routedetails.data.model.ui;

import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/RouteTimeTableUiModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteTimeTableUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeTableUiModel f4411a;
    public final ArrayList b;

    public RouteTimeTableUiModel(TimeTableUiModel timeTableUiModel, ArrayList arrayList) {
        this.f4411a = timeTableUiModel;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteTimeTableUiModel)) {
            return false;
        }
        RouteTimeTableUiModel routeTimeTableUiModel = (RouteTimeTableUiModel) obj;
        return this.f4411a.equals(routeTimeTableUiModel.f4411a) && this.b.equals(routeTimeTableUiModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4411a.hashCode() * 31);
    }

    public final String toString() {
        return "RouteTimeTableUiModel(fullTripModel=" + this.f4411a + ", shortTripModelList=" + this.b + ")";
    }
}
