package app.chalo.walletframework.quickpay.domain;

import app.chalo.features.wallet.WalletSyncRequest;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.quickpay.data.model.appmodel.WalletScopedQuickPay;
import app.chalo.walletframework.quickpay.data.repository.QuickPayRepository;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModelKt;
import app.chalo.walletframework.wallet.domain.WalletSyncOrchestrator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/quickpay/domain/FetchQuickPayReceiptForTransactionIdUseCase;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchQuickPayReceiptForTransactionIdUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QuickPayRepository f10934a;
    public final WalletSyncOrchestrator b;

    public FetchQuickPayReceiptForTransactionIdUseCase(QuickPayRepository quickPayRepository, WalletSyncOrchestrator walletSyncOrchestrator) {
        this.f10934a = quickPayRepository;
        this.b = walletSyncOrchestrator;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0090  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:43:0x0096 A[Catch: QuickPayReceiptFetchFailedException -> 0x0111, TRY_ENTER, TryCatch #0 {QuickPayReceiptFetchFailedException -> 0x0111, blocks: (B:16:0x0035, B:70:0x00fa, B:21:0x0046, B:56:0x00c5, B:57:0x00cf, B:59:0x00d5, B:61:0x00db, B:66:0x00eb, B:67:0x00ef, B:74:0x0106, B:24:0x004f, B:49:0x00a8, B:43:0x0096, B:45:0x009a, B:50:0x00b3, B:52:0x00b7, B:72:0x0100, B:73:0x0105), top: B:78:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x009a A[Catch: QuickPayReceiptFetchFailedException -> 0x0111, TryCatch #0 {QuickPayReceiptFetchFailedException -> 0x0111, blocks: (B:16:0x0035, B:70:0x00fa, B:21:0x0046, B:56:0x00c5, B:57:0x00cf, B:59:0x00d5, B:61:0x00db, B:66:0x00eb, B:67:0x00ef, B:74:0x0106, B:24:0x004f, B:49:0x00a8, B:43:0x0096, B:45:0x009a, B:50:0x00b3, B:52:0x00b7, B:72:0x0100, B:73:0x0105), top: B:78:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3 A[Catch: QuickPayReceiptFetchFailedException -> 0x0111, TryCatch #0 {QuickPayReceiptFetchFailedException -> 0x0111, blocks: (B:16:0x0035, B:70:0x00fa, B:21:0x0046, B:56:0x00c5, B:57:0x00cf, B:59:0x00d5, B:61:0x00db, B:66:0x00eb, B:67:0x00ef, B:74:0x0106, B:24:0x004f, B:49:0x00a8, B:43:0x0096, B:45:0x009a, B:50:0x00b3, B:52:0x00b7, B:72:0x0100, B:73:0x0105), top: B:78:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b7 A[Catch: QuickPayReceiptFetchFailedException -> 0x0111, TryCatch #0 {QuickPayReceiptFetchFailedException -> 0x0111, blocks: (B:16:0x0035, B:70:0x00fa, B:21:0x0046, B:56:0x00c5, B:57:0x00cf, B:59:0x00d5, B:61:0x00db, B:66:0x00eb, B:67:0x00ef, B:74:0x0106, B:24:0x004f, B:49:0x00a8, B:43:0x0096, B:45:0x009a, B:50:0x00b3, B:52:0x00b7, B:72:0x0100, B:73:0x0105), top: B:78:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d5 A[Catch: QuickPayReceiptFetchFailedException -> 0x0111, TryCatch #0 {QuickPayReceiptFetchFailedException -> 0x0111, blocks: (B:16:0x0035, B:70:0x00fa, B:21:0x0046, B:56:0x00c5, B:57:0x00cf, B:59:0x00d5, B:61:0x00db, B:66:0x00eb, B:67:0x00ef, B:74:0x0106, B:24:0x004f, B:49:0x00a8, B:43:0x0096, B:45:0x009a, B:50:0x00b3, B:52:0x00b7, B:72:0x0100, B:73:0x0105), top: B:78:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00db A[Catch: QuickPayReceiptFetchFailedException -> 0x0111, TryCatch #0 {QuickPayReceiptFetchFailedException -> 0x0111, blocks: (B:16:0x0035, B:70:0x00fa, B:21:0x0046, B:56:0x00c5, B:57:0x00cf, B:59:0x00d5, B:61:0x00db, B:66:0x00eb, B:67:0x00ef, B:74:0x0106, B:24:0x004f, B:49:0x00a8, B:43:0x0096, B:45:0x009a, B:50:0x00b3, B:52:0x00b7, B:72:0x0100, B:73:0x0105), top: B:78:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb A[Catch: QuickPayReceiptFetchFailedException -> 0x0111, TryCatch #0 {QuickPayReceiptFetchFailedException -> 0x0111, blocks: (B:16:0x0035, B:70:0x00fa, B:21:0x0046, B:56:0x00c5, B:57:0x00cf, B:59:0x00d5, B:61:0x00db, B:66:0x00eb, B:67:0x00ef, B:74:0x0106, B:24:0x004f, B:49:0x00a8, B:43:0x0096, B:45:0x009a, B:50:0x00b3, B:52:0x00b7, B:72:0x0100, B:73:0x0105), top: B:78:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0100 A[Catch: QuickPayReceiptFetchFailedException -> 0x0111, TryCatch #0 {QuickPayReceiptFetchFailedException -> 0x0111, blocks: (B:16:0x0035, B:70:0x00fa, B:21:0x0046, B:56:0x00c5, B:57:0x00cf, B:59:0x00d5, B:61:0x00db, B:66:0x00eb, B:67:0x00ef, B:74:0x0106, B:24:0x004f, B:49:0x00a8, B:43:0x0096, B:45:0x009a, B:50:0x00b3, B:52:0x00b7, B:72:0x0100, B:73:0x0105), top: B:78:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f7, code lost:
    
        if (r8.b(r11, r0) == r1) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.quickpay.domain.FetchQuickPayReceiptForTransactionIdUseCase.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        FetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1 fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1;
        Object objQ;
        ChaloUseCaseResult chaloUseCaseResult;
        Object objQ2;
        if (continuationImpl instanceof FetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1) {
            fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1 = (FetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1) continuationImpl;
            int i = fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1 = new FetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1(this, continuationImpl);
            }
        } else {
            fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1 = new FetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1(this, continuationImpl);
        }
        Object objQ3 = fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1.label;
        QuickPayRepository quickPayRepository = this.f10934a;
        if (i2 == 0) {
            ResultKt.b(objQ3);
            fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1.L$0 = str;
            fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1.label = 1;
            objQ3 = quickPayRepository.q(str, fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1);
            if (objQ3 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                str = (String) fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1.L$0;
                ResultKt.b(objQ3);
                fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1.L$0 = null;
                fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1.label = 3;
                objQ = quickPayRepository.q(str, fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1);
                if (objQ != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return objQ;
            }
            if (i2 == 3) {
                ResultKt.b(objQ3);
                return objQ3;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objQ3);
                return objQ3;
            }
            str = (String) fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1.L$0;
            ResultKt.b(objQ3);
            chaloUseCaseResult = (ChaloUseCaseResult) objQ3;
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                return null;
            }
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                throw new NoWhenBranchMatchedException();
            }
            fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1.L$0 = null;
            fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1.label = 5;
            objQ2 = quickPayRepository.q(str, fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1);
            if (objQ2 != coroutineSingletons) {
                return coroutineSingletons;
            }
            return objQ2;
        }
        str = (String) fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1.L$0;
        ResultKt.b(objQ3);
        WalletScopedQuickPay walletScopedQuickPay = (WalletScopedQuickPay) objQ3;
        WalletSyncOrchestrator walletSyncOrchestrator = this.b;
        if (walletScopedQuickPay == null) {
            fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1.L$0 = str;
            fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1.label = 2;
            if (walletSyncOrchestrator.c(true, fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1) != coroutineSingletons) {
                fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1.L$0 = null;
                fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1.label = 3;
                objQ = quickPayRepository.q(str, fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1);
                if (objQ != coroutineSingletons) {
                    return objQ;
                }
            }
        } else {
            WalletSyncRequest walletSyncRequestA = WalletAppModelKt.a(walletScopedQuickPay.b);
            fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1.L$0 = str;
            fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1.label = 4;
            objQ3 = walletSyncOrchestrator.b(walletSyncRequestA, fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1, true);
            if (objQ3 != coroutineSingletons) {
                chaloUseCaseResult = (ChaloUseCaseResult) objQ3;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                    return null;
                }
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    throw new NoWhenBranchMatchedException();
                }
                fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1.L$0 = null;
                fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1.label = 5;
                objQ2 = quickPayRepository.q(str, fetchQuickPayReceiptForTransactionIdUseCase$resolveWalletScopedQuickPayForTransaction$1);
                if (objQ2 != coroutineSingletons) {
                    return objQ2;
                }
            }
        }
        return coroutineSingletons;
    }
}
