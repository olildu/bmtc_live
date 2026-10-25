package app.chalo.uistate.button;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/button/ButtonUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ButtonUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f9920a;
    public final boolean b;
    public final UIShape c;
    public final ButtonUIElevation d;
    public final ButtonUIColor e;
    public final UiEventHandler f;
    public final float g;
    public final ButtonBorderUISpec h;

    public ButtonUIState(TextUIState.ChaloTextUIState chaloTextUIState, boolean z, UIShape shape, ButtonUIElevation elevation, ButtonUIColor colors, UiEventHandler uiEventHandler, float f, ButtonBorderUISpec buttonBorderUISpec) {
        Intrinsics.i(shape, "shape");
        Intrinsics.i(elevation, "elevation");
        Intrinsics.i(colors, "colors");
        this.f9920a = chaloTextUIState;
        this.b = z;
        this.c = shape;
        this.d = elevation;
        this.e = colors;
        this.f = uiEventHandler;
        this.g = f;
        this.h = buttonBorderUISpec;
    }

    public static ButtonUIState a(ButtonUIState buttonUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, float f, int i) {
        TextUIState.ChaloTextUIState textState = buttonUIState.f9920a;
        boolean z = buttonUIState.b;
        UIShape shape = buttonUIState.c;
        ButtonUIElevation elevation = buttonUIState.d;
        ButtonUIColor colors = buttonUIState.e;
        UiEventHandler uiEventHandler = uiEventHandler$Companion$fromLambda$1;
        if ((i & 32) != 0) {
            uiEventHandler = buttonUIState.f;
        }
        UiEventHandler eventHandler = uiEventHandler;
        if ((i & 64) != 0) {
            f = buttonUIState.g;
        }
        ButtonBorderUISpec buttonBorderUISpec = buttonUIState.h;
        buttonUIState.getClass();
        Intrinsics.i(textState, "textState");
        Intrinsics.i(shape, "shape");
        Intrinsics.i(elevation, "elevation");
        Intrinsics.i(colors, "colors");
        Intrinsics.i(eventHandler, "eventHandler");
        return new ButtonUIState(textState, z, shape, elevation, colors, eventHandler, f, buttonBorderUISpec);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonUIState)) {
            return false;
        }
        ButtonUIState buttonUIState = (ButtonUIState) obj;
        return Intrinsics.d(this.f9920a, buttonUIState.f9920a) && this.b == buttonUIState.b && Intrinsics.d(this.c, buttonUIState.c) && Intrinsics.d(this.d, buttonUIState.d) && Intrinsics.d(this.e, buttonUIState.e) && Intrinsics.d(this.f, buttonUIState.f) && Dp.m7283equalsimpl0(this.g, buttonUIState.g) && Intrinsics.d(this.h, buttonUIState.h);
    }

    public final int hashCode() {
        int iA = uf0.a(this.g, (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + pk0.b(this.c, ((this.f9920a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31, 31)) * 31)) * 31)) * 31, 31);
        ButtonBorderUISpec buttonBorderUISpec = this.h;
        return iA + (buttonBorderUISpec == null ? 0 : buttonBorderUISpec.hashCode());
    }

    public final String toString() {
        return "ButtonUIState(textState=" + this.f9920a + ", enabled=" + this.b + ", shape=" + this.c + ", elevation=" + this.d + ", colors=" + this.e + ", eventHandler=" + this.f + ", buttonHeight=" + Dp.m7289toStringimpl(this.g) + ", borderUISpec=" + this.h + ")";
    }

    public ButtonUIState(TextUIState.ChaloTextUIState chaloTextUIState, boolean z, UIShape uIShape, ButtonUIElevation buttonUIElevation, ButtonUIColor buttonUIColor, UiEventHandler uiEventHandler, float f, ButtonBorderUISpec buttonBorderUISpec, int i) {
        this(chaloTextUIState, (i & 2) != 0 ? true : z, (i & 4) != 0 ? UIShape.c : uIShape, (i & 8) != 0 ? new ButtonUIElevation() : buttonUIElevation, (i & 16) != 0 ? new ButtonUIColor((ChaloColorToken) null, 3) : buttonUIColor, uiEventHandler, (i & 64) != 0 ? ChaloThemeHelper.a().n : f, (i & 128) != 0 ? null : buttonBorderUISpec);
    }
}
