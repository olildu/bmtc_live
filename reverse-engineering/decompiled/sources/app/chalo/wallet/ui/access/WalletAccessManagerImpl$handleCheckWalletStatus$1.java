package app.chalo.wallet.ui.access;

import androidx.constraintlayout.core.motion.utils.TypedValues;
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
@DebugMetadata(c = "app.chalo.wallet.ui.access.WalletAccessManagerImpl$handleCheckWalletStatus$1", f = "WalletAccessManagerImpl.kt", l = {418, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, TypedValues.CycleType.TYPE_WAVE_PERIOD, TypedValues.CycleType.TYPE_WAVE_PHASE, 429}, m = "invokeSuspend", v = 1)
final class WalletAccessManagerImpl$handleCheckWalletStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WalletTypeIdentifier $walletTypeIdentifier;
    int label;
    final /* synthetic */ WalletAccessManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletAccessManagerImpl$handleCheckWalletStatus$1(WalletAccessManagerImpl walletAccessManagerImpl, WalletTypeIdentifier walletTypeIdentifier, Continuation continuation) {
        super(2, continuation);
        this.this$0 = walletAccessManagerImpl;
        this.$walletTypeIdentifier = walletTypeIdentifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalletAccessManagerImpl$handleCheckWalletStatus$1(this.this$0, this.$walletTypeIdentifier, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletAccessManagerImpl$handleCheckWalletStatus$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r1.j((app.chalo.walletframework.wallet.domain.WalletStatusWithReclaimTime) r8, r2, true, r7) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r1.j(r8, r2, true, r7) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r1.j(r3, r8, true, r7) == r0) goto L35;
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
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2b
            if (r1 == r6) goto L27
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1e
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            goto L1e
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            kotlin.ResultKt.b(r8)
            goto L9c
        L23:
            kotlin.ResultKt.b(r8)
            goto L63
        L27:
            kotlin.ResultKt.b(r8)
            goto L3d
        L2b:
            kotlin.ResultKt.b(r8)
            app.chalo.wallet.ui.access.WalletAccessManagerImpl r8 = r7.this$0
            app.chalo.walletframework.wallet.domain.GetWalletStatusWithoutSyncUseCase r8 = r8.d
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r1 = r7.$walletTypeIdentifier
            r7.label = r6
            java.lang.Object r8 = r8.a(r1, r7)
            if (r8 != r0) goto L3d
            goto L9b
        L3d:
            app.chalo.utils.ChaloUseCaseResult r8 = (app.chalo.utils.ChaloUseCaseResult) r8
            boolean r1 = r8 instanceof app.chalo.utils.ChaloUseCaseResult.Failure
            if (r1 == 0) goto L7f
            app.chalo.utils.ChaloUseCaseResult$Failure r8 = (app.chalo.utils.ChaloUseCaseResult.Failure) r8
            java.lang.Object r8 = r8.f10418a
            app.chalo.walletframework.wallet.domain.WalletStatusWithReclaimTime r8 = (app.chalo.walletframework.wallet.domain.WalletStatusWithReclaimTime) r8
            app.chalo.walletframework.wallet.data.model.WalletStatus r1 = r8.f11077a
            app.chalo.walletframework.wallet.data.model.WalletStatus r2 = app.chalo.walletframework.wallet.data.model.WalletStatus.KYC_INITIATED
            if (r1 == r2) goto L72
            app.chalo.wallet.ui.access.WalletAccessManagerImpl r8 = r7.this$0
            r8.o()
            app.chalo.wallet.ui.access.WalletAccessManagerImpl r8 = r7.this$0
            app.chalo.walletframework.wallet.domain.GetWalletStatusWithReclaimTimeUseCase r8 = r8.b
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r1 = r7.$walletTypeIdentifier
            r7.label = r5
            java.lang.Object r8 = r8.a(r1, r7)
            if (r8 != r0) goto L63
            goto L9b
        L63:
            app.chalo.walletframework.wallet.domain.WalletStatusWithReclaimTime r8 = (app.chalo.walletframework.wallet.domain.WalletStatusWithReclaimTime) r8
            app.chalo.wallet.ui.access.WalletAccessManagerImpl r1 = r7.this$0
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r2 = r7.$walletTypeIdentifier
            r7.label = r4
            java.lang.Object r8 = r1.j(r8, r2, r6, r7)
            if (r8 != r0) goto L9c
            goto L9b
        L72:
            app.chalo.wallet.ui.access.WalletAccessManagerImpl r1 = r7.this$0
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r2 = r7.$walletTypeIdentifier
            r7.label = r3
            java.lang.Object r8 = r1.j(r8, r2, r6, r7)
            if (r8 != r0) goto L9c
            goto L9b
        L7f:
            boolean r1 = r8 instanceof app.chalo.utils.ChaloUseCaseResult.Success
            if (r1 == 0) goto L9f
            app.chalo.wallet.ui.access.WalletAccessManagerImpl r1 = r7.this$0
            app.chalo.walletframework.wallet.domain.WalletStatusWithReclaimTime r3 = new app.chalo.walletframework.wallet.domain.WalletStatusWithReclaimTime
            app.chalo.utils.ChaloUseCaseResult$Success r8 = (app.chalo.utils.ChaloUseCaseResult.Success) r8
            java.lang.Object r8 = r8.f10419a
            app.chalo.walletframework.wallet.data.model.WalletStatus r8 = (app.chalo.walletframework.wallet.data.model.WalletStatus) r8
            r4 = 0
            r3.<init>(r8, r4)
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r8 = r7.$walletTypeIdentifier
            r7.label = r2
            java.lang.Object r8 = r1.j(r3, r8, r6, r7)
            if (r8 != r0) goto L9c
        L9b:
            return r0
        L9c:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        L9f:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.wallet.ui.access.WalletAccessManagerImpl$handleCheckWalletStatus$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
