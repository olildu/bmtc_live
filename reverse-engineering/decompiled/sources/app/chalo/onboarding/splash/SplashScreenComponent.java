package app.chalo.onboarding.splash;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.features.language.data.LanguageSelectionSourceType;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.onboarding.splash.SplashScreenComponent;
import app.chalo.onboarding.splash.orchestrator.SplashFlowOrchestrator;
import app.chalo.onboarding.splash.orchestrator.SplashNavigationDecision;
import app.chalo.onboarding.splash.ui.SplashScreenIntent;
import app.chalo.onboarding.splash.ui.SplashScreenSideEffects;
import app.chalo.onboarding.splash.ui.SplashScreenViewState;
import app.chalo.resultstatemanager.userconsent.UserConsentResultStateManager;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.AppMigrationPreconditionsArgs;
import app.chalo.scenes.args.CityDiscontinuedArgs;
import app.chalo.scenes.args.CitySelectionArgs;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.LanguageSelectionArgs;
import app.chalo.scenes.args.LoginOptionsArgs;
import com.arkivanov.decompose.ComponentContext;
import defpackage.da1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/onboarding/splash/SplashScreenComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/onboarding/splash/ui/SplashScreenIntent;", "Lapp/chalo/onboarding/splash/ui/SplashScreenViewState;", "Lapp/chalo/onboarding/splash/ui/SplashScreenSideEffects;", "Companion", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SplashScreenComponent extends ChaloBaseStateMviComponent<SplashScreenIntent, SplashScreenViewState, SplashScreenViewState, SplashScreenSideEffects> {
    public final ChaloNavigationManager k;
    public final SplashFlowOrchestrator l;
    public final UserConsentResultStateManager m;
    public final AnalyticsContract n;
    public final ChaloAppFeatureHelper o;
    public Job p;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/onboarding/splash/SplashScreenComponent$Companion;", "", "", "TAG", "Ljava/lang/String;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashScreenComponent(ComponentContext componentContext, ChaloNavigationManager chaloNavigationManager, SplashFlowOrchestrator splashFlowOrchestrator, UserConsentResultStateManager userConsentResultStateManager, AnalyticsContract analyticsContract, ChaloAppFeatureHelper chaloAppFeatureHelper) {
        super(componentContext);
        Intrinsics.i(componentContext, "componentContext");
        this.k = chaloNavigationManager;
        this.l = splashFlowOrchestrator;
        this.m = userConsentResultStateManager;
        this.n = analyticsContract;
        this.o = chaloAppFeatureHelper;
        splashFlowOrchestrator.c(this.j);
        G0(SplashScreenIntent.Initialization.f6692a);
    }

    public static final void F0(final SplashScreenComponent splashScreenComponent, final SplashNavigationDecision splashNavigationDecision) {
        Source source;
        AnalyticsContract analyticsContract = splashScreenComponent.n;
        Source source2 = Source.SPLASH_SCREEN;
        boolean z = splashNavigationDecision instanceof SplashNavigationDecision.ToLogin;
        SplashNavigationDecision.ToLanguageSelection toLanguageSelection = SplashNavigationDecision.ToLanguageSelection.f6686a;
        SplashNavigationDecision.ToHomeScreen toHomeScreen = SplashNavigationDecision.ToHomeScreen.f6685a;
        SplashNavigationDecision.ToMigrationScreen toMigrationScreen = SplashNavigationDecision.ToMigrationScreen.f6688a;
        if (z) {
            source = Source.LOGIN_OPTIONS_SCREEN;
        } else if (splashNavigationDecision instanceof SplashNavigationDecision.ToUserConsent) {
            source = Source.USER_CONSENT;
        } else if (splashNavigationDecision instanceof SplashNavigationDecision.ToCitySelection) {
            source = Source.CITY_SELECTION_SCREEN;
        } else if (splashNavigationDecision instanceof SplashNavigationDecision.ToCityDiscontinued) {
            source = Source.CITY_DISCONTINUED_SCREEN;
        } else if (Intrinsics.d(splashNavigationDecision, toMigrationScreen)) {
            source = Source.APP_MIGRATION_PRECONDITION_SCREEN;
        } else if (Intrinsics.d(splashNavigationDecision, toHomeScreen)) {
            source = Source.HOME_SCREEN;
        } else {
            if (!Intrinsics.d(splashNavigationDecision, toLanguageSelection)) {
                throw new NoWhenBranchMatchedException();
            }
            source = Source.LANGUAGE_SELECTION;
        }
        AnalyticsContractImplKt.b(analyticsContract, "splash screen navigation", source2, vo1.s("navigatingTo", source.getSourceName()), false, 24);
        if (z) {
            final int i = 0;
            splashScreenComponent.q0(new Function0(splashScreenComponent) { // from class: ua1
                public final /* synthetic */ SplashScreenComponent b;

                {
                    this.b = splashScreenComponent;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            this.b.k.b(new ChaloNavigationRequest.Navigate(new LoginOptionsArgs(((SplashNavigationDecision.ToLogin) splashNavigationDecision).f6687a, true), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                        case 1:
                            this.b.k.b(new ChaloNavigationRequest.Navigate(CitySelectionArgs.Companion.a(CitySelectionArgs.INSTANCE, ((SplashNavigationDecision.ToCitySelection) splashNavigationDecision).f6684a, null, 6), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                        default:
                            this.b.k.b(new ChaloNavigationRequest.Navigate(new CityDiscontinuedArgs(((SplashNavigationDecision.ToCityDiscontinued) splashNavigationDecision).f6683a), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
            return;
        }
        if (splashNavigationDecision instanceof SplashNavigationDecision.ToUserConsent) {
            String str = ((SplashNavigationDecision.ToUserConsent) splashNavigationDecision).f6689a;
            Job job = splashScreenComponent.p;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            splashScreenComponent.p = BuildersKt.d(splashScreenComponent.j, null, null, new SplashScreenComponent$navigateToUserConsentScreen$1(splashScreenComponent, str, null), 3);
            splashScreenComponent.q0(new da1(8, splashScreenComponent, str));
            return;
        }
        if (splashNavigationDecision instanceof SplashNavigationDecision.ToCitySelection) {
            final int i2 = 1;
            splashScreenComponent.q0(new Function0(splashScreenComponent) { // from class: ua1
                public final /* synthetic */ SplashScreenComponent b;

                {
                    this.b = splashScreenComponent;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            this.b.k.b(new ChaloNavigationRequest.Navigate(new LoginOptionsArgs(((SplashNavigationDecision.ToLogin) splashNavigationDecision).f6687a, true), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                        case 1:
                            this.b.k.b(new ChaloNavigationRequest.Navigate(CitySelectionArgs.Companion.a(CitySelectionArgs.INSTANCE, ((SplashNavigationDecision.ToCitySelection) splashNavigationDecision).f6684a, null, 6), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                        default:
                            this.b.k.b(new ChaloNavigationRequest.Navigate(new CityDiscontinuedArgs(((SplashNavigationDecision.ToCityDiscontinued) splashNavigationDecision).f6683a), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
            return;
        }
        if (splashNavigationDecision instanceof SplashNavigationDecision.ToCityDiscontinued) {
            final int i3 = 2;
            splashScreenComponent.q0(new Function0(splashScreenComponent) { // from class: ua1
                public final /* synthetic */ SplashScreenComponent b;

                {
                    this.b = splashScreenComponent;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i3) {
                        case 0:
                            this.b.k.b(new ChaloNavigationRequest.Navigate(new LoginOptionsArgs(((SplashNavigationDecision.ToLogin) splashNavigationDecision).f6687a, true), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                        case 1:
                            this.b.k.b(new ChaloNavigationRequest.Navigate(CitySelectionArgs.Companion.a(CitySelectionArgs.INSTANCE, ((SplashNavigationDecision.ToCitySelection) splashNavigationDecision).f6684a, null, 6), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                        default:
                            this.b.k.b(new ChaloNavigationRequest.Navigate(new CityDiscontinuedArgs(((SplashNavigationDecision.ToCityDiscontinued) splashNavigationDecision).f6683a), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
            return;
        }
        if (Intrinsics.d(splashNavigationDecision, toMigrationScreen)) {
            final int i4 = 0;
            splashScreenComponent.q0(new Function0(splashScreenComponent) { // from class: va1
                public final /* synthetic */ SplashScreenComponent b;

                {
                    this.b = splashScreenComponent;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i4) {
                        case 0:
                            this.b.k.b(new ChaloNavigationRequest.Navigate(AppMigrationPreconditionsArgs.INSTANCE, new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                        case 1:
                            this.b.k.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                        default:
                            this.b.k.b(new ChaloNavigationRequest.Navigate(new LanguageSelectionArgs(LanguageSelectionSourceType.SPLASH_SCREEN), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
        } else {
            if (Intrinsics.d(splashNavigationDecision, toHomeScreen)) {
                AnalyticsContract.DefaultImpls.a(splashScreenComponent.n, "new home screen rendered", "", null, null, false, 28);
                AnalyticsContract.DefaultImpls.a(splashScreenComponent.n, "tab based homescreen rendered", "", null, null, false, 28);
                final int i5 = 1;
                splashScreenComponent.q0(new Function0(splashScreenComponent) { // from class: va1
                    public final /* synthetic */ SplashScreenComponent b;

                    {
                        this.b = splashScreenComponent;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                this.b.k.b(new ChaloNavigationRequest.Navigate(AppMigrationPreconditionsArgs.INSTANCE, new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                                break;
                            case 1:
                                this.b.k.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                                break;
                            default:
                                this.b.k.b(new ChaloNavigationRequest.Navigate(new LanguageSelectionArgs(LanguageSelectionSourceType.SPLASH_SCREEN), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                                break;
                        }
                        return Unit.f17538a;
                    }
                });
                return;
            }
            if (!Intrinsics.d(splashNavigationDecision, toLanguageSelection)) {
                throw new NoWhenBranchMatchedException();
            }
            final int i6 = 2;
            splashScreenComponent.q0(new Function0(splashScreenComponent) { // from class: va1
                public final /* synthetic */ SplashScreenComponent b;

                {
                    this.b = splashScreenComponent;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i6) {
                        case 0:
                            this.b.k.b(new ChaloNavigationRequest.Navigate(AppMigrationPreconditionsArgs.INSTANCE, new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                        case 1:
                            this.b.k.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                        default:
                            this.b.k.b(new ChaloNavigationRequest.Navigate(new LanguageSelectionArgs(LanguageSelectionSourceType.SPLASH_SCREEN), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
        }
    }

    public final void G0(SplashScreenIntent splashScreenIntent) {
        C0(splashScreenIntent);
        boolean zEquals = splashScreenIntent.equals(SplashScreenIntent.Initialization.f6692a);
        ContextScope contextScope = this.j;
        if (zEquals) {
            BuildersKt.d(contextScope, null, null, new SplashScreenComponent$handleInitialization$1(this, null), 3);
        } else {
            if (!splashScreenIntent.equals(SplashScreenIntent.ProceedToApp.f6693a)) {
                throw new NoWhenBranchMatchedException();
            }
            BuildersKt.d(contextScope, null, null, new SplashScreenComponent$handleProceedToApp$1(this, null), 3);
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (SplashScreenViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new SplashScreenViewState(false, null, null);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void y0() {
        AnalyticsContract analyticsContract = this.n;
        Intrinsics.i(analyticsContract, "<this>");
        analyticsContract.b();
    }
}
