package app.chalo.home.ui.home;

import app.chalo.location.SettingsResolutionException;
import app.chalo.permissions.gps.GpsRequestHandler;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.home.HomeScreenComponent$requestGpsOn$1", f = "HomeScreenComponent.kt", l = {944}, m = "invokeSuspend", v = 1)
final class HomeScreenComponent$requestGpsOn$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SettingsResolutionException $exc;
    int label;
    final /* synthetic */ HomeScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenComponent$requestGpsOn$1(HomeScreenComponent homeScreenComponent, SettingsResolutionException settingsResolutionException, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeScreenComponent;
        this.$exc = settingsResolutionException;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeScreenComponent$requestGpsOn$1(this.this$0, this.$exc, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeScreenComponent$requestGpsOn$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            GpsRequestHandler gpsRequestHandlerC = this.this$0.O.c();
            if (gpsRequestHandlerC != null) {
                Flow flowA = gpsRequestHandlerC.a(this.$exc);
                final HomeScreenComponent homeScreenComponent = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.home.ui.home.HomeScreenComponent$requestGpsOn$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        HomeScreenViewIntent.GpsRequestCallbackReceivedEventIntent gpsRequestCallbackReceivedEventIntent = new HomeScreenViewIntent.GpsRequestCallbackReceivedEventIntent(((Boolean) obj2).booleanValue());
                        HomeScreenComponent homeScreenComponent2 = homeScreenComponent;
                        homeScreenComponent2.R0(gpsRequestCallbackReceivedEventIntent);
                        Job job = homeScreenComponent2.X;
                        if (job != null) {
                            ((JobSupport) job).cancel(null);
                        }
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (flowA.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
