package app.chalo.checkout.ui.screen.netbanking;

import app.chalo.checkout.data.model.ui.CheckoutPaymentItem;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/checkout/ui/screen/netbanking/NetBankingAppsViewIntent;", "", "LoadNetBankingAppsListIntent", "NetBankingItemSelected", "NavigateBack", "SearchTextEntered", "Lapp/chalo/checkout/ui/screen/netbanking/NetBankingAppsViewIntent$LoadNetBankingAppsListIntent;", "Lapp/chalo/checkout/ui/screen/netbanking/NetBankingAppsViewIntent$NavigateBack;", "Lapp/chalo/checkout/ui/screen/netbanking/NetBankingAppsViewIntent$NetBankingItemSelected;", "Lapp/chalo/checkout/ui/screen/netbanking/NetBankingAppsViewIntent$SearchTextEntered;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NetBankingAppsViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/netbanking/NetBankingAppsViewIntent$LoadNetBankingAppsListIntent;", "Lapp/chalo/checkout/ui/screen/netbanking/NetBankingAppsViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LoadNetBankingAppsListIntent extends NetBankingAppsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LoadNetBankingAppsListIntent f1501a = new LoadNetBankingAppsListIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/netbanking/NetBankingAppsViewIntent$NavigateBack;", "Lapp/chalo/checkout/ui/screen/netbanking/NetBankingAppsViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateBack extends NetBankingAppsViewIntent {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/netbanking/NetBankingAppsViewIntent$NetBankingItemSelected;", "Lapp/chalo/checkout/ui/screen/netbanking/NetBankingAppsViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NetBankingItemSelected extends NetBankingAppsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheckoutPaymentItem.IndividualCheckoutItem.NetBankingPaymentItem f1502a;

        public NetBankingItemSelected(CheckoutPaymentItem.IndividualCheckoutItem.NetBankingPaymentItem netBankingPaymentItem) {
            this.f1502a = netBankingPaymentItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NetBankingItemSelected) && Intrinsics.d(this.f1502a, ((NetBankingItemSelected) obj).f1502a);
        }

        public final int hashCode() {
            return this.f1502a.hashCode();
        }

        public final String toString() {
            return "NetBankingItemSelected(item=" + this.f1502a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/netbanking/NetBankingAppsViewIntent$SearchTextEntered;", "Lapp/chalo/checkout/ui/screen/netbanking/NetBankingAppsViewIntent;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchTextEntered extends NetBankingAppsViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1503a;

        public SearchTextEntered(String text) {
            Intrinsics.i(text, "text");
            this.f1503a = text;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchTextEntered) && Intrinsics.d(this.f1503a, ((SearchTextEntered) obj).f1503a);
        }

        public final int hashCode() {
            return this.f1503a.hashCode();
        }

        public final String toString() {
            return vo1.B("SearchTextEntered(text=", this.f1503a, ")");
        }
    }
}
