package app.cash.sqldelight.async.coroutines;

import app.cash.sqldelight.db.AfterVersion;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.db.SqlSchema;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.cash.sqldelight.async.coroutines.SynchronousKt$synchronous$1$migrate$1", f = "Synchronous.kt", l = {24}, m = "invokeSuspend")
final class SynchronousKt$synchronous$1$migrate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AfterVersion[] $callbacks;
    final /* synthetic */ SqlDriver $driver;
    final /* synthetic */ long $newVersion;
    final /* synthetic */ long $oldVersion;
    final /* synthetic */ SqlSchema<QueryResult.AsyncValue<Unit>> $this_synchronous;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SynchronousKt$synchronous$1$migrate$1(SqlSchema sqlSchema, SqlDriver sqlDriver, long j, long j2, AfterVersion[] afterVersionArr, Continuation continuation) {
        super(2, continuation);
        this.$this_synchronous = sqlSchema;
        this.$driver = sqlDriver;
        this.$oldVersion = j;
        this.$newVersion = j2;
        this.$callbacks = afterVersionArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SynchronousKt$synchronous$1$migrate$1(this.$this_synchronous, this.$driver, this.$oldVersion, this.$newVersion, this.$callbacks, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SynchronousKt$synchronous$1$migrate$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            SqlSchema<QueryResult.AsyncValue<Unit>> sqlSchema = this.$this_synchronous;
            SqlDriver sqlDriver = this.$driver;
            long j = this.$oldVersion;
            long j2 = this.$newVersion;
            AfterVersion[] afterVersionArr = this.$callbacks;
            ?? r11 = ((QueryResult.AsyncValue) sqlSchema.a(sqlDriver, j, j2, (AfterVersion[]) Arrays.copyOf(afterVersionArr, afterVersionArr.length))).b;
            this.label = 1;
            if (r11.invoke(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
