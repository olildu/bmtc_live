package app.chalo.chalobususerprofile.ui.compose;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import defpackage.dd;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/WorkTimingUISpecs;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WorkTimingUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1239a;
    public final float b;
    public final float c;
    public final float d;

    public WorkTimingUISpecs() {
        float f = ChaloThemeHelper.a().d;
        float f2 = ChaloThemeHelper.a().d;
        float f3 = ChaloThemeHelper.a().h;
        float f4 = ChaloThemeHelper.a().k;
        this.f1239a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkTimingUISpecs)) {
            return false;
        }
        WorkTimingUISpecs workTimingUISpecs = (WorkTimingUISpecs) obj;
        return Dp.m7283equalsimpl0(this.f1239a, workTimingUISpecs.f1239a) && Dp.m7283equalsimpl0(this.b, workTimingUISpecs.b) && Dp.m7283equalsimpl0(this.c, workTimingUISpecs.c) && Dp.m7283equalsimpl0(this.d, workTimingUISpecs.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + uf0.a(this.c, uf0.a(this.b, Dp.m7284hashCodeimpl(this.f1239a) * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.f1239a);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.b);
        return r30.i(dd.e("WorkTimingUISpecs(spaceBtwStepsAndTitle=", strM7289toStringimpl, ", spaceBtwTitleAndSubTitle=", strM7289toStringimpl2, ", spaceBtwSubTitleAndOfficeReachByComponent="), Dp.m7289toStringimpl(this.c), ", spaceBtwOfficeReachByAndOfficeLeaveByComponent=", Dp.m7289toStringimpl(this.d), ")");
    }
}
