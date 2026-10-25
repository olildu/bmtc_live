package app.chalo.stoptripdetails.analytics;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.analytics.events.AnalyticsFrequency;
import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.domain.FireAppOpenEventIfRequiredUseCase;
import app.chalo.utils.StopTripDetailsUtils;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/analytics/StopTripDetailsAnalyticsEventHelperImpl;", "Lapp/chalo/stoptripdetails/analytics/StopTripDetailsAnalyticsEventHelper;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StopTripDetailsAnalyticsEventHelperImpl implements StopTripDetailsAnalyticsEventHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f9458a;
    public final SystemHelper b;
    public final TimeUtilsContract c;
    public final FireAppOpenEventIfRequiredUseCase d;

    public StopTripDetailsAnalyticsEventHelperImpl(AnalyticsContract analyticsContract, SystemHelper systemHelper, TimeUtilsContract timeUtilsContract, FireAppOpenEventIfRequiredUseCase fireAppOpenEventIfRequiredUseCase) {
        this.f9458a = analyticsContract;
        this.b = systemHelper;
        this.c = timeUtilsContract;
        this.d = fireAppOpenEventIfRequiredUseCase;
    }

    @Override // app.chalo.stoptripdetails.analytics.StopTripDetailsAnalyticsEventHelper
    public final void a(String stopName, String source, String routeName) {
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(source, "source");
        Intrinsics.i(routeName, "routeName");
        AnalyticsContract.DefaultImpls.a(this.f9458a, "stop eta seen - multiple routes", source, MapsKt.i(new Pair("stopName", stopName), new Pair("route name", routeName), new Pair("hourOfEvent", Integer.valueOf(this.c.N(this.b.j())))), AnalyticsFrequency.Hourly.b, false, 16);
    }

    @Override // app.chalo.stoptripdetails.analytics.StopTripDetailsAnalyticsEventHelper
    public final void b(int i, String stopId, String stopName, String source) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this.f9458a, "Eta Seen", source, MapsKt.i(new Pair("stopId", stopId), new Pair("stopName", stopName), new Pair("etaCount", Integer.valueOf(i))), null, false, 24);
    }

    @Override // app.chalo.stoptripdetails.analytics.StopTripDetailsAnalyticsEventHelper
    public final void c(String vehicleNumber, SeatAvailabilityLevel seatStatus, long j, String screen) {
        int i;
        Intrinsics.i(vehicleNumber, "vehicleNumber");
        Intrinsics.i(seatStatus, "seatStatus");
        Intrinsics.i(screen, "screen");
        Pair pair = new Pair("vehicle no", vehicleNumber);
        int i2 = StopTripDetailsUtils.WhenMappings.b[seatStatus.ordinal()];
        if (i2 == 1) {
            i = 0;
        } else if (i2 == 2) {
            i = 1;
        } else if (i2 == 3) {
            i = 2;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = -1;
        }
        AnalyticsContract.DefaultImpls.a(this.f9458a, "seat status", "", MapsKt.i(pair, new Pair("seat status", Integer.valueOf(i)), new Pair("time", Long.valueOf(j)), new Pair("event happened on screen:", screen)), null, false, 24);
    }

    @Override // app.chalo.stoptripdetails.analytics.StopTripDetailsAnalyticsEventHelper
    public final void d(String screenName, String source, String tag) {
        Intrinsics.i(screenName, "screenName");
        Intrinsics.i(source, "source");
        Intrinsics.i(tag, "tag");
        AnalyticsContract.DefaultImpls.a(this.f9458a, "inbound traffic", source, MapsKt.i(new Pair(PaymentConstants.Event.SCREEN, screenName), new Pair("tag", tag)), null, false, 24);
    }

    @Override // app.chalo.stoptripdetails.analytics.StopTripDetailsAnalyticsEventHelper
    public final void e(String source) {
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this.f9458a, "stop details screen opened", source, null, null, false, 28);
    }

    @Override // app.chalo.stoptripdetails.analytics.StopTripDetailsAnalyticsEventHelper
    public final void f(String stopId, String stopName, String transitMode, String source) {
        Intrinsics.i(stopId, "stopId");
        Intrinsics.i(stopName, "stopName");
        Intrinsics.i(transitMode, "transitMode");
        Intrinsics.i(source, "source");
        AnalyticsContract.DefaultImpls.a(this.f9458a, "nearby station notification clicked", source, MapsKt.i(new Pair("stopId", stopId), new Pair("stopName", stopName), new Pair("stopMode", transitMode)), null, false, 24);
        this.d.e(source);
    }
}
