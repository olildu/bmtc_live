package app.chalo.uistate.text;

import app.chalo.uistate.base.ChaloColorToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/text/StyledTextDataUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StyledTextDataUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10086a;
    public final ChaloColorToken b;
    public final UIFontWeight c;
    public final UITextStyle d;
    public final UITextDecoration e;
    public final UITextOverflow f;
    public final StyledTextClickHandler g;

    public StyledTextDataUIState(String text, ChaloColorToken chaloColorToken, UIFontWeight uIFontWeight, UITextStyle uITextStyle, UITextDecoration textDecoration, UITextOverflow textOverFlow, StyledTextClickHandler styledTextClickHandler, int i) {
        chaloColorToken = (i & 2) != 0 ? null : chaloColorToken;
        uIFontWeight = (i & 4) != 0 ? null : uIFontWeight;
        uITextStyle = (i & 8) != 0 ? null : uITextStyle;
        textDecoration = (i & 128) != 0 ? UITextDecoration.None : textDecoration;
        textOverFlow = (i & 256) != 0 ? UITextOverflow.Clip : textOverFlow;
        styledTextClickHandler = (i & 512) != 0 ? null : styledTextClickHandler;
        Intrinsics.i(text, "text");
        Intrinsics.i(textDecoration, "textDecoration");
        Intrinsics.i(textOverFlow, "textOverFlow");
        this.f10086a = text;
        this.b = chaloColorToken;
        this.c = uIFontWeight;
        this.d = uITextStyle;
        this.e = textDecoration;
        this.f = textOverFlow;
        this.g = styledTextClickHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StyledTextDataUIState)) {
            return false;
        }
        StyledTextDataUIState styledTextDataUIState = (StyledTextDataUIState) obj;
        return Intrinsics.d(this.f10086a, styledTextDataUIState.f10086a) && Intrinsics.d(this.b, styledTextDataUIState.b) && this.c == styledTextDataUIState.c && this.d == styledTextDataUIState.d && this.e == styledTextDataUIState.e && this.f == styledTextDataUIState.f && Intrinsics.d(this.g, styledTextDataUIState.g);
    }

    public final int hashCode() {
        int iHashCode = this.f10086a.hashCode() * 31;
        ChaloColorToken chaloColorToken = this.b;
        int iHashCode2 = (iHashCode + (chaloColorToken == null ? 0 : chaloColorToken.hashCode())) * 31;
        UIFontWeight uIFontWeight = this.c;
        int iHashCode3 = (iHashCode2 + (uIFontWeight == null ? 0 : uIFontWeight.hashCode())) * 31;
        UITextStyle uITextStyle = this.d;
        int iHashCode4 = (this.f.hashCode() + ((this.e.hashCode() + ((iHashCode3 + (uITextStyle == null ? 0 : uITextStyle.hashCode())) * 923521)) * 31)) * 31;
        StyledTextClickHandler styledTextClickHandler = this.g;
        return iHashCode4 + (styledTextClickHandler != null ? styledTextClickHandler.hashCode() : 0);
    }

    public final String toString() {
        return "StyledTextDataUIState(text=" + this.f10086a + ", color=" + this.b + ", fontWeight=" + this.c + ", fontStyle=" + this.d + ", background=null, textAlign=null, baselineShift=null, textDecoration=" + this.e + ", textOverFlow=" + this.f + ", clickEventHandler=" + this.g + ")";
    }
}
