package app.chalo.juspay;

import kotlin.Lazy;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.juspay.JuspayControllerProviderImpl$removeJuspayController$1", f = "JuspayControllerProvider.kt", l = {99, 84}, m = "invokeSuspend", v = 1)
final class JuspayControllerProviderImpl$removeJuspayController$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ JuspayControllerProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuspayControllerProviderImpl$removeJuspayController$1(JuspayControllerProviderImpl juspayControllerProviderImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = juspayControllerProviderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JuspayControllerProviderImpl$removeJuspayController$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((JuspayControllerProviderImpl$removeJuspayController$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        JuspayControllerProviderImpl juspayControllerProviderImpl;
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        JuspayControllerHost juspayControllerHost;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                juspayControllerProviderImpl = this.this$0;
                mutex = juspayControllerProviderImpl.d;
                this.L$0 = mutex;
                this.L$1 = juspayControllerProviderImpl;
                this.label = 1;
                if (mutex.a(this) != coroutineSingletons) {
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
                    mutex = mutex2;
                    mutex.e(null);
                    return Unit.f17538a;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.e(null);
                    throw th;
                }
            }
            juspayControllerProviderImpl = (JuspayControllerProviderImpl) this.L$1;
            Mutex mutex3 = (Mutex) this.L$0;
            ResultKt.b(obj);
            mutex = mutex3;
            Lazy lazy = juspayControllerProviderImpl.b;
            if (lazy == null) {
                juspayControllerHost = null;
            } else {
                if (!lazy.isInitialized()) {
                    lazy = null;
                }
                if (lazy != null) {
                    juspayControllerHost = (JuspayControllerHost) lazy.getValue();
                } else {
                    juspayControllerHost = null;
                }
            }
            juspayControllerProviderImpl.b = null;
            if (juspayControllerHost != null) {
                this.L$0 = mutex;
                this.L$1 = null;
                this.label = 2;
                if (juspayControllerHost.g(this) != coroutineSingletons) {
                    mutex2 = mutex;
                    mutex = mutex2;
                }
                return coroutineSingletons;
            }
            mutex.e(null);
            return Unit.f17538a;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.e(null);
            throw th;
        }
    }
}
