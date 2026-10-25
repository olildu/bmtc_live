package app.chalo.wallet.domain;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.data.WalletSetupConfiguration;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.features.wallet.WalletSyncHelper;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.WalletUtilsExtensionsKt;
import app.chalo.walletframework.quickpay.data.model.QuickPayOrderStatus;
import app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModel;
import app.chalo.walletframework.quickpay.data.repository.QuickPayRepository;
import app.chalo.walletframework.wallet.data.model.WalletTransactionStatus;
import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.data.repository.entity.WalletTransactionEntity;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/domain/CreateQuickPayOrderUsecase;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateQuickPayOrderUsecase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletRepository f10770a;
    public final QuickPayRepository b;
    public final CrashlyticsLogger c;
    public final BasicInfoContract d;
    public final WalletSyncHelper e;
    public final GetWalletSetupConfigurationUseCase f;
    public final AnalyticsContract g;

    public CreateQuickPayOrderUsecase(WalletRepository walletRepository, QuickPayRepository quickPayRepository, CrashlyticsLogger crashlyticsLogger, BasicInfoContract basicInfoContract, WalletSyncHelper walletSyncHelper, GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase, AnalyticsContract analyticsContract) {
        this.f10770a = walletRepository;
        this.b = quickPayRepository;
        this.c = crashlyticsLogger;
        this.d = basicInfoContract;
        this.e = walletSyncHelper;
        this.f = getWalletSetupConfigurationUseCase;
        this.g = analyticsContract;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x011a  */
    /* JADX WARN: Code duplicated, block: B:46:0x011b  */
    /* JADX WARN: Code duplicated, block: B:49:0x012f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0130  */
    /* JADX WARN: Code duplicated, block: B:54:0x0147  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(WalletAppModel walletAppModel, long j, ContinuationImpl continuationImpl) {
        CreateQuickPayOrderUsecase$invoke$1 createQuickPayOrderUsecase$invoke$1;
        WalletAppModel walletAppModel2;
        long j2;
        long j3;
        long j4;
        QuickPayAppModel quickPayAppModel;
        WalletTransactionEntity walletTransactionEntity;
        WalletRepository walletRepository;
        int d;
        WalletAppModel walletAppModel3;
        WalletTransactionEntity walletTransactionEntity2;
        QuickPayAppModel quickPayAppModel2;
        QuickPayRepository quickPayRepository;
        QuickPayAppModel quickPayAppModel3;
        WalletAppModel walletAppModel4;
        WalletSyncHelper walletSyncHelper;
        QuickPayAppModel quickPayAppModel4;
        if (continuationImpl instanceof CreateQuickPayOrderUsecase$invoke$1) {
            createQuickPayOrderUsecase$invoke$1 = (CreateQuickPayOrderUsecase$invoke$1) continuationImpl;
            int i = createQuickPayOrderUsecase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createQuickPayOrderUsecase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                createQuickPayOrderUsecase$invoke$1 = new CreateQuickPayOrderUsecase$invoke$1(this, continuationImpl);
            }
        } else {
            createQuickPayOrderUsecase$invoke$1 = new CreateQuickPayOrderUsecase$invoke$1(this, continuationImpl);
        }
        Object objC = createQuickPayOrderUsecase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = createQuickPayOrderUsecase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objC);
                BasicInfoContract basicInfoContract = this.d;
                walletAppModel2 = walletAppModel;
                createQuickPayOrderUsecase$invoke$1.L$0 = walletAppModel2;
                createQuickPayOrderUsecase$invoke$1.J$0 = j;
                createQuickPayOrderUsecase$invoke$1.label = 1;
                objC = basicInfoContract.c(createQuickPayOrderUsecase$invoke$1);
                if (objC != coroutineSingletons) {
                    j2 = j;
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                j2 = createQuickPayOrderUsecase$invoke$1.J$0;
                walletAppModel2 = (WalletAppModel) createQuickPayOrderUsecase$invoke$1.L$0;
                ResultKt.b(objC);
            } else {
                if (i2 == 2) {
                    long j5 = createQuickPayOrderUsecase$invoke$1.J$1;
                    j4 = createQuickPayOrderUsecase$invoke$1.J$0;
                    walletAppModel2 = (WalletAppModel) createQuickPayOrderUsecase$invoke$1.L$0;
                    ResultKt.b(objC);
                    j3 = j5;
                    long j6 = ((WalletSetupConfiguration) objC).f;
                    long j7 = 1000;
                    long j8 = ((j3 + j6) / j7) * j7;
                    String strA = WalletUtilsExtensionsKt.a(j8, walletAppModel2.getF11008a());
                    int i3 = (int) j4;
                    quickPayAppModel = new QuickPayAppModel(QuickPayOrderStatus.PENDING, "", "quickpay_payment", null, null, j8, new Long(j6), i3, strA, null, walletAppModel2.getF11008a());
                    walletTransactionEntity = new WalletTransactionEntity("", WalletTransactionType.QUICK_PAY, walletAppModel2.getF11008a(), walletAppModel2.getB(), strA, i3, WalletTransactionStatus.UNSYNCED, j3);
                    walletRepository = this.f10770a;
                    d = walletAppModel2.getD() - i3;
                    createQuickPayOrderUsecase$invoke$1.L$0 = walletAppModel2;
                    createQuickPayOrderUsecase$invoke$1.L$1 = quickPayAppModel;
                    createQuickPayOrderUsecase$invoke$1.L$2 = walletTransactionEntity;
                    createQuickPayOrderUsecase$invoke$1.label = 3;
                    if (walletRepository.a(walletTransactionEntity, d, createQuickPayOrderUsecase$invoke$1) == coroutineSingletons) {
                        walletAppModel3 = walletAppModel2;
                        walletTransactionEntity2 = walletTransactionEntity;
                        quickPayAppModel2 = quickPayAppModel;
                        quickPayRepository = this.b;
                        createQuickPayOrderUsecase$invoke$1.L$0 = walletAppModel3;
                        createQuickPayOrderUsecase$invoke$1.L$1 = quickPayAppModel2;
                        createQuickPayOrderUsecase$invoke$1.L$2 = walletTransactionEntity2;
                        createQuickPayOrderUsecase$invoke$1.label = 4;
                        if (quickPayRepository.n(quickPayAppModel2, createQuickPayOrderUsecase$invoke$1) != coroutineSingletons) {
                            quickPayAppModel3 = quickPayAppModel2;
                            walletAppModel4 = walletAppModel3;
                            b(walletTransactionEntity2, walletAppModel4);
                            walletSyncHelper = this.e;
                            createQuickPayOrderUsecase$invoke$1.L$0 = quickPayAppModel3;
                            createQuickPayOrderUsecase$invoke$1.L$1 = null;
                            createQuickPayOrderUsecase$invoke$1.L$2 = null;
                            createQuickPayOrderUsecase$invoke$1.label = 5;
                            if (walletSyncHelper.b(createQuickPayOrderUsecase$invoke$1) != coroutineSingletons) {
                                quickPayAppModel4 = quickPayAppModel3;
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                if (i2 == 3) {
                    walletTransactionEntity2 = (WalletTransactionEntity) createQuickPayOrderUsecase$invoke$1.L$2;
                    quickPayAppModel2 = (QuickPayAppModel) createQuickPayOrderUsecase$invoke$1.L$1;
                    walletAppModel3 = (WalletAppModel) createQuickPayOrderUsecase$invoke$1.L$0;
                    ResultKt.b(objC);
                    quickPayRepository = this.b;
                    createQuickPayOrderUsecase$invoke$1.L$0 = walletAppModel3;
                    createQuickPayOrderUsecase$invoke$1.L$1 = quickPayAppModel2;
                    createQuickPayOrderUsecase$invoke$1.L$2 = walletTransactionEntity2;
                    createQuickPayOrderUsecase$invoke$1.label = 4;
                    if (quickPayRepository.n(quickPayAppModel2, createQuickPayOrderUsecase$invoke$1) != coroutineSingletons) {
                        quickPayAppModel3 = quickPayAppModel2;
                        walletAppModel4 = walletAppModel3;
                        b(walletTransactionEntity2, walletAppModel4);
                        walletSyncHelper = this.e;
                        createQuickPayOrderUsecase$invoke$1.L$0 = quickPayAppModel3;
                        createQuickPayOrderUsecase$invoke$1.L$1 = null;
                        createQuickPayOrderUsecase$invoke$1.L$2 = null;
                        createQuickPayOrderUsecase$invoke$1.label = 5;
                        if (walletSyncHelper.b(createQuickPayOrderUsecase$invoke$1) != coroutineSingletons) {
                            quickPayAppModel4 = quickPayAppModel3;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i2 == 4) {
                    walletTransactionEntity2 = (WalletTransactionEntity) createQuickPayOrderUsecase$invoke$1.L$2;
                    quickPayAppModel3 = (QuickPayAppModel) createQuickPayOrderUsecase$invoke$1.L$1;
                    walletAppModel4 = (WalletAppModel) createQuickPayOrderUsecase$invoke$1.L$0;
                    ResultKt.b(objC);
                    b(walletTransactionEntity2, walletAppModel4);
                    walletSyncHelper = this.e;
                    createQuickPayOrderUsecase$invoke$1.L$0 = quickPayAppModel3;
                    createQuickPayOrderUsecase$invoke$1.L$1 = null;
                    createQuickPayOrderUsecase$invoke$1.L$2 = null;
                    createQuickPayOrderUsecase$invoke$1.label = 5;
                    if (walletSyncHelper.b(createQuickPayOrderUsecase$invoke$1) != coroutineSingletons) {
                        quickPayAppModel4 = quickPayAppModel3;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                quickPayAppModel4 = (QuickPayAppModel) createQuickPayOrderUsecase$invoke$1.L$0;
                ResultKt.b(objC);
            }
            return new ChaloUseCaseResult.Success(quickPayAppModel4.i);
            long jLongValue = ((Number) objC).longValue();
            GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase = this.f;
            createQuickPayOrderUsecase$invoke$1.L$0 = walletAppModel2;
            createQuickPayOrderUsecase$invoke$1.J$0 = j2;
            createQuickPayOrderUsecase$invoke$1.J$1 = jLongValue;
            createQuickPayOrderUsecase$invoke$1.label = 2;
            objC = getWalletSetupConfigurationUseCase.b(createQuickPayOrderUsecase$invoke$1);
            if (objC != coroutineSingletons) {
                j3 = jLongValue;
                j4 = j2;
                long j9 = ((WalletSetupConfiguration) objC).f;
                long j10 = 1000;
                long j11 = ((j3 + j9) / j10) * j10;
                String strA2 = WalletUtilsExtensionsKt.a(j11, walletAppModel2.getF11008a());
                int i4 = (int) j4;
                quickPayAppModel = new QuickPayAppModel(QuickPayOrderStatus.PENDING, "", "quickpay_payment", null, null, j11, new Long(j9), i4, strA2, null, walletAppModel2.getF11008a());
                walletTransactionEntity = new WalletTransactionEntity("", WalletTransactionType.QUICK_PAY, walletAppModel2.getF11008a(), walletAppModel2.getB(), strA2, i4, WalletTransactionStatus.UNSYNCED, j3);
                walletRepository = this.f10770a;
                d = walletAppModel2.getD() - i4;
                createQuickPayOrderUsecase$invoke$1.L$0 = walletAppModel2;
                createQuickPayOrderUsecase$invoke$1.L$1 = quickPayAppModel;
                createQuickPayOrderUsecase$invoke$1.L$2 = walletTransactionEntity;
                createQuickPayOrderUsecase$invoke$1.label = 3;
                if (walletRepository.a(walletTransactionEntity, d, createQuickPayOrderUsecase$invoke$1) == coroutineSingletons) {
                    walletAppModel3 = walletAppModel2;
                    walletTransactionEntity2 = walletTransactionEntity;
                    quickPayAppModel2 = quickPayAppModel;
                    quickPayRepository = this.b;
                    createQuickPayOrderUsecase$invoke$1.L$0 = walletAppModel3;
                    createQuickPayOrderUsecase$invoke$1.L$1 = quickPayAppModel2;
                    createQuickPayOrderUsecase$invoke$1.L$2 = walletTransactionEntity2;
                    createQuickPayOrderUsecase$invoke$1.label = 4;
                    if (quickPayRepository.n(quickPayAppModel2, createQuickPayOrderUsecase$invoke$1) != coroutineSingletons) {
                        quickPayAppModel3 = quickPayAppModel2;
                        walletAppModel4 = walletAppModel3;
                        b(walletTransactionEntity2, walletAppModel4);
                        walletSyncHelper = this.e;
                        createQuickPayOrderUsecase$invoke$1.L$0 = quickPayAppModel3;
                        createQuickPayOrderUsecase$invoke$1.L$1 = null;
                        createQuickPayOrderUsecase$invoke$1.L$2 = null;
                        createQuickPayOrderUsecase$invoke$1.label = 5;
                        if (walletSyncHelper.b(createQuickPayOrderUsecase$invoke$1) != coroutineSingletons) {
                            quickPayAppModel4 = quickPayAppModel3;
                            return new ChaloUseCaseResult.Success(quickPayAppModel4.i);
                        }
                    }
                }
            }
            return coroutineSingletons;
        } catch (Throwable th) {
            this.c.i(th);
            return new ChaloUseCaseResult.Failure(new Integer(0));
        }
    }

    public final void b(WalletTransactionEntity walletTransactionEntity, WalletAppModel walletAppModel) {
        String strF = Reflection.a(CreateQuickPayOrderUsecase.class).f();
        if (strF == null) {
            strF = "QuickpayOrderUseCase";
        }
        AnalyticsContract.DefaultImpls.a(this.g, "chalo pay order created", strF, MapsKt.i(new Pair(PaymentConstants.ORDER_ID_CAMEL, walletTransactionEntity.e), new Pair("chalo pay trip amount", Integer.valueOf(walletTransactionEntity.f)), new Pair("activationTime", Long.valueOf(walletTransactionEntity.h)), new Pair("walletBalance", Integer.valueOf(walletAppModel.getD()))), null, false, 24);
    }
}
