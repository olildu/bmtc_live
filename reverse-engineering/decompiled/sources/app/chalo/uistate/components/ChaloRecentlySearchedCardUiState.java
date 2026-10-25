package app.chalo.uistate.components;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/ChaloRecentlySearchedCardUiState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloRecentlySearchedCardUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloRecentlySearchedCardSpec f9933a;
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final UiEventHandler$Companion$fromLambda$1 e;

    public ChaloRecentlySearchedCardUiState(ChaloRecentlySearchedCardSpec chaloRecentlySearchedCardSpec, ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.f9933a = chaloRecentlySearchedCardSpec;
        this.b = imageUIState;
        this.c = chaloTextUIState;
        this.d = chaloTextUIState2;
        this.e = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloRecentlySearchedCardUiState)) {
            return false;
        }
        ChaloRecentlySearchedCardUiState chaloRecentlySearchedCardUiState = (ChaloRecentlySearchedCardUiState) obj;
        return this.f9933a.equals(chaloRecentlySearchedCardUiState.f9933a) && this.b.equals(chaloRecentlySearchedCardUiState.b) && this.c.equals(chaloRecentlySearchedCardUiState.c) && this.d.equals(chaloRecentlySearchedCardUiState.d) && this.e.equals(chaloRecentlySearchedCardUiState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + r30.f(this.d, r30.f(this.c, r30.e(this.b, this.f9933a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChaloRecentlySearchedCardUiState(spec=");
        sb.append(this.f9933a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", fromText=");
        r30.p(sb, this.c, ", toText=", this.d, ", eventHandler=");
        return nf1.n(sb, this.e, ")");
    }
}
