package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.RecentStopAndRouteBasedTripMappers;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.entities.RecentAdditionalRouteInfoEntity;
import app.chalo.recent.database.entities.RecentStopAndRouteBasedTripEntity;
import app.chalo.recent.database.entities.RecentStopInfoEntity;
import defpackage.hq0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lapp/chalo/recent/database/entities/RecentStopAndRouteBasedTripEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.RecentStopAndRouteBasedTripDaoImpl$getStopAndRouteBasedTripCityItineraryForCity$2", f = "RecentStopAndRouteBasedTripDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RecentStopAndRouteBasedTripDaoImpl$getStopAndRouteBasedTripCityItineraryForCity$2 extends SuspendLambda implements Function1<Continuation<? super RecentStopAndRouteBasedTripEntity>, Object> {
    final /* synthetic */ String $cityId;
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ RecentStopAndRouteBasedTripDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.core.database.dao.RecentStopAndRouteBasedTripDaoImpl$getStopAndRouteBasedTripCityItineraryForCity$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function10<String, String, String, String, RecentAdditionalRouteInfoEntity, RecentStopInfoEntity, RecentStopInfoEntity, ChaloTransitMode, Long, Long, RecentStopAndRouteBasedTripEntity> {
        @Override // kotlin.jvm.functions.Function10
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
            String str = (String) obj;
            String str2 = (String) obj2;
            String p2 = (String) obj3;
            String p3 = (String) obj4;
            RecentAdditionalRouteInfoEntity p4 = (RecentAdditionalRouteInfoEntity) obj5;
            RecentStopInfoEntity p5 = (RecentStopInfoEntity) obj6;
            RecentStopInfoEntity p6 = (RecentStopInfoEntity) obj7;
            ChaloTransitMode p7 = (ChaloTransitMode) obj8;
            long jLongValue = ((Number) obj9).longValue();
            long jB = hq0.b((Number) obj10, str, "p0", str2, "p1");
            Intrinsics.i(p2, "p2");
            Intrinsics.i(p3, "p3");
            Intrinsics.i(p4, "p4");
            Intrinsics.i(p5, "p5");
            Intrinsics.i(p6, "p6");
            Intrinsics.i(p7, "p7");
            ((RecentStopAndRouteBasedTripMappers) this.receiver).getClass();
            return RecentStopAndRouteBasedTripMappers.a(str, str2, p2, p3, p4, p5, p6, p7, jLongValue, jB);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentStopAndRouteBasedTripDaoImpl$getStopAndRouteBasedTripCityItineraryForCity$2(RecentStopAndRouteBasedTripDaoImpl recentStopAndRouteBasedTripDaoImpl, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = recentStopAndRouteBasedTripDaoImpl;
        this.$id = str;
        this.$cityId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RecentStopAndRouteBasedTripDaoImpl$getStopAndRouteBasedTripCityItineraryForCity$2(this.this$0, this.$id, this.$cityId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RecentStopAndRouteBasedTripDaoImpl$getStopAndRouteBasedTripCityItineraryForCity$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.f2073a.Z(this.$id, this.$cityId, new AnonymousClass1(10, RecentStopAndRouteBasedTripMappers.f2100a, RecentStopAndRouteBasedTripMappers.class, "toRecentStopAndRouteBasedTripEntity", "toRecentStopAndRouteBasedTripEntity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/recent/database/entities/RecentAdditionalRouteInfoEntity;Lapp/chalo/recent/database/entities/RecentStopInfoEntity;Lapp/chalo/recent/database/entities/RecentStopInfoEntity;Lapp/chalo/providers/cityprovider/impl/data/models/app/ChaloTransitMode;JJ)Lapp/chalo/recent/database/entities/RecentStopAndRouteBasedTripEntity;", 0)).d();
    }
}
