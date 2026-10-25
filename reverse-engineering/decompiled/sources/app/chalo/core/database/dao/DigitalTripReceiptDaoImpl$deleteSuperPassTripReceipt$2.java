package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Product_activation_details_tableQueries;
import defpackage.ux0;
import defpackage.vx0;
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
@DebugMetadata(c = "app.chalo.core.database.dao.DigitalTripReceiptDaoImpl$deleteSuperPassTripReceipt$2", f = "DigitalTripReceiptDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class DigitalTripReceiptDaoImpl$deleteSuperPassTripReceipt$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ long $lActivationTimeStamp;
    final /* synthetic */ String $lPassId;
    final /* synthetic */ long $lPunchTimeStamp;
    int label;
    final /* synthetic */ DigitalTripReceiptDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitalTripReceiptDaoImpl$deleteSuperPassTripReceipt$2(DigitalTripReceiptDaoImpl digitalTripReceiptDaoImpl, String str, long j, long j2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = digitalTripReceiptDaoImpl;
        this.$lPassId = str;
        this.$lActivationTimeStamp = j;
        this.$lPunchTimeStamp = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DigitalTripReceiptDaoImpl$deleteSuperPassTripReceipt$2(this.this$0, this.$lPassId, this.$lActivationTimeStamp, this.$lPunchTimeStamp, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((DigitalTripReceiptDaoImpl$deleteSuperPassTripReceipt$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Product_activation_details_tableQueries product_activation_details_tableQueries = this.this$0.f2050a;
        String pass_id = this.$lPassId;
        long j = this.$lActivationTimeStamp;
        long j2 = this.$lPunchTimeStamp;
        product_activation_details_tableQueries.getClass();
        Intrinsics.i(pass_id, "pass_id");
        QueryResult queryResultA0 = product_activation_details_tableQueries.f697a.A0(1886273495, "DELETE FROM super_pass_trip_receipt_table\nWHERE pass_id = ?\nAND activation_time_stamp = ?\nAND punch_time_stamp = ?", new vx0(pass_id, j, j2));
        product_activation_details_tableQueries.T(1886273495, new ux0(3));
        return queryResultA0;
    }
}
