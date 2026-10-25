package app.chalo.livetracking.frameworklivetracking.data.model.app;

import defpackage.d;
import defpackage.dd;
import defpackage.nf1;
import defpackage.t10;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/app/RealtimeSocketEtaResponseAppModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RealtimeSocketEtaResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4310a;
    public final long b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final Integer i;

    public RealtimeSocketEtaResponseAppModel(String etaId, long j, String vehicleNumber, long j2, long j3, long j4, String lastStopId, boolean z, Integer num) {
        Intrinsics.i(etaId, "etaId");
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        Intrinsics.i(lastStopId, "lastStopId");
        this.f4310a = etaId;
        this.b = j;
        this.c = vehicleNumber;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = lastStopId;
        this.h = z;
        this.i = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealtimeSocketEtaResponseAppModel)) {
            return false;
        }
        RealtimeSocketEtaResponseAppModel realtimeSocketEtaResponseAppModel = (RealtimeSocketEtaResponseAppModel) obj;
        return Intrinsics.d(this.f4310a, realtimeSocketEtaResponseAppModel.f4310a) && this.b == realtimeSocketEtaResponseAppModel.b && Intrinsics.d(this.c, realtimeSocketEtaResponseAppModel.c) && this.d == realtimeSocketEtaResponseAppModel.d && this.e == realtimeSocketEtaResponseAppModel.e && this.f == realtimeSocketEtaResponseAppModel.f && Intrinsics.d(this.g, realtimeSocketEtaResponseAppModel.g) && this.h == realtimeSocketEtaResponseAppModel.h && Intrinsics.d(this.i, realtimeSocketEtaResponseAppModel.i);
    }

    public final int hashCode() {
        int iHashCode = this.f4310a.hashCode() * 31;
        long j = this.b;
        int iE = nf1.e((iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.c);
        long j2 = this.d;
        int i = (iE + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f;
        int iE2 = (nf1.e((i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31, 31, this.g) + (this.h ? 1231 : 1237)) * 31;
        Integer num = this.i;
        return iE2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "RealtimeSocketEtaResponseAppModel(etaId=", this.f4310a, ", eta=");
        d.t(sbM, ", vehicleNumber=", this.c, ", minEta=");
        sbM.append(this.d);
        xs.r(this.e, ", maxEta=", ", timeStamp=", sbM);
        dd.k(this.f, ", lastStopId=", this.g, sbM);
        sbM.append(", isBusHalted=");
        sbM.append(this.h);
        sbM.append(", distanceToReach=");
        sbM.append(this.i);
        sbM.append(")");
        return sbM.toString();
    }
}
