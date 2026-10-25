package app.chalo.stoptripdetails.data.model;

import app.chalo.stoptripdetails.data.model.app.EstimatedTime;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/StopETAModel;", "", "LiveEta", "FrequencyTrips", "AfterXTime", "FixedTime", "NoMoreTrips", "ValidTripsWithDisclaimer", "InvalidTrips", "Unknown", "Lapp/chalo/stoptripdetails/data/model/StopETAModel$AfterXTime;", "Lapp/chalo/stoptripdetails/data/model/StopETAModel$FixedTime;", "Lapp/chalo/stoptripdetails/data/model/StopETAModel$FrequencyTrips;", "Lapp/chalo/stoptripdetails/data/model/StopETAModel$InvalidTrips;", "Lapp/chalo/stoptripdetails/data/model/StopETAModel$LiveEta;", "Lapp/chalo/stoptripdetails/data/model/StopETAModel$NoMoreTrips;", "Lapp/chalo/stoptripdetails/data/model/StopETAModel$Unknown;", "Lapp/chalo/stoptripdetails/data/model/StopETAModel$ValidTripsWithDisclaimer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StopETAModel {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/StopETAModel$AfterXTime;", "Lapp/chalo/stoptripdetails/data/model/StopETAModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AfterXTime extends StopETAModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EstimatedTime f9461a;

        public AfterXTime(EstimatedTime estimatedTimeString) {
            Intrinsics.i(estimatedTimeString, "estimatedTimeString");
            this.f9461a = estimatedTimeString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AfterXTime) && Intrinsics.d(this.f9461a, ((AfterXTime) obj).f9461a);
        }

        public final int hashCode() {
            return this.f9461a.hashCode();
        }

        public final String toString() {
            return "AfterXTime(estimatedTimeString=" + this.f9461a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/StopETAModel$FixedTime;", "Lapp/chalo/stoptripdetails/data/model/StopETAModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FixedTime extends StopETAModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EstimatedTime f9462a;

        public FixedTime(EstimatedTime estimatedTimeString) {
            Intrinsics.i(estimatedTimeString, "estimatedTimeString");
            this.f9462a = estimatedTimeString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FixedTime) && Intrinsics.d(this.f9462a, ((FixedTime) obj).f9462a);
        }

        public final int hashCode() {
            return this.f9462a.hashCode();
        }

        public final String toString() {
            return "FixedTime(estimatedTimeString=" + this.f9462a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/StopETAModel$FrequencyTrips;", "Lapp/chalo/stoptripdetails/data/model/StopETAModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FrequencyTrips extends StopETAModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EstimatedTime f9463a;

        public FrequencyTrips(EstimatedTime estimatedTimeString) {
            Intrinsics.i(estimatedTimeString, "estimatedTimeString");
            this.f9463a = estimatedTimeString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FrequencyTrips) && Intrinsics.d(this.f9463a, ((FrequencyTrips) obj).f9463a);
        }

        public final int hashCode() {
            return this.f9463a.hashCode();
        }

        public final String toString() {
            return "FrequencyTrips(estimatedTimeString=" + this.f9463a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/StopETAModel$InvalidTrips;", "Lapp/chalo/stoptripdetails/data/model/StopETAModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InvalidTrips extends StopETAModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EstimatedTime f9464a;

        public InvalidTrips(EstimatedTime estimatedTimeString) {
            Intrinsics.i(estimatedTimeString, "estimatedTimeString");
            this.f9464a = estimatedTimeString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidTrips) && Intrinsics.d(this.f9464a, ((InvalidTrips) obj).f9464a);
        }

        public final int hashCode() {
            return this.f9464a.hashCode();
        }

        public final String toString() {
            return "InvalidTrips(estimatedTimeString=" + this.f9464a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/StopETAModel$LiveEta;", "Lapp/chalo/stoptripdetails/data/model/StopETAModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LiveEta extends StopETAModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9465a;

        public LiveEta(String etaString) {
            Intrinsics.i(etaString, "etaString");
            this.f9465a = etaString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LiveEta) && Intrinsics.d(this.f9465a, ((LiveEta) obj).f9465a);
        }

        public final int hashCode() {
            return this.f9465a.hashCode();
        }

        public final String toString() {
            return vo1.B("LiveEta(etaString=", this.f9465a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/StopETAModel$NoMoreTrips;", "Lapp/chalo/stoptripdetails/data/model/StopETAModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoMoreTrips extends StopETAModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EstimatedTime f9466a;

        public NoMoreTrips(EstimatedTime estimatedTimeString) {
            Intrinsics.i(estimatedTimeString, "estimatedTimeString");
            this.f9466a = estimatedTimeString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoMoreTrips) && Intrinsics.d(this.f9466a, ((NoMoreTrips) obj).f9466a);
        }

        public final int hashCode() {
            return this.f9466a.hashCode();
        }

        public final String toString() {
            return "NoMoreTrips(estimatedTimeString=" + this.f9466a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/StopETAModel$Unknown;", "Lapp/chalo/stoptripdetails/data/model/StopETAModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Unknown extends StopETAModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unknown f9467a = new Unknown();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/StopETAModel$ValidTripsWithDisclaimer;", "Lapp/chalo/stoptripdetails/data/model/StopETAModel;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ValidTripsWithDisclaimer extends StopETAModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EstimatedTime f9468a;

        public ValidTripsWithDisclaimer(EstimatedTime estimatedTimeString) {
            Intrinsics.i(estimatedTimeString, "estimatedTimeString");
            this.f9468a = estimatedTimeString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ValidTripsWithDisclaimer) && Intrinsics.d(this.f9468a, ((ValidTripsWithDisclaimer) obj).f9468a);
        }

        public final int hashCode() {
            return this.f9468a.hashCode();
        }

        public final String toString() {
            return "ValidTripsWithDisclaimer(estimatedTimeString=" + this.f9468a + ")";
        }
    }
}
