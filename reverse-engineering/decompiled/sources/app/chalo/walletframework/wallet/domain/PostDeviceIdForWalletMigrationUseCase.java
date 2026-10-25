package app.chalo.walletframework.wallet.domain;

import app.chalo.Device;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/PostDeviceIdForWalletMigrationUseCase;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PostDeviceIdForWalletMigrationUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletRepository f11064a;
    public final UserProfileDetailsProvider b;
    public final Device c;

    public PostDeviceIdForWalletMigrationUseCase(WalletRepository walletRepository, UserProfileDetailsProvider userProfileDetailsProvider, Device device) {
        this.f11064a = walletRepository;
        this.b = userProfileDetailsProvider;
        this.c = device;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r7 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof app.chalo.walletframework.wallet.domain.PostDeviceIdForWalletMigrationUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r7
            app.chalo.walletframework.wallet.domain.PostDeviceIdForWalletMigrationUseCase$invoke$1 r0 = (app.chalo.walletframework.wallet.domain.PostDeviceIdForWalletMigrationUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.walletframework.wallet.domain.PostDeviceIdForWalletMigrationUseCase$invoke$1 r0 = new app.chalo.walletframework.wallet.domain.PostDeviceIdForWalletMigrationUseCase$invoke$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            app.chalo.providers.UserProfileDetailsProvider r3 = r6.b
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.b(r7)     // Catch: app.chalo.walletframework.wallet.data.exceptions.WalletMigrationException -> L7c
            goto L6c
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            kotlin.ResultKt.b(r7)     // Catch: app.chalo.walletframework.wallet.data.exceptions.WalletMigrationException -> L7c
            goto L48
        L38:
            kotlin.ResultKt.b(r7)
            kotlinx.coroutines.flow.StateFlow r7 = r3.g()     // Catch: app.chalo.walletframework.wallet.data.exceptions.WalletMigrationException -> L7c
            r0.label = r5     // Catch: app.chalo.walletframework.wallet.data.exceptions.WalletMigrationException -> L7c
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.t(r7, r0)     // Catch: app.chalo.walletframework.wallet.data.exceptions.WalletMigrationException -> L7c
            if (r7 != r1) goto L48
            goto L6b
        L48:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: app.chalo.walletframework.wallet.data.exceptions.WalletMigrationException -> L7c
            boolean r7 = r7.booleanValue()     // Catch: app.chalo.walletframework.wallet.data.exceptions.WalletMigrationException -> L7c
            if (r7 == 0) goto L79
            java.lang.String r7 = r3.m()     // Catch: app.chalo.walletframework.wallet.data.exceptions.WalletMigrationException -> L7c
            if (r7 == 0) goto L73
            app.chalo.walletframework.wallet.data.model.apimodel.request.WalletMigrationRequestApiModel r2 = new app.chalo.walletframework.wallet.data.model.apimodel.request.WalletMigrationRequestApiModel     // Catch: app.chalo.walletframework.wallet.data.exceptions.WalletMigrationException -> L7c
            app.chalo.Device r3 = r6.c     // Catch: app.chalo.walletframework.wallet.data.exceptions.WalletMigrationException -> L7c
            java.lang.String r3 = r3.getDeviceId()     // Catch: app.chalo.walletframework.wallet.data.exceptions.WalletMigrationException -> L7c
            r2.<init>(r7, r3)     // Catch: app.chalo.walletframework.wallet.data.exceptions.WalletMigrationException -> L7c
            app.chalo.walletframework.wallet.data.repository.WalletRepository r7 = r6.f11064a     // Catch: app.chalo.walletframework.wallet.data.exceptions.WalletMigrationException -> L7c
            r0.label = r4     // Catch: app.chalo.walletframework.wallet.data.exceptions.WalletMigrationException -> L7c
            java.lang.Object r7 = r7.h(r2, r0)     // Catch: app.chalo.walletframework.wallet.data.exceptions.WalletMigrationException -> L7c
            if (r7 != r1) goto L6c
        L6b:
            return r1
        L6c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: app.chalo.walletframework.wallet.data.exceptions.WalletMigrationException -> L7c
            boolean r7 = r7.booleanValue()     // Catch: app.chalo.walletframework.wallet.data.exceptions.WalletMigrationException -> L7c
            goto L74
        L73:
            r7 = 0
        L74:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: app.chalo.walletframework.wallet.data.exceptions.WalletMigrationException -> L7c
            return r7
        L79:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: app.chalo.walletframework.wallet.data.exceptions.WalletMigrationException -> L7c
            return r7
        L7c:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.PostDeviceIdForWalletMigrationUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
