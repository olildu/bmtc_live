package app.chalo.core.init;

import app.chalo.onboarding.cityprovider.CityChangeOperationTracker;
import app.chalo.onboarding.cityprovider.IncompleteCityChangeOperations;
import app.chalo.onboarding.cityprovider.PostCityChangeOperationExecutor;
import java.util.List;
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
@DebugMetadata(c = "app.chalo.core.init.ApplicationInitManager$recoverIncompleteCityChangeIfNeeded$1", f = "ApplicationInitManager.kt", l = {146, 154}, m = "invokeSuspend", v = 1)
final class ApplicationInitManager$recoverIncompleteCityChangeIfNeeded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ApplicationInitManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationInitManager$recoverIncompleteCityChangeIfNeeded$1(ApplicationInitManager applicationInitManager, Continuation continuation) {
        super(2, continuation);
        this.this$0 = applicationInitManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ApplicationInitManager$recoverIncompleteCityChangeIfNeeded$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ApplicationInitManager$recoverIncompleteCityChangeIfNeeded$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            CityChangeOperationTracker cityChangeOperationTracker = this.this$0.i;
            this.label = 1;
            obj = cityChangeOperationTracker.a(this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        IncompleteCityChangeOperations incompleteCityChangeOperations = (IncompleteCityChangeOperations) obj;
        String str = incompleteCityChangeOperations.b;
        List list = incompleteCityChangeOperations.c;
        if (str != null && str.length() != 0 && !list.isEmpty()) {
            PostCityChangeOperationExecutor postCityChangeOperationExecutor = (PostCityChangeOperationExecutor) this.this$0.j.getValue();
            this.label = 2;
            if (postCityChangeOperationExecutor.b(str, list, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }
}
