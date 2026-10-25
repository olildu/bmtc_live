package app.chalo.livetracking.universalsearch.analytics;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.analytics.events.AnalyticsFrequency;
import app.chalo.constants.Source;
import app.chalo.livetracking.universalsearch.data.exception.RemoteSearchResultErrorType;
import app.chalo.livetracking.universalsearch.data.model.app.PlaceAndStopInfoAppModel;
import app.chalo.livetracking.universalsearch.data.model.app.SearchedResultItemsAppModel;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchResultType;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchItem;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchPlacesAndStopsInfoModel;
import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.CollectionUtilsKt;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.b3;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/analytics/UniversalSearchAnalyticsEventHelperImpl;", "Lapp/chalo/livetracking/universalsearch/analytics/UniversalSearchAnalyticsEventHelper;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UniversalSearchAnalyticsEventHelperImpl implements UniversalSearchAnalyticsEventHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f4966a;
    public final CityProvider b;
    public final TimeUtilsContract c;
    public final SystemHelper d;

    public UniversalSearchAnalyticsEventHelperImpl(AnalyticsContract analyticsContract, CityProvider cityProvider, TimeUtilsContract timeUtilsContract, SystemHelper systemHelper) {
        this.f4966a = analyticsContract;
        this.b = cityProvider;
        this.c = timeUtilsContract;
        this.d = systemHelper;
    }

    public static void o(LinkedHashMap linkedHashMap, List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((UniversalSearchItem) next) instanceof UniversalSearchItem.PlacesAndStopsItem));
        UniversalSearchItem universalSearchItem = (UniversalSearchItem) next;
        if (universalSearchItem != null) {
            int i = 0;
            for (Object obj : CollectionUtilsKt.b(3, ((UniversalSearchItem.PlacesAndStopsItem) universalSearchItem).f5001a)) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                UniversalSearchPlacesAndStopsInfoModel universalSearchPlacesAndStopsInfoModel = (UniversalSearchPlacesAndStopsInfoModel) obj;
                linkedHashMap.put(b3.d(i2, "searchResult", "Type"), universalSearchPlacesAndStopsInfoModel.f5003a.name());
                linkedHashMap.put("searchResult" + i2 + "Name", universalSearchPlacesAndStopsInfoModel.e);
                i = i2;
            }
        }
    }

    @Override // app.chalo.livetracking.universalsearch.analytics.UniversalSearchAnalyticsEventHelper
    public final void a(String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this.f4966a, "pb adjust campaign card shown", source, null, null, false, 28);
    }

    @Override // app.chalo.livetracking.universalsearch.analytics.UniversalSearchAnalyticsEventHelper
    public final void b(String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this.f4966a, "pb adjust campaign card clicked", source, null, null, false, 28);
    }

    @Override // app.chalo.livetracking.universalsearch.analytics.UniversalSearchAnalyticsEventHelper
    public final void c(String stopName, String stopId, UniversalSearchItemType itemType, String query, boolean z, String source) {
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(itemType, "itemType");
        Intrinsics.i(query, "query");
        Intrinsics.i(source, "source");
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("stop", stopName), new Pair("stopId", stopId));
        n(linkedHashMapK, itemType.name(), query, z);
        AnalyticsContract.DefaultImpls.a(this.f4966a, "universal item clicked", source, linkedHashMapK, null, false, 24);
    }

    @Override // app.chalo.livetracking.universalsearch.analytics.UniversalSearchAnalyticsEventHelper
    public final void d(String str, String startStop, String routeName, boolean z, UniversalSearchItemType itemType, String query, boolean z2, String source) {
        Intrinsics.i(startStop, "startStop");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(itemType, "itemType");
        Intrinsics.i(query, "query");
        Intrinsics.i(source, "source");
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("agency", str), new Pair("startStop", startStop), new Pair("route name", routeName), new Pair("isFreeRide", String.valueOf(z)));
        n(linkedHashMapK, itemType.name(), query, z2);
        AnalyticsContract.DefaultImpls.a(this.f4966a, "universal item clicked", source, linkedHashMapK, null, false, 24);
    }

    @Override // app.chalo.livetracking.universalsearch.analytics.UniversalSearchAnalyticsEventHelper
    public final void e(long j, String searchQuery, String screenSource, String str, List resultsList, Long l) {
        Intrinsics.i(searchQuery, "searchQuery");
        Intrinsics.i(screenSource, "screenSource");
        Intrinsics.i(resultsList, "resultsList");
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("searchSessionId", String.valueOf(j)), new Pair("queryString", searchQuery), new Pair("queryLength", String.valueOf(searchQuery.length())), new Pair("searchScreenType", screenSource), new Pair("searchScreenInputScreen", String.valueOf(str)), new Pair("timeFromResultShown", String.valueOf(l != null ? Long.valueOf(this.d.j() - l.longValue()) : null)));
        o(linkedHashMapK, resultsList);
        AnalyticsContract.DefaultImpls.a(this.f4966a, "search clear query clicked", Source.UNIVERSAL_SEARCH.getSourceName(), linkedHashMapK, null, false, 24);
    }

    @Override // app.chalo.livetracking.universalsearch.analytics.UniversalSearchAnalyticsEventHelper
    public final void f(String location, UniversalSearchItemType itemType, String query, boolean z, String source) {
        Intrinsics.i(location, "location");
        Intrinsics.i(itemType, "itemType");
        Intrinsics.i(query, "query");
        Intrinsics.i(source, "source");
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair(FirebaseAnalytics.Param.LOCATION, location));
        n(linkedHashMapK, itemType.name(), query, z);
        AnalyticsContract.DefaultImpls.a(this.f4966a, "universal item clicked", source, linkedHashMapK, null, false, 24);
    }

    @Override // app.chalo.livetracking.universalsearch.analytics.UniversalSearchAnalyticsEventHelper
    public final void g(String str, String str2, UniversalSearchItemType itemType, String query, String screenSource, String str3) {
        Intrinsics.i(itemType, "itemType");
        Intrinsics.i(query, "query");
        Intrinsics.i(screenSource, "screenSource");
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("origin", str), new Pair(FirebaseAnalytics.Param.DESTINATION, str2), new Pair("searchScreenType", screenSource), new Pair("searchScreenInputScreen", String.valueOf(str3)));
        n(linkedHashMapK, itemType.name(), query, true);
        AnalyticsContract.DefaultImpls.a(this.f4966a, "recent trip result clicked", Source.UNIVERSAL_SEARCH.getSourceName(), linkedHashMapK, null, false, 24);
    }

    @Override // app.chalo.livetracking.universalsearch.analytics.UniversalSearchAnalyticsEventHelper
    public final void h(long j, String searchQuery, String resultId, String searchPartner, String resultName, int i, int i2, int i3, UniversalSearchItemType resultType, String screenSource, String str, LatLng latLng, LatLng latLng2, boolean z) {
        Intrinsics.i(searchQuery, "searchQuery");
        Intrinsics.i(resultId, "resultId");
        Intrinsics.i(searchPartner, "searchPartner");
        Intrinsics.i(resultName, "resultName");
        Intrinsics.i(resultType, "resultType");
        Intrinsics.i(screenSource, "screenSource");
        AnalyticsContract.DefaultImpls.a(this.f4966a, "search result clicked", Source.UNIVERSAL_SEARCH.getSourceName(), MapsKt.k(new Pair("searchSessionId", String.valueOf(j)), new Pair("queryString", searchQuery), new Pair("queryLength", String.valueOf(searchQuery.length())), new Pair("searchScreenType", screenSource), new Pair("searchScreenInputScreen", String.valueOf(str)), new Pair("searchResultId", resultId), new Pair("searchPartner", searchPartner), new Pair("searchResultPosition", String.valueOf(i3)), new Pair("searchResultName", resultName), new Pair("searchResultType", resultType.name()), new Pair("totalStopsAndPlaces", Integer.valueOf(i2)), new Pair("totalRoutes", Integer.valueOf(i)), new Pair("resultLatLong", "lat: " + (latLng != null ? Double.valueOf(latLng.f5134a) : null) + ", long: " + (latLng != null ? Double.valueOf(latLng.b) : null)), new Pair("userLatLong", "lat: " + (latLng2 != null ? Double.valueOf(latLng2.f5134a) : null) + ", long: " + (latLng2 != null ? Double.valueOf(latLng2.b) : null)), new Pair("isRecentResult", String.valueOf(z))), null, false, 24);
    }

    @Override // app.chalo.livetracking.universalsearch.analytics.UniversalSearchAnalyticsEventHelper
    public final void i(long j, ChaloUseCaseResult response, String screenSource, String str, String searchQuery, long j2, LatLng latLng) {
        int i;
        Intrinsics.i(response, "response");
        Intrinsics.i(screenSource, "screenSource");
        Intrinsics.i(searchQuery, "searchQuery");
        Pair pair = new Pair("searchSessionId", String.valueOf(j));
        Pair pair2 = new Pair("loadingTime", String.valueOf(j2));
        Pair pair3 = new Pair("queryString", searchQuery);
        Pair pair4 = new Pair("queryLength", String.valueOf(searchQuery.length()));
        Pair pair5 = new Pair("searchScreenType", screenSource);
        Pair pair6 = new Pair("searchScreenInputScreen", String.valueOf(str));
        int i2 = 0;
        LinkedHashMap linkedHashMapK = MapsKt.k(pair, pair2, pair3, pair4, pair5, pair6, new Pair("userLatLong", "lat: " + (latLng != null ? Double.valueOf(latLng.f5134a) : null) + ", long: " + (latLng != null ? Double.valueOf(latLng.b) : null)));
        boolean z = response instanceof ChaloUseCaseResult.Failure;
        AnalyticsContract analyticsContract = this.f4966a;
        if (z) {
            RemoteSearchResultErrorType remoteSearchResultErrorType = (RemoteSearchResultErrorType) ((ChaloUseCaseResult.Failure) response).f10418a;
            if (remoteSearchResultErrorType.f4967a.length() == 0) {
                linkedHashMapK.put("error message", "null errorMessage");
            } else {
                linkedHashMapK.put("error message", remoteSearchResultErrorType.f4967a);
            }
            AnalyticsContract.DefaultImpls.a(analyticsContract, "Search results shown", Source.UNIVERSAL_SEARCH.getSourceName(), linkedHashMapK, null, false, 24);
            return;
        }
        SearchedResultItemsAppModel searchedResultItemsAppModel = (SearchedResultItemsAppModel) ((ChaloUseCaseResult.Success) response).f10419a;
        List list = searchedResultItemsAppModel.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((PlaceAndStopInfoAppModel) it.next()).f4992a == UniversalSearchResultType.PLACE && (i = i + 1) < 0) {
                    CollectionsKt.y0();
                    throw null;
                }
            }
        }
        List list2 = searchedResultItemsAppModel.b;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((PlaceAndStopInfoAppModel) it2.next()).f4992a == UniversalSearchResultType.STOP && (i2 = i2 + 1) < 0) {
                    CollectionsKt.y0();
                    throw null;
                }
            }
        }
        int size = searchedResultItemsAppModel.f4996a.size();
        linkedHashMapK.put("totalResults", String.valueOf(size + i + i2));
        linkedHashMapK.put("ROUTE", String.valueOf(size));
        linkedHashMapK.put("TRIPS_LOCATIONS", String.valueOf(i));
        linkedHashMapK.put("TRIPS_STOPS", String.valueOf(i2));
        AnalyticsContract.DefaultImpls.a(analyticsContract, "Search results shown", Source.UNIVERSAL_SEARCH.getSourceName(), linkedHashMapK, null, false, 24);
    }

    @Override // app.chalo.livetracking.universalsearch.analytics.UniversalSearchAnalyticsEventHelper
    public final void j(long j, String screenSource, String str, String initialQuery) {
        Intrinsics.i(screenSource, "screenSource");
        Intrinsics.i(initialQuery, "initialQuery");
        AnalyticsContract.DefaultImpls.a(this.f4966a, "first character type after search open", Source.UNIVERSAL_SEARCH.getSourceName(), MapsKt.k(new Pair("searchSessionId", String.valueOf(j)), new Pair("queryString", initialQuery), new Pair("searchScreenType", screenSource), new Pair("searchScreenInputScreen", String.valueOf(str))), null, false, 24);
    }

    @Override // app.chalo.livetracking.universalsearch.analytics.UniversalSearchAnalyticsEventHelper
    public final void k(Source source, String str, Map map) {
        Intrinsics.i(source, "source");
        this.f4966a.e(str, source.getSourceName(), map, AnalyticsFrequency.Always.b, true);
    }

    @Override // app.chalo.livetracking.universalsearch.analytics.UniversalSearchAnalyticsEventHelper
    public final void l(long j, String screenSource, String str, int i) {
        Intrinsics.i(screenSource, "screenSource");
        AnalyticsContract.DefaultImpls.a(this.f4966a, "search screen opened", Source.UNIVERSAL_SEARCH.getSourceName(), MapsKt.k(new Pair("searchSessionId", String.valueOf(j)), new Pair("searchScreenType", screenSource), new Pair("searchScreenInputScreen", String.valueOf(str)), new Pair("noOfRecentTripsAvailable", Integer.valueOf(i))), null, false, 24);
    }

    @Override // app.chalo.livetracking.universalsearch.analytics.UniversalSearchAnalyticsEventHelper
    public final void m(long j, String searchQuery, String screenSource, String str, List resultsList, Long l) {
        Intrinsics.i(searchQuery, "searchQuery");
        Intrinsics.i(screenSource, "screenSource");
        Intrinsics.i(resultsList, "resultsList");
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("searchSessionId", String.valueOf(j)), new Pair("queryString", searchQuery), new Pair("queryLength", String.valueOf(searchQuery.length())), new Pair("searchScreenType", screenSource), new Pair("searchScreenInputScreen", String.valueOf(str)), new Pair("isDeviceBackClicked", String.valueOf(false)), new Pair("timeFromResultShown", String.valueOf(l != null ? Long.valueOf(this.d.j() - l.longValue()) : null)));
        o(linkedHashMapK, resultsList);
        AnalyticsContract.DefaultImpls.a(this.f4966a, "search screen back clicked", Source.UNIVERSAL_SEARCH.getSourceName(), linkedHashMapK, null, false, 24);
    }

    public final void n(LinkedHashMap linkedHashMap, String str, String str2, boolean z) {
        linkedHashMap.put("length", String.valueOf(str2.length()));
        linkedHashMap.put("universal item clicked", str);
        linkedHashMap.put("fromRecentList", String.valueOf(z));
        linkedHashMap.put("isPopularRoute", String.valueOf(false));
        if (!z) {
            linkedHashMap.put("searchString", str2);
        }
        int iN = this.c.N(this.d.j());
        StringBuilder sb = new StringBuilder();
        sb.append(iN);
        linkedHashMap.put("hourOfEvent", sb.toString());
        linkedHashMap.put("networkStatus", String.valueOf(true));
        HashMap map = new HashMap();
        map.put("universalSearchUsed", "true");
        AnalyticsContract analyticsContract = this.f4966a;
        analyticsContract.d(map);
        analyticsContract.a(map);
    }
}
