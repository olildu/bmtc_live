package app.chalo.superpass.data.models.pendingSuperPass;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.superpass.data.models.pendingSuperPass.PendingSuperPassRepurchaseProperties", f = "PendingSuperPassRepurchaseProperties.kt", l = {24}, m = "isVerificationExpired", v = 1)
final class PendingSuperPassRepurchaseProperties$isVerificationExpired$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PendingSuperPassRepurchaseProperties this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingSuperPassRepurchaseProperties$isVerificationExpired$1(PendingSuperPassRepurchaseProperties pendingSuperPassRepurchaseProperties, Continuation continuation) {
        super(continuation);
        this.this$0 = pendingSuperPassRepurchaseProperties;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PendingSuperPassRepurchaseProperties$isVerificationExpired$1 pendingSuperPassRepurchaseProperties$isVerificationExpired$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        PendingSuperPassRepurchaseProperties pendingSuperPassRepurchaseProperties = this.this$0;
        pendingSuperPassRepurchaseProperties.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            pendingSuperPassRepurchaseProperties$isVerificationExpired$1 = this;
        } else {
            pendingSuperPassRepurchaseProperties$isVerificationExpired$1 = new PendingSuperPassRepurchaseProperties$isVerificationExpired$1(pendingSuperPassRepurchaseProperties, this);
        }
        Object obj2 = pendingSuperPassRepurchaseProperties$isVerificationExpired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pendingSuperPassRepurchaseProperties$isVerificationExpired$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = pendingSuperPassRepurchaseProperties$isVerificationExpired$1.J$0;
            ResultKt.b(obj2);
            return j <= ((Number) obj2).longValue() ? Boolean.FALSE : Boolean.TRUE;
        }
        ResultKt.b(obj2);
        if (!pendingSuperPassRepurchaseProperties.f) {
            return Boolean.FALSE;
        }
        pendingSuperPassRepurchaseProperties$isVerificationExpired$1.J$0 = pendingSuperPassRepurchaseProperties.e;
        pendingSuperPassRepurchaseProperties$isVerificationExpired$1.label = 1;
        throw null;
    }
}
