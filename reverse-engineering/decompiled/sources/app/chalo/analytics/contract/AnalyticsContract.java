package app.chalo.analytics.contract;

import app.chalo.analytics.events.AnalyticsFrequency;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/analytics/contract/AnalyticsContract;", "", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AnalyticsContract {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void a(AnalyticsContract analyticsContract, String str, String str2, Map map, AnalyticsFrequency analyticsFrequency, boolean z, int i) {
            if ((i & 4) != 0) {
                map = null;
            }
            Map map2 = map;
            if ((i & 8) != 0) {
                analyticsFrequency = AnalyticsFrequency.Always.b;
            }
            AnalyticsFrequency analyticsFrequency2 = analyticsFrequency;
            if ((i & 16) != 0) {
                z = true;
            }
            analyticsContract.e(str, str2, map2, analyticsFrequency2, z);
        }
    }

    void F(String str, String str2, Map map);

    void a(Map map);

    void b();

    void d(Map map);

    void e(String str, String str2, Map map, AnalyticsFrequency analyticsFrequency, boolean z);

    void g(double d, double d2);

    void o(String str);

    void q();

    void v(String str);

    void y();
}
