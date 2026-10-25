package app.chalo.premiumbus.domain;

import defpackage.hq0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ODPairsAndRespectiveSlotsBetweenStops;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ODPairsAndRespectiveSlotsBetweenStops {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7216a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public /* synthetic */ ODPairsAndRespectiveSlotsBetweenStops(int i, int i2, int i3, int i4, List list, boolean z) {
        this(list, (i4 & 2) != 0 ? false : z, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 1 : i2, false, (i4 & 32) != 0 ? 3 : i3);
    }

    public static ODPairsAndRespectiveSlotsBetweenStops a(ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops, List odPairsWithSlots) {
        boolean z = oDPairsAndRespectiveSlotsBetweenStops.b;
        int i = oDPairsAndRespectiveSlotsBetweenStops.c;
        int i2 = oDPairsAndRespectiveSlotsBetweenStops.d;
        boolean z2 = oDPairsAndRespectiveSlotsBetweenStops.e;
        int i3 = oDPairsAndRespectiveSlotsBetweenStops.f;
        oDPairsAndRespectiveSlotsBetweenStops.getClass();
        Intrinsics.i(odPairsWithSlots, "odPairsWithSlots");
        return new ODPairsAndRespectiveSlotsBetweenStops(odPairsWithSlots, z, i, i2, z2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ODPairsAndRespectiveSlotsBetweenStops)) {
            return false;
        }
        ODPairsAndRespectiveSlotsBetweenStops oDPairsAndRespectiveSlotsBetweenStops = (ODPairsAndRespectiveSlotsBetweenStops) obj;
        return Intrinsics.d(this.f7216a, oDPairsAndRespectiveSlotsBetweenStops.f7216a) && this.b == oDPairsAndRespectiveSlotsBetweenStops.b && this.c == oDPairsAndRespectiveSlotsBetweenStops.c && this.d == oDPairsAndRespectiveSlotsBetweenStops.d && this.e == oDPairsAndRespectiveSlotsBetweenStops.e && this.f == oDPairsAndRespectiveSlotsBetweenStops.f;
    }

    public final int hashCode() {
        return (((((((((this.f7216a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31) + this.c) * 31) + this.d) * 31) + (this.e ? 1231 : 1237)) * 31) + this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ODPairsAndRespectiveSlotsBetweenStops(odPairsWithSlots=");
        sb.append(this.f7216a);
        sb.append(", showNoRideAvailableForPreferredTimeBanner=");
        sb.append(this.b);
        sb.append(", currentPage=");
        hq0.p(this.c, this.d, ", totalPages=", ", hasMorePages=", sb);
        sb.append(this.e);
        sb.append(", pageSize=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public ODPairsAndRespectiveSlotsBetweenStops(List odPairsWithSlots, boolean z, int i, int i2, boolean z2, int i3) {
        Intrinsics.i(odPairsWithSlots, "odPairsWithSlots");
        this.f7216a = odPairsWithSlots;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = z2;
        this.f = i3;
    }
}
