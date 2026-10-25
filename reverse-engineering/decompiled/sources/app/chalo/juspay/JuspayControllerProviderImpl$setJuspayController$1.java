package app.chalo.juspay;

import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.cy;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.juspay.JuspayControllerProviderImpl$setJuspayController$1", f = "JuspayControllerProvider.kt", l = {99, ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX}, m = "invokeSuspend", v = 1)
final class JuspayControllerProviderImpl$setJuspayController$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ JuspayPlatformSdkFactory $platformSdkFactory;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ JuspayControllerProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuspayControllerProviderImpl$setJuspayController$1(JuspayControllerProviderImpl juspayControllerProviderImpl, JuspayPlatformSdkFactory juspayPlatformSdkFactory, Continuation continuation) {
        super(2, continuation);
        this.this$0 = juspayControllerProviderImpl;
        this.$platformSdkFactory = juspayPlatformSdkFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JuspayControllerProviderImpl$setJuspayController$1(this.this$0, this.$platformSdkFactory, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((JuspayControllerProviderImpl$setJuspayController$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        JuspayControllerProviderImpl juspayControllerProviderImpl;
        Mutex mutex;
        JuspayPlatformSdkFactory juspayPlatformSdkFactory;
        Mutex mutex2;
        JuspayControllerHost juspayControllerHost;
        JuspayPlatformSdkFactory juspayPlatformSdkFactory2;
        JuspayControllerProviderImpl juspayControllerProviderImpl2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                juspayControllerProviderImpl = this.this$0;
                MutexImpl mutexImpl = juspayControllerProviderImpl.d;
                JuspayPlatformSdkFactory juspayPlatformSdkFactory3 = this.$platformSdkFactory;
                this.L$0 = mutexImpl;
                this.L$1 = juspayControllerProviderImpl;
                this.L$2 = juspayPlatformSdkFactory3;
                this.label = 1;
                if (mutexImpl.a(this) != coroutineSingletons) {
                    mutex = mutexImpl;
                    juspayPlatformSdkFactory = juspayPlatformSdkFactory3;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                juspayPlatformSdkFactory2 = (JuspayPlatformSdkFactory) this.L$2;
                juspayControllerProviderImpl2 = (JuspayControllerProviderImpl) this.L$1;
                mutex2 = (Mutex) this.L$0;
                try {
                    ResultKt.b(obj);
                    juspayControllerProviderImpl = juspayControllerProviderImpl2;
                    juspayPlatformSdkFactory = juspayPlatformSdkFactory2;
                    Lazy lazyB = LazyKt.b(new cy(21, juspayControllerProviderImpl, juspayPlatformSdkFactory.a()));
                    juspayControllerProviderImpl.b = lazyB;
                    mutex2.e(null);
                    return Unit.f17538a;
                } catch (Throwable th) {
                    th = th;
                    mutex2.e(null);
                    throw th;
                }
            }
            juspayPlatformSdkFactory = (JuspayPlatformSdkFactory) this.L$2;
            JuspayControllerProviderImpl juspayControllerProviderImpl3 = (JuspayControllerProviderImpl) this.L$1;
            mutex = (Mutex) this.L$0;
            ResultKt.b(obj);
            juspayControllerProviderImpl = juspayControllerProviderImpl3;
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
                this.L$1 = juspayControllerProviderImpl;
                this.L$2 = juspayPlatformSdkFactory;
                this.label = 2;
                if (juspayControllerHost.g(this) != coroutineSingletons) {
                    juspayPlatformSdkFactory2 = juspayPlatformSdkFactory;
                    mutex2 = mutex;
                    juspayControllerProviderImpl2 = juspayControllerProviderImpl;
                    juspayControllerProviderImpl = juspayControllerProviderImpl2;
                    juspayPlatformSdkFactory = juspayPlatformSdkFactory2;
                }
                return coroutineSingletons;
            }
            mutex2 = mutex;
            Lazy lazyB2 = LazyKt.b(new cy(21, juspayControllerProviderImpl, juspayPlatformSdkFactory.a()));
            juspayControllerProviderImpl.b = lazyB2;
            mutex2.e(null);
            return Unit.f17538a;
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.e(null);
            throw th;
        }
    }
}
