package app.chalo.ble_communication.feature.bluetoothsystem;

import android.content.Intent;
import defpackage.eh0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/feature/bluetoothsystem/ManualBluetoothTurnOnDelegateAndroid;", "Lapp/chalo/ble_communication/feature/bluetoothsystem/ManualBluetoothTurnOnDelegate;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ManualBluetoothTurnOnDelegateAndroid implements ManualBluetoothTurnOnDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eh0 f1123a;
    public Function1 b;

    public ManualBluetoothTurnOnDelegateAndroid(eh0 eh0Var) {
        this.f1123a = eh0Var;
    }

    @Override // app.chalo.ble_communication.feature.bluetoothsystem.ManualBluetoothTurnOnDelegate
    public final Object a(Continuation continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.c(continuation));
        cancellableContinuationImpl.u();
        this.b = new Function1<Boolean, Unit>() { // from class: app.chalo.ble_communication.feature.bluetoothsystem.ManualBluetoothTurnOnDelegateAndroid$requestToTurnOnBleManually$2$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Boolean bool = (Boolean) obj;
                bool.getClass();
                cancellableContinuationImpl.resumeWith(bool);
                this.b = null;
                return Unit.f17538a;
            }
        };
        this.f1123a.invoke(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
        Object objT = cancellableContinuationImpl.t();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objT;
    }
}
