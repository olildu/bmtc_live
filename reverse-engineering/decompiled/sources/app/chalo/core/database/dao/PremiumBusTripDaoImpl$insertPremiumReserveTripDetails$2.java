package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Premium_reserve_trip_table;
import app.chalo.core.Premium_reserve_trip_tableQueries;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTripEntity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lapp/cash/sqldelight/db/QueryResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.PremiumBusTripDaoImpl$insertPremiumReserveTripDetails$2", f = "PremiumBusTripDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class PremiumBusTripDaoImpl$insertPremiumReserveTripDetails$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ PremiumReserveTripEntity $ticket;
    int label;
    final /* synthetic */ PremiumBusTripDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusTripDaoImpl$insertPremiumReserveTripDetails$2(PremiumBusTripDaoImpl premiumBusTripDaoImpl, PremiumReserveTripEntity premiumReserveTripEntity, Continuation continuation) {
        super(1, continuation);
        this.this$0 = premiumBusTripDaoImpl;
        this.$ticket = premiumReserveTripEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PremiumBusTripDaoImpl$insertPremiumReserveTripDetails$2(this.this$0, this.$ticket, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((PremiumBusTripDaoImpl$insertPremiumReserveTripDetails$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Premium_reserve_trip_tableQueries premium_reserve_trip_tableQueries = this.this$0.f2070a;
        PremiumReserveTripEntity premiumReserveTripEntity = this.$ticket;
        Intrinsics.i(premiumReserveTripEntity, "<this>");
        return premium_reserve_trip_tableQueries.Z(new Premium_reserve_trip_table(premiumReserveTripEntity.f7141a, premiumReserveTripEntity.b, premiumReserveTripEntity.c, premiumReserveTripEntity.d, premiumReserveTripEntity.e));
    }
}
