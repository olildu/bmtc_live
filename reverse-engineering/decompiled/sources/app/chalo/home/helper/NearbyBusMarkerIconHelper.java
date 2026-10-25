package app.chalo.home.helper;

import app.chalo.models.RealTimeRouteInfo;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/helper/NearbyBusMarkerIconHelper;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface NearbyBusMarkerIconHelper {
    Object a(ChaloTransitMode chaloTransitMode, RealTimeRouteInfo.GeoRealTimeInfo geoRealTimeInfo, boolean z, boolean z2, boolean z3, Continuation continuation);
}
