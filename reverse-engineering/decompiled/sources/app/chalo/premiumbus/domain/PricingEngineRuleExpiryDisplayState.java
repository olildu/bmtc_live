package app.chalo.premiumbus.domain;

import defpackage.hq0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/premiumbus/domain/PricingEngineRuleExpiryDisplayState;", "", "DateEnding", "CountdownNormal", "CountdownUrgent", "Expired", "Lapp/chalo/premiumbus/domain/PricingEngineRuleExpiryDisplayState$CountdownNormal;", "Lapp/chalo/premiumbus/domain/PricingEngineRuleExpiryDisplayState$CountdownUrgent;", "Lapp/chalo/premiumbus/domain/PricingEngineRuleExpiryDisplayState$DateEnding;", "Lapp/chalo/premiumbus/domain/PricingEngineRuleExpiryDisplayState$Expired;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PricingEngineRuleExpiryDisplayState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/PricingEngineRuleExpiryDisplayState$CountdownNormal;", "Lapp/chalo/premiumbus/domain/PricingEngineRuleExpiryDisplayState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CountdownNormal extends PricingEngineRuleExpiryDisplayState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7225a;

        public CountdownNormal(long j) {
            this.f7225a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CountdownNormal) && this.f7225a == ((CountdownNormal) obj).f7225a;
        }

        public final int hashCode() {
            long j = this.f7225a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return hq0.e(this.f7225a, "CountdownNormal(remainingMillis=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/PricingEngineRuleExpiryDisplayState$CountdownUrgent;", "Lapp/chalo/premiumbus/domain/PricingEngineRuleExpiryDisplayState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CountdownUrgent extends PricingEngineRuleExpiryDisplayState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7226a;

        public CountdownUrgent(long j) {
            this.f7226a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CountdownUrgent) && this.f7226a == ((CountdownUrgent) obj).f7226a;
        }

        public final int hashCode() {
            long j = this.f7226a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return hq0.e(this.f7226a, "CountdownUrgent(remainingMillis=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/PricingEngineRuleExpiryDisplayState$DateEnding;", "Lapp/chalo/premiumbus/domain/PricingEngineRuleExpiryDisplayState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateEnding extends PricingEngineRuleExpiryDisplayState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7227a;

        public DateEnding(long j) {
            this.f7227a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DateEnding) && this.f7227a == ((DateEnding) obj).f7227a;
        }

        public final int hashCode() {
            long j = this.f7227a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return hq0.e(this.f7227a, "DateEnding(expiryAt=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/PricingEngineRuleExpiryDisplayState$Expired;", "Lapp/chalo/premiumbus/domain/PricingEngineRuleExpiryDisplayState;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Expired extends PricingEngineRuleExpiryDisplayState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Expired f7228a = new Expired();
    }
}
