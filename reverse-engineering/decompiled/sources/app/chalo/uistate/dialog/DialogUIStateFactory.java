package app.chalo.uistate.dialog;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/DialogUIStateFactory;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DialogUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DialogUIStateFactory f9989a = new DialogUIStateFactory();

    public static LoadingDialogUIState a(String text) {
        Intrinsics.i(text, "text");
        return new LoadingDialogUIState(new TextUIState.ChaloTextUIState(text, UITextStyle.BodyMedium, ChaloColorToken.Black_60.f9766a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
    }

    public static ConfirmationDialogUiState b(String str, String str2, String positiveBtnText, String str3, Function0 onPositiveBtnClick, Function0 function0) {
        Intrinsics.i(positiveBtnText, "positiveBtnText");
        Intrinsics.i(onPositiveBtnClick, "onPositiveBtnClick");
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        TextUIState.ChaloTextUIState chaloTextUIState = str != null ? new TextUIState.ChaloTextUIState(str, UITextStyle.DisplaySmall, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184) : null;
        TextUIState.ChaloTextUIState chaloTextUIState2 = str2 != null ? new TextUIState.ChaloTextUIState(str2, UITextStyle.BodyMedium, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184) : null;
        UITextStyle uITextStyle = UITextStyle.HeadlineMedium;
        ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
        return new ConfirmationDialogUiState(chaloTextUIState, chaloTextUIState2, new ConfirmationDialogActionCtaContainerUiState(new DialogueCtaUiState(new TextUIState.ChaloTextUIState(positiveBtnText, uITextStyle, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(onPositiveBtnClick)), (str3 == null || function0 == null) ? null : new DialogueCtaUiState(new TextUIState.ChaloTextUIState(str3, uITextStyle, orangePrimary, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(function0)), 1), null, 17);
    }
}
