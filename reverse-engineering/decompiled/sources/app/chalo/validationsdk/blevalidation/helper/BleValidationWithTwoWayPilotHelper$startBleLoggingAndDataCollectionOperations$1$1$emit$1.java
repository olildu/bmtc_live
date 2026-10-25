package app.chalo.validationsdk.blevalidation.helper;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$1$1", f = "BleValidationWithTwoWayPilotHelper.kt", l = {65, 66}, m = "emit", v = 1)
final class BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$1.AnonymousClass1<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$1$1$emit$1(BleValidationWithTwoWayPilotHelper$startBleLoggingAndDataCollectionOperations$1.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
