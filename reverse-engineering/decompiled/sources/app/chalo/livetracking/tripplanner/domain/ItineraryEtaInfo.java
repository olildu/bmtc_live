package app.chalo.livetracking.tripplanner.domain;

import defpackage.nf1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/domain/ItineraryEtaInfo;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ItineraryEtaInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4698a;
    public final String b;
    public final long c;
    public final boolean d;
    public final Long e;

    public ItineraryEtaInfo(long j, String vehicleNumber, long j2, boolean z, Long l) {
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        this.f4698a = j;
        this.b = vehicleNumber;
        this.c = j2;
        this.d = z;
        this.e = l;
    }

    public final long a() {
        return (this.f4698a * ((long) 1000)) + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItineraryEtaInfo)) {
            return false;
        }
        ItineraryEtaInfo itineraryEtaInfo = (ItineraryEtaInfo) obj;
        return this.f4698a == itineraryEtaInfo.f4698a && Intrinsics.d(this.b, itineraryEtaInfo.b) && this.c == itineraryEtaInfo.c && this.d == itineraryEtaInfo.d && Intrinsics.d(this.e, itineraryEtaInfo.e);
    }

    public final int hashCode() {
        long j = this.f4698a;
        int iE = nf1.e(((int) (j ^ (j >>> 32))) * 31, 31, this.b);
        long j2 = this.c;
        int i = (((iE + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.d ? 1231 : 1237)) * 31;
        Long l = this.e;
        return i + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItineraryEtaInfo(etaInSeconds=");
        sb.append(this.f4698a);
        sb.append(", vehicleNumber=");
        sb.append(this.b);
        xs.r(this.c, ", etaTimeStamp=", ", isBusHalted=", sb);
        sb.append(this.d);
        sb.append(", etaDelayedByInMins=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
