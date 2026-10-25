package app.chalo.uistate.textField;

import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/textField/TextFieldWithErrorUiState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TextFieldWithErrorUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextFieldWithErrorUISpec f10109a;
    public final BaseTextFieldUIState b;
    public final TextUIState.ChaloTextUIState c;

    public TextFieldWithErrorUiState(TextFieldWithErrorUISpec textFieldWithErrorUISpec, BaseTextFieldUIState textFieldUiState, TextUIState.ChaloTextUIState chaloTextUIState) {
        Intrinsics.i(textFieldUiState, "textFieldUiState");
        this.f10109a = textFieldWithErrorUISpec;
        this.b = textFieldUiState;
        this.c = chaloTextUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldWithErrorUiState)) {
            return false;
        }
        TextFieldWithErrorUiState textFieldWithErrorUiState = (TextFieldWithErrorUiState) obj;
        return Intrinsics.d(this.f10109a, textFieldWithErrorUiState.f10109a) && Intrinsics.d(this.b, textFieldWithErrorUiState.b) && Intrinsics.d(this.c, textFieldWithErrorUiState.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f10109a.hashCode() * 31)) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.c;
        return iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextFieldWithErrorUiState(spec=");
        sb.append(this.f10109a);
        sb.append(", textFieldUiState=");
        sb.append(this.b);
        sb.append(", errorTextUIState=");
        return py.f(sb, this.c, ")");
    }
}
