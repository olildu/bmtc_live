package app.chalo.home.nearbytrips.ui.mapscreen;

import app.chalo.location.LatLng;
import app.chalo.stoptripdetails.data.model.app.LocationSummaryPayloadResponseAppModel;
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
@DebugMetadata(c = "app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapComponent$handleStopMarkerClickedIntent$1", f = "NearbyStopsMapComponent.kt", l = {277}, m = "invokeSuspend", v = 1)
final class NearbyStopsMapComponent$handleStopMarkerClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ NearbyStopsMapState $currentState;
    final /* synthetic */ NearbyStopsDataAndMarkerHolder $relevantSummary;
    int label;
    final /* synthetic */ NearbyStopsMapComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyStopsMapComponent$handleStopMarkerClickedIntent$1(NearbyStopsMapComponent nearbyStopsMapComponent, NearbyStopsDataAndMarkerHolder nearbyStopsDataAndMarkerHolder, NearbyStopsMapState nearbyStopsMapState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nearbyStopsMapComponent;
        this.$relevantSummary = nearbyStopsDataAndMarkerHolder;
        this.$currentState = nearbyStopsMapState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NearbyStopsMapComponent$handleStopMarkerClickedIntent$1(this.this$0, this.$relevantSummary, this.$currentState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NearbyStopsMapComponent$handleStopMarkerClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            NearbyStopsMapComponent nearbyStopsMapComponent = this.this$0;
            LocationSummaryPayloadResponseAppModel locationSummaryPayloadResponseAppModel = this.$relevantSummary.f3139a;
            LatLng latLng = this.$currentState.e.f3140a;
            this.label = 1;
            if (NearbyStopsMapComponent.J0(nearbyStopsMapComponent, locationSummaryPayloadResponseAppModel, latLng, this) == coroutineSingletons) {
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
