package app.chalo.ble_communication.feature;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "pair", "Lkotlin/Pair;", "Lapp/chalo/ble_communication/feature/BLEState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$4", f = "BluetoothHardwareOperationsFeature.android.kt", l = {}, m = "invokeSuspend", v = 1)
final class BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$4 extends SuspendLambda implements Function2<Pair<? extends BLEState, ? extends Boolean>, Continuation<? super Boolean>, Object> {
    final /* synthetic */ BLEState $newState;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$4(BLEState bLEState, Continuation continuation) {
        super(2, continuation);
        this.$newState = bLEState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$4 bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$4 = new BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$4(this.$newState, continuation);
        bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$4.L$0 = obj;
        return bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$4) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Pair pair = (Pair) this.L$0;
        return Boolean.valueOf(((Boolean) pair.e()).booleanValue() || pair.d() == this.$newState);
    }
}
