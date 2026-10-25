package app.chalo.core.database.dao;

import app.chalo.core.database.mappers.PremiumBusMappers;
import app.chalo.premiumbus.data.models.app.PremiumBusTripStatus;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTripEntity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTripEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.PremiumBusTripDaoImpl$getPremiumReserveTripDetailsForBookingId$2", f = "PremiumBusTripDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class PremiumBusTripDaoImpl$getPremiumReserveTripDetailsForBookingId$2 extends SuspendLambda implements Function1<Continuation<? super PremiumReserveTripEntity>, Object> {
    final /* synthetic */ String $bookingId;
    int label;
    final /* synthetic */ PremiumBusTripDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.core.database.dao.PremiumBusTripDaoImpl$getPremiumReserveTripDetailsForBookingId$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function5<String, String, String, PremiumBusTripStatus, Boolean, PremiumReserveTripEntity> {
        @Override // kotlin.jvm.functions.Function5
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            String p0 = (String) obj;
            String p1 = (String) obj2;
            String p2 = (String) obj3;
            PremiumBusTripStatus p3 = (PremiumBusTripStatus) obj4;
            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
            Intrinsics.i(p0, "p0");
            Intrinsics.i(p1, "p1");
            Intrinsics.i(p2, "p2");
            Intrinsics.i(p3, "p3");
            ((PremiumBusMappers) this.receiver).getClass();
            return PremiumBusMappers.c(p0, p1, p2, p3, zBooleanValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusTripDaoImpl$getPremiumReserveTripDetailsForBookingId$2(PremiumBusTripDaoImpl premiumBusTripDaoImpl, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = premiumBusTripDaoImpl;
        this.$bookingId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PremiumBusTripDaoImpl$getPremiumReserveTripDetailsForBookingId$2(this.this$0, this.$bookingId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((PremiumBusTripDaoImpl$getPremiumReserveTripDetailsForBookingId$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.this$0.f2070a.Y(this.$bookingId, new AnonymousClass1(5, PremiumBusMappers.f2096a, PremiumBusMappers.class, "toEntity", "toEntity(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapp/chalo/premiumbus/data/models/app/PremiumBusTripStatus;Z)Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTripEntity;", 0)).d();
    }
}
