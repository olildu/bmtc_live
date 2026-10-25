package app.chalo.electricitybill.ui.paymenthistory.model;

import com.inmobi.unification.sdk.InitializationStatus;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/electricitybill/ui/paymenthistory/model/ElectricityBillPaymentStatus;", "", "label", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", InitializationStatus.SUCCESS, "Processing", "Failed", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum ElectricityBillPaymentStatus {
    Success("SUCCESS"),
    Processing("INITIATED"),
    Failed("FAILED");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());
    private final String label;

    ElectricityBillPaymentStatus(String str) {
        this.label = str;
    }

    public static EnumEntries<ElectricityBillPaymentStatus> getEntries() {
        return $ENTRIES;
    }

    public final String getLabel() {
        return this.label;
    }
}
