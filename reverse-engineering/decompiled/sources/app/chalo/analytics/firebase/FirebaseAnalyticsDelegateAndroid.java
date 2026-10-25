package app.chalo.analytics.firebase;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ParametersBuilder;
import defpackage.xx;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/analytics/firebase/FirebaseAnalyticsDelegateAndroid;", "Lapp/chalo/analytics/firebase/FirebaseAnalyticsDelegate;", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FirebaseAnalyticsDelegateAndroid implements FirebaseAnalyticsDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f878a;
    public final Lazy b = LazyKt.b(new xx(this, 11));

    public FirebaseAnalyticsDelegateAndroid(Context context) {
        this.f878a = context;
    }

    @Override // app.chalo.analytics.firebase.FirebaseAnalyticsDelegate
    public final void a(String str, LinkedHashMap linkedHashMap) {
        FirebaseAnalytics firebaseAnalytics = (FirebaseAnalytics) this.b.getValue();
        ParametersBuilder parametersBuilder = new ParametersBuilder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                parametersBuilder.param((String) entry.getKey(), (String) value);
            } else if (value instanceof Long) {
                parametersBuilder.param((String) entry.getKey(), ((Number) value).longValue());
            } else if (value instanceof Double) {
                parametersBuilder.param((String) entry.getKey(), ((Number) value).doubleValue());
            } else if (value instanceof Integer) {
                parametersBuilder.param((String) entry.getKey(), ((Number) value).intValue());
            }
        }
        firebaseAnalytics.logEvent(str, parametersBuilder.getZza());
    }

    @Override // app.chalo.analytics.firebase.FirebaseAnalyticsDelegate
    public final void b(String str, String value) {
        Intrinsics.i(value, "value");
        ((FirebaseAnalytics) this.b.getValue()).setUserProperty(str, value);
    }
}
