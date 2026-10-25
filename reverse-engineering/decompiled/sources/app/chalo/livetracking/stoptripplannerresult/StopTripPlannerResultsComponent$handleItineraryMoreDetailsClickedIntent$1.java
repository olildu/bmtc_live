package app.chalo.livetracking.stoptripplannerresult;

import app.chalo.contract.BasicInfoContract;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerItineraryAppResponseModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.TripPlannerArgs;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
@DebugMetadata(c = "app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsComponent$handleItineraryMoreDetailsClickedIntent$1", f = "StopTripPlannerResultsComponent.kt", l = {816}, m = "invokeSuspend", v = 1)
final class StopTripPlannerResultsComponent$handleItineraryMoreDetailsClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StopTripPlannerItineraryInfoHolder $itinerary;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ StopTripPlannerResultsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopTripPlannerResultsComponent$handleItineraryMoreDetailsClickedIntent$1(StopTripPlannerResultsComponent stopTripPlannerResultsComponent, StopTripPlannerItineraryInfoHolder stopTripPlannerItineraryInfoHolder, Continuation continuation) {
        super(2, continuation);
        this.this$0 = stopTripPlannerResultsComponent;
        this.$itinerary = stopTripPlannerItineraryInfoHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopTripPlannerResultsComponent$handleItineraryMoreDetailsClickedIntent$1(this.this$0, this.$itinerary, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopTripPlannerResultsComponent$handleItineraryMoreDetailsClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChaloNavigationManager chaloNavigationManager;
        String strA;
        String str;
        long jLongValue;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            chaloNavigationManager = this.this$0.r;
            Json json = ChaloJson.b;
            TripPlannerItineraryAppResponseModel tripPlannerItineraryAppResponseModel = this.$itinerary.f4530a;
            json.getClass();
            strA = json.a(TripPlannerItineraryAppResponseModel.INSTANCE.serializer(), tripPlannerItineraryAppResponseModel);
            StopTripPlannerResultsComponent stopTripPlannerResultsComponent = this.this$0;
            Long l = stopTripPlannerResultsComponent.v;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                BasicInfoContract basicInfoContract = stopTripPlannerResultsComponent.n;
                this.L$0 = chaloNavigationManager;
                this.L$1 = strA;
                this.label = 1;
                Object objC = basicInfoContract.c(this);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = strA;
                obj = objC;
            }
            ChaloNavigationManagerKt.e(chaloNavigationManager, new TripPlannerArgs.DetailsScreen(strA, jLongValue), null, 6);
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) this.L$1;
        chaloNavigationManager = (ChaloNavigationManager) this.L$0;
        ResultKt.b(obj);
        jLongValue = ((Number) obj).longValue();
        strA = str;
        ChaloNavigationManagerKt.e(chaloNavigationManager, new TripPlannerArgs.DetailsScreen(strA, jLongValue), null, 6);
        return Unit.f17538a;
    }
}
