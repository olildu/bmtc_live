package app.chalo.vault.dao;

import app.cash.sqldelight.QueryKt;
import app.chalo.security.sync.config.entity.ConfigEntity;
import app.chalo.vault.ConfigQueries;
import app.chalo.vault.mappers.ConfigEntityMapper;
import defpackage.ls;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/security/sync/config/entity/ConfigEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.vault.dao.ConfigDaoImpl$getAll$2", f = "ConfigDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class ConfigDaoImpl$getAll$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends ConfigEntity>>, Object> {
    int label;
    final /* synthetic */ ConfigDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.vault.dao.ConfigDaoImpl$getAll$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<String, String, ConfigEntity> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            String p0 = (String) obj;
            String p1 = (String) obj2;
            Intrinsics.i(p0, "p0");
            Intrinsics.i(p1, "p1");
            ((ConfigEntityMapper) this.receiver).getClass();
            return new ConfigEntity(p0, p1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigDaoImpl$getAll$2(ConfigDaoImpl configDaoImpl, Continuation continuation) {
        super(1, continuation);
        this.this$0 = configDaoImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ConfigDaoImpl$getAll$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ConfigDaoImpl$getAll$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        ConfigQueries c = this.this$0.f10753a.e().getC();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, ConfigEntityMapper.f10765a, ConfigEntityMapper.class, "mapper", "mapper(Ljava/lang/String;Ljava/lang/String;)Lapp/chalo/security/sync/config/entity/ConfigEntity;", 0);
        c.getClass();
        return QueryKt.a(387352575, new String[]{"config"}, c.f697a, "config.sq", "getAll", "SELECT config.key, config.value FROM config", new ls(1, anonymousClass1)).b();
    }
}
