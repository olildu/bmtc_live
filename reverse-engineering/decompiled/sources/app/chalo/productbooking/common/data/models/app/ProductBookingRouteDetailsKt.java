package app.chalo.productbooking.common.data.models.app;

import app.chalo.instantticket.ui.routeselection.RouteSelectionStopType;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProductBookingRouteDetailsKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8196a;

        static {
            int[] iArr = new int[RouteSelectionStopType.values().length];
            try {
                iArr[RouteSelectionStopType.FROM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteSelectionStopType.TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8196a = iArr;
        }
    }

    public static final List a(ProductBookingRouteDetails productBookingRouteDetails, RouteSelectionStopType stopType, String str, String str2) {
        Intrinsics.i(productBookingRouteDetails, "<this>");
        List list = productBookingRouteDetails.e;
        Intrinsics.i(stopType, "stopType");
        int i = WhenMappings.f8196a[stopType.ordinal()];
        if (i == 1) {
            if (str2 == null || str2.length() == 0) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.d(((ProductBookingStopDetails) obj).f8199a, str2)) {
                    break;
                }
                arrayList.add(obj);
            }
            return arrayList;
        }
        if (i != 2) {
            return EmptyList.f17557a;
        }
        if (str == null || str.length() == 0) {
            return list;
        }
        if (list.isEmpty()) {
            return EmptyList.f17557a;
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.d(((ProductBookingStopDetails) listIterator.previous()).f8199a, str)) {
                listIterator.next();
                int size = list.size() - listIterator.nextIndex();
                if (size == 0) {
                    return EmptyList.f17557a;
                }
                ArrayList arrayList2 = new ArrayList(size);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
                return arrayList2;
            }
        }
        return CollectionsKt.D0(list);
    }
}
