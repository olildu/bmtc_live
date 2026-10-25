package app.chalo.premiumbus.ui.seatselection.compose.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.dd;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/compose/uistate/SeatChangeDialogTypeUISpecs;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SeatChangeDialogTypeUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7782a;
    public final float b;
    public final float c;
    public final float d;

    public SeatChangeDialogTypeUISpecs() {
        float f = ChaloThemeHelper.a().i;
        float f2 = ChaloThemeHelper.a().h;
        float f3 = ChaloThemeHelper.a().l;
        float f4 = ChaloThemeHelper.a().g;
        this.f7782a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeatChangeDialogTypeUISpecs)) {
            return false;
        }
        SeatChangeDialogTypeUISpecs seatChangeDialogTypeUISpecs = (SeatChangeDialogTypeUISpecs) obj;
        return Dp.m7283equalsimpl0(this.f7782a, seatChangeDialogTypeUISpecs.f7782a) && Dp.m7283equalsimpl0(this.b, seatChangeDialogTypeUISpecs.b) && Dp.m7283equalsimpl0(this.c, seatChangeDialogTypeUISpecs.c) && Dp.m7283equalsimpl0(this.d, seatChangeDialogTypeUISpecs.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + uf0.a(this.c, uf0.a(this.b, Dp.m7284hashCodeimpl(this.f7782a) * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f7782a);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.b);
        return r30.i(dd.e("SeatChangeDialogTypeUISpecs(closeIconSize=", strM7289toStringimpl, ", spaceBtwCloseBtnAndTitleText=", strM7289toStringimpl2, ", spaceBtwTitleTextAndPositiveBtn="), Dp.m7289toStringimpl(this.c), ", spaceBtwButtons=", Dp.m7289toStringimpl(this.d), ")");
    }
}
