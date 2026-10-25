package app.chalo.productsummary.ui.data;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.py;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/data/RouteDetailInfoUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteDetailInfoUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f8758a;
    public final UIShape b;
    public final ChaloPadding c;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public RouteDetailInfoUISpec() {
        UIShape.Rectangle routeNameBackgroundShape = UIShape.l;
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().d, ChaloThemeHelper.a().f, ChaloThemeHelper.a().f, ChaloThemeHelper.a().d);
        Intrinsics.i(routeNameBackgroundShape, "routeNameBackgroundShape");
        this.f8758a = ChaloColorToken.SectionDividerColor.f9849a;
        this.b = routeNameBackgroundShape;
        this.c = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteDetailInfoUISpec)) {
            return false;
        }
        RouteDetailInfoUISpec routeDetailInfoUISpec = (RouteDetailInfoUISpec) obj;
        return Intrinsics.d(this.f8758a, routeDetailInfoUISpec.f8758a) && Intrinsics.d(this.b, routeDetailInfoUISpec.b) && Intrinsics.d(this.c, routeDetailInfoUISpec.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + pk0.b(this.b, this.f8758a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteDetailInfoUISpec(routNameBackgroundColor=");
        sb.append(this.f8758a);
        sb.append(", routeNameBackgroundShape=");
        sb.append(this.b);
        sb.append(", routeNameContentPadding=");
        return py.e(sb, this.c, ")");
    }
}
