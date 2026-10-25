package app.chalo.livetracking.universalsearch.analytics;

import app.chalo.constants.Source;
import app.chalo.location.LatLng;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/analytics/UniversalSearchAnalyticsEventHelper;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface UniversalSearchAnalyticsEventHelper {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void a(UniversalSearchAnalyticsEventHelper universalSearchAnalyticsEventHelper, String str, Source source, Map map, int i) {
            if ((i & 4) != 0) {
                map = null;
            }
            universalSearchAnalyticsEventHelper.k(source, str, map);
        }
    }

    void a(String str);

    void b(String str);

    void c(String str, String str2, UniversalSearchItemType universalSearchItemType, String str3, boolean z, String str4);

    void d(String str, String str2, String str3, boolean z, UniversalSearchItemType universalSearchItemType, String str4, boolean z2, String str5);

    void e(long j, String str, String str2, String str3, List list, Long l);

    void f(String str, UniversalSearchItemType universalSearchItemType, String str2, boolean z, String str3);

    void g(String str, String str2, UniversalSearchItemType universalSearchItemType, String str3, String str4, String str5);

    void h(long j, String str, String str2, String str3, String str4, int i, int i2, int i3, UniversalSearchItemType universalSearchItemType, String str5, String str6, LatLng latLng, LatLng latLng2, boolean z);

    void i(long j, ChaloUseCaseResult chaloUseCaseResult, String str, String str2, String str3, long j2, LatLng latLng);

    void j(long j, String str, String str2, String str3);

    void k(Source source, String str, Map map);

    void l(long j, String str, String str2, int i);

    void m(long j, String str, String str2, String str3, List list, Long l);
}
