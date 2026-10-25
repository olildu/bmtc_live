package app.chalo.citydata.data.model.app.request;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/data/model/app/request/RouteDetailsRequestOldAppModel;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteDetailsRequestOldAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1734a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final String h;

    public RouteDetailsRequestOldAppModel(String routeId, String cityName, String currDay, String str, String androidModel, int i, int i2, String str2) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(cityName, "cityName");
        Intrinsics.i(currDay, "currDay");
        Intrinsics.i(androidModel, "androidModel");
        this.f1734a = routeId;
        this.b = cityName;
        this.c = currDay;
        this.d = str;
        this.e = androidModel;
        this.f = i;
        this.g = i2;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailsRequestOldAppModel)) {
            return false;
        }
        RouteDetailsRequestOldAppModel routeDetailsRequestOldAppModel = (RouteDetailsRequestOldAppModel) obj;
        return Intrinsics.d(this.f1734a, routeDetailsRequestOldAppModel.f1734a) && Intrinsics.d(this.b, routeDetailsRequestOldAppModel.b) && Intrinsics.d(this.c, routeDetailsRequestOldAppModel.c) && Intrinsics.d(this.d, routeDetailsRequestOldAppModel.d) && Intrinsics.d(this.e, routeDetailsRequestOldAppModel.e) && this.f == routeDetailsRequestOldAppModel.f && this.g == routeDetailsRequestOldAppModel.g && Intrinsics.d(this.h, routeDetailsRequestOldAppModel.h);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f1734a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iE2 = (((nf1.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.e) + this.f) * 31) + this.g) * 31;
        String str2 = this.h;
        return iE2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RouteDetailsRequestOldAppModel(routeId=", this.f1734a, ", cityName=", this.b, ", currDay=");
        cb0.t(sbE, this.c, ", userId=", this.d, ", androidModel=");
        cb0.o(this.f, this.e, ", androidVersionCode=", ", osVersion=", sbE);
        sbE.append(this.g);
        sbE.append(", currentLanguageName=");
        sbE.append(this.h);
        sbE.append(")");
        return sbE.toString();
    }
}
