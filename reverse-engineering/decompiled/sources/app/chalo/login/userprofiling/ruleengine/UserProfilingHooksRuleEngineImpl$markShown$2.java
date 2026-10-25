package app.chalo.login.userprofiling.ruleengine;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineImpl$markShown$2", f = "UserProfilingHooksRuleEngineImpl.kt", l = {TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 365, 366, 368, 381}, m = "invokeSuspend", v = 1)
final class UserProfilingHooksRuleEngineImpl$markShown$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $ruleId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ UserProfilingHooksRuleEngineImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfilingHooksRuleEngineImpl$markShown$2(UserProfilingHooksRuleEngineImpl userProfilingHooksRuleEngineImpl, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = userProfilingHooksRuleEngineImpl;
        this.$ruleId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserProfilingHooksRuleEngineImpl$markShown$2(this.this$0, this.$ruleId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UserProfilingHooksRuleEngineImpl$markShown$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3 A[Catch: all -> 0x0075, TRY_ENTER, TryCatch #1 {all -> 0x0075, blocks: (B:49:0x00d5, B:53:0x00dd, B:27:0x006e, B:41:0x00bb, B:45:0x00c3), top: B:73:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dd A[Catch: all -> 0x0075, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0075, blocks: (B:49:0x00d5, B:53:0x00dd, B:27:0x006e, B:41:0x00bb, B:45:0x00c3), top: B:73:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fc A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:10:0x001f, B:57:0x00f0, B:59:0x00fc, B:61:0x0102, B:63:0x0112, B:65:0x0118, B:62:0x010c, B:37:0x00a6), top: B:72:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0102 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:10:0x001f, B:57:0x00f0, B:59:0x00fc, B:61:0x0102, B:63:0x0112, B:65:0x0118, B:62:0x010c, B:37:0x00a6), top: B:72:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:62:0x010c A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:10:0x001f, B:57:0x00f0, B:59:0x00fc, B:61:0x0102, B:63:0x0112, B:65:0x0118, B:62:0x010c, B:37:0x00a6), top: B:72:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0118 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:10:0x001f, B:57:0x00f0, B:59:0x00fc, B:61:0x0102, B:63:0x0112, B:65:0x0118, B:62:0x010c, B:37:0x00a6), top: B:72:0x000e }] */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012f, code lost:
    
        if (r4.e(r5, r16) == r0) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineImpl$markShown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
