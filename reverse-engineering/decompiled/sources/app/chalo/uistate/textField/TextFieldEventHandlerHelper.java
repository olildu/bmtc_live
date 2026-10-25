package app.chalo.uistate.textField;

import defpackage.mb1;
import defpackage.og1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/textField/TextFieldEventHandlerHelper;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextFieldEventHandlerHelper {
    /* JADX WARN: Type inference failed for: r0v2, types: [app.chalo.uistate.textField.TextFieldEventHandlerHelper$basic$3] */
    public static TextFieldEventHandlerHelper$basic$3 a(final Function1 valueChange, final Function1 focusChanged) {
        Intrinsics.i(valueChange, "valueChange");
        Intrinsics.i(focusChanged, "focusChanged");
        return new TextFieldEventHandler() { // from class: app.chalo.uistate.textField.TextFieldEventHandlerHelper$basic$3
            @Override // app.chalo.uistate.textField.TextFieldEventHandler
            public final void a(boolean z) {
                focusChanged.invoke(Boolean.valueOf(z));
            }

            @Override // app.chalo.uistate.textField.TextFieldEventHandler
            public final String b(String value) {
                Intrinsics.i(value, "value");
                valueChange.invoke(value);
                return value;
            }

            @Override // app.chalo.uistate.textField.TextFieldEventHandler
            public final /* bridge */ UITransformedText c(String str) {
                return TextFieldEventHandler.DefaultImpls.a(str);
            }
        };
    }

    public static /* synthetic */ TextFieldEventHandlerHelper$basic$3 b(int i, Function1 function1, Function1 function2) {
        if ((i & 1) != 0) {
            function1 = new og1(14);
        }
        if ((i & 2) != 0) {
            function2 = new mb1(13);
        }
        return a(function1, function2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [app.chalo.uistate.textField.TextFieldEventHandlerHelper$basicWithCharConstraint$3] */
    public static TextFieldEventHandlerHelper$basicWithCharConstraint$3 c(final int i, final Function1 function1) {
        final mb1 mb1Var = new mb1(13);
        return new TextFieldEventHandler() { // from class: app.chalo.uistate.textField.TextFieldEventHandlerHelper$basicWithCharConstraint$3
            @Override // app.chalo.uistate.textField.TextFieldEventHandler
            public final void a(boolean z) {
                mb1Var.invoke(Boolean.valueOf(z));
            }

            @Override // app.chalo.uistate.textField.TextFieldEventHandler
            public final String b(String value) {
                Intrinsics.i(value, "value");
                if (value.length() <= i) {
                    function1.invoke(value);
                }
                return value;
            }

            @Override // app.chalo.uistate.textField.TextFieldEventHandler
            public final /* bridge */ UITransformedText c(String str) {
                return TextFieldEventHandler.DefaultImpls.a(str);
            }
        };
    }
}
