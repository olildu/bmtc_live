package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.dialog.DialogDismissRequest;
import app.chalo.uistate.dialog.DialogUIEventHandler;
import defpackage.dd;
import defpackage.py;
import defpackage.uf0;
import defpackage.wb;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteAvailabilityDialogUISpecs;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteAvailabilityDialogUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4915a;
    public final float b;
    public final float c;
    public final DialogUIEventHandler d;
    public final float e;
    public final ChaloColorToken f;
    public final ChaloPadding g;

    public RouteAvailabilityDialogUISpecs() {
        float f = ChaloThemeHelper.a().i;
        float f2 = ChaloThemeHelper.a().f;
        float f3 = ChaloThemeHelper.a().i;
        DialogUIEventHandler dialogUIEventHandler = new DialogUIEventHandler(false, false, DialogDismissRequest.Companion.a(new wb(8)));
        float f4 = ChaloThemeHelper.a().x;
        float f5 = ChaloThemeHelper.a().i;
        ChaloPadding chaloPadding = new ChaloPadding(f5, f5, f5, f5);
        this.f4915a = f;
        this.b = f2;
        this.c = f3;
        this.d = dialogUIEventHandler;
        this.e = f4;
        this.f = ChaloColorToken.White.f9870a;
        this.g = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteAvailabilityDialogUISpecs)) {
            return false;
        }
        RouteAvailabilityDialogUISpecs routeAvailabilityDialogUISpecs = (RouteAvailabilityDialogUISpecs) obj;
        return Dp.m7283equalsimpl0(this.f4915a, routeAvailabilityDialogUISpecs.f4915a) && Dp.m7283equalsimpl0(this.b, routeAvailabilityDialogUISpecs.b) && Dp.m7283equalsimpl0(this.c, routeAvailabilityDialogUISpecs.c) && Intrinsics.d(this.d, routeAvailabilityDialogUISpecs.d) && Dp.m7283equalsimpl0(this.e, routeAvailabilityDialogUISpecs.e) && Intrinsics.d(this.f, routeAvailabilityDialogUISpecs.f) && Intrinsics.d(this.g, routeAvailabilityDialogUISpecs.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + z40.b(this.f, uf0.a(this.e, (this.d.hashCode() + uf0.a(this.c, uf0.a(this.b, Dp.m7284hashCodeimpl(this.f4915a) * 31, 31), 31)) * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f4915a);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.e);
        StringBuilder sbE = dd.e("RouteAvailabilityDialogUISpecs(spaceAfterImage=", strM7289toStringimpl, ", spaceAfterTitle=", strM7289toStringimpl2, ", spaceAfterSubtitle=");
        sbE.append(strM7289toStringimpl3);
        sbE.append(", dialogEventHandler=");
        sbE.append(this.d);
        sbE.append(", dialogContentWidth=");
        sbE.append(strM7289toStringimpl4);
        sbE.append(", contentBackground=");
        sbE.append(this.f);
        sbE.append(", contentPadding=");
        return py.e(sbE, this.g, ")");
    }
}
