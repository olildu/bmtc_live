package app.chalo.metro.ui.landing;

import app.chalo.providers.stringprovider.StringEnum;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.metro.ui.landing.MetroLandingScreenComponent$collectAndNavigateToPickStop$3", f = "MetroLandingScreenComponent.kt", l = {775}, m = "invokeSuspend", v = 1)
final class MetroLandingScreenComponent$collectAndNavigateToPickStop$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ MetroLandingScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetroLandingScreenComponent$collectAndNavigateToPickStop$3(MetroLandingScreenComponent metroLandingScreenComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = metroLandingScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MetroLandingScreenComponent$collectAndNavigateToPickStop$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MetroLandingScreenComponent$collectAndNavigateToPickStop$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MetroLandingScreenComponent metroLandingScreenComponent;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            MetroLandingScreenComponent metroLandingScreenComponent2 = this.this$0;
            this.L$0 = metroLandingScreenComponent2;
            this.label = 1;
            Object objB = metroLandingScreenComponent2.l.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            metroLandingScreenComponent = metroLandingScreenComponent2;
            obj = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            metroLandingScreenComponent = (MetroLandingScreenComponent) this.L$0;
            ResultKt.b(obj);
        }
        MetroLandingScreenComponent.Q0(metroLandingScreenComponent, (String) obj);
        return Unit.f17538a;
    }
}
