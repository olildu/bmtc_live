package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.ncmc.ui.transactionhistory.compose.ChaloCardTransactionsScreenKt;
import app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.compose.resources.AndroidContextProviderKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s3 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19266a;
    public final /* synthetic */ int b;

    public /* synthetic */ s3(int i, int i2) {
        this.f19266a = i2;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19266a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                AndroidContextProviderKt.a(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 1:
                BleValidationScreen_androidKt.g(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 2:
                BleValidationScreen_androidKt.t(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 3:
                BleValidationScreen_androidKt.r(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 4:
                BleValidationScreen_androidKt.q(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 5:
                ChaloCardTransactionsScreenKt.i(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 6:
                ChaloCardTransactionsScreenKt.j(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 7:
                ChaloSpacersKt.m(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 8:
                ChaloSpacersKt.d(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 9:
                ChaloSpacersKt.k(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 10:
                ChaloSpacersKt.u(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 11:
                ChaloSpacersKt.t(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 12:
                ChaloSpacersKt.p(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 13:
                ChaloSpacersKt.B(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 14:
                ChaloSpacersKt.x(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 15:
                ChaloSpacersKt.C(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 16:
                ChaloSpacersKt.f(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 17:
                ChaloSpacersKt.j(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 18:
                ChaloSpacersKt.A(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 19:
                ChaloSpacersKt.e(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 20:
                ChaloSpacersKt.i(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 21:
                ChaloSpacersKt.h(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 22:
                ChaloSpacersKt.g(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 23:
                ChaloSpacersKt.z(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 24:
                ChaloSpacersKt.l(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 25:
                ChaloSpacersKt.o(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 26:
                ChaloSpacersKt.n(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 27:
                ChaloSpacersKt.y(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 28:
                ChaloSpacersKt.q(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            default:
                ChaloSpacersKt.c(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
        }
        return Unit.f17538a;
    }
}
