package app.chalo.core.database.dao;

import app.chalo.citydata.data.model.app.RouteIdWithVersion;
import app.chalo.core.database.mappers.RoutesTableMappers;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/citydata/data/model/app/RouteIdWithVersion;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.RouteDaoImpl$getRoutesWithIdAndVersion$2", f = "RouteDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RouteDaoImpl$getRoutesWithIdAndVersion$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends RouteIdWithVersion>>, Object> {
    final /* synthetic */ String $cityName;
    int label;
    final /* synthetic */ RouteDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.core.database.dao.RouteDaoImpl$getRoutesWithIdAndVersion$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<Long, String, RouteIdWithVersion> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            long jLongValue = ((Number) obj).longValue();
            String p1 = (String) obj2;
            Intrinsics.i(p1, "p1");
            ((RoutesTableMappers) this.receiver).getClass();
            return new RouteIdWithVersion((int) jLongValue, p1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDaoImpl$getRoutesWithIdAndVersion$2(RouteDaoImpl routeDaoImpl, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = routeDaoImpl;
        this.$cityName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RouteDaoImpl$getRoutesWithIdAndVersion$2(this.this$0, this.$cityName, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RouteDaoImpl$getRoutesWithIdAndVersion$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.f2079a.b0(this.$cityName, new AnonymousClass1(2, RoutesTableMappers.f2107a, RoutesTableMappers.class, "toRouteIdAndVersion", "toRouteIdAndVersion(JLjava/lang/String;)Lapp/chalo/citydata/data/model/app/RouteIdWithVersion;", 0)).b();
    }
}
