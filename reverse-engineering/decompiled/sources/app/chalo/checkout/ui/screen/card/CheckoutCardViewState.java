package app.chalo.checkout.ui.screen.card;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.toolbar.ToolbarUIState;
import defpackage.r30;
import defpackage.t8;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/card/CheckoutCardViewState;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CheckoutCardViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckoutCardUiSpec f1446a;
    public final ToolbarUIState b;
    public final List c;
    public final ButtonUIState d;

    public CheckoutCardViewState(CheckoutCardUiSpec checkoutCardUiSpec, ToolbarUIState toolbarUiState, List paymentCardFieldUiState, ButtonUIState buttonUIState) {
        Intrinsics.i(checkoutCardUiSpec, "checkoutCardUiSpec");
        Intrinsics.i(toolbarUiState, "toolbarUiState");
        Intrinsics.i(paymentCardFieldUiState, "paymentCardFieldUiState");
        this.f1446a = checkoutCardUiSpec;
        this.b = toolbarUiState;
        this.c = paymentCardFieldUiState;
        this.d = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutCardViewState)) {
            return false;
        }
        CheckoutCardViewState checkoutCardViewState = (CheckoutCardViewState) obj;
        return Intrinsics.d(this.f1446a, checkoutCardViewState.f1446a) && Intrinsics.d(this.b, checkoutCardViewState.b) && Intrinsics.d(this.c, checkoutCardViewState.c) && Intrinsics.d(this.d, checkoutCardViewState.d);
    }

    public final int hashCode() {
        int iB = r30.b(t8.d(this.b, this.f1446a.hashCode() * 31, 31), 31, this.c);
        ButtonUIState buttonUIState = this.d;
        return iB + (buttonUIState == null ? 0 : buttonUIState.hashCode());
    }

    public final String toString() {
        return "CheckoutCardViewState(checkoutCardUiSpec=" + this.f1446a + ", toolbarUiState=" + this.b + ", paymentCardFieldUiState=" + this.c + ", cardBottomCtaUiState=" + this.d + ")";
    }
}
