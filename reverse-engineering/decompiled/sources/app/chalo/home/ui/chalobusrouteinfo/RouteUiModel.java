package app.chalo.home.ui.chalobusrouteinfo;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/RouteUiModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3374a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final Long f;

    public RouteUiModel(Long l, Long l2, String routeId, String name, String routeDisplayName, String str) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(name, "name");
        Intrinsics.i(routeDisplayName, "routeDisplayName");
        this.f3374a = routeId;
        this.b = name;
        this.c = routeDisplayName;
        this.d = str;
        this.e = l;
        this.f = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteUiModel)) {
            return false;
        }
        RouteUiModel routeUiModel = (RouteUiModel) obj;
        return Intrinsics.d(this.f3374a, routeUiModel.f3374a) && Intrinsics.d(this.b, routeUiModel.b) && Intrinsics.d(this.c, routeUiModel.c) && Intrinsics.d(this.d, routeUiModel.d) && Intrinsics.d(this.e, routeUiModel.e) && Intrinsics.d(this.f, routeUiModel.f);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f3374a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.e;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RouteUiModel(routeId=", this.f3374a, ", name=", this.b, ", routeDisplayName=");
        cb0.t(sbE, this.c, ", via=", this.d, ", firstDepartureTime=");
        sbE.append(this.e);
        sbE.append(", lastDepartureTime=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }
}
