package app.chalo.superpass.data.models.entities;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.superpass.data.models.entities.SuperPassRepurchaseProperties", f = "SuperPassRepurchaseProperties.kt", l = {25}, m = "isVerificationExpired", v = 1)
final class SuperPassRepurchaseProperties$isVerificationExpired$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SuperPassRepurchaseProperties this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassRepurchaseProperties$isVerificationExpired$1(SuperPassRepurchaseProperties superPassRepurchaseProperties, Continuation continuation) {
        super(continuation);
        this.this$0 = superPassRepurchaseProperties;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SuperPassRepurchaseProperties$isVerificationExpired$1 superPassRepurchaseProperties$isVerificationExpired$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        SuperPassRepurchaseProperties superPassRepurchaseProperties = this.this$0;
        superPassRepurchaseProperties.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            superPassRepurchaseProperties$isVerificationExpired$1 = this;
        } else {
            superPassRepurchaseProperties$isVerificationExpired$1 = new SuperPassRepurchaseProperties$isVerificationExpired$1(superPassRepurchaseProperties, this);
        }
        Object obj2 = superPassRepurchaseProperties$isVerificationExpired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = superPassRepurchaseProperties$isVerificationExpired$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            if (!superPassRepurchaseProperties.e) {
                return Boolean.FALSE;
            }
            long j = superPassRepurchaseProperties.d;
            if (j != -1) {
                superPassRepurchaseProperties$isVerificationExpired$1.J$0 = j;
                superPassRepurchaseProperties$isVerificationExpired$1.label = 1;
                throw null;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = superPassRepurchaseProperties$isVerificationExpired$1.J$0;
            ResultKt.b(obj2);
            if (j2 <= ((Number) obj2).longValue()) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
