package app.chalo.ble_communication.feature;

import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "Lapp/chalo/ble_communication/feature/BLEState;", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$3", f = "BluetoothHardwareOperationsFeature.android.kt", l = {ComposerKt.providerMapsKey}, m = "invokeSuspend", v = 1)
final class BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$3 extends SuspendLambda implements Function3<FlowCollector<? super Pair<? extends BLEState, ? extends Boolean>>, Throwable, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ BluetoothHardwareOperationsFeatureAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$3(BluetoothHardwareOperationsFeatureAndroid bluetoothHardwareOperationsFeatureAndroid, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bluetoothHardwareOperationsFeatureAndroid;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$3 bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$3 = new BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$3(this.this$0, (Continuation) obj3);
        bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$3.L$0 = (FlowCollector) obj;
        bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$3.L$1 = (Throwable) obj2;
        return bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$3.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Throwable th = (Throwable) this.L$1;
            this.this$0.getClass();
            BluetoothHardwareOperationsFeatureAndroid.g("switchBluetoothState catch: " + th);
            Pair pair = this.this$0.f.isEnabled() ? new Pair(BLEState.ON, Boolean.TRUE) : new Pair(BLEState.OFF, Boolean.TRUE);
            this.L$0 = null;
            this.label = 1;
            if (flowCollector.emit(pair, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
