package app.chalo.livetracking.universalsearch;

import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/UniversalSearchManager;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface UniversalSearchManager {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    StateFlow a();

    void b(String str, String str2, UniversalSearchFlowSource universalSearchFlowSource, UniversalSearchOptions universalSearchOptions, UniversalSearchResultAnalyticProperties universalSearchResultAnalyticProperties, LatLng latLng, ChaloTransitMode chaloTransitMode);

    void clear();
}
