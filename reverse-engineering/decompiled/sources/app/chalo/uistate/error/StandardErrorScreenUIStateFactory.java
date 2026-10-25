package app.chalo.uistate.error;

import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/error/StandardErrorScreenUIStateFactory;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StandardErrorScreenUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StandardErrorScreenUIStateFactory f10025a = new StandardErrorScreenUIStateFactory();

    public static StandardErrorScreenUIState.ErrorWithMsgAndRetry a(IconType iconType, boolean z, String errorTitle, String str, String str2, Function0 function0) {
        ImageUIState imageUIState;
        TextUIState.ChaloTextUIState chaloTextUIState;
        Intrinsics.i(errorTitle, "errorTitle");
        if (iconType != null) {
            imageUIState = new ImageUIState(iconType, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
        } else {
            imageUIState = null;
        }
        UITextStyle uITextStyle = UITextStyle.DisplaySmall;
        UITextAlign uITextAlign = UITextAlign.Center;
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState(errorTitle, uITextStyle, black_87, 0, uITextAlign, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
        if (str != null) {
            chaloTextUIState = new TextUIState.ChaloTextUIState(str, UITextStyle.BodyMedium, black_87, 0, uITextAlign, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152);
        } else {
            chaloTextUIState = null;
        }
        return new StandardErrorScreenUIState.ErrorWithMsgAndRetry(imageUIState, chaloTextUIState2, chaloTextUIState, (str2 == null || function0 == null) ? null : ButtonUIStateFactory.g(ButtonUIStateFactory.f9921a, str2, function0, null, null, false, 0.0f, 60), null, ErrorWithMsgAndRetryUISpecs.a(new ErrorWithMsgAndRetryUISpecs(null, 0.0f, 0.0f, 0.0f, 255), null, z, 127), 16);
    }

    public static /* synthetic */ StandardErrorScreenUIState.ErrorWithMsgAndRetry b(StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory, IconType iconType, String str, String str2, String str3, Function0 function0, int i) {
        boolean z = (i & 2) == 0;
        if ((i & 8) != 0) {
            str2 = null;
        }
        standardErrorScreenUIStateFactory.getClass();
        return a(iconType, z, str, str2, str3, function0);
    }
}
