package app.chalo.core.database.dao;

import app.chalo.citydata.data.model.app.SimpleRouteDetailsAppModel;
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
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lapp/chalo/citydata/data/model/app/SimpleRouteDetailsAppModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.RouteDaoImpl$getSimpleRouteDetails$2", f = "RouteDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RouteDaoImpl$getSimpleRouteDetails$2 extends SuspendLambda implements Function1<Continuation<? super SimpleRouteDetailsAppModel>, Object> {
    final /* synthetic */ String $cityName;
    final /* synthetic */ String $routeId;
    int label;
    final /* synthetic */ RouteDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.core.database.dao.RouteDaoImpl$getSimpleRouteDetails$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function6<String, String, String, String, String, List<? extends String>, SimpleRouteDetailsAppModel> {
        @Override // kotlin.jvm.functions.Function6
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            String p0 = (String) obj;
            String p1 = (String) obj2;
            String p2 = (String) obj3;
            String p3 = (String) obj4;
            String p4 = (String) obj5;
            List p5 = (List) obj6;
            Intrinsics.i(p0, "p0");
            Intrinsics.i(p1, "p1");
            Intrinsics.i(p2, "p2");
            Intrinsics.i(p3, "p3");
            Intrinsics.i(p4, "p4");
            Intrinsics.i(p5, "p5");
            ((RoutesTableMappers) this.receiver).getClass();
            return new SimpleRouteDetailsAppModel(p0, p1, p2, p5, p3, p4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDaoImpl$getSimpleRouteDetails$2(RouteDaoImpl routeDaoImpl, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = routeDaoImpl;
        this.$routeId = str;
        this.$cityName = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RouteDaoImpl$getSimpleRouteDetails$2(this.this$0, this.$routeId, this.$cityName, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RouteDaoImpl$getSimpleRouteDetails$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.f2079a.d0(this.$routeId, this.$cityName, new AnonymousClass1(6, RoutesTableMappers.f2107a, RoutesTableMappers.class, "toSimpleRouteDetailsAppModel", "toSimpleRouteDetailsAppModel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lapp/chalo/citydata/data/model/app/SimpleRouteDetailsAppModel;", 0)).d();
    }
}
