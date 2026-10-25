package app.chalo.livetracking.universalsearch.domain;

import app.chalo.livetracking.universalsearch.UniversalSearchResult;
import app.chalo.livetracking.universalsearch.data.model.app.PlaceAndStopInfoAppModel;
import app.chalo.livetracking.universalsearch.data.model.app.SearchedResultItemsAppModel;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchItem;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchResultType;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import defpackage.uf0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/domain/UniversalSearchResultFilteringHelper;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UniversalSearchResultFilteringHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContextProvider f5040a;

    public UniversalSearchResultFilteringHelper(CoroutineContextProvider coroutineContextProvider) {
        this.f5040a = coroutineContextProvider;
    }

    public static final long a(UniversalSearchResultFilteringHelper universalSearchResultFilteringHelper, UniversalSearchRecentSearchItem universalSearchRecentSearchItem) {
        universalSearchResultFilteringHelper.getClass();
        if (universalSearchRecentSearchItem instanceof UniversalSearchRecentSearchItem.Trip) {
            return ((UniversalSearchRecentSearchItem.Trip) universalSearchRecentSearchItem).c.j;
        }
        if (universalSearchRecentSearchItem instanceof UniversalSearchRecentSearchItem.Stop) {
            return ((UniversalSearchRecentSearchItem.Stop) universalSearchRecentSearchItem).c.i;
        }
        if (universalSearchRecentSearchItem instanceof UniversalSearchRecentSearchItem.Place) {
            return ((UniversalSearchRecentSearchItem.Place) universalSearchRecentSearchItem).c.l;
        }
        if (universalSearchRecentSearchItem instanceof UniversalSearchRecentSearchItem.Route) {
            return ((UniversalSearchRecentSearchItem.Route) universalSearchRecentSearchItem).c.p;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final SearchedResultItemsAppModel b(UniversalSearchResultFilteringHelper universalSearchResultFilteringHelper, SearchedResultItemsAppModel searchedResultItemsAppModel, LinkedHashSet linkedHashSet) {
        List list;
        universalSearchResultFilteringHelper.getClass();
        List list2 = linkedHashSet.contains(UniversalSearchResultSource.ROUTE) ? searchedResultItemsAppModel.f4996a : EmptyList.f17557a;
        if (linkedHashSet.contains(UniversalSearchResultSource.PLACE) || linkedHashSet.contains(UniversalSearchResultSource.STOP)) {
            List list3 = searchedResultItemsAppModel.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list3) {
                PlaceAndStopInfoAppModel placeAndStopInfoAppModel = (PlaceAndStopInfoAppModel) obj;
                if ((placeAndStopInfoAppModel.f4992a == UniversalSearchResultType.PLACE && linkedHashSet.contains(UniversalSearchResultSource.PLACE)) || (placeAndStopInfoAppModel.f4992a == UniversalSearchResultType.STOP && linkedHashSet.contains(UniversalSearchResultSource.STOP))) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        } else {
            list = EmptyList.f17557a;
        }
        return new SearchedResultItemsAppModel(list2, list);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(UniversalSearchResult universalSearchResult, UniversalSearchOptions universalSearchOptions, ContinuationImpl continuationImpl) {
        UniversalSearchResultFilteringHelper$invoke$1 universalSearchResultFilteringHelper$invoke$1;
        Ref.ObjectRef objectRef;
        if (continuationImpl instanceof UniversalSearchResultFilteringHelper$invoke$1) {
            universalSearchResultFilteringHelper$invoke$1 = (UniversalSearchResultFilteringHelper$invoke$1) continuationImpl;
            int i = universalSearchResultFilteringHelper$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                universalSearchResultFilteringHelper$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                universalSearchResultFilteringHelper$invoke$1 = new UniversalSearchResultFilteringHelper$invoke$1(this, continuationImpl);
            }
        } else {
            universalSearchResultFilteringHelper$invoke$1 = new UniversalSearchResultFilteringHelper$invoke$1(this, continuationImpl);
        }
        Object obj = universalSearchResultFilteringHelper$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = universalSearchResultFilteringHelper$invoke$1.label;
        if (i2 == 0) {
            Ref.ObjectRef objectRefV = uf0.v(obj);
            objectRefV.element = universalSearchResult;
            DefaultScheduler defaultScheduler = this.f5040a.getDefault();
            UniversalSearchResultFilteringHelper$invoke$2 universalSearchResultFilteringHelper$invoke$2 = new UniversalSearchResultFilteringHelper$invoke$2(universalSearchOptions, objectRefV, universalSearchResult, this, null);
            universalSearchResultFilteringHelper$invoke$1.L$0 = objectRefV;
            universalSearchResultFilteringHelper$invoke$1.label = 1;
            if (BuildersKt.g(defaultScheduler, universalSearchResultFilteringHelper$invoke$2, universalSearchResultFilteringHelper$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            objectRef = objectRefV;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) universalSearchResultFilteringHelper$invoke$1.L$0;
            ResultKt.b(obj);
        }
        return objectRef.element;
    }
}
