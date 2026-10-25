package app.chalo.walletframework.wallet.domain;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.wallet.WalletSyncRequest;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.usecase.GetChaloTimeUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.quickpay.data.repository.QuickPayRepository;
import app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.NoWalletStatusRequest;
import app.chalo.walletframework.wallet.data.model.CachedWalletStatus;
import app.chalo.walletframework.wallet.data.model.NoWalletStatus;
import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletHistorySyncResponseAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletTransactionAppModel;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.model.WalletAndAllTransactions;
import defpackage.vo1;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/WalletSyncUseCase;", "", "WalletSyncResult", "UserSnapshot", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletSyncUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletRepository f11081a;
    public final QuickPayRepository b;
    public final UserProfileDetailsProvider c;
    public final MergeCachedWalletAndFetchedWalletUseCase d;
    public final GetChaloTimeUseCase e;
    public final CheckIsWalletTimedOutUseCase f;
    public final CheckIsWalletInAppReclaimUseCase g;
    public final AnalyticsContract h;
    public final CrashlyticsLogger i;
    public final BasicInfoContract j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/WalletSyncUseCase$UserSnapshot;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserSnapshot {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11082a;

        public UserSnapshot(String str) {
            this.f11082a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserSnapshot) && Intrinsics.d(this.f11082a, ((UserSnapshot) obj).f11082a);
        }

        public final int hashCode() {
            return this.f11082a.hashCode();
        }

        public final String toString() {
            return vo1.B("UserSnapshot(userId=", this.f11082a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/WalletSyncUseCase$WalletSyncResult;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WalletSyncResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WalletHistorySyncResponseAppModel f11083a;
        public final Set b;

        public WalletSyncResult(WalletHistorySyncResponseAppModel response, Set observedLocalWalletTransactionOrderIds) {
            Intrinsics.i(response, "response");
            Intrinsics.i(observedLocalWalletTransactionOrderIds, "observedLocalWalletTransactionOrderIds");
            this.f11083a = response;
            this.b = observedLocalWalletTransactionOrderIds;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WalletSyncResult)) {
                return false;
            }
            WalletSyncResult walletSyncResult = (WalletSyncResult) obj;
            return Intrinsics.d(this.f11083a, walletSyncResult.f11083a) && Intrinsics.d(this.b, walletSyncResult.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f11083a.hashCode() * 31);
        }

        public final String toString() {
            return "WalletSyncResult(response=" + this.f11083a + ", observedLocalWalletTransactionOrderIds=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11084a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[NoWalletStatus.values().length];
            try {
                iArr[NoWalletStatus.DOES_NOT_EXIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NoWalletStatus.KYC_INITIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NoWalletStatus.WALLET_CACHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NoWalletStatus.WALLET_FETCH_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f11084a = iArr;
            int[] iArr2 = new int[WalletSyncSaveResult.values().length];
            try {
                iArr2[WalletSyncSaveResult.SAVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[WalletSyncSaveResult.USER_CHANGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[WalletSyncSaveResult.CHALO_TIME_NOT_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
            int[] iArr3 = new int[CheckIsWalletTimedOutUseCase.WalletTimedOutFailureReason.values().length];
            try {
                iArr3[CheckIsWalletTimedOutUseCase.WalletTimedOutFailureReason.CHALO_TIME_NOT_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[CheckIsWalletTimedOutUseCase.WalletTimedOutFailureReason.NO_WALLET_FOUND_IN_DB.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            c = iArr3;
        }
    }

    public WalletSyncUseCase(WalletRepository walletRepository, QuickPayRepository quickPayRepository, UserProfileDetailsProvider userProfileDetailsProvider, MergeCachedWalletAndFetchedWalletUseCase mergeCachedWalletAndFetchedWalletUseCase, GetChaloTimeUseCase getChaloTimeUseCase, CheckIsWalletTimedOutUseCase checkIsWalletTimedOutUseCase, CheckIsWalletInAppReclaimUseCase checkIsWalletInAppReclaimUseCase, AnalyticsContract analyticsContract, CrashlyticsLogger crashlyticsLogger, BasicInfoContract basicInfoContract) {
        this.f11081a = walletRepository;
        this.b = quickPayRepository;
        this.c = userProfileDetailsProvider;
        this.d = mergeCachedWalletAndFetchedWalletUseCase;
        this.e = getChaloTimeUseCase;
        this.f = checkIsWalletTimedOutUseCase;
        this.g = checkIsWalletInAppReclaimUseCase;
        this.h = analyticsContract;
        this.i = crashlyticsLogger;
        this.j = basicInfoContract;
    }

    public static NoWalletStatusRequest p(WalletSyncRequest walletSyncRequest) {
        if (Intrinsics.d(walletSyncRequest, WalletSyncRequest.SemiClosed.f2769a)) {
            return NoWalletStatusRequest.SemiClosedWallet.f10952a;
        }
        if (!(walletSyncRequest instanceof WalletSyncRequest.ClosedLoop)) {
            throw new NoWhenBranchMatchedException();
        }
        String lowerCase = ((WalletSyncRequest.ClosedLoop) walletSyncRequest).b.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        return new NoWalletStatusRequest.ClosedLoopWallet(lowerCase);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        if (r0 == r8) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel r14, app.chalo.walletframework.wallet.domain.WalletSyncUseCase.UserSnapshot r15, boolean r16, app.chalo.walletframework.wallet.domain.LocalAppReclaimState r17, app.chalo.walletframework.wallet.data.model.appmodel.WalletHistorySyncResponseAppModel r18, app.chalo.features.wallet.WalletSyncRequest r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.WalletSyncUseCase.a(app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel, app.chalo.walletframework.wallet.domain.WalletSyncUseCase$UserSnapshot, boolean, app.chalo.walletframework.wallet.domain.LocalAppReclaimState, app.chalo.walletframework.wallet.data.model.appmodel.WalletHistorySyncResponseAppModel, app.chalo.features.wallet.WalletSyncRequest, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(UserSnapshot userSnapshot, String str, boolean z, ContinuationImpl continuationImpl) {
        WalletSyncUseCase$getFinalUseCaseResult$1 walletSyncUseCase$getFinalUseCaseResult$1;
        String str2;
        Object objJ;
        UserSnapshot userSnapshot2;
        WalletAppModel walletAppModel;
        if (continuationImpl instanceof WalletSyncUseCase$getFinalUseCaseResult$1) {
            walletSyncUseCase$getFinalUseCaseResult$1 = (WalletSyncUseCase$getFinalUseCaseResult$1) continuationImpl;
            int i = walletSyncUseCase$getFinalUseCaseResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncUseCase$getFinalUseCaseResult$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSyncUseCase$getFinalUseCaseResult$1 = new WalletSyncUseCase$getFinalUseCaseResult$1(this, continuationImpl);
            }
        } else {
            walletSyncUseCase$getFinalUseCaseResult$1 = new WalletSyncUseCase$getFinalUseCaseResult$1(this, continuationImpl);
        }
        Object objK = walletSyncUseCase$getFinalUseCaseResult$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletSyncUseCase$getFinalUseCaseResult$1.label;
        WalletRepository walletRepository = this.f11081a;
        UserProfileDetailsProvider userProfileDetailsProvider = this.c;
        if (i2 == 0) {
            ResultKt.b(objK);
            str2 = userSnapshot.f11082a;
            if (!Intrinsics.d(userProfileDetailsProvider.m(), userSnapshot.f11082a)) {
                return new ChaloUseCaseResult.Failure(WalletSyncFailureReason.USER_NOT_LOGGED_IN);
            }
            walletSyncUseCase$getFinalUseCaseResult$1.L$0 = userSnapshot;
            walletSyncUseCase$getFinalUseCaseResult$1.L$1 = str;
            walletSyncUseCase$getFinalUseCaseResult$1.L$2 = str2;
            walletSyncUseCase$getFinalUseCaseResult$1.Z$0 = z;
            walletSyncUseCase$getFinalUseCaseResult$1.label = 1;
            objJ = walletRepository.J(str2, str, walletSyncUseCase$getFinalUseCaseResult$1);
            if (objJ != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            z = walletSyncUseCase$getFinalUseCaseResult$1.Z$0;
            String str3 = (String) walletSyncUseCase$getFinalUseCaseResult$1.L$2;
            str = (String) walletSyncUseCase$getFinalUseCaseResult$1.L$1;
            UserSnapshot userSnapshot3 = (UserSnapshot) walletSyncUseCase$getFinalUseCaseResult$1.L$0;
            ResultKt.b(objK);
            str2 = str3;
            userSnapshot = userSnapshot3;
            objJ = objK;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            walletAppModel = (WalletAppModel) walletSyncUseCase$getFinalUseCaseResult$1.L$1;
            userSnapshot2 = (UserSnapshot) walletSyncUseCase$getFinalUseCaseResult$1.L$0;
            ResultKt.b(objK);
        }
        return !Intrinsics.d(userProfileDetailsProvider.m(), userSnapshot2.f11082a) ? new ChaloUseCaseResult.Failure(WalletSyncFailureReason.USER_NOT_LOGGED_IN) : new ChaloUseCaseResult.Success(new WalletAndAllTransactions(walletAppModel, (List) objK));
        WalletAppModel walletAppModel2 = (WalletAppModel) objJ;
        if (walletAppModel2 == null) {
            return new ChaloUseCaseResult.Failure(WalletSyncFailureReason.API_FETCH_FAILED);
        }
        if (z && walletAppModel2.getC() == CachedWalletStatus.BLOCKED_FOR_APP_RECLAIM) {
            return new ChaloUseCaseResult.Failure(WalletSyncFailureReason.BLOCKED_FOR_APP_RECLAIM);
        }
        walletSyncUseCase$getFinalUseCaseResult$1.L$0 = userSnapshot;
        walletSyncUseCase$getFinalUseCaseResult$1.L$1 = walletAppModel2;
        walletSyncUseCase$getFinalUseCaseResult$1.L$2 = null;
        walletSyncUseCase$getFinalUseCaseResult$1.label = 2;
        objK = walletRepository.K(str2, str, walletSyncUseCase$getFinalUseCaseResult$1);
        if (objK != coroutineSingletons) {
            userSnapshot2 = userSnapshot;
            walletAppModel = walletAppModel2;
            if (!Intrinsics.d(userProfileDetailsProvider.m(), userSnapshot2.f11082a)) {
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:106:0x021f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0226  */
    /* JADX WARN: Code duplicated, block: B:18:0x0061 A[PHI: r1 r13 r14 r15
      0x0061: PHI (r1v22 app.chalo.features.wallet.WalletSyncRequest) = (r1v13 app.chalo.features.wallet.WalletSyncRequest), (r1v25 app.chalo.features.wallet.WalletSyncRequest) binds: [B:60:0x014b, B:17:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0061: PHI (r13v25 boolean) = (r13v12 boolean), (r13v31 boolean) binds: [B:60:0x014b, B:17:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0061: PHI (r14v31 java.lang.Object) = (r14v25 java.lang.Object), (r14v1 java.lang.Object) binds: [B:60:0x014b, B:17:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0061: PHI (r15v14 app.chalo.walletframework.wallet.domain.WalletSyncUseCase$UserSnapshot) = 
      (r15v8 app.chalo.walletframework.wallet.domain.WalletSyncUseCase$UserSnapshot)
      (r15v16 app.chalo.walletframework.wallet.domain.WalletSyncUseCase$UserSnapshot)
     binds: [B:60:0x014b, B:17:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0079 A[PHI: r1 r13 r14 r15
      0x0079: PHI (r1v17 app.chalo.features.wallet.WalletSyncRequest) = (r1v13 app.chalo.features.wallet.WalletSyncRequest), (r1v20 app.chalo.features.wallet.WalletSyncRequest) binds: [B:75:0x0189, B:20:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r13v16 boolean) = (r13v12 boolean), (r13v22 boolean) binds: [B:75:0x0189, B:20:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r14v26 java.lang.Object) = (r14v23 java.lang.Object), (r14v1 java.lang.Object) binds: [B:75:0x0189, B:20:0x006c] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r15v11 app.chalo.walletframework.wallet.domain.WalletSyncUseCase$UserSnapshot) = 
      (r15v8 app.chalo.walletframework.wallet.domain.WalletSyncUseCase$UserSnapshot)
      (r15v13 app.chalo.walletframework.wallet.domain.WalletSyncUseCase$UserSnapshot)
     binds: [B:75:0x0189, B:20:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:46:0x010f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0124 A[PHI: r1 r13 r14 r15
      0x0124: PHI (r1v13 app.chalo.features.wallet.WalletSyncRequest) = (r1v10 app.chalo.features.wallet.WalletSyncRequest), (r1v15 app.chalo.features.wallet.WalletSyncRequest) binds: [B:48:0x0121, B:22:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r13v12 boolean) = (r13v10 boolean), (r13v15 boolean) binds: [B:48:0x0121, B:22:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r14v18 java.lang.Object) = (r14v17 java.lang.Object), (r14v1 java.lang.Object) binds: [B:48:0x0121, B:22:0x007e] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r15v8 app.chalo.walletframework.wallet.domain.WalletSyncUseCase$UserSnapshot) = 
      (r15v5 app.chalo.walletframework.wallet.domain.WalletSyncUseCase$UserSnapshot)
      (r15v10 app.chalo.walletframework.wallet.domain.WalletSyncUseCase$UserSnapshot)
     binds: [B:48:0x0121, B:22:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:54:0x0133  */
    /* JADX WARN: Code duplicated, block: B:55:0x0135 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x0154  */
    /* JADX WARN: Code duplicated, block: B:66:0x015e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0162  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:74:0x017d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x019b  */
    /* JADX WARN: Code duplicated, block: B:82:0x019f  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:97:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f4  */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0215, code lost:
    
        if (r14 == r0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016f, code lost:
    
        if (r14 == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ad, code lost:
    
        if (r14 == r0) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(app.chalo.features.wallet.WalletSyncRequest r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.WalletSyncUseCase.c(app.chalo.features.wallet.WalletSyncRequest, kotlin.coroutines.jvm.internal.ContinuationImpl, boolean):java.lang.Object");
    }

    public final void d(ChaloUseCaseResult chaloUseCaseResult) {
        String strName;
        String f11008a;
        WalletAndAllTransactions walletAndAllTransactions;
        WalletAppModel walletAppModel;
        CachedWalletStatus c;
        String strName2;
        WalletAndAllTransactions walletAndAllTransactions2;
        WalletAppModel walletAppModel2;
        WalletAndAllTransactions walletAndAllTransactions3;
        WalletAppModel walletAppModel3;
        WalletSyncFailureReason walletSyncFailureReason;
        String strF = Reflection.a(WalletSyncUseCase.class).f();
        if (strF == null) {
            strF = "WalletSyncUseCase";
        }
        String str = strF;
        boolean z = chaloUseCaseResult instanceof ChaloUseCaseResult.Success;
        Pair pair = new Pair("isSuccessful", Boolean.valueOf(z));
        ChaloUseCaseResult.Failure failure = chaloUseCaseResult instanceof ChaloUseCaseResult.Failure ? (ChaloUseCaseResult.Failure) chaloUseCaseResult : null;
        String str2 = "";
        if (failure == null || (walletSyncFailureReason = (WalletSyncFailureReason) failure.f10418a) == null || (strName = walletSyncFailureReason.name()) == null) {
            strName = "";
        }
        Pair pair2 = new Pair("error name", strName);
        ChaloUseCaseResult.Success success = z ? (ChaloUseCaseResult.Success) chaloUseCaseResult : null;
        if (success == null || (walletAndAllTransactions3 = (WalletAndAllTransactions) success.f10419a) == null || (walletAppModel3 = walletAndAllTransactions3.f11093a) == null || (f11008a = walletAppModel3.getF11008a()) == null) {
            f11008a = "";
        }
        Pair pair3 = new Pair("walletId", f11008a);
        ChaloUseCaseResult.Success success2 = z ? (ChaloUseCaseResult.Success) chaloUseCaseResult : null;
        Pair pair4 = new Pair("walletBalance", (success2 == null || (walletAndAllTransactions2 = (WalletAndAllTransactions) success2.f10419a) == null || (walletAppModel2 = walletAndAllTransactions2.f11093a) == null) ? "" : Integer.valueOf(walletAppModel2.getD()));
        ChaloUseCaseResult.Success success3 = z ? (ChaloUseCaseResult.Success) chaloUseCaseResult : null;
        if (success3 != null && (walletAndAllTransactions = (WalletAndAllTransactions) success3.f10419a) != null && (walletAppModel = walletAndAllTransactions.f11093a) != null && (c = walletAppModel.getC()) != null && (strName2 = c.name()) != null) {
            str2 = strName2;
        }
        AnalyticsContract.DefaultImpls.a(this.h, "wallet sync result", str, MapsKt.i(pair, pair2, pair3, pair4, new Pair("walletStatus", str2)), null, false, 24);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (r9 == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(app.chalo.walletframework.wallet.domain.WalletSyncUseCase.UserSnapshot r8, app.chalo.features.wallet.WalletSyncRequest r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof app.chalo.walletframework.wallet.domain.WalletSyncUseCase$resolveLocalWallet$1
            if (r0 == 0) goto L13
            r0 = r10
            app.chalo.walletframework.wallet.domain.WalletSyncUseCase$resolveLocalWallet$1 r0 = (app.chalo.walletframework.wallet.domain.WalletSyncUseCase$resolveLocalWallet$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.walletframework.wallet.domain.WalletSyncUseCase$resolveLocalWallet$1 r0 = new app.chalo.walletframework.wallet.domain.WalletSyncUseCase$resolveLocalWallet$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4e
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.L$0
            app.chalo.walletframework.wallet.domain.WalletSyncUseCase$UserSnapshot r9 = (app.chalo.walletframework.wallet.domain.WalletSyncUseCase.UserSnapshot) r9
            kotlin.ResultKt.b(r10)
            r6 = r10
            r10 = r8
            r8 = r9
            r9 = r6
            goto L86
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            java.lang.Object r8 = r0.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.L$0
            app.chalo.walletframework.wallet.domain.WalletSyncUseCase$UserSnapshot r9 = (app.chalo.walletframework.wallet.domain.WalletSyncUseCase.UserSnapshot) r9
            kotlin.ResultKt.b(r10)
            r6 = r10
            r10 = r8
            r8 = r9
            r9 = r6
            goto L6e
        L4e:
            kotlin.ResultKt.b(r10)
            java.lang.String r10 = r8.f11082a
            app.chalo.features.wallet.WalletSyncRequest$SemiClosed r2 = app.chalo.features.wallet.WalletSyncRequest.SemiClosed.f2769a
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r9, r2)
            app.chalo.walletframework.wallet.data.repository.WalletRepository r5 = r7.f11081a
            if (r2 == 0) goto L71
            app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r9 = app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier.Companion.c()
            r0.L$0 = r8
            r0.L$1 = r10
            r0.label = r4
            java.lang.Object r9 = r5.x(r10, r9, r0)
            if (r9 != r1) goto L6e
            goto L85
        L6e:
            app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel r9 = (app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel) r9
            goto L88
        L71:
            boolean r2 = r9 instanceof app.chalo.features.wallet.WalletSyncRequest.ClosedLoop
            if (r2 == 0) goto Lb6
            app.chalo.features.wallet.WalletSyncRequest$ClosedLoop r9 = (app.chalo.features.wallet.WalletSyncRequest.ClosedLoop) r9
            java.lang.String r9 = r9.f2768a
            r0.L$0 = r8
            r0.L$1 = r10
            r0.label = r3
            java.lang.Object r9 = r5.J(r10, r9, r0)
            if (r9 != r1) goto L86
        L85:
            return r1
        L86:
            app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel r9 = (app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel) r9
        L88:
            app.chalo.providers.UserProfileDetailsProvider r0 = r7.c
            java.lang.String r0 = r0.m()
            java.lang.String r8 = r8.f11082a
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r0, r8)
            kotlin.Unit r0 = kotlin.Unit.f17538a
            if (r8 != 0) goto L9e
            app.chalo.utils.ChaloUseCaseResult$Failure r8 = new app.chalo.utils.ChaloUseCaseResult$Failure
            r8.<init>(r0)
            return r8
        L9e:
            if (r9 == 0) goto Lb0
            java.lang.String r8 = r9.getB()
            boolean r8 = kotlin.jvm.internal.Intrinsics.d(r8, r10)
            if (r8 != 0) goto Lb0
            app.chalo.utils.ChaloUseCaseResult$Failure r8 = new app.chalo.utils.ChaloUseCaseResult$Failure
            r8.<init>(r0)
            return r8
        Lb0:
            app.chalo.utils.ChaloUseCaseResult$Success r8 = new app.chalo.utils.ChaloUseCaseResult$Success
            r8.<init>(r9)
            return r8
        Lb6:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.WalletSyncUseCase.e(app.chalo.walletframework.wallet.domain.WalletSyncUseCase$UserSnapshot, app.chalo.features.wallet.WalletSyncRequest, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object f(UserSnapshot userSnapshot, WalletHistorySyncResponseAppModel walletHistorySyncResponseAppModel, LocalAppReclaimState localAppReclaimState, WalletSyncRequest walletSyncRequest, ContinuationImpl continuationImpl) {
        WalletSyncUseCase$saveWalletIdReplacementAndGetResult$1 walletSyncUseCase$saveWalletIdReplacementAndGetResult$1;
        UserSnapshot userSnapshot2;
        LocalAppReclaimState localAppReclaimState2;
        WalletHistorySyncResponseAppModel walletHistorySyncResponseAppModel2;
        if (continuationImpl instanceof WalletSyncUseCase$saveWalletIdReplacementAndGetResult$1) {
            walletSyncUseCase$saveWalletIdReplacementAndGetResult$1 = (WalletSyncUseCase$saveWalletIdReplacementAndGetResult$1) continuationImpl;
            int i = walletSyncUseCase$saveWalletIdReplacementAndGetResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncUseCase$saveWalletIdReplacementAndGetResult$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSyncUseCase$saveWalletIdReplacementAndGetResult$1 = new WalletSyncUseCase$saveWalletIdReplacementAndGetResult$1(this, continuationImpl);
            }
        } else {
            walletSyncUseCase$saveWalletIdReplacementAndGetResult$1 = new WalletSyncUseCase$saveWalletIdReplacementAndGetResult$1(this, continuationImpl);
        }
        WalletSyncUseCase$saveWalletIdReplacementAndGetResult$1 walletSyncUseCase$saveWalletIdReplacementAndGetResult$2 = walletSyncUseCase$saveWalletIdReplacementAndGetResult$1;
        Object obj = walletSyncUseCase$saveWalletIdReplacementAndGetResult$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletSyncUseCase$saveWalletIdReplacementAndGetResult$2.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            WalletSaveMode walletSaveMode = WalletSaveMode.REPLACEMENT_SNAPSHOT;
            walletSyncUseCase$saveWalletIdReplacementAndGetResult$2.L$0 = userSnapshot;
            walletSyncUseCase$saveWalletIdReplacementAndGetResult$2.L$1 = walletHistorySyncResponseAppModel;
            walletSyncUseCase$saveWalletIdReplacementAndGetResult$2.L$2 = localAppReclaimState;
            walletSyncUseCase$saveWalletIdReplacementAndGetResult$2.label = 1;
            Object objG = g(userSnapshot, walletHistorySyncResponseAppModel, walletSaveMode, true, localAppReclaimState, walletSyncRequest, walletSyncUseCase$saveWalletIdReplacementAndGetResult$2);
            if (objG != obj2) {
                userSnapshot2 = userSnapshot;
                localAppReclaimState2 = localAppReclaimState;
                obj = objG;
                walletHistorySyncResponseAppModel2 = walletHistorySyncResponseAppModel;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        localAppReclaimState2 = (LocalAppReclaimState) walletSyncUseCase$saveWalletIdReplacementAndGetResult$2.L$2;
        walletHistorySyncResponseAppModel2 = (WalletHistorySyncResponseAppModel) walletSyncUseCase$saveWalletIdReplacementAndGetResult$2.L$1;
        userSnapshot2 = (UserSnapshot) walletSyncUseCase$saveWalletIdReplacementAndGetResult$2.L$0;
        ResultKt.b(obj);
        int i3 = WhenMappings.b[((WalletSyncSaveResult) obj).ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                return new ChaloUseCaseResult.Failure(WalletSyncFailureReason.USER_NOT_LOGGED_IN);
            }
            if (i3 == 3) {
                return new ChaloUseCaseResult.Failure(WalletSyncFailureReason.CHALO_TIME_NOT_AVAILABLE);
            }
            throw new NoWhenBranchMatchedException();
        }
        String str = walletHistorySyncResponseAppModel2.f11009a.f11014a;
        boolean zIsActive = localAppReclaimState2.isActive();
        walletSyncUseCase$saveWalletIdReplacementAndGetResult$2.L$0 = null;
        walletSyncUseCase$saveWalletIdReplacementAndGetResult$2.L$1 = null;
        walletSyncUseCase$saveWalletIdReplacementAndGetResult$2.L$2 = null;
        walletSyncUseCase$saveWalletIdReplacementAndGetResult$2.label = 2;
        Object objB = b(userSnapshot2, str, zIsActive, walletSyncUseCase$saveWalletIdReplacementAndGetResult$2);
        return objB == obj2 ? obj2 : objB;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object g(UserSnapshot userSnapshot, WalletHistorySyncResponseAppModel walletHistorySyncResponseAppModel, WalletSaveMode walletSaveMode, boolean z, LocalAppReclaimState localAppReclaimState, WalletSyncRequest walletSyncRequest, ContinuationImpl continuationImpl) {
        WalletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$1 walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$1;
        WalletSaveMode walletSaveMode2;
        WalletHistorySyncResponseAppModel walletHistorySyncResponseAppModel2;
        Object obj;
        WalletSyncRequest walletSyncRequest2;
        LocalAppReclaimState localAppReclaimState2;
        boolean z2;
        UserSnapshot userSnapshot2;
        if (continuationImpl instanceof WalletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$1) {
            walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$1 = (WalletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$1) continuationImpl;
            int i = walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$1 = new WalletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$1(this, continuationImpl);
            }
        } else {
            walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$1 = new WalletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$1(this, continuationImpl);
        }
        WalletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$1 walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2 = walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$1;
        Object obj2 = walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.result;
        Enum r1 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.L$0 = userSnapshot;
            walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.L$1 = walletHistorySyncResponseAppModel;
            walletSaveMode2 = walletSaveMode;
            walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.L$2 = walletSaveMode2;
            walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.L$3 = localAppReclaimState;
            walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.L$4 = walletSyncRequest;
            walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.Z$0 = z;
            walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.label = 1;
            Object objA = this.e.a(walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2);
            if (objA != r1) {
                walletHistorySyncResponseAppModel2 = walletHistorySyncResponseAppModel;
                obj = objA;
                walletSyncRequest2 = walletSyncRequest;
                localAppReclaimState2 = localAppReclaimState;
                z2 = z;
                userSnapshot2 = userSnapshot;
            }
            return r1;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.b(obj2);
                return obj2;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj2);
            return obj2;
        }
        boolean z3 = walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.Z$0;
        walletSyncRequest2 = (WalletSyncRequest) walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.L$4;
        LocalAppReclaimState localAppReclaimState3 = (LocalAppReclaimState) walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.L$3;
        WalletSaveMode walletSaveMode3 = (WalletSaveMode) walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.L$2;
        walletHistorySyncResponseAppModel2 = (WalletHistorySyncResponseAppModel) walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.L$1;
        userSnapshot2 = (UserSnapshot) walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.L$0;
        ResultKt.b(obj2);
        obj = obj2;
        localAppReclaimState2 = localAppReclaimState3;
        walletSaveMode2 = walletSaveMode3;
        z2 = z3;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            return WalletSyncSaveResult.CHALO_TIME_NOT_AVAILABLE;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!Intrinsics.d(this.c.m(), userSnapshot2.f11082a)) {
            return WalletSyncSaveResult.USER_CHANGED;
        }
        if (walletSaveMode2 != WalletSaveMode.MERGE_WITH_CACHED) {
            long jLongValue = ((Number) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).longValue();
            walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.L$0 = null;
            walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.L$1 = null;
            walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.L$2 = null;
            walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.L$3 = null;
            walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.L$4 = null;
            walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.label = 2;
            Enum enumI = i(userSnapshot2, walletHistorySyncResponseAppModel2, jLongValue, z2, localAppReclaimState2, walletSyncRequest2, walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2);
            if (enumI != r1) {
                return enumI;
            }
        } else {
            WalletHistorySyncResponseAppModel walletHistorySyncResponseAppModel3 = walletHistorySyncResponseAppModel2;
            WalletSyncRequest walletSyncRequest3 = walletSyncRequest2;
            long jLongValue2 = ((Number) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).longValue();
            walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.L$0 = null;
            walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.L$1 = null;
            walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.L$2 = null;
            walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.L$3 = null;
            walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.L$4 = null;
            walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2.label = 3;
            Enum enumH = h(userSnapshot2, walletHistorySyncResponseAppModel3, jLongValue2, z2, walletSyncRequest3, walletSyncUseCase$saveWalletResponseToRoomAndUpdateWalletPrefsStore$2);
            if (enumH != r1) {
                return enumH;
            }
        }
        return r1;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b A[PHI: r1 r3 r4 r16
      0x005b: PHI (r1v21 long) = (r1v20 long), (r1v27 long) binds: [B:80:0x02b1, B:19:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x005b: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v8 java.lang.String) binds: [B:80:0x02b1, B:19:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x005b: PHI (r4v13 java.lang.String) = (r4v12 java.lang.String), (r4v21 java.lang.String) binds: [B:80:0x02b1, B:19:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x005b: PHI (r16v3 app.chalo.walletframework.wallet.data.repository.WalletRepository) = 
      (r16v2 app.chalo.walletframework.wallet.data.repository.WalletRepository)
      (r16v5 app.chalo.walletframework.wallet.data.repository.WalletRepository)
     binds: [B:80:0x02b1, B:19:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0263 A[PHI: r1
      0x0263: PHI (r1v10 app.chalo.walletframework.wallet.data.repository.WalletRepository) = 
      (r1v8 app.chalo.walletframework.wallet.data.repository.WalletRepository)
      (r1v11 app.chalo.walletframework.wallet.data.repository.WalletRepository)
     binds: [B:66:0x0260, B:63:0x0255] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x0276  */
    /* JADX WARN: Code duplicated, block: B:76:0x0279  */
    /* JADX WARN: Code duplicated, block: B:79:0x0294 A[PHI: r1 r2 r4 r8
      0x0294: PHI (r1v19 app.chalo.walletframework.wallet.data.repository.WalletRepository) = 
      (r1v18 app.chalo.walletframework.wallet.data.repository.WalletRepository)
      (r1v26 app.chalo.walletframework.wallet.data.repository.WalletRepository)
     binds: [B:77:0x0291, B:21:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r2v4 long) = (r2v3 long), (r2v7 long) binds: [B:77:0x0291, B:21:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r4v12 java.lang.String) = (r4v11 java.lang.String), (r4v19 java.lang.String) binds: [B:77:0x0291, B:21:0x005e] A[DONT_GENERATE, DONT_INLINE]
      0x0294: PHI (r8v10 java.lang.String) = (r8v9 java.lang.String), (r8v16 java.lang.String) binds: [B:77:0x0291, B:21:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02c9, code lost:
    
        if (r16.j(r3, r4, r1, r6) == r7) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum h(app.chalo.walletframework.wallet.domain.WalletSyncUseCase.UserSnapshot r29, app.chalo.walletframework.wallet.data.model.appmodel.WalletHistorySyncResponseAppModel r30, long r31, boolean r33, app.chalo.features.wallet.WalletSyncRequest r34, kotlin.coroutines.jvm.internal.ContinuationImpl r35) {
        /*
            Method dump skipped, instruction units count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.WalletSyncUseCase.h(app.chalo.walletframework.wallet.domain.WalletSyncUseCase$UserSnapshot, app.chalo.walletframework.wallet.data.model.appmodel.WalletHistorySyncResponseAppModel, long, boolean, app.chalo.features.wallet.WalletSyncRequest, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Enum");
    }

    /* JADX WARN: Code duplicated, block: B:81:0x024f A[PHI: r0 r5 r15
      0x024f: PHI (r0v14 java.lang.Object) = (r0v12 java.lang.Object), (r0v15 java.lang.Object) binds: [B:79:0x024c, B:76:0x023d] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r5v8 app.chalo.walletframework.wallet.data.repository.WalletRepository) = 
      (r5v6 app.chalo.walletframework.wallet.data.repository.WalletRepository)
      (r5v9 app.chalo.walletframework.wallet.data.repository.WalletRepository)
     binds: [B:79:0x024c, B:76:0x023d] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r15v4 java.lang.String) = (r15v2 java.lang.String), (r15v5 java.lang.String) binds: [B:79:0x024c, B:76:0x023d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:96:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b0  */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02cb, code lost:
    
        if (r26.j(r5, r7, r1, r11) == r4) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum i(app.chalo.walletframework.wallet.domain.WalletSyncUseCase.UserSnapshot r29, app.chalo.walletframework.wallet.data.model.appmodel.WalletHistorySyncResponseAppModel r30, long r31, boolean r33, app.chalo.walletframework.wallet.domain.LocalAppReclaimState r34, app.chalo.features.wallet.WalletSyncRequest r35, kotlin.coroutines.jvm.internal.ContinuationImpl r36) {
        /*
            Method dump skipped, instruction units count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.WalletSyncUseCase.i(app.chalo.walletframework.wallet.domain.WalletSyncUseCase$UserSnapshot, app.chalo.walletframework.wallet.data.model.appmodel.WalletHistorySyncResponseAppModel, long, boolean, app.chalo.walletframework.wallet.domain.LocalAppReclaimState, app.chalo.features.wallet.WalletSyncRequest, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Enum");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e8 A[LOOP:1: B:34:0x00e2->B:36:0x00e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:42:0x0109  */
    /* JADX WARN: Code duplicated, block: B:44:0x0116  */
    /* JADX WARN: Code duplicated, block: B:48:0x012b A[LOOP:3: B:47:0x0129->B:48:0x012b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x014e  */
    /* JADX WARN: Code duplicated, block: B:54:0x015d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0180, code lost:
    
        if (r3 == r5) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r18, java.lang.String r19, boolean r20, app.chalo.features.wallet.WalletSyncRequest r21, boolean r22, kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.WalletSyncUseCase.j(java.lang.String, java.lang.String, boolean, app.chalo.features.wallet.WalletSyncRequest, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, String str2, boolean z, Set set, ContinuationImpl continuationImpl) {
        WalletSyncUseCase$shouldDeferFullSyncApplyForNewLocalWalletTransaction$1 walletSyncUseCase$shouldDeferFullSyncApplyForNewLocalWalletTransaction$1;
        if (continuationImpl instanceof WalletSyncUseCase$shouldDeferFullSyncApplyForNewLocalWalletTransaction$1) {
            walletSyncUseCase$shouldDeferFullSyncApplyForNewLocalWalletTransaction$1 = (WalletSyncUseCase$shouldDeferFullSyncApplyForNewLocalWalletTransaction$1) continuationImpl;
            int i = walletSyncUseCase$shouldDeferFullSyncApplyForNewLocalWalletTransaction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncUseCase$shouldDeferFullSyncApplyForNewLocalWalletTransaction$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSyncUseCase$shouldDeferFullSyncApplyForNewLocalWalletTransaction$1 = new WalletSyncUseCase$shouldDeferFullSyncApplyForNewLocalWalletTransaction$1(this, continuationImpl);
            }
        } else {
            walletSyncUseCase$shouldDeferFullSyncApplyForNewLocalWalletTransaction$1 = new WalletSyncUseCase$shouldDeferFullSyncApplyForNewLocalWalletTransaction$1(this, continuationImpl);
        }
        Object objA = walletSyncUseCase$shouldDeferFullSyncApplyForNewLocalWalletTransaction$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletSyncUseCase$shouldDeferFullSyncApplyForNewLocalWalletTransaction$1.label;
        boolean z2 = true;
        if (i2 == 0) {
            ResultKt.b(objA);
            if (!z) {
                return Boolean.FALSE;
            }
            walletSyncUseCase$shouldDeferFullSyncApplyForNewLocalWalletTransaction$1.L$0 = set;
            walletSyncUseCase$shouldDeferFullSyncApplyForNewLocalWalletTransaction$1.label = 1;
            objA = this.f11081a.A(str, str2, walletSyncUseCase$shouldDeferFullSyncApplyForNewLocalWalletTransaction$1);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = (Set) walletSyncUseCase$shouldDeferFullSyncApplyForNewLocalWalletTransaction$1.L$0;
            ResultKt.b(objA);
        }
        Iterable<WalletTransactionAppModel> iterable = (Iterable) objA;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            z2 = false;
        } else {
            for (WalletTransactionAppModel walletTransactionAppModel : iterable) {
                WalletTransactionType walletTransactionType = walletTransactionAppModel.b;
                if (walletTransactionType == WalletTransactionType.QUICK_PAY || walletTransactionType == WalletTransactionType.CHALO_PAY) {
                    if (!set.contains(walletTransactionAppModel.e)) {
                    }
                }
            }
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0119  */
    /* JADX WARN: Code duplicated, block: B:42:0x0139  */
    /* JADX WARN: Code duplicated, block: B:45:0x0146  */
    /* JADX WARN: Code duplicated, block: B:47:0x014e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0153  */
    /* JADX WARN: Code duplicated, block: B:53:0x017a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object l(WalletAppModel walletAppModel, UserSnapshot userSnapshot, boolean z, LocalAppReclaimState localAppReclaimState, WalletSyncRequest walletSyncRequest, ContinuationImpl continuationImpl) {
        WalletSyncUseCase$syncCachedWalletWithOneOptionalRetry$1 walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$1;
        WalletSyncUseCase walletSyncUseCase;
        String str;
        WalletAppModel walletAppModel2;
        LocalAppReclaimState localAppReclaimState2;
        WalletSyncRequest walletSyncRequest2;
        Object obj;
        boolean z2;
        WalletSyncResult walletSyncResult;
        boolean z3;
        WalletSyncRequest walletSyncRequest3;
        LocalAppReclaimState localAppReclaimState3;
        UserSnapshot userSnapshot2;
        UserSnapshot userSnapshot3;
        boolean z4;
        WalletSyncRequest walletSyncRequest4;
        String str2;
        WalletSyncResult walletSyncResult2;
        UserSnapshot userSnapshot4;
        WalletAppModel walletAppModel3;
        LocalAppReclaimState localAppReclaimState4;
        Object objA;
        UserSnapshot userSnapshot5 = userSnapshot;
        if (continuationImpl instanceof WalletSyncUseCase$syncCachedWalletWithOneOptionalRetry$1) {
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$1 = (WalletSyncUseCase$syncCachedWalletWithOneOptionalRetry$1) continuationImpl;
            int i = walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$1.label = i - Integer.MIN_VALUE;
                walletSyncUseCase = this;
            } else {
                walletSyncUseCase = this;
                walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$1 = new WalletSyncUseCase$syncCachedWalletWithOneOptionalRetry$1(walletSyncUseCase, continuationImpl);
            }
        } else {
            walletSyncUseCase = this;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$1 = new WalletSyncUseCase$syncCachedWalletWithOneOptionalRetry$1(walletSyncUseCase, continuationImpl);
        }
        WalletSyncUseCase$syncCachedWalletWithOneOptionalRetry$1 walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2 = walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$1;
        Object objK = walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.label;
        if (i2 == 0) {
            ResultKt.b(objK);
            str = userSnapshot5.f11082a;
            String f11008a = walletAppModel.getF11008a();
            walletAppModel2 = walletAppModel;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$0 = walletAppModel2;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$1 = userSnapshot5;
            localAppReclaimState2 = localAppReclaimState;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$2 = localAppReclaimState2;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$3 = walletSyncRequest;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$4 = str;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.Z$0 = z;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.label = 1;
            Object objJ = walletSyncUseCase.j(str, f11008a, z, walletSyncRequest, true, walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2);
            if (objJ != coroutineSingletons) {
                walletSyncRequest2 = walletSyncRequest;
                obj = objJ;
                z2 = z;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            boolean z5 = walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.Z$0;
            str = (String) walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$4;
            walletSyncRequest2 = (WalletSyncRequest) walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$3;
            LocalAppReclaimState localAppReclaimState5 = (LocalAppReclaimState) walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$2;
            UserSnapshot userSnapshot6 = (UserSnapshot) walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$1;
            WalletAppModel walletAppModel4 = (WalletAppModel) walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$0;
            ResultKt.b(objK);
            obj = objK;
            localAppReclaimState2 = localAppReclaimState5;
            walletAppModel2 = walletAppModel4;
            z2 = z5;
            userSnapshot5 = userSnapshot6;
        } else {
            if (i2 == 2) {
                z4 = walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.Z$0;
                walletSyncResult2 = (WalletSyncResult) walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$5;
                str2 = (String) walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$4;
                WalletSyncRequest walletSyncRequest5 = (WalletSyncRequest) walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$3;
                LocalAppReclaimState localAppReclaimState6 = (LocalAppReclaimState) walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$2;
                UserSnapshot userSnapshot7 = (UserSnapshot) walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$1;
                WalletAppModel walletAppModel5 = (WalletAppModel) walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$0;
                ResultKt.b(objK);
                localAppReclaimState2 = localAppReclaimState6;
                walletAppModel2 = walletAppModel5;
                walletSyncRequest4 = walletSyncRequest5;
                userSnapshot3 = userSnapshot7;
                if (((Boolean) objK).booleanValue()) {
                    String str3 = str2;
                    String f11008a2 = walletAppModel2.getF11008a();
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$0 = walletAppModel2;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$1 = userSnapshot3;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$2 = localAppReclaimState2;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$3 = walletSyncRequest4;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$4 = null;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$5 = null;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.Z$0 = z4;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.label = 3;
                    objK = j(str3, f11008a2, true, walletSyncRequest4, true, walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2);
                    if (objK != coroutineSingletons) {
                        walletSyncRequest3 = walletSyncRequest4;
                        userSnapshot4 = userSnapshot3;
                        walletAppModel3 = walletAppModel2;
                        localAppReclaimState4 = localAppReclaimState2;
                    }
                } else {
                    walletSyncResult = walletSyncResult2;
                    z3 = z4;
                    walletSyncRequest3 = walletSyncRequest4;
                    userSnapshot2 = userSnapshot3;
                    localAppReclaimState3 = localAppReclaimState2;
                    WalletHistorySyncResponseAppModel walletHistorySyncResponseAppModel = walletSyncResult.f11083a;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$0 = null;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$1 = null;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$2 = null;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$3 = null;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$4 = null;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$5 = null;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.label = 4;
                    objA = a(walletAppModel2, userSnapshot2, z3, localAppReclaimState3, walletHistorySyncResponseAppModel, walletSyncRequest3, walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2);
                    if (objA == coroutineSingletons) {
                        return objA;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objK);
                return objK;
            }
            z4 = walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.Z$0;
            walletSyncRequest3 = (WalletSyncRequest) walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$3;
            localAppReclaimState4 = (LocalAppReclaimState) walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$2;
            userSnapshot4 = (UserSnapshot) walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$1;
            walletAppModel3 = (WalletAppModel) walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$0;
            ResultKt.b(objK);
        }
        walletSyncResult = (WalletSyncResult) objK;
        if (!walletSyncResult.f11083a.c) {
            return new ChaloUseCaseResult.Failure(WalletSyncFailureReason.API_FETCH_FAILED);
        }
        walletAppModel2 = walletAppModel3;
        localAppReclaimState3 = localAppReclaimState4;
        userSnapshot2 = userSnapshot4;
        z3 = z4;
        WalletHistorySyncResponseAppModel walletHistorySyncResponseAppModel2 = walletSyncResult.f11083a;
        walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$0 = null;
        walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$1 = null;
        walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$2 = null;
        walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$3 = null;
        walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$4 = null;
        walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$5 = null;
        walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.label = 4;
        objA = a(walletAppModel2, userSnapshot2, z3, localAppReclaimState3, walletHistorySyncResponseAppModel2, walletSyncRequest3, walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        return objA;
        walletSyncResult = (WalletSyncResult) obj;
        if (z2 && !walletSyncResult.f11083a.c) {
            return new ChaloUseCaseResult.Failure(WalletSyncFailureReason.API_FETCH_FAILED);
        }
        if (z2) {
            String f11008a3 = walletAppModel2.getF11008a();
            Set set = walletSyncResult.b;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$0 = walletAppModel2;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$1 = userSnapshot5;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$2 = localAppReclaimState2;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$3 = walletSyncRequest2;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$4 = str;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$5 = walletSyncResult;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.Z$0 = z2;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.label = 2;
            boolean z6 = z2;
            String str4 = str;
            objK = k(str4, f11008a3, z6, set, walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2);
            if (objK != coroutineSingletons) {
                userSnapshot3 = userSnapshot5;
                z4 = z6;
                walletSyncRequest4 = walletSyncRequest2;
                str2 = str4;
                walletSyncResult2 = walletSyncResult;
                if (((Boolean) objK).booleanValue()) {
                    String str5 = str2;
                    String f11008a4 = walletAppModel2.getF11008a();
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$0 = walletAppModel2;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$1 = userSnapshot3;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$2 = localAppReclaimState2;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$3 = walletSyncRequest4;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$4 = null;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$5 = null;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.Z$0 = z4;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.label = 3;
                    objK = j(str5, f11008a4, true, walletSyncRequest4, true, walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2);
                    if (objK != coroutineSingletons) {
                        walletSyncRequest3 = walletSyncRequest4;
                        userSnapshot4 = userSnapshot3;
                        walletAppModel3 = walletAppModel2;
                        localAppReclaimState4 = localAppReclaimState2;
                        walletSyncResult = (WalletSyncResult) objK;
                        if (!walletSyncResult.f11083a.c) {
                            return new ChaloUseCaseResult.Failure(WalletSyncFailureReason.API_FETCH_FAILED);
                        }
                        walletAppModel2 = walletAppModel3;
                        localAppReclaimState3 = localAppReclaimState4;
                        userSnapshot2 = userSnapshot4;
                        z3 = z4;
                        WalletHistorySyncResponseAppModel walletHistorySyncResponseAppModel3 = walletSyncResult.f11083a;
                        walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$0 = null;
                        walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$1 = null;
                        walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$2 = null;
                        walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$3 = null;
                        walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$4 = null;
                        walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$5 = null;
                        walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.label = 4;
                        objA = a(walletAppModel2, userSnapshot2, z3, localAppReclaimState3, walletHistorySyncResponseAppModel3, walletSyncRequest3, walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2);
                        if (objA == coroutineSingletons) {
                            return objA;
                        }
                    }
                } else {
                    walletSyncResult = walletSyncResult2;
                    z3 = z4;
                    walletSyncRequest3 = walletSyncRequest4;
                    userSnapshot2 = userSnapshot3;
                    localAppReclaimState3 = localAppReclaimState2;
                    WalletHistorySyncResponseAppModel walletHistorySyncResponseAppModel4 = walletSyncResult.f11083a;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$0 = null;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$1 = null;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$2 = null;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$3 = null;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$4 = null;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$5 = null;
                    walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.label = 4;
                    objA = a(walletAppModel2, userSnapshot2, z3, localAppReclaimState3, walletHistorySyncResponseAppModel4, walletSyncRequest3, walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2);
                    if (objA == coroutineSingletons) {
                        return objA;
                    }
                }
            }
        } else {
            z3 = z2;
            walletSyncRequest3 = walletSyncRequest2;
            localAppReclaimState3 = localAppReclaimState2;
            userSnapshot2 = userSnapshot5;
            WalletHistorySyncResponseAppModel walletHistorySyncResponseAppModel5 = walletSyncResult.f11083a;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$0 = null;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$1 = null;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$2 = null;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$3 = null;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$4 = null;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.L$5 = null;
            walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2.label = 4;
            objA = a(walletAppModel2, userSnapshot2, z3, localAppReclaimState3, walletHistorySyncResponseAppModel5, walletSyncRequest3, walletSyncUseCase$syncCachedWalletWithOneOptionalRetry$2);
            if (objA == coroutineSingletons) {
                return objA;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00bc: MOVE (r15 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:189), block:B:33:0x00ba */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9421. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final java.lang.Object m(app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel r22, app.chalo.walletframework.wallet.domain.WalletSyncUseCase.UserSnapshot r23, boolean r24, long r25, app.chalo.features.wallet.WalletSyncRequest r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instruction units count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.WalletSyncUseCase.m(app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel, app.chalo.walletframework.wallet.domain.WalletSyncUseCase$UserSnapshot, boolean, long, app.chalo.features.wallet.WalletSyncRequest, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00f2 A[Catch: Exception -> 0x00e5, SyncWalletException -> 0x00ea, TryCatch #10 {SyncWalletException -> 0x00ea, Exception -> 0x00e5, blocks: (B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:62:0x00f2, B:64:0x00f7, B:63:0x00f5), top: B:122:0x00d3 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00f5 A[Catch: Exception -> 0x00e5, SyncWalletException -> 0x00ea, TryCatch #10 {SyncWalletException -> 0x00ea, Exception -> 0x00e5, blocks: (B:50:0x00d3, B:52:0x00d9, B:54:0x00dd, B:62:0x00f2, B:64:0x00f7, B:63:0x00f5), top: B:122:0x00d3 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0110  */
    /* JADX WARN: Code duplicated, block: B:73:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0123 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0125 A[Catch: Exception -> 0x0058, SyncWalletException -> 0x012d, TryCatch #2 {SyncWalletException -> 0x012d, blocks: (B:86:0x0151, B:71:0x0115, B:75:0x0125, B:79:0x012f, B:80:0x0134, B:81:0x0135, B:83:0x013d), top: B:113:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x012f A[Catch: Exception -> 0x0058, SyncWalletException -> 0x012d, TryCatch #2 {SyncWalletException -> 0x012d, blocks: (B:86:0x0151, B:71:0x0115, B:75:0x0125, B:79:0x012f, B:80:0x0134, B:81:0x0135, B:83:0x013d), top: B:113:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0135 A[Catch: Exception -> 0x0058, SyncWalletException -> 0x012d, TryCatch #2 {SyncWalletException -> 0x012d, blocks: (B:86:0x0151, B:71:0x0115, B:75:0x0125, B:79:0x012f, B:80:0x0134, B:81:0x0135, B:83:0x013d), top: B:113:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x013d A[Catch: Exception -> 0x0058, SyncWalletException -> 0x012d, TryCatch #2 {SyncWalletException -> 0x012d, blocks: (B:86:0x0151, B:71:0x0115, B:75:0x0125, B:79:0x012f, B:80:0x0134, B:81:0x0135, B:83:0x013d), top: B:113:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0150  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ae, code lost:
    
        if (r1.f11081a.t(r0, r2, r7) == r9) goto L105;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(app.chalo.walletframework.wallet.domain.WalletSyncUseCase.UserSnapshot r18, boolean r19, boolean r20, app.chalo.features.wallet.WalletSyncRequest r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.WalletSyncUseCase.n(app.chalo.walletframework.wallet.domain.WalletSyncUseCase$UserSnapshot, boolean, boolean, app.chalo.features.wallet.WalletSyncRequest, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:39:0x0111  */
    /* JADX WARN: Code duplicated, block: B:42:0x011c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124  */
    /* JADX WARN: Code duplicated, block: B:45:0x0129  */
    /* JADX WARN: Code duplicated, block: B:49:0x0145 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object o(UserSnapshot userSnapshot, String str, LocalAppReclaimState localAppReclaimState, WalletSyncRequest walletSyncRequest, ContinuationImpl continuationImpl) {
        WalletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$1 walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$1;
        WalletSyncUseCase walletSyncUseCase;
        String str2;
        LocalAppReclaimState localAppReclaimState2;
        WalletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$1 walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2;
        String str3;
        Object obj;
        WalletSyncRequest walletSyncRequest2;
        UserSnapshot userSnapshot2;
        WalletSyncRequest walletSyncRequest3;
        WalletSyncResult walletSyncResult;
        UserSnapshot userSnapshot3;
        LocalAppReclaimState localAppReclaimState3;
        WalletSyncRequest walletSyncRequest4;
        UserSnapshot userSnapshot4;
        LocalAppReclaimState localAppReclaimState4;
        Object objF;
        WalletSyncResult walletSyncResult2;
        UserSnapshot userSnapshot5 = userSnapshot;
        if (continuationImpl instanceof WalletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$1) {
            walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$1 = (WalletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$1) continuationImpl;
            int i = walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$1.label = i - Integer.MIN_VALUE;
                walletSyncUseCase = this;
            } else {
                walletSyncUseCase = this;
                walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$1 = new WalletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$1(walletSyncUseCase, continuationImpl);
            }
        } else {
            walletSyncUseCase = this;
            walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$1 = new WalletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$1(walletSyncUseCase, continuationImpl);
        }
        WalletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$1 walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3 = walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$1;
        Object objJ = walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3.label;
        if (i2 == 0) {
            ResultKt.b(objJ);
            str2 = userSnapshot5.f11082a;
            walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3.L$0 = userSnapshot5;
            walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3.L$1 = str;
            localAppReclaimState2 = localAppReclaimState;
            walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3.L$2 = localAppReclaimState2;
            walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3.L$3 = walletSyncRequest;
            walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3.L$4 = str2;
            walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3.label = 1;
            walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2 = walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3;
            Object objJ2 = walletSyncUseCase.j(str2, str, true, walletSyncRequest, false, walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2);
            if (objJ2 != coroutineSingletons) {
                str3 = str;
                obj = objJ2;
                walletSyncRequest2 = walletSyncRequest;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            String str4 = (String) walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3.L$4;
            WalletSyncRequest walletSyncRequest5 = (WalletSyncRequest) walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3.L$3;
            LocalAppReclaimState localAppReclaimState5 = (LocalAppReclaimState) walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3.L$2;
            String str5 = (String) walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3.L$1;
            UserSnapshot userSnapshot6 = (UserSnapshot) walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3.L$0;
            ResultKt.b(objJ);
            obj = objJ;
            walletSyncRequest2 = walletSyncRequest5;
            localAppReclaimState2 = localAppReclaimState5;
            str3 = str5;
            walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2 = walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3;
            str2 = str4;
            userSnapshot5 = userSnapshot6;
        } else {
            if (i2 == 2) {
                walletSyncResult = (WalletSyncResult) walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3.L$5;
                str2 = (String) walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3.L$4;
                WalletSyncRequest walletSyncRequest6 = (WalletSyncRequest) walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3.L$3;
                LocalAppReclaimState localAppReclaimState6 = (LocalAppReclaimState) walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3.L$2;
                String str6 = (String) walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3.L$1;
                UserSnapshot userSnapshot7 = (UserSnapshot) walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3.L$0;
                ResultKt.b(objJ);
                walletSyncRequest3 = walletSyncRequest6;
                str3 = str6;
                localAppReclaimState2 = localAppReclaimState6;
                userSnapshot2 = userSnapshot7;
                walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2 = walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3;
                if (((Boolean) objJ).booleanValue()) {
                    walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$0 = userSnapshot2;
                    walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$1 = localAppReclaimState2;
                    walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$2 = walletSyncRequest3;
                    walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$3 = null;
                    walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$4 = null;
                    walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$5 = null;
                    walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.label = 3;
                    objJ = j(str2, str3, true, walletSyncRequest3, false, walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2);
                    if (objJ != coroutineSingletons) {
                        walletSyncRequest4 = walletSyncRequest3;
                        userSnapshot4 = userSnapshot2;
                        localAppReclaimState4 = localAppReclaimState2;
                    }
                } else {
                    userSnapshot3 = userSnapshot2;
                    localAppReclaimState3 = localAppReclaimState2;
                    WalletHistorySyncResponseAppModel walletHistorySyncResponseAppModel = walletSyncResult.f11083a;
                    walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$0 = null;
                    walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$1 = null;
                    walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$2 = null;
                    walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$3 = null;
                    walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$4 = null;
                    walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$5 = null;
                    walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.label = 4;
                    objF = f(userSnapshot3, walletHistorySyncResponseAppModel, localAppReclaimState3, walletSyncRequest3, walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2);
                    if (objF != coroutineSingletons) {
                        return objF;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objJ);
                return objJ;
            }
            walletSyncRequest4 = (WalletSyncRequest) walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3.L$2;
            localAppReclaimState4 = (LocalAppReclaimState) walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3.L$1;
            userSnapshot4 = (UserSnapshot) walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3.L$0;
            ResultKt.b(objJ);
            walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2 = walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$3;
        }
        walletSyncResult2 = (WalletSyncResult) objJ;
        if (!walletSyncResult2.f11083a.c) {
            return new ChaloUseCaseResult.Failure(WalletSyncFailureReason.API_FETCH_FAILED);
        }
        walletSyncRequest3 = walletSyncRequest4;
        walletSyncResult = walletSyncResult2;
        localAppReclaimState3 = localAppReclaimState4;
        userSnapshot3 = userSnapshot4;
        WalletHistorySyncResponseAppModel walletHistorySyncResponseAppModel2 = walletSyncResult.f11083a;
        walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$0 = null;
        walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$1 = null;
        walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$2 = null;
        walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$3 = null;
        walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$4 = null;
        walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$5 = null;
        walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.label = 4;
        objF = f(userSnapshot3, walletHistorySyncResponseAppModel2, localAppReclaimState3, walletSyncRequest3, walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2);
        if (objF != coroutineSingletons) {
            return coroutineSingletons;
        }
        return objF;
        WalletSyncResult walletSyncResult3 = (WalletSyncResult) obj;
        if (!walletSyncResult3.f11083a.c) {
            return new ChaloUseCaseResult.Failure(WalletSyncFailureReason.API_FETCH_FAILED);
        }
        Set set = walletSyncResult3.b;
        walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$0 = userSnapshot5;
        walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$1 = str3;
        walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$2 = localAppReclaimState2;
        walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$3 = walletSyncRequest2;
        walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$4 = str2;
        walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$5 = walletSyncResult3;
        walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.label = 2;
        Object objK = k(str2, str3, true, set, walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2);
        if (objK != coroutineSingletons) {
            userSnapshot2 = userSnapshot5;
            walletSyncRequest3 = walletSyncRequest2;
            objJ = objK;
            walletSyncResult = walletSyncResult3;
            if (((Boolean) objJ).booleanValue()) {
                walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$0 = userSnapshot2;
                walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$1 = localAppReclaimState2;
                walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$2 = walletSyncRequest3;
                walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$3 = null;
                walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$4 = null;
                walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$5 = null;
                walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.label = 3;
                objJ = j(str2, str3, true, walletSyncRequest3, false, walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2);
                if (objJ != coroutineSingletons) {
                    walletSyncRequest4 = walletSyncRequest3;
                    userSnapshot4 = userSnapshot2;
                    localAppReclaimState4 = localAppReclaimState2;
                    walletSyncResult2 = (WalletSyncResult) objJ;
                    if (!walletSyncResult2.f11083a.c) {
                        return new ChaloUseCaseResult.Failure(WalletSyncFailureReason.API_FETCH_FAILED);
                    }
                    walletSyncRequest3 = walletSyncRequest4;
                    walletSyncResult = walletSyncResult2;
                    localAppReclaimState3 = localAppReclaimState4;
                    userSnapshot3 = userSnapshot4;
                    WalletHistorySyncResponseAppModel walletHistorySyncResponseAppModel3 = walletSyncResult.f11083a;
                    walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$0 = null;
                    walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$1 = null;
                    walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$2 = null;
                    walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$3 = null;
                    walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$4 = null;
                    walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$5 = null;
                    walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.label = 4;
                    objF = f(userSnapshot3, walletHistorySyncResponseAppModel3, localAppReclaimState3, walletSyncRequest3, walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2);
                    if (objF != coroutineSingletons) {
                        return objF;
                    }
                }
            } else {
                userSnapshot3 = userSnapshot2;
                localAppReclaimState3 = localAppReclaimState2;
                WalletHistorySyncResponseAppModel walletHistorySyncResponseAppModel4 = walletSyncResult.f11083a;
                walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$0 = null;
                walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$1 = null;
                walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$2 = null;
                walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$3 = null;
                walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$4 = null;
                walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.L$5 = null;
                walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2.label = 4;
                objF = f(userSnapshot3, walletHistorySyncResponseAppModel4, localAppReclaimState3, walletSyncRequest3, walletSyncUseCase$syncWalletIdReplacementWithOneOptionalRetry$2);
                if (objF != coroutineSingletons) {
                    return objF;
                }
            }
        }
        return coroutineSingletons;
    }
}
