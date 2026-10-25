package app.chalo.livetracking.ui.routedetailsscreen;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.dialog.DialogDismissRequest;
import app.chalo.uistate.dialog.DialogUIEventHandler;
import defpackage.cb0;
import defpackage.py;
import defpackage.uf0;
import defpackage.wb;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/ReportProblemDialogSpecs;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ReportProblemDialogSpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DialogUIEventHandler f4818a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final ChaloColorToken f;
    public final ChaloPadding g;

    public ReportProblemDialogSpecs() {
        DialogUIEventHandler dialogUIEventHandler = new DialogUIEventHandler(false, false, DialogDismissRequest.Companion.a(new wb(8)));
        float f = ChaloThemeHelper.a().j;
        float f2 = ChaloThemeHelper.a().i;
        float f3 = ChaloThemeHelper.a().f;
        float f4 = ChaloThemeHelper.a().h;
        float f5 = ChaloThemeHelper.a().j;
        ChaloPadding chaloPadding = new ChaloPadding(f5, f5, f5, f5);
        this.f4818a = dialogUIEventHandler;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = ChaloColorToken.White.f9870a;
        this.g = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportProblemDialogSpecs)) {
            return false;
        }
        ReportProblemDialogSpecs reportProblemDialogSpecs = (ReportProblemDialogSpecs) obj;
        return Intrinsics.d(this.f4818a, reportProblemDialogSpecs.f4818a) && Dp.m7283equalsimpl0(this.b, reportProblemDialogSpecs.b) && Dp.m7283equalsimpl0(this.c, reportProblemDialogSpecs.c) && Dp.m7283equalsimpl0(this.d, reportProblemDialogSpecs.d) && Dp.m7283equalsimpl0(this.e, reportProblemDialogSpecs.e) && Intrinsics.d(this.f, reportProblemDialogSpecs.f) && Intrinsics.d(this.g, reportProblemDialogSpecs.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + z40.b(this.f, uf0.a(this.e, uf0.a(this.d, uf0.a(this.c, uf0.a(this.b, this.f4818a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.e);
        StringBuilder sb = new StringBuilder("ReportProblemDialogSpecs(dialogEventHandler=");
        sb.append(this.f4818a);
        sb.append(", spaceAfterTitle=");
        sb.append(strM7289toStringimpl);
        sb.append(", spaceAfterTagsList=");
        cb0.t(sb, strM7289toStringimpl2, ", spaceAfterSingleTag=", strM7289toStringimpl3, ", spaceAfterTextField=");
        sb.append(strM7289toStringimpl4);
        sb.append(", background=");
        sb.append(this.f);
        sb.append(", padding=");
        return py.e(sb, this.g, ")");
    }
}
