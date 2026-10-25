package defpackage;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.maps.android.compose.CameraMoveStartedReason;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.MapPropertiesNode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ih0 implements GoogleMap.OnCameraIdleListener, GoogleMap.OnCameraMoveCanceledListener, GoogleMap.OnCameraMoveStartedListener, GoogleMap.OnCameraMoveListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapPropertiesNode f15913a;

    public /* synthetic */ ih0(MapPropertiesNode mapPropertiesNode) {
        this.f15913a = mapPropertiesNode;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
    public void onCameraIdle() {
        MapPropertiesNode mapPropertiesNode = this.f15913a;
        mapPropertiesNode.d.f14589a.setValue(Boolean.FALSE);
        CameraPositionState cameraPositionState = mapPropertiesNode.d;
        CameraPosition cameraPosition = mapPropertiesNode.f14619a.getCameraPosition();
        Intrinsics.h(cameraPosition, "getCameraPosition(...)");
        cameraPositionState.c.setValue(cameraPosition);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveListener
    public void onCameraMove() {
        MapPropertiesNode mapPropertiesNode = this.f15913a;
        CameraPositionState cameraPositionState = mapPropertiesNode.d;
        CameraPosition cameraPosition = mapPropertiesNode.f14619a.getCameraPosition();
        Intrinsics.h(cameraPosition, "getCameraPosition(...)");
        cameraPositionState.c.setValue(cameraPosition);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener
    public void onCameraMoveCanceled() {
        this.f15913a.d.f14589a.setValue(Boolean.FALSE);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener
    public void onCameraMoveStarted(int i) {
        CameraMoveStartedReason cameraMoveStartedReason;
        MapPropertiesNode mapPropertiesNode = this.f15913a;
        CameraPositionState cameraPositionState = mapPropertiesNode.d;
        CameraMoveStartedReason.INSTANCE.getClass();
        CameraMoveStartedReason[] cameraMoveStartedReasonArrValues = CameraMoveStartedReason.values();
        int length = cameraMoveStartedReasonArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                cameraMoveStartedReason = null;
                break;
            }
            cameraMoveStartedReason = cameraMoveStartedReasonArrValues[i2];
            if (cameraMoveStartedReason.getValue() == i) {
                break;
            } else {
                i2++;
            }
        }
        if (cameraMoveStartedReason == null) {
            cameraMoveStartedReason = CameraMoveStartedReason.UNKNOWN;
        }
        cameraPositionState.getClass();
        Intrinsics.i(cameraMoveStartedReason, "<set-?>");
        cameraPositionState.b.setValue(cameraMoveStartedReason);
        mapPropertiesNode.d.f14589a.setValue(Boolean.TRUE);
    }
}
