package app.chalo.instantticket.ui.routeselection.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/routeselection/uistate/RouteSelectionInputUISpec;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteSelectionInputUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3971a;
    public final ChaloPadding b;
    public final float c;
    public final ChaloPadding d;

    public RouteSelectionInputUISpec(ChaloPadding chaloPadding, int i) {
        chaloPadding = (i & 1) != 0 ? new ChaloPadding(ChaloThemeHelper.a().l, 0.0f, 0.0f, 0.0f, 14) : chaloPadding;
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 0.0f, 0.0f, 14);
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().c, 0.0f, 0.0f, 0.0f, 14);
        this.f3971a = chaloPadding;
        this.b = chaloPadding2;
        this.c = f;
        this.d = chaloPadding3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteSelectionInputUISpec)) {
            return false;
        }
        RouteSelectionInputUISpec routeSelectionInputUISpec = (RouteSelectionInputUISpec) obj;
        return Intrinsics.d(this.f3971a, routeSelectionInputUISpec.f3971a) && Intrinsics.d(this.b, routeSelectionInputUISpec.b) && Dp.m7283equalsimpl0(this.c, routeSelectionInputUISpec.c) && Intrinsics.d(this.d, routeSelectionInputUISpec.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + uf0.a(this.c, r30.c(this.b, this.f3971a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        StringBuilder sbM = pk0.m("RouteSelectionInputUISpec(paddingAroundLabel=", this.f3971a, ", paddingAroundValue=", this.b, ", spaceAboveDivider=");
        sbM.append(strM7289toStringimpl);
        sbM.append(", paddingAroundErrorStatus=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }
}
