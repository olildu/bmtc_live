package defpackage;

import app.chalo.constants.Source;
import app.chalo.login.ui.otp.LoginOtpEnterComponent;
import app.chalo.login.ui.otp.LoginOtpEnterIntent;
import app.chalo.login.ui.otp.LoginOtpEnterSideEffect;
import app.chalo.resultstatemanager.ResultStateKeeperMeta;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.CitySelectionArgs;
import app.chalo.scenes.args.HomeArgs;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yf0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20104a;
    public final /* synthetic */ LoginOtpEnterComponent b;

    public /* synthetic */ yf0(LoginOtpEnterComponent loginOtpEnterComponent, int i) {
        this.f20104a = i;
        this.b = loginOtpEnterComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20104a) {
            case 0:
                String str = this.b.G;
                if (str != null) {
                    return new ResultStateKeeperMeta(str);
                }
                return null;
            case 1:
                this.b.s.b(new ChaloNavigationRequest.Navigate(CitySelectionArgs.Companion.a(CitySelectionArgs.INSTANCE, Source.LOGIN_OTP_SCREEN, null, 6), new ChaloNavOptions(new PopUpToConfig.Scene(ChaloScenes.LoginOptions, true), 2), null, 4));
                break;
            case 2:
                this.b.s.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Scene(ChaloScenes.LoginOptions, true)));
                break;
            case 3:
                this.b.r0(LoginOtpEnterSideEffect.HideKeyboard.f5342a);
                break;
            case 4:
                this.b.s.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 2), null, 4));
                break;
            case 5:
                this.b.O0(LoginOtpEnterIntent.OnResendOtpClickedIntent.f5337a);
                break;
            default:
                gf.u(null, this.b.s);
                break;
        }
        return Unit.f17538a;
    }
}
