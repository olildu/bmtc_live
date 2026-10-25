package app.chalo.uistate.dialog;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000f\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0011"}, d2 = {"Lapp/chalo/uistate/dialog/DateAvailabilityStatus;", "", "status", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "SOLD_OUT", "FEW_SEATS_LEFT", "NEARBY_SLOTS_AVAILABLE", "AVAILABLE", "NOT_AVAILABLE", "NO_SLOTS_AVAILABLE", "UNKNOWN", "analyticsAttrName", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum DateAvailabilityStatus {
    SOLD_OUT("SOLD_OUT"),
    FEW_SEATS_LEFT("FEW_SEATS_LEFT"),
    NEARBY_SLOTS_AVAILABLE("NEARBY_SLOTS_AVAILABLE"),
    AVAILABLE("AVAILABLE"),
    NOT_AVAILABLE("NOT_AVAILABLE"),
    NO_SLOTS_AVAILABLE("NO_SLOTS_AVAILABLE"),
    UNKNOWN("");

    private final String status;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/DateAvailabilityStatus$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9975a;

        static {
            int[] iArr = new int[DateAvailabilityStatus.values().length];
            try {
                iArr[DateAvailabilityStatus.SOLD_OUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DateAvailabilityStatus.FEW_SEATS_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DateAvailabilityStatus.NEARBY_SLOTS_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DateAvailabilityStatus.AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DateAvailabilityStatus.NOT_AVAILABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DateAvailabilityStatus.NO_SLOTS_AVAILABLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DateAvailabilityStatus.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f9975a = iArr;
        }
    }

    DateAvailabilityStatus(String str) {
        this.status = str;
    }

    public static EnumEntries<DateAvailabilityStatus> getEntries() {
        return $ENTRIES;
    }

    public final String analyticsAttrName() {
        switch (WhenMappings.f9975a[ordinal()]) {
            case 1:
                return "soldOutSlotsCount";
            case 2:
                return "fewSeatsLeftSlotsCount";
            case 3:
                return "nearbySlotsAvailableCount";
            case 4:
                return "availableSlotsCount";
            case 5:
                return "notAvailableSlotsCount";
            case 6:
                return "noSlotsAvailableCount";
            case 7:
                return "unknownCount";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String getStatus() {
        return this.status;
    }
}
