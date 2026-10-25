package app.chalo.validationsdk.vehiclebasedvalidation.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/ui/ValidateDetailButtonUIState;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ValidateDetailButtonUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f10741a;
    public final float b;
    public final ChaloPadding c;
    public final ButtonUIState d;

    public ValidateDetailButtonUIState(ButtonUIState buttonUIState, int i) {
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f2, f2, f2);
        ButtonUIState buttonUIState2 = (i & 8) != 0 ? new ButtonUIState(new TextUIState.ChaloTextUIState("", UITextStyle.HeadlineSmall, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188), false, UIShape.d, null, null, UiEventHandler.Companion.f9897a, 0.0f, null, 218) : buttonUIState;
        this.f10741a = ChaloColorToken.White.f9870a;
        this.b = f;
        this.c = chaloPadding;
        this.d = buttonUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateDetailButtonUIState)) {
            return false;
        }
        ValidateDetailButtonUIState validateDetailButtonUIState = (ValidateDetailButtonUIState) obj;
        return Intrinsics.d(this.f10741a, validateDetailButtonUIState.f10741a) && Dp.m7283equalsimpl0(this.b, validateDetailButtonUIState.b) && Intrinsics.d(this.c, validateDetailButtonUIState.c) && Intrinsics.d(this.d, validateDetailButtonUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.c(this.c, uf0.a(this.b, this.f10741a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ValidateDetailButtonUIState(backgroundCardBackgroundColorToken=" + this.f10741a + ", backgroundCardElevation=" + Dp.m7289toStringimpl(this.b) + ", buttonPadding=" + this.c + ", buttonUIState=" + this.d + ")";
    }
}
