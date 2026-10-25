package app.chalo.walletframework.wallet.domain;

import app.chalo.data.WalletSetupConfiguration;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.usecase.ChaloTimeAvailability;
import app.chalo.usecase.GetChaloTimeUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/CheckIsWalletTimedOutUseCase;", "", "WalletTimedOutFailureReason", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckIsWalletTimedOutUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletRepository f11035a;
    public final GetChaloTimeUseCase b;
    public final GetWalletSetupConfigurationUseCase c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/CheckIsWalletTimedOutUseCase$WalletTimedOutFailureReason;", "", "<init>", "(Ljava/lang/String;I)V", "CHALO_TIME_NOT_AVAILABLE", "NO_WALLET_FOUND_IN_DB", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum WalletTimedOutFailureReason {
        CHALO_TIME_NOT_AVAILABLE,
        NO_WALLET_FOUND_IN_DB;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<WalletTimedOutFailureReason> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11036a;

        static {
            int[] iArr = new int[ChaloTimeAvailability.values().length];
            try {
                iArr[ChaloTimeAvailability.CHALO_TIME_NOT_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f11036a = iArr;
        }
    }

    public CheckIsWalletTimedOutUseCase(WalletRepository walletRepository, GetChaloTimeUseCase getChaloTimeUseCase, GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase) {
        this.f11035a = walletRepository;
        this.b = getChaloTimeUseCase;
        this.c = getWalletSetupConfigurationUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        CheckIsWalletTimedOutUseCase$invoke$1 checkIsWalletTimedOutUseCase$invoke$1;
        ChaloUseCaseResult chaloUseCaseResult;
        long jLongValue;
        Object objB;
        ChaloUseCaseResult chaloUseCaseResult2;
        long j;
        if (continuationImpl instanceof CheckIsWalletTimedOutUseCase$invoke$1) {
            checkIsWalletTimedOutUseCase$invoke$1 = (CheckIsWalletTimedOutUseCase$invoke$1) continuationImpl;
            int i = checkIsWalletTimedOutUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkIsWalletTimedOutUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                checkIsWalletTimedOutUseCase$invoke$1 = new CheckIsWalletTimedOutUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            checkIsWalletTimedOutUseCase$invoke$1 = new CheckIsWalletTimedOutUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = checkIsWalletTimedOutUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkIsWalletTimedOutUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            checkIsWalletTimedOutUseCase$invoke$1.L$0 = str;
            checkIsWalletTimedOutUseCase$invoke$1.L$1 = str2;
            checkIsWalletTimedOutUseCase$invoke$1.label = 1;
            objA = this.b.a(checkIsWalletTimedOutUseCase$invoke$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str2 = (String) checkIsWalletTimedOutUseCase$invoke$1.L$1;
            str = (String) checkIsWalletTimedOutUseCase$invoke$1.L$0;
            ResultKt.b(objA);
        } else {
            if (i2 == 2) {
                chaloUseCaseResult = (ChaloUseCaseResult) checkIsWalletTimedOutUseCase$invoke$1.L$0;
                ResultKt.b(objA);
                jLongValue = ((Number) objA).longValue();
                if (jLongValue == -1) {
                    return new ChaloUseCaseResult.Failure(WalletTimedOutFailureReason.NO_WALLET_FOUND_IN_DB);
                }
                checkIsWalletTimedOutUseCase$invoke$1.L$0 = chaloUseCaseResult;
                checkIsWalletTimedOutUseCase$invoke$1.J$0 = jLongValue;
                checkIsWalletTimedOutUseCase$invoke$1.label = 3;
                objB = this.c.b(checkIsWalletTimedOutUseCase$invoke$1);
                if (objB != coroutineSingletons) {
                    chaloUseCaseResult2 = chaloUseCaseResult;
                    j = jLongValue;
                    objA = objB;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = checkIsWalletTimedOutUseCase$invoke$1.J$0;
            chaloUseCaseResult2 = (ChaloUseCaseResult) checkIsWalletTimedOutUseCase$invoke$1.L$0;
            ResultKt.b(objA);
        }
        return ((Number) ((ChaloUseCaseResult.Success) chaloUseCaseResult2).f10419a).longValue() - j > ((WalletSetupConfiguration) objA).c ? new ChaloUseCaseResult.Success(Boolean.TRUE) : new ChaloUseCaseResult.Success(Boolean.FALSE);
        ChaloUseCaseResult chaloUseCaseResult3 = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult3 instanceof ChaloUseCaseResult.Failure) {
            if (WhenMappings.f11036a[((ChaloTimeAvailability) ((ChaloUseCaseResult.Failure) chaloUseCaseResult3).f10418a).ordinal()] == 1) {
                return new ChaloUseCaseResult.Failure(WalletTimedOutFailureReason.CHALO_TIME_NOT_AVAILABLE);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(chaloUseCaseResult3 instanceof ChaloUseCaseResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        checkIsWalletTimedOutUseCase$invoke$1.L$0 = chaloUseCaseResult3;
        checkIsWalletTimedOutUseCase$invoke$1.L$1 = null;
        checkIsWalletTimedOutUseCase$invoke$1.label = 2;
        Object objS = this.f11035a.s(str, str2, checkIsWalletTimedOutUseCase$invoke$1);
        if (objS != coroutineSingletons) {
            objA = objS;
            chaloUseCaseResult = chaloUseCaseResult3;
            jLongValue = ((Number) objA).longValue();
            if (jLongValue == -1) {
                return new ChaloUseCaseResult.Failure(WalletTimedOutFailureReason.NO_WALLET_FOUND_IN_DB);
            }
            checkIsWalletTimedOutUseCase$invoke$1.L$0 = chaloUseCaseResult;
            checkIsWalletTimedOutUseCase$invoke$1.J$0 = jLongValue;
            checkIsWalletTimedOutUseCase$invoke$1.label = 3;
            objB = this.c.b(checkIsWalletTimedOutUseCase$invoke$1);
            if (objB != coroutineSingletons) {
                chaloUseCaseResult2 = chaloUseCaseResult;
                j = jLongValue;
                objA = objB;
                if (((Number) ((ChaloUseCaseResult.Success) chaloUseCaseResult2).f10419a).longValue() - j > ((WalletSetupConfiguration) objA).c) {
                }
            }
        }
        return coroutineSingletons;
    }
}
