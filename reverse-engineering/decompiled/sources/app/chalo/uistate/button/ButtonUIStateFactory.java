package app.chalo.uistate.button;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.components.FilledIconSpec;
import app.chalo.uistate.components.FilledIconUiState;
import app.chalo.uistate.components.TextWithFilledTrailingIconUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.image.UISize;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/button/ButtonUIStateFactory;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ButtonUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ButtonUIStateFactory f9921a = new ButtonUIStateFactory();

    public static TextWithFilledTrailingIconUIState a(String text, UITextStyle textStyle, UIFontWeight textUIFontWeight, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        Intrinsics.i(text, "text");
        Intrinsics.i(textStyle, "textStyle");
        Intrinsics.i(textUIFontWeight, "textUIFontWeight");
        TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState(text, textStyle, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, textUIFontWeight, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
        UIShape.Circle circle = UIShape.Circle.p;
        return new TextWithFilledTrailingIconUIState(chaloTextUIState, new FilledIconUiState(new FilledIconSpec(new UISize(ChaloThemeHelper.a().h)), new ImageUIState(IconType.IC_ARROW_UP, (String) null, ChaloColorToken.White.f9870a, new ImageUISize(ChaloThemeHelper.a().f), (UIContentScale) null, 90.0f, (UiEventHandler) null, 178)), uiEventHandler$Companion$fromLambda$1, 1);
    }

    public static ButtonUIState b(ButtonUIStateFactory buttonUIStateFactory, String text, Function0 onClick, UIShape uIShape, boolean z, int i) {
        ButtonUIElevation buttonUIElevation = new ButtonUIElevation();
        UIShape shape = (i & 8) != 0 ? UIShape.c : uIShape;
        boolean z2 = (i & 16) != 0 ? true : z;
        float f = ChaloThemeHelper.a().n;
        buttonUIStateFactory.getClass();
        Intrinsics.i(text, "text");
        Intrinsics.i(onClick, "onClick");
        Intrinsics.i(shape, "shape");
        return c(f, shape, buttonUIElevation, new TextUIState.ChaloTextUIState(text, UITextStyle.HeadlineSmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), onClick, z2);
    }

    public static ButtonUIState c(float f, UIShape shape, ButtonUIElevation buttonUIElevation, TextUIState.ChaloTextUIState chaloTextUIState, Function0 onClick, boolean z) {
        Intrinsics.i(onClick, "onClick");
        Intrinsics.i(shape, "shape");
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(onClick);
        ChaloColorToken.LightGray lightGray = ChaloColorToken.LightGray.f9814a;
        return new ButtonUIState(chaloTextUIState, z, shape, buttonUIElevation, new ButtonUIColor(lightGray, lightGray), uiEventHandler$Companion$fromLambda$1A, f, null, 128);
    }

    public static ButtonUIState d(ButtonUIStateFactory buttonUIStateFactory, TextUIState.ChaloTextUIState chaloTextUIState, Function0 function0, UIShape uIShape, boolean z, int i) {
        ButtonUIElevation buttonUIElevation = new ButtonUIElevation();
        if ((i & 8) != 0) {
            uIShape = UIShape.c;
        }
        float f = ChaloThemeHelper.a().n;
        boolean z2 = (i & 32) != 0 ? true : z;
        buttonUIStateFactory.getClass();
        return c(f, uIShape, buttonUIElevation, chaloTextUIState, function0, z2);
    }

    public static ButtonUIState e(float f, UIShape shape, ButtonUIElevation buttonUIElevation, TextUIState.ChaloTextUIState chaloTextUIState, Function0 onClick, boolean z) {
        Intrinsics.i(onClick, "onClick");
        Intrinsics.i(shape, "shape");
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(onClick);
        float f2 = z ? 1.0f : 0.4f;
        ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        return new ButtonUIState(chaloTextUIState, z, shape, buttonUIElevation, new ButtonUIColor(orangePrimary, ChaloColorTokenKt.a(f2, orangePrimary)), uiEventHandler$Companion$fromLambda$1A, f, null, 128);
    }

    public static ButtonUIState f(ButtonUIStateFactory buttonUIStateFactory, TextUIState.ChaloTextUIState chaloTextUIState, Function0 function0, UIShape uIShape, boolean z, float f, int i) {
        boolean z2 = z;
        ButtonUIElevation buttonUIElevation = new ButtonUIElevation();
        if ((i & 8) != 0) {
            uIShape = UIShape.c;
        }
        if ((i & 16) != 0) {
            z2 = true;
        }
        if ((i & 32) != 0) {
            f = ChaloThemeHelper.a().n;
        }
        buttonUIStateFactory.getClass();
        return e(f, uIShape, buttonUIElevation, chaloTextUIState, function0, z2);
    }

    public static ButtonUIState g(ButtonUIStateFactory buttonUIStateFactory, String text, Function0 onClick, ButtonUIElevation buttonUIElevation, UIShape uIShape, boolean z, float f, int i) {
        ButtonUIElevation buttonUIElevation2 = (i & 4) != 0 ? new ButtonUIElevation() : buttonUIElevation;
        UIShape shape = (i & 8) != 0 ? UIShape.c : uIShape;
        boolean z2 = (i & 16) != 0 ? true : z;
        float f2 = (i & 32) != 0 ? ChaloThemeHelper.a().n : f;
        buttonUIStateFactory.getClass();
        Intrinsics.i(text, "text");
        Intrinsics.i(onClick, "onClick");
        Intrinsics.i(shape, "shape");
        return e(f2, shape, buttonUIElevation2, new TextUIState.ChaloTextUIState(text, UITextStyle.HeadlineSmall, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), onClick, z2);
    }

    public static ButtonUIState h(ButtonUIStateFactory buttonUIStateFactory, TextUIState.ChaloTextUIState chaloTextUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, UIShape uIShape, boolean z, int i) {
        ButtonUIElevation buttonUIElevation = new ButtonUIElevation();
        if ((i & 8) != 0) {
            uIShape = UIShape.c;
        }
        UIShape shape = uIShape;
        if ((i & 16) != 0) {
            z = true;
        }
        buttonUIStateFactory.getClass();
        Intrinsics.i(shape, "shape");
        ChaloColorToken.White white = ChaloColorToken.White.f9870a;
        return new ButtonUIState(chaloTextUIState, z, shape, buttonUIElevation, new ButtonUIColor(white, white), uiEventHandler$Companion$fromLambda$1, 0.0f, null, 192);
    }
}
