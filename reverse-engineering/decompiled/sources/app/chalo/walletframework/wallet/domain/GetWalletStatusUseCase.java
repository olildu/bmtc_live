package app.chalo.walletframework.wallet.domain;

import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolverKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/GetWalletStatusUseCase;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetWalletStatusUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletRepository f11055a;
    public final UserProfileDetailsProvider b;
    public final WalletSyncOrchestrator c;
    public final CheckIsWalletTimedOutUseCase d;
    public final WalletResolver e;

    public GetWalletStatusUseCase(WalletRepository walletRepository, UserProfileDetailsProvider userProfileDetailsProvider, WalletSyncOrchestrator walletSyncOrchestrator, CheckIsWalletTimedOutUseCase checkIsWalletTimedOutUseCase, WalletResolver walletResolver) {
        this.f11055a = walletRepository;
        this.b = userProfileDetailsProvider;
        this.c = walletSyncOrchestrator;
        this.d = checkIsWalletTimedOutUseCase;
        this.e = walletResolver;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01c4 A[PHI: r13
      0x01c4: PHI (r13v43 java.lang.Object) = (r13v40 java.lang.Object), (r13v1 java.lang.Object) binds: [B:100:0x01c1, B:13:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01de  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:52:0x0116  */
    /* JADX WARN: Code duplicated, block: B:54:0x011b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0120  */
    /* JADX WARN: Code duplicated, block: B:58:0x0125  */
    /* JADX WARN: Code duplicated, block: B:71:0x015a A[PHI: r2 r12
      0x015a: PHI (r2v15 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) = 
      (r2v10 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r2v16 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r2v16 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
     binds: [B:57:0x0123, B:66:0x0149, B:68:0x0155] A[DONT_GENERATE, DONT_INLINE]
      0x015a: PHI (r12v18 app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest) = 
      (r12v12 app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest)
      (r12v19 app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest)
      (r12v19 app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest)
     binds: [B:57:0x0123, B:66:0x0149, B:68:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x016e A[PHI: r2 r12 r13
      0x016e: PHI (r2v19 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) = 
      (r2v15 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r2v21 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
     binds: [B:72:0x016b, B:15:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x016e: PHI (r12v24 app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest) = 
      (r12v18 app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest)
      (r12v27 app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest)
     binds: [B:72:0x016b, B:15:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x016e: PHI (r13v28 java.lang.Object) = (r13v21 java.lang.Object), (r13v1 java.lang.Object) binds: [B:72:0x016b, B:15:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0174  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:85:0x0195 A[PHI: r12 r13
      0x0195: PHI (r12v28 app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest) = 
      (r12v24 app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest)
      (r12v32 app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest)
     binds: [B:83:0x0192, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x0195: PHI (r13v35 java.lang.Object) = (r13v31 java.lang.Object), (r13v1 java.lang.Object) binds: [B:83:0x0192, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x019d  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01aa  */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ce, code lost:
    
        if (r13 == r1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fb, code lost:
    
        if (r13 == r1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013a, code lost:
    
        if (r13 == r1) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum a(app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.GetWalletStatusUseCase.a(app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Enum");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        GetWalletStatusUseCase$resolveCachedWallet$1 getWalletStatusUseCase$resolveCachedWallet$1;
        if (continuationImpl instanceof GetWalletStatusUseCase$resolveCachedWallet$1) {
            getWalletStatusUseCase$resolveCachedWallet$1 = (GetWalletStatusUseCase$resolveCachedWallet$1) continuationImpl;
            int i = getWalletStatusUseCase$resolveCachedWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getWalletStatusUseCase$resolveCachedWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                getWalletStatusUseCase$resolveCachedWallet$1 = new GetWalletStatusUseCase$resolveCachedWallet$1(this, continuationImpl);
            }
        } else {
            getWalletStatusUseCase$resolveCachedWallet$1 = new GetWalletStatusUseCase$resolveCachedWallet$1(this, continuationImpl);
        }
        Object objE = getWalletStatusUseCase$resolveCachedWallet$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getWalletStatusUseCase$resolveCachedWallet$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            getWalletStatusUseCase$resolveCachedWallet$1.label = 1;
            objE = this.e.e(walletTypeIdentifier, getWalletStatusUseCase$resolveCachedWallet$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objE);
        }
        return WalletResolverKt.a((ChaloUseCaseResult) objE);
    }
}
