package app.chalo.home.ui.history.uistate.chalobusticket;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.r30;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/chalobusticket/ChaloBusScheduleSpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusScheduleSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f3500a;
    public final float b;
    public final float c;
    public final float d;

    public ChaloBusScheduleSpec() {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, 3);
        float f = ChaloThemeHelper.a().f;
        float f2 = ChaloThemeHelper.a().f;
        float f3 = ChaloThemeHelper.a().d;
        this.f3500a = chaloPadding;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusScheduleSpec)) {
            return false;
        }
        ChaloBusScheduleSpec chaloBusScheduleSpec = (ChaloBusScheduleSpec) obj;
        return Intrinsics.d(this.f3500a, chaloBusScheduleSpec.f3500a) && Dp.m7283equalsimpl0(this.b, chaloBusScheduleSpec.b) && Dp.m7283equalsimpl0(this.c, chaloBusScheduleSpec.c) && Dp.m7283equalsimpl0(this.d, chaloBusScheduleSpec.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + uf0.a(this.c, uf0.a(this.b, this.f3500a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        return r30.i(t10.n("ChaloBusScheduleSpec(contentSpacing=", this.f3500a, ", titleAndTimeSpacing=", strM7289toStringimpl, ", originalScheduleTimeTopSpacing="), Dp.m7289toStringimpl(this.c), ", scheduleAlertTextTopSpacing=", Dp.m7289toStringimpl(this.d), ")");
    }
}
