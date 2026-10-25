package app.chalo.livetracking.universalsearch.data.model.app;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.livetracking.universalsearch.data.model.api.AutoCompleteResultApiResponseModel;
import app.chalo.livetracking.universalsearch.data.model.api.PlacesAndStopsInfoApiModel;
import app.chalo.livetracking.universalsearch.data.model.api.RoutesDetailApiModel;
import app.chalo.livetracking.universalsearch.data.model.api.SearchedResultItemsApiResponseModel;
import app.chalo.livetracking.universalsearch.data.model.api.StopsInfoApiModel;
import app.chalo.location.LatLng;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AutoCompleteResultAppModelKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4991a;

        static {
            int[] iArr = new int[UniversalSearchResultType.values().length];
            try {
                iArr[UniversalSearchResultType.STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UniversalSearchResultType.PLACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UniversalSearchResultType.ROUTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UniversalSearchResultType.TRIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f4991a = iArr;
        }
    }

    public static final StopAppModel a(StopsInfoApiModel stopsInfoApiModel) {
        Intrinsics.i(stopsInfoApiModel, "<this>");
        String str = stopsInfoApiModel.f4989a;
        if (str == null) {
            str = "";
        }
        String str2 = stopsInfoApiModel.b;
        if (str2 == null) {
            str2 = "";
        }
        LatLng latLng = new LatLng(stopsInfoApiModel.c, stopsInfoApiModel.d);
        ChaloTransitMode chaloTransitModeB = ChaloTransitMode.Companion.b(ChaloTransitMode.INSTANCE, stopsInfoApiModel.e);
        String str3 = stopsInfoApiModel.f;
        if (str3 == null) {
            str3 = "";
        }
        return new StopAppModel(str, str2, latLng, chaloTransitModeB, str3, stopsInfoApiModel.g);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    public static final SearchedResultItemsAppModel b(AutoCompleteResultApiResponseModel autoCompleteResultApiResponseModel) {
        ArrayList arrayList;
        List list;
        EmptyList emptyList;
        Iterator it;
        PlaceAndStopInfoAppModel placeAndStopInfoAppModel;
        PlaceAndStopInfoAppModel placeAndStopInfoAppModel2;
        UniversalSearchRouteAppModel universalSearchRouteAppModel;
        String str;
        String str2;
        String str3;
        Intrinsics.i(autoCompleteResultApiResponseModel, "<this>");
        SearchedResultItemsApiResponseModel searchedResultItemsApiResponseModel = autoCompleteResultApiResponseModel.f4969a;
        if (searchedResultItemsApiResponseModel == null) {
            return new SearchedResultItemsAppModel();
        }
        List<RoutesDetailApiModel> list2 = searchedResultItemsApiResponseModel.f4987a;
        if (list2 != null) {
            arrayList = new ArrayList();
            for (RoutesDetailApiModel routesDetailApiModel : list2) {
                Intrinsics.i(routesDetailApiModel, "<this>");
                String str4 = routesDetailApiModel.f4985a;
                if (str4 == null || (str = routesDetailApiModel.b) == null) {
                    universalSearchRouteAppModel = null;
                } else {
                    String str5 = routesDetailApiModel.c;
                    String str6 = routesDetailApiModel.d;
                    if (str6 == null || (str2 = routesDetailApiModel.e) == null || (str3 = routesDetailApiModel.g) == null) {
                        universalSearchRouteAppModel = null;
                    } else {
                        List list3 = routesDetailApiModel.h;
                        if (list3 == null) {
                            list3 = EmptyList.f17557a;
                        }
                        List list4 = routesDetailApiModel.i;
                        if (list4 == null) {
                            list4 = EmptyList.f17557a;
                        }
                        boolean z = routesDetailApiModel.n;
                        UniversalSearchResultType.Companion companion = UniversalSearchResultType.INSTANCE;
                        String str7 = routesDetailApiModel.C;
                        companion.getClass();
                        UniversalSearchResultType universalSearchResultTypeA = UniversalSearchResultType.Companion.a(str7);
                        String str8 = routesDetailApiModel.D;
                        RouteNamingSchemeType.Companion companion2 = RouteNamingSchemeType.INSTANCE;
                        String str9 = routesDetailApiModel.E;
                        companion2.getClass();
                        universalSearchRouteAppModel = new UniversalSearchRouteAppModel(str4, str, str5, str6, str2, str3, list3, list4, z, universalSearchResultTypeA, str8, RouteNamingSchemeType.Companion.a(str9));
                    }
                }
                if (universalSearchRouteAppModel != null) {
                    arrayList.add(universalSearchRouteAppModel);
                }
            }
        } else {
            arrayList = null;
        }
        List list5 = searchedResultItemsApiResponseModel.b;
        if (list5 != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                PlacesAndStopsInfoApiModel placesAndStopsInfoApiModel = (PlacesAndStopsInfoApiModel) it2.next();
                Intrinsics.i(placesAndStopsInfoApiModel, "<this>");
                String str10 = placesAndStopsInfoApiModel.j;
                String str11 = placesAndStopsInfoApiModel.h;
                double d = placesAndStopsInfoApiModel.g;
                double d2 = placesAndStopsInfoApiModel.f;
                String str12 = placesAndStopsInfoApiModel.e;
                String str13 = placesAndStopsInfoApiModel.d;
                String str14 = placesAndStopsInfoApiModel.c;
                String str15 = placesAndStopsInfoApiModel.b;
                UniversalSearchResultType.Companion companion3 = UniversalSearchResultType.INSTANCE;
                String str16 = placesAndStopsInfoApiModel.f4983a;
                companion3.getClass();
                UniversalSearchResultType universalSearchResultTypeA2 = UniversalSearchResultType.Companion.a(str16);
                int i = WhenMappings.f4991a[universalSearchResultTypeA2.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        if (str15 != null && str14 != null) {
                            if (str13 == null) {
                                str13 = "";
                            }
                            String str17 = str12 == null ? "" : str12;
                            it = it2;
                            LatLng latLng = new LatLng(d2, d);
                            ChaloTransitMode chaloTransitModeB = ChaloTransitMode.Companion.b(ChaloTransitMode.INSTANCE, str11);
                            String str18 = placesAndStopsInfoApiModel.i;
                            if (str10 != null) {
                                placeAndStopInfoAppModel2 = new PlaceAndStopInfoAppModel(universalSearchResultTypeA2, latLng, chaloTransitModeB, str15, str14, str13, str17, str18, str10);
                            }
                        }
                        placeAndStopInfoAppModel = null;
                    } else if (i != 3 && i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    it = it2;
                    placeAndStopInfoAppModel = null;
                } else {
                    it = it2;
                    String str19 = str15 == null ? "" : str15;
                    String str20 = str14 == null ? "" : str14;
                    if (str13 == null || str12 == null) {
                        placeAndStopInfoAppModel = null;
                    } else {
                        LatLng latLng2 = new LatLng(d2, d);
                        ChaloTransitMode.Companion companion4 = ChaloTransitMode.INSTANCE;
                        ChaloTransitMode chaloTransitMode = ChaloTransitMode.BUS;
                        companion4.getClass();
                        new PlaceAndStopInfoAppModel(universalSearchResultTypeA2, latLng2, ChaloTransitMode.Companion.a(str11, chaloTransitMode), str19, str20, str13, str12, placesAndStopsInfoApiModel.i, str10 == null ? "" : str10);
                        placeAndStopInfoAppModel = r0;
                    }
                }
                if (placeAndStopInfoAppModel != null) {
                    placeAndStopInfoAppModel = placeAndStopInfoAppModel2;
                    arrayList2.add(placeAndStopInfoAppModel);
                } else {
                    placeAndStopInfoAppModel = placeAndStopInfoAppModel2;
                }
                it2 = it;
            }
            list = arrayList2;
        } else {
            list = null;
        }
        List list6 = arrayList;
        if (arrayList == null) {
            emptyList = EmptyList.f17557a;
        }
        if (list == null) {
            list6 = emptyList;
            list = EmptyList.f17557a;
        }
        list6 = emptyList;
        return new SearchedResultItemsAppModel(list6, list);
    }
}
