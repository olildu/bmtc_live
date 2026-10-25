package app.chalo.livetracking.tripplanner.ui.result;

import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerTabType;
import app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel;
import defpackage.cb0;
import defpackage.pk0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0016\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0082\u0001\u0016\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-¨\u0006."}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "", "InitializationIntent", "SearchStopUpdateFieldClickedIntent", "SearchStopFieldUpdatedIntent", "ToggleSearchStopsClickedIntent", "TimeEditFieldClickIntent", "DateEditOptionClickedIntent", "ProceedClickedIntent", "FragmentStartedIntent", "FragmentStoppedIntent", "ItineraryClickedIntent", "RecentTripClickedIntent", "QuickFilterTabClickedIntent", "LocationEnabledIntent", "OnExploreAllRoutesClickedIntent", "ToolTipOkClickedIntent", "OnBackPressedIntent", "UpdateSelectedTimeIntent", "UpdateSelectedDateIntent", "FetchAndUpdateHopItineraryListIntent", "HopApiFetchFailedSnackbarRetryIntent", "ScrollDirectionChangedIntent", "DismissPickerDialogIntent", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$DateEditOptionClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$DismissPickerDialogIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$FetchAndUpdateHopItineraryListIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$FragmentStartedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$FragmentStoppedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$HopApiFetchFailedSnackbarRetryIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$InitializationIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$ItineraryClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$LocationEnabledIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$OnBackPressedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$OnExploreAllRoutesClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$ProceedClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$QuickFilterTabClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$RecentTripClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$ScrollDirectionChangedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$SearchStopFieldUpdatedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$SearchStopUpdateFieldClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$TimeEditFieldClickIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$ToggleSearchStopsClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$ToolTipOkClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$UpdateSelectedDateIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$UpdateSelectedTimeIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TripPlannerResultIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$DateEditOptionClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DateEditOptionClickedIntent extends TripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DateEditOptionClickedIntent f4764a = new DateEditOptionClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$DismissPickerDialogIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DismissPickerDialogIntent extends TripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissPickerDialogIntent f4765a = new DismissPickerDialogIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$FetchAndUpdateHopItineraryListIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FetchAndUpdateHopItineraryListIntent extends TripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f4766a;

        public FetchAndUpdateHopItineraryListIntent(boolean z) {
            this.f4766a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FetchAndUpdateHopItineraryListIntent) && this.f4766a == ((FetchAndUpdateHopItineraryListIntent) obj).f4766a;
        }

        public final int hashCode() {
            return this.f4766a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("FetchAndUpdateHopItineraryListIntent(forceUpdate=", ")", this.f4766a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$FragmentStartedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FragmentStartedIntent extends TripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FragmentStartedIntent f4767a = new FragmentStartedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$FragmentStoppedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FragmentStoppedIntent extends TripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FragmentStoppedIntent f4768a = new FragmentStoppedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$HopApiFetchFailedSnackbarRetryIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HopApiFetchFailedSnackbarRetryIntent extends TripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HopApiFetchFailedSnackbarRetryIntent f4769a = new HopApiFetchFailedSnackbarRetryIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$InitializationIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends TripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UniversalSearchDescriptiveLocationAppModel f4770a;
        public final UniversalSearchDescriptiveLocationAppModel b;

        public InitializationIntent(UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel, UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel2) {
            this.f4770a = universalSearchDescriptiveLocationAppModel;
            this.b = universalSearchDescriptiveLocationAppModel2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationIntent)) {
                return false;
            }
            InitializationIntent initializationIntent = (InitializationIntent) obj;
            return Intrinsics.d(this.f4770a, initializationIntent.f4770a) && Intrinsics.d(this.b, initializationIntent.b);
        }

        public final int hashCode() {
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel = this.f4770a;
            int iHashCode = (universalSearchDescriptiveLocationAppModel == null ? 0 : universalSearchDescriptiveLocationAppModel.hashCode()) * 31;
            UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel2 = this.b;
            return iHashCode + (universalSearchDescriptiveLocationAppModel2 != null ? universalSearchDescriptiveLocationAppModel2.hashCode() : 0);
        }

        public final String toString() {
            return "InitializationIntent(fromLocation=" + this.f4770a + ", toLocation=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$ItineraryClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItineraryClickedIntent extends TripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4771a;

        public ItineraryClickedIntent(String localId) {
            Intrinsics.i(localId, "localId");
            this.f4771a = localId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ItineraryClickedIntent) && Intrinsics.d(this.f4771a, ((ItineraryClickedIntent) obj).f4771a);
        }

        public final int hashCode() {
            return this.f4771a.hashCode();
        }

        public final String toString() {
            return vo1.B("ItineraryClickedIntent(localId=", this.f4771a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$LocationEnabledIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocationEnabledIntent extends TripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocationEnabledIntent f4772a = new LocationEnabledIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$OnBackPressedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnBackPressedIntent extends TripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBackPressedIntent f4773a = new OnBackPressedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$OnExploreAllRoutesClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnExploreAllRoutesClickedIntent extends TripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnExploreAllRoutesClickedIntent f4774a = new OnExploreAllRoutesClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$ProceedClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProceedClickedIntent extends TripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f4775a;

        public ProceedClickedIntent(boolean z) {
            this.f4775a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProceedClickedIntent) && this.f4775a == ((ProceedClickedIntent) obj).f4775a;
        }

        public final int hashCode() {
            return this.f4775a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("ProceedClickedIntent(isSearchStateSame=", ")", this.f4775a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$QuickFilterTabClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuickFilterTabClickedIntent extends TripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TripPlannerTabType f4776a;

        public QuickFilterTabClickedIntent(TripPlannerTabType tab) {
            Intrinsics.i(tab, "tab");
            this.f4776a = tab;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QuickFilterTabClickedIntent) && Intrinsics.d(this.f4776a, ((QuickFilterTabClickedIntent) obj).f4776a);
        }

        public final int hashCode() {
            return this.f4776a.hashCode();
        }

        public final String toString() {
            return "QuickFilterTabClickedIntent(tab=" + this.f4776a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$RecentTripClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RecentTripClickedIntent extends TripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4777a;

        public RecentTripClickedIntent(String tripId) {
            Intrinsics.i(tripId, "tripId");
            this.f4777a = tripId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RecentTripClickedIntent) && Intrinsics.d(this.f4777a, ((RecentTripClickedIntent) obj).f4777a);
        }

        public final int hashCode() {
            return this.f4777a.hashCode();
        }

        public final String toString() {
            return vo1.B("RecentTripClickedIntent(tripId=", this.f4777a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$ScrollDirectionChangedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ScrollDirectionChangedIntent extends TripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ScrollDirection f4778a;

        public ScrollDirectionChangedIntent(ScrollDirection direction) {
            Intrinsics.i(direction, "direction");
            this.f4778a = direction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrollDirectionChangedIntent) && this.f4778a == ((ScrollDirectionChangedIntent) obj).f4778a;
        }

        public final int hashCode() {
            return this.f4778a.hashCode();
        }

        public final String toString() {
            return "ScrollDirectionChangedIntent(direction=" + this.f4778a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$SearchStopFieldUpdatedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchStopFieldUpdatedIntent extends TripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UniversalSearchDescriptiveLocationAppModel f4779a;

        public SearchStopFieldUpdatedIntent(UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel) {
            this.f4779a = universalSearchDescriptiveLocationAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchStopFieldUpdatedIntent) && Intrinsics.d(this.f4779a, ((SearchStopFieldUpdatedIntent) obj).f4779a);
        }

        public final int hashCode() {
            return this.f4779a.hashCode();
        }

        public final String toString() {
            return "SearchStopFieldUpdatedIntent(location=" + this.f4779a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$SearchStopUpdateFieldClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchStopUpdateFieldClickedIntent extends TripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f4780a;

        public SearchStopUpdateFieldClickedIntent(boolean z) {
            this.f4780a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchStopUpdateFieldClickedIntent) && this.f4780a == ((SearchStopUpdateFieldClickedIntent) obj).f4780a;
        }

        public final int hashCode() {
            return this.f4780a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("SearchStopUpdateFieldClickedIntent(forFromStop=", ")", this.f4780a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$TimeEditFieldClickIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TimeEditFieldClickIntent extends TripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TimeEditFieldClickIntent f4781a = new TimeEditFieldClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$ToggleSearchStopsClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ToggleSearchStopsClickedIntent extends TripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ToggleSearchStopsClickedIntent f4782a = new ToggleSearchStopsClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$ToolTipOkClickedIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ToolTipOkClickedIntent extends TripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ToolTipOkClickedIntent f4783a = new ToolTipOkClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$UpdateSelectedDateIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateSelectedDateIntent extends TripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f4784a;

        public UpdateSelectedDateIntent(Long l) {
            this.f4784a = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateSelectedDateIntent) && Intrinsics.d(this.f4784a, ((UpdateSelectedDateIntent) obj).f4784a);
        }

        public final int hashCode() {
            Long l = this.f4784a;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public final String toString() {
            return "UpdateSelectedDateIntent(selectedDateMillis=" + this.f4784a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent$UpdateSelectedTimeIntent;", "Lapp/chalo/livetracking/tripplanner/ui/result/TripPlannerResultIntent;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateSelectedTimeIntent extends TripPlannerResultIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4785a;
        public final int b;

        public UpdateSelectedTimeIntent(int i, int i2) {
            this.f4785a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateSelectedTimeIntent)) {
                return false;
            }
            UpdateSelectedTimeIntent updateSelectedTimeIntent = (UpdateSelectedTimeIntent) obj;
            return this.f4785a == updateSelectedTimeIntent.f4785a && this.b == updateSelectedTimeIntent.b;
        }

        public final int hashCode() {
            return (this.f4785a * 31) + this.b;
        }

        public final String toString() {
            return pk0.f(this.f4785a, this.b, "UpdateSelectedTimeIntent(selectedHour=", ", selectedMin=", ")");
        }
    }
}
