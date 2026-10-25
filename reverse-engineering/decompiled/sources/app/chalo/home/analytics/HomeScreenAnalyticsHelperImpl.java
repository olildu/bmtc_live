package app.chalo.home.analytics;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.analytics.events.AnalyticsFrequency;
import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.constants.Source;
import app.chalo.home.ui.base.AppUpdateType;
import app.chalo.location.LatLng;
import app.chalo.location.LocationUpdateResult;
import app.chalo.location.SettingsResolutionException;
import app.chalo.models.LocationAppModel;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingCardData;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingTripTimeInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingVehicleInfoState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingStopSchedule;
import app.chalo.stoptripdetails.analytics.StopTripDetailsAnalyticsEventHelper;
import com.adjust.sdk.Constants;
import defpackage.vo1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/analytics/HomeScreenAnalyticsHelperImpl;", "Lapp/chalo/home/analytics/HomeScreenAnalyticsHelper;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeScreenAnalyticsHelperImpl implements HomeScreenAnalyticsHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f2866a;
    public final StopTripDetailsAnalyticsEventHelper b;

    public HomeScreenAnalyticsHelperImpl(AnalyticsContract analyticsContract, StopTripDetailsAnalyticsEventHelper stopTripDetailsAnalyticsEventHelper) {
        this.f2866a = analyticsContract;
        this.b = stopTripDetailsAnalyticsEventHelper;
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void a(Map map) {
        this.f2866a.a(map);
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void b(int i, String stopId, String stopName, String source) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(source, "source");
        this.b.b(i, stopId, stopName, source);
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void c(String vehicleNumber, SeatAvailabilityLevel seatStatus, long j, String screen) {
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        Intrinsics.i(seatStatus, "seatStatus");
        Intrinsics.i(screen, "screen");
        this.b.c(vehicleNumber, seatStatus, j, screen);
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void d(Map map) {
        this.f2866a.d(map);
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void e(Source source, String searchBarTitle) {
        Intrinsics.i(searchBarTitle, "searchBarTitle");
        Intrinsics.i(source, "source");
        AnalyticsContractImplKt.b(this.f2866a, "chalo search bar clicked", source, vo1.s("search bar title", searchBarTitle), false, 24);
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void f(Source source) {
        Intrinsics.i(source, "source");
        AnalyticsContractImplKt.b(this.f2866a, "location settings unavailable", source, null, false, 28);
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void g(String str, Map map, AnalyticsFrequency frequency, boolean z, Source source) {
        Intrinsics.i(frequency, "frequency");
        Intrinsics.i(source, "source");
        AnalyticsContractImplKt.b(this.f2866a, str, source, map, z, 8);
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void h(AppUpdateType type, Source source) {
        Intrinsics.i(type, "type");
        Intrinsics.i(source, "source");
        HomeScreenAnalyticsHelper.DefaultImpls.a(this, "app update cancel clicked", vo1.s("updateType", type.name()), source, 12);
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void i(int i, Source source) {
        Intrinsics.i(source, "source");
        AnalyticsContractImplKt.b(this.f2866a, "regular bus page recent search card clicked", source, vo1.s("card position", String.valueOf(i)), false, 24);
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void j(Source source) {
        Intrinsics.i(source, "source");
        AnalyticsContractImplKt.b(this.f2866a, "ocr tutorial bottomsheet next clicked", source, null, false, 28);
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void k(LatLng latLng) {
        Intrinsics.i(latLng, "latLng");
        this.f2866a.g(latLng.f5134a, latLng.b);
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void l(Source source) {
        Intrinsics.i(source, "source");
        AnalyticsContractImplKt.b(this.f2866a, "city not supported prompt open", source, null, false, 28);
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void m(Source source) {
        Intrinsics.i(source, "source");
        AnalyticsContractImplKt.b(this.f2866a, "gps request on", source, null, false, 28);
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void n(LocationUpdateResult result, Source source) {
        String str;
        Map mapD;
        Intrinsics.i(result, "result");
        Intrinsics.i(source, "source");
        boolean z = result instanceof LocationUpdateResult.GeneralException;
        LocationUpdateResult.SettingsUnavailable settingsUnavailable = LocationUpdateResult.SettingsUnavailable.f5158a;
        LocationUpdateResult.NoValidLocation noValidLocation = LocationUpdateResult.NoValidLocation.f5155a;
        LocationUpdateResult.Initiated initiated = LocationUpdateResult.Initiated.f5152a;
        if (z) {
            str = "location manager general error";
        } else if (result.equals(initiated)) {
            str = "location manager initiated";
        } else if (result instanceof LocationUpdateResult.LocationFetchFailed) {
            str = "location manager location fetch failed";
        } else if (result instanceof LocationUpdateResult.RequestLocationPermission) {
            str = "location manager permission not granted";
        } else if (result instanceof LocationUpdateResult.LocationReceived) {
            str = "location manager location received";
        } else if (result.equals(noValidLocation)) {
            str = "location manager no valid location";
        } else if (result instanceof LocationUpdateResult.SettingsResolutionRequired) {
            str = "location manager resolution required";
        } else {
            if (!result.equals(settingsUnavailable)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "location manager settings unavailable";
        }
        String str2 = str;
        if (z) {
            Exception exc = ((LocationUpdateResult.GeneralException) result).f5151a;
            mapD = vo1.s("errorMsg", String.valueOf(exc != null ? exc.getMessage() : null));
        } else if (result instanceof LocationUpdateResult.LocationReceived) {
            LocationAppModel locationAppModel = ((LocationUpdateResult.LocationReceived) result).f5154a;
            mapD = MapsKt.i(new Pair("lat", String.valueOf(locationAppModel.f5586a)), new Pair(Constants.LONG, String.valueOf(locationAppModel.b)));
        } else if (result instanceof LocationUpdateResult.SettingsResolutionRequired) {
            SettingsResolutionException settingsResolutionException = ((LocationUpdateResult.SettingsResolutionRequired) result).f5157a;
            mapD = MapsKt.i(new Pair("errorCode", String.valueOf(settingsResolutionException.b)), new Pair("errorMsg", String.valueOf(settingsResolutionException.c)));
        } else {
            if (!result.equals(initiated) && !result.equals(settingsUnavailable) && !result.equals(noValidLocation) && !(result instanceof LocationUpdateResult.LocationFetchFailed) && !(result instanceof LocationUpdateResult.RequestLocationPermission)) {
                throw new NoWhenBranchMatchedException();
            }
            mapD = MapsKt.d();
        }
        AnalyticsContractImplKt.b(this.f2866a, str2, source, mapD, false, 24);
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void o(Source source, String defaultTime, String selectedTime) {
        Intrinsics.i(source, "source");
        Intrinsics.i(defaultTime, "defaultTime");
        Intrinsics.i(selectedTime, "selectedTime");
        AnalyticsContractImplKt.b(this.f2866a, "pb preferred time submitted", source, MapsKt.i(new Pair("default time date", defaultTime), new Pair("input time date", selectedTime)), false, 24);
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void p(Source source, String str) {
        Intrinsics.i(source, "source");
        AnalyticsContractImplKt.b(this.f2866a, "city change prompt open", source, vo1.s("inCity", str), false, 24);
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void q(String bookingId, PremiumReserveTicketStatus ticketStatus, boolean z, Source source) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(ticketStatus, "ticketStatus");
        Intrinsics.i(source, "source");
        AnalyticsContractImplKt.b(this.f2866a, "premium reserve ticket ack cta clicked", source, MapsKt.i(new Pair("bookingId", bookingId), new Pair("ticketStatus", ticketStatus.name()), new Pair("pbAckCtaType", z ? CLConstants.DROP_LIST_DETAILS_LABEL : "Okay")), false, 24);
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void r(AppUpdateType type, Source source) {
        Intrinsics.i(type, "type");
        Intrinsics.i(source, "source");
        HomeScreenAnalyticsHelper.DefaultImpls.a(this, "app update install clicked", vo1.s("updateType", type.name()), source, 12);
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void s(Source source) {
        Intrinsics.i(source, "source");
        AnalyticsContractImplKt.b(this.f2866a, "home screen bottom nav search tab clicked", source, null, false, 28);
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void t(Source source, PremiumBusBookingCardData cardData) {
        String str;
        Intrinsics.i(source, "source");
        Intrinsics.i(cardData, "cardData");
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("userAction", "SPECIFIC_USER_BOOKING_ACTION"), new Pair("premiumBusStackType", "NATIVE_STACK"));
        PremiumBusBookingTripTimeInfoState premiumBusBookingTripTimeInfoState = cardData.h;
        premiumBusBookingTripTimeInfoState.getClass();
        if (premiumBusBookingTripTimeInfoState.equals(PremiumBusBookingTripTimeInfoState.NotFetched.b)) {
            linkedHashMapK.put("tripTimeState", "Loading");
        } else if (premiumBusBookingTripTimeInfoState.equals(PremiumBusBookingTripTimeInfoState.BusPassedPickupStop.b)) {
            linkedHashMapK.put("tripTimeState", "BusPassedPickupStop");
            linkedHashMapK.put("eta", "-1");
        } else if (premiumBusBookingTripTimeInfoState instanceof PremiumBusBookingTripTimeInfoState.ExpectedTime) {
            linkedHashMapK.put("tripTimeState", "TripNotStarted");
            linkedHashMapK.put("expected_pickup_time", ((PremiumBusBookingTripTimeInfoState.ExpectedTime) premiumBusBookingTripTimeInfoState).b);
        } else if (premiumBusBookingTripTimeInfoState instanceof PremiumBusBookingTripTimeInfoState.LiveEta) {
            linkedHashMapK.put("tripTimeState", "TripStarted");
            linkedHashMapK.put("eta", ((PremiumBusBookingTripTimeInfoState.LiveEta) premiumBusBookingTripTimeInfoState).b);
        } else if (!premiumBusBookingTripTimeInfoState.equals(PremiumBusBookingTripTimeInfoState.LiveEtaNotAvailable.b)) {
            throw new NoWhenBranchMatchedException();
        }
        PremiumBusBookingVehicleInfoState premiumBusBookingVehicleInfoState = cardData.e;
        premiumBusBookingVehicleInfoState.getClass();
        if (premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.NotFetched) {
            linkedHashMapK.put("vehicleState", "Loading");
        } else if (premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.VehicleAssigned) {
            linkedHashMapK.put("vehicleState", "VehicleAssigned");
            PremiumBusBookingVehicleInfoState.VehicleAssigned vehicleAssigned = (PremiumBusBookingVehicleInfoState.VehicleAssigned) premiumBusBookingVehicleInfoState;
            linkedHashMapK.put("vehicleNo", vehicleAssigned.b);
            linkedHashMapK.put("tripStatus", vehicleAssigned.c.name());
        } else {
            if (!(premiumBusBookingVehicleInfoState instanceof PremiumBusBookingVehicleInfoState.VehicleNotAssigned)) {
                throw new NoWhenBranchMatchedException();
            }
            linkedHashMapK.put("vehicleState", "NotAssigned");
        }
        PremiumBusPostBookingStopSchedule premiumBusPostBookingStopSchedule = cardData.f;
        PremiumBusPostBookingStopSchedule.ScheduleAvailable scheduleAvailable = premiumBusPostBookingStopSchedule instanceof PremiumBusPostBookingStopSchedule.ScheduleAvailable ? (PremiumBusPostBookingStopSchedule.ScheduleAvailable) premiumBusPostBookingStopSchedule : null;
        if (scheduleAvailable == null || (str = scheduleAvailable.f7428a) == null) {
            str = "";
        }
        linkedHashMapK.put("scheduled_pickup_time", str);
        AnalyticsContract analyticsContract = this.f2866a;
        AnalyticsContractImplKt.b(analyticsContract, "premium service bus interaction", source, linkedHashMapK, false, 24);
        AnalyticsContractImplKt.b(analyticsContract, "pb homescreen book trip clicked", source, linkedHashMapK, false, 24);
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void u(Source source) {
        Intrinsics.i(source, "source");
        AnalyticsContractImplKt.b(this.f2866a, "chalo bus tab notification icon click", source, null, false, 28);
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void v(LatLng latLng, Source source) {
        Intrinsics.i(latLng, "latLng");
        Intrinsics.i(source, "source");
        AnalyticsContractImplKt.b(this.f2866a, "location update received", source, MapsKt.i(new Pair("lat", String.valueOf(latLng.f5134a)), new Pair(Constants.LONG, String.valueOf(latLng.b))), false, 24);
    }

    @Override // app.chalo.home.analytics.HomeScreenAnalyticsHelper
    public final void w(Source source) {
        Intrinsics.i(source, "source");
        AnalyticsContractImplKt.b(this.f2866a, "pb preferred time bottomsheet opened", source, null, false, 28);
    }
}
