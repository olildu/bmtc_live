package app.chalo.geoquery.domain;

import app.chalo.location.LatLng;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GeoSpatialLiveBusesDataPollingManagerKt {
    public static final FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 a(Flow flow, LatLng latLng) {
        Intrinsics.i(flow, "<this>");
        Intrinsics.i(latLng, "latLng");
        return new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(flow, EmptyList.f17557a, new GeoSpatialLiveBusesDataPollingManagerKt$processAndCovertToLegacyGeoFireEvent$1(latLng, null));
    }
}
