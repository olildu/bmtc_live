package app.chalo.instantticket.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lapp/chalo/instantticket/data/model/InstantTicketStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "PAYMENT_PROCESSING", "PAYMENT_FAILED", "EXPIRED", "CANCELLED", "FAILED", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum InstantTicketStatus {
    ACTIVE,
    PAYMENT_PROCESSING,
    PAYMENT_FAILED,
    EXPIRED,
    CANCELLED,
    FAILED;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/data/model/InstantTicketStatus$Companion;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static InstantTicketStatus a(String status) {
            Intrinsics.i(status, "status");
            switch (status.hashCode()) {
                case -1031784143:
                    if (status.equals("CANCELLED")) {
                        return InstantTicketStatus.CANCELLED;
                    }
                    break;
                case -784238410:
                    if (status.equals("PAYMENT_FAILED")) {
                        return InstantTicketStatus.PAYMENT_FAILED;
                    }
                    break;
                case -591252731:
                    if (status.equals("EXPIRED")) {
                        return InstantTicketStatus.EXPIRED;
                    }
                    break;
                case -446879988:
                    if (status.equals("PAYMENT_PROCESSING")) {
                        return InstantTicketStatus.PAYMENT_PROCESSING;
                    }
                    break;
                case 1925346054:
                    if (status.equals("ACTIVE")) {
                        return InstantTicketStatus.ACTIVE;
                    }
                    break;
                case 2066319421:
                    if (status.equals("FAILED")) {
                        return InstantTicketStatus.FAILED;
                    }
                    break;
            }
            return InstantTicketStatus.EXPIRED;
        }
    }

    public static EnumEntries<InstantTicketStatus> getEntries() {
        return $ENTRIES;
    }
}
