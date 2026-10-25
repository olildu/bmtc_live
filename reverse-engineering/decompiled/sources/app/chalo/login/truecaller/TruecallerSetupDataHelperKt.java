package app.chalo.login.truecaller;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"login_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TruecallerSetupDataHelperKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5295a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;
        public static final /* synthetic */ int[] f;
        public static final /* synthetic */ int[] g;

        static {
            int[] iArr = new int[TruecallerSetupConfig.TruecallerConsentMode.values().length];
            try {
                iArr[TruecallerSetupConfig.TruecallerConsentMode.BOTTOMSHEET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TruecallerSetupConfig.TruecallerConsentMode.FULLSCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TruecallerSetupConfig.TruecallerConsentMode.POPUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5295a = iArr;
            int[] iArr2 = new int[TruecallerSetupConfig.TruecallerButtonShape.values().length];
            try {
                iArr2[TruecallerSetupConfig.TruecallerButtonShape.RECTANGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TruecallerSetupConfig.TruecallerButtonShape.ROUNDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
            int[] iArr3 = new int[TruecallerSetupConfig.TruecallerConsentTitleVerify.values().length];
            try {
                iArr3[TruecallerSetupConfig.TruecallerConsentTitleVerify.LOG_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[TruecallerSetupConfig.TruecallerConsentTitleVerify.SIGN_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[TruecallerSetupConfig.TruecallerConsentTitleVerify.SIGN_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[TruecallerSetupConfig.TruecallerConsentTitleVerify.VERIFY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[TruecallerSetupConfig.TruecallerConsentTitleVerify.REGISTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[TruecallerSetupConfig.TruecallerConsentTitleVerify.GET_STARTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            c = iArr3;
            int[] iArr4 = new int[TruecallerSetupConfig.TruecallerFooterType.values().length];
            try {
                iArr4[TruecallerSetupConfig.TruecallerFooterType.SKIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[TruecallerSetupConfig.TruecallerFooterType.CONTINUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[TruecallerSetupConfig.TruecallerFooterType.ANOTHER_METHOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[TruecallerSetupConfig.TruecallerFooterType.MANUALLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[TruecallerSetupConfig.TruecallerFooterType.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[TruecallerSetupConfig.TruecallerFooterType.LATER.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            d = iArr4;
            int[] iArr5 = new int[TruecallerSetupConfig.TruecallerLoginTextPrefix.values().length];
            try {
                iArr5[TruecallerSetupConfig.TruecallerLoginTextPrefix.TO_GET_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[TruecallerSetupConfig.TruecallerLoginTextPrefix.TO_CONTINUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[TruecallerSetupConfig.TruecallerLoginTextPrefix.TO_PLACE_ORDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[TruecallerSetupConfig.TruecallerLoginTextPrefix.TO_COMPLETE_YOUR_PURCHASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[TruecallerSetupConfig.TruecallerLoginTextPrefix.TO_CHECKOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[TruecallerSetupConfig.TruecallerLoginTextPrefix.TO_COMPLETE_YOUR_BOOKING.ordinal()] = 6;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[TruecallerSetupConfig.TruecallerLoginTextPrefix.TO_PROCEED_WITH_YOUR_BOOKING.ordinal()] = 7;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[TruecallerSetupConfig.TruecallerLoginTextPrefix.TO_CONTINUE_WITH_YOUR_BOOKING.ordinal()] = 8;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[TruecallerSetupConfig.TruecallerLoginTextPrefix.TO_GET_DETAILS.ordinal()] = 9;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[TruecallerSetupConfig.TruecallerLoginTextPrefix.TO_VIEW_MORE.ordinal()] = 10;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr5[TruecallerSetupConfig.TruecallerLoginTextPrefix.TO_CONTINUE_READING.ordinal()] = 11;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr5[TruecallerSetupConfig.TruecallerLoginTextPrefix.TO_PROCEED.ordinal()] = 12;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr5[TruecallerSetupConfig.TruecallerLoginTextPrefix.FOR_NEW_UPDATES.ordinal()] = 13;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr5[TruecallerSetupConfig.TruecallerLoginTextPrefix.TO_GET_UPDATES.ordinal()] = 14;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr5[TruecallerSetupConfig.TruecallerLoginTextPrefix.TO_SUBSCRIBE.ordinal()] = 15;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr5[TruecallerSetupConfig.TruecallerLoginTextPrefix.TO_SUBSCRIBE_AND_GET_UPDATES.ordinal()] = 16;
            } catch (NoSuchFieldError unused33) {
            }
            e = iArr5;
            int[] iArr6 = new int[TruecallerSetupConfig.TruecallerLoginTextSuffix.values().length];
            try {
                iArr6[TruecallerSetupConfig.TruecallerLoginTextSuffix.PLEASE_VERIFY_MOBILE_NO.ordinal()] = 1;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr6[TruecallerSetupConfig.TruecallerLoginTextSuffix.PLEASE_LOGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr6[TruecallerSetupConfig.TruecallerLoginTextSuffix.PLEASE_SIGNUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr6[TruecallerSetupConfig.TruecallerLoginTextSuffix.PLEASE_LOGIN_SIGNUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr6[TruecallerSetupConfig.TruecallerLoginTextSuffix.PLEASE_REGISTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr6[TruecallerSetupConfig.TruecallerLoginTextSuffix.PLEASE_SIGN_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused39) {
            }
            f = iArr6;
            int[] iArr7 = new int[TruecallerSetupConfig.TruecallerSdkOption.values().length];
            try {
                iArr7[TruecallerSetupConfig.TruecallerSdkOption.WITHOUT_OTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr7[TruecallerSetupConfig.TruecallerSdkOption.WITH_OTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused41) {
            }
            g = iArr7;
        }
    }
}
