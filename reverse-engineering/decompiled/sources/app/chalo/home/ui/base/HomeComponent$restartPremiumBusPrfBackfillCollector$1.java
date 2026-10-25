package app.chalo.home.ui.base;

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
@DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$restartPremiumBusPrfBackfillCollector$1", f = "HomeComponent.kt", l = {1174}, m = "invokeSuspend", v = 1)
final class HomeComponent$restartPremiumBusPrfBackfillCollector$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ HomeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeComponent$restartPremiumBusPrfBackfillCollector$1(HomeComponent homeComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeComponent$restartPremiumBusPrfBackfillCollector$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeComponent$restartPremiumBusPrfBackfillCollector$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HomeComponent homeComponent;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            HomeComponent homeComponent2 = this.this$0;
            this.L$0 = homeComponent2;
            this.label = 1;
            Object objP0 = HomeComponent.P0(homeComponent2, this);
            if (objP0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            homeComponent = homeComponent2;
            obj = objP0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            homeComponent = (HomeComponent) this.L$0;
            ResultKt.b(obj);
        }
        HomeComponent.F0(homeComponent, ((Boolean) obj).booleanValue());
        return Unit.f17538a;
    }
}
