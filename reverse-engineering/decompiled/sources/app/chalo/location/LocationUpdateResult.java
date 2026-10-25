package app.chalo.location;

import app.chalo.models.LocationAppModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lapp/chalo/location/LocationUpdateResult;", "", "Initiated", "LocationReceived", "LocationFetchFailed", "NoValidLocation", "RequestLocationPermission", "SettingsResolutionRequired", "SettingsUnavailable", "GeneralException", "Lapp/chalo/location/LocationUpdateResult$GeneralException;", "Lapp/chalo/location/LocationUpdateResult$Initiated;", "Lapp/chalo/location/LocationUpdateResult$LocationFetchFailed;", "Lapp/chalo/location/LocationUpdateResult$LocationReceived;", "Lapp/chalo/location/LocationUpdateResult$NoValidLocation;", "Lapp/chalo/location/LocationUpdateResult$RequestLocationPermission;", "Lapp/chalo/location/LocationUpdateResult$SettingsResolutionRequired;", "Lapp/chalo/location/LocationUpdateResult$SettingsUnavailable;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LocationUpdateResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/LocationUpdateResult$GeneralException;", "Lapp/chalo/location/LocationUpdateResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GeneralException extends LocationUpdateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f5151a;

        public GeneralException(Exception exc) {
            this.f5151a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GeneralException) && Intrinsics.d(this.f5151a, ((GeneralException) obj).f5151a);
        }

        public final int hashCode() {
            Exception exc = this.f5151a;
            if (exc == null) {
                return 0;
            }
            return exc.hashCode();
        }

        public final String toString() {
            return "GeneralException(exception=" + this.f5151a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/LocationUpdateResult$Initiated;", "Lapp/chalo/location/LocationUpdateResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Initiated extends LocationUpdateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Initiated f5152a = new Initiated();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Initiated);
        }

        public final int hashCode() {
            return 1825263061;
        }

        public final String toString() {
            return "Initiated";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/LocationUpdateResult$LocationFetchFailed;", "Lapp/chalo/location/LocationUpdateResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocationFetchFailed extends LocationUpdateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f5153a;

        public LocationFetchFailed(Exception exc) {
            this.f5153a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocationFetchFailed) && Intrinsics.d(this.f5153a, ((LocationFetchFailed) obj).f5153a);
        }

        public final int hashCode() {
            Exception exc = this.f5153a;
            if (exc == null) {
                return 0;
            }
            return exc.hashCode();
        }

        public final String toString() {
            return "LocationFetchFailed(exception=" + this.f5153a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/LocationUpdateResult$LocationReceived;", "Lapp/chalo/location/LocationUpdateResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocationReceived extends LocationUpdateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocationAppModel f5154a;

        public LocationReceived(LocationAppModel locationAppModel) {
            this.f5154a = locationAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocationReceived) && Intrinsics.d(this.f5154a, ((LocationReceived) obj).f5154a);
        }

        public final int hashCode() {
            return this.f5154a.hashCode();
        }

        public final String toString() {
            return "LocationReceived(info=" + this.f5154a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/LocationUpdateResult$NoValidLocation;", "Lapp/chalo/location/LocationUpdateResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoValidLocation extends LocationUpdateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoValidLocation f5155a = new NoValidLocation();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoValidLocation);
        }

        public final int hashCode() {
            return -180236038;
        }

        public final String toString() {
            return "NoValidLocation";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/LocationUpdateResult$RequestLocationPermission;", "Lapp/chalo/location/LocationUpdateResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RequestLocationPermission extends LocationUpdateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f5156a;
        public final List b;

        public RequestLocationPermission(List granted, List notGranted) {
            Intrinsics.i(granted, "granted");
            Intrinsics.i(notGranted, "notGranted");
            this.f5156a = granted;
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
            return Intrinsics.d(this.f5156a, requestLocationPermission.f5156a) && Intrinsics.d(this.b, requestLocationPermission.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5156a.hashCode() * 31);
        }

        public final String toString() {
            return "RequestLocationPermission(granted=" + this.f5156a + ", notGranted=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/LocationUpdateResult$SettingsResolutionRequired;", "Lapp/chalo/location/LocationUpdateResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SettingsResolutionRequired extends LocationUpdateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SettingsResolutionException f5157a;

        public SettingsResolutionRequired(SettingsResolutionException settingsResolutionException) {
            this.f5157a = settingsResolutionException;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof SettingsResolutionRequired) && this.f5157a.b == ((SettingsResolutionRequired) obj).f5157a.b;
        }

        public final int hashCode() {
            return this.f5157a.b;
        }

        public final String toString() {
            return "SettingsResolutionRequired(exception=" + this.f5157a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/LocationUpdateResult$SettingsUnavailable;", "Lapp/chalo/location/LocationUpdateResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SettingsUnavailable extends LocationUpdateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SettingsUnavailable f5158a = new SettingsUnavailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SettingsUnavailable);
        }

        public final int hashCode() {
            return 1202180247;
        }

        public final String toString() {
            return "SettingsUnavailable";
        }
    }

    public final LocationAppModel a() {
        if (this instanceof LocationReceived) {
            return ((LocationReceived) this).f5154a;
        }
        if ((this instanceof GeneralException) || equals(Initiated.f5152a) || (this instanceof LocationFetchFailed) || (this instanceof RequestLocationPermission) || equals(NoValidLocation.f5155a) || (this instanceof SettingsResolutionRequired) || equals(SettingsUnavailable.f5158a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
