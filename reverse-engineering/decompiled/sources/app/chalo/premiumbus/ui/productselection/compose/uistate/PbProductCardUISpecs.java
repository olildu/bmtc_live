package app.chalo.premiumbus.ui.productselection.compose.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.pk0;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/compose/uistate/PbProductCardUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PbProductCardUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7704a;
    public final UIShape b;
    public final float c;
    public final ChaloColorToken d;
    public final float e;
    public final float f;
    public final UIShape g;
    public final float h;

    public PbProductCardUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        UIShape.Rectangle cardShape = UIShape.e;
        float f2 = ChaloThemeHelper.a().d;
        float f3 = ChaloThemeHelper.a().d;
        float f4 = ChaloThemeHelper.a().h;
        UIShape.Rectangle productImageShape = UIShape.d;
        float f5 = ChaloThemeHelper.a().h;
        Intrinsics.i(cardShape, "cardShape");
        Intrinsics.i(productImageShape, "productImageShape");
        this.f7704a = chaloPadding;
        this.b = cardShape;
        this.c = f2;
        this.d = ChaloColorToken.White.f9870a;
        this.e = f3;
        this.f = f4;
        this.g = productImageShape;
        this.h = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PbProductCardUISpecs)) {
            return false;
        }
        PbProductCardUISpecs pbProductCardUISpecs = (PbProductCardUISpecs) obj;
        return Intrinsics.d(this.f7704a, pbProductCardUISpecs.f7704a) && Intrinsics.d(this.b, pbProductCardUISpecs.b) && Dp.m7283equalsimpl0(this.c, pbProductCardUISpecs.c) && Intrinsics.d(this.d, pbProductCardUISpecs.d) && Dp.m7283equalsimpl0(this.e, pbProductCardUISpecs.e) && Dp.m7283equalsimpl0(this.f, pbProductCardUISpecs.f) && Intrinsics.d(this.g, pbProductCardUISpecs.g) && Dp.m7283equalsimpl0(this.h, pbProductCardUISpecs.h);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.h) + pk0.b(this.g, uf0.a(this.f, uf0.a(this.e, z40.b(this.d, uf0.a(this.c, pk0.b(this.b, this.f7704a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.f);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.h);
        StringBuilder sb = new StringBuilder("PbProductCardUISpecs(contentPadding=");
        sb.append(this.f7704a);
        sb.append(", cardShape=");
        sb.append(this.b);
        sb.append(", elevation=");
        sb.append(strM7289toStringimpl);
        sb.append(", cardBackgroundColorToken=");
        sb.append(this.d);
        sb.append(", productNameAndDescSpacing=");
        cb0.t(sb, strM7289toStringimpl2, ", productInfoAndPriceDividerSpacing=", strM7289toStringimpl3, ", productImageShape=");
        sb.append(this.g);
        sb.append(", productImageSpacing=");
        sb.append(strM7289toStringimpl4);
        sb.append(")");
        return sb.toString();
    }
}
