package app.chalo.livetracking.ui.routedetailsscreen;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.text.TextUIState;
import defpackage.n21;
import defpackage.r30;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/ReportProblemCtaUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ReportProblemCtaUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f4817a;
    public final TextUIState.ChaloTextUIState b;
    public final float c;

    public ReportProblemCtaUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        float f = ChaloThemeHelper.a().k;
        this.f4817a = chaloTextUIState;
        this.b = chaloTextUIState2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportProblemCtaUIState)) {
            return false;
        }
        ReportProblemCtaUIState reportProblemCtaUIState = (ReportProblemCtaUIState) obj;
        return Intrinsics.d(this.f4817a, reportProblemCtaUIState.f4817a) && Intrinsics.d(this.b, reportProblemCtaUIState.b) && Dp.m7283equalsimpl0(this.c, reportProblemCtaUIState.c);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.c) + r30.f(this.b, this.f4817a.hashCode() * 31, 31);
    }

    public final String toString() {
        return vo1.p(n21.j("ReportProblemCtaUIState(cancel=", this.f4817a, ", submit=", this.b, ", spaceBetween="), Dp.m7289toStringimpl(this.c), ")");
    }
}
