package app.chalo.ncmc.ui.ncmcofflinerecharge;

import app.chalo.usecase.LoadMoneyAmountValidationUseCase;
import app.chalo.usecase.LoadMoneyFailureReason;
import app.chalo.usecase.LoadMoneyValidationFailureType;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.hj0;
import defpackage.qi;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeComponent$handleRechargeAmountEnteredIntent$1", f = "OfflineCardRechargeComponent.kt", l = {443}, m = "invokeSuspend", v = 1)
final class OfflineCardRechargeComponent$handleRechargeAmountEnteredIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $newAmount;
    int label;
    final /* synthetic */ OfflineCardRechargeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineCardRechargeComponent$handleRechargeAmountEnteredIntent$1(OfflineCardRechargeComponent offlineCardRechargeComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = offlineCardRechargeComponent;
        this.$newAmount = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OfflineCardRechargeComponent$handleRechargeAmountEnteredIntent$1(this.this$0, this.$newAmount, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OfflineCardRechargeComponent$handleRechargeAmountEnteredIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OfflineCardRechargeComponent$handleRechargeAmountEnteredIntent$1 offlineCardRechargeComponent$handleRechargeAmountEnteredIntent$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            OfflineCardRechargeComponent offlineCardRechargeComponent = this.this$0;
            LoadMoneyAmountValidationUseCase loadMoneyAmountValidationUseCase = offlineCardRechargeComponent.m;
            String str = this.$newAmount;
            Long l = ((OfflineCardRechargeViewState) offlineCardRechargeComponent.f.getValue()).g;
            long jLongValue = l != null ? l.longValue() : 1000L;
            Long l2 = ((OfflineCardRechargeViewState) this.this$0.f.getValue()).i;
            long jLongValue2 = (l2 == null && (l2 = ((OfflineCardRechargeViewState) this.this$0.f.getValue()).e) == null) ? 1700000L : l2.longValue();
            this.label = 1;
            offlineCardRechargeComponent$handleRechargeAmountEnteredIntent$1 = this;
            obj = loadMoneyAmountValidationUseCase.a(str, jLongValue, jLongValue2, offlineCardRechargeComponent$handleRechargeAmountEnteredIntent$1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            offlineCardRechargeComponent$handleRechargeAmountEnteredIntent$1 = this;
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            ChaloUseCaseResult.Failure failure = (ChaloUseCaseResult.Failure) chaloUseCaseResult;
            offlineCardRechargeComponent$handleRechargeAmountEnteredIntent$1.this$0.E0(new qi(failure, offlineCardRechargeComponent$handleRechargeAmountEnteredIntent$1.$newAmount, ((LoadMoneyFailureReason) failure.f10418a).f10214a != LoadMoneyValidationFailureType.ENTERED_AMOUNT_LESS_THAN_MIN_AMOUNT, 6));
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            offlineCardRechargeComponent$handleRechargeAmountEnteredIntent$1.this$0.E0(new hj0(offlineCardRechargeComponent$handleRechargeAmountEnteredIntent$1.$newAmount, 18));
        }
        return Unit.f17538a;
    }
}
