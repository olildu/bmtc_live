package app.chalo.wallet.domain;

import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.wallet.ui.moneyaddedbottomsheet.model.WalletMoneyAddedNavigationModel;
import app.chalo.walletframework.wallet.data.mapper.WalletAndQuickPayStatusMapperKt;
import app.chalo.walletframework.wallet.data.model.LoadMoneyOrderStatus;
import app.chalo.walletframework.wallet.data.model.WalletTransactionStatus;
import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.model.appmodel.LoadMoneyAppModel;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletTransactionAppModel;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.WalletSyncOrchestrator;
import app.chalo.walletframework.wallet.domain.model.LoadMoneyPaymentCompleteData;
import app.chalo.walletframework.wallet.domain.model.WalletAndAllTransactions;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/wallet/domain/AddProcessingLoadMoneyTransactionsAndSyncWalletUseCase;", "", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AddProcessingLoadMoneyTransactionsAndSyncWalletUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletRepository f10769a;
    public final WalletSyncOrchestrator b;

    public AddProcessingLoadMoneyTransactionsAndSyncWalletUseCase(WalletRepository walletRepository, WalletSyncOrchestrator walletSyncOrchestrator) {
        this.f10769a = walletRepository;
        this.b = walletSyncOrchestrator;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:50:0x0126  */
    /* JADX WARN: Code duplicated, block: B:53:0x012c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0136  */
    /* JADX WARN: Code duplicated, block: B:57:0x013a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0144  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(LoadMoneyPaymentCompleteData loadMoneyPaymentCompleteData, WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        AddProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1 addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1;
        LoadMoneyAppModel loadMoneyAppModel;
        WalletTypeIdentifier walletTypeIdentifier2;
        Object obj;
        LoadMoneyPaymentCompleteData loadMoneyPaymentCompleteData2;
        LoadMoneyAppModel loadMoneyAppModel2;
        ChaloUseCaseResult chaloUseCaseResult;
        WalletAndAllTransactions walletAndAllTransactions;
        WalletTransactionAppModel walletTransactionAppModel;
        int i;
        LoadMoneyOrderStatus loadMoneyOrderStatus;
        WalletTransactionAppModel walletTransactionAppModel2;
        LoadMoneyPaymentCompleteData loadMoneyPaymentCompleteData3 = loadMoneyPaymentCompleteData;
        if (continuationImpl instanceof AddProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1) {
            addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1 = (AddProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1) continuationImpl;
            int i2 = addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1 = new AddProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1 = new AddProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1(this, continuationImpl);
        }
        Object objD = addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1.label;
        if (i3 == 0) {
            ResultKt.b(objD);
            String str = loadMoneyPaymentCompleteData3.d;
            String str2 = loadMoneyPaymentCompleteData3.g;
            WalletTransactionAppModel walletTransactionAppModel3 = new WalletTransactionAppModel(str, WalletTransactionType.LOAD_MONEY, str2, loadMoneyPaymentCompleteData3.f, loadMoneyPaymentCompleteData3.f11085a, loadMoneyPaymentCompleteData3.b, WalletTransactionStatus.PROCESSING, loadMoneyPaymentCompleteData3.c);
            loadMoneyAppModel = new LoadMoneyAppModel(loadMoneyPaymentCompleteData3.f11085a, loadMoneyPaymentCompleteData3.b, loadMoneyPaymentCompleteData3.c, loadMoneyPaymentCompleteData3.d, LoadMoneyOrderStatus.PROCESSING, loadMoneyPaymentCompleteData3.e, loadMoneyPaymentCompleteData3.f, str2);
            addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1.L$0 = loadMoneyPaymentCompleteData3;
            walletTypeIdentifier2 = walletTypeIdentifier;
            addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1.L$1 = walletTypeIdentifier2;
            addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1.L$2 = loadMoneyAppModel;
            addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1.label = 1;
            if (this.f10769a.u(walletTransactionAppModel3, loadMoneyAppModel, addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            LoadMoneyAppModel loadMoneyAppModel3 = (LoadMoneyAppModel) addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1.L$2;
            WalletTypeIdentifier walletTypeIdentifier3 = (WalletTypeIdentifier) addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1.L$1;
            LoadMoneyPaymentCompleteData loadMoneyPaymentCompleteData4 = (LoadMoneyPaymentCompleteData) addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1.L$0;
            ResultKt.b(objD);
            loadMoneyAppModel = loadMoneyAppModel3;
            walletTypeIdentifier2 = walletTypeIdentifier3;
            loadMoneyPaymentCompleteData3 = loadMoneyPaymentCompleteData4;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            loadMoneyAppModel2 = (LoadMoneyAppModel) addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1.L$1;
            loadMoneyPaymentCompleteData2 = (LoadMoneyPaymentCompleteData) addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1.L$0;
            ResultKt.b(objD);
            obj = null;
        }
        chaloUseCaseResult = (ChaloUseCaseResult) objD;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                return new WalletMoneyAddedNavigationModel(loadMoneyPaymentCompleteData2.b, -1, LoadMoneyOrderStatus.PROCESSING);
            }
            throw new NoWhenBranchMatchedException();
        }
        walletAndAllTransactions = (WalletAndAllTransactions) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        for (Object obj2 : walletAndAllTransactions.b) {
            walletTransactionAppModel2 = (WalletTransactionAppModel) obj2;
            if (!Intrinsics.d(walletTransactionAppModel2.f11016a, loadMoneyAppModel2.d) && Intrinsics.d(walletTransactionAppModel2.e, loadMoneyAppModel2.f11004a)) {
                obj = obj2;
                break;
            }
        }
        walletTransactionAppModel = (WalletTransactionAppModel) obj;
        if (walletTransactionAppModel != null) {
            return new WalletMoneyAddedNavigationModel(loadMoneyPaymentCompleteData2.b, -1, LoadMoneyOrderStatus.PROCESSING);
        }
        int i4 = walletTransactionAppModel.f;
        int d = walletAndAllTransactions.f11093a.getD();
        WalletTransactionStatus walletTransactionStatus = walletTransactionAppModel.g;
        Intrinsics.i(walletTransactionStatus, "<this>");
        i = WalletAndQuickPayStatusMapperKt.WhenMappings.d[walletTransactionStatus.ordinal()];
        if (i != 1 || i == 2) {
            loadMoneyOrderStatus = LoadMoneyOrderStatus.PROCESSING;
        } else if (i == 3) {
            loadMoneyOrderStatus = LoadMoneyOrderStatus.REFUNDED;
        } else if (i == 4) {
            loadMoneyOrderStatus = LoadMoneyOrderStatus.SUCCESS;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            loadMoneyOrderStatus = LoadMoneyOrderStatus.FAILED;
        }
        return new WalletMoneyAddedNavigationModel(i4, d, loadMoneyOrderStatus);
        addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1.L$0 = loadMoneyPaymentCompleteData3;
        addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1.L$1 = loadMoneyAppModel;
        obj = null;
        addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1.L$2 = null;
        addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1.label = 2;
        objD = this.b.d(walletTypeIdentifier2, true, addProcessingLoadMoneyTransactionsAndSyncWalletUseCase$invoke$1);
        if (objD != coroutineSingletons) {
            loadMoneyPaymentCompleteData2 = loadMoneyPaymentCompleteData3;
            loadMoneyAppModel2 = loadMoneyAppModel;
            chaloUseCaseResult = (ChaloUseCaseResult) objD;
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                    return new WalletMoneyAddedNavigationModel(loadMoneyPaymentCompleteData2.b, -1, LoadMoneyOrderStatus.PROCESSING);
                }
                throw new NoWhenBranchMatchedException();
            }
            walletAndAllTransactions = (WalletAndAllTransactions) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            while (r4.hasNext()) {
                walletTransactionAppModel2 = (WalletTransactionAppModel) obj2;
                if (!Intrinsics.d(walletTransactionAppModel2.f11016a, loadMoneyAppModel2.d)) {
                }
            }
            walletTransactionAppModel = (WalletTransactionAppModel) obj;
            if (walletTransactionAppModel != null) {
                return new WalletMoneyAddedNavigationModel(loadMoneyPaymentCompleteData2.b, -1, LoadMoneyOrderStatus.PROCESSING);
            }
            int i5 = walletTransactionAppModel.f;
            int d2 = walletAndAllTransactions.f11093a.getD();
            WalletTransactionStatus walletTransactionStatus2 = walletTransactionAppModel.g;
            Intrinsics.i(walletTransactionStatus2, "<this>");
            i = WalletAndQuickPayStatusMapperKt.WhenMappings.d[walletTransactionStatus2.ordinal()];
            if (i != 1) {
                loadMoneyOrderStatus = LoadMoneyOrderStatus.PROCESSING;
            } else {
                loadMoneyOrderStatus = LoadMoneyOrderStatus.PROCESSING;
            }
            return new WalletMoneyAddedNavigationModel(i5, d2, loadMoneyOrderStatus);
        }
        return coroutineSingletons;
    }
}
