package app.chalo.metro.ui.confirmbooking;

import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.ResultStateKeeperMeta;
import app.chalo.resultstatemanager.ResultStateRecoveredData;
import app.chalo.resultstatemanager.checkout.CheckoutResultState;
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
@DebugMetadata(c = "app.chalo.metro.ui.confirmbooking.ConfirmBookingScreenComponent$1$1", f = "ConfirmBookingScreenComponent.kt", l = {79}, m = "invokeSuspend", v = 1)
final class ConfirmBookingScreenComponent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ResultStateRecoveredData<ResultStateKeeperMeta, CheckoutResultState> $recoveredData;
    Object L$0;
    int label;
    final /* synthetic */ ConfirmBookingScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmBookingScreenComponent$1$1(ConfirmBookingScreenComponent confirmBookingScreenComponent, ResultStateRecoveredData resultStateRecoveredData, Continuation continuation) {
        super(2, continuation);
        this.this$0 = confirmBookingScreenComponent;
        this.$recoveredData = resultStateRecoveredData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConfirmBookingScreenComponent$1$1(this.this$0, this.$recoveredData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfirmBookingScreenComponent$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ConfirmBookingScreenComponent confirmBookingScreenComponent;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ConfirmBookingScreenComponent confirmBookingScreenComponent2 = this.this$0;
            Flow flow = this.$recoveredData.b;
            this.L$0 = confirmBookingScreenComponent2;
            this.label = 1;
            Object objV = confirmBookingScreenComponent2.b.v(flow, this);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
            confirmBookingScreenComponent = confirmBookingScreenComponent2;
            obj = objV;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            confirmBookingScreenComponent = (ConfirmBookingScreenComponent) this.L$0;
            ResultKt.b(obj);
        }
        ConfirmBookingScreenComponent.H0(confirmBookingScreenComponent, (ResultStateData) obj);
        return Unit.f17538a;
    }
}
