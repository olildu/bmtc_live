package app.chalo.ble_communication.domain;

import app.chalo.ble_communication.BLEOperationStatus;
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
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lapp/chalo/ble_communication/BLEOperationStatus;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ble_communication.domain.BLEOperationExecutor$waitUntilBLETerminalOperation$2", f = "BLEOperationExecutor.kt", l = {}, m = "invokeSuspend", v = 1)
final class BLEOperationExecutor$waitUntilBLETerminalOperation$2 extends SuspendLambda implements Function2<BLEOperationStatus, Continuation<? super Boolean>, Object> {
    final /* synthetic */ boolean $shouldWaitUntilConfirmedSuccessOrFailure;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BLEOperationExecutor$waitUntilBLETerminalOperation$2(boolean z, Continuation continuation) {
        super(2, continuation);
        this.$shouldWaitUntilConfirmedSuccessOrFailure = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BLEOperationExecutor$waitUntilBLETerminalOperation$2 bLEOperationExecutor$waitUntilBLETerminalOperation$2 = new BLEOperationExecutor$waitUntilBLETerminalOperation$2(this.$shouldWaitUntilConfirmedSuccessOrFailure, continuation);
        bLEOperationExecutor$waitUntilBLETerminalOperation$2.L$0 = obj;
        return bLEOperationExecutor$waitUntilBLETerminalOperation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BLEOperationExecutor$waitUntilBLETerminalOperation$2) create((BLEOperationStatus) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        return Boolean.valueOf(BLEOperationExecutorKt.a((BLEOperationStatus) this.L$0, this.$shouldWaitUntilConfirmedSuccessOrFailure));
    }
}
