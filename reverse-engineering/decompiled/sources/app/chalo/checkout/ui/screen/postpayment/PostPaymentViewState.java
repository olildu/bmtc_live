package app.chalo.checkout.ui.screen.postpayment;

import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.success.StandardSuccessScreenUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/postpayment/PostPaymentViewState;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PostPaymentViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoadingDialogUIState f1597a;
    public final StandardErrorScreenUIState.NewErrorWithMsgAndRetry b;
    public final StandardSuccessScreenUIState.SuccessWithGifMsgAndCta c;

    public PostPaymentViewState(LoadingDialogUIState loadingDialogUIState, StandardErrorScreenUIState.NewErrorWithMsgAndRetry newErrorWithMsgAndRetry, StandardSuccessScreenUIState.SuccessWithGifMsgAndCta successWithGifMsgAndCta) {
        this.f1597a = loadingDialogUIState;
        this.b = newErrorWithMsgAndRetry;
        this.c = successWithGifMsgAndCta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostPaymentViewState)) {
            return false;
        }
        PostPaymentViewState postPaymentViewState = (PostPaymentViewState) obj;
        return Intrinsics.d(this.f1597a, postPaymentViewState.f1597a) && Intrinsics.d(this.b, postPaymentViewState.b) && Intrinsics.d(this.c, postPaymentViewState.c);
    }

    public final int hashCode() {
        LoadingDialogUIState loadingDialogUIState = this.f1597a;
        int iHashCode = (loadingDialogUIState == null ? 0 : loadingDialogUIState.hashCode()) * 31;
        StandardErrorScreenUIState.NewErrorWithMsgAndRetry newErrorWithMsgAndRetry = this.b;
        int iHashCode2 = (iHashCode + (newErrorWithMsgAndRetry == null ? 0 : newErrorWithMsgAndRetry.hashCode())) * 31;
        StandardSuccessScreenUIState.SuccessWithGifMsgAndCta successWithGifMsgAndCta = this.c;
        return iHashCode2 + (successWithGifMsgAndCta != null ? successWithGifMsgAndCta.hashCode() : 0);
    }

    public final String toString() {
        return "PostPaymentViewState(loadingDialogState=" + this.f1597a + ", errorDetailsUiState=" + this.b + ", successDetailsUIState=" + this.c + ")";
    }
}
