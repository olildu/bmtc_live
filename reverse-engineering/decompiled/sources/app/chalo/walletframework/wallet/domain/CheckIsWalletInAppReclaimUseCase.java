package app.chalo.walletframework.wallet.domain;

import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/CheckIsWalletInAppReclaimUseCase;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckIsWalletInAppReclaimUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletRepository f11034a;
    public final GetWalletSetupConfigurationUseCase b;

    public CheckIsWalletInAppReclaimUseCase(WalletRepository walletRepository, GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase) {
        this.f11034a = walletRepository;
        this.b = getWalletSetupConfigurationUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        if (r12 == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, java.lang.String r9, long r10, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof app.chalo.walletframework.wallet.domain.CheckIsWalletInAppReclaimUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r12
            app.chalo.walletframework.wallet.domain.CheckIsWalletInAppReclaimUseCase$invoke$1 r0 = (app.chalo.walletframework.wallet.domain.CheckIsWalletInAppReclaimUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.walletframework.wallet.domain.CheckIsWalletInAppReclaimUseCase$invoke$1 r0 = new app.chalo.walletframework.wallet.domain.CheckIsWalletInAppReclaimUseCase$invoke$1
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            app.chalo.walletframework.wallet.data.repository.WalletRepository r3 = r7.f11034a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4d
            if (r2 == r6) goto L43
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            long r8 = r0.J$1
            long r10 = r0.J$0
            kotlin.ResultKt.b(r12)
            goto Lae
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            long r8 = r0.J$0
            kotlin.ResultKt.b(r12)
            r10 = r8
            goto L8b
        L43:
            long r10 = r0.J$0
            java.lang.Object r8 = r0.L$0
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.b(r12)
            goto L5d
        L4d:
            kotlin.ResultKt.b(r12)
            r0.L$0 = r8
            r0.J$0 = r10
            r0.label = r6
            java.lang.Object r12 = r3.J(r8, r9, r0)
            if (r12 != r1) goto L5d
            goto Lad
        L5d:
            app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel r12 = (app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel) r12
            if (r12 != 0) goto L69
            app.chalo.utils.ChaloUseCaseResult$Failure r8 = new app.chalo.utils.ChaloUseCaseResult$Failure
            app.chalo.walletframework.wallet.domain.WalletInAppReclaimFailureReason r9 = app.chalo.walletframework.wallet.domain.WalletInAppReclaimFailureReason.NO_WALLET_FOUND
            r8.<init>(r9)
            return r8
        L69:
            app.chalo.walletframework.wallet.data.model.CachedWalletStatus r9 = r12.getC()
            app.chalo.walletframework.wallet.data.model.CachedWalletStatus r2 = app.chalo.walletframework.wallet.data.model.CachedWalletStatus.BLOCKED_FOR_APP_RECLAIM
            if (r9 == r2) goto L79
            app.chalo.utils.ChaloUseCaseResult$Success r8 = new app.chalo.utils.ChaloUseCaseResult$Success
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r8.<init>(r9)
            return r8
        L79:
            java.lang.String r9 = r12.getF11008a()
            r12 = 0
            r0.L$0 = r12
            r0.J$0 = r10
            r0.label = r5
            java.lang.Object r12 = r3.o(r8, r9, r0)
            if (r12 != r1) goto L8b
            goto Lad
        L8b:
            java.lang.Number r12 = (java.lang.Number) r12
            long r8 = r12.longValue()
            r2 = -1
            int r12 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r12 != 0) goto L9f
            app.chalo.utils.ChaloUseCaseResult$Success r8 = new app.chalo.utils.ChaloUseCaseResult$Success
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r8.<init>(r9)
            return r8
        L9f:
            r0.J$0 = r10
            r0.J$1 = r8
            r0.label = r4
            app.chalo.domain.GetWalletSetupConfigurationUseCase r12 = r7.b
            java.lang.Object r12 = r12.b(r0)
            if (r12 != r1) goto Lae
        Lad:
            return r1
        Lae:
            app.chalo.data.WalletSetupConfiguration r12 = (app.chalo.data.WalletSetupConfiguration) r12
            long r0 = r12.b
            long r10 = r10 - r8
            int r8 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r8 < 0) goto Lbf
            app.chalo.utils.ChaloUseCaseResult$Success r8 = new app.chalo.utils.ChaloUseCaseResult$Success
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r8.<init>(r9)
            return r8
        Lbf:
            app.chalo.utils.ChaloUseCaseResult$Success r8 = new app.chalo.utils.ChaloUseCaseResult$Success
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r8.<init>(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.CheckIsWalletInAppReclaimUseCase.a(java.lang.String, java.lang.String, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
