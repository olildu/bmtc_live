package app.chalo.livetracking.routedetails.data.model.ui;

import defpackage.dd;
import defpackage.nf1;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/RouteTripTimingUiModel;", "", "FixedTimingUiModel", "FrequencyTimingUiModel", "Lapp/chalo/livetracking/routedetails/data/model/ui/RouteTripTimingUiModel$FixedTimingUiModel;", "Lapp/chalo/livetracking/routedetails/data/model/ui/RouteTripTimingUiModel$FrequencyTimingUiModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RouteTripTimingUiModel {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/RouteTripTimingUiModel$FixedTimingUiModel;", "Lapp/chalo/livetracking/routedetails/data/model/ui/RouteTripTimingUiModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FixedTimingUiModel extends RouteTripTimingUiModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4412a;

        public FixedTimingUiModel(String startTime) {
            Intrinsics.i(startTime, "startTime");
            this.f4412a = startTime;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FixedTimingUiModel) && Intrinsics.d(this.f4412a, ((FixedTimingUiModel) obj).f4412a);
        }

        public final int hashCode() {
            return this.f4412a.hashCode();
        }

        public final String toString() {
            return vo1.B("FixedTimingUiModel(startTime=", this.f4412a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/data/model/ui/RouteTripTimingUiModel$FrequencyTimingUiModel;", "Lapp/chalo/livetracking/routedetails/data/model/ui/RouteTripTimingUiModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FrequencyTimingUiModel extends RouteTripTimingUiModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4413a;
        public final String b;
        public final long c;

        public FrequencyTimingUiModel(String startTime, String endTime, long j) {
            Intrinsics.i(startTime, "startTime");
            Intrinsics.i(endTime, "endTime");
            this.f4413a = startTime;
            this.b = endTime;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FrequencyTimingUiModel)) {
                return false;
            }
            FrequencyTimingUiModel frequencyTimingUiModel = (FrequencyTimingUiModel) obj;
            return Intrinsics.d(this.f4413a, frequencyTimingUiModel.f4413a) && Intrinsics.d(this.b, frequencyTimingUiModel.b) && this.c == frequencyTimingUiModel.c;
        }

        public final int hashCode() {
            int iE = nf1.e(this.f4413a.hashCode() * 31, 31, this.b);
            long j = this.c;
            return iE + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return uf0.m(this.c, ")", dd.e("FrequencyTimingUiModel(startTime=", this.f4413a, ", endTime=", this.b, ", frequency="));
        }
    }
}
