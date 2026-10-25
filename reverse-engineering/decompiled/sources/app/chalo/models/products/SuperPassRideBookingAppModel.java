package app.chalo.models.products;

import app.chalo.features.productsync.model.app.RideType;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.receipt.ReceiptFareDataAppModel;
import defpackage.cb0;
import defpackage.pk0;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/models/products/SuperPassRideBookingAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassRideBookingAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5681a;
    public final RideType b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final String k;
    public final RouteNamingSchemeType l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final Long t;
    public final ReceiptFareDataAppModel u;

    public SuperPassRideBookingAppModel(String passId, RideType rideType, long j, long j2, String str, String str2, String str3, String str4, String str5, List list, String str6, RouteNamingSchemeType routeNamingScheme, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Long l, ReceiptFareDataAppModel receiptFareDataAppModel) {
        Intrinsics.i(passId, "passId");
        Intrinsics.i(rideType, "rideType");
        Intrinsics.i(routeNamingScheme, "routeNamingScheme");
        this.f5681a = passId;
        this.b = rideType;
        this.c = j;
        this.d = j2;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = list;
        this.k = str6;
        this.l = routeNamingScheme;
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
        if (!(obj instanceof SuperPassRideBookingAppModel)) {
            return false;
        }
        SuperPassRideBookingAppModel superPassRideBookingAppModel = (SuperPassRideBookingAppModel) obj;
        return Intrinsics.d(this.f5681a, superPassRideBookingAppModel.f5681a) && this.b == superPassRideBookingAppModel.b && this.c == superPassRideBookingAppModel.c && this.d == superPassRideBookingAppModel.d && Intrinsics.d(this.e, superPassRideBookingAppModel.e) && Intrinsics.d(this.f, superPassRideBookingAppModel.f) && Intrinsics.d(this.g, superPassRideBookingAppModel.g) && Intrinsics.d(this.h, superPassRideBookingAppModel.h) && Intrinsics.d(this.i, superPassRideBookingAppModel.i) && Intrinsics.d(this.j, superPassRideBookingAppModel.j) && Intrinsics.d(this.k, superPassRideBookingAppModel.k) && this.l == superPassRideBookingAppModel.l && Intrinsics.d(this.m, superPassRideBookingAppModel.m) && Intrinsics.d(this.n, superPassRideBookingAppModel.n) && Intrinsics.d(this.o, superPassRideBookingAppModel.o) && Intrinsics.d(this.p, superPassRideBookingAppModel.p) && Intrinsics.d(this.q, superPassRideBookingAppModel.q) && Intrinsics.d(this.r, superPassRideBookingAppModel.r) && Intrinsics.d(this.s, superPassRideBookingAppModel.s) && Intrinsics.d(this.t, superPassRideBookingAppModel.t) && Intrinsics.d(this.u, superPassRideBookingAppModel.u);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f5681a.hashCode() * 31)) * 31;
        long j = this.c;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.e;
        int iHashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.j;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.k;
        int iHashCode8 = (this.l.hashCode() + ((iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31)) * 31;
        String str7 = this.m;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.n;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.o;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.p;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.q;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.r;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.s;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Long l = this.t;
        int iHashCode16 = (iHashCode15 + (l == null ? 0 : l.hashCode())) * 31;
        ReceiptFareDataAppModel receiptFareDataAppModel = this.u;
        return iHashCode16 + (receiptFareDataAppModel != null ? receiptFareDataAppModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperPassRideBookingAppModel(passId=");
        sb.append(this.f5681a);
        sb.append(", rideType=");
        sb.append(this.b);
        sb.append(", activationTimeInSec=");
        sb.append(this.c);
        xs.r(this.d, ", punchTimeInMillis=", ", startStopName=", sb);
        cb0.t(sb, this.e, ", endStopName=", this.f, ", routeName=");
        cb0.t(sb, this.g, ", vehicleNo=", this.h, ", conductorId=");
        pk0.w(this.i, ", specialFeatures=", ", via=", sb, this.j);
        sb.append(this.k);
        sb.append(", routeNamingScheme=");
        sb.append(this.l);
        sb.append(", depotName=");
        cb0.t(sb, this.m, ", etimGeneratedTicketId=", this.n, ", scheduleNumber=");
        cb0.t(sb, this.o, ", routeServiceType=", this.p, ", driverId=");
        cb0.t(sb, this.q, ", waybillNo=", this.r, ", etimVersion=");
        cb0.r(this.t, this.s, ", amount=", ", fareData=", sb);
        sb.append(this.u);
        sb.append(")");
        return sb.toString();
    }
}
