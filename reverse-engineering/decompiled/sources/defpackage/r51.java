package defpackage;

import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.SearchBarDefaults;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r51 implements KeyboardActionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19179a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ TextFieldState c;

    public /* synthetic */ r51(Function1 function1, TextFieldState textFieldState, int i) {
        this.f19179a = i;
        this.b = function1;
        this.c = textFieldState;
    }

    @Override // androidx.compose.foundation.text.input.KeyboardActionHandler
    public final void onKeyboardAction(Function0 function0) {
        switch (this.f19179a) {
            case 0:
                SearchBarDefaults.InputField$lambda$13$lambda$12(this.b, this.c, function0);
                break;
            default:
                SearchBarDefaults.InputField$lambda$29$lambda$28(this.b, this.c, function0);
                break;
        }
    }
}
