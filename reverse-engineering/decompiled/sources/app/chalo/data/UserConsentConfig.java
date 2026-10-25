package app.chalo.data;

import com.freshchat.consumer.sdk.beans.config.DefaultRefreshIntervals;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/UserConsentConfig;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UserConsentConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2408a;
    public final long b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lapp/chalo/data/UserConsentConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/UserConsentConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "DEFAULT_DAYS_FOR_GRACE_PERIOD", "I", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UserConsentConfig> serializer() {
            return UserConsentConfig$$serializer.f2409a;
        }
    }

    public UserConsentConfig() {
        this.f2408a = 10;
        this.b = DefaultRefreshIntervals.REMOTE_CONFIG_FETCH_INTERVAL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserConsentConfig)) {
            return false;
        }
        UserConsentConfig userConsentConfig = (UserConsentConfig) obj;
        return this.f2408a == userConsentConfig.f2408a && this.b == userConsentConfig.b;
    }

    public final int hashCode() {
        int i = this.f2408a * 31;
        long j = this.b;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "UserConsentConfig(gracePeriodDaysFromFirstConsentRequest=" + this.f2408a + ", consentCacheValidityInMillis=" + this.b + ")";
    }

    public /* synthetic */ UserConsentConfig(int i, int i2, long j) {
        this.f2408a = (i & 1) == 0 ? 10 : i2;
        if ((i & 2) == 0) {
            this.b = DefaultRefreshIntervals.REMOTE_CONFIG_FETCH_INTERVAL;
        } else {
            this.b = j;
        }
    }
}
