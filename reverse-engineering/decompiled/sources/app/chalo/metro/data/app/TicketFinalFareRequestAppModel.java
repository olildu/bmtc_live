package app.chalo.metro.data.app;

import app.chalo.metro.data.api.MetroTicketTripDetails;
import app.chalo.models.productbooking.ChaloTicketBookingMode;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.cb0;
import defpackage.n21;
import defpackage.nf1;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/data/app/TicketFinalFareRequestAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketFinalFareRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloTicketBookingMode f5436a;
    public final ChaloTransitMode b;
    public final String c;
    public final String d;
    public final List e;
    public final MetroTicketTripDetails f;

    public TicketFinalFareRequestAppModel(ChaloTicketBookingMode bookingMode, ChaloTransitMode transitMode, String configId, String str, List passengerDetails, MetroTicketTripDetails tripDetails) {
        Intrinsics.i(bookingMode, "bookingMode");
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(configId, "configId");
        Intrinsics.i(passengerDetails, "passengerDetails");
        Intrinsics.i(tripDetails, "tripDetails");
        this.f5436a = bookingMode;
        this.b = transitMode;
        this.c = configId;
        this.d = str;
        this.e = passengerDetails;
        this.f = tripDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketFinalFareRequestAppModel)) {
            return false;
        }
        TicketFinalFareRequestAppModel ticketFinalFareRequestAppModel = (TicketFinalFareRequestAppModel) obj;
        return this.f5436a == ticketFinalFareRequestAppModel.f5436a && this.b == ticketFinalFareRequestAppModel.b && Intrinsics.d(this.c, ticketFinalFareRequestAppModel.c) && Intrinsics.d(this.d, ticketFinalFareRequestAppModel.d) && Intrinsics.d(this.e, ticketFinalFareRequestAppModel.e) && Intrinsics.d(this.f, ticketFinalFareRequestAppModel.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + r30.b(nf1.e(nf1.e(n21.c(this.b, this.f5436a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TicketFinalFareRequestAppModel(bookingMode=");
        sb.append(this.f5436a);
        sb.append(", transitMode=");
        sb.append(this.b);
        sb.append(", configId=");
        cb0.t(sb, this.c, ", cityName=", this.d, ", passengerDetails=");
        sb.append(this.e);
        sb.append(", tripDetails=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
