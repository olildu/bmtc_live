package app.chalo.vault.dao;

import app.chalo.providers.CoroutineContextProvider;
import app.chalo.security.sync.keystorage.KeyDao;
import app.chalo.vault.db.ChaloCoreDatabase;
import app.chalo.vault.db.ChaloCoreDatabaseKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/vault/dao/KeyDaoImpl;", "Lapp/chalo/security/sync/keystorage/KeyDao;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KeyDaoImpl implements KeyDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloCoreDatabase f10754a;
    public final CoroutineContextProvider b;

    public KeyDaoImpl(ChaloCoreDatabase chaloCoreDatabase, CoroutineContextProvider coroutineContextProvider) {
        this.f10754a = chaloCoreDatabase;
        this.b = coroutineContextProvider;
    }

    @Override // app.chalo.security.sync.keystorage.KeyDao
    public final Object a(long j, String str, Continuation continuation) {
        return ChaloCoreDatabaseKt.a(this.b, new KeyDaoImpl$getAllKeyBetweenTS$2(this, j, str, null), continuation);
    }

    @Override // app.chalo.security.sync.keystorage.KeyDao
    public final Object b(ArrayList arrayList, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new KeyDaoImpl$insertAll$2(this, arrayList, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }

    @Override // app.chalo.security.sync.keystorage.KeyDao
    public final Object c(long j, Continuation continuation) {
        Object objA = ChaloCoreDatabaseKt.a(this.b, new KeyDaoImpl$deleteOldValidTo$2(this, j, null), continuation);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }
}
