package app.chalo.homescreen.data.model.app;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lapp/chalo/homescreen/data/model/app/TicketsPageSectionType;", "", "sectionType", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getSectionType", "()Ljava/lang/String;", "TICKETS_TAB_HOOKS", "PRODUCT_PURCHASE", "UNKNOWN", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum TicketsPageSectionType {
    TICKETS_TAB_HOOKS("TICKETS_TAB_HOOKS"),
    PRODUCT_PURCHASE("PRODUCT_PURCHASE"),
    UNKNOWN("UNKNOWN");

    private final String sectionType;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/homescreen/data/model/app/TicketsPageSectionType$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static TicketsPageSectionType a(String sectionTypeString) {
            TicketsPageSectionType next;
            Intrinsics.i(sectionTypeString, "sectionTypeString");
            Iterator<TicketsPageSectionType> it = TicketsPageSectionType.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(next.getSectionType(), sectionTypeString));
            TicketsPageSectionType ticketsPageSectionType = next;
            return ticketsPageSectionType == null ? TicketsPageSectionType.UNKNOWN : ticketsPageSectionType;
        }
    }

    TicketsPageSectionType(String str) {
        this.sectionType = str;
    }

    public static EnumEntries<TicketsPageSectionType> getEntries() {
        return $ENTRIES;
    }

    public final String getSectionType() {
        return this.sectionType;
    }
}
