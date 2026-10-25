package app.chalo.productpurchase.productselection.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.card.CardUISpec;
import defpackage.py;
import defpackage.r30;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionSkeletonLoadingUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductSelectionSkeletonLoadingUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8696a;
    public final float b;
    public final ChaloPadding c;
    public final float d;
    public final CardUISpec e;
    public final ChaloPadding f;

    public ProductSelectionSkeletonLoadingUISpec() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, 0.0f, 0.0f, Dp.m7278constructorimpl(ChaloThemeHelper.a().h + ChaloThemeHelper.a().d), 7);
        float f3 = ChaloThemeHelper.a().i;
        float f4 = ChaloThemeHelper.a().d;
        CardUISpec cardUISpec = new CardUISpec(new UIShape.Rectangle(f4, f4, f4, f4), ChaloThemeHelper.b().c, 0.0f, 4);
        ChaloPadding chaloPadding3 = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, 0.0f, Dp.m7278constructorimpl(ChaloThemeHelper.a().h + ChaloThemeHelper.a().d), 5);
        this.f8696a = chaloPadding;
        this.b = f2;
        this.c = chaloPadding2;
        this.d = f3;
        this.e = cardUISpec;
        this.f = chaloPadding3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSelectionSkeletonLoadingUISpec)) {
            return false;
        }
        ProductSelectionSkeletonLoadingUISpec productSelectionSkeletonLoadingUISpec = (ProductSelectionSkeletonLoadingUISpec) obj;
        return Intrinsics.d(this.f8696a, productSelectionSkeletonLoadingUISpec.f8696a) && Dp.m7283equalsimpl0(this.b, productSelectionSkeletonLoadingUISpec.b) && Intrinsics.d(this.c, productSelectionSkeletonLoadingUISpec.c) && Dp.m7283equalsimpl0(this.d, productSelectionSkeletonLoadingUISpec.d) && Intrinsics.d(this.e, productSelectionSkeletonLoadingUISpec.e) && Intrinsics.d(this.f, productSelectionSkeletonLoadingUISpec.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + uf0.a(this.d, r30.c(this.c, uf0.a(this.b, this.f8696a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        StringBuilder sbN = t10.n("ProductSelectionSkeletonLoadingUISpec(internalPadding=", this.f8696a, ", spaceAfterTitle=", strM7289toStringimpl, ", paddingAround=");
        py.u(sbN, this.c, ", spaceAfterScreenTitle=", strM7289toStringimpl2, ", cardSpec=");
        sbN.append(this.e);
        sbN.append(", cardInternalPadding=");
        sbN.append(this.f);
        sbN.append(")");
        return sbN.toString();
    }
}
