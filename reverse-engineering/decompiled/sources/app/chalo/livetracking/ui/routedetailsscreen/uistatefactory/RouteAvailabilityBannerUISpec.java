package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteAvailabilityBannerUISpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteAvailabilityBannerUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f4913a;
    public final ChaloPadding b;
    public final ChaloPadding c;

    public RouteAvailabilityBannerUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().g, 1);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, ChaloThemeHelper.a().d, 0.0f, 0.0f, 13);
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 2);
        this.f4913a = chaloPadding;
        this.b = chaloPadding2;
        this.c = chaloPadding3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteAvailabilityBannerUISpec)) {
            return false;
        }
        RouteAvailabilityBannerUISpec routeAvailabilityBannerUISpec = (RouteAvailabilityBannerUISpec) obj;
        return Intrinsics.d(this.f4913a, routeAvailabilityBannerUISpec.f4913a) && Intrinsics.d(this.b, routeAvailabilityBannerUISpec.b) && Intrinsics.d(this.c, routeAvailabilityBannerUISpec.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.c(this.b, this.f4913a.hashCode() * 31, 31);
    }

    public final String toString() {
        return py.e(pk0.m("RouteAvailabilityBannerUISpec(contentPadding=", this.f4913a, ", bannerImgPadding=", this.b, ", titlePadding="), this.c, ")");
    }
}
