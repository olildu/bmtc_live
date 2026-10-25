package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/TimeTableSectionHeaderUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TimeTableSectionHeaderUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.StyledTextUIState f4891a;
    public final TextUIState.StyledTextUIState b;
    public final boolean c;
    public final ChaloColorToken d;
    public final ChaloPadding e;

    public TimeTableSectionHeaderUIState(TextUIState.StyledTextUIState styledTextUIState, TextUIState.StyledTextUIState styledTextUIState2, boolean z) {
        float f = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        this.f4891a = styledTextUIState;
        this.b = styledTextUIState2;
        this.c = z;
        this.d = ChaloColorToken.GreyColor.f9806a;
        this.e = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeTableSectionHeaderUIState)) {
            return false;
        }
        TimeTableSectionHeaderUIState timeTableSectionHeaderUIState = (TimeTableSectionHeaderUIState) obj;
        return Intrinsics.d(this.f4891a, timeTableSectionHeaderUIState.f4891a) && Intrinsics.d(this.b, timeTableSectionHeaderUIState.b) && this.c == timeTableSectionHeaderUIState.c && Intrinsics.d(this.d, timeTableSectionHeaderUIState.d) && Intrinsics.d(this.e, timeTableSectionHeaderUIState.e);
    }

    public final int hashCode() {
        TextUIState.StyledTextUIState styledTextUIState = this.f4891a;
        int iHashCode = (styledTextUIState == null ? 0 : styledTextUIState.hashCode()) * 31;
        TextUIState.StyledTextUIState styledTextUIState2 = this.b;
        return this.e.hashCode() + z40.b(this.d, (((iHashCode + (styledTextUIState2 != null ? styledTextUIState2.hashCode() : 0)) * 31) + (this.c ? 1231 : 1237)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeTableSectionHeaderUIState(stopDetails=");
        sb.append(this.f4891a);
        sb.append(", scheduleDetails=");
        sb.append(this.b);
        sb.append(", isSticky=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", padding=");
        return py.e(sb, this.e, ")");
    }
}
