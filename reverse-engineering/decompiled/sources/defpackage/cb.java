package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.home.ui.profile.ProfileScreenUIKt;
import app.chalo.onboarding.splash.ui.SplashScreenKt;
import app.chalo.quickpay.ui.payforticket.compose.PayForTicketScreenKt;
import app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt;
import app.chalo.wallet.ui.alltransactions.compose.WalletAllTransactionsComposableKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cb implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11269a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ cb(int i, int i2, Function1 function1) {
        this.f11269a = i2;
        this.b = function1;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f11269a) {
            case 0:
                num.intValue();
                BleValidationScreen_androidKt.f(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 1:
                num.intValue();
                BleValidationScreen_androidKt.e(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 2:
                num.getClass();
                BleValidationScreen_androidKt.d(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 3:
                num.intValue();
                BleValidationScreen_androidKt.i(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 4:
                num.intValue();
                BleValidationScreen_androidKt.h(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 5:
                num.intValue();
                PayForTicketScreenKt.a(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 6:
                num.intValue();
                PayForTicketScreenKt.b(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 7:
                num.intValue();
                ProfileScreenUIKt.b(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 8:
                num.intValue();
                SplashScreenKt.c(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            default:
                num.intValue();
                WalletAllTransactionsComposableKt.a(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
        }
        return Unit.f17538a;
    }
}
