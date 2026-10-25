package app.chalo.livetracking.ui.routedetailsscreen;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.dd;
import defpackage.r30;
import defpackage.uf0;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/TimeTableSectionUISpec;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TimeTableSectionUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4892a;
    public final float b;
    public final ChaloColorToken c;
    public final ChaloPadding d;
    public final float e;

    public TimeTableSectionUISpec() {
        float f = ChaloThemeHelper.a().h;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        float f3 = ChaloThemeHelper.a().j;
        this.f4892a = f;
        this.b = f2;
        this.c = ChaloColorToken.White.f9870a;
        this.d = chaloPadding;
        this.e = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeTableSectionUISpec)) {
            return false;
        }
        TimeTableSectionUISpec timeTableSectionUISpec = (TimeTableSectionUISpec) obj;
        return Dp.m7283equalsimpl0(this.f4892a, timeTableSectionUISpec.f4892a) && Dp.m7283equalsimpl0(this.b, timeTableSectionUISpec.b) && Intrinsics.d(this.c, timeTableSectionUISpec.c) && Intrinsics.d(this.d, timeTableSectionUISpec.d) && Dp.m7283equalsimpl0(this.e, timeTableSectionUISpec.e);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.e) + r30.c(this.d, z40.b(this.c, uf0.a(this.b, Dp.m7284hashCodeimpl(this.f4892a) * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f4892a);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.e);
        StringBuilder sbE = dd.e("TimeTableSectionUISpec(spaceBetweenHeaderAndList=", strM7289toStringimpl, ", spaceAfterSection=", strM7289toStringimpl2, ", slotsBackgroundColor=");
        sbE.append(this.c);
        sbE.append(", slotsPadding=");
        sbE.append(this.d);
        sbE.append(", spaceAfterListItem=");
        return vo1.p(sbE, strM7289toStringimpl3, ")");
    }
}
