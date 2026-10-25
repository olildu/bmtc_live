package app.chalo.onboarding.splash.orchestrator;

import app.chalo.constants.Source;
import defpackage.gf;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lapp/chalo/onboarding/splash/orchestrator/SplashNavigationDecision;", "", "ToLanguageSelection", "ToLogin", "ToUserConsent", "ToCitySelection", "ToCityDiscontinued", "ToMigrationScreen", "ToHomeScreen", "Lapp/chalo/onboarding/splash/orchestrator/SplashNavigationDecision$ToCityDiscontinued;", "Lapp/chalo/onboarding/splash/orchestrator/SplashNavigationDecision$ToCitySelection;", "Lapp/chalo/onboarding/splash/orchestrator/SplashNavigationDecision$ToHomeScreen;", "Lapp/chalo/onboarding/splash/orchestrator/SplashNavigationDecision$ToLanguageSelection;", "Lapp/chalo/onboarding/splash/orchestrator/SplashNavigationDecision$ToLogin;", "Lapp/chalo/onboarding/splash/orchestrator/SplashNavigationDecision$ToMigrationScreen;", "Lapp/chalo/onboarding/splash/orchestrator/SplashNavigationDecision$ToUserConsent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SplashNavigationDecision {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/splash/orchestrator/SplashNavigationDecision$ToCityDiscontinued;", "Lapp/chalo/onboarding/splash/orchestrator/SplashNavigationDecision;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ToCityDiscontinued extends SplashNavigationDecision {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6683a;

        public ToCityDiscontinued(String str) {
            this.f6683a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToCityDiscontinued) && Intrinsics.d(this.f6683a, ((ToCityDiscontinued) obj).f6683a);
        }

        public final int hashCode() {
            return this.f6683a.hashCode();
        }

        public final String toString() {
            return vo1.B("ToCityDiscontinued(cityName=", this.f6683a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/splash/orchestrator/SplashNavigationDecision$ToCitySelection;", "Lapp/chalo/onboarding/splash/orchestrator/SplashNavigationDecision;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ToCitySelection extends SplashNavigationDecision {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Source f6684a;

        public ToCitySelection(Source source) {
            Intrinsics.i(source, "source");
            this.f6684a = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToCitySelection) && this.f6684a == ((ToCitySelection) obj).f6684a;
        }

        public final int hashCode() {
            return this.f6684a.hashCode();
        }

        public final String toString() {
            return gf.f(this.f6684a, "ToCitySelection(source=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/splash/orchestrator/SplashNavigationDecision$ToHomeScreen;", "Lapp/chalo/onboarding/splash/orchestrator/SplashNavigationDecision;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ToHomeScreen extends SplashNavigationDecision {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ToHomeScreen f6685a = new ToHomeScreen();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToHomeScreen);
        }

        public final int hashCode() {
            return -1711137655;
        }

        public final String toString() {
            return "ToHomeScreen";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/splash/orchestrator/SplashNavigationDecision$ToLanguageSelection;", "Lapp/chalo/onboarding/splash/orchestrator/SplashNavigationDecision;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ToLanguageSelection extends SplashNavigationDecision {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ToLanguageSelection f6686a = new ToLanguageSelection();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToLanguageSelection);
        }

        public final int hashCode() {
            return -368763658;
        }

        public final String toString() {
            return "ToLanguageSelection";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/splash/orchestrator/SplashNavigationDecision$ToLogin;", "Lapp/chalo/onboarding/splash/orchestrator/SplashNavigationDecision;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ToLogin extends SplashNavigationDecision {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Source f6687a;

        public ToLogin(Source source) {
            Intrinsics.i(source, "source");
            this.f6687a = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToLogin) && this.f6687a == ((ToLogin) obj).f6687a;
        }

        public final int hashCode() {
            return this.f6687a.hashCode();
        }

        public final String toString() {
            return gf.f(this.f6687a, "ToLogin(source=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/splash/orchestrator/SplashNavigationDecision$ToMigrationScreen;", "Lapp/chalo/onboarding/splash/orchestrator/SplashNavigationDecision;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ToMigrationScreen extends SplashNavigationDecision {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ToMigrationScreen f6688a = new ToMigrationScreen();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ToMigrationScreen);
        }

        public final int hashCode() {
            return 892647996;
        }

        public final String toString() {
            return "ToMigrationScreen";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/splash/orchestrator/SplashNavigationDecision$ToUserConsent;", "Lapp/chalo/onboarding/splash/orchestrator/SplashNavigationDecision;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ToUserConsent extends SplashNavigationDecision {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6689a;

        public ToUserConsent(String requestId) {
            Intrinsics.i(requestId, "requestId");
            this.f6689a = requestId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToUserConsent) && Intrinsics.d(this.f6689a, ((ToUserConsent) obj).f6689a);
        }

        public final int hashCode() {
            return this.f6689a.hashCode();
        }

        public final String toString() {
            return vo1.B("ToUserConsent(requestId=", this.f6689a, ")");
        }
    }
}
