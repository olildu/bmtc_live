package app.chalo.ncmc.ui.transactionhistory;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.data.BookingsRequestType;
import app.chalo.ncmc.cardreceipt.ChaloCardReceiptData;
import app.chalo.ncmc.cardreceipt.ChaloCardReceiptManager;
import app.chalo.ncmc.data.cardtransactions.CardMerchantTransactionAppModel;
import app.chalo.ncmc.data.cardtransactions.CardPassPurchaseTransactionAppModel;
import app.chalo.ncmc.data.cardtransactions.CardRechargeTransactionAppModel;
import app.chalo.ncmc.data.cardtransactions.CardTicketPaymentMode;
import app.chalo.ncmc.data.cardtransactions.CardTicketTransactionAppModel;
import app.chalo.ncmc.data.cardtransactions.CardTransaction;
import app.chalo.ncmc.data.cardtransactions.CardUnknownTransactionAppModel;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.TripSummaryArgs;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryComponent$handleTransactionClickedIntent$1", f = "CardTransactionHistoryComponent.kt", l = {277, 329}, m = "invokeSuspend", v = 1)
final class CardTransactionHistoryComponent$handleTransactionClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CardTransactionHistoryIntent.TransactionClickedIntent $intent;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CardTransactionHistoryComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardTransactionHistoryComponent$handleTransactionClickedIntent$1(CardTransactionHistoryComponent cardTransactionHistoryComponent, CardTransactionHistoryIntent.TransactionClickedIntent transactionClickedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cardTransactionHistoryComponent;
        this.$intent = transactionClickedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardTransactionHistoryComponent$handleTransactionClickedIntent$1 cardTransactionHistoryComponent$handleTransactionClickedIntent$1 = new CardTransactionHistoryComponent$handleTransactionClickedIntent$1(this.this$0, this.$intent, continuation);
        cardTransactionHistoryComponent$handleTransactionClickedIntent$1.L$0 = obj;
        return cardTransactionHistoryComponent$handleTransactionClickedIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CardTransactionHistoryComponent$handleTransactionClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object objB;
        KotlinToastManager kotlinToastManager;
        Object objB2;
        KotlinToastManager kotlinToastManager2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i == 1) {
                kotlinToastManager2 = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                objB2 = obj;
                KotlinToastManagerKt.a(kotlinToastManager2, (String) objB2, ToastLength.LONG);
                return unit;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
            objB = obj;
            KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
            return unit;
        }
        ResultKt.b(obj);
        ArrayList arrayList = this.this$0.w;
        CardTransactionHistoryIntent.TransactionClickedIntent transactionClickedIntent = this.$intent;
        int size = arrayList.size();
        int i2 = 0;
        do {
            if (i2 >= size) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i2);
            i2++;
        } while (!Intrinsics.d(((CardTransaction) obj2).getF6178a(), transactionClickedIntent.b));
        CardTransaction cardTransaction = (CardTransaction) obj2;
        if (cardTransaction == null) {
            CardTransactionHistoryComponent cardTransactionHistoryComponent = this.this$0;
            KotlinToastManager kotlinToastManager3 = cardTransactionHistoryComponent.r;
            this.L$0 = kotlinToastManager3;
            this.label = 1;
            objB2 = cardTransactionHistoryComponent.m.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
            if (objB2 != coroutineSingletons) {
                kotlinToastManager2 = kotlinToastManager3;
                KotlinToastManagerKt.a(kotlinToastManager2, (String) objB2, ToastLength.LONG);
                return unit;
            }
        } else {
            CardTransactionHistoryComponent cardTransactionHistoryComponent2 = this.this$0;
            CardTransactionHistoryIntent.TransactionClickedIntent transactionClickedIntent2 = this.$intent;
            CardTransactionTypeUiModel cardTransactionTypeUiModel = transactionClickedIntent2.f6433a;
            String str = transactionClickedIntent2.b;
            AnalyticsContract analyticsContract = cardTransactionHistoryComponent2.p;
            String str2 = cardTransactionHistoryComponent2.x;
            if (str2 == null) {
                str2 = "";
            }
            AnalyticsContract.DefaultImpls.a(analyticsContract, "chalo card transaction clicked", "CardTransactionsViewModel", MapsKt.i(new Pair("cardNumber", str2), new Pair("transactionType", cardTransactionTypeUiModel.name()), new Pair("transaction id", str)), null, false, 24);
            if (cardTransaction instanceof CardRechargeTransactionAppModel) {
                CardTransactionHistoryComponent.G0(this.this$0, cardTransaction, this.$intent.f6433a);
                return unit;
            }
            if (cardTransaction instanceof CardPassPurchaseTransactionAppModel) {
                CardTransactionHistoryComponent.G0(this.this$0, cardTransaction, this.$intent.f6433a);
                return unit;
            }
            if (cardTransaction instanceof CardTicketTransactionAppModel) {
                ChaloCardReceiptManager chaloCardReceiptManager = this.this$0.q;
                CardTicketTransactionAppModel cardTicketTransactionAppModel = (CardTicketTransactionAppModel) cardTransaction;
                String str3 = cardTicketTransactionAppModel.f6178a;
                CardTicketPaymentMode cardTicketPaymentMode = cardTicketTransactionAppModel.d;
                boolean z = cardTicketPaymentMode == CardTicketPaymentMode.PASS;
                chaloCardReceiptManager.getClass();
                chaloCardReceiptManager.b.put(str3, new ChaloCardReceiptData(cardTicketTransactionAppModel.f6178a, cardTicketTransactionAppModel.b, z ? null : Long.valueOf(cardTicketTransactionAppModel.c.f6190a), cardTicketPaymentMode != null ? cardTicketPaymentMode.getLabel() : null, cardTicketTransactionAppModel.e, cardTicketTransactionAppModel.f, cardTicketTransactionAppModel.g, cardTicketTransactionAppModel.h, cardTicketTransactionAppModel.i, RouteNamingSchemeType.DEFAULT));
                ChaloNavigationManagerKt.e(this.this$0.s, new TripSummaryArgs.TicketSummaryScreen(Source.CHALO_CARD_TRANSACTIONS_SCREEN, new BookingsRequestType.CardTransactionReceiptType(str3)), null, 6);
                return unit;
            }
            if (cardTransaction instanceof CardMerchantTransactionAppModel) {
                CardTransactionHistoryComponent.G0(this.this$0, cardTransaction, this.$intent.f6433a);
                return unit;
            }
            if (!(cardTransaction instanceof CardUnknownTransactionAppModel)) {
                throw new NoWhenBranchMatchedException();
            }
            CardTransactionHistoryComponent cardTransactionHistoryComponent3 = this.this$0;
            KotlinToastManager kotlinToastManager4 = cardTransactionHistoryComponent3.r;
            this.L$0 = kotlinToastManager4;
            this.label = 2;
            objB = cardTransactionHistoryComponent3.m.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
            if (objB != coroutineSingletons) {
                kotlinToastManager = kotlinToastManager4;
                KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
                return unit;
            }
        }
        return coroutineSingletons;
    }
}
