package app.chalo.premiumbus.ui.slotselection;

import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PassPurchaseNudgeType;", "", "PassPurchaseNudgeCard", "PassPurchaseOptionsBottomSheet", "Lapp/chalo/premiumbus/ui/slotselection/PassPurchaseNudgeType$PassPurchaseNudgeCard;", "Lapp/chalo/premiumbus/ui/slotselection/PassPurchaseNudgeType$PassPurchaseOptionsBottomSheet;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PassPurchaseNudgeType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PassPurchaseNudgeType$PassPurchaseNudgeCard;", "Lapp/chalo/premiumbus/ui/slotselection/PassPurchaseNudgeType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PassPurchaseNudgeCard extends PassPurchaseNudgeType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PassPurchaseNudgeCard f7832a = new PassPurchaseNudgeCard();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PassPurchaseNudgeType$PassPurchaseOptionsBottomSheet;", "Lapp/chalo/premiumbus/ui/slotselection/PassPurchaseNudgeType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassPurchaseOptionsBottomSheet extends PassPurchaseNudgeType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f7833a;
        public final boolean b;

        public PassPurchaseOptionsBottomSheet(ArrayList arrayList, boolean z) {
            this.f7833a = arrayList;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PassPurchaseOptionsBottomSheet)) {
                return false;
            }
            PassPurchaseOptionsBottomSheet passPurchaseOptionsBottomSheet = (PassPurchaseOptionsBottomSheet) obj;
            return this.f7833a.equals(passPurchaseOptionsBottomSheet.f7833a) && this.b == passPurchaseOptionsBottomSheet.b;
        }

        public final int hashCode() {
            return (this.f7833a.hashCode() * 31) + (this.b ? 1231 : 1237);
        }

        public final String toString() {
            return "PassPurchaseOptionsBottomSheet(options=" + this.f7833a + ", isOnlySingleUnsupportedValuePassAvailable=" + this.b + ")";
        }
    }
}
