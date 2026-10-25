package app.chalo.premiumbus.prebookedtickets.ui.newactivation;

import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumReserveTicketDetailsScreenType;", "", "<init>", "(Ljava/lang/String;I)V", "PRE_VALIDATION", "POST_VALIDATION", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum NewPremiumReserveTicketDetailsScreenType {
    PRE_VALIDATION,
    POST_VALIDATION;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumReserveTicketDetailsScreenType$Companion;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f7397a;

            static {
                int[] iArr = new int[PremiumReserveTicketStatus.values().length];
                try {
                    iArr[PremiumReserveTicketStatus.PUNCHED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PremiumReserveTicketStatus.USED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PremiumReserveTicketStatus.ACTIVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PremiumReserveTicketStatus.PAYMENT_PROCESSING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[PremiumReserveTicketStatus.PAYMENT_FAILED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[PremiumReserveTicketStatus.USER_CANCELLED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[PremiumReserveTicketStatus.SYSTEM_CANCELLED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[PremiumReserveTicketStatus.USER_RESCHEDULED.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[PremiumReserveTicketStatus.SYSTEM_RESCHEDULED.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[PremiumReserveTicketStatus.EXPIRED.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[PremiumReserveTicketStatus.BOOKING_UNDER_PROCESS.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[PremiumReserveTicketStatus.BOOKING_FAILED.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[PremiumReserveTicketStatus.FAILED.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                f7397a = iArr;
            }
        }

        public static NewPremiumReserveTicketDetailsScreenType a(PremiumReserveTicketStatus ticketStatus) {
            Intrinsics.i(ticketStatus, "ticketStatus");
            switch (WhenMappings.f7397a[ticketStatus.ordinal()]) {
                case 1:
                case 2:
                    return NewPremiumReserveTicketDetailsScreenType.POST_VALIDATION;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    return NewPremiumReserveTicketDetailsScreenType.PRE_VALIDATION;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static EnumEntries<NewPremiumReserveTicketDetailsScreenType> getEntries() {
        return $ENTRIES;
    }
}
