package app.chalo.citydata.data.model.app;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.uf0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/data/model/app/SimpleRouteDetailsAppModel;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SimpleRouteDetailsAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1726a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;

    public SimpleRouteDetailsAppModel(String routeId, String routeName, String startStopName, List specialFeature, String endStopName, String agencyName) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(startStopName, "startStopName");
        Intrinsics.i(endStopName, "endStopName");
        Intrinsics.i(agencyName, "agencyName");
        Intrinsics.i(specialFeature, "specialFeature");
        this.f1726a = routeId;
        this.b = routeName;
        this.c = startStopName;
        this.d = endStopName;
        this.e = agencyName;
        this.f = specialFeature;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleRouteDetailsAppModel)) {
            return false;
        }
        SimpleRouteDetailsAppModel simpleRouteDetailsAppModel = (SimpleRouteDetailsAppModel) obj;
        return Intrinsics.d(this.f1726a, simpleRouteDetailsAppModel.f1726a) && Intrinsics.d(this.b, simpleRouteDetailsAppModel.b) && Intrinsics.d(this.c, simpleRouteDetailsAppModel.c) && Intrinsics.d(this.d, simpleRouteDetailsAppModel.d) && Intrinsics.d(this.e, simpleRouteDetailsAppModel.e) && Intrinsics.d(this.f, simpleRouteDetailsAppModel.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e(this.f1726a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SimpleRouteDetailsAppModel(routeId=", this.f1726a, ", routeName=", this.b, ", startStopName=");
        cb0.t(sbE, this.c, ", endStopName=", this.d, ", agencyName=");
        return uf0.p(this.e, ", specialFeature=", ")", sbE, this.f);
    }
}
