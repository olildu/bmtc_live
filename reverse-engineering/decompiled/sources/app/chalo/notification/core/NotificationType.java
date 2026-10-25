package app.chalo.notification.core;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b%\b\u0086\u0081\u0002\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001%B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006&"}, d2 = {"Lapp/chalo/notification/core/NotificationType;", "", "<init>", "(Ljava/lang/String;I)V", "ALERT", "APP_UPDATE", "BOOKING_SUCCESSFUL", "CHALO_CARD_TRANSACTION_RECEIPT", "IMAGE_NOTIFICATION", "IN_APP_CARD", "INSTANTTICKETSCANNED", "M_TICKET_PUNCH", "MTICKET_PUNCH", "ONDC_METRO_TICKET_CANCELLATION", "ONDC_TICKET_PUNCH", "PASS_UPDATE", "PAYMENT_DONE", "PB_RESERVE_TICKET_PUNCH", "PB_TRIP_CANCELLED", "PB_TRIP_RESCHEDULED", "PB_TRIP_START_DELAYED", "PB_TRIP_STARTED", "PB_VEHICLE_CHANGED", "PREMIUM_RESERVE_TICKET_PUNCH", "PROFILE_UPDATE", "QUICK_PAY_DIGITAL_RECEIPT", "REFERRAL", "SP_APPLICATION_UPDATE", "SP_PUNCH", "SUP_PASS_APPLICATION_UPDATE", "SUP_PASS_PUNCH", "TICKET_PUNCH", "TITO_TAP_IN", "TITO_TAP_OUT", "UPDATE_TRANSACTION", "PB_REFUND_PROCESSED", "CLOSED_LOOP_DIGITAL_WALLET_PUNCH", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum NotificationType {
    ALERT,
    APP_UPDATE,
    BOOKING_SUCCESSFUL,
    CHALO_CARD_TRANSACTION_RECEIPT,
    IMAGE_NOTIFICATION,
    IN_APP_CARD,
    INSTANTTICKETSCANNED,
    M_TICKET_PUNCH,
    MTICKET_PUNCH,
    ONDC_METRO_TICKET_CANCELLATION,
    ONDC_TICKET_PUNCH,
    PASS_UPDATE,
    PAYMENT_DONE,
    PB_RESERVE_TICKET_PUNCH,
    PB_TRIP_CANCELLED,
    PB_TRIP_RESCHEDULED,
    PB_TRIP_START_DELAYED,
    PB_TRIP_STARTED,
    PB_VEHICLE_CHANGED,
    PREMIUM_RESERVE_TICKET_PUNCH,
    PROFILE_UPDATE,
    QUICK_PAY_DIGITAL_RECEIPT,
    REFERRAL,
    SP_APPLICATION_UPDATE,
    SP_PUNCH,
    SUP_PASS_APPLICATION_UPDATE,
    SUP_PASS_PUNCH,
    TICKET_PUNCH,
    TITO_TAP_IN,
    TITO_TAP_OUT,
    UPDATE_TRANSACTION,
    PB_REFUND_PROCESSED,
    CLOSED_LOOP_DIGITAL_WALLET_PUNCH;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/core/NotificationType$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public static EnumEntries<NotificationType> getEntries() {
        return $ENTRIES;
    }
}
