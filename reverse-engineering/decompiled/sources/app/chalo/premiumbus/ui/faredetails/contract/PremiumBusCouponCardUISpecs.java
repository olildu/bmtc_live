package app.chalo.premiumbus.ui.faredetails.contract;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.r30;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusCouponCardUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusCouponCardUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f7563a;
    public final ChaloColorToken b;
    public final UIShape c;
    public final ChaloPadding d;
    public final float e;

    public PremiumBusCouponCardUISpecs() {
        UIShape shape = ChaloThemeHelper.d.g;
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, ChaloThemeHelper.a().f, ChaloThemeHelper.a().h, ChaloThemeHelper.a().h);
        float f = ChaloThemeHelper.a().f;
        Intrinsics.i(shape, "shape");
        this.f7563a = ChaloColorToken.CardLinearLight.f9776a;
        this.b = ChaloColorToken.CardLinearDark.f9775a;
        this.c = shape;
        this.d = chaloPadding;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusCouponCardUISpecs)) {
            return false;
        }
        PremiumBusCouponCardUISpecs premiumBusCouponCardUISpecs = (PremiumBusCouponCardUISpecs) obj;
        return Intrinsics.d(this.f7563a, premiumBusCouponCardUISpecs.f7563a) && Intrinsics.d(this.b, premiumBusCouponCardUISpecs.b) && Intrinsics.d(this.c, premiumBusCouponCardUISpecs.c) && Intrinsics.d(this.d, premiumBusCouponCardUISpecs.d) && Dp.m7283equalsimpl0(this.e, premiumBusCouponCardUISpecs.e);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.e) + r30.c(this.d, pk0.b(this.c, z40.b(this.b, this.f7563a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.e);
        StringBuilder sb = new StringBuilder("PremiumBusCouponCardUISpecs(gradientStartColor=");
        sb.append(this.f7563a);
        sb.append(", gradientEndColor=");
        sb.append(this.b);
        sb.append(", shape=");
        sb.append(this.c);
        sb.append(", contentPadding=");
        sb.append(this.d);
        sb.append(", spaceAfterOfferIcon=");
        return vo1.p(sb, strM7289toStringimpl, ")");
    }
}
