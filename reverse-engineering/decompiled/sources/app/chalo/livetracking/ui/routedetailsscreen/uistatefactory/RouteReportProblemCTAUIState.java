package app.chalo.livetracking.ui.routedetailsscreen.uistatefactory;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.gf;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/uistatefactory/RouteReportProblemCTAUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteReportProblemCTAUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f4935a;
    public final TextUIState.ChaloTextUIState b;
    public final UiEventHandler$Companion$fromLambda$1 c;
    public final ChaloPadding d;

    public RouteReportProblemCTAUIState(UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, ImageUIState img, TextUIState.ChaloTextUIState chaloTextUIState) {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, ChaloThemeHelper.a().d, 0.0f, 11);
        Intrinsics.i(img, "img");
        this.f4935a = img;
        this.b = chaloTextUIState;
        this.c = uiEventHandler$Companion$fromLambda$1;
        this.d = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteReportProblemCTAUIState)) {
            return false;
        }
        RouteReportProblemCTAUIState routeReportProblemCTAUIState = (RouteReportProblemCTAUIState) obj;
        return Intrinsics.d(this.f4935a, routeReportProblemCTAUIState.f4935a) && Intrinsics.d(this.b, routeReportProblemCTAUIState.b) && Intrinsics.d(this.c, routeReportProblemCTAUIState.c) && Intrinsics.d(this.d, routeReportProblemCTAUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gf.a(this.c, r30.f(this.b, this.f4935a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = pk0.n("RouteReportProblemCTAUIState(img=", this.f4935a, ", text=", this.b, ", eventHandler=");
        sbN.append(this.c);
        sbN.append(", imgPadding=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
