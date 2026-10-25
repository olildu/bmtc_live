package defpackage;

import app.chalo.wallet.ui.mainbalance.WalletBalanceComponent;
import app.chalo.wallet.ui.mainbalance.WalletBalanceIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cp1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15396a;
    public final /* synthetic */ WalletBalanceComponent b;

    public /* synthetic */ cp1(WalletBalanceComponent walletBalanceComponent, int i) {
        this.f15396a = i;
        this.b = walletBalanceComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15396a) {
            case 0:
                this.b.N0(WalletBalanceIntent.ContactSupportDialogOkayClicked.f10865a);
                break;
            default:
                this.b.N0(WalletBalanceIntent.RequestHistoryButtonClicked.f10867a);
                break;
        }
        return Unit.f17538a;
    }
}
