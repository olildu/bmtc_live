package app.chalo.compose.components.chalomap;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/chalomap/ChaloMapPolylinePointDetails;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloMapPolylinePointDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1872a;
    public final MapPolylinePointStateType b;

    public ChaloMapPolylinePointDetails(List points, MapPolylinePointStateType state) {
        Intrinsics.i(points, "points");
        Intrinsics.i(state, "state");
        this.f1872a = points;
        this.b = state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloMapPolylinePointDetails)) {
            return false;
        }
        ChaloMapPolylinePointDetails chaloMapPolylinePointDetails = (ChaloMapPolylinePointDetails) obj;
        return Intrinsics.d(this.f1872a, chaloMapPolylinePointDetails.f1872a) && this.b == chaloMapPolylinePointDetails.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1872a.hashCode() * 31);
    }

    public final String toString() {
        return "ChaloMapPolylinePointDetails(points=" + this.f1872a + ", state=" + this.b + ")";
    }
}
