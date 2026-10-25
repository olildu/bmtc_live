package app.chalo.livetracking.search;

import app.chalo.constants.Source;
import app.chalo.livetracking.search.StopBasedTripPlannerSearchDataState;
import app.chalo.resultstatemanager.ResultStateDataHolder;
import defpackage.jb1;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.search.StopBasedTripPlannerSearchComponent$handleInitialisationIntent$2", f = "StopBasedTripPlannerSearchComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class StopBasedTripPlannerSearchComponent$handleInitialisationIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StopBasedSearchScreenData $screenData;
    int label;
    final /* synthetic */ StopBasedTripPlannerSearchComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopBasedTripPlannerSearchComponent$handleInitialisationIntent$2(StopBasedSearchScreenData stopBasedSearchScreenData, StopBasedTripPlannerSearchComponent stopBasedTripPlannerSearchComponent, Continuation continuation) {
        super(2, continuation);
        this.$screenData = stopBasedSearchScreenData;
        this.this$0 = stopBasedTripPlannerSearchComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopBasedTripPlannerSearchComponent$handleInitialisationIntent$2(this.$screenData, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        StopBasedTripPlannerSearchComponent$handleInitialisationIntent$2 stopBasedTripPlannerSearchComponent$handleInitialisationIntent$2 = (StopBasedTripPlannerSearchComponent$handleInitialisationIntent$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        stopBasedTripPlannerSearchComponent$handleInitialisationIntent$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        final StopBasedSearchScreenData stopBasedSearchScreenData = this.$screenData;
        if (stopBasedSearchScreenData != null) {
            StopBasedTripPlannerSearchComponent stopBasedTripPlannerSearchComponent = this.this$0;
            stopBasedTripPlannerSearchComponent.getClass();
            Source source = stopBasedSearchScreenData.f4478a;
            StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation = stopBasedSearchScreenData.c;
            StopBasedSearchSelectedLocation stopBasedSearchSelectedLocation2 = stopBasedSearchScreenData.b;
            final int i = 1;
            if (StopBasedTripPlannerSearchComponent.WhenMappings.b[source.ordinal()] == 1) {
                StopTripPlannerResultStateManager stopTripPlannerResultStateManager = stopBasedTripPlannerSearchComponent.r;
                stopTripPlannerResultStateManager.getClass();
                Iterator it = ((Iterable) stopTripPlannerResultStateManager.b.getValue()).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.d(((ResultStateDataHolder) next).f9040a, "stop_trip_planner_result_manager_request_id"));
                ResultStateDataHolder resultStateDataHolder = (ResultStateDataHolder) next;
                StopTripResultState stopTripResultState = (StopTripResultState) (resultStateDataHolder != null ? resultStateDataHolder.b : null);
                if (stopTripResultState == null) {
                    stopBasedTripPlannerSearchComponent.E0(new jb1(stopBasedSearchSelectedLocation2, stopBasedSearchSelectedLocation, 2));
                } else {
                    int i2 = StopBasedTripPlannerSearchComponent.WhenMappings.f4488a[stopTripResultState.b.ordinal()];
                    if (i2 == 1) {
                        final int i3 = 0;
                        stopBasedTripPlannerSearchComponent.E0(new Function1() { // from class: kb1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i3) {
                                    case 0:
                                        StopBasedTripPlannerSearchDataState it2 = (StopBasedTripPlannerSearchDataState) obj2;
                                        Intrinsics.i(it2, "it");
                                        return StopBasedTripPlannerSearchDataState.a(it2, null, stopBasedSearchScreenData.c, null, null, null, false, null, null, null, null, 2045);
                                    default:
                                        StopBasedTripPlannerSearchDataState it3 = (StopBasedTripPlannerSearchDataState) obj2;
                                        Intrinsics.i(it3, "it");
                                        return StopBasedTripPlannerSearchDataState.a(it3, stopBasedSearchScreenData.b, null, null, null, null, false, null, null, null, null, 2046);
                                }
                            }
                        });
                        stopBasedTripPlannerSearchComponent.M0(StopBasedTripPlannerSearchViewIntent.OnFromLocationClick.f4493a);
                    } else if (i2 == 2) {
                        stopBasedTripPlannerSearchComponent.E0(new Function1() { // from class: kb1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i) {
                                    case 0:
                                        StopBasedTripPlannerSearchDataState it2 = (StopBasedTripPlannerSearchDataState) obj2;
                                        Intrinsics.i(it2, "it");
                                        return StopBasedTripPlannerSearchDataState.a(it2, null, stopBasedSearchScreenData.c, null, null, null, false, null, null, null, null, 2045);
                                    default:
                                        StopBasedTripPlannerSearchDataState it3 = (StopBasedTripPlannerSearchDataState) obj2;
                                        Intrinsics.i(it3, "it");
                                        return StopBasedTripPlannerSearchDataState.a(it3, stopBasedSearchScreenData.b, null, null, null, null, false, null, null, null, null, 2046);
                                }
                            }
                        });
                        stopBasedTripPlannerSearchComponent.M0(StopBasedTripPlannerSearchViewIntent.OnToLocationClick.f4500a);
                    } else if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                stopBasedTripPlannerSearchComponent.E0(new jb1(stopBasedSearchSelectedLocation2, stopBasedSearchSelectedLocation, 2));
            }
        }
        return Unit.f17538a;
    }
}
