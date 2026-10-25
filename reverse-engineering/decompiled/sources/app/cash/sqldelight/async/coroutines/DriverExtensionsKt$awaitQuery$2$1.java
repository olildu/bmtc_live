package app.cash.sqldelight.async.coroutines;

import app.cash.sqldelight.db.SqlCursor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.cash.sqldelight.async.coroutines.DriverExtensionsKt$awaitQuery$2$1", f = "DriverExtensions.kt", l = {15}, m = "invokeSuspend")
final class DriverExtensionsKt$awaitQuery$2$1 extends SuspendLambda implements Function1<Continuation<Object>, Object> {
    final /* synthetic */ SqlCursor $it;
    final /* synthetic */ Function2<SqlCursor, Continuation<Object>, Object> $mapper;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriverExtensionsKt$awaitQuery$2$1(Function2 function2, SqlCursor sqlCursor, Continuation continuation) {
        super(1, continuation);
        this.$mapper = function2;
        this.$it = sqlCursor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DriverExtensionsKt$awaitQuery$2$1(this.$mapper, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((DriverExtensionsKt$awaitQuery$2$1) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        Function2<SqlCursor, Continuation<Object>, Object> function2 = this.$mapper;
        SqlCursor sqlCursor = this.$it;
        this.label = 1;
        Object objInvoke = function2.invoke(sqlCursor, this);
        return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
    }
}
