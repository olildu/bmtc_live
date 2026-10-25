package app.chalo.productpurchase.productselection.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.card.CardUISpec;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductItemUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductItemUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardUISpec f8667a;
    public final ChaloPadding b;
    public final UIShape c;
    public final ChaloColorToken d;
    public final ChaloPadding e;
    public final float f;
    public final ChaloPadding g;
    public final ChaloPadding h;

    public ProductItemUISpec(ChaloPadding chaloPadding) {
        float f = ChaloThemeHelper.a().d;
        CardUISpec cardUISpec = new CardUISpec(new UIShape.Rectangle(f, f, f, f), ChaloThemeHelper.b().c, 0.0f, 4);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().b, ChaloThemeHelper.a().f, ChaloThemeHelper.a().f, ChaloThemeHelper.a().b);
        UIShape.Rectangle rectangle = new UIShape.Rectangle(0.0f, 3);
        float f2 = ChaloThemeHelper.a().e;
        ChaloPadding chaloPadding3 = new ChaloPadding(ChaloThemeHelper.a().f, 0.0f, ChaloThemeHelper.a().h, 0.0f, 10);
        ChaloPadding chaloPadding4 = new ChaloPadding(ChaloThemeHelper.a().g, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h, 0.0f, 8);
        this.f8667a = cardUISpec;
        this.b = chaloPadding2;
        this.c = rectangle;
        this.d = ChaloColorToken.OrangePrimary.f9835a;
        this.e = chaloPadding;
        this.f = f2;
        this.g = chaloPadding3;
        this.h = chaloPadding4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductItemUISpec)) {
            return false;
        }
        ProductItemUISpec productItemUISpec = (ProductItemUISpec) obj;
        return Intrinsics.d(this.f8667a, productItemUISpec.f8667a) && Intrinsics.d(this.b, productItemUISpec.b) && Intrinsics.d(this.c, productItemUISpec.c) && Intrinsics.d(this.d, productItemUISpec.d) && Intrinsics.d(this.e, productItemUISpec.e) && Dp.m7283equalsimpl0(this.f, productItemUISpec.f) && Intrinsics.d(this.g, productItemUISpec.g) && Intrinsics.d(this.h, productItemUISpec.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + r30.c(this.g, uf0.a(this.f, r30.c(this.e, z40.b(this.d, pk0.b(this.c, r30.c(this.b, this.f8667a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f);
        StringBuilder sb = new StringBuilder("ProductItemUISpec(cardUISpec=");
        sb.append(this.f8667a);
        sb.append(", labelPadding=");
        sb.append(this.b);
        sb.append(", labelShape=");
        sb.append(this.c);
        sb.append(", labelBackground=");
        sb.append(this.d);
        sb.append(", spaceAroundContent=");
        py.u(sb, this.e, ", spaceBetweenDetails=", strM7289toStringimpl, ", spaceAroundLogo=");
        sb.append(this.g);
        sb.append(", paddingAroundServiceTypeLogo=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
