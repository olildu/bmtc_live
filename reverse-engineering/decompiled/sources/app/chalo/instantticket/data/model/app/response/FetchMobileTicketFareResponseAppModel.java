package app.chalo.instantticket.data.model.app.response;

import app.chalo.constants.CurrencyRoundOffLogic;
import defpackage.cb0;
import defpackage.r30;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/data/model/app/response/FetchMobileTicketFareResponseAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FetchMobileTicketFareResponseAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3891a;
    public final CurrencyRoundOffLogic b;
    public final List c;
    public final String d;
    public final PassengerSelectionPolicy e;
    public final List f;

    public FetchMobileTicketFareResponseAppModel(int i, CurrencyRoundOffLogic fareRoundingOffLogic, List passengerDetails, String str, PassengerSelectionPolicy passengerSelectionPolicy, ArrayList arrayList) {
        Intrinsics.i(fareRoundingOffLogic, "fareRoundingOffLogic");
        Intrinsics.i(passengerDetails, "passengerDetails");
        Intrinsics.i(passengerSelectionPolicy, "passengerSelectionPolicy");
        this.f3891a = i;
        this.b = fareRoundingOffLogic;
        this.c = passengerDetails;
        this.d = str;
        this.e = passengerSelectionPolicy;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchMobileTicketFareResponseAppModel)) {
            return false;
        }
        FetchMobileTicketFareResponseAppModel fetchMobileTicketFareResponseAppModel = (FetchMobileTicketFareResponseAppModel) obj;
        return this.f3891a == fetchMobileTicketFareResponseAppModel.f3891a && this.b == fetchMobileTicketFareResponseAppModel.b && Intrinsics.d(this.c, fetchMobileTicketFareResponseAppModel.c) && Intrinsics.d(this.d, fetchMobileTicketFareResponseAppModel.d) && this.e == fetchMobileTicketFareResponseAppModel.e && Intrinsics.d(this.f, fetchMobileTicketFareResponseAppModel.f);
    }

    public final int hashCode() {
        int iB = r30.b((this.b.hashCode() + (this.f3891a * 31)) * 31, 31, this.c);
        String str = this.d;
        int iHashCode = (this.e.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        List list = this.f;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FetchMobileTicketFareResponseAppModel(totalAvailableSeats=");
        sb.append(this.f3891a);
        sb.append(", fareRoundingOffLogic=");
        sb.append(this.b);
        sb.append(", passengerDetails=");
        cb0.s(", fareNote=", this.d, ", passengerSelectionPolicy=", sb, this.c);
        sb.append(this.e);
        sb.append(", appliedRules=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
