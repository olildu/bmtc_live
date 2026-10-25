package app.chalo.ncmc.ui.transactionhistory;

import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.ncmc.data.cardtransactions.CardMerchantTransactionAppModel;
import app.chalo.ncmc.data.cardtransactions.CardPassPurchaseTransactionAppModel;
import app.chalo.ncmc.data.cardtransactions.CardRechargeTransactionAppModel;
import app.chalo.ncmc.data.cardtransactions.CardTicketPaymentMode;
import app.chalo.ncmc.data.cardtransactions.CardTicketTransactionAppModel;
import app.chalo.ncmc.data.cardtransactions.CardTransaction;
import app.chalo.ncmc.data.cardtransactions.CardTransactionFareInfoAppModel;
import app.chalo.ncmc.data.cardtransactions.CardUnknownTransactionAppModel;
import app.chalo.utils.timeutil.TimeUtilsContract;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionUiModel;", "transaction", "Lapp/chalo/ncmc/data/cardtransactions/CardTransaction;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryComponent$handleCardTransactionSuccess$1$1", f = "CardTransactionHistoryComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class CardTransactionHistoryComponent$handleCardTransactionSuccess$1$1 extends SuspendLambda implements Function2<CardTransaction, Continuation<? super CardTransactionUiModel>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CardTransactionHistoryComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardTransactionHistoryComponent$handleCardTransactionSuccess$1$1(CardTransactionHistoryComponent cardTransactionHistoryComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cardTransactionHistoryComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardTransactionHistoryComponent$handleCardTransactionSuccess$1$1 cardTransactionHistoryComponent$handleCardTransactionSuccess$1$1 = new CardTransactionHistoryComponent$handleCardTransactionSuccess$1$1(this.this$0, continuation);
        cardTransactionHistoryComponent$handleCardTransactionSuccess$1$1.L$0 = obj;
        return cardTransactionHistoryComponent$handleCardTransactionSuccess$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CardTransactionHistoryComponent$handleCardTransactionSuccess$1$1) create((CardTransaction) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CardTransactionTypeUiModel cardTransactionTypeUiModel;
        CardTransactionFareInfoAppModel c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        CardTransaction cardTransaction = (CardTransaction) this.L$0;
        String message = "Processing transaction: " + cardTransaction;
        Intrinsics.i(message, "message");
        ArrayList arrayList = this.this$0.w;
        if (arrayList != null && arrayList.isEmpty()) {
            this.this$0.w.add(cardTransaction);
            break;
        }
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                this.this$0.w.add(cardTransaction);
                break;
            }
            obj2 = arrayList.get(i);
            i++;
        } while (!Intrinsics.d(((CardTransaction) obj2).getF6178a(), cardTransaction.getF6178a()));
        if (cardTransaction instanceof CardMerchantTransactionAppModel) {
            cardTransactionTypeUiModel = CardTransactionTypeUiModel.MERCHANT;
        } else if (cardTransaction instanceof CardPassPurchaseTransactionAppModel) {
            cardTransactionTypeUiModel = CardTransactionTypeUiModel.PASS_PURCHASE;
        } else if (cardTransaction instanceof CardRechargeTransactionAppModel) {
            cardTransactionTypeUiModel = CardTransactionTypeUiModel.RECHARGE;
        } else if (cardTransaction instanceof CardTicketTransactionAppModel) {
            cardTransactionTypeUiModel = CardTransactionTypeUiModel.TICKET;
        } else {
            if (!(cardTransaction instanceof CardUnknownTransactionAppModel)) {
                throw new NoWhenBranchMatchedException();
            }
            cardTransactionTypeUiModel = CardTransactionTypeUiModel.UNKNOWN;
        }
        CardTransactionTypeUiModel cardTransactionTypeUiModel2 = cardTransactionTypeUiModel;
        String f6178a = cardTransaction.getF6178a();
        long b = cardTransaction.getB();
        String strA = TimeUtilsContract.DefaultImpls.a(this.this$0.o, cardTransaction.getB(), null, 6);
        this.this$0.getClass();
        return new CardTransactionUiModel(cardTransactionTypeUiModel2, f6178a, b, strA, ((cardTransactionTypeUiModel2 != CardTransactionTypeUiModel.TICKET || ((cardTransaction instanceof CardTicketTransactionAppModel) && ((CardTicketTransactionAppModel) cardTransaction).d != CardTicketPaymentMode.PASS)) && (c = cardTransaction.getC()) != null) ? this.this$0.n.a(c.f6190a, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING) : null, cardTransaction instanceof CardTicketTransactionAppModel ? ((CardTicketTransactionAppModel) cardTransaction).d : null);
    }
}
