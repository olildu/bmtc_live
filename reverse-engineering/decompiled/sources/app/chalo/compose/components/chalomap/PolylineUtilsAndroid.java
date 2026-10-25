package app.chalo.compose.components.chalomap;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.MathUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/PolylineUtilsAndroid;", "Lapp/chalo/compose/components/chalomap/PolylineUtils;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PolylineUtilsAndroid implements PolylineUtils {
    @Override // app.chalo.compose.components.chalomap.PolylineUtils
    public final ArrayList a(String polylineString) {
        int i;
        int i2;
        Intrinsics.i(polylineString, "polylineString");
        int length = polylineString.length();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            int i7 = 1;
            int i8 = 0;
            int i9 = 1;
            while (true) {
                i = i4 + 1;
                int iCharAt = polylineString.charAt(i4) - '@';
                i9 += iCharAt << i8;
                i8 += 5;
                if (iCharAt < 31) {
                    break;
                }
                i4 = i;
            }
            int i10 = ((i9 & 1) != 0 ? ~(i9 >> 1) : i9 >> 1) + i5;
            int i11 = 0;
            while (true) {
                i2 = i + 1;
                int iCharAt2 = polylineString.charAt(i) - '@';
                i7 += iCharAt2 << i11;
                i11 += 5;
                if (iCharAt2 < 31) {
                    break;
                }
                i = i2;
            }
            i6 += (i7 & 1) != 0 ? ~(i7 >> 1) : i7 >> 1;
            arrayList.add(new LatLng(((double) i10) * 1.0E-5d, ((double) i6) * 1.0E-5d));
            i5 = i10;
            i4 = i2;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            LatLng latLng = (LatLng) obj;
            app.chalo.location.LatLng latLng2 = latLng != null ? new app.chalo.location.LatLng(latLng.latitude, latLng.longitude) : null;
            if (latLng2 != null) {
                arrayList2.add(latLng2);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0149  */
    @Override // app.chalo.compose.components.chalomap.PolylineUtils
    public final boolean b(app.chalo.location.LatLng location, List polygon) {
        Intrinsics.i(location, "location");
        Intrinsics.i(polygon, "polygon");
        LatLng latLng = new LatLng(location.f5134a, location.b);
        List<app.chalo.location.LatLng> list = polygon;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
        for (app.chalo.location.LatLng latLng2 : list) {
            arrayList.add(new LatLng(latLng2.f5134a, latLng2.b));
        }
        double d = latLng.latitude;
        double d2 = latLng.longitude;
        if (arrayList.isEmpty()) {
            return false;
        }
        double radians = Math.toRadians(d);
        double radians2 = Math.toRadians(d2);
        LatLng latLng3 = (LatLng) CollectionsKt.P(arrayList);
        double radians3 = Math.toRadians(latLng3.latitude);
        double radians4 = Math.toRadians(latLng3.longitude);
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            LatLng latLng4 = (LatLng) obj;
            double d3 = radians2 - radians4;
            if (d3 < -3.141592653589793d || d3 >= 3.141592653589793d) {
                d3 = ((((d3 - (-3.141592653589793d)) % 6.283185307179586d) + 6.283185307179586d) % 6.283185307179586d) - 3.141592653589793d;
            }
            if (radians != radians3 || d3 != 0.0d) {
                double d4 = radians;
                double radians5 = Math.toRadians(latLng4.latitude);
                double radians6 = Math.toRadians(latLng4.longitude);
                double d5 = radians6 - radians4;
                if (d5 < -3.141592653589793d || d5 >= 3.141592653589793d) {
                    d5 = ((((d5 - (-3.141592653589793d)) % 6.283185307179586d) + 6.283185307179586d) % 6.283185307179586d) - 3.141592653589793d;
                }
                if ((d3 < 0.0d || d3 < d5) && ((d3 >= 0.0d || d3 >= d5) && d4 > -1.5707963267948966d && radians3 > -1.5707963267948966d && radians5 > -1.5707963267948966d && radians3 < 1.5707963267948966d && radians5 < 1.5707963267948966d && d5 > -3.141592653589793d)) {
                    double d6 = d5 - d3;
                    double d7 = ((radians5 * d3) + (radians3 * d6)) / d5;
                    if (radians3 < 0.0d || radians5 < 0.0d || d4 >= d7) {
                        if ((radians3 <= 0.0d && radians5 <= 0.0d && d4 >= d7) || d4 >= 1.5707963267948966d) {
                            i++;
                        } else if (MathUtil.a(d4) >= ((MathUtil.a(radians5) * d3) + (MathUtil.a(radians3) * d6)) / d5) {
                            i++;
                        }
                    }
                }
                radians3 = radians5;
                radians4 = radians6;
                radians = d4;
            }
        }
        return (i & 1) != 0;
    }
}
