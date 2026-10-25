package defpackage;

import app.chalo.locationdisclaimer.LocationDisclaimerDataState;
import app.chalo.login.ui.LoginLoadingPurpose;
import app.chalo.login.ui.options.LoginOptionsDataState;
import app.chalo.login.ui.otp.LoginOtpEnterDataState;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.format.DateTimeFormatBuilder;
import kotlinx.datetime.format.DateTimeFormatBuilderKt;
import kotlinx.datetime.format.LocalTimeFormatKt;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class kf0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17493a;

    public /* synthetic */ kf0(int i) {
        this.f17493a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17493a) {
            case 0:
                DateTimeFormatBuilder.WithTime optional = (DateTimeFormatBuilder.WithTime) obj;
                Lazy lazy = LocalTimeFormatKt.f17970a;
                Intrinsics.i(optional, "$this$optional");
                DateTimeFormatBuilderKt.b(optional, FilenameUtils.EXTENSION_SEPARATOR);
                optional.c();
                return Unit.f17538a;
            case 1:
                LocationDisclaimerDataState it = (LocationDisclaimerDataState) obj;
                Intrinsics.i(it, "it");
                return LocationDisclaimerDataState.a(it, false, false, null, true, 15);
            case 2:
                return LocationDisclaimerDataState.a((LocationDisclaimerDataState) obj, false, true, null, false, 29);
            case 3:
                return LocationDisclaimerDataState.a((LocationDisclaimerDataState) obj, false, false, null, false, 29);
            case 4:
                LocationDisclaimerDataState it2 = (LocationDisclaimerDataState) obj;
                Intrinsics.i(it2, "it");
                return LocationDisclaimerDataState.a(it2, false, false, null, false, 15);
            case 5:
                LoginOptionsDataState it3 = (LoginOptionsDataState) obj;
                Intrinsics.i(it3, "it");
                return LoginOptionsDataState.a(it3, null, null, null, false, null, false, null, null, null, null, false, false, 24575);
            case 6:
                LoginOptionsDataState it4 = (LoginOptionsDataState) obj;
                Intrinsics.i(it4, "it");
                return LoginOptionsDataState.a(it4, null, null, null, true, null, false, null, null, null, null, false, false, 32759);
            case 7:
                LoginOptionsDataState it5 = (LoginOptionsDataState) obj;
                Intrinsics.i(it5, "it");
                return LoginOptionsDataState.a(it5, null, null, null, false, null, false, null, null, null, null, false, false, 32759);
            case 8:
                LoginOptionsDataState it6 = (LoginOptionsDataState) obj;
                Intrinsics.i(it6, "it");
                return LoginOptionsDataState.a(it6, null, null, null, true, LoginLoadingPurpose.GENERAL, false, null, null, null, null, false, false, 32743);
            case 9:
                LoginOptionsDataState it7 = (LoginOptionsDataState) obj;
                Intrinsics.i(it7, "it");
                return LoginOptionsDataState.a(it7, null, null, null, false, null, false, null, null, null, null, false, false, 32759);
            case 10:
                LoginOptionsDataState it8 = (LoginOptionsDataState) obj;
                Intrinsics.i(it8, "it");
                return LoginOptionsDataState.a(it8, null, null, null, false, null, false, null, null, null, null, true, false, 24575);
            case 11:
                LoginOptionsDataState it9 = (LoginOptionsDataState) obj;
                Intrinsics.i(it9, "it");
                return LoginOptionsDataState.a(it9, null, null, null, false, null, false, null, null, null, null, false, false, 32759);
            case 12:
                return LoginOptionsDataState.a((LoginOptionsDataState) obj, null, null, null, true, LoginLoadingPurpose.REQUESTING_OTP, false, null, null, null, null, false, false, 32743);
            case 13:
                return LoginOptionsDataState.a((LoginOptionsDataState) obj, null, null, null, false, null, false, null, null, null, null, false, false, 32759);
            case 14:
                return LoginOptionsDataState.a((LoginOptionsDataState) obj, null, null, null, false, null, false, null, null, null, null, false, false, 32759);
            case 15:
                return LoginOptionsDataState.a((LoginOptionsDataState) obj, null, null, null, false, null, false, null, null, null, null, false, false, 32759);
            case 16:
                return LoginOptionsDataState.a((LoginOptionsDataState) obj, null, null, null, false, null, false, null, null, null, null, false, false, 32759);
            case 17:
                return LoginOptionsDataState.a((LoginOptionsDataState) obj, null, null, null, true, LoginLoadingPurpose.VERIFYING_LOGIN, false, null, null, null, null, false, false, 32743);
            case 18:
                return LoginOptionsDataState.a((LoginOptionsDataState) obj, null, null, null, false, null, false, null, null, null, null, false, false, 32759);
            case 19:
                return LoginOptionsDataState.a((LoginOptionsDataState) obj, null, null, null, false, null, false, null, null, null, null, false, false, 32759);
            case 20:
                return LoginOptionsDataState.a((LoginOptionsDataState) obj, null, null, null, false, null, false, null, null, null, null, false, false, 32759);
            case 21:
                return LoginOptionsDataState.a((LoginOptionsDataState) obj, null, null, null, false, null, false, null, null, null, null, false, false, 32759);
            case 22:
                return LoginOptionsDataState.a((LoginOptionsDataState) obj, null, null, null, false, null, false, null, null, null, null, false, false, 32759);
            case 23:
                return LoginOptionsDataState.a((LoginOptionsDataState) obj, null, null, null, false, null, false, null, null, null, null, false, false, 32759);
            case 24:
                return LoginOptionsDataState.a((LoginOptionsDataState) obj, null, null, null, false, null, false, null, null, null, null, false, false, 32759);
            case 25:
                LoginOtpEnterDataState it10 = (LoginOtpEnterDataState) obj;
                Intrinsics.i(it10, "it");
                return LoginOtpEnterDataState.a(it10, null, true, null, false, 0L, false, null, null, null, null, 2045);
            case 26:
                LoginOtpEnterDataState it11 = (LoginOtpEnterDataState) obj;
                Intrinsics.i(it11, "it");
                return LoginOtpEnterDataState.a(it11, null, false, null, false, 0L, false, null, null, null, null, 2031);
            case 27:
                LoginOtpEnterDataState it12 = (LoginOtpEnterDataState) obj;
                Intrinsics.i(it12, "it");
                return LoginOtpEnterDataState.a(it12, null, false, null, false, 0L, false, null, null, null, null, 2045);
            case 28:
                return LoginOtpEnterDataState.a((LoginOtpEnterDataState) obj, null, true, LoginLoadingPurpose.REQUESTING_OTP, false, 0L, false, null, null, null, null, 2041);
            default:
                return LoginOtpEnterDataState.a((LoginOtpEnterDataState) obj, null, false, null, false, 0L, false, null, null, null, null, 2045);
        }
    }
}
