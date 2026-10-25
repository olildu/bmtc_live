package app.chalo.quickpay.ui.tripamount;

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
@DebugMetadata(c = "app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent$handleOnStartIntent$1", f = "QuickpayTripAmountComponent.kt", l = {439, 440}, m = "invokeSuspend", v = 1)
final class QuickpayTripAmountComponent$handleOnStartIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ QuickpayTripAmountComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickpayTripAmountComponent$handleOnStartIntent$1(QuickpayTripAmountComponent quickpayTripAmountComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = quickpayTripAmountComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QuickpayTripAmountComponent$handleOnStartIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((QuickpayTripAmountComponent$handleOnStartIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r6 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r6 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r6 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            kotlin.Unit r2 = kotlin.Unit.f17538a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            kotlin.ResultKt.b(r6)
            goto L4c
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.ResultKt.b(r6)
            goto L3a
        L1e:
            kotlin.ResultKt.b(r6)
            app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent r6 = r5.this$0
            com.arkivanov.decompose.value.Value r6 = r6.m
            java.lang.Object r6 = r6.a()
            app.chalo.wallet.ui.access.WalletAccessState r6 = (app.chalo.wallet.ui.access.WalletAccessState) r6
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r6 = r6.b
            if (r6 != 0) goto L3f
            app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent r6 = r5.this$0
            r5.label = r4
            java.lang.Object r6 = r6.I0(r5)
            if (r6 != r0) goto L3a
            goto L4b
        L3a:
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r6 = (app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) r6
            if (r6 != 0) goto L3f
            goto L7a
        L3f:
            app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent r1 = r5.this$0
            app.chalo.walletframework.wallet.domain.FetchWalletBalanceUseCase r1 = r1.x
            r5.label = r3
            java.lang.Object r6 = r1.b(r6, r5)
            if (r6 != r0) goto L4c
        L4b:
            return r0
        L4c:
            app.chalo.utils.ChaloUseCaseResult r6 = (app.chalo.utils.ChaloUseCaseResult) r6
            boolean r0 = r6 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            if (r0 == 0) goto L5e
            app.chalo.utils.ChaloUseCaseResult$Success r6 = (app.chalo.utils.ChaloUseCaseResult.Success) r6
            java.lang.Object r6 = r6.f10419a
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            long r0 = (long) r6
            goto L64
        L5e:
            boolean r6 = r6 instanceof app.chalo.utils.ChaloUseCaseResult.Failure
            if (r6 == 0) goto L7b
            r0 = -1
        L64:
            app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent r6 = r5.this$0
            v3 r3 = new v3
            r4 = 6
            r3.<init>(r0, r4)
            r6.E0(r3)
            app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent r6 = r5.this$0
            boolean r0 = r6.I
            if (r0 == 0) goto L7a
            app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountIntent$NextIntent r0 = app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountIntent.NextIntent.f8874a
            r6.J0(r0)
        L7a:
            return r2
        L7b:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent$handleOnStartIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
