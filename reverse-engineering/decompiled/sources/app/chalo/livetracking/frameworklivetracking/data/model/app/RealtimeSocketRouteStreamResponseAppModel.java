package app.chalo.livetracking.frameworklivetracking.data.model.app;

import app.chalo.location.LatLng;
import defpackage.cb0;
import defpackage.dd;
import defpackage.i71;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealtimeSocketRouteStreamResponseAppModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RealtimeSocketRouteStreamResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4315a;
    public final String b;
    public final long c;
    public final long d;
    public final LatLng e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final Long j;
    public final Integer k;

    public RealtimeSocketRouteStreamResponseAppModel(String streamId, String vehicleNumber, long j, long j2, LatLng latLng, boolean z, String nextStopId, String lastStopId, String str, Long l, Integer num) {
        Intrinsics.i(streamId, "streamId");
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        Intrinsics.i(nextStopId, "nextStopId");
        Intrinsics.i(lastStopId, "lastStopId");
        this.f4315a = streamId;
        this.b = vehicleNumber;
        this.c = j;
        this.d = j2;
        this.e = latLng;
        this.f = z;
        this.g = nextStopId;
        this.h = lastStopId;
        this.i = str;
        this.j = l;
        this.k = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealtimeSocketRouteStreamResponseAppModel)) {
            return false;
        }
        RealtimeSocketRouteStreamResponseAppModel realtimeSocketRouteStreamResponseAppModel = (RealtimeSocketRouteStreamResponseAppModel) obj;
        return Intrinsics.d(this.f4315a, realtimeSocketRouteStreamResponseAppModel.f4315a) && Intrinsics.d(this.b, realtimeSocketRouteStreamResponseAppModel.b) && this.c == realtimeSocketRouteStreamResponseAppModel.c && this.d == realtimeSocketRouteStreamResponseAppModel.d && Intrinsics.d(this.e, realtimeSocketRouteStreamResponseAppModel.e) && this.f == realtimeSocketRouteStreamResponseAppModel.f && Intrinsics.d(this.g, realtimeSocketRouteStreamResponseAppModel.g) && Intrinsics.d(this.h, realtimeSocketRouteStreamResponseAppModel.h) && Intrinsics.d(this.i, realtimeSocketRouteStreamResponseAppModel.i) && Intrinsics.d(this.j, realtimeSocketRouteStreamResponseAppModel.j) && Intrinsics.d(this.k, realtimeSocketRouteStreamResponseAppModel.k);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f4315a.hashCode() * 31, 31, this.b);
        long j = this.c;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int iE2 = nf1.e(nf1.e((i71.d(this.e, (i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31) + (this.f ? 1231 : 1237)) * 31, 31, this.g), 31, this.h);
        String str = this.i;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.j;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.k;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RealtimeSocketRouteStreamResponseAppModel(streamId=", this.f4315a, ", vehicleNumber=", this.b, ", eta=");
        sbE.append(this.c);
        xs.r(this.d, ", timeStamp=", ", latLng=", sbE);
        sbE.append(this.e);
        sbE.append(", isBusHalted=");
        sbE.append(this.f);
        sbE.append(", nextStopId=");
        cb0.t(sbE, this.g, ", lastStopId=", this.h, ", passedStopId=");
        cb0.r(this.j, this.i, ", passedStopTime=", ", vehicleBearing=", sbE);
        return pk0.k(sbE, this.k, ")");
    }
}
