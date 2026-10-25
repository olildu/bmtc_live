package app.chalo.citydata.data.model.app;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lapp/chalo/citydata/data/model/app/TimeTableStatus;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "VALID", "INVALID", "VALID_WITH_DISCLAIMER", "UNKNOWN", "Companion", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum TimeTableStatus {
    VALID(0),
    INVALID(1),
    VALID_WITH_DISCLAIMER(2),
    UNKNOWN(-1);

    private final int id;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/data/model/app/TimeTableStatus$Companion;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        public static TimeTableStatus a(int i) {
            for (TimeTableStatus timeTableStatus : TimeTableStatus.values()) {
                if (timeTableStatus.getId() == i) {
                    if (timeTableStatus == null) {
                        return TimeTableStatus.UNKNOWN;
                    }
                    return timeTableStatus;
                }
            }
            timeTableStatus = null;
            if (timeTableStatus == null) {
                return TimeTableStatus.UNKNOWN;
            }
            return timeTableStatus;
        }
    }

    TimeTableStatus(int i) {
        this.id = i;
    }

    public static EnumEntries<TimeTableStatus> getEntries() {
        return $ENTRIES;
    }

    public final int getId() {
        return this.id;
    }
}
