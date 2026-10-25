package app.chalo.plotline;

import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import app.chalo.R;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import defpackage.os0;
import defpackage.ym0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import so.plotline.insights.Database.u;
import so.plotline.insights.Helpers.q;
import so.plotline.insights.Models.x;
import so.plotline.insights.PlotlinePush;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/plotline/PlotlineNotificationManagerAndroid;", "Lapp/chalo/plotline/PlotlineNotificationManager;", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlotlineNotificationManagerAndroid extends PlotlineNotificationManager {
    public final Context c;
    public final AnalyticsContract d;
    public final SdkIntegrationPolicyManager e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/plotline/PlotlineNotificationManagerAndroid$Companion;", "", "", "PLOTLINE_CUSTOM_NOTIFICATION_ID", "Ljava/lang/String;", "NO_CUSTOM_ID_ASSIGNED", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public PlotlineNotificationManagerAndroid(Context context, AnalyticsContract analyticsContract, SdkIntegrationPolicyManager sdkIntegrationPolicyManager) {
        super(analyticsContract, sdkIntegrationPolicyManager);
        this.c = context;
        this.d = analyticsContract;
        this.e = sdkIntegrationPolicyManager;
    }

    @Override // app.chalo.plotline.PlotlineNotificationManager
    public final boolean b(Map map) {
        if (this.e.f1078a.b) {
            return new x(q.l(PlotlineNotificationManager.d(map))).f19521a;
        }
        return false;
    }

    @Override // app.chalo.plotline.PlotlineNotificationManager
    public final void c(String token) {
        Intrinsics.i(token, "token");
        if (this.e.f1078a.b) {
            Context context = this.c;
            Intrinsics.i(context, "context");
            PlotlinePush.g(context, token);
        }
    }

    @Override // app.chalo.plotline.PlotlineNotificationManager
    public final void e() {
        if (this.e.f1078a.b) {
            int i = R.drawable.logo_notification;
            Context context = this.c;
            Intrinsics.i(context, "context");
            u.d(context, "notificationSmallIcon", String.valueOf(i));
            PlotlinePush.h(context, NotificationManagerCompat.from(context).areNotificationsEnabled());
            os0 os0Var = new os0(new ym0(this, 27), 1);
            PlotlinePush.d().f19537a = os0Var;
            ArrayList arrayList = PlotlinePush.d().b;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                os0Var.b((JSONObject) obj);
            }
            PlotlinePush.d().b.clear();
        }
    }

    @Override // app.chalo.plotline.PlotlineNotificationManager
    public final void f(LinkedHashMap linkedHashMap) {
        if (this.e.f1078a.b) {
            Context context = this.c;
            Intrinsics.i(context, "context");
            PlotlinePush.i(context, linkedHashMap);
        }
    }
}
