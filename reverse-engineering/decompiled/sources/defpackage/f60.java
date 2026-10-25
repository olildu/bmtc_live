package defpackage;

import com.google.android.gms.maps.GoogleMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15613a;
    public final /* synthetic */ GoogleMap b;

    public /* synthetic */ f60(GoogleMap googleMap, int i) {
        this.f15613a = i;
        this.b = googleMap;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15613a) {
            case 0:
                GoogleMap googleMap = this.b;
                googleMap.setOnCameraIdleListener(null);
                googleMap.setOnCameraMoveCanceledListener(null);
                googleMap.setOnCameraMoveListener(null);
                googleMap.setOnCameraMoveStartedListener(null);
                break;
            case 1:
                this.b.setOnCameraIdleListener(null);
                break;
            case 2:
                this.b.setOnCameraMoveCanceledListener(null);
                break;
            case 3:
                this.b.setOnCameraMoveListener(null);
                break;
            case 4:
                this.b.setOnCameraMoveStartedListener(null);
                break;
            case 5:
                this.b.setOnCircleClickListener(null);
                break;
            case 6:
                this.b.setOnGroundOverlayClickListener(null);
                break;
            case 7:
                this.b.setOnIndoorStateChangeListener(null);
                break;
            case 8:
                this.b.setOnInfoWindowClickListener(null);
                break;
            case 9:
                this.b.setOnInfoWindowCloseListener(null);
                break;
            case 10:
                this.b.setOnInfoWindowLongClickListener(null);
                break;
            case 11:
                this.b.setOnMapClickListener(null);
                break;
            case 12:
                this.b.setOnMapLongClickListener(null);
                break;
            case 13:
                this.b.setOnMarkerClickListener(null);
                break;
            case 14:
                this.b.setOnMarkerDragListener(null);
                break;
            case 15:
                this.b.setOnMyLocationButtonClickListener(null);
                break;
            case 16:
                this.b.setOnMyLocationClickListener(null);
                break;
            case 17:
                this.b.setOnPoiClickListener(null);
                break;
            case 18:
                this.b.setOnPolygonClickListener(null);
                break;
            default:
                this.b.setOnPolylineClickListener(null);
                break;
        }
        return Unit.f17538a;
    }
}
