package app.chalo.checkout.ui.screen.upi;

import app.chalo.checkout.data.model.ui.CheckoutPaymentItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/ui/screen/upi/UpiAppsViewIntent;", "", "LoadUpiAppsListIntent", "UpiAppSelected", "Lapp/chalo/checkout/ui/screen/upi/UpiAppsViewIntent$LoadUpiAppsListIntent;", "Lapp/chalo/checkout/ui/screen/upi/UpiAppsViewIntent$UpiAppSelected;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UpiAppsViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/upi/UpiAppsViewIntent$LoadUpiAppsListIntent;", "Lapp/chalo/checkout/ui/screen/upi/UpiAppsViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LoadUpiAppsListIntent extends UpiAppsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LoadUpiAppsListIntent f1605a = new LoadUpiAppsListIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/upi/UpiAppsViewIntent$UpiAppSelected;", "Lapp/chalo/checkout/ui/screen/upi/UpiAppsViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpiAppSelected extends UpiAppsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheckoutPaymentItem.IndividualCheckoutItem.UPIIntentPaymentItem f1606a;

        public UpiAppSelected(CheckoutPaymentItem.IndividualCheckoutItem.UPIIntentPaymentItem uPIIntentPaymentItem) {
            this.f1606a = uPIIntentPaymentItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpiAppSelected) && Intrinsics.d(this.f1606a, ((UpiAppSelected) obj).f1606a);
        }

        public final int hashCode() {
            return this.f1606a.hashCode();
        }

        public final String toString() {
            return "UpiAppSelected(appItem=" + this.f1606a + ")";
        }
    }
}
