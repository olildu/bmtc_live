package app.chalo.ble_communication.feature.bluetoothsystem;

import android.os.Build;
import app.chalo.ble_communication.BLECommunicationServiceType;
import app.chalo.ble_communication.feature.BLEPermissionRequirement;
import app.chalo.permissions.models.AppPermission;
import app.chalo.usecase.ArePermissionsGrantedUseCase;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/feature/bluetoothsystem/BluetoothPermissionAndSystemFeatureAndroid;", "Lapp/chalo/ble_communication/feature/bluetoothsystem/BluetoothPermissionAndSystemFeature;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BluetoothPermissionAndSystemFeatureAndroid implements BluetoothPermissionAndSystemFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArePermissionsGrantedUseCase f1120a;
    public final ManualBluetoothTurnOnDelegateProvider b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1121a;

        static {
            int[] iArr = new int[BLEPermissionRequirement.values().length];
            try {
                iArr[BLEPermissionRequirement.SCANNING_PERMISSION_NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BLEPermissionRequirement.SCANNING_PERMISSION_OPTIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BLEPermissionRequirement.SCANNING_PERMISSION_NECESSARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1121a = iArr;
        }
    }

    public BluetoothPermissionAndSystemFeatureAndroid(ArePermissionsGrantedUseCase arePermissionsGrantedUseCase, ManualBluetoothTurnOnDelegateProvider manualBluetoothTurnOnDelegateProvider) {
        this.f1120a = arePermissionsGrantedUseCase;
        this.b = manualBluetoothTurnOnDelegateProvider;
    }

    @Override // app.chalo.ble_communication.feature.bluetoothsystem.BluetoothPermissionAndSystemFeature
    public final Object a(Continuation continuation) {
        return this.b.getDelegate().a(continuation);
    }

    @Override // app.chalo.ble_communication.feature.bluetoothsystem.BluetoothPermissionAndSystemFeature
    public final List b(boolean z) {
        if (Build.VERSION.SDK_INT >= 31) {
            return CollectionsKt.S(AppPermission.BLUETOOTH_SCAN, AppPermission.BLUETOOTH_CONNECT, AppPermission.BLUETOOTH_ADVERTISE);
        }
        return z ? CollectionsKt.S(AppPermission.FINE_LOCATION, AppPermission.COARSE_LOCATION) : EmptyList.f17557a;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        if (r12 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cb, code lost:
    
        if (r12 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ee, code lost:
    
        if (r12 == r1) goto L64;
     */
    @Override // app.chalo.ble_communication.feature.bluetoothsystem.BluetoothPermissionAndSystemFeature
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(app.chalo.ble_communication.feature.BLEPermissionRequirement r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ble_communication.feature.bluetoothsystem.BluetoothPermissionAndSystemFeatureAndroid.c(app.chalo.ble_communication.feature.BLEPermissionRequirement, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.ble_communication.feature.bluetoothsystem.BluetoothPermissionAndSystemFeature
    public final boolean d() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // app.chalo.ble_communication.feature.bluetoothsystem.BluetoothPermissionAndSystemFeature
    public final List e(BLEPermissionRequirement blePermissionRequirement) {
        Intrinsics.i(blePermissionRequirement, "blePermissionRequirement");
        return b(blePermissionRequirement == BLEPermissionRequirement.SCANNING_PERMISSION_NECESSARY || blePermissionRequirement == BLEPermissionRequirement.SCANNING_PERMISSION_OPTIONAL);
    }

    @Override // app.chalo.ble_communication.feature.bluetoothsystem.BluetoothPermissionAndSystemFeature
    public final BLEPermissionRequirement f(Set requiredServices) {
        Intrinsics.i(requiredServices, "requiredServices");
        BLECommunicationServiceType.AdvertisementScanning advertisementScanning = BLECommunicationServiceType.b;
        boolean z = requiredServices.contains(advertisementScanning) || requiredServices.contains(BLECommunicationServiceType.f1094a);
        if (requiredServices.contains(advertisementScanning)) {
            return BLEPermissionRequirement.SCANNING_PERMISSION_NECESSARY;
        }
        requiredServices.contains(BLECommunicationServiceType.DuplexConnection.c);
        return z ? BLEPermissionRequirement.SCANNING_PERMISSION_OPTIONAL : BLEPermissionRequirement.SCANNING_PERMISSION_NOT_REQUIRED;
    }
}
