package defpackage;

import app.chalo.constants.Source;
import app.chalo.onboarding.languageselection.LanguageSelectionComponent;
import app.chalo.onboarding.languageselection.LanguageSelectionIntent;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.CitySelectionArgs;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.LoginOptionsArgs;
import app.chalo.uistate.text.StyledTextClickHandler;
import app.chalo.utils.PlatformFeature;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hd0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15815a;
    public final /* synthetic */ LanguageSelectionComponent b;

    public /* synthetic */ hd0(LanguageSelectionComponent languageSelectionComponent, int i) {
        this.f15815a = i;
        this.b = languageSelectionComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f15815a;
        Unit unit = Unit.f17538a;
        final LanguageSelectionComponent languageSelectionComponent = this.b;
        switch (i) {
            case 0:
                languageSelectionComponent.L0(LanguageSelectionIntent.ContinueClicked.f6652a);
                return unit;
            case 1:
                return new StyledTextClickHandler() { // from class: app.chalo.onboarding.languageselection.LanguageSelectionComponent$tncStyledTextClickHandler$2$1
                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                    public final void a() {
                        languageSelectionComponent.L0(LanguageSelectionIntent.TncTextClicked.f6656a);
                    }

                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                    /* JADX INFO: renamed from: b */
                    public final String getF10090a() {
                        return ((LanguageSelectionDataState) languageSelectionComponent.f.getValue()).h;
                    }

                    @Override // app.chalo.uistate.text.StyledTextClickHandler
                    /* JADX INFO: renamed from: getTag */
                    public final String getF10085a() {
                        return "URL";
                    }
                };
            case 2:
                float f = PlatformFeature.f10436a;
                languageSelectionComponent.q.b(new ChaloNavigationRequest.Navigate(new LoginOptionsArgs(Source.LANGUAGE_SELECTION, true), new ChaloNavOptions(new PopUpToConfig.Scene(ChaloScenes.LanguageSelection, true), 3), null, 4));
                return unit;
            case 3:
                languageSelectionComponent.q.b(new ChaloNavigationRequest.Navigate(CitySelectionArgs.Companion.a(CitySelectionArgs.INSTANCE, Source.LANGUAGE_SELECTION, null, 6), new ChaloNavOptions(PopUpToConfig.Prev.f9221a, 2), null, 4));
                return unit;
            default:
                languageSelectionComponent.q.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 2), null, 4));
                return unit;
        }
    }
}
