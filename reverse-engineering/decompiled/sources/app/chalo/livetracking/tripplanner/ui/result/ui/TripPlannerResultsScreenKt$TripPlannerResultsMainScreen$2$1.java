package app.chalo.livetracking.tripplanner.ui.result.ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerItineraryUiModel;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultIntent;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultSectionType;
import app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsState;
import defpackage.bw;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt$TripPlannerResultsMainScreen$2$1", f = "TripPlannerResultsScreen.kt", l = {256}, m = "invokeSuspend", v = 1)
final class TripPlannerResultsScreenKt$TripPlannerResultsMainScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ Function1<TripPlannerResultIntent, Unit> $sendIntent;
    final /* synthetic */ TripPlannerResultsState $viewState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerResultsScreenKt$TripPlannerResultsMainScreen$2$1(LazyListState lazyListState, TripPlannerResultsState tripPlannerResultsState, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$lazyListState = lazyListState;
        this.$viewState = tripPlannerResultsState;
        this.$sendIntent = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TripPlannerResultsScreenKt$TripPlannerResultsMainScreen$2$1(this.$lazyListState, this.$viewState, this.$sendIntent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerResultsScreenKt$TripPlannerResultsMainScreen$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            final Flow flowM = FlowKt.m(SnapshotStateKt.snapshotFlow(new bw(this.$lazyListState, 3)));
            final TripPlannerResultsState tripPlannerResultsState = this.$viewState;
            Flow flowM2 = FlowKt.m(new Flow<Boolean>() { // from class: app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt$TripPlannerResultsMainScreen$2$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt$TripPlannerResultsMainScreen$2$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f4804a;
                    public final /* synthetic */ TripPlannerResultsState b;

                    /* JADX INFO: renamed from: app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt$TripPlannerResultsMainScreen$2$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt$TripPlannerResultsMainScreen$2$1$invokeSuspend$$inlined$map$1$2", f = "TripPlannerResultsScreen.kt", l = {50}, m = "emit", v = 1)
                    public final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, TripPlannerResultsState tripPlannerResultsState) {
                        this.f4804a = flowCollector;
                        this.b = tripPlannerResultsState;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        TripPlannerItineraryUiModel tripPlannerItineraryUiModel;
                        String str;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.b(obj2);
                            List list = (List) obj;
                            TripPlannerResultsState tripPlannerResultsState = this.b;
                            List list2 = tripPlannerResultsState.j;
                            boolean z = false;
                            if (list2 != null && (tripPlannerItineraryUiModel = (TripPlannerItineraryUiModel) CollectionsKt.Q(list2)) != null && (str = tripPlannerItineraryUiModel.f4753a) != null && tripPlannerResultsState.h != TripPlannerResultSectionType.ERROR && list.contains(str)) {
                                z = true;
                            }
                            Boolean boolValueOf = Boolean.valueOf(z);
                            anonymousClass1.label = 1;
                            if (this.f4804a.emit(boolValueOf, anonymousClass1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.b(obj2);
                        }
                        return Unit.f17538a;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = flowM.collect(new AnonymousClass2(flowCollector, tripPlannerResultsState), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            });
            final Function1<TripPlannerResultIntent, Unit> function1 = this.$sendIntent;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.livetracking.tripplanner.ui.result.ui.TripPlannerResultsScreenKt$TripPlannerResultsMainScreen$2$1.3
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    if (((Boolean) obj2).booleanValue()) {
                        function1.invoke(new TripPlannerResultIntent.FetchAndUpdateHopItineraryListIntent(false));
                    }
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flowM2.collect(flowCollector, this) == coroutineSingletons) {
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
