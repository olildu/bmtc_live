package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.paging.compose.LazyPagingItems;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryViewState;
import app.chalo.ncmc.ui.transactionhistory.compose.ChaloCardTransactionsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hj implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15831a = 0;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ CardTransactionHistoryViewState c;
    public final /* synthetic */ LazyPagingItems d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public /* synthetic */ hj(Modifier modifier, LazyPagingItems lazyPagingItems, CardTransactionHistoryViewState cardTransactionHistoryViewState, Function1 function1, int i) {
        this.b = modifier;
        this.d = lazyPagingItems;
        this.c = cardTransactionHistoryViewState;
        this.e = function1;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15831a) {
            case 0:
                ((Integer) obj2).intValue();
                ChaloCardTransactionsScreenKt.a(RecomposeScopeImplKt.updateChangedFlags(this.f | 1), (Composer) obj, this.b, this.d, this.c, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                ChaloCardTransactionsScreenKt.g(RecomposeScopeImplKt.updateChangedFlags(this.f | 1), (Composer) obj, this.b, this.d, this.c, this.e);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ hj(Modifier modifier, CardTransactionHistoryViewState cardTransactionHistoryViewState, LazyPagingItems lazyPagingItems, Function1 function1, int i) {
        this.b = modifier;
        this.c = cardTransactionHistoryViewState;
        this.d = lazyPagingItems;
        this.e = function1;
        this.f = i;
    }
}
