package app.chalo.premiumbus.data.models.app;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PremiumBusBookingAvailableOptionType;", "", "optionTypeStr", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getOptionTypeStr", "()Ljava/lang/String;", "SUPER_PASS", "OTHERS", "CUSTOMER_SUPPORT", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum PremiumBusBookingAvailableOptionType {
    SUPER_PASS("pass"),
    OTHERS("others"),
    CUSTOMER_SUPPORT("customer_support");

    private final String optionTypeStr;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PremiumBusBookingAvailableOptionType$Companion;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    PremiumBusBookingAvailableOptionType(String str) {
        this.optionTypeStr = str;
    }

    public static EnumEntries<PremiumBusBookingAvailableOptionType> getEntries() {
        return $ENTRIES;
    }

    public final String getOptionTypeStr() {
        return this.optionTypeStr;
    }
}
