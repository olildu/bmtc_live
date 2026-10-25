package app.chalo.premiumbus.ui.faredetails.contract;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.cb0;
import defpackage.pk0;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusPassengerDetailsUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusPassengerDetailsUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7627a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final ChaloColorToken g;

    public PremiumBusPassengerDetailsUISpecs() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f = ChaloThemeHelper.a().i;
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().f;
        float f4 = ChaloThemeHelper.a().f;
        float f5 = ChaloThemeHelper.a().f;
        this.f7627a = chaloPadding;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = ChaloColorToken.ActivityBackground.f9755a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusPassengerDetailsUISpecs)) {
            return false;
        }
        PremiumBusPassengerDetailsUISpecs premiumBusPassengerDetailsUISpecs = (PremiumBusPassengerDetailsUISpecs) obj;
        return Intrinsics.d(this.f7627a, premiumBusPassengerDetailsUISpecs.f7627a) && Dp.m7283equalsimpl0(this.b, premiumBusPassengerDetailsUISpecs.b) && Dp.m7283equalsimpl0(this.c, premiumBusPassengerDetailsUISpecs.c) && Dp.m7283equalsimpl0(this.d, premiumBusPassengerDetailsUISpecs.d) && Dp.m7283equalsimpl0(this.e, premiumBusPassengerDetailsUISpecs.e) && Dp.m7283equalsimpl0(this.f, premiumBusPassengerDetailsUISpecs.f) && Intrinsics.d(this.g, premiumBusPassengerDetailsUISpecs.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + uf0.a(this.f, uf0.a(this.e, uf0.a(this.d, uf0.a(this.c, uf0.a(this.b, this.f7627a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.e);
        String strM7289toStringimpl5 = Dp.m7289toStringimpl(this.f);
        StringBuilder sbN = t10.n("PremiumBusPassengerDetailsUISpecs(contentPadding=", this.f7627a, ", spaceAboveSection=", strM7289toStringimpl, ", spaceAboveRowSeparator=");
        cb0.t(sbN, strM7289toStringimpl2, ", spaceAfterRadioButton=", strM7289toStringimpl3, ", spaceAfterPayableFare=");
        cb0.t(sbN, strM7289toStringimpl4, ", sectionDividerHeight=", strM7289toStringimpl5, ", sectionDividerColor=");
        return pk0.j(sbN, this.g, ")");
    }
}
