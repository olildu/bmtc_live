package app.chalo.home.ui.history;

import app.chalo.constants.Source;
import app.chalo.home.FetchState;
import app.chalo.home.HistoryCallApiFetchState;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import defpackage.rk0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.history.MyTicketsComponent$observeForFetchHistoryApiCall$job$1", f = "MyTicketsComponent.kt", l = {532}, m = "invokeSuspend", v = 1)
final class MyTicketsComponent$observeForFetchHistoryApiCall$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MyTicketsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTicketsComponent$observeForFetchHistoryApiCall$job$1(MyTicketsComponent myTicketsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = myTicketsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyTicketsComponent$observeForFetchHistoryApiCall$job$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyTicketsComponent$observeForFetchHistoryApiCall$job$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow stateFlowK = this.this$0.n.k();
            final MyTicketsComponent myTicketsComponent = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.home.ui.history.MyTicketsComponent$observeForFetchHistoryApiCall$job$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    HistoryCallApiFetchState historyCallApiFetchState = (HistoryCallApiFetchState) obj2;
                    String message = "MyTktVM requestedProductFlow: historyCallApiDataState = " + historyCallApiFetchState.f2859a;
                    Intrinsics.i(message, "message");
                    FetchState fetchState = historyCallApiFetchState.f2859a;
                    boolean z = fetchState instanceof FetchState.Fetched;
                    Unit unit = Unit.f17538a;
                    MyTicketsComponent myTicketsComponent2 = myTicketsComponent;
                    if (z || (fetchState instanceof FetchState.Failed) || (fetchState instanceof FetchState.NotApplicable)) {
                        myTicketsComponent2.getClass();
                        myTicketsComponent2.w0(new MyTicketsComponent$renderReclaimCardOrEmptyDataScreenWithoutTabs$1(myTicketsComponent2, null));
                        return unit;
                    }
                    if (fetchState instanceof FetchState.NotLoggedIn) {
                        HomeScreenAnalyticsHelper.DefaultImpls.a(myTicketsComponent2.E, "login required tickets page rendered", null, Source.MY_TICKETS_SCREEN_TAB, 14);
                        myTicketsComponent2.y1();
                        return unit;
                    }
                    if (fetchState instanceof FetchState.InProgress) {
                        myTicketsComponent2.E0(new rk0(myTicketsComponent2, 3));
                        return unit;
                    }
                    if (!Intrinsics.d(fetchState, FetchState.Unknown.f2858a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object objO = myTicketsComponent2.n.o(continuation);
                    return objO == CoroutineSingletons.COROUTINE_SUSPENDED ? objO : unit;
                }
            };
            this.label = 1;
            if (stateFlowK.collect(flowCollector, this) == coroutineSingletons) {
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
