package app.chalo.core;

import app.cash.sqldelight.ColumnAdapter;
import app.cash.sqldelight.EnumColumnAdapter;
import app.chalo.core.database.tableadapters.SuperPassRideBookingAdapter$get$1;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.receipt.ReceiptFareDataAppModel;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/Super_pass_bookings_table;", "", "Adapter", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Super_pass_bookings_table {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2015a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final RouteNamingSchemeType k;
    public final List l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final Long t;
    public final ReceiptFareDataAppModel u;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/Super_pass_bookings_table$Adapter;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumColumnAdapter f2016a;
        public final ColumnAdapter b;
        public final SuperPassRideBookingAdapter$get$1 c;

        public Adapter(EnumColumnAdapter enumColumnAdapter, ColumnAdapter specialFeaturesAdapter, SuperPassRideBookingAdapter$get$1 superPassRideBookingAdapter$get$1) {
            Intrinsics.i(specialFeaturesAdapter, "specialFeaturesAdapter");
            this.f2016a = enumColumnAdapter;
            this.b = specialFeaturesAdapter;
            this.c = superPassRideBookingAdapter$get$1;
        }
    }

    public Super_pass_bookings_table(long j, long j2, RouteNamingSchemeType routeNamingScheme, ReceiptFareDataAppModel receiptFareDataAppModel, Long l, String passId, String rideType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list) {
        Intrinsics.i(passId, "passId");
        Intrinsics.i(rideType, "rideType");
        Intrinsics.i(routeNamingScheme, "routeNamingScheme");
        this.f2015a = passId;
        this.b = rideType;
        this.c = j;
        this.d = j2;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = routeNamingScheme;
        this.l = list;
        this.m = str7;
        this.n = str8;
        this.o = str9;
        this.p = str10;
        this.q = str11;
        this.r = str12;
        this.s = str13;
        this.t = l;
        this.u = receiptFareDataAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Super_pass_bookings_table)) {
            return false;
        }
        Super_pass_bookings_table super_pass_bookings_table = (Super_pass_bookings_table) obj;
        return Intrinsics.d(this.f2015a, super_pass_bookings_table.f2015a) && Intrinsics.d(this.b, super_pass_bookings_table.b) && this.c == super_pass_bookings_table.c && this.d == super_pass_bookings_table.d && Intrinsics.d(this.e, super_pass_bookings_table.e) && Intrinsics.d(this.f, super_pass_bookings_table.f) && Intrinsics.d(this.g, super_pass_bookings_table.g) && Intrinsics.d(this.h, super_pass_bookings_table.h) && Intrinsics.d(this.i, super_pass_bookings_table.i) && Intrinsics.d(this.j, super_pass_bookings_table.j) && this.k == super_pass_bookings_table.k && Intrinsics.d(this.l, super_pass_bookings_table.l) && Intrinsics.d(this.m, super_pass_bookings_table.m) && Intrinsics.d(this.n, super_pass_bookings_table.n) && Intrinsics.d(this.o, super_pass_bookings_table.o) && Intrinsics.d(this.p, super_pass_bookings_table.p) && Intrinsics.d(this.q, super_pass_bookings_table.q) && Intrinsics.d(this.r, super_pass_bookings_table.r) && Intrinsics.d(this.s, super_pass_bookings_table.s) && Intrinsics.d(this.t, super_pass_bookings_table.t) && Intrinsics.d(this.u, super_pass_bookings_table.u);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f2015a.hashCode() * 31, 31, this.b);
        long j = this.c;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.e;
        int iHashCode = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int iHashCode6 = (this.k.hashCode() + ((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31)) * 31;
        List list = this.l;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.m;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.n;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.o;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.p;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.q;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.r;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.s;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Long l = this.t;
        int iHashCode15 = (iHashCode14 + (l == null ? 0 : l.hashCode())) * 31;
        ReceiptFareDataAppModel receiptFareDataAppModel = this.u;
        return iHashCode15 + (receiptFareDataAppModel != null ? receiptFareDataAppModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("Super_pass_bookings_table(passId=", this.f2015a, ", rideType=", this.b, ", activationTimeInSec=");
        sbE.append(this.c);
        xs.r(this.d, ", punchTimeInMillis=", ", startStopName=", sbE);
        cb0.t(sbE, this.e, ", endStopName=", this.f, ", routeName=");
        cb0.t(sbE, this.g, ", vehicleNo=", this.h, ", conductorId=");
        cb0.t(sbE, this.i, ", via=", this.j, ", routeNamingScheme=");
        sbE.append(this.k);
        sbE.append(", specialFeatures=");
        sbE.append(this.l);
        sbE.append(", depotName=");
        cb0.t(sbE, this.m, ", printedTicketId=", this.n, ", scheduleNumber=");
        cb0.t(sbE, this.o, ", routeServiceType=", this.p, ", driverId=");
        cb0.t(sbE, this.q, ", waybillNo=", this.r, ", etimVersion=");
        cb0.r(this.t, this.s, ", amount=", ", fareData=", sbE);
        sbE.append(this.u);
        sbE.append(")");
        return sbE.toString();
    }
}
