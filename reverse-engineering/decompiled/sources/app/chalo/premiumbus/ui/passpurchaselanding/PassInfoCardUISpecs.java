package app.chalo.premiumbus.ui.passpurchaselanding;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.divider.DividerUIState;
import defpackage.cb0;
import defpackage.gf;
import defpackage.py;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PassInfoCardUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassInfoCardUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7649a;
    public final DividerUIState b;
    public final float c;
    public final float d;
    public final float e;
    public final ChaloColorToken f;
    public final UIShape g;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public PassInfoCardUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().c, ChaloColorToken.LightGray.f9814a, null, 4);
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().f;
        float f4 = ChaloThemeHelper.a().h;
        UIShape.Rectangle backgroundShape = UIShape.d;
        Intrinsics.i(backgroundShape, "backgroundShape");
        this.f7649a = chaloPadding;
        this.b = dividerUIState;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = ChaloColorToken.VeryLightGrey.f9868a;
        this.g = backgroundShape;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassInfoCardUISpecs)) {
            return false;
        }
        PassInfoCardUISpecs passInfoCardUISpecs = (PassInfoCardUISpecs) obj;
        return Intrinsics.d(this.f7649a, passInfoCardUISpecs.f7649a) && Intrinsics.d(this.b, passInfoCardUISpecs.b) && Dp.m7283equalsimpl0(this.c, passInfoCardUISpecs.c) && Dp.m7283equalsimpl0(this.d, passInfoCardUISpecs.d) && Dp.m7283equalsimpl0(this.e, passInfoCardUISpecs.e) && Intrinsics.d(this.f, passInfoCardUISpecs.f) && Intrinsics.d(this.g, passInfoCardUISpecs.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + z40.b(this.f, uf0.a(this.e, uf0.a(this.d, uf0.a(this.c, py.c(this.b, this.f7649a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.e);
        StringBuilder sb = new StringBuilder("PassInfoCardUISpecs(contentPadding=");
        sb.append(this.f7649a);
        sb.append(", dividerUIState=");
        sb.append(this.b);
        sb.append(", textAndListSpace=");
        cb0.t(sb, strM7289toStringimpl, ", imageAndTextSpace=", strM7289toStringimpl2, ", spaceBetweenTextAndDivider=");
        sb.append(strM7289toStringimpl3);
        sb.append(", backgroundColorToken=");
        sb.append(this.f);
        sb.append(", backgroundShape=");
        return gf.j(sb, this.g, ")");
    }
}
