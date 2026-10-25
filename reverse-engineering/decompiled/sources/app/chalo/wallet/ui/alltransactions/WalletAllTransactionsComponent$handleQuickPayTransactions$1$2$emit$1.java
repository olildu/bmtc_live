package app.chalo.wallet.ui.alltransactions;

import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent$handleQuickPayTransactions$1$2", f = "WalletAllTransactionsComponent.kt", l = {ComposerKt.providerKey}, m = "emit", v = 1)
final class WalletAllTransactionsComponent$handleQuickPayTransactions$1$2$emit$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WalletAllTransactionsComponent$handleQuickPayTransactions$1.AnonymousClass2<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAllTransactionsComponent$handleQuickPayTransactions$1$2$emit$1(WalletAllTransactionsComponent$handleQuickPayTransactions$1.AnonymousClass2 anonymousClass2, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
