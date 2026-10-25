package app.chalo.features.productsync.constants;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lapp/chalo/features/productsync/constants/SuperPassStatus;", "", "s", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getS", "()Ljava/lang/String;", "PAYMENT_FAILED", "PAYMENT_PROCESSING", "UNUSED", "USED", "INACTIVE", "EXPIRED", "CANCELLED", "FAILED", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum SuperPassStatus {
    PAYMENT_FAILED("payment_failed"),
    PAYMENT_PROCESSING("payment_processing"),
    UNUSED("unused"),
    USED("used"),
    INACTIVE("inactive"),
    EXPIRED("expired"),
    CANCELLED("cancelled"),
    FAILED("failed");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());
    private final String s;

    SuperPassStatus(String str) {
        this.s = str;
    }

    public static EnumEntries<SuperPassStatus> getEntries() {
        return $ENTRIES;
    }

    public final String getS() {
        return this.s;
    }
}
