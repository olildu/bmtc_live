package app.chalo.citydata.data.model.app.request;

import defpackage.dd;
import defpackage.nf1;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/data/model/app/request/StopDetailsRequestAppModel;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopDetailsRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1736a;
    public final String b;
    public final List c;

    public StopDetailsRequestAppModel(String str, String routeId, List stopIds) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(stopIds, "stopIds");
        this.f1736a = str;
        this.b = routeId;
        this.c = stopIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopDetailsRequestAppModel)) {
            return false;
        }
        StopDetailsRequestAppModel stopDetailsRequestAppModel = (StopDetailsRequestAppModel) obj;
        return Intrinsics.d(this.f1736a, stopDetailsRequestAppModel.f1736a) && Intrinsics.d(this.b, stopDetailsRequestAppModel.b) && Intrinsics.d(this.c, stopDetailsRequestAppModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f1736a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return xs.l(dd.e("StopDetailsRequestAppModel(cityId=", this.f1736a, ", routeId=", this.b, ", stopIds="), this.c, ")");
    }
}
