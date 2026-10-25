package defpackage;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.material3.SheetValue;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yi implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20111a;
    public final /* synthetic */ SoftwareKeyboardController b;

    public /* synthetic */ yi(SoftwareKeyboardController softwareKeyboardController, int i) {
        this.f20111a = i;
        this.b = softwareKeyboardController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20111a) {
            case 0:
                KeyboardActionScope KeyboardActions = (KeyboardActionScope) obj;
                Intrinsics.i(KeyboardActions, "$this$KeyboardActions");
                SoftwareKeyboardController softwareKeyboardController = this.b;
                if (softwareKeyboardController != null) {
                    softwareKeyboardController.hide();
                }
                return Unit.f17538a;
            case 1:
                KeyboardActionScope KeyboardActions2 = (KeyboardActionScope) obj;
                Intrinsics.i(KeyboardActions2, "$this$KeyboardActions");
                SoftwareKeyboardController softwareKeyboardController2 = this.b;
                if (softwareKeyboardController2 != null) {
                    softwareKeyboardController2.hide();
                }
                return Unit.f17538a;
            case 2:
                SheetValue it = (SheetValue) obj;
                Intrinsics.i(it, "it");
                SoftwareKeyboardController softwareKeyboardController3 = this.b;
                if (softwareKeyboardController3 != null) {
                    softwareKeyboardController3.hide();
                }
                return Boolean.TRUE;
            case 3:
                KeyboardActionScope KeyboardActions3 = (KeyboardActionScope) obj;
                Intrinsics.i(KeyboardActions3, "$this$KeyboardActions");
                SoftwareKeyboardController softwareKeyboardController4 = this.b;
                if (softwareKeyboardController4 != null) {
                    softwareKeyboardController4.hide();
                }
                return Unit.f17538a;
            default:
                KeyboardActionScope KeyboardActions4 = (KeyboardActionScope) obj;
                Intrinsics.i(KeyboardActions4, "$this$KeyboardActions");
                SoftwareKeyboardController softwareKeyboardController5 = this.b;
                if (softwareKeyboardController5 != null) {
                    softwareKeyboardController5.hide();
                }
                return Unit.f17538a;
        }
    }
}
