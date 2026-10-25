package app.chalo.ble_communication.feature;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$1", f = "BluetoothHardwareOperationsFeature.android.kt", l = {179}, m = "invokeSuspend", v = 1)
final class BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$1 extends SuspendLambda implements Function2<FlowCollector<? super Unit>, Continuation<? super Unit>, Object> {
    final /* synthetic */ BLEState $newState;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BluetoothHardwareOperationsFeatureAndroid this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1119a;

        static {
            int[] iArr = new int[BLEState.values().length];
            try {
                iArr[BLEState.ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BLEState.OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BLEState.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1119a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$1(BLEState bLEState, BluetoothHardwareOperationsFeatureAndroid bluetoothHardwareOperationsFeatureAndroid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bluetoothHardwareOperationsFeatureAndroid;
        this.$newState = bLEState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$1 bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$1 = new BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$1(this.$newState, this.this$0, continuation);
        bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$1.L$0 = obj;
        return bluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BluetoothHardwareOperationsFeatureAndroid$switchBluetoothState$stateAfterUpdate$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        FlowCollector flowCollector = (FlowCollector) this.L$0;
        BluetoothHardwareOperationsFeatureAndroid bluetoothHardwareOperationsFeatureAndroid = this.this$0;
        String str = "switching bluetooth state to " + this.$newState;
        bluetoothHardwareOperationsFeatureAndroid.getClass();
        BluetoothHardwareOperationsFeatureAndroid.g(str);
        int i2 = WhenMappings.f1119a[this.$newState.ordinal()];
        if (i2 == 1) {
            this.this$0.f.enable();
        } else if (i2 == 2) {
            this.this$0.f.disable();
        } else if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        this.label = 1;
        return flowCollector.emit(unit, this) == coroutineSingletons ? coroutineSingletons : unit;
    }
}
