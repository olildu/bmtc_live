package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.livetracking.routedetails.analytics.StopDetailsForAnalytics;
import app.chalo.location.LatLng;
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
@DebugMetadata(c = "app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$raiseStopSelectionEvent$1", f = "RouteDetailsComponent.kt", l = {2708}, m = "invokeSuspend", v = 1)
final class RouteDetailsComponent$raiseStopSelectionEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $eventName;
    final /* synthetic */ int $newStopIndex;
    final /* synthetic */ int $prevStopIndex;
    final /* synthetic */ RouteAppModel $routeAppModel;
    final /* synthetic */ LatLng $stopLocation;
    final /* synthetic */ String $stopSearchQuery;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ RouteDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDetailsComponent$raiseStopSelectionEvent$1(int i, RouteAppModel routeAppModel, int i2, LatLng latLng, RouteDetailsComponent routeDetailsComponent, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.$prevStopIndex = i;
        this.$routeAppModel = routeAppModel;
        this.$newStopIndex = i2;
        this.$stopLocation = latLng;
        this.this$0 = routeDetailsComponent;
        this.$eventName = str;
        this.$stopSearchQuery = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteDetailsComponent$raiseStopSelectionEvent$1(this.$prevStopIndex, this.$routeAppModel, this.$newStopIndex, this.$stopLocation, this.this$0, this.$eventName, this.$stopSearchQuery, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteDetailsComponent$raiseStopSelectionEvent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Double d;
        StopDetailsForAnalytics stopDetailsForAnalytics;
        StopAppModel stopAppModel;
        StopAppModel stopAppModel2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = this.$prevStopIndex;
            d = null;
            if (i2 != -1) {
                StopAppModel stopAppModel3 = (StopAppModel) this.$routeAppModel.e.get(i2);
                stopDetailsForAnalytics = new StopDetailsForAnalytics(stopAppModel3.b, stopAppModel3.f1727a, this.$prevStopIndex);
            } else {
                stopDetailsForAnalytics = null;
            }
            stopAppModel = (StopAppModel) this.$routeAppModel.e.get(this.$newStopIndex);
            LatLng latLng = this.$stopLocation;
            if (latLng != null) {
                RouteDetailsComponent routeDetailsComponent = this.this$0;
                this.L$0 = stopDetailsForAnalytics;
                this.L$1 = stopAppModel;
                this.label = 1;
                Object objI0 = RouteDetailsComponent.I0(routeDetailsComponent, latLng, this);
                if (objI0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                stopAppModel2 = stopAppModel;
                obj = objI0;
            }
            this.this$0.z.h(this.$eventName, stopDetailsForAnalytics, new StopDetailsForAnalytics(stopAppModel.b, stopAppModel.f1727a, this.$newStopIndex), String.valueOf(this.$stopSearchQuery), d);
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        stopAppModel2 = (StopAppModel) this.L$1;
        stopDetailsForAnalytics = (StopDetailsForAnalytics) this.L$0;
        ResultKt.b(obj);
        d = (Double) obj;
        stopAppModel = stopAppModel2;
        this.this$0.z.h(this.$eventName, stopDetailsForAnalytics, new StopDetailsForAnalytics(stopAppModel.b, stopAppModel.f1727a, this.$newStopIndex), String.valueOf(this.$stopSearchQuery), d);
        return Unit.f17538a;
    }
}
