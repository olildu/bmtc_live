package app.chalo.uistate.components;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.pk0;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/ProductGridContainerSpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductGridContainerSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f9940a;
    public final int b;
    public final int c;
    public final float d;
    public final float e;

    public ProductGridContainerSpec(float f, int i, int i2, int i3) {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, 3);
        i = (i3 & 2) != 0 ? 2 : i;
        f = (i3 & 8) != 0 ? ChaloThemeHelper.a().h : f;
        float f2 = ChaloThemeHelper.a().h;
        this.f9940a = chaloPadding;
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductGridContainerSpec)) {
            return false;
        }
        ProductGridContainerSpec productGridContainerSpec = (ProductGridContainerSpec) obj;
        return Intrinsics.d(this.f9940a, productGridContainerSpec.f9940a) && this.b == productGridContainerSpec.b && this.c == productGridContainerSpec.c && Dp.m7283equalsimpl0(this.d, productGridContainerSpec.d) && Dp.m7283equalsimpl0(this.e, productGridContainerSpec.e);
    }

    public final int hashCode() {
        return ((Dp.m7284hashCodeimpl(this.e) + uf0.a(this.d, ((((this.f9940a.hashCode() * 31) + this.b) * 31) + this.c) * 31, 31)) * 31) + 1237;
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.e);
        StringBuilder sb = new StringBuilder("ProductGridContainerSpec(contentPadding=");
        sb.append(this.f9940a);
        sb.append(", itemsPerRow=");
        sb.append(this.b);
        sb.append(", itemCount=");
        pk0.t(this.c, ", itemHorizontalSpacing=", strM7289toStringimpl, ", itemVerticalSpacing=", sb);
        return vo1.p(sb, strM7289toStringimpl2, ", balancePartialLastRow=false)");
    }
}
