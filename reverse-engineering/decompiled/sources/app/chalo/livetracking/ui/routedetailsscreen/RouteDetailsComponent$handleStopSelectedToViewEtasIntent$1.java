package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsStopUiModel;
import defpackage.r31;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$handleStopSelectedToViewEtasIntent$1", f = "RouteDetailsComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class RouteDetailsComponent$handleStopSelectedToViewEtasIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RouteDetailsIntent.StopSelectedToViewEtasIntent $intent;
    int label;
    final /* synthetic */ RouteDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDetailsComponent$handleStopSelectedToViewEtasIntent$1(RouteDetailsComponent routeDetailsComponent, RouteDetailsIntent.StopSelectedToViewEtasIntent stopSelectedToViewEtasIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = routeDetailsComponent;
        this.$intent = stopSelectedToViewEtasIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteDetailsComponent$handleStopSelectedToViewEtasIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        RouteDetailsComponent$handleStopSelectedToViewEtasIntent$1 routeDetailsComponent$handleStopSelectedToViewEtasIntent$1 = (RouteDetailsComponent$handleStopSelectedToViewEtasIntent$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        routeDetailsComponent$handleStopSelectedToViewEtasIntent$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        RouteDetailsComponent routeDetailsComponent = this.this$0;
        RouteAppModel routeAppModel = routeDetailsComponent.Y;
        Unit unit = Unit.f17538a;
        if (routeAppModel == null) {
            return unit;
        }
        if (this.$intent.b) {
            RouteDetailsStopUiModel routeDetailsStopUiModel = (RouteDetailsStopUiModel) ((RouteDetailsDataState) routeDetailsComponent.f.getValue()).j.get(this.$intent.f4867a);
            RouteDetailsAnalyticsHelper.DefaultImpls.a(this.this$0.z, "Disabled stop selected", MapsKt.i(new Pair("stop name", routeDetailsStopUiModel.c), new Pair("stop id", routeDetailsStopUiModel.f4410a), new Pair("stopPosition", new Integer(this.$intent.f4867a))), 12);
            return unit;
        }
        routeDetailsComponent.E0(new r31(8));
        this.this$0.l1(this.$intent.f4867a, false);
        return unit;
    }
}
