package app.chalo.kyc.min.ui.minkycotp;

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
@DebugMetadata(c = "app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent$syncWalletAndExitKycFlow$1", f = "MinKycOtpComponent.kt", l = {179, 180}, m = "invokeSuspend", v = 1)
final class MinKycOtpComponent$syncWalletAndExitKycFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MinKycOtpComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinKycOtpComponent$syncWalletAndExitKycFlow$1(MinKycOtpComponent minKycOtpComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = minKycOtpComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MinKycOtpComponent$syncWalletAndExitKycFlow$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MinKycOtpComponent$syncWalletAndExitKycFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r5.c(true, app.chalo.features.wallet.WalletSyncRequest.SemiClosed.f2769a, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r5)
            goto L3b
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            kotlin.ResultKt.b(r5)
            goto L2c
        L1c:
            kotlin.ResultKt.b(r5)
            app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent r5 = r4.this$0
            app.chalo.kyc.min.domain.CreateNoWalletStatusForKycUseCase r5 = r5.o
            r4.label = r3
            java.lang.Object r5 = r5.a(r4)
            if (r5 != r0) goto L2c
            goto L3a
        L2c:
            app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent r5 = r4.this$0
            app.chalo.features.wallet.WalletSyncHelper r5 = r5.q
            r4.label = r2
            app.chalo.features.wallet.WalletSyncRequest$SemiClosed r1 = app.chalo.features.wallet.WalletSyncRequest.SemiClosed.f2769a
            java.lang.Object r5 = r5.c(r3, r1, r4)
            if (r5 != r0) goto L3b
        L3a:
            return r0
        L3b:
            app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent r5 = r4.this$0
            qi0 r0 = new qi0
            r1 = 21
            r0.<init>(r1)
            r5.E0(r0)
            app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent r5 = r4.this$0
            app.chalo.scenes.ChaloNavigationManager r5 = r5.u
            app.chalo.scenes.PopUpToConfig$Scene r0 = new app.chalo.scenes.PopUpToConfig$Scene
            app.chalo.scenes.ChaloScenes r1 = app.chalo.scenes.ChaloScenes.MinKycDetails
            r0.<init>(r1, r3)
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.i(r5, r1)
            app.chalo.scenes.ChaloNavigationRequest$GoBack r1 = new app.chalo.scenes.ChaloNavigationRequest$GoBack
            r1.<init>(r0)
            r5.b(r1)
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.kyc.min.ui.minkycotp.MinKycOtpComponent$syncWalletAndExitKycFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
