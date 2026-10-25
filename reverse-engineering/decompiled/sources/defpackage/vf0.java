package defpackage;

import app.chalo.constants.Source;
import app.chalo.domain.GetSupportedChaloCountryListUseCase;
import app.chalo.login.ui.options.LoginOptionsComponent;
import app.chalo.login.ui.options.LoginOptionsIntent;
import app.chalo.login.ui.options.LoginOptionsSideEffect;
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
public final /* synthetic */ class vf0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19832a;
    public final /* synthetic */ LoginOptionsComponent b;

    public /* synthetic */ vf0(LoginOptionsComponent loginOptionsComponent, int i) {
        this.f19832a = i;
        this.b = loginOptionsComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19832a) {
            case 0:
                this.b.Q0(LoginOptionsIntent.OnContinueClicked.f5307a);
                return Unit.f17538a;
            case 1:
                this.b.w.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Scene(ChaloScenes.LoginOptions, true)));
                return Unit.f17538a;
            case 2:
                this.b.w.b(new ChaloNavigationRequest.Navigate(CitySelectionArgs.Companion.a(CitySelectionArgs.INSTANCE, Source.LOGIN_OPTIONS_SCREEN, null, 6), new ChaloNavOptions(new PopUpToConfig.Scene(ChaloScenes.LoginOptions, true), 2), null, 4));
                return Unit.f17538a;
            case 3:
                gf.u(null, this.b.w);
                return Unit.f17538a;
            case 4:
                gf.u(null, this.b.w);
                return Unit.f17538a;
            case 5:
                this.b.x.getClass();
                return GetSupportedChaloCountryListUseCase.a();
            case 6:
                String str = this.b.O;
                if (str != null) {
                    return new ResultStateKeeperMeta(str);
                }
                return null;
            case 7:
                this.b.r0(new LoginOptionsSideEffect.HandleKeyboardVisibility());
                return Unit.f17538a;
            case 8:
                this.b.Q0(LoginOptionsIntent.OnCountrySelectDropdownClicked.f5308a);
                return Unit.f17538a;
            case 9:
                this.b.w.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 2), null, 4));
                return Unit.f17538a;
            default:
                this.b.Q0(LoginOptionsIntent.LoginBackPressed.f5306a);
                return Unit.f17538a;
        }
    }
}
