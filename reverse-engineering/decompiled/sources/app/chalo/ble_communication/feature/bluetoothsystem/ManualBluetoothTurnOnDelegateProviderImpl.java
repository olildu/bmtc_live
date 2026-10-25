package app.chalo.ble_communication.feature.bluetoothsystem;

import app.chalo.crashlytics.CrashlyticsLogger;
import defpackage.gd0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/feature/bluetoothsystem/ManualBluetoothTurnOnDelegateProviderImpl;", "Lapp/chalo/ble_communication/feature/bluetoothsystem/ManualBluetoothTurnOnDelegateProvider;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ManualBluetoothTurnOnDelegateProviderImpl implements ManualBluetoothTurnOnDelegateProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsLogger f1125a;
    public Lazy b;
    public final Lazy c = LazyKt.b(new gd0(this, 11));

    public ManualBluetoothTurnOnDelegateProviderImpl(CrashlyticsLogger crashlyticsLogger) {
        this.f1125a = crashlyticsLogger;
    }

    @Override // app.chalo.ble_communication.feature.bluetoothsystem.ManualBluetoothTurnOnDelegateProvider
    public final void a(Lazy delegate) {
        Intrinsics.i(delegate, "delegate");
        this.b = delegate;
    }

    @Override // app.chalo.ble_communication.feature.bluetoothsystem.ManualBluetoothTurnOnDelegateProvider
    public final ManualBluetoothTurnOnDelegate getDelegate() {
        ManualBluetoothTurnOnDelegate manualBluetoothTurnOnDelegate;
        Lazy lazy = this.b;
        return (lazy == null || (manualBluetoothTurnOnDelegate = (ManualBluetoothTurnOnDelegate) lazy.getValue()) == null) ? (ManualBluetoothTurnOnDelegateProviderImpl$defaultDelegate$2$1) this.c.getValue() : manualBluetoothTurnOnDelegate;
    }
}
