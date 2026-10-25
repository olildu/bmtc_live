package app.chalo.uistate.dialog;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.text.TextUIState;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/DropDownMenuItemUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DropDownMenuItemUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f9993a;
    public final UiEventHandler$Companion$fromLambda$1 b;

    public DropDownMenuItemUIState(TextUIState.ChaloTextUIState chaloTextUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.f9993a = chaloTextUIState;
        this.b = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropDownMenuItemUIState)) {
            return false;
        }
        DropDownMenuItemUIState dropDownMenuItemUIState = (DropDownMenuItemUIState) obj;
        return this.f9993a.equals(dropDownMenuItemUIState.f9993a) && this.b.equals(dropDownMenuItemUIState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9993a.hashCode() * 31);
    }

    public final String toString() {
        return "DropDownMenuItemUIState(text=" + this.f9993a + ", clickHandler=" + this.b + ")";
    }
}
