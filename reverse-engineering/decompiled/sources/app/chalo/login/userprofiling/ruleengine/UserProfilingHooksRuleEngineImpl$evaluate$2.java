package app.chalo.login.userprofiling.ruleengine;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.userprofiling.ruleengine.RuleDecision;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/userprofiling/ruleengine/RuleDecision;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineImpl$evaluate$2", f = "UserProfilingHooksRuleEngineImpl.kt", l = {TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 25}, m = "invokeSuspend", v = 1)
final class UserProfilingHooksRuleEngineImpl$evaluate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RuleDecision>, Object> {
    final /* synthetic */ String $ruleId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ UserProfilingHooksRuleEngineImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfilingHooksRuleEngineImpl$evaluate$2(UserProfilingHooksRuleEngineImpl userProfilingHooksRuleEngineImpl, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = userProfilingHooksRuleEngineImpl;
        this.$ruleId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserProfilingHooksRuleEngineImpl$evaluate$2(this.this$0, this.$ruleId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UserProfilingHooksRuleEngineImpl$evaluate$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Mutex mutex;
        String str;
        UserProfilingHooksRuleEngineImpl userProfilingHooksRuleEngineImpl;
        Mutex mutex2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                UserProfilingHooksRuleEngineImpl userProfilingHooksRuleEngineImpl2 = this.this$0;
                mutex = userProfilingHooksRuleEngineImpl2.e;
                str = this.$ruleId;
                this.L$0 = mutex;
                this.L$1 = userProfilingHooksRuleEngineImpl2;
                this.L$2 = str;
                this.label = 1;
                if (mutex.a(this) != coroutineSingletons) {
                    userProfilingHooksRuleEngineImpl = userProfilingHooksRuleEngineImpl2;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) this.L$0;
                try {
                    ResultKt.b(obj);
                    RuleDecision ruleDecision = (RuleDecision) obj;
                    mutex2.e(null);
                    return ruleDecision;
                } catch (Throwable th) {
                    th = th;
                    mutex2.e(null);
                    throw th;
                }
            }
            String str2 = (String) this.L$2;
            userProfilingHooksRuleEngineImpl = (UserProfilingHooksRuleEngineImpl) this.L$1;
            Mutex mutex3 = (Mutex) this.L$0;
            ResultKt.b(obj);
            str = str2;
            mutex = mutex3;
            this.L$0 = mutex;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            obj = UserProfilingHooksRuleEngineImpl.e(userProfilingHooksRuleEngineImpl, str, this);
            if (obj != coroutineSingletons) {
                mutex2 = mutex;
                RuleDecision ruleDecision2 = (RuleDecision) obj;
                mutex2.e(null);
                return ruleDecision2;
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.e(null);
            throw th;
        }
    }
}
