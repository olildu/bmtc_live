package app.chalo.walletframework.wallet.domain;

import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.NoWalletStatus;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/RefreshWalletStatusUseCase;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RefreshWalletStatusUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletRepository f11066a;
    public final WalletSyncOrchestrator b;
    public final UserProfileDetailsProvider c;
    public final WalletResolver d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11067a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[WalletSyncAttemptFailureReason.values().length];
            try {
                iArr[WalletSyncAttemptFailureReason.USER_NOT_LOGGED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletSyncAttemptFailureReason.KYC_NOT_DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletSyncAttemptFailureReason.BLOCKED_FOR_APP_RECLAIM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletSyncAttemptFailureReason.CHALO_TIME_NOT_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletSyncAttemptFailureReason.WALLET_TIMED_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WalletSyncAttemptFailureReason.SYNC_API_FETCH_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WalletSyncAttemptFailureReason.NO_INFORMATION_AVAILABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f11067a = iArr;
            int[] iArr2 = new int[NoWalletStatus.values().length];
            try {
                iArr2[NoWalletStatus.DOES_NOT_EXIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[NoWalletStatus.WALLET_CACHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[NoWalletStatus.KYC_INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[NoWalletStatus.WALLET_FETCH_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            b = iArr2;
        }
    }

    public RefreshWalletStatusUseCase(WalletRepository walletRepository, WalletSyncOrchestrator walletSyncOrchestrator, UserProfileDetailsProvider userProfileDetailsProvider, WalletResolver walletResolver) {
        this.f11066a = walletRepository;
        this.b = walletSyncOrchestrator;
        this.c = userProfileDetailsProvider;
        this.d = walletResolver;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    /* JADX WARN: Code duplicated, block: B:35:0x009d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad A[PHI: r11 r12
      0x00ad: PHI (r11v8 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) = 
      (r11v2 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r11v10 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
     binds: [B:36:0x00a9, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x00ad: PHI (r12v10 java.lang.Object) = (r12v7 java.lang.Object), (r12v1 java.lang.Object) binds: [B:36:0x00a9, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd A[PHI: r11
      0x00dd: PHI (r11v11 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) = 
      (r11v2 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r11v12 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r11v12 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r11v12 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
     binds: [B:34:0x009b, B:43:0x00c6, B:44:0x00c8, B:45:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec A[PHI: r11 r12
      0x00ec: PHI (r11v17 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) = 
      (r11v11 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r11v24 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
     binds: [B:52:0x00e9, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x00ec: PHI (r12v18 java.lang.Object) = (r12v14 java.lang.Object), (r12v1 java.lang.Object) binds: [B:52:0x00e9, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:62:0x0103  */
    /* JADX WARN: Code duplicated, block: B:64:0x0114  */
    /* JADX WARN: Code duplicated, block: B:66:0x011a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0126 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0127  */
    /* JADX WARN: Code duplicated, block: B:72:0x012f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0135  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        if (r12 == r1) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.RefreshWalletStatusUseCase.a(app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x0094 A[PHI: r8 r9
      0x0094: PHI (r8v7 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) = 
      (r8v1 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r8v9 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
     binds: [B:32:0x0091, B:18:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0094: PHI (r9v6 java.lang.Object) = (r9v4 java.lang.Object), (r9v1 java.lang.Object) binds: [B:32:0x0091, B:18:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5 A[PHI: r8
      0x00b5: PHI (r8v10 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) = 
      (r8v1 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r8v11 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r8v11 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r8v11 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
     binds: [B:30:0x0082, B:38:0x00a6, B:40:0x00aa, B:42:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c5 A[PHI: r8 r9
      0x00c5: PHI (r8v15 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier) = 
      (r8v10 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
      (r8v23 app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier)
     binds: [B:46:0x00c2, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x00c5: PHI (r9v14 java.lang.Object) = (r9v11 java.lang.Object), (r9v1 java.lang.Object) binds: [B:46:0x00c2, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ff A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x010e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (r9 == r1) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.RefreshWalletStatusUseCase.b(app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        RefreshWalletStatusUseCase$resolveCachedWallet$1 refreshWalletStatusUseCase$resolveCachedWallet$1;
        if (continuationImpl instanceof RefreshWalletStatusUseCase$resolveCachedWallet$1) {
            refreshWalletStatusUseCase$resolveCachedWallet$1 = (RefreshWalletStatusUseCase$resolveCachedWallet$1) continuationImpl;
            int i = refreshWalletStatusUseCase$resolveCachedWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                refreshWalletStatusUseCase$resolveCachedWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                refreshWalletStatusUseCase$resolveCachedWallet$1 = new RefreshWalletStatusUseCase$resolveCachedWallet$1(this, continuationImpl);
            }
        } else {
            refreshWalletStatusUseCase$resolveCachedWallet$1 = new RefreshWalletStatusUseCase$resolveCachedWallet$1(this, continuationImpl);
        }
        Object objE = refreshWalletStatusUseCase$resolveCachedWallet$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = refreshWalletStatusUseCase$resolveCachedWallet$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            refreshWalletStatusUseCase$resolveCachedWallet$1.label = 1;
            objE = this.d.e(walletTypeIdentifier, refreshWalletStatusUseCase$resolveCachedWallet$1);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:
    
        if (r9 == r1) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum d(app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof app.chalo.walletframework.wallet.domain.RefreshWalletStatusUseCase$resolveWalletStatusFromCacheOrNoWalletStatus$1
            if (r0 == 0) goto L13
            r0 = r9
            app.chalo.walletframework.wallet.domain.RefreshWalletStatusUseCase$resolveWalletStatusFromCacheOrNoWalletStatus$1 r0 = (app.chalo.walletframework.wallet.domain.RefreshWalletStatusUseCase$resolveWalletStatusFromCacheOrNoWalletStatus$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.walletframework.wallet.domain.RefreshWalletStatusUseCase$resolveWalletStatusFromCacheOrNoWalletStatus$1 r0 = new app.chalo.walletframework.wallet.domain.RefreshWalletStatusUseCase$resolveWalletStatusFromCacheOrNoWalletStatus$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r9)
            goto L90
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.ResultKt.b(r9)
            goto L85
        L39:
            java.lang.Object r8 = r0.L$0
            app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest r8 = (app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest) r8
            kotlin.ResultKt.b(r9)
            goto L56
        L41:
            kotlin.ResultKt.b(r9)
            app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest r9 = app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest.Companion.a(r8)
            r0.L$0 = r9
            r0.label = r5
            java.lang.Object r8 = r7.c(r8, r0)
            if (r8 != r1) goto L53
            goto L8f
        L53:
            r6 = r9
            r9 = r8
            r8 = r6
        L56:
            app.chalo.walletframework.wallet.domain.resolver.WalletResolverSimplifiedResult r9 = (app.chalo.walletframework.wallet.domain.resolver.WalletResolverSimplifiedResult) r9
            boolean r2 = r9 instanceof app.chalo.walletframework.wallet.domain.resolver.WalletResolverSimplifiedResult.UserNotLogged
            if (r2 == 0) goto L5f
            app.chalo.walletframework.wallet.data.model.WalletStatus r8 = app.chalo.walletframework.wallet.data.model.WalletStatus.USER_NOT_LOGGED_IN
            return r8
        L5f:
            boolean r2 = r9 instanceof app.chalo.walletframework.wallet.domain.resolver.WalletResolverSimplifiedResult.Wallet
            if (r2 == 0) goto L97
            app.chalo.walletframework.wallet.domain.resolver.WalletResolverSimplifiedResult$Wallet r9 = (app.chalo.walletframework.wallet.domain.resolver.WalletResolverSimplifiedResult.Wallet) r9
            app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel r9 = r9.f11103a
            if (r9 == 0) goto L77
            app.chalo.walletframework.wallet.data.model.CachedWalletStatus r9 = r9.getC()
            if (r9 == 0) goto L77
            app.chalo.walletframework.wallet.data.model.WalletStatus r9 = app.chalo.walletframework.wallet.data.model.WalletStatusKt.b(r9)
            if (r9 != 0) goto L76
            goto L77
        L76:
            return r9
        L77:
            r9 = 0
            r0.L$0 = r9
            r0.label = r4
            app.chalo.walletframework.wallet.data.repository.WalletRepository r9 = r7.f11066a
            java.lang.Object r9 = r9.q(r8, r0)
            if (r9 != r1) goto L85
            goto L8f
        L85:
            kotlinx.coroutines.flow.Flow r9 = (kotlinx.coroutines.flow.Flow) r9
            r0.label = r3
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.t(r9, r0)
            if (r9 != r1) goto L90
        L8f:
            return r1
        L90:
            app.chalo.walletframework.wallet.data.model.NoWalletStatus r9 = (app.chalo.walletframework.wallet.data.model.NoWalletStatus) r9
            app.chalo.walletframework.wallet.data.model.WalletStatus r8 = app.chalo.walletframework.wallet.data.model.WalletStatusKt.c(r9)
            return r8
        L97:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.RefreshWalletStatusUseCase.d(app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Enum");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009f, code lost:
    
        if (r10 == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof app.chalo.walletframework.wallet.domain.RefreshWalletStatusUseCase$resolveWalletStatusWithReclaimTimeFromCacheOrNoWalletStatus$1
            if (r0 == 0) goto L13
            r0 = r10
            app.chalo.walletframework.wallet.domain.RefreshWalletStatusUseCase$resolveWalletStatusWithReclaimTimeFromCacheOrNoWalletStatus$1 r0 = (app.chalo.walletframework.wallet.domain.RefreshWalletStatusUseCase$resolveWalletStatusWithReclaimTimeFromCacheOrNoWalletStatus$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.walletframework.wallet.domain.RefreshWalletStatusUseCase$resolveWalletStatusWithReclaimTimeFromCacheOrNoWalletStatus$1 r0 = new app.chalo.walletframework.wallet.domain.RefreshWalletStatusUseCase$resolveWalletStatusWithReclaimTimeFromCacheOrNoWalletStatus$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L43
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r9 = r0.L$0
            app.chalo.walletframework.wallet.domain.resolver.WalletResolverSimplifiedResult r9 = (app.chalo.walletframework.wallet.domain.resolver.WalletResolverSimplifiedResult) r9
            kotlin.ResultKt.b(r10)
            goto La2
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            java.lang.Object r9 = r0.L$0
            app.chalo.walletframework.wallet.domain.resolver.WalletResolverSimplifiedResult r9 = (app.chalo.walletframework.wallet.domain.resolver.WalletResolverSimplifiedResult) r9
            kotlin.ResultKt.b(r10)
            goto L95
        L43:
            java.lang.Object r9 = r0.L$0
            app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest r9 = (app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest) r9
            kotlin.ResultKt.b(r10)
            goto L60
        L4b:
            kotlin.ResultKt.b(r10)
            app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest r10 = app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest.Companion.a(r9)
            r0.L$0 = r10
            r0.label = r6
            java.lang.Object r9 = r8.c(r9, r0)
            if (r9 != r1) goto L5d
            goto La1
        L5d:
            r7 = r10
            r10 = r9
            r9 = r7
        L60:
            app.chalo.walletframework.wallet.domain.resolver.WalletResolverSimplifiedResult r10 = (app.chalo.walletframework.wallet.domain.resolver.WalletResolverSimplifiedResult) r10
            boolean r2 = r10 instanceof app.chalo.walletframework.wallet.domain.resolver.WalletResolverSimplifiedResult.UserNotLogged
            if (r2 == 0) goto L6e
            app.chalo.walletframework.wallet.domain.WalletStatusWithReclaimTime r9 = new app.chalo.walletframework.wallet.domain.WalletStatusWithReclaimTime
            app.chalo.walletframework.wallet.data.model.WalletStatus r10 = app.chalo.walletframework.wallet.data.model.WalletStatus.USER_NOT_LOGGED_IN
            r9.<init>(r10, r3)
            return r9
        L6e:
            boolean r2 = r10 instanceof app.chalo.walletframework.wallet.domain.resolver.WalletResolverSimplifiedResult.Wallet
            if (r2 == 0) goto Lb9
            r2 = r10
            app.chalo.walletframework.wallet.domain.resolver.WalletResolverSimplifiedResult$Wallet r2 = (app.chalo.walletframework.wallet.domain.resolver.WalletResolverSimplifiedResult.Wallet) r2
            app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel r2 = r2.f11103a
            if (r2 == 0) goto L85
            app.chalo.walletframework.wallet.data.model.CachedWalletStatus r2 = r2.getC()
            if (r2 == 0) goto L85
            app.chalo.walletframework.wallet.data.model.WalletStatus r2 = app.chalo.walletframework.wallet.data.model.WalletStatusKt.b(r2)
            if (r2 != 0) goto La9
        L85:
            r0.L$0 = r10
            r0.label = r5
            app.chalo.walletframework.wallet.data.repository.WalletRepository r2 = r8.f11066a
            java.lang.Object r9 = r2.q(r9, r0)
            if (r9 != r1) goto L92
            goto La1
        L92:
            r7 = r10
            r10 = r9
            r9 = r7
        L95:
            kotlinx.coroutines.flow.Flow r10 = (kotlinx.coroutines.flow.Flow) r10
            r0.L$0 = r9
            r0.label = r4
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt.t(r10, r0)
            if (r10 != r1) goto La2
        La1:
            return r1
        La2:
            app.chalo.walletframework.wallet.data.model.NoWalletStatus r10 = (app.chalo.walletframework.wallet.data.model.NoWalletStatus) r10
            app.chalo.walletframework.wallet.data.model.WalletStatus r2 = app.chalo.walletframework.wallet.data.model.WalletStatusKt.c(r10)
            r10 = r9
        La9:
            app.chalo.walletframework.wallet.domain.resolver.WalletResolverSimplifiedResult$Wallet r10 = (app.chalo.walletframework.wallet.domain.resolver.WalletResolverSimplifiedResult.Wallet) r10
            app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel r9 = r10.f11103a
            if (r9 == 0) goto Lb3
            java.lang.Long r3 = r9.getF()
        Lb3:
            app.chalo.walletframework.wallet.domain.WalletStatusWithReclaimTime r9 = new app.chalo.walletframework.wallet.domain.WalletStatusWithReclaimTime
            r9.<init>(r2, r3)
            return r9
        Lb9:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.RefreshWalletStatusUseCase.e(app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
