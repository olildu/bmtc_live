package app.chalo.login.ui.otp;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.domain.MinProfileAnalyticsHelper;
import app.chalo.features.adjust.AdjustManager;
import app.chalo.helper.MandatoryFirstHistoryCallGuard;
import app.chalo.login.domain.ExtractOtpFromSmsContentUseCase;
import app.chalo.login.domain.ResolvePostLoginNavigationTargetUseCase;
import app.chalo.login.domain.SendOtpForLoginUseCase;
import app.chalo.login.domain.SyncAndUpdateAnalyticsPropertiesAfterLoginUseCase;
import app.chalo.login.domain.VerifyLoginSuccessOnServerAndHandleTokensUseCase;
import app.chalo.login.manager.DpdpaConsentManager;
import app.chalo.login.smsautoread.SmsAutoReader;
import app.chalo.login.ui.LoginLoadingPurpose;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.permissions.models.PermissionState;
import app.chalo.providers.cityprovider.CityProvider;
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
import app.chalo.scenes.args.LoginOtpSceneArgs;
import app.chalo.scenes.args.UserConsentScreenArgs;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.dialog.DialogUIStateFactory;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.uistate.textField.TextFieldEventHandlerHelper$maxDigits$1;
import app.chalo.uistate.textField.UIImeAction;
import app.chalo.uistate.textField.UIImeActionHandler;
import app.chalo.uistate.textField.UIKeyboardOption;
import app.chalo.uistate.textField.UIKeyboardType;
import app.chalo.uistate.textField.UITextFieldColors;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.uistate.toolbar.ToolbarUIStateFactory;
import app.chalo.userconsent.UserConsentFlowType;
import app.chalo.utils.KUUID;
import app.chalo.utils.PlatformFeature;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.statekeeper.StateKeeper;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.dd0;
import defpackage.kf0;
import defpackage.n10;
import defpackage.yf0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/login/ui/otp/LoginOtpEnterComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/login/ui/otp/LoginOtpEnterIntent;", "Lapp/chalo/login/ui/otp/LoginOtpEnterDataState;", "Lapp/chalo/login/ui/otp/LoginOtpEnterUIState;", "Lapp/chalo/login/ui/otp/LoginOtpEnterSideEffect;", "Companion", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LoginOtpEnterComponent extends ChaloBaseStateMviComponent<LoginOtpEnterIntent, LoginOtpEnterDataState, LoginOtpEnterUIState, LoginOtpEnterSideEffect> {
    public final PermissionHandlerProvider A;
    public final ResolvePostLoginNavigationTargetUseCase B;
    public final MinProfileAnalyticsHelper C;
    public Job D;
    public Job E;
    public Job F;
    public String G;
    public Job H;
    public final LoginOtpSceneArgs k;
    public final SendOtpForLoginUseCase l;
    public final VerifyLoginSuccessOnServerAndHandleTokensUseCase m;
    public final StringProvider n;
    public final AnalyticsContract o;
    public final SyncAndUpdateAnalyticsPropertiesAfterLoginUseCase p;
    public final ExtractOtpFromSmsContentUseCase q;
    public final CityProvider r;
    public final ChaloNavigationManager s;
    public final SmsAutoReader t;
    public final DpdpaConsentManager u;
    public final UserConsentResultStateManager v;
    public final MinProfileUpdateResultStateManager w;
    public final AdjustManager x;
    public final KotlinToastManager y;
    public final MandatoryFirstHistoryCallGuard z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/login/ui/otp/LoginOtpEnterComponent$Companion;", "", "", "RESEND_OTP_OPTION_TIME_IN_MILLIS", "J", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5326a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[PermissionState.values().length];
            try {
                iArr[PermissionState.NOT_DETERMINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionState.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PermissionState.DENIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PermissionState.GRANTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PermissionState.REQUIRES_EXPLANATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f5326a = iArr;
            int[] iArr2 = new int[LoginLoadingPurpose.values().length];
            try {
                iArr2[LoginLoadingPurpose.REQUESTING_OTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[LoginLoadingPurpose.VERIFYING_LOGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[LoginLoadingPurpose.GENERAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    public LoginOtpEnterComponent(LoginOtpSceneArgs loginOtpSceneArgs, SendOtpForLoginUseCase sendOtpForLoginUseCase, VerifyLoginSuccessOnServerAndHandleTokensUseCase verifyLoginSuccessOnServerAndHandleTokensUseCase, StringProvider stringProvider, AnalyticsContract analyticsContract, SyncAndUpdateAnalyticsPropertiesAfterLoginUseCase syncAndUpdateAnalyticsPropertiesAfterLoginUseCase, ExtractOtpFromSmsContentUseCase extractOtpFromSmsContentUseCase, CityProvider cityProvider, ChaloNavigationManager chaloNavigationManager, SmsAutoReader smsAutoReader, DpdpaConsentManager dpdpaConsentManager, UserConsentResultStateManager userConsentResultStateManager, MinProfileUpdateResultStateManager minProfileUpdateResultStateManager, AdjustManager adjustManager, KotlinToastManager kotlinToastManager, ComponentContext componentContext, MandatoryFirstHistoryCallGuard mandatoryFirstHistoryCallGuard, PermissionHandlerProvider permissionHandlerProvider, ResolvePostLoginNavigationTargetUseCase resolvePostLoginNavigationTargetUseCase, MinProfileAnalyticsHelper minProfileAnalyticsHelper) {
        super(componentContext);
        this.k = loginOtpSceneArgs;
        this.l = sendOtpForLoginUseCase;
        this.m = verifyLoginSuccessOnServerAndHandleTokensUseCase;
        this.n = stringProvider;
        this.o = analyticsContract;
        this.p = syncAndUpdateAnalyticsPropertiesAfterLoginUseCase;
        this.q = extractOtpFromSmsContentUseCase;
        this.r = cityProvider;
        this.s = chaloNavigationManager;
        this.t = smsAutoReader;
        this.u = dpdpaConsentManager;
        this.v = userConsentResultStateManager;
        this.w = minProfileUpdateResultStateManager;
        this.x = adjustManager;
        this.y = kotlinToastManager;
        this.z = mandatoryFirstHistoryCallGuard;
        this.A = permissionHandlerProvider;
        this.B = resolvePostLoginNavigationTargetUseCase;
        this.C = minProfileAnalyticsHelper;
        O0(new LoginOtpEnterIntent.InitializationIntent(loginOtpSceneArgs.b, loginOtpSceneArgs.c, loginOtpSceneArgs.d, loginOtpSceneArgs.e.getSourceName()));
        StateKeeper b = componentContext.getB();
        ResultStateKeeperMeta.Companion companion = ResultStateKeeperMeta.INSTANCE;
        ResultStateRecoveredData resultStateRecoveredDataA = userConsentResultStateManager.a("LoginOtpEnter_SK_Key", b, companion.serializer(), companion.serializer(), new yf0(this, 0));
        if (resultStateRecoveredDataA != null) {
            this.F = BuildersKt.d(this.j, null, null, new LoginOtpEnterComponent$1$1(this, resultStateRecoveredDataA, null), 3);
        }
    }

    public static final void F0(LoginOtpEnterComponent loginOtpEnterComponent) {
        Job job = loginOtpEnterComponent.F;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        String strA = KUUID.a();
        loginOtpEnterComponent.G = strA;
        loginOtpEnterComponent.F = BuildersKt.d(loginOtpEnterComponent.j, null, null, new LoginOtpEnterComponent$navigateToUserConsentScreen$1(loginOtpEnterComponent, strA, null), 3);
        ChaloNavigationManagerKt.e(loginOtpEnterComponent.s, new UserConsentScreenArgs(UserConsentFlowType.FreshLogin.INSTANCE, loginOtpEnterComponent.G), null, 6);
    }

    public static final Object G0(LoginOtpEnterComponent loginOtpEnterComponent, ResultStateData resultStateData, SuspendLambda suspendLambda) {
        loginOtpEnterComponent.G = null;
        boolean z = resultStateData instanceof ResultStateData.Cancelled;
        Unit unit = Unit.f17538a;
        if (z) {
            return unit;
        }
        if (!(resultStateData instanceof ResultStateData.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((Boolean) ((ResultStateData.Success) resultStateData).f9039a).booleanValue()) {
            loginOtpEnterComponent.E0(new kf0(25));
            Object objK0 = loginOtpEnterComponent.K0(suspendLambda);
            if (objK0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objK0;
            }
        }
        return unit;
    }

    public static final void H0(LoginOtpEnterComponent loginOtpEnterComponent, String str) {
        loginOtpEnterComponent.getClass();
        loginOtpEnterComponent.P0("resend otp request failed", MapsKt.h(new Pair("otpRequestErrorMsg", str)));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:35:0x0183  */
    /* JADX WARN: Code duplicated, block: B:37:0x0190  */
    /* JADX WARN: Code duplicated, block: B:38:0x019b  */
    /* JADX WARN: Code duplicated, block: B:41:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x01af  */
    /* JADX WARN: Code duplicated, block: B:50:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:54:0x0217  */
    /* JADX WARN: Code duplicated, block: B:57:0x022a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0239  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public final Object p0(LoginOtpEnterDataState loginOtpEnterDataState, ContinuationImpl continuationImpl) {
        LoginOtpEnterComponent$convertToUiState$1 loginOtpEnterComponent$convertToUiState$1;
        ToolbarUIState toolbarUIState;
        LoginOtpEnterDataState loginOtpEnterDataState2;
        LoadingDialogUIState loadingDialogUIState;
        TextUIState.ChaloTextUIState chaloTextUIState;
        Object objR0;
        LoadingDialogUIState loadingDialogUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        LoginOtpResendTextUIState loginOtpResendTextUIState;
        boolean z;
        String str;
        boolean z2;
        ArrayList arrayList;
        Iterator<Integer> it;
        LoginOtpEnterTextFieldUIState loginOtpEnterTextFieldUIState;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        LoginOtpResendTextUIState loginOtpResendTextUIState2;
        ToolbarUIState toolbarUIState2;
        LoginOtpEnterTextFieldUIState loginOtpEnterTextFieldUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        Object objN0;
        LoginOtpResendTextUIState loginOtpResendTextUIState3;
        ToolbarUIState toolbarUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        LoginOtpEnterTextFieldUIState loginOtpEnterTextFieldUIState3;
        LoadingDialogUIState loadingDialogUIState3;
        int iNextInt;
        String strValueOf;
        boolean z3;
        ChaloColorToken chaloColorToken;
        Object text;
        LoginOtpEnterDataState loginOtpEnterDataState3 = loginOtpEnterDataState;
        if (continuationImpl instanceof LoginOtpEnterComponent$convertToUiState$1) {
            loginOtpEnterComponent$convertToUiState$1 = (LoginOtpEnterComponent$convertToUiState$1) continuationImpl;
            int i = loginOtpEnterComponent$convertToUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginOtpEnterComponent$convertToUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                loginOtpEnterComponent$convertToUiState$1 = new LoginOtpEnterComponent$convertToUiState$1(this, continuationImpl);
            }
        } else {
            loginOtpEnterComponent$convertToUiState$1 = new LoginOtpEnterComponent$convertToUiState$1(this, continuationImpl);
        }
        Object objM0 = loginOtpEnterComponent$convertToUiState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = loginOtpEnterComponent$convertToUiState$1.label;
        if (i2 == 0) {
            ResultKt.b(objM0);
            ToolbarUIState toolbarUIState4 = new ToolbarUIState(null, ToolbarUIStateFactory.a(ToolbarUIStateFactory.f10120a, "", 14), null, null, null, ChaloThemeHelper.a().f1916a, null, null, 221);
            boolean z4 = loginOtpEnterDataState3.b;
            LoginLoadingPurpose loginLoadingPurpose = loginOtpEnterDataState3.c;
            loginOtpEnterComponent$convertToUiState$1.L$0 = loginOtpEnterDataState3;
            loginOtpEnterComponent$convertToUiState$1.L$1 = toolbarUIState4;
            loginOtpEnterComponent$convertToUiState$1.label = 1;
            objM0 = M0(z4, loginLoadingPurpose, loginOtpEnterComponent$convertToUiState$1);
            if (objM0 != obj) {
                toolbarUIState = toolbarUIState4;
            }
            return obj;
        }
        if (i2 == 1) {
            ToolbarUIState toolbarUIState5 = (ToolbarUIState) loginOtpEnterComponent$convertToUiState$1.L$1;
            LoginOtpEnterDataState loginOtpEnterDataState4 = (LoginOtpEnterDataState) loginOtpEnterComponent$convertToUiState$1.L$0;
            ResultKt.b(objM0);
            toolbarUIState = toolbarUIState5;
            loginOtpEnterDataState3 = loginOtpEnterDataState4;
        } else {
            if (i2 == 2) {
                loadingDialogUIState = (LoadingDialogUIState) loginOtpEnterComponent$convertToUiState$1.L$2;
                toolbarUIState = (ToolbarUIState) loginOtpEnterComponent$convertToUiState$1.L$1;
                loginOtpEnterDataState2 = (LoginOtpEnterDataState) loginOtpEnterComponent$convertToUiState$1.L$0;
                ResultKt.b(objM0);
                chaloTextUIState = (TextUIState.ChaloTextUIState) objM0;
                boolean z5 = loginOtpEnterDataState2.f;
                long j = loginOtpEnterDataState2.e;
                loginOtpEnterComponent$convertToUiState$1.L$0 = loginOtpEnterDataState2;
                loginOtpEnterComponent$convertToUiState$1.L$1 = toolbarUIState;
                loginOtpEnterComponent$convertToUiState$1.L$2 = loadingDialogUIState;
                loginOtpEnterComponent$convertToUiState$1.L$3 = chaloTextUIState;
                loginOtpEnterComponent$convertToUiState$1.label = 3;
                objR0 = R0(z5, j, loginOtpEnterComponent$convertToUiState$1);
                if (objR0 != obj) {
                    loadingDialogUIState2 = loadingDialogUIState;
                    chaloTextUIState2 = chaloTextUIState;
                    objM0 = objR0;
                    loginOtpResendTextUIState = (LoginOtpResendTextUIState) objM0;
                    String str2 = loginOtpEnterDataState2.f5330a;
                    TextFieldEventHandlerHelper$maxDigits$1 textFieldEventHandlerHelper$maxDigits$1 = new TextFieldEventHandlerHelper$maxDigits$1(6, new dd0(this, 16));
                    UITextStyle uITextStyle = UITextStyle.DisplaySmall;
                    z = true;
                    UIKeyboardOption uIKeyboardOption = new UIKeyboardOption(null, UIKeyboardType.Number, new UIImeActionHandler(UIImeAction.Done, new yf0(this, 3)), 1);
                    ChaloColorToken.Transparent transparent = ChaloColorToken.Transparent.f9864a;
                    str = str2;
                    BaseTextFieldUIState.TextFieldUIState textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str, textFieldEventHandlerHelper$maxDigits$1, uITextStyle, null, null, null, false, uIKeyboardOption, 6, null, new UITextFieldColors(null, null, null, null, null, null, transparent, transparent, transparent, transparent, null, null, 3130367), 0.0f, 89068);
                    z2 = false;
                    IntRange intRangeO = RangesKt.o(0, 6);
                    arrayList = new ArrayList(CollectionsKt.v(intRangeO, 10));
                    it = intRangeO.iterator();
                    while (((IntProgressionIterator) it).c) {
                        iNextInt = ((IntIterator) it).nextInt();
                        if (iNextInt < str.length()) {
                            strValueOf = String.valueOf(str.charAt(iNextInt));
                        } else {
                            strValueOf = "";
                        }
                        if (str.length() == iNextInt) {
                            z3 = z;
                        } else {
                            z3 = z2;
                        }
                        if (z3) {
                            chaloColorToken = ChaloColorToken.Orange2.f9830a;
                        } else {
                            chaloColorToken = ChaloColorToken.ShadyGray.f9851a;
                        }
                        if (z3) {
                            text = new LoginOtpEnterIndividualBoxUIState.Text(new TextUIState.ChaloTextUIState(strValueOf, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8156), new BorderUISpec(ChaloThemeHelper.a().b, chaloColorToken, UIShape.d));
                        } else {
                            text = new LoginOtpEnterIndividualBoxUIState.Text(new TextUIState.ChaloTextUIState(strValueOf, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8156), new BorderUISpec(ChaloThemeHelper.a().b, chaloColorToken, UIShape.d));
                        }
                        arrayList.add(text);
                        it = it;
                        str = str;
                        z = true;
                        z2 = false;
                    }
                    loginOtpEnterTextFieldUIState = new LoginOtpEnterTextFieldUIState(textFieldUIState, arrayList, 4);
                    if (loginOtpEnterDataState2.d) {
                        loginOtpEnterComponent$convertToUiState$1.L$0 = toolbarUIState;
                        loginOtpEnterComponent$convertToUiState$1.L$1 = loadingDialogUIState2;
                        loginOtpEnterComponent$convertToUiState$1.L$2 = chaloTextUIState2;
                        loginOtpEnterComponent$convertToUiState$1.L$3 = loginOtpResendTextUIState;
                        loginOtpEnterComponent$convertToUiState$1.L$4 = loginOtpEnterTextFieldUIState;
                        loginOtpEnterComponent$convertToUiState$1.label = 4;
                        objN0 = N0(loginOtpEnterComponent$convertToUiState$1);
                        if (objN0 != obj) {
                            loginOtpResendTextUIState3 = loginOtpResendTextUIState;
                            objM0 = objN0;
                            toolbarUIState3 = toolbarUIState;
                            chaloTextUIState5 = chaloTextUIState2;
                            loginOtpEnterTextFieldUIState3 = loginOtpEnterTextFieldUIState;
                            loadingDialogUIState3 = loadingDialogUIState2;
                        }
                    } else {
                        chaloTextUIState3 = chaloTextUIState2;
                        loginOtpResendTextUIState2 = loginOtpResendTextUIState;
                        toolbarUIState2 = toolbarUIState;
                        loginOtpEnterTextFieldUIState2 = loginOtpEnterTextFieldUIState;
                        chaloTextUIState4 = null;
                    }
                    return new LoginOtpEnterUIState(loadingDialogUIState2, toolbarUIState2, chaloTextUIState3, loginOtpResendTextUIState2, loginOtpEnterTextFieldUIState2, chaloTextUIState4);
                }
                return obj;
            }
            if (i2 == 3) {
                chaloTextUIState2 = (TextUIState.ChaloTextUIState) loginOtpEnterComponent$convertToUiState$1.L$3;
                LoadingDialogUIState loadingDialogUIState4 = (LoadingDialogUIState) loginOtpEnterComponent$convertToUiState$1.L$2;
                ToolbarUIState toolbarUIState6 = (ToolbarUIState) loginOtpEnterComponent$convertToUiState$1.L$1;
                loginOtpEnterDataState2 = (LoginOtpEnterDataState) loginOtpEnterComponent$convertToUiState$1.L$0;
                ResultKt.b(objM0);
                loadingDialogUIState2 = loadingDialogUIState4;
                toolbarUIState = toolbarUIState6;
                loginOtpResendTextUIState = (LoginOtpResendTextUIState) objM0;
                String str3 = loginOtpEnterDataState2.f5330a;
                TextFieldEventHandlerHelper$maxDigits$1 textFieldEventHandlerHelper$maxDigits$2 = new TextFieldEventHandlerHelper$maxDigits$1(6, new dd0(this, 16));
                UITextStyle uITextStyle2 = UITextStyle.DisplaySmall;
                z = true;
                UIKeyboardOption uIKeyboardOption2 = new UIKeyboardOption(null, UIKeyboardType.Number, new UIImeActionHandler(UIImeAction.Done, new yf0(this, 3)), 1);
                ChaloColorToken.Transparent transparent2 = ChaloColorToken.Transparent.f9864a;
                str = str3;
                BaseTextFieldUIState.TextFieldUIState textFieldUIState2 = new BaseTextFieldUIState.TextFieldUIState(str, textFieldEventHandlerHelper$maxDigits$2, uITextStyle2, null, null, null, false, uIKeyboardOption2, 6, null, new UITextFieldColors(null, null, null, null, null, null, transparent2, transparent2, transparent2, transparent2, null, null, 3130367), 0.0f, 89068);
                z2 = false;
                IntRange intRangeO2 = RangesKt.o(0, 6);
                arrayList = new ArrayList(CollectionsKt.v(intRangeO2, 10));
                it = intRangeO2.iterator();
                while (((IntProgressionIterator) it).c) {
                    iNextInt = ((IntIterator) it).nextInt();
                    if (iNextInt < str.length()) {
                        strValueOf = String.valueOf(str.charAt(iNextInt));
                    } else {
                        strValueOf = "";
                    }
                    if (str.length() == iNextInt) {
                        z3 = z;
                    } else {
                        z3 = z2;
                    }
                    if (z3) {
                        chaloColorToken = ChaloColorToken.Orange2.f9830a;
                    } else {
                        chaloColorToken = ChaloColorToken.ShadyGray.f9851a;
                    }
                    if (z3 || strValueOf.length() != 0) {
                        text = new LoginOtpEnterIndividualBoxUIState.Text(new TextUIState.ChaloTextUIState(strValueOf, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8156), new BorderUISpec(ChaloThemeHelper.a().b, chaloColorToken, UIShape.d));
                    } else {
                        text = new LoginOtpEnterIndividualBoxUIState.BlinkingCursor(new BorderUISpec(ChaloThemeHelper.a().b, chaloColorToken, UIShape.d));
                    }
                    arrayList.add(text);
                    it = it;
                    str = str;
                    z = true;
                    z2 = false;
                }
                loginOtpEnterTextFieldUIState = new LoginOtpEnterTextFieldUIState(textFieldUIState2, arrayList, 4);
                if (loginOtpEnterDataState2.d) {
                    loginOtpEnterComponent$convertToUiState$1.L$0 = toolbarUIState;
                    loginOtpEnterComponent$convertToUiState$1.L$1 = loadingDialogUIState2;
                    loginOtpEnterComponent$convertToUiState$1.L$2 = chaloTextUIState2;
                    loginOtpEnterComponent$convertToUiState$1.L$3 = loginOtpResendTextUIState;
                    loginOtpEnterComponent$convertToUiState$1.L$4 = loginOtpEnterTextFieldUIState;
                    loginOtpEnterComponent$convertToUiState$1.label = 4;
                    objN0 = N0(loginOtpEnterComponent$convertToUiState$1);
                    if (objN0 != obj) {
                        loginOtpResendTextUIState3 = loginOtpResendTextUIState;
                        objM0 = objN0;
                        toolbarUIState3 = toolbarUIState;
                        chaloTextUIState5 = chaloTextUIState2;
                        loginOtpEnterTextFieldUIState3 = loginOtpEnterTextFieldUIState;
                        loadingDialogUIState3 = loadingDialogUIState2;
                    }
                    return obj;
                }
                chaloTextUIState3 = chaloTextUIState2;
                loginOtpResendTextUIState2 = loginOtpResendTextUIState;
                toolbarUIState2 = toolbarUIState;
                loginOtpEnterTextFieldUIState2 = loginOtpEnterTextFieldUIState;
                chaloTextUIState4 = null;
                return new LoginOtpEnterUIState(loadingDialogUIState2, toolbarUIState2, chaloTextUIState3, loginOtpResendTextUIState2, loginOtpEnterTextFieldUIState2, chaloTextUIState4);
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            loginOtpEnterTextFieldUIState3 = (LoginOtpEnterTextFieldUIState) loginOtpEnterComponent$convertToUiState$1.L$4;
            loginOtpResendTextUIState3 = (LoginOtpResendTextUIState) loginOtpEnterComponent$convertToUiState$1.L$3;
            chaloTextUIState5 = (TextUIState.ChaloTextUIState) loginOtpEnterComponent$convertToUiState$1.L$2;
            loadingDialogUIState3 = (LoadingDialogUIState) loginOtpEnterComponent$convertToUiState$1.L$1;
            toolbarUIState3 = (ToolbarUIState) loginOtpEnterComponent$convertToUiState$1.L$0;
            ResultKt.b(objM0);
        }
        loginOtpEnterTextFieldUIState2 = loginOtpEnterTextFieldUIState3;
        chaloTextUIState4 = (TextUIState.ChaloTextUIState) objM0;
        toolbarUIState2 = toolbarUIState3;
        loginOtpResendTextUIState2 = loginOtpResendTextUIState3;
        chaloTextUIState3 = chaloTextUIState5;
        loadingDialogUIState2 = loadingDialogUIState3;
        return new LoginOtpEnterUIState(loadingDialogUIState2, toolbarUIState2, chaloTextUIState3, loginOtpResendTextUIState2, loginOtpEnterTextFieldUIState2, chaloTextUIState4);
        LoadingDialogUIState loadingDialogUIState5 = (LoadingDialogUIState) objM0;
        String str4 = loginOtpEnterDataState3.h;
        loginOtpEnterComponent$convertToUiState$1.L$0 = loginOtpEnterDataState3;
        loginOtpEnterComponent$convertToUiState$1.L$1 = toolbarUIState;
        loginOtpEnterComponent$convertToUiState$1.L$2 = loadingDialogUIState5;
        loginOtpEnterComponent$convertToUiState$1.label = 2;
        Object objL0 = L0(str4, loginOtpEnterComponent$convertToUiState$1);
        if (objL0 != obj) {
            loginOtpEnterDataState2 = loginOtpEnterDataState3;
            loadingDialogUIState = loadingDialogUIState5;
            objM0 = objL0;
            chaloTextUIState = (TextUIState.ChaloTextUIState) objM0;
            boolean z6 = loginOtpEnterDataState2.f;
            long j2 = loginOtpEnterDataState2.e;
            loginOtpEnterComponent$convertToUiState$1.L$0 = loginOtpEnterDataState2;
            loginOtpEnterComponent$convertToUiState$1.L$1 = toolbarUIState;
            loginOtpEnterComponent$convertToUiState$1.L$2 = loadingDialogUIState;
            loginOtpEnterComponent$convertToUiState$1.L$3 = chaloTextUIState;
            loginOtpEnterComponent$convertToUiState$1.label = 3;
            objR0 = R0(z6, j2, loginOtpEnterComponent$convertToUiState$1);
            if (objR0 != obj) {
                loadingDialogUIState2 = loadingDialogUIState;
                chaloTextUIState2 = chaloTextUIState;
                objM0 = objR0;
                loginOtpResendTextUIState = (LoginOtpResendTextUIState) objM0;
                String str5 = loginOtpEnterDataState2.f5330a;
                TextFieldEventHandlerHelper$maxDigits$1 textFieldEventHandlerHelper$maxDigits$3 = new TextFieldEventHandlerHelper$maxDigits$1(6, new dd0(this, 16));
                UITextStyle uITextStyle3 = UITextStyle.DisplaySmall;
                z = true;
                UIKeyboardOption uIKeyboardOption3 = new UIKeyboardOption(null, UIKeyboardType.Number, new UIImeActionHandler(UIImeAction.Done, new yf0(this, 3)), 1);
                ChaloColorToken.Transparent transparent3 = ChaloColorToken.Transparent.f9864a;
                str = str5;
                BaseTextFieldUIState.TextFieldUIState textFieldUIState3 = new BaseTextFieldUIState.TextFieldUIState(str, textFieldEventHandlerHelper$maxDigits$3, uITextStyle3, null, null, null, false, uIKeyboardOption3, 6, null, new UITextFieldColors(null, null, null, null, null, null, transparent3, transparent3, transparent3, transparent3, null, null, 3130367), 0.0f, 89068);
                z2 = false;
                IntRange intRangeO3 = RangesKt.o(0, 6);
                arrayList = new ArrayList(CollectionsKt.v(intRangeO3, 10));
                it = intRangeO3.iterator();
                while (((IntProgressionIterator) it).c) {
                    iNextInt = ((IntIterator) it).nextInt();
                    if (iNextInt < str.length()) {
                        strValueOf = String.valueOf(str.charAt(iNextInt));
                    } else {
                        strValueOf = "";
                    }
                    if (str.length() == iNextInt) {
                        z3 = z;
                    } else {
                        z3 = z2;
                    }
                    if (z3) {
                        chaloColorToken = ChaloColorToken.Orange2.f9830a;
                    } else {
                        chaloColorToken = ChaloColorToken.ShadyGray.f9851a;
                    }
                    if (z3) {
                        text = new LoginOtpEnterIndividualBoxUIState.Text(new TextUIState.ChaloTextUIState(strValueOf, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8156), new BorderUISpec(ChaloThemeHelper.a().b, chaloColorToken, UIShape.d));
                    } else {
                        text = new LoginOtpEnterIndividualBoxUIState.Text(new TextUIState.ChaloTextUIState(strValueOf, UITextStyle.DisplaySmall, (ChaloColorToken) null, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8156), new BorderUISpec(ChaloThemeHelper.a().b, chaloColorToken, UIShape.d));
                    }
                    arrayList.add(text);
                    it = it;
                    str = str;
                    z = true;
                    z2 = false;
                }
                loginOtpEnterTextFieldUIState = new LoginOtpEnterTextFieldUIState(textFieldUIState3, arrayList, 4);
                if (loginOtpEnterDataState2.d) {
                    loginOtpEnterComponent$convertToUiState$1.L$0 = toolbarUIState;
                    loginOtpEnterComponent$convertToUiState$1.L$1 = loadingDialogUIState2;
                    loginOtpEnterComponent$convertToUiState$1.L$2 = chaloTextUIState2;
                    loginOtpEnterComponent$convertToUiState$1.L$3 = loginOtpResendTextUIState;
                    loginOtpEnterComponent$convertToUiState$1.L$4 = loginOtpEnterTextFieldUIState;
                    loginOtpEnterComponent$convertToUiState$1.label = 4;
                    objN0 = N0(loginOtpEnterComponent$convertToUiState$1);
                    if (objN0 != obj) {
                        loginOtpResendTextUIState3 = loginOtpResendTextUIState;
                        objM0 = objN0;
                        toolbarUIState3 = toolbarUIState;
                        chaloTextUIState5 = chaloTextUIState2;
                        loginOtpEnterTextFieldUIState3 = loginOtpEnterTextFieldUIState;
                        loadingDialogUIState3 = loadingDialogUIState2;
                        loginOtpEnterTextFieldUIState2 = loginOtpEnterTextFieldUIState3;
                        chaloTextUIState4 = (TextUIState.ChaloTextUIState) objM0;
                        toolbarUIState2 = toolbarUIState3;
                        loginOtpResendTextUIState2 = loginOtpResendTextUIState3;
                        chaloTextUIState3 = chaloTextUIState5;
                        loadingDialogUIState2 = loadingDialogUIState3;
                    }
                } else {
                    chaloTextUIState3 = chaloTextUIState2;
                    loginOtpResendTextUIState2 = loginOtpResendTextUIState;
                    toolbarUIState2 = toolbarUIState;
                    loginOtpEnterTextFieldUIState2 = loginOtpEnterTextFieldUIState;
                    chaloTextUIState4 = null;
                }
                return new LoginOtpEnterUIState(loadingDialogUIState2, toolbarUIState2, chaloTextUIState3, loginOtpResendTextUIState2, loginOtpEnterTextFieldUIState2, chaloTextUIState4);
            }
        }
        return obj;
    }

    public final void J0() {
        StateFlow stateFlow = this.f;
        BuildersKt.d(this.j, null, null, new LoginOtpEnterComponent$handleOnVerifyClickedIntent$1(this, ((LoginOtpEnterDataState) stateFlow.getValue()).h, ((LoginOtpEnterDataState) stateFlow.getValue()).i, ((LoginOtpEnterDataState) stateFlow.getValue()).g, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0084 A[PHI: r15
      0x0084: PHI (r15v10 java.lang.Object) = (r15v9 java.lang.Object), (r15v1 java.lang.Object) binds: [B:27:0x0081, B:17:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r15 == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K0(kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.ui.otp.LoginOtpEnterComponent.K0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r1 == r3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r1 == r3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L0(java.lang.String r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof app.chalo.login.ui.otp.LoginOtpEnterComponent$headingTextUIState$1
            if (r2 == 0) goto L17
            r2 = r1
            app.chalo.login.ui.otp.LoginOtpEnterComponent$headingTextUIState$1 r2 = (app.chalo.login.ui.otp.LoginOtpEnterComponent$headingTextUIState$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            app.chalo.login.ui.otp.LoginOtpEnterComponent$headingTextUIState$1 r2 = new app.chalo.login.ui.otp.LoginOtpEnterComponent$headingTextUIState$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3a
            if (r4 == r6) goto L36
            if (r4 != r5) goto L2e
            kotlin.ResultKt.b(r1)
            goto L58
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            kotlin.ResultKt.b(r1)
            goto L69
        L3a:
            kotlin.ResultKt.b(r1)
            r1 = 0
            app.chalo.providers.stringprovider.StringProvider r4 = r0.n
            if (r17 == 0) goto L5c
            int r7 = r17.length()
            if (r7 != 0) goto L49
            goto L5c
        L49:
            app.chalo.providers.stringprovider.StringEnum r7 = app.chalo.providers.stringprovider.StringEnum.WE_HAVE_SENT_AN_OTP
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r1] = r17
            r2.label = r5
            java.lang.Object r1 = r4.b(r7, r6, r2)
            if (r1 != r3) goto L58
            goto L68
        L58:
            java.lang.String r1 = (java.lang.String) r1
        L5a:
            r3 = r1
            goto L6c
        L5c:
            app.chalo.providers.stringprovider.StringEnum r5 = app.chalo.providers.stringprovider.StringEnum.ENTER_6_DIGIT_VERIFICATION_CODE
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2.label = r6
            java.lang.Object r1 = r4.b(r5, r1, r2)
            if (r1 != r3) goto L69
        L68:
            return r3
        L69:
            java.lang.String r1 = (java.lang.String) r1
            goto L5a
        L6c:
            app.chalo.uistate.text.TextUIState$ChaloTextUIState r2 = new app.chalo.uistate.text.TextUIState$ChaloTextUIState
            app.chalo.uistate.text.UITextStyle r4 = app.chalo.uistate.text.UITextStyle.DisplayMedium
            app.chalo.uistate.text.UIFontWeight r8 = app.chalo.uistate.text.UIFontWeight.Bold
            java.lang.Integer r9 = new java.lang.Integer
            r1 = 24
            r9.<init>(r1)
            r14 = 0
            r15 = 7996(0x1f3c, float:1.1205E-41)
            r5 = 0
            r6 = 0
            r7 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.ui.otp.LoginOtpEnterComponent.L0(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M0(boolean z, LoginLoadingPurpose loginLoadingPurpose, ContinuationImpl continuationImpl) {
        LoginOtpEnterComponent$loadingDialogUIState$1 loginOtpEnterComponent$loadingDialogUIState$1;
        DialogUIStateFactory dialogUIStateFactory;
        Object objB;
        if (continuationImpl instanceof LoginOtpEnterComponent$loadingDialogUIState$1) {
            loginOtpEnterComponent$loadingDialogUIState$1 = (LoginOtpEnterComponent$loadingDialogUIState$1) continuationImpl;
            int i = loginOtpEnterComponent$loadingDialogUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginOtpEnterComponent$loadingDialogUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                loginOtpEnterComponent$loadingDialogUIState$1 = new LoginOtpEnterComponent$loadingDialogUIState$1(this, continuationImpl);
            }
        } else {
            loginOtpEnterComponent$loadingDialogUIState$1 = new LoginOtpEnterComponent$loadingDialogUIState$1(this, continuationImpl);
        }
        Object obj = loginOtpEnterComponent$loadingDialogUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = loginOtpEnterComponent$loadingDialogUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (!z) {
                return null;
            }
            dialogUIStateFactory = DialogUIStateFactory.f9989a;
            loginOtpEnterComponent$loadingDialogUIState$1.L$0 = dialogUIStateFactory;
            loginOtpEnterComponent$loadingDialogUIState$1.label = 1;
            int i3 = WhenMappings.b[loginLoadingPurpose.ordinal()];
            StringProvider stringProvider = this.n;
            if (i3 == 1) {
                objB = stringProvider.b(StringEnum.VERIFYING_PHONE_NUMBER, new Object[0], loginOtpEnterComponent$loadingDialogUIState$1);
            } else if (i3 == 2) {
                objB = stringProvider.b(StringEnum.VERIFYING_OTP, new Object[0], loginOtpEnterComponent$loadingDialogUIState$1);
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                objB = stringProvider.b(StringEnum.LOADING_THREE_DOTS, new Object[0], loginOtpEnterComponent$loadingDialogUIState$1);
            }
            obj = objB;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dialogUIStateFactory = (DialogUIStateFactory) loginOtpEnterComponent$loadingDialogUIState$1.L$0;
            ResultKt.b(obj);
        }
        dialogUIStateFactory.getClass();
        return DialogUIStateFactory.a((String) obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N0(ContinuationImpl continuationImpl) {
        LoginOtpEnterComponent$otpErrorUIState$1 loginOtpEnterComponent$otpErrorUIState$1;
        if (continuationImpl instanceof LoginOtpEnterComponent$otpErrorUIState$1) {
            loginOtpEnterComponent$otpErrorUIState$1 = (LoginOtpEnterComponent$otpErrorUIState$1) continuationImpl;
            int i = loginOtpEnterComponent$otpErrorUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginOtpEnterComponent$otpErrorUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                loginOtpEnterComponent$otpErrorUIState$1 = new LoginOtpEnterComponent$otpErrorUIState$1(this, continuationImpl);
            }
        } else {
            loginOtpEnterComponent$otpErrorUIState$1 = new LoginOtpEnterComponent$otpErrorUIState$1(this, continuationImpl);
        }
        Object objB = loginOtpEnterComponent$otpErrorUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = loginOtpEnterComponent$otpErrorUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            loginOtpEnterComponent$otpErrorUIState$1.label = 1;
            objB = this.n.b(StringEnum.OTP_VERIFICATION_FAILED, new Object[0], loginOtpEnterComponent$otpErrorUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        return new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.ErrorColor.f9794a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
    }

    public final void O0(LoginOtpEnterIntent loginOtpEnterIntent) {
        C0(loginOtpEnterIntent);
        boolean z = loginOtpEnterIntent instanceof LoginOtpEnterIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        if (z) {
            LoginOtpEnterIntent.InitializationIntent initializationIntent = (LoginOtpEnterIntent.InitializationIntent) loginOtpEnterIntent;
            if (!this.d) {
                this.d = true;
                Job job = this.D;
                if (job != null) {
                    ((JobSupport) job).cancel(null);
                }
                this.D = BuildersKt.d(contextScope, null, null, new LoginOtpEnterComponent$startResendOtpEnableTimer$1(this, null), 3);
                this.t.a();
                E0(new dd0(initializationIntent, 15));
                r0(LoginOtpEnterSideEffect.BringFocusOnOtpField.f5340a);
            }
        } else {
            boolean z2 = loginOtpEnterIntent instanceof LoginOtpEnterIntent.OnOtpEnteredIntent;
            StateFlow stateFlow = this.f;
            if (!z2) {
                if (loginOtpEnterIntent instanceof LoginOtpEnterIntent.OnResendOtpClickedIntent) {
                    BuildersKt.d(contextScope, null, null, new LoginOtpEnterComponent$handleOnResendOtpClickedIntent$1(this, ((LoginOtpEnterDataState) stateFlow.getValue()).h, ((LoginOtpEnterDataState) stateFlow.getValue()).i, ((LoginOtpEnterDataState) stateFlow.getValue()).g, null), 3);
                    return;
                }
                if (loginOtpEnterIntent instanceof LoginOtpEnterIntent.OnVerifyClickedIntent) {
                    J0();
                    return;
                }
                if (loginOtpEnterIntent instanceof LoginOtpEnterIntent.OnResendOtpEnableCountdownUpdate) {
                    E0(new dd0((LoginOtpEnterIntent.OnResendOtpEnableCountdownUpdate) loginOtpEnterIntent, 18));
                    return;
                }
                if (!(loginOtpEnterIntent instanceof LoginOtpEnterIntent.OnOtpSMSReadSuccessfully)) {
                    if (loginOtpEnterIntent.equals(LoginOtpEnterIntent.OnActiveIntent.f5333a)) {
                        Job job2 = this.E;
                        if (job2 != null) {
                            ((JobSupport) job2).cancel(null);
                        }
                        this.E = BuildersKt.d(contextScope, null, null, new LoginOtpEnterComponent$handleOnActiveIntent$1(this, null), 3);
                        return;
                    }
                    if (!loginOtpEnterIntent.equals(LoginOtpEnterIntent.OnInactiveIntent.f5334a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Job job3 = this.E;
                    if (job3 != null) {
                        ((JobSupport) job3).cancel(null);
                        return;
                    }
                    return;
                }
                String str = ((LoginOtpEnterIntent.OnOtpSMSReadSuccessfully) loginOtpEnterIntent).f5336a;
                P0("auto read otp successful", null);
                ((LoginOtpEnterDataState) stateFlow.getValue()).getClass();
                this.q.getClass();
                List listQ = SequencesKt.q(Regex.d(new Regex("\\d{6}"), str));
                ArrayList arrayList = new ArrayList(CollectionsKt.v(listQ, 10));
                Iterator it = listQ.iterator();
                while (it.hasNext()) {
                    arrayList.add(((MatchResult) it.next()).getValue());
                }
                String str2 = (String) CollectionsKt.H(arrayList);
                if (str2 == null || StringsKt.F(str2)) {
                    return;
                }
                E0(new n10(str2, 25));
                J0();
                return;
            }
            LoginOtpEnterIntent.OnOtpEnteredIntent onOtpEnteredIntent = (LoginOtpEnterIntent.OnOtpEnteredIntent) loginOtpEnterIntent;
            int length = onOtpEnteredIntent.f5335a.length();
            ((LoginOtpEnterDataState) stateFlow.getValue()).getClass();
            boolean z3 = length == 6;
            E0(new dd0(onOtpEnteredIntent, 17));
            if (z3 && !((LoginOtpEnterDataState) stateFlow.getValue()).b) {
                O0(LoginOtpEnterIntent.OnVerifyClickedIntent.f5339a);
            }
        }
    }

    public final void P0(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LoginOtpEnterDataState loginOtpEnterDataState = (LoginOtpEnterDataState) this.f.getValue();
        Intrinsics.i(loginOtpEnterDataState, "<this>");
        String str2 = loginOtpEnterDataState.i;
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("countryCallingCode", str2);
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        AnalyticsContract.DefaultImpls.a(this.o, str, "loginOtpEnterScreen", linkedHashMap, null, false, 24);
    }

    public final void Q0(String str, boolean z) {
        P0("login failed", MapsKt.i(new Pair(FirebaseAnalytics.Param.METHOD, CLConstants.OTP), new Pair("reason", str), new Pair("isInvalidOtpEntered", String.valueOf(z))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r2 == r4) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
    
        if (r2 == r4) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R0(boolean r32, long r33, kotlin.coroutines.jvm.internal.ContinuationImpl r35) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.ui.otp.LoginOtpEnterComponent.R0(boolean, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Boolean S0(ContinuationImpl continuationImpl) {
        LoginOtpEnterComponent$shouldRequestNotificationPermission$1 loginOtpEnterComponent$shouldRequestNotificationPermission$1;
        if (continuationImpl instanceof LoginOtpEnterComponent$shouldRequestNotificationPermission$1) {
            loginOtpEnterComponent$shouldRequestNotificationPermission$1 = (LoginOtpEnterComponent$shouldRequestNotificationPermission$1) continuationImpl;
            int i = loginOtpEnterComponent$shouldRequestNotificationPermission$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loginOtpEnterComponent$shouldRequestNotificationPermission$1.label = i - Integer.MIN_VALUE;
            } else {
                loginOtpEnterComponent$shouldRequestNotificationPermission$1 = new LoginOtpEnterComponent$shouldRequestNotificationPermission$1(this, continuationImpl);
            }
        } else {
            loginOtpEnterComponent$shouldRequestNotificationPermission$1 = new LoginOtpEnterComponent$shouldRequestNotificationPermission$1(this, continuationImpl);
        }
        Object obj = loginOtpEnterComponent$shouldRequestNotificationPermission$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = loginOtpEnterComponent$shouldRequestNotificationPermission$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            float f = PlatformFeature.f10436a;
            return Boolean.FALSE;
        }
        boolean z = true;
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        PermissionState permissionState = (PermissionState) obj;
        int i3 = permissionState == null ? -1 : WhenMappings.f5326a[permissionState.ordinal()];
        if (i3 == -1) {
            z = false;
        } else if (i3 != 1 && i3 != 2) {
            if (i3 != 3 && i3 != 4 && i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new LoginOtpEnterDataState("", false, LoginLoadingPurpose.GENERAL, false, 30000L, false, null, null, null, "");
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void y0() {
        O0(LoginOtpEnterIntent.OnActiveIntent.f5333a);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void z0() {
        O0(LoginOtpEnterIntent.OnInactiveIntent.f5334a);
    }
}
