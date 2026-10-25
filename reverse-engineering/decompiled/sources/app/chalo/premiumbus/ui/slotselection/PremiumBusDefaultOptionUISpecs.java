package app.chalo.premiumbus.ui.slotselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusDefaultOptionUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusDefaultOptionUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7842a;
    public final ChaloColorToken b;
    public final UIShape c;
    public final float d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public PremiumBusDefaultOptionUISpecs(ChaloColorToken chaloColorToken, int i) {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        chaloColorToken = (i & 2) != 0 ? ChaloColorToken.White.f9870a : chaloColorToken;
        UIShape cardShape = ChaloThemeHelper.d.g;
        float f2 = ChaloThemeHelper.a().f1916a;
        Intrinsics.i(cardShape, "cardShape");
        this.f7842a = chaloPadding;
        this.b = chaloColorToken;
        this.c = cardShape;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusDefaultOptionUISpecs)) {
            return false;
        }
        PremiumBusDefaultOptionUISpecs premiumBusDefaultOptionUISpecs = (PremiumBusDefaultOptionUISpecs) obj;
        return Intrinsics.d(this.f7842a, premiumBusDefaultOptionUISpecs.f7842a) && Intrinsics.d(this.b, premiumBusDefaultOptionUISpecs.b) && Intrinsics.d(this.c, premiumBusDefaultOptionUISpecs.c) && Dp.m7283equalsimpl0(this.d, premiumBusDefaultOptionUISpecs.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + pk0.b(this.c, z40.b(this.b, this.f7842a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        StringBuilder sbL = gf.l(this.f7842a, this.b, "PremiumBusDefaultOptionUISpecs(contentPadding=", ", cardBackgroundColor=", ", cardShape=");
        sbL.append(this.c);
        sbL.append(", cardElevation=");
        sbL.append(strM7289toStringimpl);
        sbL.append(")");
        return sbL.toString();
    }
}
