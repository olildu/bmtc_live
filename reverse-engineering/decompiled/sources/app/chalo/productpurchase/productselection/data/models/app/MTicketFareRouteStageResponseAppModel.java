package app.chalo.productpurchase.productselection.data.models.app;

import defpackage.dd;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/MTicketFareRouteStageResponseAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MTicketFareRouteStageResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8634a;
    public final String b;
    public final String c;
    public final String d;

    public MTicketFareRouteStageResponseAppModel(String startStageId, String startStageName, String endStageId, String endStageName) {
        Intrinsics.i(startStageId, "startStageId");
        Intrinsics.i(startStageName, "startStageName");
        Intrinsics.i(endStageId, "endStageId");
        Intrinsics.i(endStageName, "endStageName");
        this.f8634a = startStageId;
        this.b = startStageName;
        this.c = endStageId;
        this.d = endStageName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketFareRouteStageResponseAppModel)) {
            return false;
        }
        MTicketFareRouteStageResponseAppModel mTicketFareRouteStageResponseAppModel = (MTicketFareRouteStageResponseAppModel) obj;
        return Intrinsics.d(this.f8634a, mTicketFareRouteStageResponseAppModel.f8634a) && Intrinsics.d(this.b, mTicketFareRouteStageResponseAppModel.b) && Intrinsics.d(this.c, mTicketFareRouteStageResponseAppModel.c) && Intrinsics.d(this.d, mTicketFareRouteStageResponseAppModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(nf1.e(this.f8634a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return r30.i(dd.e("MTicketFareRouteStageResponseAppModel(startStageId=", this.f8634a, ", startStageName=", this.b, ", endStageId="), this.c, ", endStageName=", this.d, ")");
    }
}
