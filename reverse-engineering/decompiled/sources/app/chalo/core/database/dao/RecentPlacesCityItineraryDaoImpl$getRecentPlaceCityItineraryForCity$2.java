package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.RecentPlaceEntityMappers;
import app.chalo.location.LatLng;
import app.chalo.recent.database.entities.RecentPlaceEntity;
import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
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
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lapp/chalo/recent/database/entities/RecentPlaceEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.RecentPlacesCityItineraryDaoImpl$getRecentPlaceCityItineraryForCity$2", f = "RecentPlacesCityItineraryDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RecentPlacesCityItineraryDaoImpl$getRecentPlaceCityItineraryForCity$2 extends SuspendLambda implements Function1<Continuation<? super RecentPlaceEntity>, Object> {
    final /* synthetic */ String $cityId;
    final /* synthetic */ String $placeId;
    int label;
    final /* synthetic */ RecentPlacesCityItineraryDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.core.database.dao.RecentPlacesCityItineraryDaoImpl$getRecentPlaceCityItineraryForCity$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function10<String, String, String, String, String, LatLng, RecentsSpecialEntityStatus, Long, Long, String, RecentPlaceEntity> {
        @Override // kotlin.jvm.functions.Function10
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
            String p0 = (String) obj;
            String p1 = (String) obj2;
            String p2 = (String) obj3;
            String p4 = (String) obj5;
            LatLng p5 = (LatLng) obj6;
            RecentsSpecialEntityStatus p6 = (RecentsSpecialEntityStatus) obj7;
            Intrinsics.i(p0, "p0");
            Intrinsics.i(p1, "p1");
            Intrinsics.i(p2, "p2");
            Intrinsics.i(p4, "p4");
            Intrinsics.i(p5, "p5");
            Intrinsics.i(p6, "p6");
            ((RecentPlaceEntityMappers) this.receiver).getClass();
            return RecentPlaceEntityMappers.a(p0, p1, p2, (String) obj4, p4, p5, p6, ((Number) obj8).longValue(), ((Number) obj9).longValue(), (String) obj10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentPlacesCityItineraryDaoImpl$getRecentPlaceCityItineraryForCity$2(RecentPlacesCityItineraryDaoImpl recentPlacesCityItineraryDaoImpl, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = recentPlacesCityItineraryDaoImpl;
        this.$placeId = str;
        this.$cityId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RecentPlacesCityItineraryDaoImpl$getRecentPlaceCityItineraryForCity$2(this.this$0, this.$placeId, this.$cityId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RecentPlacesCityItineraryDaoImpl$getRecentPlaceCityItineraryForCity$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.f2072a.Y(this.$placeId, this.$cityId, new AnonymousClass1(10, RecentPlaceEntityMappers.f2099a, RecentPlaceEntityMappers.class, "toRecentPlaceEntity", "toRecentPlaceEntity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/location/LatLng;Lapp/chalo/recent/database/entities/RecentsSpecialEntityStatus;JJLjava/lang/String;)Lapp/chalo/recent/database/entities/RecentPlaceEntity;", 0)).d();
    }
}
