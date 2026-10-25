package app.chalo.checkout.ui.screen.payment;

import app.chalo.uistate.button.ClickableTextUiState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIState;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/PaymentModeCardHeaderUiState;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PaymentModeCardHeaderUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentModeCardHeaderUiSpec f1545a;
    public final TextWithSpecialFeaturesTagsUIState b;
    public final ClickableTextUiState c;
    public final TextUIState.ChaloTextUIState d;

    public PaymentModeCardHeaderUiState(TextWithSpecialFeaturesTagsUIState cardTitleWithTagsState, ClickableTextUiState clickableTextUiState, TextUIState.ChaloTextUIState chaloTextUIState, int i) {
        PaymentModeCardHeaderUiSpec paymentModeCardHeaderUiSpec = new PaymentModeCardHeaderUiSpec();
        cardTitleWithTagsState = (i & 2) != 0 ? new TextWithSpecialFeaturesTagsUIState(EmptyList.f17557a) : cardTitleWithTagsState;
        clickableTextUiState = (i & 4) != 0 ? null : clickableTextUiState;
        chaloTextUIState = (i & 8) != 0 ? null : chaloTextUIState;
        Intrinsics.i(cardTitleWithTagsState, "cardTitleWithTagsState");
        this.f1545a = paymentModeCardHeaderUiSpec;
        this.b = cardTitleWithTagsState;
        this.c = clickableTextUiState;
        this.d = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentModeCardHeaderUiState)) {
            return false;
        }
        PaymentModeCardHeaderUiState paymentModeCardHeaderUiState = (PaymentModeCardHeaderUiState) obj;
        return Intrinsics.d(this.f1545a, paymentModeCardHeaderUiState.f1545a) && Intrinsics.d(this.b, paymentModeCardHeaderUiState.b) && Intrinsics.d(this.c, paymentModeCardHeaderUiState.c) && Intrinsics.d(this.d, paymentModeCardHeaderUiState.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f1545a.hashCode() * 31)) * 31;
        ClickableTextUiState clickableTextUiState = this.c;
        int iHashCode2 = (iHashCode + (clickableTextUiState == null ? 0 : clickableTextUiState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.d;
        return iHashCode2 + (chaloTextUIState != null ? chaloTextUIState.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentModeCardHeaderUiState(specs=" + this.f1545a + ", cardTitleWithTagsState=" + this.b + ", cardHeaderCtaUiState=" + this.c + ", cardSubTitleTextState=" + this.d + ")";
    }
}
