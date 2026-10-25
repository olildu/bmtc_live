package defpackage;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import com.google.maps.android.compose.InputHandlerNode;
import com.google.maps.android.compose.MapApplier;
import com.google.maps.android.compose.MapNode;
import com.google.maps.android.compose.MarkerNode;
import com.google.maps.android.compose.PolylineNode;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fh0 implements GoogleMap.OnCircleClickListener, GoogleMap.OnGroundOverlayClickListener, GoogleMap.OnPolygonClickListener, GoogleMap.OnPolylineClickListener, GoogleMap.OnMarkerClickListener, GoogleMap.OnInfoWindowClickListener, GoogleMap.OnInfoWindowCloseListener, GoogleMap.OnInfoWindowLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapApplier f15641a;

    @Override // com.google.android.gms.maps.GoogleMap.OnCircleClickListener
    public void onCircleClick(Circle circle) {
        Intrinsics.i(circle, "circle");
        ArrayList arrayList = this.f15641a.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((MapNode) obj) instanceof InputHandlerNode) {
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener
    public void onGroundOverlayClick(GroundOverlay groundOverlay) {
        Intrinsics.i(groundOverlay, "groundOverlay");
        ArrayList arrayList = this.f15641a.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((MapNode) obj) instanceof InputHandlerNode) {
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public void onInfoWindowClick(Marker marker) {
        Intrinsics.i(marker, "marker");
        ArrayList arrayList = this.f15641a.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            MapNode mapNode = (MapNode) obj;
            if (mapNode instanceof MarkerNode) {
                MarkerNode markerNode = (MarkerNode) mapNode;
                if (markerNode.b.equals(marker)) {
                    Function1 function1 = markerNode.e;
                    if (function1 != null ? Intrinsics.d(function1.invoke(marker), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener
    public void onInfoWindowClose(Marker marker) {
        Intrinsics.i(marker, "marker");
        ArrayList arrayList = this.f15641a.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            MapNode mapNode = (MapNode) obj;
            if (mapNode instanceof MarkerNode) {
                MarkerNode markerNode = (MarkerNode) mapNode;
                if (markerNode.b.equals(marker)) {
                    Function1 function1 = markerNode.f;
                    if (function1 != null ? Intrinsics.d(function1.invoke(marker), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
    public void onInfoWindowLongClick(Marker marker) {
        Intrinsics.i(marker, "marker");
        ArrayList arrayList = this.f15641a.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            MapNode mapNode = (MapNode) obj;
            if (mapNode instanceof MarkerNode) {
                MarkerNode markerNode = (MarkerNode) mapNode;
                if (markerNode.b.equals(marker)) {
                    Function1 function1 = markerNode.g;
                    if (function1 != null ? Intrinsics.d(function1.invoke(marker), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public boolean onMarkerClick(Marker marker) {
        Intrinsics.i(marker, "marker");
        ArrayList arrayList = this.f15641a.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            MapNode mapNode = (MapNode) obj;
            if (mapNode instanceof MarkerNode) {
                MarkerNode markerNode = (MarkerNode) mapNode;
                if (markerNode.b.equals(marker)) {
                    Function1 function1 = markerNode.d;
                    if (function1 != null ? Intrinsics.d(function1.invoke(marker), Boolean.TRUE) : false) {
                        return true;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                throw null;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPolygonClickListener
    public void onPolygonClick(Polygon polygon) {
        Intrinsics.i(polygon, "polygon");
        ArrayList arrayList = this.f15641a.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((MapNode) obj) instanceof InputHandlerNode) {
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPolylineClickListener
    public void onPolylineClick(Polyline polyline) {
        Intrinsics.i(polyline, "polyline");
        ArrayList arrayList = this.f15641a.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            MapNode mapNode = (MapNode) obj;
            if (mapNode instanceof PolylineNode) {
                PolylineNode polylineNode = (PolylineNode) mapNode;
                if (polylineNode.f14654a.equals(polyline)) {
                    Function1 function1 = polylineNode.b;
                    if (function1 != null ? Intrinsics.d(function1.invoke(polyline), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
            if (mapNode instanceof InputHandlerNode) {
                throw null;
            }
        }
    }
}
