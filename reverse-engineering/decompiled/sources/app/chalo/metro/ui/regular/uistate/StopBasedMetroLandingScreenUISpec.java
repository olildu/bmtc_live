package app.chalo.metro.ui.regular.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.homescreen.data.model.app.BgHighlightType;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/regular/uistate/StopBasedMetroLandingScreenUISpec;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopBasedMetroLandingScreenUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5552a;
    public final BgHighlightType b;
    public final ChaloColorToken c;
    public final ChaloColorToken d;
    public final float e;
    public final ChaloPadding f;
    public final float g;
    public final ChaloPadding h;

    public StopBasedMetroLandingScreenUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, 3);
        BgHighlightType gradientBackgroundType = BgHighlightType.CIRCLE;
        float f = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().p, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h);
        Intrinsics.i(gradientBackgroundType, "gradientBackgroundType");
        this.f5552a = chaloPadding;
        this.b = gradientBackgroundType;
        this.c = ChaloColorToken.Yellow.f9872a;
        this.d = ChaloColorToken.Transparent.f9864a;
        this.e = f;
        this.f = chaloPadding2;
        this.g = f2;
        this.h = chaloPadding3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopBasedMetroLandingScreenUISpec)) {
            return false;
        }
        StopBasedMetroLandingScreenUISpec stopBasedMetroLandingScreenUISpec = (StopBasedMetroLandingScreenUISpec) obj;
        return Intrinsics.d(this.f5552a, stopBasedMetroLandingScreenUISpec.f5552a) && this.b == stopBasedMetroLandingScreenUISpec.b && Intrinsics.d(this.c, stopBasedMetroLandingScreenUISpec.c) && Intrinsics.d(this.d, stopBasedMetroLandingScreenUISpec.d) && Dp.m7283equalsimpl0(this.e, stopBasedMetroLandingScreenUISpec.e) && Intrinsics.d(this.f, stopBasedMetroLandingScreenUISpec.f) && Dp.m7283equalsimpl0(this.g, stopBasedMetroLandingScreenUISpec.g) && Intrinsics.d(this.h, stopBasedMetroLandingScreenUISpec.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + uf0.a(this.g, r30.c(this.f, uf0.a(this.e, z40.b(this.d, z40.b(this.c, (this.b.hashCode() + (this.f5552a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "StopBasedMetroLandingScreenUISpec(contentPadding=" + this.f5552a + ", gradientBackgroundType=" + this.b + ", gradientFromColor=" + this.c + ", gradientToColor=" + this.d + ", toolBarAndStopDetailsSpacing=" + Dp.m7289toStringimpl(this.e) + ", metroFromToSelectionContainerPadding=" + this.f + ", fromToStopSelectionContainerAndRecentListSpacing=" + Dp.m7289toStringimpl(this.g) + ", bottomInfoTextPadding=" + this.h + ")";
    }
}
