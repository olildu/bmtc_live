package app.chalo.premiumbus.ui.seatselection.compose.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.image.UISize;
import defpackage.gf;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/SeatChangeSuccessScreenUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SeatChangeSuccessScreenUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f7783a;
    public final ChaloColorToken b;
    public final UISize c;
    public final float d;

    public SeatChangeSuccessScreenUISpecs() {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        UISize uISize = new UISize(ChaloThemeHelper.a().b0);
        float f2 = ChaloThemeHelper.a().n;
        this.f7783a = chaloPadding;
        this.b = ChaloColorToken.White.f9870a;
        this.c = uISize;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeatChangeSuccessScreenUISpecs)) {
            return false;
        }
        SeatChangeSuccessScreenUISpecs seatChangeSuccessScreenUISpecs = (SeatChangeSuccessScreenUISpecs) obj;
        return Intrinsics.d(this.f7783a, seatChangeSuccessScreenUISpecs.f7783a) && Intrinsics.d(this.b, seatChangeSuccessScreenUISpecs.b) && Intrinsics.d(this.c, seatChangeSuccessScreenUISpecs.c) && Dp.m7283equalsimpl0(this.d, seatChangeSuccessScreenUISpecs.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + ((this.c.hashCode() + z40.b(this.b, this.f7783a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        StringBuilder sbL = gf.l(this.f7783a, this.b, "SeatChangeSuccessScreenUISpecs(contentPadding=", ", backgroundColor=", ", lottieSize=");
        sbL.append(this.c);
        sbL.append(", buttonHeight=");
        sbL.append(strM7289toStringimpl);
        sbL.append(")");
        return sbL.toString();
    }
}
