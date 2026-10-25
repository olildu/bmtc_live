package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.resultstatemanager.ResultStateData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel$processOrderCreationSuccess$2", f = "ConfirmSuperPassPurchaseViewModel.kt", l = {1137, 1138}, m = "invokeSuspend", v = 1)
final class ConfirmSuperPassPurchaseViewModel$processOrderCreationSuccess$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CreateOrderResponseAppModel $result;
    int label;
    final /* synthetic */ ConfirmSuperPassPurchaseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmSuperPassPurchaseViewModel$processOrderCreationSuccess$2(ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel, CreateOrderResponseAppModel createOrderResponseAppModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = confirmSuperPassPurchaseViewModel;
        this.$result = createOrderResponseAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConfirmSuperPassPurchaseViewModel$processOrderCreationSuccess$2(this.this$0, this.$result, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfirmSuperPassPurchaseViewModel$processOrderCreationSuccess$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel = this.this$0;
            Flow flowB = confirmSuperPassPurchaseViewModel.u.b(this.$result.f);
            this.label = 1;
            obj = confirmSuperPassPurchaseViewModel.b.v(flowB, this);
            if (obj != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel2 = this.this$0;
        CreateOrderResponseAppModel createOrderResponseAppModel = this.$result;
        this.label = 2;
        ConfirmSuperPassPurchaseViewModel.r(confirmSuperPassPurchaseViewModel2, (ResultStateData) obj, createOrderResponseAppModel);
        return unit == coroutineSingletons ? coroutineSingletons : unit;
    }
}
