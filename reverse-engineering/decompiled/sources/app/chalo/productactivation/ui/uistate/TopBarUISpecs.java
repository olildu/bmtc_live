package app.chalo.productactivation.ui.uistate;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiArrangement;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/TopBarUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TopBarUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8080a = new ChaloPadding(ChaloThemeHelper.a().i, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h);
    public final UiAlignment.Vertical b = UiAlignment.Vertical.Center.f9888a;
    public final UiArrangement.HorizontalOrVertical c = UiArrangement.HorizontalOrVertical.SpaceBetween.f9892a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopBarUISpecs)) {
            return false;
        }
        TopBarUISpecs topBarUISpecs = (TopBarUISpecs) obj;
        return Intrinsics.d(this.f8080a, topBarUISpecs.f8080a) && Intrinsics.d(this.b, topBarUISpecs.b) && Intrinsics.d(this.c, topBarUISpecs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + uf0.e(this.b, this.f8080a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "TopBarUISpecs(topBarPadding=" + this.f8080a + ", verticalAlignment=" + this.b + ", horizontalArrangement=" + this.c + ")";
    }
}
