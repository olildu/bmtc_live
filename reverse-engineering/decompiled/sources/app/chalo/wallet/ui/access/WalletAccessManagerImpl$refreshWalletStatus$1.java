package app.chalo.wallet.ui.access;

import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
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
@DebugMetadata(c = "app.chalo.wallet.ui.access.WalletAccessManagerImpl$refreshWalletStatus$1", f = "WalletAccessManagerImpl.kt", l = {788, 788}, m = "invokeSuspend", v = 1)
final class WalletAccessManagerImpl$refreshWalletStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $shouldAttemptClosedLoopRegistration;
    final /* synthetic */ WalletTypeIdentifier $walletTypeIdentifier;
    Object L$0;
    int label;
    final /* synthetic */ WalletAccessManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAccessManagerImpl$refreshWalletStatus$1(WalletAccessManagerImpl walletAccessManagerImpl, WalletTypeIdentifier walletTypeIdentifier, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = walletAccessManagerImpl;
        this.$walletTypeIdentifier = walletTypeIdentifier;
        this.$shouldAttemptClosedLoopRegistration = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalletAccessManagerImpl$refreshWalletStatus$1(this.this$0, this.$walletTypeIdentifier, this.$shouldAttemptClosedLoopRegistration, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletAccessManagerImpl$refreshWalletStatus$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r1.j((app.chalo.walletframework.wallet.domain.WalletStatusWithReclaimTime) r7, r3, r4, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r7)
            goto L46
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            java.lang.Object r1 = r6.L$0
            app.chalo.wallet.ui.access.WalletAccessManagerImpl r1 = (app.chalo.wallet.ui.access.WalletAccessManagerImpl) r1
            kotlin.ResultKt.b(r7)
            goto L34
        L20:
            kotlin.ResultKt.b(r7)
            app.chalo.wallet.ui.access.WalletAccessManagerImpl r1 = r6.this$0
            app.chalo.walletframework.wallet.domain.RefreshWalletStatusUseCase r7 = r1.c
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r4 = r6.$walletTypeIdentifier
            r6.L$0 = r1
            r6.label = r3
            java.lang.Object r7 = r7.a(r4, r6)
            if (r7 != r0) goto L34
            goto L45
        L34:
            app.chalo.walletframework.wallet.domain.WalletStatusWithReclaimTime r7 = (app.chalo.walletframework.wallet.domain.WalletStatusWithReclaimTime) r7
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r3 = r6.$walletTypeIdentifier
            boolean r4 = r6.$shouldAttemptClosedLoopRegistration
            r5 = 0
            r6.L$0 = r5
            r6.label = r2
            java.lang.Object r7 = r1.j(r7, r3, r4, r6)
            if (r7 != r0) goto L46
        L45:
            return r0
        L46:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.wallet.ui.access.WalletAccessManagerImpl$refreshWalletStatus$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
