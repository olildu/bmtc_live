package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Tito_validation_tableQueries;
import app.chalo.titoridedetail.data.app.TitoValidationStatus;
import defpackage.vi1;
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
@DebugMetadata(c = "app.chalo.core.database.dao.TITOValidationDaoImpl$updateTitoValidationStatus$2", f = "TITOValidationDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class TITOValidationDaoImpl$updateTitoValidationStatus$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ TitoValidationStatus $status;
    final /* synthetic */ String $tapId;
    int label;
    final /* synthetic */ TITOValidationDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TITOValidationDaoImpl$updateTitoValidationStatus$2(TITOValidationDaoImpl tITOValidationDaoImpl, TitoValidationStatus titoValidationStatus, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = tITOValidationDaoImpl;
        this.$status = titoValidationStatus;
        this.$tapId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TITOValidationDaoImpl$updateTitoValidationStatus$2(this.this$0, this.$status, this.$tapId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((TITOValidationDaoImpl$updateTitoValidationStatus$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Tito_validation_tableQueries tito_validation_tableQueries = this.this$0.f2083a;
        TitoValidationStatus titoStatus = this.$status;
        String tapId = this.$tapId;
        tito_validation_tableQueries.getClass();
        Intrinsics.i(titoStatus, "titoStatus");
        Intrinsics.i(tapId, "tapId");
        QueryResult queryResultA0 = tito_validation_tableQueries.f697a.A0(1955949866, "UPDATE tito_validation_table SET titoStatus = ? WHERE tapId = ?", new vi1(3, tito_validation_tableQueries, titoStatus, tapId));
        tito_validation_tableQueries.T(1955949866, new xj1(0));
        return queryResultA0;
    }
}
