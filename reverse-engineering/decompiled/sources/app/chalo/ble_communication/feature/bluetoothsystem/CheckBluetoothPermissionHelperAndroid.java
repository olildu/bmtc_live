package app.chalo.ble_communication.feature.bluetoothsystem;

import app.chalo.blevalidation.CheckBluetoothPermissionHelper;
import app.chalo.location.AppPermissionRequest;
import app.chalo.location.ChaloLocationManagerKt;
import app.chalo.usecase.ArePermissionsGrantedUseCase;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ble_communication/feature/bluetoothsystem/CheckBluetoothPermissionHelperAndroid;", "Lapp/chalo/blevalidation/CheckBluetoothPermissionHelper;", "ble-communication_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckBluetoothPermissionHelperAndroid implements CheckBluetoothPermissionHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArePermissionsGrantedUseCase f1122a;
    public final BluetoothPermissionAndSystemFeature b;

    public CheckBluetoothPermissionHelperAndroid(ArePermissionsGrantedUseCase arePermissionsGrantedUseCase, BluetoothPermissionAndSystemFeature bluetoothPermissionAndSystemFeature) {
        this.f1122a = arePermissionsGrantedUseCase;
        this.b = bluetoothPermissionAndSystemFeature;
    }

    @Override // app.chalo.blevalidation.CheckBluetoothPermissionHelper
    public final List a() {
        return this.b.b(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.blevalidation.CheckBluetoothPermissionHelper
    public final Object b(ContinuationImpl continuationImpl) {
        CheckBluetoothPermissionHelperAndroid$isGranted$1 checkBluetoothPermissionHelperAndroid$isGranted$1;
        if (continuationImpl instanceof CheckBluetoothPermissionHelperAndroid$isGranted$1) {
            checkBluetoothPermissionHelperAndroid$isGranted$1 = (CheckBluetoothPermissionHelperAndroid$isGranted$1) continuationImpl;
            int i = checkBluetoothPermissionHelperAndroid$isGranted$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkBluetoothPermissionHelperAndroid$isGranted$1.label = i - Integer.MIN_VALUE;
            } else {
                checkBluetoothPermissionHelperAndroid$isGranted$1 = new CheckBluetoothPermissionHelperAndroid$isGranted$1(this, continuationImpl);
            }
        } else {
            checkBluetoothPermissionHelperAndroid$isGranted$1 = new CheckBluetoothPermissionHelperAndroid$isGranted$1(this, continuationImpl);
        }
        Object objA = checkBluetoothPermissionHelperAndroid$isGranted$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkBluetoothPermissionHelperAndroid$isGranted$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            List listB = this.b.b(false);
            if (listB.isEmpty()) {
                return Boolean.TRUE;
            }
            checkBluetoothPermissionHelperAndroid$isGranted$1.label = 1;
            objA = this.f1122a.a(listB, checkBluetoothPermissionHelperAndroid$isGranted$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return Boolean.valueOf(ChaloLocationManagerKt.a((AppPermissionRequest) objA));
    }
}
