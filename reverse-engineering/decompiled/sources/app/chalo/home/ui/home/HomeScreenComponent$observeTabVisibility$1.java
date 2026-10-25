package app.chalo.home.ui.home;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.home.HomeScreenComponent$observeTabVisibility$1", f = "HomeScreenComponent.kt", l = {200}, m = "invokeSuspend", v = 1)
final class HomeScreenComponent$observeTabVisibility$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HomeScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenComponent$observeTabVisibility$1(HomeScreenComponent homeScreenComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeScreenComponent$observeTabVisibility$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeScreenComponent$observeTabVisibility$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            final HomeScreenComponent homeScreenComponent = this.this$0;
            Flow flow = homeScreenComponent.h0;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.home.ui.home.HomeScreenComponent$observeTabVisibility$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    HomeScreenViewIntent.HomeScreenViewStoppedIntent homeScreenViewStoppedIntent = HomeScreenViewIntent.HomeScreenViewStoppedIntent.f3562a;
                    HomeScreenComponent homeScreenComponent2 = homeScreenComponent;
                    if (zBooleanValue && !homeScreenComponent2.c0) {
                        homeScreenComponent2.c0 = true;
                        boolean z = homeScreenComponent2.e0;
                        HomeScreenViewIntent.HomeScreenViewStartedIntent homeScreenViewStartedIntent = HomeScreenViewIntent.HomeScreenViewStartedIntent.f3561a;
                        if (z) {
                            homeScreenComponent2.e0 = false;
                            homeScreenComponent2.R0(homeScreenViewStoppedIntent);
                            homeScreenComponent2.R0(homeScreenViewStartedIntent);
                        } else {
                            homeScreenComponent2.R0(homeScreenViewStartedIntent);
                        }
                    } else if (!zBooleanValue && homeScreenComponent2.c0) {
                        homeScreenComponent2.c0 = false;
                        homeScreenComponent2.R0(homeScreenViewStoppedIntent);
                    }
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flow.collect(flowCollector, this) == coroutineSingletons) {
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
