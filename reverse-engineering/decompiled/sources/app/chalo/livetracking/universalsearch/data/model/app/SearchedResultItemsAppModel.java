package app.chalo.livetracking.universalsearch.data.model.app;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/app/SearchedResultItemsAppModel;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SearchedResultItemsAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4996a;
    public final List b;

    public SearchedResultItemsAppModel(List routes, List placesAndStops) {
        Intrinsics.i(routes, "routes");
        Intrinsics.i(placesAndStops, "placesAndStops");
        this.f4996a = routes;
        this.b = placesAndStops;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchedResultItemsAppModel)) {
            return false;
        }
        SearchedResultItemsAppModel searchedResultItemsAppModel = (SearchedResultItemsAppModel) obj;
        return Intrinsics.d(this.f4996a, searchedResultItemsAppModel.f4996a) && Intrinsics.d(this.b, searchedResultItemsAppModel.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4996a.hashCode() * 31);
    }

    public final String toString() {
        return "SearchedResultItemsAppModel(routes=" + this.f4996a + ", placesAndStops=" + this.b + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchedResultItemsAppModel() {
        EmptyList emptyList = EmptyList.f17557a;
        this(emptyList, emptyList);
    }
}
