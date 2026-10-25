package app.chalo.premiumbus.data.models.app;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PremiumBusSlotArrivalStatus;", "", "shouldShowOriginalSlotTime", "", "shouldStrikeOffOriginalSlotTime", "<init>", "(Ljava/lang/String;IZZ)V", "getShouldShowOriginalSlotTime", "()Z", "getShouldStrikeOffOriginalSlotTime", "EARLY", "ON_TIME", "DELAY", "UNKNOWN", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum PremiumBusSlotArrivalStatus {
    EARLY(true, false),
    ON_TIME(false, false),
    DELAY(true, true),
    UNKNOWN(false, false);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());
    private final boolean shouldShowOriginalSlotTime;
    private final boolean shouldStrikeOffOriginalSlotTime;

    PremiumBusSlotArrivalStatus(boolean z, boolean z2) {
        this.shouldShowOriginalSlotTime = z;
        this.shouldStrikeOffOriginalSlotTime = z2;
    }

    public static EnumEntries<PremiumBusSlotArrivalStatus> getEntries() {
        return $ENTRIES;
    }

    public final boolean getShouldShowOriginalSlotTime() {
        return this.shouldShowOriginalSlotTime;
    }

    public final boolean getShouldStrikeOffOriginalSlotTime() {
        return this.shouldStrikeOffOriginalSlotTime;
    }
}
