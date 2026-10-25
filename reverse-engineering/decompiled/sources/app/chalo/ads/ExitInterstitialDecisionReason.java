package app.chalo.ads;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lapp/chalo/ads/ExitInterstitialDecisionReason;", "", "analyticsValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsValue", "()Ljava/lang/String;", "SHOWN", "DISMISSED_RETURN_HOME", "SUPPRESSED_DISABLED", "SUPPRESSED_NOT_READY", "SUPPRESSED_EXPIRED", "SUPPRESSED_COOLDOWN", "SUPPRESSED_NTH", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum ExitInterstitialDecisionReason {
    SHOWN("shown"),
    DISMISSED_RETURN_HOME("dismissed_return_home"),
    SUPPRESSED_DISABLED("suppressed_disabled"),
    SUPPRESSED_NOT_READY("suppressed_not_ready"),
    SUPPRESSED_EXPIRED("suppressed_expired"),
    SUPPRESSED_COOLDOWN("suppressed_cooldown"),
    SUPPRESSED_NTH("suppressed_nth");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());
    private final String analyticsValue;

    ExitInterstitialDecisionReason(String str) {
        this.analyticsValue = str;
    }

    public static EnumEntries<ExitInterstitialDecisionReason> getEntries() {
        return $ENTRIES;
    }

    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }
}
