package app.chalo.livetracking.routedetails.data.model.ui;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/BusMapInfoWindowUiModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BusMapInfoWindowUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4398a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final BusMapInfoWindowViewType h;

    public BusMapInfoWindowUiModel(String streamId, String busNumber, String nextStopId, String lastStopId, String eta, String lastUpdated, String location, BusMapInfoWindowViewType viewType) {
        Intrinsics.i(streamId, "streamId");
        Intrinsics.i(busNumber, "busNumber");
        Intrinsics.i(nextStopId, "nextStopId");
        Intrinsics.i(lastStopId, "lastStopId");
        Intrinsics.i(eta, "eta");
        Intrinsics.i(lastUpdated, "lastUpdated");
        Intrinsics.i(location, "location");
        Intrinsics.i(viewType, "viewType");
        this.f4398a = streamId;
        this.b = busNumber;
        this.c = nextStopId;
        this.d = lastStopId;
        this.e = eta;
        this.f = lastUpdated;
        this.g = location;
        this.h = viewType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusMapInfoWindowUiModel)) {
            return false;
        }
        BusMapInfoWindowUiModel busMapInfoWindowUiModel = (BusMapInfoWindowUiModel) obj;
        return Intrinsics.d(this.f4398a, busMapInfoWindowUiModel.f4398a) && Intrinsics.d(this.b, busMapInfoWindowUiModel.b) && Intrinsics.d(this.c, busMapInfoWindowUiModel.c) && Intrinsics.d(this.d, busMapInfoWindowUiModel.d) && Intrinsics.d(this.e, busMapInfoWindowUiModel.e) && Intrinsics.d(this.f, busMapInfoWindowUiModel.f) && Intrinsics.d(this.g, busMapInfoWindowUiModel.g) && this.h == busMapInfoWindowUiModel.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.f4398a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("BusMapInfoWindowUiModel(streamId=", this.f4398a, ", busNumber=", this.b, ", nextStopId=");
        cb0.t(sbE, this.c, ", lastStopId=", this.d, ", eta=");
        cb0.t(sbE, this.e, ", lastUpdated=", this.f, ", location=");
        sbE.append(this.g);
        sbE.append(", viewType=");
        sbE.append(this.h);
        sbE.append(")");
        return sbE.toString();
    }
}
