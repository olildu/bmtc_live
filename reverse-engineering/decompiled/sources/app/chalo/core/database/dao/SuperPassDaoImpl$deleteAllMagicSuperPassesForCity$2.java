package app.chalo.core.database.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.core.Magic_super_pass_tableQueries;
import defpackage.n10;
import defpackage.xg0;
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
@DebugMetadata(c = "app.chalo.core.database.dao.SuperPassDaoImpl$deleteAllMagicSuperPassesForCity$2", f = "SuperPassDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class SuperPassDaoImpl$deleteAllMagicSuperPassesForCity$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ String $city;
    int label;
    final /* synthetic */ SuperPassDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassDaoImpl$deleteAllMagicSuperPassesForCity$2(SuperPassDaoImpl superPassDaoImpl, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = superPassDaoImpl;
        this.$city = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SuperPassDaoImpl$deleteAllMagicSuperPassesForCity$2(this.this$0, this.$city, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((SuperPassDaoImpl$deleteAllMagicSuperPassesForCity$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Magic_super_pass_tableQueries magic_super_pass_tableQueries = this.this$0.b;
        String super_pass_properties_city_name = this.$city;
        magic_super_pass_tableQueries.getClass();
        Intrinsics.i(super_pass_properties_city_name, "super_pass_properties_city_name");
        QueryResult queryResultA0 = magic_super_pass_tableQueries.f697a.A0(-1461870188, "DELETE FROM magic_super_pass_table WHERE super_pass_properties_city_name = ?", new n10(super_pass_properties_city_name, 27));
        magic_super_pass_tableQueries.T(-1461870188, new xg0(11));
        return queryResultA0;
    }
}
