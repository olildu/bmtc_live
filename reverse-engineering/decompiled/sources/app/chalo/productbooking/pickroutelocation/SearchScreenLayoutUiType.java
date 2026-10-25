package app.chalo.productbooking.pickroutelocation;

import app.chalo.uistate.text.HeaderTextUIState;
import defpackage.r1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/productbooking/pickroutelocation/SearchScreenLayoutUiType;", "", "RecentRouteSearches", "RemoteSearchItems", "RemoteSearchEmptyResult", "Lapp/chalo/productbooking/pickroutelocation/SearchScreenLayoutUiType$RecentRouteSearches;", "Lapp/chalo/productbooking/pickroutelocation/SearchScreenLayoutUiType$RemoteSearchEmptyResult;", "Lapp/chalo/productbooking/pickroutelocation/SearchScreenLayoutUiType$RemoteSearchItems;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SearchScreenLayoutUiType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickroutelocation/SearchScreenLayoutUiType$RecentRouteSearches;", "Lapp/chalo/productbooking/pickroutelocation/SearchScreenLayoutUiType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RecentRouteSearches extends SearchScreenLayoutUiType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HeaderTextUIState f8290a;
        public final List b;

        public RecentRouteSearches(HeaderTextUIState headerUiState, List recentRoutesList) {
            Intrinsics.i(headerUiState, "headerUiState");
            Intrinsics.i(recentRoutesList, "recentRoutesList");
            this.f8290a = headerUiState;
            this.b = recentRoutesList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecentRouteSearches)) {
                return false;
            }
            RecentRouteSearches recentRouteSearches = (RecentRouteSearches) obj;
            return Intrinsics.d(this.f8290a, recentRouteSearches.f8290a) && Intrinsics.d(this.b, recentRouteSearches.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8290a.hashCode() * 31);
        }

        public final String toString() {
            return "RecentRouteSearches(headerUiState=" + this.f8290a + ", recentRoutesList=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickroutelocation/SearchScreenLayoutUiType$RemoteSearchEmptyResult;", "Lapp/chalo/productbooking/pickroutelocation/SearchScreenLayoutUiType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoteSearchEmptyResult extends SearchScreenLayoutUiType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NoRoutesUiState f8291a;

        public RemoteSearchEmptyResult(NoRoutesUiState noRoutesUiState) {
            this.f8291a = noRoutesUiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoteSearchEmptyResult) && Intrinsics.d(this.f8291a, ((RemoteSearchEmptyResult) obj).f8291a);
        }

        public final int hashCode() {
            return this.f8291a.hashCode();
        }

        public final String toString() {
            return "RemoteSearchEmptyResult(noRoutesFoundUiState=" + this.f8291a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickroutelocation/SearchScreenLayoutUiType$RemoteSearchItems;", "Lapp/chalo/productbooking/pickroutelocation/SearchScreenLayoutUiType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoteSearchItems extends SearchScreenLayoutUiType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f8292a;

        public RemoteSearchItems(List routesList) {
            Intrinsics.i(routesList, "routesList");
            this.f8292a = routesList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoteSearchItems) && Intrinsics.d(this.f8292a, ((RemoteSearchItems) obj).f8292a);
        }

        public final int hashCode() {
            return this.f8292a.hashCode();
        }

        public final String toString() {
            return r1.d("RemoteSearchItems(routesList=", ")", this.f8292a);
        }
    }
}
