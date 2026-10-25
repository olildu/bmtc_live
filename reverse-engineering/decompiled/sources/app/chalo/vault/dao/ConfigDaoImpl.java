package app.chalo.vault.dao;

import app.chalo.providers.CoroutineContextProvider;
import app.chalo.security.sync.config.dao.ConfigDao;
import app.chalo.security.sync.config.entity.ConfigEntity;
import app.chalo.vault.db.ChaloCoreDatabase;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/vault/dao/ConfigDaoImpl;", "Lapp/chalo/security/sync/config/dao/ConfigDao;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConfigDaoImpl implements ConfigDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloCoreDatabase f10753a;
    public final CoroutineContextProvider b;

    public ConfigDaoImpl(ChaloCoreDatabase chaloCoreDatabase, CoroutineContextProvider coroutineContextProvider) {
        this.f10753a = chaloCoreDatabase;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.security.sync.config.dao.ConfigDao
    public final Object a(Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new ConfigDaoImpl$get$2(this, "SERVER_PUBLIC_KEY", null), continuation);
    }

    @Override // app.chalo.security.sync.config.dao.ConfigDao
    public final Object b(ConfigEntity configEntity, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new ConfigDaoImpl$insert$2(this, configEntity, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }
}
