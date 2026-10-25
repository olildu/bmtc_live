package app.chalo.home.data.model.app;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/data/model/app/LocationTooltipData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LocationTooltipData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2944a;
    public final LocationTurnOnTooltipType b;

    public LocationTooltipData(boolean z, LocationTurnOnTooltipType locationTurnOnTooltipType) {
        this.f2944a = z;
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
        return this.f2944a == locationTooltipData.f2944a && Intrinsics.d(this.b, locationTooltipData.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f2944a ? 1231 : 1237) * 31);
    }

    public final String toString() {
        return "LocationTooltipData(showLocationToolTip=" + this.f2944a + ", locationTurnOnTooltipType=" + this.b + ")";
    }
}
