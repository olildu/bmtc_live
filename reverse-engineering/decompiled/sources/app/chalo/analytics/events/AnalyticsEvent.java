package app.chalo.analytics.events;

import defpackage.f1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/analytics/events/AnalyticsEvent;", "", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AnalyticsEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f876a;
    public final LinkedHashMap b;
    public final AnalyticsFrequency c;
    public final Lazy d;

    public AnalyticsEvent(String eventName, LinkedHashMap linkedHashMap, AnalyticsFrequency frequency) {
        Intrinsics.i(eventName, "eventName");
        Intrinsics.i(frequency, "frequency");
        this.f876a = eventName;
        this.b = linkedHashMap;
        this.c = frequency;
        this.d = LazyKt.b(new f1(13));
    }

    public final void a(Object value, String name) {
        Intrinsics.i(name, "name");
        Intrinsics.i(value, "value");
        ((Map) this.d.getValue()).put(name, value);
    }

    public final LinkedHashMap b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.b);
        linkedHashMap.putAll((Map) this.d.getValue());
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticsEvent)) {
            return false;
        }
        AnalyticsEvent analyticsEvent = (AnalyticsEvent) obj;
        return Intrinsics.d(this.f876a, analyticsEvent.f876a) && this.b.equals(analyticsEvent.b) && Intrinsics.d(this.c, analyticsEvent.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f876a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AnalyticsEvent(eventName=" + this.f876a + ", eventProperties=" + this.b + ", frequency=" + this.c + ")";
    }
}
