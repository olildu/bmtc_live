package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.focus.FocusRequester;
import app.chalo.login.ui.options.LoginOptionsScreenKt;
import app.chalo.login.ui.options.LoginOptionsUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xf0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20015a = 1;
    public final /* synthetic */ LoginOptionsUIState b;
    public final /* synthetic */ FocusRequester c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;

    public /* synthetic */ xf0(LoginOptionsUIState loginOptionsUIState, FocusRequester focusRequester, Function1 function1, int i) {
        this.b = loginOptionsUIState;
        this.c = focusRequester;
        this.d = function1;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f20015a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                LoginOptionsScreenKt.d(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.c, this.b, this.d);
                break;
            default:
                LoginOptionsScreenKt.a(RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.c, this.b, this.d);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ xf0(LoginOptionsUIState loginOptionsUIState, Function1 function1, FocusRequester focusRequester, int i) {
        this.b = loginOptionsUIState;
        this.d = function1;
        this.c = focusRequester;
        this.e = i;
    }
}
