package app.chalo.core.database.dao;

import defpackage.s8;
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
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.RouteDaoImpl$deleteStaleRoutes$2", f = "RouteDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RouteDaoImpl$deleteStaleRoutes$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cityName;
    final /* synthetic */ long $oldestTsAllowed;
    int label;
    final /* synthetic */ RouteDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDaoImpl$deleteStaleRoutes$2(RouteDaoImpl routeDaoImpl, long j, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = routeDaoImpl;
        this.$oldestTsAllowed = j;
        this.$cityName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RouteDaoImpl$deleteStaleRoutes$2(this.this$0, this.$oldestTsAllowed, this.$cityName, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        RouteDaoImpl$deleteStaleRoutes$2 routeDaoImpl$deleteStaleRoutes$2 = (RouteDaoImpl$deleteStaleRoutes$2) create((Continuation) obj);
        Unit unit = Unit.f17538a;
        routeDaoImpl$deleteStaleRoutes$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        RouteDaoImpl routeDaoImpl = this.this$0;
        routeDaoImpl.f2079a.V(new s8(routeDaoImpl, this.$oldestTsAllowed, this.$cityName, 6));
        return Unit.f17538a;
    }
}
