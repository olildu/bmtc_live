package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt;
import app.chalo.wallet.ui.mainbalance.compose.WalletBalanceComposableKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fb implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15625a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ fb(Function1 function1, boolean z, int i, int i2) {
        this.f15625a = i2;
        this.b = function1;
        this.c = z;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15625a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                BleValidationScreen_androidKt.s(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 1:
                BleValidationScreen_androidKt.u(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            case 2:
                WalletBalanceComposableKt.g(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
            default:
                WalletBalanceComposableKt.a(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), composer, this.b, this.c);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ fb(boolean z, Function1 function1, int i, int i2) {
        this.f15625a = i2;
        this.c = z;
        this.b = function1;
        this.d = i;
    }
}
