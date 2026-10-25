package app.chalo.home.ui.history.uistate.regularbusticket;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/regularbusticket/ProductBannerSpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductBannerSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3518a;
    public final UIShape b;
    public final ChaloColorToken c;
    public final float d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ProductBannerSpec(float f, int i, ChaloColorToken backgroundColor) {
        float f2 = ChaloThemeHelper.a().f;
        float f3 = ChaloThemeHelper.a().g;
        ChaloPadding chaloPadding = new ChaloPadding(f3, f2, f2, f3);
        UIShape.Rectangle shape = UIShape.d;
        f = (i & 8) != 0 ? ChaloThemeHelper.a().d : f;
        Intrinsics.i(shape, "shape");
        Intrinsics.i(backgroundColor, "backgroundColor");
        this.f3518a = chaloPadding;
        this.b = shape;
        this.c = backgroundColor;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductBannerSpec)) {
            return false;
        }
        ProductBannerSpec productBannerSpec = (ProductBannerSpec) obj;
        return Intrinsics.d(this.f3518a, productBannerSpec.f3518a) && Intrinsics.d(this.b, productBannerSpec.b) && Intrinsics.d(this.c, productBannerSpec.c) && Dp.m7283equalsimpl0(this.d, productBannerSpec.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + z40.b(this.c, pk0.b(this.b, this.f3518a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ProductBannerSpec(contentSpacing=" + this.f3518a + ", shape=" + this.b + ", backgroundColor=" + this.c + ", iconAndTextSpacing=" + Dp.m7289toStringimpl(this.d) + ")";
    }
}
