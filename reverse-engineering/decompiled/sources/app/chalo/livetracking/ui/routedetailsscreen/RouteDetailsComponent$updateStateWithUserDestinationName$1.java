package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.livetracking.routedetails.data.local.datastore.RouteDetailsLocalDataStore;
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
@DebugMetadata(c = "app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$updateStateWithUserDestinationName$1", f = "RouteDetailsComponent.kt", l = {1491}, m = "invokeSuspend", v = 1)
final class RouteDetailsComponent$updateStateWithUserDestinationName$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $newStopIndex;
    final /* synthetic */ RouteAppModel $routeAppModel;
    int label;
    final /* synthetic */ RouteDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDetailsComponent$updateStateWithUserDestinationName$1(int i, RouteAppModel routeAppModel, RouteDetailsComponent routeDetailsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = routeDetailsComponent;
        this.$routeAppModel = routeAppModel;
        this.$newStopIndex = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RouteDetailsComponent routeDetailsComponent = this.this$0;
        return new RouteDetailsComponent$updateStateWithUserDestinationName$1(this.$newStopIndex, this.$routeAppModel, routeDetailsComponent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteDetailsComponent$updateStateWithUserDestinationName$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            RouteDetailsLocalDataStore routeDetailsLocalDataStore = this.this$0.E;
            RouteAppModel routeAppModel = this.$routeAppModel;
            String str = routeAppModel.b;
            String str2 = ((StopAppModel) routeAppModel.e.get(this.$newStopIndex)).f1727a;
            this.label = 1;
            if (routeDetailsLocalDataStore.e(str, str2, this) == coroutineSingletons) {
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
