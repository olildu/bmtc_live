package app.chalo.uistate.components;

import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/TextWithFilledTrailingIconUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TextWithFilledTrailingIconUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextWithFilledTrailingIconSpec f9956a;
    public final TextUIState.ChaloTextUIState b;
    public final FilledIconUiState c;
    public final UiEventHandler d;

    public TextWithFilledTrailingIconUIState(TextUIState.ChaloTextUIState chaloTextUIState, FilledIconUiState filledIconUiState, UiEventHandler uiEventHandler, int i) {
        TextWithFilledTrailingIconSpec textWithFilledTrailingIconSpec = new TextWithFilledTrailingIconSpec();
        filledIconUiState = (i & 4) != 0 ? null : filledIconUiState;
        this.f9956a = textWithFilledTrailingIconSpec;
        this.b = chaloTextUIState;
        this.c = filledIconUiState;
        this.d = uiEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextWithFilledTrailingIconUIState)) {
            return false;
        }
        TextWithFilledTrailingIconUIState textWithFilledTrailingIconUIState = (TextWithFilledTrailingIconUIState) obj;
        return Intrinsics.d(this.f9956a, textWithFilledTrailingIconUIState.f9956a) && Intrinsics.d(this.b, textWithFilledTrailingIconUIState.b) && Intrinsics.d(this.c, textWithFilledTrailingIconUIState.c) && Intrinsics.d(this.d, textWithFilledTrailingIconUIState.d);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f9956a.hashCode() * 31, 31);
        FilledIconUiState filledIconUiState = this.c;
        return this.d.hashCode() + ((iF + (filledIconUiState == null ? 0 : filledIconUiState.hashCode())) * 31);
    }

    public final String toString() {
        return "TextWithFilledTrailingIconUIState(spec=" + this.f9956a + ", text=" + this.b + ", iconUiState=" + this.c + ", eventHandler=" + this.d + ")";
    }
}
