package app.chalo.features.language.data;

import app.chalo.constants.Source;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\t"}, d2 = {"Lapp/chalo/features/language/data/LanguageSelectionSourceType;", "", "<init>", "(Ljava/lang/String;I)V", "SPLASH_SCREEN", "HOME_SCREEN", "NONE", "getSource", "Lapp/chalo/constants/Source;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum LanguageSelectionSourceType {
    SPLASH_SCREEN,
    HOME_SCREEN,
    NONE;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2723a;

        static {
            int[] iArr = new int[LanguageSelectionSourceType.values().length];
            try {
                iArr[LanguageSelectionSourceType.SPLASH_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LanguageSelectionSourceType.HOME_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LanguageSelectionSourceType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2723a = iArr;
        }
    }

    public static EnumEntries<LanguageSelectionSourceType> getEntries() {
        return $ENTRIES;
    }

    public final Source getSource() {
        int i = WhenMappings.f2723a[ordinal()];
        if (i == 1) {
            return Source.SPLASH_SCREEN;
        }
        if (i == 2) {
            return Source.HOME_SCREEN;
        }
        if (i == 3) {
            return Source.NONE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
