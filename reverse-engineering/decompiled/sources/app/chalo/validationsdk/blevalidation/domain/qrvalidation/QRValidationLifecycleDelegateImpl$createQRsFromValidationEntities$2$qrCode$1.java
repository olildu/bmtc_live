package app.chalo.validationsdk.blevalidation.domain.qrvalidation;

import app.chalo.ticketvalidation.TicketValidationInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegateImpl$createQRsFromValidationEntities$2$qrCode$1", f = "QRValidationLifecycleDelegate.kt", l = {}, m = "invokeSuspend", v = 1)
final class QRValidationLifecycleDelegateImpl$createQRsFromValidationEntities$2$qrCode$1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    final /* synthetic */ TicketValidationInfo $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRValidationLifecycleDelegateImpl$createQRsFromValidationEntities$2$qrCode$1(TicketValidationInfo ticketValidationInfo, Continuation continuation) {
        super(1, continuation);
        this.$it = ticketValidationInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new QRValidationLifecycleDelegateImpl$createQRsFromValidationEntities$2$qrCode$1(this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((QRValidationLifecycleDelegateImpl$createQRsFromValidationEntities$2$qrCode$1) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return this.$it.b;
    }
}
