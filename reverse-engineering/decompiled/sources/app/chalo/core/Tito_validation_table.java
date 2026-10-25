package app.chalo.core;

import app.cash.sqldelight.EnumColumnAdapter;
import app.chalo.titoridedetail.data.app.TITOProductSubType;
import app.chalo.titoridedetail.data.app.TITOProductType;
import app.chalo.titoridedetail.data.app.TitoValidationStatus;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.t10;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Tito_validation_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Tito_validation_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2021a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final String j;
    public final String k;
    public final TitoValidationStatus l;
    public final String m;
    public final String n;
    public final TITOProductType o;
    public final TITOProductSubType p;
    public final long q;
    public final Long r;
    public final Long s;
    public final String t;
    public final String u;
    public final String v;
    public final Long w;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Tito_validation_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumColumnAdapter f2022a;
        public final EnumColumnAdapter b;
        public final EnumColumnAdapter c;

        public Adapter(EnumColumnAdapter enumColumnAdapter, EnumColumnAdapter enumColumnAdapter2, EnumColumnAdapter enumColumnAdapter3) {
            this.f2022a = enumColumnAdapter;
            this.b = enumColumnAdapter2;
            this.c = enumColumnAdapter3;
        }
    }

    public Tito_validation_table(String tapId, long j, long j2, long j3, String conductorValidationStaticPayload, String tapInRouteId, String tapInStopId, String tapInTripNo, long j4, String vehicleNo, String str, TitoValidationStatus titoStatus, String str2, String bookingId, TITOProductType tITOProductType, TITOProductSubType tITOProductSubType, long j5, Long l, Long l2, String str3, String str4, String str5, Long l3) {
        Intrinsics.i(tapId, "tapId");
        Intrinsics.i(conductorValidationStaticPayload, "conductorValidationStaticPayload");
        Intrinsics.i(tapInRouteId, "tapInRouteId");
        Intrinsics.i(tapInStopId, "tapInStopId");
        Intrinsics.i(tapInTripNo, "tapInTripNo");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(titoStatus, "titoStatus");
        Intrinsics.i(bookingId, "bookingId");
        this.f2021a = tapId;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = conductorValidationStaticPayload;
        this.f = tapInRouteId;
        this.g = tapInStopId;
        this.h = tapInTripNo;
        this.i = j4;
        this.j = vehicleNo;
        this.k = str;
        this.l = titoStatus;
        this.m = str2;
        this.n = bookingId;
        this.o = tITOProductType;
        this.p = tITOProductSubType;
        this.q = j5;
        this.r = l;
        this.s = l2;
        this.t = str3;
        this.u = str4;
        this.v = str5;
        this.w = l3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tito_validation_table)) {
            return false;
        }
        Tito_validation_table tito_validation_table = (Tito_validation_table) obj;
        return Intrinsics.d(this.f2021a, tito_validation_table.f2021a) && this.b == tito_validation_table.b && this.c == tito_validation_table.c && this.d == tito_validation_table.d && Intrinsics.d(this.e, tito_validation_table.e) && Intrinsics.d(this.f, tito_validation_table.f) && Intrinsics.d(this.g, tito_validation_table.g) && Intrinsics.d(this.h, tito_validation_table.h) && this.i == tito_validation_table.i && Intrinsics.d(this.j, tito_validation_table.j) && Intrinsics.d(this.k, tito_validation_table.k) && this.l == tito_validation_table.l && Intrinsics.d(this.m, tito_validation_table.m) && Intrinsics.d(this.n, tito_validation_table.n) && this.o == tito_validation_table.o && this.p == tito_validation_table.p && this.q == tito_validation_table.q && Intrinsics.d(this.r, tito_validation_table.r) && Intrinsics.d(this.s, tito_validation_table.s) && Intrinsics.d(this.t, tito_validation_table.t) && Intrinsics.d(this.u, tito_validation_table.u) && Intrinsics.d(this.v, tito_validation_table.v) && Intrinsics.d(this.w, tito_validation_table.w);
    }

    public final int hashCode() {
        int iHashCode = this.f2021a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.d;
        int iE = nf1.e(nf1.e(nf1.e(nf1.e((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        long j4 = this.i;
        int iE2 = nf1.e((iE + ((int) (j4 ^ (j4 >>> 32)))) * 31, 31, this.j);
        String str = this.k;
        int iHashCode2 = (this.p.hashCode() + ((this.o.hashCode() + nf1.e(nf1.e((this.l.hashCode() + ((iE2 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.m), 31, this.n)) * 31)) * 31;
        long j5 = this.q;
        int i3 = (iHashCode2 + ((int) ((j5 >>> 32) ^ j5))) * 31;
        Long l = this.r;
        int iHashCode3 = (i3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.s;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.t;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.u;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.v;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l3 = this.w;
        return iHashCode7 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "Tito_validation_table(tapId=", this.f2021a, ", tapInGroupNo=");
        xs.r(this.c, ", activationTSInSec=", ", tapInTimestampInMillis=", sbM);
        dd.k(this.d, ", conductorValidationStaticPayload=", this.e, sbM);
        cb0.t(sbM, ", tapInRouteId=", this.f, ", tapInStopId=", this.g);
        defpackage.d.t(sbM, ", tapInTripNo=", this.h, ", tapInWaybillNo=");
        dd.k(this.i, ", vehicleNo=", this.j, sbM);
        sbM.append(", dropOffStopId=");
        sbM.append(this.k);
        sbM.append(", titoStatus=");
        sbM.append(this.l);
        cb0.t(sbM, ", userId=", this.m, ", bookingId=", this.n);
        sbM.append(", productType=");
        sbM.append(this.o);
        sbM.append(", productSubType=");
        sbM.append(this.p);
        xs.r(this.q, ", titoRideExpiryTimeInMillis=", ", tapOutGroupNo=", sbM);
        nf1.w(sbM, this.r, ", tapOutTimestampInMillis=", this.s, ", tapOutRouteId=");
        cb0.t(sbM, this.t, ", tapOutStopId=", this.u, ", tapOutTripNo=");
        sbM.append(this.v);
        sbM.append(", tapOutWaybillNo=");
        sbM.append(this.w);
        sbM.append(")");
        return sbM.toString();
    }
}
