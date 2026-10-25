package app.chalo.premiumbus.data.models.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketEntity;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumReserveTicketEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumReserveTicketBookingProperties f7136a;
    public final PremiumReserveTicketTripProperties b;
    public final PremiumReserveTicketValidationProperties c;
    public final PremiumReserveTicketFareAndPassengerProperties d;

    public PremiumReserveTicketEntity(PremiumReserveTicketBookingProperties premiumReserveTicketBookingProperties, PremiumReserveTicketTripProperties premiumReserveTicketTripProperties, PremiumReserveTicketValidationProperties premiumReserveTicketValidationProperties, PremiumReserveTicketFareAndPassengerProperties premiumReserveTicketFareAndPassengerProperties) {
        this.f7136a = premiumReserveTicketBookingProperties;
        this.b = premiumReserveTicketTripProperties;
        this.c = premiumReserveTicketValidationProperties;
        this.d = premiumReserveTicketFareAndPassengerProperties;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumReserveTicketEntity)) {
            return false;
        }
        PremiumReserveTicketEntity premiumReserveTicketEntity = (PremiumReserveTicketEntity) obj;
        return Intrinsics.d(this.f7136a, premiumReserveTicketEntity.f7136a) && Intrinsics.d(this.b, premiumReserveTicketEntity.b) && Intrinsics.d(this.c, premiumReserveTicketEntity.c) && Intrinsics.d(this.d, premiumReserveTicketEntity.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f7136a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PremiumReserveTicketEntity(bookingProperties=" + this.f7136a + ", tripProperties=" + this.b + ", validationProperties=" + this.c + ", fareAndPassengerProperties=" + this.d + ")";
    }
}
