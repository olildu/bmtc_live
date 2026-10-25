package app.chalo.geoquery.data.models.app;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/geoquery/data/models/app/GeoQueryBusInfoResponseAppModel;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GeoQueryBusInfoResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GeoQueryBusInfoSessionResponseAppModel f2814a;
    public final GeoQueryBusInfoParametersResponseAppModel b;

    public GeoQueryBusInfoResponseAppModel(GeoQueryBusInfoSessionResponseAppModel geoQueryBusInfoSessionResponseAppModel, GeoQueryBusInfoParametersResponseAppModel geoQueryBusInfoParametersResponseAppModel) {
        this.f2814a = geoQueryBusInfoSessionResponseAppModel;
        this.b = geoQueryBusInfoParametersResponseAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeoQueryBusInfoResponseAppModel)) {
            return false;
        }
        GeoQueryBusInfoResponseAppModel geoQueryBusInfoResponseAppModel = (GeoQueryBusInfoResponseAppModel) obj;
        return Intrinsics.d(this.f2814a, geoQueryBusInfoResponseAppModel.f2814a) && Intrinsics.d(this.b, geoQueryBusInfoResponseAppModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2814a.hashCode() * 31);
    }

    public final String toString() {
        return "GeoQueryBusInfoResponseAppModel(session=" + this.f2814a + ", parameters=" + this.b + ")";
    }
}
