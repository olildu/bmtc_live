package app.chalo.electricitybill.ui.paymenthistory;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.electricitybill.ui.paymenthistory.model.ElectricityBillPaymentHistoryUiModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.EBillPaymentInvoiceScreenArgs;
import defpackage.k2;
import defpackage.vo1;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.electricitybill.ui.paymenthistory.ElectricityBillPaymentHistoryComponent$handlePaymentHistoryClickedIntent$1", f = "ElectricityBillPaymentHistoryComponent.kt", l = {86}, m = "invokeSuspend", v = 1)
final class ElectricityBillPaymentHistoryComponent$handlePaymentHistoryClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ElectricityPaymentHistoryIntent.PaymentHistoryClicked $intent;
    int label;
    final /* synthetic */ ElectricityBillPaymentHistoryComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ElectricityBillPaymentHistoryComponent$handlePaymentHistoryClickedIntent$1(ElectricityBillPaymentHistoryComponent electricityBillPaymentHistoryComponent, ElectricityPaymentHistoryIntent.PaymentHistoryClicked paymentHistoryClicked, Continuation continuation) {
        super(2, continuation);
        this.this$0 = electricityBillPaymentHistoryComponent;
        this.$intent = paymentHistoryClicked;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ElectricityBillPaymentHistoryComponent$handlePaymentHistoryClickedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ElectricityBillPaymentHistoryComponent$handlePaymentHistoryClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ElectricityBillPaymentHistoryUiModel electricityBillPaymentHistoryUiModel;
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            AnalyticsContract.DefaultImpls.a(this.this$0.k, "eBill payment history clicked", "", vo1.s("eBill transactionId", this.$intent.f2600a), null, false, 24);
            List list = ((ElectricityPaymentHistoryDataState) this.this$0.f.getValue()).b;
            if (list != null) {
                ElectricityPaymentHistoryIntent.PaymentHistoryClicked paymentHistoryClicked = this.$intent;
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.d(((ElectricityBillPaymentHistoryUiModel) next).j, paymentHistoryClicked.f2600a));
                electricityBillPaymentHistoryUiModel = (ElectricityBillPaymentHistoryUiModel) next;
            } else {
                electricityBillPaymentHistoryUiModel = null;
            }
            if (electricityBillPaymentHistoryUiModel != null) {
                ChaloNavigationManager chaloNavigationManager = this.this$0.m;
                Json json = ChaloJson.b;
                json.getClass();
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new EBillPaymentInvoiceScreenArgs(json.a(ElectricityBillPaymentHistoryUiModel.INSTANCE.serializer(), electricityBillPaymentHistoryUiModel)), null, null, 6));
            } else {
                this.label = 1;
                obj = this.this$0.n.b(StringEnum.UNKNOWN_ERROR_OCCURRED, new Object[0], this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        this.this$0.E0(new k2((String) obj, 29));
        return Unit.f17538a;
    }
}
