package app.chalo.uistate.text;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/text/ExpandingTextUIStateFactory;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExpandingTextUIStateFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExpandingTextUIStateFactory f10080a = new ExpandingTextUIStateFactory();

    public static TextUIState.ExpandingTextUIState a(String text, String expandCta, int i, Function0 onClick) {
        Intrinsics.i(text, "text");
        Intrinsics.i(expandCta, "expandCta");
        Intrinsics.i(onClick, "onClick");
        return new TextUIState.ExpandingTextUIState(new TextUIState.ChaloTextUIState(text, UITextStyle.HeadlineSmall, ChaloColorToken.Black_87.f9768a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), i, new TextUIState.ChaloTextUIState(expandCta, UITextStyle.LabelSmall, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184), UiEventHandler.Companion.a(onClick), false, null);
    }
}
