package app.chalo.validationsdk.blevalidation.helper;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger", f = "TwoWayBleCommPilotLogger.kt", l = {225, 228}, m = "onStopBleValidationWithDelayCalled", v = 1)
final class TwoWayBleCommPilotLogger$onStopBleValidationWithDelayCalled$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TwoWayBleCommPilotLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoWayBleCommPilotLogger$onStopBleValidationWithDelayCalled$1(TwoWayBleCommPilotLogger twoWayBleCommPilotLogger, Continuation continuation) {
        super(continuation);
        this.this$0 = twoWayBleCommPilotLogger;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        if (r1.e(r2, r8, r7, r5, r6) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            r9.result = r10
            int r10 = r9.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r10 | r0
            r9.label = r10
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger r1 = r9.this$0
            r1.getClass()
            int r10 = r9.label
            r2 = r10 & r0
            if (r2 == 0) goto L19
            int r10 = r10 - r0
            r9.label = r10
            r6 = r9
            goto L1f
        L19:
            app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStopBleValidationWithDelayCalled$1 r10 = new app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStopBleValidationWithDelayCalled$1
            r10.<init>(r1, r9)
            r6 = r10
        L1f:
            java.lang.Object r10 = r6.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r6.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4e
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            kotlin.ResultKt.b(r10)
            goto L8a
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3a:
            java.lang.Object r2 = r6.L$3
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r2 = (app.chalo.validationsdk.blevalidation.helper.BLEEventType) r2
            java.lang.Object r5 = r6.L$2
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r7 = r6.L$1
            app.chalo.constants.Source r7 = (app.chalo.constants.Source) r7
            java.lang.Object r8 = r6.L$0
            app.chalo.validationsdk.blevalidation.helper.ProductForLogging r8 = (app.chalo.validationsdk.blevalidation.helper.ProductForLogging) r8
            kotlin.ResultKt.b(r10)
            goto L67
        L4e:
            kotlin.ResultKt.b(r10)
            app.chalo.validationsdk.blevalidation.helper.BLEEventType r2 = app.chalo.validationsdk.blevalidation.helper.BLEEventType.STOP_BLE_VALIDATION_WITH_DELAY_CALLED
            r6.L$0 = r3
            r6.L$1 = r3
            r6.L$2 = r3
            r6.L$3 = r2
            r6.label = r5
            java.lang.Object r10 = r1.s(r2, r6)
            if (r10 != r0) goto L64
            goto L89
        L64:
            r5 = r3
            r7 = r5
            r8 = r7
        L67:
            r1.g = r8
            if (r5 == 0) goto L71
            java.util.LinkedHashMap r10 = kotlin.collections.MapsKt.u(r5)
        L6f:
            r5 = r10
            goto L77
        L71:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            goto L6f
        L77:
            r6.L$0 = r3
            r6.L$1 = r3
            r6.L$2 = r3
            r6.L$3 = r3
            r6.label = r4
            r4 = r7
            r3 = r8
            java.lang.Object r10 = r1.e(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L8a
        L89:
            return r0
        L8a:
            kotlin.Unit r10 = kotlin.Unit.f17538a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.blevalidation.helper.TwoWayBleCommPilotLogger$onStopBleValidationWithDelayCalled$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
