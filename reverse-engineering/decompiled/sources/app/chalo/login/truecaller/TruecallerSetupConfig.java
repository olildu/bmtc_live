package app.chalo.login.truecaller;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/login/truecaller/TruecallerSetupConfig;", "", "Companion", "TruecallerConsentMode", "TruecallerButtonShape", "TruecallerConsentTitleVerify", "TruecallerFooterType", "TruecallerLoginTextPrefix", "TruecallerLoginTextSuffix", "TruecallerSdkOption", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TruecallerSetupConfig {
    public static final String i = ChaloColorTokenKt.d(ChaloColorToken.Orange2.f9830a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TruecallerConsentMode f5294a;
    public final String b;
    public final TruecallerButtonShape c;
    public final TruecallerConsentTitleVerify d;
    public final TruecallerFooterType e;
    public final TruecallerLoginTextPrefix f;
    public final TruecallerLoginTextSuffix g;
    public final TruecallerSdkOption h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/login/truecaller/TruecallerSetupConfig$Companion;", "", "", "DEFAULT_BTN_COLOR_HEX", "Ljava/lang/String;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/login/truecaller/TruecallerSetupConfig$TruecallerButtonShape;", "", "<init>", "(Ljava/lang/String;I)V", "RECTANGLE", "ROUNDED", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum TruecallerButtonShape {
        RECTANGLE,
        ROUNDED;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<TruecallerButtonShape> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/login/truecaller/TruecallerSetupConfig$TruecallerConsentMode;", "", "<init>", "(Ljava/lang/String;I)V", "BOTTOMSHEET", "FULLSCREEN", "POPUP", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum TruecallerConsentMode {
        BOTTOMSHEET,
        FULLSCREEN,
        POPUP;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<TruecallerConsentMode> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/login/truecaller/TruecallerSetupConfig$TruecallerConsentTitleVerify;", "", "<init>", "(Ljava/lang/String;I)V", "LOG_IN", "SIGN_UP", "SIGN_IN", "VERIFY", "REGISTER", "GET_STARTED", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum TruecallerConsentTitleVerify {
        LOG_IN,
        SIGN_UP,
        SIGN_IN,
        VERIFY,
        REGISTER,
        GET_STARTED;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<TruecallerConsentTitleVerify> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/login/truecaller/TruecallerSetupConfig$TruecallerFooterType;", "", "<init>", "(Ljava/lang/String;I)V", "SKIP", "CONTINUE", "ANOTHER_METHOD", "MANUALLY", "NONE", "LATER", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum TruecallerFooterType {
        SKIP,
        CONTINUE,
        ANOTHER_METHOD,
        MANUALLY,
        NONE,
        LATER;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<TruecallerFooterType> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lapp/chalo/login/truecaller/TruecallerSetupConfig$TruecallerLoginTextPrefix;", "", "<init>", "(Ljava/lang/String;I)V", "TO_GET_STARTED", "TO_CONTINUE", "TO_PLACE_ORDER", "TO_COMPLETE_YOUR_PURCHASE", "TO_CHECKOUT", "TO_COMPLETE_YOUR_BOOKING", "TO_PROCEED_WITH_YOUR_BOOKING", "TO_CONTINUE_WITH_YOUR_BOOKING", "TO_GET_DETAILS", "TO_VIEW_MORE", "TO_CONTINUE_READING", "TO_PROCEED", "FOR_NEW_UPDATES", "TO_GET_UPDATES", "TO_SUBSCRIBE", "TO_SUBSCRIBE_AND_GET_UPDATES", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum TruecallerLoginTextPrefix {
        TO_GET_STARTED,
        TO_CONTINUE,
        TO_PLACE_ORDER,
        TO_COMPLETE_YOUR_PURCHASE,
        TO_CHECKOUT,
        TO_COMPLETE_YOUR_BOOKING,
        TO_PROCEED_WITH_YOUR_BOOKING,
        TO_CONTINUE_WITH_YOUR_BOOKING,
        TO_GET_DETAILS,
        TO_VIEW_MORE,
        TO_CONTINUE_READING,
        TO_PROCEED,
        FOR_NEW_UPDATES,
        TO_GET_UPDATES,
        TO_SUBSCRIBE,
        TO_SUBSCRIBE_AND_GET_UPDATES;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<TruecallerLoginTextPrefix> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/login/truecaller/TruecallerSetupConfig$TruecallerLoginTextSuffix;", "", "<init>", "(Ljava/lang/String;I)V", "PLEASE_VERIFY_MOBILE_NO", "PLEASE_LOGIN", "PLEASE_SIGNUP", "PLEASE_LOGIN_SIGNUP", "PLEASE_REGISTER", "PLEASE_SIGN_IN", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum TruecallerLoginTextSuffix {
        PLEASE_VERIFY_MOBILE_NO,
        PLEASE_LOGIN,
        PLEASE_SIGNUP,
        PLEASE_LOGIN_SIGNUP,
        PLEASE_REGISTER,
        PLEASE_SIGN_IN;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<TruecallerLoginTextSuffix> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/login/truecaller/TruecallerSetupConfig$TruecallerSdkOption;", "", "<init>", "(Ljava/lang/String;I)V", "WITHOUT_OTP", "WITH_OTP", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum TruecallerSdkOption {
        WITHOUT_OTP,
        WITH_OTP;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<TruecallerSdkOption> getEntries() {
            return $ENTRIES;
        }
    }

    public TruecallerSetupConfig(TruecallerConsentMode consentMode, String buttonColorHex, TruecallerButtonShape buttonShapeOptions, TruecallerConsentTitleVerify consentTitleOption, TruecallerFooterType footerType, TruecallerLoginTextPrefix loginTextPrefix, TruecallerLoginTextSuffix loginTextSuffix, TruecallerSdkOption sdkOptions) {
        Intrinsics.i(consentMode, "consentMode");
        Intrinsics.i(buttonColorHex, "buttonColorHex");
        Intrinsics.i(buttonShapeOptions, "buttonShapeOptions");
        Intrinsics.i(consentTitleOption, "consentTitleOption");
        Intrinsics.i(footerType, "footerType");
        Intrinsics.i(loginTextPrefix, "loginTextPrefix");
        Intrinsics.i(loginTextSuffix, "loginTextSuffix");
        Intrinsics.i(sdkOptions, "sdkOptions");
        this.f5294a = consentMode;
        this.b = buttonColorHex;
        this.c = buttonShapeOptions;
        this.d = consentTitleOption;
        this.e = footerType;
        this.f = loginTextPrefix;
        this.g = loginTextSuffix;
        this.h = sdkOptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TruecallerSetupConfig)) {
            return false;
        }
        TruecallerSetupConfig truecallerSetupConfig = (TruecallerSetupConfig) obj;
        return this.f5294a == truecallerSetupConfig.f5294a && Intrinsics.d(this.b, truecallerSetupConfig.b) && this.c == truecallerSetupConfig.c && this.d == truecallerSetupConfig.d && this.e == truecallerSetupConfig.e && this.f == truecallerSetupConfig.f && this.g == truecallerSetupConfig.g && this.h == truecallerSetupConfig.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + nf1.e(this.f5294a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TruecallerSetupConfig(consentMode=" + this.f5294a + ", buttonColorHex=" + this.b + ", buttonShapeOptions=" + this.c + ", consentTitleOption=" + this.d + ", footerType=" + this.e + ", loginTextPrefix=" + this.f + ", loginTextSuffix=" + this.g + ", sdkOptions=" + this.h + ")";
    }
}
