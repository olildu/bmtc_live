package app.chalo.livetracking.tripplanner.ui.result;

import defpackage.pk0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultDialogType;", "", "DateEditOptionDialog", "TimeEditOptionDialog", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultDialogType$DateEditOptionDialog;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultDialogType$TimeEditOptionDialog;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TripPlannerResultDialogType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultDialogType$DateEditOptionDialog;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultDialogType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateEditOptionDialog extends TripPlannerResultDialogType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f4762a;
        public final TripPlannerResultsComponent$handleDateEditOptionClickedIntent$1$selectableDates$1 b;

        public DateEditOptionDialog(long j, TripPlannerResultsComponent$handleDateEditOptionClickedIntent$1$selectableDates$1 tripPlannerResultsComponent$handleDateEditOptionClickedIntent$1$selectableDates$1) {
            this.f4762a = j;
            this.b = tripPlannerResultsComponent$handleDateEditOptionClickedIntent$1$selectableDates$1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DateEditOptionDialog)) {
                return false;
            }
            DateEditOptionDialog dateEditOptionDialog = (DateEditOptionDialog) obj;
            return this.f4762a == dateEditOptionDialog.f4762a && equals(dateEditOptionDialog.b);
        }

        public final int hashCode() {
            long j = this.f4762a;
            return hashCode() + (((int) (j ^ (j >>> 32))) * 31);
        }

        public final String toString() {
            return "DateEditOptionDialog(currentDate=" + this.f4762a + ", selectableDates=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultDialogType$TimeEditOptionDialog;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultDialogType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimeEditOptionDialog extends TripPlannerResultDialogType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4763a;
        public final int b;

        public TimeEditOptionDialog(int i, int i2) {
            this.f4763a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TimeEditOptionDialog)) {
                return false;
            }
            TimeEditOptionDialog timeEditOptionDialog = (TimeEditOptionDialog) obj;
            return this.f4763a == timeEditOptionDialog.f4763a && this.b == timeEditOptionDialog.b;
        }

        public final int hashCode() {
            return (((this.f4763a * 31) + this.b) * 31) + 1237;
        }

        public final String toString() {
            return pk0.f(this.f4763a, this.b, "TimeEditOptionDialog(initialHour=", ", initialMinute=", ", is24Hour=false)");
        }
    }
}
