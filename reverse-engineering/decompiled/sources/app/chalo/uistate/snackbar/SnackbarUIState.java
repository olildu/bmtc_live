package app.chalo.uistate.snackbar;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.text.TextUIState;
import defpackage.n21;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/snackbar/SnackbarUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SnackbarUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f10070a;
    public final TextUIState.ChaloTextUIState b;
    public final UiEventHandler c;

    public SnackbarUIState(TextUIState.ChaloTextUIState text, TextUIState.ChaloTextUIState chaloTextUIState, UiEventHandler uiEventHandler) {
        Intrinsics.i(text, "text");
        this.f10070a = text;
        this.b = chaloTextUIState;
        this.c = uiEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnackbarUIState)) {
            return false;
        }
        SnackbarUIState snackbarUIState = (SnackbarUIState) obj;
        return Intrinsics.d(this.f10070a, snackbarUIState.f10070a) && Intrinsics.d(this.b, snackbarUIState.b) && Intrinsics.d(this.c, snackbarUIState.c);
    }

    public final int hashCode() {
        int iHashCode = this.f10070a.hashCode() * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        int iHashCode2 = (iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        UiEventHandler uiEventHandler = this.c;
        return iHashCode2 + (uiEventHandler != null ? uiEventHandler.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = n21.j("SnackbarUIState(text=", this.f10070a, ", actionText=", this.b, ", actionClickHandler=");
        sbJ.append(this.c);
        sbJ.append(")");
        return sbJ.toString();
    }
}
