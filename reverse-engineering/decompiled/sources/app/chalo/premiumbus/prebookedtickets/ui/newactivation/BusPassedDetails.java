package app.chalo.premiumbus.prebookedtickets.ui.newactivation;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/BusPassedDetails;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BusPassedDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7359a;
    public final boolean b;

    public BusPassedDetails(boolean z, boolean z2) {
        this.f7359a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusPassedDetails)) {
            return false;
        }
        BusPassedDetails busPassedDetails = (BusPassedDetails) obj;
        return this.f7359a == busPassedDetails.f7359a && this.b == busPassedDetails.b;
    }

    public final int hashCode() {
        return ((this.f7359a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "BusPassedDetails(isPassed=" + this.f7359a + ", isDelayed=" + this.b + ")";
    }
}
