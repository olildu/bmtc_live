package app.chalo.uistate.dialog;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/CalendarMonthUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CalendarMonthUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f9970a;
    public final ChaloPadding b;
    public final ArrayList c;

    public CalendarMonthUIState(TextUIState.ChaloTextUIState chaloTextUIState, ArrayList arrayList) {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().g, 1);
        this.f9970a = chaloTextUIState;
        this.b = chaloPadding;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarMonthUIState)) {
            return false;
        }
        CalendarMonthUIState calendarMonthUIState = (CalendarMonthUIState) obj;
        return Intrinsics.d(this.f9970a, calendarMonthUIState.f9970a) && Intrinsics.d(this.b, calendarMonthUIState.b) && Intrinsics.d(this.c, calendarMonthUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.c(this.b, this.f9970a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CalendarMonthUIState(monthUIState=" + this.f9970a + ", monthTextPadding=" + this.b + ", weeks=" + this.c + ")";
    }
}
