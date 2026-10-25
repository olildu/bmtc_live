package app.chalo.walletframework.wallet.domain;

import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolverError;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/GetWalletStatusWithReclaimTimeUseCase;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetWalletStatusWithReclaimTimeUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletRepository f11056a;
    public final UserProfileDetailsProvider b;
    public final WalletSyncOrchestrator c;
    public final CheckIsWalletTimedOutUseCase d;
    public final WalletResolver e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11057a;

        static {
            int[] iArr = new int[WalletResolverError.values().length];
            try {
                iArr[WalletResolverError.NOT_LOGGED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletResolverError.WALLET_NOT_CACHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11057a = iArr;
        }
    }

    public GetWalletStatusWithReclaimTimeUseCase(WalletRepository walletRepository, UserProfileDetailsProvider userProfileDetailsProvider, WalletSyncOrchestrator walletSyncOrchestrator, CheckIsWalletTimedOutUseCase checkIsWalletTimedOutUseCase, WalletResolver walletResolver) {
        this.f11056a = walletRepository;
        this.b = userProfileDetailsProvider;
        this.c = walletSyncOrchestrator;
        this.d = checkIsWalletTimedOutUseCase;
        this.e = walletResolver;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:45:0x0114  */
    /* JADX WARN: Code duplicated, block: B:47:0x011a  */
    /* JADX WARN: Code duplicated, block: B:48:0x011f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0124  */
    /* JADX WARN: Code duplicated, block: B:54:0x013d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0144  */
    /* JADX WARN: Code duplicated, block: B:59:0x0150  */
    /* JADX WARN: Code duplicated, block: B:61:0x0154  */
    /* JADX WARN: Code duplicated, block: B:66:0x016f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0185 A[PHI: r2 r11 r12
      0x0185: PHI (r2v20 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) = 
      (r2v15 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r2v22 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
     binds: [B:68:0x0182, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r11v24 app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest) = 
      (r11v17 app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest)
      (r11v27 app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest)
     binds: [B:68:0x0182, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r12v31 java.lang.Object) = (r12v22 java.lang.Object), (r12v1 java.lang.Object) binds: [B:68:0x0182, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x018b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b1 A[PHI: r11 r12
      0x01b1: PHI (r11v28 app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest) = 
      (r11v24 app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest)
      (r11v31 app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest)
     binds: [B:79:0x01ae, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x01b1: PHI (r12v39 java.lang.Object) = (r12v34 java.lang.Object), (r12v1 java.lang.Object) binds: [B:79:0x01ae, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d3  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f8, code lost:
    
        if (r12 == r1) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e0, code lost:
    
        if (r12 == r1) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.GetWalletStatusWithReclaimTimeUseCase.a(app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        GetWalletStatusWithReclaimTimeUseCase$resolveCachedWallet$1 getWalletStatusWithReclaimTimeUseCase$resolveCachedWallet$1;
        if (continuationImpl instanceof GetWalletStatusWithReclaimTimeUseCase$resolveCachedWallet$1) {
            getWalletStatusWithReclaimTimeUseCase$resolveCachedWallet$1 = (GetWalletStatusWithReclaimTimeUseCase$resolveCachedWallet$1) continuationImpl;
            int i = getWalletStatusWithReclaimTimeUseCase$resolveCachedWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getWalletStatusWithReclaimTimeUseCase$resolveCachedWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                getWalletStatusWithReclaimTimeUseCase$resolveCachedWallet$1 = new GetWalletStatusWithReclaimTimeUseCase$resolveCachedWallet$1(this, continuationImpl);
            }
        } else {
            getWalletStatusWithReclaimTimeUseCase$resolveCachedWallet$1 = new GetWalletStatusWithReclaimTimeUseCase$resolveCachedWallet$1(this, continuationImpl);
        }
        Object objE = getWalletStatusWithReclaimTimeUseCase$resolveCachedWallet$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getWalletStatusWithReclaimTimeUseCase$resolveCachedWallet$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            getWalletStatusWithReclaimTimeUseCase$resolveCachedWallet$1.label = 1;
            objE = this.e.e(walletTypeIdentifier, getWalletStatusWithReclaimTimeUseCase$resolveCachedWallet$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objE);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objE;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            return (WalletAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = WhenMappings.f11057a[((WalletResolverError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).ordinal()];
        if (i3 == 1 || i3 == 2) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
