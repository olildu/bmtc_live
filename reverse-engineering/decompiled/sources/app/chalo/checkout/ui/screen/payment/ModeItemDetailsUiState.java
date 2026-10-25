package app.chalo.checkout.ui.screen.payment;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/ModeItemDetailsUiState;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ModeItemDetailsUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModeItemDetailsUiSpec f1518a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final CardLabelUiState e;
    public final CardIconUIState f;
    public final ImageUIState g;
    public final DividerUIState h;

    public ModeItemDetailsUiState(ModeItemDetailsUiSpec modeItemDetailsUiSpec, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, TextUIState.ChaloTextUIState chaloTextUIState3, CardLabelUiState cardLabelUiState, CardIconUIState cardIconUIState, ImageUIState imageUIState, DividerUIState dividerUIState, int i) {
        ModeItemDetailsUiSpec modeItemDetailsUiSpec2 = (i & 1) != 0 ? new ModeItemDetailsUiSpec(0.0f, null, 16383) : modeItemDetailsUiSpec;
        TextUIState.ChaloTextUIState chaloTextUIState4 = (i & 2) != 0 ? new TextUIState.ChaloTextUIState("", UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188) : chaloTextUIState;
        TextUIState.ChaloTextUIState chaloTextUIState5 = (i & 4) != 0 ? null : chaloTextUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState6 = (i & 8) != 0 ? null : chaloTextUIState3;
        CardLabelUiState cardLabelUiState2 = (i & 16) != 0 ? null : cardLabelUiState;
        CardIconUIState cardIconUIState2 = (i & 32) != 0 ? null : cardIconUIState;
        ImageUIState imageUIState2 = (i & 64) != 0 ? null : imageUIState;
        DividerUIState dividerUIState2 = (i & 128) != 0 ? new DividerUIState(0.0f, null, null, 7) : dividerUIState;
        this.f1518a = modeItemDetailsUiSpec2;
        this.b = chaloTextUIState4;
        this.c = chaloTextUIState5;
        this.d = chaloTextUIState6;
        this.e = cardLabelUiState2;
        this.f = cardIconUIState2;
        this.g = imageUIState2;
        this.h = dividerUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModeItemDetailsUiState)) {
            return false;
        }
        ModeItemDetailsUiState modeItemDetailsUiState = (ModeItemDetailsUiState) obj;
        return Intrinsics.d(this.f1518a, modeItemDetailsUiState.f1518a) && Intrinsics.d(this.b, modeItemDetailsUiState.b) && Intrinsics.d(this.c, modeItemDetailsUiState.c) && Intrinsics.d(this.d, modeItemDetailsUiState.d) && Intrinsics.d(this.e, modeItemDetailsUiState.e) && Intrinsics.d(this.f, modeItemDetailsUiState.f) && Intrinsics.d(this.g, modeItemDetailsUiState.g) && Intrinsics.d(this.h, modeItemDetailsUiState.h);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f1518a.hashCode() * 31, 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.c;
        int iHashCode = (iF + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState2 = this.d;
        int iHashCode2 = (iHashCode + (chaloTextUIState2 == null ? 0 : chaloTextUIState2.hashCode())) * 31;
        CardLabelUiState cardLabelUiState = this.e;
        int iHashCode3 = (iHashCode2 + (cardLabelUiState == null ? 0 : cardLabelUiState.hashCode())) * 31;
        CardIconUIState cardIconUIState = this.f;
        int iHashCode4 = (iHashCode3 + (cardIconUIState == null ? 0 : cardIconUIState.hashCode())) * 31;
        ImageUIState imageUIState = this.g;
        return ((this.h.hashCode() + ((iHashCode4 + (imageUIState != null ? imageUIState.hashCode() : 0)) * 31)) * 31) + 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModeItemDetailsUiState(itemDetailsUiSpec=");
        sb.append(this.f1518a);
        sb.append(", cardTitleTextState=");
        sb.append(this.b);
        sb.append(", cardDescriptionTextState=");
        r30.p(sb, this.c, ", warningTextState=", this.d, ", labelUiState=");
        sb.append(this.e);
        sb.append(", cardIcon=");
        sb.append(this.f);
        sb.append(", cardCtaIcon=");
        sb.append(this.g);
        sb.append(", itemDividerUiState=");
        sb.append(this.h);
        sb.append(", isEnabled=false)");
        return sb.toString();
    }
}
