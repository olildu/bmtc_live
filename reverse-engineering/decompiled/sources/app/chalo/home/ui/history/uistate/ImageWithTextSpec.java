package app.chalo.home.ui.history.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import defpackage.gf;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/ImageWithTextSpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ImageWithTextSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3471a;
    public final float b;
    public final UIShape c;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ImageWithTextSpec(ChaloPadding chaloPadding, int i) {
        if ((i & 1) != 0) {
            float f = ChaloThemeHelper.a().h;
            chaloPadding = new ChaloPadding(f, f, f, f);
        }
        float f2 = ChaloThemeHelper.a().g;
        UIShape.Rectangle shape = UIShape.d;
        Intrinsics.i(shape, "shape");
        this.f3471a = chaloPadding;
        this.b = f2;
        this.c = shape;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageWithTextSpec)) {
            return false;
        }
        ImageWithTextSpec imageWithTextSpec = (ImageWithTextSpec) obj;
        return Intrinsics.d(this.f3471a, imageWithTextSpec.f3471a) && Dp.m7283equalsimpl0(this.b, imageWithTextSpec.b) && Intrinsics.d(this.c, imageWithTextSpec.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + uf0.a(this.b, this.f3471a.hashCode() * 31, 31);
    }

    public final String toString() {
        return gf.j(t10.n("ImageWithTextSpec(contentPadding=", this.f3471a, ", imageAndTextSpacing=", Dp.m7289toStringimpl(this.b), ", shape="), this.c, ")");
    }
}
