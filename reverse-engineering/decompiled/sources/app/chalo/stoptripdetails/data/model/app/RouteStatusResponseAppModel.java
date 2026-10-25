package app.chalo.stoptripdetails.data.model.app;

import app.chalo.citydata.data.model.api.response.RouteApiStatusType;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/app/RouteStatusResponseAppModel;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteStatusResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9498a;
    public final RouteApiStatusType b;
    public final Integer c;

    public RouteStatusResponseAppModel(String routeId, RouteApiStatusType status, Integer num) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(status, "status");
        this.f9498a = routeId;
        this.b = status;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteStatusResponseAppModel)) {
            return false;
        }
        RouteStatusResponseAppModel routeStatusResponseAppModel = (RouteStatusResponseAppModel) obj;
        return Intrinsics.d(this.f9498a, routeStatusResponseAppModel.f9498a) && this.b == routeStatusResponseAppModel.b && Intrinsics.d(this.c, routeStatusResponseAppModel.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f9498a.hashCode() * 31)) * 31;
        Integer num = this.c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteStatusResponseAppModel(routeId=");
        sb.append(this.f9498a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", version=");
        return pk0.k(sb, this.c, ")");
    }
}
