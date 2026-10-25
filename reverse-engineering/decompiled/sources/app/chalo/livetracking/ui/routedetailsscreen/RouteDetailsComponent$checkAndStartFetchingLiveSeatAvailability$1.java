package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper;
import app.chalo.livetracking.routedetails.data.model.app.response.SeatAvailabilityAppModel;
import app.chalo.livetracking.routedetails.data.model.app.response.VehicleSeatAvailabilityDetailsAppModel;
import defpackage.n31;
import defpackage.t01;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$checkAndStartFetchingLiveSeatAvailability$1", f = "RouteDetailsComponent.kt", l = {2018}, m = "invokeSuspend", v = 1)
final class RouteDetailsComponent$checkAndStartFetchingLiveSeatAvailability$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RouteAppModel $routeAppModel;
    final /* synthetic */ int $seatAvailabilityId;
    int label;
    final /* synthetic */ RouteDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDetailsComponent$checkAndStartFetchingLiveSeatAvailability$1(int i, RouteAppModel routeAppModel, RouteDetailsComponent routeDetailsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = routeDetailsComponent;
        this.$seatAvailabilityId = i;
        this.$routeAppModel = routeAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteDetailsComponent$checkAndStartFetchingLiveSeatAvailability$1(this.$seatAvailabilityId, this.$routeAppModel, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteDetailsComponent$checkAndStartFetchingLiveSeatAvailability$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            RouteDetailsComponent routeDetailsComponent = this.this$0;
            Flow flowE = routeDetailsComponent.u.e(this.$seatAvailabilityId, new n31(routeDetailsComponent, 8));
            final RouteDetailsComponent routeDetailsComponent2 = this.this$0;
            final RouteAppModel routeAppModel = this.$routeAppModel;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$checkAndStartFetchingLiveSeatAvailability$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    SeatAvailabilityAppModel seatAvailabilityAppModel = (SeatAvailabilityAppModel) obj2;
                    RouteDetailsComponent routeDetailsComponent3 = routeDetailsComponent2;
                    RouteDetailsAnalyticsHelper routeDetailsAnalyticsHelper = routeDetailsComponent3.z;
                    RouteAppModel routeAppModel2 = routeAppModel;
                    routeDetailsAnalyticsHelper.c(routeAppModel2.b, routeAppModel2.c, routeAppModel2.o, seatAvailabilityAppModel.f4395a);
                    ArrayList arrayList = seatAvailabilityAppModel.f4395a;
                    int iG = MapsKt.g(CollectionsKt.v(arrayList, 10));
                    if (iG < 16) {
                        iG = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        VehicleSeatAvailabilityDetailsAppModel vehicleSeatAvailabilityDetailsAppModel = (VehicleSeatAvailabilityDetailsAppModel) obj3;
                        Pair pair = new Pair(vehicleSeatAvailabilityDetailsAppModel.f4397a, vehicleSeatAvailabilityDetailsAppModel.b);
                        linkedHashMap.put(pair.d(), pair.e());
                    }
                    routeDetailsComponent3.l0 = linkedHashMap;
                    routeDetailsComponent3.E0(new t01(24, routeDetailsComponent3, seatAvailabilityAppModel));
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (((AbstractFlow) flowE).collect(flowCollector, this) == coroutineSingletons) {
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
