package app.chalo.walletframework.worker;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.features.foreground.ApplicationForegroundManager;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import app.chalo.walletframework.wallet.domain.WalletSyncAttemptFailureReason;
import app.chalo.walletframework.wallet.domain.WalletSyncOrchestrator;
import app.chalo.walletframework.wallet.domain.WalletSyncOrchestratorFailureCause;
import app.chalo.walletframework.wallet.domain.model.WalletAndAllTransactions;
import app.chalo.worker.BackgroundWorkerTaskDelegate;
import app.chalo.worker.BackgroundWorkerTaskResult;
import defpackage.hp1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/worker/WalletSyncWorkerTaskDelegate;", "Lapp/chalo/worker/BackgroundWorkerTaskDelegate;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletSyncWorkerTaskDelegate implements BackgroundWorkerTaskDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletSyncOrchestrator f11104a;
    public final AnalyticsContract b;
    public final ApplicationForegroundManager c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11105a;

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
                iArr[WalletSyncAttemptFailureReason.SYNC_API_FETCH_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WalletSyncAttemptFailureReason.WALLET_TIMED_OUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WalletSyncAttemptFailureReason.NO_INFORMATION_AVAILABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f11105a = iArr;
        }
    }

    public WalletSyncWorkerTaskDelegate(WalletSyncOrchestrator walletSyncOrchestrator, AnalyticsContract analyticsContract, ApplicationForegroundManager applicationForegroundManager) {
        this.f11104a = walletSyncOrchestrator;
        this.b = analyticsContract;
        this.c = applicationForegroundManager;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.worker.BackgroundWorkerTaskDelegate
    public final Object a(ContinuationImpl continuationImpl) {
        WalletSyncWorkerTaskDelegate$performWork$1 walletSyncWorkerTaskDelegate$performWork$1;
        int i;
        String f11008a;
        int i2;
        WalletAndAllTransactions walletAndAllTransactions;
        WalletAppModel walletAppModel;
        WalletAndAllTransactions walletAndAllTransactions2;
        WalletAppModel walletAppModel2;
        WalletSyncAttemptFailureReason walletSyncAttemptFailureReason;
        Object next;
        if (continuationImpl instanceof WalletSyncWorkerTaskDelegate$performWork$1) {
            walletSyncWorkerTaskDelegate$performWork$1 = (WalletSyncWorkerTaskDelegate$performWork$1) continuationImpl;
            int i3 = walletSyncWorkerTaskDelegate$performWork$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                walletSyncWorkerTaskDelegate$performWork$1.label = i3 - Integer.MIN_VALUE;
            } else {
                walletSyncWorkerTaskDelegate$performWork$1 = new WalletSyncWorkerTaskDelegate$performWork$1(this, continuationImpl);
            }
        } else {
            walletSyncWorkerTaskDelegate$performWork$1 = new WalletSyncWorkerTaskDelegate$performWork$1(this, continuationImpl);
        }
        Object objC = walletSyncWorkerTaskDelegate$performWork$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = walletSyncWorkerTaskDelegate$performWork$1.label;
        AnalyticsContract analyticsContract = this.b;
        if (i4 == 0) {
            ResultKt.b(objC);
            AnalyticsContract.DefaultImpls.a(analyticsContract, "wallet sync worker started", "WalletSyncWorker", null, null, false, 28);
            walletSyncWorkerTaskDelegate$performWork$1.label = 1;
            objC = this.f11104a.c(true, walletSyncWorkerTaskDelegate$performWork$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objC;
        boolean z = chaloUseCaseResult instanceof ChaloUseCaseResult.Failure;
        int i5 = 0;
        ApplicationForegroundManager applicationForegroundManager = this.c;
        String str = "USER_NOT_LOGGED_IN";
        Object objValueOf = "";
        if (z) {
            Pair pair = new Pair("isSuccessful", Boolean.FALSE);
            if (!Intrinsics.d((WalletSyncOrchestratorFailureCause) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a, WalletSyncOrchestratorFailureCause.UserNotLoggedIn.f11078a)) {
                throw new NoWhenBranchMatchedException();
            }
            AnalyticsContract.DefaultImpls.a(analyticsContract, "wallet sync worker result", "WalletSyncWorker", MapsKt.i(pair, new Pair("error name", "USER_NOT_LOGGED_IN"), new Pair("walletId", ""), new Pair("is foreground", Boolean.valueOf(applicationForegroundManager.getF2712a())), new Pair("walletBalance", "")), null, false, 24);
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            Map map = (Map) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            ChaloUseCaseResult chaloUseCaseResult2 = (ChaloUseCaseResult) map.get(WalletTypeIdentifier.Companion.c());
            if (chaloUseCaseResult2 == null) {
                Iterator it = map.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = i5;
                        next = null;
                        break;
                    }
                    next = it.next();
                    i = i5;
                    if (((ChaloUseCaseResult) next) instanceof ChaloUseCaseResult.Success) {
                        break;
                    }
                    i5 = i;
                }
                chaloUseCaseResult2 = (ChaloUseCaseResult) next;
                if (chaloUseCaseResult2 == null) {
                    chaloUseCaseResult2 = (ChaloUseCaseResult) CollectionsKt.G(map.values());
                }
            } else {
                i = 0;
            }
            Pair[] pairArr = new Pair[1];
            pairArr[i] = new Pair("is foreground", Boolean.valueOf(applicationForegroundManager.getF2712a()));
            LinkedHashMap linkedHashMapK = MapsKt.k(pairArr);
            boolean z2 = chaloUseCaseResult2 instanceof ChaloUseCaseResult.Success;
            linkedHashMapK.put("isSuccessful", Boolean.valueOf(z2));
            ChaloUseCaseResult.Failure failure = chaloUseCaseResult2 instanceof ChaloUseCaseResult.Failure ? (ChaloUseCaseResult.Failure) chaloUseCaseResult2 : null;
            if (failure == null || (walletSyncAttemptFailureReason = (WalletSyncAttemptFailureReason) failure.f10418a) == null) {
                str = "";
            } else {
                switch (WhenMappings.f11105a[walletSyncAttemptFailureReason.ordinal()]) {
                    case 1:
                        break;
                    case 2:
                        str = "KYC_NOT_DONE";
                        break;
                    case 3:
                        str = "BLOCKED_FOR_APP_RECLAIM";
                        break;
                    case 4:
                        str = "CHALO_TIME_NOT_AVAILABLE";
                        break;
                    case 5:
                        str = "API_FETCH_FAILED";
                        break;
                    case 6:
                        str = "WALLET_TIMED_OUT";
                        break;
                    case 7:
                        str = "NO_INFORMATION_AVAILABLE";
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            linkedHashMapK.put("error name", str);
            ChaloUseCaseResult.Success success = z2 ? (ChaloUseCaseResult.Success) chaloUseCaseResult2 : null;
            if (success == null || (walletAndAllTransactions2 = (WalletAndAllTransactions) success.f10419a) == null || (walletAppModel2 = walletAndAllTransactions2.f11093a) == null || (f11008a = walletAppModel2.getF11008a()) == null) {
                f11008a = "";
            }
            linkedHashMapK.put("walletId", f11008a);
            ChaloUseCaseResult.Success success2 = z2 ? (ChaloUseCaseResult.Success) chaloUseCaseResult2 : null;
            if (success2 != null && (walletAndAllTransactions = (WalletAndAllTransactions) success2.f10419a) != null && (walletAppModel = walletAndAllTransactions.f11093a) != null) {
                objValueOf = Integer.valueOf(walletAppModel.getD());
            }
            linkedHashMapK.put("walletBalance", objValueOf);
            int size = map.size();
            if (map.isEmpty()) {
                i2 = i;
            } else {
                Iterator it2 = map.entrySet().iterator();
                i2 = i;
                while (it2.hasNext()) {
                    if (((Map.Entry) it2.next()).getValue() instanceof ChaloUseCaseResult.Success) {
                        i2++;
                    }
                }
            }
            String strO = CollectionsKt.O(map.keySet(), null, null, null, new hp1(6), 31);
            String strO2 = CollectionsKt.O(map.values(), null, null, null, new hp1(7), 31);
            linkedHashMapK.put("totalWallets", Integer.valueOf(size));
            linkedHashMapK.put("walletsSuccess", Integer.valueOf(i2));
            linkedHashMapK.put("walletTypesForSync", strO);
            linkedHashMapK.put("walletIdsForSync", strO2);
            AnalyticsContract.DefaultImpls.a(analyticsContract, "wallet sync worker result", "WalletSyncWorker", linkedHashMapK, null, false, 24);
        }
        return BackgroundWorkerTaskResult.Success.f11117a;
    }
}
