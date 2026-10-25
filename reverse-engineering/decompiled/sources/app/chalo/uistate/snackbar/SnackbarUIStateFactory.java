package app.chalo.uistate.snackbar;

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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/snackbar/SnackbarUIStateFactory;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnackbarUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SnackbarUIStateFactory f10071a = new SnackbarUIStateFactory();

    public static SnackbarUIState a(String text, String str, final Function0 function0) {
        Intrinsics.i(text, "text");
        return new SnackbarUIState(new TextUIState.ChaloTextUIState(text, UITextStyle.BodyMedium, ChaloColorToken.White.f9870a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), str != null ? new TextUIState.ChaloTextUIState(str, UITextStyle.HeadlineSmall, ChaloColorToken.OrangePrimary.f9835a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184) : null, function0 != null ? new UiEventHandler() { // from class: app.chalo.uistate.snackbar.SnackbarUIStateFactory$standardSnackbar$2$1
            @Override // app.chalo.uistate.base.UiEventHandler
            public final void a() {
                function0.invoke();
            }
        } : null);
    }
}
