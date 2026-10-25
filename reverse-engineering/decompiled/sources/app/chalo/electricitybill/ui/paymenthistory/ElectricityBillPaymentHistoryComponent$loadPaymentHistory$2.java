package app.chalo.electricitybill.ui.paymenthistory;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.electricitybill.domain.EBillFetchPaymentHistoryUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.v00;
import defpackage.yg;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.electricitybill.ui.paymenthistory.ElectricityBillPaymentHistoryComponent$loadPaymentHistory$2", f = "ElectricityBillPaymentHistoryComponent.kt", l = {104}, m = "invokeSuspend", v = 1)
final class ElectricityBillPaymentHistoryComponent$loadPaymentHistory$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ElectricityBillPaymentHistoryComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ElectricityBillPaymentHistoryComponent$loadPaymentHistory$2(ElectricityBillPaymentHistoryComponent electricityBillPaymentHistoryComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = electricityBillPaymentHistoryComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ElectricityBillPaymentHistoryComponent$loadPaymentHistory$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ElectricityBillPaymentHistoryComponent$loadPaymentHistory$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            EBillFetchPaymentHistoryUseCase eBillFetchPaymentHistoryUseCase = this.this$0.l;
            this.label = 1;
            obj = eBillFetchPaymentHistoryUseCase.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            AnalyticsContract.DefaultImpls.a(this.this$0.k, "eBill payment history load error", "", null, null, false, 28);
            this.this$0.E0(new v00((ChaloUseCaseResult.Failure) chaloUseCaseResult, 1));
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            AnalyticsContract.DefaultImpls.a(this.this$0.k, "eBill payment history load success", "", null, null, false, 28);
            this.this$0.E0(new yg((ChaloUseCaseResult.Success) chaloUseCaseResult, 5));
        }
        return Unit.f17538a;
    }
}
