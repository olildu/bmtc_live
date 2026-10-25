package app.chalo.livetracking.stoptripplannerresult.uistate;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import defpackage.dd;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/stoptripplannerresult/uistate/BusInfoCardSpecs;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BusInfoCardSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4571a;
    public final float b;
    public final UiAlignment.Vertical c;
    public final float d;

    public BusInfoCardSpecs() {
        float f = ChaloThemeHelper.a().c;
        float f2 = ChaloThemeHelper.a().d;
        float f3 = ChaloThemeHelper.a().f;
        this.f4571a = f;
        this.b = f2;
        this.c = UiAlignment.Vertical.Top.f9889a;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusInfoCardSpecs)) {
            return false;
        }
        BusInfoCardSpecs busInfoCardSpecs = (BusInfoCardSpecs) obj;
        return Dp.m7283equalsimpl0(this.f4571a, busInfoCardSpecs.f4571a) && Dp.m7283equalsimpl0(this.b, busInfoCardSpecs.b) && Intrinsics.d(this.c, busInfoCardSpecs.c) && Dp.m7283equalsimpl0(this.d, busInfoCardSpecs.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + uf0.e(this.c, uf0.a(this.b, Dp.m7284hashCodeimpl(this.f4571a) * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f4571a);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.d);
        StringBuilder sbE = dd.e("BusInfoCardSpecs(headerAndDescSpacing=", strM7289toStringimpl, ", headerAndSpfSpacing=", strM7289toStringimpl2, ", headerAlignment=");
        sbE.append(this.c);
        sbE.append(", viaAndBusNumberSpacing=");
        sbE.append(strM7289toStringimpl3);
        sbE.append(")");
        return sbE.toString();
    }
}
