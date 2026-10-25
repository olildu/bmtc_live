package app.chalo.onboarding.citylocationselection.ui;

import app.chalo.constants.Source;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, d2 = {"Lapp/chalo/onboarding/citylocationselection/ui/CityLocationSelectionSource;", "", "<init>", "(Ljava/lang/String;I)V", "LoginScreen", "LanguageSelectionScreen", "HomeScreen", "SplashScreen", "RegularBusScreen", "CityDiscontinuedScreen", "OldCitySelectionScreen", "Unknown", "toSource", "Lapp/chalo/constants/Source;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum CityLocationSelectionSource {
    LoginScreen,
    LanguageSelectionScreen,
    HomeScreen,
    SplashScreen,
    RegularBusScreen,
    CityDiscontinuedScreen,
    OldCitySelectionScreen,
    Unknown;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6598a;

        static {
            int[] iArr = new int[CityLocationSelectionSource.values().length];
            try {
                iArr[CityLocationSelectionSource.LoginScreen.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CityLocationSelectionSource.LanguageSelectionScreen.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CityLocationSelectionSource.HomeScreen.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CityLocationSelectionSource.SplashScreen.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CityLocationSelectionSource.RegularBusScreen.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CityLocationSelectionSource.CityDiscontinuedScreen.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CityLocationSelectionSource.OldCitySelectionScreen.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CityLocationSelectionSource.Unknown.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f6598a = iArr;
        }
    }

    public static EnumEntries<CityLocationSelectionSource> getEntries() {
        return $ENTRIES;
    }

    public final Source toSource() {
        switch (WhenMappings.f6598a[ordinal()]) {
            case 1:
                return Source.LOGIN_SCREEN;
            case 2:
                return Source.LANGUAGE_SELECTION;
            case 3:
                return Source.HOME_SCREEN_TAB;
            case 4:
                return Source.SPLASH_SCREEN;
            case 5:
                return Source.REGULAR_BUS_SCREEN_TAB;
            case 6:
                return Source.CITY_DISCONTINUED_SCREEN;
            case 7:
                return Source.CITY_SELECTION_SCREEN;
            case 8:
                return Source.UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
