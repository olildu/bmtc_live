package app.chalo.mticket.ui.passengerselection;

import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.mticket.ui.passengerselection.MTicketPassengerSelectionComponent$createOrderAndNavigate$invalidStateHandling$1", f = "MTicketPassengerSelectionComponent.kt", l = {348}, m = "invokeSuspend", v = 1)
final class MTicketPassengerSelectionComponent$createOrderAndNavigate$invalidStateHandling$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ MTicketPassengerSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTicketPassengerSelectionComponent$createOrderAndNavigate$invalidStateHandling$1(MTicketPassengerSelectionComponent mTicketPassengerSelectionComponent, Continuation continuation) {
        super(1, continuation);
        this.this$0 = mTicketPassengerSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MTicketPassengerSelectionComponent$createOrderAndNavigate$invalidStateHandling$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((MTicketPassengerSelectionComponent$createOrderAndNavigate$invalidStateHandling$1) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KotlinToastManager kotlinToastManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            MTicketPassengerSelectionComponent mTicketPassengerSelectionComponent = this.this$0;
            KotlinToastManager kotlinToastManager2 = mTicketPassengerSelectionComponent.s;
            this.L$0 = kotlinToastManager2;
            this.label = 1;
            obj = mTicketPassengerSelectionComponent.t.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            kotlinToastManager = kotlinToastManager2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) this.L$0;
            ResultKt.b(obj);
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) obj, ToastLength.LONG);
        return Unit.f17538a;
    }
}
