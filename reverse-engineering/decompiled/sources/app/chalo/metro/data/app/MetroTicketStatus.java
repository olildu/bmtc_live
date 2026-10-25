package app.chalo.metro.data.app;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lapp/chalo/metro/data/app/MetroTicketStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "PAYMENT_PROCESSING", "PAYMENT_FAILED", "USED", "PUNCHED", "EXPIRED", "FAILED", "CANCELLED", "TAPPED_IN", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum MetroTicketStatus {
    ACTIVE,
    PAYMENT_PROCESSING,
    PAYMENT_FAILED,
    USED,
    PUNCHED,
    EXPIRED,
    FAILED,
    CANCELLED,
    TAPPED_IN;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/data/app/MetroTicketStatus$Companion;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static MetroTicketStatus a(String status) {
            Intrinsics.i(status, "status");
            for (MetroTicketStatus metroTicketStatus : MetroTicketStatus.values()) {
                if (Intrinsics.d(metroTicketStatus.name(), status)) {
                    return metroTicketStatus;
                }
            }
            return null;
        }
    }

    public static EnumEntries<MetroTicketStatus> getEntries() {
        return $ENTRIES;
    }
}
