package app.chalo.premiumbus.ui.faredetails.contract;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.b3;
import defpackage.cb0;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PassUpsellOfferCardUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassUpsellOfferCardUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f7561a;
    public final UIShape b;
    public final float c;
    public final ChaloPadding d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;

    public PassUpsellOfferCardUISpecs(boolean z) {
        UIShape shape = ChaloThemeHelper.d.g;
        float f = ChaloThemeHelper.b().c;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f2, f2, f2, f2);
        float f3 = ChaloThemeHelper.a().g;
        float f4 = ChaloThemeHelper.a().e;
        float f5 = ChaloThemeHelper.a().h;
        float f6 = ChaloThemeHelper.a().h;
        Intrinsics.i(shape, "shape");
        this.f7561a = ChaloColorToken.White.f9870a;
        this.b = shape;
        this.c = f;
        this.d = chaloPadding;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassUpsellOfferCardUISpecs)) {
            return false;
        }
        PassUpsellOfferCardUISpecs passUpsellOfferCardUISpecs = (PassUpsellOfferCardUISpecs) obj;
        return Intrinsics.d(this.f7561a, passUpsellOfferCardUISpecs.f7561a) && Intrinsics.d(this.b, passUpsellOfferCardUISpecs.b) && Dp.m7283equalsimpl0(this.c, passUpsellOfferCardUISpecs.c) && Intrinsics.d(this.d, passUpsellOfferCardUISpecs.d) && Dp.m7283equalsimpl0(this.e, passUpsellOfferCardUISpecs.e) && Dp.m7283equalsimpl0(this.f, passUpsellOfferCardUISpecs.f) && Dp.m7283equalsimpl0(this.g, passUpsellOfferCardUISpecs.g) && Dp.m7283equalsimpl0(this.h, passUpsellOfferCardUISpecs.h) && this.i == passUpsellOfferCardUISpecs.i;
    }

    public final int hashCode() {
        return uf0.a(this.h, uf0.a(this.g, uf0.a(this.f, uf0.a(this.e, r30.c(this.d, uf0.a(this.c, pk0.b(this.b, this.f7561a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31) + (this.i ? 1231 : 1237);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.f);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.g);
        String strM7289toStringimpl5 = Dp.m7289toStringimpl(this.h);
        StringBuilder sb = new StringBuilder("PassUpsellOfferCardUISpecs(backgroundColor=");
        sb.append(this.f7561a);
        sb.append(", shape=");
        sb.append(this.b);
        sb.append(", elevation=");
        sb.append(strM7289toStringimpl);
        sb.append(", contentPadding=");
        sb.append(this.d);
        sb.append(", spaceBelowName=");
        cb0.t(sb, strM7289toStringimpl2, ", spaceBetweenFares=", strM7289toStringimpl3, ", spaceAroundImage=");
        cb0.t(sb, strM7289toStringimpl4, ", spaceAboveAction=", strM7289toStringimpl5, ", actionButtonFillsWidth=");
        return b3.g(")", sb, this.i);
    }
}
