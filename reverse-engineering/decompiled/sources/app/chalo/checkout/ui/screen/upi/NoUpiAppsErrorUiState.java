package app.chalo.checkout.ui.screen.upi;

import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/upi/NoUpiAppsErrorUiState;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NoUpiAppsErrorUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NoUpiAppsErrorUiSpecs f1600a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final ImageUIState d;

    public NoUpiAppsErrorUiState(NoUpiAppsErrorUiSpecs specs, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, ImageUIState imageUIState) {
        Intrinsics.i(specs, "specs");
        this.f1600a = specs;
        this.b = chaloTextUIState;
        this.c = chaloTextUIState2;
        this.d = imageUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoUpiAppsErrorUiState)) {
            return false;
        }
        NoUpiAppsErrorUiState noUpiAppsErrorUiState = (NoUpiAppsErrorUiState) obj;
        return Intrinsics.d(this.f1600a, noUpiAppsErrorUiState.f1600a) && Intrinsics.d(this.b, noUpiAppsErrorUiState.b) && Intrinsics.d(this.c, noUpiAppsErrorUiState.c) && Intrinsics.d(this.d, noUpiAppsErrorUiState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f1600a.hashCode() * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        int iHashCode2 = (iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState2 = this.c;
        int iHashCode3 = (iHashCode2 + (chaloTextUIState2 == null ? 0 : chaloTextUIState2.hashCode())) * 31;
        ImageUIState imageUIState = this.d;
        return iHashCode3 + (imageUIState != null ? imageUIState.hashCode() : 0);
    }

    public final String toString() {
        return "NoUpiAppsErrorUiState(specs=" + this.f1600a + ", errorTitleState=" + this.b + ", errorMsgState=" + this.c + ", errorImageState=" + this.d + ")";
    }
}
