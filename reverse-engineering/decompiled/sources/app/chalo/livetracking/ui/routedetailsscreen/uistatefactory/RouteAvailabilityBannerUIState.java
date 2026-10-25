package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.gf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteAvailabilityBannerUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteAvailabilityBannerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUrlUIState f4914a;
    public final TextUIState.StyledTextUIState b;
    public final UiEventHandler$Companion$fromLambda$1 c;
    public final RouteAvailabilityBannerUISpec d;

    public RouteAvailabilityBannerUIState(ImageUrlUIState imageUrlUIState, TextUIState.StyledTextUIState styledTextUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        RouteAvailabilityBannerUISpec routeAvailabilityBannerUISpec = new RouteAvailabilityBannerUISpec();
        this.f4914a = imageUrlUIState;
        this.b = styledTextUIState;
        this.c = uiEventHandler$Companion$fromLambda$1;
        this.d = routeAvailabilityBannerUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteAvailabilityBannerUIState)) {
            return false;
        }
        RouteAvailabilityBannerUIState routeAvailabilityBannerUIState = (RouteAvailabilityBannerUIState) obj;
        return Intrinsics.d(this.f4914a, routeAvailabilityBannerUIState.f4914a) && Intrinsics.d(this.b, routeAvailabilityBannerUIState.b) && Intrinsics.d(this.c, routeAvailabilityBannerUIState.c) && Intrinsics.d(this.d, routeAvailabilityBannerUIState.d);
    }

    public final int hashCode() {
        ImageUrlUIState imageUrlUIState = this.f4914a;
        return this.d.hashCode() + gf.a(this.c, (this.b.hashCode() + ((imageUrlUIState == null ? 0 : imageUrlUIState.hashCode()) * 31)) * 31, 31);
    }

    public final String toString() {
        return "RouteAvailabilityBannerUIState(bannerImage=" + this.f4914a + ", title=" + this.b + ", eventHandler=" + this.c + ", specs=" + this.d + ")";
    }
}
