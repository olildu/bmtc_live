package defpackage;

import app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessState;
import app.chalo.wallet.ui.alltransactions.WalletAllTransactionsState;
import app.chalo.walletframework.wallet.domain.resolver.ResolvedPrimaryWalletResult;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hb0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15809a;
    public final /* synthetic */ ResolvedPrimaryWalletResult.ResolvedWallet b;

    public /* synthetic */ hb0(ResolvedPrimaryWalletResult.ResolvedWallet resolvedWallet, int i) {
        this.f15809a = i;
        this.b = resolvedWallet;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15809a) {
            case 0:
                InstantTicketWalletAccessState it = (InstantTicketWalletAccessState) obj;
                Intrinsics.i(it, "it");
                return InstantTicketWalletAccessState.a(it, this.b.f11098a, false, false, null, null, false, null, null, false, false, null, false, false, 8190);
            default:
                WalletAllTransactionsState it2 = (WalletAllTransactionsState) obj;
                Intrinsics.i(it2, "it");
                return WalletAllTransactionsState.a(it2, null, null, false, false, this.b.f11098a, false, false, 223);
        }
    }
}
