package app.chalo.vault.dao;

import app.chalo.security.sync.keystorage.KeyEntity;
import app.chalo.vault.KeystorageQueries;
import app.chalo.vault.mappers.KeyEntityMapper;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/security/sync/keystorage/KeyEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.vault.dao.KeyDaoImpl$getAllKeyBetweenTS$2", f = "KeyDaoImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class KeyDaoImpl$getAllKeyBetweenTS$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends KeyEntity>>, Object> {
    final /* synthetic */ String $agency;
    final /* synthetic */ long $time;
    int label;
    final /* synthetic */ KeyDaoImpl this$0;

    /* JADX INFO: renamed from: app.chalo.vault.dao.KeyDaoImpl$getAllKeyBetweenTS$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function4<Long, Long, String, String, KeyEntity> {
        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            long jLongValue = ((Number) obj).longValue();
            long jLongValue2 = ((Number) obj2).longValue();
            String p2 = (String) obj3;
            String p3 = (String) obj4;
            Intrinsics.i(p2, "p2");
            Intrinsics.i(p3, "p3");
            ((KeyEntityMapper) this.receiver).getClass();
            return new KeyEntity(jLongValue, jLongValue2, p2, p3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyDaoImpl$getAllKeyBetweenTS$2(KeyDaoImpl keyDaoImpl, long j, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = keyDaoImpl;
        this.$time = j;
        this.$agency = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new KeyDaoImpl$getAllKeyBetweenTS$2(this.this$0, this.$time, this.$agency, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((KeyDaoImpl$getAllKeyBetweenTS$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        KeystorageQueries keystorageQueriesF = this.this$0.f10754a.f();
        long j = this.$time;
        String lowerCase = this.$agency.toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        return keystorageQueriesF.W(j, lowerCase, new AnonymousClass1(4, KeyEntityMapper.f10766a, KeyEntityMapper.class, "mapper", "mapper(JJLjava/lang/String;Ljava/lang/String;)Lapp/chalo/security/sync/keystorage/KeyEntity;", 0)).b();
    }
}
