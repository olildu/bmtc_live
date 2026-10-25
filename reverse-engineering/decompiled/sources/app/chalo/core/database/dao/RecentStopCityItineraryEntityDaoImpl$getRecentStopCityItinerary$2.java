package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.RecentStopCityItineraryMappers;
import app.chalo.recent.database.entities.RecentStopEntity;
import app.chalo.recent.database.entities.RecentStopInfoEntity;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lapp/chalo/recent/database/entities/RecentStopEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.RecentStopCityItineraryEntityDaoImpl$getRecentStopCityItinerary$2", f = "RecentStopCityItineraryEntityDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RecentStopCityItineraryEntityDaoImpl$getRecentStopCityItinerary$2 extends SuspendLambda implements Function1<Continuation<? super RecentStopEntity>, Object> {
    final /* synthetic */ String $cityId;
    final /* synthetic */ String $stopId;
    int label;
    final /* synthetic */ RecentStopCityItineraryEntityDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.core.database.dao.RecentStopCityItineraryEntityDaoImpl$getRecentStopCityItinerary$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function7<String, String, RecentStopInfoEntity, RecentsSpecialEntityStatus, Long, Long, String, RecentStopEntity> {
        @Override // kotlin.jvm.functions.Function7
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            String p0 = (String) obj;
            String p1 = (String) obj2;
            RecentStopInfoEntity p2 = (RecentStopInfoEntity) obj3;
            RecentsSpecialEntityStatus p3 = (RecentsSpecialEntityStatus) obj4;
            Intrinsics.i(p0, "p0");
            Intrinsics.i(p1, "p1");
            Intrinsics.i(p2, "p2");
            Intrinsics.i(p3, "p3");
            ((RecentStopCityItineraryMappers) this.receiver).getClass();
            return RecentStopCityItineraryMappers.a(p0, p1, p2, p3, ((Number) obj5).longValue(), ((Number) obj6).longValue(), (String) obj7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentStopCityItineraryEntityDaoImpl$getRecentStopCityItinerary$2(RecentStopCityItineraryEntityDaoImpl recentStopCityItineraryEntityDaoImpl, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = recentStopCityItineraryEntityDaoImpl;
        this.$stopId = str;
        this.$cityId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RecentStopCityItineraryEntityDaoImpl$getRecentStopCityItinerary$2(this.this$0, this.$stopId, this.$cityId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RecentStopCityItineraryEntityDaoImpl$getRecentStopCityItinerary$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.f2075a.X(this.$stopId, this.$cityId, new AnonymousClass1(7, RecentStopCityItineraryMappers.f2102a, RecentStopCityItineraryMappers.class, "toRecentStopEntity", "toRecentStopEntity(Ljava/lang/String;Ljava/lang/String;Lapp/chalo/recent/database/entities/RecentStopInfoEntity;Lapp/chalo/recent/database/entities/RecentsSpecialEntityStatus;JJLjava/lang/String;)Lapp/chalo/recent/database/entities/RecentStopEntity;", 0)).d();
    }
}
