package app.chalo.premiumbus.ui.slotselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.pk0;
import defpackage.uf0;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPassOptionUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusPassOptionUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7847a;
    public final ChaloColorToken b;
    public final UIShape c;
    public final float d;
    public final float e;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public PremiumBusPassOptionUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        UIShape cardShape = ChaloThemeHelper.d.g;
        float f2 = ChaloThemeHelper.a().d;
        float f3 = ChaloThemeHelper.a().g;
        Intrinsics.i(cardShape, "cardShape");
        this.f7847a = chaloPadding;
        this.b = ChaloColorToken.White.f9870a;
        this.c = cardShape;
        this.d = f2;
        this.e = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusPassOptionUISpecs)) {
            return false;
        }
        PremiumBusPassOptionUISpecs premiumBusPassOptionUISpecs = (PremiumBusPassOptionUISpecs) obj;
        return Intrinsics.d(this.f7847a, premiumBusPassOptionUISpecs.f7847a) && Intrinsics.d(this.b, premiumBusPassOptionUISpecs.b) && Intrinsics.d(this.c, premiumBusPassOptionUISpecs.c) && Dp.m7283equalsimpl0(this.d, premiumBusPassOptionUISpecs.d) && Dp.m7283equalsimpl0(this.e, premiumBusPassOptionUISpecs.e);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.e) + uf0.a(this.d, pk0.b(this.c, z40.b(this.b, this.f7847a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.e);
        StringBuilder sbL = gf.l(this.f7847a, this.b, "PremiumBusPassOptionUISpecs(contentPadding=", ", cardBackgroundColor=", ", cardShape=");
        sbL.append(this.c);
        sbL.append(", spaceBtwTitleAndSubtitle=");
        sbL.append(strM7289toStringimpl);
        sbL.append(", spaceBtwSubtitleAndAdditionalInfo=");
        return vo1.p(sbL, strM7289toStringimpl2, ")");
    }
}
