package app.chalo.juspay;

import app.chalo.utils.KUUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
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
@DebugMetadata(c = "app.chalo.juspay.JuspayControllerImpl$refreshAuthInBackground$1", f = "JuspayControllerImpl.kt", l = {1046, 580}, m = "invokeSuspend", v = 1)
final class JuspayControllerImpl$refreshAuthInBackground$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ JuspayInitiateConditions $conditions;
    final /* synthetic */ String $source;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ JuspayControllerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuspayControllerImpl$refreshAuthInBackground$1(JuspayControllerImpl juspayControllerImpl, JuspayInitiateConditions juspayInitiateConditions, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = juspayControllerImpl;
        this.$conditions = juspayInitiateConditions;
        this.$source = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JuspayControllerImpl$refreshAuthInBackground$1(this.this$0, this.$conditions, this.$source, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((JuspayControllerImpl$refreshAuthInBackground$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        JuspayControllerImpl juspayControllerImpl;
        Mutex mutex;
        JuspayInitiateConditions juspayInitiateConditions;
        String str;
        Mutex mutex2;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    ResultKt.b(obj);
                    juspayControllerImpl = this.this$0;
                    mutex = juspayControllerImpl.h;
                    JuspayInitiateConditions juspayInitiateConditions2 = this.$conditions;
                    String str2 = this.$source;
                    this.L$0 = mutex;
                    this.L$1 = juspayControllerImpl;
                    this.L$2 = juspayInitiateConditions2;
                    this.L$3 = str2;
                    this.label = 1;
                    if (mutex.a(this) != coroutineSingletons) {
                        juspayInitiateConditions = juspayInitiateConditions2;
                        str = str2;
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
                        this.this$0.s = false;
                        return Unit.f17538a;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2.e(null);
                        throw th;
                    }
                }
                str = (String) this.L$3;
                juspayInitiateConditions = (JuspayInitiateConditions) this.L$2;
                juspayControllerImpl = (JuspayControllerImpl) this.L$1;
                Mutex mutex3 = (Mutex) this.L$0;
                ResultKt.b(obj);
                mutex = mutex3;
                JuspaySdkAdapterImpl juspaySdkAdapterImpl = juspayControllerImpl.d;
                if ((juspaySdkAdapterImpl != null && juspayControllerImpl.q(juspayInitiateConditions)) ? JuspayControllerImpl.r(juspaySdkAdapterImpl) : false) {
                    juspayControllerImpl.x("juspay action initiated", str, MapsKt.h(new Pair("action", JusPayAction.UpdateAuth.getActionName())));
                    JuspaySdkAdapterImpl juspaySdkAdapterImpl2 = juspayControllerImpl.d;
                    JusPaySDKRequestAppModel.UpdateSessionToken updateSessionToken = JusPaySDKRequestAppModel.UpdateSessionToken.b;
                    String strA = KUUID.a();
                    this.L$0 = mutex;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 2;
                    if (juspaySdkAdapterImpl2.c(updateSessionToken, strA, this) != coroutineSingletons) {
                        mutex2 = mutex;
                        mutex = mutex2;
                    }
                    return coroutineSingletons;
                }
                mutex.e(null);
                this.this$0.s = false;
                return Unit.f17538a;
            } catch (Throwable th3) {
                mutex2 = mutex;
                th = th3;
                mutex2.e(null);
                throw th;
            }
        } catch (Throwable th4) {
            this.this$0.s = false;
            throw th4;
        }
    }
}
