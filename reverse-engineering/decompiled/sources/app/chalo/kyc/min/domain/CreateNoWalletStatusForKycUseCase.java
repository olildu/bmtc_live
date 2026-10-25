package app.chalo.kyc.min.domain;

import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/domain/CreateNoWalletStatusForKycUseCase;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateNoWalletStatusForKycUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f4110a;
    public final WalletRepository b;
    public final UserProfileDetailsProvider c;

    public CreateNoWalletStatusForKycUseCase(StringProvider stringProvider, WalletRepository walletRepository, UserProfileDetailsProvider userProfileDetailsProvider) {
        this.f4110a = stringProvider;
        this.b = walletRepository;
        this.c = userProfileDetailsProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        if (r6.b.t(app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest.SemiClosedWallet.f10952a, r7, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        if (r7 == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof app.chalo.kyc.min.domain.CreateNoWalletStatusForKycUseCase$invoke$1
            if (r0 == 0) goto L13
            r0 = r7
            app.chalo.kyc.min.domain.CreateNoWalletStatusForKycUseCase$invoke$1 r0 = (app.chalo.kyc.min.domain.CreateNoWalletStatusForKycUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.kyc.min.domain.CreateNoWalletStatusForKycUseCase$invoke$1 r0 = new app.chalo.kyc.min.domain.CreateNoWalletStatusForKycUseCase$invoke$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r7)
            goto L76
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            kotlin.ResultKt.b(r7)
            goto L5e
        L39:
            kotlin.ResultKt.b(r7)
            goto L4b
        L3d:
            kotlin.ResultKt.b(r7)
            r0.label = r5
            app.chalo.providers.UserProfileDetailsProvider r7 = r6.c
            java.lang.Object r7 = r7.k(r0)
            if (r7 != r1) goto L4b
            goto L75
        L4b:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L66
            app.chalo.walletframework.wallet.data.model.NoWalletStatus r7 = app.chalo.walletframework.wallet.data.model.NoWalletStatus.KYC_INITIATED
            r0.label = r4
            app.chalo.walletframework.wallet.data.repository.WalletRepository r2 = r6.b
            app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest$SemiClosedWallet r3 = app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest.SemiClosedWallet.f10952a
            java.lang.Object r7 = r2.t(r3, r7, r0)
            if (r7 != r1) goto L5e
            goto L75
        L5e:
            app.chalo.utils.ChaloUseCaseResult$Success r7 = new app.chalo.utils.ChaloUseCaseResult$Success
            kotlin.Unit r0 = kotlin.Unit.f17538a
            r7.<init>(r0)
            return r7
        L66:
            app.chalo.providers.stringprovider.StringEnum r7 = app.chalo.providers.stringprovider.StringEnum.SOMETHING_WENT_WRONG
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.label = r3
            app.chalo.providers.stringprovider.StringProvider r3 = r6.f4110a
            java.lang.Object r7 = r3.b(r7, r2, r0)
            if (r7 != r1) goto L76
        L75:
            return r1
        L76:
            java.lang.String r7 = (java.lang.String) r7
            app.chalo.kyc.min.ui.UserIdNullError r0 = new app.chalo.kyc.min.ui.UserIdNullError
            r0.<init>(r7)
            app.chalo.utils.ChaloUseCaseResult$Failure r7 = new app.chalo.utils.ChaloUseCaseResult$Failure
            r7.<init>(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.kyc.min.domain.CreateNoWalletStatusForKycUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
