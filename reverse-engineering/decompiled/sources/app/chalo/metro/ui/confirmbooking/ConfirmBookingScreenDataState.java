package app.chalo.metro.ui.confirmbooking;

import app.chalo.models.productbooking.ChaloTicketBookingMode;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import defpackage.b3;
import defpackage.dd;
import defpackage.pk0;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/confirmbooking/ConfirmBookingScreenDataState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ConfirmBookingScreenDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloTransitMode f5463a;
    public final ChaloTicketBookingMode b;
    public final boolean c;
    public final String d;
    public final String e;
    public final ConfirmationScreenTripDetails f;
    public final List g;
    public final Long h;
    public final List i;
    public final List j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public ConfirmBookingScreenDataState(ChaloTransitMode transitMode, ChaloTicketBookingMode bookingMode, boolean z, String str, String str2, ConfirmationScreenTripDetails confirmationScreenTripDetails, List list, Long l, List list2, List list3, boolean z2, boolean z3, boolean z4) {
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(bookingMode, "bookingMode");
        this.f5463a = transitMode;
        this.b = bookingMode;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = confirmationScreenTripDetails;
        this.g = list;
        this.h = l;
        this.i = list2;
        this.j = list3;
        this.k = z2;
        this.l = z3;
        this.m = z4;
    }

    public static ConfirmBookingScreenDataState a(ConfirmBookingScreenDataState confirmBookingScreenDataState, ChaloTicketBookingMode chaloTicketBookingMode, boolean z, String str, String str2, ConfirmationScreenTripDetails confirmationScreenTripDetails, List list, Long l, List list2, List list3, boolean z2, boolean z3, boolean z4, int i) {
        ChaloTicketBookingMode bookingMode = chaloTicketBookingMode;
        ChaloTransitMode transitMode = confirmBookingScreenDataState.f5463a;
        if ((i & 2) != 0) {
            bookingMode = confirmBookingScreenDataState.b;
        }
        if ((i & 4) != 0) {
            z = confirmBookingScreenDataState.c;
        }
        if ((i & 8) != 0) {
            str = confirmBookingScreenDataState.d;
        }
        if ((i & 16) != 0) {
            str2 = confirmBookingScreenDataState.e;
        }
        if ((i & 32) != 0) {
            confirmationScreenTripDetails = confirmBookingScreenDataState.f;
        }
        if ((i & 64) != 0) {
            list = confirmBookingScreenDataState.g;
        }
        if ((i & 128) != 0) {
            l = confirmBookingScreenDataState.h;
        }
        if ((i & 256) != 0) {
            list2 = confirmBookingScreenDataState.i;
        }
        if ((i & 512) != 0) {
            list3 = confirmBookingScreenDataState.j;
        }
        if ((i & 1024) != 0) {
            z2 = confirmBookingScreenDataState.k;
        }
        if ((i & 2048) != 0) {
            z3 = confirmBookingScreenDataState.l;
        }
        if ((i & 4096) != 0) {
            z4 = confirmBookingScreenDataState.m;
        }
        boolean z5 = z4;
        confirmBookingScreenDataState.getClass();
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(bookingMode, "bookingMode");
        boolean z6 = z3;
        boolean z7 = z2;
        List list4 = list3;
        List list5 = list2;
        Long l2 = l;
        List list6 = list;
        ConfirmationScreenTripDetails confirmationScreenTripDetails2 = confirmationScreenTripDetails;
        String str3 = str2;
        String str4 = str;
        return new ConfirmBookingScreenDataState(transitMode, bookingMode, z, str4, str3, confirmationScreenTripDetails2, list6, l2, list5, list4, z7, z6, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmBookingScreenDataState)) {
            return false;
        }
        ConfirmBookingScreenDataState confirmBookingScreenDataState = (ConfirmBookingScreenDataState) obj;
        return this.f5463a == confirmBookingScreenDataState.f5463a && this.b == confirmBookingScreenDataState.b && this.c == confirmBookingScreenDataState.c && Intrinsics.d(this.d, confirmBookingScreenDataState.d) && Intrinsics.d(this.e, confirmBookingScreenDataState.e) && Intrinsics.d(this.f, confirmBookingScreenDataState.f) && Intrinsics.d(this.g, confirmBookingScreenDataState.g) && Intrinsics.d(this.h, confirmBookingScreenDataState.h) && Intrinsics.d(this.i, confirmBookingScreenDataState.i) && Intrinsics.d(this.j, confirmBookingScreenDataState.j) && this.k == confirmBookingScreenDataState.k && this.l == confirmBookingScreenDataState.l && this.m == confirmBookingScreenDataState.m;
    }

    public final int hashCode() {
        int iHashCode = (((this.b.hashCode() + (this.f5463a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ConfirmationScreenTripDetails confirmationScreenTripDetails = this.f;
        int iHashCode4 = (iHashCode3 + (confirmationScreenTripDetails == null ? 0 : confirmationScreenTripDetails.hashCode())) * 31;
        List list = this.g;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.h;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        List list2 = this.i;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.j;
        return ((((((iHashCode7 + (list3 != null ? list3.hashCode() : 0)) * 31) + (this.k ? 1231 : 1237)) * 31) + (this.l ? 1231 : 1237)) * 31) + (this.m ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfirmBookingScreenDataState(transitMode=");
        sb.append(this.f5463a);
        sb.append(", bookingMode=");
        sb.append(this.b);
        sb.append(", showLoadingDialog=");
        pk0.x(", configId=", this.d, ", agencyName=", sb, this.c);
        sb.append(this.e);
        sb.append(", tripDetails=");
        sb.append(this.f);
        sb.append(", passengerDetailsList=");
        sb.append(this.g);
        sb.append(", finalAmount=");
        sb.append(this.h);
        sb.append(", fareBreakup=");
        dd.o(sb, this.i, ", tncList=", this.j, ", showFareLoadingShimmer=");
        z40.r(sb, this.k, ", showFareFailedSnackbar=", this.l, ", showTncDialog=");
        return b3.g(")", sb, this.m);
    }
}
