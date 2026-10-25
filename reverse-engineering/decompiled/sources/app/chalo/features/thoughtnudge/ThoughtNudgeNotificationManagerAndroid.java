package app.chalo.features.thoughtnudge;

import android.content.Context;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.thoughtnudge.ThoughtNudgeNotificationManager;
import com.thoughtnudge.sdk.ThoughtNudge;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/features/thoughtnudge/ThoughtNudgeNotificationManagerAndroid;", "Lapp/chalo/thoughtnudge/ThoughtNudgeNotificationManager;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThoughtNudgeNotificationManagerAndroid extends ThoughtNudgeNotificationManager {
    public final Context c;
    public final SdkIntegrationPolicyManager d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/features/thoughtnudge/ThoughtNudgeNotificationManagerAndroid$Companion;", "", "", "TAG", "Ljava/lang/String;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ThoughtNudgeNotificationManagerAndroid(Context context, AnalyticsContract analyticsContract, SdkIntegrationPolicyManager sdkIntegrationPolicyManager) {
        super(analyticsContract, sdkIntegrationPolicyManager);
        this.c = context;
        this.d = sdkIntegrationPolicyManager;
    }

    @Override // app.chalo.thoughtnudge.ThoughtNudgeNotificationManager
    public final void b(String str, String str2, Map map) {
        if (this.d.f1078a.c) {
            try {
                Context applicationContext = this.c.getApplicationContext();
                Intrinsics.h(applicationContext, "getApplicationContext(...)");
                ThoughtNudge.handleMessage(applicationContext, map, str, str2);
            } catch (Exception unused) {
            }
        }
    }

    @Override // app.chalo.thoughtnudge.ThoughtNudgeNotificationManager
    public final boolean c(Map map) {
        if (!this.d.f1078a.c) {
            return false;
        }
        try {
            return ThoughtNudge.isThoughtNudgeNotification((Map<String, ?>) map);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // app.chalo.thoughtnudge.ThoughtNudgeNotificationManager
    public final void d(String token) {
        Intrinsics.i(token, "token");
        if (this.d.f1078a.c) {
            try {
                ThoughtNudge.onNewToken(token);
            } catch (Exception unused) {
            }
        }
    }
}
