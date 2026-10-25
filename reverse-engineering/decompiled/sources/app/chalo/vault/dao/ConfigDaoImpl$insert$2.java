package app.chalo.vault.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.security.sync.config.entity.ConfigEntity;
import app.chalo.vault.Config;
import app.chalo.vault.ConfigQueries;
import defpackage.cp;
import defpackage.qp;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lapp/cash/sqldelight/db/QueryResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.vault.dao.ConfigDaoImpl$insert$2", f = "ConfigDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class ConfigDaoImpl$insert$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ ConfigEntity $config;
    int label;
    final /* synthetic */ ConfigDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigDaoImpl$insert$2(ConfigDaoImpl configDaoImpl, ConfigEntity configEntity, Continuation continuation) {
        super(1, continuation);
        this.this$0 = configDaoImpl;
        this.$config = configEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ConfigDaoImpl$insert$2(this.this$0, this.$config, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ConfigDaoImpl$insert$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        ConfigQueries c = this.this$0.f10753a.e().getC();
        ConfigEntity configEntity = this.$config;
        Intrinsics.i(configEntity, "<this>");
        Config config = new Config(configEntity.f9380a, configEntity.b);
        c.getClass();
        QueryResult queryResultA0 = c.f697a.A0(452927565, "INSERT OR REPLACE INTO config (key, value) VALUES (?, ?)", new qp(config, 2));
        c.T(452927565, new cp(22));
        return queryResultA0;
    }
}
