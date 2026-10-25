package app.chalo.onboarding.cityprovider;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.cityprovider.PostCityChangeOperationExecutor$invoke$3$4", f = "PostCityChangeOperationExecutor.kt", l = {}, m = "invokeSuspend", v = 1)
final class PostCityChangeOperationExecutor$invoke$3$4 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ String $selectedCity;
    int label;
    final /* synthetic */ PostCityChangeOperationExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostCityChangeOperationExecutor$invoke$3$4(PostCityChangeOperationExecutor postCityChangeOperationExecutor, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = postCityChangeOperationExecutor;
        this.$selectedCity = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PostCityChangeOperationExecutor$invoke$3$4(this.this$0, this.$selectedCity, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PostCityChangeOperationExecutor$invoke$3$4 postCityChangeOperationExecutor$invoke$3$4 = (PostCityChangeOperationExecutor$invoke$3$4) create((Continuation) obj);
        Unit unit = Unit.f17538a;
        postCityChangeOperationExecutor$invoke$3$4.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        this.this$0.d.c();
        this.this$0.d.e("SELECTED_CITY", this.$selectedCity);
        return Unit.f17538a;
    }
}
