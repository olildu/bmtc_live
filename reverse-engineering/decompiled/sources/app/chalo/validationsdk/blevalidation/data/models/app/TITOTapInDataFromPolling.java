package app.chalo.validationsdk.blevalidation.data.models.app;

import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/app/TITOTapInDataFromPolling;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TITOTapInDataFromPolling {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10506a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final String i;
    public final String j;
    public final long k;
    public final String l;
    public final String m;
    public final Long n;

    public TITOTapInDataFromPolling(String bookingId, String productType, String productSubType, long j, long j2, long j3, long j4, String routeId, String stopId, String tripNo, long j5, String str, String str2, Long l) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(tripNo, "tripNo");
        this.f10506a = bookingId;
        this.b = productType;
        this.c = productSubType;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = routeId;
        this.i = stopId;
        this.j = tripNo;
        this.k = j5;
        this.l = str;
        this.m = str2;
        this.n = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TITOTapInDataFromPolling)) {
            return false;
        }
        TITOTapInDataFromPolling tITOTapInDataFromPolling = (TITOTapInDataFromPolling) obj;
        return Intrinsics.d(this.f10506a, tITOTapInDataFromPolling.f10506a) && Intrinsics.d(this.b, tITOTapInDataFromPolling.b) && Intrinsics.d(this.c, tITOTapInDataFromPolling.c) && this.d == tITOTapInDataFromPolling.d && this.e == tITOTapInDataFromPolling.e && this.f == tITOTapInDataFromPolling.f && this.g == tITOTapInDataFromPolling.g && Intrinsics.d(this.h, tITOTapInDataFromPolling.h) && Intrinsics.d(this.i, tITOTapInDataFromPolling.i) && Intrinsics.d(this.j, tITOTapInDataFromPolling.j) && this.k == tITOTapInDataFromPolling.k && Intrinsics.d(this.l, tITOTapInDataFromPolling.l) && Intrinsics.d(this.m, tITOTapInDataFromPolling.m) && Intrinsics.d(this.n, tITOTapInDataFromPolling.n);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f10506a.hashCode() * 31, 31, this.b), 31, this.c);
        long j = this.d;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.g;
        int iE2 = nf1.e(nf1.e(nf1.e((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31, 31, this.h), 31, this.i), 31, this.j);
        long j5 = this.k;
        int iE3 = nf1.e((iE2 + ((int) (j5 ^ (j5 >>> 32)))) * 31, 31, this.l);
        String str = this.m;
        int iHashCode = (iE3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.n;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("TITOTapInDataFromPolling(bookingId=", this.f10506a, ", productType=", this.b, ", productSubType=");
        n21.p(this.d, this.c, ", groupNo=", sbE);
        xs.r(this.e, ", firstTimeValidScanTS=", ", activationTsInSec=", sbE);
        sbE.append(this.f);
        xs.r(this.g, ", tapinPunchTsInMillis=", ", routeId=", sbE);
        cb0.t(sbE, this.h, ", stopId=", this.i, ", tripNo=");
        n21.p(this.k, this.j, ", waybillNo=", sbE);
        cb0.t(sbE, ", vehicleNo=", this.l, ", walletId=", this.m);
        sbE.append(", expiryTime=");
        sbE.append(this.n);
        sbE.append(")");
        return sbE.toString();
    }
}
