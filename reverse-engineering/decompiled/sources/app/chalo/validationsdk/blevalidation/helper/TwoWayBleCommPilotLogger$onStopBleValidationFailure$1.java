package app.chalo.validationsdk.blevalidation.helper;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger", f = "TwoWayBleCommPilotLogger.kt", l = {270, 274}, m = "onStopBleValidationFailure", v = 1)
final class TwoWayBleCommPilotLogger$onStopBleValidationFailure$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TwoWayBleCommPilotLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoWayBleCommPilotLogger$onStopBleValidationFailure$1(TwoWayBleCommPilotLogger twoWayBleCommPilotLogger, Continuation continuation) {
        super(continuation);
        this.this$0 = twoWayBleCommPilotLogger;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        if (r1.e(r2, r8, r7, r5, r6) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            r10.result = r11
            int r11 = r10.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = r11 | r0
            r10.label = r11
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger r1 = r10.this$0
            r1.getClass()
            int r11 = r10.label
            r2 = r11 & r0
            if (r2 == 0) goto L19
            int r11 = r11 - r0
            r10.label = r11
            r6 = r10
            goto L1f
        L19:
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStopBleValidationFailure$1 r11 = new app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStopBleValidationFailure$1
            r11.<init>(r1, r10)
            r6 = r11
        L1f:
            java.lang.Object r11 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r6.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            kotlin.ResultKt.b(r11)
            goto L9d
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3b:
            java.lang.Object r2 = r6.L$4
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r2 = (app.chalo.validationsdk.blevalidation.helper.BLEEventType) r2
            java.lang.Object r5 = r6.L$3
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r7 = r6.L$2
            app.chalo.constants.Source r7 = (app.chalo.constants.Source) r7
            java.lang.Object r8 = r6.L$1
            app.chalo.validationsdk.blevalidation.helper.ProductForLogging r8 = (app.chalo.validationsdk.blevalidation.helper.ProductForLogging) r8
            java.lang.Object r9 = r6.L$0
            app.chalo.ble_communication.StopBLECommunicationFailureReason r9 = (app.chalo.ble_communication.StopBLECommunicationFailureReason) r9
            kotlin.ResultKt.b(r11)
            goto L6f
        L53:
            kotlin.ResultKt.b(r11)
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r2 = app.chalo.validationsdk.blevalidation.helper.BLEEventType.STOP_BLE_VALIDATION_FAILED
            r6.L$0 = r3
            r6.L$1 = r3
            r6.L$2 = r3
            r6.L$3 = r3
            r6.L$4 = r2
            r6.label = r5
            java.lang.Object r11 = r1.s(r2, r6)
            if (r11 != r0) goto L6b
            goto L9c
        L6b:
            r5 = r3
            r7 = r5
            r8 = r7
            r9 = r8
        L6f:
            r1.g = r8
            if (r5 == 0) goto L79
            java.util.LinkedHashMap r11 = kotlin.collections.MapsKt.u(r5)
        L77:
            r5 = r11
            goto L7f
        L79:
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            goto L77
        L7f:
            java.lang.String r11 = "failureReason"
            java.lang.String r9 = r9.name()
            r5.put(r11, r9)
            r6.L$0 = r3
            r6.L$1 = r3
            r6.L$2 = r3
            r6.L$3 = r3
            r6.L$4 = r3
            r6.label = r4
            r4 = r7
            r3 = r8
            java.lang.Object r11 = r1.e(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L9d
        L9c:
            return r0
        L9d:
            kotlin.Unit r11 = kotlin.Unit.f17538a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStopBleValidationFailure$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
