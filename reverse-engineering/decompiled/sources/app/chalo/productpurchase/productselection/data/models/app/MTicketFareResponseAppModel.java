package app.chalo.productpurchase.productselection.data.models.app;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/MTicketFareResponseAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MTicketFareResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MTicketFareDataResponseAppModel f8633a;
    public final MTicketFareRouteStageResponseAppModel b;

    public MTicketFareResponseAppModel(MTicketFareDataResponseAppModel mTicketFareDataResponseAppModel, MTicketFareRouteStageResponseAppModel mTicketFareRouteStageResponseAppModel) {
        this.f8633a = mTicketFareDataResponseAppModel;
        this.b = mTicketFareRouteStageResponseAppModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketFareResponseAppModel)) {
            return false;
        }
        MTicketFareResponseAppModel mTicketFareResponseAppModel = (MTicketFareResponseAppModel) obj;
        return Intrinsics.d(this.f8633a, mTicketFareResponseAppModel.f8633a) && Intrinsics.d(this.b, mTicketFareResponseAppModel.b);
    }

    public final int hashCode() {
        int iHashCode = this.f8633a.hashCode() * 31;
        MTicketFareRouteStageResponseAppModel mTicketFareRouteStageResponseAppModel = this.b;
        return iHashCode + (mTicketFareRouteStageResponseAppModel == null ? 0 : mTicketFareRouteStageResponseAppModel.hashCode());
    }

    public final String toString() {
        return "MTicketFareResponseAppModel(fares=" + this.f8633a + ", routeDetails=" + this.b + ")";
    }
}
