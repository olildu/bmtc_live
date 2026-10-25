package app.chalo.walletframework.wallet.domain;

import app.chalo.walletframework.quickpay.data.repository.QuickPayRepository;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/ClearWalletAndQuickPayDuringLogoutUseCase;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClearWalletAndQuickPayDuringLogoutUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletRepository f11037a;
    public final QuickPayRepository b;

    public ClearWalletAndQuickPayDuringLogoutUseCase(WalletRepository walletRepository, QuickPayRepository quickPayRepository) {
        this.f11037a = walletRepository;
        this.b = quickPayRepository;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        if (r4.i(r6, r0) == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof app.chalo.walletframework.wallet.domain.ClearWalletAndQuickPayDuringLogoutUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r6
            app.chalo.walletframework.wallet.domain.ClearWalletAndQuickPayDuringLogoutUseCase$invoke$1 r0 = (app.chalo.walletframework.wallet.domain.ClearWalletAndQuickPayDuringLogoutUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.walletframework.wallet.domain.ClearWalletAndQuickPayDuringLogoutUseCase$invoke$1 r0 = new app.chalo.walletframework.wallet.domain.ClearWalletAndQuickPayDuringLogoutUseCase$invoke$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            app.chalo.walletframework.quickpay.data.repository.QuickPayRepository r3 = r5.b
            app.chalo.walletframework.wallet.data.repository.WalletRepository r4 = r5.f11037a
            switch(r2) {
                case 0: goto L45;
                case 1: goto L41;
                case 2: goto L3d;
                case 3: goto L39;
                case 4: goto L35;
                case 5: goto L31;
                case 6: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2d:
            kotlin.ResultKt.b(r6)
            goto L86
        L31:
            kotlin.ResultKt.b(r6)
            goto L7a
        L35:
            kotlin.ResultKt.b(r6)
            goto L70
        L39:
            kotlin.ResultKt.b(r6)
            goto L66
        L3d:
            kotlin.ResultKt.b(r6)
            goto L5c
        L41:
            kotlin.ResultKt.b(r6)
            goto L52
        L45:
            kotlin.ResultKt.b(r6)
            r6 = 1
            r0.label = r6
            java.lang.Object r6 = r4.e(r0)
            if (r6 != r1) goto L52
            goto L85
        L52:
            r6 = 2
            r0.label = r6
            java.lang.Object r6 = r4.d(r0)
            if (r6 != r1) goto L5c
            goto L85
        L5c:
            r6 = 3
            r0.label = r6
            java.lang.Object r6 = r3.g(r0)
            if (r6 != r1) goto L66
            goto L85
        L66:
            r6 = 4
            r0.label = r6
            java.lang.Object r6 = r4.b(r0)
            if (r6 != r1) goto L70
            goto L85
        L70:
            r6 = 5
            r0.label = r6
            java.lang.Object r6 = r3.e(r0)
            if (r6 != r1) goto L7a
            goto L85
        L7a:
            app.chalo.walletframework.wallet.data.model.NoWalletStatus r6 = app.chalo.walletframework.wallet.data.model.NoWalletStatus.WALLET_FETCH_PENDING
            r2 = 6
            r0.label = r2
            java.lang.Object r6 = r4.i(r6, r0)
            if (r6 != r1) goto L86
        L85:
            return r1
        L86:
            kotlin.Unit r6 = kotlin.Unit.f17538a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.ClearWalletAndQuickPayDuringLogoutUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
