package app.chalo.checkout.ui.screen.upi;

import app.chalo.uistate.toolbar.ToolbarUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/upi/UpiAppsViewState;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UpiAppsViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpiAppsUiSpecs f1607a;
    public final ToolbarUIState b;
    public final UpiAppsScreenState c;

    public UpiAppsViewState(ToolbarUIState toolbarUIState, UpiAppsScreenState upiAppsScreenState) {
        UpiAppsUiSpecs upiAppsUiSpecs = new UpiAppsUiSpecs();
        Intrinsics.i(upiAppsScreenState, "upiAppsScreenState");
        this.f1607a = upiAppsUiSpecs;
        this.b = toolbarUIState;
        this.c = upiAppsScreenState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpiAppsViewState)) {
            return false;
        }
        UpiAppsViewState upiAppsViewState = (UpiAppsViewState) obj;
        return Intrinsics.d(this.f1607a, upiAppsViewState.f1607a) && Intrinsics.d(this.b, upiAppsViewState.b) && Intrinsics.d(this.c, upiAppsViewState.c);
    }

    public final int hashCode() {
        int iHashCode = this.f1607a.f1604a.hashCode() * 31;
        ToolbarUIState toolbarUIState = this.b;
        return this.c.hashCode() + ((iHashCode + (toolbarUIState == null ? 0 : toolbarUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "UpiAppsViewState(specs=" + this.f1607a + ", toolbarUiState=" + this.b + ", upiAppsScreenState=" + this.c + ")";
    }
}
