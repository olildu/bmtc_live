package app.chalo.premiumbus.ui.seatselection;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/SeatToggleDecisionHelper;", "", "SeatToggleGuard", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SeatToggleDecisionHelper {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/SeatToggleDecisionHelper$SeatToggleGuard;", "", "<init>", "(Ljava/lang/String;I)V", "MAX_SEATS", "WOMEN_ACTIVE_ALREADY_SELECTED", "WOMEN_ACTIVE_WITH_GENERAL_OR_NON_ACTIVE", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum SeatToggleGuard {
        MAX_SEATS,
        WOMEN_ACTIVE_ALREADY_SELECTED,
        WOMEN_ACTIVE_WITH_GENERAL_OR_NON_ACTIVE;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<SeatToggleGuard> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7763a;

        static {
            int[] iArr = new int[SeatToggleGuard.values().length];
            try {
                iArr[SeatToggleGuard.MAX_SEATS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SeatToggleGuard.WOMEN_ACTIVE_ALREADY_SELECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SeatToggleGuard.WOMEN_ACTIVE_WITH_GENERAL_OR_NON_ACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7763a = iArr;
        }
    }
}
