package app.chalo.checkout.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.domain.MakeChaloWalletPaymentUseCase", f = "MakeChaloWalletPaymentUseCase.kt", l = {150, 152, 157}, m = "updateTransactionsAndSyncWallet", v = 1)
final class MakeChaloWalletPaymentUseCase$updateTransactionsAndSyncWallet$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MakeChaloWalletPaymentUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MakeChaloWalletPaymentUseCase$updateTransactionsAndSyncWallet$1(MakeChaloWalletPaymentUseCase makeChaloWalletPaymentUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = makeChaloWalletPaymentUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, null, 0, this);
    }
}
