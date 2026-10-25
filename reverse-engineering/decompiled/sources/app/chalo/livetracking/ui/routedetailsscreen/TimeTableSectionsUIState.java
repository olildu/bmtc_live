package app.chalo.livetracking.ui.routedetailsscreen;

import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/TimeTableSectionsUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TimeTableSectionsUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeTableSectionHeaderUIState f4893a;
    public final List b;
    public final TimeTableSectionUISpec c;

    public TimeTableSectionsUIState(TimeTableSectionHeaderUIState header, List timings) {
        TimeTableSectionUISpec timeTableSectionUISpec = new TimeTableSectionUISpec();
        Intrinsics.i(header, "header");
        Intrinsics.i(timings, "timings");
        this.f4893a = header;
        this.b = timings;
        this.c = timeTableSectionUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeTableSectionsUIState)) {
            return false;
        }
        TimeTableSectionsUIState timeTableSectionsUIState = (TimeTableSectionsUIState) obj;
        return Intrinsics.d(this.f4893a, timeTableSectionsUIState.f4893a) && Intrinsics.d(this.b, timeTableSectionsUIState.b) && Intrinsics.d(this.c, timeTableSectionsUIState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.b(this.f4893a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "TimeTableSectionsUIState(header=" + this.f4893a + ", timings=" + this.b + ", specs=" + this.c + ")";
    }
}
