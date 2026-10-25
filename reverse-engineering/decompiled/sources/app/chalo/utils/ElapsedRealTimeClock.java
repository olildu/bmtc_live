package app.chalo.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lapp/chalo/utils/ElapsedRealTimeClock;", "", "<init>", "(Ljava/lang/String;I)V", "LEGACY_UPTIME", "DEEP_SLEEP_AWARE", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum ElapsedRealTimeClock {
    LEGACY_UPTIME,
    DEEP_SLEEP_AWARE;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/ElapsedRealTimeClock$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static ElapsedRealTimeClock a(String str) {
            ElapsedRealTimeClock elapsedRealTimeClock = null;
            if (str == null) {
                return null;
            }
            for (ElapsedRealTimeClock elapsedRealTimeClock2 : ElapsedRealTimeClock.getEntries()) {
                if (StringsKt.x(elapsedRealTimeClock2.name(), str, true)) {
                    elapsedRealTimeClock = elapsedRealTimeClock2;
                    break;
                }
            }
            return elapsedRealTimeClock;
        }
    }

    public static EnumEntries<ElapsedRealTimeClock> getEntries() {
        return $ENTRIES;
    }
}
