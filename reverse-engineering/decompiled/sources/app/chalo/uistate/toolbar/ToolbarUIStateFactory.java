package app.chalo.uistate.toolbar;

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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/toolbar/ToolbarUIStateFactory;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ToolbarUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ToolbarUIStateFactory f10120a = new ToolbarUIStateFactory();

    public static TextUIState.ChaloTextUIState a(ToolbarUIStateFactory toolbarUIStateFactory, String title, int i) {
        int i2 = (i & 2) != 0 ? Integer.MAX_VALUE : 1;
        toolbarUIStateFactory.getClass();
        Intrinsics.i(title, "title");
        return new TextUIState.ChaloTextUIState(title, UITextStyle.DisplaySmall, (ChaloColorToken) null, i2, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8116);
    }
}
