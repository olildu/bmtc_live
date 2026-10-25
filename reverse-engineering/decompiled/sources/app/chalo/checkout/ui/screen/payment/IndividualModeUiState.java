package app.chalo.checkout.ui.screen.payment;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.divider.DividerUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/IndividualModeUiState;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IndividualModeUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IndividualModeUiSpec f1515a = new IndividualModeUiSpec();
    public final ModeItemDetailsUiState b;
    public final DividerUIState c;
    public final UiEventHandler$Companion$fromLambda$1 d;

    public IndividualModeUiState(ModeItemDetailsUiState modeItemDetailsUiState, DividerUIState dividerUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.b = modeItemDetailsUiState;
        this.c = dividerUIState;
        this.d = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndividualModeUiState)) {
            return false;
        }
        IndividualModeUiState individualModeUiState = (IndividualModeUiState) obj;
        return Intrinsics.d(this.f1515a, individualModeUiState.f1515a) && Intrinsics.d(this.b, individualModeUiState.b) && Intrinsics.d(this.c, individualModeUiState.c) && Intrinsics.d(this.d, individualModeUiState.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f1515a.hashCode() * 31)) * 31;
        DividerUIState dividerUIState = this.c;
        int iHashCode2 = (iHashCode + (dividerUIState == null ? 0 : dividerUIState.hashCode())) * 31;
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1 = this.d;
        return iHashCode2 + (uiEventHandler$Companion$fromLambda$1 != null ? uiEventHandler$Companion$fromLambda$1.hashCode() : 0);
    }

    public final String toString() {
        return "IndividualModeUiState(individualModeUiSpec=" + this.f1515a + ", modeItemDetailsUiState=" + this.b + ", cardDividerUiState=" + this.c + ", itemClickEventHandler=" + this.d + ")";
    }
}
