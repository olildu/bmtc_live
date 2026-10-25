package defpackage;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.maps.android.ktx.CameraIdleEvent;
import com.google.maps.android.ktx.CameraMoveCanceledEvent;
import com.google.maps.android.ktx.CameraMoveEvent;
import com.google.maps.android.ktx.CameraMoveStartedEvent;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e60 implements GoogleMap.OnCameraIdleListener, GoogleMap.OnCameraMoveCanceledListener, GoogleMap.OnCameraMoveListener, GoogleMap.OnCameraMoveStartedListener, GoogleMap.OnCircleClickListener, GoogleMap.OnGroundOverlayClickListener, GoogleMap.OnInfoWindowClickListener, GoogleMap.OnInfoWindowCloseListener, GoogleMap.OnInfoWindowLongClickListener, GoogleMap.OnMarkerClickListener, GoogleMap.OnPolygonClickListener, GoogleMap.OnPolylineClickListener, StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener, StreetViewPanorama.OnStreetViewPanoramaChangeListener, StreetViewPanorama.OnStreetViewPanoramaClickListener, StreetViewPanorama.OnStreetViewPanoramaLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15522a;
    public final /* synthetic */ ProducerScope b;

    public /* synthetic */ e60(ProducerScope producerScope, int i) {
        this.f15522a = i;
        this.b = producerScope;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
    public void onCameraIdle() {
        switch (this.f15522a) {
            case 0:
                this.b.mo7576trySendJP2dKIU(CameraIdleEvent.f14677a);
                break;
            default:
                this.b.mo7576trySendJP2dKIU(Unit.f17538a);
                break;
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveListener
    public void onCameraMove() {
        switch (this.f15522a) {
            case 2:
                this.b.mo7576trySendJP2dKIU(CameraMoveEvent.f14679a);
                break;
            default:
                this.b.mo7576trySendJP2dKIU(Unit.f17538a);
                break;
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener
    public void onCameraMoveCanceled() {
        switch (this.f15522a) {
            case 1:
                this.b.mo7576trySendJP2dKIU(CameraMoveCanceledEvent.f14678a);
                break;
            default:
                this.b.mo7576trySendJP2dKIU(Unit.f17538a);
                break;
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener
    public void onCameraMoveStarted(int i) {
        switch (this.f15522a) {
            case 3:
                this.b.mo7576trySendJP2dKIU(new CameraMoveStartedEvent(i));
                break;
            default:
                this.b.mo7576trySendJP2dKIU(Integer.valueOf(i));
                break;
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCircleClickListener
    public void onCircleClick(Circle circle) {
        Intrinsics.f(circle);
        this.b.mo7576trySendJP2dKIU(circle);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener
    public void onGroundOverlayClick(GroundOverlay groundOverlay) {
        Intrinsics.f(groundOverlay);
        this.b.mo7576trySendJP2dKIU(groundOverlay);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public void onInfoWindowClick(Marker marker) {
        Intrinsics.f(marker);
        this.b.mo7576trySendJP2dKIU(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener
    public void onInfoWindowClose(Marker marker) {
        Intrinsics.f(marker);
        this.b.mo7576trySendJP2dKIU(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
    public void onInfoWindowLongClick(Marker marker) {
        Intrinsics.f(marker);
        this.b.mo7576trySendJP2dKIU(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public boolean onMarkerClick(Marker marker) {
        Intrinsics.f(marker);
        return !(this.b.mo7576trySendJP2dKIU(marker) instanceof ChannelResult.Failed);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPolygonClickListener
    public void onPolygonClick(Polygon polygon) {
        Intrinsics.f(polygon);
        this.b.mo7576trySendJP2dKIU(polygon);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPolylineClickListener
    public void onPolylineClick(Polyline polyline) {
        Intrinsics.f(polyline);
        this.b.mo7576trySendJP2dKIU(polyline);
    }

    @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener
    public void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        Intrinsics.f(streetViewPanoramaCamera);
        this.b.mo7576trySendJP2dKIU(streetViewPanoramaCamera);
    }

    @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener
    public void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetViewPanoramaLocation) {
        Intrinsics.f(streetViewPanoramaLocation);
        this.b.mo7576trySendJP2dKIU(streetViewPanoramaLocation);
    }

    @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener
    public void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        Intrinsics.f(streetViewPanoramaOrientation);
        this.b.mo7576trySendJP2dKIU(streetViewPanoramaOrientation);
    }

    @Override // com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener
    public void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        Intrinsics.f(streetViewPanoramaOrientation);
        this.b.mo7576trySendJP2dKIU(streetViewPanoramaOrientation);
    }
}
