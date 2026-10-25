package app.chalo.premiumbus.data.models.app;

import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PremiumReserveTicketAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumReserveTicketAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumReserveTicketBookingPropertiesAppModel f7113a;
    public final PremiumReserveTicketTripPropertiesAppModel b;
    public final PremiumReserveTicketValidationPropertiesAppModel c;
    public final PremiumReserveTicketFareAndPassengerPropertiesAppModel d;

    public PremiumReserveTicketAppModel(PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel, PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel, PremiumReserveTicketValidationPropertiesAppModel premiumReserveTicketValidationPropertiesAppModel, PremiumReserveTicketFareAndPassengerPropertiesAppModel premiumReserveTicketFareAndPassengerPropertiesAppModel) {
        this.f7113a = premiumReserveTicketBookingPropertiesAppModel;
        this.b = premiumReserveTicketTripPropertiesAppModel;
        this.c = premiumReserveTicketValidationPropertiesAppModel;
        this.d = premiumReserveTicketFareAndPassengerPropertiesAppModel;
    }

    public final boolean a(long j) {
        return this.f7113a.h == PremiumReserveTicketStatus.ACTIVE && !c(j);
    }

    public final boolean b(long j) {
        if (a(j)) {
            return true;
        }
        PremiumReserveTicketStatus premiumReserveTicketStatus = this.f7113a.h;
        return (premiumReserveTicketStatus == PremiumReserveTicketStatus.PUNCHED || premiumReserveTicketStatus == PremiumReserveTicketStatus.USED) && this.b.d > j;
    }

    public final boolean c(long j) {
        return this.f7113a.h == PremiumReserveTicketStatus.EXPIRED || j > this.c.c;
    }

    public final boolean d() {
        return this.f7113a.h == PremiumReserveTicketStatus.SYSTEM_CANCELLED;
    }

    public final boolean e() {
        FirstBookingAppModel firstBookingAppModel;
        PremiumReserveTicketBookingPropertiesAppModel premiumReserveTicketBookingPropertiesAppModel = this.f7113a;
        return (premiumReserveTicketBookingPropertiesAppModel.m != PremiumReserveTicketStatus.SYSTEM_RESCHEDULED || (firstBookingAppModel = premiumReserveTicketBookingPropertiesAppModel.l) == null || StringsKt.F(firstBookingAppModel.f7082a) || firstBookingAppModel.c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumReserveTicketAppModel)) {
            return false;
        }
        PremiumReserveTicketAppModel premiumReserveTicketAppModel = (PremiumReserveTicketAppModel) obj;
        return Intrinsics.d(this.f7113a, premiumReserveTicketAppModel.f7113a) && Intrinsics.d(this.b, premiumReserveTicketAppModel.b) && Intrinsics.d(this.c, premiumReserveTicketAppModel.c) && Intrinsics.d(this.d, premiumReserveTicketAppModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f7113a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PremiumReserveTicketAppModel(bookingProperties=" + this.f7113a + ", tripProperties=" + this.b + ", validationProperties=" + this.c + ", fareAndPassengerProperties=" + this.d + ")";
    }
}
