package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Mticket_activation_store_table;
import app.chalo.core.Mticket_activation_store_tableQueries;
import app.chalo.models.mticketing.entity.MTicketActivationInfoEntityModel;
import defpackage.lj0;
import defpackage.wi0;
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
@DebugMetadata(c = "app.chalo.core.database.dao.MTicketActivationStoreDaoImpl$setMTicketActivationInfo$2", f = "MTicketActivationStoreDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class MTicketActivationStoreDaoImpl$setMTicketActivationInfo$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ MTicketActivationInfoEntityModel $activationInfo;
    int label;
    final /* synthetic */ MTicketActivationStoreDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTicketActivationStoreDaoImpl$setMTicketActivationInfo$2(MTicketActivationStoreDaoImpl mTicketActivationStoreDaoImpl, MTicketActivationInfoEntityModel mTicketActivationInfoEntityModel, Continuation continuation) {
        super(1, continuation);
        this.this$0 = mTicketActivationStoreDaoImpl;
        this.$activationInfo = mTicketActivationInfoEntityModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MTicketActivationStoreDaoImpl$setMTicketActivationInfo$2(this.this$0, this.$activationInfo, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((MTicketActivationStoreDaoImpl$setMTicketActivationInfo$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Mticket_activation_store_tableQueries mticket_activation_store_tableQueries = this.this$0.f2053a;
        MTicketActivationInfoEntityModel mTicketActivationInfoEntityModel = this.$activationInfo;
        Intrinsics.i(mTicketActivationInfoEntityModel, "<this>");
        Mticket_activation_store_table mticket_activation_store_table = new Mticket_activation_store_table(mTicketActivationInfoEntityModel.f5626a, mTicketActivationInfoEntityModel.b, mTicketActivationInfoEntityModel.c, mTicketActivationInfoEntityModel.d);
        mticket_activation_store_tableQueries.getClass();
        QueryResult queryResultA0 = mticket_activation_store_tableQueries.f697a.A0(-1733262475, "INSERT OR REPLACE INTO mticket_activation_store_table (city, mticketId, activatedAt, isActivated) VALUES (?, ?, ?, ?)", new wi0(mticket_activation_store_table, 8));
        mticket_activation_store_tableQueries.T(-1733262475, new lj0(2));
        return queryResultA0;
    }
}
