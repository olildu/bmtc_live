package app.chalo.tito.data.model.entity;

import app.chalo.titoridedetail.data.app.TITOProductSubType;
import app.chalo.titoridedetail.data.app.TITOProductType;
import app.chalo.titoridedetail.data.app.TitoValidationStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/tito/data/model/entity/TITOValidationEntity;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TITOValidationEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9650a;
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

    public TITOValidationEntity(String tapId, long j, long j2, long j3, String conductorValidationStaticPayload, String tapInRouteId, String tapInStopId, String tapInTripNo, long j4, String vehicleNo, String str, TitoValidationStatus titoStatus, String str2, String bookingId, TITOProductType tITOProductType, TITOProductSubType tITOProductSubType, long j5, Long l, Long l2, String str3, String str4, String str5, Long l3) {
        Intrinsics.i(tapId, "tapId");
        Intrinsics.i(conductorValidationStaticPayload, "conductorValidationStaticPayload");
        Intrinsics.i(tapInRouteId, "tapInRouteId");
        Intrinsics.i(tapInStopId, "tapInStopId");
        Intrinsics.i(tapInTripNo, "tapInTripNo");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(titoStatus, "titoStatus");
        Intrinsics.i(bookingId, "bookingId");
        this.f9650a = tapId;
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
}
