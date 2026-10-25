package app.chalo.analytics.senders;

import app.chalo.analytics.events.AnalyticsEvent;
import app.chalo.analytics.firebase.FirebaseAnalyticsDelegate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/analytics/senders/FirebaseAnalyticsSender;", "Lapp/chalo/analytics/senders/AnalyticsSender;", "Companion", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseAnalyticsSender implements AnalyticsSender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseAnalyticsDelegate f881a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/analytics/senders/FirebaseAnalyticsSender$Companion;", "", "", "KEY_FIREBASE_USER_NAME", "Ljava/lang/String;", "KEY_FIREBASE_USER_MAIL", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public FirebaseAnalyticsSender(FirebaseAnalyticsDelegate firebaseAnalyticsDelegate) {
        this.f881a = firebaseAnalyticsDelegate;
    }

    @Override // app.chalo.analytics.senders.AnalyticsSender
    public final void c(Map properties) {
        Intrinsics.i(properties, "properties");
        for (Map.Entry entry : properties.entrySet()) {
            this.f881a.b(StringsKt.R((String) entry.getKey(), " ", "_"), (String) entry.getValue());
        }
    }

    @Override // app.chalo.analytics.senders.AnalyticsSender
    public final void d(String userName) {
        Intrinsics.i(userName, "userName");
        this.f881a.b("user_name", userName);
    }

    @Override // app.chalo.analytics.senders.AnalyticsSender
    public final void e(String str) {
        this.f881a.b("user_mail", str);
    }

    @Override // app.chalo.analytics.senders.AnalyticsSender
    public final void g(AnalyticsEvent event) {
        Intrinsics.i(event, "event");
        String strR = StringsKt.R(event.f876a, " ", "_");
        LinkedHashMap linkedHashMapB = event.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMapB.entrySet()) {
            Object value = entry.getValue();
            if ((value instanceof String) || (value instanceof Long) || (value instanceof Integer)) {
                linkedHashMap.put(StringsKt.R((String) entry.getKey(), " ", "_"), value);
            }
        }
        this.f881a.a(strR, linkedHashMap);
    }

    @Override // app.chalo.analytics.senders.AnalyticsSender
    public final void h(Map properties) {
        Intrinsics.i(properties, "properties");
        for (Map.Entry entry : properties.entrySet()) {
            this.f881a.b(StringsKt.R((String) entry.getKey(), " ", "_"), (String) entry.getValue());
        }
    }

    @Override // app.chalo.analytics.senders.AnalyticsSender
    public final void a() {
    }

    @Override // app.chalo.analytics.senders.AnalyticsSender
    public final void b() {
    }
}
