package app.chalo.livetracking.routedetails.data.model.ui;

import defpackage.nf1;
import defpackage.r30;
import defpackage.t10;
import defpackage.xs;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/RouteDetailsStopUiModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteDetailsStopUiModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4410a;
    public final int b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final StopEtaStatus i;
    public final StopEtaUiModel j;
    public final List k;
    public final boolean l;
    public final String m;
    public final boolean n;

    public RouteDetailsStopUiModel(String stopId, int i, String stopName, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, StopEtaStatus etaStatus, StopEtaUiModel stopEtaUiModel, List list, boolean z6, String str, boolean z7) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(etaStatus, "etaStatus");
        this.f4410a = stopId;
        this.b = i;
        this.c = stopName;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = etaStatus;
        this.j = stopEtaUiModel;
        this.k = list;
        this.l = z6;
        this.m = str;
        this.n = z7;
    }

    public static RouteDetailsStopUiModel a(RouteDetailsStopUiModel routeDetailsStopUiModel, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, StopEtaStatus stopEtaStatus, StopEtaUiModel stopEtaUiModel, List list, String str, int i) {
        String stopId = routeDetailsStopUiModel.f4410a;
        int i2 = routeDetailsStopUiModel.b;
        String stopName = routeDetailsStopUiModel.c;
        boolean z6 = (i & 8) != 0 ? routeDetailsStopUiModel.d : z;
        boolean z7 = (i & 16) != 0 ? routeDetailsStopUiModel.e : z2;
        boolean z8 = (i & 32) != 0 ? routeDetailsStopUiModel.f : z3;
        boolean z9 = (i & 64) != 0 ? routeDetailsStopUiModel.g : z4;
        boolean z10 = (i & 128) != 0 ? routeDetailsStopUiModel.h : z5;
        StopEtaStatus etaStatus = (i & 256) != 0 ? routeDetailsStopUiModel.i : stopEtaStatus;
        StopEtaUiModel etaModel = (i & 512) != 0 ? routeDetailsStopUiModel.j : stopEtaUiModel;
        List topHelpTagList = (i & 1024) != 0 ? routeDetailsStopUiModel.k : list;
        boolean z11 = routeDetailsStopUiModel.l;
        String str2 = (i & 4096) != 0 ? routeDetailsStopUiModel.m : str;
        boolean z12 = routeDetailsStopUiModel.n;
        routeDetailsStopUiModel.getClass();
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(etaStatus, "etaStatus");
        Intrinsics.i(etaModel, "etaModel");
        Intrinsics.i(topHelpTagList, "topHelpTagList");
        return new RouteDetailsStopUiModel(stopId, i2, stopName, z6, z7, z8, z9, z10, etaStatus, etaModel, topHelpTagList, z11, str2, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailsStopUiModel)) {
            return false;
        }
        RouteDetailsStopUiModel routeDetailsStopUiModel = (RouteDetailsStopUiModel) obj;
        return Intrinsics.d(this.f4410a, routeDetailsStopUiModel.f4410a) && this.b == routeDetailsStopUiModel.b && Intrinsics.d(this.c, routeDetailsStopUiModel.c) && this.d == routeDetailsStopUiModel.d && this.e == routeDetailsStopUiModel.e && this.f == routeDetailsStopUiModel.f && this.g == routeDetailsStopUiModel.g && this.h == routeDetailsStopUiModel.h && this.i == routeDetailsStopUiModel.i && Intrinsics.d(this.j, routeDetailsStopUiModel.j) && Intrinsics.d(this.k, routeDetailsStopUiModel.k) && this.l == routeDetailsStopUiModel.l && Intrinsics.d(this.m, routeDetailsStopUiModel.m) && this.n == routeDetailsStopUiModel.n;
    }

    public final int hashCode() {
        int iB = (r30.b((this.j.hashCode() + ((this.i.hashCode() + ((((((((((nf1.e(((this.f4410a.hashCode() * 31) + this.b) * 31, 31, this.c) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237)) * 31)) * 31)) * 31, 31, this.k) + (this.l ? 1231 : 1237)) * 31;
        String str = this.m;
        return ((iB + (str == null ? 0 : str.hashCode())) * 31) + (this.n ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "RouteDetailsStopUiModel(stopId=", this.f4410a, ", stopIndex=", ", stopName=");
        t10.s(this.c, ", isSelected=", ", showLiveBusIconIfBussHasPassed=", sbM, this.d);
        z40.r(sbM, this.e, ", isStopAfterUserDestinationStop=", this.f, ", isBusDelayed=");
        z40.r(sbM, this.g, ", isUserDestinationStop=", this.h, ", etaStatus=");
        sbM.append(this.i);
        sbM.append(", etaModel=");
        sbM.append(this.j);
        sbM.append(", topHelpTagList=");
        sbM.append(this.k);
        sbM.append(", showStopScheduleTime=");
        sbM.append(this.l);
        sbM.append(", vehicleNumber=");
        sbM.append(this.m);
        sbM.append(", showBusNumberAsLiveIcon=");
        sbM.append(this.n);
        sbM.append(")");
        return sbM.toString();
    }
}
