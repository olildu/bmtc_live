package app.chalo.citydata.data.model.app.request;

import app.chalo.location.LatLng;
import defpackage.cb0;
import defpackage.hq0;
import defpackage.nf1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/data/model/app/request/RoutesDataRequestAppModel;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RoutesDataRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1735a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final String g;
    public final LatLng h;

    public RoutesDataRequestAppModel(List routeIdWithVersion, String str, String str2, String androidModel, int i, int i2, String str3, LatLng latLng) {
        Intrinsics.i(routeIdWithVersion, "routeIdWithVersion");
        Intrinsics.i(androidModel, "androidModel");
        this.f1735a = routeIdWithVersion;
        this.b = str;
        this.c = str2;
        this.d = androidModel;
        this.e = i;
        this.f = i2;
        this.g = str3;
        this.h = latLng;
    }

    public static RoutesDataRequestAppModel a(RoutesDataRequestAppModel routesDataRequestAppModel, List routeIdWithVersion) {
        String str = routesDataRequestAppModel.b;
        String str2 = routesDataRequestAppModel.c;
        String androidModel = routesDataRequestAppModel.d;
        int i = routesDataRequestAppModel.e;
        int i2 = routesDataRequestAppModel.f;
        String str3 = routesDataRequestAppModel.g;
        LatLng latLng = routesDataRequestAppModel.h;
        routesDataRequestAppModel.getClass();
        routesDataRequestAppModel.getClass();
        routesDataRequestAppModel.getClass();
        Intrinsics.i(routeIdWithVersion, "routeIdWithVersion");
        Intrinsics.i(androidModel, "androidModel");
        return new RoutesDataRequestAppModel(routeIdWithVersion, str, str2, androidModel, i, i2, str3, latLng);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutesDataRequestAppModel)) {
            return false;
        }
        RoutesDataRequestAppModel routesDataRequestAppModel = (RoutesDataRequestAppModel) obj;
        return Intrinsics.d(this.f1735a, routesDataRequestAppModel.f1735a) && this.b.equals(routesDataRequestAppModel.b) && Intrinsics.d(this.c, routesDataRequestAppModel.c) && Intrinsics.d(this.d, routesDataRequestAppModel.d) && this.e == routesDataRequestAppModel.e && this.f == routesDataRequestAppModel.f && this.g.equals(routesDataRequestAppModel.g) && Intrinsics.d(this.h, routesDataRequestAppModel.h);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f1735a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iE2 = nf1.e((((nf1.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.d) + this.e) * 31) + this.f) * 31, 31, this.g);
        LatLng latLng = this.h;
        return ((((iE2 + (latLng != null ? latLng.hashCode() : 0)) * 31) + 1237) * 31) + 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoutesDataRequestAppModel(routeIdWithVersion=");
        sb.append(this.f1735a);
        sb.append(", cityName=");
        sb.append(this.b);
        sb.append(", userId=");
        cb0.t(sb, this.c, ", androidModel=", this.d, ", androidVersionCode=");
        hq0.p(this.e, this.f, ", osVersion=", ", currentLanguageName=", sb);
        sb.append(this.g);
        sb.append(", location=");
        sb.append(this.h);
        sb.append(", isRequestFromBackgroundSync=false, isInitialFetch=false)");
        return sb.toString();
    }
}
