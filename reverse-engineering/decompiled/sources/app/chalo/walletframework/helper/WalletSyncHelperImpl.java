package app.chalo.walletframework.helper;

import app.chalo.contract.ProductInfoContract;
import app.chalo.data.WalletSetupConfiguration;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.features.wallet.WalletSyncHelper;
import app.chalo.features.wallet.WalletSyncRequest;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.domain.WalletSyncAttemptFailureReason;
import app.chalo.walletframework.wallet.domain.WalletSyncOrchestrator;
import app.chalo.worker.ApplicationBackgroundWorkersManager;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/helper/WalletSyncHelperImpl;", "Lapp/chalo/features/wallet/WalletSyncHelper;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletSyncHelperImpl implements WalletSyncHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetWalletSetupConfigurationUseCase f10911a;
    public final CityProvider b;
    public final ProductInfoContract c;
    public final ApplicationBackgroundWorkersManager d;
    public final WalletSyncOrchestrator e;

    public WalletSyncHelperImpl(GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase, CityProvider cityProvider, ProductInfoContract productInfoContract, ApplicationBackgroundWorkersManager applicationBackgroundWorkersManager, WalletSyncOrchestrator walletSyncOrchestrator) {
        this.f10911a = getWalletSetupConfigurationUseCase;
        this.b = cityProvider;
        this.c = productInfoContract;
        this.d = applicationBackgroundWorkersManager;
        this.e = walletSyncOrchestrator;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.features.wallet.WalletSyncHelper
    public final Object a(ContinuationImpl continuationImpl) {
        WalletSyncHelperImpl$syncAllCachedWalletsForUser$1 walletSyncHelperImpl$syncAllCachedWalletsForUser$1;
        if (continuationImpl instanceof WalletSyncHelperImpl$syncAllCachedWalletsForUser$1) {
            walletSyncHelperImpl$syncAllCachedWalletsForUser$1 = (WalletSyncHelperImpl$syncAllCachedWalletsForUser$1) continuationImpl;
            int i = walletSyncHelperImpl$syncAllCachedWalletsForUser$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncHelperImpl$syncAllCachedWalletsForUser$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSyncHelperImpl$syncAllCachedWalletsForUser$1 = new WalletSyncHelperImpl$syncAllCachedWalletsForUser$1(this, continuationImpl);
            }
        } else {
            walletSyncHelperImpl$syncAllCachedWalletsForUser$1 = new WalletSyncHelperImpl$syncAllCachedWalletsForUser$1(this, continuationImpl);
        }
        Object objA = walletSyncHelperImpl$syncAllCachedWalletsForUser$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletSyncHelperImpl$syncAllCachedWalletsForUser$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            walletSyncHelperImpl$syncAllCachedWalletsForUser$1.label = 1;
            objA = this.e.a(walletSyncHelperImpl$syncAllCachedWalletsForUser$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            return Boolean.FALSE;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator it = ((Map) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).entrySet().iterator();
        while (it.hasNext()) {
            ChaloUseCaseResult chaloUseCaseResult2 = (ChaloUseCaseResult) ((Map.Entry) it.next()).getValue();
            if (chaloUseCaseResult2 instanceof ChaloUseCaseResult.Failure) {
                WalletSyncAttemptFailureReason walletSyncAttemptFailureReason = (WalletSyncAttemptFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult2).f10418a;
                if (walletSyncAttemptFailureReason == WalletSyncAttemptFailureReason.SYNC_API_FETCH_FAILED || walletSyncAttemptFailureReason == WalletSyncAttemptFailureReason.CHALO_TIME_NOT_AVAILABLE || walletSyncAttemptFailureReason == WalletSyncAttemptFailureReason.NO_INFORMATION_AVAILABLE) {
                    return Boolean.FALSE;
                }
            } else if (!(chaloUseCaseResult2 instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.features.wallet.WalletSyncHelper
    public final Object b(ContinuationImpl continuationImpl) {
        WalletSyncHelperImpl$startWalletSyncWork$1 walletSyncHelperImpl$startWalletSyncWork$1;
        if (continuationImpl instanceof WalletSyncHelperImpl$startWalletSyncWork$1) {
            walletSyncHelperImpl$startWalletSyncWork$1 = (WalletSyncHelperImpl$startWalletSyncWork$1) continuationImpl;
            int i = walletSyncHelperImpl$startWalletSyncWork$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncHelperImpl$startWalletSyncWork$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSyncHelperImpl$startWalletSyncWork$1 = new WalletSyncHelperImpl$startWalletSyncWork$1(this, continuationImpl);
            }
        } else {
            walletSyncHelperImpl$startWalletSyncWork$1 = new WalletSyncHelperImpl$startWalletSyncWork$1(this, continuationImpl);
        }
        Object objE = walletSyncHelperImpl$startWalletSyncWork$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletSyncHelperImpl$startWalletSyncWork$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            walletSyncHelperImpl$startWalletSyncWork$1.label = 1;
            objE = e(walletSyncHelperImpl$startWalletSyncWork$1);
            if (objE == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objE);
        }
        if (((Boolean) objE).booleanValue()) {
            this.d.c();
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.features.wallet.WalletSyncHelper
    public final Object c(boolean z, WalletSyncRequest.SemiClosed semiClosed, ContinuationImpl continuationImpl) {
        WalletSyncHelperImpl$syncWallet$1 walletSyncHelperImpl$syncWallet$1;
        if (continuationImpl instanceof WalletSyncHelperImpl$syncWallet$1) {
            walletSyncHelperImpl$syncWallet$1 = (WalletSyncHelperImpl$syncWallet$1) continuationImpl;
            int i = walletSyncHelperImpl$syncWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncHelperImpl$syncWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSyncHelperImpl$syncWallet$1 = new WalletSyncHelperImpl$syncWallet$1(this, continuationImpl);
            }
        } else {
            walletSyncHelperImpl$syncWallet$1 = new WalletSyncHelperImpl$syncWallet$1(this, continuationImpl);
        }
        Object objB = walletSyncHelperImpl$syncWallet$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletSyncHelperImpl$syncWallet$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            walletSyncHelperImpl$syncWallet$1.label = 1;
            objB = this.e.b(semiClosed, walletSyncHelperImpl$syncWallet$1, z);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objB;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            return Boolean.TRUE;
        }
        Intrinsics.g(chaloUseCaseResult, "null cannot be cast to non-null type app.chalo.utils.ChaloUseCaseResult.Failure<app.chalo.walletframework.wallet.domain.model.WalletAndAllTransactions, app.chalo.walletframework.wallet.domain.WalletSyncAttemptFailureReason>");
        WalletSyncAttemptFailureReason walletSyncAttemptFailureReason = (WalletSyncAttemptFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
        return Boolean.valueOf(!(walletSyncAttemptFailureReason == WalletSyncAttemptFailureReason.SYNC_API_FETCH_FAILED || walletSyncAttemptFailureReason == WalletSyncAttemptFailureReason.CHALO_TIME_NOT_AVAILABLE || walletSyncAttemptFailureReason == WalletSyncAttemptFailureReason.NO_INFORMATION_AVAILABLE));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.features.wallet.WalletSyncHelper
    public final Object d(ContinuationImpl continuationImpl) {
        WalletSyncHelperImpl$startPeriodicWorkIfNotScheduled$1 walletSyncHelperImpl$startPeriodicWorkIfNotScheduled$1;
        if (continuationImpl instanceof WalletSyncHelperImpl$startPeriodicWorkIfNotScheduled$1) {
            walletSyncHelperImpl$startPeriodicWorkIfNotScheduled$1 = (WalletSyncHelperImpl$startPeriodicWorkIfNotScheduled$1) continuationImpl;
            int i = walletSyncHelperImpl$startPeriodicWorkIfNotScheduled$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncHelperImpl$startPeriodicWorkIfNotScheduled$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSyncHelperImpl$startPeriodicWorkIfNotScheduled$1 = new WalletSyncHelperImpl$startPeriodicWorkIfNotScheduled$1(this, continuationImpl);
            }
        } else {
            walletSyncHelperImpl$startPeriodicWorkIfNotScheduled$1 = new WalletSyncHelperImpl$startPeriodicWorkIfNotScheduled$1(this, continuationImpl);
        }
        Object objE = walletSyncHelperImpl$startPeriodicWorkIfNotScheduled$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletSyncHelperImpl$startPeriodicWorkIfNotScheduled$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objE);
            walletSyncHelperImpl$startPeriodicWorkIfNotScheduled$1.label = 1;
            objE = e(walletSyncHelperImpl$startPeriodicWorkIfNotScheduled$1);
            if (objE != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objE);
            return unit;
        }
        ResultKt.b(objE);
        if (((Boolean) objE).booleanValue()) {
            walletSyncHelperImpl$startPeriodicWorkIfNotScheduled$1.label = 2;
            if (this.d.b(walletSyncHelperImpl$startPeriodicWorkIfNotScheduled$1) == obj) {
                return obj;
            }
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ContinuationImpl continuationImpl) {
        WalletSyncHelperImpl$canScheduleWork$1 walletSyncHelperImpl$canScheduleWork$1;
        if (continuationImpl instanceof WalletSyncHelperImpl$canScheduleWork$1) {
            walletSyncHelperImpl$canScheduleWork$1 = (WalletSyncHelperImpl$canScheduleWork$1) continuationImpl;
            int i = walletSyncHelperImpl$canScheduleWork$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSyncHelperImpl$canScheduleWork$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSyncHelperImpl$canScheduleWork$1 = new WalletSyncHelperImpl$canScheduleWork$1(this, continuationImpl);
            }
        } else {
            walletSyncHelperImpl$canScheduleWork$1 = new WalletSyncHelperImpl$canScheduleWork$1(this, continuationImpl);
        }
        Object objB = walletSyncHelperImpl$canScheduleWork$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletSyncHelperImpl$canScheduleWork$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            walletSyncHelperImpl$canScheduleWork$1.label = 1;
            objB = this.f10911a.b(walletSyncHelperImpl$canScheduleWork$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        WalletSetupConfiguration walletSetupConfiguration = (WalletSetupConfiguration) objB;
        CityProvider cityProvider = this.b;
        if (CityProviderKt.b(cityProvider) == null) {
            return Boolean.FALSE;
        }
        ChaloTransitMode chaloTransitMode = ChaloTransitMode.BUS;
        Object value = cityProvider.b().getValue();
        Intrinsics.f(value);
        return Boolean.valueOf(this.c.a(chaloTransitMode, (CityAppModel) value) && walletSetupConfiguration.a() && walletSetupConfiguration.b());
    }
}
