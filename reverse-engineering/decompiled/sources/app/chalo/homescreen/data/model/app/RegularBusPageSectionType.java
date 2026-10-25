package app.chalo.homescreen.data.model.app;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusPageSectionType;", "", "sectionType", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getSectionType", "()Ljava/lang/String;", "NEARBY_BUS_STOPS", "NEARBY_BUSES", "TICKETS_PASSES", "PLOTLINE_WIDGET", "FAQ", "PRODUCT_PURCHASE", "FOOTER", "DIVIDER", "GAM_BANNER_AD", "REGULAR_BUS_UNIFIED_AD", "IMAGE_RESOURCE", "UNKNOWN", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum RegularBusPageSectionType {
    NEARBY_BUS_STOPS("NEARBY_BUS_STOPS"),
    NEARBY_BUSES("NEARBY_BUSES"),
    TICKETS_PASSES("TICKETS_PASSES"),
    PLOTLINE_WIDGET("PLOTLINE_WIDGET"),
    FAQ("FAQ"),
    PRODUCT_PURCHASE("PRODUCT_PURCHASE"),
    FOOTER("FOOTER"),
    DIVIDER("DIVIDER"),
    GAM_BANNER_AD("GAM_BANNER_AD"),
    REGULAR_BUS_UNIFIED_AD("REGULAR_BUS_UNIFIED_AD"),
    IMAGE_RESOURCE("IMAGE_RESOURCE"),
    UNKNOWN("UNKNOWN");

    private final String sectionType;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/homescreen/data/model/app/RegularBusPageSectionType$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static RegularBusPageSectionType a(String sectionTypeString) {
            RegularBusPageSectionType next;
            Intrinsics.i(sectionTypeString, "sectionTypeString");
            Iterator<RegularBusPageSectionType> it = RegularBusPageSectionType.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(next.getSectionType(), sectionTypeString));
            RegularBusPageSectionType regularBusPageSectionType = next;
            return regularBusPageSectionType == null ? RegularBusPageSectionType.UNKNOWN : regularBusPageSectionType;
        }
    }

    RegularBusPageSectionType(String str) {
        this.sectionType = str;
    }

    public static EnumEntries<RegularBusPageSectionType> getEntries() {
        return $ENTRIES;
    }

    public final String getSectionType() {
        return this.sectionType;
    }
}
