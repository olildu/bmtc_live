package app.chalo.compose.components.chalomap;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MapUtilsKt {
    public static final List a(String polyLineString, PolylineUtils polylineUtils, List fallbackLatLngList) {
        Intrinsics.i(polyLineString, "polyLineString");
        Intrinsics.i(polylineUtils, "polylineUtils");
        Intrinsics.i(fallbackLatLngList, "fallbackLatLngList");
        try {
            if (polyLineString.length() > 0) {
                return polylineUtils.a(polyLineString);
            }
        } catch (Exception unused) {
        }
        return fallbackLatLngList;
    }
}
