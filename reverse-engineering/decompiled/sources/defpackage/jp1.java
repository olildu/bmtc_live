package defpackage;

import app.chalo.wallet.ui.transactionsummary.WalletTransactionSummaryComponent;
import app.chalo.wallet.ui.transactionsummary.WalletTransactionSummaryIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jp1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17427a;
    public final /* synthetic */ WalletTransactionSummaryComponent b;

    public /* synthetic */ jp1(WalletTransactionSummaryComponent walletTransactionSummaryComponent, int i) {
        this.f17427a = i;
        this.b = walletTransactionSummaryComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17427a) {
            case 0:
                gf.u(null, this.b.p);
                break;
            default:
                this.b.G0(WalletTransactionSummaryIntent.ViewReceiptClicked.f10894a);
                break;
        }
        return Unit.f17538a;
    }
}
