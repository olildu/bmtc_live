package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.core.compose.NetworkInspectorScreenKt;
import app.chalo.instantticket.ui.faredetails.compose.FareBreakupSectionKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.StopEtasKt;
import app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionDetailScreenKt;
import app.chalo.wallet.ui.mainbalance.compose.WalletBalanceComposableKt;
import app.chalo.wallet.ui.transactionsummary.compose.WalletTransactionSummaryComposableKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nf implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18507a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ nf(String str, String str2, int i, int i2) {
        this.f18507a = i2;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f18507a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                CardTransactionDetailScreenKt.f(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            case 1:
                CardTransactionDetailScreenKt.f(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            case 2:
                FareBreakupSectionKt.f(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            case 3:
                NetworkInspectorScreenKt.a(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            case 4:
                StopEtasKt.b(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            case 5:
                WalletBalanceComposableKt.c(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            default:
                WalletTransactionSummaryComposableKt.a(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
        }
        return Unit.f17538a;
    }
}
