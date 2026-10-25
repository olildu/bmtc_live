package app.chalo.checkout.ui.screen.payment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.ui.screen.payment.PaymentMainComponent$handleViewCreatedIntent$1", f = "PaymentMainComponent.kt", l = {2112, 2113, 2120}, m = "invokeSuspend", v = 1)
final class PaymentMainComponent$handleViewCreatedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PaymentMainComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMainComponent$handleViewCreatedIntent$1(PaymentMainComponent paymentMainComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = paymentMainComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PaymentMainComponent$handleViewCreatedIntent$1 paymentMainComponent$handleViewCreatedIntent$1 = new PaymentMainComponent$handleViewCreatedIntent$1(this.this$0, continuation);
        paymentMainComponent$handleViewCreatedIntent$1.L$0 = obj;
        return paymentMainComponent$handleViewCreatedIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMainComponent$handleViewCreatedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (r8 == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L33
            if (r1 == r4) goto L2b
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L14
            goto L85
        L14:
            r8 = move-exception
            goto L88
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            java.lang.Object r1 = r7.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r7.L$0
            kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
            kotlin.ResultKt.b(r8)
            goto L62
        L2b:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r8)
            goto L4a
        L33:
            kotlin.ResultKt.b(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            app.chalo.checkout.ui.screen.payment.PaymentMainComponent r8 = r7.this$0
            app.chalo.behaviour.policy.ResolveSupportPolicyUseCase r8 = r8.Y
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L4a
            goto L84
        L4a:
            app.chalo.behaviour.policy.ResolvedSupportPolicy r8 = (app.chalo.behaviour.policy.ResolvedSupportPolicy) r8
            java.lang.String r8 = r8.c
            app.chalo.checkout.ui.screen.payment.PaymentMainComponent r5 = r7.this$0
            r7.L$0 = r1
            r7.L$1 = r8
            r7.label = r3
            app.chalo.walletframework.wallet.domain.resolver.WalletResolver r1 = r5.X
            java.lang.Object r1 = r1.b(r7)
            if (r1 != r0) goto L5f
            goto L84
        L5f:
            r6 = r1
            r1 = r8
            r8 = r6
        L62:
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r8 = (app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) r8
            if (r8 == 0) goto L68
            boolean r4 = r8.d
        L68:
            app.chalo.checkout.ui.screen.payment.PaymentMainComponent r8 = r7.this$0
            ui r3 = new ui
            r5 = 5
            r3.<init>(r4, r1, r5)
            r8.E0(r3)
            app.chalo.checkout.ui.screen.payment.PaymentMainComponent r8 = r7.this$0
            app.chalo.ads.AdTargetingProvider r8 = r8.U     // Catch: java.lang.Throwable -> L14
            r1 = 0
            r7.L$0 = r1     // Catch: java.lang.Throwable -> L14
            r7.L$1 = r1     // Catch: java.lang.Throwable -> L14
            r7.label = r2     // Catch: java.lang.Throwable -> L14
            java.lang.Object r8 = app.chalo.ads.AdTargetingProvider.b(r8, r7)     // Catch: java.lang.Throwable -> L14
            if (r8 != r0) goto L85
        L84:
            return r0
        L85:
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> L14
            goto L8c
        L88:
            kotlin.Result$Failure r8 = kotlin.ResultKt.a(r8)
        L8c:
            java.lang.Throwable r0 = kotlin.Result.a(r8)
            if (r0 == 0) goto L9f
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L9e
            java.lang.String r1 = "CheckoutNativeAd"
            java.lang.String r2 = "Failed to build ad targeting"
            app.chalo.utils.chalologger.ChaloLog.c(r1, r2, r0)
            goto L9f
        L9e:
            throw r0
        L9f:
            java.lang.Throwable r0 = kotlin.Result.a(r8)
            if (r0 != 0) goto La6
            goto Laa
        La6:
            java.util.Map r8 = kotlin.collections.MapsKt.d()
        Laa:
            java.util.Map r8 = (java.util.Map) r8
            app.chalo.checkout.ui.screen.payment.PaymentMainComponent r0 = r7.this$0
            r60 r1 = new r60
            r2 = 1
            r1.<init>(r2, r8)
            r0.E0(r1)
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.ui.screen.payment.PaymentMainComponent$handleViewCreatedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
