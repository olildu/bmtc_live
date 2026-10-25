package app.chalo.premiumbus.prebookedtickets.ui.cancellationack;

import app.chalo.premiumbus.data.models.app.PremiumReserveTicketTripPropertiesAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/cancellationack/PremiumBusInAppCommunicationBottomSheetData;", "", "SystemCancellation", "SystemReschedule", "Lapp/chalo/premiumbus/prebookedtickets/ui/cancellationack/PremiumBusInAppCommunicationBottomSheetData$SystemCancellation;", "Lapp/chalo/premiumbus/prebookedtickets/ui/cancellationack/PremiumBusInAppCommunicationBottomSheetData$SystemReschedule;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusInAppCommunicationBottomSheetData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7358a;
    public final PremiumReserveTicketStatus b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/cancellationack/PremiumBusInAppCommunicationBottomSheetData$SystemCancellation;", "Lapp/chalo/premiumbus/prebookedtickets/ui/cancellationack/PremiumBusInAppCommunicationBottomSheetData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SystemCancellation extends PremiumBusInAppCommunicationBottomSheetData {
        public final String c;
        public final PremiumReserveTicketStatus d;
        public final PremiumReserveTicketTripPropertiesAppModel e;
        public final String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SystemCancellation(String str, PremiumReserveTicketStatus premiumReserveTicketStatus, PremiumReserveTicketTripPropertiesAppModel premiumReserveTicketTripPropertiesAppModel, String slotTime) {
            super(str, premiumReserveTicketStatus);
            Intrinsics.i(slotTime, "slotTime");
            this.c = str;
            this.d = premiumReserveTicketStatus;
            this.e = premiumReserveTicketTripPropertiesAppModel;
            this.f = slotTime;
        }

        @Override // app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF7358a() {
            return this.c;
        }

        @Override // app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final PremiumReserveTicketStatus getB() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SystemCancellation)) {
                return false;
            }
            SystemCancellation systemCancellation = (SystemCancellation) obj;
            return Intrinsics.d(this.c, systemCancellation.c) && this.d == systemCancellation.d && Intrinsics.d(this.e, systemCancellation.e) && Intrinsics.d(this.f, systemCancellation.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "SystemCancellation(bookingId=" + this.c + ", ticketStatus=" + this.d + ", tripProperties=" + this.e + ", slotTime=" + this.f + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/cancellationack/PremiumBusInAppCommunicationBottomSheetData$SystemReschedule;", "Lapp/chalo/premiumbus/prebookedtickets/ui/cancellationack/PremiumBusInAppCommunicationBottomSheetData;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SystemReschedule extends PremiumBusInAppCommunicationBottomSheetData {
        public final String c;
        public final PremiumReserveTicketStatus d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SystemReschedule(String str, PremiumReserveTicketStatus premiumReserveTicketStatus, String firstBookingId, String fromStopName, String dayDate, String oldSlotTime, String newSlotTime) {
            super(str, premiumReserveTicketStatus);
            Intrinsics.i(firstBookingId, "firstBookingId");
            Intrinsics.i(fromStopName, "fromStopName");
            Intrinsics.i(dayDate, "dayDate");
            Intrinsics.i(oldSlotTime, "oldSlotTime");
            Intrinsics.i(newSlotTime, "newSlotTime");
            this.c = str;
            this.d = premiumReserveTicketStatus;
            this.e = firstBookingId;
            this.f = fromStopName;
            this.g = dayDate;
            this.h = oldSlotTime;
            this.i = newSlotTime;
        }

        @Override // app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF7358a() {
            return this.c;
        }

        @Override // app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final PremiumReserveTicketStatus getB() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SystemReschedule)) {
                return false;
            }
            SystemReschedule systemReschedule = (SystemReschedule) obj;
            return Intrinsics.d(this.c, systemReschedule.c) && this.d == systemReschedule.d && Intrinsics.d(this.e, systemReschedule.e) && Intrinsics.d(this.f, systemReschedule.f) && Intrinsics.d(this.g, systemReschedule.g) && Intrinsics.d(this.h, systemReschedule.h) && Intrinsics.d(this.i, systemReschedule.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e((this.d.hashCode() + (this.c.hashCode() * 31)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SystemReschedule(bookingId=");
            sb.append(this.c);
            sb.append(", ticketStatus=");
            sb.append(this.d);
            sb.append(", firstBookingId=");
            cb0.t(sb, this.e, ", fromStopName=", this.f, ", dayDate=");
            cb0.t(sb, this.g, ", oldSlotTime=", this.h, ", newSlotTime=");
            return vo1.p(sb, this.i, ")");
        }
    }

    public PremiumBusInAppCommunicationBottomSheetData(String str, PremiumReserveTicketStatus premiumReserveTicketStatus) {
        this.f7358a = str;
        this.b = premiumReserveTicketStatus;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public String getF7358a() {
        return this.f7358a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public PremiumReserveTicketStatus getB() {
        return this.b;
    }
}
