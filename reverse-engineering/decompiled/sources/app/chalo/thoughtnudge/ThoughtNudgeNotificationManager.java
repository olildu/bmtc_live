package app.chalo.thoughtnudge;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/thoughtnudge/ThoughtNudgeNotificationManager;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ThoughtNudgeNotificationManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f9623a;
    public final SdkIntegrationPolicyManager b;

    public ThoughtNudgeNotificationManager(AnalyticsContract analyticsContract, SdkIntegrationPolicyManager sdkIntegrationPolicyManager) {
        this.f9623a = analyticsContract;
        this.b = sdkIntegrationPolicyManager;
    }

    public static Map a(String str, String str2, Map map) {
        if (str == null) {
            str = "";
        }
        Pair pair = new Pair("notificationTitle", str);
        if (str2 == null) {
            str2 = "";
        }
        return MapsKt.i(pair, new Pair("notificationMessage", str2), new Pair("notificationData", map.toString()), new Pair("flowType", "ThoughtNudgeNotificationManager"));
    }

    public abstract void b(String str, String str2, Map map);

    public abstract boolean c(Map map);

    public abstract void d(String str);
}
