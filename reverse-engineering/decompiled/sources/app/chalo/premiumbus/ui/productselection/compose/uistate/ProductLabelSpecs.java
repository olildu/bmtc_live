package app.chalo.premiumbus.ui.productselection.compose.uistate;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/compose/uistate/ProductLabelSpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductLabelSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7711a;
    public final ChaloColorToken b;
    public final UIShape c;

    public ProductLabelSpecs(ChaloPadding chaloPadding, UIShape labelShape, int i) {
        if ((i & 1) != 0) {
            chaloPadding = new ChaloPadding(ChaloThemeHelper.a().b, ChaloThemeHelper.a().g, ChaloThemeHelper.a().g, ChaloThemeHelper.a().b);
        }
        ChaloColorToken chaloColorToken = (i & 2) != 0 ? ChaloColorToken.LightOrangeSpf.f9817a : ChaloColorToken.Green.f9799a;
        labelShape = (i & 4) != 0 ? UIShape.f1926a : labelShape;
        Intrinsics.i(labelShape, "labelShape");
        this.f7711a = chaloPadding;
        this.b = chaloColorToken;
        this.c = labelShape;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductLabelSpecs)) {
            return false;
        }
        ProductLabelSpecs productLabelSpecs = (ProductLabelSpecs) obj;
        return Intrinsics.d(this.f7711a, productLabelSpecs.f7711a) && Intrinsics.d(this.b, productLabelSpecs.b) && Intrinsics.d(this.c, productLabelSpecs.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z40.b(this.b, this.f7711a.hashCode() * 31, 31);
    }

    public final String toString() {
        return gf.j(gf.l(this.f7711a, this.b, "ProductLabelSpecs(labelContainerPadding=", ", labelContainerColor=", ", labelShape="), this.c, ")");
    }
}
