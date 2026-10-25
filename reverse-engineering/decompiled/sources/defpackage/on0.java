package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeViewState;
import app.chalo.ncmc.ui.ncmcofflinerecharge.compose.OfflineCardRechargeScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class on0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18655a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ OfflineCardRechargeViewState c;
    public final /* synthetic */ FocusRequester d;
    public final /* synthetic */ SoftwareKeyboardController e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ int g;

    public /* synthetic */ on0(Modifier modifier, OfflineCardRechargeViewState offlineCardRechargeViewState, FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, Function1 function1, int i, int i2) {
        this.f18655a = i2;
        this.b = modifier;
        this.c = offlineCardRechargeViewState;
        this.d = focusRequester;
        this.e = softwareKeyboardController;
        this.f = function1;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18655a) {
            case 0:
                ((Integer) obj2).getClass();
                OfflineCardRechargeScreenKt.c(this.b, this.c, this.d, this.e, this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                OfflineCardRechargeScreenKt.f(this.b, this.c, this.d, this.e, this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.g | 1));
                break;
        }
        return Unit.f17538a;
    }
}
