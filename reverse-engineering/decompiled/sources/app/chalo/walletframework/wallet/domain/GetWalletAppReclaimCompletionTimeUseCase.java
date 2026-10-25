package app.chalo.walletframework.wallet.domain;

import app.chalo.data.WalletSetupConfiguration;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.CachedWalletStatus;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/GetWalletAppReclaimCompletionTimeUseCase;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetWalletAppReclaimCompletionTimeUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletRepository f11052a;
    public final WalletResolver b;
    public final GetWalletSetupConfigurationUseCase c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11053a;

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
            f11053a = iArr;
        }
    }

    public GetWalletAppReclaimCompletionTimeUseCase(WalletRepository walletRepository, WalletResolver walletResolver, GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase) {
        this.f11052a = walletRepository;
        this.b = walletResolver;
        this.c = getWalletSetupConfigurationUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        GetWalletAppReclaimCompletionTimeUseCase$invoke$1 getWalletAppReclaimCompletionTimeUseCase$invoke$1;
        long jLongValue;
        Object objB;
        long j;
        if (continuationImpl instanceof GetWalletAppReclaimCompletionTimeUseCase$invoke$1) {
            getWalletAppReclaimCompletionTimeUseCase$invoke$1 = (GetWalletAppReclaimCompletionTimeUseCase$invoke$1) continuationImpl;
            int i = getWalletAppReclaimCompletionTimeUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getWalletAppReclaimCompletionTimeUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getWalletAppReclaimCompletionTimeUseCase$invoke$1 = new GetWalletAppReclaimCompletionTimeUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getWalletAppReclaimCompletionTimeUseCase$invoke$1 = new GetWalletAppReclaimCompletionTimeUseCase$invoke$1(this, continuationImpl);
        }
        Object objE = getWalletAppReclaimCompletionTimeUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getWalletAppReclaimCompletionTimeUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            getWalletAppReclaimCompletionTimeUseCase$invoke$1.label = 1;
            objE = this.b.e(walletTypeIdentifier, getWalletAppReclaimCompletionTimeUseCase$invoke$1);
            if (objE != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objE);
        } else {
            if (i2 == 2) {
                ResultKt.b(objE);
                jLongValue = ((Number) objE).longValue();
                if (jLongValue == -1) {
                    return new ChaloUseCaseResult.Failure(WalletInAppReclaimFailureReason.NO_WALLET_FOUND);
                }
                getWalletAppReclaimCompletionTimeUseCase$invoke$1.J$0 = jLongValue;
                getWalletAppReclaimCompletionTimeUseCase$invoke$1.label = 3;
                objB = this.c.b(getWalletAppReclaimCompletionTimeUseCase$invoke$1);
                if (objB != coroutineSingletons) {
                    objE = objB;
                    j = jLongValue;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = getWalletAppReclaimCompletionTimeUseCase$invoke$1.J$0;
            ResultKt.b(objE);
        }
        return new ChaloUseCaseResult.Success(new Long(j + ((WalletSetupConfiguration) objE).b));
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objE;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = WhenMappings.f11053a[((WalletResolverError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).ordinal()];
            if (i3 == 1) {
                return new ChaloUseCaseResult.Failure(WalletInAppReclaimFailureReason.NO_WALLET_FOUND);
            }
            if (i3 == 2) {
                return new ChaloUseCaseResult.Failure(WalletInAppReclaimFailureReason.USER_NOT_LOGGED_IN);
            }
            throw new NoWhenBranchMatchedException();
        }
        WalletAppModel walletAppModel = (WalletAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        if (walletAppModel.getC() != CachedWalletStatus.BLOCKED_FOR_APP_RECLAIM) {
            return new ChaloUseCaseResult.Success(new Long(0L));
        }
        String b = walletAppModel.getB();
        String f11008a = walletAppModel.getF11008a();
        getWalletAppReclaimCompletionTimeUseCase$invoke$1.label = 2;
        objE = this.f11052a.o(b, f11008a, getWalletAppReclaimCompletionTimeUseCase$invoke$1);
        if (objE != coroutineSingletons) {
            jLongValue = ((Number) objE).longValue();
            if (jLongValue == -1) {
                return new ChaloUseCaseResult.Failure(WalletInAppReclaimFailureReason.NO_WALLET_FOUND);
            }
            getWalletAppReclaimCompletionTimeUseCase$invoke$1.J$0 = jLongValue;
            getWalletAppReclaimCompletionTimeUseCase$invoke$1.label = 3;
            objB = this.c.b(getWalletAppReclaimCompletionTimeUseCase$invoke$1);
            if (objB != coroutineSingletons) {
                objE = objB;
                j = jLongValue;
                return new ChaloUseCaseResult.Success(new Long(j + ((WalletSetupConfiguration) objE).b));
            }
        }
        return coroutineSingletons;
    }
}
