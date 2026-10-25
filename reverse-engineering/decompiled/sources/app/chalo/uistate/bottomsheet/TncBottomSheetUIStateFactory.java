package app.chalo.uistate.bottomsheet;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import defpackage.ps;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/bottomsheet/TncBottomSheetUIStateFactory;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TncBottomSheetUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TncBottomSheetUIStateFactory f9911a = new TncBottomSheetUIStateFactory();

    public static TncBottomSheetUIState a(String title, List tncList, String confirmBtnText, ps psVar) {
        Intrinsics.i(title, "title");
        Intrinsics.i(tncList, "tncList");
        Intrinsics.i(confirmBtnText, "confirmBtnText");
        int i = 0;
        String str = "";
        for (Object obj : tncList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            str = ((Object) str) + i2 + ". " + ((String) obj) + (i != CollectionsKt.K(tncList) ? "\n\n" : "");
            i = i2;
        }
        UITextStyle uITextStyle = UITextStyle.BodyMedium;
        return new TncBottomSheetUIState(ButtonUIStateFactory.g(ButtonUIStateFactory.f9921a, confirmBtnText, psVar, null, null, false, 0.0f, 60), new TextUIState.ChaloTextUIState(title, uITextStyle, (ChaloColorToken) ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, UIFontWeight.Bold, (Integer) 24, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7992), new TextUIState.ChaloTextUIState(str, uITextStyle, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
    }
}
