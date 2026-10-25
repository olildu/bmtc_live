package app.chalo.home.ui.history.uistate.chalobusticket;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/chalobusticket/BusTicketStatusUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BusTicketStatusUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BusTicketStatusSpec f3495a;
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public BusTicketStatusUiState(BusTicketStatusSpec spec, TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState) {
        Intrinsics.i(spec, "spec");
        this.f3495a = spec;
        this.b = chaloTextUIState;
        this.c = imageUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusTicketStatusUiState)) {
            return false;
        }
        BusTicketStatusUiState busTicketStatusUiState = (BusTicketStatusUiState) obj;
        return Intrinsics.d(this.f3495a, busTicketStatusUiState.f3495a) && Intrinsics.d(this.b, busTicketStatusUiState.b) && Intrinsics.d(this.c, busTicketStatusUiState.c);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f3495a.hashCode() * 31, 31);
        ImageUIState imageUIState = this.c;
        return iF + (imageUIState == null ? 0 : imageUIState.hashCode());
    }

    public final String toString() {
        return "BusTicketStatusUiState(spec=" + this.f3495a + ", statusText=" + this.b + ", statusIcon=" + this.c + ")";
    }
}
