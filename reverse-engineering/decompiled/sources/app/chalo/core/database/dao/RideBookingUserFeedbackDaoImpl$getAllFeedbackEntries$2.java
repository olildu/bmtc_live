package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.RideBookingUserFeedbackEntityMapper;
import app.chalo.ridehailing.data.dao.RideBookingUserFeedbackEntity;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/ridehailing/data/dao/RideBookingUserFeedbackEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.RideBookingUserFeedbackDaoImpl$getAllFeedbackEntries$2", f = "RideBookingUserFeedbackDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class RideBookingUserFeedbackDaoImpl$getAllFeedbackEntries$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends RideBookingUserFeedbackEntity>>, Object> {
    final /* synthetic */ String $city;
    int label;
    final /* synthetic */ RideBookingUserFeedbackDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.core.database.dao.RideBookingUserFeedbackDaoImpl$getAllFeedbackEntries$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function6<String, String, Long, String, String, List<? extends String>, RideBookingUserFeedbackEntity> {
        @Override // kotlin.jvm.functions.Function6
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            String p0 = (String) obj;
            String p1 = (String) obj2;
            long jLongValue = ((Number) obj3).longValue();
            List p5 = (List) obj6;
            Intrinsics.i(p0, "p0");
            Intrinsics.i(p1, "p1");
            Intrinsics.i(p5, "p5");
            ((RideBookingUserFeedbackEntityMapper) this.receiver).getClass();
            return new RideBookingUserFeedbackEntity((int) jLongValue, p0, p1, (String) obj4, (String) obj5, p5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideBookingUserFeedbackDaoImpl$getAllFeedbackEntries$2(RideBookingUserFeedbackDaoImpl rideBookingUserFeedbackDaoImpl, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = rideBookingUserFeedbackDaoImpl;
        this.$city = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RideBookingUserFeedbackDaoImpl$getAllFeedbackEntries$2(this.this$0, this.$city, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RideBookingUserFeedbackDaoImpl$getAllFeedbackEntries$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.f2077a.W(this.$city, new AnonymousClass1(6, RideBookingUserFeedbackEntityMapper.f2104a, RideBookingUserFeedbackEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;)Lapp/chalo/ridehailing/data/dao/RideBookingUserFeedbackEntity;", 0)).b();
    }
}
