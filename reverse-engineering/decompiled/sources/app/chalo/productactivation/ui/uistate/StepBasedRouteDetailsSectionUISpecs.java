package app.chalo.productactivation.ui.uistate;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/StepBasedRouteDetailsSectionUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StepBasedRouteDetailsSectionUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8076a = new ChaloPadding(ChaloThemeHelper.a().f, 0.0f, 0.0f, 0.0f, 14);
    public final UiAlignment.Horizontal b = UiAlignment.Horizontal.Start.f9886a;
    public final UiAlignment.Vertical c = UiAlignment.Vertical.Center.f9888a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepBasedRouteDetailsSectionUISpecs)) {
            return false;
        }
        StepBasedRouteDetailsSectionUISpecs stepBasedRouteDetailsSectionUISpecs = (StepBasedRouteDetailsSectionUISpecs) obj;
        return Intrinsics.d(this.f8076a, stepBasedRouteDetailsSectionUISpecs.f8076a) && Intrinsics.d(this.b, stepBasedRouteDetailsSectionUISpecs.b) && Intrinsics.d(this.c, stepBasedRouteDetailsSectionUISpecs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + uf0.d(this.b, this.f8076a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "StepBasedRouteDetailsSectionUISpecs(padding=" + this.f8076a + ", horizontalAlignment=" + this.b + ", rowVerticalAlignment=" + this.c + ")";
    }
}
