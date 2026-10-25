package app.chalo.productpurchase.productselection.data.models.app;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/MTicketPassengerFareBreakdownResponseAppModel;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MTicketPassengerFareBreakdownResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f8635a;
    public final Map b;

    public MTicketPassengerFareBreakdownResponseAppModel(Map map, Map map2) {
        this.f8635a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketPassengerFareBreakdownResponseAppModel)) {
            return false;
        }
        MTicketPassengerFareBreakdownResponseAppModel mTicketPassengerFareBreakdownResponseAppModel = (MTicketPassengerFareBreakdownResponseAppModel) obj;
        return Intrinsics.d(this.f8635a, mTicketPassengerFareBreakdownResponseAppModel.f8635a) && Intrinsics.d(this.b, mTicketPassengerFareBreakdownResponseAppModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8635a.hashCode() * 31);
    }

    public final String toString() {
        return "MTicketPassengerFareBreakdownResponseAppModel(breakdownAddition=" + this.f8635a + ", breakdownSubstraction=" + this.b + ")";
    }
}
