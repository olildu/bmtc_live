package app.chalo.home.ui.home;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/home/LocationTooltipData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LocationTooltipData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3584a;
    public final LocationTurnOnTooltipType b;

    public LocationTooltipData(boolean z, LocationTurnOnTooltipType locationTurnOnTooltipType) {
        this.f3584a = z;
        this.b = locationTurnOnTooltipType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationTooltipData)) {
            return false;
        }
        LocationTooltipData locationTooltipData = (LocationTooltipData) obj;
        return this.f3584a == locationTooltipData.f3584a && Intrinsics.d(this.b, locationTooltipData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f3584a ? 1231 : 1237) * 31);
    }

    public final String toString() {
        return "LocationTooltipData(showLocationToolTip=" + this.f3584a + ", locationTurnOnTooltipType=" + this.b + ")";
    }
}
