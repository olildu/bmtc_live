package app.chalo.compose.components.chalomap;

import app.chalo.location.LatLng;
import app.chalo.location.LatLngBounds;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/LatLngBoundsUtilsAndroid;", "Lapp/chalo/compose/components/chalomap/LatLngBoundsUtils;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LatLngBoundsUtilsAndroid implements LatLngBoundsUtils {
    @Override // app.chalo.compose.components.chalomap.LatLngBoundsUtils
    public final LatLngBounds a(List latLngs) {
        Intrinsics.i(latLngs, "latLngs");
        com.google.android.gms.maps.model.LatLngBounds.Builder builder = com.google.android.gms.maps.model.LatLngBounds.builder();
        Intrinsics.h(builder, "builder(...)");
        Iterator it = latLngs.iterator();
        while (it.hasNext()) {
            LatLng latLng = (LatLng) it.next();
            builder.include(new com.google.android.gms.maps.model.LatLng(latLng.f5134a, latLng.b));
        }
        com.google.android.gms.maps.model.LatLngBounds latLngBoundsBuild = builder.build();
        com.google.android.gms.maps.model.LatLng southwest = latLngBoundsBuild.southwest;
        Intrinsics.h(southwest, "southwest");
        LatLng latLng2 = new LatLng(southwest);
        com.google.android.gms.maps.model.LatLng northeast = latLngBoundsBuild.northeast;
        Intrinsics.h(northeast, "northeast");
        return new LatLngBounds(latLng2, new LatLng(northeast));
    }
}
