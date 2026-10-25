package app.chalo.premiumbus.data.models.app;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/ApplicableRuleLocationType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SLOT_SCREEN", "CHECKOUT_SCREEN", "PRODUCT_SCREEN", "CHALO_BUS_TAB", "PASS_PURCHASE_CONFIRMATION_SCREEN", "PASS_PLAN_SCREEN", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum ApplicableRuleLocationType {
    SLOT_SCREEN("SLOT_SCREEN"),
    CHECKOUT_SCREEN("CHECKOUT_SCREEN"),
    PRODUCT_SCREEN("PRODUCT_SCREEN"),
    CHALO_BUS_TAB("CHALO_BUS_TAB"),
    PASS_PURCHASE_CONFIRMATION_SCREEN("PASS_PURCHASE_CONFIRMATION_SCREEN"),
    PASS_PLAN_SCREEN("PASS_PLAN_SCREEN");

    private final String value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/ApplicableRuleLocationType$Companion;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    ApplicableRuleLocationType(String str) {
        this.value = str;
    }

    public static EnumEntries<ApplicableRuleLocationType> getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
