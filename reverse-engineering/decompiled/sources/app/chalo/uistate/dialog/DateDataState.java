package app.chalo.uistate.dialog;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.LocalDateTime;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/DateDataState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DateDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f9976a;
    public final boolean b;
    public final DateAvailabilityStatus c;
    public final boolean d;

    public DateDataState(LocalDateTime dateTime, boolean z, DateAvailabilityStatus availabilityStatus, boolean z2) {
        Intrinsics.i(dateTime, "dateTime");
        Intrinsics.i(availabilityStatus, "availabilityStatus");
        this.f9976a = dateTime;
        this.b = z;
        this.c = availabilityStatus;
        this.d = z2;
    }

    public static DateDataState a(DateDataState dateDataState, boolean z, DateAvailabilityStatus availabilityStatus, int i) {
        LocalDateTime dateTime = dateDataState.f9976a;
        if ((i & 4) != 0) {
            availabilityStatus = dateDataState.c;
        }
        boolean z2 = (i & 8) != 0 ? dateDataState.d : false;
        Intrinsics.i(dateTime, "dateTime");
        Intrinsics.i(availabilityStatus, "availabilityStatus");
        return new DateDataState(dateTime, z, availabilityStatus, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateDataState)) {
            return false;
        }
        DateDataState dateDataState = (DateDataState) obj;
        return Intrinsics.d(this.f9976a, dateDataState.f9976a) && this.b == dateDataState.b && this.c == dateDataState.c && this.d == dateDataState.d;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (((this.f9976a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31)) * 31) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        return "DateDataState(dateTime=" + this.f9976a + ", isSelected=" + this.b + ", availabilityStatus=" + this.c + ", isSelectable=" + this.d + ")";
    }
}
