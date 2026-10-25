package app.chalo.livetracking.routedetails;

import app.chalo.location.LatLng;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/RouteDetailsUtils;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteDetailsUtils {
    public static LatLng a(LatLng srcLocation, List polylinePoint) {
        Object obj;
        int iIndexOf;
        Intrinsics.i(srcLocation, "srcLocation");
        Intrinsics.i(polylinePoint, "polylinePoint");
        Iterator it = polylinePoint.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                double dA = srcLocation.a((LatLng) next);
                do {
                    Object next2 = it.next();
                    double dA2 = srcLocation.a((LatLng) next2);
                    if (Double.compare(dA, dA2) > 0) {
                        next = next2;
                        dA = dA2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        LatLng latLng = (LatLng) obj;
        return (latLng == null || (iIndexOf = polylinePoint.indexOf(latLng)) >= CollectionsKt.K(polylinePoint)) ? latLng : (LatLng) polylinePoint.get(iIndexOf + 1);
    }
}
