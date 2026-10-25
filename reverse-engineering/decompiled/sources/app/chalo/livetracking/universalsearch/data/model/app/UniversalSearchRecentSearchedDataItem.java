package app.chalo.livetracking.universalsearch.data.model.app;

import defpackage.b3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/app/UniversalSearchRecentSearchedDataItem;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UniversalSearchRecentSearchedDataItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4998a;
    public final boolean b;
    public final boolean c;

    public UniversalSearchRecentSearchedDataItem(List recentSearchItems, boolean z, boolean z2) {
        Intrinsics.i(recentSearchItems, "recentSearchItems");
        this.f4998a = recentSearchItems;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalSearchRecentSearchedDataItem)) {
            return false;
        }
        UniversalSearchRecentSearchedDataItem universalSearchRecentSearchedDataItem = (UniversalSearchRecentSearchedDataItem) obj;
        return Intrinsics.d(this.f4998a, universalSearchRecentSearchedDataItem.f4998a) && this.b == universalSearchRecentSearchedDataItem.b && this.c == universalSearchRecentSearchedDataItem.c;
    }

    public final int hashCode() {
        return (((this.f4998a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UniversalSearchRecentSearchedDataItem(recentSearchItems=");
        sb.append(this.f4998a);
        sb.append(", isFavoriteItemsPresent=");
        sb.append(this.b);
        sb.append(", isRecentItemsPresent=");
        return b3.g(")", sb, this.c);
    }
}
