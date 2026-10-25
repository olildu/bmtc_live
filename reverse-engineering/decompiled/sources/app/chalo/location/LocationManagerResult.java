package app.chalo.location;

import app.chalo.models.LocationAppModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/location/LocationManagerResult;", "", "LocationUpdateStatus", "LocationPreconditionsStatus", "Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus;", "Lapp/chalo/location/LocationManagerResult$LocationUpdateStatus;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LocationManagerResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus;", "Lapp/chalo/location/LocationManagerResult;", "CheckNotStarted", "CheckInProgress", "SystemConditionsSatisfied", "RequestLocationPermission", "SettingsResolutionRequired", "SettingsUnavailable", "GeneralException", "ProcessCancelled", "Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus$CheckInProgress;", "Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus$CheckNotStarted;", "Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus$GeneralException;", "Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus$ProcessCancelled;", "Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus$RequestLocationPermission;", "Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus$SettingsResolutionRequired;", "Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus$SettingsUnavailable;", "Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus$SystemConditionsSatisfied;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class LocationPreconditionsStatus extends LocationManagerResult {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus$CheckInProgress;", "Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class CheckInProgress extends LocationPreconditionsStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final CheckInProgress f5139a = new CheckInProgress();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus$CheckNotStarted;", "Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class CheckNotStarted extends LocationPreconditionsStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final CheckNotStarted f5140a = new CheckNotStarted();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus$GeneralException;", "Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class GeneralException extends LocationPreconditionsStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Exception f5141a;

            public GeneralException(Exception exc) {
                this.f5141a = exc;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GeneralException) && Intrinsics.d(this.f5141a, ((GeneralException) obj).f5141a);
            }

            public final int hashCode() {
                return this.f5141a.hashCode();
            }

            public final String toString() {
                return "GeneralException(exception=" + this.f5141a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus$ProcessCancelled;", "Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ProcessCancelled extends LocationPreconditionsStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ProcessCancelled f5142a = new ProcessCancelled();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus$RequestLocationPermission;", "Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RequestLocationPermission extends LocationPreconditionsStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f5143a;
            public final List b;

            public RequestLocationPermission(List granted, List notGranted) {
                Intrinsics.i(granted, "granted");
                Intrinsics.i(notGranted, "notGranted");
                this.f5143a = granted;
                this.b = notGranted;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RequestLocationPermission)) {
                    return false;
                }
                RequestLocationPermission requestLocationPermission = (RequestLocationPermission) obj;
                return Intrinsics.d(this.f5143a, requestLocationPermission.f5143a) && Intrinsics.d(this.b, requestLocationPermission.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f5143a.hashCode() * 31);
            }

            public final String toString() {
                return "RequestLocationPermission(granted=" + this.f5143a + ", notGranted=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus$SettingsResolutionRequired;", "Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SettingsResolutionRequired extends LocationPreconditionsStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SettingsResolutionException f5144a;

            public SettingsResolutionRequired(SettingsResolutionException settingsResolutionException) {
                this.f5144a = settingsResolutionException;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SettingsResolutionRequired) && Intrinsics.d(this.f5144a, ((SettingsResolutionRequired) obj).f5144a);
            }

            public final int hashCode() {
                return this.f5144a.hashCode();
            }

            public final String toString() {
                return "SettingsResolutionRequired(exception=" + this.f5144a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus$SettingsUnavailable;", "Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SettingsUnavailable extends LocationPreconditionsStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SettingsUnavailable f5145a = new SettingsUnavailable();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus$SystemConditionsSatisfied;", "Lapp/chalo/location/LocationManagerResult$LocationPreconditionsStatus;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SystemConditionsSatisfied extends LocationPreconditionsStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SystemConditionsSatisfied f5146a = new SystemConditionsSatisfied();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/location/LocationManagerResult$LocationUpdateStatus;", "Lapp/chalo/location/LocationManagerResult;", "Initiated", "Location", "LocationFetchFailed", "NoLocation", "Lapp/chalo/location/LocationManagerResult$LocationUpdateStatus$Initiated;", "Lapp/chalo/location/LocationManagerResult$LocationUpdateStatus$Location;", "Lapp/chalo/location/LocationManagerResult$LocationUpdateStatus$LocationFetchFailed;", "Lapp/chalo/location/LocationManagerResult$LocationUpdateStatus$NoLocation;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class LocationUpdateStatus extends LocationManagerResult {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/LocationManagerResult$LocationUpdateStatus$Initiated;", "Lapp/chalo/location/LocationManagerResult$LocationUpdateStatus;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Initiated extends LocationUpdateStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Initiated f5147a = new Initiated();
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/LocationManagerResult$LocationUpdateStatus$Location;", "Lapp/chalo/location/LocationManagerResult$LocationUpdateStatus;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Location extends LocationUpdateStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LocationAppModel f5148a;

            public Location(LocationAppModel locationAppModel) {
                this.f5148a = locationAppModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Location) && Intrinsics.d(this.f5148a, ((Location) obj).f5148a);
            }

            public final int hashCode() {
                return this.f5148a.hashCode();
            }

            public final String toString() {
                return "Location(info=" + this.f5148a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/LocationManagerResult$LocationUpdateStatus$LocationFetchFailed;", "Lapp/chalo/location/LocationManagerResult$LocationUpdateStatus;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LocationFetchFailed extends LocationUpdateStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Exception f5149a;

            public LocationFetchFailed(Exception exc) {
                this.f5149a = exc;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocationFetchFailed) && Intrinsics.d(this.f5149a, ((LocationFetchFailed) obj).f5149a);
            }

            public final int hashCode() {
                Exception exc = this.f5149a;
                if (exc == null) {
                    return 0;
                }
                return exc.hashCode();
            }

            public final String toString() {
                return "LocationFetchFailed(exception=" + this.f5149a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/LocationManagerResult$LocationUpdateStatus$NoLocation;", "Lapp/chalo/location/LocationManagerResult$LocationUpdateStatus;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NoLocation extends LocationUpdateStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final NoLocation f5150a = new NoLocation();
        }
    }
}
