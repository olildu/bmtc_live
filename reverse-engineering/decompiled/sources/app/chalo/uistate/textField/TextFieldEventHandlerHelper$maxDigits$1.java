package app.chalo.uistate.textField;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"app/chalo/uistate/textField/TextFieldEventHandlerHelper$maxDigits$1", "Lapp/chalo/uistate/textField/TextFieldEventHandler;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextFieldEventHandlerHelper$maxDigits$1 implements TextFieldEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10105a;
    public final /* synthetic */ Function1 b;

    public TextFieldEventHandlerHelper$maxDigits$1(int i, Function1 function1) {
        this.f10105a = i;
        this.b = function1;
    }

    @Override // app.chalo.uistate.textField.TextFieldEventHandler
    public final String b(String value) throws IOException {
        Intrinsics.i(value, "value");
        StringBuilder sb = new StringBuilder();
        int length = value.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = value.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        int length2 = string.length();
        int i2 = this.f10105a;
        if (length2 > i2) {
            length2 = i2;
        }
        String strSubstring = string.substring(0, length2);
        Intrinsics.h(strSubstring, "substring(...)");
        this.b.invoke(strSubstring);
        return strSubstring;
    }

    @Override // app.chalo.uistate.textField.TextFieldEventHandler
    public final /* bridge */ UITransformedText c(String str) {
        return TextFieldEventHandler.DefaultImpls.a(str);
    }

    @Override // app.chalo.uistate.textField.TextFieldEventHandler
    public final /* bridge */ void a(boolean z) {
    }
}
