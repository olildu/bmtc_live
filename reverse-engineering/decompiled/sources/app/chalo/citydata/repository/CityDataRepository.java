package app.chalo.citydata.repository;

import app.chalo.citydata.data.model.app.RouteLiveDetailsAppModel;
import app.chalo.citydata.data.model.app.request.NearbyStopsToLocationRequestAppModel;
import app.chalo.citydata.data.model.app.request.RouteDetailsRequestOldAppModel;
import app.chalo.citydata.data.model.app.request.RoutesDataRequestAppModel;
import app.chalo.citydata.data.model.app.request.StopDetailsRequestAppModel;
import app.chalo.citydata.data.model.app.request.StopImagesRequestAppModel;
import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/repository/CityDataRepository;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CityDataRepository {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    Serializable a(String str, ChaloTransitMode chaloTransitMode, ContinuationImpl continuationImpl);

    Object b(long j, Continuation continuation);

    Object c(ArrayList arrayList, Continuation continuation);

    Object d(ContinuationImpl continuationImpl);

    Object e(SavedRoutesSortType savedRoutesSortType, ContinuationImpl continuationImpl);

    Object f(String str, ContinuationImpl continuationImpl);

    Serializable g(List list, ContinuationImpl continuationImpl);

    Object h(List list, String str, boolean z, ContinuationImpl continuationImpl);

    Object i(RouteDetailsRequestOldAppModel routeDetailsRequestOldAppModel, ContinuationImpl continuationImpl);

    Serializable j(NearbyStopsToLocationRequestAppModel nearbyStopsToLocationRequestAppModel, ContinuationImpl continuationImpl);

    Object k(String str, RouteLiveDetailsAppModel routeLiveDetailsAppModel, Continuation continuation);

    Object l(RoutesDataRequestAppModel routesDataRequestAppModel, ContinuationImpl continuationImpl);

    Object m(String str, ContinuationImpl continuationImpl);

    Serializable n(StopDetailsRequestAppModel stopDetailsRequestAppModel, ContinuationImpl continuationImpl);

    Object o(String str, String str2, LatLng latLng, ContinuationImpl continuationImpl);

    Object p(String str, Continuation continuation);

    Serializable q(StopImagesRequestAppModel stopImagesRequestAppModel, ContinuationImpl continuationImpl);

    Serializable r(ContinuationImpl continuationImpl);
}
