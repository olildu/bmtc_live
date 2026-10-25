package app.chalo.livetracking.universalsearch.data.model.api;

import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchResultType;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AutoCompleteResultApiResponseModelKt {
    public static final boolean a(AutoCompleteResultApiResponseModel autoCompleteResultApiResponseModel) {
        ArrayList arrayList;
        String lowerCase;
        String str;
        Intrinsics.i(autoCompleteResultApiResponseModel, "<this>");
        SearchedResultItemsApiResponseModel searchedResultItemsApiResponseModel = autoCompleteResultApiResponseModel.f4969a;
        if (searchedResultItemsApiResponseModel == null) {
            return false;
        }
        Intrinsics.i(searchedResultItemsApiResponseModel, "<this>");
        List list = searchedResultItemsApiResponseModel.f4987a;
        ArrayList arrayList2 = null;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                RoutesDetailApiModel routesDetailApiModel = (RoutesDetailApiModel) obj;
                Intrinsics.i(routesDetailApiModel, "<this>");
                if (routesDetailApiModel.f4985a != null) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        List list2 = searchedResultItemsApiResponseModel.b;
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list2) {
                PlacesAndStopsInfoApiModel placesAndStopsInfoApiModel = (PlacesAndStopsInfoApiModel) obj2;
                Intrinsics.i(placesAndStopsInfoApiModel, "<this>");
                String str2 = placesAndStopsInfoApiModel.f4983a;
                if (str2 != null) {
                    lowerCase = str2.toLowerCase(Locale.ROOT);
                    Intrinsics.h(lowerCase, "toLowerCase(...)");
                } else {
                    lowerCase = null;
                }
                String lowerCase2 = UniversalSearchResultType.PLACE.getResultType().toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase2, "toLowerCase(...)");
                if (Intrinsics.d(lowerCase, lowerCase2)) {
                    if (placesAndStopsInfoApiModel.c != null && placesAndStopsInfoApiModel.b != null && (str = placesAndStopsInfoApiModel.j) != null && str.length() != 0) {
                        arrayList3.add(obj2);
                    }
                } else if (placesAndStopsInfoApiModel.d != null && placesAndStopsInfoApiModel.e != null && placesAndStopsInfoApiModel.h != null) {
                    arrayList3.add(obj2);
                }
            }
            arrayList2 = arrayList3;
        }
        return (arrayList2 == null && arrayList == null) ? false : true;
    }
}
