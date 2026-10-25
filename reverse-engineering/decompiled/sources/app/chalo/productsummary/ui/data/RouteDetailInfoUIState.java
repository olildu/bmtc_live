package app.chalo.productsummary.ui.data;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.text.SpecialFeaturesTagListUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/data/RouteDetailInfoUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteDetailInfoUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RouteDetailInfoUISpec f8759a;
    public final TextUIState.ChaloTextUIState b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;
    public final SpecialFeaturesTagListUIState e;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public RouteDetailInfoUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState fromStopName, TextUIState.ChaloTextUIState toStopName, SpecialFeaturesTagListUIState specialFeaturesTagListUIState) {
        RouteDetailInfoUISpec routeDetailInfoUISpec = new RouteDetailInfoUISpec();
        Intrinsics.i(fromStopName, "fromStopName");
        Intrinsics.i(toStopName, "toStopName");
        this.f8759a = routeDetailInfoUISpec;
        this.b = chaloTextUIState;
        this.c = fromStopName;
        this.d = toStopName;
        this.e = specialFeaturesTagListUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailInfoUIState)) {
            return false;
        }
        RouteDetailInfoUIState routeDetailInfoUIState = (RouteDetailInfoUIState) obj;
        return Intrinsics.d(this.f8759a, routeDetailInfoUIState.f8759a) && Intrinsics.d(this.b, routeDetailInfoUIState.b) && Intrinsics.d(this.c, routeDetailInfoUIState.c) && Intrinsics.d(this.d, routeDetailInfoUIState.d) && Intrinsics.d(this.e, routeDetailInfoUIState.e);
    }

    public final int hashCode() {
        int iHashCode = this.f8759a.hashCode() * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        int iF = r30.f(this.d, r30.f(this.c, (iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31, 31), 31);
        SpecialFeaturesTagListUIState specialFeaturesTagListUIState = this.e;
        return iF + (specialFeaturesTagListUIState != null ? specialFeaturesTagListUIState.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteDetailInfoUIState(routeDetailInfoUISpec=");
        sb.append(this.f8759a);
        sb.append(", routeName=");
        sb.append(this.b);
        sb.append(", fromStopName=");
        r30.p(sb, this.c, ", toStopName=", this.d, ", specialFeatureTag=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
