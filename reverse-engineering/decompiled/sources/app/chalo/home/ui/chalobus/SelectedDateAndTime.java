package app.chalo.home.ui.chalobus;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.LocalDateTime;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/chalobus/SelectedDateAndTime;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SelectedDateAndTime {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f3305a;
    public final String b;

    public SelectedDateAndTime(LocalDateTime localDateTime, String str) {
        Intrinsics.i(localDateTime, "localDateTime");
        this.f3305a = localDateTime;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedDateAndTime)) {
            return false;
        }
        SelectedDateAndTime selectedDateAndTime = (SelectedDateAndTime) obj;
        return Intrinsics.d(this.f3305a, selectedDateAndTime.f3305a) && Intrinsics.d(this.b, selectedDateAndTime.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3305a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectedDateAndTime(localDateTime=" + this.f3305a + ", timezoneId=" + this.b + ")";
    }
}
