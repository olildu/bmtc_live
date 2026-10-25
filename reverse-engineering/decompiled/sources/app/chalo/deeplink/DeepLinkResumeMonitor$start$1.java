package app.chalo.deeplink;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "allSatisfied", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.deeplink.DeepLinkResumeMonitor$start$1", f = "DeepLinkResumeMonitor.kt", l = {40}, m = "invokeSuspend", v = 1)
final class DeepLinkResumeMonitor$start$1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ DeepLinkResumeMonitor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeepLinkResumeMonitor$start$1(DeepLinkResumeMonitor deepLinkResumeMonitor, Continuation continuation) {
        super(2, continuation);
        this.this$0 = deepLinkResumeMonitor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeepLinkResumeMonitor$start$1 deepLinkResumeMonitor$start$1 = new DeepLinkResumeMonitor$start$1(this.this$0, continuation);
        deepLinkResumeMonitor$start$1.Z$0 = ((Boolean) obj).booleanValue();
        return deepLinkResumeMonitor$start$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((DeepLinkResumeMonitor$start$1) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            z = this.Z$0;
            if (z) {
                DeepLinkResumeMonitor deepLinkResumeMonitor = this.this$0;
                if (!deepLinkResumeMonitor.d) {
                    DeepLinkResumeManager deepLinkResumeManager = deepLinkResumeMonitor.f2464a;
                    this.Z$0 = z;
                    this.label = 1;
                    if (deepLinkResumeManager.a(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z2 = z;
                }
            }
            this.this$0.d = z;
            return Unit.f17538a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z2 = this.Z$0;
        ResultKt.b(obj);
        z = z2;
        this.this$0.d = z;
        return Unit.f17538a;
    }
}
