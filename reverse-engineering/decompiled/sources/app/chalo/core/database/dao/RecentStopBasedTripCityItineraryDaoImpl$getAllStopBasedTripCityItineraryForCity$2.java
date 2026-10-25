package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.RecentStopBasedTripCityItineraryMappers;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.entities.RecentStopBasedTripEntity;
import app.chalo.recent.database.entities.RecentStopInfoEntity;
import defpackage.hq0;
import java.util.List;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/recent/database/entities/RecentStopBasedTripEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.RecentStopBasedTripCityItineraryDaoImpl$getAllStopBasedTripCityItineraryForCity$2", f = "RecentStopBasedTripCityItineraryDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RecentStopBasedTripCityItineraryDaoImpl$getAllStopBasedTripCityItineraryForCity$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends RecentStopBasedTripEntity>>, Object> {
    final /* synthetic */ String $cityId;
    int label;
    final /* synthetic */ RecentStopBasedTripCityItineraryDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.core.database.dao.RecentStopBasedTripCityItineraryDaoImpl$getAllStopBasedTripCityItineraryForCity$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function7<String, String, RecentStopInfoEntity, RecentStopInfoEntity, ChaloTransitMode, Long, Long, RecentStopBasedTripEntity> {
        @Override // kotlin.jvm.functions.Function7
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            String str = (String) obj;
            String str2 = (String) obj2;
            RecentStopInfoEntity p2 = (RecentStopInfoEntity) obj3;
            RecentStopInfoEntity p3 = (RecentStopInfoEntity) obj4;
            ChaloTransitMode p4 = (ChaloTransitMode) obj5;
            long jLongValue = ((Number) obj6).longValue();
            long jB = hq0.b((Number) obj7, str, "p0", str2, "p1");
            Intrinsics.i(p2, "p2");
            Intrinsics.i(p3, "p3");
            Intrinsics.i(p4, "p4");
            ((RecentStopBasedTripCityItineraryMappers) this.receiver).getClass();
            return RecentStopBasedTripCityItineraryMappers.a(str, str2, p2, p3, p4, jLongValue, jB);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentStopBasedTripCityItineraryDaoImpl$getAllStopBasedTripCityItineraryForCity$2(RecentStopBasedTripCityItineraryDaoImpl recentStopBasedTripCityItineraryDaoImpl, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = recentStopBasedTripCityItineraryDaoImpl;
        this.$cityId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RecentStopBasedTripCityItineraryDaoImpl$getAllStopBasedTripCityItineraryForCity$2(this.this$0, this.$cityId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RecentStopBasedTripCityItineraryDaoImpl$getAllStopBasedTripCityItineraryForCity$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.f2074a.W(this.$cityId, new AnonymousClass1(7, RecentStopBasedTripCityItineraryMappers.f2101a, RecentStopBasedTripCityItineraryMappers.class, "toRecentStopBasedTripEntity", "toRecentStopBasedTripEntity(Ljava/lang/String;Ljava/lang/String;Lapp/chalo/recent/database/entities/RecentStopInfoEntity;Lapp/chalo/recent/database/entities/RecentStopInfoEntity;Lapp/chalo/providers/cityprovider/impl/data/models/app/ChaloTransitMode;JJ)Lapp/chalo/recent/database/entities/RecentStopBasedTripEntity;", 0)).b();
    }
}
