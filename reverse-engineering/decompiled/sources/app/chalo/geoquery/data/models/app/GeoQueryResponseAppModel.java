package app.chalo.geoquery.data.models.app;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/geoquery/data/models/app/GeoQueryResponseAppModel;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GeoQueryResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2820a;
    public final JsonObject b;
    public final JsonObject c;
    public final JsonObject d;
    public final JsonObject e;

    public GeoQueryResponseAppModel(List list, JsonObject jsonObject, JsonObject jsonObject2, JsonObject jsonObject3, JsonObject jsonObject4) {
        this.f2820a = list;
        this.b = jsonObject;
        this.c = jsonObject2;
        this.d = jsonObject3;
        this.e = jsonObject4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeoQueryResponseAppModel)) {
            return false;
        }
        GeoQueryResponseAppModel geoQueryResponseAppModel = (GeoQueryResponseAppModel) obj;
        return Intrinsics.d(this.f2820a, geoQueryResponseAppModel.f2820a) && Intrinsics.d(this.b, geoQueryResponseAppModel.b) && Intrinsics.d(this.c, geoQueryResponseAppModel.c) && Intrinsics.d(this.d, geoQueryResponseAppModel.d) && Intrinsics.d(this.e, geoQueryResponseAppModel.e);
    }

    public final int hashCode() {
        List list = this.f2820a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        JsonObject jsonObject = this.b;
        int iHashCode2 = (iHashCode + (jsonObject == null ? 0 : jsonObject.f18198a.hashCode())) * 31;
        JsonObject jsonObject2 = this.c;
        int iHashCode3 = (iHashCode2 + (jsonObject2 == null ? 0 : jsonObject2.f18198a.hashCode())) * 31;
        JsonObject jsonObject3 = this.d;
        int iHashCode4 = (iHashCode3 + (jsonObject3 == null ? 0 : jsonObject3.f18198a.hashCode())) * 31;
        JsonObject jsonObject4 = this.e;
        return iHashCode4 + (jsonObject4 != null ? jsonObject4.f18198a.hashCode() : 0);
    }

    public final String toString() {
        return "GeoQueryResponseAppModel(buses=" + this.f2820a + ", reportProblemData=" + this.b + ", cityInfo=" + this.c + ", cardsInfo=" + this.d + ", bannerInfo=" + this.e + ")";
    }
}
