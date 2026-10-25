package app.chalo.security.sync.data;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/security/sync/data/KeySyncRemoteConfig;", "", "Companion", "$serializer", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class KeySyncRemoteConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9390a;
    public final long b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/security/sync/data/KeySyncRemoteConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/security/sync/data/KeySyncRemoteConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<KeySyncRemoteConfig> serializer() {
            return KeySyncRemoteConfig$$serializer.f9391a;
        }
    }

    public KeySyncRemoteConfig() {
        this.f9390a = 9;
        this.b = 720L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeySyncRemoteConfig)) {
            return false;
        }
        KeySyncRemoteConfig keySyncRemoteConfig = (KeySyncRemoteConfig) obj;
        return this.f9390a == keySyncRemoteConfig.f9390a && this.b == keySyncRemoteConfig.b;
    }

    public final int hashCode() {
        int i = this.f9390a * 31;
        long j = this.b;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "KeySyncRemoteConfig(numDays=" + this.f9390a + ", repeatIntervalMins=" + this.b + ")";
    }

    public /* synthetic */ KeySyncRemoteConfig(int i, int i2, long j) {
        this.f9390a = (i & 1) == 0 ? 9 : i2;
        if ((i & 2) == 0) {
            this.b = 720L;
        } else {
            this.b = j;
        }
    }
}
