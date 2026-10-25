package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Ride_based_super_pass_tableQueries;
import defpackage.x21;
import defpackage.xa;
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
@DebugMetadata(c = "app.chalo.core.database.dao.SuperPassDaoImpl$updatePremiumRideConsumedForRideBasedPass$2", f = "SuperPassDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class SuperPassDaoImpl$updatePremiumRideConsumedForRideBasedPass$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ String $passId;
    final /* synthetic */ int $premiumRideConsumed;
    int label;
    final /* synthetic */ SuperPassDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassDaoImpl$updatePremiumRideConsumedForRideBasedPass$2(SuperPassDaoImpl superPassDaoImpl, int i, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = superPassDaoImpl;
        this.$premiumRideConsumed = i;
        this.$passId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SuperPassDaoImpl$updatePremiumRideConsumedForRideBasedPass$2(this.this$0, this.$premiumRideConsumed, this.$passId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((SuperPassDaoImpl$updatePremiumRideConsumedForRideBasedPass$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Ride_based_super_pass_tableQueries ride_based_super_pass_tableQueries = this.this$0.f2082a;
        long j = this.$premiumRideConsumed;
        String super_pass_properties_pass_id = this.$passId;
        ride_based_super_pass_tableQueries.getClass();
        Intrinsics.i(super_pass_properties_pass_id, "super_pass_properties_pass_id");
        QueryResult queryResultA0 = ride_based_super_pass_tableQueries.f697a.A0(1345835019, "UPDATE ride_based_super_pass_table SET super_pass_validation_properties_premium_rides_consumed = ? WHERE super_pass_properties_pass_id = ?", new xa(j, super_pass_properties_pass_id, 9));
        ride_based_super_pass_tableQueries.T(1345835019, new x21(10));
        return queryResultA0;
    }
}
