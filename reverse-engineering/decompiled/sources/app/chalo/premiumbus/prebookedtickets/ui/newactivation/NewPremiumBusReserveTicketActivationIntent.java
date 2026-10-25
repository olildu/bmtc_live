package app.chalo.premiumbus.prebookedtickets.ui.newactivation;

import app.chalo.compose.components.chalomap.MapCameraUpdate;
import app.chalo.data.PremiumBusProductModificationAdditionalInfoAppModel;
import app.chalo.data.PremiumBusProductOptionsAppModel;
import defpackage.cb0;
import defpackage.r1;
import defpackage.vo1;
import defpackage.xs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001c\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u0082\u0001\u001c\u001e\u001f !\"#$%&'()*+,-./0123456789¨\u0006:"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "", "InitializationIntent", "VerifyTicketClickedIntent", "MoreOptionsClickedIntent", "MoreOptionsItemClickedIntent", "DismissPickAndDropOffStopsListDialogIntent", "TicketExpiredDialogDismissIntent", "OnViewCancellationAndReschedulePolicyClickIntent", "BookingCancelledBottomSheetDismissIntent", "FragmentStartIntent", "FragmentStopIntent", "ShowOnMapsClickedIntent", "ShowStopsBetweenPickUpAndDropIntent", "TripCancellationConfirmationCancelRideCtaClickIntent", "RescheduleConfirmationRescheduleRideClickIntent", "TripCancellationConfirmationGoBackCtaClickIntent", "MapInteractionIntent", "RouteDetailsFetchFailedSnackBarRetryClicked", "RouteStopListStopClickedIntent", "OpenPassengerAllocatedSeatsDialog", "PBStopImageClickedIntent", "OnImageDialogDismissed", "HideBottomSheetIntent", "OnPostValidationScreenTabClickIntent", "OnBackPressedIntent", "DismissWomenSeatRescheduleWarningBannerIntent", "ToggleTrafficViewClicked", "TripCancellationConfirmationAdditionalInfoClickIntent", "TripCancellationConfirmationRescheduleRideClickIntent", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$BookingCancelledBottomSheetDismissIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$DismissPickAndDropOffStopsListDialogIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$DismissWomenSeatRescheduleWarningBannerIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$FragmentStartIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$FragmentStopIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$HideBottomSheetIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$InitializationIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$MapInteractionIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$MoreOptionsClickedIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$MoreOptionsItemClickedIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$OnBackPressedIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$OnImageDialogDismissed;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$OnPostValidationScreenTabClickIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$OnViewCancellationAndReschedulePolicyClickIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$OpenPassengerAllocatedSeatsDialog;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$PBStopImageClickedIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$RescheduleConfirmationRescheduleRideClickIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$RouteDetailsFetchFailedSnackBarRetryClicked;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$RouteStopListStopClickedIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$ShowOnMapsClickedIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$ShowStopsBetweenPickUpAndDropIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$TicketExpiredDialogDismissIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$ToggleTrafficViewClicked;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$TripCancellationConfirmationAdditionalInfoClickIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$TripCancellationConfirmationCancelRideCtaClickIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$TripCancellationConfirmationGoBackCtaClickIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$TripCancellationConfirmationRescheduleRideClickIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$VerifyTicketClickedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NewPremiumBusReserveTicketActivationIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$BookingCancelledBottomSheetDismissIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BookingCancelledBottomSheetDismissIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f7367a;

        public BookingCancelledBottomSheetDismissIntent(boolean z) {
            this.f7367a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BookingCancelledBottomSheetDismissIntent) && this.f7367a == ((BookingCancelledBottomSheetDismissIntent) obj).f7367a;
        }

        public final int hashCode() {
            return this.f7367a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("BookingCancelledBottomSheetDismissIntent(shouldShowBookingDetails=", ")", this.f7367a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$DismissPickAndDropOffStopsListDialogIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DismissPickAndDropOffStopsListDialogIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissPickAndDropOffStopsListDialogIntent f7368a = new DismissPickAndDropOffStopsListDialogIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissPickAndDropOffStopsListDialogIntent);
        }

        public final int hashCode() {
            return -1715682253;
        }

        public final String toString() {
            return "DismissPickAndDropOffStopsListDialogIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$DismissWomenSeatRescheduleWarningBannerIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DismissWomenSeatRescheduleWarningBannerIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissWomenSeatRescheduleWarningBannerIntent f7369a = new DismissWomenSeatRescheduleWarningBannerIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissWomenSeatRescheduleWarningBannerIntent);
        }

        public final int hashCode() {
            return 703423789;
        }

        public final String toString() {
            return "DismissWomenSeatRescheduleWarningBannerIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$FragmentStartIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FragmentStartIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FragmentStartIntent f7370a = new FragmentStartIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FragmentStartIntent);
        }

        public final int hashCode() {
            return 909774362;
        }

        public final String toString() {
            return "FragmentStartIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$FragmentStopIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FragmentStopIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FragmentStopIntent f7371a = new FragmentStopIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FragmentStopIntent);
        }

        public final int hashCode() {
            return 1783245122;
        }

        public final String toString() {
            return "FragmentStopIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$HideBottomSheetIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HideBottomSheetIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HideBottomSheetIntent f7372a = new HideBottomSheetIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HideBottomSheetIntent);
        }

        public final int hashCode() {
            return -1797760390;
        }

        public final String toString() {
            return "HideBottomSheetIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$InitializationIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InitializationIntent f7373a = new InitializationIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InitializationIntent);
        }

        public final int hashCode() {
            return -973931536;
        }

        public final String toString() {
            return "InitializationIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$MapInteractionIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "MapLoaded", "AlignMap", "MapCameraUpdateLoaded", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$MapInteractionIntent$AlignMap;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$MapInteractionIntent$MapCameraUpdateLoaded;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$MapInteractionIntent$MapLoaded;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class MapInteractionIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$MapInteractionIntent$AlignMap;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$MapInteractionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AlignMap extends MapInteractionIntent {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final AlignMap f7374a = new AlignMap();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof AlignMap);
            }

            public final int hashCode() {
                return 483009343;
            }

            public final String toString() {
                return "AlignMap";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$MapInteractionIntent$MapCameraUpdateLoaded;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$MapInteractionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MapCameraUpdateLoaded extends MapInteractionIntent {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MapCameraUpdate f7375a;

            public MapCameraUpdateLoaded(MapCameraUpdate newUpdate) {
                Intrinsics.i(newUpdate, "newUpdate");
                this.f7375a = newUpdate;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MapCameraUpdateLoaded) && Intrinsics.d(this.f7375a, ((MapCameraUpdateLoaded) obj).f7375a);
            }

            public final int hashCode() {
                return this.f7375a.hashCode();
            }

            public final String toString() {
                return "MapCameraUpdateLoaded(newUpdate=" + this.f7375a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$MapInteractionIntent$MapLoaded;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$MapInteractionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MapLoaded extends MapInteractionIntent {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final MapLoaded f7376a = new MapLoaded();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof MapLoaded);
            }

            public final int hashCode() {
                return 1028819545;
            }

            public final String toString() {
                return "MapLoaded";
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$MoreOptionsClickedIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MoreOptionsClickedIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MoreOptionsClickedIntent f7377a = new MoreOptionsClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MoreOptionsClickedIntent);
        }

        public final int hashCode() {
            return 1553265966;
        }

        public final String toString() {
            return "MoreOptionsClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$MoreOptionsItemClickedIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MoreOptionsItemClickedIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusProductOptionsAppModel f7378a;
        public final boolean b;
        public final List c;

        public MoreOptionsItemClickedIntent(PremiumBusProductOptionsAppModel options, boolean z, List selectedSeats) {
            Intrinsics.i(options, "options");
            Intrinsics.i(selectedSeats, "selectedSeats");
            this.f7378a = options;
            this.b = z;
            this.c = selectedSeats;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoreOptionsItemClickedIntent)) {
                return false;
            }
            MoreOptionsItemClickedIntent moreOptionsItemClickedIntent = (MoreOptionsItemClickedIntent) obj;
            return Intrinsics.d(this.f7378a, moreOptionsItemClickedIntent.f7378a) && this.b == moreOptionsItemClickedIntent.b && Intrinsics.d(this.c, moreOptionsItemClickedIntent.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (((this.f7378a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MoreOptionsItemClickedIntent(options=");
            sb.append(this.f7378a);
            sb.append(", isRescheduleOptionAvailable=");
            sb.append(this.b);
            sb.append(", selectedSeats=");
            return xs.l(sb, this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$OnBackPressedIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBackPressedIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBackPressedIntent f7379a = new OnBackPressedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnBackPressedIntent);
        }

        public final int hashCode() {
            return 1922914436;
        }

        public final String toString() {
            return "OnBackPressedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$OnImageDialogDismissed;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnImageDialogDismissed extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnImageDialogDismissed f7380a = new OnImageDialogDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnImageDialogDismissed);
        }

        public final int hashCode() {
            return -2087205511;
        }

        public final String toString() {
            return "OnImageDialogDismissed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$OnPostValidationScreenTabClickIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnPostValidationScreenTabClickIntent extends NewPremiumBusReserveTicketActivationIntent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnPostValidationScreenTabClickIntent);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "OnPostValidationScreenTabClickIntent(tab=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$OnViewCancellationAndReschedulePolicyClickIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnViewCancellationAndReschedulePolicyClickIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7381a;

        public OnViewCancellationAndReschedulePolicyClickIntent(String userCancellationAndReschedulePolicyWebUrl) {
            Intrinsics.i(userCancellationAndReschedulePolicyWebUrl, "userCancellationAndReschedulePolicyWebUrl");
            this.f7381a = userCancellationAndReschedulePolicyWebUrl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnViewCancellationAndReschedulePolicyClickIntent) && Intrinsics.d(this.f7381a, ((OnViewCancellationAndReschedulePolicyClickIntent) obj).f7381a);
        }

        public final int hashCode() {
            return this.f7381a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnViewCancellationAndReschedulePolicyClickIntent(userCancellationAndReschedulePolicyWebUrl=", this.f7381a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$OpenPassengerAllocatedSeatsDialog;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OpenPassengerAllocatedSeatsDialog extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f7382a;

        public OpenPassengerAllocatedSeatsDialog(List allocatedSeats) {
            Intrinsics.i(allocatedSeats, "allocatedSeats");
            this.f7382a = allocatedSeats;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenPassengerAllocatedSeatsDialog) && Intrinsics.d(this.f7382a, ((OpenPassengerAllocatedSeatsDialog) obj).f7382a);
        }

        public final int hashCode() {
            return this.f7382a.hashCode();
        }

        public final String toString() {
            return r1.d("OpenPassengerAllocatedSeatsDialog(allocatedSeats=", ")", this.f7382a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$PBStopImageClickedIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PBStopImageClickedIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7383a;
        public final NewPremiumReserveTicketDetailsScreenType b;

        public PBStopImageClickedIntent(int i, NewPremiumReserveTicketDetailsScreenType screenType) {
            Intrinsics.i(screenType, "screenType");
            this.f7383a = i;
            this.b = screenType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PBStopImageClickedIntent)) {
                return false;
            }
            PBStopImageClickedIntent pBStopImageClickedIntent = (PBStopImageClickedIntent) obj;
            return this.f7383a == pBStopImageClickedIntent.f7383a && this.b == pBStopImageClickedIntent.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7383a * 31);
        }

        public final String toString() {
            return "PBStopImageClickedIntent(index=" + this.f7383a + ", screenType=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$RescheduleConfirmationRescheduleRideClickIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RescheduleConfirmationRescheduleRideClickIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusProductOptionsAppModel f7384a;
        public final int b;

        public RescheduleConfirmationRescheduleRideClickIntent(PremiumBusProductOptionsAppModel options, int i) {
            Intrinsics.i(options, "options");
            this.f7384a = options;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RescheduleConfirmationRescheduleRideClickIntent)) {
                return false;
            }
            RescheduleConfirmationRescheduleRideClickIntent rescheduleConfirmationRescheduleRideClickIntent = (RescheduleConfirmationRescheduleRideClickIntent) obj;
            return Intrinsics.d(this.f7384a, rescheduleConfirmationRescheduleRideClickIntent.f7384a) && this.b == rescheduleConfirmationRescheduleRideClickIntent.b;
        }

        public final int hashCode() {
            return (this.f7384a.hashCode() * 31) + this.b;
        }

        public final String toString() {
            return "RescheduleConfirmationRescheduleRideClickIntent(options=" + this.f7384a + ", noOfSeatCurrentlyBooked=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$RouteDetailsFetchFailedSnackBarRetryClicked;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteDetailsFetchFailedSnackBarRetryClicked extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RouteDetailsFetchFailedSnackBarRetryClicked f7385a = new RouteDetailsFetchFailedSnackBarRetryClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RouteDetailsFetchFailedSnackBarRetryClicked);
        }

        public final int hashCode() {
            return -1131609586;
        }

        public final String toString() {
            return "RouteDetailsFetchFailedSnackBarRetryClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$RouteStopListStopClickedIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteStopListStopClickedIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7386a;

        public RouteStopListStopClickedIntent(String stopId) {
            Intrinsics.i(stopId, "stopId");
            this.f7386a = stopId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RouteStopListStopClickedIntent) && Intrinsics.d(this.f7386a, ((RouteStopListStopClickedIntent) obj).f7386a);
        }

        public final int hashCode() {
            return this.f7386a.hashCode();
        }

        public final String toString() {
            return vo1.B("RouteStopListStopClickedIntent(stopId=", this.f7386a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$ShowOnMapsClickedIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowOnMapsClickedIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowOnMapsClickedIntent f7387a = new ShowOnMapsClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowOnMapsClickedIntent);
        }

        public final int hashCode() {
            return -165948196;
        }

        public final String toString() {
            return "ShowOnMapsClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$ShowStopsBetweenPickUpAndDropIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowStopsBetweenPickUpAndDropIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ShowStopsBetweenPickUpAndDropIntent f7388a = new ShowStopsBetweenPickUpAndDropIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowStopsBetweenPickUpAndDropIntent);
        }

        public final int hashCode() {
            return -1777155842;
        }

        public final String toString() {
            return "ShowStopsBetweenPickUpAndDropIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$TicketExpiredDialogDismissIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TicketExpiredDialogDismissIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TicketExpiredDialogDismissIntent f7389a = new TicketExpiredDialogDismissIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TicketExpiredDialogDismissIntent);
        }

        public final int hashCode() {
            return -875940679;
        }

        public final String toString() {
            return "TicketExpiredDialogDismissIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$ToggleTrafficViewClicked;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ToggleTrafficViewClicked extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f7390a;

        public ToggleTrafficViewClicked(boolean z) {
            this.f7390a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleTrafficViewClicked) && this.f7390a == ((ToggleTrafficViewClicked) obj).f7390a;
        }

        public final int hashCode() {
            return this.f7390a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("ToggleTrafficViewClicked(isChecked=", ")", this.f7390a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$TripCancellationConfirmationAdditionalInfoClickIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TripCancellationConfirmationAdditionalInfoClickIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusProductModificationAdditionalInfoAppModel f7391a;

        public TripCancellationConfirmationAdditionalInfoClickIntent(PremiumBusProductModificationAdditionalInfoAppModel premiumBusProductModificationAdditionalInfoAppModel) {
            this.f7391a = premiumBusProductModificationAdditionalInfoAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TripCancellationConfirmationAdditionalInfoClickIntent) && Intrinsics.d(this.f7391a, ((TripCancellationConfirmationAdditionalInfoClickIntent) obj).f7391a);
        }

        public final int hashCode() {
            PremiumBusProductModificationAdditionalInfoAppModel premiumBusProductModificationAdditionalInfoAppModel = this.f7391a;
            if (premiumBusProductModificationAdditionalInfoAppModel == null) {
                return 0;
            }
            return premiumBusProductModificationAdditionalInfoAppModel.hashCode();
        }

        public final String toString() {
            return "TripCancellationConfirmationAdditionalInfoClickIntent(additionalInfo=" + this.f7391a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$TripCancellationConfirmationCancelRideCtaClickIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TripCancellationConfirmationCancelRideCtaClickIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusProductOptionsAppModel f7392a;
        public final int b;

        public TripCancellationConfirmationCancelRideCtaClickIntent(PremiumBusProductOptionsAppModel options, int i) {
            Intrinsics.i(options, "options");
            this.f7392a = options;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TripCancellationConfirmationCancelRideCtaClickIntent)) {
                return false;
            }
            TripCancellationConfirmationCancelRideCtaClickIntent tripCancellationConfirmationCancelRideCtaClickIntent = (TripCancellationConfirmationCancelRideCtaClickIntent) obj;
            return Intrinsics.d(this.f7392a, tripCancellationConfirmationCancelRideCtaClickIntent.f7392a) && this.b == tripCancellationConfirmationCancelRideCtaClickIntent.b;
        }

        public final int hashCode() {
            return (this.f7392a.hashCode() * 31) + this.b;
        }

        public final String toString() {
            return "TripCancellationConfirmationCancelRideCtaClickIntent(options=" + this.f7392a + ", noOfSeatCurrentlyBooked=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$TripCancellationConfirmationGoBackCtaClickIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TripCancellationConfirmationGoBackCtaClickIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusProductOptionsAppModel f7393a;

        public TripCancellationConfirmationGoBackCtaClickIntent(PremiumBusProductOptionsAppModel options) {
            Intrinsics.i(options, "options");
            this.f7393a = options;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TripCancellationConfirmationGoBackCtaClickIntent) && Intrinsics.d(this.f7393a, ((TripCancellationConfirmationGoBackCtaClickIntent) obj).f7393a);
        }

        public final int hashCode() {
            return this.f7393a.hashCode();
        }

        public final String toString() {
            return "TripCancellationConfirmationGoBackCtaClickIntent(options=" + this.f7393a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$TripCancellationConfirmationRescheduleRideClickIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TripCancellationConfirmationRescheduleRideClickIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusProductOptionsAppModel f7394a;
        public final List b;

        public TripCancellationConfirmationRescheduleRideClickIntent(PremiumBusProductOptionsAppModel options, List selectedSeats) {
            Intrinsics.i(options, "options");
            Intrinsics.i(selectedSeats, "selectedSeats");
            this.f7394a = options;
            this.b = selectedSeats;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TripCancellationConfirmationRescheduleRideClickIntent)) {
                return false;
            }
            TripCancellationConfirmationRescheduleRideClickIntent tripCancellationConfirmationRescheduleRideClickIntent = (TripCancellationConfirmationRescheduleRideClickIntent) obj;
            return Intrinsics.d(this.f7394a, tripCancellationConfirmationRescheduleRideClickIntent.f7394a) && Intrinsics.d(this.b, tripCancellationConfirmationRescheduleRideClickIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7394a.hashCode() * 31);
        }

        public final String toString() {
            return "TripCancellationConfirmationRescheduleRideClickIntent(options=" + this.f7394a + ", selectedSeats=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent$VerifyTicketClickedIntent;", "Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/NewPremiumBusReserveTicketActivationIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VerifyTicketClickedIntent extends NewPremiumBusReserveTicketActivationIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final VerifyTicketClickedIntent f7395a = new VerifyTicketClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof VerifyTicketClickedIntent);
        }

        public final int hashCode() {
            return -1993717590;
        }

        public final String toString() {
            return "VerifyTicketClickedIntent";
        }
    }
}
