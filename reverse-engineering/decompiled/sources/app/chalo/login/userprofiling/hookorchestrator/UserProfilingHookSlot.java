package app.chalo.login.userprofiling.hookorchestrator;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/login/userprofiling/hookorchestrator/UserProfilingHookSlot;", "", "ruleId", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRuleId", "()Ljava/lang/String;", "HOME_STICKY_BANNER", "HOME_BOTTOM_SHEET", "MTICKET_MIN_PROFILE_FLOW", "INSTANT_TICKET_MIN_PROFILE_FLOW", "CONFIRM_SUPER_PASS_PURCHASE_MIN_PROFILE_FLOW", "CHALO_BUS_STICKY_BANNER", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum UserProfilingHookSlot {
    HOME_STICKY_BANNER("userProfilingHomeStickyBanner"),
    HOME_BOTTOM_SHEET("userProfilingHomeBottomSheet"),
    MTICKET_MIN_PROFILE_FLOW("mticketMinProfileFlow"),
    INSTANT_TICKET_MIN_PROFILE_FLOW("instantTicketMinProfileFlow"),
    CONFIRM_SUPER_PASS_PURCHASE_MIN_PROFILE_FLOW("confirmSuperPassPurchaseMinProfileFlow"),
    CHALO_BUS_STICKY_BANNER("userProfilingChaloBusStickyBanner");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());
    private final String ruleId;

    UserProfilingHookSlot(String str) {
        this.ruleId = str;
    }

    public static EnumEntries<UserProfilingHookSlot> getEntries() {
        return $ENTRIES;
    }

    public final String getRuleId() {
        return this.ruleId;
    }
}
