package app.chalo.checkout.ui.screen.upi;

import app.chalo.checkout.ui.screen.payment.PaymentCardUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/ui/screen/upi/UpiAppsScreenState;", "", "UpiApps", "NoUpiApps", "Lapp/chalo/checkout/ui/screen/upi/UpiAppsScreenState$NoUpiApps;", "Lapp/chalo/checkout/ui/screen/upi/UpiAppsScreenState$UpiApps;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UpiAppsScreenState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/upi/UpiAppsScreenState$NoUpiApps;", "Lapp/chalo/checkout/ui/screen/upi/UpiAppsScreenState;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoUpiApps extends UpiAppsScreenState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NoUpiAppsErrorUiState f1602a;

        public NoUpiApps(NoUpiAppsErrorUiState noUpiAppsErrorUiState) {
            this.f1602a = noUpiAppsErrorUiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoUpiApps) && Intrinsics.d(this.f1602a, ((NoUpiApps) obj).f1602a);
        }

        public final int hashCode() {
            return this.f1602a.hashCode();
        }

        public final String toString() {
            return "NoUpiApps(data=" + this.f1602a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/upi/UpiAppsScreenState$UpiApps;", "Lapp/chalo/checkout/ui/screen/upi/UpiAppsScreenState;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpiApps extends UpiAppsScreenState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentCardUiState f1603a;

        public UpiApps(PaymentCardUiState paymentCardUiState) {
            this.f1603a = paymentCardUiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpiApps) && Intrinsics.d(this.f1603a, ((UpiApps) obj).f1603a);
        }

        public final int hashCode() {
            return this.f1603a.hashCode();
        }

        public final String toString() {
            return "UpiApps(data=" + this.f1603a + ")";
        }
    }
}
