package app.chalo.productactivation.ui.uistate;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.pk0;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/uistate/DiscountBannerUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DiscountBannerUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8068a;
    public final ChaloPadding b;
    public final ChaloColorToken c;
    public final ChaloColorToken d;
    public final UIShape e;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public DiscountBannerUISpecs() {
        float f = ChaloThemeHelper.a().g;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f2, f2, f);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().g, ChaloThemeHelper.a().g, 0.0f, 8);
        UIShape.Rectangle shape = UIShape.e;
        Intrinsics.i(shape, "shape");
        this.f8068a = chaloPadding;
        this.b = chaloPadding2;
        this.c = ChaloColorToken.LightYellow.f9820a;
        this.d = ChaloColorToken.DiscountPercentBgGreen.f9791a;
        this.e = shape;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscountBannerUISpecs)) {
            return false;
        }
        DiscountBannerUISpecs discountBannerUISpecs = (DiscountBannerUISpecs) obj;
        return Intrinsics.d(this.f8068a, discountBannerUISpecs.f8068a) && Intrinsics.d(this.b, discountBannerUISpecs.b) && Intrinsics.d(this.c, discountBannerUISpecs.c) && Intrinsics.d(this.d, discountBannerUISpecs.d) && Intrinsics.d(this.e, discountBannerUISpecs.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + z40.b(this.d, z40.b(this.c, r30.c(this.b, this.f8068a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM = pk0.m("DiscountBannerUISpecs(contentPadding=", this.f8068a, ", outerPadding=", this.b, ", backgroundStartColor=");
        sbM.append(this.c);
        sbM.append(", backgroundEndColor=");
        sbM.append(this.d);
        sbM.append(", shape=");
        return gf.j(sbM, this.e, ")");
    }
}
