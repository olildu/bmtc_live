package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.compose.theme.ChaloThemeHelper;
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
import defpackage.fi;
import defpackage.ps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConfirmSuperPassPurchaseContractKt {
    public static final FareMappingFailedBottomSheetUIState a(String msg, String confirmBtnText, String cancelBtnText, ps psVar, ps psVar2) {
        Intrinsics.i(msg, "msg");
        Intrinsics.i(confirmBtnText, "confirmBtnText");
        Intrinsics.i(cancelBtnText, "cancelBtnText");
        TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState(msg, UITextStyle.BodyMedium, (ChaloColorToken) ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) 24, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7992);
        ImageUIState imageUIState = new ImageUIState(IconType.IC_CLOSE, (String) null, ChaloColorToken.ShadyGray.f9851a, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new fi(psVar2, 23)), 114);
        ButtonUIStateFactory buttonUIStateFactory = ButtonUIStateFactory.f9921a;
        return new FareMappingFailedBottomSheetUIState(ButtonUIStateFactory.g(buttonUIStateFactory, confirmBtnText, psVar, null, null, false, 0.0f, 60), ButtonUIStateFactory.b(buttonUIStateFactory, cancelBtnText, psVar2, null, false, 60), imageUIState, chaloTextUIState);
    }

    public static final PassAlreadyAvailedBottomSheetUIState b(String title, String msg, String confirmBtnText, ps psVar) {
        Intrinsics.i(title, "title");
        Intrinsics.i(msg, "msg");
        Intrinsics.i(confirmBtnText, "confirmBtnText");
        UITextStyle uITextStyle = UITextStyle.BodyMedium;
        return new PassAlreadyAvailedBottomSheetUIState(ButtonUIStateFactory.g(ButtonUIStateFactory.f9921a, confirmBtnText, psVar, null, null, false, 0.0f, 60), new TextUIState.ChaloTextUIState(title, uITextStyle, (ChaloColorToken) ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) 24, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7992), new TextUIState.ChaloTextUIState(msg, uITextStyle, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
    }
}
