package app.chalo.sos;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.dialog.DropDownMenuUIState;
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
import defpackage.fa1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SosScreenUIStateKt {
    public static final SosContactItemUIState a(String contactName, String phoneNumber, DropDownMenuUIState dropDownMenuUIState) {
        Intrinsics.i(contactName, "contactName");
        Intrinsics.i(phoneNumber, "phoneNumber");
        return new SosContactItemUIState(new TextUIState.ChaloTextUIState(contactName, UITextStyle.BodyMedium, ChaloColorToken.Black_60.f9766a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), new TextUIState.ChaloTextUIState(phoneNumber, UITextStyle.DisplaySmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), dropDownMenuUIState, dropDownMenuUIState != null ? new ImageUIState(IconType.ROUTE_SCREEN_MENU, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246) : null);
    }

    public static final SosScreenSectionHeader b(String title, String str, fa1 fa1Var) {
        Intrinsics.i(title, "title");
        TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState(title, UITextStyle.HeadlineMedium, ChaloColorToken.Black_60.f9766a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        TextUIState.ChaloTextUIState chaloTextUIState2 = null;
        if (str != null) {
            chaloTextUIState2 = new TextUIState.ChaloTextUIState(str, UITextStyle.HeadlineSmall, ChaloColorToken.ViewScheduleColor.f9869a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, fa1Var != null ? UiEventHandler.Companion.a(fa1Var) : null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7928);
        }
        return new SosScreenSectionHeader(chaloTextUIState, chaloTextUIState2);
    }
}
