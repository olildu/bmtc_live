package app.chalo.instantticket.ui.faredetails;

import defpackage.n10;
import defpackage.w20;
import kotlin.Metadata;
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
@DebugMetadata(c = "app.chalo.instantticket.ui.faredetails.FareDetailsComponent$handleOnPassengerCategorySelectedIntent$1", f = "FareDetailsComponent.kt", l = {334}, m = "invokeSuspend", v = 1)
final class FareDetailsComponent$handleOnPassengerCategorySelectedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $passengerId;
    int label;
    final /* synthetic */ FareDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FareDetailsComponent$handleOnPassengerCategorySelectedIntent$1(FareDetailsComponent fareDetailsComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fareDetailsComponent;
        this.$passengerId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FareDetailsComponent$handleOnPassengerCategorySelectedIntent$1(this.this$0, this.$passengerId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FareDetailsComponent$handleOnPassengerCategorySelectedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            this.this$0.E0(new n10(this.$passengerId, 6));
            FareDetailsComponent fareDetailsComponent = this.this$0;
            this.label = 1;
            if (FareDetailsComponent.Q0(fareDetailsComponent, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        FareDetailsComponent fareDetailsComponent2 = this.this$0;
        String strA = fareDetailsComponent2.n.a(FareDetailsComponent.I0(fareDetailsComponent2), this.this$0.Q);
        FareDetailsComponent fareDetailsComponent3 = this.this$0;
        fareDetailsComponent3.E0(new w20(fareDetailsComponent3, strA, 3));
        return Unit.f17538a;
    }
}
