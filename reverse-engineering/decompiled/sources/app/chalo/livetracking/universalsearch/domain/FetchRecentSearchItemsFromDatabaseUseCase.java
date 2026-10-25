package app.chalo.livetracking.universalsearch.domain;

import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/domain/FetchRecentSearchItemsFromDatabaseUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchRecentSearchItemsFromDatabaseUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecentItemsFlowProvider f5018a;
    public final CityProvider b;

    public FetchRecentSearchItemsFromDatabaseUseCase(RecentItemsFlowProvider recentItemsFlowProvider, CityProvider cityProvider) {
        this.f5018a = recentItemsFlowProvider;
        this.b = cityProvider;
    }

    public final Flow a(TransitModeSearchFilter transitModeSearchFilter) {
        String strB = CityProviderKt.b(this.b);
        if (strB == null) {
            return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(EmptyList.f17557a);
        }
        return new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2(new Flow[]{FlowKt.y(new FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$2(this, strB, null)), FlowKt.y(new FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$3(this, strB, transitModeSearchFilter, null)), FlowKt.y(new FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$4(this, strB, transitModeSearchFilter, null)), FlowKt.y(new FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$5(this, strB, transitModeSearchFilter, null))}, new FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$6(5, null));
    }
}
