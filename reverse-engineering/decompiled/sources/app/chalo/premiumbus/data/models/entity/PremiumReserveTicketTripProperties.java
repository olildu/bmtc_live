package app.chalo.premiumbus.data.models.entity;

import defpackage.dd;
import defpackage.nf1;
import defpackage.t10;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketTripProperties;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumReserveTicketTripProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7139a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final PremiumStopDetailsInfo g;
    public final PremiumStopDetailsInfo h;
    public final boolean i;

    public PremiumReserveTicketTripProperties(String str, long j, long j2, long j3, String routeId, String str2, PremiumStopDetailsInfo premiumStopDetailsInfo, PremiumStopDetailsInfo premiumStopDetailsInfo2, boolean z) {
        Intrinsics.i(routeId, "routeId");
        this.f7139a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = routeId;
        this.f = str2;
        this.g = premiumStopDetailsInfo;
        this.h = premiumStopDetailsInfo2;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumReserveTicketTripProperties)) {
            return false;
        }
        PremiumReserveTicketTripProperties premiumReserveTicketTripProperties = (PremiumReserveTicketTripProperties) obj;
        return Intrinsics.d(this.f7139a, premiumReserveTicketTripProperties.f7139a) && this.b == premiumReserveTicketTripProperties.b && this.c == premiumReserveTicketTripProperties.c && this.d == premiumReserveTicketTripProperties.d && Intrinsics.d(this.e, premiumReserveTicketTripProperties.e) && Intrinsics.d(this.f, premiumReserveTicketTripProperties.f) && Intrinsics.d(this.g, premiumReserveTicketTripProperties.g) && Intrinsics.d(this.h, premiumReserveTicketTripProperties.h) && this.i == premiumReserveTicketTripProperties.i;
    }

    public final int hashCode() {
        int iHashCode = this.f7139a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.d;
        return ((this.h.hashCode() + ((this.g.hashCode() + nf1.e(nf1.e((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31, this.e), 31, this.f)) * 31)) * 31) + (this.i ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "PremiumReserveTicketTripProperties(tripId=", this.f7139a, ", tripStaticSlotTime=");
        xs.r(this.c, ", expectedTripStartTime=", ", expectedTripEndTime=", sbM);
        dd.k(this.d, ", routeId=", this.e, sbM);
        sbM.append(", routeName=");
        sbM.append(this.f);
        sbM.append(", fromStopDetails=");
        sbM.append(this.g);
        sbM.append(", toStopDetails=");
        sbM.append(this.h);
        sbM.append(", isTripFeedbackCollected=");
        sbM.append(this.i);
        sbM.append(")");
        return sbM.toString();
    }
}
