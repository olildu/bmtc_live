package app.chalo.helper;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isActiveSubsPresent", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.helper.CoroutineScopeHelperImpl$monitorSubscriberCount$2", f = "CoroutineScopeHelper.kt", l = {}, m = "invokeSuspend", v = 1)
final class CoroutineScopeHelperImpl$monitorSubscriberCount$2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ CoroutineScopeHelperImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineScopeHelperImpl$monitorSubscriberCount$2(CoroutineScopeHelperImpl coroutineScopeHelperImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = coroutineScopeHelperImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CoroutineScopeHelperImpl$monitorSubscriberCount$2 coroutineScopeHelperImpl$monitorSubscriberCount$2 = new CoroutineScopeHelperImpl$monitorSubscriberCount$2(this.this$0, continuation);
        coroutineScopeHelperImpl$monitorSubscriberCount$2.Z$0 = ((Boolean) obj).booleanValue();
        return coroutineScopeHelperImpl$monitorSubscriberCount$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        CoroutineScopeHelperImpl$monitorSubscriberCount$2 coroutineScopeHelperImpl$monitorSubscriberCount$2 = (CoroutineScopeHelperImpl$monitorSubscriberCount$2) create(bool, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        coroutineScopeHelperImpl$monitorSubscriberCount$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        if (!this.Z$0) {
            ContextScope contextScope = this.this$0.c;
            if (contextScope != null) {
                CoroutineScopeKt.b(contextScope, null);
            }
            this.this$0.c = null;
        }
        return Unit.f17538a;
    }
}
