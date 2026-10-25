package app.chalo.home.analytics;

import app.chalo.analytics.events.AnalyticsFrequency;
import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.constants.Source;
import app.chalo.home.ui.base.AppUpdateType;
import app.chalo.location.LatLng;
import app.chalo.location.LocationUpdateResult;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingCardData;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/analytics/HomeScreenAnalyticsHelper;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HomeScreenAnalyticsHelper {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void a(HomeScreenAnalyticsHelper homeScreenAnalyticsHelper, String str, Map map, Source source, int i) {
            if ((i & 2) != 0) {
                map = null;
            }
            homeScreenAnalyticsHelper.g(str, map, (i & 4) != 0 ? AnalyticsFrequency.Always.b : AnalyticsFrequency.Daily.b, true, source);
        }
    }

    void a(Map map);

    void b(int i, String str, String str2, String str3);

    void c(String str, SeatAvailabilityLevel seatAvailabilityLevel, long j, String str2);

    void d(Map map);

    void e(Source source, String str);

    void f(Source source);

    void g(String str, Map map, AnalyticsFrequency analyticsFrequency, boolean z, Source source);

    void h(AppUpdateType appUpdateType, Source source);

    void i(int i, Source source);

    void j(Source source);

    void k(LatLng latLng);

    void l(Source source);

    void m(Source source);

    void n(LocationUpdateResult locationUpdateResult, Source source);

    void o(Source source, String str, String str2);

    void p(Source source, String str);

    void q(String str, PremiumReserveTicketStatus premiumReserveTicketStatus, boolean z, Source source);

    void r(AppUpdateType appUpdateType, Source source);

    void s(Source source);

    void t(Source source, PremiumBusBookingCardData premiumBusBookingCardData);

    void u(Source source);

    void v(LatLng latLng, Source source);

    void w(Source source);
}
