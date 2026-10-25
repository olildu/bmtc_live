package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.compose.YesBankFooterKt;
import app.chalo.userprofile.ui.compose.UserProfileComposeUtilsKt;
import app.chalo.wallet.ui.transactionsContent.WalletTransactionsContentKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class on1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18656a;
    public final /* synthetic */ int b;

    public /* synthetic */ on1(int i, int i2) {
        this.f18656a = i2;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f18656a) {
            case 0:
                num.intValue();
                UserProfileComposeUtilsKt.b(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 1:
                num.intValue();
                WalletTransactionsContentKt.c(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 2:
                num.getClass();
                WalletTransactionsContentKt.a(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            default:
                num.intValue();
                YesBankFooterKt.a(composer, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
        }
        return Unit.f17538a;
    }
}
