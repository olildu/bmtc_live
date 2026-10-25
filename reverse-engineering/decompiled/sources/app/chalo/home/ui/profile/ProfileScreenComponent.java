package app.chalo.home.ui.profile;

import app.chalo.behaviour.policy.ResolveSupportPolicyUseCase;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.constants.Source;
import app.chalo.features.chalotime.domain.ChaloTimeRefreshManagerUseCase;
import app.chalo.features.language.data.LanguageSelectionSourceType;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.helper.UrlOpenHelper;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.domain.GetProfilePageItemsUseCase;
import app.chalo.home.ui.HomeTabScreensNavigationAndStateManager;
import app.chalo.homescreen.data.model.app.BottomNavTabType;
import app.chalo.homescreen.data.model.app.ProfilePageFeature;
import app.chalo.juspay.JuspayController;
import app.chalo.juspay.JuspayControllerProvider;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.reportproblem.InitiateFreshChatCustomerSupportUseCase;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.ChaloCardLandingScreenArgs;
import app.chalo.scenes.args.EBillFetchScreenArgs;
import app.chalo.scenes.args.LanguageSelectionArgs;
import app.chalo.scenes.args.LoginOptionsArgs;
import app.chalo.scenes.args.NearbyStopsMapArgs;
import app.chalo.scenes.args.SavedPlacesAndRidesArgs;
import app.chalo.scenes.args.SosArgs;
import app.chalo.scenes.args.UserConsentScreenArgs;
import app.chalo.scenes.args.UserProfileFormArgs;
import app.chalo.scenes.args.WalletBalanceArgs;
import app.chalo.userconsent.UserConsentFlowType;
import app.chalo.userprofile.domain.AccountSettingsAction;
import app.chalo.userprofile.domain.AccountSettingsInteractor;
import app.chalo.utils.PlatformFeature;
import app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStore;
import com.arkivanov.decompose.ComponentContext;
import defpackage.dy0;
import defpackage.ux0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/home/ui/profile/ProfileScreenViewIntent;", "Lapp/chalo/home/ui/profile/ProfileScreenViewState;", "Lapp/chalo/home/ui/profile/ProfileScreenDataState;", "Lapp/chalo/home/ui/profile/ProfileScreenSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProfileScreenComponent extends ChaloBaseStateMviComponent<ProfileScreenViewIntent, ProfileScreenViewState, ProfileScreenViewState, ProfileScreenSideEffect> {
    public final ChaloAppFeatureHelper A;
    public final ResolveSupportPolicyUseCase B;
    public final JuspayControllerProvider C;
    public final Lazy D;
    public Job E;
    public final WalletDataStore k;
    public final HomeScreenInfoHelper l;
    public final GetProfilePageItemsUseCase m;
    public final HomeScreenAnalyticsHelper n;
    public final CoroutineContextProvider o;
    public final ChaloBuildConfig p;
    public final ChaloTimeRefreshManagerUseCase q;
    public final ChaloNavigationManager r;
    public final HomeTabScreensNavigationAndStateManager s;
    public final CityProvider t;
    public final InitiateFreshChatCustomerSupportUseCase u;
    public final UserProfileDetailsProvider v;
    public final AccountSettingsInteractor w;
    public final StringProvider x;
    public final KotlinToastManager y;
    public final UrlOpenHelper z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3596a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ProfilePageFeature.values().length];
            try {
                iArr[ProfilePageFeature.PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfilePageFeature.ACCOUNT_SETTINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProfilePageFeature.CHALO_WALLET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProfilePageFeature.TICKETS_PASSES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProfilePageFeature.SAVED_PLACES_AND_RIDES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProfilePageFeature.BUS_STOPS_NEAR_ME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProfilePageFeature.SOS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProfilePageFeature.ELECTRICITY_BILL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ProfilePageFeature.CUSTOMER_SUPPORT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ProfilePageFeature.TERMS_CONDITIONS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ProfilePageFeature.CHANGE_LANGUAGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ProfilePageFeature.USER_CONSENT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ProfilePageFeature.CHANGE_ENVIRONMENT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ProfilePageFeature.MANAGE_TRAVEL_CARD.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ProfilePageFeature.PLOTLINE_WIDGET.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ProfilePageFeature.UNKNOWN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ProfilePageFeature.MANAGE_CHALO_UPI.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            f3596a = iArr;
            int[] iArr2 = new int[AccountSettingsAction.values().length];
            try {
                iArr2[AccountSettingsAction.LOGOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[AccountSettingsAction.DELETE_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            b = iArr2;
        }
    }

    public ProfileScreenComponent(ComponentContext componentContext, WalletDataStore walletDataStore, HomeScreenInfoHelper homeScreenInfoHelper, GetProfilePageItemsUseCase getProfilePageItemsUseCase, HomeScreenAnalyticsHelper homeScreenAnalyticsHelper, CoroutineContextProvider coroutineContextProvider, ChaloBuildConfig chaloBuildConfig, ChaloTimeRefreshManagerUseCase chaloTimeRefreshManagerUseCase, ChaloNavigationManager chaloNavigationManager, HomeTabScreensNavigationAndStateManager homeTabScreensNavigationAndStateManager, CityProvider cityProvider, InitiateFreshChatCustomerSupportUseCase initiateFreshChatCustomerSupportUseCase, UserProfileDetailsProvider userProfileDetailsProvider, AccountSettingsInteractor accountSettingsInteractor, StringProvider stringProvider, KotlinToastManager kotlinToastManager, UrlOpenHelper urlOpenHelper, ChaloAppFeatureHelper chaloAppFeatureHelper, ResolveSupportPolicyUseCase resolveSupportPolicyUseCase, JuspayControllerProvider juspayControllerProvider) {
        super(componentContext);
        this.k = walletDataStore;
        this.l = homeScreenInfoHelper;
        this.m = getProfilePageItemsUseCase;
        this.n = homeScreenAnalyticsHelper;
        this.o = coroutineContextProvider;
        this.p = chaloBuildConfig;
        this.q = chaloTimeRefreshManagerUseCase;
        this.r = chaloNavigationManager;
        this.s = homeTabScreensNavigationAndStateManager;
        this.t = cityProvider;
        this.u = initiateFreshChatCustomerSupportUseCase;
        this.v = userProfileDetailsProvider;
        this.w = accountSettingsInteractor;
        this.x = stringProvider;
        this.y = kotlinToastManager;
        this.z = urlOpenHelper;
        this.A = chaloAppFeatureHelper;
        this.B = resolveSupportPolicyUseCase;
        this.C = juspayControllerProvider;
        this.D = LazyKt.b(new dy0(this, 0));
    }

    public static final void F0(ProfileScreenComponent profileScreenComponent) {
        profileScreenComponent.getClass();
        float f = PlatformFeature.f10436a;
        profileScreenComponent.r.b(new ChaloNavigationRequest.Navigate(new LoginOptionsArgs(Source.USER_PROFILE_DETAILS, true), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 2), null, 4));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G0(Continuation continuation) {
        ProfileScreenComponent$handleManageUpiRejected$1 profileScreenComponent$handleManageUpiRejected$1;
        KotlinToastManager kotlinToastManager;
        if (continuation instanceof ProfileScreenComponent$handleManageUpiRejected$1) {
            profileScreenComponent$handleManageUpiRejected$1 = (ProfileScreenComponent$handleManageUpiRejected$1) continuation;
            int i = profileScreenComponent$handleManageUpiRejected$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                profileScreenComponent$handleManageUpiRejected$1.label = i - Integer.MIN_VALUE;
            } else {
                profileScreenComponent$handleManageUpiRejected$1 = new ProfileScreenComponent$handleManageUpiRejected$1(this, continuation);
            }
        } else {
            profileScreenComponent$handleManageUpiRejected$1 = new ProfileScreenComponent$handleManageUpiRejected$1(this, continuation);
        }
        Object objB = profileScreenComponent$handleManageUpiRejected$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = profileScreenComponent$handleManageUpiRejected$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            KotlinToastManager kotlinToastManager2 = this.y;
            profileScreenComponent$handleManageUpiRejected$1.L$0 = kotlinToastManager2;
            profileScreenComponent$handleManageUpiRejected$1.label = 1;
            objB = this.x.b(StringEnum.PLEASE_TRY_AGAIN_AFTER_SOMETIME, new Object[0], profileScreenComponent$handleManageUpiRejected$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            kotlinToastManager = kotlinToastManager2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) profileScreenComponent$handleManageUpiRejected$1.L$0;
            ResultKt.b(objB);
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
        return Unit.f17538a;
    }

    public final void H0(ProfileScreenViewIntent intent) {
        boolean z;
        boolean z2;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z3 = intent instanceof ProfileScreenViewIntent.ProfileScreenStartedIntent;
        HomeScreenInfoHelper homeScreenInfoHelper = this.l;
        if (z3) {
            homeScreenInfoHelper.d(false);
            w0(new ProfileScreenComponent$handleProfileScreenStartedIntent$1(this, (ProfileScreenViewIntent.ProfileScreenStartedIntent) intent, null));
            return;
        }
        boolean zEquals = intent.equals(ProfileScreenViewIntent.ChaloPayIntroBottomSheetCtaClickedIntent.f3605a);
        HomeScreenAnalyticsHelper homeScreenAnalyticsHelper = this.n;
        int i = 6;
        ContextScope contextScope = this.j;
        ChaloNavigationManager chaloNavigationManager = this.r;
        if (zEquals) {
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "wallet onBoarding bottom sheet positive button clicked", null, Source.PROFILE_SCREEN, 14);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new WalletBalanceArgs(), null, null, 6));
            E0(new ux0(13));
            r0(new ProfileScreenSideEffect.HideBottomSheet(true));
            BuildersKt.d(contextScope, this.o.getDefault(), null, new ProfileScreenComponent$handleChaloPayIntroBottomSheetCtaClickedIntent$2(this, null), 2);
            return;
        }
        int i2 = 12;
        if (!(intent instanceof ProfileScreenViewIntent.ProfilePageItemClickedIntent)) {
            if (intent instanceof ProfileScreenViewIntent.AccountSettingsActionClickedIntent) {
                int i3 = WhenMappings.b[((ProfileScreenViewIntent.AccountSettingsActionClickedIntent) intent).f3604a.ordinal()];
                if (i3 == 1) {
                    w0(new ProfileScreenComponent$handleLogoutClickedIntent$1(this, null));
                    return;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    E0(new ux0(10));
                    return;
                }
            }
            if (intent.equals(ProfileScreenViewIntent.DismissAccountSettingsBottomSheet.f3609a)) {
                E0(new ux0(11));
                r0(new ProfileScreenSideEffect.HideBottomSheet(false));
                return;
            }
            if (intent.equals(ProfileScreenViewIntent.DeleteAccountDialogAgreeClicked.f3607a)) {
                w0(new ProfileScreenComponent$handleDeleteAccountDialogAgreeClickedIntent$1(this, null));
                return;
            }
            if (intent.equals(ProfileScreenViewIntent.DeleteAccountDialogCancelClicked.f3608a)) {
                E0(new ux0(5));
                return;
            }
            if (intent.equals(ProfileScreenViewIntent.DismissLogoutFailedDialog.f3610a)) {
                E0(new ux0(i));
                return;
            }
            if (!intent.equals(ProfileScreenViewIntent.JuspayBackPressedIntent.f3611a)) {
                if (!intent.equals(ProfileScreenViewIntent.CloseEnvironmentChangeDialog.f3606a)) {
                    throw new NoWhenBranchMatchedException();
                }
                E0(new ux0(7));
                return;
            }
            JuspayController juspayControllerD = this.C.d();
            if (juspayControllerD == null || !juspayControllerD.onBackPressed()) {
                Job job = this.E;
                if (job != null) {
                    ((JobSupport) job).cancel(null);
                }
                E0(new ux0(i2));
                return;
            }
            return;
        }
        ProfileScreenViewIntent.ProfilePageItemClickedIntent profilePageItemClickedIntent = (ProfileScreenViewIntent.ProfilePageItemClickedIntent) intent;
        ProfilePageFeature profilePageFeature = profilePageItemClickedIntent.f3612a;
        if (profilePageFeature != ProfilePageFeature.PLOTLINE_WIDGET) {
            Source source = Source.PROFILE_SCREEN;
            String str = profilePageItemClickedIntent.b;
            if (str == null) {
                str = "";
            }
            z = false;
            Pair pair = new Pair("title", str);
            Integer num = profilePageItemClickedIntent.c;
            z2 = true;
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "profile screen item clicked", MapsKt.i(pair, new Pair("position", (num != null ? num : "").toString()), new Pair("type", profilePageFeature.getFeatureType())), source, 12);
        } else {
            z = false;
            z2 = true;
        }
        int i4 = WhenMappings.f3596a[profilePageFeature.ordinal()];
        StateFlow stateFlow = this.f;
        switch (i4) {
            case 1:
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new UserProfileFormArgs(Source.PROFILE_SCREEN), null, null, 6));
                return;
            case 2:
                w0(new ProfileScreenComponent$handleAccountSettingsClickedIntent$1(this, null));
                return;
            case 3:
                w0(new ProfileScreenComponent$handleProfilePageItemClickedIntent$1(this, null));
                return;
            case 4:
                this.q.e(Source.DRAWER_PASS_TICKET_HISTORY);
                homeScreenInfoHelper.d(true);
                homeScreenInfoHelper.e();
                this.s.c(BottomNavTabType.MY_TICKETS, z);
                return;
            case 5:
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new SavedPlacesAndRidesArgs(Source.PROFILE_SCREEN), null, null, 6));
                return;
            case 6:
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new NearbyStopsMapArgs(Source.PROFILE_SCREEN, ChaloTransitMode.BUS), null, null, 6));
                return;
            case 7:
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new SosArgs(), null, null, 6));
                return;
            case 8:
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(EBillFetchScreenArgs.INSTANCE, null, null, 6));
                return;
            case 9:
                BuildersKt.d(contextScope, null, null, new ProfileScreenComponent$sendCustomerSupportFeedback$1(this, null), 3);
                return;
            case 10:
                String str2 = ((ProfileScreenViewState) stateFlow.getValue()).h;
                if (StringsKt.F(str2)) {
                    return;
                }
                BuildersKt.d(contextScope, null, null, new ProfileScreenComponent$handleProfilePageItemClickedIntent$2(this, str2, null), 3);
                return;
            case 11:
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new LanguageSelectionArgs(LanguageSelectionSourceType.HOME_SCREEN), null, null, 6));
                return;
            case 12:
                boolean z4 = z2;
                ChaloNavigationManagerKt.e(chaloNavigationManager, new UserConsentScreenArgs(new UserConsentFlowType.ExistingUser(z4, z4), null), null, 6);
                return;
            case 13:
                E0(new ux0(9));
                return;
            case 14:
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new ChaloCardLandingScreenArgs(Source.PROFILE_SCREEN), null, null, 6));
                return;
            case 15:
            case 16:
                return;
            case 17:
                if (((ProfileScreenViewState) stateFlow.getValue()).j) {
                    BuildersKt.d(contextScope, null, null, new ProfileScreenComponent$handleManageChaloUpiClickedIntent$1(this, null), 3);
                    return;
                }
                Job job2 = this.E;
                if (job2 != null) {
                    ((JobSupport) job2).cancel(null);
                }
                this.E = BuildersKt.d(contextScope, null, null, new ProfileScreenComponent$handleManageChaloUpiClickedIntent$2(this, null), 3);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I0(String str, Continuation continuation) {
        ProfileScreenComponent$showJuspayErrorToast$1 profileScreenComponent$showJuspayErrorToast$1;
        KotlinToastManager kotlinToastManager;
        KotlinToastManager kotlinToastManager2;
        if (continuation instanceof ProfileScreenComponent$showJuspayErrorToast$1) {
            profileScreenComponent$showJuspayErrorToast$1 = (ProfileScreenComponent$showJuspayErrorToast$1) continuation;
            int i = profileScreenComponent$showJuspayErrorToast$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                profileScreenComponent$showJuspayErrorToast$1.label = i - Integer.MIN_VALUE;
            } else {
                profileScreenComponent$showJuspayErrorToast$1 = new ProfileScreenComponent$showJuspayErrorToast$1(this, continuation);
            }
        } else {
            profileScreenComponent$showJuspayErrorToast$1 = new ProfileScreenComponent$showJuspayErrorToast$1(this, continuation);
        }
        Object obj = profileScreenComponent$showJuspayErrorToast$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = profileScreenComponent$showJuspayErrorToast$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            kotlinToastManager = this.y;
            if (str == null) {
                profileScreenComponent$showJuspayErrorToast$1.L$0 = kotlinToastManager;
                profileScreenComponent$showJuspayErrorToast$1.label = 1;
                Object objB = this.x.b(StringEnum.GENERIC_ERROR_MESSAGE, new Object[0], profileScreenComponent$showJuspayErrorToast$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = objB;
                kotlinToastManager2 = kotlinToastManager;
            }
            KotlinToastManagerKt.a(kotlinToastManager, str, ToastLength.LONG);
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlinToastManager2 = (KotlinToastManager) profileScreenComponent$showJuspayErrorToast$1.L$0;
        ResultKt.b(obj);
        String str2 = (String) obj;
        kotlinToastManager = kotlinToastManager2;
        str = str2;
        KotlinToastManagerKt.a(kotlinToastManager, str, ToastLength.LONG);
        return Unit.f17538a;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (ProfileScreenViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new ProfileScreenViewState(EmptyList.f17557a, null, null, false, "", false, false, "", false, false);
    }
}
