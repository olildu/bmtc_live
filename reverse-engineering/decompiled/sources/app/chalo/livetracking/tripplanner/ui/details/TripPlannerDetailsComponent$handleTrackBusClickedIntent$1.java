package app.chalo.livetracking.tripplanner.ui.details;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.constants.Source;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel;
import app.chalo.livetracking.routedetails.data.model.ui.TrackingAdditionalFeatures;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.RouteDetailsArgs;
import java.util.LinkedHashMap;
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
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.details.TripPlannerDetailsComponent$handleTrackBusClickedIntent$1", f = "TripPlannerDetailsComponent.kt", l = {TypedValues.PositionType.TYPE_TRANSITION_EASING}, m = "invokeSuspend", v = 1)
final class TripPlannerDetailsComponent$handleTrackBusClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TripPlannerDetailsIntent.TrackBusClickedIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ TripPlannerDetailsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerDetailsComponent$handleTrackBusClickedIntent$1(TripPlannerDetailsComponent tripPlannerDetailsComponent, TripPlannerDetailsIntent.TrackBusClickedIntent trackBusClickedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerDetailsComponent;
        this.$intent = trackBusClickedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TripPlannerDetailsComponent$handleTrackBusClickedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerDetailsComponent$handleTrackBusClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TripPlannerLegAppModel tripPlannerLegAppModel;
        TripPlannerLegAppModel tripPlannerLegAppModel2;
        String strA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel = this.this$0.K;
                if (tripPlannerItineraryAppResponseModel != null) {
                    tripPlannerLegAppModel = (TripPlannerLegAppModel) CollectionsKt.L(this.$intent.f4737a, tripPlannerItineraryAppResponseModel.f);
                    if (tripPlannerLegAppModel != null && (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Bus)) {
                        LinkedHashMap linkedHashMap = this.this$0.L;
                        RouteAppModel routeAppModel = linkedHashMap != null ? (RouteAppModel) linkedHashMap.get(((TripPlannerLegAppModel.Bus) tripPlannerLegAppModel).p) : null;
                        if (routeAppModel != null) {
                            TripPlannerDetailsComponent tripPlannerDetailsComponent = this.this$0;
                            this.L$0 = tripPlannerLegAppModel;
                            this.label = 1;
                            if (TripPlannerDetailsComponent.I0(tripPlannerDetailsComponent, routeAppModel, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            tripPlannerLegAppModel2 = tripPlannerLegAppModel;
                        } else {
                            TripPlannerLegAppModel.Bus bus = (TripPlannerLegAppModel.Bus) tripPlannerLegAppModel;
                            RouteDetailsIntentModel routeDetailsIntentModel = new RouteDetailsIntentModel(bus.p, bus.s.f1727a, bus.t.f1727a, null, Source.TRIP_PLANNER_DETAILS.getSourceName(), Boolean.FALSE, false, new TrackingAdditionalFeatures(32767, null, null, null));
                            Json json = ChaloJson.b;
                            json.getClass();
                            strA = json.a(RouteDetailsIntentModel.INSTANCE.serializer(), routeDetailsIntentModel);
                            if (strA != null) {
                                ChaloNavigationManagerKt.e(this.this$0.A, new RouteDetailsArgs(strA), null, 6);
                            }
                        }
                    }
                }
                return Unit.f17538a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tripPlannerLegAppModel2 = (TripPlannerLegAppModel) this.L$0;
            ResultKt.b(obj);
            Json json2 = ChaloJson.b;
            json2.getClass();
            strA = json2.a(RouteDetailsIntentModel.INSTANCE.serializer(), routeDetailsIntentModel);
        } catch (Exception unused) {
            strA = null;
        }
        tripPlannerLegAppModel = tripPlannerLegAppModel2;
        TripPlannerLegAppModel.Bus bus2 = (TripPlannerLegAppModel.Bus) tripPlannerLegAppModel;
        RouteDetailsIntentModel routeDetailsIntentModel2 = new RouteDetailsIntentModel(bus2.p, bus2.s.f1727a, bus2.t.f1727a, null, Source.TRIP_PLANNER_DETAILS.getSourceName(), Boolean.FALSE, false, new TrackingAdditionalFeatures(32767, null, null, null));
        if (strA != null) {
            ChaloNavigationManagerKt.e(this.this$0.A, new RouteDetailsArgs(strA), null, 6);
        }
        return Unit.f17538a;
    }
}
