package app.chalo.checkout.ui.screen.checkout.razorpay;

import defpackage.b3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/checkout/razorpay/CheckoutViewState;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CheckoutViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f1492a;
    public final Boolean b;
    public final boolean c;

    public /* synthetic */ CheckoutViewState() {
        this(null, null, false);
    }

    public static CheckoutViewState a(CheckoutViewState checkoutViewState, Boolean bool, int i) {
        Boolean bool2 = Boolean.TRUE;
        if ((i & 1) != 0) {
            bool2 = checkoutViewState.f1492a;
        }
        if ((i & 2) != 0) {
            bool = checkoutViewState.b;
        }
        boolean z = (i & 4) != 0 ? checkoutViewState.c : false;
        checkoutViewState.getClass();
        return new CheckoutViewState(bool2, bool, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutViewState)) {
            return false;
        }
        CheckoutViewState checkoutViewState = (CheckoutViewState) obj;
        return Intrinsics.d(this.f1492a, checkoutViewState.f1492a) && Intrinsics.d(this.b, checkoutViewState.b) && this.c == checkoutViewState.c;
    }

    public final int hashCode() {
        Boolean bool = this.f1492a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        return ((iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckoutViewState(showCheckoutWebView=");
        sb.append(this.f1492a);
        sb.append(", showDialogLoader=");
        sb.append(this.b);
        sb.append(", showToolbar=");
        return b3.g(")", sb, this.c);
    }

    public CheckoutViewState(Boolean bool, Boolean bool2, boolean z) {
        this.f1492a = bool;
        this.b = bool2;
        this.c = z;
    }
}
