package app.chalo.citydata.repository.remote;

import app.chalo.citydata.data.model.api.request.NearbyStopsToLocationRequestApiModel;
import app.chalo.citydata.data.model.api.request.RouteDetailsRequestOldApiModel;
import app.chalo.citydata.data.model.api.request.RoutesDataRequestApiModel;
import app.chalo.citydata.data.model.api.request.StopDetailsApiRequestModel;
import app.chalo.citydata.data.model.api.request.StopImagesRequestApiModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/repository/remote/CityDataRemoteDataSource;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CityDataRemoteDataSource {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    Object a(String str, ChaloTransitMode chaloTransitMode, ContinuationImpl continuationImpl);

    Object b(RouteDetailsRequestOldApiModel routeDetailsRequestOldApiModel, ContinuationImpl continuationImpl);

    Object c(StopImagesRequestApiModel stopImagesRequestApiModel, ContinuationImpl continuationImpl);

    Object d(double d, double d2, String str, ContinuationImpl continuationImpl);

    Object e(NearbyStopsToLocationRequestApiModel nearbyStopsToLocationRequestApiModel, ContinuationImpl continuationImpl);

    Object f(StopDetailsApiRequestModel stopDetailsApiRequestModel, ContinuationImpl continuationImpl);

    Object g(RoutesDataRequestApiModel routesDataRequestApiModel, ContinuationImpl continuationImpl);
}
