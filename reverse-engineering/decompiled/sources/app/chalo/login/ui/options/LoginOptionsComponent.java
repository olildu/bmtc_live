package app.chalo.login.ui.options;

import androidx.compose.ui.unit.Dp;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.ProfilePolicy;
import app.chalo.behaviour.policy.ResolveProfilePolicyUseCase;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.config.ChaloPhoneNumberCountry;
import app.chalo.config.CountryPhoneNumberConfig;
import app.chalo.config.CountryPhoneNumberConfigKt;
import app.chalo.constants.AppConstants;
import app.chalo.constants.Source;
import app.chalo.domain.GetSupportedChaloCountryListUseCase;
import app.chalo.domain.MinProfileAnalyticsHelper;
import app.chalo.domain.PhoneNumberValidationResult;
import app.chalo.domain.ValidatePhoneNumberUseCase;
import app.chalo.features.adjust.AdjustManager;
import app.chalo.helper.MandatoryFirstHistoryCallGuard;
import app.chalo.login.UserCountryPhoneNumberConfigProvider;
import app.chalo.login.domain.FetchLoginAfterCitySelectionConfigUseCase;
import app.chalo.login.domain.GenerateUidForTruecallerLoginUseCase;
import app.chalo.login.domain.ResolvePostLoginNavigationTargetUseCase;
import app.chalo.login.domain.SendOtpForLoginUseCase;
import app.chalo.login.domain.SyncAndUpdateAnalyticsPropertiesAfterLoginUseCase;
import app.chalo.login.domain.ValidatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase;
import app.chalo.login.domain.VerifyLoginSuccessOnServerAndHandleTokensUseCase;
import app.chalo.login.manager.DpdpaConsentManager;
import app.chalo.login.phonenumberhint.PhoneNumberHintHandler;
import app.chalo.login.phonenumberhint.PhoneNumberHintHandlerProvider;
import app.chalo.login.truecaller.TruecallerError;
import app.chalo.login.truecaller.TruecallerSetupConfig;
import app.chalo.login.truecaller.TruecallerSetupHandler;
import app.chalo.login.truecaller.TruecallerSetupHandlerProvider;
import app.chalo.login.ui.LoginLoadingPurpose;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.ResultStateKeeperMeta;
import app.chalo.resultstatemanager.ResultStateRecoveredData;
import app.chalo.resultstatemanager.minprofileupdate.MinProfileUpdateResultStateManager;
import app.chalo.resultstatemanager.userconsent.UserConsentResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.LoginOptionsArgs;
import app.chalo.scenes.args.UserConsentScreenArgs;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.uistate.textField.TextFieldEventHandler;
import app.chalo.uistate.textField.UIImeAction;
import app.chalo.uistate.textField.UIImeActionHandler;
import app.chalo.uistate.textField.UIKeyboardOption;
import app.chalo.uistate.textField.UIKeyboardType;
import app.chalo.uistate.textField.UITextFieldColors;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.userconsent.UserConsentFlowType;
import app.chalo.utils.KUUID;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.statekeeper.StateKeeper;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.cy;
import defpackage.dd0;
import defpackage.kf0;
import defpackage.n10;
import defpackage.nf1;
import defpackage.vf0;
import defpackage.vo1;
import defpackage.wf0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/login/ui/options/LoginOptionsComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/login/ui/options/LoginOptionsIntent;", "Lapp/chalo/login/ui/options/LoginOptionsDataState;", "Lapp/chalo/login/ui/options/LoginOptionsUIState;", "Lapp/chalo/login/ui/options/LoginOptionsSideEffect;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LoginOptionsComponent extends ChaloBaseStateMviComponent<LoginOptionsIntent, LoginOptionsDataState, LoginOptionsUIState, LoginOptionsSideEffect> {
    public final PhoneNumberHintHandlerProvider A;
    public final UserCountryPhoneNumberConfigProvider B;
    public final AdjustManager C;
    public final DpdpaConsentManager D;
    public final UserConsentResultStateManager E;
    public final MinProfileUpdateResultStateManager F;
    public final MandatoryFirstHistoryCallGuard G;
    public final ResolvePostLoginNavigationTargetUseCase H;
    public final MinProfileAnalyticsHelper I;
    public final ResolveProfilePolicyUseCase J;
    public boolean K;
    public boolean L;
    public Job M;
    public Job N;
    public String O;
    public Job P;
    public final Lazy Q;
    public final LoginOptionsArgs k;
    public final TruecallerSetupHandlerProvider l;
    public final GenerateUidForTruecallerLoginUseCase m;
    public final ValidatePhoneNumberUseCase n;
    public final SendOtpForLoginUseCase o;
    public final VerifyLoginSuccessOnServerAndHandleTokensUseCase p;
    public final ValidatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase q;
    public final StringProvider r;
    public final AnalyticsContract s;
    public final SyncAndUpdateAnalyticsPropertiesAfterLoginUseCase t;
    public final FetchLoginAfterCitySelectionConfigUseCase u;
    public final KotlinToastManager v;
    public final ChaloNavigationManager w;
    public final GetSupportedChaloCountryListUseCase x;
    public final CityProvider y;
    public final UserProfileDetailsProvider z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5299a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[PhoneNumberValidationResult.values().length];
            try {
                iArr[PhoneNumberValidationResult.VALID_PHONE_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhoneNumberValidationResult.NON_DIGIT_CHAR_USED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PhoneNumberValidationResult.INSUFFICIENT_DIGITS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PhoneNumberValidationResult.EXPECTED_LENGTH_EXCEEDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5299a = iArr;
            int[] iArr2 = new int[TruecallerError.values().length];
            try {
                iArr2[TruecallerError.INVALID_ACCOUNT_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TruecallerError.CONTINUE_WITH_DIFFERENT_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
            int[] iArr3 = new int[LoginLoadingPurpose.values().length];
            try {
                iArr3[LoginLoadingPurpose.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[LoginLoadingPurpose.REQUESTING_OTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[LoginLoadingPurpose.VERIFYING_LOGIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            c = iArr3;
        }
    }

    public LoginOptionsComponent(ComponentContext componentContext, LoginOptionsArgs loginOptionsArgs, TruecallerSetupHandlerProvider truecallerSetupHandlerProvider, GenerateUidForTruecallerLoginUseCase generateUidForTruecallerLoginUseCase, ValidatePhoneNumberUseCase validatePhoneNumberUseCase, SendOtpForLoginUseCase sendOtpForLoginUseCase, VerifyLoginSuccessOnServerAndHandleTokensUseCase verifyLoginSuccessOnServerAndHandleTokensUseCase, ValidatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase validatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase, StringProvider stringProvider, AnalyticsContract analyticsContract, SyncAndUpdateAnalyticsPropertiesAfterLoginUseCase syncAndUpdateAnalyticsPropertiesAfterLoginUseCase, FetchLoginAfterCitySelectionConfigUseCase fetchLoginAfterCitySelectionConfigUseCase, KotlinToastManager kotlinToastManager, ChaloNavigationManager chaloNavigationManager, GetSupportedChaloCountryListUseCase getSupportedChaloCountryListUseCase, CityProvider cityProvider, UserProfileDetailsProvider userProfileDetailsProvider, PhoneNumberHintHandlerProvider phoneNumberHintHandlerProvider, UserCountryPhoneNumberConfigProvider userCountryPhoneNumberConfigProvider, AdjustManager adjustManager, DpdpaConsentManager dpdpaConsentManager, UserConsentResultStateManager userConsentResultStateManager, MinProfileUpdateResultStateManager minProfileUpdateResultStateManager, MandatoryFirstHistoryCallGuard mandatoryFirstHistoryCallGuard, ResolvePostLoginNavigationTargetUseCase resolvePostLoginNavigationTargetUseCase, MinProfileAnalyticsHelper minProfileAnalyticsHelper, ResolveProfilePolicyUseCase resolveProfilePolicyUseCase) {
        super(componentContext);
        this.k = loginOptionsArgs;
        this.l = truecallerSetupHandlerProvider;
        this.m = generateUidForTruecallerLoginUseCase;
        this.n = validatePhoneNumberUseCase;
        this.o = sendOtpForLoginUseCase;
        this.p = verifyLoginSuccessOnServerAndHandleTokensUseCase;
        this.q = validatePrefixedPhoneNumberCountryCodeWithCurrentCityUseCase;
        this.r = stringProvider;
        this.s = analyticsContract;
        this.t = syncAndUpdateAnalyticsPropertiesAfterLoginUseCase;
        this.u = fetchLoginAfterCitySelectionConfigUseCase;
        this.v = kotlinToastManager;
        this.w = chaloNavigationManager;
        this.x = getSupportedChaloCountryListUseCase;
        this.y = cityProvider;
        this.z = userProfileDetailsProvider;
        this.A = phoneNumberHintHandlerProvider;
        this.B = userCountryPhoneNumberConfigProvider;
        this.C = adjustManager;
        this.D = dpdpaConsentManager;
        this.E = userConsentResultStateManager;
        this.F = minProfileUpdateResultStateManager;
        this.G = mandatoryFirstHistoryCallGuard;
        this.H = resolvePostLoginNavigationTargetUseCase;
        this.I = minProfileAnalyticsHelper;
        this.J = resolveProfilePolicyUseCase;
        this.L = true;
        this.Q = LazyKt.b(new vf0(this, 5));
        Q0(new LoginOptionsIntent.InitializationIntent(loginOptionsArgs.b));
        StateKeeper b = componentContext.getB();
        ResultStateKeeperMeta.Companion companion = ResultStateKeeperMeta.INSTANCE;
        ResultStateRecoveredData resultStateRecoveredDataA = userConsentResultStateManager.a("LoginOptions_SK_Key", b, companion.serializer(), companion.serializer(), new vf0(this, 6));
        if (resultStateRecoveredDataA != null) {
            this.M = BuildersKt.d(this.j, null, null, new LoginOptionsComponent$1$1(this, resultStateRecoveredDataA, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object F0(LoginOptionsComponent loginOptionsComponent, ContinuationImpl continuationImpl) {
        LoginOptionsComponent$initTruecallerAndSetupLoginMethods$1 loginOptionsComponent$initTruecallerAndSetupLoginMethods$1;
        LoginOptionsComponent loginOptionsComponent2;
        TruecallerSetupHandlerProvider truecallerSetupHandlerProvider = loginOptionsComponent.l;
        if (continuationImpl instanceof LoginOptionsComponent$initTruecallerAndSetupLoginMethods$1) {
            loginOptionsComponent$initTruecallerAndSetupLoginMethods$1 = (LoginOptionsComponent$initTruecallerAndSetupLoginMethods$1) continuationImpl;
            int i = loginOptionsComponent$initTruecallerAndSetupLoginMethods$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginOptionsComponent$initTruecallerAndSetupLoginMethods$1.label = i - Integer.MIN_VALUE;
            } else {
                loginOptionsComponent$initTruecallerAndSetupLoginMethods$1 = new LoginOptionsComponent$initTruecallerAndSetupLoginMethods$1(loginOptionsComponent, continuationImpl);
            }
        } else {
            loginOptionsComponent$initTruecallerAndSetupLoginMethods$1 = new LoginOptionsComponent$initTruecallerAndSetupLoginMethods$1(loginOptionsComponent, continuationImpl);
        }
        Object objA = loginOptionsComponent$initTruecallerAndSetupLoginMethods$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = loginOptionsComponent$initTruecallerAndSetupLoginMethods$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            ResolveProfilePolicyUseCase resolveProfilePolicyUseCase = loginOptionsComponent.J;
            loginOptionsComponent$initTruecallerAndSetupLoginMethods$1.L$0 = loginOptionsComponent;
            loginOptionsComponent$initTruecallerAndSetupLoginMethods$1.label = 1;
            objA = resolveProfilePolicyUseCase.a(loginOptionsComponent$initTruecallerAndSetupLoginMethods$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            loginOptionsComponent2 = loginOptionsComponent;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            loginOptionsComponent2 = (LoginOptionsComponent) loginOptionsComponent$initTruecallerAndSetupLoginMethods$1.L$0;
            ResultKt.b(objA);
        }
        loginOptionsComponent2.L = ((ProfilePolicy) objA).e;
        boolean z = loginOptionsComponent.L;
        Unit unit = Unit.f17538a;
        if (!z) {
            loginOptionsComponent.Q0(new LoginOptionsIntent.SetUpTruecallerVisibilityIntent(false));
            return unit;
        }
        BuildersKt.d(loginOptionsComponent.j, null, null, new LoginOptionsComponent$initTruecallerAndSetupLoginMethods$2(loginOptionsComponent, null), 3);
        Lazy lazy = truecallerSetupHandlerProvider.f5296a;
        TruecallerSetupHandler truecallerSetupHandler = lazy != null ? (TruecallerSetupHandler) lazy.getValue() : null;
        if (truecallerSetupHandler != null) {
            truecallerSetupHandler.S(new TruecallerSetupConfig(TruecallerSetupConfig.TruecallerConsentMode.BOTTOMSHEET, TruecallerSetupConfig.i, TruecallerSetupConfig.TruecallerButtonShape.RECTANGLE, TruecallerSetupConfig.TruecallerConsentTitleVerify.VERIFY, TruecallerSetupConfig.TruecallerFooterType.CONTINUE, TruecallerSetupConfig.TruecallerLoginTextPrefix.TO_CONTINUE, TruecallerSetupConfig.TruecallerLoginTextSuffix.PLEASE_VERIFY_MOBILE_NO, TruecallerSetupConfig.TruecallerSdkOption.WITHOUT_OTP), new LoginOptionsComponent$initTruecallerAndSetupLoginMethods$3(1, loginOptionsComponent, LoginOptionsComponent.class, "handleTruecallerProfileResult", "handleTruecallerProfileResult(Lapp/chalo/utils/ChaloUseCaseResult;)V", 0));
        }
        Lazy lazy2 = truecallerSetupHandlerProvider.f5296a;
        TruecallerSetupHandler truecallerSetupHandler2 = lazy2 != null ? (TruecallerSetupHandler) lazy2.getValue() : null;
        boolean z2 = truecallerSetupHandler2 != null ? truecallerSetupHandler2.z() : false;
        AnalyticsContractImplKt.b(loginOptionsComponent.s, "truecaller usable check", Source.LOGIN_OPTIONS_SCREEN, vo1.s("isTCUsable", String.valueOf(z2)), false, 24);
        loginOptionsComponent.Q0(new LoginOptionsIntent.SetUpTruecallerVisibilityIntent(z2));
        return unit;
    }

    public static final void G0(LoginOptionsComponent loginOptionsComponent) {
        Job job = loginOptionsComponent.M;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        String strA = KUUID.a();
        loginOptionsComponent.O = strA;
        loginOptionsComponent.M = BuildersKt.d(loginOptionsComponent.j, null, null, new LoginOptionsComponent$navigateToUserConsentScreen$1(loginOptionsComponent, strA, null), 3);
        ChaloNavigationManagerKt.e(loginOptionsComponent.w, new UserConsentScreenArgs(UserConsentFlowType.FreshLogin.INSTANCE, loginOptionsComponent.O), null, 6);
    }

    public static final Object H0(LoginOptionsComponent loginOptionsComponent, ResultStateData resultStateData, SuspendLambda suspendLambda) {
        loginOptionsComponent.O = null;
        boolean z = resultStateData instanceof ResultStateData.Cancelled;
        Unit unit = Unit.f17538a;
        if (z) {
            return unit;
        }
        if (!(resultStateData instanceof ResultStateData.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((Boolean) ((ResultStateData.Success) resultStateData).f9039a).booleanValue()) {
            loginOptionsComponent.E0(new kf0(6));
            Object objN0 = loginOptionsComponent.N0(suspendLambda);
            if (objN0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objN0;
            }
        }
        return unit;
    }

    public static final void I0(LoginOptionsComponent loginOptionsComponent, String str) {
        loginOptionsComponent.getClass();
        loginOptionsComponent.R0("login failed", MapsKt.i(new Pair(FirebaseAnalytics.Param.METHOD, "trueCaller"), new Pair("reason", str)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J0(boolean z, ContinuationImpl continuationImpl) {
        LoginOptionsComponent$continueButtonUIState$1 loginOptionsComponent$continueButtonUIState$1;
        ButtonUIStateFactory buttonUIStateFactory;
        if (continuationImpl instanceof LoginOptionsComponent$continueButtonUIState$1) {
            loginOptionsComponent$continueButtonUIState$1 = (LoginOptionsComponent$continueButtonUIState$1) continuationImpl;
            int i = loginOptionsComponent$continueButtonUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginOptionsComponent$continueButtonUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                loginOptionsComponent$continueButtonUIState$1 = new LoginOptionsComponent$continueButtonUIState$1(this, continuationImpl);
            }
        } else {
            loginOptionsComponent$continueButtonUIState$1 = new LoginOptionsComponent$continueButtonUIState$1(this, continuationImpl);
        }
        Object objB = loginOptionsComponent$continueButtonUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = loginOptionsComponent$continueButtonUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
            loginOptionsComponent$continueButtonUIState$1.L$0 = buttonUIStateFactory2;
            loginOptionsComponent$continueButtonUIState$1.Z$0 = z;
            loginOptionsComponent$continueButtonUIState$1.label = 1;
            objB = this.r.b(StringEnum.GET_OTP, new Object[0], loginOptionsComponent$continueButtonUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            buttonUIStateFactory = buttonUIStateFactory2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = loginOptionsComponent$continueButtonUIState$1.Z$0;
            ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) loginOptionsComponent$continueButtonUIState$1.L$0;
            ResultKt.b(objB);
            buttonUIStateFactory = buttonUIStateFactory3;
        }
        return ButtonUIStateFactory.g(buttonUIStateFactory, (String) objB, new vf0(this, 0), null, null, z, 0.0f, 44);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:36:0x0145  */
    /* JADX WARN: Code duplicated, block: B:39:0x014a  */
    /* JADX WARN: Code duplicated, block: B:40:0x014d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0157  */
    /* JADX WARN: Code duplicated, block: B:43:0x015c  */
    /* JADX WARN: Code duplicated, block: B:46:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:50:0x0209  */
    /* JADX WARN: Code duplicated, block: B:53:0x0227  */
    /* JADX WARN: Code duplicated, block: B:56:0x023d  */
    /* JADX WARN: Code duplicated, block: B:59:0x024d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0287  */
    /* JADX WARN: Code duplicated, block: B:64:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:65:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public final Object p0(LoginOptionsDataState loginOptionsDataState, ContinuationImpl continuationImpl) {
        LoginOptionsComponent$convertToUiState$1 loginOptionsComponent$convertToUiState$1;
        ToolbarUIState toolbarUIState;
        ButtonUIState buttonUIState;
        ToolbarUIState toolbarUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        String str;
        CountryPhoneNumberConfig countryPhoneNumberConfig;
        CountryPhoneNumberConfig countryPhoneNumberConfig2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        CountryFlagTabUIState countryFlagTabUIState;
        Integer num;
        final int iIntValue;
        boolean z;
        ChaloColorToken.ShadyGray shadyGray;
        LoginPhoneNumberTextFieldUIState loginPhoneNumberTextFieldUIState;
        CountryFlagTabUIState countryFlagTabUIState2;
        LoginSupportedCountryDialogUIState loginSupportedCountryDialogUIState;
        ChaloColorToken chaloColorToken;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        LoginPhoneNumberTextFieldUIState loginPhoneNumberTextFieldUIState2;
        LoadingDialogUIState loadingDialogUIState;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        CountryFlagTabUIState countryFlagTabUIState3;
        ToolbarUIState toolbarUIState3;
        Object objP0;
        LoginOptionsDataState loginOptionsDataState2;
        LoginPhoneNumberTextFieldUIState loginPhoneNumberTextFieldUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        ToolbarUIState toolbarUIState4;
        TextUIState.ChaloTextUIState chaloTextUIState6;
        CountryFlagTabUIState countryFlagTabUIState4;
        IconType iconTypeA;
        ArrayList arrayList;
        IconType iconTypeA2;
        ImageUIState imageUIState;
        LoginOptionsDataState loginOptionsDataState3 = loginOptionsDataState;
        if (continuationImpl instanceof LoginOptionsComponent$convertToUiState$1) {
            loginOptionsComponent$convertToUiState$1 = (LoginOptionsComponent$convertToUiState$1) continuationImpl;
            int i = loginOptionsComponent$convertToUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginOptionsComponent$convertToUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                loginOptionsComponent$convertToUiState$1 = new LoginOptionsComponent$convertToUiState$1(this, continuationImpl);
            }
        } else {
            loginOptionsComponent$convertToUiState$1 = new LoginOptionsComponent$convertToUiState$1(this, continuationImpl);
        }
        Object objJ0 = loginOptionsComponent$convertToUiState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = loginOptionsComponent$convertToUiState$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ0);
            toolbarUIState = new ToolbarUIState(null, null, null, null, null, ChaloThemeHelper.b().f1917a, null, null, 223);
            boolean z2 = loginOptionsDataState3.f;
            loginOptionsComponent$convertToUiState$1.L$0 = loginOptionsDataState3;
            loginOptionsComponent$convertToUiState$1.L$1 = toolbarUIState;
            loginOptionsComponent$convertToUiState$1.label = 1;
            objJ0 = J0(z2, loginOptionsComponent$convertToUiState$1);
            if (objJ0 != obj) {
            }
            obj = obj;
            return obj;
        }
        if (i2 == 1) {
            ToolbarUIState toolbarUIState5 = (ToolbarUIState) loginOptionsComponent$convertToUiState$1.L$1;
            LoginOptionsDataState loginOptionsDataState4 = (LoginOptionsDataState) loginOptionsComponent$convertToUiState$1.L$0;
            ResultKt.b(objJ0);
            toolbarUIState = toolbarUIState5;
            loginOptionsDataState3 = loginOptionsDataState4;
        } else {
            if (i2 == 2) {
                ButtonUIState buttonUIState2 = (ButtonUIState) loginOptionsComponent$convertToUiState$1.L$2;
                toolbarUIState2 = (ToolbarUIState) loginOptionsComponent$convertToUiState$1.L$1;
                LoginOptionsDataState loginOptionsDataState5 = (LoginOptionsDataState) loginOptionsComponent$convertToUiState$1.L$0;
                ResultKt.b(objJ0);
                buttonUIState = buttonUIState2;
                loginOptionsDataState3 = loginOptionsDataState5;
                chaloTextUIState = (TextUIState.ChaloTextUIState) objJ0;
                str = loginOptionsDataState3.c;
                countryPhoneNumberConfig = loginOptionsDataState3.b;
                if (str != null || str.length() == 0) {
                    countryPhoneNumberConfig2 = countryPhoneNumberConfig;
                    chaloTextUIState2 = null;
                } else {
                    countryPhoneNumberConfig2 = countryPhoneNumberConfig;
                    chaloTextUIState2 = new TextUIState.ChaloTextUIState(str, UITextStyle.BodyMedium, ChaloColorToken.ErrorColor.f9794a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                }
                if (countryPhoneNumberConfig2 != null || (iconTypeA = CountryPhoneNumberConfigKt.a(countryPhoneNumberConfig2.f1937a)) == null) {
                    countryFlagTabUIState = null;
                } else {
                    countryFlagTabUIState = new CountryFlagTabUIState(new ImageUIState(iconTypeA, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().i), Dp.m7276boximpl(ChaloThemeHelper.a().j)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), UiEventHandler.Companion.a(new vf0(this, 8)));
                }
                String str2 = loginOptionsDataState3.f5304a;
                if (countryPhoneNumberConfig2 != null) {
                    iIntValue = countryPhoneNumberConfig2.d;
                } else {
                    num = (Integer) CollectionsKt.H(AppConstants.f1940a);
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 10;
                    }
                }
                z = loginOptionsDataState3.m;
                float f = ChaloThemeHelper.a().b;
                UIShape.Rectangle rectangle = UIShape.d;
                shadyGray = ChaloColorToken.ShadyGray.f9851a;
                BorderUISpec borderUISpec = new BorderUISpec(f, shadyGray, rectangle);
                float f2 = ChaloThemeHelper.a().g;
                float f3 = ChaloThemeHelper.a().f;
                ChaloPadding chaloPadding = new ChaloPadding(f3, f2, f2, f3);
                final wf0 wf0Var = new wf0(this, 0);
                countryFlagTabUIState2 = countryFlagTabUIState;
                loginSupportedCountryDialogUIState = null;
                UIKeyboardOption uIKeyboardOption = new UIKeyboardOption(null, UIKeyboardType.Number, new UIImeActionHandler(UIImeAction.Done, new vf0(this, 7)), 1);
                UITextStyle uITextStyle = UITextStyle.DisplaySmall;
                ChaloColorToken.OrangePrimary orangePrimary = ChaloColorToken.OrangePrimary.f9835a;
                ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
                ChaloColorToken.Black_40 black_40 = ChaloColorToken.Black_40.f9764a;
                ChaloColorToken.Transparent transparent = ChaloColorToken.Transparent.f9864a;
                BaseTextFieldUIState.TextFieldUIState textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str2, new TextFieldEventHandler() { // from class: app.chalo.uistate.textField.TextFieldEventHandlerHelper$phoneNumber$1
                    @Override // app.chalo.uistate.textField.TextFieldEventHandler
                    public final String b(String value) {
                        Intrinsics.i(value, "value");
                        StringBuilder sb = new StringBuilder();
                        int length = value.length();
                        for (int i3 = 0; i3 < length; i3++) {
                            char cCharAt = value.charAt(i3);
                            if (Character.isDigit(cCharAt)) {
                                sb.append(cCharAt);
                            }
                        }
                        String string = sb.toString();
                        int length2 = string.length();
                        int i4 = iIntValue;
                        if (length2 > i4) {
                            length2 = i4;
                        }
                        String strSubstring = string.substring(0, length2);
                        Intrinsics.h(strSubstring, "substring(...)");
                        wf0Var.invoke(strSubstring);
                        return strSubstring;
                    }

                    @Override // app.chalo.uistate.textField.TextFieldEventHandler
                    public final /* bridge */ UITransformedText c(String str3) {
                        return TextFieldEventHandler.DefaultImpls.a(str3);
                    }

                    @Override // app.chalo.uistate.textField.TextFieldEventHandler
                    public final /* bridge */ void a(boolean z3) {
                    }
                }, uITextStyle, null, null, null, false, uIKeyboardOption, iIntValue, null, new UITextFieldColors(black_87, black_87, null, black_40, black_40, black_40, transparent, transparent, transparent, ChaloColorToken.TextFieldIndicator.f9859a, orangePrimary, orangePrimary, 4128868), ChaloThemeHelper.a().m, 23532);
                if (z) {
                    chaloColorToken = ChaloColorToken.Orange2.f9830a;
                } else {
                    chaloColorToken = shadyGray;
                }
                loginPhoneNumberTextFieldUIState = new LoginPhoneNumberTextFieldUIState(textFieldUIState, new LoginPhoneNumberTextFieldUISpec(BorderUISpec.a(borderUISpec, chaloColorToken), chaloPadding));
                if (loginOptionsDataState3.d) {
                    LoginLoadingPurpose loginLoadingPurpose = loginOptionsDataState3.e;
                    loginOptionsComponent$convertToUiState$1.L$0 = loginOptionsDataState3;
                    loginOptionsComponent$convertToUiState$1.L$1 = toolbarUIState2;
                    loginOptionsComponent$convertToUiState$1.L$2 = buttonUIState;
                    loginOptionsComponent$convertToUiState$1.L$3 = chaloTextUIState;
                    loginOptionsComponent$convertToUiState$1.L$4 = chaloTextUIState2;
                    loginOptionsComponent$convertToUiState$1.L$5 = countryFlagTabUIState2;
                    loginOptionsComponent$convertToUiState$1.L$6 = loginPhoneNumberTextFieldUIState;
                    loginOptionsComponent$convertToUiState$1.label = 3;
                    objP0 = P0(loginLoadingPurpose, loginOptionsComponent$convertToUiState$1);
                    if (objP0 != obj) {
                        obj = obj;
                        loginOptionsDataState2 = loginOptionsDataState3;
                        loginPhoneNumberTextFieldUIState3 = loginPhoneNumberTextFieldUIState;
                        chaloTextUIState5 = chaloTextUIState;
                        objJ0 = objP0;
                        toolbarUIState4 = toolbarUIState2;
                        chaloTextUIState6 = chaloTextUIState2;
                        countryFlagTabUIState4 = countryFlagTabUIState2;
                    }
                    obj = obj;
                    return obj;
                }
                chaloTextUIState3 = chaloTextUIState;
                loginPhoneNumberTextFieldUIState2 = loginPhoneNumberTextFieldUIState;
                loadingDialogUIState = null;
                chaloTextUIState4 = chaloTextUIState2;
                countryFlagTabUIState3 = countryFlagTabUIState2;
                toolbarUIState3 = toolbarUIState2;
                ButtonUIState buttonUIState3 = buttonUIState;
                if (loginOptionsDataState3.l) {
                    List list = loginOptionsDataState3.k;
                    TextUIState.ChaloTextUIState chaloTextUIState7 = new TextUIState.ChaloTextUIState("Select Country", UITextStyle.DisplaySmall, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                    List<LoginOptionsCountry> list2 = list;
                    arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                    for (LoginOptionsCountry loginOptionsCountry : list2) {
                        TextUIState.ChaloTextUIState chaloTextUIState8 = new TextUIState.ChaloTextUIState(nf1.l(loginOptionsCountry.b, " (", loginOptionsCountry.c, ")"), UITextStyle.BodyMedium, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
                        iconTypeA2 = CountryPhoneNumberConfigKt.a(loginOptionsCountry.f5303a);
                        if (iconTypeA2 != null) {
                            imageUIState = new ImageUIState(iconTypeA2, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().i), Dp.m7276boximpl(ChaloThemeHelper.a().j)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                        } else {
                            imageUIState = loginSupportedCountryDialogUIState;
                        }
                        arrayList.add(new SupportedCountryItemUIState(UiEventHandler.Companion.a(new cy(28, this, loginOptionsCountry)), imageUIState, chaloTextUIState8));
                    }
                    loginSupportedCountryDialogUIState = new LoginSupportedCountryDialogUIState(chaloTextUIState7, arrayList);
                }
                return new LoginOptionsUIState(toolbarUIState3, buttonUIState3, chaloTextUIState3, chaloTextUIState4, countryFlagTabUIState3, loginPhoneNumberTextFieldUIState2, loadingDialogUIState, loginSupportedCountryDialogUIState);
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            loginPhoneNumberTextFieldUIState3 = (LoginPhoneNumberTextFieldUIState) loginOptionsComponent$convertToUiState$1.L$6;
            countryFlagTabUIState4 = (CountryFlagTabUIState) loginOptionsComponent$convertToUiState$1.L$5;
            chaloTextUIState6 = (TextUIState.ChaloTextUIState) loginOptionsComponent$convertToUiState$1.L$4;
            chaloTextUIState5 = (TextUIState.ChaloTextUIState) loginOptionsComponent$convertToUiState$1.L$3;
            buttonUIState = (ButtonUIState) loginOptionsComponent$convertToUiState$1.L$2;
            toolbarUIState4 = (ToolbarUIState) loginOptionsComponent$convertToUiState$1.L$1;
            loginOptionsDataState2 = (LoginOptionsDataState) loginOptionsComponent$convertToUiState$1.L$0;
            ResultKt.b(objJ0);
            loginSupportedCountryDialogUIState = null;
        }
        loginPhoneNumberTextFieldUIState2 = loginPhoneNumberTextFieldUIState3;
        loadingDialogUIState = (LoadingDialogUIState) objJ0;
        loginOptionsDataState3 = loginOptionsDataState2;
        countryFlagTabUIState3 = countryFlagTabUIState4;
        chaloTextUIState4 = chaloTextUIState6;
        chaloTextUIState3 = chaloTextUIState5;
        toolbarUIState3 = toolbarUIState4;
        ButtonUIState buttonUIState4 = buttonUIState;
        if (loginOptionsDataState3.l) {
            List list3 = loginOptionsDataState3.k;
            TextUIState.ChaloTextUIState chaloTextUIState9 = new TextUIState.ChaloTextUIState("Select Country", UITextStyle.DisplaySmall, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            List<LoginOptionsCountry> list4 = list3;
            arrayList = new ArrayList(CollectionsKt.v(list4, 10));
            while (r1.hasNext()) {
                TextUIState.ChaloTextUIState chaloTextUIState10 = new TextUIState.ChaloTextUIState(nf1.l(loginOptionsCountry.b, " (", loginOptionsCountry.c, ")"), UITextStyle.BodyMedium, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
                iconTypeA2 = CountryPhoneNumberConfigKt.a(loginOptionsCountry.f5303a);
                if (iconTypeA2 != null) {
                    imageUIState = new ImageUIState(iconTypeA2, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().i), Dp.m7276boximpl(ChaloThemeHelper.a().j)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                } else {
                    imageUIState = loginSupportedCountryDialogUIState;
                }
                arrayList.add(new SupportedCountryItemUIState(UiEventHandler.Companion.a(new cy(28, this, loginOptionsCountry)), imageUIState, chaloTextUIState10));
            }
            loginSupportedCountryDialogUIState = new LoginSupportedCountryDialogUIState(chaloTextUIState9, arrayList);
        }
        return new LoginOptionsUIState(toolbarUIState3, buttonUIState4, chaloTextUIState3, chaloTextUIState4, countryFlagTabUIState3, loginPhoneNumberTextFieldUIState2, loadingDialogUIState, loginSupportedCountryDialogUIState);
        ButtonUIState buttonUIState5 = (ButtonUIState) objJ0;
        loginOptionsComponent$convertToUiState$1.L$0 = loginOptionsDataState3;
        loginOptionsComponent$convertToUiState$1.L$1 = toolbarUIState;
        loginOptionsComponent$convertToUiState$1.L$2 = buttonUIState5;
        loginOptionsComponent$convertToUiState$1.label = 2;
        Object objT0 = T0(loginOptionsComponent$convertToUiState$1);
        if (objT0 != obj) {
            buttonUIState = buttonUIState5;
            objJ0 = objT0;
            toolbarUIState2 = toolbarUIState;
            chaloTextUIState = (TextUIState.ChaloTextUIState) objJ0;
            str = loginOptionsDataState3.c;
            countryPhoneNumberConfig = loginOptionsDataState3.b;
            if (str != null) {
                countryPhoneNumberConfig2 = countryPhoneNumberConfig;
                chaloTextUIState2 = null;
            } else {
                countryPhoneNumberConfig2 = countryPhoneNumberConfig;
                chaloTextUIState2 = null;
            }
            if (countryPhoneNumberConfig2 != null) {
                countryFlagTabUIState = null;
            } else {
                countryFlagTabUIState = null;
            }
            String str3 = loginOptionsDataState3.f5304a;
            if (countryPhoneNumberConfig2 != null) {
                iIntValue = countryPhoneNumberConfig2.d;
            } else {
                num = (Integer) CollectionsKt.H(AppConstants.f1940a);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 10;
                }
            }
            z = loginOptionsDataState3.m;
            float f4 = ChaloThemeHelper.a().b;
            UIShape.Rectangle rectangle2 = UIShape.d;
            shadyGray = ChaloColorToken.ShadyGray.f9851a;
            BorderUISpec borderUISpec2 = new BorderUISpec(f4, shadyGray, rectangle2);
            float f5 = ChaloThemeHelper.a().g;
            float f6 = ChaloThemeHelper.a().f;
            ChaloPadding chaloPadding2 = new ChaloPadding(f6, f5, f5, f6);
            final wf0 wf0Var2 = new wf0(this, 0);
            countryFlagTabUIState2 = countryFlagTabUIState;
            loginSupportedCountryDialogUIState = null;
            UIKeyboardOption uIKeyboardOption2 = new UIKeyboardOption(null, UIKeyboardType.Number, new UIImeActionHandler(UIImeAction.Done, new vf0(this, 7)), 1);
            UITextStyle uITextStyle2 = UITextStyle.DisplaySmall;
            ChaloColorToken.OrangePrimary orangePrimary2 = ChaloColorToken.OrangePrimary.f9835a;
            ChaloColorToken.Black_87 black_88 = ChaloColorToken.Black_87.f9768a;
            ChaloColorToken.Black_40 black_41 = ChaloColorToken.Black_40.f9764a;
            ChaloColorToken.Transparent transparent2 = ChaloColorToken.Transparent.f9864a;
            BaseTextFieldUIState.TextFieldUIState textFieldUIState2 = new BaseTextFieldUIState.TextFieldUIState(str3, new TextFieldEventHandler() { // from class: app.chalo.uistate.textField.TextFieldEventHandlerHelper$phoneNumber$1
                @Override // app.chalo.uistate.textField.TextFieldEventHandler
                public final String b(String value) {
                    Intrinsics.i(value, "value");
                    StringBuilder sb = new StringBuilder();
                    int length = value.length();
                    for (int i3 = 0; i3 < length; i3++) {
                        char cCharAt = value.charAt(i3);
                        if (Character.isDigit(cCharAt)) {
                            sb.append(cCharAt);
                        }
                    }
                    String string = sb.toString();
                    int length2 = string.length();
                    int i4 = iIntValue;
                    if (length2 > i4) {
                        length2 = i4;
                    }
                    String strSubstring = string.substring(0, length2);
                    Intrinsics.h(strSubstring, "substring(...)");
                    wf0Var2.invoke(strSubstring);
                    return strSubstring;
                }

                @Override // app.chalo.uistate.textField.TextFieldEventHandler
                public final /* bridge */ UITransformedText c(String str4) {
                    return TextFieldEventHandler.DefaultImpls.a(str4);
                }

                @Override // app.chalo.uistate.textField.TextFieldEventHandler
                public final /* bridge */ void a(boolean z3) {
                }
            }, uITextStyle2, null, null, null, false, uIKeyboardOption2, iIntValue, null, new UITextFieldColors(black_88, black_88, null, black_41, black_41, black_41, transparent2, transparent2, transparent2, ChaloColorToken.TextFieldIndicator.f9859a, orangePrimary2, orangePrimary2, 4128868), ChaloThemeHelper.a().m, 23532);
            if (z) {
                chaloColorToken = ChaloColorToken.Orange2.f9830a;
            } else {
                chaloColorToken = shadyGray;
            }
            loginPhoneNumberTextFieldUIState = new LoginPhoneNumberTextFieldUIState(textFieldUIState2, new LoginPhoneNumberTextFieldUISpec(BorderUISpec.a(borderUISpec2, chaloColorToken), chaloPadding2));
            if (loginOptionsDataState3.d) {
                LoginLoadingPurpose loginLoadingPurpose2 = loginOptionsDataState3.e;
                loginOptionsComponent$convertToUiState$1.L$0 = loginOptionsDataState3;
                loginOptionsComponent$convertToUiState$1.L$1 = toolbarUIState2;
                loginOptionsComponent$convertToUiState$1.L$2 = buttonUIState;
                loginOptionsComponent$convertToUiState$1.L$3 = chaloTextUIState;
                loginOptionsComponent$convertToUiState$1.L$4 = chaloTextUIState2;
                loginOptionsComponent$convertToUiState$1.L$5 = countryFlagTabUIState2;
                loginOptionsComponent$convertToUiState$1.L$6 = loginPhoneNumberTextFieldUIState;
                loginOptionsComponent$convertToUiState$1.label = 3;
                objP0 = P0(loginLoadingPurpose2, loginOptionsComponent$convertToUiState$1);
                if (objP0 != obj) {
                    obj = obj;
                    loginOptionsDataState2 = loginOptionsDataState3;
                    loginPhoneNumberTextFieldUIState3 = loginPhoneNumberTextFieldUIState;
                    chaloTextUIState5 = chaloTextUIState;
                    objJ0 = objP0;
                    toolbarUIState4 = toolbarUIState2;
                    chaloTextUIState6 = chaloTextUIState2;
                    countryFlagTabUIState4 = countryFlagTabUIState2;
                    loginPhoneNumberTextFieldUIState2 = loginPhoneNumberTextFieldUIState3;
                    loadingDialogUIState = (LoadingDialogUIState) objJ0;
                    loginOptionsDataState3 = loginOptionsDataState2;
                    countryFlagTabUIState3 = countryFlagTabUIState4;
                    chaloTextUIState4 = chaloTextUIState6;
                    chaloTextUIState3 = chaloTextUIState5;
                    toolbarUIState3 = toolbarUIState4;
                }
            } else {
                chaloTextUIState3 = chaloTextUIState;
                loginPhoneNumberTextFieldUIState2 = loginPhoneNumberTextFieldUIState;
                loadingDialogUIState = null;
                chaloTextUIState4 = chaloTextUIState2;
                countryFlagTabUIState3 = countryFlagTabUIState2;
                toolbarUIState3 = toolbarUIState2;
            }
            ButtonUIState buttonUIState6 = buttonUIState;
            if (loginOptionsDataState3.l) {
                List list5 = loginOptionsDataState3.k;
                TextUIState.ChaloTextUIState chaloTextUIState11 = new TextUIState.ChaloTextUIState("Select Country", UITextStyle.DisplaySmall, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
                List<LoginOptionsCountry> list6 = list5;
                arrayList = new ArrayList(CollectionsKt.v(list6, 10));
                while (r1.hasNext()) {
                    TextUIState.ChaloTextUIState chaloTextUIState12 = new TextUIState.ChaloTextUIState(nf1.l(loginOptionsCountry.b, " (", loginOptionsCountry.c, ")"), UITextStyle.BodyMedium, (ChaloColorToken) null, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8188);
                    iconTypeA2 = CountryPhoneNumberConfigKt.a(loginOptionsCountry.f5303a);
                    if (iconTypeA2 != null) {
                        imageUIState = new ImageUIState(iconTypeA2, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(ChaloThemeHelper.a().i), Dp.m7276boximpl(ChaloThemeHelper.a().j)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                    } else {
                        imageUIState = loginSupportedCountryDialogUIState;
                    }
                    arrayList.add(new SupportedCountryItemUIState(UiEventHandler.Companion.a(new cy(28, this, loginOptionsCountry)), imageUIState, chaloTextUIState12));
                }
                loginSupportedCountryDialogUIState = new LoginSupportedCountryDialogUIState(chaloTextUIState11, arrayList);
            }
            return new LoginOptionsUIState(toolbarUIState3, buttonUIState6, chaloTextUIState3, chaloTextUIState4, countryFlagTabUIState3, loginPhoneNumberTextFieldUIState2, loadingDialogUIState, loginSupportedCountryDialogUIState);
        }
        obj = obj;
        return obj;
    }

    public final void L0() {
        StateFlow stateFlow = this.f;
        BuildersKt.d(this.j, null, null, new LoginOptionsComponent$handleOnContinueClickedIntent$1(((LoginOptionsDataState) stateFlow.getValue()).b, this, ((LoginOptionsDataState) stateFlow.getValue()).f5304a, null), 3);
    }

    public final void M0(String str, boolean z) {
        CountryPhoneNumberConfig countryPhoneNumberConfig = ((LoginOptionsDataState) this.f.getValue()).b;
        if (countryPhoneNumberConfig == null) {
            E0(new n10(str, 23));
            return;
        }
        this.n.getClass();
        int i = WhenMappings.f5299a[ValidatePhoneNumberUseCase.a(str, countryPhoneNumberConfig).ordinal()];
        if (i == 1) {
            E0(new n10(str, 21));
            if (z) {
                L0();
                return;
            }
            return;
        }
        if (i == 2) {
            BuildersKt.d(this.j, null, null, new LoginOptionsComponent$handleOnPhoneNumberEnteredIntent$2(this, str, null), 3);
        } else {
            if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new n10(str, 22));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r8.G.a(true, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N0(kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof app.chalo.login.ui.options.LoginOptionsComponent$handlePostLogin$1
            if (r0 == 0) goto L13
            r0 = r9
            app.chalo.login.ui.options.LoginOptionsComponent$handlePostLogin$1 r0 = (app.chalo.login.ui.options.LoginOptionsComponent$handlePostLogin$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.login.ui.options.LoginOptionsComponent$handlePostLogin$1 r0 = new app.chalo.login.ui.options.LoginOptionsComponent$handlePostLogin$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            kotlinx.coroutines.internal.ContextScope r4 = r8.j
            r5 = 0
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L3a
            if (r2 == r7) goto L36
            if (r2 != r6) goto L2e
            kotlin.ResultKt.b(r9)
            goto L67
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            kotlin.ResultKt.b(r9)
            goto L5c
        L3a:
            kotlin.ResultKt.b(r9)
            kotlinx.coroutines.flow.StateFlow r9 = r8.f
            java.lang.Object r9 = r9.getValue()
            app.chalo.login.ui.options.LoginOptionsDataState r9 = (app.chalo.login.ui.options.LoginOptionsDataState) r9
            app.chalo.config.CountryPhoneNumberConfig r9 = r9.b
            if (r9 == 0) goto L51
            app.chalo.login.ui.options.LoginOptionsComponent$saveCurrentCountryConfig$1 r2 = new app.chalo.login.ui.options.LoginOptionsComponent$saveCurrentCountryConfig$1
            r2.<init>(r8, r9, r5)
            kotlinx.coroutines.BuildersKt.d(r4, r5, r5, r2, r3)
        L51:
            r0.label = r7
            app.chalo.login.domain.SyncAndUpdateAnalyticsPropertiesAfterLoginUseCase r9 = r8.t
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L5c
            goto L66
        L5c:
            r0.label = r6
            app.chalo.helper.MandatoryFirstHistoryCallGuard r9 = r8.G
            java.lang.Object r9 = r9.a(r7, r0)
            if (r9 != r1) goto L67
        L66:
            return r1
        L67:
            kotlin.Pair r9 = new kotlin.Pair
            java.lang.String r0 = "method"
            java.lang.String r1 = "trueCaller"
            r9.<init>(r0, r1)
            java.util.Map r9 = kotlin.collections.MapsKt.h(r9)
            java.lang.String r0 = "login successful"
            r8.R0(r0, r9)
            app.chalo.features.adjust.AdjustManager r9 = r8.C
            java.lang.String r0 = "1m0cd1"
            r9.b(r0)
            app.chalo.login.ui.options.LoginOptionsComponent$navigatePostLogin$1 r9 = new app.chalo.login.ui.options.LoginOptionsComponent$navigatePostLogin$1
            r9.<init>(r8, r5)
            kotlinx.coroutines.BuildersKt.d(r4, r5, r5, r9, r3)
            kf0 r9 = new kf0
            r0 = 11
            r9.<init>(r0)
            r8.E0(r9)
            kotlin.Unit r9 = kotlin.Unit.f17538a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.ui.options.LoginOptionsComponent.N0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void O0() {
        if (!this.L) {
            S0();
            E0(new kf0(7));
        } else if (!this.K) {
            R0("login truecaller uid fetch failed", null);
            S0();
            E0(new kf0(9));
        } else {
            R0("login truecaller uid fetch try", null);
            E0(new kf0(8));
            BuildersKt.d(this.j, null, null, new LoginOptionsComponent$handleShowTruecallerOptionIfPossibleIntent$3(this, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r8 == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P0(app.chalo.login.ui.LoginLoadingPurpose r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof app.chalo.login.ui.options.LoginOptionsComponent$loadingDialog$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.login.ui.options.LoginOptionsComponent$loadingDialog$1 r0 = (app.chalo.login.ui.options.LoginOptionsComponent$loadingDialog$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.login.ui.options.LoginOptionsComponent$loadingDialog$1 r0 = new app.chalo.login.ui.options.LoginOptionsComponent$loadingDialog$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r8)
            goto L5e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.b(r8)
            goto L74
        L39:
            kotlin.ResultKt.b(r8)
            goto L84
        L3d:
            kotlin.ResultKt.b(r8)
            int[] r8 = app.chalo.login.ui.options.LoginOptionsComponent.WhenMappings.c
            int r7 = r7.ordinal()
            r7 = r8[r7]
            r8 = 0
            app.chalo.providers.stringprovider.StringProvider r2 = r6.r
            if (r7 == r5) goto L77
            if (r7 == r4) goto L67
            if (r7 != r3) goto L61
            app.chalo.providers.stringprovider.StringEnum r7 = app.chalo.providers.stringprovider.StringEnum.VERIFYING_OTP
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r0.label = r3
            java.lang.Object r8 = r2.b(r7, r8, r0)
            if (r8 != r1) goto L5e
            goto L83
        L5e:
            java.lang.String r8 = (java.lang.String) r8
            goto L86
        L61:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L67:
            app.chalo.providers.stringprovider.StringEnum r7 = app.chalo.providers.stringprovider.StringEnum.VERIFYING_PHONE_NUMBER
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r0.label = r4
            java.lang.Object r8 = r2.b(r7, r8, r0)
            if (r8 != r1) goto L74
            goto L83
        L74:
            java.lang.String r8 = (java.lang.String) r8
            goto L86
        L77:
            app.chalo.providers.stringprovider.StringEnum r7 = app.chalo.providers.stringprovider.StringEnum.LOADING_THREE_DOTS
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r0.label = r5
            java.lang.Object r8 = r2.b(r7, r8, r0)
            if (r8 != r1) goto L84
        L83:
            return r1
        L84:
            java.lang.String r8 = (java.lang.String) r8
        L86:
            app.chalo.uistate.dialog.LoadingDialogUIState r7 = app.chalo.uistate.dialog.DialogUIStateFactory.a(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.ui.options.LoginOptionsComponent.P0(app.chalo.login.ui.LoginLoadingPurpose, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void Q0(LoginOptionsIntent intent) {
        Object next;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof LoginOptionsIntent.InitializationIntent;
        Lazy lazy = this.Q;
        ContextScope contextScope = this.j;
        if (z) {
            LoginOptionsIntent.InitializationIntent initializationIntent = (LoginOptionsIntent.InitializationIntent) intent;
            if (this.d) {
                return;
            }
            this.d = true;
            CountryPhoneNumberConfig countryPhoneNumberConfigA = this.B.a((List) lazy.getValue());
            if (countryPhoneNumberConfigA == null) {
                countryPhoneNumberConfigA = (CountryPhoneNumberConfig) CollectionsKt.H((List) lazy.getValue());
            }
            BuildersKt.d(contextScope, null, null, new LoginOptionsComponent$handleInitializationIntent$1(this, initializationIntent, countryPhoneNumberConfigA, null), 3);
            return;
        }
        if (intent instanceof LoginOptionsIntent.ShowTruecallerOptionIfPossible) {
            O0();
            return;
        }
        if (intent instanceof LoginOptionsIntent.OnPhoneNumberEntered) {
            M0(((LoginOptionsIntent.OnPhoneNumberEntered) intent).f5310a, false);
            return;
        }
        if (intent instanceof LoginOptionsIntent.OnContinueClicked) {
            L0();
            return;
        }
        boolean z2 = intent instanceof LoginOptionsIntent.OnTruecallerErrorCallback;
        LoginOptionsSideEffect.BringFocusOnPhoneNumberField bringFocusOnPhoneNumberField = LoginOptionsSideEffect.BringFocusOnPhoneNumberField.f5317a;
        if (z2) {
            LoginOptionsIntent.OnTruecallerErrorCallback onTruecallerErrorCallback = (LoginOptionsIntent.OnTruecallerErrorCallback) intent;
            TruecallerError truecallerError = onTruecallerErrorCallback.f5311a;
            String message = "handleOnTruecallerErrorCallbackIntent: " + onTruecallerErrorCallback;
            Intrinsics.i(message, "message");
            R0("truecaller error callback", MapsKt.h(new Pair("reason", truecallerError.name())));
            int i = WhenMappings.b[truecallerError.ordinal()];
            if (i == 1) {
                BuildersKt.d(contextScope, null, null, new LoginOptionsComponent$handleOnTruecallerErrorCallbackIntent$1(this, null), 3);
                return;
            }
            if (i == 2) {
                S0();
                return;
            } else if (this.K) {
                r0(bringFocusOnPhoneNumberField);
                return;
            } else {
                S0();
                return;
            }
        }
        if (intent instanceof LoginOptionsIntent.OnTruecallerSuccessCallback) {
            BuildersKt.d(contextScope, null, null, new LoginOptionsComponent$handleOnTruecallerSuccessCallbackIntent$1(this, (LoginOptionsIntent.OnTruecallerSuccessCallback) intent, null), 3);
            return;
        }
        if (intent instanceof LoginOptionsIntent.OnOtherLoginOptionsClicked) {
            q0(new vf0(this, 4));
            return;
        }
        if (intent instanceof LoginOptionsIntent.SetUpTruecallerVisibilityIntent) {
            boolean z3 = this.L && ((LoginOptionsIntent.SetUpTruecallerVisibilityIntent) intent).f5314a;
            this.K = z3;
            if (z3) {
                O0();
                return;
            } else {
                S0();
                return;
            }
        }
        if (intent instanceof LoginOptionsIntent.LoginBackPressed) {
            q0(new vf0(this, 3));
            return;
        }
        if (intent.equals(LoginOptionsIntent.OnCountrySelectDropdownClicked.f5308a)) {
            E0(new kf0(10));
            return;
        }
        if (!(intent instanceof LoginOptionsIntent.OnCountrySelected)) {
            if (!(intent instanceof LoginOptionsIntent.PhoneNumberFieldFocusChangeIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new dd0((LoginOptionsIntent.PhoneNumberFieldFocusChangeIntent) intent, 12));
            return;
        }
        ChaloPhoneNumberCountry chaloPhoneNumberCountry = ((LoginOptionsIntent.OnCountrySelected) intent).f5309a;
        Iterator it = ((List) lazy.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((CountryPhoneNumberConfig) next).f1937a != chaloPhoneNumberCountry);
        CountryPhoneNumberConfig countryPhoneNumberConfig = (CountryPhoneNumberConfig) next;
        CountryPhoneNumberConfig countryPhoneNumberConfig2 = ((LoginOptionsDataState) this.f.getValue()).b;
        if (countryPhoneNumberConfig != null && countryPhoneNumberConfig.equals(countryPhoneNumberConfig2)) {
            E0(new kf0(5));
        } else if (countryPhoneNumberConfig == null) {
            BuildersKt.d(contextScope, null, null, new LoginOptionsComponent$handleOnCountrySelectedIntent$3(this, null), 3);
        } else {
            E0(new dd0(countryPhoneNumberConfig, 13));
            r0(bringFocusOnPhoneNumberField);
        }
    }

    public final void R0(String str, Map map) {
        String str2;
        String sourceName;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LoginOptionsDataState loginOptionsDataState = (LoginOptionsDataState) this.f.getValue();
        Intrinsics.i(loginOptionsDataState, "<this>");
        CountryPhoneNumberConfig countryPhoneNumberConfig = loginOptionsDataState.b;
        String str3 = "";
        if (countryPhoneNumberConfig == null || (str2 = countryPhoneNumberConfig.c) == null) {
            str2 = "";
        }
        linkedHashMap.put("countryCallingCode", str2);
        linkedHashMap.put("isTrueCallerInstalled", String.valueOf(loginOptionsDataState.g != null));
        Source source = loginOptionsDataState.h;
        if (source != null && (sourceName = source.getSourceName()) != null) {
            str3 = sourceName;
        }
        linkedHashMap.put("src", str3);
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        AnalyticsContract.DefaultImpls.a(this.s, str, "loginOptionsScreen", linkedHashMap, null, false, 24);
    }

    public final void S0() {
        Job job = this.N;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.N = BuildersKt.d(this.j, null, null, new LoginOptionsComponent$requestPhoneNumberHint$1(this, null), 3);
        PhoneNumberHintHandler phoneNumberHintHandlerC = this.A.c();
        if (phoneNumberHintHandlerC != null) {
            AnalyticsContractImplKt.b(this.s, "phone number hint requested", Source.LOGIN_OPTIONS_SCREEN, vo1.s("isTCUsable", String.valueOf(this.K)), false, 24);
        }
        if (phoneNumberHintHandlerC != null) {
            phoneNumberHintHandlerC.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object T0(ContinuationImpl continuationImpl) {
        LoginOptionsComponent$titleTextUIState$1 loginOptionsComponent$titleTextUIState$1;
        if (continuationImpl instanceof LoginOptionsComponent$titleTextUIState$1) {
            loginOptionsComponent$titleTextUIState$1 = (LoginOptionsComponent$titleTextUIState$1) continuationImpl;
            int i = loginOptionsComponent$titleTextUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginOptionsComponent$titleTextUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                loginOptionsComponent$titleTextUIState$1 = new LoginOptionsComponent$titleTextUIState$1(this, continuationImpl);
            }
        } else {
            loginOptionsComponent$titleTextUIState$1 = new LoginOptionsComponent$titleTextUIState$1(this, continuationImpl);
        }
        Object objB = loginOptionsComponent$titleTextUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = loginOptionsComponent$titleTextUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            loginOptionsComponent$titleTextUIState$1.label = 1;
            objB = this.r.b(StringEnum.ONBOARDING_ENTER_NUMBER, new Object[0], loginOptionsComponent$titleTextUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        UITextStyle uITextStyle = UITextStyle.DisplayMedium;
        UIFontWeight uIFontWeight = UIFontWeight.Bold;
        return new TextUIState.ChaloTextUIState((String) objB, uITextStyle, ChaloColorToken.Black.f9759a, 0, UITextAlign.Left, uIFontWeight, new Integer(24), (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7960);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new LoginOptionsDataState("", null, null, false, LoginLoadingPurpose.GENERAL, false, null, null, FetchLoginAfterCitySelectionConfigUseCase.d, false, EmptyList.f17557a, false, false);
    }
}
