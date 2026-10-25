package app.chalo.superpass.data.models.entities;

import app.chalo.providers.RouteNamingSchemeType;
import defpackage.cb0;
import defpackage.dd;
import defpackage.n21;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/superpass/data/models/entities/SuperPassTripReceipt;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassTripReceipt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9577a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final List k;
    public final String l;
    public final RouteNamingSchemeType m;

    public SuperPassTripReceipt(String passId, String productType, String productSubType, long j, long j2, String vehicleNo, String conductorId, String startStopName, String endStopName, String routeName, List specialFeatureList, String str, RouteNamingSchemeType routeNamingSchemeType) {
        Intrinsics.i(passId, "passId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(conductorId, "conductorId");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopName, "endStopName");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(specialFeatureList, "specialFeatureList");
        Intrinsics.i(routeNamingSchemeType, "routeNamingSchemeType");
        this.f9577a = passId;
        this.b = productType;
        this.c = productSubType;
        this.d = j;
        this.e = j2;
        this.f = vehicleNo;
        this.g = conductorId;
        this.h = startStopName;
        this.i = endStopName;
        this.j = routeName;
        this.k = specialFeatureList;
        this.l = str;
        this.m = routeNamingSchemeType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassTripReceipt)) {
            return false;
        }
        SuperPassTripReceipt superPassTripReceipt = (SuperPassTripReceipt) obj;
        return Intrinsics.d(this.f9577a, superPassTripReceipt.f9577a) && Intrinsics.d(this.b, superPassTripReceipt.b) && Intrinsics.d(this.c, superPassTripReceipt.c) && this.d == superPassTripReceipt.d && this.e == superPassTripReceipt.e && Intrinsics.d(this.f, superPassTripReceipt.f) && Intrinsics.d(this.g, superPassTripReceipt.g) && Intrinsics.d(this.h, superPassTripReceipt.h) && Intrinsics.d(this.i, superPassTripReceipt.i) && Intrinsics.d(this.j, superPassTripReceipt.j) && Intrinsics.d(this.k, superPassTripReceipt.k) && Intrinsics.d(this.l, superPassTripReceipt.l) && this.m == superPassTripReceipt.m;
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f9577a.hashCode() * 31, 31, this.b), 31, this.c);
        long j = this.d;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        int iB = r30.b(nf1.e(nf1.e(nf1.e(nf1.e(nf1.e((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        String str = this.l;
        return this.m.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SuperPassTripReceipt(passId=", this.f9577a, ", productType=", this.b, ", productSubType=");
        n21.p(this.d, this.c, ", activationTimeStamp=", sbE);
        xs.r(this.e, ", punchTimeStamp=", ", vehicleNo=", sbE);
        cb0.t(sbE, this.f, ", conductorId=", this.g, ", startStopName=");
        cb0.t(sbE, this.h, ", endStopName=", this.i, ", routeName=");
        pk0.w(this.j, ", specialFeatureList=", ", via=", sbE, this.k);
        sbE.append(this.l);
        sbE.append(", routeNamingSchemeType=");
        sbE.append(this.m);
        sbE.append(")");
        return sbE.toString();
    }
}
