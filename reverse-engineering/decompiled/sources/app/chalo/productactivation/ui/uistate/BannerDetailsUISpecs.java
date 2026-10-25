package app.chalo.productactivation.ui.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/BannerDetailsUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BannerDetailsUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8066a;
    public final ChaloColorToken b;
    public final float c;

    public BannerDetailsUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f = ChaloThemeHelper.a().g;
        this.f8066a = chaloPadding;
        this.b = ChaloColorToken.CornSilk.f9778a;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerDetailsUISpecs)) {
            return false;
        }
        BannerDetailsUISpecs bannerDetailsUISpecs = (BannerDetailsUISpecs) obj;
        return Intrinsics.d(this.f8066a, bannerDetailsUISpecs.f8066a) && Intrinsics.d(this.b, bannerDetailsUISpecs.b) && Dp.m7283equalsimpl0(this.c, bannerDetailsUISpecs.c);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.c) + z40.b(this.b, this.f8066a.hashCode() * 31, 31);
    }

    public final String toString() {
        return vo1.p(gf.l(this.f8066a, this.b, "BannerDetailsUISpecs(contentPadding=", ", backgroundColor=", ", detailsContainerAndDividerSpacing="), Dp.m7289toStringimpl(this.c), ")");
    }
}
