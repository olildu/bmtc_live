package app.chalo.uistate.dialog;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/WeekDayHeaderUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WeekDayHeaderUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10015a;
    public final ChaloPadding b;

    public WeekDayHeaderUIState(ArrayList arrayList) {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        this.f10015a = arrayList;
        this.b = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeekDayHeaderUIState)) {
            return false;
        }
        WeekDayHeaderUIState weekDayHeaderUIState = (WeekDayHeaderUIState) obj;
        return Intrinsics.d(this.f10015a, weekDayHeaderUIState.f10015a) && Intrinsics.d(this.b, weekDayHeaderUIState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10015a.hashCode() * 31);
    }

    public final String toString() {
        return "WeekDayHeaderUIState(weekDays=" + this.f10015a + ", weekDayHeaderContentPadding=" + this.b + ")";
    }
}
