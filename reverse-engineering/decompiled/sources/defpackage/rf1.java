package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import app.chalo.productpurchase.passpurchase.ui.SuperPassBookingSuccessDetailsUIKt;
import app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationStatusScreenKt;
import app.chalo.uistate.text.TextUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rf1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19207a;
    public final /* synthetic */ TextUIState b;
    public final /* synthetic */ Alignment c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ int e;

    public /* synthetic */ rf1(TextUIState textUIState, Alignment alignment, Modifier modifier, int i, int i2) {
        this.f19207a = i2;
        this.b = textUIState;
        this.c = alignment;
        this.d = modifier;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19207a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                SuperPassBookingSuccessDetailsUIKt.a(this.b, this.c, this.d, composer, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
            default:
                SuperPassVerificationStatusScreenKt.a(this.b, this.c, this.d, composer, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
        }
        return Unit.f17538a;
    }
}
