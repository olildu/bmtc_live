package app.chalo.chalobususerprofile.ui.compose;

import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/TimePickerSelection;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TimePickerSelection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1237a;
    public final int b;
    public final String c;

    public TimePickerSelection(int i, int i2, String amPm) {
        Intrinsics.i(amPm, "amPm");
        this.f1237a = i;
        this.b = i2;
        this.c = amPm;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimePickerSelection)) {
            return false;
        }
        TimePickerSelection timePickerSelection = (TimePickerSelection) obj;
        return this.f1237a == timePickerSelection.f1237a && this.b == timePickerSelection.b && Intrinsics.d(this.c, timePickerSelection.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f1237a * 31) + this.b) * 31);
    }

    public final String toString() {
        return vo1.p(uf0.s(this.f1237a, this.b, "TimePickerSelection(hour12=", ", minute=", ", amPm="), this.c, ")");
    }
}
