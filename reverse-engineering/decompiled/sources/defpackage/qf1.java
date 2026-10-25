package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.productpurchase.passpurchase.ui.SuperPassBookingSuccessDetailsUIKt;
import app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationStatusScreenKt;
import app.chalo.uistate.text.TextUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qf1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19118a;
    public final /* synthetic */ TextUIState b;
    public final /* synthetic */ TextUIState c;
    public final /* synthetic */ ChaloPadding d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ int f;

    public /* synthetic */ qf1(TextUIState textUIState, TextUIState textUIState2, ChaloPadding chaloPadding, Modifier modifier, int i, int i2) {
        this.f19118a = i2;
        this.b = textUIState;
        this.c = textUIState2;
        this.d = chaloPadding;
        this.e = modifier;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19118a) {
            case 0:
                ((Integer) obj2).getClass();
                SuperPassBookingSuccessDetailsUIKt.b(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                SuperPassVerificationStatusScreenKt.b(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
        }
        return Unit.f17538a;
    }
}
