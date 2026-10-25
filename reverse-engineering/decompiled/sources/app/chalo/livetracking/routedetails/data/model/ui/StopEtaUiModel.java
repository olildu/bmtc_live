package app.chalo.livetracking.routedetails.data.model.ui;

import defpackage.gf;
import defpackage.r1;
import defpackage.vo1;
import defpackage.xs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel;", "", "WithEtaAvailable", "WithTimeTable", "SpecificScheduledTime", "LiveTrackingNotAvailable", "AllBusPassedStop", "NotAvailable", "Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$AllBusPassedStop;", "Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$LiveTrackingNotAvailable;", "Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$NotAvailable;", "Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$SpecificScheduledTime;", "Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$WithEtaAvailable;", "Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$WithTimeTable;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StopEtaUiModel {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$AllBusPassedStop;", "Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AllBusPassedStop extends StopEtaUiModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AllBusPassedStop f4414a = new AllBusPassedStop();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$LiveTrackingNotAvailable;", "Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LiveTrackingNotAvailable extends StopEtaUiModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LiveTrackingNotAvailable f4415a = new LiveTrackingNotAvailable();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$NotAvailable;", "Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotAvailable extends StopEtaUiModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotAvailable f4416a = new NotAvailable();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$SpecificScheduledTime;", "Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SpecificScheduledTime extends StopEtaUiModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4417a;

        public SpecificScheduledTime(String scheduledTime) {
            Intrinsics.i(scheduledTime, "scheduledTime");
            this.f4417a = scheduledTime;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SpecificScheduledTime) && Intrinsics.d(this.f4417a, ((SpecificScheduledTime) obj).f4417a);
        }

        public final int hashCode() {
            return this.f4417a.hashCode();
        }

        public final String toString() {
            return vo1.B("SpecificScheduledTime(scheduledTime=", this.f4417a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$WithEtaAvailable;", "Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel;", "FixedEta", "EstimatedEta", "Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$WithEtaAvailable$EstimatedEta;", "Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$WithEtaAvailable$FixedEta;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class WithEtaAvailable extends StopEtaUiModel {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$WithEtaAvailable$EstimatedEta;", "Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$WithEtaAvailable;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class EstimatedEta extends WithEtaAvailable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList f4418a;

            public EstimatedEta(ArrayList arrayList) {
                this.f4418a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EstimatedEta) && this.f4418a.equals(((EstimatedEta) obj).f4418a);
            }

            public final int hashCode() {
                return this.f4418a.hashCode();
            }

            public final String toString() {
                return gf.i("EstimatedEta(etaList=", ")", this.f4418a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$WithEtaAvailable$FixedEta;", "Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$WithEtaAvailable;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FixedEta extends WithEtaAvailable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f4419a;

            public FixedEta(List list) {
                this.f4419a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FixedEta) && Intrinsics.d(this.f4419a, ((FixedEta) obj).f4419a);
            }

            public final int hashCode() {
                return this.f4419a.hashCode();
            }

            public final String toString() {
                return r1.d("FixedEta(etaList=", ")", this.f4419a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$WithTimeTable;", "Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel;", "TimeTableAvailable", "TimeTableNotAvailable", "Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$WithTimeTable$TimeTableAvailable;", "Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$WithTimeTable$TimeTableNotAvailable;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class WithTimeTable extends StopEtaUiModel {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$WithTimeTable$TimeTableAvailable;", "Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$WithTimeTable;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TimeTableAvailable extends WithTimeTable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f4420a;
            public final boolean b;

            public TimeTableAvailable(String nextScheduledBusText, boolean z) {
                Intrinsics.i(nextScheduledBusText, "nextScheduledBusText");
                this.f4420a = nextScheduledBusText;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TimeTableAvailable)) {
                    return false;
                }
                TimeTableAvailable timeTableAvailable = (TimeTableAvailable) obj;
                return Intrinsics.d(this.f4420a, timeTableAvailable.f4420a) && this.b == timeTableAvailable.b;
            }

            public final int hashCode() {
                return (this.f4420a.hashCode() * 31) + (this.b ? 1231 : 1237);
            }

            public final String toString() {
                return xs.k("TimeTableAvailable(nextScheduledBusText=", this.f4420a, ", isFrequencySlot=", ")", this.b);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$WithTimeTable$TimeTableNotAvailable;", "Lapp/chalo/livetracking/routedetails/data/model/ui/StopEtaUiModel$WithTimeTable;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TimeTableNotAvailable extends WithTimeTable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f4421a;

            public TimeTableNotAvailable(String timeTableNotAvailableText) {
                Intrinsics.i(timeTableNotAvailableText, "timeTableNotAvailableText");
                this.f4421a = timeTableNotAvailableText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TimeTableNotAvailable) && Intrinsics.d(this.f4421a, ((TimeTableNotAvailable) obj).f4421a);
            }

            public final int hashCode() {
                return this.f4421a.hashCode();
            }

            public final String toString() {
                return vo1.B("TimeTableNotAvailable(timeTableNotAvailableText=", this.f4421a, ")");
            }
        }
    }
}
