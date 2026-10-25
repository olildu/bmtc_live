package app.chalo.instantticket.data.model;

import app.chalo.citydata.data.model.app.RouteSpecialFeatureAppModel;
import app.chalo.citydata.data.model.app.RouteSpecialFeatureType;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.productbooking.common.data.models.app.ProductBookingRouteSpecialFeatureTagType;
import app.chalo.productbooking.common.data.models.app.ProductBookingSpecialFeature;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RouteInfoToProductBookingDetailsHelperKt {
    public static final List a(List list) {
        if (list == null) {
            return EmptyList.f17557a;
        }
        List<StopAppModel> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        for (StopAppModel stopAppModel : list2) {
            arrayList.add(new ProductBookingStopDetails(stopAppModel.f1727a, stopAppModel.b, stopAppModel.e));
        }
        return arrayList;
    }

    public static final ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RouteSpecialFeatureAppModel routeSpecialFeatureAppModel = (RouteSpecialFeatureAppModel) it.next();
                arrayList.add(new ProductBookingSpecialFeature(routeSpecialFeatureAppModel.f1715a, routeSpecialFeatureAppModel.b == RouteSpecialFeatureType.NEW ? ProductBookingRouteSpecialFeatureTagType.NEW : ProductBookingRouteSpecialFeatureTagType.OLD));
            }
        }
        return arrayList;
    }
}
