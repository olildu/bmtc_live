package app.chalo.homescreen.data.model.app;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ProfilePageItemDisplayType;", "", "displayType", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplayType", "()Ljava/lang/String;", CLConstants.CREDTYPE_DEBIT_TYPE, "LIST", "PLOTLINE_WIDGET", "DIVIDER", "UNKNOWN", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum ProfilePageItemDisplayType {
    CARD(CLConstants.CREDTYPE_DEBIT_TYPE),
    LIST("LIST"),
    PLOTLINE_WIDGET("PLOTLINE_WIDGET"),
    DIVIDER("DIVIDER"),
    UNKNOWN("UNKNOWN");

    private final String displayType;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ProfilePageItemDisplayType$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    ProfilePageItemDisplayType(String str) {
        this.displayType = str;
    }

    public static EnumEntries<ProfilePageItemDisplayType> getEntries() {
        return $ENTRIES;
    }

    public final String getDisplayType() {
        return this.displayType;
    }
}
