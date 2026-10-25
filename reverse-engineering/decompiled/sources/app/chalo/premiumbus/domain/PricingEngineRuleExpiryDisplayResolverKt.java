package app.chalo.premiumbus.domain;

import androidx.compose.material3.internal.CalendarModelKt;
import androidx.work.PeriodicWorkRequest;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PricingEngineRuleExpiryDisplayResolverKt {
    public static final PricingEngineRuleExpiryDisplayState a(long j, long j2) {
        long j3 = j - j2;
        if (j3 <= 0) {
            return PricingEngineRuleExpiryDisplayState.Expired.f7228a;
        }
        if (j3 > CalendarModelKt.MillisecondsIn24Hours) {
            return new PricingEngineRuleExpiryDisplayState.DateEnding(j);
        }
        return j3 <= PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS ? new PricingEngineRuleExpiryDisplayState.CountdownUrgent(j3) : new PricingEngineRuleExpiryDisplayState.CountdownNormal(j3);
    }
}
