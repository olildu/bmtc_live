package app.chalo.citydata.data.model.app.response;

import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/data/model/app/response/NearbyRoutesResponseAppModel;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NearbyRoutesResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloRouteCategory f1739a;
    public final ArrayList b;

    public NearbyRoutesResponseAppModel(ChaloRouteCategory chaloRouteCategory, ArrayList arrayList) {
        this.f1739a = chaloRouteCategory;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyRoutesResponseAppModel)) {
            return false;
        }
        NearbyRoutesResponseAppModel nearbyRoutesResponseAppModel = (NearbyRoutesResponseAppModel) obj;
        return this.f1739a == nearbyRoutesResponseAppModel.f1739a && this.b.equals(nearbyRoutesResponseAppModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1739a.hashCode() * 31);
    }

    public final String toString() {
        return "NearbyRoutesResponseAppModel(routeCategory=" + this.f1739a + ", routes=" + this.b + ")";
    }
}
