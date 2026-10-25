package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Tito_validation_table;
import app.chalo.core.Tito_validation_tableQueries;
import app.chalo.tito.data.model.entity.TITOValidationEntity;
import defpackage.pg1;
import defpackage.xj1;
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
@DebugMetadata(c = "app.chalo.core.database.dao.TITOValidationDaoImpl$insertTitoEntity$2", f = "TITOValidationDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class TITOValidationDaoImpl$insertTitoEntity$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ TITOValidationEntity $entry;
    int label;
    final /* synthetic */ TITOValidationDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TITOValidationDaoImpl$insertTitoEntity$2(TITOValidationDaoImpl tITOValidationDaoImpl, TITOValidationEntity tITOValidationEntity, Continuation continuation) {
        super(1, continuation);
        this.this$0 = tITOValidationDaoImpl;
        this.$entry = tITOValidationEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TITOValidationDaoImpl$insertTitoEntity$2(this.this$0, this.$entry, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((TITOValidationDaoImpl$insertTitoEntity$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Tito_validation_tableQueries tito_validation_tableQueries = this.this$0.f2083a;
        TITOValidationEntity tITOValidationEntity = this.$entry;
        Intrinsics.i(tITOValidationEntity, "<this>");
        Tito_validation_table tito_validation_table = new Tito_validation_table(tITOValidationEntity.f9650a, tITOValidationEntity.b, tITOValidationEntity.c, tITOValidationEntity.d, tITOValidationEntity.e, tITOValidationEntity.f, tITOValidationEntity.g, tITOValidationEntity.h, tITOValidationEntity.i, tITOValidationEntity.j, tITOValidationEntity.k, tITOValidationEntity.l, tITOValidationEntity.m, tITOValidationEntity.n, tITOValidationEntity.o, tITOValidationEntity.p, tITOValidationEntity.q, tITOValidationEntity.r, tITOValidationEntity.s, tITOValidationEntity.t, tITOValidationEntity.u, tITOValidationEntity.v, tITOValidationEntity.w);
        tito_validation_tableQueries.getClass();
        QueryResult queryResultA0 = tito_validation_tableQueries.f697a.A0(1863779314, "INSERT OR REPLACE INTO tito_validation_table (tapId, tapInGroupNo, activationTSInSec, tapInTimestampInMillis, conductorValidationStaticPayload, tapInRouteId, tapInStopId, tapInTripNo, tapInWaybillNo, vehicleNo, dropOffStopId, titoStatus, userId, bookingId, productType, productSubType, titoRideExpiryTimeInMillis, tapOutGroupNo, tapOutTimestampInMillis, tapOutRouteId, tapOutStopId, tapOutTripNo, tapOutWaybillNo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", new pg1(19, tito_validation_table, tito_validation_tableQueries));
        tito_validation_tableQueries.T(1863779314, new xj1(1));
        return queryResultA0;
    }
}
