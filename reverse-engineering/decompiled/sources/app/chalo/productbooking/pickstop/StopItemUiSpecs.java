package app.chalo.productbooking.pickstop;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.cb0;
import defpackage.gf;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/pickstop/StopItemUiSpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopItemUiSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8311a;
    public final ChaloColorToken b;
    public final float c;
    public final float d;
    public final UiAlignment.Vertical e;
    public final float f;

    public StopItemUiSpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().c;
        float f4 = ChaloThemeHelper.a().h;
        this.f8311a = chaloPadding;
        this.b = ChaloColorToken.White.f9870a;
        this.c = f2;
        this.d = f3;
        this.e = UiAlignment.Vertical.Center.f9888a;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopItemUiSpecs)) {
            return false;
        }
        StopItemUiSpecs stopItemUiSpecs = (StopItemUiSpecs) obj;
        return Intrinsics.d(this.f8311a, stopItemUiSpecs.f8311a) && Intrinsics.d(this.b, stopItemUiSpecs.b) && Dp.m7283equalsimpl0(this.c, stopItemUiSpecs.c) && Dp.m7283equalsimpl0(this.d, stopItemUiSpecs.d) && Intrinsics.d(this.e, stopItemUiSpecs.e) && Dp.m7283equalsimpl0(this.f, stopItemUiSpecs.f);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f) + uf0.e(this.e, uf0.a(this.d, uf0.a(this.c, z40.b(this.b, this.f8311a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.f);
        StringBuilder sbL = gf.l(this.f8311a, this.b, "StopItemUiSpecs(padding=", ", backgroundColor=", ", imgAndContentSpacing=");
        cb0.t(sbL, strM7289toStringimpl, ", nameAndAddressSpacing=", strM7289toStringimpl2, ", verticalAlignment=");
        sbL.append(this.e);
        sbL.append(", trailingIconLeadingSpacing=");
        sbL.append(strM7289toStringimpl3);
        sbL.append(")");
        return sbL.toString();
    }
}
