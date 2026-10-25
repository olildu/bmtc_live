package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Ride_based_super_pass_ride_details_table;
import app.chalo.core.Ride_based_super_pass_ride_details_tableQueries;
import app.chalo.superpass.data.models.entities.RideBasedSuperPassRideDetailsRoom;
import defpackage.t01;
import defpackage.x21;
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
@DebugMetadata(c = "app.chalo.core.database.dao.SuperPassDaoImpl$insertRideBasedSuperPassRideDetails$2", f = "SuperPassDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class SuperPassDaoImpl$insertRideBasedSuperPassRideDetails$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ RideBasedSuperPassRideDetailsRoom $superPassRideDetails;
    int label;
    final /* synthetic */ SuperPassDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassDaoImpl$insertRideBasedSuperPassRideDetails$2(SuperPassDaoImpl superPassDaoImpl, RideBasedSuperPassRideDetailsRoom rideBasedSuperPassRideDetailsRoom, Continuation continuation) {
        super(1, continuation);
        this.this$0 = superPassDaoImpl;
        this.$superPassRideDetails = rideBasedSuperPassRideDetailsRoom;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SuperPassDaoImpl$insertRideBasedSuperPassRideDetails$2(this.this$0, this.$superPassRideDetails, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((SuperPassDaoImpl$insertRideBasedSuperPassRideDetails$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Ride_based_super_pass_ride_details_tableQueries ride_based_super_pass_ride_details_tableQueries = this.this$0.d;
        RideBasedSuperPassRideDetailsRoom rideBasedSuperPassRideDetailsRoom = this.$superPassRideDetails;
        Intrinsics.i(rideBasedSuperPassRideDetailsRoom, "<this>");
        Ride_based_super_pass_ride_details_table ride_based_super_pass_ride_details_table = new Ride_based_super_pass_ride_details_table(rideBasedSuperPassRideDetailsRoom.h, rideBasedSuperPassRideDetailsRoom.c, rideBasedSuperPassRideDetailsRoom.d, rideBasedSuperPassRideDetailsRoom.e, rideBasedSuperPassRideDetailsRoom.f, rideBasedSuperPassRideDetailsRoom.f9570a, rideBasedSuperPassRideDetailsRoom.b);
        ride_based_super_pass_ride_details_tableQueries.getClass();
        QueryResult queryResultA0 = ride_based_super_pass_ride_details_tableQueries.f697a.A0(-102005774, "INSERT OR REPLACE INTO ride_based_super_pass_ride_details_table (pass_id, previous_ride_time_stamps, is_activation_allowed_in_current_session, oldest_history_call_time_stamp, should_check_app_reclaim, last_activation_time_stamp, last_punch_time_stamp) VALUES (?, ?, ?, ?, ?, ?, ?)", new t01(16, ride_based_super_pass_ride_details_table, ride_based_super_pass_ride_details_tableQueries));
        ride_based_super_pass_ride_details_tableQueries.T(-102005774, new x21(3));
        return queryResultA0;
    }
}
