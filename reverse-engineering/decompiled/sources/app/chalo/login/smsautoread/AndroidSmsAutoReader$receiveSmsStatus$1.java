package app.chalo.login.smsautoread;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/chalo/login/smsautoread/SMSStatus;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.login.smsautoread.AndroidSmsAutoReader$receiveSmsStatus$1", f = "AndroidSmsAutoReader.kt", l = {}, m = "invokeSuspend", v = 1)
final class AndroidSmsAutoReader$receiveSmsStatus$1 extends SuspendLambda implements Function3<FlowCollector<? super SMSStatus>, Throwable, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AndroidSmsAutoReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSmsAutoReader$receiveSmsStatus$1(AndroidSmsAutoReader androidSmsAutoReader, Continuation continuation) {
        super(3, continuation);
        this.this$0 = androidSmsAutoReader;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AndroidSmsAutoReader$receiveSmsStatus$1 androidSmsAutoReader$receiveSmsStatus$1 = new AndroidSmsAutoReader$receiveSmsStatus$1(this.this$0, (Continuation) obj3);
        Unit unit = Unit.f17538a;
        androidSmsAutoReader$receiveSmsStatus$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        AndroidSmsAutoReader androidSmsAutoReader = this.this$0;
        androidSmsAutoReader.f5286a.unregisterReceiver(androidSmsAutoReader.b);
        return Unit.f17538a;
    }
}
