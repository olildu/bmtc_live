package app.chalo.domain;

import app.chalo.compose.components.chalomap.MapUtilsKt;
import app.chalo.compose.components.chalomap.PolylineUtils;
import app.chalo.location.LatLng;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/GetTrimmedPolylineUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetTrimmedPolylineUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PolylineUtils f2501a;

    public GetTrimmedPolylineUseCase(PolylineUtils polylineUtils) {
        this.f2501a = polylineUtils;
    }

    public final ChaloUseCaseResult a(String fullRoutePolylineString, List fallbackPolylineLatLngList, PolylineTrimRequest.FromPointToPoint fromPointToPoint) {
        Object next;
        LatLng latLng = fromPointToPoint.b;
        LatLng latLng2 = fromPointToPoint.f2514a;
        Intrinsics.i(fullRoutePolylineString, "fullRoutePolylineString");
        Intrinsics.i(fallbackPolylineLatLngList, "fallbackPolylineLatLngList");
        if (fullRoutePolylineString.length() == 0 && fallbackPolylineLatLngList.isEmpty()) {
            return new ChaloUseCaseResult.Failure(PolylineTrimFailure.EMPTY_POLYLINE);
        }
        try {
            List listA = MapUtilsKt.a(fullRoutePolylineString, this.f2501a, fallbackPolylineLatLngList);
            Object next2 = null;
            Iterator it = listA.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    double dA = latLng2.a((LatLng) next);
                    do {
                        Object next3 = it.next();
                        double dA2 = latLng2.a((LatLng) next3);
                        if (Double.compare(dA, dA2) > 0) {
                            next = next3;
                            dA = dA2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            LatLng latLng3 = (LatLng) next;
            if (latLng3 == null) {
                return new ChaloUseCaseResult.Failure(PolylineTrimFailure.INVALID_POLYLINE);
            }
            int iIndexOf = listA.indexOf(latLng3);
            Iterator it2 = listA.iterator();
            if (it2.hasNext()) {
                next2 = it2.next();
                if (it2.hasNext()) {
                    double dA3 = latLng.a((LatLng) next2);
                    do {
                        Object next4 = it2.next();
                        double dA4 = latLng.a((LatLng) next4);
                        if (Double.compare(dA3, dA4) > 0) {
                            next2 = next4;
                            dA3 = dA4;
                        }
                    } while (it2.hasNext());
                }
            }
            LatLng latLng4 = (LatLng) next2;
            if (latLng4 == null) {
                return new ChaloUseCaseResult.Failure(PolylineTrimFailure.INVALID_POLYLINE);
            }
            int iIndexOf2 = listA.indexOf(latLng4);
            if (iIndexOf2 != CollectionsKt.K(listA)) {
                iIndexOf2++;
            }
            return new ChaloUseCaseResult.Success(listA.subList(iIndexOf, iIndexOf2));
        } catch (Exception unused) {
            return new ChaloUseCaseResult.Failure(PolylineTrimFailure.INVALID_POLYLINE);
        }
    }
}
