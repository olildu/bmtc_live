package app.chalo.livetracking.search.uistate;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/search/uistate/RecentSearchSectionTypeUIState;", "", "RecentSearches", "NoRecentSearches", "Lapp/chalo/livetracking/search/uistate/RecentSearchSectionTypeUIState$NoRecentSearches;", "Lapp/chalo/livetracking/search/uistate/RecentSearchSectionTypeUIState$RecentSearches;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RecentSearchSectionTypeUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/uistate/RecentSearchSectionTypeUIState$NoRecentSearches;", "Lapp/chalo/livetracking/search/uistate/RecentSearchSectionTypeUIState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoRecentSearches extends RecentSearchSectionTypeUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NoRecentSearchSectionCardSpec f4514a;
        public final List b;

        public NoRecentSearches(List whatToSearchList) {
            NoRecentSearchSectionCardSpec noRecentSearchSectionCardSpec = new NoRecentSearchSectionCardSpec();
            Intrinsics.i(whatToSearchList, "whatToSearchList");
            this.f4514a = noRecentSearchSectionCardSpec;
            this.b = whatToSearchList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoRecentSearches)) {
                return false;
            }
            NoRecentSearches noRecentSearches = (NoRecentSearches) obj;
            return Intrinsics.d(this.f4514a, noRecentSearches.f4514a) && Intrinsics.d(this.b, noRecentSearches.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f4514a.hashCode() * 31);
        }

        public final String toString() {
            return "NoRecentSearches(spec=" + this.f4514a + ", whatToSearchList=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/search/uistate/RecentSearchSectionTypeUIState$RecentSearches;", "Lapp/chalo/livetracking/search/uistate/RecentSearchSectionTypeUIState;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RecentSearches extends RecentSearchSectionTypeUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecentSearchesSpec f4515a;
        public final List b;

        public RecentSearches(List items) {
            RecentSearchesSpec recentSearchesSpec = new RecentSearchesSpec();
            Intrinsics.i(items, "items");
            this.f4515a = recentSearchesSpec;
            this.b = items;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecentSearches)) {
                return false;
            }
            RecentSearches recentSearches = (RecentSearches) obj;
            return Intrinsics.d(this.f4515a, recentSearches.f4515a) && Intrinsics.d(this.b, recentSearches.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f4515a.f4519a.hashCode() * 31);
        }

        public final String toString() {
            return "RecentSearches(spec=" + this.f4515a + ", items=" + this.b + ")";
        }
    }
}
