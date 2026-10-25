package app.chalo.analytics;

import app.chalo.analytics.utils.AnalyticsSystemHelper;
import defpackage.f1;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/analytics/AndroidAnalyticsSystemHelper;", "Lapp/chalo/analytics/utils/AnalyticsSystemHelper;", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidAnalyticsSystemHelper implements AnalyticsSystemHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f873a = LazyKt.b(new f1(14));

    @Override // app.chalo.analytics.utils.AnalyticsSystemHelper
    public final String a() {
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        calendar.setTimeInMillis(System.currentTimeMillis());
        String str = ((SimpleDateFormat) this.f873a.getValue()).format(calendar.getTime());
        Intrinsics.h(str, "format(...)");
        return str;
    }

    @Override // app.chalo.analytics.utils.AnalyticsSystemHelper
    public final long currentTime() {
        return System.currentTimeMillis();
    }
}
