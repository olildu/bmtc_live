package defpackage;

import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryComponent;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryIntent;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryUiErrorWrapper;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rf implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19205a;
    public final /* synthetic */ CardTransactionHistoryComponent b;

    public /* synthetic */ rf(CardTransactionHistoryComponent cardTransactionHistoryComponent, int i) {
        this.f19205a = i;
        this.b = cardTransactionHistoryComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strD;
        switch (this.f19205a) {
            case 0:
                CardTransactionHistoryViewState it = (CardTransactionHistoryViewState) obj;
                Intrinsics.i(it, "it");
                CardTransactionHistoryComponent cardTransactionHistoryComponent = this.b;
                CardTransactionHistoryViewState cardTransactionHistoryViewState = cardTransactionHistoryComponent.C;
                String str = cardTransactionHistoryViewState != null ? cardTransactionHistoryViewState.f6437a : null;
                CardTransactionHistoryUiErrorWrapper cardTransactionHistoryUiErrorWrapper = cardTransactionHistoryViewState != null ? cardTransactionHistoryViewState.b : null;
                if (cardTransactionHistoryViewState == null || (strD = cardTransactionHistoryViewState.c) == null) {
                    strD = cardTransactionHistoryComponent.n.d();
                }
                return CardTransactionHistoryViewState.a(it, str, cardTransactionHistoryUiErrorWrapper, strD, false, null, 24);
            default:
                CardTransactionHistoryIntent it2 = (CardTransactionHistoryIntent) obj;
                Intrinsics.i(it2, "it");
                this.b.I0(it2);
                return Unit.f17538a;
        }
    }
}
