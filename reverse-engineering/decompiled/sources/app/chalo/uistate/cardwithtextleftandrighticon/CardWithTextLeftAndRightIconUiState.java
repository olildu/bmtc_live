package app.chalo.uistate.cardwithtextleftandrighticon;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import defpackage.r30;
import defpackage.wb;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/cardwithtextleftandrighticon/CardWithTextLeftAndRightIconUiState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CardWithTextLeftAndRightIconUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardWithTextLeftAndRightIconUiSpecs f9926a;
    public final ImageUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final ImageUIState d;
    public final Function0 e;

    public CardWithTextLeftAndRightIconUiState(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState2, Function0 function0, int i) {
        CardWithTextLeftAndRightIconUiSpecs cardWithTextLeftAndRightIconUiSpecs = new CardWithTextLeftAndRightIconUiSpecs();
        ImageUIState imageUIState3 = (i & 2) != 0 ? null : imageUIState;
        TextUIState.ChaloTextUIState chaloTextUIState2 = (i & 4) != 0 ? new TextUIState.ChaloTextUIState("", UITextStyle.BodyMedium, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188) : chaloTextUIState;
        ImageUIState imageUIState4 = (i & 8) == 0 ? imageUIState2 : null;
        Function0 wbVar = (i & 16) != 0 ? new wb(8) : function0;
        this.f9926a = cardWithTextLeftAndRightIconUiSpecs;
        this.b = imageUIState3;
        this.c = chaloTextUIState2;
        this.d = imageUIState4;
        this.e = wbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardWithTextLeftAndRightIconUiState)) {
            return false;
        }
        CardWithTextLeftAndRightIconUiState cardWithTextLeftAndRightIconUiState = (CardWithTextLeftAndRightIconUiState) obj;
        return Intrinsics.d(this.f9926a, cardWithTextLeftAndRightIconUiState.f9926a) && Intrinsics.d(this.b, cardWithTextLeftAndRightIconUiState.b) && Intrinsics.d(this.c, cardWithTextLeftAndRightIconUiState.c) && Intrinsics.d(this.d, cardWithTextLeftAndRightIconUiState.d) && Intrinsics.d(this.e, cardWithTextLeftAndRightIconUiState.e);
    }

    public final int hashCode() {
        int iHashCode = this.f9926a.hashCode() * 31;
        ImageUIState imageUIState = this.b;
        int iF = r30.f(this.c, (iHashCode + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31, 31);
        ImageUIState imageUIState2 = this.d;
        return this.e.hashCode() + ((iF + (imageUIState2 != null ? imageUIState2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CardWithTextLeftAndRightIconUiState(cardUiSpecs=" + this.f9926a + ", leftImageUiState=" + this.b + ", textUiState=" + this.c + ", rightImageUiState=" + this.d + ", uiEventHandler=" + this.e + ")";
    }
}
