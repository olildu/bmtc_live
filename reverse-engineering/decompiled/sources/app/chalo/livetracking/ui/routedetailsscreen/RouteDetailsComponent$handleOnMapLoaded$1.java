package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.compose.components.chalomap.ChaloMapLatLngBoundsDetails;
import app.chalo.compose.components.chalomap.LatLngBoundsUtils;
import app.chalo.compose.components.chalomap.MapUtilsKt;
import app.chalo.compose.components.chalomap.PolylineUtils;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModelKt;
import app.chalo.livetracking.utils.RouteMapUtilsKt;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LatLng;
import app.chalo.location.LocationUpdateResult;
import app.chalo.models.LocationAppModel;
import app.chalo.providers.cityprovider.CityProviderKt;
import defpackage.z21;
import java.util.ArrayList;
import java.util.Iterator;
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
@DebugMetadata(c = "app.chalo.livetracking.ui.routedetailsscreen.RouteDetailsComponent$handleOnMapLoaded$1", f = "RouteDetailsComponent.kt", l = {616}, m = "invokeSuspend", v = 1)
final class RouteDetailsComponent$handleOnMapLoaded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RouteAppModel $routeAppModel;
    final /* synthetic */ RouteDetailsIntentModel $routeDetailsIntentModel;
    int label;
    final /* synthetic */ RouteDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDetailsComponent$handleOnMapLoaded$1(RouteDetailsComponent routeDetailsComponent, RouteAppModel routeAppModel, RouteDetailsIntentModel routeDetailsIntentModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = routeDetailsComponent;
        this.$routeAppModel = routeAppModel;
        this.$routeDetailsIntentModel = routeDetailsIntentModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteDetailsComponent$handleOnMapLoaded$1(this.this$0, this.$routeAppModel, this.$routeDetailsIntentModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteDetailsComponent$handleOnMapLoaded$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00de  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ListBuilder listBuilderB;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ChaloLocationManager chaloLocationManager = this.this$0.D;
            this.label = 1;
            obj = chaloLocationManager.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        LocationAppModel locationAppModelA = ((LocationUpdateResult) obj).a();
        RouteAppModel routeAppModel = this.$routeAppModel;
        RouteDetailsIntentModel routeDetailsIntentModel = this.$routeDetailsIntentModel;
        LatLng latLng = null;
        if (locationAppModelA != null) {
            LatLng latLngA = locationAppModelA.a();
            if (CityProviderKt.a(this.this$0.k, latLngA)) {
                latLng = latLngA;
            }
        }
        RouteDetailsComponent routeDetailsComponent = this.this$0;
        LatLngBoundsUtils latLngBoundsUtils = routeDetailsComponent.M;
        PolylineUtils polylineUtils = routeDetailsComponent.N;
        Intrinsics.i(routeAppModel, "routeAppModel");
        Intrinsics.i(routeDetailsIntentModel, "routeDetailsIntentModel");
        Intrinsics.i(latLngBoundsUtils, "latLngBoundsUtils");
        Intrinsics.i(polylineUtils, "polylineUtils");
        String str = routeAppModel.m;
        List list = routeAppModel.e;
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((StopAppModel) it.next()).c);
        }
        ChaloMapLatLngBoundsDetails chaloMapLatLngBoundsDetails = new ChaloMapLatLngBoundsDetails(latLngBoundsUtils.a(MapUtilsKt.a(str, polylineUtils, arrayList)), 35);
        if (RouteDetailsIntentModelKt.a(routeDetailsIntentModel)) {
            Iterator it2 = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (Intrinsics.d(((StopAppModel) it2.next()).f1727a, routeDetailsIntentModel.b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                LatLng latLng2 = ((StopAppModel) list.get(i2)).c;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(latLng2);
                if (latLng != null) {
                    arrayList2.add(latLng);
                }
                chaloMapLatLngBoundsDetails = new ChaloMapLatLngBoundsDetails(latLngBoundsUtils.a(arrayList2), 150);
            } else if (routeDetailsIntentModel.h.m && (listBuilderB = RouteMapUtilsKt.b(routeAppModel, routeDetailsIntentModel, polylineUtils)) != null) {
                chaloMapLatLngBoundsDetails = new ChaloMapLatLngBoundsDetails(latLngBoundsUtils.a(listBuilderB), 35);
            }
        } else if (routeDetailsIntentModel.h.m) {
            chaloMapLatLngBoundsDetails = new ChaloMapLatLngBoundsDetails(latLngBoundsUtils.a(listBuilderB), 35);
        }
        this.this$0.E0(new z21(chaloMapLatLngBoundsDetails, 12));
        return Unit.f17538a;
    }
}
