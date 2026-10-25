package app.chalo.home.ui.history.uistate.tabheader;

import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/tabheader/HeaderTextUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HeaderTextUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HeaderTextSpec f3527a = new HeaderTextSpec();
    public final TextUIState.ChaloTextUIState b;

    public HeaderTextUiState(TextUIState.ChaloTextUIState chaloTextUIState) {
        this.b = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderTextUiState)) {
            return false;
        }
        HeaderTextUiState headerTextUiState = (HeaderTextUiState) obj;
        return Intrinsics.d(this.f3527a, headerTextUiState.f3527a) && Intrinsics.d(this.b, headerTextUiState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3527a.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderTextUiState(spec=" + this.f3527a + ", text=" + this.b + ")";
    }
}
