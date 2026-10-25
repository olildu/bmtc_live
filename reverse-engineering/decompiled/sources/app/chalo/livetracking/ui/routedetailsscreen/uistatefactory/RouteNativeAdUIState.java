package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.ads.NativeInlineAdSlot;
import defpackage.d;
import defpackage.fu0;
import defpackage.zt0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteNativeAdUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteNativeAdUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4934a;
    public final NativeInlineAdSlot b;
    public final Map c;
    public final fu0 d;
    public final zt0 e;

    public RouteNativeAdUIState(String stopId, NativeInlineAdSlot slot, Map map, fu0 fu0Var, zt0 zt0Var) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(slot, "slot");
        this.f4934a = stopId;
        this.b = slot;
        this.c = map;
        this.d = fu0Var;
        this.e = zt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteNativeAdUIState)) {
            return false;
        }
        RouteNativeAdUIState routeNativeAdUIState = (RouteNativeAdUIState) obj;
        return Intrinsics.d(this.f4934a, routeNativeAdUIState.f4934a) && this.b == routeNativeAdUIState.b && this.c.equals(routeNativeAdUIState.c) && this.d.equals(routeNativeAdUIState.d) && this.e.equals(routeNativeAdUIState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + d.f(this.c, (this.b.hashCode() + (this.f4934a.hashCode() * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "RouteNativeAdUIState(stopId=" + this.f4934a + ", slot=" + this.b + ", targeting=" + this.c + ", onAdLoaded=" + this.d + ", onAdFailed=" + this.e + ")";
    }
}
