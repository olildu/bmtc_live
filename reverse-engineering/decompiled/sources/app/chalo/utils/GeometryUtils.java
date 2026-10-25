package app.chalo.utils;

import app.chalo.location.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/GeometryUtils;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeometryUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GeometryUtils f10425a = new GeometryUtils();

    public static double a(LatLng latLng, LatLng latLng2) {
        double d = latLng.f5134a * 0.017453292519943295d;
        double d2 = latLng.b * 0.017453292519943295d;
        double d3 = latLng2.f5134a * 0.017453292519943295d;
        double d4 = (latLng2.b * 0.017453292519943295d) - d2;
        double dCos = Math.cos(d3) * Math.sin(d4);
        double dSin = Math.sin(d3) * Math.cos(d);
        double dCos2 = Math.cos(d3) * Math.sin(d);
        double d5 = 360;
        return ((Math.atan2(dCos, dSin - (Math.cos(d4) * dCos2)) * 57.29577951308232d) + d5) % d5;
    }

    public static double b(LatLng origin, LatLng dest) {
        Intrinsics.i(origin, "origin");
        Intrinsics.i(dest, "dest");
        return c(origin, dest) * ((double) 1000);
    }

    public static double c(LatLng start, LatLng end) {
        Intrinsics.i(start, "start");
        Intrinsics.i(end, "end");
        double d = start.f5134a;
        double d2 = start.b;
        double d3 = end.f5134a;
        double d4 = (end.b - d2) * 0.017453292519943295d;
        double dPow = (Math.pow(Math.sin(d4 / 2.0d), 2.0d) * Math.cos(d3 * 0.017453292519943295d) * Math.cos(d * 0.017453292519943295d)) + Math.pow(Math.sin(((d3 - d) * 0.017453292519943295d) / 2.0d), 2.0d);
        return Math.atan2(Math.sqrt(dPow), Math.sqrt(1.0d - dPow)) * 2.0d * 6378.137d;
    }
}
