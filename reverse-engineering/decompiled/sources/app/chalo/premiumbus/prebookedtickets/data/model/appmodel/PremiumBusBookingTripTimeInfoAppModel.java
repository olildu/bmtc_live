package app.chalo.premiumbus.prebookedtickets.data.model.appmodel;

import defpackage.i71;
import defpackage.t10;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingTripTimeInfoAppModel;", "", "NotFetched", "ExpectedTime", "LiveEta", "LiveEtaNotAvailable", "Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingTripTimeInfoAppModel$ExpectedTime;", "Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingTripTimeInfoAppModel$LiveEta;", "Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingTripTimeInfoAppModel$LiveEtaNotAvailable;", "Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingTripTimeInfoAppModel$NotFetched;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusBookingTripTimeInfoAppModel {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingTripTimeInfoAppModel$ExpectedTime;", "Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingTripTimeInfoAppModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExpectedTime extends PremiumBusBookingTripTimeInfoAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7287a;
        public final long b;
        public final long c;

        public ExpectedTime(long j, long j2, long j3) {
            this.f7287a = j;
            this.b = j2;
            this.c = j3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExpectedTime)) {
                return false;
            }
            ExpectedTime expectedTime = (ExpectedTime) obj;
            return this.f7287a == expectedTime.f7287a && this.b == expectedTime.b && this.c == expectedTime.c;
        }

        public final int hashCode() {
            long j = this.f7287a;
            long j2 = this.b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.c;
            return i + ((int) ((j3 >>> 32) ^ j3));
        }

        public final String toString() {
            StringBuilder sbG = i71.g(this.f7287a, "ExpectedTime(expectedStopTimeInMillis=", ", scheduledStopTimeInMillis=");
            sbG.append(this.b);
            return t10.g(this.c, ", updatedTripStartTimeInMillisFromPolling=", ")", sbG);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingTripTimeInfoAppModel$LiveEta;", "Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingTripTimeInfoAppModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LiveEta extends PremiumBusBookingTripTimeInfoAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7288a;
        public final boolean b;
        public final long c;
        public final Long d;
        public final Integer e;
        public final List f;

        public LiveEta(long j, boolean z, long j2, Long l, Integer num, List tripCommunicationBanners) {
            Intrinsics.i(tripCommunicationBanners, "tripCommunicationBanners");
            this.f7288a = j;
            this.b = z;
            this.c = j2;
            this.d = l;
            this.e = num;
            this.f = tripCommunicationBanners;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiveEta)) {
                return false;
            }
            LiveEta liveEta = (LiveEta) obj;
            return this.f7288a == liveEta.f7288a && this.b == liveEta.b && this.c == liveEta.c && Intrinsics.d(this.d, liveEta.d) && Intrinsics.d(this.e, liveEta.e) && Intrinsics.d(this.f, liveEta.f);
        }

        public final int hashCode() {
            long j = this.f7288a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            int i2 = this.b ? 1231 : 1237;
            long j2 = this.c;
            int i3 = (((i + i2) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
            Long l = this.d;
            int iHashCode = (i3 + (l == null ? 0 : l.hashCode())) * 31;
            Integer num = this.e;
            return this.f.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LiveEta(etaInSeconds=");
            sb.append(this.f7288a);
            sb.append(", hasBusCrossedStop=");
            sb.append(this.b);
            xs.r(this.c, ", etaUpdatedAtTimestamp=", ", scheduleStopTime=", sb);
            sb.append(this.d);
            sb.append(", distanceToReach=");
            sb.append(this.e);
            sb.append(", tripCommunicationBanners=");
            return xs.l(sb, this.f, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingTripTimeInfoAppModel$LiveEtaNotAvailable;", "Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingTripTimeInfoAppModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LiveEtaNotAvailable extends PremiumBusBookingTripTimeInfoAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LiveEtaNotAvailable f7289a = new LiveEtaNotAvailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LiveEtaNotAvailable);
        }

        public final int hashCode() {
            return -988131840;
        }

        public final String toString() {
            return "LiveEtaNotAvailable";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingTripTimeInfoAppModel$NotFetched;", "Lapp/chalo/premiumbus/prebookedtickets/data/model/appmodel/PremiumBusBookingTripTimeInfoAppModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotFetched extends PremiumBusBookingTripTimeInfoAppModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotFetched f7290a = new NotFetched();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotFetched);
        }

        public final int hashCode() {
            return 810893666;
        }

        public final String toString() {
            return "NotFetched";
        }
    }
}
