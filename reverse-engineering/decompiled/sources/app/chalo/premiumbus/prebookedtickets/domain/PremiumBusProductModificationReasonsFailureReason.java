package app.chalo.premiumbus.prebookedtickets.domain;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\b\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u000b"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/domain/PremiumBusProductModificationReasonsFailureReason;", "", "<init>", "(Ljava/lang/String;I)V", "NO_REASONS_AVAILABLE", "PARSE_ERROR", "LOCAL_ERROR", "SERVER_ERROR", "UNKNOWN_ERROR", "getErrorCodes", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum PremiumBusProductModificationReasonsFailureReason {
    NO_REASONS_AVAILABLE,
    PARSE_ERROR,
    LOCAL_ERROR,
    SERVER_ERROR,
    UNKNOWN_ERROR;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7318a;

        static {
            int[] iArr = new int[PremiumBusProductModificationReasonsFailureReason.values().length];
            try {
                iArr[PremiumBusProductModificationReasonsFailureReason.NO_REASONS_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PremiumBusProductModificationReasonsFailureReason.PARSE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PremiumBusProductModificationReasonsFailureReason.LOCAL_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PremiumBusProductModificationReasonsFailureReason.SERVER_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PremiumBusProductModificationReasonsFailureReason.UNKNOWN_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f7318a = iArr;
        }
    }

    public static EnumEntries<PremiumBusProductModificationReasonsFailureReason> getEntries() {
        return $ENTRIES;
    }

    public final int getErrorCodes() {
        int i = WhenMappings.f7318a[ordinal()];
        if (i == 1) {
            return 101;
        }
        if (i == 2) {
            return 104;
        }
        if (i == 3) {
            return 103;
        }
        if (i == 4) {
            return 102;
        }
        if (i == 5) {
            return 105;
        }
        throw new NoWhenBranchMatchedException();
    }
}
