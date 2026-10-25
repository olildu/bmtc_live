package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.TimeTableStatus;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel;
import app.chalo.livetracking.routedetails.data.model.ui.TrackingAdditionalFeatures;
import app.chalo.livetracking.routedetails.domain.GetRouteDetailsOptionsMenuListUseCase;
import defpackage.l11;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$updateRouteDetailsOptionsMenuList$1", f = "RouteDetailsComponent.kt", l = {931}, m = "invokeSuspend", v = 1)
final class RouteDetailsComponent$updateRouteDetailsOptionsMenuList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ RouteDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDetailsComponent$updateRouteDetailsOptionsMenuList$1(RouteDetailsComponent routeDetailsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = routeDetailsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteDetailsComponent$updateRouteDetailsOptionsMenuList$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteDetailsComponent$updateRouteDetailsOptionsMenuList$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RouteDetailsComponent routeDetailsComponent;
        TrackingAdditionalFeatures trackingAdditionalFeatures;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            RouteDetailsComponent routeDetailsComponent2 = this.this$0;
            RouteAppModel routeAppModel = routeDetailsComponent2.Y;
            if (routeAppModel != null) {
                GetRouteDetailsOptionsMenuListUseCase getRouteDetailsOptionsMenuListUseCase = routeDetailsComponent2.o;
                String str = routeAppModel.b;
                RouteDetailsIntentModel routeDetailsIntentModel = routeDetailsComponent2.X;
                boolean zContains = false;
                if (routeDetailsIntentModel != null && (trackingAdditionalFeatures = routeDetailsIntentModel.h) != null && trackingAdditionalFeatures.e) {
                    zContains = CollectionsKt.S(TimeTableStatus.VALID, TimeTableStatus.VALID_WITH_DISCLAIMER).contains(routeAppModel.i.f1722a);
                }
                this.L$0 = routeDetailsComponent2;
                this.label = 1;
                Object objA = getRouteDetailsOptionsMenuListUseCase.a(str, this, zContains);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                routeDetailsComponent = routeDetailsComponent2;
                obj = objA;
            }
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        routeDetailsComponent = (RouteDetailsComponent) this.L$0;
        ResultKt.b(obj);
        routeDetailsComponent.E0(new l11((List) obj, 3));
        return Unit.f17538a;
    }
}
