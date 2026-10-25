package app.chalo.livetracking.provider.tracking.model;

import defpackage.gf;
import defpackage.vo1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel;", "", "WithEtaAvailable", "EtaFetchInProgress", "SpecificScheduledTime", "AllBusPassedStop", "NotAvailable", "Unknown", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel$AllBusPassedStop;", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel$EtaFetchInProgress;", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel$NotAvailable;", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel$SpecificScheduledTime;", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel$Unknown;", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel$WithEtaAvailable;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StopLiveEtaUiModel {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel$AllBusPassedStop;", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AllBusPassedStop extends StopLiveEtaUiModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AllBusPassedStop f4375a = new AllBusPassedStop();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel$EtaFetchInProgress;", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EtaFetchInProgress extends StopLiveEtaUiModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EtaFetchInProgress f4376a = new EtaFetchInProgress();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel$NotAvailable;", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotAvailable extends StopLiveEtaUiModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotAvailable f4377a = new NotAvailable();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel$SpecificScheduledTime;", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SpecificScheduledTime extends StopLiveEtaUiModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4378a;

        public SpecificScheduledTime(String scheduledTime) {
            Intrinsics.i(scheduledTime, "scheduledTime");
            this.f4378a = scheduledTime;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SpecificScheduledTime) && Intrinsics.d(this.f4378a, ((SpecificScheduledTime) obj).f4378a);
        }

        public final int hashCode() {
            return this.f4378a.hashCode();
        }

        public final String toString() {
            return vo1.B("SpecificScheduledTime(scheduledTime=", this.f4378a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel$Unknown;", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Unknown extends StopLiveEtaUiModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unknown f4379a = new Unknown();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel$WithEtaAvailable;", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel;", "FixedEta", "EstimatedEta", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel$WithEtaAvailable$EstimatedEta;", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel$WithEtaAvailable$FixedEta;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class WithEtaAvailable extends StopLiveEtaUiModel {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel$WithEtaAvailable$EstimatedEta;", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel$WithEtaAvailable;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class EstimatedEta extends WithEtaAvailable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList f4380a;

            public EstimatedEta(ArrayList arrayList) {
                this.f4380a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EstimatedEta) && this.f4380a.equals(((EstimatedEta) obj).f4380a);
            }

            public final int hashCode() {
                return this.f4380a.hashCode();
            }

            public final String toString() {
                return gf.i("EstimatedEta(etaList=", ")", this.f4380a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel$WithEtaAvailable$FixedEta;", "Lapp/chalo/livetracking/provider/tracking/model/StopLiveEtaUiModel$WithEtaAvailable;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FixedEta extends WithEtaAvailable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList f4381a;

            public FixedEta(ArrayList arrayList) {
                this.f4381a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FixedEta) && this.f4381a.equals(((FixedEta) obj).f4381a);
            }

            public final int hashCode() {
                return this.f4381a.hashCode();
            }

            public final String toString() {
                return gf.i("FixedEta(etaList=", ")", this.f4381a);
            }
        }
    }
}
