package app.chalo.home.ui.regularbus;

import app.chalo.recent.model.app.RecentsType;
import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/regularbus/RecentSearchedItem;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecentSearchedItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3617a;
    public final String b;
    public final RecentsType c;

    public RecentSearchedItem(String busNumberOrDestination, String destinationOrStarting, RecentsType recentsType) {
        Intrinsics.i(busNumberOrDestination, "busNumberOrDestination");
        Intrinsics.i(destinationOrStarting, "destinationOrStarting");
        Intrinsics.i(recentsType, "recentsType");
        this.f3617a = busNumberOrDestination;
        this.b = destinationOrStarting;
        this.c = recentsType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentSearchedItem)) {
            return false;
        }
        RecentSearchedItem recentSearchedItem = (RecentSearchedItem) obj;
        return Intrinsics.d(this.f3617a, recentSearchedItem.f3617a) && Intrinsics.d(this.b, recentSearchedItem.b) && Intrinsics.d(this.c, recentSearchedItem.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nf1.e(this.f3617a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RecentSearchedItem(busNumberOrDestination=", this.f3617a, ", destinationOrStarting=", this.b, ", recentsType=");
        sbE.append(this.c);
        sbE.append(")");
        return sbE.toString();
    }
}
