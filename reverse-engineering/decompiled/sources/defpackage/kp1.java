package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.wallet.ui.transactionsummary.WalletTransactionSummaryComponent;
import app.chalo.wallet.ui.transactionsummary.WalletTransactionSummaryMainScreenKt;
import app.chalo.webview.WebViewScreenComponent;
import app.chalo.webview.WebViewScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kp1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18247a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ChaloBaseStateMviComponent c;

    public /* synthetic */ kp1(ChaloBaseStateMviComponent chaloBaseStateMviComponent, int i, int i2) {
        this.f18247a = i2;
        this.c = chaloBaseStateMviComponent;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18247a) {
            case 0:
                ((Integer) obj2).intValue();
                WalletTransactionSummaryMainScreenKt.a((WalletTransactionSummaryComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                WebViewScreenKt.b((WebViewScreenComponent) this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
        }
        return Unit.f17538a;
    }
}
