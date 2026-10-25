package app.chalo.livetracking.universalsearch;

import app.chalo.livetracking.universalsearch.data.model.app.SearchedResultItemsAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/UniversalSearchResult;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UniversalSearchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloUseCaseResult f4964a;
    public final List b;
    public final SearchedResultItemsAppModel c;

    public UniversalSearchResult(ChaloUseCaseResult chaloUseCaseResult, List recentData, SearchedResultItemsAppModel searchedResultItemsAppModel) {
        Intrinsics.i(recentData, "recentData");
        this.f4964a = chaloUseCaseResult;
        this.b = recentData;
        this.c = searchedResultItemsAppModel;
    }

    public static UniversalSearchResult a(UniversalSearchResult universalSearchResult, ChaloUseCaseResult chaloUseCaseResult, List recentData, SearchedResultItemsAppModel searchedResultItemsAppModel, int i) {
        if ((i & 1) != 0) {
            chaloUseCaseResult = universalSearchResult.f4964a;
        }
        if ((i & 2) != 0) {
            recentData = universalSearchResult.b;
        }
        if ((i & 4) != 0) {
            searchedResultItemsAppModel = universalSearchResult.c;
        }
        universalSearchResult.getClass();
        Intrinsics.i(recentData, "recentData");
        return new UniversalSearchResult(chaloUseCaseResult, recentData, searchedResultItemsAppModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalSearchResult)) {
            return false;
        }
        UniversalSearchResult universalSearchResult = (UniversalSearchResult) obj;
        return Intrinsics.d(this.f4964a, universalSearchResult.f4964a) && Intrinsics.d(this.b, universalSearchResult.b) && Intrinsics.d(this.c, universalSearchResult.c);
    }

    public final int hashCode() {
        ChaloUseCaseResult chaloUseCaseResult = this.f4964a;
        int iB = r30.b((chaloUseCaseResult == null ? 0 : chaloUseCaseResult.hashCode()) * 31, 31, this.b);
        SearchedResultItemsAppModel searchedResultItemsAppModel = this.c;
        return iB + (searchedResultItemsAppModel != null ? searchedResultItemsAppModel.hashCode() : 0);
    }

    public final String toString() {
        return "UniversalSearchResult(remoteData=" + this.f4964a + ", recentData=" + this.b + ", localData=" + this.c + ")";
    }
}
