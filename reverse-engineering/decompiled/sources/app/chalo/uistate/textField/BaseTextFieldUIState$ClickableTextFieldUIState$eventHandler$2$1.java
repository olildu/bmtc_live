package app.chalo.uistate.textField;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"app/chalo/uistate/textField/BaseTextFieldUIState$ClickableTextFieldUIState$eventHandler$2$1", "Lapp/chalo/uistate/textField/TextFieldEventHandler;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BaseTextFieldUIState$ClickableTextFieldUIState$eventHandler$2$1 implements TextFieldEventHandler {
    @Override // app.chalo.uistate.textField.TextFieldEventHandler
    public final String b(String value) {
        Intrinsics.i(value, "value");
        return value;
    }

    @Override // app.chalo.uistate.textField.TextFieldEventHandler
    public final UITransformedText c(String value) {
        Intrinsics.i(value, "value");
        return TextFieldEventHandler.DefaultImpls.a(value);
    }

    @Override // app.chalo.uistate.textField.TextFieldEventHandler
    public final /* bridge */ void a(boolean z) {
    }
}
