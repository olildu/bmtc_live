package app.chalo.onboarding.citylocationselection.ui;

import app.chalo.models.BasicCityInfoAppModel;
import app.chalo.universalsearch.data.UniversalSearchCitySelectionResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent;", "", "InitializationIntent", "OnLocationPermissionGranted", "UserRefusedLocationPermission", "UserRefusedLocationPermissionViaSettings", "OnEnableDeviceLocationClicked", "OnEnterManuallyClicked", "OnGpsEnabled", "OnGpsRequestDenied", "StartLocationUpdates", "RetryCityFetch", "OnChangeLocationClicked", "OnExploreChaloCitiesClicked", "UniversalSearchResultReceived", "ConfigFetchError", "LocationSettingsDialogSettingClicked", "LocationSettingsDialogCancelClicked", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$ConfigFetchError;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$InitializationIntent;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$LocationSettingsDialogCancelClicked;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$LocationSettingsDialogSettingClicked;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$OnChangeLocationClicked;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$OnEnableDeviceLocationClicked;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$OnEnterManuallyClicked;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$OnExploreChaloCitiesClicked;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$OnGpsEnabled;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$OnGpsRequestDenied;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$OnLocationPermissionGranted;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$RetryCityFetch;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$StartLocationUpdates;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$UniversalSearchResultReceived;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$UserRefusedLocationPermission;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$UserRefusedLocationPermissionViaSettings;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CityLocationSelectionIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$ConfigFetchError;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConfigFetchError extends CityLocationSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfigFetchError f6581a = new ConfigFetchError();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$InitializationIntent;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends CityLocationSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CityLocationSelectionSource f6582a;
        public final BasicCityInfoAppModel b;

        static {
            BasicCityInfoAppModel.Companion companion = BasicCityInfoAppModel.INSTANCE;
        }

        public InitializationIntent(CityLocationSelectionSource source, BasicCityInfoAppModel basicCityInfoAppModel) {
            Intrinsics.i(source, "source");
            this.f6582a = source;
            this.b = basicCityInfoAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationIntent)) {
                return false;
            }
            InitializationIntent initializationIntent = (InitializationIntent) obj;
            return this.f6582a == initializationIntent.f6582a && Intrinsics.d(this.b, initializationIntent.b);
        }

        public final int hashCode() {
            int iHashCode = this.f6582a.hashCode() * 31;
            BasicCityInfoAppModel basicCityInfoAppModel = this.b;
            return iHashCode + (basicCityInfoAppModel == null ? 0 : basicCityInfoAppModel.hashCode());
        }

        public final String toString() {
            return "InitializationIntent(source=" + this.f6582a + ", preselectedBasicCityInfoAppModel=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$LocationSettingsDialogCancelClicked;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocationSettingsDialogCancelClicked extends CityLocationSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocationSettingsDialogCancelClicked f6583a = new LocationSettingsDialogCancelClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$LocationSettingsDialogSettingClicked;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocationSettingsDialogSettingClicked extends CityLocationSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocationSettingsDialogSettingClicked f6584a = new LocationSettingsDialogSettingClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$OnChangeLocationClicked;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnChangeLocationClicked extends CityLocationSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnChangeLocationClicked f6585a = new OnChangeLocationClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$OnEnableDeviceLocationClicked;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnEnableDeviceLocationClicked extends CityLocationSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnEnableDeviceLocationClicked f6586a = new OnEnableDeviceLocationClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$OnEnterManuallyClicked;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnEnterManuallyClicked extends CityLocationSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnEnterManuallyClicked f6587a = new OnEnterManuallyClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$OnExploreChaloCitiesClicked;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnExploreChaloCitiesClicked extends CityLocationSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnExploreChaloCitiesClicked f6588a = new OnExploreChaloCitiesClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$OnGpsEnabled;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnGpsEnabled extends CityLocationSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnGpsEnabled f6589a = new OnGpsEnabled();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$OnGpsRequestDenied;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnGpsRequestDenied extends CityLocationSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnGpsRequestDenied f6590a = new OnGpsRequestDenied();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$OnLocationPermissionGranted;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnLocationPermissionGranted extends CityLocationSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnLocationPermissionGranted f6591a = new OnLocationPermissionGranted();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$RetryCityFetch;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RetryCityFetch extends CityLocationSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RetryCityFetch f6592a = new RetryCityFetch();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$StartLocationUpdates;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StartLocationUpdates extends CityLocationSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CityLocationSelectionSource f6593a;

        public StartLocationUpdates(CityLocationSelectionSource source) {
            Intrinsics.i(source, "source");
            this.f6593a = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartLocationUpdates) && this.f6593a == ((StartLocationUpdates) obj).f6593a;
        }

        public final int hashCode() {
            return this.f6593a.hashCode() + 38347;
        }

        public final String toString() {
            return "StartLocationUpdates(shouldForceRestart=false, source=" + this.f6593a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$UniversalSearchResultReceived;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UniversalSearchResultReceived extends CityLocationSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UniversalSearchCitySelectionResult f6594a;

        public UniversalSearchResultReceived(UniversalSearchCitySelectionResult universalSearchCitySelectionResult) {
            this.f6594a = universalSearchCitySelectionResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UniversalSearchResultReceived) && Intrinsics.d(this.f6594a, ((UniversalSearchResultReceived) obj).f6594a);
        }

        public final int hashCode() {
            return this.f6594a.hashCode();
        }

        public final String toString() {
            return "UniversalSearchResultReceived(universalSearchResult=" + this.f6594a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$UserRefusedLocationPermission;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UserRefusedLocationPermission extends CityLocationSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UserRefusedLocationPermission f6595a = new UserRefusedLocationPermission();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent$UserRefusedLocationPermissionViaSettings;", "Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UserRefusedLocationPermissionViaSettings extends CityLocationSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UserRefusedLocationPermissionViaSettings f6596a = new UserRefusedLocationPermissionViaSettings();
    }
}
