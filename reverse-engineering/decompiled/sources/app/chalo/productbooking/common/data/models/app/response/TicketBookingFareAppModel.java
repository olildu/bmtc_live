package app.chalo.productbooking.common.data.models.app.response;

import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.models.productbooking.ChaloTicketBookingMode;
import defpackage.r30;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/response/TicketBookingFareAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketBookingFareAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloTicketBookingMode f8240a;
    public final Integer b;
    public final CurrencyRoundOffLogic c;
    public final List d;
    public final String e;

    public TicketBookingFareAppModel(ChaloTicketBookingMode chaloTicketBookingMode, Integer num, CurrencyRoundOffLogic fareRoundingOffLogic, List passengerDetails, String str) {
        Intrinsics.i(fareRoundingOffLogic, "fareRoundingOffLogic");
        Intrinsics.i(passengerDetails, "passengerDetails");
        this.f8240a = chaloTicketBookingMode;
        this.b = num;
        this.c = fareRoundingOffLogic;
        this.d = passengerDetails;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketBookingFareAppModel)) {
            return false;
        }
        TicketBookingFareAppModel ticketBookingFareAppModel = (TicketBookingFareAppModel) obj;
        return this.f8240a == ticketBookingFareAppModel.f8240a && Intrinsics.d(this.b, ticketBookingFareAppModel.b) && this.c == ticketBookingFareAppModel.c && Intrinsics.d(this.d, ticketBookingFareAppModel.d) && Intrinsics.d(this.e, ticketBookingFareAppModel.e);
    }

    public final int hashCode() {
        int iHashCode = this.f8240a.hashCode() * 31;
        Integer num = this.b;
        int iB = r30.b((this.c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.d);
        String str = this.e;
        return iB + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TicketBookingFareAppModel(bookingMode=");
        sb.append(this.f8240a);
        sb.append(", totalAvailableSeats=");
        sb.append(this.b);
        sb.append(", fareRoundingOffLogic=");
        sb.append(this.c);
        sb.append(", passengerDetails=");
        sb.append(this.d);
        sb.append(", fareNote=");
        return vo1.p(sb, this.e, ")");
    }
}
