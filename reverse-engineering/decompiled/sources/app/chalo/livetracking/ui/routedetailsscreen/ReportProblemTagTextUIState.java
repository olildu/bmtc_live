package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.py;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/ReportProblemTagTextUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ReportProblemTagTextUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f4820a;
    public final UIShape b;
    public final BorderUISpec c;
    public final ChaloColorToken d;
    public final ChaloPadding e;

    public ReportProblemTagTextUIState(ChaloColorToken chaloColorToken, TextUIState.ChaloTextUIState chaloTextUIState) {
        float f = ChaloThemeHelper.a().i;
        UIShape.Rectangle rectangle = new UIShape.Rectangle(f, f, f, f);
        float f2 = ChaloThemeHelper.a().b;
        float f3 = ChaloThemeHelper.a().i;
        BorderUISpec borderUISpec = new BorderUISpec(f2, ChaloColorToken.Black_12.f9761a, new UIShape.Rectangle(f3, f3, f3, f3));
        float f4 = ChaloThemeHelper.a().h;
        float f5 = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f5, f4, f4, f5);
        this.f4820a = chaloTextUIState;
        this.b = rectangle;
        this.c = borderUISpec;
        this.d = chaloColorToken;
        this.e = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportProblemTagTextUIState)) {
            return false;
        }
        ReportProblemTagTextUIState reportProblemTagTextUIState = (ReportProblemTagTextUIState) obj;
        return Intrinsics.d(this.f4820a, reportProblemTagTextUIState.f4820a) && Intrinsics.d(this.b, reportProblemTagTextUIState.b) && Intrinsics.d(this.c, reportProblemTagTextUIState.c) && Intrinsics.d(this.d, reportProblemTagTextUIState.d) && Intrinsics.d(this.e, reportProblemTagTextUIState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + z40.b(this.d, (this.c.hashCode() + pk0.b(this.b, this.f4820a.hashCode() * 31, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportProblemTagTextUIState(tagText=");
        sb.append(this.f4820a);
        sb.append(", shape=");
        sb.append(this.b);
        sb.append(", border=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", padding=");
        return py.e(sb, this.e, ")");
    }
}
