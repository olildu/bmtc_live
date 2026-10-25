package app.chalo.uistate.dialog;

import androidx.compose.material3.DatePickerDefaults;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/DatePickerContract;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DatePickerContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f9977a;
    public final IntRange b;
    public final DatePickerSelectableDates c;

    public DatePickerContract(Long l, DatePickerUIStateFactory$selectableDateFromRange$1 datePickerUIStateFactory$selectableDateFromRange$1, int i) {
        l = (i & 1) != 0 ? null : l;
        IntRange yearRange = DatePickerDefaults.INSTANCE.getYearRange();
        DatePickerSelectableDates datePickerSelectableDates = datePickerUIStateFactory$selectableDateFromRange$1;
        datePickerSelectableDates = (i & 4) != 0 ? (DatePickerSelectableDates) DatePickerUIStateFactory.d.getValue() : datePickerSelectableDates;
        Intrinsics.i(yearRange, "yearRange");
        Intrinsics.i(datePickerSelectableDates, "datePickerSelectableDates");
        this.f9977a = l;
        this.b = yearRange;
        this.c = datePickerSelectableDates;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatePickerContract)) {
            return false;
        }
        DatePickerContract datePickerContract = (DatePickerContract) obj;
        return Intrinsics.d(this.f9977a, datePickerContract.f9977a) && Intrinsics.d(this.b, datePickerContract.b) && Intrinsics.d(this.c, datePickerContract.c);
    }

    public final int hashCode() {
        Long l = this.f9977a;
        return this.c.hashCode() + ((this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "DatePickerContract(initialSelectedDateMillis=" + this.f9977a + ", yearRange=" + this.b + ", datePickerSelectableDates=" + this.c + ")";
    }
}
