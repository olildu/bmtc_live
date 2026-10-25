package app.chalo.tripreceipt.domain;

import app.chalo.features.productsync.model.app.RideType;
import app.chalo.providers.RouteNamingSchemeType;
import defpackage.cb0;
import defpackage.n21;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/tripreceipt/domain/SuperPassTripHistoryAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassTripHistoryAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9736a;
    public final RideType b;
    public final long c;
    public final long d;
    public final String e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final List k;
    public final String l;
    public final RouteNamingSchemeType m;

    public SuperPassTripHistoryAppModel(String passId, RideType rideType, long j, long j2, String str, long j3, String str2, String str3, String str4, String str5, List list, String str6, RouteNamingSchemeType routeNamingScheme) {
        Intrinsics.i(passId, "passId");
        Intrinsics.i(rideType, "rideType");
        Intrinsics.i(routeNamingScheme, "routeNamingScheme");
        this.f9736a = passId;
        this.b = rideType;
        this.c = j;
        this.d = j2;
        this.e = str;
        this.f = j3;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = list;
        this.l = str6;
        this.m = routeNamingScheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassTripHistoryAppModel)) {
            return false;
        }
        SuperPassTripHistoryAppModel superPassTripHistoryAppModel = (SuperPassTripHistoryAppModel) obj;
        return Intrinsics.d(this.f9736a, superPassTripHistoryAppModel.f9736a) && this.b == superPassTripHistoryAppModel.b && this.c == superPassTripHistoryAppModel.c && this.d == superPassTripHistoryAppModel.d && Intrinsics.d(this.e, superPassTripHistoryAppModel.e) && this.f == superPassTripHistoryAppModel.f && Intrinsics.d(this.g, superPassTripHistoryAppModel.g) && Intrinsics.d(this.h, superPassTripHistoryAppModel.h) && Intrinsics.d(this.i, superPassTripHistoryAppModel.i) && Intrinsics.d(this.j, superPassTripHistoryAppModel.j) && Intrinsics.d(this.k, superPassTripHistoryAppModel.k) && Intrinsics.d(this.l, superPassTripHistoryAppModel.l) && this.m == superPassTripHistoryAppModel.m;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f9736a.hashCode() * 31)) * 31;
        long j = this.c;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.e;
        int iHashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        long j3 = this.f;
        int i3 = (iHashCode2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str2 = this.g;
        int iHashCode3 = (i3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.k;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.l;
        return this.m.hashCode() + ((iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperPassTripHistoryAppModel(passId=");
        sb.append(this.f9736a);
        sb.append(", rideType=");
        sb.append(this.b);
        sb.append(", activationTimeInSec=");
        sb.append(this.c);
        xs.r(this.d, ", punchTimeInMillis=", ", startStopName=", sb);
        n21.p(this.f, this.e, ", activeDuration=", sb);
        cb0.t(sb, ", endStopName=", this.g, ", routeName=", this.h);
        cb0.t(sb, ", vehicleNo=", this.i, ", conductorId=", this.j);
        sb.append(", specialFeatures=");
        sb.append(this.k);
        sb.append(", via=");
        sb.append(this.l);
        sb.append(", routeNamingScheme=");
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }
}
