package app.chalo.uistate.text;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/text/ChaloTextStyleHelper;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloTextStyleHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ChaloTextStyleHelper f10078a = new ChaloTextStyleHelper();

    public static TextUIState.ChaloTextUIState a(ChaloTextStyleHelper chaloTextStyleHelper, String string, ChaloColorToken chaloColorToken, UIFontWeight uIFontWeight, UITextOverflow uITextOverflow, int i) {
        ChaloColorToken chaloColorToken2 = (i & 2) != 0 ? null : chaloColorToken;
        int i2 = (i & 4) != 0 ? Integer.MAX_VALUE : 1;
        UIFontWeight uIFontWeight2 = (i & 16) != 0 ? null : uIFontWeight;
        UITextOverflow textOverflow = (i & 64) != 0 ? UITextOverflow.Clip : uITextOverflow;
        chaloTextStyleHelper.getClass();
        Intrinsics.i(string, "string");
        Intrinsics.i(textOverflow, "textOverflow");
        return new TextUIState.ChaloTextUIState(string, UITextStyle.BodyLarge, chaloColorToken2, i2, (UITextAlign) null, uIFontWeight2, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, textOverflow, (UIFontStyle) null, (String) null, 6800);
    }

    public static TextUIState.ChaloTextUIState b(ChaloTextStyleHelper chaloTextStyleHelper, String string, ChaloColorToken chaloColorToken, int i, UITextAlign uITextAlign, UIFontWeight uIFontWeight, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, UITextOverflow uITextOverflow, int i2) {
        ChaloColorToken chaloColorToken2 = (i2 & 2) != 0 ? null : chaloColorToken;
        int i3 = (i2 & 4) != 0 ? Integer.MAX_VALUE : i;
        UITextAlign uITextAlign2 = (i2 & 8) != 0 ? null : uITextAlign;
        UIFontWeight uIFontWeight2 = (i2 & 16) != 0 ? null : uIFontWeight;
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$2 = (i2 & 32) != 0 ? null : uiEventHandler$Companion$fromLambda$1;
        UITextOverflow textOverflow = (i2 & 64) != 0 ? UITextOverflow.Clip : uITextOverflow;
        chaloTextStyleHelper.getClass();
        Intrinsics.i(string, "string");
        Intrinsics.i(textOverflow, "textOverflow");
        return new TextUIState.ChaloTextUIState(string, UITextStyle.BodyMedium, chaloColorToken2, i3, uITextAlign2, uIFontWeight2, (Integer) null, uiEventHandler$Companion$fromLambda$2, (UITextDecoration) null, textOverflow, (UIFontStyle) null, (String) null, 6800);
    }

    public static TextUIState.ChaloTextUIState c(ChaloTextStyleHelper chaloTextStyleHelper, String string, ChaloColorToken chaloColorToken, UITextAlign uITextAlign, UIFontWeight uIFontWeight, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, UITextOverflow uITextOverflow, int i) {
        ChaloColorToken chaloColorToken2 = (i & 2) != 0 ? null : chaloColorToken;
        int i2 = (i & 4) != 0 ? Integer.MAX_VALUE : 1;
        UITextAlign uITextAlign2 = (i & 8) != 0 ? null : uITextAlign;
        UIFontWeight uIFontWeight2 = (i & 16) != 0 ? null : uIFontWeight;
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$2 = (i & 32) != 0 ? null : uiEventHandler$Companion$fromLambda$1;
        UITextOverflow textOverflow = (i & 64) != 0 ? UITextOverflow.Clip : uITextOverflow;
        chaloTextStyleHelper.getClass();
        Intrinsics.i(string, "string");
        Intrinsics.i(textOverflow, "textOverflow");
        return new TextUIState.ChaloTextUIState(string, UITextStyle.BodySmall, chaloColorToken2, i2, uITextAlign2, uIFontWeight2, (Integer) null, uiEventHandler$Companion$fromLambda$2, (UITextDecoration) null, textOverflow, (UIFontStyle) null, (String) null, 6800);
    }

    public static TextUIState.ChaloTextUIState d(ChaloTextStyleHelper chaloTextStyleHelper, String string, ChaloColorToken chaloColorToken, UITextAlign uITextAlign, UIFontWeight uIFontWeight, int i) {
        ChaloColorToken chaloColorToken2 = (i & 2) != 0 ? null : chaloColorToken;
        int i2 = (i & 4) != 0 ? Integer.MAX_VALUE : 1;
        UITextAlign uITextAlign2 = (i & 8) != 0 ? null : uITextAlign;
        UIFontWeight uIFontWeight2 = (i & 16) != 0 ? null : uIFontWeight;
        UITextOverflow textOverflow = UITextOverflow.Clip;
        chaloTextStyleHelper.getClass();
        Intrinsics.i(string, "string");
        Intrinsics.i(textOverflow, "textOverflow");
        return new TextUIState.ChaloTextUIState(string, UITextStyle.DisplayMedium, chaloColorToken2, i2, uITextAlign2, uIFontWeight2, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, textOverflow, (UIFontStyle) null, (String) null, 6800);
    }

    public static TextUIState.ChaloTextUIState e(ChaloTextStyleHelper chaloTextStyleHelper, String string, ChaloColorToken chaloColorToken, UITextAlign uITextAlign, UIFontWeight uIFontWeight, UITextOverflow uITextOverflow, int i) {
        ChaloColorToken chaloColorToken2 = (i & 2) != 0 ? null : chaloColorToken;
        int i2 = (i & 4) != 0 ? Integer.MAX_VALUE : 1;
        UITextAlign uITextAlign2 = (i & 8) != 0 ? null : uITextAlign;
        UIFontWeight uIFontWeight2 = (i & 16) != 0 ? null : uIFontWeight;
        UITextOverflow textOverflow = (i & 64) != 0 ? UITextOverflow.Clip : uITextOverflow;
        chaloTextStyleHelper.getClass();
        Intrinsics.i(string, "string");
        Intrinsics.i(textOverflow, "textOverflow");
        return new TextUIState.ChaloTextUIState(string, UITextStyle.DisplaySmall, chaloColorToken2, i2, uITextAlign2, uIFontWeight2, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, textOverflow, (UIFontStyle) null, (String) null, 6800);
    }

    public static TextUIState.ChaloTextUIState f(ChaloTextStyleHelper chaloTextStyleHelper, String string, ChaloColorToken chaloColorToken, UIFontWeight uIFontWeight, UITextOverflow uITextOverflow, int i) {
        ChaloColorToken chaloColorToken2 = (i & 2) != 0 ? null : chaloColorToken;
        int i2 = (i & 4) != 0 ? Integer.MAX_VALUE : 1;
        UIFontWeight uIFontWeight2 = (i & 16) != 0 ? null : uIFontWeight;
        UITextOverflow textOverflow = (i & 64) != 0 ? UITextOverflow.Clip : uITextOverflow;
        chaloTextStyleHelper.getClass();
        Intrinsics.i(string, "string");
        Intrinsics.i(textOverflow, "textOverflow");
        return new TextUIState.ChaloTextUIState(string, UITextStyle.HeadlineMedium, chaloColorToken2, i2, (UITextAlign) null, uIFontWeight2, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, textOverflow, (UIFontStyle) null, (String) null, 6800);
    }

    public static TextUIState.ChaloTextUIState g(ChaloTextStyleHelper chaloTextStyleHelper, String string, ChaloColorToken chaloColorToken, UITextAlign uITextAlign, UIFontWeight uIFontWeight, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, UITextOverflow uITextOverflow, int i) {
        ChaloColorToken chaloColorToken2 = (i & 2) != 0 ? null : chaloColorToken;
        int i2 = (i & 4) != 0 ? Integer.MAX_VALUE : 1;
        UITextAlign uITextAlign2 = (i & 8) != 0 ? null : uITextAlign;
        UIFontWeight uIFontWeight2 = (i & 16) != 0 ? null : uIFontWeight;
        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$2 = (i & 32) != 0 ? null : uiEventHandler$Companion$fromLambda$1;
        UITextOverflow textOverflow = (i & 64) != 0 ? UITextOverflow.Clip : uITextOverflow;
        chaloTextStyleHelper.getClass();
        Intrinsics.i(string, "string");
        Intrinsics.i(textOverflow, "textOverflow");
        return new TextUIState.ChaloTextUIState(string, UITextStyle.HeadlineSmall, chaloColorToken2, i2, uITextAlign2, uIFontWeight2, (Integer) null, uiEventHandler$Companion$fromLambda$2, (UITextDecoration) null, textOverflow, (UIFontStyle) null, (String) null, 6800);
    }

    public static TextUIState.ChaloTextUIState h(String string, ChaloColorToken chaloColorToken, UIFontWeight uIFontWeight, int i) {
        ChaloColorToken chaloColorToken2 = (i & 2) != 0 ? null : chaloColorToken;
        int i2 = (i & 4) != 0 ? Integer.MAX_VALUE : 1;
        UIFontWeight uIFontWeight2 = (i & 16) != 0 ? null : uIFontWeight;
        UITextOverflow textOverflow = UITextOverflow.Clip;
        Intrinsics.i(string, "string");
        Intrinsics.i(textOverflow, "textOverflow");
        return new TextUIState.ChaloTextUIState(string, UITextStyle.LabelSmall, chaloColorToken2, i2, (UITextAlign) null, uIFontWeight2, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, textOverflow, (UIFontStyle) null, (String) null, 6800);
    }
}
