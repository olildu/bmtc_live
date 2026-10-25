package app.chalo.validationsdk.legacy;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\t"}, d2 = {"Lapp/chalo/validationsdk/legacy/RegularBusValidationScreen;", "", "<init>", "(Ljava/lang/String;I)V", "SOUND_SCREEN", "QR_SCREEN", "BLE_SCREEN", "getSourceForReportProblemFeature", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum RegularBusValidationScreen {
    SOUND_SCREEN,
    QR_SCREEN,
    BLE_SCREEN;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10668a;

        static {
            int[] iArr = new int[RegularBusValidationScreen.values().length];
            try {
                iArr[RegularBusValidationScreen.SOUND_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RegularBusValidationScreen.QR_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RegularBusValidationScreen.BLE_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10668a = iArr;
        }
    }

    public static EnumEntries<RegularBusValidationScreen> getEntries() {
        return $ENTRIES;
    }

    public final String getSourceForReportProblemFeature() {
        int i = WhenMappings.f10668a[ordinal()];
        if (i == 1) {
            return "validationScreen";
        }
        if (i == 2) {
            return "activeSuperPassScreen";
        }
        if (i == 3) {
            return "bleScreen";
        }
        throw new NoWhenBranchMatchedException();
    }
}
