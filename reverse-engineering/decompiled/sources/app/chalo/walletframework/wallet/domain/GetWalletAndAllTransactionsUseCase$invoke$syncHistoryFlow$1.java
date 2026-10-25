package app.chalo.walletframework.wallet.domain;

import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.domain.model.WalletAndAllTransactions;
import app.chalo.walletframework.wallet.domain.model.WalletAndAllTransactionsFailure;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/chalo/utils/ChaloUseCaseResult;", "Lapp/chalo/walletframework/wallet/domain/model/WalletAndAllTransactions;", "Lapp/chalo/walletframework/wallet/domain/model/WalletAndAllTransactionsFailure;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.walletframework.wallet.domain.GetWalletAndAllTransactionsUseCase$invoke$syncHistoryFlow$1", f = "GetWalletAndAllTransactionsUseCase.kt", l = {56, 61, 63}, m = "invokeSuspend", v = 1)
final class GetWalletAndAllTransactionsUseCase$invoke$syncHistoryFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super ChaloUseCaseResult<WalletAndAllTransactions, WalletAndAllTransactionsFailure>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ WalletTypeIdentifier $walletTypeIdentifier;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GetWalletAndAllTransactionsUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetWalletAndAllTransactionsUseCase$invoke$syncHistoryFlow$1(GetWalletAndAllTransactionsUseCase getWalletAndAllTransactionsUseCase, WalletTypeIdentifier walletTypeIdentifier, Continuation continuation) {
        super(2, continuation);
        this.this$0 = getWalletAndAllTransactionsUseCase;
        this.$walletTypeIdentifier = walletTypeIdentifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetWalletAndAllTransactionsUseCase$invoke$syncHistoryFlow$1 getWalletAndAllTransactionsUseCase$invoke$syncHistoryFlow$1 = new GetWalletAndAllTransactionsUseCase$invoke$syncHistoryFlow$1(this.this$0, this.$walletTypeIdentifier, continuation);
        getWalletAndAllTransactionsUseCase$invoke$syncHistoryFlow$1.L$0 = obj;
        return getWalletAndAllTransactionsUseCase$invoke$syncHistoryFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GetWalletAndAllTransactionsUseCase$invoke$syncHistoryFlow$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r1.emit(r2, r7) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r1.emit(r8, r7) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            goto L18
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L18:
            kotlin.ResultKt.b(r8)
            goto L75
        L1c:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.b(r8)
            goto L3d
        L24:
            kotlin.ResultKt.b(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            app.chalo.walletframework.wallet.domain.GetWalletAndAllTransactionsUseCase r8 = r7.this$0
            app.chalo.walletframework.wallet.domain.WalletSyncOrchestrator r8 = r8.c
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r5 = r7.$walletTypeIdentifier
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = r8.d(r5, r4, r7)
            if (r8 != r0) goto L3d
            goto L74
        L3d:
            app.chalo.utils.ChaloUseCaseResult r8 = (app.chalo.utils.ChaloUseCaseResult) r8
            boolean r4 = r8 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            r5 = 0
            if (r4 == 0) goto L58
            app.chalo.utils.ChaloUseCaseResult$Success r2 = new app.chalo.utils.ChaloUseCaseResult$Success
            app.chalo.utils.ChaloUseCaseResult$Success r8 = (app.chalo.utils.ChaloUseCaseResult.Success) r8
            java.lang.Object r8 = r8.f10419a
            r2.<init>(r8)
            r7.L$0 = r5
            r7.label = r3
            java.lang.Object r8 = r1.emit(r2, r7)
            if (r8 != r0) goto L75
            goto L74
        L58:
            app.chalo.utils.ChaloUseCaseResult$Failure r8 = new app.chalo.utils.ChaloUseCaseResult$Failure
            app.chalo.walletframework.wallet.domain.model.WalletAndAllTransactionsFailure r3 = new app.chalo.walletframework.wallet.domain.model.WalletAndAllTransactionsFailure
            java.lang.Throwable r4 = new java.lang.Throwable
            java.lang.String r6 = "wallet_sync_failed"
            r4.<init>(r6)
            r3.<init>(r4)
            r8.<init>(r3)
            r7.L$0 = r5
            r7.label = r2
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L75
        L74:
            return r0
        L75:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.GetWalletAndAllTransactionsUseCase$invoke$syncHistoryFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
