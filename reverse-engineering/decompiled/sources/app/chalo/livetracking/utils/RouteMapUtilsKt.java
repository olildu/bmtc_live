package app.chalo.livetracking.utils;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.compose.components.chalomap.ChaloMapPolylinePointDetails;
import app.chalo.compose.components.chalomap.MapPolylinePointStateType;
import app.chalo.compose.components.chalomap.MapUtilsKt;
import app.chalo.compose.components.chalomap.PolylineUtils;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel;
import app.chalo.location.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RouteMapUtilsKt {
    public static final Integer a(LatLng latLng, List list) {
        Integer next = null;
        if (list.isEmpty()) {
            return null;
        }
        Iterator<Integer> it = CollectionsKt.J(list).iterator();
        IntProgressionIterator intProgressionIterator = (IntProgressionIterator) it;
        if (intProgressionIterator.c) {
            next = it.next();
            if (intProgressionIterator.c) {
                LatLng latLng2 = (LatLng) list.get(next.intValue());
                double d = latLng2.f5134a;
                double d2 = latLng.f5134a;
                double d3 = latLng.b;
                double d4 = d - d2;
                double d5 = latLng2.b - d3;
                double d6 = (d5 * d5) + (d4 * d4);
                do {
                    Integer next2 = it.next();
                    LatLng latLng3 = (LatLng) list.get(next2.intValue());
                    double d7 = latLng3.f5134a - latLng.f5134a;
                    double d8 = latLng3.b - d3;
                    double d9 = (d8 * d8) + (d7 * d7);
                    if (Double.compare(d6, d9) > 0) {
                        next = next2;
                        d6 = d9;
                    }
                } while (intProgressionIterator.c);
            }
        }
        return next;
    }

    public static final ListBuilder b(RouteAppModel routeAppModel, RouteDetailsIntentModel routeDetailsIntentModel, PolylineUtils polylineUtils) {
        Object next;
        Object next2;
        Intrinsics.i(routeAppModel, "routeAppModel");
        Intrinsics.i(routeDetailsIntentModel, "routeDetailsIntentModel");
        Intrinsics.i(polylineUtils, "polylineUtils");
        List list = routeAppModel.e;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((StopAppModel) next).f1727a, routeDetailsIntentModel.b));
        StopAppModel stopAppModel = (StopAppModel) next;
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!Intrinsics.d(((StopAppModel) next2).f1727a, routeDetailsIntentModel.c));
        StopAppModel stopAppModel2 = (StopAppModel) next2;
        if (stopAppModel != null) {
            LatLng latLng = stopAppModel.c;
            if (stopAppModel2 != null) {
                LatLng latLng2 = stopAppModel2.c;
                String str = routeAppModel.m;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((StopAppModel) it3.next()).c);
                }
                List listA = MapUtilsKt.a(str, polylineUtils, arrayList);
                Integer numA = a(latLng, listA);
                Integer numA2 = a(latLng2, listA);
                if (numA != null && numA2 != null) {
                    List listSubList = listA.subList(Math.min(numA.intValue(), numA2.intValue()), Math.max(numA.intValue(), numA2.intValue()) + 1);
                    ListBuilder listBuilderY = CollectionsKt.y();
                    listBuilderY.add(latLng);
                    listBuilderY.addAll(listSubList);
                    listBuilderY.add(latLng2);
                    return listBuilderY.g();
                }
            }
        }
        return null;
    }

    public static final List c(List polyLine, LatLng from, LatLng to) {
        Object next;
        Intrinsics.i(polyLine, "polyLine");
        Intrinsics.i(from, "from");
        Intrinsics.i(to, "to");
        if (polyLine.isEmpty()) {
            return EmptyList.f17557a;
        }
        List list = polyLine;
        Iterator it = list.iterator();
        Object next2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                double dA = from.a((LatLng) next);
                do {
                    Object next3 = it.next();
                    double dA2 = from.a((LatLng) next3);
                    if (Double.compare(dA, dA2) > 0) {
                        next = next3;
                        dA = dA2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        int iIndexOf = polyLine.indexOf((LatLng) next);
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                double dA3 = to.a((LatLng) next2);
                do {
                    Object next4 = it2.next();
                    double dA4 = to.a((LatLng) next4);
                    if (Double.compare(dA3, dA4) > 0) {
                        next2 = next4;
                        dA3 = dA4;
                    }
                } while (it2.hasNext());
            }
        }
        int iIndexOf2 = polyLine.indexOf((LatLng) next2);
        List listSubList = polyLine.subList(0, iIndexOf + 1);
        MapPolylinePointStateType mapPolylinePointStateType = MapPolylinePointStateType.DISABLED;
        return CollectionsKt.S(new ChaloMapPolylinePointDetails(listSubList, mapPolylinePointStateType), new ChaloMapPolylinePointDetails(polyLine.subList(iIndexOf, iIndexOf2 + 1), MapPolylinePointStateType.ENABLED), new ChaloMapPolylinePointDetails(polyLine.subList(iIndexOf2, polyLine.size()), mapPolylinePointStateType));
    }
}
