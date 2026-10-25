package app.chalo.home.ui.base;

import androidx.autofill.HintConstants;
import androidx.compose.material3.internal.CalendarModelKt;
import androidx.datastore.preferences.core.PreferencesKeys;
import app.chalo.HomeDestinationTabType.DestinationTabType;
import app.chalo.ads.ExitInterstitialPreloadEntryPoint;
import app.chalo.ads.ExitInterstitialTargetingKey;
import app.chalo.ads.NativeInlineAdPrefetchEntryPoint;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference;
import app.chalo.chalobususerprofile.data.model.SurveyStep;
import app.chalo.chalobususerprofile.data.repository.PremiumBusUserSurveyPreferenceRepository;
import app.chalo.compose.components.userprofile.UserProfilePicComposableKt;
import app.chalo.compose.components.userprofile.UserProfilePicComposableUISpecs;
import app.chalo.compose.components.userprofile.UserProfilePicComposableUIState;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.CityMetaDataManager;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.data.MiscellaneousCityWiseConfigForCity;
import app.chalo.data.PremiumBusNativeCityWiseConfigAppModel;
import app.chalo.datastore.LocalDataStore;
import app.chalo.datastore.LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1;
import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.features.adjust.AdjustManager;
import app.chalo.features.boostratings.IBoostRatingsFeature;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.network.NetworkStateManager;
import app.chalo.features.productsync.constants.SuperPassApplicationStatus;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.geoquery.data.models.app.GeoQueryCityConfigModel;
import app.chalo.geoquery.data.models.app.GeoQueryResponseAppModel;
import app.chalo.geoquery.domain.FetchGeoSpatialDataUseCase;
import app.chalo.geoquery.domain.GetGeoQueryCityWiseConfigUseCase;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.home.BottomSheetState;
import app.chalo.home.BottomSheetTutorialItem;
import app.chalo.home.ChaloBottomSheetLayoutType;
import app.chalo.home.ChaloChainedBottomSheetFeature;
import app.chalo.home.CommonBottomSheetData;
import app.chalo.home.PendingRideFeedbackStickyBannerUIState;
import app.chalo.home.SnackBarState;
import app.chalo.home.analytics.HomeScreenAnalyticsHelper;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.data.repository.TicketRepository;
import app.chalo.home.domain.ChaloUserBookingType;
import app.chalo.home.domain.CheckIfAppUpdateRequiredUseCase;
import app.chalo.home.domain.FetchHomeTabSearchRemovalConfigUseCase;
import app.chalo.home.domain.GetAllRequestedBookedProductsUseCase;
import app.chalo.home.domain.GetHomeScreenConfigUseCase;
import app.chalo.home.domain.GetHomeScreenStartDestinationTabUseCase;
import app.chalo.home.domain.GetNextStepOnPassApplicationRejectedUseCase;
import app.chalo.home.domain.GetNextStepOnPassApplicationVerifiedUseCase;
import app.chalo.home.domain.ProcessRejectedPassApplicationForNextStep;
import app.chalo.home.domain.ResolveChaloBusStickyBannerEligibilityUseCase;
import app.chalo.home.manager.AppRatingProcessSkeleton;
import app.chalo.home.ui.HomeTabScreensNavigationAndStateManager;
import app.chalo.home.ui.HomeTabScreensRetainedState;
import app.chalo.home.ui.chalobus.ChaloBusComponent;
import app.chalo.home.ui.compose.UserProfilingChaloBusStickyBannerUIState;
import app.chalo.home.ui.compose.UserProfilingHomeStickyBannerUIState;
import app.chalo.home.ui.history.MyTicketsComponent;
import app.chalo.home.ui.home.HomeScreenComponent;
import app.chalo.home.ui.regularbus.RegularBusComponent;
import app.chalo.homescreen.data.model.app.BottomNavTabAppModelKt;
import app.chalo.homescreen.data.model.app.BottomNavTabType;
import app.chalo.homescreen.data.model.app.HomeScreenConfigAppModel;
import app.chalo.homescreen.data.model.app.NavigationTabAppModel;
import app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore;
import app.chalo.livetracking.tripplanner.domain.GetTripPlannerConfigForCityUseCase;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LatLng;
import app.chalo.location.LocationUpdateResult;
import app.chalo.login.manager.DpdpaConsentManager;
import app.chalo.login.manager.UserProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1;
import app.chalo.login.userprofiling.hookorchestrator.UserProfilingHookSlot;
import app.chalo.login.userprofiling.hookorchestrator.UserProfilingHooksOrchestrator;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.LocationAppModel;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.permissions.handler.PermissionHandler;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.permissions.models.AppPermission;
import app.chalo.permissions.models.PermissionState;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketsWithPendingTripFeedbackUseCase;
import app.chalo.premiumbus.domain.UpdatePremiumReserveTicketTripFeedbackStatus;
import app.chalo.productpurchase.passpurchase.domain.PassPurchaseSceneResolverUseCase;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModelKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.ridefeedback.data.app.PendingRideFeedbackAppModel;
import app.chalo.ridefeedback.data.dao.PostRideFeedbackEntity;
import app.chalo.ridefeedback.domain.BackfillPendingPremiumBusPrfUseCase;
import app.chalo.ridefeedback.domain.DismissRideFeedbackPromptUseCase;
import app.chalo.ridefeedback.domain.GetPostRideFeedbackDataUseCase;
import app.chalo.ridefeedback.domain.ObservePendingRideFeedbackPromptsUseCase;
import app.chalo.ridefeedback.domain.RetryPendingRideFeedbackUseCase;
import app.chalo.ridefeedback.domain.SyncPremiumBusPendingPrfEntriesUseCase;
import app.chalo.ridehailing.data.RideHailingRepository;
import app.chalo.ridehailing.domain.SubmitRideHailingBookingFeedbackUseCase;
import app.chalo.ridehailing.feedback.UserFeedbackRatingData;
import app.chalo.ridehailing.feedback.UserFeedbackReasonData;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.ChaloBusUserProfileSurveyArgs;
import app.chalo.scenes.args.CitySelectionArgs;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.UniversalPickerArgs;
import app.chalo.scenes.args.UniversalPickerHeaderIcon;
import app.chalo.scenes.args.UserProfileFormArgs;
import app.chalo.superpass.data.models.entities.MagicSuperPass;
import app.chalo.superpass.data.models.entities.PassApplicationActionRequired;
import app.chalo.superpass.data.models.entities.PassApplicationRejectionReasons;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.superpass.data.models.entities.SuperPassApplication;
import app.chalo.superpass.data.models.entities.SuperPassProperties;
import app.chalo.superpass.data.models.entities.SuperPassRepurchaseProperties;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
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
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.universalsearch.data.UniversalSearchOption;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import app.chalo.usecase.CheckIfPremiumPassEligibleForRideRollOver;
import app.chalo.usecase.GetDeviceNFCStateUseCase;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import app.chalo.usecase.GetPremiumBusCurrentCityConfigUseCase;
import app.chalo.usecase.GetTimeInMillisAfterXTimeUseCase;
import app.chalo.usecase.IsNotificationPermissionGrantedUseCase;
import app.chalo.usercommutepreference.domain.FetchCommutePreferenceSummaryUseCase;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.CoroutineRestartUtilsKt;
import app.chalo.utils.PlatformFeature;
import app.chalo.utils.ProductUtils;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.worker.ApplicationBackgroundWorkersManager;
import com.arkivanov.decompose.Child;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.decompose.backhandler.ChildBackHandlerKt;
import com.arkivanov.decompose.instancekeeper.ChildInstanceKeeperKt;
import com.arkivanov.decompose.router.children.ChildrenFactoryKt;
import com.arkivanov.decompose.router.slot.DefaultSlotNavigation;
import com.arkivanov.decompose.router.slot.SlotNavigation;
import com.arkivanov.decompose.router.slot.d;
import com.arkivanov.decompose.router.slot.e;
import com.arkivanov.decompose.router.stack.ChildStack;
import com.arkivanov.decompose.router.stack.ChildStackFactoryKt;
import com.arkivanov.decompose.router.stack.DefaultStackNavigation;
import com.arkivanov.decompose.statekeeper.ChildStateKeeperKt;
import com.arkivanov.decompose.value.MutableValue;
import com.arkivanov.decompose.value.MutableValueBuilderKt;
import com.arkivanov.decompose.value.Value;
import com.arkivanov.essenty.lifecycle.Lifecycle;
import com.arkivanov.essenty.lifecycle.LifecycleExtKt;
import com.arkivanov.essenty.statekeeper.SerializableContainer;
import com.google.android.gms.identity.intents.AddressConstants;
import com.google.firebase.messaging.ServiceStarter;
import defpackage.a70;
import defpackage.e40;
import defpackage.lo;
import defpackage.n3;
import defpackage.n4;
import defpackage.t60;
import defpackage.u60;
import defpackage.v70;
import defpackage.va;
import defpackage.vo1;
import defpackage.w70;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0006:\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/home/ui/base/HomeComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewIntent;", "Lapp/chalo/home/ui/base/HomeScreenFragmentViewState;", "Lapp/chalo/home/ui/base/HomeDataState;", "Lapp/chalo/home/ui/base/HomeScreenFragmentSideEffect;", "Lorg/koin/core/component/KoinComponent;", "TabChild", "TabComponentEntry", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeComponent extends ChaloBaseStateMviComponent<HomeScreenFragmentViewIntent, HomeScreenFragmentViewState, HomeScreenFragmentViewState, HomeScreenFragmentSideEffect> implements KoinComponent {
    public final BackfillPendingPremiumBusPrfUseCase A;
    public boolean A0;
    public final GetTimeInMillisAfterXTimeUseCase B;
    public boolean B0;
    public final HomeScreenAnalyticsHelper C;
    public Job C0;
    public final FetchGeoSpatialDataUseCase D;
    public Job D0;
    public final ChaloLocationManager E;
    public boolean E0;
    public final GetGeoQueryCityWiseConfigUseCase F;
    public String F0;
    public final GetHomeScreenConfigUseCase G;
    public boolean G0;
    public final CoroutineContextProvider H;
    public boolean H0;
    public final CityMetaDataManager I;
    public UserProfilingHomeStickyBannerUIState I0;
    public final IsNotificationPermissionGrantedUseCase J;
    public boolean J0;
    public final GetMiscellaneousCityWiseFlagsConfigUseCase K;
    public UserProfilingChaloBusStickyBannerUIState K0;
    public final AppRatingProcessSkeleton L;
    public PendingRideFeedbackStickyBannerUIState L0;
    public final ChaloNavigationManager M;
    public final HomeTabVisibilityController M0;
    public final NetworkStateManager N;
    public final MutableValue N0;
    public final CheckIfAppUpdateRequiredUseCase O;
    public final Value O0;
    public final HomeTabScreensNavigationAndStateManager P;
    public final LinkedHashMap P0;
    public final FetchHomeTabSearchRemovalConfigUseCase Q;
    public final DefaultStackNavigation Q0;
    public final GetTripPlannerConfigForCityUseCase R;
    public final DefaultSlotNavigation R0;
    public final GetNextStepOnPassApplicationVerifiedUseCase S;
    public final GetNextStepOnPassApplicationRejectedUseCase T;
    public final KotlinToastManager U;
    public final PassPurchaseSceneResolverUseCase V;
    public final GetHomeScreenStartDestinationTabUseCase W;
    public final ApplicationBackgroundWorkersManager X;
    public final GetAllRequestedBookedProductsUseCase Y;
    public final CheckIfPremiumPassEligibleForRideRollOver Z;
    public final DpdpaConsentManager a0;
    public final AdjustManager b0;
    public final Value b1;
    public final ChaloConfigFeature c0;
    public final CrashlyticsLogger d0;
    public final LiveTrackingConfigDataStore e0;
    public final TicketRepository f0;
    public final Value f1;
    public final SystemHelper g0;
    public BottomNavTabType g1;
    public final NativeInlineAdPrefetchEntryPoint h0;
    public boolean h1;
    public final ExitInterstitialPreloadEntryPoint i0;
    public boolean i1;
    public final LanguageFeature j0;
    public Job j1;
    public final ComponentContext k;
    public final PermissionHandlerProvider k0;
    public final Flow k1;
    public final HomeArgs l;
    public final UserProfilingHooksOrchestrator l0;
    public final CityProvider m;
    public final ResolveChaloBusStickyBannerEligibilityUseCase m0;
    public final LocalDataStore n;
    public final PremiumBusUserSurveyPreferenceRepository n0;
    public final ChaloChainedBottomSheetFeature o;
    public final FetchCommutePreferenceSummaryUseCase o0;
    public final HomeScreenInfoHelper p;
    public final ChaloAppFeatureHelper p0;
    public final StringProvider q;
    public final LocalDataStore q0;
    public final IReportProblemFeature r;
    public final GetPostRideFeedbackDataUseCase r0;
    public final IBoostRatingsFeature s;
    public final RideHailingRepository s0;
    public final SuperPassRepository t;
    public final SubmitRideHailingBookingFeedbackUseCase t0;
    public final GetDeviceNFCStateUseCase u;
    public final RetryPendingRideFeedbackUseCase u0;
    public final UserProfileDetailsProvider v;
    public final SyncPremiumBusPendingPrfEntriesUseCase v0;
    public final BasicInfoContract w;
    public final ObservePendingRideFeedbackPromptsUseCase w0;
    public final GetPremiumBusCurrentCityConfigUseCase x;
    public final DismissRideFeedbackPromptUseCase x0;
    public final UpdatePremiumReserveTicketTripFeedbackStatus y;
    public final TimeUtilsContract y0;
    public final GetPremiumReserveTicketsWithPendingTripFeedbackUseCase z;
    public boolean z0;

    /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$10, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$10", f = "HomeComponent.kt", l = {615}, m = "invokeSuspend", v = 1)
    final class AnonymousClass10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$10$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "newState", "Lapp/chalo/home/ui/base/CommonBottomSheetType;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$10$1", f = "HomeComponent.kt", l = {628}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements Function2<CommonBottomSheetType, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ HomeComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HomeComponent homeComponent, Continuation continuation) {
                super(2, continuation);
                this.this$0 = homeComponent;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((CommonBottomSheetType) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    ResultKt.b(obj);
                    CommonBottomSheetType commonBottomSheetType = (CommonBottomSheetType) this.L$0;
                    if (Intrinsics.d(commonBottomSheetType, CommonBottomSheetType.None.b)) {
                        this.this$0.E0(new u60(14));
                    } else {
                        Object value = this.this$0.f.getValue();
                        HomeComponent homeComponent = this.this$0;
                        if (!Intrinsics.d(((HomeScreenFragmentViewState) value).f.b, commonBottomSheetType)) {
                            this.label = 1;
                            if (HomeComponent.H0(homeComponent, commonBottomSheetType, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                return Unit.f17538a;
            }
        }

        public AnonymousClass10(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomeComponent.this.new AnonymousClass10(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass10) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                StateFlow stateFlowB = HomeComponent.this.o.b();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HomeComponent.this, null);
                this.label = 1;
                if (FlowKt.j(stateFlowB, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$12, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$12", f = "HomeComponent.kt", l = {642}, m = "invokeSuspend", v = 1)
    final class AnonymousClass12 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$12$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "snack", "Lapp/chalo/home/SnackBarState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$12$1", f = "HomeComponent.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements Function2<SnackBarState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ HomeComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HomeComponent homeComponent, Continuation continuation) {
                super(2, continuation);
                this.this$0 = homeComponent;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((SnackBarState) obj, (Continuation) obj2);
                Unit unit = Unit.f17538a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                this.this$0.E0(new e40((SnackBarState) this.L$0, 12));
                return Unit.f17538a;
            }
        }

        public AnonymousClass12(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomeComponent.this.new AnonymousClass12(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass12) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                HomeComponent homeComponent = HomeComponent.this;
                StateFlow stateFlowF = homeComponent.p.f();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HomeComponent.this, null);
                this.label = 1;
                if (homeComponent.o0(stateFlowF, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$13, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$13", f = "HomeComponent.kt", l = {652}, m = "invokeSuspend", v = 1)
    final class AnonymousClass13 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass13(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomeComponent.this.new AnonymousClass13(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass13) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                StateFlow stateFlowI = HomeComponent.this.m.getD();
                final HomeComponent homeComponent = HomeComponent.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.home.ui.base.HomeComponent.13.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        Object objA;
                        return (((Boolean) obj2).booleanValue() && (objA = homeComponent.X.a(continuation)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objA : Unit.f17538a;
                    }
                };
                this.label = 1;
                if (stateFlowI.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$14, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$14", f = "HomeComponent.kt", l = {660}, m = "invokeSuspend", v = 1)
    final class AnonymousClass14 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass14(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomeComponent.this.new AnonymousClass14(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass14) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                HomeComponent homeComponent = HomeComponent.this;
                this.label = 1;
                if (HomeComponent.U0(homeComponent, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$15, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$15", f = "HomeComponent.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass15 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass15(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomeComponent.this.new AnonymousClass15(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass15 anonymousClass15 = (AnonymousClass15) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f17538a;
            anonymousClass15.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            HomeComponent.this.k1();
            return Unit.f17538a;
        }
    }

    /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$3", f = "HomeComponent.kt", l = {ServiceStarter.ERROR_UNKNOWN}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$3$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "entities", "", "Lapp/chalo/ridefeedback/data/dao/PostRideFeedbackEntity;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$3$2", f = "HomeComponent.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends PostRideFeedbackEntity>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ HomeComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HomeComponent homeComponent, Continuation continuation) {
                super(2, continuation);
                this.this$0 = homeComponent;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((List) obj, (Continuation) obj2);
                Unit unit = Unit.f17538a;
                anonymousClass2.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                PendingRideFeedbackStickyBannerUIState pendingRideFeedbackStickyBannerUIState;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                List list = (List) this.L$0;
                HomeComponent homeComponent = this.this$0;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                    PostRideFeedbackEntity postRideFeedbackEntity = (PostRideFeedbackEntity) it.next();
                    String tripStartTimeText = homeComponent.y0.e(postRideFeedbackEntity.h);
                    Intrinsics.i(tripStartTimeText, "tripStartTimeText");
                    arrayList.add(new PendingRideFeedbackAppModel(postRideFeedbackEntity.f9071a, postRideFeedbackEntity.b, postRideFeedbackEntity.c, postRideFeedbackEntity.d, postRideFeedbackEntity.e, postRideFeedbackEntity.f, postRideFeedbackEntity.g, postRideFeedbackEntity.i, tripStartTimeText, postRideFeedbackEntity.j, postRideFeedbackEntity.k, postRideFeedbackEntity.l));
                }
                HomeComponent homeComponent2 = this.this$0;
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    HomeComponent homeComponent3 = this.this$0;
                    homeComponent3.getClass();
                    pendingRideFeedbackStickyBannerUIState = new PendingRideFeedbackStickyBannerUIState(arrayList, new n4(homeComponent3, 21), new a(homeComponent3));
                } else {
                    pendingRideFeedbackStickyBannerUIState = null;
                }
                homeComponent2.L0 = pendingRideFeedbackStickyBannerUIState;
                HomeComponent homeComponent4 = this.this$0;
                NavigationTabAppModel navigationTabAppModel = ((HomeScreenFragmentViewState) homeComponent4.f.getValue()).f3225a;
                homeComponent4.r1(navigationTabAppModel != null ? BottomNavTabAppModelKt.a(navigationTabAppModel) : null);
                return Unit.f17538a;
            }
        }

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomeComponent.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                HomeComponent homeComponent = HomeComponent.this;
                ChannelFlowTransformLatest channelFlowTransformLatestH = FlowKt.H(homeComponent.k1, new HomeComponent$3$invokeSuspend$$inlined$flatMapLatest$1(homeComponent, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(HomeComponent.this, null);
                this.label = 1;
                if (FlowKt.j(channelFlowTransformLatestH, anonymousClass2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$4", f = "HomeComponent.kt", l = {515}, m = "invokeSuspend", v = 1)
    final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$4$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$4$1", f = "HomeComponent.kt", l = {524, 530}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements Function2<Pair<? extends String, ? extends String>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ HomeComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HomeComponent homeComponent, Continuation continuation) {
                super(2, continuation);
                this.this$0 = homeComponent;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String str;
                String str2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                Unit unit = Unit.f17538a;
                if (i == 0) {
                    ResultKt.b(obj);
                    Pair pair = (Pair) this.L$0;
                    String str3 = (String) pair.getFirst();
                    String str4 = (String) pair.getSecond();
                    HomeComponent homeComponent = this.this$0;
                    String str5 = homeComponent.F0;
                    boolean z = homeComponent.E0;
                    homeComponent.E0 = true;
                    homeComponent.F0 = str3;
                    if (str3 != null) {
                        if (z && !str3.equals(str5)) {
                            HomeComponent homeComponent2 = this.this$0;
                            Job job = homeComponent2.D0;
                            if (job != null) {
                                ((JobSupport) job).cancel(null);
                            }
                            homeComponent2.D0 = null;
                            BuildersKt.d(homeComponent2.j, null, null, new HomeComponent$restartPremiumBusPrfBackfillCollector$1(homeComponent2, null), 3);
                        }
                        RetryPendingRideFeedbackUseCase retryPendingRideFeedbackUseCase = this.this$0.u0;
                        this.L$0 = str3;
                        this.L$1 = str4;
                        this.label = 1;
                        if (retryPendingRideFeedbackUseCase.a("mobileTicket", "premiumReserveTicket", str3, this) != coroutineSingletons) {
                            str = str3;
                            str2 = str4;
                        }
                        return coroutineSingletons;
                    }
                    return unit;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return unit;
                }
                str2 = (String) this.L$1;
                str = (String) this.L$0;
                ResultKt.b(obj);
                if (str2 != null) {
                    SyncPremiumBusPendingPrfEntriesUseCase syncPremiumBusPendingPrfEntriesUseCase = this.this$0.v0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 2;
                    if (syncPremiumBusPendingPrfEntriesUseCase.b(str, str2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return unit;
            }
        }

        public AnonymousClass4(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomeComponent.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                HomeComponent homeComponent = HomeComponent.this;
                Flow flow = homeComponent.k1;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(homeComponent, null);
                this.label = 1;
                if (FlowKt.j(flow, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$5", f = "HomeComponent.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass5(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomeComponent.this.new AnonymousClass5(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass5 anonymousClass5 = (AnonymousClass5) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f17538a;
            anonymousClass5.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            HomeComponent homeComponent = HomeComponent.this;
            boolean z = homeComponent.z0;
            Unit unit = Unit.f17538a;
            if (z) {
                return unit;
            }
            homeComponent.z0 = true;
            homeComponent.h0.b();
            return unit;
        }
    }

    /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$6", f = "HomeComponent.kt", l = {548}, m = "invokeSuspend", v = 1)
    final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomeComponent.this.new AnonymousClass6(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass6) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            Unit unit = Unit.f17538a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            ResultKt.b(obj);
            HomeComponent homeComponent = HomeComponent.this;
            if (!homeComponent.A0) {
                homeComponent.A0 = true;
                FetchCommutePreferenceSummaryUseCase fetchCommutePreferenceSummaryUseCase = homeComponent.o0;
                this.label = 1;
                if (fetchCommutePreferenceSummaryUseCase.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return unit;
        }
    }

    /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$7", f = "HomeComponent.kt", l = {AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES}, m = "invokeSuspend", v = 1)
    final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$7$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "targetingKey", "Lapp/chalo/ads/ExitInterstitialTargetingKey;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$7$1", f = "HomeComponent.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements Function2<ExitInterstitialTargetingKey, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ HomeComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HomeComponent homeComponent, Continuation continuation) {
                super(2, continuation);
                this.this$0 = homeComponent;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ExitInterstitialTargetingKey) obj, (Continuation) obj2);
                Unit unit = Unit.f17538a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                this.this$0.i0.a((ExitInterstitialTargetingKey) this.L$0);
                return Unit.f17538a;
            }
        }

        public AnonymousClass7(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomeComponent.this.new AnonymousClass7(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass7) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                StateFlow cityFlow = HomeComponent.this.m.getE();
                StateFlow languageFlow = HomeComponent.this.j0.getE();
                Intrinsics.i(cityFlow, "cityFlow");
                Intrinsics.i(languageFlow, "languageFlow");
                final FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(cityFlow, languageFlow, new ExitInterstitialHomeTargetingResolver$flow$1(3, null));
                Flow flowM = FlowKt.m(new Flow<ExitInterstitialTargetingKey>() { // from class: app.chalo.home.ui.base.ExitInterstitialHomeTargetingResolver$flow$$inlined$mapNotNull$1

                    /* JADX INFO: renamed from: app.chalo.home.ui.base.ExitInterstitialHomeTargetingResolver$flow$$inlined$mapNotNull$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ FlowCollector f3181a;

                        /* JADX INFO: renamed from: app.chalo.home.ui.base.ExitInterstitialHomeTargetingResolver$flow$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "app.chalo.home.ui.base.ExitInterstitialHomeTargetingResolver$flow$$inlined$mapNotNull$1$2", f = "ExitInterstitialHomeTargetingResolver.kt", l = {52}, m = "emit", v = 1)
                        public final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.f3181a = flowCollector;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.b(obj2);
                                ExitInterstitialTargetingKey exitInterstitialTargetingKey = (ExitInterstitialTargetingKey) obj;
                                if (exitInterstitialTargetingKey != null) {
                                    anonymousClass1.label = 1;
                                    if (this.f3181a.emit(exitInterstitialTargetingKey, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.b(obj2);
                            }
                            return Unit.f17538a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                    }
                });
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HomeComponent.this, null);
                this.label = 1;
                if (FlowKt.j(flowM, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$8, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$8", f = "HomeComponent.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$8$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "config", "Lapp/chalo/homescreen/data/model/app/HomeScreenConfigAppModel;", "retainedState", "Lapp/chalo/home/ui/HomeTabScreensRetainedState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$8$2", f = "HomeComponent.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass2 extends SuspendLambda implements Function3<HomeScreenConfigAppModel, HomeTabScreensRetainedState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ HomeComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HomeComponent homeComponent, Continuation continuation) {
                super(3, continuation);
                this.this$0 = homeComponent;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, (Continuation) obj3);
                anonymousClass2.L$0 = (HomeScreenConfigAppModel) obj;
                anonymousClass2.L$1 = (HomeTabScreensRetainedState) obj2;
                Unit unit = Unit.f17538a;
                anonymousClass2.invokeSuspend(unit);
                return unit;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                HomeScreenConfigAppModel homeScreenConfigAppModel = (HomeScreenConfigAppModel) this.L$0;
                HomeTabScreensRetainedState homeTabScreensRetainedState = (HomeTabScreensRetainedState) this.L$1;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                HomeComponent homeComponent = this.this$0;
                homeComponent.E0(new n3(homeScreenConfigAppModel, objectRef, homeTabScreensRetainedState, homeComponent, 8));
                HomeComponent homeComponent2 = this.this$0;
                NavigationTabAppModel navigationTabAppModel = (NavigationTabAppModel) objectRef.element;
                homeComponent2.t1(navigationTabAppModel != null ? BottomNavTabAppModelKt.a(navigationTabAppModel) : null);
                HomeComponent homeComponent3 = this.this$0;
                NavigationTabAppModel navigationTabAppModel2 = (NavigationTabAppModel) objectRef.element;
                homeComponent3.s1(navigationTabAppModel2 != null ? BottomNavTabAppModelKt.a(navigationTabAppModel2) : null);
                HomeComponent homeComponent4 = this.this$0;
                NavigationTabAppModel navigationTabAppModel3 = (NavigationTabAppModel) objectRef.element;
                homeComponent4.q1(navigationTabAppModel3 != null ? BottomNavTabAppModelKt.a(navigationTabAppModel3) : null);
                HomeComponent homeComponent5 = this.this$0;
                NavigationTabAppModel navigationTabAppModel4 = (NavigationTabAppModel) objectRef.element;
                homeComponent5.r1(navigationTabAppModel4 != null ? BottomNavTabAppModelKt.a(navigationTabAppModel4) : null);
                return Unit.f17538a;
            }
        }

        public AnonymousClass8(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass8 anonymousClass8 = HomeComponent.this.new AnonymousClass8(continuation);
            anonymousClass8.L$0 = obj;
            return anonymousClass8;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass8 anonymousClass8 = (AnonymousClass8) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f17538a;
            anonymousClass8.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            final StateFlow stateFlow = HomeComponent.this.f;
            FlowKt.A(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(FlowKt.m(new Flow<HomeScreenConfigAppModel>() { // from class: app.chalo.home.ui.base.HomeComponent$8$invokeSuspend$$inlined$mapNotNull$1

                /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$8$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f3184a;

                    /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$8$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$8$invokeSuspend$$inlined$mapNotNull$1$2", f = "HomeComponent.kt", l = {52}, m = "emit", v = 1)
                    public final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.f3184a = flowCollector;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.b(obj2);
                            HomeScreenConfigAppModel homeScreenConfigAppModel = ((HomeScreenFragmentViewState) obj).d;
                            if (homeScreenConfigAppModel != null) {
                                anonymousClass1.label = 1;
                                if (this.f3184a.emit(homeScreenConfigAppModel, anonymousClass1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.b(obj2);
                        }
                        return Unit.f17538a;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            }), HomeComponent.this.P.getState(), new AnonymousClass2(HomeComponent.this, null)), coroutineScope);
            return Unit.f17538a;
        }
    }

    /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$9, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$9", f = "HomeComponent.kt", l = {600}, m = "invokeSuspend", v = 1)
    final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass9(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomeComponent.this.new AnonymousClass9(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass9) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                StateFlow stateFlowB = HomeComponent.this.p.b();
                final HomeComponent homeComponent = HomeComponent.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.home.ui.base.HomeComponent.9.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        final HomeScreenDrawerConfiguration homeScreenDrawerConfiguration = (HomeScreenDrawerConfiguration) obj2;
                        HomeComponent homeComponent2 = homeComponent;
                        if (homeScreenDrawerConfiguration == null) {
                            homeComponent2.R0.f12376a.a(new SlotNavigation.Event(HomeComponent$9$1$emit$$inlined$dismiss$default$1.f3187a, new HomeComponent$9$1$emit$$inlined$dismiss$default$2()));
                        } else {
                            homeComponent2.R0.f12376a.a(new SlotNavigation.Event(new Function1<HomeScreenDrawerConfiguration, HomeScreenDrawerConfiguration>() { // from class: app.chalo.home.ui.base.HomeComponent$9$1$emit$$inlined$activate$default$1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    return homeScreenDrawerConfiguration;
                                }
                            }, new HomeComponent$9$1$emit$$inlined$activate$default$2()));
                        }
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (stateFlowB.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lapp/chalo/home/ui/base/HomeComponent$Companion;", "", "", "LOG_TAG", "Ljava/lang/String;", "KEY_WAS_CARD_RECHARGE_TUTORIAL_SHOWN", "TAB_COMPONENT_KEY_PREFIX", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/home/ui/base/HomeComponent$TabChild;", "", "HomeTab", "RegularBusTab", "ChaloBusTab", "MyTicketsTab", "UnknownTab", "Lapp/chalo/home/ui/base/HomeComponent$TabChild$ChaloBusTab;", "Lapp/chalo/home/ui/base/HomeComponent$TabChild$HomeTab;", "Lapp/chalo/home/ui/base/HomeComponent$TabChild$MyTicketsTab;", "Lapp/chalo/home/ui/base/HomeComponent$TabChild$RegularBusTab;", "Lapp/chalo/home/ui/base/HomeComponent$TabChild$UnknownTab;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class TabChild {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeComponent$TabChild$ChaloBusTab;", "Lapp/chalo/home/ui/base/HomeComponent$TabChild;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ChaloBusTab extends TabChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ChaloBusComponent f3188a;
            public final NavigationTabAppModel.ChaloBusTab b;

            public ChaloBusTab(ChaloBusComponent chaloBusComponent, NavigationTabAppModel.ChaloBusTab chaloBusTab) {
                this.f3188a = chaloBusComponent;
                this.b = chaloBusTab;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChaloBusTab)) {
                    return false;
                }
                ChaloBusTab chaloBusTab = (ChaloBusTab) obj;
                return Intrinsics.d(this.f3188a, chaloBusTab.f3188a) && Intrinsics.d(this.b, chaloBusTab.b);
            }

            public final int hashCode() {
                int iHashCode = this.f3188a.hashCode() * 31;
                NavigationTabAppModel.ChaloBusTab chaloBusTab = this.b;
                return iHashCode + (chaloBusTab == null ? 0 : chaloBusTab.hashCode());
            }

            public final String toString() {
                return "ChaloBusTab(component=" + this.f3188a + ", chaloBusTabModel=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeComponent$TabChild$HomeTab;", "Lapp/chalo/home/ui/base/HomeComponent$TabChild;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class HomeTab extends TabChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final HomeScreenComponent f3189a;
            public final NavigationTabAppModel.HomeTab b;

            public HomeTab(HomeScreenComponent homeScreenComponent, NavigationTabAppModel.HomeTab homeTab) {
                this.f3189a = homeScreenComponent;
                this.b = homeTab;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HomeTab)) {
                    return false;
                }
                HomeTab homeTab = (HomeTab) obj;
                return Intrinsics.d(this.f3189a, homeTab.f3189a) && Intrinsics.d(this.b, homeTab.b);
            }

            public final int hashCode() {
                int iHashCode = this.f3189a.hashCode() * 31;
                NavigationTabAppModel.HomeTab homeTab = this.b;
                return iHashCode + (homeTab == null ? 0 : homeTab.hashCode());
            }

            public final String toString() {
                return "HomeTab(component=" + this.f3189a + ", homeTabModel=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeComponent$TabChild$MyTicketsTab;", "Lapp/chalo/home/ui/base/HomeComponent$TabChild;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MyTicketsTab extends TabChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MyTicketsComponent f3190a;
            public final NavigationTabAppModel.MyTicketsTab b;

            public MyTicketsTab(MyTicketsComponent myTicketsComponent, NavigationTabAppModel.MyTicketsTab myTicketsTab) {
                this.f3190a = myTicketsComponent;
                this.b = myTicketsTab;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MyTicketsTab)) {
                    return false;
                }
                MyTicketsTab myTicketsTab = (MyTicketsTab) obj;
                return Intrinsics.d(this.f3190a, myTicketsTab.f3190a) && Intrinsics.d(this.b, myTicketsTab.b);
            }

            public final int hashCode() {
                int iHashCode = this.f3190a.hashCode() * 31;
                NavigationTabAppModel.MyTicketsTab myTicketsTab = this.b;
                return iHashCode + (myTicketsTab == null ? 0 : myTicketsTab.hashCode());
            }

            public final String toString() {
                return "MyTicketsTab(component=" + this.f3190a + ", myTicketsTabModel=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeComponent$TabChild$RegularBusTab;", "Lapp/chalo/home/ui/base/HomeComponent$TabChild;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RegularBusTab extends TabChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RegularBusComponent f3191a;
            public final NavigationTabAppModel.RegularBusTab b;

            public RegularBusTab(RegularBusComponent regularBusComponent, NavigationTabAppModel.RegularBusTab regularBusTab) {
                this.f3191a = regularBusComponent;
                this.b = regularBusTab;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RegularBusTab)) {
                    return false;
                }
                RegularBusTab regularBusTab = (RegularBusTab) obj;
                return Intrinsics.d(this.f3191a, regularBusTab.f3191a) && Intrinsics.d(this.b, regularBusTab.b);
            }

            public final int hashCode() {
                int iHashCode = this.f3191a.hashCode() * 31;
                NavigationTabAppModel.RegularBusTab regularBusTab = this.b;
                return iHashCode + (regularBusTab == null ? 0 : regularBusTab.hashCode());
            }

            public final String toString() {
                return "RegularBusTab(component=" + this.f3191a + ", regularTagModel=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeComponent$TabChild$UnknownTab;", "Lapp/chalo/home/ui/base/HomeComponent$TabChild;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UnknownTab extends TabChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final UnknownTab f3192a = new UnknownTab();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof UnknownTab);
            }

            public final int hashCode() {
                return 69788748;
            }

            public final String toString() {
                return "UnknownTab";
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/base/HomeComponent$TabComponentEntry;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabComponentEntry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BottomNavTabType f3193a;
        public final NavigationTabAppModel b;
        public final ComponentContext c;
        public final TabChild d;

        public TabComponentEntry(BottomNavTabType tabType, NavigationTabAppModel navigationTabAppModel, ComponentContext componentContext, TabChild tabChild) {
            Intrinsics.i(tabType, "tabType");
            Intrinsics.i(componentContext, "componentContext");
            this.f3193a = tabType;
            this.b = navigationTabAppModel;
            this.c = componentContext;
            this.d = tabChild;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TabComponentEntry)) {
                return false;
            }
            TabComponentEntry tabComponentEntry = (TabComponentEntry) obj;
            return this.f3193a == tabComponentEntry.f3193a && Intrinsics.d(this.b, tabComponentEntry.b) && Intrinsics.d(this.c, tabComponentEntry.c) && Intrinsics.d(this.d, tabComponentEntry.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f3193a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "TabComponentEntry(tabType=" + this.f3193a + ", navigationModel=" + this.b + ", componentContext=" + this.c + ", tabChild=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3194a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[UserProfilingHookSlot.values().length];
            try {
                iArr[UserProfilingHookSlot.CHALO_BUS_STICKY_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f3194a = iArr;
            int[] iArr2 = new int[SuperPassApplicationStatus.values().length];
            try {
                iArr2[SuperPassApplicationStatus.VERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[SuperPassApplicationStatus.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SuperPassApplicationStatus.UNVERIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SuperPassApplicationStatus.PAYMENT_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
            int[] iArr3 = new int[BottomNavTabType.values().length];
            try {
                iArr3[BottomNavTabType.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[BottomNavTabType.REGULAR_BUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[BottomNavTabType.CHALO_BUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[BottomNavTabType.MY_TICKETS.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[BottomNavTabType.SEARCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[BottomNavTabType.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            c = iArr3;
        }
    }

    public HomeComponent(ComponentContext componentContext, HomeArgs homeArgs, CityProvider cityProvider, LocalDataStore localDataStore, ChaloChainedBottomSheetFeature chaloChainedBottomSheetFeature, HomeScreenInfoHelper homeScreenInfoHelper, StringProvider stringProvider, IReportProblemFeature iReportProblemFeature, IBoostRatingsFeature iBoostRatingsFeature, SuperPassRepository superPassRepository, GetDeviceNFCStateUseCase getDeviceNFCStateUseCase, UserProfileDetailsProvider userProfileDetailsProvider, BasicInfoContract basicInfoContract, GetPremiumBusCurrentCityConfigUseCase getPremiumBusCurrentCityConfigUseCase, UpdatePremiumReserveTicketTripFeedbackStatus updatePremiumReserveTicketTripFeedbackStatus, GetPremiumReserveTicketsWithPendingTripFeedbackUseCase getPremiumReserveTicketsWithPendingTripFeedbackUseCase, BackfillPendingPremiumBusPrfUseCase backfillPendingPremiumBusPrfUseCase, GetTimeInMillisAfterXTimeUseCase getTimeInMillisAfterXTimeUseCase, HomeScreenAnalyticsHelper homeScreenAnalyticsHelper, FetchGeoSpatialDataUseCase fetchGeoSpatialDataUseCase, ChaloLocationManager chaloLocationManager, GetGeoQueryCityWiseConfigUseCase getGeoQueryCityWiseConfigUseCase, GetHomeScreenConfigUseCase getHomeScreenConfigUseCase, CoroutineContextProvider coroutineContextProvider, CityMetaDataManager cityMetaDataManager, IsNotificationPermissionGrantedUseCase isNotificationPermissionGrantedUseCase, GetMiscellaneousCityWiseFlagsConfigUseCase getMiscellaneousCityWiseFlagsConfigUseCase, ProductUtils productUtils, AppRatingProcessSkeleton appRatingProcessSkeleton, ChaloNavigationManager chaloNavigationManager, NetworkStateManager networkStateManager, CheckIfAppUpdateRequiredUseCase checkIfAppUpdateRequiredUseCase, HomeTabScreensNavigationAndStateManager homeTabScreensNavigationAndStateManager, FetchHomeTabSearchRemovalConfigUseCase fetchHomeTabSearchRemovalConfigUseCase, GetTripPlannerConfigForCityUseCase getTripPlannerConfigForCityUseCase, GetNextStepOnPassApplicationVerifiedUseCase getNextStepOnPassApplicationVerifiedUseCase, GetNextStepOnPassApplicationRejectedUseCase getNextStepOnPassApplicationRejectedUseCase, KotlinToastManager kotlinToastManager, PassPurchaseSceneResolverUseCase passPurchaseSceneResolverUseCase, GetHomeScreenStartDestinationTabUseCase getHomeScreenStartDestinationTabUseCase, ApplicationBackgroundWorkersManager applicationBackgroundWorkersManager, GetAllRequestedBookedProductsUseCase getAllRequestedBookedProductsUseCase, CheckIfPremiumPassEligibleForRideRollOver checkIfPremiumPassEligibleForRideRollOver, DpdpaConsentManager dpdpaConsentManager, AdjustManager adjustManager, ChaloConfigFeature chaloConfigFeature, CrashlyticsLogger crashlyticsLogger, LiveTrackingConfigDataStore liveTrackingConfigDataStore, TicketRepository ticketRepository, SystemHelper systemHelper, NativeInlineAdPrefetchEntryPoint nativeInlineAdPrefetchEntryPoint, ExitInterstitialPreloadEntryPoint exitInterstitialPreloadEntryPoint, LanguageFeature languageFeature, PermissionHandlerProvider permissionHandlerProvider, SdkIntegrationPolicyManager sdkIntegrationPolicyManager, UserProfilingHooksOrchestrator userProfilingHooksOrchestrator, ResolveChaloBusStickyBannerEligibilityUseCase resolveChaloBusStickyBannerEligibilityUseCase, PremiumBusUserSurveyPreferenceRepository premiumBusUserSurveyPreferenceRepository, FetchCommutePreferenceSummaryUseCase fetchCommutePreferenceSummaryUseCase, ChaloAppFeatureHelper chaloAppFeatureHelper, LocalDataStore localDataStore2, GetPostRideFeedbackDataUseCase getPostRideFeedbackDataUseCase, RideHailingRepository rideHailingRepository, SubmitRideHailingBookingFeedbackUseCase submitRideHailingBookingFeedbackUseCase, RetryPendingRideFeedbackUseCase retryPendingRideFeedbackUseCase, SyncPremiumBusPendingPrfEntriesUseCase syncPremiumBusPendingPrfEntriesUseCase, ObservePendingRideFeedbackPromptsUseCase observePendingRideFeedbackPromptsUseCase, DismissRideFeedbackPromptUseCase dismissRideFeedbackPromptUseCase, TimeUtilsContract timeUtilsContract) {
        super(componentContext);
        this.k = componentContext;
        this.l = homeArgs;
        this.m = cityProvider;
        this.n = localDataStore;
        this.o = chaloChainedBottomSheetFeature;
        this.p = homeScreenInfoHelper;
        this.q = stringProvider;
        this.r = iReportProblemFeature;
        this.s = iBoostRatingsFeature;
        this.t = superPassRepository;
        this.u = getDeviceNFCStateUseCase;
        this.v = userProfileDetailsProvider;
        this.w = basicInfoContract;
        this.x = getPremiumBusCurrentCityConfigUseCase;
        this.y = updatePremiumReserveTicketTripFeedbackStatus;
        this.z = getPremiumReserveTicketsWithPendingTripFeedbackUseCase;
        this.A = backfillPendingPremiumBusPrfUseCase;
        this.B = getTimeInMillisAfterXTimeUseCase;
        this.C = homeScreenAnalyticsHelper;
        this.D = fetchGeoSpatialDataUseCase;
        this.E = chaloLocationManager;
        this.F = getGeoQueryCityWiseConfigUseCase;
        this.G = getHomeScreenConfigUseCase;
        this.H = coroutineContextProvider;
        this.I = cityMetaDataManager;
        this.J = isNotificationPermissionGrantedUseCase;
        this.K = getMiscellaneousCityWiseFlagsConfigUseCase;
        this.L = appRatingProcessSkeleton;
        this.M = chaloNavigationManager;
        this.N = networkStateManager;
        this.O = checkIfAppUpdateRequiredUseCase;
        this.P = homeTabScreensNavigationAndStateManager;
        this.Q = fetchHomeTabSearchRemovalConfigUseCase;
        this.R = getTripPlannerConfigForCityUseCase;
        this.S = getNextStepOnPassApplicationVerifiedUseCase;
        this.T = getNextStepOnPassApplicationRejectedUseCase;
        this.U = kotlinToastManager;
        this.V = passPurchaseSceneResolverUseCase;
        this.W = getHomeScreenStartDestinationTabUseCase;
        this.X = applicationBackgroundWorkersManager;
        this.Y = getAllRequestedBookedProductsUseCase;
        this.Z = checkIfPremiumPassEligibleForRideRollOver;
        this.a0 = dpdpaConsentManager;
        this.b0 = adjustManager;
        this.c0 = chaloConfigFeature;
        this.d0 = crashlyticsLogger;
        this.e0 = liveTrackingConfigDataStore;
        this.f0 = ticketRepository;
        this.g0 = systemHelper;
        this.h0 = nativeInlineAdPrefetchEntryPoint;
        this.i0 = exitInterstitialPreloadEntryPoint;
        this.j0 = languageFeature;
        this.k0 = permissionHandlerProvider;
        this.l0 = userProfilingHooksOrchestrator;
        this.m0 = resolveChaloBusStickyBannerEligibilityUseCase;
        this.n0 = premiumBusUserSurveyPreferenceRepository;
        this.o0 = fetchCommutePreferenceSummaryUseCase;
        this.p0 = chaloAppFeatureHelper;
        this.q0 = localDataStore2;
        this.r0 = getPostRideFeedbackDataUseCase;
        this.s0 = rideHailingRepository;
        this.t0 = submitRideHailingBookingFeedbackUseCase;
        this.u0 = retryPendingRideFeedbackUseCase;
        this.v0 = syncPremiumBusPendingPrfEntriesUseCase;
        this.w0 = observePendingRideFeedbackPromptsUseCase;
        this.x0 = dismissRideFeedbackPromptUseCase;
        this.y0 = timeUtilsContract;
        this.M0 = new HomeTabVisibilityController();
        MutableValue mutableValueA = MutableValueBuilderKt.a(EmptyList.f17557a);
        this.N0 = mutableValueA;
        this.O0 = mutableValueA;
        this.P0 = new LinkedHashMap();
        DefaultStackNavigation defaultStackNavigation = new DefaultStackNavigation();
        this.Q0 = defaultStackNavigation;
        DefaultSlotNavigation defaultSlotNavigation = new DefaultSlotNavigation();
        this.R0 = defaultSlotNavigation;
        this.b1 = ChildStackFactoryKt.b(this, defaultStackNavigation, HomeScreenBottomTabConfiguration.INSTANCE.serializer(), HomeScreenBottomTabConfiguration.UnknownTab.INSTANCE, false, new HomeComponent$tabStack$1(2, this, HomeComponent.class, "createTabChild", "createTabChild(Lapp/chalo/home/ui/base/HomeScreenBottomTabConfiguration;Lcom/arkivanov/decompose/ComponentContext;)Lapp/chalo/home/ui/base/HomeComponent$TabChild;", 0));
        KSerializer<HomeScreenDrawerConfiguration> kSerializerSerializer = HomeScreenDrawerConfiguration.INSTANCE.serializer();
        final a70 a70Var = new a70(4);
        HomeComponent$drawerState$2 homeComponent$drawerState$2 = new HomeComponent$drawerState$2(2, this, HomeComponent.class, "createDrawerChild", "createDrawerChild(Lapp/chalo/home/ui/base/HomeScreenDrawerConfiguration;Lcom/arkivanov/decompose/ComponentContext;)Lapp/chalo/home/ui/base/HomeScreenDrawerChild;", 0);
        final lo loVar = new lo(kSerializerSerializer, 0);
        final lo loVar2 = new lo(kSerializerSerializer, 1);
        Function0 function0 = new Function0() { // from class: com.arkivanov.decompose.router.slot.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new SlotNavState(a70Var.invoke());
            }
        };
        final int i = 0;
        Function1 function1 = new Function1() { // from class: com.arkivanov.decompose.router.slot.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        lo loVar3 = (lo) loVar;
                        SlotNavState it = (SlotNavState) obj;
                        Intrinsics.i(it, "it");
                        return (SerializableContainer) loVar3.invoke(it.f12377a);
                    default:
                        lo loVar4 = (lo) loVar;
                        SerializableContainer it2 = (SerializableContainer) obj;
                        Intrinsics.i(it2, "it");
                        return new SlotNavState(loVar4.invoke(it2));
                }
            }
        };
        final int i2 = 1;
        Function1 function2 = new Function1() { // from class: com.arkivanov.decompose.router.slot.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        lo loVar3 = (lo) loVar2;
                        SlotNavState it = (SlotNavState) obj;
                        Intrinsics.i(it, "it");
                        return (SerializableContainer) loVar3.invoke(it.f12377a);
                    default:
                        lo loVar4 = (lo) loVar2;
                        SerializableContainer it2 = (SerializableContainer) obj;
                        Intrinsics.i(it2, "it");
                        return new SlotNavState(loVar4.invoke(it2));
                }
            }
        };
        final int i3 = 0;
        final int i4 = 1;
        this.f1 = ChildrenFactoryKt.a(this, defaultSlotNavigation, "DefaultChildSlot", function0, function1, function2, new Function2() { // from class: com.arkivanov.decompose.router.slot.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                SlotNavState state = (SlotNavState) obj;
                switch (i3) {
                    case 0:
                        SlotNavigation.Event event = (SlotNavigation.Event) obj2;
                        Intrinsics.i(state, "state");
                        Intrinsics.i(event, "event");
                        return new SlotNavState(event.f12378a.invoke(state.f12377a));
                    default:
                        List children = (List) obj2;
                        Intrinsics.i(state, "<unused var>");
                        Intrinsics.i(children, "children");
                        Object objH = CollectionsKt.H(children);
                        return new ChildSlot(objH instanceof Child.Created ? (Child.Created) objH : null);
                }
            }
        }, new Function2() { // from class: com.arkivanov.decompose.router.slot.c
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                SlotNavState state = (SlotNavState) obj;
                switch (i4) {
                    case 0:
                        SlotNavigation.Event event = (SlotNavigation.Event) obj2;
                        Intrinsics.i(state, "state");
                        Intrinsics.i(event, "event");
                        return new SlotNavState(event.f12378a.invoke(state.f12377a));
                    default:
                        List children = (List) obj2;
                        Intrinsics.i(state, "<unused var>");
                        Intrinsics.i(children, "children");
                        Object objH = CollectionsKt.H(children);
                        return new ChildSlot(objH instanceof Child.Created ? (Child.Created) objH : null);
                }
            }
        }, new d(), new e(), homeComponent$drawerState$2);
        this.h1 = componentContext.getF12286a().getB().compareTo(Lifecycle.State.STARTED) >= 0;
        final UserProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1 userProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1E = userProfileDetailsProvider.e();
        Flow<String> flow = new Flow<String>() { // from class: app.chalo.home.ui.base.HomeComponent$special$$inlined$map$1

            /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f3201a;

                /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$special$$inlined$map$1$2", f = "HomeComponent.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f3201a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        UserProfileAppModel userProfileAppModel = (UserProfileAppModel) obj;
                        String str = userProfileAppModel != null ? userProfileAppModel.i : null;
                        anonymousClass1.label = 1;
                        if (this.f3201a.emit(str, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = userProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1E.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        };
        final StateFlow stateFlowB = cityProvider.getE();
        this.k1 = FlowKt.m(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(flow, new Flow<String>() { // from class: app.chalo.home.ui.base.HomeComponent$special$$inlined$map$2

            /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$special$$inlined$map$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f3203a;

                /* JADX INFO: renamed from: app.chalo.home.ui.base.HomeComponent$special$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$special$$inlined$map$2$2", f = "HomeComponent.kt", l = {50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f3203a = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        CityAppModel cityAppModel = (CityAppModel) obj;
                        String str = cityAppModel != null ? cityAppModel.f8854a : null;
                        anonymousClass1.label = 1;
                        if (this.f3203a.emit(str, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = stateFlowB.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, new HomeComponent$userAndCityFlow$3(3, null)));
        LifecycleExtKt.a(componentContext.getF12286a(), new v70(this, 2), null, null, new v70(this, 3), null, 45);
        homeScreenInfoHelper.m();
        homeScreenInfoHelper.l(homeArgs.c);
        homeTabScreensNavigationAndStateManager.e();
        D0(new AnonymousClass3(null));
        D0(new AnonymousClass4(null));
        D0(new AnonymousClass5(null));
        D0(new AnonymousClass6(null));
        D0(new AnonymousClass7(null));
        D0(new AnonymousClass8(null));
        D0(new AnonymousClass9(null));
        BuildersKt.d(this.j, null, null, new HomeComponent$handleNetworkStateChanges$1(this, null), 3);
        BuildersKt.d(this.j, null, null, new HomeComponent$handleAppUpdateFeature$1(this, null), 3);
        l1(HomeScreenFragmentViewIntent.ViewCreatedIntent.f3224a);
        BuildersKt.d(this.j, null, null, new AnonymousClass10(null), 3);
        String strH = cityProvider.h();
        if (strH != null) {
            a1(strH);
            BuildersKt.d(this.j, coroutineContextProvider.b(), null, new HomeComponent$refreshMetaDataPropsForCity$1(this, strH, null), 2);
        }
        BuildersKt.d(this.j, null, null, new AnonymousClass12(null), 3);
        BuildersKt.d(this.j, null, null, new AnonymousClass13(null), 3);
        BuildersKt.d(this.j, null, null, new AnonymousClass14(null), 3);
        adjustManager.b(basicInfoContract.f() ? "uhu3oy" : "e68762");
        D0(new AnonymousClass15(null));
    }

    public static final void F0(HomeComponent homeComponent, boolean z) {
        if (!z) {
            homeComponent.getClass();
            return;
        }
        Job job = homeComponent.D0;
        if (job == null || !((AbstractCoroutine) job).isActive()) {
            homeComponent.D0 = CoroutineRestartUtilsKt.a(homeComponent.j, new HomeComponent$backfillPendingPremiumBusPrfEntriesOnTabLaunch$1(homeComponent, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0132  */
    /* JADX WARN: Code duplicated, block: B:34:0x0145  */
    /* JADX WARN: Code duplicated, block: B:39:0x015b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0173  */
    /* JADX WARN: Code duplicated, block: B:49:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0203, code lost:
    
        if (r34.j1(r4, r2) == r3) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G0(app.chalo.home.ui.base.HomeComponent r34, app.chalo.homescreen.data.model.app.HomeScreenConfigAppModel r35, kotlin.coroutines.jvm.internal.ContinuationImpl r36) {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.base.HomeComponent.G0(app.chalo.home.ui.base.HomeComponent, app.chalo.homescreen.data.model.app.HomeScreenConfigAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:107:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:119:0x051a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0537  */
    /* JADX WARN: Code duplicated, block: B:127:0x0557  */
    /* JADX WARN: Code duplicated, block: B:144:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:148:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:159:0x061d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0668  */
    /* JADX WARN: Code duplicated, block: B:174:0x0685  */
    /* JADX WARN: Code duplicated, block: B:178:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:187:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:188:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:192:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:196:0x070e  */
    /* JADX WARN: Code duplicated, block: B:200:0x072b  */
    /* JADX WARN: Code duplicated, block: B:204:0x074a  */
    /* JADX WARN: Code duplicated, block: B:214:0x0798  */
    /* JADX WARN: Code duplicated, block: B:215:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x0316  */
    /* JADX WARN: Code duplicated, block: B:58:0x0331  */
    /* JADX WARN: Code duplicated, block: B:62:0x0353  */
    /* JADX WARN: Code duplicated, block: B:72:0x0391  */
    /* JADX WARN: Code duplicated, block: B:76:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x03da  */
    /* JADX WARN: Code duplicated, block: B:84:0x0408  */
    /* JADX WARN: Code duplicated, block: B:88:0x042e  */
    /* JADX WARN: Code duplicated, block: B:99:0x048a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object H0(HomeComponent homeComponent, CommonBottomSheetType commonBottomSheetType, ContinuationImpl continuationImpl) {
        HomeComponent$createBottomSheetDataAndUpdateState$1 homeComponent$createBottomSheetDataAndUpdateState$1;
        CommonBottomSheetType commonBottomSheetType2;
        IconType iconType;
        IconType iconType2;
        IconType iconType3;
        String str;
        Object objB;
        IconType iconType4;
        IconType iconType5;
        IconType iconType6;
        String str2;
        Object objB2;
        CommonBottomSheetType commonBottomSheetType3;
        String str3;
        String str4;
        Object objB3;
        String str5;
        String str6;
        IconType iconType7;
        String str7;
        Object objB4;
        String str8;
        String str9;
        String str10;
        IconType iconType8;
        String str11;
        Object objB5;
        CommonBottomSheetType commonBottomSheetType4;
        String str12;
        String str13;
        BottomSheetTutorialItem[] bottomSheetTutorialItemArr;
        Object objB6;
        String str14;
        BottomSheetTutorialItem[] bottomSheetTutorialItemArr2;
        BottomSheetTutorialItem[] bottomSheetTutorialItemArr3;
        CommonBottomSheetType commonBottomSheetType5;
        String str15;
        int i;
        String str16;
        Object objB7;
        String str17;
        CommonBottomSheetType commonBottomSheetType6;
        CommonBottomSheetType commonBottomSheetType7;
        String str18;
        String str19;
        BottomSheetTutorialItem[] bottomSheetTutorialItemArr4;
        int i2;
        String str20;
        String str21;
        int i3;
        BottomSheetTutorialItem[] bottomSheetTutorialItemArr5;
        String str22;
        Object objB8;
        CommonBottomSheetType commonBottomSheetType8;
        String str23;
        String str24;
        Object objB9;
        IconType iconType9;
        String str25;
        String str26;
        String str27;
        Object objB10;
        String str28;
        String str29;
        String str30;
        IconType iconType10;
        CommonBottomSheetData.GenericBottomSheetData genericBottomSheetData;
        String str31;
        Object objB11;
        CommonBottomSheetType commonBottomSheetType9;
        String str32;
        String str33;
        Object objB12;
        IconType iconType11;
        String str34;
        String str35;
        String str36;
        Object objB13;
        String str37;
        String str38;
        IconType iconType12;
        String str39;
        String str40;
        Object objB14;
        CommonBottomSheetType commonBottomSheetType10;
        String str41;
        IconType iconType13;
        String str42;
        Object objB15;
        String str43;
        String str44;
        String str45;
        Object objB16;
        String str46;
        IconType iconType14;
        String str47;
        Object objB17;
        CommonBottomSheetType commonBottomSheetType11;
        String str48;
        String str49;
        Object objB18;
        IconType iconType15;
        String str50;
        String str51;
        String str52;
        Object objB19;
        String str53;
        String str54;
        IconType iconType16;
        String str55;
        UserProfileAppModel userProfileAppModel;
        Gender gender;
        Object objB20;
        CommonBottomSheetType commonBottomSheetType12;
        Gender gender2;
        String str56;
        Object objB21;
        CommonBottomSheetType commonBottomSheetType13;
        Gender gender3;
        String str57;
        String str58;
        Object objB22;
        Gender gender4;
        String str59;
        String str60;
        String str61;
        Object objB23;
        String str62;
        String str63;
        String str64;
        Gender gender5;
        CommonBottomSheetType commonBottomSheetType14 = commonBottomSheetType;
        StringProvider stringProvider = homeComponent.q;
        if (continuationImpl instanceof HomeComponent$createBottomSheetDataAndUpdateState$1) {
            homeComponent$createBottomSheetDataAndUpdateState$1 = (HomeComponent$createBottomSheetDataAndUpdateState$1) continuationImpl;
            int i4 = homeComponent$createBottomSheetDataAndUpdateState$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                homeComponent$createBottomSheetDataAndUpdateState$1.label = i4 - Integer.MIN_VALUE;
            } else {
                homeComponent$createBottomSheetDataAndUpdateState$1 = new HomeComponent$createBottomSheetDataAndUpdateState$1(homeComponent, continuationImpl);
            }
        } else {
            homeComponent$createBottomSheetDataAndUpdateState$1 = new HomeComponent$createBottomSheetDataAndUpdateState$1(homeComponent, continuationImpl);
        }
        Object objL = homeComponent$createBottomSheetDataAndUpdateState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object genericBottomSheetData2 = null;
        switch (homeComponent$createBottomSheetDataAndUpdateState$1.label) {
            case 0:
                ResultKt.b(objL);
                if (commonBottomSheetType14 instanceof CommonBottomSheetType.ChaloAppRatingsBottomSheet) {
                    IconType iconType17 = IconType.RATE;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType17;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 1;
                    Object objB24 = stringProvider.b(StringEnum.TXT_BOOST_RATING_TITLE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objB24 != coroutineSingletons) {
                        iconType6 = iconType17;
                        objL = objB24;
                        str2 = (String) objL;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType6;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str2;
                        homeComponent$createBottomSheetDataAndUpdateState$1.label = 2;
                        objB2 = stringProvider.b(StringEnum.BOOST_RATINGS_MSG, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                        if (objB2 != coroutineSingletons) {
                            commonBottomSheetType3 = commonBottomSheetType14;
                            str3 = str2;
                            objL = objB2;
                            str4 = (String) objL;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType3;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType6;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str3;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str4;
                            homeComponent$createBottomSheetDataAndUpdateState$1.label = 3;
                            objB3 = stringProvider.b(StringEnum.RATE_NOW, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                            if (objB3 != coroutineSingletons) {
                                IconType iconType18 = iconType6;
                                str5 = str3;
                                str6 = str4;
                                objL = objB3;
                                iconType7 = iconType18;
                                str7 = (String) objL;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType3;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType7;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str5;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str6;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = str7;
                                homeComponent$createBottomSheetDataAndUpdateState$1.label = 4;
                                objB4 = stringProvider.b(StringEnum.REMIND_ME_LATER, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                                if (objB4 != coroutineSingletons) {
                                    str8 = str6;
                                    str9 = str7;
                                    objL = objB4;
                                    str10 = str5;
                                    iconType8 = iconType7;
                                    commonBottomSheetType2 = commonBottomSheetType3;
                                    genericBottomSheetData2 = new CommonBottomSheetData.GenericBottomSheetData(iconType8, str10, str8, str9, (String) objL, null, 32);
                                    if (genericBottomSheetData2 == null) {
                                        homeComponent.E0(new u60(12));
                                    } else {
                                        homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                                    }
                                    return Unit.f17538a;
                                }
                            }
                        }
                    }
                } else if (commonBottomSheetType14 instanceof CommonBottomSheetType.ChaloOnlineCardRechargeTutorialBottomSheet) {
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 5;
                    objL = stringProvider.b(StringEnum.CARD_RECHARGE_TUTORIAL_BOTTOMSHEET_TITLE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objL != coroutineSingletons) {
                        str11 = (String) objL;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = str11;
                        homeComponent$createBottomSheetDataAndUpdateState$1.label = 6;
                        objB5 = stringProvider.b(StringEnum.OKAY, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                        if (objB5 != coroutineSingletons) {
                            commonBottomSheetType4 = commonBottomSheetType14;
                            str12 = str11;
                            objL = objB5;
                            str13 = (String) objL;
                            bottomSheetTutorialItemArr = new BottomSheetTutorialItem[2];
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType4;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = bottomSheetTutorialItemArr;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str12;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str13;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = bottomSheetTutorialItemArr;
                            homeComponent$createBottomSheetDataAndUpdateState$1.I$0 = 0;
                            homeComponent$createBottomSheetDataAndUpdateState$1.label = 7;
                            objB6 = stringProvider.b(StringEnum.CARD_RECHARGE_TUTORIAL_BOTTOMSHEET_STEP_1_TITLE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                            if (objB6 != coroutineSingletons) {
                                str14 = str13;
                                bottomSheetTutorialItemArr2 = bottomSheetTutorialItemArr;
                                bottomSheetTutorialItemArr3 = bottomSheetTutorialItemArr2;
                                objL = objB6;
                                commonBottomSheetType5 = commonBottomSheetType4;
                                str15 = str12;
                                i = 0;
                                str16 = (String) objL;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType5;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = bottomSheetTutorialItemArr3;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str15;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str14;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = bottomSheetTutorialItemArr2;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$5 = str16;
                                homeComponent$createBottomSheetDataAndUpdateState$1.I$0 = i;
                                homeComponent$createBottomSheetDataAndUpdateState$1.label = 8;
                                objB7 = stringProvider.b(StringEnum.CARD_RECHARGE_TUTORIAL_BOTTOMSHEET_STEP_1_COPY, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                                if (objB7 != coroutineSingletons) {
                                    CommonBottomSheetType commonBottomSheetType15 = commonBottomSheetType5;
                                    str17 = str16;
                                    objL = objB7;
                                    commonBottomSheetType6 = commonBottomSheetType15;
                                    bottomSheetTutorialItemArr2[i] = new BottomSheetTutorialItem(str17, (String) objL);
                                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType6;
                                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = bottomSheetTutorialItemArr3;
                                    homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str15;
                                    homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str14;
                                    homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = bottomSheetTutorialItemArr3;
                                    homeComponent$createBottomSheetDataAndUpdateState$1.L$5 = null;
                                    homeComponent$createBottomSheetDataAndUpdateState$1.I$0 = 1;
                                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 9;
                                    objL = stringProvider.b(StringEnum.CARD_RECHARGE_TUTORIAL_BOTTOMSHEET_STEP_2_TITLE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                                    if (objL != coroutineSingletons) {
                                        commonBottomSheetType7 = commonBottomSheetType6;
                                        str18 = str14;
                                        str19 = str15;
                                        bottomSheetTutorialItemArr4 = bottomSheetTutorialItemArr3;
                                        i2 = 1;
                                        str20 = (String) objL;
                                        homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType7;
                                        homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = bottomSheetTutorialItemArr4;
                                        homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str19;
                                        homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str18;
                                        homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = bottomSheetTutorialItemArr3;
                                        homeComponent$createBottomSheetDataAndUpdateState$1.L$5 = str20;
                                        homeComponent$createBottomSheetDataAndUpdateState$1.I$0 = i2;
                                        homeComponent$createBottomSheetDataAndUpdateState$1.label = 10;
                                        objL = stringProvider.b(StringEnum.CARD_RECHARGE_TUTORIAL_BOTTOMSHEET_STEP_2_COPY, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                                        if (objL != coroutineSingletons) {
                                            str21 = str20;
                                            i3 = i2;
                                            commonBottomSheetType2 = commonBottomSheetType7;
                                            bottomSheetTutorialItemArr5 = bottomSheetTutorialItemArr3;
                                            String str65 = str19;
                                            String str66 = str18;
                                            bottomSheetTutorialItemArr5[i3] = new BottomSheetTutorialItem(str21, (String) objL);
                                            genericBottomSheetData2 = new CommonBottomSheetData.GenericBottomSheetData(null, str65, null, str66, null, new ChaloBottomSheetLayoutType.TutorialBottomSheet(CollectionsKt.S(bottomSheetTutorialItemArr4)), 21);
                                            if (genericBottomSheetData2 == null) {
                                                homeComponent.E0(new u60(12));
                                            } else {
                                                homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                                            }
                                            return Unit.f17538a;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (commonBottomSheetType14 instanceof CommonBottomSheetType.SuperPassVerificationBottomSheet.Verified) {
                    IconType iconType19 = IconType.PASS_SUCCESS;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType19;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 11;
                    Object objB25 = stringProvider.b(StringEnum.VERIFICATION_SUCCESSFUL, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objB25 != coroutineSingletons) {
                        iconType5 = iconType19;
                        objL = objB25;
                        str22 = (String) objL;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType5;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str22;
                        homeComponent$createBottomSheetDataAndUpdateState$1.label = 12;
                        objB8 = stringProvider.b(StringEnum.VERIFICATION_SUCCESSFUL_MSG, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                        if (objB8 != coroutineSingletons) {
                            commonBottomSheetType8 = commonBottomSheetType14;
                            str23 = str22;
                            objL = objB8;
                            str24 = (String) objL;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType8;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType5;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str23;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str24;
                            homeComponent$createBottomSheetDataAndUpdateState$1.label = 13;
                            objB9 = stringProvider.b(StringEnum.PAY_NOW, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                            if (objB9 != coroutineSingletons) {
                                iconType9 = iconType5;
                                str25 = str23;
                                str26 = str24;
                                objL = objB9;
                                str27 = (String) objL;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType8;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType9;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str25;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str26;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = str27;
                                homeComponent$createBottomSheetDataAndUpdateState$1.label = 14;
                                objB10 = stringProvider.b(StringEnum.LATER, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                                if (objB10 != coroutineSingletons) {
                                    str28 = str26;
                                    str29 = str27;
                                    objL = objB10;
                                    str30 = str25;
                                    iconType10 = iconType9;
                                    commonBottomSheetType2 = commonBottomSheetType8;
                                    genericBottomSheetData = new CommonBottomSheetData.GenericBottomSheetData(iconType10, str30, str28, str29, (String) objL, null, 32);
                                    genericBottomSheetData2 = genericBottomSheetData;
                                    if (genericBottomSheetData2 == null) {
                                        homeComponent.E0(new u60(12));
                                    } else {
                                        homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                                    }
                                    return Unit.f17538a;
                                }
                            }
                        }
                    }
                } else if (commonBottomSheetType14 instanceof CommonBottomSheetType.SuperPassVerificationBottomSheet.Rejected) {
                    IconType iconType20 = IconType.PASS_UNSUCCESS;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType20;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 15;
                    Object objB26 = stringProvider.b(StringEnum.VERIFICATION_UNSUCCESSFUL, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objB26 != coroutineSingletons) {
                        iconType4 = iconType20;
                        objL = objB26;
                        str31 = (String) objL;
                        StringEnum stringEnum = StringEnum.VERIFICATION_UNSUCCESSFUL_MSG;
                        Object[] objArr = {((CommonBottomSheetType.SuperPassVerificationBottomSheet.Rejected) commonBottomSheetType14).b.f};
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType4;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str31;
                        homeComponent$createBottomSheetDataAndUpdateState$1.label = 16;
                        objB11 = stringProvider.b(stringEnum, objArr, homeComponent$createBottomSheetDataAndUpdateState$1);
                        if (objB11 != coroutineSingletons) {
                            commonBottomSheetType9 = commonBottomSheetType14;
                            str32 = str31;
                            objL = objB11;
                            str33 = (String) objL;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType9;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType4;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str32;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str33;
                            homeComponent$createBottomSheetDataAndUpdateState$1.label = 17;
                            objB12 = stringProvider.b(StringEnum.VIEW_DETAILS, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                            if (objB12 != coroutineSingletons) {
                                iconType11 = iconType4;
                                str34 = str32;
                                str35 = str33;
                                objL = objB12;
                                str36 = (String) objL;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType9;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType11;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str34;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str35;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = str36;
                                homeComponent$createBottomSheetDataAndUpdateState$1.label = 18;
                                objB13 = stringProvider.b(StringEnum.DISMISS, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                                if (objB13 != coroutineSingletons) {
                                    str37 = str35;
                                    str38 = str34;
                                    iconType12 = iconType11;
                                    commonBottomSheetType2 = commonBottomSheetType9;
                                    str39 = str36;
                                    objL = objB13;
                                    genericBottomSheetData = new CommonBottomSheetData.GenericBottomSheetData(iconType12, str38, str37, str39, (String) objL, null, 32);
                                    genericBottomSheetData2 = genericBottomSheetData;
                                    if (genericBottomSheetData2 == null) {
                                        homeComponent.E0(new u60(12));
                                    } else {
                                        homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                                    }
                                    return Unit.f17538a;
                                }
                            }
                        }
                    }
                } else if (commonBottomSheetType14 instanceof CommonBottomSheetType.CityChangeBottomSheet) {
                    iconType3 = IconType.CITY_CHANGE;
                    StringEnum stringEnum2 = StringEnum.CITY_CHANGE_BOTTOM_SHEET_TITLE;
                    CityAppModel cityAppModel = (CityAppModel) homeComponent.m.getE().getValue();
                    if (cityAppModel == null || (str = cityAppModel.s) == null) {
                        str = "";
                    }
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType3;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 19;
                    objB = stringProvider.b(stringEnum2, new Object[]{str}, homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objB != coroutineSingletons) {
                        str40 = (String) objB;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType3;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str40;
                        homeComponent$createBottomSheetDataAndUpdateState$1.label = 20;
                        objB14 = stringProvider.b(StringEnum.CHANGE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                        if (objB14 != coroutineSingletons) {
                            commonBottomSheetType10 = commonBottomSheetType14;
                            str41 = str40;
                            iconType13 = iconType3;
                            objL = objB14;
                            str42 = (String) objL;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType10;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType13;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str41;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str42;
                            homeComponent$createBottomSheetDataAndUpdateState$1.label = 21;
                            objB15 = stringProvider.b(StringEnum.DONT_CHANGE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                            if (objB15 != coroutineSingletons) {
                                str43 = str41;
                                commonBottomSheetType2 = commonBottomSheetType10;
                                str44 = str42;
                                objL = objB15;
                                genericBottomSheetData = new CommonBottomSheetData.GenericBottomSheetData(iconType13, str43, null, str44, (String) objL, null, 36);
                                genericBottomSheetData2 = genericBottomSheetData;
                                if (genericBottomSheetData2 == null) {
                                    homeComponent.E0(new u60(12));
                                } else {
                                    homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                                }
                                return Unit.f17538a;
                            }
                        }
                    }
                } else if (commonBottomSheetType14 instanceof CommonBottomSheetType.CityNotSupportedBottomSheet) {
                    IconType iconType21 = IconType.CITY_CHANGE;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType21;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 22;
                    Object objB27 = stringProvider.b(StringEnum.CITY_NOT_ADDED, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objB27 != coroutineSingletons) {
                        iconType2 = iconType21;
                        objL = objB27;
                        str45 = (String) objL;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType2;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str45;
                        homeComponent$createBottomSheetDataAndUpdateState$1.label = 23;
                        objB16 = stringProvider.b(StringEnum.OKAY, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                        if (objB16 != coroutineSingletons) {
                            str46 = str45;
                            objL = objB16;
                            iconType14 = iconType2;
                            CommonBottomSheetData.GenericBottomSheetData genericBottomSheetData3 = new CommonBottomSheetData.GenericBottomSheetData(iconType14, str46, null, (String) objL, null, null, 52);
                            commonBottomSheetType2 = commonBottomSheetType14;
                            genericBottomSheetData2 = genericBottomSheetData3;
                            if (genericBottomSheetData2 == null) {
                                homeComponent.E0(new u60(12));
                            } else {
                                homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                            }
                            return Unit.f17538a;
                        }
                    }
                } else {
                    if (!(commonBottomSheetType14 instanceof CommonBottomSheetType.NotificationPermissionBottomSheet)) {
                        if (commonBottomSheetType14 instanceof CommonBottomSheetType.UserProfilingBottomSheet) {
                            HomeScreenAnalyticsHelper.DefaultImpls.a(homeComponent.C, "user profiling bs shown", null, Source.HOME_SCREEN, 14);
                            UserProfileDetailsProvider userProfileDetailsProvider = homeComponent.v;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                            homeComponent$createBottomSheetDataAndUpdateState$1.label = 28;
                            objL = userProfileDetailsProvider.l(homeComponent$createBottomSheetDataAndUpdateState$1);
                            if (objL != coroutineSingletons) {
                                userProfileAppModel = (UserProfileAppModel) objL;
                                if (userProfileAppModel != null) {
                                    gender = userProfileAppModel.d;
                                } else {
                                    gender = Gender.NULL;
                                }
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = gender;
                                homeComponent$createBottomSheetDataAndUpdateState$1.label = 29;
                                objB20 = stringProvider.b(StringEnum.USER_PROFILING_HOME_BOTTOM_SHEET_TITLE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                                if (objB20 != coroutineSingletons) {
                                    commonBottomSheetType12 = commonBottomSheetType14;
                                    gender2 = gender;
                                    objL = objB20;
                                    str56 = (String) objL;
                                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType12;
                                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = gender2;
                                    homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str56;
                                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 30;
                                    objB21 = stringProvider.b(StringEnum.USER_PROFILING_HOME_BOTTOM_SHEET_SUBTITLE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                                    if (objB21 != coroutineSingletons) {
                                        commonBottomSheetType13 = commonBottomSheetType12;
                                        gender3 = gender2;
                                        str57 = str56;
                                        objL = objB21;
                                        str58 = (String) objL;
                                        homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType13;
                                        homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = gender3;
                                        homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str57;
                                        homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str58;
                                        homeComponent$createBottomSheetDataAndUpdateState$1.label = 31;
                                        objB22 = stringProvider.b(StringEnum.SET_UP_NOW, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                                        if (objB22 != coroutineSingletons) {
                                            gender4 = gender3;
                                            str59 = str57;
                                            str60 = str58;
                                            objL = objB22;
                                            str61 = (String) objL;
                                            homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType13;
                                            homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = gender4;
                                            homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str59;
                                            homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str60;
                                            homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = str61;
                                            homeComponent$createBottomSheetDataAndUpdateState$1.label = 32;
                                            objB23 = stringProvider.b(StringEnum.I_WILL_DO_IT_LATER_SENTENCE_CASE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                                            if (objB23 != coroutineSingletons) {
                                                str62 = str60;
                                                str63 = str61;
                                                objL = objB23;
                                                str64 = str59;
                                                gender5 = gender4;
                                                commonBottomSheetType2 = commonBottomSheetType13;
                                                genericBottomSheetData2 = new CommonBottomSheetData.GenericBottomSheetData(null, str64, str62, str63, (String) objL, new ChaloBottomSheetLayoutType.UserProfiling(new UserProfilePicComposableUIState(new UserProfilePicComposableUISpecs(null, 0.0f, 0.0f, 63), UserProfilePicComposableKt.b(gender5, ChaloThemeHelper.a().u, 2))), 1);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (Intrinsics.d(commonBottomSheetType14, CommonBottomSheetType.RideHailingUserFeedbackBottomSheet.b)) {
                                genericBottomSheetData2 = CommonBottomSheetData.RideHailingUserFeedbackBottomSheetData.f2851a;
                            } else if (!Intrinsics.d(commonBottomSheetType14, CommonBottomSheetType.None.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            commonBottomSheetType2 = commonBottomSheetType14;
                        }
                        if (genericBottomSheetData2 == null) {
                            homeComponent.E0(new u60(12));
                        } else {
                            homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                        }
                        return Unit.f17538a;
                    }
                    IconType iconType22 = IconType.IC_NOTIFICATION_TURN_ON;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType22;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 24;
                    Object objB28 = stringProvider.b(StringEnum.NOTIFICATION_PERMISSION, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objB28 != coroutineSingletons) {
                        iconType = iconType22;
                        objL = objB28;
                        str47 = (String) objL;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str47;
                        homeComponent$createBottomSheetDataAndUpdateState$1.label = 25;
                        objB17 = stringProvider.b(StringEnum.NOTIFICATION_PERMISSION_MSG, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                        if (objB17 != coroutineSingletons) {
                            commonBottomSheetType11 = commonBottomSheetType14;
                            str48 = str47;
                            objL = objB17;
                            str49 = (String) objL;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType11;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str48;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str49;
                            homeComponent$createBottomSheetDataAndUpdateState$1.label = 26;
                            objB18 = stringProvider.b(StringEnum.ENABLE_NOTIFICATION, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                            if (objB18 != coroutineSingletons) {
                                iconType15 = iconType;
                                str50 = str48;
                                str51 = str49;
                                objL = objB18;
                                str52 = (String) objL;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType11;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType15;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str50;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str51;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = str52;
                                homeComponent$createBottomSheetDataAndUpdateState$1.label = 27;
                                objB19 = stringProvider.b(StringEnum.SKIP, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                                if (objB19 != coroutineSingletons) {
                                    str53 = str51;
                                    str54 = str50;
                                    iconType16 = iconType15;
                                    commonBottomSheetType2 = commonBottomSheetType11;
                                    str55 = str52;
                                    objL = objB19;
                                    genericBottomSheetData = new CommonBottomSheetData.GenericBottomSheetData(iconType16, str54, str53, str55, (String) objL, ChaloBottomSheetLayoutType.NotificationPermissionBottomSheet.f2846a);
                                    genericBottomSheetData2 = genericBottomSheetData;
                                    if (genericBottomSheetData2 == null) {
                                        homeComponent.E0(new u60(12));
                                    } else {
                                        homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                                    }
                                    return Unit.f17538a;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                IconType iconType23 = (IconType) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                CommonBottomSheetType commonBottomSheetType16 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                iconType6 = iconType23;
                commonBottomSheetType14 = commonBottomSheetType16;
                str2 = (String) objL;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType6;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str2;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 2;
                objB2 = stringProvider.b(StringEnum.BOOST_RATINGS_MSG, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objB2 != coroutineSingletons) {
                    commonBottomSheetType3 = commonBottomSheetType14;
                    str3 = str2;
                    objL = objB2;
                    str4 = (String) objL;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType3;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType6;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str3;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str4;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 3;
                    objB3 = stringProvider.b(StringEnum.RATE_NOW, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objB3 != coroutineSingletons) {
                        IconType iconType110 = iconType6;
                        str5 = str3;
                        str6 = str4;
                        objL = objB3;
                        iconType7 = iconType110;
                        str7 = (String) objL;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType3;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType7;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str5;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str6;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = str7;
                        homeComponent$createBottomSheetDataAndUpdateState$1.label = 4;
                        objB4 = stringProvider.b(StringEnum.REMIND_ME_LATER, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                        if (objB4 != coroutineSingletons) {
                            str8 = str6;
                            str9 = str7;
                            objL = objB4;
                            str10 = str5;
                            iconType8 = iconType7;
                            commonBottomSheetType2 = commonBottomSheetType3;
                            genericBottomSheetData2 = new CommonBottomSheetData.GenericBottomSheetData(iconType8, str10, str8, str9, (String) objL, null, 32);
                            if (genericBottomSheetData2 == null) {
                                homeComponent.E0(new u60(12));
                            } else {
                                homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                            }
                            return Unit.f17538a;
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                str3 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$2;
                iconType6 = (IconType) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                CommonBottomSheetType commonBottomSheetType17 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                commonBottomSheetType3 = commonBottomSheetType17;
                str4 = (String) objL;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType3;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType6;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str3;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str4;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 3;
                objB3 = stringProvider.b(StringEnum.RATE_NOW, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objB3 != coroutineSingletons) {
                    IconType iconType111 = iconType6;
                    str5 = str3;
                    str6 = str4;
                    objL = objB3;
                    iconType7 = iconType111;
                    str7 = (String) objL;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType3;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType7;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str5;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str6;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = str7;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 4;
                    objB4 = stringProvider.b(StringEnum.REMIND_ME_LATER, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objB4 != coroutineSingletons) {
                        str8 = str6;
                        str9 = str7;
                        objL = objB4;
                        str10 = str5;
                        iconType8 = iconType7;
                        commonBottomSheetType2 = commonBottomSheetType3;
                        genericBottomSheetData2 = new CommonBottomSheetData.GenericBottomSheetData(iconType8, str10, str8, str9, (String) objL, null, 32);
                        if (genericBottomSheetData2 == null) {
                            homeComponent.E0(new u60(12));
                        } else {
                            homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                        }
                        return Unit.f17538a;
                    }
                }
                return coroutineSingletons;
            case 3:
                str6 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$3;
                str5 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$2;
                iconType7 = (IconType) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                commonBottomSheetType3 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                str7 = (String) objL;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType3;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType7;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str5;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str6;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = str7;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 4;
                objB4 = stringProvider.b(StringEnum.REMIND_ME_LATER, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objB4 != coroutineSingletons) {
                    str8 = str6;
                    str9 = str7;
                    objL = objB4;
                    str10 = str5;
                    iconType8 = iconType7;
                    commonBottomSheetType2 = commonBottomSheetType3;
                    genericBottomSheetData2 = new CommonBottomSheetData.GenericBottomSheetData(iconType8, str10, str8, str9, (String) objL, null, 32);
                    if (genericBottomSheetData2 == null) {
                        homeComponent.E0(new u60(12));
                    } else {
                        homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                    }
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            case 4:
                String str67 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$4;
                String str68 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$3;
                String str69 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$2;
                IconType iconType24 = (IconType) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                commonBottomSheetType2 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                str9 = str67;
                str8 = str68;
                str10 = str69;
                iconType8 = iconType24;
                genericBottomSheetData2 = new CommonBottomSheetData.GenericBottomSheetData(iconType8, str10, str8, str9, (String) objL, null, 32);
                if (genericBottomSheetData2 == null) {
                    homeComponent.E0(new u60(12));
                } else {
                    homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                }
                return Unit.f17538a;
            case 5:
                commonBottomSheetType14 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                str11 = (String) objL;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = str11;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 6;
                objB5 = stringProvider.b(StringEnum.OKAY, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objB5 != coroutineSingletons) {
                    commonBottomSheetType4 = commonBottomSheetType14;
                    str12 = str11;
                    objL = objB5;
                    str13 = (String) objL;
                    bottomSheetTutorialItemArr = new BottomSheetTutorialItem[2];
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType4;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = bottomSheetTutorialItemArr;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str12;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str13;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = bottomSheetTutorialItemArr;
                    homeComponent$createBottomSheetDataAndUpdateState$1.I$0 = 0;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 7;
                    objB6 = stringProvider.b(StringEnum.CARD_RECHARGE_TUTORIAL_BOTTOMSHEET_STEP_1_TITLE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objB6 != coroutineSingletons) {
                        str14 = str13;
                        bottomSheetTutorialItemArr2 = bottomSheetTutorialItemArr;
                        bottomSheetTutorialItemArr3 = bottomSheetTutorialItemArr2;
                        objL = objB6;
                        commonBottomSheetType5 = commonBottomSheetType4;
                        str15 = str12;
                        i = 0;
                        str16 = (String) objL;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType5;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = bottomSheetTutorialItemArr3;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str15;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str14;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = bottomSheetTutorialItemArr2;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$5 = str16;
                        homeComponent$createBottomSheetDataAndUpdateState$1.I$0 = i;
                        homeComponent$createBottomSheetDataAndUpdateState$1.label = 8;
                        objB7 = stringProvider.b(StringEnum.CARD_RECHARGE_TUTORIAL_BOTTOMSHEET_STEP_1_COPY, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                        if (objB7 != coroutineSingletons) {
                            CommonBottomSheetType commonBottomSheetType18 = commonBottomSheetType5;
                            str17 = str16;
                            objL = objB7;
                            commonBottomSheetType6 = commonBottomSheetType18;
                            bottomSheetTutorialItemArr2[i] = new BottomSheetTutorialItem(str17, (String) objL);
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType6;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = bottomSheetTutorialItemArr3;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str15;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str14;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = bottomSheetTutorialItemArr3;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$5 = null;
                            homeComponent$createBottomSheetDataAndUpdateState$1.I$0 = 1;
                            homeComponent$createBottomSheetDataAndUpdateState$1.label = 9;
                            objL = stringProvider.b(StringEnum.CARD_RECHARGE_TUTORIAL_BOTTOMSHEET_STEP_2_TITLE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                            if (objL != coroutineSingletons) {
                                commonBottomSheetType7 = commonBottomSheetType6;
                                str18 = str14;
                                str19 = str15;
                                bottomSheetTutorialItemArr4 = bottomSheetTutorialItemArr3;
                                i2 = 1;
                                str20 = (String) objL;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType7;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = bottomSheetTutorialItemArr4;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str19;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str18;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = bottomSheetTutorialItemArr3;
                                homeComponent$createBottomSheetDataAndUpdateState$1.L$5 = str20;
                                homeComponent$createBottomSheetDataAndUpdateState$1.I$0 = i2;
                                homeComponent$createBottomSheetDataAndUpdateState$1.label = 10;
                                objL = stringProvider.b(StringEnum.CARD_RECHARGE_TUTORIAL_BOTTOMSHEET_STEP_2_COPY, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                                if (objL != coroutineSingletons) {
                                    str21 = str20;
                                    i3 = i2;
                                    commonBottomSheetType2 = commonBottomSheetType7;
                                    bottomSheetTutorialItemArr5 = bottomSheetTutorialItemArr3;
                                    String str610 = str19;
                                    String str611 = str18;
                                    bottomSheetTutorialItemArr5[i3] = new BottomSheetTutorialItem(str21, (String) objL);
                                    genericBottomSheetData2 = new CommonBottomSheetData.GenericBottomSheetData(null, str610, null, str611, null, new ChaloBottomSheetLayoutType.TutorialBottomSheet(CollectionsKt.S(bottomSheetTutorialItemArr4)), 21);
                                    if (genericBottomSheetData2 == null) {
                                        homeComponent.E0(new u60(12));
                                    } else {
                                        homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                                    }
                                    return Unit.f17538a;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 6:
                str12 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                CommonBottomSheetType commonBottomSheetType19 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                commonBottomSheetType4 = commonBottomSheetType19;
                str13 = (String) objL;
                bottomSheetTutorialItemArr = new BottomSheetTutorialItem[2];
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType4;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = bottomSheetTutorialItemArr;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str12;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str13;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = bottomSheetTutorialItemArr;
                homeComponent$createBottomSheetDataAndUpdateState$1.I$0 = 0;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 7;
                objB6 = stringProvider.b(StringEnum.CARD_RECHARGE_TUTORIAL_BOTTOMSHEET_STEP_1_TITLE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objB6 != coroutineSingletons) {
                    str14 = str13;
                    bottomSheetTutorialItemArr2 = bottomSheetTutorialItemArr;
                    bottomSheetTutorialItemArr3 = bottomSheetTutorialItemArr2;
                    objL = objB6;
                    commonBottomSheetType5 = commonBottomSheetType4;
                    str15 = str12;
                    i = 0;
                    str16 = (String) objL;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType5;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = bottomSheetTutorialItemArr3;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str15;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str14;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = bottomSheetTutorialItemArr2;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$5 = str16;
                    homeComponent$createBottomSheetDataAndUpdateState$1.I$0 = i;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 8;
                    objB7 = stringProvider.b(StringEnum.CARD_RECHARGE_TUTORIAL_BOTTOMSHEET_STEP_1_COPY, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objB7 != coroutineSingletons) {
                        CommonBottomSheetType commonBottomSheetType110 = commonBottomSheetType5;
                        str17 = str16;
                        objL = objB7;
                        commonBottomSheetType6 = commonBottomSheetType110;
                        bottomSheetTutorialItemArr2[i] = new BottomSheetTutorialItem(str17, (String) objL);
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType6;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = bottomSheetTutorialItemArr3;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str15;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str14;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = bottomSheetTutorialItemArr3;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$5 = null;
                        homeComponent$createBottomSheetDataAndUpdateState$1.I$0 = 1;
                        homeComponent$createBottomSheetDataAndUpdateState$1.label = 9;
                        objL = stringProvider.b(StringEnum.CARD_RECHARGE_TUTORIAL_BOTTOMSHEET_STEP_2_TITLE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                        if (objL != coroutineSingletons) {
                            commonBottomSheetType7 = commonBottomSheetType6;
                            str18 = str14;
                            str19 = str15;
                            bottomSheetTutorialItemArr4 = bottomSheetTutorialItemArr3;
                            i2 = 1;
                            str20 = (String) objL;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType7;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = bottomSheetTutorialItemArr4;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str19;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str18;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = bottomSheetTutorialItemArr3;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$5 = str20;
                            homeComponent$createBottomSheetDataAndUpdateState$1.I$0 = i2;
                            homeComponent$createBottomSheetDataAndUpdateState$1.label = 10;
                            objL = stringProvider.b(StringEnum.CARD_RECHARGE_TUTORIAL_BOTTOMSHEET_STEP_2_COPY, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                            if (objL != coroutineSingletons) {
                                str21 = str20;
                                i3 = i2;
                                commonBottomSheetType2 = commonBottomSheetType7;
                                bottomSheetTutorialItemArr5 = bottomSheetTutorialItemArr3;
                                String str612 = str19;
                                String str613 = str18;
                                bottomSheetTutorialItemArr5[i3] = new BottomSheetTutorialItem(str21, (String) objL);
                                genericBottomSheetData2 = new CommonBottomSheetData.GenericBottomSheetData(null, str612, null, str613, null, new ChaloBottomSheetLayoutType.TutorialBottomSheet(CollectionsKt.S(bottomSheetTutorialItemArr4)), 21);
                                if (genericBottomSheetData2 == null) {
                                    homeComponent.E0(new u60(12));
                                } else {
                                    homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                                }
                                return Unit.f17538a;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 7:
                i = homeComponent$createBottomSheetDataAndUpdateState$1.I$0;
                BottomSheetTutorialItem[] bottomSheetTutorialItemArr6 = (BottomSheetTutorialItem[]) homeComponent$createBottomSheetDataAndUpdateState$1.L$4;
                String str70 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$3;
                String str71 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$2;
                BottomSheetTutorialItem[] bottomSheetTutorialItemArr7 = (BottomSheetTutorialItem[]) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                CommonBottomSheetType commonBottomSheetType20 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                bottomSheetTutorialItemArr2 = bottomSheetTutorialItemArr6;
                commonBottomSheetType5 = commonBottomSheetType20;
                str15 = str71;
                bottomSheetTutorialItemArr3 = bottomSheetTutorialItemArr7;
                str14 = str70;
                str16 = (String) objL;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType5;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = bottomSheetTutorialItemArr3;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str15;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str14;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = bottomSheetTutorialItemArr2;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$5 = str16;
                homeComponent$createBottomSheetDataAndUpdateState$1.I$0 = i;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 8;
                objB7 = stringProvider.b(StringEnum.CARD_RECHARGE_TUTORIAL_BOTTOMSHEET_STEP_1_COPY, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objB7 != coroutineSingletons) {
                    CommonBottomSheetType commonBottomSheetType111 = commonBottomSheetType5;
                    str17 = str16;
                    objL = objB7;
                    commonBottomSheetType6 = commonBottomSheetType111;
                    bottomSheetTutorialItemArr2[i] = new BottomSheetTutorialItem(str17, (String) objL);
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType6;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = bottomSheetTutorialItemArr3;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str15;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str14;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = bottomSheetTutorialItemArr3;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$5 = null;
                    homeComponent$createBottomSheetDataAndUpdateState$1.I$0 = 1;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 9;
                    objL = stringProvider.b(StringEnum.CARD_RECHARGE_TUTORIAL_BOTTOMSHEET_STEP_2_TITLE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objL != coroutineSingletons) {
                        commonBottomSheetType7 = commonBottomSheetType6;
                        str18 = str14;
                        str19 = str15;
                        bottomSheetTutorialItemArr4 = bottomSheetTutorialItemArr3;
                        i2 = 1;
                        str20 = (String) objL;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType7;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = bottomSheetTutorialItemArr4;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str19;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str18;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = bottomSheetTutorialItemArr3;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$5 = str20;
                        homeComponent$createBottomSheetDataAndUpdateState$1.I$0 = i2;
                        homeComponent$createBottomSheetDataAndUpdateState$1.label = 10;
                        objL = stringProvider.b(StringEnum.CARD_RECHARGE_TUTORIAL_BOTTOMSHEET_STEP_2_COPY, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                        if (objL != coroutineSingletons) {
                            str21 = str20;
                            i3 = i2;
                            commonBottomSheetType2 = commonBottomSheetType7;
                            bottomSheetTutorialItemArr5 = bottomSheetTutorialItemArr3;
                            String str614 = str19;
                            String str615 = str18;
                            bottomSheetTutorialItemArr5[i3] = new BottomSheetTutorialItem(str21, (String) objL);
                            genericBottomSheetData2 = new CommonBottomSheetData.GenericBottomSheetData(null, str614, null, str615, null, new ChaloBottomSheetLayoutType.TutorialBottomSheet(CollectionsKt.S(bottomSheetTutorialItemArr4)), 21);
                            if (genericBottomSheetData2 == null) {
                                homeComponent.E0(new u60(12));
                            } else {
                                homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                            }
                            return Unit.f17538a;
                        }
                    }
                }
                return coroutineSingletons;
            case 8:
                i = homeComponent$createBottomSheetDataAndUpdateState$1.I$0;
                str17 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$5;
                bottomSheetTutorialItemArr2 = (BottomSheetTutorialItem[]) homeComponent$createBottomSheetDataAndUpdateState$1.L$4;
                str14 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$3;
                str15 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$2;
                bottomSheetTutorialItemArr3 = (BottomSheetTutorialItem[]) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                commonBottomSheetType6 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                bottomSheetTutorialItemArr2[i] = new BottomSheetTutorialItem(str17, (String) objL);
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType6;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = bottomSheetTutorialItemArr3;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str15;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str14;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = bottomSheetTutorialItemArr3;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$5 = null;
                homeComponent$createBottomSheetDataAndUpdateState$1.I$0 = 1;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 9;
                objL = stringProvider.b(StringEnum.CARD_RECHARGE_TUTORIAL_BOTTOMSHEET_STEP_2_TITLE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objL != coroutineSingletons) {
                    commonBottomSheetType7 = commonBottomSheetType6;
                    str18 = str14;
                    str19 = str15;
                    bottomSheetTutorialItemArr4 = bottomSheetTutorialItemArr3;
                    i2 = 1;
                    str20 = (String) objL;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType7;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = bottomSheetTutorialItemArr4;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str19;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str18;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = bottomSheetTutorialItemArr3;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$5 = str20;
                    homeComponent$createBottomSheetDataAndUpdateState$1.I$0 = i2;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 10;
                    objL = stringProvider.b(StringEnum.CARD_RECHARGE_TUTORIAL_BOTTOMSHEET_STEP_2_COPY, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objL != coroutineSingletons) {
                        str21 = str20;
                        i3 = i2;
                        commonBottomSheetType2 = commonBottomSheetType7;
                        bottomSheetTutorialItemArr5 = bottomSheetTutorialItemArr3;
                        String str616 = str19;
                        String str617 = str18;
                        bottomSheetTutorialItemArr5[i3] = new BottomSheetTutorialItem(str21, (String) objL);
                        genericBottomSheetData2 = new CommonBottomSheetData.GenericBottomSheetData(null, str616, null, str617, null, new ChaloBottomSheetLayoutType.TutorialBottomSheet(CollectionsKt.S(bottomSheetTutorialItemArr4)), 21);
                        if (genericBottomSheetData2 == null) {
                            homeComponent.E0(new u60(12));
                        } else {
                            homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                        }
                        return Unit.f17538a;
                    }
                }
                return coroutineSingletons;
            case 9:
                i2 = homeComponent$createBottomSheetDataAndUpdateState$1.I$0;
                BottomSheetTutorialItem[] bottomSheetTutorialItemArr8 = (BottomSheetTutorialItem[]) homeComponent$createBottomSheetDataAndUpdateState$1.L$4;
                str18 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$3;
                str19 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$2;
                bottomSheetTutorialItemArr4 = (BottomSheetTutorialItem[]) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                commonBottomSheetType7 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                bottomSheetTutorialItemArr3 = bottomSheetTutorialItemArr8;
                str20 = (String) objL;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType7;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = bottomSheetTutorialItemArr4;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str19;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str18;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = bottomSheetTutorialItemArr3;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$5 = str20;
                homeComponent$createBottomSheetDataAndUpdateState$1.I$0 = i2;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 10;
                objL = stringProvider.b(StringEnum.CARD_RECHARGE_TUTORIAL_BOTTOMSHEET_STEP_2_COPY, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objL != coroutineSingletons) {
                    str21 = str20;
                    i3 = i2;
                    commonBottomSheetType2 = commonBottomSheetType7;
                    bottomSheetTutorialItemArr5 = bottomSheetTutorialItemArr3;
                    String str618 = str19;
                    String str619 = str18;
                    bottomSheetTutorialItemArr5[i3] = new BottomSheetTutorialItem(str21, (String) objL);
                    genericBottomSheetData2 = new CommonBottomSheetData.GenericBottomSheetData(null, str618, null, str619, null, new ChaloBottomSheetLayoutType.TutorialBottomSheet(CollectionsKt.S(bottomSheetTutorialItemArr4)), 21);
                    if (genericBottomSheetData2 == null) {
                        homeComponent.E0(new u60(12));
                    } else {
                        homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                    }
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            case 10:
                i3 = homeComponent$createBottomSheetDataAndUpdateState$1.I$0;
                str21 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$5;
                bottomSheetTutorialItemArr5 = (BottomSheetTutorialItem[]) homeComponent$createBottomSheetDataAndUpdateState$1.L$4;
                str18 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$3;
                str19 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$2;
                BottomSheetTutorialItem[] bottomSheetTutorialItemArr9 = (BottomSheetTutorialItem[]) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                commonBottomSheetType2 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                bottomSheetTutorialItemArr4 = bottomSheetTutorialItemArr9;
                String str6110 = str19;
                String str6111 = str18;
                bottomSheetTutorialItemArr5[i3] = new BottomSheetTutorialItem(str21, (String) objL);
                genericBottomSheetData2 = new CommonBottomSheetData.GenericBottomSheetData(null, str6110, null, str6111, null, new ChaloBottomSheetLayoutType.TutorialBottomSheet(CollectionsKt.S(bottomSheetTutorialItemArr4)), 21);
                if (genericBottomSheetData2 == null) {
                    homeComponent.E0(new u60(12));
                } else {
                    homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                }
                return Unit.f17538a;
            case 11:
                IconType iconType25 = (IconType) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                CommonBottomSheetType commonBottomSheetType21 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                iconType5 = iconType25;
                commonBottomSheetType14 = commonBottomSheetType21;
                str22 = (String) objL;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType5;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str22;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 12;
                objB8 = stringProvider.b(StringEnum.VERIFICATION_SUCCESSFUL_MSG, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objB8 != coroutineSingletons) {
                    commonBottomSheetType8 = commonBottomSheetType14;
                    str23 = str22;
                    objL = objB8;
                    str24 = (String) objL;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType8;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType5;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str23;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str24;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 13;
                    objB9 = stringProvider.b(StringEnum.PAY_NOW, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objB9 != coroutineSingletons) {
                        iconType9 = iconType5;
                        str25 = str23;
                        str26 = str24;
                        objL = objB9;
                        str27 = (String) objL;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType8;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType9;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str25;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str26;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = str27;
                        homeComponent$createBottomSheetDataAndUpdateState$1.label = 14;
                        objB10 = stringProvider.b(StringEnum.LATER, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                        if (objB10 != coroutineSingletons) {
                            str28 = str26;
                            str29 = str27;
                            objL = objB10;
                            str30 = str25;
                            iconType10 = iconType9;
                            commonBottomSheetType2 = commonBottomSheetType8;
                            genericBottomSheetData = new CommonBottomSheetData.GenericBottomSheetData(iconType10, str30, str28, str29, (String) objL, null, 32);
                            genericBottomSheetData2 = genericBottomSheetData;
                            if (genericBottomSheetData2 == null) {
                                homeComponent.E0(new u60(12));
                            } else {
                                homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                            }
                            return Unit.f17538a;
                        }
                    }
                }
                return coroutineSingletons;
            case 12:
                str23 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$2;
                iconType5 = (IconType) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                CommonBottomSheetType commonBottomSheetType22 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                commonBottomSheetType8 = commonBottomSheetType22;
                str24 = (String) objL;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType8;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType5;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str23;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str24;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 13;
                objB9 = stringProvider.b(StringEnum.PAY_NOW, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objB9 != coroutineSingletons) {
                    iconType9 = iconType5;
                    str25 = str23;
                    str26 = str24;
                    objL = objB9;
                    str27 = (String) objL;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType8;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType9;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str25;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str26;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = str27;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 14;
                    objB10 = stringProvider.b(StringEnum.LATER, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objB10 != coroutineSingletons) {
                        str28 = str26;
                        str29 = str27;
                        objL = objB10;
                        str30 = str25;
                        iconType10 = iconType9;
                        commonBottomSheetType2 = commonBottomSheetType8;
                        genericBottomSheetData = new CommonBottomSheetData.GenericBottomSheetData(iconType10, str30, str28, str29, (String) objL, null, 32);
                        genericBottomSheetData2 = genericBottomSheetData;
                        if (genericBottomSheetData2 == null) {
                            homeComponent.E0(new u60(12));
                        } else {
                            homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                        }
                        return Unit.f17538a;
                    }
                }
                return coroutineSingletons;
            case 13:
                str26 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$3;
                str25 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$2;
                iconType9 = (IconType) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                commonBottomSheetType8 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                str27 = (String) objL;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType8;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType9;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str25;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str26;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = str27;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 14;
                objB10 = stringProvider.b(StringEnum.LATER, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objB10 != coroutineSingletons) {
                    str28 = str26;
                    str29 = str27;
                    objL = objB10;
                    str30 = str25;
                    iconType10 = iconType9;
                    commonBottomSheetType2 = commonBottomSheetType8;
                    genericBottomSheetData = new CommonBottomSheetData.GenericBottomSheetData(iconType10, str30, str28, str29, (String) objL, null, 32);
                    genericBottomSheetData2 = genericBottomSheetData;
                    if (genericBottomSheetData2 == null) {
                        homeComponent.E0(new u60(12));
                    } else {
                        homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                    }
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            case 14:
                String str72 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$4;
                String str73 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$3;
                String str74 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$2;
                iconType10 = (IconType) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                commonBottomSheetType2 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                str29 = str72;
                str28 = str73;
                str30 = str74;
                genericBottomSheetData = new CommonBottomSheetData.GenericBottomSheetData(iconType10, str30, str28, str29, (String) objL, null, 32);
                genericBottomSheetData2 = genericBottomSheetData;
                if (genericBottomSheetData2 == null) {
                    homeComponent.E0(new u60(12));
                } else {
                    homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                }
                return Unit.f17538a;
            case 15:
                IconType iconType26 = (IconType) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                CommonBottomSheetType commonBottomSheetType23 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                iconType4 = iconType26;
                commonBottomSheetType14 = commonBottomSheetType23;
                str31 = (String) objL;
                StringEnum stringEnum3 = StringEnum.VERIFICATION_UNSUCCESSFUL_MSG;
                Object[] objArr2 = {((CommonBottomSheetType.SuperPassVerificationBottomSheet.Rejected) commonBottomSheetType14).b.f};
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType4;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str31;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 16;
                objB11 = stringProvider.b(stringEnum3, objArr2, homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objB11 != coroutineSingletons) {
                    commonBottomSheetType9 = commonBottomSheetType14;
                    str32 = str31;
                    objL = objB11;
                    str33 = (String) objL;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType9;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType4;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str32;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str33;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 17;
                    objB12 = stringProvider.b(StringEnum.VIEW_DETAILS, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objB12 != coroutineSingletons) {
                        iconType11 = iconType4;
                        str34 = str32;
                        str35 = str33;
                        objL = objB12;
                        str36 = (String) objL;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType9;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType11;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str34;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str35;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = str36;
                        homeComponent$createBottomSheetDataAndUpdateState$1.label = 18;
                        objB13 = stringProvider.b(StringEnum.DISMISS, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                        if (objB13 != coroutineSingletons) {
                            str37 = str35;
                            str38 = str34;
                            iconType12 = iconType11;
                            commonBottomSheetType2 = commonBottomSheetType9;
                            str39 = str36;
                            objL = objB13;
                            genericBottomSheetData = new CommonBottomSheetData.GenericBottomSheetData(iconType12, str38, str37, str39, (String) objL, null, 32);
                            genericBottomSheetData2 = genericBottomSheetData;
                            if (genericBottomSheetData2 == null) {
                                homeComponent.E0(new u60(12));
                            } else {
                                homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                            }
                            return Unit.f17538a;
                        }
                    }
                }
                return coroutineSingletons;
            case 16:
                str32 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$2;
                iconType4 = (IconType) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                CommonBottomSheetType commonBottomSheetType24 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                commonBottomSheetType9 = commonBottomSheetType24;
                str33 = (String) objL;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType9;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType4;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str32;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str33;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 17;
                objB12 = stringProvider.b(StringEnum.VIEW_DETAILS, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objB12 != coroutineSingletons) {
                    iconType11 = iconType4;
                    str34 = str32;
                    str35 = str33;
                    objL = objB12;
                    str36 = (String) objL;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType9;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType11;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str34;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str35;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = str36;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 18;
                    objB13 = stringProvider.b(StringEnum.DISMISS, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objB13 != coroutineSingletons) {
                        str37 = str35;
                        str38 = str34;
                        iconType12 = iconType11;
                        commonBottomSheetType2 = commonBottomSheetType9;
                        str39 = str36;
                        objL = objB13;
                        genericBottomSheetData = new CommonBottomSheetData.GenericBottomSheetData(iconType12, str38, str37, str39, (String) objL, null, 32);
                        genericBottomSheetData2 = genericBottomSheetData;
                        if (genericBottomSheetData2 == null) {
                            homeComponent.E0(new u60(12));
                        } else {
                            homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                        }
                        return Unit.f17538a;
                    }
                }
                return coroutineSingletons;
            case 17:
                str35 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$3;
                str34 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$2;
                iconType11 = (IconType) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                commonBottomSheetType9 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                str36 = (String) objL;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType9;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType11;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str34;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str35;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = str36;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 18;
                objB13 = stringProvider.b(StringEnum.DISMISS, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objB13 != coroutineSingletons) {
                    str37 = str35;
                    str38 = str34;
                    iconType12 = iconType11;
                    commonBottomSheetType2 = commonBottomSheetType9;
                    str39 = str36;
                    objL = objB13;
                    genericBottomSheetData = new CommonBottomSheetData.GenericBottomSheetData(iconType12, str38, str37, str39, (String) objL, null, 32);
                    genericBottomSheetData2 = genericBottomSheetData;
                    if (genericBottomSheetData2 == null) {
                        homeComponent.E0(new u60(12));
                    } else {
                        homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                    }
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            case 18:
                String str75 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$4;
                String str76 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$3;
                String str77 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$2;
                iconType12 = (IconType) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                commonBottomSheetType2 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                str39 = str75;
                str37 = str76;
                str38 = str77;
                genericBottomSheetData = new CommonBottomSheetData.GenericBottomSheetData(iconType12, str38, str37, str39, (String) objL, null, 32);
                genericBottomSheetData2 = genericBottomSheetData;
                if (genericBottomSheetData2 == null) {
                    homeComponent.E0(new u60(12));
                } else {
                    homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                }
                return Unit.f17538a;
            case 19:
                IconType iconType27 = (IconType) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                CommonBottomSheetType commonBottomSheetType25 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                iconType3 = iconType27;
                commonBottomSheetType14 = commonBottomSheetType25;
                objB = objL;
                str40 = (String) objB;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType3;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str40;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 20;
                objB14 = stringProvider.b(StringEnum.CHANGE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objB14 != coroutineSingletons) {
                    commonBottomSheetType10 = commonBottomSheetType14;
                    str41 = str40;
                    iconType13 = iconType3;
                    objL = objB14;
                    str42 = (String) objL;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType10;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType13;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str41;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str42;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 21;
                    objB15 = stringProvider.b(StringEnum.DONT_CHANGE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objB15 != coroutineSingletons) {
                        str43 = str41;
                        commonBottomSheetType2 = commonBottomSheetType10;
                        str44 = str42;
                        objL = objB15;
                        genericBottomSheetData = new CommonBottomSheetData.GenericBottomSheetData(iconType13, str43, null, str44, (String) objL, null, 36);
                        genericBottomSheetData2 = genericBottomSheetData;
                        if (genericBottomSheetData2 == null) {
                            homeComponent.E0(new u60(12));
                        } else {
                            homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                        }
                        return Unit.f17538a;
                    }
                }
                return coroutineSingletons;
            case 20:
                str41 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$2;
                iconType13 = (IconType) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                commonBottomSheetType10 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                str42 = (String) objL;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType10;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType13;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str41;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str42;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 21;
                objB15 = stringProvider.b(StringEnum.DONT_CHANGE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objB15 != coroutineSingletons) {
                    str43 = str41;
                    commonBottomSheetType2 = commonBottomSheetType10;
                    str44 = str42;
                    objL = objB15;
                    genericBottomSheetData = new CommonBottomSheetData.GenericBottomSheetData(iconType13, str43, null, str44, (String) objL, null, 36);
                    genericBottomSheetData2 = genericBottomSheetData;
                    if (genericBottomSheetData2 == null) {
                        homeComponent.E0(new u60(12));
                    } else {
                        homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                    }
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            case 21:
                String str78 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$3;
                String str79 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$2;
                IconType iconType28 = (IconType) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                commonBottomSheetType2 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                str44 = str78;
                str43 = str79;
                iconType13 = iconType28;
                genericBottomSheetData = new CommonBottomSheetData.GenericBottomSheetData(iconType13, str43, null, str44, (String) objL, null, 36);
                genericBottomSheetData2 = genericBottomSheetData;
                if (genericBottomSheetData2 == null) {
                    homeComponent.E0(new u60(12));
                } else {
                    homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                }
                return Unit.f17538a;
            case 22:
                IconType iconType29 = (IconType) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                CommonBottomSheetType commonBottomSheetType26 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                iconType2 = iconType29;
                commonBottomSheetType14 = commonBottomSheetType26;
                str45 = (String) objL;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType2;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str45;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 23;
                objB16 = stringProvider.b(StringEnum.OKAY, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objB16 != coroutineSingletons) {
                    str46 = str45;
                    objL = objB16;
                    iconType14 = iconType2;
                    CommonBottomSheetData.GenericBottomSheetData genericBottomSheetData4 = new CommonBottomSheetData.GenericBottomSheetData(iconType14, str46, null, (String) objL, null, null, 52);
                    commonBottomSheetType2 = commonBottomSheetType14;
                    genericBottomSheetData2 = genericBottomSheetData4;
                    if (genericBottomSheetData2 == null) {
                        homeComponent.E0(new u60(12));
                    } else {
                        homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                    }
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            case 23:
                String str80 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$2;
                iconType14 = (IconType) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                CommonBottomSheetType commonBottomSheetType27 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                str46 = str80;
                commonBottomSheetType14 = commonBottomSheetType27;
                CommonBottomSheetData.GenericBottomSheetData genericBottomSheetData5 = new CommonBottomSheetData.GenericBottomSheetData(iconType14, str46, null, (String) objL, null, null, 52);
                commonBottomSheetType2 = commonBottomSheetType14;
                genericBottomSheetData2 = genericBottomSheetData5;
                if (genericBottomSheetData2 == null) {
                    homeComponent.E0(new u60(12));
                } else {
                    homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                }
                return Unit.f17538a;
            case 24:
                IconType iconType30 = (IconType) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                CommonBottomSheetType commonBottomSheetType28 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                iconType = iconType30;
                commonBottomSheetType14 = commonBottomSheetType28;
                str47 = (String) objL;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str47;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 25;
                objB17 = stringProvider.b(StringEnum.NOTIFICATION_PERMISSION_MSG, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objB17 != coroutineSingletons) {
                    commonBottomSheetType11 = commonBottomSheetType14;
                    str48 = str47;
                    objL = objB17;
                    str49 = (String) objL;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType11;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str48;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str49;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 26;
                    objB18 = stringProvider.b(StringEnum.ENABLE_NOTIFICATION, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objB18 != coroutineSingletons) {
                        iconType15 = iconType;
                        str50 = str48;
                        str51 = str49;
                        objL = objB18;
                        str52 = (String) objL;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType11;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType15;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str50;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str51;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = str52;
                        homeComponent$createBottomSheetDataAndUpdateState$1.label = 27;
                        objB19 = stringProvider.b(StringEnum.SKIP, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                        if (objB19 != coroutineSingletons) {
                            str53 = str51;
                            str54 = str50;
                            iconType16 = iconType15;
                            commonBottomSheetType2 = commonBottomSheetType11;
                            str55 = str52;
                            objL = objB19;
                            genericBottomSheetData = new CommonBottomSheetData.GenericBottomSheetData(iconType16, str54, str53, str55, (String) objL, ChaloBottomSheetLayoutType.NotificationPermissionBottomSheet.f2846a);
                            genericBottomSheetData2 = genericBottomSheetData;
                            if (genericBottomSheetData2 == null) {
                                homeComponent.E0(new u60(12));
                            } else {
                                homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                            }
                            return Unit.f17538a;
                        }
                    }
                }
                return coroutineSingletons;
            case 25:
                str48 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$2;
                iconType = (IconType) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                CommonBottomSheetType commonBottomSheetType29 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                commonBottomSheetType11 = commonBottomSheetType29;
                str49 = (String) objL;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType11;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str48;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str49;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 26;
                objB18 = stringProvider.b(StringEnum.ENABLE_NOTIFICATION, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objB18 != coroutineSingletons) {
                    iconType15 = iconType;
                    str50 = str48;
                    str51 = str49;
                    objL = objB18;
                    str52 = (String) objL;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType11;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType15;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str50;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str51;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = str52;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 27;
                    objB19 = stringProvider.b(StringEnum.SKIP, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objB19 != coroutineSingletons) {
                        str53 = str51;
                        str54 = str50;
                        iconType16 = iconType15;
                        commonBottomSheetType2 = commonBottomSheetType11;
                        str55 = str52;
                        objL = objB19;
                        genericBottomSheetData = new CommonBottomSheetData.GenericBottomSheetData(iconType16, str54, str53, str55, (String) objL, ChaloBottomSheetLayoutType.NotificationPermissionBottomSheet.f2846a);
                        genericBottomSheetData2 = genericBottomSheetData;
                        if (genericBottomSheetData2 == null) {
                            homeComponent.E0(new u60(12));
                        } else {
                            homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                        }
                        return Unit.f17538a;
                    }
                }
                return coroutineSingletons;
            case 26:
                str51 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$3;
                str50 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$2;
                iconType15 = (IconType) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                commonBottomSheetType11 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                str52 = (String) objL;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType11;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = iconType15;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str50;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str51;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = str52;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 27;
                objB19 = stringProvider.b(StringEnum.SKIP, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objB19 != coroutineSingletons) {
                    str53 = str51;
                    str54 = str50;
                    iconType16 = iconType15;
                    commonBottomSheetType2 = commonBottomSheetType11;
                    str55 = str52;
                    objL = objB19;
                    genericBottomSheetData = new CommonBottomSheetData.GenericBottomSheetData(iconType16, str54, str53, str55, (String) objL, ChaloBottomSheetLayoutType.NotificationPermissionBottomSheet.f2846a);
                    genericBottomSheetData2 = genericBottomSheetData;
                    if (genericBottomSheetData2 == null) {
                        homeComponent.E0(new u60(12));
                    } else {
                        homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                    }
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            case 27:
                String str81 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$4;
                String str82 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$3;
                String str83 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$2;
                iconType16 = (IconType) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                commonBottomSheetType2 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                str55 = str81;
                str53 = str82;
                str54 = str83;
                genericBottomSheetData = new CommonBottomSheetData.GenericBottomSheetData(iconType16, str54, str53, str55, (String) objL, ChaloBottomSheetLayoutType.NotificationPermissionBottomSheet.f2846a);
                genericBottomSheetData2 = genericBottomSheetData;
                if (genericBottomSheetData2 == null) {
                    homeComponent.E0(new u60(12));
                } else {
                    homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                }
                return Unit.f17538a;
            case 28:
                commonBottomSheetType14 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                userProfileAppModel = (UserProfileAppModel) objL;
                if (userProfileAppModel != null) {
                    gender = userProfileAppModel.d;
                } else {
                    gender = Gender.NULL;
                }
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType14;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = gender;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 29;
                objB20 = stringProvider.b(StringEnum.USER_PROFILING_HOME_BOTTOM_SHEET_TITLE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objB20 != coroutineSingletons) {
                    commonBottomSheetType12 = commonBottomSheetType14;
                    gender2 = gender;
                    objL = objB20;
                    str56 = (String) objL;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType12;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = gender2;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str56;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 30;
                    objB21 = stringProvider.b(StringEnum.USER_PROFILING_HOME_BOTTOM_SHEET_SUBTITLE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objB21 != coroutineSingletons) {
                        commonBottomSheetType13 = commonBottomSheetType12;
                        gender3 = gender2;
                        str57 = str56;
                        objL = objB21;
                        str58 = (String) objL;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType13;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = gender3;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str57;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str58;
                        homeComponent$createBottomSheetDataAndUpdateState$1.label = 31;
                        objB22 = stringProvider.b(StringEnum.SET_UP_NOW, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                        if (objB22 != coroutineSingletons) {
                            gender4 = gender3;
                            str59 = str57;
                            str60 = str58;
                            objL = objB22;
                            str61 = (String) objL;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType13;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = gender4;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str59;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str60;
                            homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = str61;
                            homeComponent$createBottomSheetDataAndUpdateState$1.label = 32;
                            objB23 = stringProvider.b(StringEnum.I_WILL_DO_IT_LATER_SENTENCE_CASE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                            if (objB23 != coroutineSingletons) {
                                str62 = str60;
                                str63 = str61;
                                objL = objB23;
                                str64 = str59;
                                gender5 = gender4;
                                commonBottomSheetType2 = commonBottomSheetType13;
                                genericBottomSheetData2 = new CommonBottomSheetData.GenericBottomSheetData(null, str64, str62, str63, (String) objL, new ChaloBottomSheetLayoutType.UserProfiling(new UserProfilePicComposableUIState(new UserProfilePicComposableUISpecs(null, 0.0f, 0.0f, 63), UserProfilePicComposableKt.b(gender5, ChaloThemeHelper.a().u, 2))), 1);
                                if (genericBottomSheetData2 == null) {
                                    homeComponent.E0(new u60(12));
                                } else {
                                    homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                                }
                                return Unit.f17538a;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 29:
                gender2 = (Gender) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                commonBottomSheetType12 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                str56 = (String) objL;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType12;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = gender2;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str56;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 30;
                objB21 = stringProvider.b(StringEnum.USER_PROFILING_HOME_BOTTOM_SHEET_SUBTITLE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objB21 != coroutineSingletons) {
                    commonBottomSheetType13 = commonBottomSheetType12;
                    gender3 = gender2;
                    str57 = str56;
                    objL = objB21;
                    str58 = (String) objL;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType13;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = gender3;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str57;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str58;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 31;
                    objB22 = stringProvider.b(StringEnum.SET_UP_NOW, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objB22 != coroutineSingletons) {
                        gender4 = gender3;
                        str59 = str57;
                        str60 = str58;
                        objL = objB22;
                        str61 = (String) objL;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType13;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = gender4;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str59;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str60;
                        homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = str61;
                        homeComponent$createBottomSheetDataAndUpdateState$1.label = 32;
                        objB23 = stringProvider.b(StringEnum.I_WILL_DO_IT_LATER_SENTENCE_CASE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                        if (objB23 != coroutineSingletons) {
                            str62 = str60;
                            str63 = str61;
                            objL = objB23;
                            str64 = str59;
                            gender5 = gender4;
                            commonBottomSheetType2 = commonBottomSheetType13;
                            genericBottomSheetData2 = new CommonBottomSheetData.GenericBottomSheetData(null, str64, str62, str63, (String) objL, new ChaloBottomSheetLayoutType.UserProfiling(new UserProfilePicComposableUIState(new UserProfilePicComposableUISpecs(null, 0.0f, 0.0f, 63), UserProfilePicComposableKt.b(gender5, ChaloThemeHelper.a().u, 2))), 1);
                            if (genericBottomSheetData2 == null) {
                                homeComponent.E0(new u60(12));
                            } else {
                                homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                            }
                            return Unit.f17538a;
                        }
                    }
                }
                return coroutineSingletons;
            case 30:
                str57 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$2;
                gender3 = (Gender) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                CommonBottomSheetType commonBottomSheetType30 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                commonBottomSheetType13 = commonBottomSheetType30;
                str58 = (String) objL;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType13;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = gender3;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str57;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str58;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 31;
                objB22 = stringProvider.b(StringEnum.SET_UP_NOW, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objB22 != coroutineSingletons) {
                    gender4 = gender3;
                    str59 = str57;
                    str60 = str58;
                    objL = objB22;
                    str61 = (String) objL;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType13;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = gender4;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str59;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str60;
                    homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = str61;
                    homeComponent$createBottomSheetDataAndUpdateState$1.label = 32;
                    objB23 = stringProvider.b(StringEnum.I_WILL_DO_IT_LATER_SENTENCE_CASE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                    if (objB23 != coroutineSingletons) {
                        str62 = str60;
                        str63 = str61;
                        objL = objB23;
                        str64 = str59;
                        gender5 = gender4;
                        commonBottomSheetType2 = commonBottomSheetType13;
                        genericBottomSheetData2 = new CommonBottomSheetData.GenericBottomSheetData(null, str64, str62, str63, (String) objL, new ChaloBottomSheetLayoutType.UserProfiling(new UserProfilePicComposableUIState(new UserProfilePicComposableUISpecs(null, 0.0f, 0.0f, 63), UserProfilePicComposableKt.b(gender5, ChaloThemeHelper.a().u, 2))), 1);
                        if (genericBottomSheetData2 == null) {
                            homeComponent.E0(new u60(12));
                        } else {
                            homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                        }
                        return Unit.f17538a;
                    }
                }
                return coroutineSingletons;
            case 31:
                str60 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$3;
                str59 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$2;
                gender4 = (Gender) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                commonBottomSheetType13 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                str61 = (String) objL;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$0 = commonBottomSheetType13;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$1 = gender4;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$2 = str59;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$3 = str60;
                homeComponent$createBottomSheetDataAndUpdateState$1.L$4 = str61;
                homeComponent$createBottomSheetDataAndUpdateState$1.label = 32;
                objB23 = stringProvider.b(StringEnum.I_WILL_DO_IT_LATER_SENTENCE_CASE, new Object[0], homeComponent$createBottomSheetDataAndUpdateState$1);
                if (objB23 != coroutineSingletons) {
                    str62 = str60;
                    str63 = str61;
                    objL = objB23;
                    str64 = str59;
                    gender5 = gender4;
                    commonBottomSheetType2 = commonBottomSheetType13;
                    genericBottomSheetData2 = new CommonBottomSheetData.GenericBottomSheetData(null, str64, str62, str63, (String) objL, new ChaloBottomSheetLayoutType.UserProfiling(new UserProfilePicComposableUIState(new UserProfilePicComposableUISpecs(null, 0.0f, 0.0f, 63), UserProfilePicComposableKt.b(gender5, ChaloThemeHelper.a().u, 2))), 1);
                    if (genericBottomSheetData2 == null) {
                        homeComponent.E0(new u60(12));
                    } else {
                        homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                    }
                    return Unit.f17538a;
                }
                return coroutineSingletons;
            case 32:
                String str84 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$4;
                String str85 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$3;
                String str86 = (String) homeComponent$createBottomSheetDataAndUpdateState$1.L$2;
                gender5 = (Gender) homeComponent$createBottomSheetDataAndUpdateState$1.L$1;
                commonBottomSheetType2 = (CommonBottomSheetType) homeComponent$createBottomSheetDataAndUpdateState$1.L$0;
                ResultKt.b(objL);
                str63 = str84;
                str62 = str85;
                str64 = str86;
                genericBottomSheetData2 = new CommonBottomSheetData.GenericBottomSheetData(null, str64, str62, str63, (String) objL, new ChaloBottomSheetLayoutType.UserProfiling(new UserProfilePicComposableUIState(new UserProfilePicComposableUISpecs(null, 0.0f, 0.0f, 63), UserProfilePicComposableKt.b(gender5, ChaloThemeHelper.a().u, 2))), 1);
                if (genericBottomSheetData2 == null) {
                    homeComponent.E0(new u60(12));
                } else {
                    homeComponent.E0(new t60(3, genericBottomSheetData2, commonBottomSheetType2));
                }
                return Unit.f17538a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00df  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object I0(HomeComponent homeComponent, ContinuationImpl continuationImpl) {
        HomeComponent$fetchReportProblemData$1 homeComponent$fetchReportProblemData$1;
        LatLng latLng;
        FetchGeoSpatialDataUseCase fetchGeoSpatialDataUseCase;
        ChaloUseCaseResult chaloUseCaseResult;
        JsonObject jsonObject;
        IReportProblemFeature iReportProblemFeature;
        homeComponent.getClass();
        if (continuationImpl instanceof HomeComponent$fetchReportProblemData$1) {
            homeComponent$fetchReportProblemData$1 = (HomeComponent$fetchReportProblemData$1) continuationImpl;
            int i = homeComponent$fetchReportProblemData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeComponent$fetchReportProblemData$1.label = i - Integer.MIN_VALUE;
            } else {
                homeComponent$fetchReportProblemData$1 = new HomeComponent$fetchReportProblemData$1(homeComponent, continuationImpl);
            }
        } else {
            homeComponent$fetchReportProblemData$1 = new HomeComponent$fetchReportProblemData$1(homeComponent, continuationImpl);
        }
        HomeComponent$fetchReportProblemData$1 homeComponent$fetchReportProblemData$2 = homeComponent$fetchReportProblemData$1;
        Object objC = homeComponent$fetchReportProblemData$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeComponent$fetchReportProblemData$2.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objC);
            ChaloLocationManager chaloLocationManager = homeComponent.E;
            homeComponent$fetchReportProblemData$2.label = 1;
            objC = chaloLocationManager.c(homeComponent$fetchReportProblemData$2);
            if (objC != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objC);
        } else {
            if (i2 == 2) {
                latLng = (LatLng) homeComponent$fetchReportProblemData$2.L$1;
                fetchGeoSpatialDataUseCase = (FetchGeoSpatialDataUseCase) homeComponent$fetchReportProblemData$2.L$0;
                ResultKt.b(objC);
                double d = ((GeoQueryCityConfigModel) objC).b;
                homeComponent$fetchReportProblemData$2.L$0 = null;
                homeComponent$fetchReportProblemData$2.L$1 = null;
                homeComponent$fetchReportProblemData$2.label = 3;
                objC = fetchGeoSpatialDataUseCase.d(latLng, d, true, false, false, false, homeComponent$fetchReportProblemData$2);
                if (objC != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objC);
                return unit;
            }
            ResultKt.b(objC);
        }
        chaloUseCaseResult = (ChaloUseCaseResult) objC;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                throw new NoWhenBranchMatchedException();
            }
            jsonObject = ((GeoQueryResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).b;
            if (jsonObject != null) {
                iReportProblemFeature = homeComponent.r;
                homeComponent$fetchReportProblemData$2.label = 4;
                if (iReportProblemFeature.f(jsonObject, homeComponent$fetchReportProblemData$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return unit;
        LocationAppModel locationAppModelA = ((LocationUpdateResult) objC).a();
        LatLng latLngA = locationAppModelA != null ? locationAppModelA.a() : null;
        CityAppModel cityAppModel = (CityAppModel) homeComponent.m.getE().getValue();
        if (latLngA != null && cityAppModel != null && CityAppModelKt.b(cityAppModel, latLngA)) {
            latLng = latLngA;
        } else if (cityAppModel != null) {
            latLngA = cityAppModel.d;
            latLng = latLngA;
        } else {
            latLng = null;
        }
        if (latLng != null) {
            FetchGeoSpatialDataUseCase fetchGeoSpatialDataUseCase2 = homeComponent.D;
            GetGeoQueryCityWiseConfigUseCase getGeoQueryCityWiseConfigUseCase = homeComponent.F;
            homeComponent$fetchReportProblemData$2.L$0 = fetchGeoSpatialDataUseCase2;
            homeComponent$fetchReportProblemData$2.L$1 = latLng;
            homeComponent$fetchReportProblemData$2.label = 2;
            Object objA = getGeoQueryCityWiseConfigUseCase.a(homeComponent$fetchReportProblemData$2);
            if (objA != coroutineSingletons) {
                fetchGeoSpatialDataUseCase = fetchGeoSpatialDataUseCase2;
                objC = objA;
                double d2 = ((GeoQueryCityConfigModel) objC).b;
                homeComponent$fetchReportProblemData$2.L$0 = null;
                homeComponent$fetchReportProblemData$2.L$1 = null;
                homeComponent$fetchReportProblemData$2.label = 3;
                objC = fetchGeoSpatialDataUseCase.d(latLng, d2, true, false, false, false, homeComponent$fetchReportProblemData$2);
                if (objC != coroutineSingletons) {
                    chaloUseCaseResult = (ChaloUseCaseResult) objC;
                    if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jsonObject = ((GeoQueryResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).b;
                        if (jsonObject != null) {
                            iReportProblemFeature = homeComponent.r;
                            homeComponent$fetchReportProblemData$2.label = 4;
                            if (iReportProblemFeature.f(jsonObject, homeComponent$fetchReportProblemData$2) == coroutineSingletons) {
                            }
                        }
                    }
                }
            }
            return coroutineSingletons;
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static final Object J0(HomeComponent homeComponent, ChaloUserBookingType.SuperPassBooking superPassBooking, List list, ContinuationImpl continuationImpl) {
        HomeComponent$getActivePremiumPassEventMap$1 homeComponent$getActivePremiumPassEventMap$1;
        Object obj;
        Object obj2;
        Map map;
        boolean z;
        String str;
        RideBasedSuperPass rideBasedSuperPass;
        long j;
        Map map2;
        Map map3;
        Map map4;
        boolean z2;
        String str2;
        MagicSuperPass magicSuperPass;
        long j2;
        Map map5;
        Map map6;
        BasicInfoContract basicInfoContract = homeComponent.w;
        CheckIfPremiumPassEligibleForRideRollOver checkIfPremiumPassEligibleForRideRollOver = homeComponent.Z;
        if (continuationImpl instanceof HomeComponent$getActivePremiumPassEventMap$1) {
            homeComponent$getActivePremiumPassEventMap$1 = (HomeComponent$getActivePremiumPassEventMap$1) continuationImpl;
            int i = homeComponent$getActivePremiumPassEventMap$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeComponent$getActivePremiumPassEventMap$1.label = i - Integer.MIN_VALUE;
            } else {
                homeComponent$getActivePremiumPassEventMap$1 = new HomeComponent$getActivePremiumPassEventMap$1(homeComponent, continuationImpl);
            }
        } else {
            homeComponent$getActivePremiumPassEventMap$1 = new HomeComponent$getActivePremiumPassEventMap$1(homeComponent, continuationImpl);
        }
        Object obj3 = homeComponent$getActivePremiumPassEventMap$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeComponent$getActivePremiumPassEventMap$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                j2 = homeComponent$getActivePremiumPassEventMap$1.J$0;
                z2 = homeComponent$getActivePremiumPassEventMap$1.Z$0;
                map5 = (Map) homeComponent$getActivePremiumPassEventMap$1.L$5;
                str2 = (String) homeComponent$getActivePremiumPassEventMap$1.L$4;
                map6 = (Map) homeComponent$getActivePremiumPassEventMap$1.L$3;
                magicSuperPass = (MagicSuperPass) homeComponent$getActivePremiumPassEventMap$1.L$1;
                map4 = (Map) homeComponent$getActivePremiumPassEventMap$1.L$0;
                ResultKt.b(obj3);
                map5.put(str2, String.valueOf((j2 - (((Number) obj3).longValue() / CalendarModelKt.MillisecondsIn24Hours)) + 1));
                SuperPassProperties superPassProperties = magicSuperPass.f9560a;
                SuperPassRepurchaseProperties superPassRepurchaseProperties = magicSuperPass.d;
                map6.put("productType", superPassProperties.b);
                map6.put("productSubType", magicSuperPass.f9560a.c.name());
                map6.put("ridesLeft", "-1");
                map6.put("fareMappingId", String.valueOf(superPassRepurchaseProperties.c));
                map6.put("configId", superPassRepurchaseProperties.f9569a);
                map6.put("categoryId", superPassRepurchaseProperties.b);
                map6.put("rollOverEligible", String.valueOf(z2));
                return map4;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = homeComponent$getActivePremiumPassEventMap$1.J$0;
            z = homeComponent$getActivePremiumPassEventMap$1.Z$0;
            map2 = (Map) homeComponent$getActivePremiumPassEventMap$1.L$5;
            str = (String) homeComponent$getActivePremiumPassEventMap$1.L$4;
            map3 = (Map) homeComponent$getActivePremiumPassEventMap$1.L$3;
            rideBasedSuperPass = (RideBasedSuperPass) homeComponent$getActivePremiumPassEventMap$1.L$1;
            map = (Map) homeComponent$getActivePremiumPassEventMap$1.L$0;
            ResultKt.b(obj3);
            obj = "rollOverEligible";
            obj2 = "categoryId";
            map2.put(str, String.valueOf((j - (((Number) obj3).longValue() / CalendarModelKt.MillisecondsIn24Hours)) + 1));
            SuperPassProperties superPassProperties2 = rideBasedSuperPass.f9560a;
            SuperPassRepurchaseProperties superPassRepurchaseProperties2 = rideBasedSuperPass.d;
            map3.put("productType", superPassProperties2.b);
            map3.put("productSubType", rideBasedSuperPass.f9560a.c.name());
            map3.put("ridesLeft", String.valueOf(rideBasedSuperPass.o()));
            map3.put("fareMappingId", String.valueOf(superPassRepurchaseProperties2.c));
            map3.put("configId", superPassRepurchaseProperties2.f9569a);
            map3.put(obj2, superPassRepurchaseProperties2.b);
            map3.put(obj, String.valueOf(z));
            return map;
        }
        LinkedHashMap linkedHashMapO = defpackage.d.o(obj3);
        if (superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) {
            MagicSuperPass magicSuperPass2 = ((ChaloUserBookingType.SuperPassBooking.MagicSuperPassBooking) superPassBooking).d;
            SuperPassRepurchaseProperties superPassRepurchaseProperties3 = magicSuperPass2.d;
            String str3 = superPassRepurchaseProperties3.f9569a;
            int i3 = superPassRepurchaseProperties3.c;
            checkIfPremiumPassEligibleForRideRollOver.getClass();
            boolean zA = CheckIfPremiumPassEligibleForRideRollOver.a(str3, i3, -1, list);
            linkedHashMapO.put("passId", magicSuperPass2.f9560a.f9566a);
            long j3 = magicSuperPass2.b.c;
            homeComponent$getActivePremiumPassEventMap$1.L$0 = linkedHashMapO;
            homeComponent$getActivePremiumPassEventMap$1.L$1 = magicSuperPass2;
            homeComponent$getActivePremiumPassEventMap$1.L$2 = linkedHashMapO;
            homeComponent$getActivePremiumPassEventMap$1.L$3 = linkedHashMapO;
            homeComponent$getActivePremiumPassEventMap$1.L$4 = "daysLeftToExpiry";
            homeComponent$getActivePremiumPassEventMap$1.L$5 = linkedHashMapO;
            homeComponent$getActivePremiumPassEventMap$1.Z$0 = zA;
            homeComponent$getActivePremiumPassEventMap$1.J$0 = j3;
            homeComponent$getActivePremiumPassEventMap$1.label = 1;
            Object objC = basicInfoContract.c(homeComponent$getActivePremiumPassEventMap$1);
            if (objC != coroutineSingletons) {
                map4 = linkedHashMapO;
                z2 = zA;
                str2 = "daysLeftToExpiry";
                magicSuperPass = magicSuperPass2;
                obj3 = objC;
                j2 = j3;
                map5 = map4;
                map6 = map5;
                map5.put(str2, String.valueOf((j2 - (((Number) obj3).longValue() / CalendarModelKt.MillisecondsIn24Hours)) + 1));
                SuperPassProperties superPassProperties3 = magicSuperPass.f9560a;
                SuperPassRepurchaseProperties superPassRepurchaseProperties4 = magicSuperPass.d;
                map6.put("productType", superPassProperties3.b);
                map6.put("productSubType", magicSuperPass.f9560a.c.name());
                map6.put("ridesLeft", "-1");
                map6.put("fareMappingId", String.valueOf(superPassRepurchaseProperties4.c));
                map6.put("configId", superPassRepurchaseProperties4.f9569a);
                map6.put("categoryId", superPassRepurchaseProperties4.b);
                map6.put("rollOverEligible", String.valueOf(z2));
                return map4;
            }
        } else {
            if (!(superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking)) {
                if ((superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.PendingSuperPassBooking) || (superPassBooking instanceof ChaloUserBookingType.SuperPassBooking.SuperPassApplicationBooking)) {
                    return linkedHashMapO;
                }
                throw new NoWhenBranchMatchedException();
            }
            RideBasedSuperPass rideBasedSuperPass2 = ((ChaloUserBookingType.SuperPassBooking.RideBasedSuperPassBooking) superPassBooking).d;
            SuperPassRepurchaseProperties superPassRepurchaseProperties5 = rideBasedSuperPass2.d;
            obj = "rollOverEligible";
            String str4 = superPassRepurchaseProperties5.f9569a;
            int i4 = superPassRepurchaseProperties5.c;
            obj2 = "categoryId";
            int iO = rideBasedSuperPass2.o();
            checkIfPremiumPassEligibleForRideRollOver.getClass();
            boolean zA2 = CheckIfPremiumPassEligibleForRideRollOver.a(str4, i4, iO, list);
            linkedHashMapO.put("passId", rideBasedSuperPass2.f9560a.f9566a);
            long j4 = rideBasedSuperPass2.g.c;
            homeComponent$getActivePremiumPassEventMap$1.L$0 = linkedHashMapO;
            homeComponent$getActivePremiumPassEventMap$1.L$1 = rideBasedSuperPass2;
            homeComponent$getActivePremiumPassEventMap$1.L$2 = linkedHashMapO;
            homeComponent$getActivePremiumPassEventMap$1.L$3 = linkedHashMapO;
            homeComponent$getActivePremiumPassEventMap$1.L$4 = "daysLeftToExpiry";
            homeComponent$getActivePremiumPassEventMap$1.L$5 = linkedHashMapO;
            homeComponent$getActivePremiumPassEventMap$1.Z$0 = zA2;
            homeComponent$getActivePremiumPassEventMap$1.J$0 = j4;
            homeComponent$getActivePremiumPassEventMap$1.label = 2;
            Object objC2 = basicInfoContract.c(homeComponent$getActivePremiumPassEventMap$1);
            if (objC2 != coroutineSingletons) {
                map = linkedHashMapO;
                z = zA2;
                str = "daysLeftToExpiry";
                rideBasedSuperPass = rideBasedSuperPass2;
                obj3 = objC2;
                j = j4;
                map2 = map;
                map3 = map2;
                map2.put(str, String.valueOf((j - (((Number) obj3).longValue() / CalendarModelKt.MillisecondsIn24Hours)) + 1));
                SuperPassProperties superPassProperties4 = rideBasedSuperPass.f9560a;
                SuperPassRepurchaseProperties superPassRepurchaseProperties6 = rideBasedSuperPass.d;
                map3.put("productType", superPassProperties4.b);
                map3.put("productSubType", rideBasedSuperPass.f9560a.c.name());
                map3.put("ridesLeft", String.valueOf(rideBasedSuperPass.o()));
                map3.put("fareMappingId", String.valueOf(superPassRepurchaseProperties6.c));
                map3.put("configId", superPassRepurchaseProperties6.f9569a);
                map3.put(obj2, superPassRepurchaseProperties6.b);
                map3.put(obj, String.valueOf(z));
                return map;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0215  */
    /* JADX WARN: Code duplicated, block: B:36:0x021f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0235  */
    /* JADX WARN: Code duplicated, block: B:43:0x0259  */
    /* JADX WARN: Code duplicated, block: B:46:0x0263  */
    /* JADX WARN: Code duplicated, block: B:47:0x026a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0273  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v11 */
    /* JADX WARN: Type inference failed for: r23v12 */
    /* JADX WARN: Type inference failed for: r23v13 */
    /* JADX WARN: Type inference failed for: r23v14 */
    /* JADX WARN: Type inference failed for: r23v15 */
    /* JADX WARN: Type inference failed for: r23v16 */
    /* JADX WARN: Type inference failed for: r23v17 */
    /* JADX WARN: Type inference failed for: r23v18 */
    /* JADX WARN: Type inference failed for: r23v19 */
    /* JADX WARN: Type inference failed for: r23v20 */
    /* JADX WARN: Type inference failed for: r23v21 */
    /* JADX WARN: Type inference failed for: r23v22 */
    /* JADX WARN: Type inference failed for: r23v23 */
    /* JADX WARN: Type inference failed for: r23v24 */
    /* JADX WARN: Type inference failed for: r23v25 */
    /* JADX WARN: Type inference failed for: r23v26 */
    /* JADX WARN: Type inference failed for: r23v27 */
    /* JADX WARN: Type inference failed for: r23v28 */
    /* JADX WARN: Type inference failed for: r23v29 */
    /* JADX WARN: Type inference failed for: r23v30 */
    /* JADX WARN: Type inference failed for: r23v31 */
    /* JADX WARN: Type inference failed for: r23v32 */
    /* JADX WARN: Type inference failed for: r23v33 */
    /* JADX WARN: Type inference failed for: r23v34 */
    /* JADX WARN: Type inference failed for: r23v35 */
    /* JADX WARN: Type inference failed for: r23v36 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v43 */
    /* JADX WARN: Type inference failed for: r23v44 */
    /* JADX WARN: Type inference failed for: r23v45 */
    /* JADX WARN: Type inference failed for: r23v46 */
    /* JADX WARN: Type inference failed for: r23v47 */
    /* JADX WARN: Type inference failed for: r23v48 */
    /* JADX WARN: Type inference failed for: r23v49 */
    /* JADX WARN: Type inference failed for: r23v50 */
    /* JADX WARN: Type inference failed for: r23v51 */
    /* JADX WARN: Type inference failed for: r23v52 */
    /* JADX WARN: Type inference failed for: r23v53 */
    /* JADX WARN: Type inference failed for: r23v54 */
    /* JADX WARN: Type inference failed for: r23v55 */
    /* JADX WARN: Type inference failed for: r23v56 */
    /* JADX WARN: Type inference failed for: r23v57 */
    /* JADX WARN: Type inference failed for: r23v58 */
    /* JADX WARN: Type inference failed for: r23v59 */
    /* JADX WARN: Type inference failed for: r23v60 */
    /* JADX WARN: Type inference failed for: r23v61 */
    /* JADX WARN: Type inference failed for: r23v65 */
    /* JADX WARN: Type inference failed for: r23v66 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:137:0x03f5 -> B:139:0x03f9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x0473 -> B:164:0x0477). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:193:0x058f -> B:194:0x0594). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:224:0x065e -> B:225:0x0661). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:251:0x0701 -> B:252:0x0707). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:294:0x07e0 -> B:295:0x07e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:320:0x0871 -> B:321:0x0872). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0259 -> B:44:0x025b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x02e6 -> B:74:0x02e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x034c -> B:98:0x0350). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.io.Serializable K0(app.chalo.home.ui.base.HomeComponent r29, java.util.List r30, kotlin.coroutines.jvm.internal.ContinuationImpl r31) {
        /*
            Method dump skipped, instruction units count: 2412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.base.HomeComponent.K0(app.chalo.home.ui.base.HomeComponent, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object L0(HomeComponent homeComponent, SuperPassApplication lSuperPassApplication, ContinuationImpl continuationImpl) {
        HomeComponent$handleSuperPassRejectedPositiveCTAClick$1 homeComponent$handleSuperPassRejectedPositiveCTAClick$1;
        KotlinToastManager kotlinToastManager;
        homeComponent.getClass();
        if (continuationImpl instanceof HomeComponent$handleSuperPassRejectedPositiveCTAClick$1) {
            homeComponent$handleSuperPassRejectedPositiveCTAClick$1 = (HomeComponent$handleSuperPassRejectedPositiveCTAClick$1) continuationImpl;
            int i = homeComponent$handleSuperPassRejectedPositiveCTAClick$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeComponent$handleSuperPassRejectedPositiveCTAClick$1.label = i - Integer.MIN_VALUE;
            } else {
                homeComponent$handleSuperPassRejectedPositiveCTAClick$1 = new HomeComponent$handleSuperPassRejectedPositiveCTAClick$1(homeComponent, continuationImpl);
            }
        } else {
            homeComponent$handleSuperPassRejectedPositiveCTAClick$1 = new HomeComponent$handleSuperPassRejectedPositiveCTAClick$1(homeComponent, continuationImpl);
        }
        Object objA = homeComponent$handleSuperPassRejectedPositiveCTAClick$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeComponent$handleSuperPassRejectedPositiveCTAClick$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            homeComponent.o1(lSuperPassApplication.h);
            GetNextStepOnPassApplicationRejectedUseCase getNextStepOnPassApplicationRejectedUseCase = homeComponent.T;
            homeComponent$handleSuperPassRejectedPositiveCTAClick$1.L$0 = lSuperPassApplication;
            homeComponent$handleSuperPassRejectedPositiveCTAClick$1.label = 1;
            objA = getNextStepOnPassApplicationRejectedUseCase.a(lSuperPassApplication, homeComponent$handleSuperPassRejectedPositiveCTAClick$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            lSuperPassApplication = (SuperPassApplication) homeComponent$handleSuperPassRejectedPositiveCTAClick$1.L$0;
            ResultKt.b(objA);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) homeComponent$handleSuperPassRejectedPositiveCTAClick$1.L$0;
            ResultKt.b(objA);
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) objA, ToastLength.LONG);
        return Unit.f17538a;
        ProcessRejectedPassApplicationForNextStep processRejectedPassApplicationForNextStep = (ProcessRejectedPassApplicationForNextStep) objA;
        if (Intrinsics.d(processRejectedPassApplicationForNextStep, ProcessRejectedPassApplicationForNextStep.ProductDisabled.f3065a)) {
            KotlinToastManager kotlinToastManager2 = homeComponent.U;
            homeComponent$handleSuperPassRejectedPositiveCTAClick$1.L$0 = kotlinToastManager2;
            homeComponent$handleSuperPassRejectedPositiveCTAClick$1.label = 2;
            objA = homeComponent.q.b(StringEnum.PRODUCT_NOT_AVAILABLE_FOR_PURCHASE_TRY_LATER, new Object[0], homeComponent$handleSuperPassRejectedPositiveCTAClick$1);
            if (objA != coroutineSingletons) {
                kotlinToastManager = kotlinToastManager2;
                KotlinToastManagerKt.a(kotlinToastManager, (String) objA, ToastLength.LONG);
            }
            return coroutineSingletons;
        }
        if (!(processRejectedPassApplicationForNextStep instanceof ProcessRejectedPassApplicationForNextStep.ProceedForReapplication)) {
            throw new NoWhenBranchMatchedException();
        }
        PassPurchaseSceneResolverUseCase passPurchaseSceneResolverUseCase = homeComponent.V;
        Source lSource = Source.HOME_SCREEN_TAB;
        BookableSuperPassConfiguration bookableSuperPassConfiguration = ((ProcessRejectedPassApplicationForNextStep.ProceedForReapplication) processRejectedPassApplicationForNextStep).f3064a;
        passPurchaseSceneResolverUseCase.getClass();
        Intrinsics.i(lSource, "lSource");
        Intrinsics.i(lSuperPassApplication, "lSuperPassApplication");
        SuperPassUserDetails superPassUserDetails = lSuperPassApplication.j;
        PassApplicationActionRequired passApplicationActionRequired = lSuperPassApplication.o;
        Intrinsics.f(passApplicationActionRequired);
        PassApplicationRejectionReasons passApplicationRejectionReasons = lSuperPassApplication.n;
        Intrinsics.f(passApplicationRejectionReasons);
        ChaloNavigationManagerKt.e(homeComponent.M, PassPurchaseSceneResolverUseCase.e(lSource, bookableSuperPassConfiguration, superPassUserDetails, passApplicationActionRequired, passApplicationRejectionReasons, lSuperPassApplication.h), null, 6);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (r12 == r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
    
        if (r12 == r3) goto L31;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M0(app.chalo.home.ui.base.HomeComponent r10, app.chalo.superpass.data.models.entities.SuperPassApplication r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.base.HomeComponent.M0(app.chalo.home.ui.base.HomeComponent, app.chalo.superpass.data.models.entities.SuperPassApplication, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object N0(HomeComponent homeComponent, ContinuationImpl continuationImpl) {
        HomeComponent$hideCurrentCityChangeOptionIfRequired$1 homeComponent$hideCurrentCityChangeOptionIfRequired$1;
        homeComponent.getClass();
        if (continuationImpl instanceof HomeComponent$hideCurrentCityChangeOptionIfRequired$1) {
            homeComponent$hideCurrentCityChangeOptionIfRequired$1 = (HomeComponent$hideCurrentCityChangeOptionIfRequired$1) continuationImpl;
            int i = homeComponent$hideCurrentCityChangeOptionIfRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeComponent$hideCurrentCityChangeOptionIfRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                homeComponent$hideCurrentCityChangeOptionIfRequired$1 = new HomeComponent$hideCurrentCityChangeOptionIfRequired$1(homeComponent, continuationImpl);
            }
        } else {
            homeComponent$hideCurrentCityChangeOptionIfRequired$1 = new HomeComponent$hideCurrentCityChangeOptionIfRequired$1(homeComponent, continuationImpl);
        }
        Object objI = homeComponent$hideCurrentCityChangeOptionIfRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeComponent$hideCurrentCityChangeOptionIfRequired$1.label;
        if (i2 == 0) {
            ResultKt.b(objI);
            ChaloAppFeatureHelper chaloAppFeatureHelper = homeComponent.p0;
            CityAppModel cityAppModel = (CityAppModel) homeComponent.m.getE().getValue();
            String str = cityAppModel != null ? cityAppModel.f8854a : null;
            homeComponent$hideCurrentCityChangeOptionIfRequired$1.label = 1;
            objI = chaloAppFeatureHelper.i(str, homeComponent$hideCurrentCityChangeOptionIfRequired$1);
            if (objI == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objI);
        }
        homeComponent.E0(new va(((Boolean) objI).booleanValue(), 4));
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object O0(HomeComponent homeComponent, ContinuationImpl continuationImpl) {
        HomeComponent$initUserProperties$1 homeComponent$initUserProperties$1;
        String str;
        HomeScreenAnalyticsHelper homeScreenAnalyticsHelper = homeComponent.C;
        if (continuationImpl instanceof HomeComponent$initUserProperties$1) {
            homeComponent$initUserProperties$1 = (HomeComponent$initUserProperties$1) continuationImpl;
            int i = homeComponent$initUserProperties$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeComponent$initUserProperties$1.label = i - Integer.MIN_VALUE;
            } else {
                homeComponent$initUserProperties$1 = new HomeComponent$initUserProperties$1(homeComponent, continuationImpl);
            }
        } else {
            homeComponent$initUserProperties$1 = new HomeComponent$initUserProperties$1(homeComponent, continuationImpl);
        }
        Object objL = homeComponent$initUserProperties$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeComponent$initUserProperties$1.label;
        if (i2 == 0) {
            ResultKt.b(objL);
            UserProfileDetailsProvider userProfileDetailsProvider = homeComponent.v;
            homeComponent$initUserProperties$1.label = 1;
            objL = userProfileDetailsProvider.l(homeComponent$initUserProperties$1);
            if (objL == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objL);
        }
        UserProfileAppModel userProfileAppModel = (UserProfileAppModel) objL;
        if (userProfileAppModel != null && (str = userProfileAppModel.e) != null) {
            Map mapH = MapsKt.h(new Pair(HintConstants.AUTOFILL_HINT_PHONE, str));
            homeScreenAnalyticsHelper.d(mapH);
            homeScreenAnalyticsHelper.a(mapH);
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object P0(HomeComponent homeComponent, ContinuationImpl continuationImpl) {
        HomeComponent$isPremiumBusFeatureEnabled$1 homeComponent$isPremiumBusFeatureEnabled$1;
        homeComponent.getClass();
        if (continuationImpl instanceof HomeComponent$isPremiumBusFeatureEnabled$1) {
            homeComponent$isPremiumBusFeatureEnabled$1 = (HomeComponent$isPremiumBusFeatureEnabled$1) continuationImpl;
            int i = homeComponent$isPremiumBusFeatureEnabled$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeComponent$isPremiumBusFeatureEnabled$1.label = i - Integer.MIN_VALUE;
            } else {
                homeComponent$isPremiumBusFeatureEnabled$1 = new HomeComponent$isPremiumBusFeatureEnabled$1(homeComponent, continuationImpl);
            }
        } else {
            homeComponent$isPremiumBusFeatureEnabled$1 = new HomeComponent$isPremiumBusFeatureEnabled$1(homeComponent, continuationImpl);
        }
        Object objA = homeComponent$isPremiumBusFeatureEnabled$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeComponent$isPremiumBusFeatureEnabled$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            homeComponent$isPremiumBusFeatureEnabled$1.label = 1;
            objA = homeComponent.x.a(homeComponent$isPremiumBusFeatureEnabled$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return Boolean.valueOf(((PremiumBusNativeCityWiseConfigAppModel) objA).a(homeComponent.w.h()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object Q0(HomeComponent homeComponent, ContinuationImpl continuationImpl) {
        HomeComponent$navigateToUniversalPicker$1 homeComponent$navigateToUniversalPicker$1;
        String str;
        ChaloNavigationManager chaloNavigationManager;
        homeComponent.getClass();
        if (continuationImpl instanceof HomeComponent$navigateToUniversalPicker$1) {
            homeComponent$navigateToUniversalPicker$1 = (HomeComponent$navigateToUniversalPicker$1) continuationImpl;
            int i = homeComponent$navigateToUniversalPicker$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeComponent$navigateToUniversalPicker$1.label = i - Integer.MIN_VALUE;
            } else {
                homeComponent$navigateToUniversalPicker$1 = new HomeComponent$navigateToUniversalPicker$1(homeComponent, continuationImpl);
            }
        } else {
            homeComponent$navigateToUniversalPicker$1 = new HomeComponent$navigateToUniversalPicker$1(homeComponent, continuationImpl);
        }
        Object obj = homeComponent$navigateToUniversalPicker$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeComponent$navigateToUniversalPicker$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            UniversalSearchOptions universalSearchOptions = new UniversalSearchOptions(SetsKt.d(new UniversalSearchOption.PLACES(false, true), new UniversalSearchOption.STOPS(true, false), new UniversalSearchOption.ROUTES(), new UniversalSearchOption.TRIPS()));
            ChaloNavigationManager chaloNavigationManager2 = homeComponent.M;
            Json json = ChaloJson.b;
            json.getClass();
            String strA = json.a(UniversalSearchOptions.INSTANCE.serializer(), universalSearchOptions);
            homeComponent$navigateToUniversalPicker$1.L$0 = strA;
            homeComponent$navigateToUniversalPicker$1.L$1 = chaloNavigationManager2;
            homeComponent$navigateToUniversalPicker$1.label = 1;
            Object objB = homeComponent.q.b(StringEnum.UNIVERSAL_PICKER_HINT, new Object[0], homeComponent$navigateToUniversalPicker$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = strA;
            obj = objB;
            chaloNavigationManager = chaloNavigationManager2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloNavigationManager = (ChaloNavigationManager) homeComponent$navigateToUniversalPicker$1.L$1;
            String str2 = (String) homeComponent$navigateToUniversalPicker$1.L$0;
            ResultKt.b(obj);
            str = str2;
        }
        ChaloNavigationManagerKt.e(chaloNavigationManager, new UniversalPickerArgs(str, (String) obj, UniversalSearchFlowSource.HOME_SCREEN_TAB.getSourceName(), Source.HOME_SCREEN_MAIN_FRAGMENT, (String) null, "TRIP_PLANNER", (String) null, (ChaloTransitMode) null, (String) null, (String) null, (UniversalPickerHeaderIcon) null, 2000), null, 6);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object R0(HomeComponent homeComponent, ContinuationImpl continuationImpl) {
        HomeComponent$requestAppTrackingPermissionIfRequired$1 homeComponent$requestAppTrackingPermissionIfRequired$1;
        homeComponent.getClass();
        if (continuationImpl instanceof HomeComponent$requestAppTrackingPermissionIfRequired$1) {
            homeComponent$requestAppTrackingPermissionIfRequired$1 = (HomeComponent$requestAppTrackingPermissionIfRequired$1) continuationImpl;
            int i = homeComponent$requestAppTrackingPermissionIfRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeComponent$requestAppTrackingPermissionIfRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                homeComponent$requestAppTrackingPermissionIfRequired$1 = new HomeComponent$requestAppTrackingPermissionIfRequired$1(homeComponent, continuationImpl);
            }
        } else {
            homeComponent$requestAppTrackingPermissionIfRequired$1 = new HomeComponent$requestAppTrackingPermissionIfRequired$1(homeComponent, continuationImpl);
        }
        Object objV = homeComponent$requestAppTrackingPermissionIfRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeComponent$requestAppTrackingPermissionIfRequired$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objV);
            float f = PlatformFeature.f10436a;
            return unit;
        }
        if (i2 == 1) {
            PermissionHandler permissionHandler = (PermissionHandler) homeComponent$requestAppTrackingPermissionIfRequired$1.L$0;
            ResultKt.b(objV);
            if (((PermissionState) objV) == PermissionState.NOT_DETERMINED) {
                ChannelFlowTransformLatest channelFlowTransformLatestC = permissionHandler.c(AppPermission.APP_TRACKING_TRANSPARENCY);
                homeComponent$requestAppTrackingPermissionIfRequired$1.L$0 = null;
                homeComponent$requestAppTrackingPermissionIfRequired$1.label = 2;
                objV = FlowKt.v(channelFlowTransformLatestC, homeComponent$requestAppTrackingPermissionIfRequired$1);
                if (objV == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return unit;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objV);
        PermissionState permissionState = (PermissionState) objV;
        if (permissionState != null) {
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeComponent.C, "ATT permission request result", vo1.s("result", permissionState.name()), Source.HOME_SCREEN, 12);
            return unit;
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        if (r13 == r1) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object S0(app.chalo.home.ui.base.HomeComponent r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.base.HomeComponent.S0(app.chalo.home.ui.base.HomeComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0091  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa A[PHI: r0 r4 r11
      0x00aa: PHI (r0v4 boolean) = (r0v2 boolean), (r0v7 boolean) binds: [B:28:0x00a6, B:17:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r4v6 boolean) = (r4v4 boolean), (r4v9 boolean) binds: [B:28:0x00a6, B:17:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x00aa: PHI (r11v12 java.lang.Object) = (r11v11 java.lang.Object), (r11v1 java.lang.Object) binds: [B:28:0x00a6, B:17:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:50:0x0103  */
    /* JADX WARN: Code duplicated, block: B:53:0x0112  */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:57:0x0129  */
    /* JADX WARN: Code duplicated, block: B:58:0x012e  */
    /* JADX WARN: Code duplicated, block: B:61:0x013c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0141  */
    /* JADX WARN: Code duplicated, block: B:65:0x0147  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e0, code lost:
    
        if (r11 == r3) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fd, code lost:
    
        if (r11 == r3) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object T0(app.chalo.home.ui.base.HomeComponent r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.base.HomeComponent.T0(app.chalo.home.ui.base.HomeComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:55:0x0118  */
    /* JADX WARN: Code duplicated, block: B:57:0x011c A[Catch: Exception -> 0x0053, TryCatch #4 {Exception -> 0x0053, blocks: (B:19:0x004c, B:57:0x011c, B:59:0x0122, B:61:0x014b, B:66:0x0168, B:82:0x01c7, B:50:0x00f0, B:53:0x0107), top: B:102:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0122 A[Catch: Exception -> 0x0053, TryCatch #4 {Exception -> 0x0053, blocks: (B:19:0x004c, B:57:0x011c, B:59:0x0122, B:61:0x014b, B:66:0x0168, B:82:0x01c7, B:50:0x00f0, B:53:0x0107), top: B:102:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x014b A[Catch: Exception -> 0x0053, TryCatch #4 {Exception -> 0x0053, blocks: (B:19:0x004c, B:57:0x011c, B:59:0x0122, B:61:0x014b, B:66:0x0168, B:82:0x01c7, B:50:0x00f0, B:53:0x0107), top: B:102:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x015e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0168 A[Catch: Exception -> 0x0053, TRY_LEAVE, TryCatch #4 {Exception -> 0x0053, blocks: (B:19:0x004c, B:57:0x011c, B:59:0x0122, B:61:0x014b, B:66:0x0168, B:82:0x01c7, B:50:0x00f0, B:53:0x0107), top: B:102:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0192  */
    /* JADX WARN: Code duplicated, block: B:72:0x0193  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c7 A[Catch: Exception -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0053, blocks: (B:19:0x004c, B:57:0x011c, B:59:0x0122, B:61:0x014b, B:66:0x0168, B:82:0x01c7, B:50:0x00f0, B:53:0x0107), top: B:102:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ee  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0088: MOVE (r0 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:137), block:B:32:0x0088 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    public static final Object U0(HomeComponent homeComponent, ContinuationImpl continuationImpl) {
        HomeComponent$setupOccupancyFactorAndMode$1 homeComponent$setupOccupancyFactorAndMode$1;
        Object obj;
        Exception exc;
        String strB;
        String lowerCase;
        JsonElement jsonElementF;
        String strValueOf;
        int iN;
        int iN2;
        String strS;
        boolean zM;
        String strS2;
        String str;
        int i;
        String str2;
        int i2;
        String str3;
        int i3;
        String str4;
        String strValueOf2;
        String str5;
        String strValueOf3;
        String str6 = "";
        LiveTrackingConfigDataStore liveTrackingConfigDataStore = homeComponent.e0;
        if (continuationImpl instanceof HomeComponent$setupOccupancyFactorAndMode$1) {
            homeComponent$setupOccupancyFactorAndMode$1 = (HomeComponent$setupOccupancyFactorAndMode$1) continuationImpl;
            int i4 = homeComponent$setupOccupancyFactorAndMode$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                homeComponent$setupOccupancyFactorAndMode$1.label = i4 - Integer.MIN_VALUE;
            } else {
                homeComponent$setupOccupancyFactorAndMode$1 = new HomeComponent$setupOccupancyFactorAndMode$1(homeComponent, continuationImpl);
            }
        } else {
            homeComponent$setupOccupancyFactorAndMode$1 = new HomeComponent$setupOccupancyFactorAndMode$1(homeComponent, continuationImpl);
        }
        Object objA = homeComponent$setupOccupancyFactorAndMode$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r4 = homeComponent$setupOccupancyFactorAndMode$1.label;
        try {
            try {
                try {
                    switch (r4) {
                        case 0:
                            ResultKt.b(objA);
                            ChaloConfigFeature chaloConfigFeature = homeComponent.c0;
                            homeComponent$setupOccupancyFactorAndMode$1.label = 1;
                            objA = chaloConfigFeature.a("cityWiseSeatOccupancyConfiguration", homeComponent$setupOccupancyFactorAndMode$1);
                            if (objA == obj2) {
                                return obj2;
                            }
                            String str7 = (String) objA;
                            strB = CityProviderKt.b(homeComponent.m);
                            if (strB != null) {
                                lowerCase = strB.toLowerCase(Locale.ROOT);
                                Intrinsics.h(lowerCase, "toLowerCase(...)");
                            } else {
                                lowerCase = null;
                            }
                            jsonElementF = ChaloJson.b.f(str7);
                            Intrinsics.i(jsonElementF, "<this>");
                            int iN3 = 15;
                            try {
                                iN3 = JsonElementExtensionsKt.n(15, "SODelayThreshold", JsonElementKt.g(jsonElementF));
                                break;
                            } catch (Exception unused) {
                            }
                            strValueOf = String.valueOf(iN3);
                            homeComponent$setupOccupancyFactorAndMode$1.L$0 = lowerCase;
                            homeComponent$setupOccupancyFactorAndMode$1.L$1 = jsonElementF;
                            homeComponent$setupOccupancyFactorAndMode$1.label = 2;
                            if (liveTrackingConfigDataStore.i(strValueOf, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                return obj2;
                            }
                            if (lowerCase != null) {
                                if (JsonElementExtensionsKt.l(lowerCase, jsonElementF)) {
                                    JsonObject jsonObjectE = JsonElementExtensionsKt.e(lowerCase, jsonElementF);
                                    iN = JsonElementExtensionsKt.n(-1, "occupancyFactor", jsonObjectE);
                                    iN2 = JsonElementExtensionsKt.n(0, "mode", jsonObjectE);
                                    strS = JsonElementExtensionsKt.s(jsonObjectE, "noticeText", "");
                                    zM = JsonElementExtensionsKt.m(jsonObjectE, "shouldShowDialog", false);
                                    strS2 = JsonElementExtensionsKt.s(jsonObjectE, "learnMore", "");
                                    if (zM) {
                                        homeComponent$setupOccupancyFactorAndMode$1.L$0 = lowerCase;
                                        homeComponent$setupOccupancyFactorAndMode$1.L$1 = strS;
                                        homeComponent$setupOccupancyFactorAndMode$1.L$2 = strS2;
                                        homeComponent$setupOccupancyFactorAndMode$1.I$0 = iN;
                                        homeComponent$setupOccupancyFactorAndMode$1.I$1 = iN2;
                                        homeComponent$setupOccupancyFactorAndMode$1.label = 3;
                                        if (liveTrackingConfigDataStore.c(lowerCase, homeComponent$setupOccupancyFactorAndMode$1, true) == obj2) {
                                            return obj2;
                                        }
                                    } else {
                                        homeComponent$setupOccupancyFactorAndMode$1.L$0 = lowerCase;
                                        homeComponent$setupOccupancyFactorAndMode$1.L$1 = strS;
                                        homeComponent$setupOccupancyFactorAndMode$1.L$2 = strS2;
                                        homeComponent$setupOccupancyFactorAndMode$1.I$0 = iN;
                                        homeComponent$setupOccupancyFactorAndMode$1.I$1 = iN2;
                                        homeComponent$setupOccupancyFactorAndMode$1.label = 4;
                                        if (liveTrackingConfigDataStore.c(lowerCase, homeComponent$setupOccupancyFactorAndMode$1, false) == obj2) {
                                            return obj2;
                                        }
                                    }
                                    str = strS2;
                                    i = iN2;
                                    str2 = lowerCase;
                                    i2 = iN;
                                    str3 = strS;
                                    i3 = i;
                                    str4 = str2;
                                    strValueOf2 = String.valueOf(i2);
                                    homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$1 = str3;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$2 = str;
                                    homeComponent$setupOccupancyFactorAndMode$1.I$0 = i3;
                                    homeComponent$setupOccupancyFactorAndMode$1.label = 5;
                                    if (liveTrackingConfigDataStore.d(str4, strValueOf2, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                        return obj2;
                                    }
                                    str5 = str3;
                                    strValueOf3 = String.valueOf(i3);
                                    homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$1 = str5;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$2 = str;
                                    homeComponent$setupOccupancyFactorAndMode$1.label = 6;
                                    if (liveTrackingConfigDataStore.n(str4, strValueOf3, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                        return obj2;
                                    }
                                    homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$1 = str;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$2 = null;
                                    homeComponent$setupOccupancyFactorAndMode$1.label = 7;
                                    if (liveTrackingConfigDataStore.m(str4, str5, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                        return obj2;
                                    }
                                    homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$1 = null;
                                    homeComponent$setupOccupancyFactorAndMode$1.label = 8;
                                    if (liveTrackingConfigDataStore.b(str4, str, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                        return obj2;
                                    }
                                } else {
                                    homeComponent$setupOccupancyFactorAndMode$1.L$0 = lowerCase;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$1 = null;
                                    homeComponent$setupOccupancyFactorAndMode$1.label = 9;
                                    if (homeComponent.n1(lowerCase, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                        return obj2;
                                    }
                                }
                            }
                            return Unit.f17538a;
                        case 1:
                            ResultKt.b(objA);
                            String str8 = (String) objA;
                            strB = CityProviderKt.b(homeComponent.m);
                            if (strB != null) {
                                lowerCase = strB.toLowerCase(Locale.ROOT);
                                Intrinsics.h(lowerCase, "toLowerCase(...)");
                            } else {
                                lowerCase = null;
                            }
                            jsonElementF = ChaloJson.b.f(str8);
                            Intrinsics.i(jsonElementF, "<this>");
                            int iN4 = 15;
                            iN4 = JsonElementExtensionsKt.n(15, "SODelayThreshold", JsonElementKt.g(jsonElementF));
                            strValueOf = String.valueOf(iN4);
                            homeComponent$setupOccupancyFactorAndMode$1.L$0 = lowerCase;
                            homeComponent$setupOccupancyFactorAndMode$1.L$1 = jsonElementF;
                            homeComponent$setupOccupancyFactorAndMode$1.label = 2;
                            if (liveTrackingConfigDataStore.i(strValueOf, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                return obj2;
                            }
                            if (lowerCase != null) {
                                if (JsonElementExtensionsKt.l(lowerCase, jsonElementF)) {
                                    JsonObject jsonObjectE2 = JsonElementExtensionsKt.e(lowerCase, jsonElementF);
                                    iN = JsonElementExtensionsKt.n(-1, "occupancyFactor", jsonObjectE2);
                                    iN2 = JsonElementExtensionsKt.n(0, "mode", jsonObjectE2);
                                    strS = JsonElementExtensionsKt.s(jsonObjectE2, "noticeText", "");
                                    zM = JsonElementExtensionsKt.m(jsonObjectE2, "shouldShowDialog", false);
                                    strS2 = JsonElementExtensionsKt.s(jsonObjectE2, "learnMore", "");
                                    if (zM) {
                                        homeComponent$setupOccupancyFactorAndMode$1.L$0 = lowerCase;
                                        homeComponent$setupOccupancyFactorAndMode$1.L$1 = strS;
                                        homeComponent$setupOccupancyFactorAndMode$1.L$2 = strS2;
                                        homeComponent$setupOccupancyFactorAndMode$1.I$0 = iN;
                                        homeComponent$setupOccupancyFactorAndMode$1.I$1 = iN2;
                                        homeComponent$setupOccupancyFactorAndMode$1.label = 3;
                                        if (liveTrackingConfigDataStore.c(lowerCase, homeComponent$setupOccupancyFactorAndMode$1, true) == obj2) {
                                            return obj2;
                                        }
                                    } else {
                                        homeComponent$setupOccupancyFactorAndMode$1.L$0 = lowerCase;
                                        homeComponent$setupOccupancyFactorAndMode$1.L$1 = strS;
                                        homeComponent$setupOccupancyFactorAndMode$1.L$2 = strS2;
                                        homeComponent$setupOccupancyFactorAndMode$1.I$0 = iN;
                                        homeComponent$setupOccupancyFactorAndMode$1.I$1 = iN2;
                                        homeComponent$setupOccupancyFactorAndMode$1.label = 4;
                                        if (liveTrackingConfigDataStore.c(lowerCase, homeComponent$setupOccupancyFactorAndMode$1, false) == obj2) {
                                            return obj2;
                                        }
                                    }
                                    str = strS2;
                                    i = iN2;
                                    str2 = lowerCase;
                                    i2 = iN;
                                    str3 = strS;
                                    i3 = i;
                                    str4 = str2;
                                    strValueOf2 = String.valueOf(i2);
                                    homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$1 = str3;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$2 = str;
                                    homeComponent$setupOccupancyFactorAndMode$1.I$0 = i3;
                                    homeComponent$setupOccupancyFactorAndMode$1.label = 5;
                                    if (liveTrackingConfigDataStore.d(str4, strValueOf2, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                        return obj2;
                                    }
                                    str5 = str3;
                                    strValueOf3 = String.valueOf(i3);
                                    homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$1 = str5;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$2 = str;
                                    homeComponent$setupOccupancyFactorAndMode$1.label = 6;
                                    if (liveTrackingConfigDataStore.n(str4, strValueOf3, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                        return obj2;
                                    }
                                    homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$1 = str;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$2 = null;
                                    homeComponent$setupOccupancyFactorAndMode$1.label = 7;
                                    if (liveTrackingConfigDataStore.m(str4, str5, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                        return obj2;
                                    }
                                    homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$1 = null;
                                    homeComponent$setupOccupancyFactorAndMode$1.label = 8;
                                    if (liveTrackingConfigDataStore.b(str4, str, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                        return obj2;
                                    }
                                } else {
                                    homeComponent$setupOccupancyFactorAndMode$1.L$0 = lowerCase;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$1 = null;
                                    homeComponent$setupOccupancyFactorAndMode$1.label = 9;
                                    if (homeComponent.n1(lowerCase, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                        return obj2;
                                    }
                                }
                            }
                            return Unit.f17538a;
                        case 2:
                            JsonElement jsonElement = (JsonElement) homeComponent$setupOccupancyFactorAndMode$1.L$1;
                            String str9 = (String) homeComponent$setupOccupancyFactorAndMode$1.L$0;
                            ResultKt.b(objA);
                            jsonElementF = jsonElement;
                            lowerCase = str9;
                            if (lowerCase != null) {
                                if (JsonElementExtensionsKt.l(lowerCase, jsonElementF)) {
                                    JsonObject jsonObjectE3 = JsonElementExtensionsKt.e(lowerCase, jsonElementF);
                                    iN = JsonElementExtensionsKt.n(-1, "occupancyFactor", jsonObjectE3);
                                    iN2 = JsonElementExtensionsKt.n(0, "mode", jsonObjectE3);
                                    strS = JsonElementExtensionsKt.s(jsonObjectE3, "noticeText", "");
                                    zM = JsonElementExtensionsKt.m(jsonObjectE3, "shouldShowDialog", false);
                                    strS2 = JsonElementExtensionsKt.s(jsonObjectE3, "learnMore", "");
                                    if (zM) {
                                        homeComponent$setupOccupancyFactorAndMode$1.L$0 = lowerCase;
                                        homeComponent$setupOccupancyFactorAndMode$1.L$1 = strS;
                                        homeComponent$setupOccupancyFactorAndMode$1.L$2 = strS2;
                                        homeComponent$setupOccupancyFactorAndMode$1.I$0 = iN;
                                        homeComponent$setupOccupancyFactorAndMode$1.I$1 = iN2;
                                        homeComponent$setupOccupancyFactorAndMode$1.label = 3;
                                        if (liveTrackingConfigDataStore.c(lowerCase, homeComponent$setupOccupancyFactorAndMode$1, true) == obj2) {
                                            return obj2;
                                        }
                                    } else {
                                        homeComponent$setupOccupancyFactorAndMode$1.L$0 = lowerCase;
                                        homeComponent$setupOccupancyFactorAndMode$1.L$1 = strS;
                                        homeComponent$setupOccupancyFactorAndMode$1.L$2 = strS2;
                                        homeComponent$setupOccupancyFactorAndMode$1.I$0 = iN;
                                        homeComponent$setupOccupancyFactorAndMode$1.I$1 = iN2;
                                        homeComponent$setupOccupancyFactorAndMode$1.label = 4;
                                        if (liveTrackingConfigDataStore.c(lowerCase, homeComponent$setupOccupancyFactorAndMode$1, false) == obj2) {
                                            return obj2;
                                        }
                                    }
                                    str = strS2;
                                    i = iN2;
                                    str2 = lowerCase;
                                    i2 = iN;
                                    str3 = strS;
                                    i3 = i;
                                    str4 = str2;
                                    strValueOf2 = String.valueOf(i2);
                                    homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$1 = str3;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$2 = str;
                                    homeComponent$setupOccupancyFactorAndMode$1.I$0 = i3;
                                    homeComponent$setupOccupancyFactorAndMode$1.label = 5;
                                    if (liveTrackingConfigDataStore.d(str4, strValueOf2, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                        return obj2;
                                    }
                                    str5 = str3;
                                    strValueOf3 = String.valueOf(i3);
                                    homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$1 = str5;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$2 = str;
                                    homeComponent$setupOccupancyFactorAndMode$1.label = 6;
                                    if (liveTrackingConfigDataStore.n(str4, strValueOf3, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                        return obj2;
                                    }
                                    homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$1 = str;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$2 = null;
                                    homeComponent$setupOccupancyFactorAndMode$1.label = 7;
                                    if (liveTrackingConfigDataStore.m(str4, str5, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                        return obj2;
                                    }
                                    homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$1 = null;
                                    homeComponent$setupOccupancyFactorAndMode$1.label = 8;
                                    if (liveTrackingConfigDataStore.b(str4, str, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                        return obj2;
                                    }
                                } else {
                                    homeComponent$setupOccupancyFactorAndMode$1.L$0 = lowerCase;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$1 = null;
                                    homeComponent$setupOccupancyFactorAndMode$1.label = 9;
                                    if (homeComponent.n1(lowerCase, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                        return obj2;
                                    }
                                }
                            }
                            return Unit.f17538a;
                        case 3:
                            i = homeComponent$setupOccupancyFactorAndMode$1.I$1;
                            i2 = homeComponent$setupOccupancyFactorAndMode$1.I$0;
                            str = (String) homeComponent$setupOccupancyFactorAndMode$1.L$2;
                            str3 = (String) homeComponent$setupOccupancyFactorAndMode$1.L$1;
                            str2 = (String) homeComponent$setupOccupancyFactorAndMode$1.L$0;
                            try {
                                ResultKt.b(objA);
                                i3 = i;
                                str4 = str2;
                                strValueOf2 = String.valueOf(i2);
                                homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                                homeComponent$setupOccupancyFactorAndMode$1.L$1 = str3;
                                homeComponent$setupOccupancyFactorAndMode$1.L$2 = str;
                                homeComponent$setupOccupancyFactorAndMode$1.I$0 = i3;
                                homeComponent$setupOccupancyFactorAndMode$1.label = 5;
                                if (liveTrackingConfigDataStore.d(str4, strValueOf2, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                    return obj2;
                                }
                                str5 = str3;
                                strValueOf3 = String.valueOf(i3);
                                homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                                homeComponent$setupOccupancyFactorAndMode$1.L$1 = str5;
                                homeComponent$setupOccupancyFactorAndMode$1.L$2 = str;
                                homeComponent$setupOccupancyFactorAndMode$1.label = 6;
                                if (liveTrackingConfigDataStore.n(str4, strValueOf3, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                    return obj2;
                                }
                                homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                                homeComponent$setupOccupancyFactorAndMode$1.L$1 = str;
                                homeComponent$setupOccupancyFactorAndMode$1.L$2 = null;
                                homeComponent$setupOccupancyFactorAndMode$1.label = 7;
                                if (liveTrackingConfigDataStore.m(str4, str5, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                    return obj2;
                                }
                                homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                                homeComponent$setupOccupancyFactorAndMode$1.L$1 = null;
                                homeComponent$setupOccupancyFactorAndMode$1.label = 8;
                                if (liveTrackingConfigDataStore.b(str4, str, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                    return obj2;
                                }
                                return Unit.f17538a;
                            } catch (Exception e) {
                                e = e;
                                str6 = str2;
                                homeComponent.d0.i(e);
                                if (str6 != 0) {
                                    homeComponent$setupOccupancyFactorAndMode$1.L$0 = e;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$1 = null;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$2 = null;
                                    homeComponent$setupOccupancyFactorAndMode$1.label = 10;
                                    if (homeComponent.n1(str6, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                        return obj2;
                                    }
                                    exc = e;
                                    e = exc;
                                }
                                e.printStackTrace();
                            }
                            break;
                        case 4:
                            i = homeComponent$setupOccupancyFactorAndMode$1.I$1;
                            i2 = homeComponent$setupOccupancyFactorAndMode$1.I$0;
                            str = (String) homeComponent$setupOccupancyFactorAndMode$1.L$2;
                            str3 = (String) homeComponent$setupOccupancyFactorAndMode$1.L$1;
                            str2 = (String) homeComponent$setupOccupancyFactorAndMode$1.L$0;
                            ResultKt.b(objA);
                            i3 = i;
                            str4 = str2;
                            strValueOf2 = String.valueOf(i2);
                            homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                            homeComponent$setupOccupancyFactorAndMode$1.L$1 = str3;
                            homeComponent$setupOccupancyFactorAndMode$1.L$2 = str;
                            homeComponent$setupOccupancyFactorAndMode$1.I$0 = i3;
                            homeComponent$setupOccupancyFactorAndMode$1.label = 5;
                            if (liveTrackingConfigDataStore.d(str4, strValueOf2, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                return obj2;
                            }
                            str5 = str3;
                            strValueOf3 = String.valueOf(i3);
                            homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                            homeComponent$setupOccupancyFactorAndMode$1.L$1 = str5;
                            homeComponent$setupOccupancyFactorAndMode$1.L$2 = str;
                            homeComponent$setupOccupancyFactorAndMode$1.label = 6;
                            if (liveTrackingConfigDataStore.n(str4, strValueOf3, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                return obj2;
                            }
                            homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                            homeComponent$setupOccupancyFactorAndMode$1.L$1 = str;
                            homeComponent$setupOccupancyFactorAndMode$1.L$2 = null;
                            homeComponent$setupOccupancyFactorAndMode$1.label = 7;
                            if (liveTrackingConfigDataStore.m(str4, str5, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                return obj2;
                            }
                            homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                            homeComponent$setupOccupancyFactorAndMode$1.L$1 = null;
                            homeComponent$setupOccupancyFactorAndMode$1.label = 8;
                            if (liveTrackingConfigDataStore.b(str4, str, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                return obj2;
                            }
                            return Unit.f17538a;
                        case 5:
                            int i5 = homeComponent$setupOccupancyFactorAndMode$1.I$0;
                            String str10 = (String) homeComponent$setupOccupancyFactorAndMode$1.L$2;
                            String str11 = (String) homeComponent$setupOccupancyFactorAndMode$1.L$1;
                            String str12 = (String) homeComponent$setupOccupancyFactorAndMode$1.L$0;
                            ResultKt.b(objA);
                            str = str10;
                            str5 = str11;
                            i3 = i5;
                            str4 = str12;
                            strValueOf3 = String.valueOf(i3);
                            homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                            homeComponent$setupOccupancyFactorAndMode$1.L$1 = str5;
                            homeComponent$setupOccupancyFactorAndMode$1.L$2 = str;
                            homeComponent$setupOccupancyFactorAndMode$1.label = 6;
                            if (liveTrackingConfigDataStore.n(str4, strValueOf3, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                return obj2;
                            }
                            homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                            homeComponent$setupOccupancyFactorAndMode$1.L$1 = str;
                            homeComponent$setupOccupancyFactorAndMode$1.L$2 = null;
                            homeComponent$setupOccupancyFactorAndMode$1.label = 7;
                            if (liveTrackingConfigDataStore.m(str4, str5, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                return obj2;
                            }
                            homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                            homeComponent$setupOccupancyFactorAndMode$1.L$1 = null;
                            homeComponent$setupOccupancyFactorAndMode$1.label = 8;
                            if (liveTrackingConfigDataStore.b(str4, str, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                return obj2;
                            }
                            return Unit.f17538a;
                        case 6:
                            String str13 = (String) homeComponent$setupOccupancyFactorAndMode$1.L$2;
                            str5 = (String) homeComponent$setupOccupancyFactorAndMode$1.L$1;
                            String str14 = (String) homeComponent$setupOccupancyFactorAndMode$1.L$0;
                            try {
                                ResultKt.b(objA);
                                str = str13;
                                str4 = str14;
                                homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                                homeComponent$setupOccupancyFactorAndMode$1.L$1 = str;
                                homeComponent$setupOccupancyFactorAndMode$1.L$2 = null;
                                homeComponent$setupOccupancyFactorAndMode$1.label = 7;
                                if (liveTrackingConfigDataStore.m(str4, str5, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                    return obj2;
                                }
                                homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                                homeComponent$setupOccupancyFactorAndMode$1.L$1 = null;
                                homeComponent$setupOccupancyFactorAndMode$1.label = 8;
                                if (liveTrackingConfigDataStore.b(str4, str, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                    return obj2;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                str6 = str14;
                                homeComponent.d0.i(e);
                                if (str6 != 0) {
                                    homeComponent$setupOccupancyFactorAndMode$1.L$0 = e;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$1 = null;
                                    homeComponent$setupOccupancyFactorAndMode$1.L$2 = null;
                                    homeComponent$setupOccupancyFactorAndMode$1.label = 10;
                                    if (homeComponent.n1(str6, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                        return obj2;
                                    }
                                    exc = e;
                                    e = exc;
                                }
                                e.printStackTrace();
                            }
                            return Unit.f17538a;
                        case 7:
                            String str15 = (String) homeComponent$setupOccupancyFactorAndMode$1.L$1;
                            String str16 = (String) homeComponent$setupOccupancyFactorAndMode$1.L$0;
                            ResultKt.b(objA);
                            str = str15;
                            str4 = str16;
                            homeComponent$setupOccupancyFactorAndMode$1.L$0 = str4;
                            homeComponent$setupOccupancyFactorAndMode$1.L$1 = null;
                            homeComponent$setupOccupancyFactorAndMode$1.label = 8;
                            if (liveTrackingConfigDataStore.b(str4, str, homeComponent$setupOccupancyFactorAndMode$1) == obj2) {
                                return obj2;
                            }
                            return Unit.f17538a;
                        case 8:
                        case 9:
                            ResultKt.b(objA);
                            return Unit.f17538a;
                        case 10:
                            exc = (Exception) homeComponent$setupOccupancyFactorAndMode$1.L$0;
                            ResultKt.b(objA);
                            e = exc;
                            e.printStackTrace();
                            return Unit.f17538a;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Exception e3) {
                    e = e3;
                    str6 = obj;
                }
            } catch (Exception e4) {
                e = e4;
                str6 = r4;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:50:0x0111  */
    /* JADX WARN: Code duplicated, block: B:53:0x0124  */
    /* JADX WARN: Code duplicated, block: B:56:0x0133  */
    /* JADX WARN: Code duplicated, block: B:63:0x0153  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x010c -> B:48:0x010d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x013c -> B:49:0x010e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0156 -> B:27:0x0092). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object V0(app.chalo.home.ui.base.HomeComponent r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.base.HomeComponent.V0(app.chalo.home.ui.base.HomeComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0052 A[PHI: r4 r10
      0x0052: PHI (r4v6 app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel) = 
      (r4v3 app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel)
      (r4v9 app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel)
     binds: [B:27:0x0090, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r10v11 java.lang.Object) = (r10v10 java.lang.Object), (r10v1 java.lang.Object) binds: [B:27:0x0090, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9 A[PHI: r4 r7 r10
      0x00a9: PHI (r4v10 int) = (r4v7 int), (r4v12 int) binds: [B:30:0x00a6, B:15:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r7v3 app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel) = 
      (r7v2 app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel)
      (r7v5 app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel)
     binds: [B:30:0x00a6, B:15:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r10v15 java.lang.Object) = (r10v14 java.lang.Object), (r10v1 java.lang.Object) binds: [B:30:0x00a6, B:15:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd A[PHI: r10
      0x00bd: PHI (r10v20 java.lang.Object) = (r10v19 java.lang.Object), (r10v1 java.lang.Object) binds: [B:33:0x00ba, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cf A[PHI: r10
      0x00cf: PHI (r10v25 java.lang.Object) = (r10v24 java.lang.Object), (r10v1 java.lang.Object) binds: [B:38:0x00cc, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e7, code lost:
    
        if (r1.b((4 & 1) == 0, r9, kotlin.collections.MapsKt.d()) == r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fe, code lost:
    
        if (r9.n(100, app.chalo.home.ui.base.CommonBottomSheetType.ChaloAppRatingsBottomSheet.b, r2) == r3) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object W0(app.chalo.home.ui.base.HomeComponent r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.base.HomeComponent.W0(app.chalo.home.ui.base.HomeComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009a A[LOOP:1: B:29:0x0094->B:31:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
    
        if (r14.a(r6, true, r0) == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object X0(app.chalo.home.ui.base.HomeComponent r12, boolean r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.base.HomeComponent.X0(app.chalo.home.ui.base.HomeComponent, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void Z0(TabChild tabChild) {
        if (tabChild instanceof TabChild.HomeTab) {
            HomeScreenComponent homeScreenComponent = ((TabChild.HomeTab) tabChild).f3189a;
            if (homeScreenComponent.g0) {
                return;
            }
            homeScreenComponent.g0 = true;
            Job job = homeScreenComponent.Y;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            homeScreenComponent.Y = null;
            Job job2 = homeScreenComponent.W;
            if (job2 != null) {
                ((JobSupport) job2).cancel(null);
            }
            homeScreenComponent.W = null;
            homeScreenComponent.f0.a();
            CoroutineScopeKt.b(homeScreenComponent.j, null);
            return;
        }
        if (tabChild instanceof TabChild.RegularBusTab) {
            RegularBusComponent regularBusComponent = ((TabChild.RegularBusTab) tabChild).f3191a;
            if (regularBusComponent.s0) {
                return;
            }
            regularBusComponent.s0 = true;
            Job job3 = regularBusComponent.n0;
            if (job3 != null) {
                ((JobSupport) job3).cancel(null);
            }
            regularBusComponent.n0 = null;
            Job job4 = regularBusComponent.g0;
            if (job4 != null) {
                ((JobSupport) job4).cancel(null);
            }
            regularBusComponent.g0 = null;
            regularBusComponent.p0.a();
            CoroutineScopeKt.b(regularBusComponent.j, null);
            return;
        }
        if (!(tabChild instanceof TabChild.ChaloBusTab)) {
            if (!(tabChild instanceof TabChild.MyTicketsTab)) {
                if (!tabChild.equals(TabChild.UnknownTab.f3192a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            MyTicketsComponent myTicketsComponent = ((TabChild.MyTicketsTab) tabChild).f3190a;
            if (myTicketsComponent.n0) {
                return;
            }
            myTicketsComponent.n0 = true;
            Job job5 = myTicketsComponent.h0;
            if (job5 != null) {
                ((JobSupport) job5).cancel(null);
            }
            myTicketsComponent.h0 = null;
            myTicketsComponent.f0 = null;
            myTicketsComponent.x1();
            myTicketsComponent.j0.a();
            CoroutineScopeKt.b(myTicketsComponent.j, null);
            return;
        }
        ChaloBusComponent chaloBusComponent = ((TabChild.ChaloBusTab) tabChild).f3188a;
        if (chaloBusComponent.j0) {
            return;
        }
        chaloBusComponent.j0 = true;
        Job job6 = chaloBusComponent.b0;
        if (job6 != null) {
            ((JobSupport) job6).cancel(null);
        }
        chaloBusComponent.b0 = null;
        Job job7 = chaloBusComponent.W;
        if (job7 != null) {
            ((JobSupport) job7).cancel(null);
        }
        chaloBusComponent.W = null;
        Job job8 = chaloBusComponent.X;
        if (job8 != null) {
            ((JobSupport) job8).cancel(null);
        }
        chaloBusComponent.X = null;
        Job job9 = chaloBusComponent.Y;
        if (job9 != null) {
            ((JobSupport) job9).cancel(null);
        }
        chaloBusComponent.Y = null;
        Job job10 = chaloBusComponent.c0;
        if (job10 != null) {
            ((JobSupport) job10).cancel(null);
        }
        chaloBusComponent.c0 = null;
        Job job11 = chaloBusComponent.m0;
        if (job11 != null) {
            ((JobSupport) job11).cancel(null);
        }
        chaloBusComponent.m0 = null;
        Job job12 = chaloBusComponent.e0;
        if (job12 != null) {
            ((JobSupport) job12).cancel(null);
        }
        chaloBusComponent.e0 = null;
        CoroutineScopeKt.b(chaloBusComponent.j, null);
    }

    public static NavigationTabAppModel e1(BottomNavTabType bottomNavTabType, HomeScreenConfigAppModel homeScreenConfigAppModel) {
        Object next;
        Iterator it = homeScreenConfigAppModel.c.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((NavigationTabAppModel) next).f3761a.d == bottomNavTabType) {
                return (NavigationTabAppModel) next;
            }
        }
        next = null;
        return (NavigationTabAppModel) next;
    }

    public static boolean i1(TabChild tabChild) {
        if (tabChild instanceof TabChild.ChaloBusTab) {
            return ((TabChild.ChaloBusTab) tabChild).b == null;
        }
        if (tabChild instanceof TabChild.HomeTab) {
            return ((TabChild.HomeTab) tabChild).b == null;
        }
        if (tabChild instanceof TabChild.MyTicketsTab) {
            return ((TabChild.MyTicketsTab) tabChild).b == null;
        }
        if (tabChild instanceof TabChild.RegularBusTab) {
            return ((TabChild.RegularBusTab) tabChild).b == null;
        }
        if (tabChild.equals(TabChild.UnknownTab.f3192a)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object Y0(int i, int i2, ContinuationImpl continuationImpl) {
        HomeComponent$buildChaloBusStickyBannerUIState$1 homeComponent$buildChaloBusStickyBannerUIState$1;
        int i3;
        ImageUIState imageUIState;
        int i4;
        int i5;
        ImageUIState imageUIState2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        if (continuationImpl instanceof HomeComponent$buildChaloBusStickyBannerUIState$1) {
            homeComponent$buildChaloBusStickyBannerUIState$1 = (HomeComponent$buildChaloBusStickyBannerUIState$1) continuationImpl;
            int i6 = homeComponent$buildChaloBusStickyBannerUIState$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                homeComponent$buildChaloBusStickyBannerUIState$1.label = i6 - Integer.MIN_VALUE;
            } else {
                homeComponent$buildChaloBusStickyBannerUIState$1 = new HomeComponent$buildChaloBusStickyBannerUIState$1(this, continuationImpl);
            }
        } else {
            homeComponent$buildChaloBusStickyBannerUIState$1 = new HomeComponent$buildChaloBusStickyBannerUIState$1(this, continuationImpl);
        }
        Object objB = homeComponent$buildChaloBusStickyBannerUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = homeComponent$buildChaloBusStickyBannerUIState$1.label;
        StringProvider stringProvider = this.q;
        if (i7 == 0) {
            ResultKt.b(objB);
            ImageUIState imageUIState3 = new ImageUIState(IconType.COMMUTE_PREFERENCE, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().l), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
            homeComponent$buildChaloBusStickyBannerUIState$1.L$0 = imageUIState3;
            homeComponent$buildChaloBusStickyBannerUIState$1.I$0 = i;
            homeComponent$buildChaloBusStickyBannerUIState$1.I$1 = i2;
            homeComponent$buildChaloBusStickyBannerUIState$1.label = 1;
            objB = stringProvider.b(StringEnum.USER_PROFILING_CHALO_BUS_STICKY_BANNER_TITLE, new Object[0], homeComponent$buildChaloBusStickyBannerUIState$1);
            if (objB != coroutineSingletons) {
                i3 = i;
                imageUIState = imageUIState3;
                i4 = i2;
            }
            return coroutineSingletons;
        }
        if (i7 == 1) {
            i4 = homeComponent$buildChaloBusStickyBannerUIState$1.I$1;
            i3 = homeComponent$buildChaloBusStickyBannerUIState$1.I$0;
            imageUIState = (ImageUIState) homeComponent$buildChaloBusStickyBannerUIState$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = homeComponent$buildChaloBusStickyBannerUIState$1.I$1;
            int i9 = homeComponent$buildChaloBusStickyBannerUIState$1.I$0;
            TextUIState.ChaloTextUIState chaloTextUIState2 = (TextUIState.ChaloTextUIState) homeComponent$buildChaloBusStickyBannerUIState$1.L$1;
            ImageUIState imageUIState4 = (ImageUIState) homeComponent$buildChaloBusStickyBannerUIState$1.L$0;
            ResultKt.b(objB);
            i5 = i8;
            i3 = i9;
            chaloTextUIState = chaloTextUIState2;
            imageUIState2 = imageUIState4;
        }
        TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        Object[] objArr = 0 == true ? 1 : 0;
        return new UserProfilingChaloBusStickyBannerUIState(imageUIState2, chaloTextUIState, chaloTextUIState3, new ImageUIState(IconType.IC_ORANGE_TINT_ARROW, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) objArr, 0.0f, (UiEventHandler) (0 == true ? 1 : 0), 246), i5, i3, new w70(this, i3, i5, 0), UiEventHandler.Companion.a(new v70(this, 1)));
        TextUIState.ChaloTextUIState chaloTextUIState4 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyMedium, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120);
        homeComponent$buildChaloBusStickyBannerUIState$1.L$0 = imageUIState;
        homeComponent$buildChaloBusStickyBannerUIState$1.L$1 = chaloTextUIState4;
        homeComponent$buildChaloBusStickyBannerUIState$1.I$0 = i3;
        homeComponent$buildChaloBusStickyBannerUIState$1.I$1 = i4;
        homeComponent$buildChaloBusStickyBannerUIState$1.label = 2;
        objB = stringProvider.b(StringEnum.USER_PROFILING_CHALO_BUS_STICKY_BANNER_SUBTITLE, new Object[0], homeComponent$buildChaloBusStickyBannerUIState$1);
        if (objB != coroutineSingletons) {
            i5 = i4;
            imageUIState2 = imageUIState;
            chaloTextUIState = chaloTextUIState4;
            TextUIState.ChaloTextUIState chaloTextUIState5 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, ChaloColorToken.ShadyGray.f9851a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            Object[] objArr2 = 0 == true ? 1 : 0;
            return new UserProfilingChaloBusStickyBannerUIState(imageUIState2, chaloTextUIState, chaloTextUIState5, new ImageUIState(IconType.IC_ORANGE_TINT_ARROW, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) objArr2, 0.0f, (UiEventHandler) (0 == true ? 1 : 0), 246), i5, i3, new w70(this, i3, i5, 0), UiEventHandler.Companion.a(new v70(this, 1)));
        }
        return coroutineSingletons;
    }

    public final void a1(String str) {
        Job job = this.j1;
        if (job == null || !((AbstractCoroutine) job).isActive()) {
            this.j1 = BuildersKt.d(this.j, null, null, new HomeComponent$fetchHomeScreenConfig$1(this, str, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b1(ContinuationImpl continuationImpl) {
        HomeComponent$getChaloBusStickyBannerUIState$1 homeComponent$getChaloBusStickyBannerUIState$1;
        PBUserProfileSurveyPreference pBUserProfileSurveyPreference;
        Set setB;
        String strH;
        if (continuationImpl instanceof HomeComponent$getChaloBusStickyBannerUIState$1) {
            homeComponent$getChaloBusStickyBannerUIState$1 = (HomeComponent$getChaloBusStickyBannerUIState$1) continuationImpl;
            int i = homeComponent$getChaloBusStickyBannerUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeComponent$getChaloBusStickyBannerUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                homeComponent$getChaloBusStickyBannerUIState$1 = new HomeComponent$getChaloBusStickyBannerUIState$1(this, continuationImpl);
            }
        } else {
            homeComponent$getChaloBusStickyBannerUIState$1 = new HomeComponent$getChaloBusStickyBannerUIState$1(this, continuationImpl);
        }
        Object objV = homeComponent$getChaloBusStickyBannerUIState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeComponent$getChaloBusStickyBannerUIState$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objV);
                String strM = this.v.m();
                if (strM != null && (strH = this.m.h()) != null) {
                    Flow flowB = this.n0.b(strM, strH);
                    homeComponent$getChaloBusStickyBannerUIState$1.label = 1;
                    objV = FlowKt.v(flowB, homeComponent$getChaloBusStickyBannerUIState$1);
                    if (objV == obj) {
                    }
                }
                return null;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objV);
                return objV;
            }
            ResultKt.b(objV);
            pBUserProfileSurveyPreference = (PBUserProfileSurveyPreference) objV;
        } catch (Exception unused) {
            pBUserProfileSurveyPreference = null;
        }
        int size = (pBUserProfileSurveyPreference == null || (setB = pBUserProfileSurveyPreference.b()) == null) ? 0 : setB.size();
        SurveyStep.INSTANCE.getClass();
        int size2 = SurveyStep.ORDERED.size();
        if (size != size2) {
            homeComponent$getChaloBusStickyBannerUIState$1.label = 2;
            Object objY0 = Y0(size, size2, homeComponent$getChaloBusStickyBannerUIState$1);
            return objY0 == obj ? obj : objY0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c1(HomeScreenConfigAppModel homeScreenConfigAppModel, ContinuationImpl continuationImpl) {
        HomeComponent$getDeeplinkExpectedTabIfValid$1 homeComponent$getDeeplinkExpectedTabIfValid$1;
        DestinationTabType destinationTabTypeA;
        BottomNavTabType bottomNavTabType;
        if (continuationImpl instanceof HomeComponent$getDeeplinkExpectedTabIfValid$1) {
            homeComponent$getDeeplinkExpectedTabIfValid$1 = (HomeComponent$getDeeplinkExpectedTabIfValid$1) continuationImpl;
            int i = homeComponent$getDeeplinkExpectedTabIfValid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeComponent$getDeeplinkExpectedTabIfValid$1.label = i - Integer.MIN_VALUE;
            } else {
                homeComponent$getDeeplinkExpectedTabIfValid$1 = new HomeComponent$getDeeplinkExpectedTabIfValid$1(this, continuationImpl);
            }
        } else {
            homeComponent$getDeeplinkExpectedTabIfValid$1 = new HomeComponent$getDeeplinkExpectedTabIfValid$1(this, continuationImpl);
        }
        Object objA = homeComponent$getDeeplinkExpectedTabIfValid$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeComponent$getDeeplinkExpectedTabIfValid$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            HomeArgs homeArgs = this.l;
            Intrinsics.i(homeArgs, "<this>");
            String str = homeArgs.b;
            if (str != null) {
                DestinationTabType.INSTANCE.getClass();
                destinationTabTypeA = DestinationTabType.Companion.a(str);
            } else {
                destinationTabTypeA = null;
            }
            homeComponent$getDeeplinkExpectedTabIfValid$1.L$0 = homeScreenConfigAppModel;
            homeComponent$getDeeplinkExpectedTabIfValid$1.label = 1;
            objA = this.W.a(destinationTabTypeA, homeComponent$getDeeplinkExpectedTabIfValid$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            homeScreenConfigAppModel = (HomeScreenConfigAppModel) homeComponent$getDeeplinkExpectedTabIfValid$1.L$0;
            ResultKt.b(objA);
        }
        DestinationTabType destinationTabType = (DestinationTabType) objA;
        if (destinationTabType == null) {
            return null;
        }
        int i3 = DestinationTabTypeKt.WhenMappings.f3179a[destinationTabType.ordinal()];
        if (i3 == 1) {
            bottomNavTabType = BottomNavTabType.HOME;
        } else if (i3 == 2) {
            bottomNavTabType = BottomNavTabType.REGULAR_BUS;
        } else if (i3 == 3) {
            bottomNavTabType = BottomNavTabType.CHALO_BUS;
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            bottomNavTabType = BottomNavTabType.MY_TICKETS;
        }
        NavigationTabAppModel navigationTabAppModelE1 = e1(bottomNavTabType, homeScreenConfigAppModel);
        if (navigationTabAppModelE1 != null) {
            HomeScreenAnalyticsHelper.DefaultImpls.a(this.C, "home screen opened via deeplink", vo1.s("preferredDestination", destinationTabType.getDestinationTabType()), Source.HOME_SCREEN, 12);
        }
        return navigationTabAppModelE1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d1(HomeScreenConfigAppModel homeScreenConfigAppModel, ContinuationImpl continuationImpl) {
        HomeComponent$getInitialBottomTabToSelect$1 homeComponent$getInitialBottomTabToSelect$1;
        if (continuationImpl instanceof HomeComponent$getInitialBottomTabToSelect$1) {
            homeComponent$getInitialBottomTabToSelect$1 = (HomeComponent$getInitialBottomTabToSelect$1) continuationImpl;
            int i = homeComponent$getInitialBottomTabToSelect$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeComponent$getInitialBottomTabToSelect$1.label = i - Integer.MIN_VALUE;
            } else {
                homeComponent$getInitialBottomTabToSelect$1 = new HomeComponent$getInitialBottomTabToSelect$1(this, continuationImpl);
            }
        } else {
            homeComponent$getInitialBottomTabToSelect$1 = new HomeComponent$getInitialBottomTabToSelect$1(this, continuationImpl);
        }
        Object objC1 = homeComponent$getInitialBottomTabToSelect$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeComponent$getInitialBottomTabToSelect$1.label;
        if (i2 == 0) {
            ResultKt.b(objC1);
            homeComponent$getInitialBottomTabToSelect$1.L$0 = homeScreenConfigAppModel;
            homeComponent$getInitialBottomTabToSelect$1.label = 1;
            objC1 = c1(homeScreenConfigAppModel, homeComponent$getInitialBottomTabToSelect$1);
            if (objC1 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            homeScreenConfigAppModel = (HomeScreenConfigAppModel) homeComponent$getInitialBottomTabToSelect$1.L$0;
            ResultKt.b(objC1);
        }
        NavigationTabAppModel navigationTabAppModel = (NavigationTabAppModel) objC1;
        Child.Created created = ((ChildStack) this.b1.a()).f12382a;
        NavigationTabAppModel navigationTabAppModelE1 = i1((TabChild) created.b) ? e1(((HomeScreenBottomTabConfiguration) created.f12283a).f3204a, homeScreenConfigAppModel) : null;
        if (navigationTabAppModel != null) {
            return navigationTabAppModel;
        }
        if (navigationTabAppModelE1 != null) {
            return navigationTabAppModelE1;
        }
        StateFlow stateFlow = this.f;
        NavigationTabAppModel navigationTabAppModel2 = ((HomeScreenFragmentViewState) stateFlow.getValue()).f3225a;
        return (navigationTabAppModel2 == null || navigationTabAppModel2.f3761a.d == BottomNavTabType.UNKNOWN) ? (NavigationTabAppModel) CollectionsKt.L(0, homeScreenConfigAppModel.c) : ((HomeScreenFragmentViewState) stateFlow.getValue()).f3225a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object f1(Gender gender, ContinuationImpl continuationImpl) {
        HomeComponent$getStickyBannerUIState$1 homeComponent$getStickyBannerUIState$1;
        Gender gender2;
        String str;
        Gender gender3;
        if (continuationImpl instanceof HomeComponent$getStickyBannerUIState$1) {
            homeComponent$getStickyBannerUIState$1 = (HomeComponent$getStickyBannerUIState$1) continuationImpl;
            int i = homeComponent$getStickyBannerUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeComponent$getStickyBannerUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                homeComponent$getStickyBannerUIState$1 = new HomeComponent$getStickyBannerUIState$1(this, continuationImpl);
            }
        } else {
            homeComponent$getStickyBannerUIState$1 = new HomeComponent$getStickyBannerUIState$1(this, continuationImpl);
        }
        Object objB = homeComponent$getStickyBannerUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeComponent$getStickyBannerUIState$1.label;
        StringProvider stringProvider = this.q;
        if (i2 == 0) {
            ResultKt.b(objB);
            homeComponent$getStickyBannerUIState$1.L$0 = gender;
            homeComponent$getStickyBannerUIState$1.label = 1;
            objB = stringProvider.b(StringEnum.USER_PROFILING_HOME_STICKY_BANNER_TITLE, new Object[0], homeComponent$getStickyBannerUIState$1);
            if (objB != coroutineSingletons) {
                gender2 = gender;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            gender2 = (Gender) homeComponent$getStickyBannerUIState$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) homeComponent$getStickyBannerUIState$1.L$1;
            gender3 = (Gender) homeComponent$getStickyBannerUIState$1.L$0;
            ResultKt.b(objB);
            str = str2;
        }
        UserProfilePicComposableUISpecs userProfilePicComposableUISpecs = new UserProfilePicComposableUISpecs(null, 0.0f, 0.0f, 63);
        BorderUISpec borderUISpec = new BorderUISpec(ChaloThemeHelper.a().d, ChaloColorToken.IvoryYellow.f9812a, UIShape.Circle.p);
        float f = ChaloThemeHelper.a().n;
        float f2 = ChaloThemeHelper.a().b;
        UIShape.Circle imageClipShape = UIShape.Circle.p;
        ChaloPadding defaultProfileImagePadding = userProfilePicComposableUISpecs.b;
        Intrinsics.i(defaultProfileImagePadding, "defaultProfileImagePadding");
        ChaloColorToken.White defaultImageBackgroundColor = ChaloColorToken.White.f9870a;
        Intrinsics.i(defaultImageBackgroundColor, "defaultImageBackgroundColor");
        Intrinsics.i(imageClipShape, "imageClipShape");
        UserProfilePicComposableUIState userProfilePicComposableUIState = new UserProfilePicComposableUIState(new UserProfilePicComposableUISpecs(f2, f, defaultProfileImagePadding, imageClipShape, borderUISpec, defaultImageBackgroundColor), UserProfilePicComposableKt.b(gender3, 0.0f, 6));
        TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState(str, UITextStyle.TitleLarge, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, (ChaloColorToken) ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) objArr2, (UIFontWeight) objArr3, (Integer) objArr4, (UiEventHandler) objArr5, (UITextDecoration) objArr6, (UITextOverflow) objArr, (UIFontStyle) null, (String) null, 8184);
        float f3 = 0.0f;
        return new UserProfilingHomeStickyBannerUIState(userProfilePicComposableUIState, chaloTextUIState, chaloTextUIState2, new ImageUIState(IconType.IC_ORANGE_TINT_ARROW, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) (0 == true ? 1 : 0), f3, (UiEventHandler) (0 == true ? 1 : 0), 246), new v70(this, 4), UiEventHandler.Companion.a(new v70(this, 0)));
        String str3 = (String) objB;
        homeComponent$getStickyBannerUIState$1.L$0 = gender2;
        homeComponent$getStickyBannerUIState$1.L$1 = str3;
        homeComponent$getStickyBannerUIState$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.USER_PROFILING_HOME_STICKY_BANNER_SUBTITLE, new Object[0], homeComponent$getStickyBannerUIState$1);
        if (objB2 != coroutineSingletons) {
            Gender gender4 = gender2;
            str = str3;
            objB = objB2;
            gender3 = gender4;
            UserProfilePicComposableUISpecs userProfilePicComposableUISpecs2 = new UserProfilePicComposableUISpecs(null, 0.0f, 0.0f, 63);
            BorderUISpec borderUISpec2 = new BorderUISpec(ChaloThemeHelper.a().d, ChaloColorToken.IvoryYellow.f9812a, UIShape.Circle.p);
            float f4 = ChaloThemeHelper.a().n;
            float f5 = ChaloThemeHelper.a().b;
            UIShape.Circle imageClipShape2 = UIShape.Circle.p;
            ChaloPadding defaultProfileImagePadding2 = userProfilePicComposableUISpecs2.b;
            Intrinsics.i(defaultProfileImagePadding2, "defaultProfileImagePadding");
            ChaloColorToken.White defaultImageBackgroundColor2 = ChaloColorToken.White.f9870a;
            Intrinsics.i(defaultImageBackgroundColor2, "defaultImageBackgroundColor");
            Intrinsics.i(imageClipShape2, "imageClipShape");
            UserProfilePicComposableUIState userProfilePicComposableUIState2 = new UserProfilePicComposableUIState(new UserProfilePicComposableUISpecs(f5, f4, defaultProfileImagePadding2, imageClipShape2, borderUISpec2, defaultImageBackgroundColor2), UserProfilePicComposableKt.b(gender3, 0.0f, 6));
            TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState(str, UITextStyle.TitleLarge, ChaloColorToken.Black.f9759a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
            Object[] objArr7 = 0 == true ? 1 : 0;
            Object[] objArr8 = 0 == true ? 1 : 0;
            Object[] objArr9 = 0 == true ? 1 : 0;
            Object[] objArr10 = 0 == true ? 1 : 0;
            Object[] objArr11 = 0 == true ? 1 : 0;
            Object[] objArr12 = 0 == true ? 1 : 0;
            TextUIState.ChaloTextUIState chaloTextUIState4 = new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodySmall, (ChaloColorToken) ChaloColorToken.AlmostBlackColor.f9756a, 0, (UITextAlign) objArr8, (UIFontWeight) objArr9, (Integer) objArr10, (UiEventHandler) objArr11, (UITextDecoration) objArr12, (UITextOverflow) objArr7, (UIFontStyle) null, (String) null, 8184);
            float f6 = 0.0f;
            return new UserProfilingHomeStickyBannerUIState(userProfilePicComposableUIState2, chaloTextUIState3, chaloTextUIState4, new ImageUIState(IconType.IC_ORANGE_TINT_ARROW, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) (0 == true ? 1 : 0), f6, (UiEventHandler) (0 == true ? 1 : 0), 246), new v70(this, 4), UiEventHandler.Companion.a(new v70(this, 0)));
        }
        return coroutineSingletons;
    }

    public final void g1(BottomNavTabType bottomNavTabType) {
        LinkedHashMap linkedHashMap = this.P0;
        Object obj = linkedHashMap.get(bottomNavTabType);
        if (obj == null) {
            obj = 0;
        }
        linkedHashMap.put(bottomNavTabType, Integer.valueOf(((Number) obj).intValue() + 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TabChild h1(HomeScreenBottomTabConfiguration homeScreenBottomTabConfiguration, ComponentContext componentContext, NavigationTabAppModel navigationTabAppModel) {
        Scope scopeI0;
        ClassReference classReferenceA;
        ParametersHolder parametersHolderA;
        Scope scopeI1;
        ClassReference classReferenceA2;
        ParametersHolder parametersHolderA2;
        Scope scopeI2;
        ClassReference classReferenceA3;
        ParametersHolder parametersHolderA3;
        Scope scopeI3;
        ClassReference classReferenceA4;
        ParametersHolder parametersHolderA4;
        List list;
        Object next;
        if (navigationTabAppModel == null) {
            HomeScreenConfigAppModel homeScreenConfigAppModel = ((HomeScreenFragmentViewState) this.f.getValue()).d;
            if (homeScreenConfigAppModel == null || (list = homeScreenConfigAppModel.c) == null) {
                navigationTabAppModel = null;
            } else {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (BottomNavTabAppModelKt.a((NavigationTabAppModel) next) != homeScreenBottomTabConfiguration.f3204a);
                navigationTabAppModel = (NavigationTabAppModel) next;
            }
        }
        boolean zD = Intrinsics.d(homeScreenBottomTabConfiguration, HomeScreenBottomTabConfiguration.HomeTab.INSTANCE);
        GlobalContext globalContext = GlobalContext.f18817a;
        HomeTabVisibilityController homeTabVisibilityController = this.M0;
        if (zD) {
            if (this instanceof KoinScopeComponent) {
                scopeI3 = ((KoinScopeComponent) this).getF18811a();
                classReferenceA4 = Reflection.a(HomeScreenComponent.class);
                scopeI3.getClass();
                parametersHolderA4 = ParametersHolderKt.a(componentContext, homeTabVisibilityController, BottomNavTabType.HOME);
            } else {
                scopeI3 = globalContext.a().c.d;
                classReferenceA4 = Reflection.a(HomeScreenComponent.class);
                scopeI3.getClass();
                parametersHolderA4 = ParametersHolderKt.a(componentContext, homeTabVisibilityController, BottomNavTabType.HOME);
            }
            return new TabChild.HomeTab((HomeScreenComponent) scopeI3.d(classReferenceA4, parametersHolderA4, null), navigationTabAppModel instanceof NavigationTabAppModel.HomeTab ? (NavigationTabAppModel.HomeTab) navigationTabAppModel : null);
        }
        if (Intrinsics.d(homeScreenBottomTabConfiguration, HomeScreenBottomTabConfiguration.RegularBusTab.INSTANCE)) {
            if (this instanceof KoinScopeComponent) {
                scopeI2 = ((KoinScopeComponent) this).getF18811a();
                classReferenceA3 = Reflection.a(RegularBusComponent.class);
                scopeI2.getClass();
                parametersHolderA3 = ParametersHolderKt.a(componentContext, homeTabVisibilityController, BottomNavTabType.REGULAR_BUS);
            } else {
                scopeI2 = globalContext.a().c.d;
                classReferenceA3 = Reflection.a(RegularBusComponent.class);
                scopeI2.getClass();
                parametersHolderA3 = ParametersHolderKt.a(componentContext, homeTabVisibilityController, BottomNavTabType.REGULAR_BUS);
            }
            return new TabChild.RegularBusTab((RegularBusComponent) scopeI2.d(classReferenceA3, parametersHolderA3, null), navigationTabAppModel instanceof NavigationTabAppModel.RegularBusTab ? (NavigationTabAppModel.RegularBusTab) navigationTabAppModel : null);
        }
        if (Intrinsics.d(homeScreenBottomTabConfiguration, HomeScreenBottomTabConfiguration.ChaloBusTab.INSTANCE)) {
            if (this instanceof KoinScopeComponent) {
                scopeI1 = ((KoinScopeComponent) this).getF18811a();
                classReferenceA2 = Reflection.a(ChaloBusComponent.class);
                scopeI1.getClass();
                parametersHolderA2 = ParametersHolderKt.a(componentContext, homeTabVisibilityController, BottomNavTabType.CHALO_BUS);
            } else {
                scopeI1 = globalContext.a().c.d;
                classReferenceA2 = Reflection.a(ChaloBusComponent.class);
                scopeI1.getClass();
                parametersHolderA2 = ParametersHolderKt.a(componentContext, homeTabVisibilityController, BottomNavTabType.CHALO_BUS);
            }
            return new TabChild.ChaloBusTab((ChaloBusComponent) scopeI1.d(classReferenceA2, parametersHolderA2, null), navigationTabAppModel instanceof NavigationTabAppModel.ChaloBusTab ? (NavigationTabAppModel.ChaloBusTab) navigationTabAppModel : null);
        }
        if (!Intrinsics.d(homeScreenBottomTabConfiguration, HomeScreenBottomTabConfiguration.MyTicketsTab.INSTANCE)) {
            if (Intrinsics.d(homeScreenBottomTabConfiguration, HomeScreenBottomTabConfiguration.UnknownTab.INSTANCE)) {
                return TabChild.UnknownTab.f3192a;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (this instanceof KoinScopeComponent) {
            scopeI0 = ((KoinScopeComponent) this).getF18811a();
            classReferenceA = Reflection.a(MyTicketsComponent.class);
            scopeI0.getClass();
            parametersHolderA = ParametersHolderKt.a(componentContext, homeTabVisibilityController, BottomNavTabType.MY_TICKETS);
        } else {
            scopeI0 = globalContext.a().c.d;
            classReferenceA = Reflection.a(MyTicketsComponent.class);
            scopeI0.getClass();
            parametersHolderA = ParametersHolderKt.a(componentContext, homeTabVisibilityController, BottomNavTabType.MY_TICKETS);
        }
        return new TabChild.MyTicketsTab((MyTicketsComponent) scopeI0.d(classReferenceA, parametersHolderA, null), navigationTabAppModel instanceof NavigationTabAppModel.MyTicketsTab ? (NavigationTabAppModel.MyTicketsTab) navigationTabAppModel : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart, kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r10v18 */
    public final Object j1(HomeScreenConfigAppModel homeScreenConfigAppModel, ContinuationImpl continuationImpl) {
        HomeComponent$onConfigurationLoaded$1 homeComponent$onConfigurationLoaded$1;
        String lowerCase;
        int i;
        String str;
        HomeScreenConfigAppModel homeScreenConfigAppModel2;
        ?? r10;
        NavigationTabAppModel navigationTabAppModel;
        NavigationTabAppModel navigationTabAppModel2;
        NavigationTabAppModel navigationTabAppModel3;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        if (continuationImpl instanceof HomeComponent$onConfigurationLoaded$1) {
            homeComponent$onConfigurationLoaded$1 = (HomeComponent$onConfigurationLoaded$1) continuationImpl;
            int i2 = homeComponent$onConfigurationLoaded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                homeComponent$onConfigurationLoaded$1.label = i2 - Integer.MIN_VALUE;
            } else {
                homeComponent$onConfigurationLoaded$1 = new HomeComponent$onConfigurationLoaded$1(this, continuationImpl);
            }
        } else {
            homeComponent$onConfigurationLoaded$1 = new HomeComponent$onConfigurationLoaded$1(this, continuationImpl);
        }
        Object obj = homeComponent$onConfigurationLoaded$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = homeComponent$onConfigurationLoaded$1.label;
        HomeTabVisibilityController homeTabVisibilityController = this.M0;
        DefaultStackNavigation defaultStackNavigation = this.Q0;
        Value value5 = this.b1;
        HomeTabScreensNavigationAndStateManager homeTabScreensNavigationAndStateManager = this.P;
        StateFlow stateFlow = this.f;
        MutableValue mutableValue = this.N0;
        if (i3 == 0) {
            ResultKt.b(obj);
            CityProvider cityProvider = this.m;
            String strH = cityProvider.h();
            if (strH != null) {
                lowerCase = strH.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
            } else {
                String strB = CityProviderKt.b(cityProvider);
                if (strB != null) {
                    lowerCase = strB.toLowerCase(Locale.ROOT);
                    Intrinsics.h(lowerCase, "toLowerCase(...)");
                } else {
                    lowerCase = null;
                }
            }
            if (Intrinsics.d(lowerCase, ((HomeScreenFragmentViewState) stateFlow.getValue()).e)) {
                i = 0;
            } else {
                String str2 = ((HomeScreenFragmentViewState) stateFlow.getValue()).e;
                i = 0;
                String message = "handleCityChanged newCityId=" + lowerCase + " previous=" + str2;
                Intrinsics.i(message, "message");
                if (!(((ChildStack) value5.a()).f12382a.f12283a instanceof HomeScreenBottomTabConfiguration.UnknownTab)) {
                    final HomeScreenBottomTabConfiguration[] homeScreenBottomTabConfigurationArr = {HomeScreenBottomTabConfiguration.UnknownTab.INSTANCE};
                    defaultStackNavigation.b(new Function1<List<? extends HomeScreenBottomTabConfiguration>, List<? extends HomeScreenBottomTabConfiguration>>() { // from class: app.chalo.home.ui.base.HomeComponent$handleCityChanged$$inlined$replaceAll$default$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            List it = (List) obj3;
                            Intrinsics.i(it, "it");
                            return ArraysKt.h0(homeScreenBottomTabConfigurationArr);
                        }
                    }, new HomeComponent$handleCityChanged$$inlined$replaceAll$default$2());
                }
                homeTabScreensNavigationAndStateManager.e();
                homeTabVisibilityController.f3227a.setValue(null);
                this.g1 = null;
                List<TabComponentEntry> list = (List) mutableValue.a();
                if (!list.isEmpty()) {
                    for (TabComponentEntry tabComponentEntry : list) {
                        Z0(tabComponentEntry.d);
                        g1(tabComponentEntry.f3193a);
                    }
                }
                mutableValue.c(EmptyList.f17557a);
                Job job = this.D0;
                boolean z = job != null && ((AbstractCoroutine) job).isActive();
                if ((str2 != null && !StringsKt.F(str2)) || !z) {
                    Job job2 = this.D0;
                    if (job2 != null) {
                        r10 = 0;
                        ((JobSupport) job2).cancel(null);
                    } else {
                        r10 = 0;
                    }
                    this.D0 = r10;
                    BuildersKt.d(this.j, r10, r10, new HomeComponent$restartPremiumBusPrfBackfillCollector$1(this, r10), 3);
                }
            }
            homeComponent$onConfigurationLoaded$1.L$0 = homeScreenConfigAppModel;
            homeComponent$onConfigurationLoaded$1.L$1 = lowerCase;
            homeComponent$onConfigurationLoaded$1.label = 1;
            Object objD1 = d1(homeScreenConfigAppModel, homeComponent$onConfigurationLoaded$1);
            if (objD1 == obj2) {
                return obj2;
            }
            str = lowerCase;
            obj = objD1;
            homeScreenConfigAppModel2 = homeScreenConfigAppModel;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) homeComponent$onConfigurationLoaded$1.L$1;
            homeScreenConfigAppModel2 = (HomeScreenConfigAppModel) homeComponent$onConfigurationLoaded$1.L$0;
            ResultKt.b(obj);
            str = str3;
            i = 0;
        }
        NavigationTabAppModel navigationTabAppModel4 = (NavigationTabAppModel) obj;
        NavigationTabAppModel navigationTabAppModel5 = navigationTabAppModel4 == null ? ((HomeScreenFragmentViewState) stateFlow.getValue()).f3225a : navigationTabAppModel4;
        NavigationTabAppModel navigationTabAppModel6 = (NavigationTabAppModel) CollectionsKt.L(i, homeScreenConfigAppModel2.c);
        if (navigationTabAppModel6 == null) {
            navigationTabAppModel6 = ((HomeScreenFragmentViewState) stateFlow.getValue()).b;
        }
        NavigationTabAppModel navigationTabAppModel7 = navigationTabAppModel6;
        E0(new n3(this, navigationTabAppModel7, homeScreenConfigAppModel2, str, 7));
        List list2 = homeScreenConfigAppModel2.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list2) {
            if (HomeScreenBottomTabConfigurationKt.a(BottomNavTabAppModelKt.a((NavigationTabAppModel) obj3)) != null) {
                arrayList.add(obj3);
            }
        }
        Iterable iterable = (Iterable) mutableValue.a();
        int iG = MapsKt.g(CollectionsKt.v(iterable, 10));
        if (iG < 16) {
            iG = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG);
        for (Object obj4 : iterable) {
            linkedHashMap.put(((TabComponentEntry) obj4).f3193a, obj4);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj5 = arrayList.get(i4);
            i4++;
            NavigationTabAppModel navigationTabAppModel8 = (NavigationTabAppModel) obj5;
            BottomNavTabType bottomNavTabType = navigationTabAppModel8.f3761a.d;
            linkedHashSet.add(bottomNavTabType);
            NavigationTabAppModel navigationTabAppModel9 = navigationTabAppModel7;
            TabComponentEntry tabComponentEntry2 = (TabComponentEntry) linkedHashMap.get(bottomNavTabType);
            if (tabComponentEntry2 != null) {
                if (tabComponentEntry2.b.equals(navigationTabAppModel8)) {
                    navigationTabAppModel3 = navigationTabAppModel5;
                } else {
                    TabChild myTicketsTab = tabComponentEntry2.d;
                    boolean z2 = myTicketsTab instanceof TabChild.HomeTab;
                    TabChild.UnknownTab unknownTab = TabChild.UnknownTab.f3192a;
                    if (z2) {
                        navigationTabAppModel3 = navigationTabAppModel5;
                        if (!(navigationTabAppModel8 instanceof NavigationTabAppModel.HomeTab)) {
                            throw new IllegalArgumentException(("Expected HomeTab model for " + myTicketsTab + " but got " + navigationTabAppModel8).toString());
                        }
                        myTicketsTab = new TabChild.HomeTab(((TabChild.HomeTab) myTicketsTab).f3189a, (NavigationTabAppModel.HomeTab) navigationTabAppModel8);
                    } else {
                        navigationTabAppModel3 = navigationTabAppModel5;
                        if (myTicketsTab instanceof TabChild.RegularBusTab) {
                            if (!(navigationTabAppModel8 instanceof NavigationTabAppModel.RegularBusTab)) {
                                throw new IllegalArgumentException(("Expected RegularBusTab model for " + myTicketsTab + " but got " + navigationTabAppModel8).toString());
                            }
                            myTicketsTab = new TabChild.RegularBusTab(((TabChild.RegularBusTab) myTicketsTab).f3191a, (NavigationTabAppModel.RegularBusTab) navigationTabAppModel8);
                        } else if (myTicketsTab instanceof TabChild.ChaloBusTab) {
                            if (!(navigationTabAppModel8 instanceof NavigationTabAppModel.ChaloBusTab)) {
                                throw new IllegalArgumentException(("Expected ChaloBusTab model for " + myTicketsTab + " but got " + navigationTabAppModel8).toString());
                            }
                            myTicketsTab = new TabChild.ChaloBusTab(((TabChild.ChaloBusTab) myTicketsTab).f3188a, (NavigationTabAppModel.ChaloBusTab) navigationTabAppModel8);
                        } else if (myTicketsTab instanceof TabChild.MyTicketsTab) {
                            if (!(navigationTabAppModel8 instanceof NavigationTabAppModel.MyTicketsTab)) {
                                throw new IllegalArgumentException(("Expected MyTicketsTab model for " + myTicketsTab + " but got " + navigationTabAppModel8).toString());
                            }
                            myTicketsTab = new TabChild.MyTicketsTab(((TabChild.MyTicketsTab) myTicketsTab).f3190a, (NavigationTabAppModel.MyTicketsTab) navigationTabAppModel8);
                        } else if (!myTicketsTab.equals(unknownTab)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    if (myTicketsTab instanceof TabChild.HomeTab) {
                        if ((navigationTabAppModel8 instanceof NavigationTabAppModel.HomeTab ? (NavigationTabAppModel.HomeTab) navigationTabAppModel8 : null) != null) {
                            HomeScreenComponent homeScreenComponent = ((TabChild.HomeTab) myTicketsTab).f3189a;
                            homeScreenComponent.V = true;
                            MutableStateFlow mutableStateFlow = homeScreenComponent.i0;
                            do {
                                value4 = mutableStateFlow.getValue();
                            } while (!mutableStateFlow.c(value4, Integer.valueOf(((Number) value4).intValue() + 1)));
                        }
                    } else if (myTicketsTab instanceof TabChild.RegularBusTab) {
                        if ((navigationTabAppModel8 instanceof NavigationTabAppModel.RegularBusTab ? (NavigationTabAppModel.RegularBusTab) navigationTabAppModel8 : null) != null) {
                            RegularBusComponent regularBusComponent = ((TabChild.RegularBusTab) myTicketsTab).f3191a;
                            regularBusComponent.c0 = true;
                            regularBusComponent.b0 = true;
                            MutableStateFlow mutableStateFlow2 = regularBusComponent.u0;
                            do {
                                value3 = mutableStateFlow2.getValue();
                            } while (!mutableStateFlow2.c(value3, Integer.valueOf(((Number) value3).intValue() + 1)));
                        }
                    } else if (myTicketsTab instanceof TabChild.ChaloBusTab) {
                        if ((navigationTabAppModel8 instanceof NavigationTabAppModel.ChaloBusTab ? (NavigationTabAppModel.ChaloBusTab) navigationTabAppModel8 : null) != null) {
                            ChaloBusComponent chaloBusComponent = ((TabChild.ChaloBusTab) myTicketsTab).f3188a;
                            chaloBusComponent.V = true;
                            MutableStateFlow mutableStateFlow3 = chaloBusComponent.n0;
                            do {
                                value2 = mutableStateFlow3.getValue();
                            } while (!mutableStateFlow3.c(value2, Integer.valueOf(((Number) value2).intValue() + 1)));
                        }
                    } else if (myTicketsTab instanceof TabChild.MyTicketsTab) {
                        if ((navigationTabAppModel8 instanceof NavigationTabAppModel.MyTicketsTab ? (NavigationTabAppModel.MyTicketsTab) navigationTabAppModel8 : null) != null) {
                            MyTicketsComponent myTicketsComponent = ((TabChild.MyTicketsTab) myTicketsTab).f3190a;
                            myTicketsComponent.l0 = true;
                            MutableStateFlow mutableStateFlow4 = myTicketsComponent.p0;
                            do {
                                value = mutableStateFlow4.getValue();
                            } while (!mutableStateFlow4.c(value, Integer.valueOf(((Number) value).intValue() + 1)));
                        }
                    } else if (!myTicketsTab.equals(unknownTab)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    BottomNavTabType tabType = tabComponentEntry2.f3193a;
                    ComponentContext componentContext = tabComponentEntry2.c;
                    Intrinsics.i(tabType, "tabType");
                    Intrinsics.i(componentContext, "componentContext");
                    tabComponentEntry2 = new TabComponentEntry(tabType, navigationTabAppModel8, componentContext, myTicketsTab);
                }
                arrayList2.add(tabComponentEntry2);
            } else {
                arrayList = arrayList;
                value5 = value5;
                navigationTabAppModel3 = navigationTabAppModel5;
                LinkedHashMap linkedHashMap2 = this.P0;
                Object obj6 = linkedHashMap2.get(bottomNavTabType);
                if (obj6 == null) {
                    obj6 = 0;
                    linkedHashMap2.put(bottomNavTabType, obj6);
                }
                int iIntValue = ((Number) obj6).intValue();
                String key = "home-tab-component-" + bottomNavTabType.name() + "-" + iIntValue;
                ComponentContext componentContext2 = this.k;
                Intrinsics.i(componentContext2, "<this>");
                Intrinsics.i(key, "key");
                ComponentContext componentContextA = componentContext2.getE().a(componentContext2.getF12286a(), ChildStateKeeperKt.a(componentContext2.getB(), key), ChildInstanceKeeperKt.a(componentContext2.getC(), key), ChildBackHandlerKt.a(componentContext2.getD(), 0));
                HomeScreenBottomTabConfiguration homeScreenBottomTabConfigurationA = HomeScreenBottomTabConfigurationKt.a(bottomNavTabType);
                if (homeScreenBottomTabConfigurationA == null) {
                    throw new IllegalStateException((bottomNavTabType + " is not supported for tab components").toString());
                }
                arrayList2.add(new TabComponentEntry(bottomNavTabType, navigationTabAppModel8, componentContextA, h1(homeScreenBottomTabConfigurationA, componentContextA, navigationTabAppModel8)));
            }
            arrayList = arrayList;
            navigationTabAppModel7 = navigationTabAppModel9;
            navigationTabAppModel5 = navigationTabAppModel3;
            value5 = value5;
            size = size;
            linkedHashMap = linkedHashMap;
        }
        NavigationTabAppModel navigationTabAppModel10 = navigationTabAppModel7;
        Value value6 = value5;
        NavigationTabAppModel navigationTabAppModel11 = navigationTabAppModel5;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!linkedHashSet.contains((BottomNavTabType) entry.getKey())) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        for (TabComponentEntry tabComponentEntry3 : linkedHashMap3.values()) {
            Z0(tabComponentEntry3.d);
            g1(tabComponentEntry3.f3193a);
        }
        mutableValue.c(arrayList2);
        Iterable iterable2 = (Iterable) mutableValue.a();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.v(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((TabComponentEntry) it.next()).f3193a);
        }
        Set activeTabs = CollectionsKt.G0(arrayList3);
        homeTabVisibilityController.getClass();
        Intrinsics.i(activeTabs, "activeTabs");
        MutableStateFlow mutableStateFlow5 = homeTabVisibilityController.f3227a;
        BottomNavTabType bottomNavTabType2 = (BottomNavTabType) mutableStateFlow5.getValue();
        if (bottomNavTabType2 != null && !activeTabs.contains(bottomNavTabType2)) {
            mutableStateFlow5.setValue(CollectionsKt.G(activeTabs));
        }
        homeTabScreensNavigationAndStateManager.d(activeTabs);
        BottomNavTabType bottomNavTabType3 = this.g1;
        if (bottomNavTabType3 != null && !CollectionsKt.w(activeTabs, bottomNavTabType3)) {
            this.g1 = null;
        }
        Set set = activeTabs;
        if (CollectionsKt.w(set, navigationTabAppModel11 != null ? BottomNavTabAppModelKt.a(navigationTabAppModel11) : null)) {
            navigationTabAppModel = navigationTabAppModel11;
        } else {
            TabComponentEntry tabComponentEntry4 = (TabComponentEntry) CollectionsKt.H((List) mutableValue.a());
            navigationTabAppModel = tabComponentEntry4 != null ? tabComponentEntry4.b : null;
        }
        if (CollectionsKt.w(set, navigationTabAppModel10 != null ? BottomNavTabAppModelKt.a(navigationTabAppModel10) : null)) {
            navigationTabAppModel2 = navigationTabAppModel10;
        } else {
            TabComponentEntry tabComponentEntry5 = (TabComponentEntry) CollectionsKt.H((List) mutableValue.a());
            navigationTabAppModel2 = tabComponentEntry5 != null ? tabComponentEntry5.b : null;
        }
        if (navigationTabAppModel == null || navigationTabAppModel2 == null) {
            t1(null);
        } else {
            if (i1((TabChild) ((ChildStack) value6.a()).f12382a.b)) {
                final HomeScreenBottomTabConfiguration[] homeScreenBottomTabConfigurationArr2 = {HomeScreenBottomTabConfiguration.UnknownTab.INSTANCE};
                defaultStackNavigation.b(new Function1<List<? extends HomeScreenBottomTabConfiguration>, List<? extends HomeScreenBottomTabConfiguration>>() { // from class: app.chalo.home.ui.base.HomeComponent$onConfigurationLoaded$$inlined$replaceAll$default$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        List it2 = (List) obj7;
                        Intrinsics.i(it2, "it");
                        return ArraysKt.h0(homeScreenBottomTabConfigurationArr2);
                    }
                }, new HomeComponent$onConfigurationLoaded$$inlined$replaceAll$default$2());
            }
            homeTabScreensNavigationAndStateManager.a(BottomNavTabAppModelKt.a(navigationTabAppModel2), BottomNavTabAppModelKt.a(navigationTabAppModel));
            t1(BottomNavTabAppModelKt.a(navigationTabAppModel));
        }
        return Unit.f17538a;
    }

    public final void k1() {
        if (this.B0) {
            Job job = this.C0;
            if (job == null || !((AbstractCoroutine) job).isActive()) {
                this.C0 = BuildersKt.d(this.j, null, null, new HomeComponent$presentUserProfileHooksIfReady$1(this, null), 3);
                return;
            } else {
                this.G0 = true;
                return;
            }
        }
        this.G0 = false;
        StateFlow stateFlow = this.f;
        NavigationTabAppModel navigationTabAppModel = ((HomeScreenFragmentViewState) stateFlow.getValue()).f3225a;
        s1(navigationTabAppModel != null ? BottomNavTabAppModelKt.a(navigationTabAppModel) : null);
        NavigationTabAppModel navigationTabAppModel2 = ((HomeScreenFragmentViewState) stateFlow.getValue()).f3225a;
        q1(navigationTabAppModel2 != null ? BottomNavTabAppModelKt.a(navigationTabAppModel2) : null);
        NavigationTabAppModel navigationTabAppModel3 = ((HomeScreenFragmentViewState) stateFlow.getValue()).f3225a;
        r1(navigationTabAppModel3 != null ? BottomNavTabAppModelKt.a(navigationTabAppModel3) : null);
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0293  */
    /* JADX WARN: Code duplicated, block: B:61:0x0130  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [app.chalo.scenes.ChaloNavOptions, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void l1(HomeScreenFragmentViewIntent intent) {
        boolean z;
        Integer num;
        Source source;
        String str;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z2 = true;
        Object objA = 0;
        if (intent instanceof HomeScreenFragmentViewIntent.ViewCreatedIntent) {
            if (this.d) {
                return;
            }
            this.d = true;
            w0(new HomeComponent$handleViewCreatedIntent$1(this, null));
            return;
        }
        boolean z3 = intent instanceof HomeScreenFragmentViewIntent.BottomSheetNegativeButtonClickIntent;
        ContextScope contextScope = this.j;
        if (z3) {
            BuildersKt.d(contextScope, null, null, new HomeComponent$handleBottomSheetNegativeButtonClickIntent$1((HomeScreenFragmentViewIntent.BottomSheetNegativeButtonClickIntent) intent, this, null), 3);
            return;
        }
        if (intent instanceof HomeScreenFragmentViewIntent.BottomSheetPositiveButtonClickIntent) {
            BuildersKt.d(contextScope, null, null, new HomeComponent$handleBottomSheetPositiveButtonClickIntent$1(this, (HomeScreenFragmentViewIntent.BottomSheetPositiveButtonClickIntent) intent, null), 3);
            return;
        }
        boolean zEquals = intent.equals(HomeScreenFragmentViewIntent.OnRetryHomeScreenConfigFetchIntent.f3218a);
        String str2 = "";
        CityProvider cityProvider = this.m;
        if (zEquals) {
            E0(new u60(13));
            String strH = cityProvider.h();
            a1(strH != null ? strH : "");
            return;
        }
        boolean zEquals2 = intent.equals(HomeScreenFragmentViewIntent.LocationItemClickedIntent.f3217a);
        int i = 6;
        HomeScreenAnalyticsHelper homeScreenAnalyticsHelper = this.C;
        ChaloNavigationManager chaloNavigationManager = this.M;
        if (zEquals2) {
            Source source2 = Source.HOME_SCREEN_TAB;
            CityAppModel cityAppModel = (CityAppModel) cityProvider.getE().getValue();
            if (cityAppModel != null && (str = cityAppModel.f8854a) != null) {
                str2 = str;
            }
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "city change card clicked", vo1.s("currentCity", str2), source2, 12);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(CitySelectionArgs.Companion.a(CitySelectionArgs.INSTANCE, Source.HOME_SCREEN_MAIN_FRAGMENT, null, 6), objA, objA, i));
            return;
        }
        if (intent.equals(HomeScreenFragmentViewIntent.HandleNotificationPermissionDeniedIntent.f3213a)) {
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "notification permission denied", null, Source.HOME_SCREEN, 14);
            return;
        }
        if (intent.equals(HomeScreenFragmentViewIntent.HandleNotificationPermissionGrantedIntent.f3214a)) {
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "notification permission granted", null, Source.HOME_SCREEN, 14);
            return;
        }
        boolean z4 = intent instanceof HomeScreenFragmentViewIntent.SelectBottomNavTab;
        HomeTabScreensNavigationAndStateManager homeTabScreensNavigationAndStateManager = this.P;
        StateFlow stateFlow = this.f;
        if (z4) {
            HomeScreenFragmentViewIntent.SelectBottomNavTab selectBottomNavTab = (HomeScreenFragmentViewIntent.SelectBottomNavTab) intent;
            NavigationTabAppModel navigationTabAppModel = ((HomeScreenFragmentViewState) stateFlow.getValue()).f3225a;
            BottomNavTabType bottomNavTabTypeA = navigationTabAppModel != null ? BottomNavTabAppModelKt.a(navigationTabAppModel) : null;
            NavigationTabAppModel navigationTabAppModel2 = selectBottomNavTab.f3221a;
            String message = "handleSelectBottomNavTabIntent tab=" + BottomNavTabAppModelKt.a(navigationTabAppModel2) + " shouldStartFresh=false previous=" + bottomNavTabTypeA;
            Intrinsics.i(message, "message");
            homeTabScreensNavigationAndStateManager.c(navigationTabAppModel2.f3761a.d, false);
            if (bottomNavTabTypeA != null) {
                switch (WhenMappings.c[bottomNavTabTypeA.ordinal()]) {
                    case 1:
                        source = Source.HOME_SCREEN_TAB;
                        break;
                    case 2:
                        source = Source.REGULAR_BUS_SCREEN_TAB;
                        break;
                    case 3:
                        source = Source.CHALO_BUS_SCREEN_TAB;
                        break;
                    case 4:
                        source = Source.MY_TICKETS_SCREEN_TAB;
                        break;
                    case 5:
                        source = Source.SEARCH_TAB;
                        break;
                    case 6:
                        source = Source.UNKNOWN;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                if (source == null) {
                    source = Source.UNKNOWN;
                }
            } else {
                source = Source.UNKNOWN;
            }
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "bottom nav item clicked", vo1.s("bottom nav item", BottomNavTabAppModelKt.a(navigationTabAppModel2).getTabType()), source, 12);
            return;
        }
        if (intent.equals(HomeScreenFragmentViewIntent.BackClicked.f3208a)) {
            homeTabScreensNavigationAndStateManager.goBack();
            return;
        }
        if (intent instanceof HomeScreenFragmentViewIntent.HomeScreenBottomNavSearchTabClickedIntent) {
            BuildersKt.d(contextScope, null, null, new HomeComponent$processIntent$1(this, null), 3);
            return;
        }
        if (intent instanceof HomeScreenFragmentViewIntent.HomeSurfaceReadinessChangedIntent) {
            boolean z5 = this.B0;
            boolean z6 = ((HomeScreenFragmentViewIntent.HomeSurfaceReadinessChangedIntent) intent).f3216a;
            if (z5 == z6) {
                return;
            }
            this.B0 = z6;
            k1();
            return;
        }
        if (intent instanceof HomeScreenFragmentViewIntent.UserProfilingStickyBannerClickedIntent) {
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "user profiling sticky banner clicked", null, Source.HOME_SCREEN_TAB, 14);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new UserProfileFormArgs(Source.HOME_SCREEN), objA, objA, i));
            return;
        }
        if (intent instanceof HomeScreenFragmentViewIntent.ChaloBusStickyBannerClickedIntent) {
            UserProfilingChaloBusStickyBannerUIState userProfilingChaloBusStickyBannerUIState = this.K0;
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, "pb user profile sticky banner clicked", userProfilingChaloBusStickyBannerUIState != null ? MapsKt.i(new Pair("pbSurveyCompletedSteps", Integer.valueOf(userProfilingChaloBusStickyBannerUIState.g)), new Pair("pbSurveyTotalSteps", Integer.valueOf(userProfilingChaloBusStickyBannerUIState.f))) : null, Source.HOME_SCREEN_TAB, 12);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new ChaloBusUserProfileSurveyArgs(Source.HOME_SCREEN), objA, objA, i));
            return;
        }
        if (intent.equals(HomeScreenFragmentViewIntent.DismissHomeDrawerIntent.f3212a)) {
            HomeScreenInfoHelper homeScreenInfoHelper = this.p;
            homeScreenInfoHelper.d(true);
            homeScreenInfoHelper.e();
            return;
        }
        if (intent instanceof HomeScreenFragmentViewIntent.UserProfilingHookDisplayedIntent) {
            HomeScreenFragmentViewIntent.UserProfilingHookDisplayedIntent userProfilingHookDisplayedIntent = (HomeScreenFragmentViewIntent.UserProfilingHookDisplayedIntent) intent;
            String str3 = WhenMappings.f3194a[userProfilingHookDisplayedIntent.f3222a.ordinal()] == 1 ? "pb user profile sticky banner shown" : "user profiling sticky banner shown";
            Integer num2 = userProfilingHookDisplayedIntent.b;
            HomeScreenAnalyticsHelper.DefaultImpls.a(homeScreenAnalyticsHelper, str3, (num2 == null || (num = userProfilingHookDisplayedIntent.c) == null) ? null : MapsKt.i(new Pair("pbSurveyCompletedSteps", num2), new Pair("pbSurveyTotalSteps", num)), Source.HOME_SCREEN, 12);
            BuildersKt.d(contextScope, null, null, new HomeComponent$handleUserProfilingHookDisplayedIntent$1(this, userProfilingHookDisplayedIntent, null), 3);
            return;
        }
        if (!(intent instanceof HomeScreenFragmentViewIntent.RideHailingUserFeedbackBottomsheetDataChangedIntent)) {
            if (!(intent instanceof HomeScreenFragmentViewIntent.RideHailingUserFeedbackBottomsheetUserCommentChangedIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new e40((HomeScreenFragmentViewIntent.RideHailingUserFeedbackBottomsheetUserCommentChangedIntent) intent, 7));
            return;
        }
        HomeScreenFragmentViewIntent.RideHailingUserFeedbackBottomsheetDataChangedIntent rideHailingUserFeedbackBottomsheetDataChangedIntent = (HomeScreenFragmentViewIntent.RideHailingUserFeedbackBottomsheetDataChangedIntent) intent;
        RideHailingUserFeedbackData rideHailingUserFeedbackData = ((HomeScreenFragmentViewState) stateFlow.getValue()).k;
        if (rideHailingUserFeedbackData != null) {
            List<UserFeedbackRatingData> list = rideHailingUserFeedbackData.b;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            for (UserFeedbackRatingData userFeedbackRatingData : list) {
                boolean z7 = userFeedbackRatingData.b == rideHailingUserFeedbackBottomsheetDataChangedIntent.f3219a ? z2 : false;
                List<UserFeedbackReasonData> list2 = userFeedbackRatingData.d;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list2, 10));
                for (UserFeedbackReasonData userFeedbackReasonData : list2) {
                    if (z7) {
                        int i2 = userFeedbackReasonData.f9174a;
                        Integer num3 = rideHailingUserFeedbackBottomsheetDataChangedIntent.b;
                        if (num3 != null && i2 == num3.intValue()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    arrayList2.add(UserFeedbackReasonData.a(userFeedbackReasonData, z));
                }
                arrayList.add(UserFeedbackRatingData.a(userFeedbackRatingData, z7, arrayList2, 3));
                z2 = true;
            }
            objA = RideHailingUserFeedbackData.a(rideHailingUserFeedbackData, arrayList, null, 5);
        }
        E0(new e40(objA, 9));
    }

    public final void m1(String str, Map map, List list) {
        Source source = Source.HOME_SCREEN;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("promptCount", Integer.valueOf(list.size()));
        PendingRideFeedbackAppModel pendingRideFeedbackAppModel = (PendingRideFeedbackAppModel) CollectionsKt.H(list);
        if (pendingRideFeedbackAppModel != null) {
            mapBuilder.put("bookingId", pendingRideFeedbackAppModel.f9066a);
            mapBuilder.put("productType", pendingRideFeedbackAppModel.k);
            mapBuilder.put("productSubType", pendingRideFeedbackAppModel.l);
        }
        mapBuilder.putAll(map);
        HomeScreenAnalyticsHelper.DefaultImpls.a(this.C, str, mapBuilder.h(), source, 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r6.m(r8, "", r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n1(java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof app.chalo.home.ui.base.HomeComponent$setDefaultValuesForSeatAvailability$1
            if (r0 == 0) goto L13
            r0 = r9
            app.chalo.home.ui.base.HomeComponent$setDefaultValuesForSeatAvailability$1 r0 = (app.chalo.home.ui.base.HomeComponent$setDefaultValuesForSeatAvailability$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.home.ui.base.HomeComponent$setDefaultValuesForSeatAvailability$1 r0 = new app.chalo.home.ui.base.HomeComponent$setDefaultValuesForSeatAvailability$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            app.chalo.livetracking.frameworklivetracking.data.local.LiveTrackingConfigDataStore r6 = r7.e0
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.ResultKt.b(r9)
            goto L71
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r0.L$0
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.b(r9)
            goto L63
        L3f:
            java.lang.Object r8 = r0.L$0
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.b(r9)
            goto L56
        L47:
            kotlin.ResultKt.b(r9)
            r0.L$0 = r8
            r0.label = r5
            r9 = 0
            java.lang.Object r9 = r6.c(r8, r0, r9)
            if (r9 != r1) goto L56
            goto L70
        L56:
            r0.L$0 = r8
            r0.label = r4
            java.lang.String r9 = "0"
            java.lang.Object r9 = r6.n(r8, r9, r0)
            if (r9 != r1) goto L63
            goto L70
        L63:
            r9 = 0
            r0.L$0 = r9
            r0.label = r3
            java.lang.String r9 = ""
            java.lang.Object r8 = r6.m(r8, r9, r0)
            if (r8 != r1) goto L71
        L70:
            return r1
        L71:
            kotlin.Unit r8 = kotlin.Unit.f17538a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.base.HomeComponent.n1(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Job o1(long j) {
        return BuildersKt.d(this.j, null, null, new HomeComponent$setSuperPassApplicationUpdateShownToUser$1(this, j, null), 3);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (HomeScreenFragmentViewState) obj;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p1(ContinuationImpl continuationImpl) {
        HomeComponent$showNotificationPermissionBottomSheetIfRequired$1 homeComponent$showNotificationPermissionBottomSheetIfRequired$1;
        boolean zBooleanValue;
        long j;
        if (continuationImpl instanceof HomeComponent$showNotificationPermissionBottomSheetIfRequired$1) {
            homeComponent$showNotificationPermissionBottomSheetIfRequired$1 = (HomeComponent$showNotificationPermissionBottomSheetIfRequired$1) continuationImpl;
            int i = homeComponent$showNotificationPermissionBottomSheetIfRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeComponent$showNotificationPermissionBottomSheetIfRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                homeComponent$showNotificationPermissionBottomSheetIfRequired$1 = new HomeComponent$showNotificationPermissionBottomSheetIfRequired$1(this, continuationImpl);
            }
        } else {
            homeComponent$showNotificationPermissionBottomSheetIfRequired$1 = new HomeComponent$showNotificationPermissionBottomSheetIfRequired$1(this, continuationImpl);
        }
        Object objV = homeComponent$showNotificationPermissionBottomSheetIfRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeComponent$showNotificationPermissionBottomSheetIfRequired$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objV);
            LocalDataStore$getFlowFromLocalDataStore$$inlined$map$1 localDataStore$getFlowFromLocalDataStore$$inlined$map$1E = this.n.e(PreferencesKeys.stringKey("appSessionCount"));
            homeComponent$showNotificationPermissionBottomSheetIfRequired$1.label = 1;
            objV = FlowKt.v(localDataStore$getFlowFromLocalDataStore$$inlined$map$1E, homeComponent$showNotificationPermissionBottomSheetIfRequired$1);
            if (objV != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objV);
        } else {
            if (i2 == 2) {
                zBooleanValue = homeComponent$showNotificationPermissionBottomSheetIfRequired$1.Z$0;
                j = homeComponent$showNotificationPermissionBottomSheetIfRequired$1.J$0;
                ResultKt.b(objV);
                int i3 = ((MiscellaneousCityWiseConfigForCity) objV).l;
                if (zBooleanValue && j % ((long) i3) == 0) {
                    homeComponent$showNotificationPermissionBottomSheetIfRequired$1.label = 3;
                    objV = this.J.a(homeComponent$showNotificationPermissionBottomSheetIfRequired$1);
                    if (objV != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                return unit;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objV);
                return unit;
            }
            ResultKt.b(objV);
        }
        if (!((Boolean) objV).booleanValue()) {
            HomeScreenAnalyticsHelper.DefaultImpls.a(this.C, "notification permission bottomsheet rendered", null, Source.HOME_SCREEN_TAB, 14);
            homeComponent$showNotificationPermissionBottomSheetIfRequired$1.label = 4;
            if (this.p.n(95, CommonBottomSheetType.NotificationPermissionBottomSheet.b, homeComponent$showNotificationPermissionBottomSheetIfRequired$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
        String str = (String) objV;
        long j2 = str != null ? Long.parseLong(str) : 0L;
        zBooleanValue = ((Boolean) this.v.getG().getValue()).booleanValue();
        homeComponent$showNotificationPermissionBottomSheetIfRequired$1.J$0 = j2;
        homeComponent$showNotificationPermissionBottomSheetIfRequired$1.Z$0 = zBooleanValue;
        homeComponent$showNotificationPermissionBottomSheetIfRequired$1.label = 2;
        objV = this.K.a(homeComponent$showNotificationPermissionBottomSheetIfRequired$1);
        if (objV != coroutineSingletons) {
            j = j2;
            int i4 = ((MiscellaneousCityWiseConfigForCity) objV).l;
            if (zBooleanValue) {
                homeComponent$showNotificationPermissionBottomSheetIfRequired$1.label = 3;
                objV = this.J.a(homeComponent$showNotificationPermissionBottomSheetIfRequired$1);
                if (objV != coroutineSingletons) {
                    if (!((Boolean) objV).booleanValue()) {
                        HomeScreenAnalyticsHelper.DefaultImpls.a(this.C, "notification permission bottomsheet rendered", null, Source.HOME_SCREEN_TAB, 14);
                        homeComponent$showNotificationPermissionBottomSheetIfRequired$1.label = 4;
                        if (this.p.n(95, CommonBottomSheetType.NotificationPermissionBottomSheet.b, homeComponent$showNotificationPermissionBottomSheetIfRequired$1) == coroutineSingletons) {
                        }
                    }
                }
            }
            return unit;
        }
        return coroutineSingletons;
    }

    public final void q1(BottomNavTabType bottomNavTabType) {
        E0(new e40((this.J0 && this.B0 && bottomNavTabType == BottomNavTabType.CHALO_BUS) ? this.K0 : null, 8));
    }

    public final void r1(BottomNavTabType bottomNavTabType) {
        boolean z = ((HomeScreenFragmentViewState) this.f.getValue()).n != null;
        PendingRideFeedbackStickyBannerUIState pendingRideFeedbackStickyBannerUIState = (this.B0 && (bottomNavTabType == BottomNavTabType.HOME || bottomNavTabType == BottomNavTabType.CHALO_BUS)) ? this.L0 : null;
        if (!z && pendingRideFeedbackStickyBannerUIState != null) {
            m1("ride feedback home banner shown", MapsKt.d(), pendingRideFeedbackStickyBannerUIState.f2862a);
        }
        E0(new e40(pendingRideFeedbackStickyBannerUIState, 11));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    public final void s1(BottomNavTabType bottomNavTabType) {
        UserProfilingHomeStickyBannerUIState userProfilingHomeStickyBannerUIState;
        if (this.H0 && this.B0 && bottomNavTabType != null) {
            switch (BottomNavTabAppModelKt.WhenMappings.f3718a[bottomNavTabType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    userProfilingHomeStickyBannerUIState = this.I0;
                    break;
                case 4:
                case 5:
                case 6:
                    userProfilingHomeStickyBannerUIState = null;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            userProfilingHomeStickyBannerUIState = null;
        }
        E0(new e40(userProfilingHomeStickyBannerUIState, 10));
    }

    public final void t1(BottomNavTabType bottomNavTabType) {
        BottomNavTabType bottomNavTabType2 = this.g1;
        if (bottomNavTabType == bottomNavTabType2) {
            return;
        }
        String message = "updateVisibleTab tabType=" + bottomNavTabType + " lifecycleStarted=" + this.h1 + " previous=" + bottomNavTabType2;
        Intrinsics.i(message, "message");
        this.g1 = bottomNavTabType;
        if (this.h1) {
            this.M0.f3227a.setValue(bottomNavTabType);
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new HomeScreenFragmentViewState(null, null, HomeScreenConfigStatus.UNKNOWN, null, null, new BottomSheetState(7), new SnackBarState(), false, null, HomeScreenConfigLayoutType.LOADING, null, null, null, null, false);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void x0() {
        MutableValue mutableValue = this.N0;
        List<TabComponentEntry> list = (List) mutableValue.a();
        if (!list.isEmpty()) {
            for (TabComponentEntry tabComponentEntry : list) {
                Z0(tabComponentEntry.d);
                g1(tabComponentEntry.f3193a);
            }
        }
        mutableValue.c(EmptyList.f17557a);
        this.M0.f3227a.setValue(null);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void y0() {
        w0(new HomeComponent$checkUserConsentStatus$1(this, null));
        if (this.i1) {
            this.i1 = false;
            w0(new HomeComponent$checkNotificationPermissionStateIfRequired$1(this, null));
        }
        w0(new HomeComponent$showRideHailingUserFeedbackBottomsheetIfRequired$1(this, null));
    }
}
