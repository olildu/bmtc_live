package app.chalo.premiumbus.prebookedtickets;

import app.chalo.utils.ChaloUseCaseResult;
import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/PremiumBusBookingsTripPollingDetails;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusBookingsTripPollingDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7281a;
    public final ChaloUseCaseResult b;
    public final long c;
    public final long d;

    public PremiumBusBookingsTripPollingDetails(String bookingId, ChaloUseCaseResult chaloUseCaseResult, long j, long j2) {
        Intrinsics.i(bookingId, "bookingId");
        this.f7281a = bookingId;
        this.b = chaloUseCaseResult;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusBookingsTripPollingDetails)) {
            return false;
        }
        PremiumBusBookingsTripPollingDetails premiumBusBookingsTripPollingDetails = (PremiumBusBookingsTripPollingDetails) obj;
        return Intrinsics.d(this.f7281a, premiumBusBookingsTripPollingDetails.f7281a) && Intrinsics.d(this.b, premiumBusBookingsTripPollingDetails.b) && this.c == premiumBusBookingsTripPollingDetails.c && this.d == premiumBusBookingsTripPollingDetails.d;
    }

    public final int hashCode() {
        int iHashCode = this.f7281a.hashCode() * 31;
        ChaloUseCaseResult chaloUseCaseResult = this.b;
        int iHashCode2 = (iHashCode + (chaloUseCaseResult == null ? 0 : chaloUseCaseResult.hashCode())) * 31;
        long j = this.c;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PremiumBusBookingsTripPollingDetails(bookingId=");
        sb.append(this.f7281a);
        sb.append(", response=");
        sb.append(this.b);
        sb.append(", lastPolledAt=");
        sb.append(this.c);
        return t10.g(this.d, ", delayBeforeNextPoll=", ")", sb);
    }
}
