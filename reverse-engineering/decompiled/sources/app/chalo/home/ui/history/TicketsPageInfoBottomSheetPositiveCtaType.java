package app.chalo.home.ui.history;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lapp/chalo/home/ui/history/TicketsPageInfoBottomSheetPositiveCtaType;", "", "<init>", "(Ljava/lang/String;I)V", "TICKET_USE", "PASS_USE", "PRICE_CHANGED", "PROOF_REQUIRED", "NO_MORE_RIDES_AVAILABLE", "NO_MORE_RIDES_AVAILABLE_TODAY", "PRODUCT_IN_APP_RECLAIM", "TICKET_NOT_FOUND", "TICKET_CONFIG_UNAVAILABLE", "PRODUCT_CONFIG_UNAVAILABLE", "BOOKABLE_CONFIG_INACTIVE", "PRODUCT_CONFIG_CATCHING", "PRODUCT_CONFIG_FETCH_FAILED", "DOCUMENT_VALIDITY_EXPIRED", "HAILING_NOT_SUPPORTED", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum TicketsPageInfoBottomSheetPositiveCtaType {
    TICKET_USE,
    PASS_USE,
    PRICE_CHANGED,
    PROOF_REQUIRED,
    NO_MORE_RIDES_AVAILABLE,
    NO_MORE_RIDES_AVAILABLE_TODAY,
    PRODUCT_IN_APP_RECLAIM,
    TICKET_NOT_FOUND,
    TICKET_CONFIG_UNAVAILABLE,
    PRODUCT_CONFIG_UNAVAILABLE,
    BOOKABLE_CONFIG_INACTIVE,
    PRODUCT_CONFIG_CATCHING,
    PRODUCT_CONFIG_FETCH_FAILED,
    DOCUMENT_VALIDITY_EXPIRED,
    HAILING_NOT_SUPPORTED;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    public static EnumEntries<TicketsPageInfoBottomSheetPositiveCtaType> getEntries() {
        return $ENTRIES;
    }
}
