package app.chalo.ble_communication.feature;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import defpackage.l3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lapp/chalo/ble_communication/feature/BLEState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeatureAndroid$getBluetoothState$2", f = "BluetoothHardwareOperationsFeature.android.kt", l = {236}, m = "invokeSuspend", v = 1)
final class BluetoothHardwareOperationsFeatureAndroid$getBluetoothState$2 extends SuspendLambda implements Function2<ProducerScope<? super BLEState>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BluetoothHardwareOperationsFeatureAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothHardwareOperationsFeatureAndroid$getBluetoothState$2(BluetoothHardwareOperationsFeatureAndroid bluetoothHardwareOperationsFeatureAndroid, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bluetoothHardwareOperationsFeatureAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BluetoothHardwareOperationsFeatureAndroid$getBluetoothState$2 bluetoothHardwareOperationsFeatureAndroid$getBluetoothState$2 = new BluetoothHardwareOperationsFeatureAndroid$getBluetoothState$2(this.this$0, continuation);
        bluetoothHardwareOperationsFeatureAndroid$getBluetoothState$2.L$0 = obj;
        return bluetoothHardwareOperationsFeatureAndroid$getBluetoothState$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BluetoothHardwareOperationsFeatureAndroid$getBluetoothState$2) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final BluetoothHardwareOperationsFeatureAndroid bluetoothHardwareOperationsFeatureAndroid = this.this$0;
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: app.chalo.ble_communication.feature.BluetoothHardwareOperationsFeatureAndroid$getBluetoothState$2$receiver$1
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    Intrinsics.i(context, "context");
                    Intrinsics.i(intent, "intent");
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                    bluetoothHardwareOperationsFeatureAndroid.getClass();
                    BluetoothHardwareOperationsFeatureAndroid.g("onReceive=" + intExtra);
                    ProducerScope producerScope2 = producerScope;
                    if (intExtra == 10) {
                        ChannelsKt.c(producerScope2, BLEState.OFF);
                    } else {
                        if (intExtra != 12) {
                            return;
                        }
                        ChannelsKt.c(producerScope2, BLEState.ON);
                    }
                }
            };
            this.this$0.f1117a.registerReceiver(broadcastReceiver, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
            l3 l3Var = new l3(12, this.this$0, broadcastReceiver);
            this.label = 1;
            if (ProduceKt.a(producerScope, l3Var, this) == coroutineSingletons) {
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
