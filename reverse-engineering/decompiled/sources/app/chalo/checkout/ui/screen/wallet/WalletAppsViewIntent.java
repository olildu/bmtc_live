package app.chalo.checkout.ui.screen.wallet;

import app.chalo.checkout.data.model.ui.CheckoutPaymentItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/checkout/ui/screen/wallet/WalletAppsViewIntent;", "", "LoadWalletAppsListIntent", "WalletAppSelected", "Lapp/chalo/checkout/ui/screen/wallet/WalletAppsViewIntent$LoadWalletAppsListIntent;", "Lapp/chalo/checkout/ui/screen/wallet/WalletAppsViewIntent$WalletAppSelected;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WalletAppsViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/wallet/WalletAppsViewIntent$LoadWalletAppsListIntent;", "Lapp/chalo/checkout/ui/screen/wallet/WalletAppsViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LoadWalletAppsListIntent extends WalletAppsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LoadWalletAppsListIntent f1611a = new LoadWalletAppsListIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/wallet/WalletAppsViewIntent$WalletAppSelected;", "Lapp/chalo/checkout/ui/screen/wallet/WalletAppsViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WalletAppSelected extends WalletAppsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheckoutPaymentItem.IndividualCheckoutItem f1612a;

        public WalletAppSelected(CheckoutPaymentItem.IndividualCheckoutItem individualCheckoutItem) {
            this.f1612a = individualCheckoutItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WalletAppSelected) && Intrinsics.d(this.f1612a, ((WalletAppSelected) obj).f1612a);
        }

        public final int hashCode() {
            return this.f1612a.hashCode();
        }

        public final String toString() {
            return "WalletAppSelected(appItem=" + this.f1612a + ")";
        }
    }
}
