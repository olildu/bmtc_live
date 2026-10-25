package app.chalo.home.ui.history.uistate;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import defpackage.zf0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/TabUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TabUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TabSpec f3486a;
    public final TextUIState.ChaloTextUIState b;
    public final boolean c;
    public final zf0 d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public TabUiState(TabSpec tabSpec, TextUIState.ChaloTextUIState chaloTextUIState, boolean z, zf0 zf0Var) {
        this.f3486a = tabSpec;
        this.b = chaloTextUIState;
        this.c = z;
        this.d = zf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabUiState)) {
            return false;
        }
        TabUiState tabUiState = (TabUiState) obj;
        return this.f3486a.equals(tabUiState.f3486a) && this.b.equals(tabUiState.b) && this.c == tabUiState.c && this.d.equals(tabUiState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((r30.f(this.b, this.f3486a.hashCode() * 31, 31) + (this.c ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "TabUiState(spec=" + this.f3486a + ", tabText=" + this.b + ", isSelected=" + this.c + ", onClick=" + this.d + ")";
    }
}
