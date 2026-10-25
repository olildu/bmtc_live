package app.chalo.onboarding.citylocationselection.ui;

import app.chalo.constants.Source;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"onboarding_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CityLocationSelectionContractKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6580a;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.LOGIN_OPTIONS_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.LOGIN_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.LOGIN_OTP_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Source.LANGUAGE_SELECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Source.SPLASH_SCREEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Source.HOME_SCREEN_TAB.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Source.REGULAR_BUS_SCREEN_TAB.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Source.CITY_DISCONTINUED_SCREEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Source.CITY_SELECTION_FRAGMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f6580a = iArr;
        }
    }

    public static final CityLocationSelectionSource a(Source source) {
        Intrinsics.i(source, "<this>");
        switch (WhenMappings.f6580a[source.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return CityLocationSelectionSource.LoginScreen;
            case 4:
                return CityLocationSelectionSource.LanguageSelectionScreen;
            case 5:
                return CityLocationSelectionSource.SplashScreen;
            case 6:
                return CityLocationSelectionSource.HomeScreen;
            case 7:
                return CityLocationSelectionSource.RegularBusScreen;
            case 8:
                return CityLocationSelectionSource.CityDiscontinuedScreen;
            case 9:
                return CityLocationSelectionSource.OldCitySelectionScreen;
            default:
                return CityLocationSelectionSource.Unknown;
        }
    }
}
