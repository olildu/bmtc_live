package app.chalo.livetracking.routedetails.analytics;

import app.chalo.citydata.data.model.app.LiveSeatAvailabilityApplicable;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketRouteStreamResponseAppModel;
import app.chalo.livetracking.routedetails.domain.PayForTicketFlowType;
import app.chalo.livetracking.ui.routedetailsscreen.RouteBookingType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/analytics/RouteDetailsAnalyticsHelper;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RouteDetailsAnalyticsHelper {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void a(RouteDetailsAnalyticsHelper routeDetailsAnalyticsHelper, String str, Map map, int i) {
            if ((i & 2) != 0) {
                map = null;
            }
            routeDetailsAnalyticsHelper.a(str, map, true);
        }
    }

    void a(String str, Map map, boolean z);

    void b(String str, Map map);

    void c(String str, String str2, LiveSeatAvailabilityApplicable liveSeatAvailabilityApplicable, ArrayList arrayList);

    void d(RouteBookingType routeBookingType, boolean z, String str, RouteAppModel routeAppModel);

    void e(long j, String str, String str2, String str3);

    void f(String str, Boolean bool);

    void g(String str, String str2, String str3, boolean z, int i, boolean z2, int i2, int i3, int i4);

    void h(String str, StopDetailsForAnalytics stopDetailsForAnalytics, StopDetailsForAnalytics stopDetailsForAnalytics2, String str2, Double d);

    void i(String str, String str2, boolean z, boolean z2, boolean z3);

    void j(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, String str8);

    void k(String str, String str2, String str3, String str4);

    void l(String str, String str2);

    void m(String str);

    void n(String str);

    void o(String str, List list, boolean z, RealtimeSocketRouteStreamResponseAppModel realtimeSocketRouteStreamResponseAppModel, String str2, long j);

    void p(String str, String str2, String str3, String str4, String str5);

    void q(String str, String str2, String str3, String str4);

    void r(int i, String str, String str2, String str3);

    void s(PayForTicketFlowType payForTicketFlowType, String str, String str2);

    void t(ArrayList arrayList, ArrayList arrayList2, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool);

    void u(String str, String str2, String str3, String str4);
}
