package app.chalo.premiumbus.ui.productselection.compose.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/compose/uistate/PremiumBusProductSelectionSpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusProductSelectionSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7706a;
    public final ChaloPadding b;
    public final float c;
    public final float d;
    public final ChaloColorToken e;

    public PremiumBusProductSelectionSpecs() {
        float f = ChaloThemeHelper.a().i;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f2, f2, f2);
        float f3 = ChaloThemeHelper.a().h;
        float f4 = ChaloThemeHelper.a().h;
        this.f7706a = f;
        this.b = chaloPadding;
        this.c = f3;
        this.d = f4;
        this.e = ChaloColorToken.White.f9870a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusProductSelectionSpecs)) {
            return false;
        }
        PremiumBusProductSelectionSpecs premiumBusProductSelectionSpecs = (PremiumBusProductSelectionSpecs) obj;
        return Dp.m7283equalsimpl0(this.f7706a, premiumBusProductSelectionSpecs.f7706a) && Intrinsics.d(this.b, premiumBusProductSelectionSpecs.b) && Dp.m7283equalsimpl0(this.c, premiumBusProductSelectionSpecs.c) && Dp.m7283equalsimpl0(this.d, premiumBusProductSelectionSpecs.d) && Intrinsics.d(this.e, premiumBusProductSelectionSpecs.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + uf0.a(this.d, uf0.a(this.c, r30.c(this.b, Dp.m7284hashCodeimpl(this.f7706a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f7706a);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.d);
        StringBuilder sb = new StringBuilder("PremiumBusProductSelectionSpecs(toolBarAndHeaderUiSpacing=");
        sb.append(strM7289toStringimpl);
        sb.append(", contentPadding=");
        sb.append(this.b);
        sb.append(", productCardSpacing=");
        cb0.t(sb, strM7289toStringimpl2, ", pbProductLoadingShimmerSpacing=", strM7289toStringimpl3, ", backgroundColorToken=");
        return pk0.j(sb, this.e, ")");
    }
}
