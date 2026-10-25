package app.chalo.multimodalticket.domain;

import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/chalo/multimodalticket/data/model/app/MultiModalGroupTicketAppModel;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$toAppModelFlow$3", f = "MultiModalGroupTicketEntityToAppModelConverter.kt", l = {72}, m = "invokeSuspend", v = 1)
final class MultiModalGroupTicketEntityToAppModelConverter$toAppModelFlow$3 extends SuspendLambda implements Function3<FlowCollector<? super MultiModalGroupTicketAppModel>, Throwable, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MultiModalGroupTicketEntityToAppModelConverter$toAppModelFlow$3 multiModalGroupTicketEntityToAppModelConverter$toAppModelFlow$3 = new MultiModalGroupTicketEntityToAppModelConverter$toAppModelFlow$3(3, (Continuation) obj3);
        multiModalGroupTicketEntityToAppModelConverter$toAppModelFlow$3.L$0 = (FlowCollector) obj;
        return multiModalGroupTicketEntityToAppModelConverter$toAppModelFlow$3.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            this.label = 1;
            if (flowCollector.emit(null, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
