package app.chalo.core.database.dao;

import app.chalo.core.Premium_reserve_trip_tableQueries;
import defpackage.eu0;
import defpackage.yw0;
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
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.core.database.dao.PremiumBusTripDaoImpl$deletePremiumReserveTripDetailsForBookingId$2", f = "PremiumBusTripDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class PremiumBusTripDaoImpl$deletePremiumReserveTripDetailsForBookingId$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bookingId;
    int label;
    final /* synthetic */ PremiumBusTripDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusTripDaoImpl$deletePremiumReserveTripDetailsForBookingId$2(PremiumBusTripDaoImpl premiumBusTripDaoImpl, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = premiumBusTripDaoImpl;
        this.$bookingId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PremiumBusTripDaoImpl$deletePremiumReserveTripDetailsForBookingId$2(this.this$0, this.$bookingId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PremiumBusTripDaoImpl$deletePremiumReserveTripDetailsForBookingId$2 premiumBusTripDaoImpl$deletePremiumReserveTripDetailsForBookingId$2 = (PremiumBusTripDaoImpl$deletePremiumReserveTripDetailsForBookingId$2) create((Continuation) obj);
        Unit unit = Unit.f17538a;
        premiumBusTripDaoImpl$deletePremiumReserveTripDetailsForBookingId$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Premium_reserve_trip_tableQueries premium_reserve_trip_tableQueries = this.this$0.f2070a;
        String bookingId = this.$bookingId;
        premium_reserve_trip_tableQueries.getClass();
        Intrinsics.i(bookingId, "bookingId");
        premium_reserve_trip_tableQueries.f697a.A0(-263183380, "DELETE FROM premium_reserve_trip_table WHERE bookingId = ?", new eu0(bookingId, 10));
        premium_reserve_trip_tableQueries.T(-263183380, new yw0(5));
        return Unit.f17538a;
    }
}
