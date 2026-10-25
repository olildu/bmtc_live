package app.chalo.home.ui.chalobus;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/home/ui/chalobus/ChaloBusPageSectionDisplayType;", "", "<init>", "(Ljava/lang/String;I)V", "PRODUCT_PURCHASE", CLConstants.CREDTYPE_DEBIT_TYPE, "PLOTLINE_WIDGET", "DIVIDER", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum ChaloBusPageSectionDisplayType {
    PRODUCT_PURCHASE,
    CARD,
    PLOTLINE_WIDGET,
    DIVIDER;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    public static EnumEntries<ChaloBusPageSectionDisplayType> getEntries() {
        return $ENTRIES;
    }
}
