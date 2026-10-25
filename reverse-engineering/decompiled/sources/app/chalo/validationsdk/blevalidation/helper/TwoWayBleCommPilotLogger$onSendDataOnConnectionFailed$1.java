package app.chalo.validationsdk.blevalidation.helper;

import androidx.media3.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger", f = "TwoWayBleCommPilotLogger.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4, 178}, m = "onSendDataOnConnectionFailed", v = 1)
final class TwoWayBleCommPilotLogger$onSendDataOnConnectionFailed$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TwoWayBleCommPilotLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoWayBleCommPilotLogger$onSendDataOnConnectionFailed$1(TwoWayBleCommPilotLogger twoWayBleCommPilotLogger, Continuation continuation) {
        super(continuation);
        this.this$0 = twoWayBleCommPilotLogger;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b2, code lost:
    
        if (r1.e(r5, r9, r8, r13, r6) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            r12.result = r13
            int r13 = r12.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = r13 | r0
            r12.label = r13
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger r1 = r12.this$0
            r1.getClass()
            int r13 = r12.label
            r2 = r13 & r0
            if (r2 == 0) goto L19
            int r13 = r13 - r0
            r12.label = r13
            r6 = r12
            goto L1f
        L19:
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onSendDataOnConnectionFailed$1 r13 = new app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onSendDataOnConnectionFailed$1
            r13.<init>(r1, r12)
            r6 = r13
        L1f:
            java.lang.Object r13 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r6.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L59
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            kotlin.ResultKt.b(r13)
            goto Lb5
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L3b:
            int r2 = r6.I$0
            java.lang.Object r5 = r6.L$5
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r5 = (app.chalo.validationsdk.blevalidation.helper.BLEEventType) r5
            java.lang.Object r7 = r6.L$4
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r8 = r6.L$3
            app.chalo.constants.Source r8 = (app.chalo.constants.Source) r8
            java.lang.Object r9 = r6.L$2
            app.chalo.validationsdk.blevalidation.helper.ProductForLogging r9 = (app.chalo.validationsdk.blevalidation.helper.ProductForLogging) r9
            java.lang.Object r10 = r6.L$1
            app.chalo.ble_communication.BLEDataTransmissionFailureReason r10 = (app.chalo.ble_communication.BLEDataTransmissionFailureReason) r10
            java.lang.Object r11 = r6.L$0
            app.chalo.ble_communication.model.BLETransferData$DuplexConnectionBLETransferData r11 = (app.chalo.ble_communication.model.BLETransferData.DuplexConnectionBLETransferData) r11
            kotlin.ResultKt.b(r13)
            goto L7c
        L59:
            kotlin.ResultKt.b(r13)
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r13 = app.chalo.validationsdk.blevalidation.helper.BLEEventType.SEND_DATA_ON_CONNECTION_FAILED
            r6.L$0 = r3
            r6.L$1 = r3
            r6.L$2 = r3
            r6.L$3 = r3
            r6.L$4 = r3
            r6.L$5 = r13
            r2 = 0
            r6.I$0 = r2
            r6.label = r5
            java.lang.Object r5 = r1.s(r13, r6)
            if (r5 != r0) goto L76
            goto Lb4
        L76:
            r5 = r13
            r7 = r3
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
        L7c:
            r1.g = r9
            if (r7 == 0) goto L85
            java.util.LinkedHashMap r13 = kotlin.collections.MapsKt.u(r7)
            goto L8a
        L85:
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
        L8a:
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger.c(r13, r11)
            java.lang.String r7 = "failureReason"
            r13.put(r7, r10)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r2)
            java.lang.String r2 = "failureCount"
            r13.put(r2, r7)
            r6.L$0 = r3
            r6.L$1 = r3
            r6.L$2 = r3
            r6.L$3 = r3
            r6.L$4 = r3
            r6.L$5 = r3
            r6.label = r4
            r2 = r5
            r4 = r8
            r3 = r9
            r5 = r13
            java.lang.Object r13 = r1.e(r2, r3, r4, r5, r6)
            if (r13 != r0) goto Lb5
        Lb4:
            return r0
        Lb5:
            kotlin.Unit r13 = kotlin.Unit.f17538a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onSendDataOnConnectionFailed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
