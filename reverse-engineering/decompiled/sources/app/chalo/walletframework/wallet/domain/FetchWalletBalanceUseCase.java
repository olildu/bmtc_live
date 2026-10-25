package app.chalo.walletframework.wallet.domain;

import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletStatus;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/FetchWalletBalanceUseCase;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchWalletBalanceUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetWalletStatusWithoutSyncUseCase f11039a;
    public final WalletResolver b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11040a;

        static {
            int[] iArr = new int[WalletStatus.values().length];
            try {
                iArr[WalletStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletStatus.DOES_NOT_EXIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletStatus.KYC_INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11040a = iArr;
        }
    }

    public FetchWalletBalanceUseCase(GetWalletStatusWithoutSyncUseCase getWalletStatusWithoutSyncUseCase, WalletResolver walletResolver) {
        this.f11039a = getWalletStatusWithoutSyncUseCase;
        this.b = walletResolver;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        FetchWalletBalanceUseCase$fetchActiveWalletBalance$1 fetchWalletBalanceUseCase$fetchActiveWalletBalance$1;
        if (continuationImpl instanceof FetchWalletBalanceUseCase$fetchActiveWalletBalance$1) {
            fetchWalletBalanceUseCase$fetchActiveWalletBalance$1 = (FetchWalletBalanceUseCase$fetchActiveWalletBalance$1) continuationImpl;
            int i = fetchWalletBalanceUseCase$fetchActiveWalletBalance$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchWalletBalanceUseCase$fetchActiveWalletBalance$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchWalletBalanceUseCase$fetchActiveWalletBalance$1 = new FetchWalletBalanceUseCase$fetchActiveWalletBalance$1(this, continuationImpl);
            }
        } else {
            fetchWalletBalanceUseCase$fetchActiveWalletBalance$1 = new FetchWalletBalanceUseCase$fetchActiveWalletBalance$1(this, continuationImpl);
        }
        Object objE = fetchWalletBalanceUseCase$fetchActiveWalletBalance$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchWalletBalanceUseCase$fetchActiveWalletBalance$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            fetchWalletBalanceUseCase$fetchActiveWalletBalance$1.label = 1;
            objE = this.b.e(walletTypeIdentifier, fetchWalletBalanceUseCase$fetchActiveWalletBalance$1);
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
            return new ChaloUseCaseResult.Success(new Integer(((WalletAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).getD()));
        }
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            return new ChaloUseCaseResult.Failure(Unit.f17538a);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        FetchWalletBalanceUseCase$invoke$1 fetchWalletBalanceUseCase$invoke$1;
        if (continuationImpl instanceof FetchWalletBalanceUseCase$invoke$1) {
            fetchWalletBalanceUseCase$invoke$1 = (FetchWalletBalanceUseCase$invoke$1) continuationImpl;
            int i = fetchWalletBalanceUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchWalletBalanceUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchWalletBalanceUseCase$invoke$1 = new FetchWalletBalanceUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchWalletBalanceUseCase$invoke$1 = new FetchWalletBalanceUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = fetchWalletBalanceUseCase$invoke$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchWalletBalanceUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            fetchWalletBalanceUseCase$invoke$1.L$0 = walletTypeIdentifier;
            fetchWalletBalanceUseCase$invoke$1.label = 1;
            objA = this.f11039a.a(walletTypeIdentifier, fetchWalletBalanceUseCase$invoke$1);
            if (objA != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
            return objA;
        }
        walletTypeIdentifier = (WalletTypeIdentifier) fetchWalletBalanceUseCase$invoke$1.L$0;
        ResultKt.b(objA);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        boolean z = chaloUseCaseResult instanceof ChaloUseCaseResult.Success;
        Unit unit = Unit.f17538a;
        if (!z) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = WhenMappings.f11040a[((WalletStatusWithReclaimTime) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f11077a.ordinal()];
            if (i3 == 2 || i3 == 3) {
                return walletTypeIdentifier.d ? new ChaloUseCaseResult.Success(new Integer(0)) : new ChaloUseCaseResult.Failure(unit);
            }
            return new ChaloUseCaseResult.Failure(unit);
        }
        int i4 = WhenMappings.f11040a[((WalletStatus) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                return new ChaloUseCaseResult.Failure(unit);
            }
            return walletTypeIdentifier.d ? new ChaloUseCaseResult.Success(new Integer(0)) : new ChaloUseCaseResult.Failure(unit);
        }
        fetchWalletBalanceUseCase$invoke$1.L$0 = null;
        fetchWalletBalanceUseCase$invoke$1.label = 2;
        Object objA2 = a(walletTypeIdentifier, fetchWalletBalanceUseCase$invoke$1);
        return objA2 == obj ? obj : objA2;
    }
}
