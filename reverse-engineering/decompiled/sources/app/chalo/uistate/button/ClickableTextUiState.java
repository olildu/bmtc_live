package app.chalo.uistate.button;

import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/button/ClickableTextUiState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ClickableTextUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f9922a;
    public final ImageUIState b;
    public final UiAlignment c;
    public final UiEventHandler$Companion$fromLambda$1 d;

    public ClickableTextUiState(TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, int i) {
        imageUIState = (i & 4) != 0 ? null : imageUIState;
        this.f9922a = chaloTextUIState;
        this.b = imageUIState;
        this.c = UiAlignment.Vertical.Center.f9888a;
        this.d = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableTextUiState)) {
            return false;
        }
        ClickableTextUiState clickableTextUiState = (ClickableTextUiState) obj;
        return this.f9922a.equals(clickableTextUiState.f9922a) && Intrinsics.d(this.b, clickableTextUiState.b) && this.c.equals(clickableTextUiState.c) && this.d.equals(clickableTextUiState.d);
    }

    public final int hashCode() {
        int iHashCode = this.f9922a.hashCode() * 961;
        ImageUIState imageUIState = this.b;
        return this.d.hashCode() + ((((this.c.hashCode() + ((iHashCode + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31)) * 31) + 1231) * 31);
    }

    public final String toString() {
        return "ClickableTextUiState(textState=" + this.f9922a + ", leadingIconState=null, trailingIconState=" + this.b + ", verticalAlignment=" + this.c + ", enabled=true, eventHandler=" + this.d + ")";
    }
}
