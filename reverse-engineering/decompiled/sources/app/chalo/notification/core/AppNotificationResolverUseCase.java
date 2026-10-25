package app.chalo.notification.core;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/notification/core/AppNotificationResolverUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppNotificationResolverUseCase {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6523a;

        static {
            int[] iArr = new int[NotificationType.values().length];
            try {
                iArr[NotificationType.ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotificationType.APP_UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NotificationType.BOOKING_SUCCESSFUL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NotificationType.CHALO_CARD_TRANSACTION_RECEIPT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NotificationType.IMAGE_NOTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NotificationType.IN_APP_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[NotificationType.INSTANTTICKETSCANNED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[NotificationType.M_TICKET_PUNCH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[NotificationType.MTICKET_PUNCH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[NotificationType.ONDC_METRO_TICKET_CANCELLATION.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[NotificationType.ONDC_TICKET_PUNCH.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[NotificationType.PASS_UPDATE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[NotificationType.PAYMENT_DONE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[NotificationType.PB_RESERVE_TICKET_PUNCH.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[NotificationType.PB_TRIP_CANCELLED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[NotificationType.PB_TRIP_RESCHEDULED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[NotificationType.PB_TRIP_START_DELAYED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[NotificationType.PB_TRIP_STARTED.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[NotificationType.PB_VEHICLE_CHANGED.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[NotificationType.PREMIUM_RESERVE_TICKET_PUNCH.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[NotificationType.PROFILE_UPDATE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[NotificationType.QUICK_PAY_DIGITAL_RECEIPT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[NotificationType.CLOSED_LOOP_DIGITAL_WALLET_PUNCH.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[NotificationType.REFERRAL.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[NotificationType.SP_APPLICATION_UPDATE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[NotificationType.SP_PUNCH.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[NotificationType.SUP_PASS_APPLICATION_UPDATE.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[NotificationType.SUP_PASS_PUNCH.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[NotificationType.TICKET_PUNCH.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[NotificationType.TITO_TAP_IN.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[NotificationType.TITO_TAP_OUT.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[NotificationType.UPDATE_TRANSACTION.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[NotificationType.PB_REFUND_PROCESSED.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            f6523a = iArr;
        }
    }

    public static String a(String str, Map map) {
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }
}
