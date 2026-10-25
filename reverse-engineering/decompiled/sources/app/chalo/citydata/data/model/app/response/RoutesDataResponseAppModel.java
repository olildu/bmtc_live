package app.chalo.citydata.data.model.app.response;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/data/model/app/response/RoutesDataResponseAppModel;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RoutesDataResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1744a;
    public final List b;

    public RoutesDataResponseAppModel(int i, List routes) {
        Intrinsics.i(routes, "routes");
        this.f1744a = i;
        this.b = routes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutesDataResponseAppModel)) {
            return false;
        }
        RoutesDataResponseAppModel routesDataResponseAppModel = (RoutesDataResponseAppModel) obj;
        return this.f1744a == routesDataResponseAppModel.f1744a && Intrinsics.d(this.b, routesDataResponseAppModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1744a * 31);
    }

    public final String toString() {
        return "RoutesDataResponseAppModel(version=" + this.f1744a + ", routes=" + this.b + ")";
    }
}
