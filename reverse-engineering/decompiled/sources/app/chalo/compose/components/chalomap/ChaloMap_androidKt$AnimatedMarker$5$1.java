package app.chalo.compose.components.chalomap;

import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.compose.MarkerState;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.compose.components.chalomap.ChaloMap_androidKt$AnimatedMarker$5$1", f = "ChaloMap.android.kt", l = {}, m = "invokeSuspend", v = 1)
final class ChaloMap_androidKt$AnimatedMarker$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChaloMapMarkerUIState $marker;
    final /* synthetic */ MarkerState $markerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloMap_androidKt$AnimatedMarker$5$1(ChaloMapMarkerUIState chaloMapMarkerUIState, MarkerState markerState, Continuation continuation) {
        super(2, continuation);
        this.$marker = chaloMapMarkerUIState;
        this.$markerState = markerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloMap_androidKt$AnimatedMarker$5$1(this.$marker, this.$markerState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ChaloMap_androidKt$AnimatedMarker$5$1 chaloMap_androidKt$AnimatedMarker$5$1 = (ChaloMap_androidKt$AnimatedMarker$5$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        chaloMap_androidKt$AnimatedMarker$5$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Marker marker;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        if (this.$marker.b() != null && (marker = (Marker) this.$markerState.d.getValue()) != null) {
            marker.showInfoWindow();
        }
        return Unit.f17538a;
    }
}
