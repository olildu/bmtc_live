package app.chalo.home.ui.regularbus;

import app.chalo.home.nearbytrips.domain.NearbyTripsDataHolder;
import app.chalo.home.nearbytrips.domain.NearbyTripsDataManagerState;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.stoptripdetails.data.model.app.LocationSummaryPayloadResponseAppModel;
import defpackage.t01;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.regularbus.RegularBusComponent$startRequiredCollections$2", f = "RegularBusComponent.kt", l = {1400}, m = "invokeSuspend", v = 1)
final class RegularBusComponent$startRequiredCollections$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RegularBusComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegularBusComponent$startRequiredCollections$2(RegularBusComponent regularBusComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = regularBusComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RegularBusComponent$startRequiredCollections$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RegularBusComponent$startRequiredCollections$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            final RegularBusComponent regularBusComponent = this.this$0;
            StateFlow stateFlow = regularBusComponent.l.i;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.home.ui.regularbus.RegularBusComponent$startRequiredCollections$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    LocationSummaryPayloadResponseAppModel locationSummaryPayloadResponseAppModel;
                    Object objS0;
                    NearbyTripsDataManagerState nearbyTripsDataManagerState = (NearbyTripsDataManagerState) obj2;
                    RegularBusComponent regularBusComponent2 = regularBusComponent;
                    regularBusComponent2.E0(new t01(11, regularBusComponent2, nearbyTripsDataManagerState));
                    NearbyTripsDataHolder nearbyTripsDataHolder = nearbyTripsDataManagerState.f3122a;
                    return (nearbyTripsDataHolder == null || (locationSummaryPayloadResponseAppModel = (LocationSummaryPayloadResponseAppModel) CollectionsKt.L(0, nearbyTripsDataHolder.b)) == null || (objS0 = RegularBusComponent.S0(regularBusComponent2, locationSummaryPayloadResponseAppModel, ChaloTransitMode.BUS, nearbyTripsDataManagerState.f3122a.f3117a, continuation)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? Unit.f17538a : objS0;
                }
            };
            this.label = 1;
            if (stateFlow.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
