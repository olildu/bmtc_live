package app.chalo.premiumbus.bulkbookingridedetails.data.model.app;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/data/model/app/SuperPassResponseAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6891a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final int g;
    public final Integer h;
    public final Integer i;
    public final app.chalo.superpass.data.models.entities.SuperPassTripPreferences j;
    public final String k;
    public final String l;
    public final List m;

    public SuperPassResponseAppModel(String configId, String passId, String passName, String userName, long j, long j2, int i, Integer num, Integer num2, app.chalo.superpass.data.models.entities.SuperPassTripPreferences superPassTripPreferences, String productType, String productSubType, List previousRideTimeStampsList) {
        Intrinsics.i(configId, "configId");
        Intrinsics.i(passId, "passId");
        Intrinsics.i(passName, "passName");
        Intrinsics.i(userName, "userName");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(previousRideTimeStampsList, "previousRideTimeStampsList");
        this.f6891a = configId;
        this.b = passId;
        this.c = passName;
        this.d = userName;
        this.e = j;
        this.f = j2;
        this.g = i;
        this.h = num;
        this.i = num2;
        this.j = superPassTripPreferences;
        this.k = productType;
        this.l = productSubType;
        this.m = previousRideTimeStampsList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassResponseAppModel)) {
            return false;
        }
        SuperPassResponseAppModel superPassResponseAppModel = (SuperPassResponseAppModel) obj;
        return Intrinsics.d(this.f6891a, superPassResponseAppModel.f6891a) && Intrinsics.d(this.b, superPassResponseAppModel.b) && Intrinsics.d(this.c, superPassResponseAppModel.c) && Intrinsics.d(this.d, superPassResponseAppModel.d) && this.e == superPassResponseAppModel.e && this.f == superPassResponseAppModel.f && this.g == superPassResponseAppModel.g && Intrinsics.d(this.h, superPassResponseAppModel.h) && Intrinsics.d(this.i, superPassResponseAppModel.i) && Intrinsics.d(this.j, superPassResponseAppModel.j) && Intrinsics.d(this.k, superPassResponseAppModel.k) && Intrinsics.d(this.l, superPassResponseAppModel.l) && Intrinsics.d(this.m, superPassResponseAppModel.m);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(nf1.e(this.f6891a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        long j = this.e;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int i2 = (((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.g) * 31;
        Integer num = this.h;
        int iHashCode = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.i;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        app.chalo.superpass.data.models.entities.SuperPassTripPreferences superPassTripPreferences = this.j;
        return this.m.hashCode() + nf1.e(nf1.e((iHashCode2 + (superPassTripPreferences != null ? superPassTripPreferences.hashCode() : 0)) * 31, 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SuperPassResponseAppModel(configId=", this.f6891a, ", passId=", this.b, ", passName=");
        cb0.t(sbE, this.c, ", userName=", this.d, ", startTime=");
        sbE.append(this.e);
        xs.r(this.f, ", expiryTime=", ", numOfDays=", sbE);
        sbE.append(this.g);
        sbE.append(", totalTrips=");
        sbE.append(this.h);
        sbE.append(", remainingTrips=");
        sbE.append(this.i);
        sbE.append(", tripPreferences=");
        sbE.append(this.j);
        sbE.append(", productType=");
        cb0.t(sbE, this.k, ", productSubType=", this.l, ", previousRideTimeStampsList=");
        return xs.l(sbE, this.m, ")");
    }
}
