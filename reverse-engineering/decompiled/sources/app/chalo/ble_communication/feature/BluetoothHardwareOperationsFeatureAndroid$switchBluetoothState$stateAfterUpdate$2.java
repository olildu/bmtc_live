package app.chalo.ble_communication.feature;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lapp/chalo/ble_communication/feature/BLEState;", "", "bleState", "<unused var>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$2", f = "BluetoothHardwareOperationsFeature.android.kt", l = {}, m = "invokeSuspend", v = 1)
final class BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$2 extends SuspendLambda implements Function3<BLEState, Unit, Continuation<? super Pair<? extends BLEState, ? extends Boolean>>, Object> {
    final /* synthetic */ BLEState $newState;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BluetoothHardwareOperationsFeatureAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$2(BLEState bLEState, BluetoothHardwareOperationsFeatureAndroid bluetoothHardwareOperationsFeatureAndroid, Continuation continuation) {
        super(3, continuation);
        this.$newState = bLEState;
        this.this$0 = bluetoothHardwareOperationsFeatureAndroid;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$2 bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$2 = new BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$2(this.$newState, this.this$0, (Continuation) obj3);
        bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$2.L$0 = (BLEState) obj;
        return bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$2.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        BLEState bLEState = (BLEState) this.L$0;
        BLEState bLEState2 = this.$newState;
        BLEState bLEState3 = BLEState.ON;
        if (bLEState2 == bLEState3 && bLEState == BLEState.OFF) {
            this.this$0.f.enable();
        } else if (bLEState2 == BLEState.OFF && bLEState == bLEState3) {
            this.this$0.f.disable();
        }
        this.this$0.getClass();
        BluetoothHardwareOperationsFeatureAndroid.g("combineResult=" + bLEState);
        return new Pair(bLEState, Boolean.FALSE);
    }
}
