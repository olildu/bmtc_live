package app.chalo.uistate.dialog;

import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.LocalDateTime;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/MultiSelectionCalendarDataState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MultiSelectionCalendarDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10011a;
    public final MultiSelectDatePickerConfig b;
    public final LocalDateTime c;
    public final LocalDateTime d;
    public final List e;

    public MultiSelectionCalendarDataState(List dates, MultiSelectDatePickerConfig multiSelectDatePickerConfig, LocalDateTime localDateTime, LocalDateTime localDateTime2, List legendItems) {
        Intrinsics.i(dates, "dates");
        Intrinsics.i(legendItems, "legendItems");
        this.f10011a = dates;
        this.b = multiSelectDatePickerConfig;
        this.c = localDateTime;
        this.d = localDateTime2;
        this.e = legendItems;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiSelectionCalendarDataState)) {
            return false;
        }
        MultiSelectionCalendarDataState multiSelectionCalendarDataState = (MultiSelectionCalendarDataState) obj;
        return Intrinsics.d(this.f10011a, multiSelectionCalendarDataState.f10011a) && Intrinsics.d(this.b, multiSelectionCalendarDataState.b) && Intrinsics.d(this.c, multiSelectionCalendarDataState.c) && Intrinsics.d(this.d, multiSelectionCalendarDataState.d) && Intrinsics.d(this.e, multiSelectionCalendarDataState.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f10011a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectionCalendarDataState(dates=");
        sb.append(this.f10011a);
        sb.append(", config=");
        sb.append(this.b);
        sb.append(", currentDateTime=");
        sb.append(this.c);
        sb.append(", dateMarkedAsCurrent=");
        sb.append(this.d);
        sb.append(", legendItems=");
        return xs.l(sb, this.e, ")");
    }
}
