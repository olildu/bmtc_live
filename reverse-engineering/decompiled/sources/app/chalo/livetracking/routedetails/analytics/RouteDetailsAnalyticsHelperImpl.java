package app.chalo.livetracking.routedetails.analytics;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.model.app.LiveSeatAvailabilityApplicable;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.RouteLiveDetailsAppModel;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.constants.Source;
import app.chalo.features.network.NetworkConnectionType;
import app.chalo.features.network.NetworkStateManager;
import app.chalo.features.network.NetworkType;
import app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketRouteStreamResponseAppModel;
import app.chalo.livetracking.routedetails.data.model.app.response.VehicleSeatAvailabilityDetailsAppModel;
import app.chalo.livetracking.routedetails.domain.PayForTicketFlowType;
import app.chalo.livetracking.ui.routedetailsscreen.RouteBookingType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/analytics/RouteDetailsAnalyticsHelperImpl;", "Lapp/chalo/livetracking/routedetails/analytics/RouteDetailsAnalyticsHelper;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteDetailsAnalyticsHelperImpl implements RouteDetailsAnalyticsHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f4385a;
    public final SystemHelper b;
    public final TimeUtilsContract c;
    public final NetworkStateManager d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4386a;

        static {
            int[] iArr = new int[RouteBookingType.values().length];
            try {
                iArr[RouteBookingType.AIRPORT_ROUTE_TICKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteBookingType.PREMIUM_BUS_TICKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RouteBookingType.PASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RouteBookingType.TICKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f4386a = iArr;
        }
    }

    public RouteDetailsAnalyticsHelperImpl(AnalyticsContract analyticsContract, SystemHelper systemHelper, TimeUtilsContract timeUtilsContract, NetworkStateManager networkStateManager) {
        this.f4385a = analyticsContract;
        this.b = systemHelper;
        this.c = timeUtilsContract;
        this.d = networkStateManager;
    }

    @Override // app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper
    public final void a(String name, Map map, boolean z) {
        Intrinsics.i(name, "name");
        AnalyticsContract.DefaultImpls.a(this.f4385a, name, "route details screen", map, null, z, 8);
    }

    @Override // app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper
    public final void b(String str, Map map) {
        this.f4385a.F(str, "route details screen", map);
    }

    @Override // app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper
    public final void c(String routeId, String routeName, LiveSeatAvailabilityApplicable liveSeatAvailabilityApplicable, ArrayList arrayList) {
        int i;
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(liveSeatAvailabilityApplicable, "liveSeatAvailabilityApplicable");
        int i2 = 0;
        if (liveSeatAvailabilityApplicable.equals(LiveSeatAvailabilityApplicable.No.INSTANCE)) {
            i = 0;
        } else {
            if (!(liveSeatAvailabilityApplicable instanceof LiveSeatAvailabilityApplicable.Yes)) {
                throw new NoWhenBranchMatchedException();
            }
            i = ((LiveSeatAvailabilityApplicable.Yes) liveSeatAvailabilityApplicable).c;
        }
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            VehicleSeatAvailabilityDetailsAppModel vehicleSeatAvailabilityDetailsAppModel = (VehicleSeatAvailabilityDetailsAppModel) obj;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("vehicle no", vehicleSeatAvailabilityDetailsAppModel.f4397a);
            linkedHashMap.put("seat status", vehicleSeatAvailabilityDetailsAppModel.b.name());
            linkedHashMap.put("route id", routeId);
            linkedHashMap.put("route name", routeName);
            linkedHashMap.put("seat occupancy api mode", Integer.valueOf(i));
            linkedHashMap.put("time", Long.valueOf(this.b.j()));
            a("seat status", linkedHashMap, true);
        }
    }

    @Override // app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper
    public final void d(RouteBookingType bookingType, boolean z, String str, RouteAppModel routeAppModel) {
        String str2;
        Intrinsics.i(bookingType, "bookingType");
        Intrinsics.i(routeAppModel, "routeAppModel");
        RouteLiveDetailsAppModel routeLiveDetailsAppModel = routeAppModel.p;
        int i = WhenMappings.f4386a[bookingType.ordinal()];
        if (i == 1 || i == 2) {
            str2 = "premium bus hook route details rendered";
        } else {
            str2 = "mticket hook route details rendered";
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        long j = this.b.j();
        TimeUtilsContract timeUtilsContract = this.c;
        String strX = timeUtilsContract.x(j);
        String strQ = timeUtilsContract.Q(j);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("isUserLoggedIn", Boolean.valueOf(z));
        linkedHashMap.put("city", str);
        linkedHashMap.put("agency", routeAppModel.j);
        linkedHashMap.put("upTripRouteId", routeAppModel.b);
        linkedHashMap.put("isFreeRide", Boolean.valueOf(routeAppModel.k));
        linkedHashMap.put("time", strX);
        linkedHashMap.put(CLConstants.SHARED_PREFERENCE_ITEM_DATE, strQ);
        linkedHashMap.put("isAirportRoute", Boolean.valueOf(routeLiveDetailsAppModel.c));
        linkedHashMap.put("isChaloBusRoute", Boolean.valueOf(routeLiveDetailsAppModel.d));
        a(str2, linkedHashMap, true);
    }

    @Override // app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper
    public final void e(long j, String routeName, String stopId, String stopName) {
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        a("live eta fetch", MapsKt.i(new Pair("response time", Long.valueOf(this.b.j() - j)), new Pair("stop name", stopName), new Pair("stop id", stopId), new Pair("route id", routeName)), true);
    }

    @Override // app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper
    public final void f(String str, Boolean bool) {
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("source", str));
        if (bool != null) {
            linkedHashMapK.put("isTimetableAvailable", bool);
        }
        a("view schedule clicked", linkedHashMapK, true);
    }

    @Override // app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper
    public final void g(String str, String routeId, String routeName, boolean z, int i, boolean z2, int i2, int i3, int i4) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("source", str);
        linkedHashMap.put("route name", routeName);
        linkedHashMap.put("route id", routeId);
        linkedHashMap.put("isShortTripAvailable", Boolean.valueOf(z));
        linkedHashMap.put("stop_index", Integer.valueOf(i));
        linkedHashMap.put("isBusVisibleOnMap", Boolean.valueOf(z2));
        linkedHashMap.put("totalActiveBuses", Integer.valueOf(i2));
        linkedHashMap.put("noOfHaltedBuses", Integer.valueOf(i3));
        linkedHashMap.put("noOfDelayedBuses", Integer.valueOf(i4));
        a("route details activity open", linkedHashMap, true);
    }

    @Override // app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper
    public final void h(String eventName, StopDetailsForAnalytics stopDetailsForAnalytics, StopDetailsForAnalytics stopDetailsForAnalytics2, String str, Double d) {
        String str2;
        String str3;
        Intrinsics.i(eventName, "eventName");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("stop id", stopDetailsForAnalytics2.b);
        linkedHashMap.put("stop name", stopDetailsForAnalytics2.f4387a);
        linkedHashMap.put("stopPosition", Integer.valueOf(stopDetailsForAnalytics2.c));
        if (stopDetailsForAnalytics == null || (str2 = stopDetailsForAnalytics.b) == null) {
            str2 = "";
        }
        linkedHashMap.put("previousStopId", str2);
        if (stopDetailsForAnalytics == null || (str3 = stopDetailsForAnalytics.f4387a) == null) {
            str3 = "";
        }
        linkedHashMap.put("previousStopName", str3);
        linkedHashMap.put("previousStopPosition", stopDetailsForAnalytics != null ? Integer.valueOf(stopDetailsForAnalytics.c) : "");
        if (d != null) {
            linkedHashMap.put("userDistanceFromStop", Double.valueOf(d.doubleValue()));
        }
        a(eventName, linkedHashMap, true);
    }

    @Override // app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper
    public final void i(String routeId, String str, boolean z, boolean z2, boolean z3) {
        Intrinsics.i(routeId, "routeId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("isUserLoggedIn", Boolean.valueOf(z));
        linkedHashMap.put("city", str);
        linkedHashMap.put("upTripRouteId", routeId);
        linkedHashMap.put("isAirportRoute", Boolean.valueOf(z2));
        linkedHashMap.put("isChaloBusRoute", Boolean.valueOf(z3));
        a("route details reserve seat btn clicked", linkedHashMap, true);
    }

    @Override // app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper
    public final void j(String str, String routeId, String routeName, String stopId, String stopName, String etaStatus, String etaValue, boolean z, boolean z2, String stopEtaModel) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(etaStatus, "etaStatus");
        Intrinsics.i(etaValue, "etaValue");
        Intrinsics.i(stopEtaModel, "stopEtaModel");
        a("Report issue hook clicked", MapsKt.i(new Pair("route id", routeId), new Pair("city", str), new Pair("route name", routeName), new Pair("stop id", stopId), new Pair("stop name", stopName), new Pair("eta status", etaStatus), new Pair("eta value", etaValue), new Pair("isTimeTableShown", Boolean.valueOf(z)), new Pair("isSpecificScheduledTimeShown", Boolean.valueOf(z2)), new Pair("stop eta model", stopEtaModel)), true);
    }

    @Override // app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper
    public final void k(String routeId, String routeName, String stopId, String stopName) {
        Object objA;
        NetworkStateManager networkStateManager = this.d;
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("route id", routeId), new Pair("route name", routeName), new Pair("stop id", stopId), new Pair("stop name", stopName));
        try {
            NetworkType networkTypeA = networkStateManager.a();
            linkedHashMapK.put("connection status", ((NetworkConnectionType) networkStateManager.b().getValue()).name());
            linkedHashMapK.put("type", networkTypeA.name());
            objA = Unit.f17538a;
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        Throwable thA = Result.a(objA);
        if (thA != null) {
            linkedHashMapK.put("connection status", "Error");
            linkedHashMapK.put("error message", String.valueOf(thA.getMessage()));
        }
        AnalyticsContractImplKt.b(this.f4385a, "eta not received before timeout", Source.ROUTE_DETAILS, linkedHashMapK, false, 24);
    }

    @Override // app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper
    public final void l(String routeId, String routeName) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        a("route details pass booked clicked", MapsKt.i(new Pair("route id", routeId), new Pair("route name", routeName)), true);
    }

    @Override // app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper
    public final void m(String routeName) {
        Intrinsics.i(routeName, "routeName");
        a("checkin initiated", MapsKt.i(new Pair("source", "route details screen"), new Pair("mode", ChaloTransitMode.BUS), new Pair("route", routeName)), true);
    }

    @Override // app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper
    public final void n(String busAvailabilityId) {
        Intrinsics.i(busAvailabilityId, "busAvailabilityId");
        a("availability route banner", MapsKt.i(new Pair("availability priority", busAvailabilityId), new Pair("availability banner sticky", Boolean.TRUE)), true);
    }

    @Override // app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper
    public final void o(String routeName, List routeStopsList, boolean z, RealtimeSocketRouteStreamResponseAppModel realtimeSocketRouteStreamResponseAppModel, String str, long j) {
        Object next;
        Object next2;
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(routeStopsList, "routeStopsList");
        Pair pair = new Pair("routeName", routeName);
        Pair pair2 = new Pair("validBusTrip", Boolean.TRUE);
        Pair pair3 = new Pair("busCoversUserDestination", Boolean.valueOf(z));
        Pair pair4 = new Pair("vehicleDetails", realtimeSocketRouteStreamResponseAppModel.toString());
        List list = routeStopsList;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((StopAppModel) next).f1727a, realtimeSocketRouteStreamResponseAppModel.g));
        StopAppModel stopAppModel = (StopAppModel) next;
        Pair pair5 = new Pair("busNextStop", String.valueOf(stopAppModel != null ? stopAppModel.b : null));
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!Intrinsics.d(((StopAppModel) next2).f1727a, realtimeSocketRouteStreamResponseAppModel.h));
        StopAppModel stopAppModel2 = (StopAppModel) next2;
        b("LIVE VEHICLE DETAILS", MapsKt.i(pair, pair2, pair3, pair4, pair5, new Pair("busLastStop", String.valueOf(stopAppModel2 != null ? stopAppModel2.b : null)), new Pair("userDestinationStop", String.valueOf(str)), new Pair("dataTimestamp", Long.valueOf(j))));
    }

    @Override // app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper
    public final void p(String str, String routeId, String routeName, String stopId, String stopName) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        a("report problem clicked", MapsKt.i(new Pair("route id", routeId), new Pair("city", str), new Pair("route name", routeName), new Pair("stop id", stopId), new Pair("stop name", stopName), new Pair("problemSource", "route details screen"), new Pair("type", "stopEta")), true);
    }

    @Override // app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper
    public final void q(String str, String routeName, String fromStopNAme, String toStopName) {
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(fromStopNAme, "fromStopNAme");
        Intrinsics.i(toStopName, "toStopName");
        a(str, MapsKt.i(new Pair("mode", "BUS"), new Pair("route name", routeName), new Pair("from", fromStopNAme), new Pair(TypedValues.TransitionType.S_TO, toStopName), new Pair("source", "route details screen")), true);
    }

    @Override // app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper
    public final void r(int i, String str, String routeId, String routeName) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        a("Route destination stop screen open", MapsKt.i(new Pair("route name", routeName), new Pair("route id", routeId), new Pair("totalStops", String.valueOf(i)), new Pair("source", str)), true);
    }

    @Override // app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper
    public final void s(PayForTicketFlowType ticketFlow, String str, String str2) {
        Intrinsics.i(ticketFlow, "ticketFlow");
        a("route details pay for ticket clicked", MapsKt.i(new Pair("route id", str), new Pair("route name", str2), new Pair("type", ticketFlow.name())), true);
    }

    @Override // app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper
    public final void t(ArrayList arrayList, ArrayList arrayList2, String str, String str2, String routeId, String routeName, String str3, String str4, Boolean bool) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        String strO = CollectionsKt.O(arrayList, ", ", null, null, null, 62);
        String strO2 = CollectionsKt.O(arrayList2, ". ", null, null, null, 62);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tagIds", strO);
        linkedHashMap.put("tagNames", strO2);
        linkedHashMap.put("comment", str);
        linkedHashMap.put("type", "stopEta");
        linkedHashMap.put("cityName", str2);
        linkedHashMap.put("route id", routeId);
        linkedHashMap.put("route name", routeName);
        if (str3 != null) {
            linkedHashMap.put("stop id", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("stop name", str4);
        }
        if (bool != null) {
            linkedHashMap.put("isEtaShown", bool);
        }
        a("report problem submitted", linkedHashMap, true);
    }

    @Override // app.chalo.livetracking.routedetails.analytics.RouteDetailsAnalyticsHelper
    public final void u(String routeId, String routeName, String selectedStopId, String selectedStopName) {
        Intrinsics.i(routeId, "routeId");
        Intrinsics.i(routeName, "routeName");
        Intrinsics.i(selectedStopId, "selectedStopId");
        Intrinsics.i(selectedStopName, "selectedStopName");
        a("eta screen open", MapsKt.i(new Pair("route name", routeName), new Pair("stop name", selectedStopName), new Pair("stop id", selectedStopId), new Pair("route id", routeId)), true);
    }
}
