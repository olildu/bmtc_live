package app.chalo.premiumbus.ui.slotselection;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPassAvailableOptionUIState;", "", "PassOption", "DefaultOption", "CustomerSupportOption", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPassAvailableOptionUIState$CustomerSupportOption;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPassAvailableOptionUIState$DefaultOption;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPassAvailableOptionUIState$PassOption;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusPassAvailableOptionUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPassAvailableOptionUIState$CustomerSupportOption;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPassAvailableOptionUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomerSupportOption extends PremiumBusPassAvailableOptionUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusDefaultOptionUIState f7844a;
        public final String b;

        public CustomerSupportOption(PremiumBusDefaultOptionUIState premiumBusDefaultOptionUIState, String customerSupportNumber) {
            Intrinsics.i(customerSupportNumber, "customerSupportNumber");
            this.f7844a = premiumBusDefaultOptionUIState;
            this.b = customerSupportNumber;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomerSupportOption)) {
                return false;
            }
            CustomerSupportOption customerSupportOption = (CustomerSupportOption) obj;
            return Intrinsics.d(this.f7844a, customerSupportOption.f7844a) && Intrinsics.d(this.b, customerSupportOption.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7844a.hashCode() * 31);
        }

        public final String toString() {
            return "CustomerSupportOption(state=" + this.f7844a + ", customerSupportNumber=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPassAvailableOptionUIState$DefaultOption;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPassAvailableOptionUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DefaultOption extends PremiumBusPassAvailableOptionUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusDefaultOptionUIState f7845a;

        public DefaultOption(PremiumBusDefaultOptionUIState premiumBusDefaultOptionUIState) {
            this.f7845a = premiumBusDefaultOptionUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DefaultOption) && Intrinsics.d(this.f7845a, ((DefaultOption) obj).f7845a);
        }

        public final int hashCode() {
            return this.f7845a.hashCode();
        }

        public final String toString() {
            return "DefaultOption(state=" + this.f7845a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPassAvailableOptionUIState$PassOption;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPassAvailableOptionUIState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassOption extends PremiumBusPassAvailableOptionUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusPassOptionUIState f7846a;

        public PassOption(PremiumBusPassOptionUIState premiumBusPassOptionUIState) {
            this.f7846a = premiumBusPassOptionUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PassOption) && Intrinsics.d(this.f7846a, ((PassOption) obj).f7846a);
        }

        public final int hashCode() {
            return this.f7846a.hashCode();
        }

        public final String toString() {
            return "PassOption(state=" + this.f7846a + ")";
        }
    }
}
