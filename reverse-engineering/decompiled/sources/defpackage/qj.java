package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.ChaloDividerComposableKt;
import app.chalo.login.ui.otp.LoginOtpScreenKt;
import app.chalo.premiumbus.ui.faredetails.compose.PremiumBusFreshPurchaseFareDetailsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qj implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19125a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;

    public /* synthetic */ qj(float f, long j, Modifier modifier, int i) {
        this.f19125a = 2;
        this.d = f;
        this.c = j;
        this.b = modifier;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19125a) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.e | 1);
                ChaloDividerComposableKt.a(this.d, iUpdateChangedFlags, this.c, (Composer) obj, this.b);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.e | 1);
                LoginOtpScreenKt.a(this.d, iUpdateChangedFlags2, this.c, (Composer) obj, this.b);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.e | 1);
                PremiumBusFreshPurchaseFareDetailsScreenKt.m(this.d, iUpdateChangedFlags3, this.c, (Composer) obj, this.b);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ qj(Modifier modifier, long j, float f, int i, int i2) {
        this.f19125a = i2;
        this.b = modifier;
        this.c = j;
        this.d = f;
        this.e = i;
    }
}
