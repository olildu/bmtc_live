package app.chalo.wallet.ui.loadbalance;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountComponent$handleNextBtnClick$2", f = "WalletLoadBalanceEnterAmountComponent.kt", l = {279, 282, 291, 301, 306, 328, 329, 330}, m = "invokeSuspend", v = 1)
final class WalletLoadBalanceEnterAmountComponent$handleNextBtnClick$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $amountInSubUnits;
    final /* synthetic */ String $currentAmount;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WalletLoadBalanceEnterAmountComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLoadBalanceEnterAmountComponent$handleNextBtnClick$2(WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent, int i, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = walletLoadBalanceEnterAmountComponent;
        this.$amountInSubUnits = i;
        this.$currentAmount = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WalletLoadBalanceEnterAmountComponent$handleNextBtnClick$2 walletLoadBalanceEnterAmountComponent$handleNextBtnClick$2 = new WalletLoadBalanceEnterAmountComponent$handleNextBtnClick$2(this.this$0, this.$amountInSubUnits, this.$currentAmount, continuation);
        walletLoadBalanceEnterAmountComponent$handleNextBtnClick$2.L$0 = obj;
        return walletLoadBalanceEnterAmountComponent$handleNextBtnClick$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletLoadBalanceEnterAmountComponent$handleNextBtnClick$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8 A[PHI: r1 r14
      0x00c8: PHI (r1v10 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) = 
      (r1v4 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r1v13 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
     binds: [B:33:0x00c4, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x00c8: PHI (r14v24 java.lang.Object) = (r14v15 java.lang.Object), (r14v0 java.lang.Object) binds: [B:33:0x00c4, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f0 A[PHI: r14
      0x00f0: PHI (r14v31 java.lang.Object) = (r14v29 java.lang.Object), (r14v0 java.lang.Object) binds: [B:40:0x00ec, B:9:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:46:0x0114  */
    /* JADX WARN: Code duplicated, block: B:48:0x0118  */
    /* JADX WARN: Code duplicated, block: B:50:0x0128  */
    /* JADX WARN: Code duplicated, block: B:52:0x012d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0134  */
    /* JADX WARN: Code duplicated, block: B:61:0x0152  */
    /* JADX WARN: Code duplicated, block: B:64:0x0159  */
    /* JADX WARN: Code duplicated, block: B:66:0x0161  */
    /* JADX WARN: Code duplicated, block: B:69:0x0175  */
    /* JADX WARN: Code duplicated, block: B:71:0x017b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0184  */
    /* JADX WARN: Code duplicated, block: B:77:0x0199  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d4  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        if (r14 == r0) goto L76;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountComponent$handleNextBtnClick$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
