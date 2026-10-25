package app.chalo.instantticket.data.model.app.request;

import app.chalo.instantticket.data.model.api.request.FareRequestFilters;
import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/data/model/app/request/FetchMobileTicketFareRequestAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FetchMobileTicketFareRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3885a;
    public final String b;
    public final String c;
    public final String d;
    public final FareRequestFilters e;
    public final List f;
    public final String g;
    public final String h;

    public FetchMobileTicketFareRequestAppModel(String str, String routeId, String startStopId, String endStopId, FareRequestFilters requestFilters, List list, String str2, String str3) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(startStopId, "startStopId");
        Intrinsics.i(endStopId, "endStopId");
        Intrinsics.i(requestFilters, "requestFilters");
        this.f3885a = str;
        this.b = routeId;
        this.c = startStopId;
        this.d = endStopId;
        this.e = requestFilters;
        this.f = list;
        this.g = str2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchMobileTicketFareRequestAppModel)) {
            return false;
        }
        FetchMobileTicketFareRequestAppModel fetchMobileTicketFareRequestAppModel = (FetchMobileTicketFareRequestAppModel) obj;
        return Intrinsics.d(this.f3885a, fetchMobileTicketFareRequestAppModel.f3885a) && Intrinsics.d(this.b, fetchMobileTicketFareRequestAppModel.b) && Intrinsics.d(this.c, fetchMobileTicketFareRequestAppModel.c) && Intrinsics.d(this.d, fetchMobileTicketFareRequestAppModel.d) && Intrinsics.d(this.e, fetchMobileTicketFareRequestAppModel.e) && Intrinsics.d(this.f, fetchMobileTicketFareRequestAppModel.f) && Intrinsics.d(this.g, fetchMobileTicketFareRequestAppModel.g) && Intrinsics.d(this.h, fetchMobileTicketFareRequestAppModel.h);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + nf1.e(nf1.e(nf1.e(this.f3885a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        List list = this.f;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.g;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("FetchMobileTicketFareRequestAppModel(cityName=", this.f3885a, ", routeId=", this.b, ", startStopId=");
        cb0.t(sbE, this.c, ", endStopId=", this.d, ", requestFilters=");
        sbE.append(this.e);
        sbE.append(", seats=");
        sbE.append(this.f);
        sbE.append(", userCampaign=");
        return r30.i(sbE, this.g, ", userAcquisitionChannel=", this.h, ")");
    }
}
