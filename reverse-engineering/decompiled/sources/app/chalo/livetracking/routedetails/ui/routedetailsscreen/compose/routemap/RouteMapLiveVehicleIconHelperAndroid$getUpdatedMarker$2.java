package app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.routemap;

import app.chalo.compose.components.chalomap.PlatformMapMarkerBitmap;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/compose/components/chalomap/PlatformMapMarkerBitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.routemap.RouteMapLiveVehicleIconHelperAndroid$getUpdatedMarker$2", f = "RouteMapLiveVehicleIconHelper.android.kt", l = {101}, m = "invokeSuspend", v = 1)
final class RouteMapLiveVehicleIconHelperAndroid$getUpdatedMarker$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PlatformMapMarkerBitmap>, Object> {
    final /* synthetic */ Float $bearing;
    final /* synthetic */ Long $delayedInMins;
    final /* synthetic */ boolean $isVehicleHalted;
    final /* synthetic */ boolean $showDirectionIcon;
    int label;
    final /* synthetic */ RouteMapLiveVehicleIconHelperAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteMapLiveVehicleIconHelperAndroid$getUpdatedMarker$2(RouteMapLiveVehicleIconHelperAndroid routeMapLiveVehicleIconHelperAndroid, Float f, Long l, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = routeMapLiveVehicleIconHelperAndroid;
        this.$bearing = f;
        this.$delayedInMins = l;
        this.$isVehicleHalted = z;
        this.$showDirectionIcon = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteMapLiveVehicleIconHelperAndroid$getUpdatedMarker$2(this.this$0, this.$bearing, this.$delayedInMins, this.$isVehicleHalted, this.$showDirectionIcon, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteMapLiveVehicleIconHelperAndroid$getUpdatedMarker$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        RouteMapLiveVehicleIconHelperAndroid routeMapLiveVehicleIconHelperAndroid = this.this$0;
        Float f = this.$bearing;
        float fFloatValue = f != null ? f.floatValue() : 0.0f;
        Long l = this.$delayedInMins;
        boolean z = this.$isVehicleHalted;
        boolean z2 = this.$showDirectionIcon;
        this.label = 1;
        Object objB = RouteMapLiveVehicleIconHelperAndroid.b(routeMapLiveVehicleIconHelperAndroid, fFloatValue, l, z, z2, this);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
