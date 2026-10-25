package app.chalo.walletframework.chalopay;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletStatus;
import app.chalo.walletframework.wallet.data.model.WalletStatusKt;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.domain.ClosedLoopWalletActivationResult;
import app.chalo.walletframework.wallet.domain.FetchWalletBalanceUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletStatusWithoutSyncUseCase;
import app.chalo.walletframework.wallet.domain.PostDeviceIdForWalletMigrationUseCase;
import app.chalo.walletframework.wallet.domain.RefreshQuickPayPrerequisitesUseCase;
import app.chalo.walletframework.wallet.domain.RegisterAndSyncClosedLoopWalletUseCase;
import app.chalo.walletframework.wallet.domain.RegisterClosedLoopWalletUseCase;
import app.chalo.walletframework.wallet.domain.SatisfiesQuickPayPrerequisitesUseCase;
import app.chalo.walletframework.wallet.domain.WalletStatusWithReclaimTime;
import app.chalo.walletframework.wallet.domain.WalletSyncAttemptFailureReason;
import app.chalo.walletframework.wallet.domain.WalletSyncOrchestrator;
import app.chalo.walletframework.wallet.domain.model.WalletAndAllTransactions;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/chalopay/ChaloPayManagerImpl;", "Lapp/chalo/walletframework/chalopay/ChaloPayManager;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloPayManagerImpl implements ChaloPayManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringProvider f10899a;
    public final SatisfiesQuickPayPrerequisitesUseCase b;
    public final RefreshQuickPayPrerequisitesUseCase c;
    public final GetWalletStatusWithoutSyncUseCase d;
    public final WalletSyncOrchestrator e;
    public final FetchWalletBalanceUseCase f;
    public final PostDeviceIdForWalletMigrationUseCase g;
    public final RegisterAndSyncClosedLoopWalletUseCase h;
    public final SharedFlowImpl i = SharedFlowKt.b(0, 0, null, 7);
    public final MutableStateFlow j = StateFlowKt.a(new ChaloPayWalletState(null, null, null, null, null, null, null, null, null));
    public long k;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10900a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

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
                iArr[WalletSyncAttemptFailureReason.WALLET_TIMED_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletSyncAttemptFailureReason.CHALO_TIME_NOT_AVAILABLE.ordinal()] = 5;
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
            f10900a = iArr;
            int[] iArr2 = new int[WalletStatus.values().length];
            try {
                iArr2[WalletStatus.USER_NOT_LOGGED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[WalletStatus.DOES_NOT_EXIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[WalletStatus.KYC_INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[WalletStatus.BLOCKED_FOR_BACKEND_RECLAIM.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[WalletStatus.FULL_KYC_NEEDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[WalletStatus.BLOCKED_USER.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[WalletStatus.BLOCKED_FOR_APP_RECLAIM.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[WalletStatus.WALLET_FETCH_PENDING.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[WalletStatus.WALLET_TIMED_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[WalletStatus.CHALO_TIME_UNAVAILABLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[WalletStatus.ACTIVE.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            b = iArr2;
            int[] iArr3 = new int[RegisterClosedLoopWalletUseCase.RegisterClosedLoopWalletFailureReason.values().length];
            try {
                iArr3[RegisterClosedLoopWalletUseCase.RegisterClosedLoopWalletFailureReason.USER_NOT_LOGGED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[RegisterClosedLoopWalletUseCase.RegisterClosedLoopWalletFailureReason.CITY_NOT_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            c = iArr3;
        }
    }

    public ChaloPayManagerImpl(StringProvider stringProvider, SatisfiesQuickPayPrerequisitesUseCase satisfiesQuickPayPrerequisitesUseCase, RefreshQuickPayPrerequisitesUseCase refreshQuickPayPrerequisitesUseCase, GetWalletStatusWithoutSyncUseCase getWalletStatusWithoutSyncUseCase, WalletSyncOrchestrator walletSyncOrchestrator, FetchWalletBalanceUseCase fetchWalletBalanceUseCase, PostDeviceIdForWalletMigrationUseCase postDeviceIdForWalletMigrationUseCase, RegisterAndSyncClosedLoopWalletUseCase registerAndSyncClosedLoopWalletUseCase) {
        this.f10899a = stringProvider;
        this.b = satisfiesQuickPayPrerequisitesUseCase;
        this.c = refreshQuickPayPrerequisitesUseCase;
        this.d = getWalletStatusWithoutSyncUseCase;
        this.e = walletSyncOrchestrator;
        this.f = fetchWalletBalanceUseCase;
        this.g = postDeviceIdForWalletMigrationUseCase;
        this.h = registerAndSyncClosedLoopWalletUseCase;
    }

    @Override // app.chalo.walletframework.chalopay.ChaloPayManager
    public final void a(long j) {
        this.k = j;
    }

    @Override // app.chalo.walletframework.chalopay.ChaloPayManager
    public final Object b(WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        Object objE = e(walletTypeIdentifier, continuationImpl, true, true);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : Unit.f17538a;
    }

    @Override // app.chalo.walletframework.chalopay.ChaloPayManager
    public final SharedFlow c() {
        return FlowKt.b(this.i);
    }

    @Override // app.chalo.walletframework.chalopay.ChaloPayManager
    public final StateFlow d() {
        return FlowKt.c(this.j);
    }

    @Override // app.chalo.walletframework.chalopay.ChaloPayManager
    public final Object e(WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl, boolean z, boolean z2) {
        Object objG = g(z, z2, true, walletTypeIdentifier, continuationImpl);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    public final Object f(ChaloPaySideEffect chaloPaySideEffect, ContinuationImpl continuationImpl) throws Throwable {
        Object objEmit = this.i.emit(chaloPaySideEffect, continuationImpl);
        return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0164 A[PHI: r7
      0x0164: PHI (r7v6 kotlin.coroutines.intrinsics.CoroutineSingletons) = 
      (r7v3 kotlin.coroutines.intrinsics.CoroutineSingletons)
      (r7v4 kotlin.coroutines.intrinsics.CoroutineSingletons)
      (r7v7 kotlin.coroutines.intrinsics.CoroutineSingletons)
      (r7v7 kotlin.coroutines.intrinsics.CoroutineSingletons)
     binds: [B:53:0x0162, B:32:0x00c7, B:48:0x014b, B:37:0x00f3] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0165 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object g(boolean z, boolean z2, boolean z3, WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        ChaloPayManagerImpl$fetchChaloPayWalletStateInternal$1 chaloPayManagerImpl$fetchChaloPayWalletStateInternal$1;
        CoroutineSingletons coroutineSingletons;
        CoroutineSingletons coroutineSingletons2;
        boolean z4;
        Object obj;
        boolean z5;
        WalletTypeIdentifier walletTypeIdentifier2;
        Pair pair;
        ChaloPayManagerImpl chaloPayManagerImpl = this;
        if (continuationImpl instanceof ChaloPayManagerImpl$fetchChaloPayWalletStateInternal$1) {
            chaloPayManagerImpl$fetchChaloPayWalletStateInternal$1 = (ChaloPayManagerImpl$fetchChaloPayWalletStateInternal$1) continuationImpl;
            int i = chaloPayManagerImpl$fetchChaloPayWalletStateInternal$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloPayManagerImpl$fetchChaloPayWalletStateInternal$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloPayManagerImpl$fetchChaloPayWalletStateInternal$1 = new ChaloPayManagerImpl$fetchChaloPayWalletStateInternal$1(chaloPayManagerImpl, continuationImpl);
            }
        } else {
            chaloPayManagerImpl$fetchChaloPayWalletStateInternal$1 = new ChaloPayManagerImpl$fetchChaloPayWalletStateInternal$1(chaloPayManagerImpl, continuationImpl);
        }
        ChaloPayManagerImpl$fetchChaloPayWalletStateInternal$1 chaloPayManagerImpl$fetchChaloPayWalletStateInternal$2 = chaloPayManagerImpl$fetchChaloPayWalletStateInternal$1;
        Object obj2 = chaloPayManagerImpl$fetchChaloPayWalletStateInternal$2.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloPayManagerImpl$fetchChaloPayWalletStateInternal$2.label;
        char c = 4;
        char c2 = 3;
        char c3 = 2;
        boolean z6 = true;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj2);
            MutableStateFlow mutableStateFlow = chaloPayManagerImpl.j;
            if (!Intrinsics.d(((ChaloPayWalletState) FlowKt.c(mutableStateFlow).getValue()).c, Boolean.TRUE)) {
                while (true) {
                    Object value = mutableStateFlow.getValue();
                    MutableStateFlow mutableStateFlow2 = mutableStateFlow;
                    ChaloPayWalletState it = (ChaloPayWalletState) value;
                    Intrinsics.i(it, "it");
                    coroutineSingletons = coroutineSingletons3;
                    if (mutableStateFlow2.c(value, ChaloPayWalletState.a(it, null, null, Boolean.TRUE, null, null, null, null, null, walletTypeIdentifier, 187))) {
                        break;
                    }
                    coroutineSingletons3 = coroutineSingletons;
                    mutableStateFlow = mutableStateFlow2;
                    c = 4;
                    c2 = 3;
                    c3 = 2;
                    z6 = true;
                }
                if (z) {
                    chaloPayManagerImpl$fetchChaloPayWalletStateInternal$2.L$0 = walletTypeIdentifier;
                    chaloPayManagerImpl$fetchChaloPayWalletStateInternal$2.Z$0 = z2;
                    chaloPayManagerImpl$fetchChaloPayWalletStateInternal$2.Z$1 = z3;
                    chaloPayManagerImpl$fetchChaloPayWalletStateInternal$2.label = 1;
                    chaloPayManagerImpl = this;
                    Object objD = chaloPayManagerImpl.e.d(walletTypeIdentifier, true, chaloPayManagerImpl$fetchChaloPayWalletStateInternal$2);
                    coroutineSingletons2 = coroutineSingletons;
                    if (objD != coroutineSingletons2) {
                        z4 = z2;
                        obj = objD;
                        z5 = z3;
                        walletTypeIdentifier2 = walletTypeIdentifier;
                    }
                } else {
                    coroutineSingletons2 = coroutineSingletons;
                    chaloPayManagerImpl$fetchChaloPayWalletStateInternal$2.label = 4;
                    if (l(walletTypeIdentifier, chaloPayManagerImpl$fetchChaloPayWalletStateInternal$2, z2, z3) == coroutineSingletons2) {
                    }
                }
                return coroutineSingletons2;
            }
            return unit;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.b(obj2);
                return unit;
            }
            if (i2 == 3) {
                ResultKt.b(obj2);
                return unit;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj2);
            return unit;
        }
        boolean z7 = chaloPayManagerImpl$fetchChaloPayWalletStateInternal$2.Z$1;
        boolean z8 = chaloPayManagerImpl$fetchChaloPayWalletStateInternal$2.Z$0;
        WalletTypeIdentifier walletTypeIdentifier3 = (WalletTypeIdentifier) chaloPayManagerImpl$fetchChaloPayWalletStateInternal$2.L$0;
        ResultKt.b(obj2);
        z5 = z7;
        obj = obj2;
        z4 = z8;
        walletTypeIdentifier2 = walletTypeIdentifier3;
        coroutineSingletons2 = coroutineSingletons3;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            WalletStatus walletStatusB = WalletStatusKt.b(((WalletAndAllTransactions) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f11093a.getC());
            chaloPayManagerImpl$fetchChaloPayWalletStateInternal$2.L$0 = null;
            chaloPayManagerImpl$fetchChaloPayWalletStateInternal$2.label = 2;
            if (chaloPayManagerImpl.k(walletStatusB, walletTypeIdentifier2, z4, z5, true, chaloPayManagerImpl$fetchChaloPayWalletStateInternal$2) == coroutineSingletons2) {
                return coroutineSingletons2;
            }
            return unit;
        }
        boolean z9 = z5;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        WalletSyncAttemptFailureReason walletSyncAttemptFailureReason = (WalletSyncAttemptFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
        switch (WhenMappings.f10900a[walletSyncAttemptFailureReason.ordinal()]) {
            case 1:
            case 2:
            case 3:
                pair = new Pair(WalletStatusKt.d(walletSyncAttemptFailureReason), Boolean.TRUE);
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                pair = new Pair(WalletStatus.WALLET_FETCH_PENDING, Boolean.FALSE);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        WalletStatus walletStatus = (WalletStatus) pair.getFirst();
        boolean zBooleanValue = ((Boolean) pair.getSecond()).booleanValue();
        chaloPayManagerImpl$fetchChaloPayWalletStateInternal$2.L$0 = null;
        chaloPayManagerImpl$fetchChaloPayWalletStateInternal$2.label = 3;
        if (k(walletStatus, walletTypeIdentifier2, z4, z9, zBooleanValue, chaloPayManagerImpl$fetchChaloPayWalletStateInternal$2) == coroutineSingletons2) {
            return coroutineSingletons2;
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum h(WalletTypeIdentifier walletTypeIdentifier, long j, long j2, ContinuationImpl continuationImpl) {
        ChaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1 chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1;
        WalletTypeIdentifier walletTypeIdentifier2;
        long j3;
        long j4;
        long j5;
        long j6;
        if (continuationImpl instanceof ChaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1) {
            chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1 = (ChaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1) continuationImpl;
            int i = chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1 = new ChaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1(this, continuationImpl);
            }
        } else {
            chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1 = new ChaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1(this, continuationImpl);
        }
        Object objA = chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.label;
        SatisfiesQuickPayPrerequisitesUseCase satisfiesQuickPayPrerequisitesUseCase = this.b;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.L$0 = walletTypeIdentifier;
            chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.J$0 = j;
            chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.J$1 = j2;
            chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.label = 1;
            objA = satisfiesQuickPayPrerequisitesUseCase.a(walletTypeIdentifier, chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            j2 = chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.J$1;
            j = chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.J$0;
            walletTypeIdentifier = (WalletTypeIdentifier) chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.L$0;
            ResultKt.b(objA);
        } else {
            if (i2 == 2) {
                j4 = chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.J$1;
                j3 = chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.J$0;
                walletTypeIdentifier2 = (WalletTypeIdentifier) chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.L$0;
                ResultKt.b(objA);
                long j7 = j4;
                walletTypeIdentifier = walletTypeIdentifier2;
                j = j3;
                j2 = j7;
                chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.L$0 = null;
                chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.J$0 = j;
                chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.J$1 = j2;
                chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.label = 3;
                objA = satisfiesQuickPayPrerequisitesUseCase.a(walletTypeIdentifier, chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1);
                if (objA != coroutineSingletons) {
                    j5 = j;
                    j6 = j2;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j6 = chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.J$1;
            j5 = chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.J$0;
            ResultKt.b(objA);
        }
        if (((Boolean) objA).booleanValue()) {
            return j5 >= j6 ? WalletStatusForUI.ACTIVE : WalletStatusForUI.INSUFFICIENT_BALANCE;
        }
        return WalletStatusForUI.INTERNET_ERROR;
        if (((Boolean) objA).booleanValue()) {
            chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.L$0 = null;
            chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.J$0 = j;
            chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.J$1 = j2;
            chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.label = 3;
            objA = satisfiesQuickPayPrerequisitesUseCase.a(walletTypeIdentifier, chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1);
            if (objA != coroutineSingletons) {
                j5 = j;
                j6 = j2;
                if (((Boolean) objA).booleanValue()) {
                    if (j5 >= j6) {
                    }
                }
                return WalletStatusForUI.INTERNET_ERROR;
            }
        } else {
            chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.L$0 = walletTypeIdentifier;
            chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.J$0 = j;
            chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.J$1 = j2;
            chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.label = 2;
            if (this.c.a(walletTypeIdentifier, chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1) != coroutineSingletons) {
                walletTypeIdentifier2 = walletTypeIdentifier;
                j3 = j;
                j4 = j2;
                long j8 = j4;
                walletTypeIdentifier = walletTypeIdentifier2;
                j = j3;
                j2 = j8;
                chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.L$0 = null;
                chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.J$0 = j;
                chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.J$1 = j2;
                chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1.label = 3;
                objA = satisfiesQuickPayPrerequisitesUseCase.a(walletTypeIdentifier, chaloPayManagerImpl$getWalletStatusForQuickPayPrerequisitesAndBalance$1);
                if (objA != coroutineSingletons) {
                    j5 = j;
                    j6 = j2;
                    if (((Boolean) objA).booleanValue()) {
                        if (j5 >= j6) {
                        }
                    }
                    return WalletStatusForUI.INTERNET_ERROR;
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x011b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x011c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object i(WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        ChaloPayManagerImpl$handleClosedLoopWalletRegistration$1 chaloPayManagerImpl$handleClosedLoopWalletRegistration$1;
        MutableStateFlow mutableStateFlow;
        Object value;
        ChaloPayWalletState it;
        ChaloPaySideEffect handleErrorInformation;
        ChaloPayManagerImpl chaloPayManagerImpl;
        WalletTypeIdentifier walletTypeIdentifier2 = walletTypeIdentifier;
        if (continuationImpl instanceof ChaloPayManagerImpl$handleClosedLoopWalletRegistration$1) {
            chaloPayManagerImpl$handleClosedLoopWalletRegistration$1 = (ChaloPayManagerImpl$handleClosedLoopWalletRegistration$1) continuationImpl;
            int i = chaloPayManagerImpl$handleClosedLoopWalletRegistration$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloPayManagerImpl$handleClosedLoopWalletRegistration$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloPayManagerImpl$handleClosedLoopWalletRegistration$1 = new ChaloPayManagerImpl$handleClosedLoopWalletRegistration$1(this, continuationImpl);
            }
        } else {
            chaloPayManagerImpl$handleClosedLoopWalletRegistration$1 = new ChaloPayManagerImpl$handleClosedLoopWalletRegistration$1(this, continuationImpl);
        }
        ChaloPayManagerImpl$handleClosedLoopWalletRegistration$1 chaloPayManagerImpl$handleClosedLoopWalletRegistration$2 = chaloPayManagerImpl$handleClosedLoopWalletRegistration$1;
        Object objA = chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.L$0 = walletTypeIdentifier2;
            chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.label = 1;
            objA = this.h.a(walletTypeIdentifier2, chaloPayManagerImpl$handleClosedLoopWalletRegistration$2);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.b(objA);
                return unit;
            }
            if (i2 == 3) {
                chaloPayManagerImpl = (ChaloPayManagerImpl) chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.L$0;
                ResultKt.b(objA);
                handleErrorInformation = new ChaloPaySideEffect.HandleErrorInformation((String) objA);
                chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.L$0 = null;
                chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.label = 5;
                if (chaloPayManagerImpl.f(handleErrorInformation, chaloPayManagerImpl$handleClosedLoopWalletRegistration$2) != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA);
                return unit;
            }
            chaloPayManagerImpl = (ChaloPayManagerImpl) chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.L$0;
            ResultKt.b(objA);
            handleErrorInformation = new ChaloPaySideEffect.HandleErrorInformation((String) objA);
            chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.L$0 = null;
            chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.label = 5;
            if (chaloPayManagerImpl.f(handleErrorInformation, chaloPayManagerImpl$handleClosedLoopWalletRegistration$2) != coroutineSingletons) {
                return coroutineSingletons;
            }
            return unit;
        }
        walletTypeIdentifier2 = (WalletTypeIdentifier) chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.L$0;
        ResultKt.b(objA);
        Object obj = objA;
        WalletTypeIdentifier walletTypeIdentifier3 = walletTypeIdentifier2;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            ClosedLoopWalletActivationResult closedLoopWalletActivationResult = (ClosedLoopWalletActivationResult) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            WalletStatus walletStatus = closedLoopWalletActivationResult.f11038a.f11077a;
            boolean z = closedLoopWalletActivationResult.b;
            chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.L$0 = null;
            chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.label = 2;
            if (k(walletStatus, walletTypeIdentifier3, true, false, z, chaloPayManagerImpl$handleClosedLoopWalletRegistration$2) != coroutineSingletons) {
                return unit;
            }
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            do {
                mutableStateFlow = this.j;
                value = mutableStateFlow.getValue();
                it = (ChaloPayWalletState) value;
                Intrinsics.i(it, "it");
            } while (!mutableStateFlow.c(value, ChaloPayWalletState.a(it, null, null, Boolean.FALSE, null, null, null, null, null, null, TypedValues.PositionType.TYPE_PERCENT_Y)));
            int i3 = WhenMappings.c[((RegisterClosedLoopWalletUseCase.RegisterClosedLoopWalletFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).ordinal()];
            if (i3 != 1) {
                StringProvider stringProvider = this.f10899a;
                if (i3 != 2) {
                    chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.L$0 = this;
                    chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.label = 4;
                    objA = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], chaloPayManagerImpl$handleClosedLoopWalletRegistration$2);
                    if (objA != coroutineSingletons) {
                        chaloPayManagerImpl = this;
                        handleErrorInformation = new ChaloPaySideEffect.HandleErrorInformation((String) objA);
                        chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.L$0 = null;
                        chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.label = 5;
                        if (chaloPayManagerImpl.f(handleErrorInformation, chaloPayManagerImpl$handleClosedLoopWalletRegistration$2) != coroutineSingletons) {
                            return unit;
                        }
                    }
                } else {
                    chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.L$0 = this;
                    chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.label = 3;
                    objA = stringProvider.b(StringEnum.CITY_NOT_AVAILABLE, new Object[0], chaloPayManagerImpl$handleClosedLoopWalletRegistration$2);
                    if (objA != coroutineSingletons) {
                        chaloPayManagerImpl = this;
                        handleErrorInformation = new ChaloPaySideEffect.HandleErrorInformation((String) objA);
                        chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.L$0 = null;
                        chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.label = 5;
                        if (chaloPayManagerImpl.f(handleErrorInformation, chaloPayManagerImpl$handleClosedLoopWalletRegistration$2) != coroutineSingletons) {
                            return unit;
                        }
                    }
                }
            } else {
                handleErrorInformation = ChaloPaySideEffect.NavigateToLogin.f10906a;
                chaloPayManagerImpl = this;
                chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.L$0 = null;
                chaloPayManagerImpl$handleClosedLoopWalletRegistration$2.label = 5;
                if (chaloPayManagerImpl.f(handleErrorInformation, chaloPayManagerImpl$handleClosedLoopWalletRegistration$2) != coroutineSingletons) {
                    return unit;
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:101:0x018e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x0107  */
    /* JADX WARN: Code duplicated, block: B:71:0x0114  */
    /* JADX WARN: Code duplicated, block: B:74:0x0126  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(boolean z, WalletStatus walletStatus, WalletTypeIdentifier walletTypeIdentifier, boolean z2, ContinuationImpl continuationImpl) {
        ChaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1 chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1;
        ChaloPayManagerImpl chaloPayManagerImpl;
        ChaloPayManagerImpl chaloPayManagerImpl2;
        ChaloPaySideEffect.HandleErrorInformation handleErrorInformation;
        ChaloPayManagerImpl chaloPayManagerImpl3;
        ChaloPaySideEffect.HandleErrorInformation handleErrorInformation2;
        ChaloPaySideEffect.HandleErrorInformation handleErrorInformation3;
        if (continuationImpl instanceof ChaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1) {
            chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1 = (ChaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1) continuationImpl;
            int i = chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1 = new ChaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1(this, continuationImpl);
            }
        } else {
            chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1 = new ChaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1(this, continuationImpl);
        }
        Object objB = chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label;
        StringProvider stringProvider = this.f10899a;
        Unit unit = Unit.f17538a;
        switch (i2) {
            case 0:
                ResultKt.b(objB);
                if (z) {
                    switch (WhenMappings.b[walletStatus.ordinal()]) {
                        case 1:
                            chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label = 1;
                            if (f(ChaloPaySideEffect.NavigateToLogin.f10906a, chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            break;
                        case 2:
                        case 3:
                            if (walletTypeIdentifier == null || !walletTypeIdentifier.d || !z2) {
                                if (walletTypeIdentifier == null || !walletTypeIdentifier.d) {
                                    chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label = 5;
                                    if (f(ChaloPaySideEffect.NavigateToKYCFlow.f10905a, chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1) == coroutineSingletons) {
                                    }
                                } else {
                                    chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.L$0 = this;
                                    chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label = 3;
                                    objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1);
                                    if (objB != coroutineSingletons) {
                                        chaloPayManagerImpl = this;
                                        handleErrorInformation = new ChaloPaySideEffect.HandleErrorInformation((String) objB);
                                        chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.L$0 = null;
                                        chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label = 4;
                                        if (chaloPayManagerImpl.f(handleErrorInformation, chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1) == coroutineSingletons) {
                                        }
                                    }
                                }
                                return coroutineSingletons;
                            }
                            chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label = 2;
                            if (i(walletTypeIdentifier, chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            break;
                        case 4:
                            chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label = 6;
                            objB = this.g.a(chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1);
                            if (objB != coroutineSingletons) {
                                if (((Boolean) objB).booleanValue()) {
                                    chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label = 7;
                                    if (f(ChaloPaySideEffect.NavigateToBackendReclaimMoreInfo.f10903a, chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1) != coroutineSingletons) {
                                    }
                                } else {
                                    chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.L$0 = this;
                                    chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label = 8;
                                    objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1);
                                    if (objB != coroutineSingletons) {
                                        chaloPayManagerImpl3 = this;
                                        handleErrorInformation2 = new ChaloPaySideEffect.HandleErrorInformation((String) objB);
                                        chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.L$0 = null;
                                        chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label = 9;
                                        if (chaloPayManagerImpl3.f(handleErrorInformation2, chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1) != coroutineSingletons) {
                                        }
                                    }
                                }
                            }
                            return coroutineSingletons;
                        case 5:
                            chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label = 10;
                            if (f(ChaloPaySideEffect.NavigateToFullKycInfo.f10904a, chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            break;
                        case 6:
                            chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label = 11;
                            if (f(ChaloPaySideEffect.NavigateToUserBlockedMoreInfo.f10907a, chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            break;
                        case 7:
                            chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label = 12;
                            if (f(ChaloPaySideEffect.NavigateToAppReclaimInfo.f10902a, chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            break;
                        case 8:
                        case 9:
                        case 10:
                            chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.L$0 = this;
                            chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label = 13;
                            objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1);
                            if (objB != coroutineSingletons) {
                                chaloPayManagerImpl2 = this;
                                handleErrorInformation3 = new ChaloPaySideEffect.HandleErrorInformation((String) objB);
                                chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.L$0 = null;
                                chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label = 14;
                                if (chaloPayManagerImpl2.f(handleErrorInformation3, chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1) == coroutineSingletons) {
                                }
                            }
                            return coroutineSingletons;
                        case 11:
                            chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label = 15;
                            if (f(ChaloPaySideEffect.WalletStatusFetched.f10908a, chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                return unit;
            case 1:
                ResultKt.b(objB);
                return unit;
            case 2:
                ResultKt.b(objB);
                return unit;
            case 3:
                chaloPayManagerImpl = (ChaloPayManagerImpl) chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.L$0;
                ResultKt.b(objB);
                handleErrorInformation = new ChaloPaySideEffect.HandleErrorInformation((String) objB);
                chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.L$0 = null;
                chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label = 4;
                if (chaloPayManagerImpl.f(handleErrorInformation, chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 4:
                ResultKt.b(objB);
                return unit;
            case 5:
                ResultKt.b(objB);
                return unit;
            case 6:
                ResultKt.b(objB);
                if (((Boolean) objB).booleanValue()) {
                    chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label = 7;
                    if (f(ChaloPaySideEffect.NavigateToBackendReclaimMoreInfo.f10903a, chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1) != coroutineSingletons) {
                        return unit;
                    }
                } else {
                    chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.L$0 = this;
                    chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label = 8;
                    objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1);
                    if (objB != coroutineSingletons) {
                        chaloPayManagerImpl3 = this;
                        handleErrorInformation2 = new ChaloPaySideEffect.HandleErrorInformation((String) objB);
                        chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.L$0 = null;
                        chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label = 9;
                        if (chaloPayManagerImpl3.f(handleErrorInformation2, chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1) != coroutineSingletons) {
                            return unit;
                        }
                    }
                }
                return coroutineSingletons;
            case 7:
                ResultKt.b(objB);
                return unit;
            case 8:
                chaloPayManagerImpl3 = (ChaloPayManagerImpl) chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.L$0;
                ResultKt.b(objB);
                handleErrorInformation2 = new ChaloPaySideEffect.HandleErrorInformation((String) objB);
                chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.L$0 = null;
                chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label = 9;
                if (chaloPayManagerImpl3.f(handleErrorInformation2, chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1) != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 9:
                ResultKt.b(objB);
                return unit;
            case 10:
                ResultKt.b(objB);
                return unit;
            case 11:
                ResultKt.b(objB);
                return unit;
            case 12:
                ResultKt.b(objB);
                return unit;
            case 13:
                chaloPayManagerImpl2 = (ChaloPayManagerImpl) chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.L$0;
                ResultKt.b(objB);
                handleErrorInformation3 = new ChaloPaySideEffect.HandleErrorInformation((String) objB);
                chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.L$0 = null;
                chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1.label = 14;
                if (chaloPayManagerImpl2.f(handleErrorInformation3, chaloPayManagerImpl$handleIfComingFromHandleWalletAccessOperation$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 14:
                ResultKt.b(objB);
                return unit;
            case 15:
                ResultKt.b(objB);
                return unit;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:43:0x0108  */
    /* JADX WARN: Code duplicated, block: B:45:0x010d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0111  */
    /* JADX WARN: Code duplicated, block: B:47:0x0115  */
    /* JADX WARN: Code duplicated, block: B:48:0x0119  */
    /* JADX WARN: Code duplicated, block: B:49:0x011d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0123  */
    /* JADX WARN: Code duplicated, block: B:52:0x012a  */
    /* JADX WARN: Code duplicated, block: B:53:0x012f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0136  */
    /* JADX WARN: Code duplicated, block: B:59:0x014e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0154  */
    /* JADX WARN: Code duplicated, block: B:63:0x0158  */
    /* JADX WARN: Code duplicated, block: B:65:0x015c  */
    /* JADX WARN: Code duplicated, block: B:66:0x015f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0162  */
    /* JADX WARN: Code duplicated, block: B:68:0x0165  */
    /* JADX WARN: Code duplicated, block: B:69:0x0168  */
    /* JADX WARN: Code duplicated, block: B:71:0x016b  */
    /* JADX WARN: Code duplicated, block: B:72:0x016d  */
    /* JADX WARN: Code duplicated, block: B:81:0x01af A[LOOP:0: B:74:0x017e->B:81:0x01af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a9, code lost:
    
        if (r0.j(r5, r3, r4, r6, r6) == r11) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(app.chalo.walletframework.wallet.data.model.WalletStatus r20, app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r21, boolean r22, boolean r23, boolean r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.chalopay.ChaloPayManagerImpl.k(app.chalo.walletframework.wallet.data.model.WalletStatus, app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier, boolean, boolean, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object l(WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl, boolean z, boolean z2) {
        ChaloPayManagerImpl$processWalletStatusWithoutSync$1 chaloPayManagerImpl$processWalletStatusWithoutSync$1;
        if (continuationImpl instanceof ChaloPayManagerImpl$processWalletStatusWithoutSync$1) {
            chaloPayManagerImpl$processWalletStatusWithoutSync$1 = (ChaloPayManagerImpl$processWalletStatusWithoutSync$1) continuationImpl;
            int i = chaloPayManagerImpl$processWalletStatusWithoutSync$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloPayManagerImpl$processWalletStatusWithoutSync$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloPayManagerImpl$processWalletStatusWithoutSync$1 = new ChaloPayManagerImpl$processWalletStatusWithoutSync$1(this, continuationImpl);
            }
        } else {
            chaloPayManagerImpl$processWalletStatusWithoutSync$1 = new ChaloPayManagerImpl$processWalletStatusWithoutSync$1(this, continuationImpl);
        }
        ChaloPayManagerImpl$processWalletStatusWithoutSync$1 chaloPayManagerImpl$processWalletStatusWithoutSync$2 = chaloPayManagerImpl$processWalletStatusWithoutSync$1;
        Object objA = chaloPayManagerImpl$processWalletStatusWithoutSync$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloPayManagerImpl$processWalletStatusWithoutSync$2.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objA);
            chaloPayManagerImpl$processWalletStatusWithoutSync$2.L$0 = walletTypeIdentifier;
            chaloPayManagerImpl$processWalletStatusWithoutSync$2.Z$0 = z;
            chaloPayManagerImpl$processWalletStatusWithoutSync$2.Z$1 = z2;
            chaloPayManagerImpl$processWalletStatusWithoutSync$2.label = 1;
            objA = this.d.a(walletTypeIdentifier, chaloPayManagerImpl$processWalletStatusWithoutSync$2);
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.b(objA);
                return unit;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
            return unit;
        }
        z2 = chaloPayManagerImpl$processWalletStatusWithoutSync$2.Z$1;
        z = chaloPayManagerImpl$processWalletStatusWithoutSync$2.Z$0;
        walletTypeIdentifier = (WalletTypeIdentifier) chaloPayManagerImpl$processWalletStatusWithoutSync$2.L$0;
        ResultKt.b(objA);
        boolean z3 = z;
        boolean z4 = z2;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            WalletStatus walletStatus = ((WalletStatusWithReclaimTime) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f11077a;
            chaloPayManagerImpl$processWalletStatusWithoutSync$2.L$0 = null;
            chaloPayManagerImpl$processWalletStatusWithoutSync$2.label = 2;
            if (k(walletStatus, walletTypeIdentifier, z3, z4, true, chaloPayManagerImpl$processWalletStatusWithoutSync$2) == obj) {
                return obj;
            }
            return unit;
        }
        WalletTypeIdentifier walletTypeIdentifier2 = walletTypeIdentifier;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        WalletStatus walletStatus2 = (WalletStatus) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        chaloPayManagerImpl$processWalletStatusWithoutSync$2.L$0 = null;
        chaloPayManagerImpl$processWalletStatusWithoutSync$2.label = 3;
        if (k(walletStatus2, walletTypeIdentifier2, z3, z4, true, chaloPayManagerImpl$processWalletStatusWithoutSync$2) == obj) {
            return obj;
        }
        return unit;
    }
}
