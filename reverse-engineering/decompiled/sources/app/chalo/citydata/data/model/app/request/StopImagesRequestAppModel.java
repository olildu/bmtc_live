package app.chalo.citydata.data.model.app.request;

import defpackage.dd;
import defpackage.nf1;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/data/model/app/request/StopImagesRequestAppModel;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopImagesRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1737a;
    public final String b;
    public final List c;

    public StopImagesRequestAppModel(String str, String routeId, List stopIds) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(stopIds, "stopIds");
        this.f1737a = str;
        this.b = routeId;
        this.c = stopIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopImagesRequestAppModel)) {
            return false;
        }
        StopImagesRequestAppModel stopImagesRequestAppModel = (StopImagesRequestAppModel) obj;
        return Intrinsics.d(this.f1737a, stopImagesRequestAppModel.f1737a) && Intrinsics.d(this.b, stopImagesRequestAppModel.b) && Intrinsics.d(this.c, stopImagesRequestAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f1737a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return xs.l(dd.e("StopImagesRequestAppModel(cityName=", this.f1737a, ", routeId=", this.b, ", stopIds="), this.c, ")");
    }
}
