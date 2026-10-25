package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.core.Ride_based_super_pass_ride_details_tableQueries;
import defpackage.x21;
import java.util.List;
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
@DebugMetadata(c = "app.chalo.core.database.dao.SuperPassDaoImpl$updateRideBasedSuperPassRideDetails$2", f = "SuperPassDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class SuperPassDaoImpl$updateRideBasedSuperPassRideDetails$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ boolean $isActivationAllowedInCurrentSession;
    final /* synthetic */ long $lastActivationTimeStamp;
    final /* synthetic */ long $lastPunchTimeStamp;
    final /* synthetic */ String $passId;
    final /* synthetic */ List<Long> $rideTimeStamps;
    int label;
    final /* synthetic */ SuperPassDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassDaoImpl$updateRideBasedSuperPassRideDetails$2(SuperPassDaoImpl superPassDaoImpl, List list, boolean z, long j, long j2, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = superPassDaoImpl;
        this.$rideTimeStamps = list;
        this.$isActivationAllowedInCurrentSession = z;
        this.$lastActivationTimeStamp = j;
        this.$lastPunchTimeStamp = j2;
        this.$passId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SuperPassDaoImpl$updateRideBasedSuperPassRideDetails$2(this.this$0, this.$rideTimeStamps, this.$isActivationAllowedInCurrentSession, this.$lastActivationTimeStamp, this.$lastPunchTimeStamp, this.$passId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((SuperPassDaoImpl$updateRideBasedSuperPassRideDetails$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        final Ride_based_super_pass_ride_details_tableQueries ride_based_super_pass_ride_details_tableQueries = this.this$0.d;
        final List<Long> previous_ride_time_stamps = this.$rideTimeStamps;
        final boolean z = this.$isActivationAllowedInCurrentSession;
        final long j = this.$lastActivationTimeStamp;
        final long j2 = this.$lastPunchTimeStamp;
        final String pass_id = this.$passId;
        ride_based_super_pass_ride_details_tableQueries.getClass();
        Intrinsics.i(previous_ride_time_stamps, "previous_ride_time_stamps");
        Intrinsics.i(pass_id, "pass_id");
        QueryResult queryResultA0 = ride_based_super_pass_ride_details_tableQueries.f697a.A0(-442333214, "UPDATE ride_based_super_pass_ride_details_table\nSET previous_ride_time_stamps = ?,\nis_activation_allowed_in_current_session = ?,\nlast_activation_time_stamp = ?,\nlast_punch_time_stamp = ?\nWHERE pass_id = ?", new Function1() { // from class: e31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                SqlPreparedStatement execute = (SqlPreparedStatement) obj2;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, (String) ride_based_super_pass_ride_details_tableQueries.b.f2005a.encode(previous_ride_time_stamps));
                execute.b(1, Boolean.valueOf(z));
                execute.d(2, Long.valueOf(j));
                execute.d(3, Long.valueOf(j2));
                execute.bindString(4, pass_id);
                return Unit.f17538a;
            }
        });
        ride_based_super_pass_ride_details_tableQueries.T(-442333214, new x21(5));
        return queryResultA0;
    }
}
