package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeViewState;
import app.chalo.ncmc.ui.ncmcofflinerecharge.compose.OfflineCardRechargeScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nn0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18528a;
    public final /* synthetic */ OfflineCardRechargeViewState b;
    public final /* synthetic */ FocusRequester c;
    public final /* synthetic */ SoftwareKeyboardController d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public /* synthetic */ nn0(OfflineCardRechargeViewState offlineCardRechargeViewState, FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, Function1 function1, int i, int i2) {
        this.f18528a = i2;
        this.b = offlineCardRechargeViewState;
        this.c = focusRequester;
        this.d = softwareKeyboardController;
        this.e = function1;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18528a) {
            case 0:
                ((Integer) obj2).intValue();
                OfflineCardRechargeScreenKt.b(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                OfflineCardRechargeScreenKt.a(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
        }
        return Unit.f17538a;
    }
}
