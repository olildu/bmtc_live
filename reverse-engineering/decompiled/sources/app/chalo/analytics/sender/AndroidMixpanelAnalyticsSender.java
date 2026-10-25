package app.chalo.analytics.sender;

import android.content.Context;
import app.chalo.analytics.eventcredits.MixpanelEventsCreditsResolver;
import app.chalo.analytics.events.AnalyticsEvent;
import app.chalo.analytics.mixpanel.MixpanelPropertiesProvider;
import app.chalo.analytics.senders.AnalyticsSender;
import app.chalo.analytics.utils.MixpanelSenderConfig;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import defpackage.i4;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/analytics/sender/AndroidMixpanelAnalyticsSender;", "Lapp/chalo/analytics/senders/AnalyticsSender;", "Lapp/chalo/analytics/mixpanel/MixpanelPropertiesProvider;", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidMixpanelAnalyticsSender implements AnalyticsSender, MixpanelPropertiesProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f879a;
    public final MixpanelSenderConfig b;
    public final MixpanelEventsCreditsResolver c;
    public final Lazy d = LazyKt.b(new i4(this, 0));

    public AndroidMixpanelAnalyticsSender(Context context, MixpanelSenderConfig mixpanelSenderConfig, MixpanelEventsCreditsResolver mixpanelEventsCreditsResolver) {
        this.f879a = context;
        this.b = mixpanelSenderConfig;
        this.c = mixpanelEventsCreditsResolver;
    }

    @Override // app.chalo.analytics.senders.AnalyticsSender
    public final void a() {
        MixpanelAPI mixpanelAPII = i();
        String str = this.b.f882a;
        mixpanelAPII.i(str);
        MixpanelAPI.PeopleImpl peopleImpl = i().e;
        if (peopleImpl != null) {
            peopleImpl.a(str);
        }
    }

    @Override // app.chalo.analytics.senders.AnalyticsSender
    public final void b() {
        MixpanelAPI.PeopleImpl peopleImpl = i().e;
        if (peopleImpl != null) {
            peopleImpl.e(1.0d, "usageCount");
        }
    }

    @Override // app.chalo.analytics.senders.AnalyticsSender
    public final void c(Map properties) {
        Intrinsics.i(properties, "properties");
        MixpanelAPI.PeopleImpl peopleImpl = i().e;
        if (peopleImpl != null) {
            peopleImpl.c(new JSONObject(properties));
        }
    }

    @Override // app.chalo.analytics.senders.AnalyticsSender
    public final void d(String userName) {
        Intrinsics.i(userName, "userName");
        MixpanelAPI.PeopleImpl peopleImpl = i().e;
        if (peopleImpl != null) {
            peopleImpl.d("$name", userName);
        }
    }

    @Override // app.chalo.analytics.senders.AnalyticsSender
    public final void e(String str) {
        MixpanelAPI.PeopleImpl peopleImpl = i().e;
        if (peopleImpl != null) {
            peopleImpl.d("$email", str);
        }
    }

    @Override // app.chalo.analytics.mixpanel.MixpanelPropertiesProvider
    public final String f() {
        String strE = i().e();
        Intrinsics.h(strE, "getDistinctId(...)");
        return strE;
    }

    @Override // app.chalo.analytics.senders.AnalyticsSender
    public final void g(AnalyticsEvent event) {
        Intrinsics.i(event, "event");
        String str = event.f876a;
        if (!event.b().isEmpty()) {
            JSONObject jSONObject = new JSONObject(event.b());
            i().l(str, jSONObject);
            j(event, jSONObject);
        } else {
            MixpanelAPI mixpanelAPII = i();
            if (!mixpanelAPII.h()) {
                mixpanelAPII.l(str, null);
            }
            j(event, null);
        }
    }

    @Override // app.chalo.analytics.senders.AnalyticsSender
    public final void h(Map properties) {
        Intrinsics.i(properties, "properties");
        i().k(new JSONObject(properties));
    }

    public final MixpanelAPI i() {
        return (MixpanelAPI) this.d.getValue();
    }

    public final void j(AnalyticsEvent event, JSONObject jSONObject) {
        Intrinsics.i(event, "event");
        Integer num = (Integer) ((Map) this.c.f875a.getValue()).get(event.f876a);
        if (num != null) {
            int iIntValue = num.intValue();
            MixpanelAPI.PeopleImpl peopleImpl = i().e;
            if (peopleImpl != null) {
                peopleImpl.b(iIntValue, jSONObject);
            }
        }
    }
}
