package app.chalo.home.ui.chalobusrouteinfo;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.button.ClickableTextUiState;
import app.chalo.uistate.text.TextUIState;
import defpackage.gf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobusrouteinfo/ChaloBusRouteSuggestionCardUiState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusRouteSuggestionCardUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f3361a;
    public final ClickableTextUiState b;
    public final UiEventHandler$Companion$fromLambda$1 c;
    public final ChaloBusRouteSuggestionCardUiSpec d;

    public ChaloBusRouteSuggestionCardUiState(TextUIState.ChaloTextUIState title, ClickableTextUiState clickableTextUiState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        ChaloBusRouteSuggestionCardUiSpec chaloBusRouteSuggestionCardUiSpec = new ChaloBusRouteSuggestionCardUiSpec();
        Intrinsics.i(title, "title");
        this.f3361a = title;
        this.b = clickableTextUiState;
        this.c = uiEventHandler$Companion$fromLambda$1;
        this.d = chaloBusRouteSuggestionCardUiSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusRouteSuggestionCardUiState)) {
            return false;
        }
        ChaloBusRouteSuggestionCardUiState chaloBusRouteSuggestionCardUiState = (ChaloBusRouteSuggestionCardUiState) obj;
        return Intrinsics.d(this.f3361a, chaloBusRouteSuggestionCardUiState.f3361a) && Intrinsics.d(this.b, chaloBusRouteSuggestionCardUiState.b) && Intrinsics.d(this.c, chaloBusRouteSuggestionCardUiState.c) && Intrinsics.d(this.d, chaloBusRouteSuggestionCardUiState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gf.a(this.c, (this.b.hashCode() + (this.f3361a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ChaloBusRouteSuggestionCardUiState(title=" + this.f3361a + ", cta=" + this.b + ", onClick=" + this.c + ", specs=" + this.d + ")";
    }
}
