package app.chalo.core.database.dao;

import app.chalo.citydata.repository.local.room.entity.RouteEntity;
import app.chalo.citydata.repository.local.room.entity.RouteEntityDetailedData;
import app.chalo.citydata.repository.local.room.entity.RouteEntityLiveDataDetails;
import app.chalo.core.database.mappers.RoutesTableMappers;
import app.chalo.providers.RouteNamingSchemeType;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/citydata/repository/local/room/entity/RouteEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.RouteDaoImpl$getAllRoutesForCity$2", f = "RouteDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RouteDaoImpl$getAllRoutesForCity$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends RouteEntity>>, Object> {
    final /* synthetic */ String $cityName;
    int label;
    final /* synthetic */ RouteDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.core.database.dao.RouteDaoImpl$getAllRoutesForCity$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function14<Long, String, String, String, String, String, String, List<? extends String>, Long, Long, RouteEntityLiveDataDetails, RouteEntityDetailedData, String, RouteNamingSchemeType, RouteEntity> {
        @Override // kotlin.jvm.functions.Function14
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
            String p1 = (String) obj2;
            String p2 = (String) obj3;
            String p3 = (String) obj4;
            String p4 = (String) obj5;
            String p5 = (String) obj6;
            String p6 = (String) obj7;
            List p7 = (List) obj8;
            RouteEntityLiveDataDetails p10 = (RouteEntityLiveDataDetails) obj11;
            RouteEntityDetailedData p11 = (RouteEntityDetailedData) obj12;
            RouteNamingSchemeType p13 = (RouteNamingSchemeType) obj14;
            Intrinsics.i(p1, "p1");
            Intrinsics.i(p2, "p2");
            Intrinsics.i(p3, "p3");
            Intrinsics.i(p4, "p4");
            Intrinsics.i(p5, "p5");
            Intrinsics.i(p6, "p6");
            Intrinsics.i(p7, "p7");
            Intrinsics.i(p10, "p10");
            Intrinsics.i(p11, "p11");
            Intrinsics.i(p13, "p13");
            ((RoutesTableMappers) this.receiver).getClass();
            return RoutesTableMappers.a(((Number) obj).longValue(), p1, p2, p3, p4, p5, p6, p7, ((Number) obj9).longValue(), ((Number) obj10).longValue(), p10, p11, (String) obj13, p13);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteDaoImpl$getAllRoutesForCity$2(RouteDaoImpl routeDaoImpl, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = routeDaoImpl;
        this.$cityName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RouteDaoImpl$getAllRoutesForCity$2(this.this$0, this.$cityName, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RouteDaoImpl$getAllRoutesForCity$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.f2079a.Y(this.$cityName, new AnonymousClass1(14, RoutesTableMappers.f2107a, RoutesTableMappers.class, "toRouteEntity", "toRouteEntity(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JJLapp/chalo/citydata/repository/local/room/entity/RouteEntityLiveDataDetails;Lapp/chalo/citydata/repository/local/room/entity/RouteEntityDetailedData;Ljava/lang/String;Lapp/chalo/providers/RouteNamingSchemeType;)Lapp/chalo/citydata/repository/local/room/entity/RouteEntity;", 0)).b();
    }
}
