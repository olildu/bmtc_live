package app.chalo.checkout.ui.screen.payment;

import app.chalo.uistate.button.ClickableTextUiState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.error.ErrorBannerUiState;
import defpackage.r30;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentCardUiState;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PaymentCardUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentCardUiSpec f1529a;
    public final PaymentModeCardHeaderUiState b;
    public final ErrorBannerUiState c;
    public final List d;
    public final DividerUIState e;
    public final ClickableTextUiState f;
    public final PaymentCardShimmerUiState g;

    public PaymentCardUiState(PaymentCardUiSpec paymentCardUiSpec, PaymentModeCardHeaderUiState paymentModeCardHeaderUiState, ErrorBannerUiState errorBannerUiState, List modeListUiState, DividerUIState dividerUIState, ClickableTextUiState clickableTextUiState, PaymentCardShimmerUiState paymentCardShimmerUiState) {
        Intrinsics.i(paymentCardUiSpec, "paymentCardUiSpec");
        Intrinsics.i(modeListUiState, "modeListUiState");
        this.f1529a = paymentCardUiSpec;
        this.b = paymentModeCardHeaderUiState;
        this.c = errorBannerUiState;
        this.d = modeListUiState;
        this.e = dividerUIState;
        this.f = clickableTextUiState;
        this.g = paymentCardShimmerUiState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentCardUiState)) {
            return false;
        }
        PaymentCardUiState paymentCardUiState = (PaymentCardUiState) obj;
        return Intrinsics.d(this.f1529a, paymentCardUiState.f1529a) && Intrinsics.d(this.b, paymentCardUiState.b) && Intrinsics.d(this.c, paymentCardUiState.c) && Intrinsics.d(this.d, paymentCardUiState.d) && Intrinsics.d(this.e, paymentCardUiState.e) && Intrinsics.d(this.f, paymentCardUiState.f) && Intrinsics.d(this.g, paymentCardUiState.g);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f1529a.hashCode() * 31)) * 31;
        ErrorBannerUiState errorBannerUiState = this.c;
        int iB = r30.b((iHashCode + (errorBannerUiState == null ? 0 : errorBannerUiState.hashCode())) * 31, 31, this.d);
        DividerUIState dividerUIState = this.e;
        int iHashCode2 = (iB + (dividerUIState == null ? 0 : dividerUIState.hashCode())) * 31;
        ClickableTextUiState clickableTextUiState = this.f;
        int iHashCode3 = (iHashCode2 + (clickableTextUiState == null ? 0 : clickableTextUiState.hashCode())) * 31;
        PaymentCardShimmerUiState paymentCardShimmerUiState = this.g;
        return iHashCode3 + (paymentCardShimmerUiState != null ? paymentCardShimmerUiState.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentCardUiState(paymentCardUiSpec=" + this.f1529a + ", cardHeaderState=" + this.b + ", cardWarningUiState=" + this.c + ", modeListUiState=" + this.d + ", cardDividerUiState=" + this.e + ", cardCtaUiState=" + this.f + ", cardShimmerState=" + this.g + ")";
    }

    public PaymentCardUiState(PaymentCardUiSpec paymentCardUiSpec, ArrayList arrayList, int i) {
        this(paymentCardUiSpec, new PaymentModeCardHeaderUiState(null, null, null, 15), null, arrayList, null, null, null);
    }
}
