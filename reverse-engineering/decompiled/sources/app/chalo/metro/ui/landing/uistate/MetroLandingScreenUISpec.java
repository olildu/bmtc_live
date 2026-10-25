package app.chalo.metro.ui.landing.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.homescreen.data.model.app.BgHighlightType;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.r30;
import defpackage.uf0;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/uistate/MetroLandingScreenUISpec;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MetroLandingScreenUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f5523a;
    public final BgHighlightType b;
    public final ChaloColorToken c;
    public final ChaloColorToken d;
    public final float e;
    public final ChaloPadding f;
    public final float g;

    public MetroLandingScreenUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, 3);
        BgHighlightType gradientBackgroundType = BgHighlightType.CIRCLE;
        float f = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f2 = ChaloThemeHelper.a().h;
        Intrinsics.i(gradientBackgroundType, "gradientBackgroundType");
        this.f5523a = chaloPadding;
        this.b = gradientBackgroundType;
        this.c = ChaloColorToken.Yellow.f9872a;
        this.d = ChaloColorToken.Transparent.f9864a;
        this.e = f;
        this.f = chaloPadding2;
        this.g = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetroLandingScreenUISpec)) {
            return false;
        }
        MetroLandingScreenUISpec metroLandingScreenUISpec = (MetroLandingScreenUISpec) obj;
        return Intrinsics.d(this.f5523a, metroLandingScreenUISpec.f5523a) && this.b == metroLandingScreenUISpec.b && Intrinsics.d(this.c, metroLandingScreenUISpec.c) && Intrinsics.d(this.d, metroLandingScreenUISpec.d) && Dp.m7283equalsimpl0(this.e, metroLandingScreenUISpec.e) && Intrinsics.d(this.f, metroLandingScreenUISpec.f) && Dp.m7283equalsimpl0(this.g, metroLandingScreenUISpec.g);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.g) + r30.c(this.f, uf0.a(this.e, z40.b(this.d, z40.b(this.c, (this.b.hashCode() + (this.f5523a.hashCode() * 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.g);
        StringBuilder sb = new StringBuilder("MetroLandingScreenUISpec(contentPadding=");
        sb.append(this.f5523a);
        sb.append(", gradientBackgroundType=");
        sb.append(this.b);
        sb.append(", gradientFromColor=");
        sb.append(this.c);
        sb.append(", gradientToColor=");
        sb.append(this.d);
        sb.append(", toolBarAndStopDetailsSpacing=");
        sb.append(strM7289toStringimpl);
        sb.append(", metroFromToSelectionContainerPadding=");
        sb.append(this.f);
        sb.append(", fromToStopSelectionContainerAndRecentListSpacing=");
        return vo1.p(sb, strM7289toStringimpl2, ")");
    }
}
