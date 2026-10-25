package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel;
import app.chalo.livetracking.utils.RouteMapUtilsKt;
import app.chalo.location.LatLng;
import app.chalo.location.LatLngBounds;
import defpackage.n21;
import defpackage.q31;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$checkAndUpdateMapLatLngBoundsBasedOnVehicleLocation$2", f = "RouteDetailsComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class RouteDetailsComponent$checkAndUpdateMapLatLngBoundsBasedOnVehicleLocation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<LatLng> $locationList;
    int label;
    final /* synthetic */ RouteDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDetailsComponent$checkAndUpdateMapLatLngBoundsBasedOnVehicleLocation$2(RouteDetailsComponent routeDetailsComponent, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = routeDetailsComponent;
        this.$locationList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteDetailsComponent$checkAndUpdateMapLatLngBoundsBasedOnVehicleLocation$2(this.this$0, this.$locationList, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        RouteDetailsComponent$checkAndUpdateMapLatLngBoundsBasedOnVehicleLocation$2 routeDetailsComponent$checkAndUpdateMapLatLngBoundsBasedOnVehicleLocation$2 = (RouteDetailsComponent$checkAndUpdateMapLatLngBoundsBasedOnVehicleLocation$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        routeDetailsComponent$checkAndUpdateMapLatLngBoundsBasedOnVehicleLocation$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RouteDetailsIntentModel routeDetailsIntentModel;
        ListBuilder listBuilderB;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        RouteDetailsComponent routeDetailsComponent = this.this$0;
        List<LatLng> list = this.$locationList;
        RouteAppModel routeAppModel = routeDetailsComponent.Y;
        if (routeAppModel != null && (routeDetailsIntentModel = routeDetailsComponent.X) != null && (listBuilderB = RouteMapUtilsKt.b(routeAppModel, routeDetailsIntentModel, routeDetailsComponent.N)) != null) {
            ListBuilder listBuilderY = CollectionsKt.y();
            listBuilderY.addAll(listBuilderB);
            listBuilderY.addAll(list);
            LatLngBounds latLngBoundsA = routeDetailsComponent.M.a(listBuilderY.g());
            routeDetailsComponent.x0 = true;
            List<LatLng> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            for (LatLng latLng : list2) {
                double d = latLng.f5134a;
                double d2 = latLng.b;
                StringBuilder sbI = n21.i(d, "(", ", ");
                sbI.append(d2);
                sbI.append(")");
                arrayList.add(sbI.toString());
            }
            String message = "updateSegmentMapLatLngBoundsWithTrackedVehicleLocation with locationList: " + arrayList;
            Intrinsics.i(message, "message");
            routeDetailsComponent.E0(new q31(latLngBoundsA, 1));
        }
        return Unit.f17538a;
    }
}
