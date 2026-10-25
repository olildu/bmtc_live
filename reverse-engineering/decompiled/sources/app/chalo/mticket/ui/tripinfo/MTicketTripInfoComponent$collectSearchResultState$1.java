package app.chalo.mticket.ui.tripinfo;

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
@DebugMetadata(c = "app.chalo.mticket.ui.tripinfo.MTicketTripInfoComponent$collectSearchResultState$1", f = "MTicketTripInfoComponent.kt", l = {538}, m = "invokeSuspend", v = 1)
final class MTicketTripInfoComponent$collectSearchResultState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Boolean $isFromStopSelection;
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ MTicketTripInfoComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTicketTripInfoComponent$collectSearchResultState$1(MTicketTripInfoComponent mTicketTripInfoComponent, String str, Boolean bool, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mTicketTripInfoComponent;
        this.$requestId = str;
        this.$isFromStopSelection = bool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MTicketTripInfoComponent$collectSearchResultState$1(this.this$0, this.$requestId, this.$isFromStopSelection, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MTicketTripInfoComponent$collectSearchResultState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            MTicketTripInfoComponent mTicketTripInfoComponent = this.this$0;
            Flow flowB = mTicketTripInfoComponent.q.b(this.$requestId);
            this.label = 1;
            obj = mTicketTripInfoComponent.b.v(flowB, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        MTicketTripInfoComponent.G0(this.this$0, (ResultStateData) obj, this.$isFromStopSelection);
        return Unit.f17538a;
    }
}
