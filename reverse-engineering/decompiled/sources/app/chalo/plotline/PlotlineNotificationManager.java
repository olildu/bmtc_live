package app.chalo.plotline;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import org.bouncycastle.i18n.ErrorBundle;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/plotline/PlotlineNotificationManager;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PlotlineNotificationManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f6841a;
    public final SdkIntegrationPolicyManager b;

    public PlotlineNotificationManager(AnalyticsContract analyticsContract, SdkIntegrationPolicyManager sdkIntegrationPolicyManager) {
        this.f6841a = analyticsContract;
        this.b = sdkIntegrationPolicyManager;
    }

    public static Map a(String str, Map map) {
        String string;
        String string2;
        String string3;
        Object obj = map.get("title");
        String str2 = "";
        if (obj != null && (string3 = obj.toString()) != null) {
            str = string3;
        } else if (str == null) {
            str = "";
        }
        Pair pair = new Pair("notificationTitle", str);
        Object obj2 = map.get(ErrorBundle.SUMMARY_ENTRY);
        if (obj2 == null || (string = obj2.toString()) == null) {
            string = "";
        }
        Pair pair2 = new Pair("notificationMessage", string);
        Object obj3 = map.get("customData");
        if (obj3 != null && (string2 = obj3.toString()) != null) {
            str2 = string2;
        }
        return MapsKt.i(pair, pair2, new Pair("notificationData", str2));
    }

    public static LinkedHashMap d(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.g(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return linkedHashMap;
    }

    public abstract boolean b(Map map);

    public abstract void c(String str);

    public abstract void e();

    public abstract void f(LinkedHashMap linkedHashMap);
}
