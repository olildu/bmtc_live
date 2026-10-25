package app.chalo.premiumbus.ui.slotselection;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.gf;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusPurchaseOptionUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusPurchaseOptionUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7849a;
    public final ChaloColorToken b;
    public final float c;
    public final float d;

    public PremiumBusPurchaseOptionUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().h;
        this.f7849a = chaloPadding;
        this.b = ChaloColorToken.White.f9870a;
        this.c = f2;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusPurchaseOptionUISpecs)) {
            return false;
        }
        PremiumBusPurchaseOptionUISpecs premiumBusPurchaseOptionUISpecs = (PremiumBusPurchaseOptionUISpecs) obj;
        return Intrinsics.d(this.f7849a, premiumBusPurchaseOptionUISpecs.f7849a) && Intrinsics.d(this.b, premiumBusPurchaseOptionUISpecs.b) && Dp.m7283equalsimpl0(this.c, premiumBusPurchaseOptionUISpecs.c) && Dp.m7283equalsimpl0(this.d, premiumBusPurchaseOptionUISpecs.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + uf0.a(this.c, z40.b(this.b, this.f7849a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return r30.i(gf.l(this.f7849a, this.b, "PremiumBusPurchaseOptionUISpecs(contentPadding=", ", backgroundColorToken=", ", spaceBtwTitleAndSlotOptionsCard="), Dp.m7289toStringimpl(this.c), ", spaceBtwSlotOptionCardsAndDefaultOptionBtn=", Dp.m7289toStringimpl(this.d), ")");
    }
}
