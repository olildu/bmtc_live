package app.chalo.wallet.ui.transactionsummary.model;

import app.chalo.wallet.data.mapper.WalletTransactionQuickPayLoadMoneyStatusMapperKt;
import app.chalo.walletframework.wallet.data.model.WalletTransactionStatus;
import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletTransactionAppModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.wallet.ui.transactionsummary.model.WalletTransactionSummaryUiModelKt", f = "WalletTransactionSummaryUiModel.kt", l = {47}, m = "toWalletTransactionSummaryUiModel", v = 1)
final class WalletTransactionSummaryUiModelKt$toWalletTransactionSummaryUiModel$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WalletTransactionStatusForIcon walletTransactionStatusForIcon;
        this.result = obj;
        int i = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i == 0) {
            ResultKt.b(obj);
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i2 = this.I$0;
        String str = (String) this.L$5;
        String str2 = (String) this.L$4;
        String str3 = (String) this.L$3;
        String str4 = (String) this.L$2;
        String str5 = (String) this.L$1;
        WalletTransactionAppModel walletTransactionAppModel = (WalletTransactionAppModel) this.L$0;
        ResultKt.b(obj);
        String str6 = (String) obj;
        WalletTransactionType walletTransactionType = walletTransactionAppModel.b;
        WalletTransactionStatus walletTransactionStatus = walletTransactionAppModel.g;
        Intrinsics.i(walletTransactionStatus, "<this>");
        int i3 = WalletTransactionQuickPayLoadMoneyStatusMapperKt.WhenMappings.f10768a[walletTransactionStatus.ordinal()];
        if (i3 == 1 || i3 == 2) {
            walletTransactionStatusForIcon = WalletTransactionStatusForIcon.PENDING;
        } else if (i3 == 3) {
            walletTransactionStatusForIcon = WalletTransactionStatusForIcon.SUCCESS;
        } else {
            if (i3 != 4 && i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            walletTransactionStatusForIcon = WalletTransactionStatusForIcon.FAILED;
        }
        return new WalletTransactionSummaryUiModel(str5, str4, str3, str2, str, i2 != 0, str6, walletTransactionType, walletTransactionStatusForIcon);
    }
}
