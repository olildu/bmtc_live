package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingStopSchedule;", "", "ScheduleAvailable", "NotApplicable", "Unknown", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingStopSchedule$NotApplicable;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingStopSchedule$ScheduleAvailable;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingStopSchedule$Unknown;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusPostBookingStopSchedule {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingStopSchedule$NotApplicable;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingStopSchedule;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotApplicable extends PremiumBusPostBookingStopSchedule {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotApplicable f7427a = new NotApplicable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotApplicable);
        }

        public final int hashCode() {
            return -1348870842;
        }

        public final String toString() {
            return "NotApplicable";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingStopSchedule$ScheduleAvailable;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingStopSchedule;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ScheduleAvailable extends PremiumBusPostBookingStopSchedule {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7428a;

        public ScheduleAvailable(String scheduleString) {
            Intrinsics.i(scheduleString, "scheduleString");
            this.f7428a = scheduleString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScheduleAvailable) && Intrinsics.d(this.f7428a, ((ScheduleAvailable) obj).f7428a);
        }

        public final int hashCode() {
            return this.f7428a.hashCode();
        }

        public final String toString() {
            return vo1.B("ScheduleAvailable(scheduleString=", this.f7428a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingStopSchedule$Unknown;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PremiumBusPostBookingStopSchedule;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends PremiumBusPostBookingStopSchedule {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unknown f7429a = new Unknown();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public final int hashCode() {
            return 767787454;
        }

        public final String toString() {
            return "Unknown";
        }
    }
}
