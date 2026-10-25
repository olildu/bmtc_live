package app.chalo.home.domain;

import androidx.compose.material3.internal.CalendarModelKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/PassExpiryEligibilityAndDate;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PassExpiryEligibilityAndDate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3055a;
    public final boolean b;

    public /* synthetic */ PassExpiryEligibilityAndDate() {
        this(-1L, false);
    }

    public final Long a() {
        long j = this.f3055a;
        Long lValueOf = Long.valueOf(j);
        if (!this.b || j <= 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return Long.valueOf(lValueOf.longValue() + CalendarModelKt.MillisecondsIn24Hours);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassExpiryEligibilityAndDate)) {
            return false;
        }
        PassExpiryEligibilityAndDate passExpiryEligibilityAndDate = (PassExpiryEligibilityAndDate) obj;
        return this.f3055a == passExpiryEligibilityAndDate.f3055a && this.b == passExpiryEligibilityAndDate.b;
    }

    public final int hashCode() {
        long j = this.f3055a;
        return (((int) (j ^ (j >>> 32))) * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "PassExpiryEligibilityAndDate(expiryTime=" + this.f3055a + ", shouldUseCurrentPassExpiryDate=" + this.b + ")";
    }

    public PassExpiryEligibilityAndDate(long j, boolean z) {
        this.f3055a = j;
        this.b = z;
    }
}
