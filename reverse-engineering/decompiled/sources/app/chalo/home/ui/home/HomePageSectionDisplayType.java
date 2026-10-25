package app.chalo.home.ui.home;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/home/ui/home/HomePageSectionDisplayType;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE_RESOURCE", "GRID", CLConstants.CREDTYPE_DEBIT_TYPE, "PLOTLINE_WIDGET", "GAM_BANNER_AD", "ADSTER_UNIFIED_AD", "FOOTER", "DIVIDER", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum HomePageSectionDisplayType {
    IMAGE_RESOURCE,
    GRID,
    CARD,
    PLOTLINE_WIDGET,
    GAM_BANNER_AD,
    ADSTER_UNIFIED_AD,
    FOOTER,
    DIVIDER;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    public static EnumEntries<HomePageSectionDisplayType> getEntries() {
        return $ENTRIES;
    }
}
