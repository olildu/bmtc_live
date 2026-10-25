package app.chalo.livetracking.universalsearch.data.model.ui;

import app.chalo.providers.RouteNamingSchemeType;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import defpackage.t10;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/ui/UniversalSearchRoutesDetailModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UniversalSearchRoutesDetailModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5006a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final String g;
    public final String h;
    public final List i;
    public final String j;
    public final RouteNamingSchemeType k;

    public UniversalSearchRoutesDetailModel(String routeId, String routeName, String str, boolean z, String str2, boolean z2, String firstStopName, String lastStopName, List updateSpecialFeaturesList, String str3, RouteNamingSchemeType routeNamingSchemeType) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(firstStopName, "firstStopName");
        Intrinsics.i(lastStopName, "lastStopName");
        Intrinsics.i(updateSpecialFeaturesList, "updateSpecialFeaturesList");
        Intrinsics.i(routeNamingSchemeType, "routeNamingSchemeType");
        this.f5006a = routeId;
        this.b = routeName;
        this.c = str;
        this.d = z;
        this.e = str2;
        this.f = z2;
        this.g = firstStopName;
        this.h = lastStopName;
        this.i = updateSpecialFeaturesList;
        this.j = str3;
        this.k = routeNamingSchemeType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalSearchRoutesDetailModel)) {
            return false;
        }
        UniversalSearchRoutesDetailModel universalSearchRoutesDetailModel = (UniversalSearchRoutesDetailModel) obj;
        return Intrinsics.d(this.f5006a, universalSearchRoutesDetailModel.f5006a) && Intrinsics.d(this.b, universalSearchRoutesDetailModel.b) && Intrinsics.d(this.c, universalSearchRoutesDetailModel.c) && this.d == universalSearchRoutesDetailModel.d && Intrinsics.d(this.e, universalSearchRoutesDetailModel.e) && this.f == universalSearchRoutesDetailModel.f && Intrinsics.d(this.g, universalSearchRoutesDetailModel.g) && Intrinsics.d(this.h, universalSearchRoutesDetailModel.h) && Intrinsics.d(this.i, universalSearchRoutesDetailModel.i) && Intrinsics.d(this.j, universalSearchRoutesDetailModel.j) && this.k == universalSearchRoutesDetailModel.k;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f5006a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (((iE + (str == null ? 0 : str.hashCode())) * 31) + (this.d ? 1231 : 1237)) * 31;
        String str2 = this.e;
        int iB = r30.b(nf1.e(nf1.e((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + (this.f ? 1231 : 1237)) * 31, 31, this.g), 31, this.h), 31, this.i);
        String str3 = this.j;
        return this.k.hashCode() + ((iB + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("UniversalSearchRoutesDetailModel(routeId=", this.f5006a, ", routeName=", this.b, ", transportType=");
        t10.s(this.c, ", isAcBus=", ", agencyName=", sbE, this.d);
        t10.s(this.e, ", isFreeRide=", ", firstStopName=", sbE, this.f);
        cb0.t(sbE, this.g, ", lastStopName=", this.h, ", updateSpecialFeaturesList=");
        cb0.s(", via=", this.j, ", routeNamingSchemeType=", sbE, this.i);
        sbE.append(this.k);
        sbE.append(")");
        return sbE.toString();
    }
}
