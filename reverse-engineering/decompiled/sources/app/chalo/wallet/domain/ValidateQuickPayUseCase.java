package app.chalo.wallet.domain;

import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolverError;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/domain/ValidateQuickPayUseCase;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidateQuickPayUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletResolver f10785a;
    public final CrashlyticsLogger b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10786a;

        static {
            int[] iArr = new int[WalletResolverError.values().length];
            try {
                iArr[WalletResolverError.WALLET_NOT_CACHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletResolverError.NOT_LOGGED_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10786a = iArr;
        }
    }

    public ValidateQuickPayUseCase(WalletResolver walletResolver, CrashlyticsLogger crashlyticsLogger) {
        this.f10785a = walletResolver;
        this.b = crashlyticsLogger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        ValidateQuickPayUseCase$invoke$1 validateQuickPayUseCase$invoke$1;
        if (continuationImpl instanceof ValidateQuickPayUseCase$invoke$1) {
            validateQuickPayUseCase$invoke$1 = (ValidateQuickPayUseCase$invoke$1) continuationImpl;
            int i = validateQuickPayUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                validateQuickPayUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                validateQuickPayUseCase$invoke$1 = new ValidateQuickPayUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            validateQuickPayUseCase$invoke$1 = new ValidateQuickPayUseCase$invoke$1(this, continuationImpl);
        }
        Object objE = validateQuickPayUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = validateQuickPayUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objE);
                WalletResolver walletResolver = this.f10785a;
                validateQuickPayUseCase$invoke$1.J$0 = j;
                validateQuickPayUseCase$invoke$1.label = 1;
                objE = walletResolver.e(walletTypeIdentifier, validateQuickPayUseCase$invoke$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = validateQuickPayUseCase$invoke$1.J$0;
                ResultKt.b(objE);
            }
            ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objE;
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                WalletAppModel walletAppModel = (WalletAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                return j <= ((long) walletAppModel.getD()) ? new QuickPayValidationResult.Success(walletAppModel, walletAppModel.getD()) : new QuickPayValidationResult.InsufficientBalance(walletAppModel.getD());
            }
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = WhenMappings.f10786a[((WalletResolverError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).ordinal()];
            if (i3 == 1) {
                return QuickPayValidationResult.WalletNotFound.f10782a;
            }
            if (i3 == 2) {
                return QuickPayValidationResult.UserNotFound.f10781a;
            }
            throw new NoWhenBranchMatchedException();
        } catch (Throwable th) {
            this.b.i(th);
            return QuickPayValidationResult.GeneralError.f10778a;
        }
    }
}
