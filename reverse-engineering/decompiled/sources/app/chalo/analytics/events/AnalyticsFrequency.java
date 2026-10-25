package app.chalo.analytics.events;

import androidx.compose.material3.internal.CalendarModelKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.freshchat.consumer.sdk.beans.config.DefaultRefreshIntervals;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/analytics/events/AnalyticsFrequency;", "", "Always", "Once", "Daily", "Hourly", TypedValues.Custom.NAME, "Lapp/chalo/analytics/events/AnalyticsFrequency$Always;", "Lapp/chalo/analytics/events/AnalyticsFrequency$Custom;", "Lapp/chalo/analytics/events/AnalyticsFrequency$Daily;", "Lapp/chalo/analytics/events/AnalyticsFrequency$Hourly;", "Lapp/chalo/analytics/events/AnalyticsFrequency$Once;", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AnalyticsFrequency {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f877a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/analytics/events/AnalyticsFrequency$Always;", "Lapp/chalo/analytics/events/AnalyticsFrequency;", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Always extends AnalyticsFrequency {
        public static final Always b = new Always(Long.MIN_VALUE);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Always);
        }

        public final int hashCode() {
            return -626570826;
        }

        public final String toString() {
            return "Always";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/analytics/events/AnalyticsFrequency$Custom;", "Lapp/chalo/analytics/events/AnalyticsFrequency;", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Custom extends AnalyticsFrequency {
        @Override // app.chalo.analytics.events.AnalyticsFrequency
        /* JADX INFO: renamed from: a */
        public final long getF877a() {
            return 0L;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Custom);
        }

        public final int hashCode() {
            return (int) 0;
        }

        public final String toString() {
            return "Custom(frequency=0)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/analytics/events/AnalyticsFrequency$Daily;", "Lapp/chalo/analytics/events/AnalyticsFrequency;", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Daily extends AnalyticsFrequency {
        public static final Daily b = new Daily(CalendarModelKt.MillisecondsIn24Hours);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Daily);
        }

        public final int hashCode() {
            return -1264708206;
        }

        public final String toString() {
            return "Daily";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/analytics/events/AnalyticsFrequency$Hourly;", "Lapp/chalo/analytics/events/AnalyticsFrequency;", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Hourly extends AnalyticsFrequency {
        public static final Hourly b = new Hourly(DefaultRefreshIntervals.REMOTE_CONFIG_FETCH_INTERVAL);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Hourly);
        }

        public final int hashCode() {
            return -423439848;
        }

        public final String toString() {
            return "Hourly";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/analytics/events/AnalyticsFrequency$Once;", "Lapp/chalo/analytics/events/AnalyticsFrequency;", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Once extends AnalyticsFrequency {
        public static final Once b = new Once(Long.MAX_VALUE);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Once);
        }

        public final int hashCode() {
            return 1899205608;
        }

        public final String toString() {
            return "Once";
        }
    }

    public AnalyticsFrequency(long j) {
        this.f877a = j;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public long getF877a() {
        return this.f877a;
    }
}
