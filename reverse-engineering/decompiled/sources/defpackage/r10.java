package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsViewState;
import app.chalo.ncmc.ui.entercarddetails.compose.EnterCardDetailsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r10 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19169a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ EnterCardDetailsViewState c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ SoftwareKeyboardController e;
    public final /* synthetic */ FocusRequester f;
    public final /* synthetic */ FocusRequester g;
    public final /* synthetic */ int h;

    public /* synthetic */ r10(Modifier modifier, EnterCardDetailsViewState enterCardDetailsViewState, Function1 function1, SoftwareKeyboardController softwareKeyboardController, FocusRequester focusRequester, FocusRequester focusRequester2, int i, int i2) {
        this.f19169a = i2;
        this.b = modifier;
        this.c = enterCardDetailsViewState;
        this.d = function1;
        this.e = softwareKeyboardController;
        this.f = focusRequester;
        this.g = focusRequester2;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19169a) {
            case 0:
                ((Integer) obj2).intValue();
                EnterCardDetailsScreenKt.c(this.b, this.c, this.d, this.e, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.h | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                EnterCardDetailsScreenKt.a(this.b, this.c, this.d, this.e, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.h | 1));
                break;
        }
        return Unit.f17538a;
    }
}
