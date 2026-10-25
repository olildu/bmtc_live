package app.chalo.core.database.dao;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.SuperPassDaoImpl$getRideBasedSuperPassCount$2", f = "SuperPassDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class SuperPassDaoImpl$getRideBasedSuperPassCount$2 extends SuspendLambda implements Function1<Continuation<? super Integer>, Object> {
    final /* synthetic */ String $city;
    int label;
    final /* synthetic */ SuperPassDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassDaoImpl$getRideBasedSuperPassCount$2(SuperPassDaoImpl superPassDaoImpl, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = superPassDaoImpl;
        this.$city = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SuperPassDaoImpl$getRideBasedSuperPassCount$2(this.this$0, this.$city, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((SuperPassDaoImpl$getRideBasedSuperPassCount$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Long l = (Long) this.this$0.f2082a.b0(this.$city).d();
        return new Integer(l != null ? (int) l.longValue() : 0);
    }
}
