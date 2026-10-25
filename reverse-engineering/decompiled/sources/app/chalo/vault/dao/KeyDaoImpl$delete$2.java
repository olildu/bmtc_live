package app.chalo.vault.dao;

import app.cash.sqldelight.db.QueryResult;
import app.chalo.security.sync.keystorage.KeyEntity;
import app.chalo.vault.KeystorageQueries;
import defpackage.ib0;
import defpackage.n10;
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
@DebugMetadata(c = "app.chalo.vault.dao.KeyDaoImpl$delete$2", f = "KeyDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class KeyDaoImpl$delete$2 extends SuspendLambda implements Function1<Continuation<? super QueryResult<Long>>, Object> {
    final /* synthetic */ KeyEntity $entity;
    int label;
    final /* synthetic */ KeyDaoImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyDaoImpl$delete$2(KeyDaoImpl keyDaoImpl, KeyEntity keyEntity, Continuation continuation) {
        super(1, continuation);
        this.this$0 = keyDaoImpl;
        this.$entity = keyEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new KeyDaoImpl$delete$2(this.this$0, this.$entity, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((KeyDaoImpl$delete$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        KeystorageQueries keystorageQueriesF = this.this$0.f10754a.f();
        String key = this.$entity.c;
        keystorageQueriesF.getClass();
        Intrinsics.i(key, "key");
        QueryResult queryResultA0 = keystorageQueriesF.f697a.A0(1186646201, "DELETE FROM keystorage WHERE key = ?", new n10(key, 16));
        keystorageQueriesF.T(1186646201, new ib0(16));
        return queryResultA0;
    }
}
