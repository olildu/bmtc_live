package app.chalo.ble_communication.feature;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeatureAndroid$startBleStateCheckJob$1", f = "BluetoothHardwareOperationsFeature.android.kt", l = {67, EACTags.DISPLAY_IMAGE, 72, EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY}, m = "invokeSuspend", v = 1)
final class BluetoothHardwareOperationsFeatureAndroid$startBleStateCheckJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BluetoothHardwareOperationsFeatureAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothHardwareOperationsFeatureAndroid$startBleStateCheckJob$1(BluetoothHardwareOperationsFeatureAndroid bluetoothHardwareOperationsFeatureAndroid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bluetoothHardwareOperationsFeatureAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BluetoothHardwareOperationsFeatureAndroid$startBleStateCheckJob$1 bluetoothHardwareOperationsFeatureAndroid$startBleStateCheckJob$1 = new BluetoothHardwareOperationsFeatureAndroid$startBleStateCheckJob$1(this.this$0, continuation);
        bluetoothHardwareOperationsFeatureAndroid$startBleStateCheckJob$1.L$0 = obj;
        return bluetoothHardwareOperationsFeatureAndroid$startBleStateCheckJob$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BluetoothHardwareOperationsFeatureAndroid$startBleStateCheckJob$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a A[PHI: r1
      0x003a: PHI (r1v4 kotlinx.coroutines.CoroutineScope) = 
      (r1v1 kotlinx.coroutines.CoroutineScope)
      (r1v3 kotlinx.coroutines.CoroutineScope)
      (r1v10 kotlinx.coroutines.CoroutineScope)
     binds: [B:15:0x0032, B:30:0x0087, B:8:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0040 A[Catch: Exception -> 0x006c, TRY_ENTER, TryCatch #0 {Exception -> 0x006c, blocks: (B:18:0x0040, B:20:0x004a, B:23:0x005b, B:13:0x002e), top: B:34:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a A[Catch: Exception -> 0x006c, TryCatch #0 {Exception -> 0x006c, blocks: (B:18:0x0040, B:20:0x004a, B:23:0x005b, B:13:0x002e), top: B:34:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d A[PHI: r1
      0x007d: PHI (r1v3 kotlinx.coroutines.CoroutineScope) = 
      (r1v2 kotlinx.coroutines.CoroutineScope)
      (r1v4 kotlinx.coroutines.CoroutineScope)
      (r1v4 kotlinx.coroutines.CoroutineScope)
      (r1v6 kotlinx.coroutines.CoroutineScope)
      (r1v8 kotlinx.coroutines.CoroutineScope)
     binds: [B:27:0x007a, B:24:0x0069, B:21:0x0058, B:13:0x002e, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0087 -> B:16:0x003a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L32
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r9)
            goto L3a
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r9)
            goto L7d
        L2a:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Exception -> L6c
            goto L7d
        L32:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            r1 = r9
        L3a:
            boolean r9 = kotlinx.coroutines.CoroutineScopeKt.e(r1)
            if (r9 == 0) goto L8a
            app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeatureAndroid r9 = r8.this$0     // Catch: java.lang.Exception -> L6c
            android.bluetooth.BluetoothAdapter r9 = r9.f     // Catch: java.lang.Exception -> L6c
            boolean r9 = r9.isEnabled()     // Catch: java.lang.Exception -> L6c
            if (r9 == 0) goto L5b
            app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeatureAndroid r9 = r8.this$0     // Catch: java.lang.Exception -> L6c
            kotlinx.coroutines.flow.MutableStateFlow r9 = r9.i     // Catch: java.lang.Exception -> L6c
            app.chalo.ble_communication.feature.BLEState r6 = app.chalo.ble_communication.feature.BLEState.ON     // Catch: java.lang.Exception -> L6c
            r8.L$0 = r1     // Catch: java.lang.Exception -> L6c
            r8.label = r5     // Catch: java.lang.Exception -> L6c
            java.lang.Object r9 = r9.emit(r6, r8)     // Catch: java.lang.Exception -> L6c
            if (r9 != r0) goto L7d
            goto L89
        L5b:
            app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeatureAndroid r9 = r8.this$0     // Catch: java.lang.Exception -> L6c
            kotlinx.coroutines.flow.MutableStateFlow r9 = r9.i     // Catch: java.lang.Exception -> L6c
            app.chalo.ble_communication.feature.BLEState r6 = app.chalo.ble_communication.feature.BLEState.OFF     // Catch: java.lang.Exception -> L6c
            r8.L$0 = r1     // Catch: java.lang.Exception -> L6c
            r8.label = r4     // Catch: java.lang.Exception -> L6c
            java.lang.Object r9 = r9.emit(r6, r8)     // Catch: java.lang.Exception -> L6c
            if (r9 != r0) goto L7d
            goto L89
        L6c:
            app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeatureAndroid r9 = r8.this$0
            kotlinx.coroutines.flow.MutableStateFlow r9 = r9.i
            app.chalo.ble_communication.feature.BLEState r6 = app.chalo.ble_communication.feature.BLEState.UNKNOWN
            r8.L$0 = r1
            r8.label = r3
            java.lang.Object r9 = r9.emit(r6, r8)
            if (r9 != r0) goto L7d
            goto L89
        L7d:
            r8.L$0 = r1
            r8.label = r2
            r6 = 300(0x12c, double:1.48E-321)
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.b(r6, r8)
            if (r9 != r0) goto L3a
        L89:
            return r0
        L8a:
            kotlin.Unit r9 = kotlin.Unit.f17538a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeatureAndroid$startBleStateCheckJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
