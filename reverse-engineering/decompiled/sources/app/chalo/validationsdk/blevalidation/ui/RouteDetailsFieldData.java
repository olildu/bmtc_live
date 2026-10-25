package app.chalo.validationsdk.blevalidation.ui;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/ui/RouteDetailsFieldData;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteDetailsFieldData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10621a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public RouteDetailsFieldData(String origin, String destination, String str, String str2, String routeName) {
        Intrinsics.i(origin, "origin");
        Intrinsics.i(destination, "destination");
        Intrinsics.i(routeName, "routeName");
        this.f10621a = origin;
        this.b = destination;
        this.c = str;
        this.d = str2;
        this.e = routeName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailsFieldData)) {
            return false;
        }
        RouteDetailsFieldData routeDetailsFieldData = (RouteDetailsFieldData) obj;
        return Intrinsics.d(this.f10621a, routeDetailsFieldData.f10621a) && Intrinsics.d(this.b, routeDetailsFieldData.b) && Intrinsics.d(this.c, routeDetailsFieldData.c) && Intrinsics.d(this.d, routeDetailsFieldData.d) && Intrinsics.d(this.e, routeDetailsFieldData.e);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f10621a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RouteDetailsFieldData(origin=", this.f10621a, ", destination=", this.b, ", startStopId=");
        cb0.t(sbE, this.c, ", endStopId=", this.d, ", routeName=");
        return vo1.p(sbE, this.e, ")");
    }
}
