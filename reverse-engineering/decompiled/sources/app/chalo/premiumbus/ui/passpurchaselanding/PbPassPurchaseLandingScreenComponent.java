package app.chalo.premiumbus.ui.passpurchaselanding;

import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.constants.Source;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.livetracking.routedetails.data.model.ui.RouteDetailsIntentModel;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.navigation.ProductBookingNavigationManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.data.models.app.PBModeToReachStopType;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModelKt;
import app.chalo.premiumbus.data.models.app.PremiumBusSelectedLocationType;
import app.chalo.premiumbus.domain.FetchPBODPairsForGivenLocationsUseCase;
import app.chalo.premiumbus.managers.PremiumBusPurchaseInfoManager;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenDataState;
import app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen.ModeToReachFromStopUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen.MultipleOriginDestinationSelectionScreenUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen.OriginDestinationInfoUIState;
import app.chalo.premiumbus.ui.passpurchaselanding.multipleorigindestinationselectionscreen.OriginDestinationSelectionCtaItemUIState;
import app.chalo.premiumbus.ui.stopselection.PBStopSelectionScreenBottomSheetType;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase;
import app.chalo.productbooking.common.domain.StoreCompleteProductConfigLocallyUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultState;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.PassLandingFlowType;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.scenes.args.RouteDetailsArgs;
import app.chalo.scenes.args.WebViewArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.button.ButtonUIStateFactory;
import app.chalo.uistate.cardwithtextleftandrighticon.CardWithTextLeftAndRightIconUiState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.error.ErrorWithMsgAndRetryUISpecs;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import app.chalo.uistate.error.StandardErrorScreenUIStateFactory;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TitleSubtitleUiSpecs;
import app.chalo.uistate.text.TitleSubtitleUiState;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.universalsearch.data.UniversalSearchOption;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import app.chalo.utils.KUUID;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.er0;
import defpackage.fr0;
import defpackage.gr0;
import defpackage.ir0;
import defpackage.jr0;
import defpackage.m;
import defpackage.mq0;
import defpackage.n21;
import defpackage.py;
import defpackage.vg;
import defpackage.vo1;
import defpackage.ym0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenIntent;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenDataState;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenViewState;", "Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenSideEffect;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PbPassPurchaseLandingScreenComponent extends ChaloBaseStateMviComponent<PbPassPurchaseLandingScreenIntent, PbPassPurchaseLandingScreenDataState, PbPassPurchaseLandingScreenViewState, PbPassPurchaseLandingScreenSideEffect> {
    public Job A;
    public Job B;
    public PBStopPlaceSelectedAppModel C;
    public PBStopPlaceSelectedAppModel D;
    public final PremiumBusArgs.PremiumBusPassLandingScreenArgs k;
    public final StringProvider l;
    public final FetchCompleteProductConfigByIdUseCase m;
    public final CityProvider n;
    public final UserProfileDetailsProvider o;
    public final FetchPBODPairsForGivenLocationsUseCase p;
    public final StoreCompleteProductConfigLocallyUseCase q;
    public final PremiumBusPurchaseInfoManager r;
    public final AnalyticsContract s;
    public final TimeUtilsContract t;
    public final KotlinToastManager u;
    public final ChaloNavigationManager v;
    public final IReportProblemFeature w;
    public final ProductBookingNavigationManager x;
    public final UniversalSearchResultStateManager y;
    public Job z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenComponent$Companion;", "", "", "PREMIUM_BUS_ROUTES_WEB_URL", "Ljava/lang/String;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7651a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[PBModeToReachStopType.values().length];
            try {
                iArr[PBModeToReachStopType.WALK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PBModeToReachStopType.BUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PBModeToReachStopType.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PBModeToReachStopType.NOT_APPLICABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7651a = iArr;
            int[] iArr2 = new int[PremiumBusStopSearchSource.values().length];
            try {
                iArr2[PremiumBusStopSearchSource.FROM_STOP_SEARCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PremiumBusStopSearchSource.FROM_STOP_SUGGESTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PremiumBusStopSearchSource.TO_STOP_SEARCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PremiumBusStopSearchSource.TO_STOP_SUGGESTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    public PbPassPurchaseLandingScreenComponent(ComponentContext componentContext, PremiumBusArgs.PremiumBusPassLandingScreenArgs premiumBusPassLandingScreenArgs, StringProvider stringProvider, FetchCompleteProductConfigByIdUseCase fetchCompleteProductConfigByIdUseCase, CityProvider cityProvider, UserProfileDetailsProvider userProfileDetailsProvider, FetchPBODPairsForGivenLocationsUseCase fetchPBODPairsForGivenLocationsUseCase, StoreCompleteProductConfigLocallyUseCase storeCompleteProductConfigLocallyUseCase, PremiumBusPurchaseInfoManager premiumBusPurchaseInfoManager, AnalyticsContract analyticsContract, TimeUtilsContract timeUtilsContract, KotlinToastManager kotlinToastManager, ChaloNavigationManager chaloNavigationManager, IReportProblemFeature iReportProblemFeature, ProductBookingNavigationManager productBookingNavigationManager, UniversalSearchResultStateManager universalSearchResultStateManager) {
        super(componentContext);
        this.k = premiumBusPassLandingScreenArgs;
        this.l = stringProvider;
        this.m = fetchCompleteProductConfigByIdUseCase;
        this.n = cityProvider;
        this.o = userProfileDetailsProvider;
        this.p = fetchPBODPairsForGivenLocationsUseCase;
        this.q = storeCompleteProductConfigLocallyUseCase;
        this.r = premiumBusPurchaseInfoManager;
        this.s = analyticsContract;
        this.t = timeUtilsContract;
        this.u = kotlinToastManager;
        this.v = chaloNavigationManager;
        this.w = iReportProblemFeature;
        this.x = productBookingNavigationManager;
        this.y = universalSearchResultStateManager;
        O0(new PbPassPurchaseLandingScreenIntent.InitializationIntent(premiumBusPassLandingScreenArgs.c, premiumBusPassLandingScreenArgs.d, premiumBusPassLandingScreenArgs.e));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object F0(PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent, String str, PremiumBusStopSearchSource premiumBusStopSearchSource, ContinuationImpl continuationImpl) {
        PbPassPurchaseLandingScreenComponent$collectUniversalSearchResult$1 pbPassPurchaseLandingScreenComponent$collectUniversalSearchResult$1;
        Object objB;
        Object objB2;
        pbPassPurchaseLandingScreenComponent.getClass();
        if (continuationImpl instanceof PbPassPurchaseLandingScreenComponent$collectUniversalSearchResult$1) {
            pbPassPurchaseLandingScreenComponent$collectUniversalSearchResult$1 = (PbPassPurchaseLandingScreenComponent$collectUniversalSearchResult$1) continuationImpl;
            int i = pbPassPurchaseLandingScreenComponent$collectUniversalSearchResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbPassPurchaseLandingScreenComponent$collectUniversalSearchResult$1.label = i - Integer.MIN_VALUE;
            } else {
                pbPassPurchaseLandingScreenComponent$collectUniversalSearchResult$1 = new PbPassPurchaseLandingScreenComponent$collectUniversalSearchResult$1(pbPassPurchaseLandingScreenComponent, continuationImpl);
            }
        } else {
            pbPassPurchaseLandingScreenComponent$collectUniversalSearchResult$1 = new PbPassPurchaseLandingScreenComponent$collectUniversalSearchResult$1(pbPassPurchaseLandingScreenComponent, continuationImpl);
        }
        Object objV = pbPassPurchaseLandingScreenComponent$collectUniversalSearchResult$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pbPassPurchaseLandingScreenComponent$collectUniversalSearchResult$1.label;
        if (i2 == 0) {
            ResultKt.b(objV);
            Flow flowB = pbPassPurchaseLandingScreenComponent.y.b(str);
            pbPassPurchaseLandingScreenComponent$collectUniversalSearchResult$1.L$0 = premiumBusStopSearchSource;
            pbPassPurchaseLandingScreenComponent$collectUniversalSearchResult$1.label = 1;
            objV = pbPassPurchaseLandingScreenComponent.b.v(flowB, pbPassPurchaseLandingScreenComponent$collectUniversalSearchResult$1);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            premiumBusStopSearchSource = (PremiumBusStopSearchSource) pbPassPurchaseLandingScreenComponent$collectUniversalSearchResult$1.L$0;
            ResultKt.b(objV);
        }
        ResultStateData resultStateData = (ResultStateData) objV;
        boolean z = resultStateData instanceof ResultStateData.Cancelled;
        Unit unit = Unit.f17538a;
        if (z) {
            return unit;
        }
        if (!(resultStateData instanceof ResultStateData.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        String message = "collectUniversalSearchResult: " + pbPassPurchaseLandingScreenComponent.B;
        Intrinsics.i(message, "message");
        UniversalSearchResultState universalSearchResultState = (UniversalSearchResultState) ((ResultStateData.Success) resultStateData).f9039a;
        String str2 = universalSearchResultState.f9060a;
        String str3 = universalSearchResultState.b;
        if (str2 != null && str2.length() != 0) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB2 = json.b(str2, StopAppModel.INSTANCE.serializer());
            } catch (Exception unused) {
                objB2 = null;
            }
            StopAppModel stopAppModel = (StopAppModel) objB2;
            if (stopAppModel != null) {
                pbPassPurchaseLandingScreenComponent.O0(new PbPassPurchaseLandingScreenIntent.StopSelectionFieldResultIntent(PBStopPlaceSelectedAppModelKt.a(stopAppModel), premiumBusStopSearchSource));
            }
        } else if (str3 != null && str3.length() != 0) {
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                objB = json2.b(str3, RecentPlaceAppModel.INSTANCE.serializer());
            } catch (Exception unused2) {
                objB = null;
            }
            RecentPlaceAppModel recentPlaceAppModel = (RecentPlaceAppModel) objB;
            if (recentPlaceAppModel != null) {
                pbPassPurchaseLandingScreenComponent.O0(new PbPassPurchaseLandingScreenIntent.StopSelectionFieldResultIntent(PBStopPlaceSelectedAppModelKt.b(recentPlaceAppModel), premiumBusStopSearchSource));
            }
        }
        Job job = pbPassPurchaseLandingScreenComponent.B;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        pbPassPurchaseLandingScreenComponent.B = null;
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0581  */
    /* JADX WARN: Code duplicated, block: B:104:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:108:0x0649  */
    /* JADX WARN: Code duplicated, block: B:110:0x064f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0655  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x026a  */
    /* JADX WARN: Code duplicated, block: B:38:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:39:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:48:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:51:0x030c  */
    /* JADX WARN: Code duplicated, block: B:53:0x032c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0335  */
    /* JADX WARN: Code duplicated, block: B:59:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x0401  */
    /* JADX WARN: Code duplicated, block: B:67:0x0427  */
    /* JADX WARN: Code duplicated, block: B:70:0x0435  */
    /* JADX WARN: Code duplicated, block: B:72:0x0439  */
    /* JADX WARN: Code duplicated, block: B:74:0x043f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0465  */
    /* JADX WARN: Code duplicated, block: B:79:0x049b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:84:0x04af  */
    /* JADX WARN: Code duplicated, block: B:87:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:90:0x0515  */
    /* JADX WARN: Code duplicated, block: B:93:0x052f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0547  */
    /* JADX WARN: Code duplicated, block: B:96:0x054f  */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public final Object p0(PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState, ContinuationImpl continuationImpl) {
        PbPassPurchaseLandingScreenComponent$convertToUiState$1 pbPassPurchaseLandingScreenComponent$convertToUiState$1;
        PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState2;
        Object obj;
        List list;
        String str;
        ImageUrlUIState imageUrlUIState;
        ImageUIState imageUIState;
        PassLandingFlowType passLandingFlowType;
        int i;
        ImageUIState imageUIState2;
        ImageUrlUIState imageUrlUIState2;
        PassInfoCardUIState passInfoCardUIState;
        Object objB;
        PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState3;
        ImageUrlUIState imageUrlUIState3;
        Object obj2;
        ChaloTextStyleHelper chaloTextStyleHelper;
        PbPassPurchaseLandingScreenType pbPassPurchaseLandingScreenErrorUIState;
        PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState4;
        String str2;
        IconType iconType;
        Object obj3;
        StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory;
        String str3;
        Object objB2;
        String str4;
        Object obj4;
        PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState5;
        IconType iconType2;
        String str5;
        ImageUIState imageUIState3;
        PassInfoCardUIState passInfoCardUIState2;
        ImageUIState imageUIState4;
        ImageUIState imageUIState5;
        StringProvider stringProvider;
        Object objB3;
        CoroutineSingletons coroutineSingletons;
        PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState6;
        Object obj5;
        ImageUrlUIState imageUrlUIState4;
        ImageUIState imageUIState6;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        CardWithTextLeftAndRightIconUiState cardWithTextLeftAndRightIconUiState;
        PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent;
        Object objH0;
        ImageUIState imageUIState7;
        CardWithTextLeftAndRightIconUiState cardWithTextLeftAndRightIconUiState2;
        Object obj6;
        PassInfoCardUIState passInfoCardUIState3;
        PBPassPurchaseLandingScreenBottomSheetTypeUIState pBPassPurchaseLandingScreenBottomSheetTypeUIState;
        Object objI0;
        ImageUrlUIState imageUrlUIState5;
        PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState7;
        CardWithTextLeftAndRightIconUiState cardWithTextLeftAndRightIconUiState3;
        PBPassPurchaseLandingScreenBottomSheetTypeUIState pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
        Object obj7;
        SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState;
        PassLandingFlowType passLandingFlowType2;
        PassInfoCardUIState passInfoCardUIState4;
        ButtonUIState buttonUIStateF;
        PassInfoCardUIState passInfoCardUIState5;
        Object objB4;
        ButtonUIStateFactory buttonUIStateFactory;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState8;
        CoroutineSingletons coroutineSingletons2;
        StringProvider stringProvider2;
        ImageUIState imageUIState8;
        CardWithTextLeftAndRightIconUiState cardWithTextLeftAndRightIconUiState4;
        ButtonUIState buttonUIState;
        LoadingDialogUIState loadingDialogUIState;
        PBPassPurchaseLandingScreenBottomSheetTypeUIState pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
        SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState2;
        ImageUIState imageUIState9;
        PassInfoCardUIState passInfoCardUIState6;
        ChaloColorToken.Black black;
        Object objB5;
        PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState9;
        PassInfoCardUIState passInfoCardUIState7;
        ImageUIState imageUIState10;
        SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState3;
        ButtonUIState buttonUIState2;
        ChaloTextStyleHelper chaloTextStyleHelper4;
        PBPassPurchaseLandingScreenBottomSheetTypeUIState pBPassPurchaseLandingScreenBottomSheetTypeUIState4;
        CardWithTextLeftAndRightIconUiState cardWithTextLeftAndRightIconUiState5;
        ImageUrlUIState imageUrlUIState6;
        ChaloColorToken.Black black2;
        PassLandingFlowType passLandingFlowType3;
        ImageUIState imageUIState11;
        ButtonUIStateFactory buttonUIStateFactory2;
        Object objB6;
        SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState4;
        ChaloTextStyleHelper chaloTextStyleHelper5;
        ImageUrlUIState imageUrlUIState7;
        ImageUIState imageUIState12;
        Object obj8;
        PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState10;
        CardWithTextLeftAndRightIconUiState cardWithTextLeftAndRightIconUiState6;
        PassInfoCardUIState passInfoCardUIState8;
        float f;
        CardWithTextLeftAndRightIconUiState cardWithTextLeftAndRightIconUiState7;
        PassInfoCardUIState passInfoCardUIState9;
        ImageUrlUIState imageUrlUIState8;
        CoroutineSingletons coroutineSingletons3;
        ImageUIState imageUIState13;
        ImageUIState imageUIState14;
        PBPassPurchaseLandingScreenBottomSheetTypeUIState pBPassPurchaseLandingScreenBottomSheetTypeUIState5;
        TextUIState.ChaloTextUIState chaloTextUIStateF;
        ButtonUIStateFactory buttonUIStateFactory3;
        Object objB7;
        ImageUIState imageUIState15;
        CardWithTextLeftAndRightIconUiState cardWithTextLeftAndRightIconUiState8;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ImageUIState imageUIState16;
        ButtonUIStateFactory buttonUIStateFactory4;
        LoadingDialogUIState loadingDialogUIState2;
        ImageUrlUIState imageUrlUIState9;
        PassInfoCardUIState passInfoCardUIState10;
        ButtonUIState buttonUIState3;
        SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState5;
        PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState11;
        if (continuationImpl instanceof PbPassPurchaseLandingScreenComponent$convertToUiState$1) {
            pbPassPurchaseLandingScreenComponent$convertToUiState$1 = (PbPassPurchaseLandingScreenComponent$convertToUiState$1) continuationImpl;
            int i2 = pbPassPurchaseLandingScreenComponent$convertToUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                pbPassPurchaseLandingScreenComponent$convertToUiState$1 = new PbPassPurchaseLandingScreenComponent$convertToUiState$1(this, continuationImpl);
            }
        } else {
            pbPassPurchaseLandingScreenComponent$convertToUiState$1 = new PbPassPurchaseLandingScreenComponent$convertToUiState$1(this, continuationImpl);
        }
        Object obj9 = pbPassPurchaseLandingScreenComponent$convertToUiState$1.result;
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = pbPassPurchaseLandingScreenComponent$convertToUiState$1.label;
        ButtonUIStateFactory buttonUIStateFactory5 = ButtonUIStateFactory.f9921a;
        ChaloColorToken.Black black3 = ChaloColorToken.Black.f9759a;
        ChaloTextStyleHelper chaloTextStyleHelper6 = ChaloTextStyleHelper.f10078a;
        StringProvider stringProvider3 = this.l;
        switch (i3) {
            case 0:
                ResultKt.b(obj9);
                pbPassPurchaseLandingScreenDataState2 = pbPassPurchaseLandingScreenDataState;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState2;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 1;
                Object objN0 = N0(pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                if (objN0 != coroutineSingletons4) {
                    obj = objN0;
                    list = (List) obj;
                    if (!pbPassPurchaseLandingScreenDataState2.c) {
                        pbPassPurchaseLandingScreenErrorUIState = PbPassPurchaseLandingScreenType.Loading.f7670a;
                    } else {
                        str = pbPassPurchaseLandingScreenDataState2.h;
                        if (str != null || str.length() == 0) {
                            imageUrlUIState = null;
                        } else {
                            imageUrlUIState = new ImageUrlUIState(pbPassPurchaseLandingScreenDataState2.h, null, UIContentScale.FillWidth, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                        }
                        imageUIState = new ImageUIState(IconType.PB_PASS_LANDING_PLACEHOLDER, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                        passLandingFlowType = pbPassPurchaseLandingScreenDataState2.f7652a;
                        if (passLandingFlowType instanceof PassLandingFlowType.WithConfigId) {
                            i = 0;
                            if (Intrinsics.d(passLandingFlowType, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            imageUIState2 = imageUIState;
                            imageUrlUIState2 = imageUrlUIState;
                            passInfoCardUIState = null;
                            passInfoCardUIState2 = passInfoCardUIState;
                            imageUIState4 = imageUIState2;
                            imageUIState3 = new ImageUIState(IconType.IC_CUSTOMER_SUPPORT_PROFILE, (String) null, black3, new ImageUISize(ChaloThemeHelper.a().k), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
                            black3 = black3;
                            imageUIState5 = new ImageUIState(IconType.IC_ARROW_RIGHT, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState2;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState2;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState4;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState2;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = imageUIState3;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = imageUIState5;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = chaloTextStyleHelper6;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 6;
                            stringProvider = stringProvider3;
                            objB3 = stringProvider.b(StringEnum.CUSTOMER_SUPPORT, new Object[i], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                            coroutineSingletons = coroutineSingletons4;
                            if (objB3 != coroutineSingletons) {
                                pbPassPurchaseLandingScreenDataState6 = pbPassPurchaseLandingScreenDataState2;
                                obj5 = objB3;
                                imageUrlUIState4 = imageUrlUIState2;
                                imageUIState6 = imageUIState5;
                                chaloTextStyleHelper2 = chaloTextStyleHelper6;
                                pbPassPurchaseLandingScreenComponent = this;
                                cardWithTextLeftAndRightIconUiState = new CardWithTextLeftAndRightIconUiState(imageUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper2, (String) obj5, ChaloColorToken.AlmostBlackColor.f9756a, 0, null, null, null, null, 124), imageUIState6, new er0(pbPassPurchaseLandingScreenComponent, 14), 1);
                                PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType = pbPassPurchaseLandingScreenDataState6.e;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState6;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState4;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState4;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState2;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = null;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = null;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 7;
                                objH0 = pbPassPurchaseLandingScreenComponent.H0(pBStopSelectionScreenBottomSheetType, pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                if (objH0 != coroutineSingletons) {
                                    PassInfoCardUIState passInfoCardUIState11 = passInfoCardUIState2;
                                    imageUIState7 = imageUIState4;
                                    cardWithTextLeftAndRightIconUiState2 = cardWithTextLeftAndRightIconUiState;
                                    obj6 = objH0;
                                    passInfoCardUIState3 = passInfoCardUIState11;
                                    pBPassPurchaseLandingScreenBottomSheetTypeUIState = (PBPassPurchaseLandingScreenBottomSheetTypeUIState) obj6;
                                    boolean z = pbPassPurchaseLandingScreenDataState6.b;
                                    String str6 = pbPassPurchaseLandingScreenDataState6.f;
                                    String str7 = pbPassPurchaseLandingScreenDataState6.g;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState6;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState4;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState2;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 8;
                                    objI0 = pbPassPurchaseLandingScreenComponent.I0(str6, str7, pbPassPurchaseLandingScreenComponent$convertToUiState$1, z);
                                    if (objI0 != coroutineSingletons) {
                                        imageUrlUIState5 = imageUrlUIState4;
                                        pbPassPurchaseLandingScreenDataState7 = pbPassPurchaseLandingScreenDataState6;
                                        cardWithTextLeftAndRightIconUiState3 = cardWithTextLeftAndRightIconUiState2;
                                        pBPassPurchaseLandingScreenBottomSheetTypeUIState2 = pBPassPurchaseLandingScreenBottomSheetTypeUIState;
                                        obj7 = objI0;
                                        searchFieldWithSwapButtonCardUIState = (SearchFieldWithSwapButtonCardUIState) obj7;
                                        passLandingFlowType2 = pbPassPurchaseLandingScreenDataState7.f7652a;
                                        if (!(passLandingFlowType2 instanceof PassLandingFlowType.WithConfigId)) {
                                            passInfoCardUIState4 = passInfoCardUIState3;
                                            if (Intrinsics.d(passLandingFlowType2, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            passInfoCardUIState3 = passInfoCardUIState4;
                                        } else if (pbPassPurchaseLandingScreenDataState7.b) {
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                                            buttonUIStateFactory5 = buttonUIStateFactory5;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateFactory5;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                                            passInfoCardUIState5 = passInfoCardUIState3;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 9;
                                            objB4 = stringProvider.b(StringEnum.BUY_PASS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                            if (objB4 != coroutineSingletons) {
                                                buttonUIStateFactory = buttonUIStateFactory5;
                                                chaloTextStyleHelper3 = chaloTextStyleHelper6;
                                                ButtonUIStateFactory buttonUIStateFactory6 = buttonUIStateFactory;
                                                PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState12 = pbPassPurchaseLandingScreenDataState7;
                                                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory6, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objB4, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108), new er0(pbPassPurchaseLandingScreenComponent, 15), UIShape.d, false, 0.0f, 52);
                                                pbPassPurchaseLandingScreenDataState7 = pbPassPurchaseLandingScreenDataState12;
                                                passInfoCardUIState3 = passInfoCardUIState5;
                                                if (pbPassPurchaseLandingScreenDataState7.d) {
                                                    black = black3;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateF;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 10;
                                                    objB5 = stringProvider.b(StringEnum.PLEASE_WAIT_RUNNING_CASE_WITH_DOTS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                                    if (objB5 != coroutineSingletons) {
                                                        pbPassPurchaseLandingScreenDataState9 = pbPassPurchaseLandingScreenDataState7;
                                                        passInfoCardUIState7 = passInfoCardUIState3;
                                                        imageUIState10 = imageUIState7;
                                                        searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState;
                                                        buttonUIState2 = buttonUIStateF;
                                                        chaloTextStyleHelper4 = chaloTextStyleHelper6;
                                                        pBPassPurchaseLandingScreenBottomSheetTypeUIState4 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                                        cardWithTextLeftAndRightIconUiState5 = cardWithTextLeftAndRightIconUiState3;
                                                        imageUrlUIState6 = imageUrlUIState5;
                                                        black3 = black;
                                                        SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState6 = searchFieldWithSwapButtonCardUIState3;
                                                        coroutineSingletons2 = coroutineSingletons;
                                                        ButtonUIState buttonUIState4 = buttonUIState2;
                                                        stringProvider2 = stringProvider;
                                                        imageUIState8 = null;
                                                        loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper4, (String) objB5, black3, 0, null, null, null, null, 124));
                                                        searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState6;
                                                        buttonUIState = buttonUIState4;
                                                        pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState4;
                                                        cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState5;
                                                        passInfoCardUIState6 = passInfoCardUIState7;
                                                        imageUIState9 = imageUIState10;
                                                        imageUrlUIState5 = imageUrlUIState6;
                                                        pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState9;
                                                    }
                                                } else {
                                                    CoroutineSingletons coroutineSingletons5 = coroutineSingletons;
                                                    pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState7;
                                                    coroutineSingletons2 = coroutineSingletons5;
                                                    PassInfoCardUIState passInfoCardUIState12 = passInfoCardUIState3;
                                                    stringProvider2 = stringProvider;
                                                    imageUIState8 = null;
                                                    cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState3;
                                                    buttonUIState = buttonUIStateF;
                                                    loadingDialogUIState = null;
                                                    pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                                    searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState;
                                                    imageUIState9 = imageUIState7;
                                                    passInfoCardUIState6 = passInfoCardUIState12;
                                                }
                                                black2 = black3;
                                                passLandingFlowType3 = pbPassPurchaseLandingScreenDataState8.f7652a;
                                                if (passLandingFlowType3 instanceof PassLandingFlowType.WithConfigId) {
                                                    imageUIState11 = new ImageUIState(IconType.CHALO_BUS_INFO_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                                                } else {
                                                    if (Intrinsics.d(passLandingFlowType3, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    imageUIState11 = imageUIState8;
                                                }
                                                CoroutineSingletons coroutineSingletons6 = coroutineSingletons2;
                                                buttonUIStateFactory2 = buttonUIStateFactory5;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState8;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState9;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState6;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState4;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState2;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState11;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextStyleHelper6;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = 0.0f;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 11;
                                                objB6 = stringProvider2.b(StringEnum.CONNECTING_THANE_ANDHERI_BKC_NAVI_MUMBAI_AND_COLABA, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                                coroutineSingletons4 = coroutineSingletons6;
                                                if (objB6 != coroutineSingletons4) {
                                                    searchFieldWithSwapButtonCardUIState4 = searchFieldWithSwapButtonCardUIState2;
                                                    chaloTextStyleHelper5 = chaloTextStyleHelper6;
                                                    imageUrlUIState7 = imageUrlUIState5;
                                                    imageUIState12 = imageUIState11;
                                                    obj8 = objB6;
                                                    pbPassPurchaseLandingScreenDataState10 = pbPassPurchaseLandingScreenDataState8;
                                                    cardWithTextLeftAndRightIconUiState6 = cardWithTextLeftAndRightIconUiState4;
                                                    passInfoCardUIState8 = passInfoCardUIState6;
                                                    f = 0.0f;
                                                    cardWithTextLeftAndRightIconUiState7 = cardWithTextLeftAndRightIconUiState6;
                                                    passInfoCardUIState9 = passInfoCardUIState8;
                                                    imageUrlUIState8 = imageUrlUIState7;
                                                    coroutineSingletons3 = coroutineSingletons4;
                                                    imageUIState13 = imageUIState9;
                                                    imageUIState14 = imageUIState12;
                                                    pBPassPurchaseLandingScreenBottomSheetTypeUIState5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                                    chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper5, (String) obj8, black2, UIFontWeight.Bold, null, 108);
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState10;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState8;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState13;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState9;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState7;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState5;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState4;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState14;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextUIStateF;
                                                    buttonUIStateFactory3 = buttonUIStateFactory2;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$11 = buttonUIStateFactory3;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = f;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 12;
                                                    objB7 = stringProvider2.b(StringEnum.VIEW_ALL_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                                    if (objB7 == coroutineSingletons3) {
                                                        return coroutineSingletons3;
                                                    }
                                                    imageUIState15 = imageUIState13;
                                                    cardWithTextLeftAndRightIconUiState8 = cardWithTextLeftAndRightIconUiState7;
                                                    chaloTextUIState = chaloTextUIStateF;
                                                    imageUIState16 = imageUIState14;
                                                    buttonUIStateFactory4 = buttonUIStateFactory3;
                                                    loadingDialogUIState2 = loadingDialogUIState;
                                                    imageUrlUIState9 = imageUrlUIState8;
                                                    obj9 = objB7;
                                                    passInfoCardUIState10 = passInfoCardUIState9;
                                                    buttonUIState3 = buttonUIState;
                                                    searchFieldWithSwapButtonCardUIState5 = searchFieldWithSwapButtonCardUIState4;
                                                    pbPassPurchaseLandingScreenDataState11 = pbPassPurchaseLandingScreenDataState10;
                                                    UITextStyle uITextStyle = UITextStyle.HeadlineSmall;
                                                    UIFontWeight uIFontWeight = UIFontWeight.Bold;
                                                    ButtonUIStateFactory buttonUIStateFactory7 = buttonUIStateFactory4;
                                                    UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A = UiEventHandler.Companion.a(new er0(this, 16));
                                                    buttonUIStateFactory7.getClass();
                                                    pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 0)), WebSocketProtocol.PAYLOAD_SHORT), imageUrlUIState9, imageUIState15, imageUIState16, loadingDialogUIState2, passInfoCardUIState10, cardWithTextLeftAndRightIconUiState8, pBPassPurchaseLandingScreenBottomSheetTypeUIState5, searchFieldWithSwapButtonCardUIState5, buttonUIState3, new PBConnectingRoutesUIState(chaloTextUIState, ButtonUIStateFactory.a((String) obj9, uITextStyle, uIFontWeight, uiEventHandler$Companion$fromLambda$1A)), pbPassPurchaseLandingScreenDataState11.i);
                                                }
                                            }
                                        }
                                        buttonUIStateF = null;
                                        if (pbPassPurchaseLandingScreenDataState7.d) {
                                            black = black3;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateF;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 10;
                                            objB5 = stringProvider.b(StringEnum.PLEASE_WAIT_RUNNING_CASE_WITH_DOTS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                            if (objB5 != coroutineSingletons) {
                                                pbPassPurchaseLandingScreenDataState9 = pbPassPurchaseLandingScreenDataState7;
                                                passInfoCardUIState7 = passInfoCardUIState3;
                                                imageUIState10 = imageUIState7;
                                                searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState;
                                                buttonUIState2 = buttonUIStateF;
                                                chaloTextStyleHelper4 = chaloTextStyleHelper6;
                                                pBPassPurchaseLandingScreenBottomSheetTypeUIState4 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                                cardWithTextLeftAndRightIconUiState5 = cardWithTextLeftAndRightIconUiState3;
                                                imageUrlUIState6 = imageUrlUIState5;
                                                black3 = black;
                                                SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState7 = searchFieldWithSwapButtonCardUIState3;
                                                coroutineSingletons2 = coroutineSingletons;
                                                ButtonUIState buttonUIState5 = buttonUIState2;
                                                stringProvider2 = stringProvider;
                                                imageUIState8 = null;
                                                loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper4, (String) objB5, black3, 0, null, null, null, null, 124));
                                                searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState7;
                                                buttonUIState = buttonUIState5;
                                                pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState4;
                                                cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState5;
                                                passInfoCardUIState6 = passInfoCardUIState7;
                                                imageUIState9 = imageUIState10;
                                                imageUrlUIState5 = imageUrlUIState6;
                                                pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState9;
                                            }
                                        } else {
                                            CoroutineSingletons coroutineSingletons7 = coroutineSingletons;
                                            pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState7;
                                            coroutineSingletons2 = coroutineSingletons7;
                                            PassInfoCardUIState passInfoCardUIState13 = passInfoCardUIState3;
                                            stringProvider2 = stringProvider;
                                            imageUIState8 = null;
                                            cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState3;
                                            buttonUIState = buttonUIStateF;
                                            loadingDialogUIState = null;
                                            pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                            searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState;
                                            imageUIState9 = imageUIState7;
                                            passInfoCardUIState6 = passInfoCardUIState13;
                                        }
                                        black2 = black3;
                                        passLandingFlowType3 = pbPassPurchaseLandingScreenDataState8.f7652a;
                                        if (passLandingFlowType3 instanceof PassLandingFlowType.WithConfigId) {
                                            imageUIState11 = new ImageUIState(IconType.CHALO_BUS_INFO_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                                        } else {
                                            if (Intrinsics.d(passLandingFlowType3, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            imageUIState11 = imageUIState8;
                                        }
                                        CoroutineSingletons coroutineSingletons8 = coroutineSingletons2;
                                        buttonUIStateFactory2 = buttonUIStateFactory5;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState8;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState9;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState6;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState4;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState2;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState11;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextStyleHelper6;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = 0.0f;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 11;
                                        objB6 = stringProvider2.b(StringEnum.CONNECTING_THANE_ANDHERI_BKC_NAVI_MUMBAI_AND_COLABA, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                        coroutineSingletons4 = coroutineSingletons8;
                                        if (objB6 != coroutineSingletons4) {
                                            searchFieldWithSwapButtonCardUIState4 = searchFieldWithSwapButtonCardUIState2;
                                            chaloTextStyleHelper5 = chaloTextStyleHelper6;
                                            imageUrlUIState7 = imageUrlUIState5;
                                            imageUIState12 = imageUIState11;
                                            obj8 = objB6;
                                            pbPassPurchaseLandingScreenDataState10 = pbPassPurchaseLandingScreenDataState8;
                                            cardWithTextLeftAndRightIconUiState6 = cardWithTextLeftAndRightIconUiState4;
                                            passInfoCardUIState8 = passInfoCardUIState6;
                                            f = 0.0f;
                                            cardWithTextLeftAndRightIconUiState7 = cardWithTextLeftAndRightIconUiState6;
                                            passInfoCardUIState9 = passInfoCardUIState8;
                                            imageUrlUIState8 = imageUrlUIState7;
                                            coroutineSingletons3 = coroutineSingletons4;
                                            imageUIState13 = imageUIState9;
                                            imageUIState14 = imageUIState12;
                                            pBPassPurchaseLandingScreenBottomSheetTypeUIState5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                            chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper5, (String) obj8, black2, UIFontWeight.Bold, null, 108);
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState10;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState8;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState13;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState9;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState7;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState5;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState4;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState14;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextUIStateF;
                                            buttonUIStateFactory3 = buttonUIStateFactory2;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$11 = buttonUIStateFactory3;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = f;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 12;
                                            objB7 = stringProvider2.b(StringEnum.VIEW_ALL_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                            if (objB7 == coroutineSingletons3) {
                                                return coroutineSingletons3;
                                            }
                                            imageUIState15 = imageUIState13;
                                            cardWithTextLeftAndRightIconUiState8 = cardWithTextLeftAndRightIconUiState7;
                                            chaloTextUIState = chaloTextUIStateF;
                                            imageUIState16 = imageUIState14;
                                            buttonUIStateFactory4 = buttonUIStateFactory3;
                                            loadingDialogUIState2 = loadingDialogUIState;
                                            imageUrlUIState9 = imageUrlUIState8;
                                            obj9 = objB7;
                                            passInfoCardUIState10 = passInfoCardUIState9;
                                            buttonUIState3 = buttonUIState;
                                            searchFieldWithSwapButtonCardUIState5 = searchFieldWithSwapButtonCardUIState4;
                                            pbPassPurchaseLandingScreenDataState11 = pbPassPurchaseLandingScreenDataState10;
                                            UITextStyle uITextStyle2 = UITextStyle.HeadlineSmall;
                                            UIFontWeight uIFontWeight2 = UIFontWeight.Bold;
                                            ButtonUIStateFactory buttonUIStateFactory8 = buttonUIStateFactory4;
                                            UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A2 = UiEventHandler.Companion.a(new er0(this, 16));
                                            buttonUIStateFactory8.getClass();
                                            pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 0)), WebSocketProtocol.PAYLOAD_SHORT), imageUrlUIState9, imageUIState15, imageUIState16, loadingDialogUIState2, passInfoCardUIState10, cardWithTextLeftAndRightIconUiState8, pBPassPurchaseLandingScreenBottomSheetTypeUIState5, searchFieldWithSwapButtonCardUIState5, buttonUIState3, new PBConnectingRoutesUIState(chaloTextUIState, ButtonUIStateFactory.a((String) obj9, uITextStyle2, uIFontWeight2, uiEventHandler$Companion$fromLambda$1A2)), pbPassPurchaseLandingScreenDataState11.i);
                                        }
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                        i = 0;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState2;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = list;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUrlUIState;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = imageUIState;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = chaloTextStyleHelper6;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 5;
                        objB = stringProvider3.b(StringEnum.HOW_DO_PASSED_WORK, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                        if (objB != coroutineSingletons4) {
                            pbPassPurchaseLandingScreenDataState3 = pbPassPurchaseLandingScreenDataState2;
                            imageUrlUIState3 = imageUrlUIState;
                            obj2 = objB;
                            chaloTextStyleHelper = chaloTextStyleHelper6;
                            passInfoCardUIState = new PassInfoCardUIState(ChaloTextStyleHelper.f(chaloTextStyleHelper, (String) obj2, black3, UIFontWeight.Bold, null, 108), list);
                            imageUIState2 = imageUIState;
                            imageUrlUIState2 = imageUrlUIState3;
                            pbPassPurchaseLandingScreenDataState2 = pbPassPurchaseLandingScreenDataState3;
                            passInfoCardUIState2 = passInfoCardUIState;
                            imageUIState4 = imageUIState2;
                            imageUIState3 = new ImageUIState(IconType.IC_CUSTOMER_SUPPORT_PROFILE, (String) null, black3, new ImageUISize(ChaloThemeHelper.a().k), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
                            black3 = black3;
                            imageUIState5 = new ImageUIState(IconType.IC_ARROW_RIGHT, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState2;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState2;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState4;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState2;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = imageUIState3;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = imageUIState5;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = chaloTextStyleHelper6;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 6;
                            stringProvider = stringProvider3;
                            objB3 = stringProvider.b(StringEnum.CUSTOMER_SUPPORT, new Object[i], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                            coroutineSingletons = coroutineSingletons4;
                            if (objB3 != coroutineSingletons) {
                                pbPassPurchaseLandingScreenDataState6 = pbPassPurchaseLandingScreenDataState2;
                                obj5 = objB3;
                                imageUrlUIState4 = imageUrlUIState2;
                                imageUIState6 = imageUIState5;
                                chaloTextStyleHelper2 = chaloTextStyleHelper6;
                                pbPassPurchaseLandingScreenComponent = this;
                                cardWithTextLeftAndRightIconUiState = new CardWithTextLeftAndRightIconUiState(imageUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper2, (String) obj5, ChaloColorToken.AlmostBlackColor.f9756a, 0, null, null, null, null, 124), imageUIState6, new er0(pbPassPurchaseLandingScreenComponent, 14), 1);
                                PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType2 = pbPassPurchaseLandingScreenDataState6.e;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState6;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState4;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState4;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState2;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = null;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = null;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 7;
                                objH0 = pbPassPurchaseLandingScreenComponent.H0(pBStopSelectionScreenBottomSheetType2, pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                if (objH0 != coroutineSingletons) {
                                    PassInfoCardUIState passInfoCardUIState14 = passInfoCardUIState2;
                                    imageUIState7 = imageUIState4;
                                    cardWithTextLeftAndRightIconUiState2 = cardWithTextLeftAndRightIconUiState;
                                    obj6 = objH0;
                                    passInfoCardUIState3 = passInfoCardUIState14;
                                    pBPassPurchaseLandingScreenBottomSheetTypeUIState = (PBPassPurchaseLandingScreenBottomSheetTypeUIState) obj6;
                                    boolean z2 = pbPassPurchaseLandingScreenDataState6.b;
                                    String str8 = pbPassPurchaseLandingScreenDataState6.f;
                                    String str9 = pbPassPurchaseLandingScreenDataState6.g;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState6;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState4;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState2;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 8;
                                    objI0 = pbPassPurchaseLandingScreenComponent.I0(str8, str9, pbPassPurchaseLandingScreenComponent$convertToUiState$1, z2);
                                    if (objI0 != coroutineSingletons) {
                                        imageUrlUIState5 = imageUrlUIState4;
                                        pbPassPurchaseLandingScreenDataState7 = pbPassPurchaseLandingScreenDataState6;
                                        cardWithTextLeftAndRightIconUiState3 = cardWithTextLeftAndRightIconUiState2;
                                        pBPassPurchaseLandingScreenBottomSheetTypeUIState2 = pBPassPurchaseLandingScreenBottomSheetTypeUIState;
                                        obj7 = objI0;
                                        searchFieldWithSwapButtonCardUIState = (SearchFieldWithSwapButtonCardUIState) obj7;
                                        passLandingFlowType2 = pbPassPurchaseLandingScreenDataState7.f7652a;
                                        if (!(passLandingFlowType2 instanceof PassLandingFlowType.WithConfigId)) {
                                            passInfoCardUIState4 = passInfoCardUIState3;
                                            if (Intrinsics.d(passLandingFlowType2, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            passInfoCardUIState3 = passInfoCardUIState4;
                                        } else if (pbPassPurchaseLandingScreenDataState7.b) {
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                                            buttonUIStateFactory5 = buttonUIStateFactory5;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateFactory5;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                                            passInfoCardUIState5 = passInfoCardUIState3;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 9;
                                            objB4 = stringProvider.b(StringEnum.BUY_PASS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                            if (objB4 != coroutineSingletons) {
                                                buttonUIStateFactory = buttonUIStateFactory5;
                                                chaloTextStyleHelper3 = chaloTextStyleHelper6;
                                                ButtonUIStateFactory buttonUIStateFactory9 = buttonUIStateFactory;
                                                PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState13 = pbPassPurchaseLandingScreenDataState7;
                                                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory9, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objB4, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108), new er0(pbPassPurchaseLandingScreenComponent, 15), UIShape.d, false, 0.0f, 52);
                                                pbPassPurchaseLandingScreenDataState7 = pbPassPurchaseLandingScreenDataState13;
                                                passInfoCardUIState3 = passInfoCardUIState5;
                                                if (pbPassPurchaseLandingScreenDataState7.d) {
                                                    black = black3;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateF;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 10;
                                                    objB5 = stringProvider.b(StringEnum.PLEASE_WAIT_RUNNING_CASE_WITH_DOTS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                                    if (objB5 != coroutineSingletons) {
                                                        pbPassPurchaseLandingScreenDataState9 = pbPassPurchaseLandingScreenDataState7;
                                                        passInfoCardUIState7 = passInfoCardUIState3;
                                                        imageUIState10 = imageUIState7;
                                                        searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState;
                                                        buttonUIState2 = buttonUIStateF;
                                                        chaloTextStyleHelper4 = chaloTextStyleHelper6;
                                                        pBPassPurchaseLandingScreenBottomSheetTypeUIState4 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                                        cardWithTextLeftAndRightIconUiState5 = cardWithTextLeftAndRightIconUiState3;
                                                        imageUrlUIState6 = imageUrlUIState5;
                                                        black3 = black;
                                                        SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState8 = searchFieldWithSwapButtonCardUIState3;
                                                        coroutineSingletons2 = coroutineSingletons;
                                                        ButtonUIState buttonUIState6 = buttonUIState2;
                                                        stringProvider2 = stringProvider;
                                                        imageUIState8 = null;
                                                        loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper4, (String) objB5, black3, 0, null, null, null, null, 124));
                                                        searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState8;
                                                        buttonUIState = buttonUIState6;
                                                        pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState4;
                                                        cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState5;
                                                        passInfoCardUIState6 = passInfoCardUIState7;
                                                        imageUIState9 = imageUIState10;
                                                        imageUrlUIState5 = imageUrlUIState6;
                                                        pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState9;
                                                    }
                                                } else {
                                                    CoroutineSingletons coroutineSingletons9 = coroutineSingletons;
                                                    pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState7;
                                                    coroutineSingletons2 = coroutineSingletons9;
                                                    PassInfoCardUIState passInfoCardUIState15 = passInfoCardUIState3;
                                                    stringProvider2 = stringProvider;
                                                    imageUIState8 = null;
                                                    cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState3;
                                                    buttonUIState = buttonUIStateF;
                                                    loadingDialogUIState = null;
                                                    pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                                    searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState;
                                                    imageUIState9 = imageUIState7;
                                                    passInfoCardUIState6 = passInfoCardUIState15;
                                                }
                                                black2 = black3;
                                                passLandingFlowType3 = pbPassPurchaseLandingScreenDataState8.f7652a;
                                                if (passLandingFlowType3 instanceof PassLandingFlowType.WithConfigId) {
                                                    imageUIState11 = new ImageUIState(IconType.CHALO_BUS_INFO_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                                                } else {
                                                    if (Intrinsics.d(passLandingFlowType3, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    imageUIState11 = imageUIState8;
                                                }
                                                CoroutineSingletons coroutineSingletons10 = coroutineSingletons2;
                                                buttonUIStateFactory2 = buttonUIStateFactory5;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState8;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState9;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState6;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState4;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState2;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState11;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextStyleHelper6;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = 0.0f;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 11;
                                                objB6 = stringProvider2.b(StringEnum.CONNECTING_THANE_ANDHERI_BKC_NAVI_MUMBAI_AND_COLABA, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                                coroutineSingletons4 = coroutineSingletons10;
                                                if (objB6 != coroutineSingletons4) {
                                                    searchFieldWithSwapButtonCardUIState4 = searchFieldWithSwapButtonCardUIState2;
                                                    chaloTextStyleHelper5 = chaloTextStyleHelper6;
                                                    imageUrlUIState7 = imageUrlUIState5;
                                                    imageUIState12 = imageUIState11;
                                                    obj8 = objB6;
                                                    pbPassPurchaseLandingScreenDataState10 = pbPassPurchaseLandingScreenDataState8;
                                                    cardWithTextLeftAndRightIconUiState6 = cardWithTextLeftAndRightIconUiState4;
                                                    passInfoCardUIState8 = passInfoCardUIState6;
                                                    f = 0.0f;
                                                    cardWithTextLeftAndRightIconUiState7 = cardWithTextLeftAndRightIconUiState6;
                                                    passInfoCardUIState9 = passInfoCardUIState8;
                                                    imageUrlUIState8 = imageUrlUIState7;
                                                    coroutineSingletons3 = coroutineSingletons4;
                                                    imageUIState13 = imageUIState9;
                                                    imageUIState14 = imageUIState12;
                                                    pBPassPurchaseLandingScreenBottomSheetTypeUIState5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                                    chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper5, (String) obj8, black2, UIFontWeight.Bold, null, 108);
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState10;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState8;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState13;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState9;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState7;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState5;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState4;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState14;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextUIStateF;
                                                    buttonUIStateFactory3 = buttonUIStateFactory2;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$11 = buttonUIStateFactory3;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = f;
                                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 12;
                                                    objB7 = stringProvider2.b(StringEnum.VIEW_ALL_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                                    if (objB7 == coroutineSingletons3) {
                                                        return coroutineSingletons3;
                                                    }
                                                    imageUIState15 = imageUIState13;
                                                    cardWithTextLeftAndRightIconUiState8 = cardWithTextLeftAndRightIconUiState7;
                                                    chaloTextUIState = chaloTextUIStateF;
                                                    imageUIState16 = imageUIState14;
                                                    buttonUIStateFactory4 = buttonUIStateFactory3;
                                                    loadingDialogUIState2 = loadingDialogUIState;
                                                    imageUrlUIState9 = imageUrlUIState8;
                                                    obj9 = objB7;
                                                    passInfoCardUIState10 = passInfoCardUIState9;
                                                    buttonUIState3 = buttonUIState;
                                                    searchFieldWithSwapButtonCardUIState5 = searchFieldWithSwapButtonCardUIState4;
                                                    pbPassPurchaseLandingScreenDataState11 = pbPassPurchaseLandingScreenDataState10;
                                                    UITextStyle uITextStyle3 = UITextStyle.HeadlineSmall;
                                                    UIFontWeight uIFontWeight3 = UIFontWeight.Bold;
                                                    ButtonUIStateFactory buttonUIStateFactory10 = buttonUIStateFactory4;
                                                    UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A3 = UiEventHandler.Companion.a(new er0(this, 16));
                                                    buttonUIStateFactory10.getClass();
                                                    pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 0)), WebSocketProtocol.PAYLOAD_SHORT), imageUrlUIState9, imageUIState15, imageUIState16, loadingDialogUIState2, passInfoCardUIState10, cardWithTextLeftAndRightIconUiState8, pBPassPurchaseLandingScreenBottomSheetTypeUIState5, searchFieldWithSwapButtonCardUIState5, buttonUIState3, new PBConnectingRoutesUIState(chaloTextUIState, ButtonUIStateFactory.a((String) obj9, uITextStyle3, uIFontWeight3, uiEventHandler$Companion$fromLambda$1A3)), pbPassPurchaseLandingScreenDataState11.i);
                                                }
                                            }
                                        }
                                        buttonUIStateF = null;
                                        if (pbPassPurchaseLandingScreenDataState7.d) {
                                            black = black3;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateF;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 10;
                                            objB5 = stringProvider.b(StringEnum.PLEASE_WAIT_RUNNING_CASE_WITH_DOTS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                            if (objB5 != coroutineSingletons) {
                                                pbPassPurchaseLandingScreenDataState9 = pbPassPurchaseLandingScreenDataState7;
                                                passInfoCardUIState7 = passInfoCardUIState3;
                                                imageUIState10 = imageUIState7;
                                                searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState;
                                                buttonUIState2 = buttonUIStateF;
                                                chaloTextStyleHelper4 = chaloTextStyleHelper6;
                                                pBPassPurchaseLandingScreenBottomSheetTypeUIState4 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                                cardWithTextLeftAndRightIconUiState5 = cardWithTextLeftAndRightIconUiState3;
                                                imageUrlUIState6 = imageUrlUIState5;
                                                black3 = black;
                                                SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState9 = searchFieldWithSwapButtonCardUIState3;
                                                coroutineSingletons2 = coroutineSingletons;
                                                ButtonUIState buttonUIState7 = buttonUIState2;
                                                stringProvider2 = stringProvider;
                                                imageUIState8 = null;
                                                loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper4, (String) objB5, black3, 0, null, null, null, null, 124));
                                                searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState9;
                                                buttonUIState = buttonUIState7;
                                                pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState4;
                                                cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState5;
                                                passInfoCardUIState6 = passInfoCardUIState7;
                                                imageUIState9 = imageUIState10;
                                                imageUrlUIState5 = imageUrlUIState6;
                                                pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState9;
                                            }
                                        } else {
                                            CoroutineSingletons coroutineSingletons11 = coroutineSingletons;
                                            pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState7;
                                            coroutineSingletons2 = coroutineSingletons11;
                                            PassInfoCardUIState passInfoCardUIState16 = passInfoCardUIState3;
                                            stringProvider2 = stringProvider;
                                            imageUIState8 = null;
                                            cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState3;
                                            buttonUIState = buttonUIStateF;
                                            loadingDialogUIState = null;
                                            pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                            searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState;
                                            imageUIState9 = imageUIState7;
                                            passInfoCardUIState6 = passInfoCardUIState16;
                                        }
                                        black2 = black3;
                                        passLandingFlowType3 = pbPassPurchaseLandingScreenDataState8.f7652a;
                                        if (passLandingFlowType3 instanceof PassLandingFlowType.WithConfigId) {
                                            imageUIState11 = new ImageUIState(IconType.CHALO_BUS_INFO_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                                        } else {
                                            if (Intrinsics.d(passLandingFlowType3, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            imageUIState11 = imageUIState8;
                                        }
                                        CoroutineSingletons coroutineSingletons12 = coroutineSingletons2;
                                        buttonUIStateFactory2 = buttonUIStateFactory5;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState8;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState9;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState6;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState4;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState2;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState11;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextStyleHelper6;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = 0.0f;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 11;
                                        objB6 = stringProvider2.b(StringEnum.CONNECTING_THANE_ANDHERI_BKC_NAVI_MUMBAI_AND_COLABA, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                        coroutineSingletons4 = coroutineSingletons12;
                                        if (objB6 != coroutineSingletons4) {
                                            searchFieldWithSwapButtonCardUIState4 = searchFieldWithSwapButtonCardUIState2;
                                            chaloTextStyleHelper5 = chaloTextStyleHelper6;
                                            imageUrlUIState7 = imageUrlUIState5;
                                            imageUIState12 = imageUIState11;
                                            obj8 = objB6;
                                            pbPassPurchaseLandingScreenDataState10 = pbPassPurchaseLandingScreenDataState8;
                                            cardWithTextLeftAndRightIconUiState6 = cardWithTextLeftAndRightIconUiState4;
                                            passInfoCardUIState8 = passInfoCardUIState6;
                                            f = 0.0f;
                                            cardWithTextLeftAndRightIconUiState7 = cardWithTextLeftAndRightIconUiState6;
                                            passInfoCardUIState9 = passInfoCardUIState8;
                                            imageUrlUIState8 = imageUrlUIState7;
                                            coroutineSingletons3 = coroutineSingletons4;
                                            imageUIState13 = imageUIState9;
                                            imageUIState14 = imageUIState12;
                                            pBPassPurchaseLandingScreenBottomSheetTypeUIState5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                            chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper5, (String) obj8, black2, UIFontWeight.Bold, null, 108);
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState10;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState8;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState13;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState9;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState7;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState5;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState4;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState14;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextUIStateF;
                                            buttonUIStateFactory3 = buttonUIStateFactory2;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$11 = buttonUIStateFactory3;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = f;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 12;
                                            objB7 = stringProvider2.b(StringEnum.VIEW_ALL_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                            if (objB7 == coroutineSingletons3) {
                                                return coroutineSingletons3;
                                            }
                                            imageUIState15 = imageUIState13;
                                            cardWithTextLeftAndRightIconUiState8 = cardWithTextLeftAndRightIconUiState7;
                                            chaloTextUIState = chaloTextUIStateF;
                                            imageUIState16 = imageUIState14;
                                            buttonUIStateFactory4 = buttonUIStateFactory3;
                                            loadingDialogUIState2 = loadingDialogUIState;
                                            imageUrlUIState9 = imageUrlUIState8;
                                            obj9 = objB7;
                                            passInfoCardUIState10 = passInfoCardUIState9;
                                            buttonUIState3 = buttonUIState;
                                            searchFieldWithSwapButtonCardUIState5 = searchFieldWithSwapButtonCardUIState4;
                                            pbPassPurchaseLandingScreenDataState11 = pbPassPurchaseLandingScreenDataState10;
                                            UITextStyle uITextStyle4 = UITextStyle.HeadlineSmall;
                                            UIFontWeight uIFontWeight4 = UIFontWeight.Bold;
                                            ButtonUIStateFactory buttonUIStateFactory11 = buttonUIStateFactory4;
                                            UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A4 = UiEventHandler.Companion.a(new er0(this, 16));
                                            buttonUIStateFactory11.getClass();
                                            pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 0)), WebSocketProtocol.PAYLOAD_SHORT), imageUrlUIState9, imageUIState15, imageUIState16, loadingDialogUIState2, passInfoCardUIState10, cardWithTextLeftAndRightIconUiState8, pBPassPurchaseLandingScreenBottomSheetTypeUIState5, searchFieldWithSwapButtonCardUIState5, buttonUIState3, new PBConnectingRoutesUIState(chaloTextUIState, ButtonUIStateFactory.a((String) obj9, uITextStyle4, uIFontWeight4, uiEventHandler$Companion$fromLambda$1A4)), pbPassPurchaseLandingScreenDataState11.i);
                                        }
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                    }
                    return new PbPassPurchaseLandingScreenViewState(pbPassPurchaseLandingScreenErrorUIState);
                }
                return coroutineSingletons4;
            case 1:
                obj = obj9;
                pbPassPurchaseLandingScreenDataState2 = (PbPassPurchaseLandingScreenDataState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0;
                ResultKt.b(obj);
                list = (List) obj;
                if (!pbPassPurchaseLandingScreenDataState2.c) {
                    str = pbPassPurchaseLandingScreenDataState2.h;
                    if (str != null) {
                        imageUrlUIState = null;
                    } else {
                        imageUrlUIState = null;
                    }
                    imageUIState = new ImageUIState(IconType.PB_PASS_LANDING_PLACEHOLDER, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                    passLandingFlowType = pbPassPurchaseLandingScreenDataState2.f7652a;
                    if (passLandingFlowType instanceof PassLandingFlowType.WithConfigId) {
                        i = 0;
                        if (Intrinsics.d(passLandingFlowType, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        imageUIState2 = imageUIState;
                        imageUrlUIState2 = imageUrlUIState;
                        passInfoCardUIState = null;
                        passInfoCardUIState2 = passInfoCardUIState;
                        imageUIState4 = imageUIState2;
                        imageUIState3 = new ImageUIState(IconType.IC_CUSTOMER_SUPPORT_PROFILE, (String) null, black3, new ImageUISize(ChaloThemeHelper.a().k), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
                        black3 = black3;
                        imageUIState5 = new ImageUIState(IconType.IC_ARROW_RIGHT, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState2;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState2;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState4;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState2;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = imageUIState3;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = imageUIState5;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = chaloTextStyleHelper6;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 6;
                        stringProvider = stringProvider3;
                        objB3 = stringProvider.b(StringEnum.CUSTOMER_SUPPORT, new Object[i], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                        coroutineSingletons = coroutineSingletons4;
                        if (objB3 != coroutineSingletons) {
                            pbPassPurchaseLandingScreenDataState6 = pbPassPurchaseLandingScreenDataState2;
                            obj5 = objB3;
                            imageUrlUIState4 = imageUrlUIState2;
                            imageUIState6 = imageUIState5;
                            chaloTextStyleHelper2 = chaloTextStyleHelper6;
                            pbPassPurchaseLandingScreenComponent = this;
                            cardWithTextLeftAndRightIconUiState = new CardWithTextLeftAndRightIconUiState(imageUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper2, (String) obj5, ChaloColorToken.AlmostBlackColor.f9756a, 0, null, null, null, null, 124), imageUIState6, new er0(pbPassPurchaseLandingScreenComponent, 14), 1);
                            PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType3 = pbPassPurchaseLandingScreenDataState6.e;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState6;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState4;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState4;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState2;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = null;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = null;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 7;
                            objH0 = pbPassPurchaseLandingScreenComponent.H0(pBStopSelectionScreenBottomSheetType3, pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                            if (objH0 != coroutineSingletons) {
                                PassInfoCardUIState passInfoCardUIState17 = passInfoCardUIState2;
                                imageUIState7 = imageUIState4;
                                cardWithTextLeftAndRightIconUiState2 = cardWithTextLeftAndRightIconUiState;
                                obj6 = objH0;
                                passInfoCardUIState3 = passInfoCardUIState17;
                                pBPassPurchaseLandingScreenBottomSheetTypeUIState = (PBPassPurchaseLandingScreenBottomSheetTypeUIState) obj6;
                                boolean z3 = pbPassPurchaseLandingScreenDataState6.b;
                                String str10 = pbPassPurchaseLandingScreenDataState6.f;
                                String str11 = pbPassPurchaseLandingScreenDataState6.g;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState6;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState4;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState2;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 8;
                                objI0 = pbPassPurchaseLandingScreenComponent.I0(str10, str11, pbPassPurchaseLandingScreenComponent$convertToUiState$1, z3);
                                if (objI0 != coroutineSingletons) {
                                    imageUrlUIState5 = imageUrlUIState4;
                                    pbPassPurchaseLandingScreenDataState7 = pbPassPurchaseLandingScreenDataState6;
                                    cardWithTextLeftAndRightIconUiState3 = cardWithTextLeftAndRightIconUiState2;
                                    pBPassPurchaseLandingScreenBottomSheetTypeUIState2 = pBPassPurchaseLandingScreenBottomSheetTypeUIState;
                                    obj7 = objI0;
                                    searchFieldWithSwapButtonCardUIState = (SearchFieldWithSwapButtonCardUIState) obj7;
                                    passLandingFlowType2 = pbPassPurchaseLandingScreenDataState7.f7652a;
                                    if (!(passLandingFlowType2 instanceof PassLandingFlowType.WithConfigId)) {
                                        passInfoCardUIState4 = passInfoCardUIState3;
                                        if (Intrinsics.d(passLandingFlowType2, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        passInfoCardUIState3 = passInfoCardUIState4;
                                    } else if (pbPassPurchaseLandingScreenDataState7.b) {
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                                        buttonUIStateFactory5 = buttonUIStateFactory5;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateFactory5;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                                        passInfoCardUIState5 = passInfoCardUIState3;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 9;
                                        objB4 = stringProvider.b(StringEnum.BUY_PASS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                        if (objB4 != coroutineSingletons) {
                                            buttonUIStateFactory = buttonUIStateFactory5;
                                            chaloTextStyleHelper3 = chaloTextStyleHelper6;
                                            ButtonUIStateFactory buttonUIStateFactory12 = buttonUIStateFactory;
                                            PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState14 = pbPassPurchaseLandingScreenDataState7;
                                            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory12, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objB4, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108), new er0(pbPassPurchaseLandingScreenComponent, 15), UIShape.d, false, 0.0f, 52);
                                            pbPassPurchaseLandingScreenDataState7 = pbPassPurchaseLandingScreenDataState14;
                                            passInfoCardUIState3 = passInfoCardUIState5;
                                            if (pbPassPurchaseLandingScreenDataState7.d) {
                                                black = black3;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateF;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 10;
                                                objB5 = stringProvider.b(StringEnum.PLEASE_WAIT_RUNNING_CASE_WITH_DOTS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                                if (objB5 != coroutineSingletons) {
                                                    pbPassPurchaseLandingScreenDataState9 = pbPassPurchaseLandingScreenDataState7;
                                                    passInfoCardUIState7 = passInfoCardUIState3;
                                                    imageUIState10 = imageUIState7;
                                                    searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState;
                                                    buttonUIState2 = buttonUIStateF;
                                                    chaloTextStyleHelper4 = chaloTextStyleHelper6;
                                                    pBPassPurchaseLandingScreenBottomSheetTypeUIState4 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                                    cardWithTextLeftAndRightIconUiState5 = cardWithTextLeftAndRightIconUiState3;
                                                    imageUrlUIState6 = imageUrlUIState5;
                                                    black3 = black;
                                                    SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState10 = searchFieldWithSwapButtonCardUIState3;
                                                    coroutineSingletons2 = coroutineSingletons;
                                                    ButtonUIState buttonUIState8 = buttonUIState2;
                                                    stringProvider2 = stringProvider;
                                                    imageUIState8 = null;
                                                    loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper4, (String) objB5, black3, 0, null, null, null, null, 124));
                                                    searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState10;
                                                    buttonUIState = buttonUIState8;
                                                    pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState4;
                                                    cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState5;
                                                    passInfoCardUIState6 = passInfoCardUIState7;
                                                    imageUIState9 = imageUIState10;
                                                    imageUrlUIState5 = imageUrlUIState6;
                                                    pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState9;
                                                }
                                            } else {
                                                CoroutineSingletons coroutineSingletons13 = coroutineSingletons;
                                                pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState7;
                                                coroutineSingletons2 = coroutineSingletons13;
                                                PassInfoCardUIState passInfoCardUIState18 = passInfoCardUIState3;
                                                stringProvider2 = stringProvider;
                                                imageUIState8 = null;
                                                cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState3;
                                                buttonUIState = buttonUIStateF;
                                                loadingDialogUIState = null;
                                                pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                                searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState;
                                                imageUIState9 = imageUIState7;
                                                passInfoCardUIState6 = passInfoCardUIState18;
                                            }
                                            black2 = black3;
                                            passLandingFlowType3 = pbPassPurchaseLandingScreenDataState8.f7652a;
                                            if (passLandingFlowType3 instanceof PassLandingFlowType.WithConfigId) {
                                                imageUIState11 = new ImageUIState(IconType.CHALO_BUS_INFO_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                                            } else {
                                                if (Intrinsics.d(passLandingFlowType3, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                imageUIState11 = imageUIState8;
                                            }
                                            CoroutineSingletons coroutineSingletons14 = coroutineSingletons2;
                                            buttonUIStateFactory2 = buttonUIStateFactory5;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState8;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState9;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState6;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState4;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState2;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState11;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextStyleHelper6;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = 0.0f;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 11;
                                            objB6 = stringProvider2.b(StringEnum.CONNECTING_THANE_ANDHERI_BKC_NAVI_MUMBAI_AND_COLABA, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                            coroutineSingletons4 = coroutineSingletons14;
                                            if (objB6 != coroutineSingletons4) {
                                                searchFieldWithSwapButtonCardUIState4 = searchFieldWithSwapButtonCardUIState2;
                                                chaloTextStyleHelper5 = chaloTextStyleHelper6;
                                                imageUrlUIState7 = imageUrlUIState5;
                                                imageUIState12 = imageUIState11;
                                                obj8 = objB6;
                                                pbPassPurchaseLandingScreenDataState10 = pbPassPurchaseLandingScreenDataState8;
                                                cardWithTextLeftAndRightIconUiState6 = cardWithTextLeftAndRightIconUiState4;
                                                passInfoCardUIState8 = passInfoCardUIState6;
                                                f = 0.0f;
                                                cardWithTextLeftAndRightIconUiState7 = cardWithTextLeftAndRightIconUiState6;
                                                passInfoCardUIState9 = passInfoCardUIState8;
                                                imageUrlUIState8 = imageUrlUIState7;
                                                coroutineSingletons3 = coroutineSingletons4;
                                                imageUIState13 = imageUIState9;
                                                imageUIState14 = imageUIState12;
                                                pBPassPurchaseLandingScreenBottomSheetTypeUIState5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                                chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper5, (String) obj8, black2, UIFontWeight.Bold, null, 108);
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState10;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState8;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState13;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState9;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState7;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState5;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState4;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState14;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextUIStateF;
                                                buttonUIStateFactory3 = buttonUIStateFactory2;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$11 = buttonUIStateFactory3;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = f;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 12;
                                                objB7 = stringProvider2.b(StringEnum.VIEW_ALL_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                                if (objB7 == coroutineSingletons3) {
                                                    return coroutineSingletons3;
                                                }
                                                imageUIState15 = imageUIState13;
                                                cardWithTextLeftAndRightIconUiState8 = cardWithTextLeftAndRightIconUiState7;
                                                chaloTextUIState = chaloTextUIStateF;
                                                imageUIState16 = imageUIState14;
                                                buttonUIStateFactory4 = buttonUIStateFactory3;
                                                loadingDialogUIState2 = loadingDialogUIState;
                                                imageUrlUIState9 = imageUrlUIState8;
                                                obj9 = objB7;
                                                passInfoCardUIState10 = passInfoCardUIState9;
                                                buttonUIState3 = buttonUIState;
                                                searchFieldWithSwapButtonCardUIState5 = searchFieldWithSwapButtonCardUIState4;
                                                pbPassPurchaseLandingScreenDataState11 = pbPassPurchaseLandingScreenDataState10;
                                                UITextStyle uITextStyle5 = UITextStyle.HeadlineSmall;
                                                UIFontWeight uIFontWeight5 = UIFontWeight.Bold;
                                                ButtonUIStateFactory buttonUIStateFactory13 = buttonUIStateFactory4;
                                                UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A5 = UiEventHandler.Companion.a(new er0(this, 16));
                                                buttonUIStateFactory13.getClass();
                                                pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 0)), WebSocketProtocol.PAYLOAD_SHORT), imageUrlUIState9, imageUIState15, imageUIState16, loadingDialogUIState2, passInfoCardUIState10, cardWithTextLeftAndRightIconUiState8, pBPassPurchaseLandingScreenBottomSheetTypeUIState5, searchFieldWithSwapButtonCardUIState5, buttonUIState3, new PBConnectingRoutesUIState(chaloTextUIState, ButtonUIStateFactory.a((String) obj9, uITextStyle5, uIFontWeight5, uiEventHandler$Companion$fromLambda$1A5)), pbPassPurchaseLandingScreenDataState11.i);
                                            }
                                        }
                                    }
                                    buttonUIStateF = null;
                                    if (pbPassPurchaseLandingScreenDataState7.d) {
                                        black = black3;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateF;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 10;
                                        objB5 = stringProvider.b(StringEnum.PLEASE_WAIT_RUNNING_CASE_WITH_DOTS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                        if (objB5 != coroutineSingletons) {
                                            pbPassPurchaseLandingScreenDataState9 = pbPassPurchaseLandingScreenDataState7;
                                            passInfoCardUIState7 = passInfoCardUIState3;
                                            imageUIState10 = imageUIState7;
                                            searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState;
                                            buttonUIState2 = buttonUIStateF;
                                            chaloTextStyleHelper4 = chaloTextStyleHelper6;
                                            pBPassPurchaseLandingScreenBottomSheetTypeUIState4 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                            cardWithTextLeftAndRightIconUiState5 = cardWithTextLeftAndRightIconUiState3;
                                            imageUrlUIState6 = imageUrlUIState5;
                                            black3 = black;
                                            SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState11 = searchFieldWithSwapButtonCardUIState3;
                                            coroutineSingletons2 = coroutineSingletons;
                                            ButtonUIState buttonUIState9 = buttonUIState2;
                                            stringProvider2 = stringProvider;
                                            imageUIState8 = null;
                                            loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper4, (String) objB5, black3, 0, null, null, null, null, 124));
                                            searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState11;
                                            buttonUIState = buttonUIState9;
                                            pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState4;
                                            cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState5;
                                            passInfoCardUIState6 = passInfoCardUIState7;
                                            imageUIState9 = imageUIState10;
                                            imageUrlUIState5 = imageUrlUIState6;
                                            pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState9;
                                        }
                                    } else {
                                        CoroutineSingletons coroutineSingletons15 = coroutineSingletons;
                                        pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState7;
                                        coroutineSingletons2 = coroutineSingletons15;
                                        PassInfoCardUIState passInfoCardUIState19 = passInfoCardUIState3;
                                        stringProvider2 = stringProvider;
                                        imageUIState8 = null;
                                        cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState3;
                                        buttonUIState = buttonUIStateF;
                                        loadingDialogUIState = null;
                                        pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                        searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState;
                                        imageUIState9 = imageUIState7;
                                        passInfoCardUIState6 = passInfoCardUIState19;
                                    }
                                    black2 = black3;
                                    passLandingFlowType3 = pbPassPurchaseLandingScreenDataState8.f7652a;
                                    if (passLandingFlowType3 instanceof PassLandingFlowType.WithConfigId) {
                                        imageUIState11 = new ImageUIState(IconType.CHALO_BUS_INFO_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                                    } else {
                                        if (Intrinsics.d(passLandingFlowType3, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        imageUIState11 = imageUIState8;
                                    }
                                    CoroutineSingletons coroutineSingletons16 = coroutineSingletons2;
                                    buttonUIStateFactory2 = buttonUIStateFactory5;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState8;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState9;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState6;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState4;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState2;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState11;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextStyleHelper6;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = 0.0f;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 11;
                                    objB6 = stringProvider2.b(StringEnum.CONNECTING_THANE_ANDHERI_BKC_NAVI_MUMBAI_AND_COLABA, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                    coroutineSingletons4 = coroutineSingletons16;
                                    if (objB6 != coroutineSingletons4) {
                                        searchFieldWithSwapButtonCardUIState4 = searchFieldWithSwapButtonCardUIState2;
                                        chaloTextStyleHelper5 = chaloTextStyleHelper6;
                                        imageUrlUIState7 = imageUrlUIState5;
                                        imageUIState12 = imageUIState11;
                                        obj8 = objB6;
                                        pbPassPurchaseLandingScreenDataState10 = pbPassPurchaseLandingScreenDataState8;
                                        cardWithTextLeftAndRightIconUiState6 = cardWithTextLeftAndRightIconUiState4;
                                        passInfoCardUIState8 = passInfoCardUIState6;
                                        f = 0.0f;
                                        cardWithTextLeftAndRightIconUiState7 = cardWithTextLeftAndRightIconUiState6;
                                        passInfoCardUIState9 = passInfoCardUIState8;
                                        imageUrlUIState8 = imageUrlUIState7;
                                        coroutineSingletons3 = coroutineSingletons4;
                                        imageUIState13 = imageUIState9;
                                        imageUIState14 = imageUIState12;
                                        pBPassPurchaseLandingScreenBottomSheetTypeUIState5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                        chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper5, (String) obj8, black2, UIFontWeight.Bold, null, 108);
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState10;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState8;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState13;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState9;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState7;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState5;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState4;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState14;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextUIStateF;
                                        buttonUIStateFactory3 = buttonUIStateFactory2;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$11 = buttonUIStateFactory3;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = f;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 12;
                                        objB7 = stringProvider2.b(StringEnum.VIEW_ALL_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                        if (objB7 == coroutineSingletons3) {
                                            return coroutineSingletons3;
                                        }
                                        imageUIState15 = imageUIState13;
                                        cardWithTextLeftAndRightIconUiState8 = cardWithTextLeftAndRightIconUiState7;
                                        chaloTextUIState = chaloTextUIStateF;
                                        imageUIState16 = imageUIState14;
                                        buttonUIStateFactory4 = buttonUIStateFactory3;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        imageUrlUIState9 = imageUrlUIState8;
                                        obj9 = objB7;
                                        passInfoCardUIState10 = passInfoCardUIState9;
                                        buttonUIState3 = buttonUIState;
                                        searchFieldWithSwapButtonCardUIState5 = searchFieldWithSwapButtonCardUIState4;
                                        pbPassPurchaseLandingScreenDataState11 = pbPassPurchaseLandingScreenDataState10;
                                        UITextStyle uITextStyle6 = UITextStyle.HeadlineSmall;
                                        UIFontWeight uIFontWeight6 = UIFontWeight.Bold;
                                        ButtonUIStateFactory buttonUIStateFactory14 = buttonUIStateFactory4;
                                        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A6 = UiEventHandler.Companion.a(new er0(this, 16));
                                        buttonUIStateFactory14.getClass();
                                        pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 0)), WebSocketProtocol.PAYLOAD_SHORT), imageUrlUIState9, imageUIState15, imageUIState16, loadingDialogUIState2, passInfoCardUIState10, cardWithTextLeftAndRightIconUiState8, pBPassPurchaseLandingScreenBottomSheetTypeUIState5, searchFieldWithSwapButtonCardUIState5, buttonUIState3, new PBConnectingRoutesUIState(chaloTextUIState, ButtonUIStateFactory.a((String) obj9, uITextStyle6, uIFontWeight6, uiEventHandler$Companion$fromLambda$1A6)), pbPassPurchaseLandingScreenDataState11.i);
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    i = 0;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState2;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = list;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUrlUIState;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = imageUIState;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = chaloTextStyleHelper6;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 5;
                    objB = stringProvider3.b(StringEnum.HOW_DO_PASSED_WORK, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                    if (objB != coroutineSingletons4) {
                        pbPassPurchaseLandingScreenDataState3 = pbPassPurchaseLandingScreenDataState2;
                        imageUrlUIState3 = imageUrlUIState;
                        obj2 = objB;
                        chaloTextStyleHelper = chaloTextStyleHelper6;
                        passInfoCardUIState = new PassInfoCardUIState(ChaloTextStyleHelper.f(chaloTextStyleHelper, (String) obj2, black3, UIFontWeight.Bold, null, 108), list);
                        imageUIState2 = imageUIState;
                        imageUrlUIState2 = imageUrlUIState3;
                        pbPassPurchaseLandingScreenDataState2 = pbPassPurchaseLandingScreenDataState3;
                        passInfoCardUIState2 = passInfoCardUIState;
                        imageUIState4 = imageUIState2;
                        imageUIState3 = new ImageUIState(IconType.IC_CUSTOMER_SUPPORT_PROFILE, (String) null, black3, new ImageUISize(ChaloThemeHelper.a().k), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
                        black3 = black3;
                        imageUIState5 = new ImageUIState(IconType.IC_ARROW_RIGHT, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState2;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState2;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState4;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState2;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = imageUIState3;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = imageUIState5;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = chaloTextStyleHelper6;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 6;
                        stringProvider = stringProvider3;
                        objB3 = stringProvider.b(StringEnum.CUSTOMER_SUPPORT, new Object[i], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                        coroutineSingletons = coroutineSingletons4;
                        if (objB3 != coroutineSingletons) {
                            pbPassPurchaseLandingScreenDataState6 = pbPassPurchaseLandingScreenDataState2;
                            obj5 = objB3;
                            imageUrlUIState4 = imageUrlUIState2;
                            imageUIState6 = imageUIState5;
                            chaloTextStyleHelper2 = chaloTextStyleHelper6;
                            pbPassPurchaseLandingScreenComponent = this;
                            cardWithTextLeftAndRightIconUiState = new CardWithTextLeftAndRightIconUiState(imageUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper2, (String) obj5, ChaloColorToken.AlmostBlackColor.f9756a, 0, null, null, null, null, 124), imageUIState6, new er0(pbPassPurchaseLandingScreenComponent, 14), 1);
                            PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType4 = pbPassPurchaseLandingScreenDataState6.e;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState6;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState4;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState4;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState2;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = null;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = null;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 7;
                            objH0 = pbPassPurchaseLandingScreenComponent.H0(pBStopSelectionScreenBottomSheetType4, pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                            if (objH0 != coroutineSingletons) {
                                PassInfoCardUIState passInfoCardUIState110 = passInfoCardUIState2;
                                imageUIState7 = imageUIState4;
                                cardWithTextLeftAndRightIconUiState2 = cardWithTextLeftAndRightIconUiState;
                                obj6 = objH0;
                                passInfoCardUIState3 = passInfoCardUIState110;
                                pBPassPurchaseLandingScreenBottomSheetTypeUIState = (PBPassPurchaseLandingScreenBottomSheetTypeUIState) obj6;
                                boolean z4 = pbPassPurchaseLandingScreenDataState6.b;
                                String str12 = pbPassPurchaseLandingScreenDataState6.f;
                                String str13 = pbPassPurchaseLandingScreenDataState6.g;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState6;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState4;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState2;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 8;
                                objI0 = pbPassPurchaseLandingScreenComponent.I0(str12, str13, pbPassPurchaseLandingScreenComponent$convertToUiState$1, z4);
                                if (objI0 != coroutineSingletons) {
                                    imageUrlUIState5 = imageUrlUIState4;
                                    pbPassPurchaseLandingScreenDataState7 = pbPassPurchaseLandingScreenDataState6;
                                    cardWithTextLeftAndRightIconUiState3 = cardWithTextLeftAndRightIconUiState2;
                                    pBPassPurchaseLandingScreenBottomSheetTypeUIState2 = pBPassPurchaseLandingScreenBottomSheetTypeUIState;
                                    obj7 = objI0;
                                    searchFieldWithSwapButtonCardUIState = (SearchFieldWithSwapButtonCardUIState) obj7;
                                    passLandingFlowType2 = pbPassPurchaseLandingScreenDataState7.f7652a;
                                    if (!(passLandingFlowType2 instanceof PassLandingFlowType.WithConfigId)) {
                                        passInfoCardUIState4 = passInfoCardUIState3;
                                        if (Intrinsics.d(passLandingFlowType2, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        passInfoCardUIState3 = passInfoCardUIState4;
                                    } else if (pbPassPurchaseLandingScreenDataState7.b) {
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                                        buttonUIStateFactory5 = buttonUIStateFactory5;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateFactory5;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                                        passInfoCardUIState5 = passInfoCardUIState3;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 9;
                                        objB4 = stringProvider.b(StringEnum.BUY_PASS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                        if (objB4 != coroutineSingletons) {
                                            buttonUIStateFactory = buttonUIStateFactory5;
                                            chaloTextStyleHelper3 = chaloTextStyleHelper6;
                                            ButtonUIStateFactory buttonUIStateFactory15 = buttonUIStateFactory;
                                            PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState15 = pbPassPurchaseLandingScreenDataState7;
                                            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory15, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objB4, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108), new er0(pbPassPurchaseLandingScreenComponent, 15), UIShape.d, false, 0.0f, 52);
                                            pbPassPurchaseLandingScreenDataState7 = pbPassPurchaseLandingScreenDataState15;
                                            passInfoCardUIState3 = passInfoCardUIState5;
                                            if (pbPassPurchaseLandingScreenDataState7.d) {
                                                black = black3;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateF;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 10;
                                                objB5 = stringProvider.b(StringEnum.PLEASE_WAIT_RUNNING_CASE_WITH_DOTS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                                if (objB5 != coroutineSingletons) {
                                                    pbPassPurchaseLandingScreenDataState9 = pbPassPurchaseLandingScreenDataState7;
                                                    passInfoCardUIState7 = passInfoCardUIState3;
                                                    imageUIState10 = imageUIState7;
                                                    searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState;
                                                    buttonUIState2 = buttonUIStateF;
                                                    chaloTextStyleHelper4 = chaloTextStyleHelper6;
                                                    pBPassPurchaseLandingScreenBottomSheetTypeUIState4 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                                    cardWithTextLeftAndRightIconUiState5 = cardWithTextLeftAndRightIconUiState3;
                                                    imageUrlUIState6 = imageUrlUIState5;
                                                    black3 = black;
                                                    SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState12 = searchFieldWithSwapButtonCardUIState3;
                                                    coroutineSingletons2 = coroutineSingletons;
                                                    ButtonUIState buttonUIState10 = buttonUIState2;
                                                    stringProvider2 = stringProvider;
                                                    imageUIState8 = null;
                                                    loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper4, (String) objB5, black3, 0, null, null, null, null, 124));
                                                    searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState12;
                                                    buttonUIState = buttonUIState10;
                                                    pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState4;
                                                    cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState5;
                                                    passInfoCardUIState6 = passInfoCardUIState7;
                                                    imageUIState9 = imageUIState10;
                                                    imageUrlUIState5 = imageUrlUIState6;
                                                    pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState9;
                                                }
                                            } else {
                                                CoroutineSingletons coroutineSingletons17 = coroutineSingletons;
                                                pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState7;
                                                coroutineSingletons2 = coroutineSingletons17;
                                                PassInfoCardUIState passInfoCardUIState111 = passInfoCardUIState3;
                                                stringProvider2 = stringProvider;
                                                imageUIState8 = null;
                                                cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState3;
                                                buttonUIState = buttonUIStateF;
                                                loadingDialogUIState = null;
                                                pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                                searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState;
                                                imageUIState9 = imageUIState7;
                                                passInfoCardUIState6 = passInfoCardUIState111;
                                            }
                                            black2 = black3;
                                            passLandingFlowType3 = pbPassPurchaseLandingScreenDataState8.f7652a;
                                            if (passLandingFlowType3 instanceof PassLandingFlowType.WithConfigId) {
                                                imageUIState11 = new ImageUIState(IconType.CHALO_BUS_INFO_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                                            } else {
                                                if (Intrinsics.d(passLandingFlowType3, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                imageUIState11 = imageUIState8;
                                            }
                                            CoroutineSingletons coroutineSingletons18 = coroutineSingletons2;
                                            buttonUIStateFactory2 = buttonUIStateFactory5;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState8;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState9;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState6;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState4;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState2;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState11;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextStyleHelper6;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = 0.0f;
                                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 11;
                                            objB6 = stringProvider2.b(StringEnum.CONNECTING_THANE_ANDHERI_BKC_NAVI_MUMBAI_AND_COLABA, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                            coroutineSingletons4 = coroutineSingletons18;
                                            if (objB6 != coroutineSingletons4) {
                                                searchFieldWithSwapButtonCardUIState4 = searchFieldWithSwapButtonCardUIState2;
                                                chaloTextStyleHelper5 = chaloTextStyleHelper6;
                                                imageUrlUIState7 = imageUrlUIState5;
                                                imageUIState12 = imageUIState11;
                                                obj8 = objB6;
                                                pbPassPurchaseLandingScreenDataState10 = pbPassPurchaseLandingScreenDataState8;
                                                cardWithTextLeftAndRightIconUiState6 = cardWithTextLeftAndRightIconUiState4;
                                                passInfoCardUIState8 = passInfoCardUIState6;
                                                f = 0.0f;
                                                cardWithTextLeftAndRightIconUiState7 = cardWithTextLeftAndRightIconUiState6;
                                                passInfoCardUIState9 = passInfoCardUIState8;
                                                imageUrlUIState8 = imageUrlUIState7;
                                                coroutineSingletons3 = coroutineSingletons4;
                                                imageUIState13 = imageUIState9;
                                                imageUIState14 = imageUIState12;
                                                pBPassPurchaseLandingScreenBottomSheetTypeUIState5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                                chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper5, (String) obj8, black2, UIFontWeight.Bold, null, 108);
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState10;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState8;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState13;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState9;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState7;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState5;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState4;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState14;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextUIStateF;
                                                buttonUIStateFactory3 = buttonUIStateFactory2;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$11 = buttonUIStateFactory3;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = f;
                                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 12;
                                                objB7 = stringProvider2.b(StringEnum.VIEW_ALL_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                                if (objB7 == coroutineSingletons3) {
                                                    return coroutineSingletons3;
                                                }
                                                imageUIState15 = imageUIState13;
                                                cardWithTextLeftAndRightIconUiState8 = cardWithTextLeftAndRightIconUiState7;
                                                chaloTextUIState = chaloTextUIStateF;
                                                imageUIState16 = imageUIState14;
                                                buttonUIStateFactory4 = buttonUIStateFactory3;
                                                loadingDialogUIState2 = loadingDialogUIState;
                                                imageUrlUIState9 = imageUrlUIState8;
                                                obj9 = objB7;
                                                passInfoCardUIState10 = passInfoCardUIState9;
                                                buttonUIState3 = buttonUIState;
                                                searchFieldWithSwapButtonCardUIState5 = searchFieldWithSwapButtonCardUIState4;
                                                pbPassPurchaseLandingScreenDataState11 = pbPassPurchaseLandingScreenDataState10;
                                                UITextStyle uITextStyle7 = UITextStyle.HeadlineSmall;
                                                UIFontWeight uIFontWeight7 = UIFontWeight.Bold;
                                                ButtonUIStateFactory buttonUIStateFactory16 = buttonUIStateFactory4;
                                                UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A7 = UiEventHandler.Companion.a(new er0(this, 16));
                                                buttonUIStateFactory16.getClass();
                                                pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 0)), WebSocketProtocol.PAYLOAD_SHORT), imageUrlUIState9, imageUIState15, imageUIState16, loadingDialogUIState2, passInfoCardUIState10, cardWithTextLeftAndRightIconUiState8, pBPassPurchaseLandingScreenBottomSheetTypeUIState5, searchFieldWithSwapButtonCardUIState5, buttonUIState3, new PBConnectingRoutesUIState(chaloTextUIState, ButtonUIStateFactory.a((String) obj9, uITextStyle7, uIFontWeight7, uiEventHandler$Companion$fromLambda$1A7)), pbPassPurchaseLandingScreenDataState11.i);
                                            }
                                        }
                                    }
                                    buttonUIStateF = null;
                                    if (pbPassPurchaseLandingScreenDataState7.d) {
                                        black = black3;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateF;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 10;
                                        objB5 = stringProvider.b(StringEnum.PLEASE_WAIT_RUNNING_CASE_WITH_DOTS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                        if (objB5 != coroutineSingletons) {
                                            pbPassPurchaseLandingScreenDataState9 = pbPassPurchaseLandingScreenDataState7;
                                            passInfoCardUIState7 = passInfoCardUIState3;
                                            imageUIState10 = imageUIState7;
                                            searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState;
                                            buttonUIState2 = buttonUIStateF;
                                            chaloTextStyleHelper4 = chaloTextStyleHelper6;
                                            pBPassPurchaseLandingScreenBottomSheetTypeUIState4 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                            cardWithTextLeftAndRightIconUiState5 = cardWithTextLeftAndRightIconUiState3;
                                            imageUrlUIState6 = imageUrlUIState5;
                                            black3 = black;
                                            SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState13 = searchFieldWithSwapButtonCardUIState3;
                                            coroutineSingletons2 = coroutineSingletons;
                                            ButtonUIState buttonUIState11 = buttonUIState2;
                                            stringProvider2 = stringProvider;
                                            imageUIState8 = null;
                                            loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper4, (String) objB5, black3, 0, null, null, null, null, 124));
                                            searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState13;
                                            buttonUIState = buttonUIState11;
                                            pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState4;
                                            cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState5;
                                            passInfoCardUIState6 = passInfoCardUIState7;
                                            imageUIState9 = imageUIState10;
                                            imageUrlUIState5 = imageUrlUIState6;
                                            pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState9;
                                        }
                                    } else {
                                        CoroutineSingletons coroutineSingletons19 = coroutineSingletons;
                                        pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState7;
                                        coroutineSingletons2 = coroutineSingletons19;
                                        PassInfoCardUIState passInfoCardUIState112 = passInfoCardUIState3;
                                        stringProvider2 = stringProvider;
                                        imageUIState8 = null;
                                        cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState3;
                                        buttonUIState = buttonUIStateF;
                                        loadingDialogUIState = null;
                                        pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                        searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState;
                                        imageUIState9 = imageUIState7;
                                        passInfoCardUIState6 = passInfoCardUIState112;
                                    }
                                    black2 = black3;
                                    passLandingFlowType3 = pbPassPurchaseLandingScreenDataState8.f7652a;
                                    if (passLandingFlowType3 instanceof PassLandingFlowType.WithConfigId) {
                                        imageUIState11 = new ImageUIState(IconType.CHALO_BUS_INFO_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                                    } else {
                                        if (Intrinsics.d(passLandingFlowType3, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        imageUIState11 = imageUIState8;
                                    }
                                    CoroutineSingletons coroutineSingletons110 = coroutineSingletons2;
                                    buttonUIStateFactory2 = buttonUIStateFactory5;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState8;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState9;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState6;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState4;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState2;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState11;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextStyleHelper6;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = 0.0f;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 11;
                                    objB6 = stringProvider2.b(StringEnum.CONNECTING_THANE_ANDHERI_BKC_NAVI_MUMBAI_AND_COLABA, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                    coroutineSingletons4 = coroutineSingletons110;
                                    if (objB6 != coroutineSingletons4) {
                                        searchFieldWithSwapButtonCardUIState4 = searchFieldWithSwapButtonCardUIState2;
                                        chaloTextStyleHelper5 = chaloTextStyleHelper6;
                                        imageUrlUIState7 = imageUrlUIState5;
                                        imageUIState12 = imageUIState11;
                                        obj8 = objB6;
                                        pbPassPurchaseLandingScreenDataState10 = pbPassPurchaseLandingScreenDataState8;
                                        cardWithTextLeftAndRightIconUiState6 = cardWithTextLeftAndRightIconUiState4;
                                        passInfoCardUIState8 = passInfoCardUIState6;
                                        f = 0.0f;
                                        cardWithTextLeftAndRightIconUiState7 = cardWithTextLeftAndRightIconUiState6;
                                        passInfoCardUIState9 = passInfoCardUIState8;
                                        imageUrlUIState8 = imageUrlUIState7;
                                        coroutineSingletons3 = coroutineSingletons4;
                                        imageUIState13 = imageUIState9;
                                        imageUIState14 = imageUIState12;
                                        pBPassPurchaseLandingScreenBottomSheetTypeUIState5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                        chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper5, (String) obj8, black2, UIFontWeight.Bold, null, 108);
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState10;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState8;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState13;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState9;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState7;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState5;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState4;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState14;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextUIStateF;
                                        buttonUIStateFactory3 = buttonUIStateFactory2;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$11 = buttonUIStateFactory3;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = f;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 12;
                                        objB7 = stringProvider2.b(StringEnum.VIEW_ALL_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                        if (objB7 == coroutineSingletons3) {
                                            return coroutineSingletons3;
                                        }
                                        imageUIState15 = imageUIState13;
                                        cardWithTextLeftAndRightIconUiState8 = cardWithTextLeftAndRightIconUiState7;
                                        chaloTextUIState = chaloTextUIStateF;
                                        imageUIState16 = imageUIState14;
                                        buttonUIStateFactory4 = buttonUIStateFactory3;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        imageUrlUIState9 = imageUrlUIState8;
                                        obj9 = objB7;
                                        passInfoCardUIState10 = passInfoCardUIState9;
                                        buttonUIState3 = buttonUIState;
                                        searchFieldWithSwapButtonCardUIState5 = searchFieldWithSwapButtonCardUIState4;
                                        pbPassPurchaseLandingScreenDataState11 = pbPassPurchaseLandingScreenDataState10;
                                        UITextStyle uITextStyle8 = UITextStyle.HeadlineSmall;
                                        UIFontWeight uIFontWeight8 = UIFontWeight.Bold;
                                        ButtonUIStateFactory buttonUIStateFactory17 = buttonUIStateFactory4;
                                        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A8 = UiEventHandler.Companion.a(new er0(this, 16));
                                        buttonUIStateFactory17.getClass();
                                        pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 0)), WebSocketProtocol.PAYLOAD_SHORT), imageUrlUIState9, imageUIState15, imageUIState16, loadingDialogUIState2, passInfoCardUIState10, cardWithTextLeftAndRightIconUiState8, pBPassPurchaseLandingScreenBottomSheetTypeUIState5, searchFieldWithSwapButtonCardUIState5, buttonUIState3, new PBConnectingRoutesUIState(chaloTextUIState, ButtonUIStateFactory.a((String) obj9, uITextStyle8, uIFontWeight8, uiEventHandler$Companion$fromLambda$1A8)), pbPassPurchaseLandingScreenDataState11.i);
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    return coroutineSingletons4;
                }
                pbPassPurchaseLandingScreenErrorUIState = PbPassPurchaseLandingScreenType.Loading.f7670a;
                return new PbPassPurchaseLandingScreenViewState(pbPassPurchaseLandingScreenErrorUIState);
            case 2:
                IconType iconType3 = (IconType) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2;
                StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory2 = (StandardErrorScreenUIStateFactory) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1;
                pbPassPurchaseLandingScreenDataState4 = (PbPassPurchaseLandingScreenDataState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0;
                ResultKt.b(obj9);
                str2 = (String) obj9;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState4;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = standardErrorScreenUIStateFactory2;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = iconType3;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = str2;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 3;
                Object objB8 = stringProvider3.b(StringEnum.PLEASE_TRY_AGAIN_AFTER_SOMETIME, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                if (objB8 != coroutineSingletons4) {
                    iconType = iconType3;
                    obj3 = objB8;
                    standardErrorScreenUIStateFactory = standardErrorScreenUIStateFactory2;
                    str3 = (String) obj3;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState4;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = standardErrorScreenUIStateFactory;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = iconType;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = str2;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = str3;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 4;
                    objB2 = stringProvider3.b(StringEnum.RETRY, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                    if (objB2 != coroutineSingletons4) {
                        PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState16 = pbPassPurchaseLandingScreenDataState4;
                        str4 = str3;
                        obj4 = objB2;
                        pbPassPurchaseLandingScreenDataState5 = pbPassPurchaseLandingScreenDataState16;
                        iconType2 = iconType;
                        str5 = str2;
                        String str14 = (String) obj4;
                        StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory3 = standardErrorScreenUIStateFactory;
                        fr0 fr0Var = new fr0(1, this, pbPassPurchaseLandingScreenDataState5);
                        standardErrorScreenUIStateFactory3.getClass();
                        pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenErrorUIState(StandardErrorScreenUIStateFactory.a(iconType2, true, str5, str4, str14, fr0Var));
                        return new PbPassPurchaseLandingScreenViewState(pbPassPurchaseLandingScreenErrorUIState);
                    }
                }
                return coroutineSingletons4;
            case 3:
                String str15 = (String) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3;
                iconType = (IconType) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2;
                StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory4 = (StandardErrorScreenUIStateFactory) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1;
                PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState17 = (PbPassPurchaseLandingScreenDataState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0;
                ResultKt.b(obj9);
                standardErrorScreenUIStateFactory = standardErrorScreenUIStateFactory4;
                pbPassPurchaseLandingScreenDataState4 = pbPassPurchaseLandingScreenDataState17;
                str2 = str15;
                obj3 = obj9;
                str3 = (String) obj3;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState4;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = standardErrorScreenUIStateFactory;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = iconType;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = str2;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = str3;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 4;
                objB2 = stringProvider3.b(StringEnum.RETRY, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                if (objB2 != coroutineSingletons4) {
                    PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState18 = pbPassPurchaseLandingScreenDataState4;
                    str4 = str3;
                    obj4 = objB2;
                    pbPassPurchaseLandingScreenDataState5 = pbPassPurchaseLandingScreenDataState18;
                    iconType2 = iconType;
                    str5 = str2;
                    String str16 = (String) obj4;
                    StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory5 = standardErrorScreenUIStateFactory;
                    fr0 fr0Var2 = new fr0(1, this, pbPassPurchaseLandingScreenDataState5);
                    standardErrorScreenUIStateFactory5.getClass();
                    pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenErrorUIState(StandardErrorScreenUIStateFactory.a(iconType2, true, str5, str4, str16, fr0Var2));
                    return new PbPassPurchaseLandingScreenViewState(pbPassPurchaseLandingScreenErrorUIState);
                }
                return coroutineSingletons4;
            case 4:
                String str17 = (String) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4;
                String str18 = (String) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3;
                IconType iconType4 = (IconType) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2;
                StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory6 = (StandardErrorScreenUIStateFactory) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1;
                pbPassPurchaseLandingScreenDataState5 = (PbPassPurchaseLandingScreenDataState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0;
                ResultKt.b(obj9);
                str5 = str18;
                iconType2 = iconType4;
                standardErrorScreenUIStateFactory = standardErrorScreenUIStateFactory6;
                str4 = str17;
                obj4 = obj9;
                String str19 = (String) obj4;
                StandardErrorScreenUIStateFactory standardErrorScreenUIStateFactory7 = standardErrorScreenUIStateFactory;
                fr0 fr0Var3 = new fr0(1, this, pbPassPurchaseLandingScreenDataState5);
                standardErrorScreenUIStateFactory7.getClass();
                pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenErrorUIState(StandardErrorScreenUIStateFactory.a(iconType2, true, str5, str4, str19, fr0Var3));
                return new PbPassPurchaseLandingScreenViewState(pbPassPurchaseLandingScreenErrorUIState);
            case 5:
                ChaloTextStyleHelper chaloTextStyleHelper7 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4;
                imageUIState = (ImageUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3;
                ImageUrlUIState imageUrlUIState10 = (ImageUrlUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2;
                list = (List) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1;
                PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState19 = (PbPassPurchaseLandingScreenDataState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0;
                ResultKt.b(obj9);
                imageUrlUIState3 = imageUrlUIState10;
                i = 0;
                chaloTextStyleHelper = chaloTextStyleHelper7;
                obj2 = obj9;
                pbPassPurchaseLandingScreenDataState3 = pbPassPurchaseLandingScreenDataState19;
                passInfoCardUIState = new PassInfoCardUIState(ChaloTextStyleHelper.f(chaloTextStyleHelper, (String) obj2, black3, UIFontWeight.Bold, null, 108), list);
                imageUIState2 = imageUIState;
                imageUrlUIState2 = imageUrlUIState3;
                pbPassPurchaseLandingScreenDataState2 = pbPassPurchaseLandingScreenDataState3;
                passInfoCardUIState2 = passInfoCardUIState;
                imageUIState4 = imageUIState2;
                imageUIState3 = new ImageUIState(IconType.IC_CUSTOMER_SUPPORT_PROFILE, (String) null, black3, new ImageUISize(ChaloThemeHelper.a().k), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
                black3 = black3;
                imageUIState5 = new ImageUIState(IconType.IC_ARROW_RIGHT, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState2;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState2;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState4;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState2;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = imageUIState3;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = imageUIState5;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = chaloTextStyleHelper6;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 6;
                stringProvider = stringProvider3;
                objB3 = stringProvider.b(StringEnum.CUSTOMER_SUPPORT, new Object[i], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                coroutineSingletons = coroutineSingletons4;
                if (objB3 != coroutineSingletons) {
                    pbPassPurchaseLandingScreenDataState6 = pbPassPurchaseLandingScreenDataState2;
                    obj5 = objB3;
                    imageUrlUIState4 = imageUrlUIState2;
                    imageUIState6 = imageUIState5;
                    chaloTextStyleHelper2 = chaloTextStyleHelper6;
                    pbPassPurchaseLandingScreenComponent = this;
                    cardWithTextLeftAndRightIconUiState = new CardWithTextLeftAndRightIconUiState(imageUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper2, (String) obj5, ChaloColorToken.AlmostBlackColor.f9756a, 0, null, null, null, null, 124), imageUIState6, new er0(pbPassPurchaseLandingScreenComponent, 14), 1);
                    PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType5 = pbPassPurchaseLandingScreenDataState6.e;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState6;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState4;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState4;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState2;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = null;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = null;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 7;
                    objH0 = pbPassPurchaseLandingScreenComponent.H0(pBStopSelectionScreenBottomSheetType5, pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                    if (objH0 != coroutineSingletons) {
                        PassInfoCardUIState passInfoCardUIState113 = passInfoCardUIState2;
                        imageUIState7 = imageUIState4;
                        cardWithTextLeftAndRightIconUiState2 = cardWithTextLeftAndRightIconUiState;
                        obj6 = objH0;
                        passInfoCardUIState3 = passInfoCardUIState113;
                        pBPassPurchaseLandingScreenBottomSheetTypeUIState = (PBPassPurchaseLandingScreenBottomSheetTypeUIState) obj6;
                        boolean z5 = pbPassPurchaseLandingScreenDataState6.b;
                        String str110 = pbPassPurchaseLandingScreenDataState6.f;
                        String str111 = pbPassPurchaseLandingScreenDataState6.g;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState6;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState4;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState2;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 8;
                        objI0 = pbPassPurchaseLandingScreenComponent.I0(str110, str111, pbPassPurchaseLandingScreenComponent$convertToUiState$1, z5);
                        if (objI0 != coroutineSingletons) {
                            imageUrlUIState5 = imageUrlUIState4;
                            pbPassPurchaseLandingScreenDataState7 = pbPassPurchaseLandingScreenDataState6;
                            cardWithTextLeftAndRightIconUiState3 = cardWithTextLeftAndRightIconUiState2;
                            pBPassPurchaseLandingScreenBottomSheetTypeUIState2 = pBPassPurchaseLandingScreenBottomSheetTypeUIState;
                            obj7 = objI0;
                            searchFieldWithSwapButtonCardUIState = (SearchFieldWithSwapButtonCardUIState) obj7;
                            passLandingFlowType2 = pbPassPurchaseLandingScreenDataState7.f7652a;
                            if (!(passLandingFlowType2 instanceof PassLandingFlowType.WithConfigId)) {
                                passInfoCardUIState4 = passInfoCardUIState3;
                                if (Intrinsics.d(passLandingFlowType2, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                passInfoCardUIState3 = passInfoCardUIState4;
                            } else if (pbPassPurchaseLandingScreenDataState7.b) {
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                                buttonUIStateFactory5 = buttonUIStateFactory5;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateFactory5;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                                passInfoCardUIState5 = passInfoCardUIState3;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 9;
                                objB4 = stringProvider.b(StringEnum.BUY_PASS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                if (objB4 != coroutineSingletons) {
                                    buttonUIStateFactory = buttonUIStateFactory5;
                                    chaloTextStyleHelper3 = chaloTextStyleHelper6;
                                    ButtonUIStateFactory buttonUIStateFactory18 = buttonUIStateFactory;
                                    PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState110 = pbPassPurchaseLandingScreenDataState7;
                                    buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory18, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objB4, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108), new er0(pbPassPurchaseLandingScreenComponent, 15), UIShape.d, false, 0.0f, 52);
                                    pbPassPurchaseLandingScreenDataState7 = pbPassPurchaseLandingScreenDataState110;
                                    passInfoCardUIState3 = passInfoCardUIState5;
                                    if (pbPassPurchaseLandingScreenDataState7.d) {
                                        black = black3;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateF;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 10;
                                        objB5 = stringProvider.b(StringEnum.PLEASE_WAIT_RUNNING_CASE_WITH_DOTS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                        if (objB5 != coroutineSingletons) {
                                            pbPassPurchaseLandingScreenDataState9 = pbPassPurchaseLandingScreenDataState7;
                                            passInfoCardUIState7 = passInfoCardUIState3;
                                            imageUIState10 = imageUIState7;
                                            searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState;
                                            buttonUIState2 = buttonUIStateF;
                                            chaloTextStyleHelper4 = chaloTextStyleHelper6;
                                            pBPassPurchaseLandingScreenBottomSheetTypeUIState4 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                            cardWithTextLeftAndRightIconUiState5 = cardWithTextLeftAndRightIconUiState3;
                                            imageUrlUIState6 = imageUrlUIState5;
                                            black3 = black;
                                            SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState14 = searchFieldWithSwapButtonCardUIState3;
                                            coroutineSingletons2 = coroutineSingletons;
                                            ButtonUIState buttonUIState12 = buttonUIState2;
                                            stringProvider2 = stringProvider;
                                            imageUIState8 = null;
                                            loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper4, (String) objB5, black3, 0, null, null, null, null, 124));
                                            searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState14;
                                            buttonUIState = buttonUIState12;
                                            pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState4;
                                            cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState5;
                                            passInfoCardUIState6 = passInfoCardUIState7;
                                            imageUIState9 = imageUIState10;
                                            imageUrlUIState5 = imageUrlUIState6;
                                            pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState9;
                                        }
                                    } else {
                                        CoroutineSingletons coroutineSingletons111 = coroutineSingletons;
                                        pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState7;
                                        coroutineSingletons2 = coroutineSingletons111;
                                        PassInfoCardUIState passInfoCardUIState114 = passInfoCardUIState3;
                                        stringProvider2 = stringProvider;
                                        imageUIState8 = null;
                                        cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState3;
                                        buttonUIState = buttonUIStateF;
                                        loadingDialogUIState = null;
                                        pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                        searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState;
                                        imageUIState9 = imageUIState7;
                                        passInfoCardUIState6 = passInfoCardUIState114;
                                    }
                                    black2 = black3;
                                    passLandingFlowType3 = pbPassPurchaseLandingScreenDataState8.f7652a;
                                    if (passLandingFlowType3 instanceof PassLandingFlowType.WithConfigId) {
                                        imageUIState11 = new ImageUIState(IconType.CHALO_BUS_INFO_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                                    } else {
                                        if (Intrinsics.d(passLandingFlowType3, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        imageUIState11 = imageUIState8;
                                    }
                                    CoroutineSingletons coroutineSingletons112 = coroutineSingletons2;
                                    buttonUIStateFactory2 = buttonUIStateFactory5;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState8;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState9;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState6;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState4;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState2;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState11;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextStyleHelper6;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = 0.0f;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 11;
                                    objB6 = stringProvider2.b(StringEnum.CONNECTING_THANE_ANDHERI_BKC_NAVI_MUMBAI_AND_COLABA, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                    coroutineSingletons4 = coroutineSingletons112;
                                    if (objB6 != coroutineSingletons4) {
                                        searchFieldWithSwapButtonCardUIState4 = searchFieldWithSwapButtonCardUIState2;
                                        chaloTextStyleHelper5 = chaloTextStyleHelper6;
                                        imageUrlUIState7 = imageUrlUIState5;
                                        imageUIState12 = imageUIState11;
                                        obj8 = objB6;
                                        pbPassPurchaseLandingScreenDataState10 = pbPassPurchaseLandingScreenDataState8;
                                        cardWithTextLeftAndRightIconUiState6 = cardWithTextLeftAndRightIconUiState4;
                                        passInfoCardUIState8 = passInfoCardUIState6;
                                        f = 0.0f;
                                        cardWithTextLeftAndRightIconUiState7 = cardWithTextLeftAndRightIconUiState6;
                                        passInfoCardUIState9 = passInfoCardUIState8;
                                        imageUrlUIState8 = imageUrlUIState7;
                                        coroutineSingletons3 = coroutineSingletons4;
                                        imageUIState13 = imageUIState9;
                                        imageUIState14 = imageUIState12;
                                        pBPassPurchaseLandingScreenBottomSheetTypeUIState5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                        chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper5, (String) obj8, black2, UIFontWeight.Bold, null, 108);
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState10;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState8;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState13;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState9;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState7;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState5;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState4;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState14;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextUIStateF;
                                        buttonUIStateFactory3 = buttonUIStateFactory2;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$11 = buttonUIStateFactory3;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = f;
                                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 12;
                                        objB7 = stringProvider2.b(StringEnum.VIEW_ALL_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                        if (objB7 == coroutineSingletons3) {
                                            return coroutineSingletons3;
                                        }
                                        imageUIState15 = imageUIState13;
                                        cardWithTextLeftAndRightIconUiState8 = cardWithTextLeftAndRightIconUiState7;
                                        chaloTextUIState = chaloTextUIStateF;
                                        imageUIState16 = imageUIState14;
                                        buttonUIStateFactory4 = buttonUIStateFactory3;
                                        loadingDialogUIState2 = loadingDialogUIState;
                                        imageUrlUIState9 = imageUrlUIState8;
                                        obj9 = objB7;
                                        passInfoCardUIState10 = passInfoCardUIState9;
                                        buttonUIState3 = buttonUIState;
                                        searchFieldWithSwapButtonCardUIState5 = searchFieldWithSwapButtonCardUIState4;
                                        pbPassPurchaseLandingScreenDataState11 = pbPassPurchaseLandingScreenDataState10;
                                        UITextStyle uITextStyle9 = UITextStyle.HeadlineSmall;
                                        UIFontWeight uIFontWeight9 = UIFontWeight.Bold;
                                        ButtonUIStateFactory buttonUIStateFactory19 = buttonUIStateFactory4;
                                        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A9 = UiEventHandler.Companion.a(new er0(this, 16));
                                        buttonUIStateFactory19.getClass();
                                        pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 0)), WebSocketProtocol.PAYLOAD_SHORT), imageUrlUIState9, imageUIState15, imageUIState16, loadingDialogUIState2, passInfoCardUIState10, cardWithTextLeftAndRightIconUiState8, pBPassPurchaseLandingScreenBottomSheetTypeUIState5, searchFieldWithSwapButtonCardUIState5, buttonUIState3, new PBConnectingRoutesUIState(chaloTextUIState, ButtonUIStateFactory.a((String) obj9, uITextStyle9, uIFontWeight9, uiEventHandler$Companion$fromLambda$1A9)), pbPassPurchaseLandingScreenDataState11.i);
                                        return new PbPassPurchaseLandingScreenViewState(pbPassPurchaseLandingScreenErrorUIState);
                                    }
                                    return coroutineSingletons4;
                                }
                            }
                            buttonUIStateF = null;
                            if (pbPassPurchaseLandingScreenDataState7.d) {
                                black = black3;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateF;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 10;
                                objB5 = stringProvider.b(StringEnum.PLEASE_WAIT_RUNNING_CASE_WITH_DOTS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                if (objB5 != coroutineSingletons) {
                                    pbPassPurchaseLandingScreenDataState9 = pbPassPurchaseLandingScreenDataState7;
                                    passInfoCardUIState7 = passInfoCardUIState3;
                                    imageUIState10 = imageUIState7;
                                    searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState;
                                    buttonUIState2 = buttonUIStateF;
                                    chaloTextStyleHelper4 = chaloTextStyleHelper6;
                                    pBPassPurchaseLandingScreenBottomSheetTypeUIState4 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                    cardWithTextLeftAndRightIconUiState5 = cardWithTextLeftAndRightIconUiState3;
                                    imageUrlUIState6 = imageUrlUIState5;
                                    black3 = black;
                                    SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState15 = searchFieldWithSwapButtonCardUIState3;
                                    coroutineSingletons2 = coroutineSingletons;
                                    ButtonUIState buttonUIState13 = buttonUIState2;
                                    stringProvider2 = stringProvider;
                                    imageUIState8 = null;
                                    loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper4, (String) objB5, black3, 0, null, null, null, null, 124));
                                    searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState15;
                                    buttonUIState = buttonUIState13;
                                    pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState4;
                                    cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState5;
                                    passInfoCardUIState6 = passInfoCardUIState7;
                                    imageUIState9 = imageUIState10;
                                    imageUrlUIState5 = imageUrlUIState6;
                                    pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState9;
                                }
                            } else {
                                CoroutineSingletons coroutineSingletons113 = coroutineSingletons;
                                pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState7;
                                coroutineSingletons2 = coroutineSingletons113;
                                PassInfoCardUIState passInfoCardUIState115 = passInfoCardUIState3;
                                stringProvider2 = stringProvider;
                                imageUIState8 = null;
                                cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState3;
                                buttonUIState = buttonUIStateF;
                                loadingDialogUIState = null;
                                pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState;
                                imageUIState9 = imageUIState7;
                                passInfoCardUIState6 = passInfoCardUIState115;
                            }
                            black2 = black3;
                            passLandingFlowType3 = pbPassPurchaseLandingScreenDataState8.f7652a;
                            if (passLandingFlowType3 instanceof PassLandingFlowType.WithConfigId) {
                                imageUIState11 = new ImageUIState(IconType.CHALO_BUS_INFO_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                            } else {
                                if (Intrinsics.d(passLandingFlowType3, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                imageUIState11 = imageUIState8;
                            }
                            CoroutineSingletons coroutineSingletons114 = coroutineSingletons2;
                            buttonUIStateFactory2 = buttonUIStateFactory5;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState8;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState9;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState6;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState4;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState2;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState11;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextStyleHelper6;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = 0.0f;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 11;
                            objB6 = stringProvider2.b(StringEnum.CONNECTING_THANE_ANDHERI_BKC_NAVI_MUMBAI_AND_COLABA, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                            coroutineSingletons4 = coroutineSingletons114;
                            if (objB6 != coroutineSingletons4) {
                                searchFieldWithSwapButtonCardUIState4 = searchFieldWithSwapButtonCardUIState2;
                                chaloTextStyleHelper5 = chaloTextStyleHelper6;
                                imageUrlUIState7 = imageUrlUIState5;
                                imageUIState12 = imageUIState11;
                                obj8 = objB6;
                                pbPassPurchaseLandingScreenDataState10 = pbPassPurchaseLandingScreenDataState8;
                                cardWithTextLeftAndRightIconUiState6 = cardWithTextLeftAndRightIconUiState4;
                                passInfoCardUIState8 = passInfoCardUIState6;
                                f = 0.0f;
                                cardWithTextLeftAndRightIconUiState7 = cardWithTextLeftAndRightIconUiState6;
                                passInfoCardUIState9 = passInfoCardUIState8;
                                imageUrlUIState8 = imageUrlUIState7;
                                coroutineSingletons3 = coroutineSingletons4;
                                imageUIState13 = imageUIState9;
                                imageUIState14 = imageUIState12;
                                pBPassPurchaseLandingScreenBottomSheetTypeUIState5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper5, (String) obj8, black2, UIFontWeight.Bold, null, 108);
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState10;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState8;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState13;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState9;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState7;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState5;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState4;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState14;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextUIStateF;
                                buttonUIStateFactory3 = buttonUIStateFactory2;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$11 = buttonUIStateFactory3;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = f;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 12;
                                objB7 = stringProvider2.b(StringEnum.VIEW_ALL_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                if (objB7 == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                                imageUIState15 = imageUIState13;
                                cardWithTextLeftAndRightIconUiState8 = cardWithTextLeftAndRightIconUiState7;
                                chaloTextUIState = chaloTextUIStateF;
                                imageUIState16 = imageUIState14;
                                buttonUIStateFactory4 = buttonUIStateFactory3;
                                loadingDialogUIState2 = loadingDialogUIState;
                                imageUrlUIState9 = imageUrlUIState8;
                                obj9 = objB7;
                                passInfoCardUIState10 = passInfoCardUIState9;
                                buttonUIState3 = buttonUIState;
                                searchFieldWithSwapButtonCardUIState5 = searchFieldWithSwapButtonCardUIState4;
                                pbPassPurchaseLandingScreenDataState11 = pbPassPurchaseLandingScreenDataState10;
                                UITextStyle uITextStyle10 = UITextStyle.HeadlineSmall;
                                UIFontWeight uIFontWeight10 = UIFontWeight.Bold;
                                ButtonUIStateFactory buttonUIStateFactory110 = buttonUIStateFactory4;
                                UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A10 = UiEventHandler.Companion.a(new er0(this, 16));
                                buttonUIStateFactory110.getClass();
                                pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 0)), WebSocketProtocol.PAYLOAD_SHORT), imageUrlUIState9, imageUIState15, imageUIState16, loadingDialogUIState2, passInfoCardUIState10, cardWithTextLeftAndRightIconUiState8, pBPassPurchaseLandingScreenBottomSheetTypeUIState5, searchFieldWithSwapButtonCardUIState5, buttonUIState3, new PBConnectingRoutesUIState(chaloTextUIState, ButtonUIStateFactory.a((String) obj9, uITextStyle10, uIFontWeight10, uiEventHandler$Companion$fromLambda$1A10)), pbPassPurchaseLandingScreenDataState11.i);
                                return new PbPassPurchaseLandingScreenViewState(pbPassPurchaseLandingScreenErrorUIState);
                            }
                            return coroutineSingletons4;
                        }
                    }
                }
                return coroutineSingletons;
            case 6:
                ChaloTextStyleHelper chaloTextStyleHelper8 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6;
                imageUIState6 = (ImageUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5;
                imageUIState3 = (ImageUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4;
                PassInfoCardUIState passInfoCardUIState20 = (PassInfoCardUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3;
                ImageUIState imageUIState17 = (ImageUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2;
                ImageUrlUIState imageUrlUIState11 = (ImageUrlUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1;
                PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState20 = (PbPassPurchaseLandingScreenDataState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0;
                ResultKt.b(obj9);
                chaloTextStyleHelper2 = chaloTextStyleHelper8;
                passInfoCardUIState2 = passInfoCardUIState20;
                imageUIState4 = imageUIState17;
                imageUrlUIState4 = imageUrlUIState11;
                pbPassPurchaseLandingScreenDataState6 = pbPassPurchaseLandingScreenDataState20;
                stringProvider = stringProvider3;
                obj5 = obj9;
                coroutineSingletons = coroutineSingletons4;
                pbPassPurchaseLandingScreenComponent = this;
                cardWithTextLeftAndRightIconUiState = new CardWithTextLeftAndRightIconUiState(imageUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper2, (String) obj5, ChaloColorToken.AlmostBlackColor.f9756a, 0, null, null, null, null, 124), imageUIState6, new er0(pbPassPurchaseLandingScreenComponent, 14), 1);
                PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType6 = pbPassPurchaseLandingScreenDataState6.e;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState6;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState4;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState4;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState2;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = null;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = null;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 7;
                objH0 = pbPassPurchaseLandingScreenComponent.H0(pBStopSelectionScreenBottomSheetType6, pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                if (objH0 != coroutineSingletons) {
                    PassInfoCardUIState passInfoCardUIState116 = passInfoCardUIState2;
                    imageUIState7 = imageUIState4;
                    cardWithTextLeftAndRightIconUiState2 = cardWithTextLeftAndRightIconUiState;
                    obj6 = objH0;
                    passInfoCardUIState3 = passInfoCardUIState116;
                    pBPassPurchaseLandingScreenBottomSheetTypeUIState = (PBPassPurchaseLandingScreenBottomSheetTypeUIState) obj6;
                    boolean z6 = pbPassPurchaseLandingScreenDataState6.b;
                    String str112 = pbPassPurchaseLandingScreenDataState6.f;
                    String str113 = pbPassPurchaseLandingScreenDataState6.g;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState6;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState4;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState2;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 8;
                    objI0 = pbPassPurchaseLandingScreenComponent.I0(str112, str113, pbPassPurchaseLandingScreenComponent$convertToUiState$1, z6);
                    if (objI0 != coroutineSingletons) {
                        imageUrlUIState5 = imageUrlUIState4;
                        pbPassPurchaseLandingScreenDataState7 = pbPassPurchaseLandingScreenDataState6;
                        cardWithTextLeftAndRightIconUiState3 = cardWithTextLeftAndRightIconUiState2;
                        pBPassPurchaseLandingScreenBottomSheetTypeUIState2 = pBPassPurchaseLandingScreenBottomSheetTypeUIState;
                        obj7 = objI0;
                        searchFieldWithSwapButtonCardUIState = (SearchFieldWithSwapButtonCardUIState) obj7;
                        passLandingFlowType2 = pbPassPurchaseLandingScreenDataState7.f7652a;
                        if (!(passLandingFlowType2 instanceof PassLandingFlowType.WithConfigId)) {
                            passInfoCardUIState4 = passInfoCardUIState3;
                            if (Intrinsics.d(passLandingFlowType2, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            passInfoCardUIState3 = passInfoCardUIState4;
                        } else if (pbPassPurchaseLandingScreenDataState7.b) {
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                            buttonUIStateFactory5 = buttonUIStateFactory5;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateFactory5;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                            passInfoCardUIState5 = passInfoCardUIState3;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 9;
                            objB4 = stringProvider.b(StringEnum.BUY_PASS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                            if (objB4 != coroutineSingletons) {
                                buttonUIStateFactory = buttonUIStateFactory5;
                                chaloTextStyleHelper3 = chaloTextStyleHelper6;
                                ButtonUIStateFactory buttonUIStateFactory111 = buttonUIStateFactory;
                                PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState111 = pbPassPurchaseLandingScreenDataState7;
                                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory111, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objB4, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108), new er0(pbPassPurchaseLandingScreenComponent, 15), UIShape.d, false, 0.0f, 52);
                                pbPassPurchaseLandingScreenDataState7 = pbPassPurchaseLandingScreenDataState111;
                                passInfoCardUIState3 = passInfoCardUIState5;
                                if (pbPassPurchaseLandingScreenDataState7.d) {
                                    black = black3;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateF;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 10;
                                    objB5 = stringProvider.b(StringEnum.PLEASE_WAIT_RUNNING_CASE_WITH_DOTS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                    if (objB5 != coroutineSingletons) {
                                        pbPassPurchaseLandingScreenDataState9 = pbPassPurchaseLandingScreenDataState7;
                                        passInfoCardUIState7 = passInfoCardUIState3;
                                        imageUIState10 = imageUIState7;
                                        searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState;
                                        buttonUIState2 = buttonUIStateF;
                                        chaloTextStyleHelper4 = chaloTextStyleHelper6;
                                        pBPassPurchaseLandingScreenBottomSheetTypeUIState4 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                        cardWithTextLeftAndRightIconUiState5 = cardWithTextLeftAndRightIconUiState3;
                                        imageUrlUIState6 = imageUrlUIState5;
                                        black3 = black;
                                        SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState16 = searchFieldWithSwapButtonCardUIState3;
                                        coroutineSingletons2 = coroutineSingletons;
                                        ButtonUIState buttonUIState14 = buttonUIState2;
                                        stringProvider2 = stringProvider;
                                        imageUIState8 = null;
                                        loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper4, (String) objB5, black3, 0, null, null, null, null, 124));
                                        searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState16;
                                        buttonUIState = buttonUIState14;
                                        pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState4;
                                        cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState5;
                                        passInfoCardUIState6 = passInfoCardUIState7;
                                        imageUIState9 = imageUIState10;
                                        imageUrlUIState5 = imageUrlUIState6;
                                        pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState9;
                                    }
                                } else {
                                    CoroutineSingletons coroutineSingletons115 = coroutineSingletons;
                                    pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState7;
                                    coroutineSingletons2 = coroutineSingletons115;
                                    PassInfoCardUIState passInfoCardUIState117 = passInfoCardUIState3;
                                    stringProvider2 = stringProvider;
                                    imageUIState8 = null;
                                    cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState3;
                                    buttonUIState = buttonUIStateF;
                                    loadingDialogUIState = null;
                                    pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                    searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState;
                                    imageUIState9 = imageUIState7;
                                    passInfoCardUIState6 = passInfoCardUIState117;
                                }
                                black2 = black3;
                                passLandingFlowType3 = pbPassPurchaseLandingScreenDataState8.f7652a;
                                if (passLandingFlowType3 instanceof PassLandingFlowType.WithConfigId) {
                                    imageUIState11 = new ImageUIState(IconType.CHALO_BUS_INFO_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                                } else {
                                    if (Intrinsics.d(passLandingFlowType3, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    imageUIState11 = imageUIState8;
                                }
                                CoroutineSingletons coroutineSingletons116 = coroutineSingletons2;
                                buttonUIStateFactory2 = buttonUIStateFactory5;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState8;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState9;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState6;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState4;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState2;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState11;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextStyleHelper6;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = 0.0f;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 11;
                                objB6 = stringProvider2.b(StringEnum.CONNECTING_THANE_ANDHERI_BKC_NAVI_MUMBAI_AND_COLABA, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                coroutineSingletons4 = coroutineSingletons116;
                                if (objB6 != coroutineSingletons4) {
                                    searchFieldWithSwapButtonCardUIState4 = searchFieldWithSwapButtonCardUIState2;
                                    chaloTextStyleHelper5 = chaloTextStyleHelper6;
                                    imageUrlUIState7 = imageUrlUIState5;
                                    imageUIState12 = imageUIState11;
                                    obj8 = objB6;
                                    pbPassPurchaseLandingScreenDataState10 = pbPassPurchaseLandingScreenDataState8;
                                    cardWithTextLeftAndRightIconUiState6 = cardWithTextLeftAndRightIconUiState4;
                                    passInfoCardUIState8 = passInfoCardUIState6;
                                    f = 0.0f;
                                    cardWithTextLeftAndRightIconUiState7 = cardWithTextLeftAndRightIconUiState6;
                                    passInfoCardUIState9 = passInfoCardUIState8;
                                    imageUrlUIState8 = imageUrlUIState7;
                                    coroutineSingletons3 = coroutineSingletons4;
                                    imageUIState13 = imageUIState9;
                                    imageUIState14 = imageUIState12;
                                    pBPassPurchaseLandingScreenBottomSheetTypeUIState5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                    chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper5, (String) obj8, black2, UIFontWeight.Bold, null, 108);
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState10;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState8;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState13;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState9;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState7;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState5;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState4;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState14;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextUIStateF;
                                    buttonUIStateFactory3 = buttonUIStateFactory2;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$11 = buttonUIStateFactory3;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = f;
                                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 12;
                                    objB7 = stringProvider2.b(StringEnum.VIEW_ALL_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                    if (objB7 == coroutineSingletons3) {
                                        return coroutineSingletons3;
                                    }
                                    imageUIState15 = imageUIState13;
                                    cardWithTextLeftAndRightIconUiState8 = cardWithTextLeftAndRightIconUiState7;
                                    chaloTextUIState = chaloTextUIStateF;
                                    imageUIState16 = imageUIState14;
                                    buttonUIStateFactory4 = buttonUIStateFactory3;
                                    loadingDialogUIState2 = loadingDialogUIState;
                                    imageUrlUIState9 = imageUrlUIState8;
                                    obj9 = objB7;
                                    passInfoCardUIState10 = passInfoCardUIState9;
                                    buttonUIState3 = buttonUIState;
                                    searchFieldWithSwapButtonCardUIState5 = searchFieldWithSwapButtonCardUIState4;
                                    pbPassPurchaseLandingScreenDataState11 = pbPassPurchaseLandingScreenDataState10;
                                    UITextStyle uITextStyle11 = UITextStyle.HeadlineSmall;
                                    UIFontWeight uIFontWeight11 = UIFontWeight.Bold;
                                    ButtonUIStateFactory buttonUIStateFactory112 = buttonUIStateFactory4;
                                    UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A11 = UiEventHandler.Companion.a(new er0(this, 16));
                                    buttonUIStateFactory112.getClass();
                                    pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 0)), WebSocketProtocol.PAYLOAD_SHORT), imageUrlUIState9, imageUIState15, imageUIState16, loadingDialogUIState2, passInfoCardUIState10, cardWithTextLeftAndRightIconUiState8, pBPassPurchaseLandingScreenBottomSheetTypeUIState5, searchFieldWithSwapButtonCardUIState5, buttonUIState3, new PBConnectingRoutesUIState(chaloTextUIState, ButtonUIStateFactory.a((String) obj9, uITextStyle11, uIFontWeight11, uiEventHandler$Companion$fromLambda$1A11)), pbPassPurchaseLandingScreenDataState11.i);
                                    return new PbPassPurchaseLandingScreenViewState(pbPassPurchaseLandingScreenErrorUIState);
                                }
                                return coroutineSingletons4;
                            }
                        }
                        buttonUIStateF = null;
                        if (pbPassPurchaseLandingScreenDataState7.d) {
                            black = black3;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateF;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 10;
                            objB5 = stringProvider.b(StringEnum.PLEASE_WAIT_RUNNING_CASE_WITH_DOTS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                            if (objB5 != coroutineSingletons) {
                                pbPassPurchaseLandingScreenDataState9 = pbPassPurchaseLandingScreenDataState7;
                                passInfoCardUIState7 = passInfoCardUIState3;
                                imageUIState10 = imageUIState7;
                                searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState;
                                buttonUIState2 = buttonUIStateF;
                                chaloTextStyleHelper4 = chaloTextStyleHelper6;
                                pBPassPurchaseLandingScreenBottomSheetTypeUIState4 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                cardWithTextLeftAndRightIconUiState5 = cardWithTextLeftAndRightIconUiState3;
                                imageUrlUIState6 = imageUrlUIState5;
                                black3 = black;
                                SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState17 = searchFieldWithSwapButtonCardUIState3;
                                coroutineSingletons2 = coroutineSingletons;
                                ButtonUIState buttonUIState15 = buttonUIState2;
                                stringProvider2 = stringProvider;
                                imageUIState8 = null;
                                loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper4, (String) objB5, black3, 0, null, null, null, null, 124));
                                searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState17;
                                buttonUIState = buttonUIState15;
                                pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState4;
                                cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState5;
                                passInfoCardUIState6 = passInfoCardUIState7;
                                imageUIState9 = imageUIState10;
                                imageUrlUIState5 = imageUrlUIState6;
                                pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState9;
                            }
                        } else {
                            CoroutineSingletons coroutineSingletons117 = coroutineSingletons;
                            pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState7;
                            coroutineSingletons2 = coroutineSingletons117;
                            PassInfoCardUIState passInfoCardUIState118 = passInfoCardUIState3;
                            stringProvider2 = stringProvider;
                            imageUIState8 = null;
                            cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState3;
                            buttonUIState = buttonUIStateF;
                            loadingDialogUIState = null;
                            pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                            searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState;
                            imageUIState9 = imageUIState7;
                            passInfoCardUIState6 = passInfoCardUIState118;
                        }
                        black2 = black3;
                        passLandingFlowType3 = pbPassPurchaseLandingScreenDataState8.f7652a;
                        if (passLandingFlowType3 instanceof PassLandingFlowType.WithConfigId) {
                            imageUIState11 = new ImageUIState(IconType.CHALO_BUS_INFO_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                        } else {
                            if (Intrinsics.d(passLandingFlowType3, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            imageUIState11 = imageUIState8;
                        }
                        CoroutineSingletons coroutineSingletons118 = coroutineSingletons2;
                        buttonUIStateFactory2 = buttonUIStateFactory5;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState8;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState9;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState6;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState4;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState2;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState11;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextStyleHelper6;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = 0.0f;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 11;
                        objB6 = stringProvider2.b(StringEnum.CONNECTING_THANE_ANDHERI_BKC_NAVI_MUMBAI_AND_COLABA, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                        coroutineSingletons4 = coroutineSingletons118;
                        if (objB6 != coroutineSingletons4) {
                            searchFieldWithSwapButtonCardUIState4 = searchFieldWithSwapButtonCardUIState2;
                            chaloTextStyleHelper5 = chaloTextStyleHelper6;
                            imageUrlUIState7 = imageUrlUIState5;
                            imageUIState12 = imageUIState11;
                            obj8 = objB6;
                            pbPassPurchaseLandingScreenDataState10 = pbPassPurchaseLandingScreenDataState8;
                            cardWithTextLeftAndRightIconUiState6 = cardWithTextLeftAndRightIconUiState4;
                            passInfoCardUIState8 = passInfoCardUIState6;
                            f = 0.0f;
                            cardWithTextLeftAndRightIconUiState7 = cardWithTextLeftAndRightIconUiState6;
                            passInfoCardUIState9 = passInfoCardUIState8;
                            imageUrlUIState8 = imageUrlUIState7;
                            coroutineSingletons3 = coroutineSingletons4;
                            imageUIState13 = imageUIState9;
                            imageUIState14 = imageUIState12;
                            pBPassPurchaseLandingScreenBottomSheetTypeUIState5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                            chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper5, (String) obj8, black2, UIFontWeight.Bold, null, 108);
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState10;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState8;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState13;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState9;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState7;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState5;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState4;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState14;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextUIStateF;
                            buttonUIStateFactory3 = buttonUIStateFactory2;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$11 = buttonUIStateFactory3;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = f;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 12;
                            objB7 = stringProvider2.b(StringEnum.VIEW_ALL_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                            if (objB7 == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            imageUIState15 = imageUIState13;
                            cardWithTextLeftAndRightIconUiState8 = cardWithTextLeftAndRightIconUiState7;
                            chaloTextUIState = chaloTextUIStateF;
                            imageUIState16 = imageUIState14;
                            buttonUIStateFactory4 = buttonUIStateFactory3;
                            loadingDialogUIState2 = loadingDialogUIState;
                            imageUrlUIState9 = imageUrlUIState8;
                            obj9 = objB7;
                            passInfoCardUIState10 = passInfoCardUIState9;
                            buttonUIState3 = buttonUIState;
                            searchFieldWithSwapButtonCardUIState5 = searchFieldWithSwapButtonCardUIState4;
                            pbPassPurchaseLandingScreenDataState11 = pbPassPurchaseLandingScreenDataState10;
                            UITextStyle uITextStyle12 = UITextStyle.HeadlineSmall;
                            UIFontWeight uIFontWeight12 = UIFontWeight.Bold;
                            ButtonUIStateFactory buttonUIStateFactory113 = buttonUIStateFactory4;
                            UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A12 = UiEventHandler.Companion.a(new er0(this, 16));
                            buttonUIStateFactory113.getClass();
                            pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 0)), WebSocketProtocol.PAYLOAD_SHORT), imageUrlUIState9, imageUIState15, imageUIState16, loadingDialogUIState2, passInfoCardUIState10, cardWithTextLeftAndRightIconUiState8, pBPassPurchaseLandingScreenBottomSheetTypeUIState5, searchFieldWithSwapButtonCardUIState5, buttonUIState3, new PBConnectingRoutesUIState(chaloTextUIState, ButtonUIStateFactory.a((String) obj9, uITextStyle12, uIFontWeight12, uiEventHandler$Companion$fromLambda$1A12)), pbPassPurchaseLandingScreenDataState11.i);
                            return new PbPassPurchaseLandingScreenViewState(pbPassPurchaseLandingScreenErrorUIState);
                        }
                        return coroutineSingletons4;
                    }
                }
                return coroutineSingletons;
            case 7:
                CardWithTextLeftAndRightIconUiState cardWithTextLeftAndRightIconUiState9 = (CardWithTextLeftAndRightIconUiState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4;
                passInfoCardUIState3 = (PassInfoCardUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3;
                ImageUIState imageUIState18 = (ImageUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2;
                imageUrlUIState4 = (ImageUrlUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1;
                pbPassPurchaseLandingScreenDataState6 = (PbPassPurchaseLandingScreenDataState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0;
                ResultKt.b(obj9);
                coroutineSingletons = coroutineSingletons4;
                buttonUIStateFactory5 = buttonUIStateFactory5;
                imageUIState7 = imageUIState18;
                stringProvider = stringProvider3;
                pbPassPurchaseLandingScreenComponent = this;
                cardWithTextLeftAndRightIconUiState2 = cardWithTextLeftAndRightIconUiState9;
                obj6 = obj9;
                pBPassPurchaseLandingScreenBottomSheetTypeUIState = (PBPassPurchaseLandingScreenBottomSheetTypeUIState) obj6;
                boolean z7 = pbPassPurchaseLandingScreenDataState6.b;
                String str114 = pbPassPurchaseLandingScreenDataState6.f;
                String str115 = pbPassPurchaseLandingScreenDataState6.g;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState6;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState4;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState2;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 8;
                objI0 = pbPassPurchaseLandingScreenComponent.I0(str114, str115, pbPassPurchaseLandingScreenComponent$convertToUiState$1, z7);
                if (objI0 != coroutineSingletons) {
                    imageUrlUIState5 = imageUrlUIState4;
                    pbPassPurchaseLandingScreenDataState7 = pbPassPurchaseLandingScreenDataState6;
                    cardWithTextLeftAndRightIconUiState3 = cardWithTextLeftAndRightIconUiState2;
                    pBPassPurchaseLandingScreenBottomSheetTypeUIState2 = pBPassPurchaseLandingScreenBottomSheetTypeUIState;
                    obj7 = objI0;
                    searchFieldWithSwapButtonCardUIState = (SearchFieldWithSwapButtonCardUIState) obj7;
                    passLandingFlowType2 = pbPassPurchaseLandingScreenDataState7.f7652a;
                    if (!(passLandingFlowType2 instanceof PassLandingFlowType.WithConfigId)) {
                        passInfoCardUIState4 = passInfoCardUIState3;
                        if (Intrinsics.d(passLandingFlowType2, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        passInfoCardUIState3 = passInfoCardUIState4;
                    } else if (pbPassPurchaseLandingScreenDataState7.b) {
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                        buttonUIStateFactory5 = buttonUIStateFactory5;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateFactory5;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                        passInfoCardUIState5 = passInfoCardUIState3;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 9;
                        objB4 = stringProvider.b(StringEnum.BUY_PASS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                        if (objB4 != coroutineSingletons) {
                            buttonUIStateFactory = buttonUIStateFactory5;
                            chaloTextStyleHelper3 = chaloTextStyleHelper6;
                            ButtonUIStateFactory buttonUIStateFactory114 = buttonUIStateFactory;
                            PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState112 = pbPassPurchaseLandingScreenDataState7;
                            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory114, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objB4, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108), new er0(pbPassPurchaseLandingScreenComponent, 15), UIShape.d, false, 0.0f, 52);
                            pbPassPurchaseLandingScreenDataState7 = pbPassPurchaseLandingScreenDataState112;
                            passInfoCardUIState3 = passInfoCardUIState5;
                            if (pbPassPurchaseLandingScreenDataState7.d) {
                                black = black3;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateF;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 10;
                                objB5 = stringProvider.b(StringEnum.PLEASE_WAIT_RUNNING_CASE_WITH_DOTS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                if (objB5 != coroutineSingletons) {
                                    pbPassPurchaseLandingScreenDataState9 = pbPassPurchaseLandingScreenDataState7;
                                    passInfoCardUIState7 = passInfoCardUIState3;
                                    imageUIState10 = imageUIState7;
                                    searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState;
                                    buttonUIState2 = buttonUIStateF;
                                    chaloTextStyleHelper4 = chaloTextStyleHelper6;
                                    pBPassPurchaseLandingScreenBottomSheetTypeUIState4 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                    cardWithTextLeftAndRightIconUiState5 = cardWithTextLeftAndRightIconUiState3;
                                    imageUrlUIState6 = imageUrlUIState5;
                                    black3 = black;
                                    SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState18 = searchFieldWithSwapButtonCardUIState3;
                                    coroutineSingletons2 = coroutineSingletons;
                                    ButtonUIState buttonUIState16 = buttonUIState2;
                                    stringProvider2 = stringProvider;
                                    imageUIState8 = null;
                                    loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper4, (String) objB5, black3, 0, null, null, null, null, 124));
                                    searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState18;
                                    buttonUIState = buttonUIState16;
                                    pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState4;
                                    cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState5;
                                    passInfoCardUIState6 = passInfoCardUIState7;
                                    imageUIState9 = imageUIState10;
                                    imageUrlUIState5 = imageUrlUIState6;
                                    pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState9;
                                }
                            } else {
                                CoroutineSingletons coroutineSingletons119 = coroutineSingletons;
                                pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState7;
                                coroutineSingletons2 = coroutineSingletons119;
                                PassInfoCardUIState passInfoCardUIState119 = passInfoCardUIState3;
                                stringProvider2 = stringProvider;
                                imageUIState8 = null;
                                cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState3;
                                buttonUIState = buttonUIStateF;
                                loadingDialogUIState = null;
                                pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState;
                                imageUIState9 = imageUIState7;
                                passInfoCardUIState6 = passInfoCardUIState119;
                            }
                            black2 = black3;
                            passLandingFlowType3 = pbPassPurchaseLandingScreenDataState8.f7652a;
                            if (passLandingFlowType3 instanceof PassLandingFlowType.WithConfigId) {
                                imageUIState11 = new ImageUIState(IconType.CHALO_BUS_INFO_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                            } else {
                                if (Intrinsics.d(passLandingFlowType3, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                imageUIState11 = imageUIState8;
                            }
                            CoroutineSingletons coroutineSingletons1110 = coroutineSingletons2;
                            buttonUIStateFactory2 = buttonUIStateFactory5;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState8;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState9;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState6;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState4;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState2;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState11;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextStyleHelper6;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = 0.0f;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 11;
                            objB6 = stringProvider2.b(StringEnum.CONNECTING_THANE_ANDHERI_BKC_NAVI_MUMBAI_AND_COLABA, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                            coroutineSingletons4 = coroutineSingletons1110;
                            if (objB6 != coroutineSingletons4) {
                                searchFieldWithSwapButtonCardUIState4 = searchFieldWithSwapButtonCardUIState2;
                                chaloTextStyleHelper5 = chaloTextStyleHelper6;
                                imageUrlUIState7 = imageUrlUIState5;
                                imageUIState12 = imageUIState11;
                                obj8 = objB6;
                                pbPassPurchaseLandingScreenDataState10 = pbPassPurchaseLandingScreenDataState8;
                                cardWithTextLeftAndRightIconUiState6 = cardWithTextLeftAndRightIconUiState4;
                                passInfoCardUIState8 = passInfoCardUIState6;
                                f = 0.0f;
                                cardWithTextLeftAndRightIconUiState7 = cardWithTextLeftAndRightIconUiState6;
                                passInfoCardUIState9 = passInfoCardUIState8;
                                imageUrlUIState8 = imageUrlUIState7;
                                coroutineSingletons3 = coroutineSingletons4;
                                imageUIState13 = imageUIState9;
                                imageUIState14 = imageUIState12;
                                pBPassPurchaseLandingScreenBottomSheetTypeUIState5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper5, (String) obj8, black2, UIFontWeight.Bold, null, 108);
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState10;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState8;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState13;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState9;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState7;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState5;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState4;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState14;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextUIStateF;
                                buttonUIStateFactory3 = buttonUIStateFactory2;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$11 = buttonUIStateFactory3;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = f;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 12;
                                objB7 = stringProvider2.b(StringEnum.VIEW_ALL_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                if (objB7 == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                                imageUIState15 = imageUIState13;
                                cardWithTextLeftAndRightIconUiState8 = cardWithTextLeftAndRightIconUiState7;
                                chaloTextUIState = chaloTextUIStateF;
                                imageUIState16 = imageUIState14;
                                buttonUIStateFactory4 = buttonUIStateFactory3;
                                loadingDialogUIState2 = loadingDialogUIState;
                                imageUrlUIState9 = imageUrlUIState8;
                                obj9 = objB7;
                                passInfoCardUIState10 = passInfoCardUIState9;
                                buttonUIState3 = buttonUIState;
                                searchFieldWithSwapButtonCardUIState5 = searchFieldWithSwapButtonCardUIState4;
                                pbPassPurchaseLandingScreenDataState11 = pbPassPurchaseLandingScreenDataState10;
                                UITextStyle uITextStyle13 = UITextStyle.HeadlineSmall;
                                UIFontWeight uIFontWeight13 = UIFontWeight.Bold;
                                ButtonUIStateFactory buttonUIStateFactory115 = buttonUIStateFactory4;
                                UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A13 = UiEventHandler.Companion.a(new er0(this, 16));
                                buttonUIStateFactory115.getClass();
                                pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 0)), WebSocketProtocol.PAYLOAD_SHORT), imageUrlUIState9, imageUIState15, imageUIState16, loadingDialogUIState2, passInfoCardUIState10, cardWithTextLeftAndRightIconUiState8, pBPassPurchaseLandingScreenBottomSheetTypeUIState5, searchFieldWithSwapButtonCardUIState5, buttonUIState3, new PBConnectingRoutesUIState(chaloTextUIState, ButtonUIStateFactory.a((String) obj9, uITextStyle13, uIFontWeight13, uiEventHandler$Companion$fromLambda$1A13)), pbPassPurchaseLandingScreenDataState11.i);
                                return new PbPassPurchaseLandingScreenViewState(pbPassPurchaseLandingScreenErrorUIState);
                            }
                            return coroutineSingletons4;
                        }
                    }
                    buttonUIStateF = null;
                    if (pbPassPurchaseLandingScreenDataState7.d) {
                        black = black3;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateF;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 10;
                        objB5 = stringProvider.b(StringEnum.PLEASE_WAIT_RUNNING_CASE_WITH_DOTS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                        if (objB5 != coroutineSingletons) {
                            pbPassPurchaseLandingScreenDataState9 = pbPassPurchaseLandingScreenDataState7;
                            passInfoCardUIState7 = passInfoCardUIState3;
                            imageUIState10 = imageUIState7;
                            searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState;
                            buttonUIState2 = buttonUIStateF;
                            chaloTextStyleHelper4 = chaloTextStyleHelper6;
                            pBPassPurchaseLandingScreenBottomSheetTypeUIState4 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                            cardWithTextLeftAndRightIconUiState5 = cardWithTextLeftAndRightIconUiState3;
                            imageUrlUIState6 = imageUrlUIState5;
                            black3 = black;
                            SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState19 = searchFieldWithSwapButtonCardUIState3;
                            coroutineSingletons2 = coroutineSingletons;
                            ButtonUIState buttonUIState17 = buttonUIState2;
                            stringProvider2 = stringProvider;
                            imageUIState8 = null;
                            loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper4, (String) objB5, black3, 0, null, null, null, null, 124));
                            searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState19;
                            buttonUIState = buttonUIState17;
                            pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState4;
                            cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState5;
                            passInfoCardUIState6 = passInfoCardUIState7;
                            imageUIState9 = imageUIState10;
                            imageUrlUIState5 = imageUrlUIState6;
                            pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState9;
                        }
                    } else {
                        CoroutineSingletons coroutineSingletons1111 = coroutineSingletons;
                        pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState7;
                        coroutineSingletons2 = coroutineSingletons1111;
                        PassInfoCardUIState passInfoCardUIState1110 = passInfoCardUIState3;
                        stringProvider2 = stringProvider;
                        imageUIState8 = null;
                        cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState3;
                        buttonUIState = buttonUIStateF;
                        loadingDialogUIState = null;
                        pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                        searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState;
                        imageUIState9 = imageUIState7;
                        passInfoCardUIState6 = passInfoCardUIState1110;
                    }
                    black2 = black3;
                    passLandingFlowType3 = pbPassPurchaseLandingScreenDataState8.f7652a;
                    if (passLandingFlowType3 instanceof PassLandingFlowType.WithConfigId) {
                        imageUIState11 = new ImageUIState(IconType.CHALO_BUS_INFO_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                    } else {
                        if (Intrinsics.d(passLandingFlowType3, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        imageUIState11 = imageUIState8;
                    }
                    CoroutineSingletons coroutineSingletons1112 = coroutineSingletons2;
                    buttonUIStateFactory2 = buttonUIStateFactory5;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState8;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState9;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState6;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState4;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState2;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState11;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextStyleHelper6;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = 0.0f;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 11;
                    objB6 = stringProvider2.b(StringEnum.CONNECTING_THANE_ANDHERI_BKC_NAVI_MUMBAI_AND_COLABA, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                    coroutineSingletons4 = coroutineSingletons1112;
                    if (objB6 != coroutineSingletons4) {
                        searchFieldWithSwapButtonCardUIState4 = searchFieldWithSwapButtonCardUIState2;
                        chaloTextStyleHelper5 = chaloTextStyleHelper6;
                        imageUrlUIState7 = imageUrlUIState5;
                        imageUIState12 = imageUIState11;
                        obj8 = objB6;
                        pbPassPurchaseLandingScreenDataState10 = pbPassPurchaseLandingScreenDataState8;
                        cardWithTextLeftAndRightIconUiState6 = cardWithTextLeftAndRightIconUiState4;
                        passInfoCardUIState8 = passInfoCardUIState6;
                        f = 0.0f;
                        cardWithTextLeftAndRightIconUiState7 = cardWithTextLeftAndRightIconUiState6;
                        passInfoCardUIState9 = passInfoCardUIState8;
                        imageUrlUIState8 = imageUrlUIState7;
                        coroutineSingletons3 = coroutineSingletons4;
                        imageUIState13 = imageUIState9;
                        imageUIState14 = imageUIState12;
                        pBPassPurchaseLandingScreenBottomSheetTypeUIState5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                        chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper5, (String) obj8, black2, UIFontWeight.Bold, null, 108);
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState10;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState8;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState13;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState9;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState7;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState5;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState4;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState14;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextUIStateF;
                        buttonUIStateFactory3 = buttonUIStateFactory2;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$11 = buttonUIStateFactory3;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = f;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 12;
                        objB7 = stringProvider2.b(StringEnum.VIEW_ALL_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                        if (objB7 == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                        imageUIState15 = imageUIState13;
                        cardWithTextLeftAndRightIconUiState8 = cardWithTextLeftAndRightIconUiState7;
                        chaloTextUIState = chaloTextUIStateF;
                        imageUIState16 = imageUIState14;
                        buttonUIStateFactory4 = buttonUIStateFactory3;
                        loadingDialogUIState2 = loadingDialogUIState;
                        imageUrlUIState9 = imageUrlUIState8;
                        obj9 = objB7;
                        passInfoCardUIState10 = passInfoCardUIState9;
                        buttonUIState3 = buttonUIState;
                        searchFieldWithSwapButtonCardUIState5 = searchFieldWithSwapButtonCardUIState4;
                        pbPassPurchaseLandingScreenDataState11 = pbPassPurchaseLandingScreenDataState10;
                        UITextStyle uITextStyle14 = UITextStyle.HeadlineSmall;
                        UIFontWeight uIFontWeight14 = UIFontWeight.Bold;
                        ButtonUIStateFactory buttonUIStateFactory116 = buttonUIStateFactory4;
                        UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A14 = UiEventHandler.Companion.a(new er0(this, 16));
                        buttonUIStateFactory116.getClass();
                        pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 0)), WebSocketProtocol.PAYLOAD_SHORT), imageUrlUIState9, imageUIState15, imageUIState16, loadingDialogUIState2, passInfoCardUIState10, cardWithTextLeftAndRightIconUiState8, pBPassPurchaseLandingScreenBottomSheetTypeUIState5, searchFieldWithSwapButtonCardUIState5, buttonUIState3, new PBConnectingRoutesUIState(chaloTextUIState, ButtonUIStateFactory.a((String) obj9, uITextStyle14, uIFontWeight14, uiEventHandler$Companion$fromLambda$1A14)), pbPassPurchaseLandingScreenDataState11.i);
                        return new PbPassPurchaseLandingScreenViewState(pbPassPurchaseLandingScreenErrorUIState);
                    }
                    return coroutineSingletons4;
                }
                return coroutineSingletons;
            case 8:
                PBPassPurchaseLandingScreenBottomSheetTypeUIState pBPassPurchaseLandingScreenBottomSheetTypeUIState6 = (PBPassPurchaseLandingScreenBottomSheetTypeUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5;
                CardWithTextLeftAndRightIconUiState cardWithTextLeftAndRightIconUiState10 = (CardWithTextLeftAndRightIconUiState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4;
                PassInfoCardUIState passInfoCardUIState21 = (PassInfoCardUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3;
                ImageUIState imageUIState19 = (ImageUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2;
                ImageUrlUIState imageUrlUIState12 = (ImageUrlUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1;
                PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState21 = (PbPassPurchaseLandingScreenDataState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0;
                ResultKt.b(obj9);
                buttonUIStateFactory5 = buttonUIStateFactory5;
                imageUIState7 = imageUIState19;
                imageUrlUIState5 = imageUrlUIState12;
                pbPassPurchaseLandingScreenDataState7 = pbPassPurchaseLandingScreenDataState21;
                stringProvider = stringProvider3;
                pbPassPurchaseLandingScreenComponent = this;
                pBPassPurchaseLandingScreenBottomSheetTypeUIState2 = pBPassPurchaseLandingScreenBottomSheetTypeUIState6;
                coroutineSingletons = coroutineSingletons4;
                cardWithTextLeftAndRightIconUiState3 = cardWithTextLeftAndRightIconUiState10;
                passInfoCardUIState3 = passInfoCardUIState21;
                obj7 = obj9;
                searchFieldWithSwapButtonCardUIState = (SearchFieldWithSwapButtonCardUIState) obj7;
                passLandingFlowType2 = pbPassPurchaseLandingScreenDataState7.f7652a;
                if (!(passLandingFlowType2 instanceof PassLandingFlowType.WithConfigId)) {
                    if (pbPassPurchaseLandingScreenDataState7.b) {
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                        buttonUIStateFactory5 = buttonUIStateFactory5;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateFactory5;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                        passInfoCardUIState5 = passInfoCardUIState3;
                        pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 9;
                        objB4 = stringProvider.b(StringEnum.BUY_PASS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                        if (objB4 != coroutineSingletons) {
                            buttonUIStateFactory = buttonUIStateFactory5;
                            chaloTextStyleHelper3 = chaloTextStyleHelper6;
                            ButtonUIStateFactory buttonUIStateFactory117 = buttonUIStateFactory;
                            PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState113 = pbPassPurchaseLandingScreenDataState7;
                            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory117, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objB4, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108), new er0(pbPassPurchaseLandingScreenComponent, 15), UIShape.d, false, 0.0f, 52);
                            pbPassPurchaseLandingScreenDataState7 = pbPassPurchaseLandingScreenDataState113;
                            passInfoCardUIState3 = passInfoCardUIState5;
                            if (pbPassPurchaseLandingScreenDataState7.d) {
                                black = black3;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateF;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 10;
                                objB5 = stringProvider.b(StringEnum.PLEASE_WAIT_RUNNING_CASE_WITH_DOTS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                if (objB5 != coroutineSingletons) {
                                    pbPassPurchaseLandingScreenDataState9 = pbPassPurchaseLandingScreenDataState7;
                                    passInfoCardUIState7 = passInfoCardUIState3;
                                    imageUIState10 = imageUIState7;
                                    searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState;
                                    buttonUIState2 = buttonUIStateF;
                                    chaloTextStyleHelper4 = chaloTextStyleHelper6;
                                    pBPassPurchaseLandingScreenBottomSheetTypeUIState4 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                    cardWithTextLeftAndRightIconUiState5 = cardWithTextLeftAndRightIconUiState3;
                                    imageUrlUIState6 = imageUrlUIState5;
                                    black3 = black;
                                    SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState110 = searchFieldWithSwapButtonCardUIState3;
                                    coroutineSingletons2 = coroutineSingletons;
                                    ButtonUIState buttonUIState18 = buttonUIState2;
                                    stringProvider2 = stringProvider;
                                    imageUIState8 = null;
                                    loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper4, (String) objB5, black3, 0, null, null, null, null, 124));
                                    searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState110;
                                    buttonUIState = buttonUIState18;
                                    pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState4;
                                    cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState5;
                                    passInfoCardUIState6 = passInfoCardUIState7;
                                    imageUIState9 = imageUIState10;
                                    imageUrlUIState5 = imageUrlUIState6;
                                    pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState9;
                                }
                            } else {
                                CoroutineSingletons coroutineSingletons1113 = coroutineSingletons;
                                pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState7;
                                coroutineSingletons2 = coroutineSingletons1113;
                                PassInfoCardUIState passInfoCardUIState1111 = passInfoCardUIState3;
                                stringProvider2 = stringProvider;
                                imageUIState8 = null;
                                cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState3;
                                buttonUIState = buttonUIStateF;
                                loadingDialogUIState = null;
                                pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                                searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState;
                                imageUIState9 = imageUIState7;
                                passInfoCardUIState6 = passInfoCardUIState1111;
                            }
                            black2 = black3;
                            passLandingFlowType3 = pbPassPurchaseLandingScreenDataState8.f7652a;
                            if (passLandingFlowType3 instanceof PassLandingFlowType.WithConfigId) {
                                imageUIState11 = new ImageUIState(IconType.CHALO_BUS_INFO_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                            } else {
                                if (Intrinsics.d(passLandingFlowType3, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                imageUIState11 = imageUIState8;
                            }
                            CoroutineSingletons coroutineSingletons1114 = coroutineSingletons2;
                            buttonUIStateFactory2 = buttonUIStateFactory5;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState8;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState9;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState6;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState4;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState2;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState11;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextStyleHelper6;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = 0.0f;
                            pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 11;
                            objB6 = stringProvider2.b(StringEnum.CONNECTING_THANE_ANDHERI_BKC_NAVI_MUMBAI_AND_COLABA, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                            coroutineSingletons4 = coroutineSingletons1114;
                            if (objB6 != coroutineSingletons4) {
                                searchFieldWithSwapButtonCardUIState4 = searchFieldWithSwapButtonCardUIState2;
                                chaloTextStyleHelper5 = chaloTextStyleHelper6;
                                imageUrlUIState7 = imageUrlUIState5;
                                imageUIState12 = imageUIState11;
                                obj8 = objB6;
                                pbPassPurchaseLandingScreenDataState10 = pbPassPurchaseLandingScreenDataState8;
                                cardWithTextLeftAndRightIconUiState6 = cardWithTextLeftAndRightIconUiState4;
                                passInfoCardUIState8 = passInfoCardUIState6;
                                f = 0.0f;
                                cardWithTextLeftAndRightIconUiState7 = cardWithTextLeftAndRightIconUiState6;
                                passInfoCardUIState9 = passInfoCardUIState8;
                                imageUrlUIState8 = imageUrlUIState7;
                                coroutineSingletons3 = coroutineSingletons4;
                                imageUIState13 = imageUIState9;
                                imageUIState14 = imageUIState12;
                                pBPassPurchaseLandingScreenBottomSheetTypeUIState5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                                chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper5, (String) obj8, black2, UIFontWeight.Bold, null, 108);
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState10;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState8;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState13;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState9;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState7;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState5;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState4;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState14;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextUIStateF;
                                buttonUIStateFactory3 = buttonUIStateFactory2;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$11 = buttonUIStateFactory3;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = f;
                                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 12;
                                objB7 = stringProvider2.b(StringEnum.VIEW_ALL_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                                if (objB7 == coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                                imageUIState15 = imageUIState13;
                                cardWithTextLeftAndRightIconUiState8 = cardWithTextLeftAndRightIconUiState7;
                                chaloTextUIState = chaloTextUIStateF;
                                imageUIState16 = imageUIState14;
                                buttonUIStateFactory4 = buttonUIStateFactory3;
                                loadingDialogUIState2 = loadingDialogUIState;
                                imageUrlUIState9 = imageUrlUIState8;
                                obj9 = objB7;
                                passInfoCardUIState10 = passInfoCardUIState9;
                                buttonUIState3 = buttonUIState;
                                searchFieldWithSwapButtonCardUIState5 = searchFieldWithSwapButtonCardUIState4;
                                pbPassPurchaseLandingScreenDataState11 = pbPassPurchaseLandingScreenDataState10;
                                UITextStyle uITextStyle15 = UITextStyle.HeadlineSmall;
                                UIFontWeight uIFontWeight15 = UIFontWeight.Bold;
                                ButtonUIStateFactory buttonUIStateFactory118 = buttonUIStateFactory4;
                                UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A15 = UiEventHandler.Companion.a(new er0(this, 16));
                                buttonUIStateFactory118.getClass();
                                pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 0)), WebSocketProtocol.PAYLOAD_SHORT), imageUrlUIState9, imageUIState15, imageUIState16, loadingDialogUIState2, passInfoCardUIState10, cardWithTextLeftAndRightIconUiState8, pBPassPurchaseLandingScreenBottomSheetTypeUIState5, searchFieldWithSwapButtonCardUIState5, buttonUIState3, new PBConnectingRoutesUIState(chaloTextUIState, ButtonUIStateFactory.a((String) obj9, uITextStyle15, uIFontWeight15, uiEventHandler$Companion$fromLambda$1A15)), pbPassPurchaseLandingScreenDataState11.i);
                                return new PbPassPurchaseLandingScreenViewState(pbPassPurchaseLandingScreenErrorUIState);
                            }
                            return coroutineSingletons4;
                        }
                    }
                    return coroutineSingletons;
                }
                passInfoCardUIState4 = passInfoCardUIState3;
                if (Intrinsics.d(passLandingFlowType2, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                passInfoCardUIState3 = passInfoCardUIState4;
                buttonUIStateF = null;
                if (pbPassPurchaseLandingScreenDataState7.d) {
                    black = black3;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateF;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 10;
                    objB5 = stringProvider.b(StringEnum.PLEASE_WAIT_RUNNING_CASE_WITH_DOTS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                    if (objB5 != coroutineSingletons) {
                        pbPassPurchaseLandingScreenDataState9 = pbPassPurchaseLandingScreenDataState7;
                        passInfoCardUIState7 = passInfoCardUIState3;
                        imageUIState10 = imageUIState7;
                        searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState;
                        buttonUIState2 = buttonUIStateF;
                        chaloTextStyleHelper4 = chaloTextStyleHelper6;
                        pBPassPurchaseLandingScreenBottomSheetTypeUIState4 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                        cardWithTextLeftAndRightIconUiState5 = cardWithTextLeftAndRightIconUiState3;
                        imageUrlUIState6 = imageUrlUIState5;
                        black3 = black;
                        SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState111 = searchFieldWithSwapButtonCardUIState3;
                        coroutineSingletons2 = coroutineSingletons;
                        ButtonUIState buttonUIState19 = buttonUIState2;
                        stringProvider2 = stringProvider;
                        imageUIState8 = null;
                        loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper4, (String) objB5, black3, 0, null, null, null, null, 124));
                        searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState111;
                        buttonUIState = buttonUIState19;
                        pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState4;
                        cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState5;
                        passInfoCardUIState6 = passInfoCardUIState7;
                        imageUIState9 = imageUIState10;
                        imageUrlUIState5 = imageUrlUIState6;
                        pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState9;
                    }
                    return coroutineSingletons;
                }
                CoroutineSingletons coroutineSingletons1115 = coroutineSingletons;
                pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState7;
                coroutineSingletons2 = coroutineSingletons1115;
                PassInfoCardUIState passInfoCardUIState1112 = passInfoCardUIState3;
                stringProvider2 = stringProvider;
                imageUIState8 = null;
                cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState3;
                buttonUIState = buttonUIStateF;
                loadingDialogUIState = null;
                pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState;
                imageUIState9 = imageUIState7;
                passInfoCardUIState6 = passInfoCardUIState1112;
                black2 = black3;
                passLandingFlowType3 = pbPassPurchaseLandingScreenDataState8.f7652a;
                if (passLandingFlowType3 instanceof PassLandingFlowType.WithConfigId) {
                    imageUIState11 = new ImageUIState(IconType.CHALO_BUS_INFO_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                } else {
                    if (Intrinsics.d(passLandingFlowType3, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    imageUIState11 = imageUIState8;
                }
                CoroutineSingletons coroutineSingletons1116 = coroutineSingletons2;
                buttonUIStateFactory2 = buttonUIStateFactory5;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState8;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState9;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState6;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState4;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState2;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState11;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextStyleHelper6;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = 0.0f;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 11;
                objB6 = stringProvider2.b(StringEnum.CONNECTING_THANE_ANDHERI_BKC_NAVI_MUMBAI_AND_COLABA, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                coroutineSingletons4 = coroutineSingletons1116;
                if (objB6 != coroutineSingletons4) {
                    searchFieldWithSwapButtonCardUIState4 = searchFieldWithSwapButtonCardUIState2;
                    chaloTextStyleHelper5 = chaloTextStyleHelper6;
                    imageUrlUIState7 = imageUrlUIState5;
                    imageUIState12 = imageUIState11;
                    obj8 = objB6;
                    pbPassPurchaseLandingScreenDataState10 = pbPassPurchaseLandingScreenDataState8;
                    cardWithTextLeftAndRightIconUiState6 = cardWithTextLeftAndRightIconUiState4;
                    passInfoCardUIState8 = passInfoCardUIState6;
                    f = 0.0f;
                    cardWithTextLeftAndRightIconUiState7 = cardWithTextLeftAndRightIconUiState6;
                    passInfoCardUIState9 = passInfoCardUIState8;
                    imageUrlUIState8 = imageUrlUIState7;
                    coroutineSingletons3 = coroutineSingletons4;
                    imageUIState13 = imageUIState9;
                    imageUIState14 = imageUIState12;
                    pBPassPurchaseLandingScreenBottomSheetTypeUIState5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                    chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper5, (String) obj8, black2, UIFontWeight.Bold, null, 108);
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState10;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState8;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState13;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState9;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState7;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState5;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState4;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState14;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextUIStateF;
                    buttonUIStateFactory3 = buttonUIStateFactory2;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$11 = buttonUIStateFactory3;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = f;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 12;
                    objB7 = stringProvider2.b(StringEnum.VIEW_ALL_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                    if (objB7 == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    imageUIState15 = imageUIState13;
                    cardWithTextLeftAndRightIconUiState8 = cardWithTextLeftAndRightIconUiState7;
                    chaloTextUIState = chaloTextUIStateF;
                    imageUIState16 = imageUIState14;
                    buttonUIStateFactory4 = buttonUIStateFactory3;
                    loadingDialogUIState2 = loadingDialogUIState;
                    imageUrlUIState9 = imageUrlUIState8;
                    obj9 = objB7;
                    passInfoCardUIState10 = passInfoCardUIState9;
                    buttonUIState3 = buttonUIState;
                    searchFieldWithSwapButtonCardUIState5 = searchFieldWithSwapButtonCardUIState4;
                    pbPassPurchaseLandingScreenDataState11 = pbPassPurchaseLandingScreenDataState10;
                    UITextStyle uITextStyle16 = UITextStyle.HeadlineSmall;
                    UIFontWeight uIFontWeight16 = UIFontWeight.Bold;
                    ButtonUIStateFactory buttonUIStateFactory119 = buttonUIStateFactory4;
                    UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A16 = UiEventHandler.Companion.a(new er0(this, 16));
                    buttonUIStateFactory119.getClass();
                    pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 0)), WebSocketProtocol.PAYLOAD_SHORT), imageUrlUIState9, imageUIState15, imageUIState16, loadingDialogUIState2, passInfoCardUIState10, cardWithTextLeftAndRightIconUiState8, pBPassPurchaseLandingScreenBottomSheetTypeUIState5, searchFieldWithSwapButtonCardUIState5, buttonUIState3, new PBConnectingRoutesUIState(chaloTextUIState, ButtonUIStateFactory.a((String) obj9, uITextStyle16, uIFontWeight16, uiEventHandler$Companion$fromLambda$1A16)), pbPassPurchaseLandingScreenDataState11.i);
                    return new PbPassPurchaseLandingScreenViewState(pbPassPurchaseLandingScreenErrorUIState);
                }
                return coroutineSingletons4;
            case 9:
                ChaloTextStyleHelper chaloTextStyleHelper9 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8;
                buttonUIStateFactory = (ButtonUIStateFactory) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7;
                searchFieldWithSwapButtonCardUIState = (SearchFieldWithSwapButtonCardUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6;
                pBPassPurchaseLandingScreenBottomSheetTypeUIState2 = (PBPassPurchaseLandingScreenBottomSheetTypeUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5;
                cardWithTextLeftAndRightIconUiState3 = (CardWithTextLeftAndRightIconUiState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4;
                PassInfoCardUIState passInfoCardUIState22 = (PassInfoCardUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3;
                ImageUIState imageUIState20 = (ImageUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2;
                imageUrlUIState5 = (ImageUrlUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1;
                pbPassPurchaseLandingScreenDataState7 = (PbPassPurchaseLandingScreenDataState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0;
                ResultKt.b(obj9);
                chaloTextStyleHelper3 = chaloTextStyleHelper9;
                objB4 = obj9;
                passInfoCardUIState5 = passInfoCardUIState22;
                coroutineSingletons = coroutineSingletons4;
                buttonUIStateFactory5 = buttonUIStateFactory5;
                imageUIState7 = imageUIState20;
                stringProvider = stringProvider3;
                pbPassPurchaseLandingScreenComponent = this;
                ButtonUIStateFactory buttonUIStateFactory1110 = buttonUIStateFactory;
                PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState114 = pbPassPurchaseLandingScreenDataState7;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory1110, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objB4, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108), new er0(pbPassPurchaseLandingScreenComponent, 15), UIShape.d, false, 0.0f, 52);
                pbPassPurchaseLandingScreenDataState7 = pbPassPurchaseLandingScreenDataState114;
                passInfoCardUIState3 = passInfoCardUIState5;
                if (pbPassPurchaseLandingScreenDataState7.d) {
                    black = black3;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState7;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState7;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState3;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState3;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIStateF;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = chaloTextStyleHelper6;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 10;
                    objB5 = stringProvider.b(StringEnum.PLEASE_WAIT_RUNNING_CASE_WITH_DOTS, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                    if (objB5 != coroutineSingletons) {
                        pbPassPurchaseLandingScreenDataState9 = pbPassPurchaseLandingScreenDataState7;
                        passInfoCardUIState7 = passInfoCardUIState3;
                        imageUIState10 = imageUIState7;
                        searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState;
                        buttonUIState2 = buttonUIStateF;
                        chaloTextStyleHelper4 = chaloTextStyleHelper6;
                        pBPassPurchaseLandingScreenBottomSheetTypeUIState4 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                        cardWithTextLeftAndRightIconUiState5 = cardWithTextLeftAndRightIconUiState3;
                        imageUrlUIState6 = imageUrlUIState5;
                        black3 = black;
                        SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState112 = searchFieldWithSwapButtonCardUIState3;
                        coroutineSingletons2 = coroutineSingletons;
                        ButtonUIState buttonUIState110 = buttonUIState2;
                        stringProvider2 = stringProvider;
                        imageUIState8 = null;
                        loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper4, (String) objB5, black3, 0, null, null, null, null, 124));
                        searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState112;
                        buttonUIState = buttonUIState110;
                        pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState4;
                        cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState5;
                        passInfoCardUIState6 = passInfoCardUIState7;
                        imageUIState9 = imageUIState10;
                        imageUrlUIState5 = imageUrlUIState6;
                        pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState9;
                    }
                    return coroutineSingletons;
                }
                CoroutineSingletons coroutineSingletons1117 = coroutineSingletons;
                pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState7;
                coroutineSingletons2 = coroutineSingletons1117;
                PassInfoCardUIState passInfoCardUIState1113 = passInfoCardUIState3;
                stringProvider2 = stringProvider;
                imageUIState8 = null;
                cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState3;
                buttonUIState = buttonUIStateF;
                loadingDialogUIState = null;
                pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState2;
                searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState;
                imageUIState9 = imageUIState7;
                passInfoCardUIState6 = passInfoCardUIState1113;
                black2 = black3;
                passLandingFlowType3 = pbPassPurchaseLandingScreenDataState8.f7652a;
                if (passLandingFlowType3 instanceof PassLandingFlowType.WithConfigId) {
                    imageUIState11 = new ImageUIState(IconType.CHALO_BUS_INFO_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                } else {
                    if (Intrinsics.d(passLandingFlowType3, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    imageUIState11 = imageUIState8;
                }
                CoroutineSingletons coroutineSingletons1118 = coroutineSingletons2;
                buttonUIStateFactory2 = buttonUIStateFactory5;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState8;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState9;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState6;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState4;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState2;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState11;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextStyleHelper6;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = 0.0f;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 11;
                objB6 = stringProvider2.b(StringEnum.CONNECTING_THANE_ANDHERI_BKC_NAVI_MUMBAI_AND_COLABA, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                coroutineSingletons4 = coroutineSingletons1118;
                if (objB6 != coroutineSingletons4) {
                    searchFieldWithSwapButtonCardUIState4 = searchFieldWithSwapButtonCardUIState2;
                    chaloTextStyleHelper5 = chaloTextStyleHelper6;
                    imageUrlUIState7 = imageUrlUIState5;
                    imageUIState12 = imageUIState11;
                    obj8 = objB6;
                    pbPassPurchaseLandingScreenDataState10 = pbPassPurchaseLandingScreenDataState8;
                    cardWithTextLeftAndRightIconUiState6 = cardWithTextLeftAndRightIconUiState4;
                    passInfoCardUIState8 = passInfoCardUIState6;
                    f = 0.0f;
                    cardWithTextLeftAndRightIconUiState7 = cardWithTextLeftAndRightIconUiState6;
                    passInfoCardUIState9 = passInfoCardUIState8;
                    imageUrlUIState8 = imageUrlUIState7;
                    coroutineSingletons3 = coroutineSingletons4;
                    imageUIState13 = imageUIState9;
                    imageUIState14 = imageUIState12;
                    pBPassPurchaseLandingScreenBottomSheetTypeUIState5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                    chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper5, (String) obj8, black2, UIFontWeight.Bold, null, 108);
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState10;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState8;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState13;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState9;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState7;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState5;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState4;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState14;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextUIStateF;
                    buttonUIStateFactory3 = buttonUIStateFactory2;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$11 = buttonUIStateFactory3;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = f;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 12;
                    objB7 = stringProvider2.b(StringEnum.VIEW_ALL_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                    if (objB7 == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    imageUIState15 = imageUIState13;
                    cardWithTextLeftAndRightIconUiState8 = cardWithTextLeftAndRightIconUiState7;
                    chaloTextUIState = chaloTextUIStateF;
                    imageUIState16 = imageUIState14;
                    buttonUIStateFactory4 = buttonUIStateFactory3;
                    loadingDialogUIState2 = loadingDialogUIState;
                    imageUrlUIState9 = imageUrlUIState8;
                    obj9 = objB7;
                    passInfoCardUIState10 = passInfoCardUIState9;
                    buttonUIState3 = buttonUIState;
                    searchFieldWithSwapButtonCardUIState5 = searchFieldWithSwapButtonCardUIState4;
                    pbPassPurchaseLandingScreenDataState11 = pbPassPurchaseLandingScreenDataState10;
                    UITextStyle uITextStyle17 = UITextStyle.HeadlineSmall;
                    UIFontWeight uIFontWeight17 = UIFontWeight.Bold;
                    ButtonUIStateFactory buttonUIStateFactory1111 = buttonUIStateFactory4;
                    UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A17 = UiEventHandler.Companion.a(new er0(this, 16));
                    buttonUIStateFactory1111.getClass();
                    pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 0)), WebSocketProtocol.PAYLOAD_SHORT), imageUrlUIState9, imageUIState15, imageUIState16, loadingDialogUIState2, passInfoCardUIState10, cardWithTextLeftAndRightIconUiState8, pBPassPurchaseLandingScreenBottomSheetTypeUIState5, searchFieldWithSwapButtonCardUIState5, buttonUIState3, new PBConnectingRoutesUIState(chaloTextUIState, ButtonUIStateFactory.a((String) obj9, uITextStyle17, uIFontWeight17, uiEventHandler$Companion$fromLambda$1A17)), pbPassPurchaseLandingScreenDataState11.i);
                    return new PbPassPurchaseLandingScreenViewState(pbPassPurchaseLandingScreenErrorUIState);
                }
                return coroutineSingletons4;
            case 10:
                ChaloTextStyleHelper chaloTextStyleHelper10 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8;
                buttonUIState2 = (ButtonUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7;
                SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState20 = (SearchFieldWithSwapButtonCardUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6;
                PBPassPurchaseLandingScreenBottomSheetTypeUIState pBPassPurchaseLandingScreenBottomSheetTypeUIState7 = (PBPassPurchaseLandingScreenBottomSheetTypeUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5;
                CardWithTextLeftAndRightIconUiState cardWithTextLeftAndRightIconUiState11 = (CardWithTextLeftAndRightIconUiState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4;
                PassInfoCardUIState passInfoCardUIState23 = (PassInfoCardUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3;
                ImageUIState imageUIState21 = (ImageUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2;
                ImageUrlUIState imageUrlUIState13 = (ImageUrlUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1;
                PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState22 = (PbPassPurchaseLandingScreenDataState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0;
                ResultKt.b(obj9);
                searchFieldWithSwapButtonCardUIState3 = searchFieldWithSwapButtonCardUIState20;
                black = black3;
                passInfoCardUIState7 = passInfoCardUIState23;
                imageUIState10 = imageUIState21;
                stringProvider = stringProvider3;
                pbPassPurchaseLandingScreenDataState9 = pbPassPurchaseLandingScreenDataState22;
                chaloTextStyleHelper4 = chaloTextStyleHelper10;
                coroutineSingletons = coroutineSingletons4;
                buttonUIStateFactory5 = buttonUIStateFactory5;
                objB5 = obj9;
                imageUrlUIState6 = imageUrlUIState13;
                pBPassPurchaseLandingScreenBottomSheetTypeUIState4 = pBPassPurchaseLandingScreenBottomSheetTypeUIState7;
                cardWithTextLeftAndRightIconUiState5 = cardWithTextLeftAndRightIconUiState11;
                black3 = black;
                SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState113 = searchFieldWithSwapButtonCardUIState3;
                coroutineSingletons2 = coroutineSingletons;
                ButtonUIState buttonUIState111 = buttonUIState2;
                stringProvider2 = stringProvider;
                imageUIState8 = null;
                loadingDialogUIState = new LoadingDialogUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper4, (String) objB5, black3, 0, null, null, null, null, 124));
                searchFieldWithSwapButtonCardUIState2 = searchFieldWithSwapButtonCardUIState113;
                buttonUIState = buttonUIState111;
                pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState4;
                cardWithTextLeftAndRightIconUiState4 = cardWithTextLeftAndRightIconUiState5;
                passInfoCardUIState6 = passInfoCardUIState7;
                imageUIState9 = imageUIState10;
                imageUrlUIState5 = imageUrlUIState6;
                pbPassPurchaseLandingScreenDataState8 = pbPassPurchaseLandingScreenDataState9;
                black2 = black3;
                passLandingFlowType3 = pbPassPurchaseLandingScreenDataState8.f7652a;
                if (passLandingFlowType3 instanceof PassLandingFlowType.WithConfigId) {
                    imageUIState11 = new ImageUIState(IconType.CHALO_BUS_INFO_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, UIContentScale.FillWidth, 0.0f, (UiEventHandler) null, 238);
                } else {
                    if (Intrinsics.d(passLandingFlowType3, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    imageUIState11 = imageUIState8;
                }
                CoroutineSingletons coroutineSingletons1119 = coroutineSingletons2;
                buttonUIStateFactory2 = buttonUIStateFactory5;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState8;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState5;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState9;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState6;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState4;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState2;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState11;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextStyleHelper6;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = 0.0f;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 11;
                objB6 = stringProvider2.b(StringEnum.CONNECTING_THANE_ANDHERI_BKC_NAVI_MUMBAI_AND_COLABA, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                coroutineSingletons4 = coroutineSingletons1119;
                if (objB6 != coroutineSingletons4) {
                    searchFieldWithSwapButtonCardUIState4 = searchFieldWithSwapButtonCardUIState2;
                    chaloTextStyleHelper5 = chaloTextStyleHelper6;
                    imageUrlUIState7 = imageUrlUIState5;
                    imageUIState12 = imageUIState11;
                    obj8 = objB6;
                    pbPassPurchaseLandingScreenDataState10 = pbPassPurchaseLandingScreenDataState8;
                    cardWithTextLeftAndRightIconUiState6 = cardWithTextLeftAndRightIconUiState4;
                    passInfoCardUIState8 = passInfoCardUIState6;
                    f = 0.0f;
                    cardWithTextLeftAndRightIconUiState7 = cardWithTextLeftAndRightIconUiState6;
                    passInfoCardUIState9 = passInfoCardUIState8;
                    imageUrlUIState8 = imageUrlUIState7;
                    coroutineSingletons3 = coroutineSingletons4;
                    imageUIState13 = imageUIState9;
                    imageUIState14 = imageUIState12;
                    pBPassPurchaseLandingScreenBottomSheetTypeUIState5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                    chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper5, (String) obj8, black2, UIFontWeight.Bold, null, 108);
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState10;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState8;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState13;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState9;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState7;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState5;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState4;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState14;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextUIStateF;
                    buttonUIStateFactory3 = buttonUIStateFactory2;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$11 = buttonUIStateFactory3;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = f;
                    pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 12;
                    objB7 = stringProvider2.b(StringEnum.VIEW_ALL_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                    if (objB7 == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                    imageUIState15 = imageUIState13;
                    cardWithTextLeftAndRightIconUiState8 = cardWithTextLeftAndRightIconUiState7;
                    chaloTextUIState = chaloTextUIStateF;
                    imageUIState16 = imageUIState14;
                    buttonUIStateFactory4 = buttonUIStateFactory3;
                    loadingDialogUIState2 = loadingDialogUIState;
                    imageUrlUIState9 = imageUrlUIState8;
                    obj9 = objB7;
                    passInfoCardUIState10 = passInfoCardUIState9;
                    buttonUIState3 = buttonUIState;
                    searchFieldWithSwapButtonCardUIState5 = searchFieldWithSwapButtonCardUIState4;
                    pbPassPurchaseLandingScreenDataState11 = pbPassPurchaseLandingScreenDataState10;
                    UITextStyle uITextStyle18 = UITextStyle.HeadlineSmall;
                    UIFontWeight uIFontWeight18 = UIFontWeight.Bold;
                    ButtonUIStateFactory buttonUIStateFactory1112 = buttonUIStateFactory4;
                    UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A18 = UiEventHandler.Companion.a(new er0(this, 16));
                    buttonUIStateFactory1112.getClass();
                    pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 0)), WebSocketProtocol.PAYLOAD_SHORT), imageUrlUIState9, imageUIState15, imageUIState16, loadingDialogUIState2, passInfoCardUIState10, cardWithTextLeftAndRightIconUiState8, pBPassPurchaseLandingScreenBottomSheetTypeUIState5, searchFieldWithSwapButtonCardUIState5, buttonUIState3, new PBConnectingRoutesUIState(chaloTextUIState, ButtonUIStateFactory.a((String) obj9, uITextStyle18, uIFontWeight18, uiEventHandler$Companion$fromLambda$1A18)), pbPassPurchaseLandingScreenDataState11.i);
                    return new PbPassPurchaseLandingScreenViewState(pbPassPurchaseLandingScreenErrorUIState);
                }
                return coroutineSingletons4;
            case 11:
                float f2 = pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0;
                ChaloTextStyleHelper chaloTextStyleHelper11 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10;
                ImageUIState imageUIState22 = (ImageUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9;
                LoadingDialogUIState loadingDialogUIState3 = (LoadingDialogUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8;
                ButtonUIState buttonUIState20 = (ButtonUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7;
                SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState21 = (SearchFieldWithSwapButtonCardUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6;
                PBPassPurchaseLandingScreenBottomSheetTypeUIState pBPassPurchaseLandingScreenBottomSheetTypeUIState8 = (PBPassPurchaseLandingScreenBottomSheetTypeUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5;
                CardWithTextLeftAndRightIconUiState cardWithTextLeftAndRightIconUiState12 = (CardWithTextLeftAndRightIconUiState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4;
                PassInfoCardUIState passInfoCardUIState24 = (PassInfoCardUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3;
                ImageUIState imageUIState23 = (ImageUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2;
                imageUrlUIState7 = (ImageUrlUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1;
                PbPassPurchaseLandingScreenDataState pbPassPurchaseLandingScreenDataState23 = (PbPassPurchaseLandingScreenDataState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0;
                ResultKt.b(obj9);
                loadingDialogUIState = loadingDialogUIState3;
                chaloTextStyleHelper5 = chaloTextStyleHelper11;
                searchFieldWithSwapButtonCardUIState4 = searchFieldWithSwapButtonCardUIState21;
                cardWithTextLeftAndRightIconUiState6 = cardWithTextLeftAndRightIconUiState12;
                pbPassPurchaseLandingScreenDataState10 = pbPassPurchaseLandingScreenDataState23;
                buttonUIStateFactory2 = buttonUIStateFactory5;
                obj8 = obj9;
                f = f2;
                stringProvider2 = stringProvider3;
                buttonUIState = buttonUIState20;
                pBPassPurchaseLandingScreenBottomSheetTypeUIState3 = pBPassPurchaseLandingScreenBottomSheetTypeUIState8;
                passInfoCardUIState8 = passInfoCardUIState24;
                imageUIState12 = imageUIState22;
                imageUIState9 = imageUIState23;
                black2 = black3;
                cardWithTextLeftAndRightIconUiState7 = cardWithTextLeftAndRightIconUiState6;
                passInfoCardUIState9 = passInfoCardUIState8;
                imageUrlUIState8 = imageUrlUIState7;
                coroutineSingletons3 = coroutineSingletons4;
                imageUIState13 = imageUIState9;
                imageUIState14 = imageUIState12;
                pBPassPurchaseLandingScreenBottomSheetTypeUIState5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState3;
                chaloTextUIStateF = ChaloTextStyleHelper.f(chaloTextStyleHelper5, (String) obj8, black2, UIFontWeight.Bold, null, 108);
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0 = pbPassPurchaseLandingScreenDataState10;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1 = imageUrlUIState8;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2 = imageUIState13;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3 = passInfoCardUIState9;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4 = cardWithTextLeftAndRightIconUiState7;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState5;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6 = searchFieldWithSwapButtonCardUIState4;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7 = buttonUIState;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8 = loadingDialogUIState;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9 = imageUIState14;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10 = chaloTextUIStateF;
                buttonUIStateFactory3 = buttonUIStateFactory2;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$11 = buttonUIStateFactory3;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.F$0 = f;
                pbPassPurchaseLandingScreenComponent$convertToUiState$1.label = 12;
                objB7 = stringProvider2.b(StringEnum.VIEW_ALL_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$convertToUiState$1);
                if (objB7 == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
                imageUIState15 = imageUIState13;
                cardWithTextLeftAndRightIconUiState8 = cardWithTextLeftAndRightIconUiState7;
                chaloTextUIState = chaloTextUIStateF;
                imageUIState16 = imageUIState14;
                buttonUIStateFactory4 = buttonUIStateFactory3;
                loadingDialogUIState2 = loadingDialogUIState;
                imageUrlUIState9 = imageUrlUIState8;
                obj9 = objB7;
                passInfoCardUIState10 = passInfoCardUIState9;
                buttonUIState3 = buttonUIState;
                searchFieldWithSwapButtonCardUIState5 = searchFieldWithSwapButtonCardUIState4;
                pbPassPurchaseLandingScreenDataState11 = pbPassPurchaseLandingScreenDataState10;
                UITextStyle uITextStyle19 = UITextStyle.HeadlineSmall;
                UIFontWeight uIFontWeight19 = UIFontWeight.Bold;
                ButtonUIStateFactory buttonUIStateFactory1113 = buttonUIStateFactory4;
                UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A19 = UiEventHandler.Companion.a(new er0(this, 16));
                buttonUIStateFactory1113.getClass();
                pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 0)), WebSocketProtocol.PAYLOAD_SHORT), imageUrlUIState9, imageUIState15, imageUIState16, loadingDialogUIState2, passInfoCardUIState10, cardWithTextLeftAndRightIconUiState8, pBPassPurchaseLandingScreenBottomSheetTypeUIState5, searchFieldWithSwapButtonCardUIState5, buttonUIState3, new PBConnectingRoutesUIState(chaloTextUIState, ButtonUIStateFactory.a((String) obj9, uITextStyle19, uIFontWeight19, uiEventHandler$Companion$fromLambda$1A19)), pbPassPurchaseLandingScreenDataState11.i);
                return new PbPassPurchaseLandingScreenViewState(pbPassPurchaseLandingScreenErrorUIState);
            case 12:
                buttonUIStateFactory4 = (ButtonUIStateFactory) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$11;
                chaloTextUIState = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$10;
                ImageUIState imageUIState24 = (ImageUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$9;
                LoadingDialogUIState loadingDialogUIState4 = (LoadingDialogUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$8;
                ButtonUIState buttonUIState21 = (ButtonUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$7;
                SearchFieldWithSwapButtonCardUIState searchFieldWithSwapButtonCardUIState22 = (SearchFieldWithSwapButtonCardUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$6;
                PBPassPurchaseLandingScreenBottomSheetTypeUIState pBPassPurchaseLandingScreenBottomSheetTypeUIState9 = (PBPassPurchaseLandingScreenBottomSheetTypeUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$5;
                CardWithTextLeftAndRightIconUiState cardWithTextLeftAndRightIconUiState13 = (CardWithTextLeftAndRightIconUiState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$4;
                PassInfoCardUIState passInfoCardUIState25 = (PassInfoCardUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$3;
                ImageUIState imageUIState25 = (ImageUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$2;
                ImageUrlUIState imageUrlUIState14 = (ImageUrlUIState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$1;
                pbPassPurchaseLandingScreenDataState11 = (PbPassPurchaseLandingScreenDataState) pbPassPurchaseLandingScreenComponent$convertToUiState$1.L$0;
                ResultKt.b(obj9);
                cardWithTextLeftAndRightIconUiState8 = cardWithTextLeftAndRightIconUiState13;
                passInfoCardUIState10 = passInfoCardUIState25;
                buttonUIState3 = buttonUIState21;
                imageUIState15 = imageUIState25;
                pBPassPurchaseLandingScreenBottomSheetTypeUIState5 = pBPassPurchaseLandingScreenBottomSheetTypeUIState9;
                loadingDialogUIState2 = loadingDialogUIState4;
                imageUrlUIState9 = imageUrlUIState14;
                searchFieldWithSwapButtonCardUIState5 = searchFieldWithSwapButtonCardUIState22;
                imageUIState16 = imageUIState24;
                UITextStyle uITextStyle110 = UITextStyle.HeadlineSmall;
                UIFontWeight uIFontWeight110 = UIFontWeight.Bold;
                ButtonUIStateFactory buttonUIStateFactory1114 = buttonUIStateFactory4;
                UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1A110 = UiEventHandler.Companion.a(new er0(this, 16));
                buttonUIStateFactory1114.getClass();
                pbPassPurchaseLandingScreenErrorUIState = new PbPassPurchaseLandingScreenType.PbPassPurchaseLandingScreenSuccessUIState(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 0)), WebSocketProtocol.PAYLOAD_SHORT), imageUrlUIState9, imageUIState15, imageUIState16, loadingDialogUIState2, passInfoCardUIState10, cardWithTextLeftAndRightIconUiState8, pBPassPurchaseLandingScreenBottomSheetTypeUIState5, searchFieldWithSwapButtonCardUIState5, buttonUIState3, new PBConnectingRoutesUIState(chaloTextUIState, ButtonUIStateFactory.a((String) obj9, uITextStyle110, uIFontWeight110, uiEventHandler$Companion$fromLambda$1A110)), pbPassPurchaseLandingScreenDataState11.i);
                return new PbPassPurchaseLandingScreenViewState(pbPassPurchaseLandingScreenErrorUIState);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x055d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0593  */
    /* JADX WARN: Code duplicated, block: B:118:0x0654  */
    /* JADX WARN: Code duplicated, block: B:122:0x0685  */
    /* JADX WARN: Code duplicated, block: B:126:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:138:0x078f  */
    /* JADX WARN: Code duplicated, block: B:142:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:33:0x022f A[PHI: r1 r2 r5 r6 r7
      0x022f: PHI (r1v12 app.chalo.uistate.text.TextUIState$ChaloTextUIState) = (r1v9 app.chalo.uistate.text.TextUIState$ChaloTextUIState), (r1v22 app.chalo.uistate.text.TextUIState$ChaloTextUIState) binds: [B:47:0x02bc, B:32:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r2v16 java.lang.Object) = (r2v15 java.lang.Object), (r2v1 java.lang.Object) binds: [B:47:0x02bc, B:32:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r5v12 app.chalo.uistate.text.TextUIState$ChaloTextUIState) = (r5v9 app.chalo.uistate.text.TextUIState$ChaloTextUIState), (r5v14 app.chalo.uistate.text.TextUIState$ChaloTextUIState) binds: [B:47:0x02bc, B:32:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r6v1 app.chalo.uistate.text.ChaloTextStyleHelper) = (r6v0 app.chalo.uistate.text.ChaloTextStyleHelper), (r6v3 app.chalo.uistate.text.ChaloTextStyleHelper) binds: [B:47:0x02bc, B:32:0x021b] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r7v7 app.chalo.premiumbus.ui.stopselection.PBStopSelectionScreenBottomSheetType) = 
      (r7v4 app.chalo.premiumbus.ui.stopselection.PBStopSelectionScreenBottomSheetType)
      (r7v10 app.chalo.premiumbus.ui.stopselection.PBStopSelectionScreenBottomSheetType)
     binds: [B:47:0x02bc, B:32:0x021b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0293  */
    /* JADX WARN: Code duplicated, block: B:52:0x0328  */
    /* JADX WARN: Code duplicated, block: B:64:0x0379  */
    /* JADX WARN: Code duplicated, block: B:67:0x0398  */
    /* JADX WARN: Code duplicated, block: B:71:0x039f  */
    /* JADX WARN: Code duplicated, block: B:75:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x0405  */
    /* JADX WARN: Code duplicated, block: B:86:0x0447  */
    /* JADX WARN: Code duplicated, block: B:90:0x0496  */
    public final Object H0(PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType, ContinuationImpl continuationImpl) {
        PbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1 pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1;
        ChaloColorToken.OrangePrimary orangePrimary;
        ButtonUIStateFactory buttonUIStateFactory;
        StringProvider stringProvider;
        ChaloColorToken.White white;
        ImageUIState imageUIState;
        Object objB;
        ChaloTextStyleHelper chaloTextStyleHelper;
        ImageUIState imageUIState2;
        Object objB2;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        ImageUIState imageUIState3;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        Object objB3;
        ChaloTextStyleHelper chaloTextStyleHelper4;
        ChaloTextStyleHelper chaloTextStyleHelper5;
        TextUIState.ChaloTextUIState chaloTextUIStateD;
        PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType2;
        ChaloTextStyleHelper chaloTextStyleHelper6;
        TextUIState.ChaloTextUIState chaloTextUIStateB;
        TitleSubtitleUiState titleSubtitleUiState;
        TextUIState.ChaloTextUIState chaloTextUIState;
        TitleSubtitleUiState titleSubtitleUiState2;
        StringProvider stringProvider2;
        int i;
        TextUIState.ChaloTextUIState chaloTextUIStateD2;
        Object objB4;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        ChaloTextStyleHelper chaloTextStyleHelper7;
        ButtonUIStateFactory buttonUIStateFactory2;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel;
        String str;
        ChaloColorToken.Black_87 black_87;
        TitleSubtitleUiState titleSubtitleUiState3;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        Object objB5;
        PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType3;
        TitleSubtitleUiState titleSubtitleUiState4;
        ChaloTextStyleHelper chaloTextStyleHelper8;
        String str2;
        PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType4;
        TextUIState.ChaloTextUIState chaloTextUIState4;
        ChaloColorToken.OrangePrimary orangePrimary2;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2;
        String str3;
        TitleSubtitleUiState titleSubtitleUiState5;
        ButtonUIStateFactory buttonUIStateFactory3;
        Object objB6;
        TextUIState.ChaloTextUIState chaloTextUIState5;
        PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType5;
        ChaloTextStyleHelper chaloTextStyleHelper9;
        ButtonUIStateFactory buttonUIStateFactory4;
        TitleSubtitleUiState titleSubtitleUiState6;
        String str4;
        ButtonUIState buttonUIStateF;
        TitleSubtitleUiState titleSubtitleUiState7;
        TextUIState.ChaloTextUIState chaloTextUIState6;
        ButtonUIStateFactory buttonUIStateFactory5;
        TextUIState.ChaloTextUIState chaloTextUIStateE;
        Object objB7;
        TextUIState.ChaloTextUIState chaloTextUIState7;
        ChaloTextStyleHelper chaloTextStyleHelper10;
        TextUIState.ChaloTextUIState chaloTextUIStateB2;
        Object objB8;
        ImageUIState imageUIState4;
        TextUIState.ChaloTextUIState chaloTextUIState8;
        TextUIState.ChaloTextUIState chaloTextUIState9;
        ButtonUIStateFactory buttonUIStateFactory6;
        TextUIState.ChaloTextUIState chaloTextUIStateE2;
        Object objB9;
        ChaloTextStyleHelper chaloTextStyleHelper11;
        TextUIState.ChaloTextUIState chaloTextUIStateB3;
        Object objB10;
        TextUIState.ChaloTextUIState chaloTextUIState10;
        TextUIState.ChaloTextUIState chaloTextUIState11;
        ChaloTextStyleHelper chaloTextStyleHelper12;
        ButtonUIStateFactory buttonUIStateFactory7;
        ButtonUIState buttonUIStateF2;
        Object objB11;
        ImageUIState imageUIState5;
        TextUIState.ChaloTextUIState chaloTextUIState12;
        TextUIState.ChaloTextUIState chaloTextUIState13;
        ButtonUIState buttonUIState;
        ButtonUIStateFactory buttonUIStateFactory8;
        TextUIState.ChaloTextUIState chaloTextUIStateE3;
        Object objB12;
        ChaloTextStyleHelper chaloTextStyleHelper13;
        ButtonUIStateFactory buttonUIStateFactory9;
        ButtonUIState buttonUIStateF3;
        Object objB13;
        ImageUIState imageUIState6;
        TextUIState.ChaloTextUIState chaloTextUIState14;
        ButtonUIState buttonUIState2;
        ButtonUIStateFactory buttonUIStateFactory10;
        PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType6 = pBStopSelectionScreenBottomSheetType;
        if (continuationImpl instanceof PbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1) {
            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1 = (PbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1) continuationImpl;
            int i2 = pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1 = new PbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1(this, continuationImpl);
            }
        } else {
            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1 = new PbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1(this, continuationImpl);
        }
        Object objB14 = pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label;
        ChaloColorToken.Black_70 black_70 = ChaloColorToken.Black_70.f9767a;
        ChaloColorToken.Black_87 black_88 = ChaloColorToken.Black_87.f9768a;
        ChaloColorToken.White white2 = ChaloColorToken.White.f9870a;
        ChaloColorToken.OrangePrimary orangePrimary3 = ChaloColorToken.OrangePrimary.f9835a;
        ButtonUIStateFactory buttonUIStateFactory11 = ButtonUIStateFactory.f9921a;
        ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
        StringProvider stringProvider3 = this.l;
        ChaloTextStyleHelper chaloTextStyleHelper14 = ChaloTextStyleHelper.f10078a;
        switch (i3) {
            case 0:
                ResultKt.b(objB14);
                if (pBStopSelectionScreenBottomSheetType6 instanceof PBStopSelectionScreenBottomSheetType.MultipleOriginDestinationSelection) {
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = pBStopSelectionScreenBottomSheetType6;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextStyleHelper14;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 1;
                    objB14 = stringProvider3.b(StringEnum.SELECT_PICKUP_AND_DROP, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                    if (objB14 != obj) {
                        chaloTextStyleHelper5 = chaloTextStyleHelper14;
                        chaloTextUIStateD = ChaloTextStyleHelper.d(chaloTextStyleHelper5, (String) objB14, black, UITextAlign.Center, UIFontWeight.Bold, 96);
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = pBStopSelectionScreenBottomSheetType6;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIStateD;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = chaloTextStyleHelper14;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 2;
                        objB14 = stringProvider3.b(StringEnum.CANT_FIND_YOUR_PREFERRED_STOP, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                        if (objB14 != obj) {
                            pBStopSelectionScreenBottomSheetType2 = pBStopSelectionScreenBottomSheetType6;
                            chaloTextStyleHelper6 = chaloTextStyleHelper14;
                            chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper6, (String) objB14, black, 0, UITextAlign.Center, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = pBStopSelectionScreenBottomSheetType2;
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIStateD;
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = chaloTextUIStateB;
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = chaloTextStyleHelper14;
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 3;
                            objB14 = stringProvider3.b(StringEnum.SUGGEST_A_DIFFERENT_STOP, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                            if (objB14 != obj) {
                                TextUIState.ChaloTextUIState chaloTextUIState15 = chaloTextUIStateB;
                                TextUIState.ChaloTextUIState chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper14, (String) objB14, orangePrimary3, UITextAlign.Center, null, UiEventHandler.Companion.a(new er0(this, 1)), null, 84);
                                new TitleSubtitleUiSpecs(0.0f, 3);
                                titleSubtitleUiState = new TitleSubtitleUiState(new TitleSubtitleUiSpecs(new ChaloPadding(ChaloThemeHelper.a().j, 0.0f, 0.0f, ChaloThemeHelper.a().j, 6), ChaloThemeHelper.a().g), chaloTextUIState15, chaloTextUIStateG, null, 8);
                                List list = ((PBStopSelectionScreenBottomSheetType.MultipleOriginDestinationSelection) pBStopSelectionScreenBottomSheetType2).f7956a;
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = chaloTextUIStateD;
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = titleSubtitleUiState;
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = null;
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = null;
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 4;
                                objB14 = K0(list, pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                                if (objB14 != obj) {
                                    chaloTextUIState = chaloTextUIStateD;
                                    titleSubtitleUiState2 = titleSubtitleUiState;
                                    return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.MultipleOriginDestinationSelection(new MultipleOriginDestinationSelectionScreenUIState(chaloTextUIState, (List) objB14, titleSubtitleUiState2));
                                }
                            }
                        }
                    }
                } else {
                    orangePrimary = orangePrimary3;
                    if (pBStopSelectionScreenBottomSheetType6 instanceof PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) {
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = pBStopSelectionScreenBottomSheetType6;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextStyleHelper14;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 5;
                        objB3 = stringProvider3.b(StringEnum.SUGGEST_STOPS, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                        if (objB3 != obj) {
                            chaloTextStyleHelper4 = chaloTextStyleHelper14;
                            stringProvider2 = stringProvider3;
                            i = 0;
                            chaloTextUIStateD2 = ChaloTextStyleHelper.d(chaloTextStyleHelper4, (String) objB3, black_88, null, UIFontWeight.Bold, 108);
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = pBStopSelectionScreenBottomSheetType6;
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIStateD2;
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = chaloTextStyleHelper14;
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 6;
                            objB4 = stringProvider2.b(StringEnum.PICKUP_STOP, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                            if (objB4 != obj) {
                                chaloTextUIState2 = chaloTextUIStateD2;
                                chaloTextStyleHelper7 = chaloTextStyleHelper14;
                                TextUIState.ChaloTextUIState chaloTextUIState16 = chaloTextUIState2;
                                buttonUIStateFactory2 = buttonUIStateFactory11;
                                TextUIState.ChaloTextUIState chaloTextUIStateC = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) objB4, black_70, null, null, null, null, 124);
                                pBStopPlaceSelectedAppModel = ((PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) pBStopSelectionScreenBottomSheetType6).f7957a;
                                if (pBStopPlaceSelectedAppModel != null || (str2 = pBStopPlaceSelectedAppModel.c) == null) {
                                    str = "";
                                } else {
                                    str = str2;
                                }
                                black_87 = black_88;
                                titleSubtitleUiState3 = new TitleSubtitleUiState(null, chaloTextUIStateC, ChaloTextStyleHelper.f(chaloTextStyleHelper14, str, black_88, UIFontWeight.Normal, null, 108), UiEventHandler.Companion.a(new er0(this, 3)), 1);
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = pBStopSelectionScreenBottomSheetType6;
                                chaloTextUIState3 = chaloTextUIState16;
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIState3;
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = titleSubtitleUiState3;
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = chaloTextStyleHelper14;
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 7;
                                objB5 = stringProvider2.b(StringEnum.DROPOFF_STOP, new Object[i], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                                if (objB5 != obj) {
                                    pBStopSelectionScreenBottomSheetType3 = pBStopSelectionScreenBottomSheetType6;
                                    titleSubtitleUiState4 = titleSubtitleUiState3;
                                    chaloTextStyleHelper8 = chaloTextStyleHelper14;
                                    pBStopSelectionScreenBottomSheetType4 = pBStopSelectionScreenBottomSheetType3;
                                    chaloTextUIState4 = chaloTextUIState3;
                                    orangePrimary2 = orangePrimary;
                                    TextUIState.ChaloTextUIState chaloTextUIStateC2 = ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) objB5, black_70, null, null, null, null, 124);
                                    pBStopPlaceSelectedAppModel2 = ((PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) pBStopSelectionScreenBottomSheetType4).b;
                                    if (pBStopPlaceSelectedAppModel2 != null || (str4 = pBStopPlaceSelectedAppModel2.c) == null) {
                                        str3 = "";
                                    } else {
                                        str3 = str4;
                                    }
                                    titleSubtitleUiState5 = new TitleSubtitleUiState(null, chaloTextUIStateC2, ChaloTextStyleHelper.f(chaloTextStyleHelper14, str3, black_87, UIFontWeight.Normal, null, 108), UiEventHandler.Companion.a(new er0(this, 4)), 1);
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = pBStopSelectionScreenBottomSheetType4;
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIState4;
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = titleSubtitleUiState4;
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = titleSubtitleUiState5;
                                    buttonUIStateFactory3 = buttonUIStateFactory2;
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4 = buttonUIStateFactory3;
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$5 = chaloTextStyleHelper14;
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 8;
                                    objB6 = stringProvider2.b(StringEnum.SUBMIT, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                                    if (objB6 != obj) {
                                        chaloTextUIState5 = chaloTextUIState4;
                                        objB14 = objB6;
                                        pBStopSelectionScreenBottomSheetType5 = pBStopSelectionScreenBottomSheetType4;
                                        chaloTextStyleHelper9 = chaloTextStyleHelper14;
                                        buttonUIStateFactory4 = buttonUIStateFactory3;
                                        titleSubtitleUiState6 = titleSubtitleUiState4;
                                        buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory4, ChaloTextStyleHelper.b(chaloTextStyleHelper9, (String) objB14, white2, 0, null, UIFontWeight.Bold, null, null, 108), new fr0(0, this, pBStopSelectionScreenBottomSheetType5), null, false, 0.0f, 60);
                                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = chaloTextUIState5;
                                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = titleSubtitleUiState6;
                                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = titleSubtitleUiState5;
                                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = buttonUIStateF;
                                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4 = buttonUIStateFactory3;
                                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$5 = chaloTextStyleHelper14;
                                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 9;
                                        objB14 = stringProvider2.b(StringEnum.CANCEL, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                                        if (objB14 != obj) {
                                            titleSubtitleUiState7 = titleSubtitleUiState5;
                                            chaloTextUIState6 = chaloTextUIState5;
                                            buttonUIStateFactory5 = buttonUIStateFactory3;
                                            ChaloColorToken.OrangePrimary orangePrimary4 = orangePrimary2;
                                            return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.NewRouteSuggestion(new NewRouteSuggestionUIState(chaloTextUIState6, titleSubtitleUiState6, titleSubtitleUiState7, new ImageUIState(IconType.IC_RED_CROSS, (String) null, orangePrimary4, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 6)), 114), buttonUIStateF, ButtonUIStateFactory.h(buttonUIStateFactory5, ChaloTextStyleHelper.b(chaloTextStyleHelper14, (String) objB14, orangePrimary4, 0, null, UIFontWeight.Bold, null, null, 108), UiEventHandler.Companion.a(new er0(this, 5)), null, false, 28)));
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        buttonUIStateFactory = buttonUIStateFactory11;
                        stringProvider = stringProvider3;
                        white = white2;
                        if (Intrinsics.d(pBStopSelectionScreenBottomSheetType6, PBStopSelectionScreenBottomSheetType.NewRouteSuggestionSubmitSuccess.f7958a)) {
                            imageUIState3 = new ImageUIState(IconType.ACKNOWLEDGEMENT_PASS_TICKET, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = imageUIState3;
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextStyleHelper14;
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 10;
                            objB14 = stringProvider.b(StringEnum.SUGGESTION_NOTED_TITLE, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                            if (objB14 != obj) {
                                chaloTextStyleHelper3 = chaloTextStyleHelper14;
                                chaloTextUIStateE = ChaloTextStyleHelper.e(chaloTextStyleHelper3, (String) objB14, black, UITextAlign.Center, UIFontWeight.Bold, null, 100);
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = imageUIState3;
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIStateE;
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = chaloTextStyleHelper14;
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 11;
                                objB7 = stringProvider.b(StringEnum.SUGGESTION_NOTED_DESC, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                                if (objB7 != obj) {
                                    chaloTextUIState7 = chaloTextUIStateE;
                                    objB14 = objB7;
                                    chaloTextStyleHelper10 = chaloTextStyleHelper14;
                                    chaloTextUIStateB2 = ChaloTextStyleHelper.b(chaloTextStyleHelper10, (String) objB14, black, 0, UITextAlign.Center, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = imageUIState3;
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIState7;
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = chaloTextUIStateB2;
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = buttonUIStateFactory;
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4 = chaloTextStyleHelper14;
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 12;
                                    objB8 = stringProvider.b(StringEnum.OKAY_RUNNING_CASE, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                                    if (objB8 != obj) {
                                        imageUIState4 = imageUIState3;
                                        chaloTextUIState8 = chaloTextUIStateB2;
                                        objB14 = objB8;
                                        chaloTextUIState9 = chaloTextUIState7;
                                        buttonUIStateFactory6 = buttonUIStateFactory;
                                        ButtonUIState buttonUIStateF4 = ButtonUIStateFactory.f(buttonUIStateFactory6, ChaloTextStyleHelper.b(chaloTextStyleHelper14, (String) objB14, white, 0, null, UIFontWeight.SemiBold, null, null, 108), new er0(this, 7), null, false, 0.0f, 60);
                                        ErrorWithMsgAndRetryUISpecs errorWithMsgAndRetryUISpecs = new ErrorWithMsgAndRetryUISpecs(null, 0.0f, 0.0f, 0.0f, 255);
                                        float f = ChaloThemeHelper.a().h;
                                        float f2 = ChaloThemeHelper.a().i;
                                        return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.NewRouteSuggestionSubmitSuccess(new StandardErrorScreenUIState.ErrorWithMsgAndRetry(imageUIState4, chaloTextUIState9, chaloTextUIState8, buttonUIStateF4, null, ErrorWithMsgAndRetryUISpecs.a(errorWithMsgAndRetryUISpecs, new ChaloPadding(f2, f, f, f2), true, WebSocketProtocol.PAYLOAD_SHORT), 16));
                                    }
                                }
                            }
                        } else if (Intrinsics.d(pBStopSelectionScreenBottomSheetType6, PBStopSelectionScreenBottomSheetType.NoProductFoundBottomSheet.f7960a)) {
                            imageUIState2 = new ImageUIState(IconType.IC_ERROR_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = imageUIState2;
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextStyleHelper14;
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 13;
                            objB2 = stringProvider.b(StringEnum.PASSES_NOT_AVAILABLE_FOR_THIS_ROUTE, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                            if (objB2 != obj) {
                                chaloTextStyleHelper2 = chaloTextStyleHelper14;
                                chaloTextUIStateE2 = ChaloTextStyleHelper.e(chaloTextStyleHelper2, (String) objB2, black, UITextAlign.Center, UIFontWeight.Bold, null, 100);
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = imageUIState2;
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIStateE2;
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = chaloTextStyleHelper14;
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 14;
                                objB9 = stringProvider.b(StringEnum.TRY_SEARCHING_FOR_A_DIFFERENT_ORIGIN_AND_DESTINATION, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                                if (objB9 != obj) {
                                    chaloTextStyleHelper11 = chaloTextStyleHelper14;
                                    chaloTextUIStateB3 = ChaloTextStyleHelper.b(chaloTextStyleHelper11, (String) objB9, black, 0, UITextAlign.Center, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = imageUIState2;
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIStateE2;
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = chaloTextUIStateB3;
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = buttonUIStateFactory;
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4 = chaloTextStyleHelper14;
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 15;
                                    objB10 = stringProvider.b(StringEnum.OKAY_RUNNING_CASE, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                                    if (objB10 != obj) {
                                        chaloTextUIState10 = chaloTextUIStateE2;
                                        chaloTextUIState11 = chaloTextUIStateB3;
                                        chaloTextStyleHelper12 = chaloTextStyleHelper14;
                                        buttonUIStateFactory7 = buttonUIStateFactory;
                                        buttonUIStateF2 = ButtonUIStateFactory.f(buttonUIStateFactory7, ChaloTextStyleHelper.b(chaloTextStyleHelper12, (String) objB10, white, 0, null, UIFontWeight.SemiBold, null, null, 108), new er0(this, 8), null, false, 0.0f, 60);
                                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = imageUIState2;
                                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIState10;
                                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = chaloTextUIState11;
                                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = buttonUIStateF2;
                                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4 = buttonUIStateFactory;
                                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$5 = chaloTextStyleHelper14;
                                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 16;
                                        objB11 = stringProvider.b(StringEnum.EXPLORE_AVAILABLE_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                                        if (objB11 != obj) {
                                            imageUIState5 = imageUIState2;
                                            chaloTextUIState12 = chaloTextUIState11;
                                            chaloTextUIState13 = chaloTextUIState10;
                                            buttonUIState = buttonUIStateF2;
                                            buttonUIStateFactory8 = buttonUIStateFactory;
                                            ButtonUIState buttonUIStateH = ButtonUIStateFactory.h(buttonUIStateFactory8, ChaloTextStyleHelper.b(chaloTextStyleHelper14, (String) objB11, orangePrimary, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new er0(this, 9)), null, false, 28);
                                            ErrorWithMsgAndRetryUISpecs errorWithMsgAndRetryUISpecs2 = new ErrorWithMsgAndRetryUISpecs(null, 0.0f, 0.0f, 0.0f, 255);
                                            float f3 = ChaloThemeHelper.a().h;
                                            float f4 = ChaloThemeHelper.a().i;
                                            return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.NoProductFoundBottomSheet(new StandardErrorScreenUIState.ErrorWithMsgAndRetry(imageUIState5, chaloTextUIState13, chaloTextUIState12, buttonUIState, buttonUIStateH, ErrorWithMsgAndRetryUISpecs.a(errorWithMsgAndRetryUISpecs2, new ChaloPadding(f4, f3, f3, f4), true, WebSocketProtocol.PAYLOAD_SHORT)));
                                        }
                                    }
                                }
                            }
                        } else {
                            if (!Intrinsics.d(pBStopSelectionScreenBottomSheetType6, PBStopSelectionScreenBottomSheetType.NoOriginDestinationPairsAvailable.f7959a)) {
                                if ((pBStopSelectionScreenBottomSheetType6 instanceof PBStopSelectionScreenBottomSheetType.PremiumBusDateAndTimePickerBottomSheet) || (pBStopSelectionScreenBottomSheetType6 instanceof PBStopSelectionScreenBottomSheetType.PremiumPassSavingsFaqsBottomSheet) || pBStopSelectionScreenBottomSheetType6 == null) {
                                    return null;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            imageUIState = new ImageUIState(IconType.IC_ERROR_IMAGE, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = imageUIState;
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextStyleHelper14;
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 17;
                            objB = stringProvider.b(StringEnum.NO_ROUTE_AVAILABLE_FOR_THIS_SEARCH, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                            if (objB != obj) {
                                chaloTextStyleHelper = chaloTextStyleHelper14;
                                chaloTextUIStateE3 = ChaloTextStyleHelper.e(chaloTextStyleHelper, (String) objB, black, UITextAlign.Center, UIFontWeight.Bold, null, 100);
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = imageUIState;
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIStateE3;
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = buttonUIStateFactory;
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = chaloTextStyleHelper14;
                                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 18;
                                objB12 = stringProvider.b(StringEnum.OKAY_RUNNING_CASE, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                                if (objB12 != obj) {
                                    chaloTextStyleHelper13 = chaloTextStyleHelper14;
                                    buttonUIStateFactory9 = buttonUIStateFactory;
                                    buttonUIStateF3 = ButtonUIStateFactory.f(buttonUIStateFactory9, ChaloTextStyleHelper.b(chaloTextStyleHelper13, (String) objB12, white, 0, null, UIFontWeight.SemiBold, null, null, 108), new er0(this, 10), null, false, 0.0f, 60);
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = imageUIState;
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIStateE3;
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = buttonUIStateF3;
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = buttonUIStateFactory;
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4 = chaloTextStyleHelper14;
                                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 19;
                                    objB13 = stringProvider.b(StringEnum.EXPLORE_AVAILABLE_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                                    if (objB13 != obj) {
                                        imageUIState6 = imageUIState;
                                        chaloTextUIState14 = chaloTextUIStateE3;
                                        buttonUIState2 = buttonUIStateF3;
                                        buttonUIStateFactory10 = buttonUIStateFactory;
                                        ButtonUIState buttonUIStateH2 = ButtonUIStateFactory.h(buttonUIStateFactory10, ChaloTextStyleHelper.b(chaloTextStyleHelper14, (String) objB13, orangePrimary, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new er0(this, 2)), null, false, 28);
                                        ErrorWithMsgAndRetryUISpecs errorWithMsgAndRetryUISpecs3 = new ErrorWithMsgAndRetryUISpecs(null, 0.0f, 0.0f, 0.0f, 255);
                                        float f5 = ChaloThemeHelper.a().h;
                                        float f6 = ChaloThemeHelper.a().i;
                                        return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.NoOriginDestinationPairsAvailable(new StandardErrorScreenUIState.ErrorWithMsgAndRetry(imageUIState6, chaloTextUIState14, null, buttonUIState2, buttonUIStateH2, ErrorWithMsgAndRetryUISpecs.a(errorWithMsgAndRetryUISpecs3, new ChaloPadding(f6, f5, f5, f6), true, WebSocketProtocol.PAYLOAD_SHORT), 4));
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 1:
                ChaloTextStyleHelper chaloTextStyleHelper15 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1;
                PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType7 = (PBStopSelectionScreenBottomSheetType) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0;
                ResultKt.b(objB14);
                chaloTextStyleHelper5 = chaloTextStyleHelper15;
                pBStopSelectionScreenBottomSheetType6 = pBStopSelectionScreenBottomSheetType7;
                chaloTextUIStateD = ChaloTextStyleHelper.d(chaloTextStyleHelper5, (String) objB14, black, UITextAlign.Center, UIFontWeight.Bold, 96);
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = pBStopSelectionScreenBottomSheetType6;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIStateD;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = chaloTextStyleHelper14;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 2;
                objB14 = stringProvider3.b(StringEnum.CANT_FIND_YOUR_PREFERRED_STOP, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                if (objB14 != obj) {
                    pBStopSelectionScreenBottomSheetType2 = pBStopSelectionScreenBottomSheetType6;
                    chaloTextStyleHelper6 = chaloTextStyleHelper14;
                    chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper6, (String) objB14, black, 0, UITextAlign.Center, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = pBStopSelectionScreenBottomSheetType2;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIStateD;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = chaloTextUIStateB;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = chaloTextStyleHelper14;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 3;
                    objB14 = stringProvider3.b(StringEnum.SUGGEST_A_DIFFERENT_STOP, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                    if (objB14 != obj) {
                        TextUIState.ChaloTextUIState chaloTextUIState17 = chaloTextUIStateB;
                        TextUIState.ChaloTextUIState chaloTextUIStateG2 = ChaloTextStyleHelper.g(chaloTextStyleHelper14, (String) objB14, orangePrimary3, UITextAlign.Center, null, UiEventHandler.Companion.a(new er0(this, 1)), null, 84);
                        new TitleSubtitleUiSpecs(0.0f, 3);
                        titleSubtitleUiState = new TitleSubtitleUiState(new TitleSubtitleUiSpecs(new ChaloPadding(ChaloThemeHelper.a().j, 0.0f, 0.0f, ChaloThemeHelper.a().j, 6), ChaloThemeHelper.a().g), chaloTextUIState17, chaloTextUIStateG2, null, 8);
                        List list2 = ((PBStopSelectionScreenBottomSheetType.MultipleOriginDestinationSelection) pBStopSelectionScreenBottomSheetType2).f7956a;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = chaloTextUIStateD;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = titleSubtitleUiState;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = null;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = null;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 4;
                        objB14 = K0(list2, pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                        if (objB14 != obj) {
                            chaloTextUIState = chaloTextUIStateD;
                            titleSubtitleUiState2 = titleSubtitleUiState;
                            return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.MultipleOriginDestinationSelection(new MultipleOriginDestinationSelectionScreenUIState(chaloTextUIState, (List) objB14, titleSubtitleUiState2));
                        }
                    }
                }
                return obj;
            case 2:
                ChaloTextStyleHelper chaloTextStyleHelper16 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2;
                chaloTextUIStateD = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1;
                pBStopSelectionScreenBottomSheetType2 = (PBStopSelectionScreenBottomSheetType) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0;
                ResultKt.b(objB14);
                chaloTextStyleHelper6 = chaloTextStyleHelper16;
                chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper6, (String) objB14, black, 0, UITextAlign.Center, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = pBStopSelectionScreenBottomSheetType2;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIStateD;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = chaloTextUIStateB;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = chaloTextStyleHelper14;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 3;
                objB14 = stringProvider3.b(StringEnum.SUGGEST_A_DIFFERENT_STOP, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                if (objB14 != obj) {
                    TextUIState.ChaloTextUIState chaloTextUIState18 = chaloTextUIStateB;
                    TextUIState.ChaloTextUIState chaloTextUIStateG3 = ChaloTextStyleHelper.g(chaloTextStyleHelper14, (String) objB14, orangePrimary3, UITextAlign.Center, null, UiEventHandler.Companion.a(new er0(this, 1)), null, 84);
                    new TitleSubtitleUiSpecs(0.0f, 3);
                    titleSubtitleUiState = new TitleSubtitleUiState(new TitleSubtitleUiSpecs(new ChaloPadding(ChaloThemeHelper.a().j, 0.0f, 0.0f, ChaloThemeHelper.a().j, 6), ChaloThemeHelper.a().g), chaloTextUIState18, chaloTextUIStateG3, null, 8);
                    List list3 = ((PBStopSelectionScreenBottomSheetType.MultipleOriginDestinationSelection) pBStopSelectionScreenBottomSheetType2).f7956a;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = chaloTextUIStateD;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = titleSubtitleUiState;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = null;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = null;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 4;
                    objB14 = K0(list3, pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                    if (objB14 != obj) {
                        chaloTextUIState = chaloTextUIStateD;
                        titleSubtitleUiState2 = titleSubtitleUiState;
                        return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.MultipleOriginDestinationSelection(new MultipleOriginDestinationSelectionScreenUIState(chaloTextUIState, (List) objB14, titleSubtitleUiState2));
                    }
                }
                return obj;
            case 3:
                chaloTextStyleHelper14 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3;
                chaloTextUIStateB = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2;
                chaloTextUIStateD = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1;
                pBStopSelectionScreenBottomSheetType2 = (PBStopSelectionScreenBottomSheetType) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0;
                ResultKt.b(objB14);
                TextUIState.ChaloTextUIState chaloTextUIState19 = chaloTextUIStateB;
                TextUIState.ChaloTextUIState chaloTextUIStateG4 = ChaloTextStyleHelper.g(chaloTextStyleHelper14, (String) objB14, orangePrimary3, UITextAlign.Center, null, UiEventHandler.Companion.a(new er0(this, 1)), null, 84);
                new TitleSubtitleUiSpecs(0.0f, 3);
                titleSubtitleUiState = new TitleSubtitleUiState(new TitleSubtitleUiSpecs(new ChaloPadding(ChaloThemeHelper.a().j, 0.0f, 0.0f, ChaloThemeHelper.a().j, 6), ChaloThemeHelper.a().g), chaloTextUIState19, chaloTextUIStateG4, null, 8);
                List list4 = ((PBStopSelectionScreenBottomSheetType.MultipleOriginDestinationSelection) pBStopSelectionScreenBottomSheetType2).f7956a;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = chaloTextUIStateD;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = titleSubtitleUiState;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = null;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = null;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 4;
                objB14 = K0(list4, pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                if (objB14 != obj) {
                    chaloTextUIState = chaloTextUIStateD;
                    titleSubtitleUiState2 = titleSubtitleUiState;
                    return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.MultipleOriginDestinationSelection(new MultipleOriginDestinationSelectionScreenUIState(chaloTextUIState, (List) objB14, titleSubtitleUiState2));
                }
                return obj;
            case 4:
                titleSubtitleUiState2 = (TitleSubtitleUiState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1;
                chaloTextUIState = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0;
                ResultKt.b(objB14);
                return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.MultipleOriginDestinationSelection(new MultipleOriginDestinationSelectionScreenUIState(chaloTextUIState, (List) objB14, titleSubtitleUiState2));
            case 5:
                ChaloTextStyleHelper chaloTextStyleHelper17 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1;
                PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType8 = (PBStopSelectionScreenBottomSheetType) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0;
                ResultKt.b(objB14);
                chaloTextStyleHelper4 = chaloTextStyleHelper17;
                pBStopSelectionScreenBottomSheetType6 = pBStopSelectionScreenBottomSheetType8;
                objB3 = objB14;
                orangePrimary = orangePrimary3;
                stringProvider2 = stringProvider3;
                i = 0;
                chaloTextUIStateD2 = ChaloTextStyleHelper.d(chaloTextStyleHelper4, (String) objB3, black_88, null, UIFontWeight.Bold, 108);
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = pBStopSelectionScreenBottomSheetType6;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIStateD2;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = chaloTextStyleHelper14;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 6;
                objB4 = stringProvider2.b(StringEnum.PICKUP_STOP, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                if (objB4 != obj) {
                    chaloTextUIState2 = chaloTextUIStateD2;
                    chaloTextStyleHelper7 = chaloTextStyleHelper14;
                    TextUIState.ChaloTextUIState chaloTextUIState110 = chaloTextUIState2;
                    buttonUIStateFactory2 = buttonUIStateFactory11;
                    TextUIState.ChaloTextUIState chaloTextUIStateC3 = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) objB4, black_70, null, null, null, null, 124);
                    pBStopPlaceSelectedAppModel = ((PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) pBStopSelectionScreenBottomSheetType6).f7957a;
                    if (pBStopPlaceSelectedAppModel != null) {
                        str = "";
                    } else {
                        str = "";
                    }
                    black_87 = black_88;
                    titleSubtitleUiState3 = new TitleSubtitleUiState(null, chaloTextUIStateC3, ChaloTextStyleHelper.f(chaloTextStyleHelper14, str, black_88, UIFontWeight.Normal, null, 108), UiEventHandler.Companion.a(new er0(this, 3)), 1);
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = pBStopSelectionScreenBottomSheetType6;
                    chaloTextUIState3 = chaloTextUIState110;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIState3;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = titleSubtitleUiState3;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = chaloTextStyleHelper14;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 7;
                    objB5 = stringProvider2.b(StringEnum.DROPOFF_STOP, new Object[i], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                    if (objB5 != obj) {
                        pBStopSelectionScreenBottomSheetType3 = pBStopSelectionScreenBottomSheetType6;
                        titleSubtitleUiState4 = titleSubtitleUiState3;
                        chaloTextStyleHelper8 = chaloTextStyleHelper14;
                        pBStopSelectionScreenBottomSheetType4 = pBStopSelectionScreenBottomSheetType3;
                        chaloTextUIState4 = chaloTextUIState3;
                        orangePrimary2 = orangePrimary;
                        TextUIState.ChaloTextUIState chaloTextUIStateC4 = ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) objB5, black_70, null, null, null, null, 124);
                        pBStopPlaceSelectedAppModel2 = ((PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) pBStopSelectionScreenBottomSheetType4).b;
                        if (pBStopPlaceSelectedAppModel2 != null) {
                            str3 = "";
                        } else {
                            str3 = "";
                        }
                        titleSubtitleUiState5 = new TitleSubtitleUiState(null, chaloTextUIStateC4, ChaloTextStyleHelper.f(chaloTextStyleHelper14, str3, black_87, UIFontWeight.Normal, null, 108), UiEventHandler.Companion.a(new er0(this, 4)), 1);
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = pBStopSelectionScreenBottomSheetType4;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIState4;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = titleSubtitleUiState4;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = titleSubtitleUiState5;
                        buttonUIStateFactory3 = buttonUIStateFactory2;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4 = buttonUIStateFactory3;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$5 = chaloTextStyleHelper14;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 8;
                        objB6 = stringProvider2.b(StringEnum.SUBMIT, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                        if (objB6 != obj) {
                            chaloTextUIState5 = chaloTextUIState4;
                            objB14 = objB6;
                            pBStopSelectionScreenBottomSheetType5 = pBStopSelectionScreenBottomSheetType4;
                            chaloTextStyleHelper9 = chaloTextStyleHelper14;
                            buttonUIStateFactory4 = buttonUIStateFactory3;
                            titleSubtitleUiState6 = titleSubtitleUiState4;
                            buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory4, ChaloTextStyleHelper.b(chaloTextStyleHelper9, (String) objB14, white2, 0, null, UIFontWeight.Bold, null, null, 108), new fr0(0, this, pBStopSelectionScreenBottomSheetType5), null, false, 0.0f, 60);
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = chaloTextUIState5;
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = titleSubtitleUiState6;
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = titleSubtitleUiState5;
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = buttonUIStateF;
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4 = buttonUIStateFactory3;
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$5 = chaloTextStyleHelper14;
                            pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 9;
                            objB14 = stringProvider2.b(StringEnum.CANCEL, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                            if (objB14 != obj) {
                                titleSubtitleUiState7 = titleSubtitleUiState5;
                                chaloTextUIState6 = chaloTextUIState5;
                                buttonUIStateFactory5 = buttonUIStateFactory3;
                                ChaloColorToken.OrangePrimary orangePrimary5 = orangePrimary2;
                                return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.NewRouteSuggestion(new NewRouteSuggestionUIState(chaloTextUIState6, titleSubtitleUiState6, titleSubtitleUiState7, new ImageUIState(IconType.IC_RED_CROSS, (String) null, orangePrimary5, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 6)), 114), buttonUIStateF, ButtonUIStateFactory.h(buttonUIStateFactory5, ChaloTextStyleHelper.b(chaloTextStyleHelper14, (String) objB14, orangePrimary5, 0, null, UIFontWeight.Bold, null, null, 108), UiEventHandler.Companion.a(new er0(this, 5)), null, false, 28)));
                            }
                        }
                    }
                }
                return obj;
            case 6:
                ChaloTextStyleHelper chaloTextStyleHelper18 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState20 = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1;
                PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType9 = (PBStopSelectionScreenBottomSheetType) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0;
                ResultKt.b(objB14);
                chaloTextUIState2 = chaloTextUIState20;
                i = 0;
                chaloTextStyleHelper7 = chaloTextStyleHelper18;
                objB4 = objB14;
                pBStopSelectionScreenBottomSheetType6 = pBStopSelectionScreenBottomSheetType9;
                stringProvider2 = stringProvider3;
                orangePrimary = orangePrimary3;
                TextUIState.ChaloTextUIState chaloTextUIState111 = chaloTextUIState2;
                buttonUIStateFactory2 = buttonUIStateFactory11;
                TextUIState.ChaloTextUIState chaloTextUIStateC5 = ChaloTextStyleHelper.c(chaloTextStyleHelper7, (String) objB4, black_70, null, null, null, null, 124);
                pBStopPlaceSelectedAppModel = ((PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) pBStopSelectionScreenBottomSheetType6).f7957a;
                if (pBStopPlaceSelectedAppModel != null) {
                    str = "";
                } else {
                    str = "";
                }
                black_87 = black_88;
                titleSubtitleUiState3 = new TitleSubtitleUiState(null, chaloTextUIStateC5, ChaloTextStyleHelper.f(chaloTextStyleHelper14, str, black_88, UIFontWeight.Normal, null, 108), UiEventHandler.Companion.a(new er0(this, 3)), 1);
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = pBStopSelectionScreenBottomSheetType6;
                chaloTextUIState3 = chaloTextUIState111;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIState3;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = titleSubtitleUiState3;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = chaloTextStyleHelper14;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 7;
                objB5 = stringProvider2.b(StringEnum.DROPOFF_STOP, new Object[i], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                if (objB5 != obj) {
                    pBStopSelectionScreenBottomSheetType3 = pBStopSelectionScreenBottomSheetType6;
                    titleSubtitleUiState4 = titleSubtitleUiState3;
                    chaloTextStyleHelper8 = chaloTextStyleHelper14;
                    pBStopSelectionScreenBottomSheetType4 = pBStopSelectionScreenBottomSheetType3;
                    chaloTextUIState4 = chaloTextUIState3;
                    orangePrimary2 = orangePrimary;
                    TextUIState.ChaloTextUIState chaloTextUIStateC6 = ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) objB5, black_70, null, null, null, null, 124);
                    pBStopPlaceSelectedAppModel2 = ((PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) pBStopSelectionScreenBottomSheetType4).b;
                    if (pBStopPlaceSelectedAppModel2 != null) {
                        str3 = "";
                    } else {
                        str3 = "";
                    }
                    titleSubtitleUiState5 = new TitleSubtitleUiState(null, chaloTextUIStateC6, ChaloTextStyleHelper.f(chaloTextStyleHelper14, str3, black_87, UIFontWeight.Normal, null, 108), UiEventHandler.Companion.a(new er0(this, 4)), 1);
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = pBStopSelectionScreenBottomSheetType4;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIState4;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = titleSubtitleUiState4;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = titleSubtitleUiState5;
                    buttonUIStateFactory3 = buttonUIStateFactory2;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4 = buttonUIStateFactory3;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$5 = chaloTextStyleHelper14;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 8;
                    objB6 = stringProvider2.b(StringEnum.SUBMIT, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                    if (objB6 != obj) {
                        chaloTextUIState5 = chaloTextUIState4;
                        objB14 = objB6;
                        pBStopSelectionScreenBottomSheetType5 = pBStopSelectionScreenBottomSheetType4;
                        chaloTextStyleHelper9 = chaloTextStyleHelper14;
                        buttonUIStateFactory4 = buttonUIStateFactory3;
                        titleSubtitleUiState6 = titleSubtitleUiState4;
                        buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory4, ChaloTextStyleHelper.b(chaloTextStyleHelper9, (String) objB14, white2, 0, null, UIFontWeight.Bold, null, null, 108), new fr0(0, this, pBStopSelectionScreenBottomSheetType5), null, false, 0.0f, 60);
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = chaloTextUIState5;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = titleSubtitleUiState6;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = titleSubtitleUiState5;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = buttonUIStateF;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4 = buttonUIStateFactory3;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$5 = chaloTextStyleHelper14;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 9;
                        objB14 = stringProvider2.b(StringEnum.CANCEL, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                        if (objB14 != obj) {
                            titleSubtitleUiState7 = titleSubtitleUiState5;
                            chaloTextUIState6 = chaloTextUIState5;
                            buttonUIStateFactory5 = buttonUIStateFactory3;
                            ChaloColorToken.OrangePrimary orangePrimary6 = orangePrimary2;
                            return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.NewRouteSuggestion(new NewRouteSuggestionUIState(chaloTextUIState6, titleSubtitleUiState6, titleSubtitleUiState7, new ImageUIState(IconType.IC_RED_CROSS, (String) null, orangePrimary6, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 6)), 114), buttonUIStateF, ButtonUIStateFactory.h(buttonUIStateFactory5, ChaloTextStyleHelper.b(chaloTextStyleHelper14, (String) objB14, orangePrimary6, 0, null, UIFontWeight.Bold, null, null, 108), UiEventHandler.Companion.a(new er0(this, 5)), null, false, 28)));
                        }
                    }
                }
                return obj;
            case 7:
                ChaloTextStyleHelper chaloTextStyleHelper19 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3;
                TitleSubtitleUiState titleSubtitleUiState8 = (TitleSubtitleUiState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState21 = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1;
                PBStopSelectionScreenBottomSheetType pBStopSelectionScreenBottomSheetType10 = (PBStopSelectionScreenBottomSheetType) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0;
                ResultKt.b(objB14);
                pBStopSelectionScreenBottomSheetType3 = pBStopSelectionScreenBottomSheetType10;
                buttonUIStateFactory2 = buttonUIStateFactory11;
                black_87 = black_88;
                chaloTextStyleHelper8 = chaloTextStyleHelper19;
                objB5 = objB14;
                titleSubtitleUiState4 = titleSubtitleUiState8;
                orangePrimary = orangePrimary3;
                chaloTextUIState3 = chaloTextUIState21;
                stringProvider2 = stringProvider3;
                pBStopSelectionScreenBottomSheetType4 = pBStopSelectionScreenBottomSheetType3;
                chaloTextUIState4 = chaloTextUIState3;
                orangePrimary2 = orangePrimary;
                TextUIState.ChaloTextUIState chaloTextUIStateC7 = ChaloTextStyleHelper.c(chaloTextStyleHelper8, (String) objB5, black_70, null, null, null, null, 124);
                pBStopPlaceSelectedAppModel2 = ((PBStopSelectionScreenBottomSheetType.NewRouteSuggestion) pBStopSelectionScreenBottomSheetType4).b;
                if (pBStopPlaceSelectedAppModel2 != null) {
                    str3 = "";
                } else {
                    str3 = "";
                }
                titleSubtitleUiState5 = new TitleSubtitleUiState(null, chaloTextUIStateC7, ChaloTextStyleHelper.f(chaloTextStyleHelper14, str3, black_87, UIFontWeight.Normal, null, 108), UiEventHandler.Companion.a(new er0(this, 4)), 1);
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = pBStopSelectionScreenBottomSheetType4;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIState4;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = titleSubtitleUiState4;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = titleSubtitleUiState5;
                buttonUIStateFactory3 = buttonUIStateFactory2;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4 = buttonUIStateFactory3;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$5 = chaloTextStyleHelper14;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 8;
                objB6 = stringProvider2.b(StringEnum.SUBMIT, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                if (objB6 != obj) {
                    chaloTextUIState5 = chaloTextUIState4;
                    objB14 = objB6;
                    pBStopSelectionScreenBottomSheetType5 = pBStopSelectionScreenBottomSheetType4;
                    chaloTextStyleHelper9 = chaloTextStyleHelper14;
                    buttonUIStateFactory4 = buttonUIStateFactory3;
                    titleSubtitleUiState6 = titleSubtitleUiState4;
                    buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory4, ChaloTextStyleHelper.b(chaloTextStyleHelper9, (String) objB14, white2, 0, null, UIFontWeight.Bold, null, null, 108), new fr0(0, this, pBStopSelectionScreenBottomSheetType5), null, false, 0.0f, 60);
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = chaloTextUIState5;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = titleSubtitleUiState6;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = titleSubtitleUiState5;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = buttonUIStateF;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4 = buttonUIStateFactory3;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$5 = chaloTextStyleHelper14;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 9;
                    objB14 = stringProvider2.b(StringEnum.CANCEL, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                    if (objB14 != obj) {
                        titleSubtitleUiState7 = titleSubtitleUiState5;
                        chaloTextUIState6 = chaloTextUIState5;
                        buttonUIStateFactory5 = buttonUIStateFactory3;
                        ChaloColorToken.OrangePrimary orangePrimary7 = orangePrimary2;
                        return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.NewRouteSuggestion(new NewRouteSuggestionUIState(chaloTextUIState6, titleSubtitleUiState6, titleSubtitleUiState7, new ImageUIState(IconType.IC_RED_CROSS, (String) null, orangePrimary7, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 6)), 114), buttonUIStateF, ButtonUIStateFactory.h(buttonUIStateFactory5, ChaloTextStyleHelper.b(chaloTextStyleHelper14, (String) objB14, orangePrimary7, 0, null, UIFontWeight.Bold, null, null, 108), UiEventHandler.Companion.a(new er0(this, 5)), null, false, 28)));
                    }
                }
                return obj;
            case 8:
                ChaloTextStyleHelper chaloTextStyleHelper20 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$5;
                ButtonUIStateFactory buttonUIStateFactory12 = (ButtonUIStateFactory) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4;
                TitleSubtitleUiState titleSubtitleUiState9 = (TitleSubtitleUiState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3;
                TitleSubtitleUiState titleSubtitleUiState10 = (TitleSubtitleUiState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2;
                chaloTextUIState5 = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1;
                pBStopSelectionScreenBottomSheetType5 = (PBStopSelectionScreenBottomSheetType) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0;
                ResultKt.b(objB14);
                buttonUIStateFactory4 = buttonUIStateFactory12;
                titleSubtitleUiState6 = titleSubtitleUiState10;
                buttonUIStateFactory3 = buttonUIStateFactory11;
                orangePrimary2 = orangePrimary3;
                titleSubtitleUiState5 = titleSubtitleUiState9;
                stringProvider2 = stringProvider3;
                chaloTextStyleHelper9 = chaloTextStyleHelper20;
                buttonUIStateF = ButtonUIStateFactory.f(buttonUIStateFactory4, ChaloTextStyleHelper.b(chaloTextStyleHelper9, (String) objB14, white2, 0, null, UIFontWeight.Bold, null, null, 108), new fr0(0, this, pBStopSelectionScreenBottomSheetType5), null, false, 0.0f, 60);
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = chaloTextUIState5;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = titleSubtitleUiState6;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = titleSubtitleUiState5;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = buttonUIStateF;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4 = buttonUIStateFactory3;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$5 = chaloTextStyleHelper14;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 9;
                objB14 = stringProvider2.b(StringEnum.CANCEL, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                if (objB14 != obj) {
                    titleSubtitleUiState7 = titleSubtitleUiState5;
                    chaloTextUIState6 = chaloTextUIState5;
                    buttonUIStateFactory5 = buttonUIStateFactory3;
                    ChaloColorToken.OrangePrimary orangePrimary8 = orangePrimary2;
                    return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.NewRouteSuggestion(new NewRouteSuggestionUIState(chaloTextUIState6, titleSubtitleUiState6, titleSubtitleUiState7, new ImageUIState(IconType.IC_RED_CROSS, (String) null, orangePrimary8, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 6)), 114), buttonUIStateF, ButtonUIStateFactory.h(buttonUIStateFactory5, ChaloTextStyleHelper.b(chaloTextStyleHelper14, (String) objB14, orangePrimary8, 0, null, UIFontWeight.Bold, null, null, 108), UiEventHandler.Companion.a(new er0(this, 5)), null, false, 28)));
                }
                return obj;
            case 9:
                chaloTextStyleHelper14 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$5;
                ButtonUIStateFactory buttonUIStateFactory13 = (ButtonUIStateFactory) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4;
                buttonUIStateF = (ButtonUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3;
                TitleSubtitleUiState titleSubtitleUiState11 = (TitleSubtitleUiState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2;
                titleSubtitleUiState6 = (TitleSubtitleUiState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1;
                TextUIState.ChaloTextUIState chaloTextUIState22 = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0;
                ResultKt.b(objB14);
                chaloTextUIState6 = chaloTextUIState22;
                titleSubtitleUiState7 = titleSubtitleUiState11;
                buttonUIStateFactory5 = buttonUIStateFactory13;
                orangePrimary2 = orangePrimary3;
                ChaloColorToken.OrangePrimary orangePrimary9 = orangePrimary2;
                return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.NewRouteSuggestion(new NewRouteSuggestionUIState(chaloTextUIState6, titleSubtitleUiState6, titleSubtitleUiState7, new ImageUIState(IconType.IC_RED_CROSS, (String) null, orangePrimary9, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 6)), 114), buttonUIStateF, ButtonUIStateFactory.h(buttonUIStateFactory5, ChaloTextStyleHelper.b(chaloTextStyleHelper14, (String) objB14, orangePrimary9, 0, null, UIFontWeight.Bold, null, null, 108), UiEventHandler.Companion.a(new er0(this, 5)), null, false, 28)));
            case 10:
                ChaloTextStyleHelper chaloTextStyleHelper21 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1;
                ImageUIState imageUIState7 = (ImageUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0;
                ResultKt.b(objB14);
                chaloTextStyleHelper3 = chaloTextStyleHelper21;
                imageUIState3 = imageUIState7;
                buttonUIStateFactory = buttonUIStateFactory11;
                stringProvider = stringProvider3;
                white = white2;
                chaloTextUIStateE = ChaloTextStyleHelper.e(chaloTextStyleHelper3, (String) objB14, black, UITextAlign.Center, UIFontWeight.Bold, null, 100);
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = imageUIState3;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIStateE;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = chaloTextStyleHelper14;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 11;
                objB7 = stringProvider.b(StringEnum.SUGGESTION_NOTED_DESC, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                if (objB7 != obj) {
                    chaloTextUIState7 = chaloTextUIStateE;
                    objB14 = objB7;
                    chaloTextStyleHelper10 = chaloTextStyleHelper14;
                    chaloTextUIStateB2 = ChaloTextStyleHelper.b(chaloTextStyleHelper10, (String) objB14, black, 0, UITextAlign.Center, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = imageUIState3;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIState7;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = chaloTextUIStateB2;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = buttonUIStateFactory;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4 = chaloTextStyleHelper14;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 12;
                    objB8 = stringProvider.b(StringEnum.OKAY_RUNNING_CASE, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                    if (objB8 != obj) {
                        imageUIState4 = imageUIState3;
                        chaloTextUIState8 = chaloTextUIStateB2;
                        objB14 = objB8;
                        chaloTextUIState9 = chaloTextUIState7;
                        buttonUIStateFactory6 = buttonUIStateFactory;
                        ButtonUIState buttonUIStateF5 = ButtonUIStateFactory.f(buttonUIStateFactory6, ChaloTextStyleHelper.b(chaloTextStyleHelper14, (String) objB14, white, 0, null, UIFontWeight.SemiBold, null, null, 108), new er0(this, 7), null, false, 0.0f, 60);
                        ErrorWithMsgAndRetryUISpecs errorWithMsgAndRetryUISpecs4 = new ErrorWithMsgAndRetryUISpecs(null, 0.0f, 0.0f, 0.0f, 255);
                        float f7 = ChaloThemeHelper.a().h;
                        float f8 = ChaloThemeHelper.a().i;
                        return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.NewRouteSuggestionSubmitSuccess(new StandardErrorScreenUIState.ErrorWithMsgAndRetry(imageUIState4, chaloTextUIState9, chaloTextUIState8, buttonUIStateF5, null, ErrorWithMsgAndRetryUISpecs.a(errorWithMsgAndRetryUISpecs4, new ChaloPadding(f8, f7, f7, f8), true, WebSocketProtocol.PAYLOAD_SHORT), 16));
                    }
                }
                return obj;
            case 11:
                ChaloTextStyleHelper chaloTextStyleHelper22 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState23 = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1;
                ImageUIState imageUIState8 = (ImageUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0;
                ResultKt.b(objB14);
                chaloTextStyleHelper10 = chaloTextStyleHelper22;
                imageUIState3 = imageUIState8;
                buttonUIStateFactory = buttonUIStateFactory11;
                white = white2;
                chaloTextUIState7 = chaloTextUIState23;
                stringProvider = stringProvider3;
                chaloTextUIStateB2 = ChaloTextStyleHelper.b(chaloTextStyleHelper10, (String) objB14, black, 0, UITextAlign.Center, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = imageUIState3;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIState7;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = chaloTextUIStateB2;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = buttonUIStateFactory;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4 = chaloTextStyleHelper14;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 12;
                objB8 = stringProvider.b(StringEnum.OKAY_RUNNING_CASE, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                if (objB8 != obj) {
                    imageUIState4 = imageUIState3;
                    chaloTextUIState8 = chaloTextUIStateB2;
                    objB14 = objB8;
                    chaloTextUIState9 = chaloTextUIState7;
                    buttonUIStateFactory6 = buttonUIStateFactory;
                    ButtonUIState buttonUIStateF6 = ButtonUIStateFactory.f(buttonUIStateFactory6, ChaloTextStyleHelper.b(chaloTextStyleHelper14, (String) objB14, white, 0, null, UIFontWeight.SemiBold, null, null, 108), new er0(this, 7), null, false, 0.0f, 60);
                    ErrorWithMsgAndRetryUISpecs errorWithMsgAndRetryUISpecs5 = new ErrorWithMsgAndRetryUISpecs(null, 0.0f, 0.0f, 0.0f, 255);
                    float f9 = ChaloThemeHelper.a().h;
                    float f10 = ChaloThemeHelper.a().i;
                    return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.NewRouteSuggestionSubmitSuccess(new StandardErrorScreenUIState.ErrorWithMsgAndRetry(imageUIState4, chaloTextUIState9, chaloTextUIState8, buttonUIStateF6, null, ErrorWithMsgAndRetryUISpecs.a(errorWithMsgAndRetryUISpecs5, new ChaloPadding(f10, f9, f9, f10), true, WebSocketProtocol.PAYLOAD_SHORT), 16));
                }
                return obj;
            case 12:
                chaloTextStyleHelper14 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4;
                ButtonUIStateFactory buttonUIStateFactory14 = (ButtonUIStateFactory) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3;
                chaloTextUIState8 = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2;
                chaloTextUIState9 = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1;
                imageUIState4 = (ImageUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0;
                ResultKt.b(objB14);
                buttonUIStateFactory6 = buttonUIStateFactory14;
                white = white2;
                ButtonUIState buttonUIStateF7 = ButtonUIStateFactory.f(buttonUIStateFactory6, ChaloTextStyleHelper.b(chaloTextStyleHelper14, (String) objB14, white, 0, null, UIFontWeight.SemiBold, null, null, 108), new er0(this, 7), null, false, 0.0f, 60);
                ErrorWithMsgAndRetryUISpecs errorWithMsgAndRetryUISpecs6 = new ErrorWithMsgAndRetryUISpecs(null, 0.0f, 0.0f, 0.0f, 255);
                float f11 = ChaloThemeHelper.a().h;
                float f12 = ChaloThemeHelper.a().i;
                return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.NewRouteSuggestionSubmitSuccess(new StandardErrorScreenUIState.ErrorWithMsgAndRetry(imageUIState4, chaloTextUIState9, chaloTextUIState8, buttonUIStateF7, null, ErrorWithMsgAndRetryUISpecs.a(errorWithMsgAndRetryUISpecs6, new ChaloPadding(f12, f11, f11, f12), true, WebSocketProtocol.PAYLOAD_SHORT), 16));
            case 13:
                ChaloTextStyleHelper chaloTextStyleHelper23 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1;
                ImageUIState imageUIState9 = (ImageUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0;
                ResultKt.b(objB14);
                chaloTextStyleHelper2 = chaloTextStyleHelper23;
                objB2 = objB14;
                imageUIState2 = imageUIState9;
                buttonUIStateFactory = buttonUIStateFactory11;
                stringProvider = stringProvider3;
                white = white2;
                orangePrimary = orangePrimary3;
                chaloTextUIStateE2 = ChaloTextStyleHelper.e(chaloTextStyleHelper2, (String) objB2, black, UITextAlign.Center, UIFontWeight.Bold, null, 100);
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = imageUIState2;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIStateE2;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = chaloTextStyleHelper14;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 14;
                objB9 = stringProvider.b(StringEnum.TRY_SEARCHING_FOR_A_DIFFERENT_ORIGIN_AND_DESTINATION, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                if (objB9 != obj) {
                    chaloTextStyleHelper11 = chaloTextStyleHelper14;
                    chaloTextUIStateB3 = ChaloTextStyleHelper.b(chaloTextStyleHelper11, (String) objB9, black, 0, UITextAlign.Center, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = imageUIState2;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIStateE2;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = chaloTextUIStateB3;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = buttonUIStateFactory;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4 = chaloTextStyleHelper14;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 15;
                    objB10 = stringProvider.b(StringEnum.OKAY_RUNNING_CASE, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                    if (objB10 != obj) {
                        chaloTextUIState10 = chaloTextUIStateE2;
                        chaloTextUIState11 = chaloTextUIStateB3;
                        chaloTextStyleHelper12 = chaloTextStyleHelper14;
                        buttonUIStateFactory7 = buttonUIStateFactory;
                        buttonUIStateF2 = ButtonUIStateFactory.f(buttonUIStateFactory7, ChaloTextStyleHelper.b(chaloTextStyleHelper12, (String) objB10, white, 0, null, UIFontWeight.SemiBold, null, null, 108), new er0(this, 8), null, false, 0.0f, 60);
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = imageUIState2;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIState10;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = chaloTextUIState11;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = buttonUIStateF2;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4 = buttonUIStateFactory;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$5 = chaloTextStyleHelper14;
                        pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 16;
                        objB11 = stringProvider.b(StringEnum.EXPLORE_AVAILABLE_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                        if (objB11 != obj) {
                            imageUIState5 = imageUIState2;
                            chaloTextUIState12 = chaloTextUIState11;
                            chaloTextUIState13 = chaloTextUIState10;
                            buttonUIState = buttonUIStateF2;
                            buttonUIStateFactory8 = buttonUIStateFactory;
                            ButtonUIState buttonUIStateH3 = ButtonUIStateFactory.h(buttonUIStateFactory8, ChaloTextStyleHelper.b(chaloTextStyleHelper14, (String) objB11, orangePrimary, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new er0(this, 9)), null, false, 28);
                            ErrorWithMsgAndRetryUISpecs errorWithMsgAndRetryUISpecs7 = new ErrorWithMsgAndRetryUISpecs(null, 0.0f, 0.0f, 0.0f, 255);
                            float f13 = ChaloThemeHelper.a().h;
                            float f14 = ChaloThemeHelper.a().i;
                            return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.NoProductFoundBottomSheet(new StandardErrorScreenUIState.ErrorWithMsgAndRetry(imageUIState5, chaloTextUIState13, chaloTextUIState12, buttonUIState, buttonUIStateH3, ErrorWithMsgAndRetryUISpecs.a(errorWithMsgAndRetryUISpecs7, new ChaloPadding(f14, f13, f13, f14), true, WebSocketProtocol.PAYLOAD_SHORT)));
                        }
                    }
                }
                return obj;
            case 14:
                ChaloTextStyleHelper chaloTextStyleHelper24 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState24 = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1;
                ImageUIState imageUIState10 = (ImageUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0;
                ResultKt.b(objB14);
                chaloTextStyleHelper11 = chaloTextStyleHelper24;
                objB9 = objB14;
                imageUIState2 = imageUIState10;
                buttonUIStateFactory = buttonUIStateFactory11;
                white = white2;
                orangePrimary = orangePrimary3;
                chaloTextUIStateE2 = chaloTextUIState24;
                stringProvider = stringProvider3;
                chaloTextUIStateB3 = ChaloTextStyleHelper.b(chaloTextStyleHelper11, (String) objB9, black, 0, UITextAlign.Center, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = imageUIState2;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIStateE2;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = chaloTextUIStateB3;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = buttonUIStateFactory;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4 = chaloTextStyleHelper14;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 15;
                objB10 = stringProvider.b(StringEnum.OKAY_RUNNING_CASE, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                if (objB10 != obj) {
                    chaloTextUIState10 = chaloTextUIStateE2;
                    chaloTextUIState11 = chaloTextUIStateB3;
                    chaloTextStyleHelper12 = chaloTextStyleHelper14;
                    buttonUIStateFactory7 = buttonUIStateFactory;
                    buttonUIStateF2 = ButtonUIStateFactory.f(buttonUIStateFactory7, ChaloTextStyleHelper.b(chaloTextStyleHelper12, (String) objB10, white, 0, null, UIFontWeight.SemiBold, null, null, 108), new er0(this, 8), null, false, 0.0f, 60);
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = imageUIState2;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIState10;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = chaloTextUIState11;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = buttonUIStateF2;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4 = buttonUIStateFactory;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$5 = chaloTextStyleHelper14;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 16;
                    objB11 = stringProvider.b(StringEnum.EXPLORE_AVAILABLE_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                    if (objB11 != obj) {
                        imageUIState5 = imageUIState2;
                        chaloTextUIState12 = chaloTextUIState11;
                        chaloTextUIState13 = chaloTextUIState10;
                        buttonUIState = buttonUIStateF2;
                        buttonUIStateFactory8 = buttonUIStateFactory;
                        ButtonUIState buttonUIStateH4 = ButtonUIStateFactory.h(buttonUIStateFactory8, ChaloTextStyleHelper.b(chaloTextStyleHelper14, (String) objB11, orangePrimary, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new er0(this, 9)), null, false, 28);
                        ErrorWithMsgAndRetryUISpecs errorWithMsgAndRetryUISpecs8 = new ErrorWithMsgAndRetryUISpecs(null, 0.0f, 0.0f, 0.0f, 255);
                        float f15 = ChaloThemeHelper.a().h;
                        float f16 = ChaloThemeHelper.a().i;
                        return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.NoProductFoundBottomSheet(new StandardErrorScreenUIState.ErrorWithMsgAndRetry(imageUIState5, chaloTextUIState13, chaloTextUIState12, buttonUIState, buttonUIStateH4, ErrorWithMsgAndRetryUISpecs.a(errorWithMsgAndRetryUISpecs8, new ChaloPadding(f16, f15, f15, f16), true, WebSocketProtocol.PAYLOAD_SHORT)));
                    }
                }
                return obj;
            case 15:
                ChaloTextStyleHelper chaloTextStyleHelper25 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4;
                ButtonUIStateFactory buttonUIStateFactory15 = (ButtonUIStateFactory) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3;
                chaloTextUIState11 = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2;
                chaloTextUIState10 = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1;
                ImageUIState imageUIState11 = (ImageUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0;
                ResultKt.b(objB14);
                chaloTextStyleHelper12 = chaloTextStyleHelper25;
                imageUIState2 = imageUIState11;
                buttonUIStateFactory7 = buttonUIStateFactory15;
                stringProvider = stringProvider3;
                buttonUIStateFactory = buttonUIStateFactory11;
                white = white2;
                objB10 = objB14;
                orangePrimary = orangePrimary3;
                buttonUIStateF2 = ButtonUIStateFactory.f(buttonUIStateFactory7, ChaloTextStyleHelper.b(chaloTextStyleHelper12, (String) objB10, white, 0, null, UIFontWeight.SemiBold, null, null, 108), new er0(this, 8), null, false, 0.0f, 60);
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = imageUIState2;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIState10;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = chaloTextUIState11;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = buttonUIStateF2;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4 = buttonUIStateFactory;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$5 = chaloTextStyleHelper14;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 16;
                objB11 = stringProvider.b(StringEnum.EXPLORE_AVAILABLE_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                if (objB11 != obj) {
                    imageUIState5 = imageUIState2;
                    chaloTextUIState12 = chaloTextUIState11;
                    chaloTextUIState13 = chaloTextUIState10;
                    buttonUIState = buttonUIStateF2;
                    buttonUIStateFactory8 = buttonUIStateFactory;
                    ButtonUIState buttonUIStateH5 = ButtonUIStateFactory.h(buttonUIStateFactory8, ChaloTextStyleHelper.b(chaloTextStyleHelper14, (String) objB11, orangePrimary, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new er0(this, 9)), null, false, 28);
                    ErrorWithMsgAndRetryUISpecs errorWithMsgAndRetryUISpecs9 = new ErrorWithMsgAndRetryUISpecs(null, 0.0f, 0.0f, 0.0f, 255);
                    float f17 = ChaloThemeHelper.a().h;
                    float f18 = ChaloThemeHelper.a().i;
                    return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.NoProductFoundBottomSheet(new StandardErrorScreenUIState.ErrorWithMsgAndRetry(imageUIState5, chaloTextUIState13, chaloTextUIState12, buttonUIState, buttonUIStateH5, ErrorWithMsgAndRetryUISpecs.a(errorWithMsgAndRetryUISpecs9, new ChaloPadding(f18, f17, f17, f18), true, WebSocketProtocol.PAYLOAD_SHORT)));
                }
                return obj;
            case 16:
                chaloTextStyleHelper14 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$5;
                ButtonUIStateFactory buttonUIStateFactory16 = (ButtonUIStateFactory) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4;
                buttonUIState = (ButtonUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3;
                TextUIState.ChaloTextUIState chaloTextUIState25 = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState26 = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1;
                ImageUIState imageUIState12 = (ImageUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0;
                ResultKt.b(objB14);
                imageUIState5 = imageUIState12;
                chaloTextUIState12 = chaloTextUIState25;
                chaloTextUIState13 = chaloTextUIState26;
                buttonUIStateFactory8 = buttonUIStateFactory16;
                objB11 = objB14;
                orangePrimary = orangePrimary3;
                ButtonUIState buttonUIStateH6 = ButtonUIStateFactory.h(buttonUIStateFactory8, ChaloTextStyleHelper.b(chaloTextStyleHelper14, (String) objB11, orangePrimary, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new er0(this, 9)), null, false, 28);
                ErrorWithMsgAndRetryUISpecs errorWithMsgAndRetryUISpecs10 = new ErrorWithMsgAndRetryUISpecs(null, 0.0f, 0.0f, 0.0f, 255);
                float f19 = ChaloThemeHelper.a().h;
                float f110 = ChaloThemeHelper.a().i;
                return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.NoProductFoundBottomSheet(new StandardErrorScreenUIState.ErrorWithMsgAndRetry(imageUIState5, chaloTextUIState13, chaloTextUIState12, buttonUIState, buttonUIStateH6, ErrorWithMsgAndRetryUISpecs.a(errorWithMsgAndRetryUISpecs10, new ChaloPadding(f110, f19, f19, f110), true, WebSocketProtocol.PAYLOAD_SHORT)));
            case 17:
                ChaloTextStyleHelper chaloTextStyleHelper26 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1;
                ImageUIState imageUIState13 = (ImageUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0;
                ResultKt.b(objB14);
                chaloTextStyleHelper = chaloTextStyleHelper26;
                objB = objB14;
                imageUIState = imageUIState13;
                buttonUIStateFactory = buttonUIStateFactory11;
                stringProvider = stringProvider3;
                white = white2;
                orangePrimary = orangePrimary3;
                chaloTextUIStateE3 = ChaloTextStyleHelper.e(chaloTextStyleHelper, (String) objB, black, UITextAlign.Center, UIFontWeight.Bold, null, 100);
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = imageUIState;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIStateE3;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = buttonUIStateFactory;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = chaloTextStyleHelper14;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 18;
                objB12 = stringProvider.b(StringEnum.OKAY_RUNNING_CASE, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                if (objB12 != obj) {
                    chaloTextStyleHelper13 = chaloTextStyleHelper14;
                    buttonUIStateFactory9 = buttonUIStateFactory;
                    buttonUIStateF3 = ButtonUIStateFactory.f(buttonUIStateFactory9, ChaloTextStyleHelper.b(chaloTextStyleHelper13, (String) objB12, white, 0, null, UIFontWeight.SemiBold, null, null, 108), new er0(this, 10), null, false, 0.0f, 60);
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = imageUIState;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIStateE3;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = buttonUIStateF3;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = buttonUIStateFactory;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4 = chaloTextStyleHelper14;
                    pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 19;
                    objB13 = stringProvider.b(StringEnum.EXPLORE_AVAILABLE_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                    if (objB13 != obj) {
                        imageUIState6 = imageUIState;
                        chaloTextUIState14 = chaloTextUIStateE3;
                        buttonUIState2 = buttonUIStateF3;
                        buttonUIStateFactory10 = buttonUIStateFactory;
                        ButtonUIState buttonUIStateH7 = ButtonUIStateFactory.h(buttonUIStateFactory10, ChaloTextStyleHelper.b(chaloTextStyleHelper14, (String) objB13, orangePrimary, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new er0(this, 2)), null, false, 28);
                        ErrorWithMsgAndRetryUISpecs errorWithMsgAndRetryUISpecs11 = new ErrorWithMsgAndRetryUISpecs(null, 0.0f, 0.0f, 0.0f, 255);
                        float f20 = ChaloThemeHelper.a().h;
                        float f21 = ChaloThemeHelper.a().i;
                        return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.NoOriginDestinationPairsAvailable(new StandardErrorScreenUIState.ErrorWithMsgAndRetry(imageUIState6, chaloTextUIState14, null, buttonUIState2, buttonUIStateH7, ErrorWithMsgAndRetryUISpecs.a(errorWithMsgAndRetryUISpecs11, new ChaloPadding(f21, f20, f20, f21), true, WebSocketProtocol.PAYLOAD_SHORT), 4));
                    }
                }
                return obj;
            case 18:
                ChaloTextStyleHelper chaloTextStyleHelper27 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3;
                ButtonUIStateFactory buttonUIStateFactory17 = (ButtonUIStateFactory) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2;
                chaloTextUIStateE3 = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1;
                ImageUIState imageUIState14 = (ImageUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0;
                ResultKt.b(objB14);
                buttonUIStateFactory = buttonUIStateFactory11;
                white = white2;
                buttonUIStateFactory9 = buttonUIStateFactory17;
                stringProvider = stringProvider3;
                chaloTextStyleHelper13 = chaloTextStyleHelper27;
                imageUIState = imageUIState14;
                objB12 = objB14;
                orangePrimary = orangePrimary3;
                buttonUIStateF3 = ButtonUIStateFactory.f(buttonUIStateFactory9, ChaloTextStyleHelper.b(chaloTextStyleHelper13, (String) objB12, white, 0, null, UIFontWeight.SemiBold, null, null, 108), new er0(this, 10), null, false, 0.0f, 60);
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0 = imageUIState;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1 = chaloTextUIStateE3;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2 = buttonUIStateF3;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3 = buttonUIStateFactory;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4 = chaloTextStyleHelper14;
                pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.label = 19;
                objB13 = stringProvider.b(StringEnum.EXPLORE_AVAILABLE_ROUTES, new Object[0], pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1);
                if (objB13 != obj) {
                    imageUIState6 = imageUIState;
                    chaloTextUIState14 = chaloTextUIStateE3;
                    buttonUIState2 = buttonUIStateF3;
                    buttonUIStateFactory10 = buttonUIStateFactory;
                    ButtonUIState buttonUIStateH8 = ButtonUIStateFactory.h(buttonUIStateFactory10, ChaloTextStyleHelper.b(chaloTextStyleHelper14, (String) objB13, orangePrimary, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new er0(this, 2)), null, false, 28);
                    ErrorWithMsgAndRetryUISpecs errorWithMsgAndRetryUISpecs12 = new ErrorWithMsgAndRetryUISpecs(null, 0.0f, 0.0f, 0.0f, 255);
                    float f22 = ChaloThemeHelper.a().h;
                    float f23 = ChaloThemeHelper.a().i;
                    return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.NoOriginDestinationPairsAvailable(new StandardErrorScreenUIState.ErrorWithMsgAndRetry(imageUIState6, chaloTextUIState14, null, buttonUIState2, buttonUIStateH8, ErrorWithMsgAndRetryUISpecs.a(errorWithMsgAndRetryUISpecs12, new ChaloPadding(f23, f22, f22, f23), true, WebSocketProtocol.PAYLOAD_SHORT), 4));
                }
                return obj;
            case 19:
                chaloTextStyleHelper14 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$4;
                ButtonUIStateFactory buttonUIStateFactory18 = (ButtonUIStateFactory) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$3;
                buttonUIState2 = (ButtonUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$2;
                TextUIState.ChaloTextUIState chaloTextUIState27 = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$1;
                ImageUIState imageUIState15 = (ImageUIState) pbPassPurchaseLandingScreenComponent$createBottomSheetUiState$1.L$0;
                ResultKt.b(objB14);
                imageUIState6 = imageUIState15;
                chaloTextUIState14 = chaloTextUIState27;
                buttonUIStateFactory10 = buttonUIStateFactory18;
                objB13 = objB14;
                orangePrimary = orangePrimary3;
                ButtonUIState buttonUIStateH9 = ButtonUIStateFactory.h(buttonUIStateFactory10, ChaloTextStyleHelper.b(chaloTextStyleHelper14, (String) objB13, orangePrimary, 0, null, UIFontWeight.SemiBold, null, null, 108), UiEventHandler.Companion.a(new er0(this, 2)), null, false, 28);
                ErrorWithMsgAndRetryUISpecs errorWithMsgAndRetryUISpecs13 = new ErrorWithMsgAndRetryUISpecs(null, 0.0f, 0.0f, 0.0f, 255);
                float f24 = ChaloThemeHelper.a().h;
                float f25 = ChaloThemeHelper.a().i;
                return new PBPassPurchaseLandingScreenBottomSheetTypeUIState.NoOriginDestinationPairsAvailable(new StandardErrorScreenUIState.ErrorWithMsgAndRetry(imageUIState6, chaloTextUIState14, null, buttonUIState2, buttonUIStateH9, ErrorWithMsgAndRetryUISpecs.a(errorWithMsgAndRetryUISpecs13, new ChaloPadding(f25, f24, f24, f25), true, WebSocketProtocol.PAYLOAD_SHORT), 4));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0170  */
    /* JADX WARN: Code duplicated, block: B:34:0x0186  */
    /* JADX WARN: Code duplicated, block: B:36:0x01ae A[DONT_INVERT, PHI: r1 r4 r5 r7 r15 r21
      0x01ae: PHI (r1v7 java.lang.String) = (r1v5 java.lang.String), (r1v11 java.lang.String) binds: [B:30:0x016e, B:35:0x018b] A[DONT_GENERATE, DONT_INLINE]
      0x01ae: PHI (r4v5 int A[IMMUTABLE_TYPE]) = (r4v3 int), (r4v6 int) binds: [B:30:0x016e, B:35:0x018b] A[DONT_GENERATE, DONT_INLINE]
      0x01ae: PHI (r5v7 java.util.List) = (r5v3 java.util.List), (r5v12 java.util.List) binds: [B:30:0x016e, B:35:0x018b] A[DONT_GENERATE, DONT_INLINE]
      0x01ae: PHI (r7v6 java.lang.String) = (r7v1 java.lang.String), (r7v12 java.lang.String) binds: [B:30:0x016e, B:35:0x018b] A[DONT_GENERATE, DONT_INLINE]
      0x01ae: PHI (r15v4 app.chalo.uistate.base.ChaloColorToken$ShadyGray) = (r15v1 app.chalo.uistate.base.ChaloColorToken$ShadyGray), (r15v5 app.chalo.uistate.base.ChaloColorToken$ShadyGray) binds: [B:30:0x016e, B:35:0x018b] A[DONT_GENERATE, DONT_INLINE]
      0x01ae: PHI (r21v3 app.chalo.uistate.text.TextUIState$ChaloTextUIState) = 
      (r21v1 app.chalo.uistate.text.TextUIState$ChaloTextUIState)
      (r21v4 app.chalo.uistate.text.TextUIState$ChaloTextUIState)
     binds: [B:30:0x016e, B:35:0x018b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:48:0x0227  */
    /* JADX WARN: Code duplicated, block: B:50:0x022d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0261  */
    /* JADX WARN: Code duplicated, block: B:60:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x0306  */
    /* JADX WARN: Code duplicated, block: B:68:0x0352  */
    /* JADX WARN: Code duplicated, block: B:71:0x0371  */
    /* JADX WARN: Code duplicated, block: B:79:0x0384  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v9, types: [app.chalo.uistate.text.UITextAlign, app.chalo.uistate.text.UITextOverflow] */
    /* JADX WARN: Type inference failed for: r22v4 */
    public final Object I0(String str, String str2, ContinuationImpl continuationImpl, boolean z) {
        PbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1 pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1;
        TextUIState.ChaloTextUIState chaloTextUIState;
        String str3;
        String str4;
        StyledTextDataUIState[] styledTextDataUIStateArr;
        StyledTextDataUIState[] styledTextDataUIStateArr2;
        int i;
        String str5;
        int i2;
        ChaloColorToken.ShadyGray shadyGray;
        List listB0;
        Object objB;
        String str6;
        String str7;
        List list;
        String str8;
        TextUIState.ChaloTextUIState chaloTextUIStateA;
        TextUIState.StyledTextUIState styledTextUIState;
        ?? r12;
        Object objB2;
        String str9;
        TextUIState.ChaloTextUIState chaloTextUIState2;
        String str10;
        ChaloTextStyleHelper chaloTextStyleHelper;
        ?? r13;
        String str11;
        String str12;
        ChaloColorToken.ShadyGray shadyGray2;
        StringProvider stringProvider;
        SearchItemUIState searchItemUIState;
        String str13;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        TextUIState.ChaloTextUIState chaloTextUIStateA2;
        Object objB3;
        SearchItemUIState searchItemUIState2;
        StringProvider stringProvider2;
        TextUIState.StyledTextUIState styledTextUIState2;
        Object objB4;
        String str14;
        SearchItemUIState searchItemUIState3;
        TextUIState.ChaloTextUIState chaloTextUIState3;
        TextUIState.StyledTextUIState styledTextUIState3;
        String str15;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        String str16;
        String str17;
        ChaloTextStyleHelper chaloTextStyleHelper4;
        SearchItemUIState searchItemUIState4;
        IconType iconType;
        ImageUISize imageUISize;
        StringProvider stringProvider3;
        Object objB5;
        CoroutineSingletons coroutineSingletons;
        String str18;
        String str19;
        ImageUISize imageUISize2;
        SearchItemUIState searchItemUIState5;
        SearchFieldComponentUIState searchFieldComponentUIState;
        ButtonUIStateFactory buttonUIStateFactory;
        ChaloTextStyleHelper chaloTextStyleHelper5;
        ButtonUIStateFactory buttonUIStateFactory2;
        String str20;
        String str21;
        boolean z2;
        if (continuationImpl instanceof PbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1) {
            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1 = (PbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1) continuationImpl;
            int i3 = pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = i3 - Integer.MIN_VALUE;
            } else {
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1 = new PbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1(this, continuationImpl);
            }
        } else {
            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1 = new PbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1(this, continuationImpl);
        }
        Object objB6 = pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label;
        ChaloColorToken.Black_40 black_40 = ChaloColorToken.Black_40.f9764a;
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        ChaloColorToken.ShadyGray shadyGray3 = ChaloColorToken.ShadyGray.f9851a;
        boolean z3 = true;
        ChaloTextStyleHelper chaloTextStyleHelper6 = ChaloTextStyleHelper.f10078a;
        StringProvider stringProvider4 = this.l;
        boolean z4 = false;
        switch (i4) {
            case 0:
                chaloTextUIState = null;
                ResultKt.b(objB6);
                if (!z) {
                    return null;
                }
                StyledTextDataUIState[] styledTextDataUIStateArr3 = new StyledTextDataUIState[1];
                str3 = str;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str3;
                str4 = str2;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str4;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = styledTextDataUIStateArr3;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = styledTextDataUIStateArr3;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.I$0 = 0;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 1;
                objB6 = stringProvider4.b(StringEnum.FROM, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                if (objB6 != coroutineSingletons2) {
                    styledTextDataUIStateArr = styledTextDataUIStateArr3;
                    styledTextDataUIStateArr2 = styledTextDataUIStateArr;
                    i = 0;
                    Object obj = objB6;
                    str5 = str4;
                    i2 = 0;
                    shadyGray = shadyGray3;
                    styledTextDataUIStateArr[i] = new StyledTextDataUIState((String) obj, shadyGray3, null, UITextStyle.BodySmall, null, null, null, 1012);
                    listB0 = CollectionsKt.b0(styledTextDataUIStateArr2);
                    if (((PbPassPurchaseLandingScreenDataState) this.f.getValue()).j) {
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str3;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str5;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = listB0;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = listB0;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 2;
                        objB = stringProvider4.b(StringEnum.CURRENT_LOCATION_SMALL, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                        if (objB != coroutineSingletons2) {
                            str6 = str5;
                            objB6 = objB;
                            str7 = str3;
                            list = listB0;
                            listB0.add(new StyledTextDataUIState(n21.f(objB6, " (", ")"), ChaloColorToken.Orange2.f9830a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, null, 1008));
                            listB0 = list;
                            str5 = str6;
                            str3 = str7;
                            if (str3 != null || str3.length() == 0) {
                                str8 = str3;
                                chaloTextUIStateA = chaloTextUIState;
                            } else {
                                str8 = str3;
                                chaloTextUIStateA = ChaloTextStyleHelper.a(chaloTextStyleHelper6, str8, black_87, null, UITextOverflow.Ellipsis, 56);
                            }
                            r12 = chaloTextUIState;
                            styledTextUIState = new TextUIState.StyledTextUIState(listB0, r12, r12, 30);
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str8;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str5;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = chaloTextUIStateA;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = styledTextUIState;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = chaloTextStyleHelper6;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 3;
                            objB2 = stringProvider4.b(StringEnum.WHERE_FROM, new Object[i2], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                            if (objB2 != coroutineSingletons2) {
                                str9 = str5;
                                objB6 = objB2;
                                String str22 = str8;
                                chaloTextUIState2 = chaloTextUIStateA;
                                str10 = str22;
                                chaloTextStyleHelper = chaloTextStyleHelper6;
                                r13 = r12;
                                str11 = str9;
                                str12 = str10;
                                shadyGray2 = shadyGray;
                                stringProvider = stringProvider4;
                                searchItemUIState = new SearchItemUIState(chaloTextUIState2, styledTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objB6, black_40, 1, null, null, null, null, 120), new er0(this, 11));
                                if (str11 != null || str11.length() == 0) {
                                    str13 = str11;
                                    chaloTextStyleHelper2 = chaloTextStyleHelper6;
                                    chaloTextUIStateA2 = null;
                                } else {
                                    str13 = str11;
                                    chaloTextUIStateA2 = ChaloTextStyleHelper.a(chaloTextStyleHelper6, str13, black_87, null, UITextOverflow.Ellipsis, 56);
                                    chaloTextStyleHelper2 = chaloTextStyleHelper6;
                                }
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str12;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str13;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = searchItemUIState;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = chaloTextUIStateA2;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = null;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 4;
                                objB3 = stringProvider.b(StringEnum.TO, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                                if (objB3 != coroutineSingletons2) {
                                    searchItemUIState2 = searchItemUIState;
                                    objB6 = objB3;
                                    stringProvider2 = stringProvider;
                                    styledTextUIState2 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState((String) objB6, shadyGray2, null, UITextStyle.BodySmall, null, null, null, 1012)), null, null, 30);
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str12;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str13;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = searchItemUIState2;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = chaloTextUIStateA2;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = styledTextUIState2;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = chaloTextStyleHelper2;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 5;
                                    objB4 = stringProvider2.b(StringEnum.WHERE_TO, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                                    if (objB4 != coroutineSingletons2) {
                                        TextUIState.ChaloTextUIState chaloTextUIState4 = chaloTextUIStateA2;
                                        str14 = str12;
                                        searchItemUIState3 = searchItemUIState2;
                                        chaloTextUIState3 = chaloTextUIState4;
                                        styledTextUIState3 = styledTextUIState2;
                                        str15 = str13;
                                        chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                        str16 = str15;
                                        str17 = str14;
                                        chaloTextStyleHelper4 = chaloTextStyleHelper2;
                                        searchItemUIState4 = new SearchItemUIState(chaloTextUIState3, styledTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objB4, black_40, 1, null, null, null, null, 120), new er0(this, 12));
                                        iconType = IconType.PB_SWAP_ICON;
                                        imageUISize = new ImageUISize(ChaloThemeHelper.a().m);
                                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str17;
                                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str16;
                                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = iconType;
                                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = imageUISize;
                                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = searchItemUIState3;
                                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = searchItemUIState4;
                                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 6;
                                        stringProvider3 = stringProvider2;
                                        objB5 = stringProvider3.b(StringEnum.SWAP_STOPS, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                                        coroutineSingletons = coroutineSingletons2;
                                        if (objB5 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        str18 = str16;
                                        str19 = str17;
                                        imageUISize2 = imageUISize;
                                        objB6 = objB5;
                                        searchItemUIState5 = searchItemUIState4;
                                        z3 = true;
                                        searchFieldComponentUIState = new SearchFieldComponentUIState(searchItemUIState3, searchItemUIState5, new ImageUIState(iconType, (String) objB6, (ChaloColorToken) null, imageUISize2, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 13)), AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID), 1);
                                        z4 = false;
                                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str19;
                                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str18;
                                        buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = buttonUIStateFactory;
                                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = searchFieldComponentUIState;
                                        chaloTextStyleHelper5 = chaloTextStyleHelper4;
                                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = chaloTextStyleHelper5;
                                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = null;
                                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 7;
                                        objB6 = stringProvider3.b(StringEnum.BUY_PASS_FROM_THIS_ROUTE, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                                        if (objB6 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        String str23 = str18;
                                        buttonUIStateFactory2 = buttonUIStateFactory;
                                        str20 = str23;
                                        str21 = str19;
                                        TextUIState.ChaloTextUIState chaloTextUIStateB = ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB6, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108);
                                        UIShape.Rectangle rectangle = UIShape.d;
                                        if (str21 != null || str21.length() == 0 || str20 == null || str20.length() == 0) {
                                            z2 = z4;
                                        } else {
                                            z2 = z3;
                                        }
                                        return new SearchFieldWithSwapButtonCardUIState(searchFieldComponentUIState, ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIStateB, new m(24, str21, str20, this), rectangle, z2, 0.0f, 36));
                                    }
                                }
                            }
                        }
                    } else {
                        if (str3 != null) {
                            str8 = str3;
                            chaloTextUIStateA = chaloTextUIState;
                        } else {
                            str8 = str3;
                            chaloTextUIStateA = chaloTextUIState;
                        }
                        r12 = chaloTextUIState;
                        styledTextUIState = new TextUIState.StyledTextUIState(listB0, r12, r12, 30);
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str8;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str5;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = chaloTextUIStateA;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = styledTextUIState;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = chaloTextStyleHelper6;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 3;
                        objB2 = stringProvider4.b(StringEnum.WHERE_FROM, new Object[i2], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                        if (objB2 != coroutineSingletons2) {
                            str9 = str5;
                            objB6 = objB2;
                            String str24 = str8;
                            chaloTextUIState2 = chaloTextUIStateA;
                            str10 = str24;
                            chaloTextStyleHelper = chaloTextStyleHelper6;
                            r13 = r12;
                            str11 = str9;
                            str12 = str10;
                            shadyGray2 = shadyGray;
                            stringProvider = stringProvider4;
                            searchItemUIState = new SearchItemUIState(chaloTextUIState2, styledTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objB6, black_40, 1, null, null, null, null, 120), new er0(this, 11));
                            if (str11 != null) {
                                str13 = str11;
                                chaloTextStyleHelper2 = chaloTextStyleHelper6;
                                chaloTextUIStateA2 = null;
                            } else {
                                str13 = str11;
                                chaloTextStyleHelper2 = chaloTextStyleHelper6;
                                chaloTextUIStateA2 = null;
                            }
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str12;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str13;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = searchItemUIState;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = chaloTextUIStateA2;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = null;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 4;
                            objB3 = stringProvider.b(StringEnum.TO, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                            if (objB3 != coroutineSingletons2) {
                                searchItemUIState2 = searchItemUIState;
                                objB6 = objB3;
                                stringProvider2 = stringProvider;
                                styledTextUIState2 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState((String) objB6, shadyGray2, null, UITextStyle.BodySmall, null, null, null, 1012)), null, null, 30);
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str12;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str13;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = searchItemUIState2;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = chaloTextUIStateA2;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = styledTextUIState2;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = chaloTextStyleHelper2;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 5;
                                objB4 = stringProvider2.b(StringEnum.WHERE_TO, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                                if (objB4 != coroutineSingletons2) {
                                    TextUIState.ChaloTextUIState chaloTextUIState5 = chaloTextUIStateA2;
                                    str14 = str12;
                                    searchItemUIState3 = searchItemUIState2;
                                    chaloTextUIState3 = chaloTextUIState5;
                                    styledTextUIState3 = styledTextUIState2;
                                    str15 = str13;
                                    chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                    str16 = str15;
                                    str17 = str14;
                                    chaloTextStyleHelper4 = chaloTextStyleHelper2;
                                    searchItemUIState4 = new SearchItemUIState(chaloTextUIState3, styledTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objB4, black_40, 1, null, null, null, null, 120), new er0(this, 12));
                                    iconType = IconType.PB_SWAP_ICON;
                                    imageUISize = new ImageUISize(ChaloThemeHelper.a().m);
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str17;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str16;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = iconType;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = imageUISize;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = searchItemUIState3;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = searchItemUIState4;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 6;
                                    stringProvider3 = stringProvider2;
                                    objB5 = stringProvider3.b(StringEnum.SWAP_STOPS, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                                    coroutineSingletons = coroutineSingletons2;
                                    if (objB5 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    str18 = str16;
                                    str19 = str17;
                                    imageUISize2 = imageUISize;
                                    objB6 = objB5;
                                    searchItemUIState5 = searchItemUIState4;
                                    z3 = true;
                                    searchFieldComponentUIState = new SearchFieldComponentUIState(searchItemUIState3, searchItemUIState5, new ImageUIState(iconType, (String) objB6, (ChaloColorToken) null, imageUISize2, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 13)), AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID), 1);
                                    z4 = false;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str19;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str18;
                                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = buttonUIStateFactory;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = searchFieldComponentUIState;
                                    chaloTextStyleHelper5 = chaloTextStyleHelper4;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = chaloTextStyleHelper5;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = null;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 7;
                                    objB6 = stringProvider3.b(StringEnum.BUY_PASS_FROM_THIS_ROUTE, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                                    if (objB6 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    String str25 = str18;
                                    buttonUIStateFactory2 = buttonUIStateFactory;
                                    str20 = str25;
                                    str21 = str19;
                                    TextUIState.ChaloTextUIState chaloTextUIStateB2 = ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB6, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108);
                                    UIShape.Rectangle rectangle2 = UIShape.d;
                                    if (str21 != null) {
                                        z2 = z4;
                                    } else {
                                        z2 = z4;
                                    }
                                    return new SearchFieldWithSwapButtonCardUIState(searchFieldComponentUIState, ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIStateB2, new m(24, str21, str20, this), rectangle2, z2, 0.0f, 36));
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons2;
            case 1:
                chaloTextUIState = null;
                int i5 = pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.I$0;
                StyledTextDataUIState[] styledTextDataUIStateArr4 = (StyledTextDataUIState[]) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3;
                StyledTextDataUIState[] styledTextDataUIStateArr5 = (StyledTextDataUIState[]) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2;
                str4 = (String) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1;
                String str26 = (String) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0;
                ResultKt.b(objB6);
                styledTextDataUIStateArr = styledTextDataUIStateArr4;
                styledTextDataUIStateArr2 = styledTextDataUIStateArr5;
                str3 = str26;
                i = i5;
                Object obj2 = objB6;
                str5 = str4;
                i2 = 0;
                shadyGray = shadyGray3;
                styledTextDataUIStateArr[i] = new StyledTextDataUIState((String) obj2, shadyGray3, null, UITextStyle.BodySmall, null, null, null, 1012);
                listB0 = CollectionsKt.b0(styledTextDataUIStateArr2);
                if (((PbPassPurchaseLandingScreenDataState) this.f.getValue()).j) {
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str3;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str5;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = listB0;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = listB0;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 2;
                    objB = stringProvider4.b(StringEnum.CURRENT_LOCATION_SMALL, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                    if (objB != coroutineSingletons2) {
                        str6 = str5;
                        objB6 = objB;
                        str7 = str3;
                        list = listB0;
                        listB0.add(new StyledTextDataUIState(n21.f(objB6, " (", ")"), ChaloColorToken.Orange2.f9830a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, null, 1008));
                        listB0 = list;
                        str5 = str6;
                        str3 = str7;
                        if (str3 != null) {
                            str8 = str3;
                            chaloTextUIStateA = chaloTextUIState;
                        } else {
                            str8 = str3;
                            chaloTextUIStateA = chaloTextUIState;
                        }
                        r12 = chaloTextUIState;
                        styledTextUIState = new TextUIState.StyledTextUIState(listB0, r12, r12, 30);
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str8;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str5;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = chaloTextUIStateA;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = styledTextUIState;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = chaloTextStyleHelper6;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 3;
                        objB2 = stringProvider4.b(StringEnum.WHERE_FROM, new Object[i2], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                        if (objB2 != coroutineSingletons2) {
                            str9 = str5;
                            objB6 = objB2;
                            String str27 = str8;
                            chaloTextUIState2 = chaloTextUIStateA;
                            str10 = str27;
                            chaloTextStyleHelper = chaloTextStyleHelper6;
                            r13 = r12;
                            str11 = str9;
                            str12 = str10;
                            shadyGray2 = shadyGray;
                            stringProvider = stringProvider4;
                            searchItemUIState = new SearchItemUIState(chaloTextUIState2, styledTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objB6, black_40, 1, null, null, null, null, 120), new er0(this, 11));
                            if (str11 != null) {
                                str13 = str11;
                                chaloTextStyleHelper2 = chaloTextStyleHelper6;
                                chaloTextUIStateA2 = null;
                            } else {
                                str13 = str11;
                                chaloTextStyleHelper2 = chaloTextStyleHelper6;
                                chaloTextUIStateA2 = null;
                            }
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str12;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str13;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = searchItemUIState;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = chaloTextUIStateA2;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = null;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 4;
                            objB3 = stringProvider.b(StringEnum.TO, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                            if (objB3 != coroutineSingletons2) {
                                searchItemUIState2 = searchItemUIState;
                                objB6 = objB3;
                                stringProvider2 = stringProvider;
                                styledTextUIState2 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState((String) objB6, shadyGray2, null, UITextStyle.BodySmall, null, null, null, 1012)), null, null, 30);
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str12;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str13;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = searchItemUIState2;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = chaloTextUIStateA2;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = styledTextUIState2;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = chaloTextStyleHelper2;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 5;
                                objB4 = stringProvider2.b(StringEnum.WHERE_TO, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                                if (objB4 != coroutineSingletons2) {
                                    TextUIState.ChaloTextUIState chaloTextUIState6 = chaloTextUIStateA2;
                                    str14 = str12;
                                    searchItemUIState3 = searchItemUIState2;
                                    chaloTextUIState3 = chaloTextUIState6;
                                    styledTextUIState3 = styledTextUIState2;
                                    str15 = str13;
                                    chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                    str16 = str15;
                                    str17 = str14;
                                    chaloTextStyleHelper4 = chaloTextStyleHelper2;
                                    searchItemUIState4 = new SearchItemUIState(chaloTextUIState3, styledTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objB4, black_40, 1, null, null, null, null, 120), new er0(this, 12));
                                    iconType = IconType.PB_SWAP_ICON;
                                    imageUISize = new ImageUISize(ChaloThemeHelper.a().m);
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str17;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str16;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = iconType;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = imageUISize;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = searchItemUIState3;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = searchItemUIState4;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 6;
                                    stringProvider3 = stringProvider2;
                                    objB5 = stringProvider3.b(StringEnum.SWAP_STOPS, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                                    coroutineSingletons = coroutineSingletons2;
                                    if (objB5 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    str18 = str16;
                                    str19 = str17;
                                    imageUISize2 = imageUISize;
                                    objB6 = objB5;
                                    searchItemUIState5 = searchItemUIState4;
                                    z3 = true;
                                    searchFieldComponentUIState = new SearchFieldComponentUIState(searchItemUIState3, searchItemUIState5, new ImageUIState(iconType, (String) objB6, (ChaloColorToken) null, imageUISize2, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 13)), AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID), 1);
                                    z4 = false;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str19;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str18;
                                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = buttonUIStateFactory;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = searchFieldComponentUIState;
                                    chaloTextStyleHelper5 = chaloTextStyleHelper4;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = chaloTextStyleHelper5;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = null;
                                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 7;
                                    objB6 = stringProvider3.b(StringEnum.BUY_PASS_FROM_THIS_ROUTE, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                                    if (objB6 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    String str28 = str18;
                                    buttonUIStateFactory2 = buttonUIStateFactory;
                                    str20 = str28;
                                    str21 = str19;
                                    TextUIState.ChaloTextUIState chaloTextUIStateB3 = ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB6, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108);
                                    UIShape.Rectangle rectangle3 = UIShape.d;
                                    if (str21 != null) {
                                        z2 = z4;
                                    } else {
                                        z2 = z4;
                                    }
                                    return new SearchFieldWithSwapButtonCardUIState(searchFieldComponentUIState, ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIStateB3, new m(24, str21, str20, this), rectangle3, z2, 0.0f, 36));
                                }
                            }
                        }
                    }
                } else {
                    if (str3 != null) {
                        str8 = str3;
                        chaloTextUIStateA = chaloTextUIState;
                    } else {
                        str8 = str3;
                        chaloTextUIStateA = chaloTextUIState;
                    }
                    r12 = chaloTextUIState;
                    styledTextUIState = new TextUIState.StyledTextUIState(listB0, r12, r12, 30);
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str8;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str5;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = chaloTextUIStateA;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = styledTextUIState;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = chaloTextStyleHelper6;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 3;
                    objB2 = stringProvider4.b(StringEnum.WHERE_FROM, new Object[i2], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                    if (objB2 != coroutineSingletons2) {
                        str9 = str5;
                        objB6 = objB2;
                        String str29 = str8;
                        chaloTextUIState2 = chaloTextUIStateA;
                        str10 = str29;
                        chaloTextStyleHelper = chaloTextStyleHelper6;
                        r13 = r12;
                        str11 = str9;
                        str12 = str10;
                        shadyGray2 = shadyGray;
                        stringProvider = stringProvider4;
                        searchItemUIState = new SearchItemUIState(chaloTextUIState2, styledTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objB6, black_40, 1, null, null, null, null, 120), new er0(this, 11));
                        if (str11 != null) {
                            str13 = str11;
                            chaloTextStyleHelper2 = chaloTextStyleHelper6;
                            chaloTextUIStateA2 = null;
                        } else {
                            str13 = str11;
                            chaloTextStyleHelper2 = chaloTextStyleHelper6;
                            chaloTextUIStateA2 = null;
                        }
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str12;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str13;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = searchItemUIState;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = chaloTextUIStateA2;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = null;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 4;
                        objB3 = stringProvider.b(StringEnum.TO, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                        if (objB3 != coroutineSingletons2) {
                            searchItemUIState2 = searchItemUIState;
                            objB6 = objB3;
                            stringProvider2 = stringProvider;
                            styledTextUIState2 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState((String) objB6, shadyGray2, null, UITextStyle.BodySmall, null, null, null, 1012)), null, null, 30);
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str12;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str13;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = searchItemUIState2;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = chaloTextUIStateA2;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = styledTextUIState2;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = chaloTextStyleHelper2;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 5;
                            objB4 = stringProvider2.b(StringEnum.WHERE_TO, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                            if (objB4 != coroutineSingletons2) {
                                TextUIState.ChaloTextUIState chaloTextUIState7 = chaloTextUIStateA2;
                                str14 = str12;
                                searchItemUIState3 = searchItemUIState2;
                                chaloTextUIState3 = chaloTextUIState7;
                                styledTextUIState3 = styledTextUIState2;
                                str15 = str13;
                                chaloTextStyleHelper3 = chaloTextStyleHelper2;
                                str16 = str15;
                                str17 = str14;
                                chaloTextStyleHelper4 = chaloTextStyleHelper2;
                                searchItemUIState4 = new SearchItemUIState(chaloTextUIState3, styledTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objB4, black_40, 1, null, null, null, null, 120), new er0(this, 12));
                                iconType = IconType.PB_SWAP_ICON;
                                imageUISize = new ImageUISize(ChaloThemeHelper.a().m);
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str17;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str16;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = iconType;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = imageUISize;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = searchItemUIState3;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = searchItemUIState4;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 6;
                                stringProvider3 = stringProvider2;
                                objB5 = stringProvider3.b(StringEnum.SWAP_STOPS, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                                coroutineSingletons = coroutineSingletons2;
                                if (objB5 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                str18 = str16;
                                str19 = str17;
                                imageUISize2 = imageUISize;
                                objB6 = objB5;
                                searchItemUIState5 = searchItemUIState4;
                                z3 = true;
                                searchFieldComponentUIState = new SearchFieldComponentUIState(searchItemUIState3, searchItemUIState5, new ImageUIState(iconType, (String) objB6, (ChaloColorToken) null, imageUISize2, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 13)), AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID), 1);
                                z4 = false;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str19;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str18;
                                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = buttonUIStateFactory;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = searchFieldComponentUIState;
                                chaloTextStyleHelper5 = chaloTextStyleHelper4;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = chaloTextStyleHelper5;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = null;
                                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 7;
                                objB6 = stringProvider3.b(StringEnum.BUY_PASS_FROM_THIS_ROUTE, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                                if (objB6 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                String str210 = str18;
                                buttonUIStateFactory2 = buttonUIStateFactory;
                                str20 = str210;
                                str21 = str19;
                                TextUIState.ChaloTextUIState chaloTextUIStateB4 = ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB6, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108);
                                UIShape.Rectangle rectangle4 = UIShape.d;
                                if (str21 != null) {
                                    z2 = z4;
                                } else {
                                    z2 = z4;
                                }
                                return new SearchFieldWithSwapButtonCardUIState(searchFieldComponentUIState, ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIStateB4, new m(24, str21, str20, this), rectangle4, z2, 0.0f, 36));
                            }
                        }
                    }
                }
                return coroutineSingletons2;
            case 2:
                chaloTextUIState = null;
                List list2 = (List) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3;
                List list3 = (List) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2;
                String str30 = (String) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1;
                str7 = (String) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0;
                ResultKt.b(objB6);
                listB0 = list2;
                i2 = 0;
                str6 = str30;
                list = list3;
                shadyGray = shadyGray3;
                listB0.add(new StyledTextDataUIState(n21.f(objB6, " (", ")"), ChaloColorToken.Orange2.f9830a, UIFontWeight.Bold, UITextStyle.BodySmall, null, null, null, 1008));
                listB0 = list;
                str5 = str6;
                str3 = str7;
                if (str3 != null) {
                    str8 = str3;
                    chaloTextUIStateA = chaloTextUIState;
                } else {
                    str8 = str3;
                    chaloTextUIStateA = chaloTextUIState;
                }
                r12 = chaloTextUIState;
                styledTextUIState = new TextUIState.StyledTextUIState(listB0, r12, r12, 30);
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str8;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str5;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = chaloTextUIStateA;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = styledTextUIState;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = chaloTextStyleHelper6;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 3;
                objB2 = stringProvider4.b(StringEnum.WHERE_FROM, new Object[i2], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                if (objB2 != coroutineSingletons2) {
                    str9 = str5;
                    objB6 = objB2;
                    String str211 = str8;
                    chaloTextUIState2 = chaloTextUIStateA;
                    str10 = str211;
                    chaloTextStyleHelper = chaloTextStyleHelper6;
                    r13 = r12;
                    str11 = str9;
                    str12 = str10;
                    shadyGray2 = shadyGray;
                    stringProvider = stringProvider4;
                    searchItemUIState = new SearchItemUIState(chaloTextUIState2, styledTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objB6, black_40, 1, null, null, null, null, 120), new er0(this, 11));
                    if (str11 != null) {
                        str13 = str11;
                        chaloTextStyleHelper2 = chaloTextStyleHelper6;
                        chaloTextUIStateA2 = null;
                    } else {
                        str13 = str11;
                        chaloTextStyleHelper2 = chaloTextStyleHelper6;
                        chaloTextUIStateA2 = null;
                    }
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str12;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str13;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = searchItemUIState;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = chaloTextUIStateA2;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = null;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 4;
                    objB3 = stringProvider.b(StringEnum.TO, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                    if (objB3 != coroutineSingletons2) {
                        searchItemUIState2 = searchItemUIState;
                        objB6 = objB3;
                        stringProvider2 = stringProvider;
                        styledTextUIState2 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState((String) objB6, shadyGray2, null, UITextStyle.BodySmall, null, null, null, 1012)), null, null, 30);
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str12;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str13;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = searchItemUIState2;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = chaloTextUIStateA2;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = styledTextUIState2;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = chaloTextStyleHelper2;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 5;
                        objB4 = stringProvider2.b(StringEnum.WHERE_TO, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                        if (objB4 != coroutineSingletons2) {
                            TextUIState.ChaloTextUIState chaloTextUIState8 = chaloTextUIStateA2;
                            str14 = str12;
                            searchItemUIState3 = searchItemUIState2;
                            chaloTextUIState3 = chaloTextUIState8;
                            styledTextUIState3 = styledTextUIState2;
                            str15 = str13;
                            chaloTextStyleHelper3 = chaloTextStyleHelper2;
                            str16 = str15;
                            str17 = str14;
                            chaloTextStyleHelper4 = chaloTextStyleHelper2;
                            searchItemUIState4 = new SearchItemUIState(chaloTextUIState3, styledTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objB4, black_40, 1, null, null, null, null, 120), new er0(this, 12));
                            iconType = IconType.PB_SWAP_ICON;
                            imageUISize = new ImageUISize(ChaloThemeHelper.a().m);
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str17;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str16;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = iconType;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = imageUISize;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = searchItemUIState3;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = searchItemUIState4;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 6;
                            stringProvider3 = stringProvider2;
                            objB5 = stringProvider3.b(StringEnum.SWAP_STOPS, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                            coroutineSingletons = coroutineSingletons2;
                            if (objB5 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            str18 = str16;
                            str19 = str17;
                            imageUISize2 = imageUISize;
                            objB6 = objB5;
                            searchItemUIState5 = searchItemUIState4;
                            z3 = true;
                            searchFieldComponentUIState = new SearchFieldComponentUIState(searchItemUIState3, searchItemUIState5, new ImageUIState(iconType, (String) objB6, (ChaloColorToken) null, imageUISize2, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 13)), AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID), 1);
                            z4 = false;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str19;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str18;
                            buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = buttonUIStateFactory;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = searchFieldComponentUIState;
                            chaloTextStyleHelper5 = chaloTextStyleHelper4;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = chaloTextStyleHelper5;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = null;
                            pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 7;
                            objB6 = stringProvider3.b(StringEnum.BUY_PASS_FROM_THIS_ROUTE, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                            if (objB6 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            String str212 = str18;
                            buttonUIStateFactory2 = buttonUIStateFactory;
                            str20 = str212;
                            str21 = str19;
                            TextUIState.ChaloTextUIState chaloTextUIStateB5 = ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB6, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108);
                            UIShape.Rectangle rectangle5 = UIShape.d;
                            if (str21 != null) {
                                z2 = z4;
                            } else {
                                z2 = z4;
                            }
                            return new SearchFieldWithSwapButtonCardUIState(searchFieldComponentUIState, ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIStateB5, new m(24, str21, str20, this), rectangle5, z2, 0.0f, 36));
                        }
                    }
                }
                return coroutineSingletons2;
            case 3:
                ChaloTextStyleHelper chaloTextStyleHelper7 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4;
                styledTextUIState = (TextUIState.StyledTextUIState) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3;
                TextUIState.ChaloTextUIState chaloTextUIState9 = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2;
                str9 = (String) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1;
                str10 = (String) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0;
                ResultKt.b(objB6);
                chaloTextStyleHelper = chaloTextStyleHelper7;
                black_87 = black_87;
                r13 = 0;
                chaloTextUIState2 = chaloTextUIState9;
                shadyGray = shadyGray3;
                str11 = str9;
                str12 = str10;
                shadyGray2 = shadyGray;
                stringProvider = stringProvider4;
                searchItemUIState = new SearchItemUIState(chaloTextUIState2, styledTextUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objB6, black_40, 1, null, null, null, null, 120), new er0(this, 11));
                if (str11 != null) {
                    str13 = str11;
                    chaloTextStyleHelper2 = chaloTextStyleHelper6;
                    chaloTextUIStateA2 = null;
                } else {
                    str13 = str11;
                    chaloTextStyleHelper2 = chaloTextStyleHelper6;
                    chaloTextUIStateA2 = null;
                }
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str12;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str13;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = searchItemUIState;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = chaloTextUIStateA2;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = null;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 4;
                objB3 = stringProvider.b(StringEnum.TO, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                if (objB3 != coroutineSingletons2) {
                    searchItemUIState2 = searchItemUIState;
                    objB6 = objB3;
                    stringProvider2 = stringProvider;
                    styledTextUIState2 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState((String) objB6, shadyGray2, null, UITextStyle.BodySmall, null, null, null, 1012)), null, null, 30);
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str12;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str13;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = searchItemUIState2;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = chaloTextUIStateA2;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = styledTextUIState2;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = chaloTextStyleHelper2;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 5;
                    objB4 = stringProvider2.b(StringEnum.WHERE_TO, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                    if (objB4 != coroutineSingletons2) {
                        TextUIState.ChaloTextUIState chaloTextUIState10 = chaloTextUIStateA2;
                        str14 = str12;
                        searchItemUIState3 = searchItemUIState2;
                        chaloTextUIState3 = chaloTextUIState10;
                        styledTextUIState3 = styledTextUIState2;
                        str15 = str13;
                        chaloTextStyleHelper3 = chaloTextStyleHelper2;
                        str16 = str15;
                        str17 = str14;
                        chaloTextStyleHelper4 = chaloTextStyleHelper2;
                        searchItemUIState4 = new SearchItemUIState(chaloTextUIState3, styledTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objB4, black_40, 1, null, null, null, null, 120), new er0(this, 12));
                        iconType = IconType.PB_SWAP_ICON;
                        imageUISize = new ImageUISize(ChaloThemeHelper.a().m);
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str17;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str16;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = iconType;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = imageUISize;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = searchItemUIState3;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = searchItemUIState4;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 6;
                        stringProvider3 = stringProvider2;
                        objB5 = stringProvider3.b(StringEnum.SWAP_STOPS, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                        coroutineSingletons = coroutineSingletons2;
                        if (objB5 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str18 = str16;
                        str19 = str17;
                        imageUISize2 = imageUISize;
                        objB6 = objB5;
                        searchItemUIState5 = searchItemUIState4;
                        z3 = true;
                        searchFieldComponentUIState = new SearchFieldComponentUIState(searchItemUIState3, searchItemUIState5, new ImageUIState(iconType, (String) objB6, (ChaloColorToken) null, imageUISize2, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 13)), AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID), 1);
                        z4 = false;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str19;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str18;
                        buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = buttonUIStateFactory;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = searchFieldComponentUIState;
                        chaloTextStyleHelper5 = chaloTextStyleHelper4;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = chaloTextStyleHelper5;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = null;
                        pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 7;
                        objB6 = stringProvider3.b(StringEnum.BUY_PASS_FROM_THIS_ROUTE, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                        if (objB6 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        String str213 = str18;
                        buttonUIStateFactory2 = buttonUIStateFactory;
                        str20 = str213;
                        str21 = str19;
                        TextUIState.ChaloTextUIState chaloTextUIStateB6 = ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB6, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108);
                        UIShape.Rectangle rectangle6 = UIShape.d;
                        if (str21 != null) {
                            z2 = z4;
                        } else {
                            z2 = z4;
                        }
                        return new SearchFieldWithSwapButtonCardUIState(searchFieldComponentUIState, ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIStateB6, new m(24, str21, str20, this), rectangle6, z2, 0.0f, 36));
                    }
                }
                return coroutineSingletons2;
            case 4:
                TextUIState.ChaloTextUIState chaloTextUIState11 = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3;
                searchItemUIState2 = (SearchItemUIState) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2;
                String str31 = (String) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1;
                String str32 = (String) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0;
                ResultKt.b(objB6);
                chaloTextUIStateA2 = chaloTextUIState11;
                chaloTextStyleHelper2 = chaloTextStyleHelper6;
                shadyGray2 = shadyGray3;
                str12 = str32;
                stringProvider = stringProvider4;
                str13 = str31;
                stringProvider2 = stringProvider;
                styledTextUIState2 = new TextUIState.StyledTextUIState(CollectionsKt.R(new StyledTextDataUIState((String) objB6, shadyGray2, null, UITextStyle.BodySmall, null, null, null, 1012)), null, null, 30);
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str12;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str13;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = searchItemUIState2;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = chaloTextUIStateA2;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = styledTextUIState2;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = chaloTextStyleHelper2;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 5;
                objB4 = stringProvider2.b(StringEnum.WHERE_TO, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                if (objB4 != coroutineSingletons2) {
                    TextUIState.ChaloTextUIState chaloTextUIState12 = chaloTextUIStateA2;
                    str14 = str12;
                    searchItemUIState3 = searchItemUIState2;
                    chaloTextUIState3 = chaloTextUIState12;
                    styledTextUIState3 = styledTextUIState2;
                    str15 = str13;
                    chaloTextStyleHelper3 = chaloTextStyleHelper2;
                    str16 = str15;
                    str17 = str14;
                    chaloTextStyleHelper4 = chaloTextStyleHelper2;
                    searchItemUIState4 = new SearchItemUIState(chaloTextUIState3, styledTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objB4, black_40, 1, null, null, null, null, 120), new er0(this, 12));
                    iconType = IconType.PB_SWAP_ICON;
                    imageUISize = new ImageUISize(ChaloThemeHelper.a().m);
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str17;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str16;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = iconType;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = imageUISize;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = searchItemUIState3;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = searchItemUIState4;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 6;
                    stringProvider3 = stringProvider2;
                    objB5 = stringProvider3.b(StringEnum.SWAP_STOPS, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                    coroutineSingletons = coroutineSingletons2;
                    if (objB5 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str18 = str16;
                    str19 = str17;
                    imageUISize2 = imageUISize;
                    objB6 = objB5;
                    searchItemUIState5 = searchItemUIState4;
                    z3 = true;
                    searchFieldComponentUIState = new SearchFieldComponentUIState(searchItemUIState3, searchItemUIState5, new ImageUIState(iconType, (String) objB6, (ChaloColorToken) null, imageUISize2, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 13)), AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID), 1);
                    z4 = false;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str19;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str18;
                    buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = buttonUIStateFactory;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = searchFieldComponentUIState;
                    chaloTextStyleHelper5 = chaloTextStyleHelper4;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = chaloTextStyleHelper5;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = null;
                    pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 7;
                    objB6 = stringProvider3.b(StringEnum.BUY_PASS_FROM_THIS_ROUTE, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                    if (objB6 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    String str214 = str18;
                    buttonUIStateFactory2 = buttonUIStateFactory;
                    str20 = str214;
                    str21 = str19;
                    TextUIState.ChaloTextUIState chaloTextUIStateB7 = ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB6, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108);
                    UIShape.Rectangle rectangle7 = UIShape.d;
                    if (str21 != null) {
                        z2 = z4;
                    } else {
                        z2 = z4;
                    }
                    return new SearchFieldWithSwapButtonCardUIState(searchFieldComponentUIState, ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIStateB7, new m(24, str21, str20, this), rectangle7, z2, 0.0f, 36));
                }
                return coroutineSingletons2;
            case 5:
                ChaloTextStyleHelper chaloTextStyleHelper8 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5;
                TextUIState.StyledTextUIState styledTextUIState4 = (TextUIState.StyledTextUIState) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4;
                chaloTextUIState3 = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3;
                SearchItemUIState searchItemUIState6 = (SearchItemUIState) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2;
                str15 = (String) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1;
                String str33 = (String) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0;
                ResultKt.b(objB6);
                chaloTextStyleHelper3 = chaloTextStyleHelper8;
                chaloTextStyleHelper2 = chaloTextStyleHelper6;
                objB4 = objB6;
                stringProvider2 = stringProvider4;
                str14 = str33;
                styledTextUIState3 = styledTextUIState4;
                searchItemUIState3 = searchItemUIState6;
                str16 = str15;
                str17 = str14;
                chaloTextStyleHelper4 = chaloTextStyleHelper2;
                searchItemUIState4 = new SearchItemUIState(chaloTextUIState3, styledTextUIState3, ChaloTextStyleHelper.b(chaloTextStyleHelper3, (String) objB4, black_40, 1, null, null, null, null, 120), new er0(this, 12));
                iconType = IconType.PB_SWAP_ICON;
                imageUISize = new ImageUISize(ChaloThemeHelper.a().m);
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str17;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str16;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = iconType;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = imageUISize;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = searchItemUIState3;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = searchItemUIState4;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 6;
                stringProvider3 = stringProvider2;
                objB5 = stringProvider3.b(StringEnum.SWAP_STOPS, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                coroutineSingletons = coroutineSingletons2;
                if (objB5 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str18 = str16;
                str19 = str17;
                imageUISize2 = imageUISize;
                objB6 = objB5;
                searchItemUIState5 = searchItemUIState4;
                z3 = true;
                searchFieldComponentUIState = new SearchFieldComponentUIState(searchItemUIState3, searchItemUIState5, new ImageUIState(iconType, (String) objB6, (ChaloColorToken) null, imageUISize2, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 13)), AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID), 1);
                z4 = false;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str19;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str18;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = buttonUIStateFactory;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = searchFieldComponentUIState;
                chaloTextStyleHelper5 = chaloTextStyleHelper4;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = chaloTextStyleHelper5;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = null;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 7;
                objB6 = stringProvider3.b(StringEnum.BUY_PASS_FROM_THIS_ROUTE, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                if (objB6 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                String str215 = str18;
                buttonUIStateFactory2 = buttonUIStateFactory;
                str20 = str215;
                str21 = str19;
                TextUIState.ChaloTextUIState chaloTextUIStateB8 = ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB6, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108);
                UIShape.Rectangle rectangle8 = UIShape.d;
                if (str21 != null) {
                    z2 = z4;
                } else {
                    z2 = z4;
                }
                return new SearchFieldWithSwapButtonCardUIState(searchFieldComponentUIState, ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIStateB8, new m(24, str21, str20, this), rectangle8, z2, 0.0f, 36));
            case 6:
                searchItemUIState5 = (SearchItemUIState) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5;
                searchItemUIState3 = (SearchItemUIState) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4;
                ImageUISize imageUISize3 = (ImageUISize) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3;
                iconType = (IconType) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2;
                str18 = (String) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1;
                str19 = (String) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0;
                ResultKt.b(objB6);
                coroutineSingletons = coroutineSingletons2;
                imageUISize2 = imageUISize3;
                chaloTextStyleHelper4 = chaloTextStyleHelper6;
                stringProvider3 = stringProvider4;
                z3 = true;
                searchFieldComponentUIState = new SearchFieldComponentUIState(searchItemUIState3, searchItemUIState5, new ImageUIState(iconType, (String) objB6, (ChaloColorToken) null, imageUISize2, (UIContentScale) null, 0.0f, UiEventHandler.Companion.a(new er0(this, 13)), AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID), 1);
                z4 = false;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0 = str19;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1 = str18;
                buttonUIStateFactory = ButtonUIStateFactory.f9921a;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2 = buttonUIStateFactory;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3 = searchFieldComponentUIState;
                chaloTextStyleHelper5 = chaloTextStyleHelper4;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4 = chaloTextStyleHelper5;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$5 = null;
                pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.label = 7;
                objB6 = stringProvider3.b(StringEnum.BUY_PASS_FROM_THIS_ROUTE, new Object[0], pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1);
                if (objB6 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                String str216 = str18;
                buttonUIStateFactory2 = buttonUIStateFactory;
                str20 = str216;
                str21 = str19;
                TextUIState.ChaloTextUIState chaloTextUIStateB9 = ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB6, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108);
                UIShape.Rectangle rectangle9 = UIShape.d;
                if (str21 != null) {
                    z2 = z4;
                } else {
                    z2 = z4;
                }
                return new SearchFieldWithSwapButtonCardUIState(searchFieldComponentUIState, ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIStateB9, new m(24, str21, str20, this), rectangle9, z2, 0.0f, 36));
            case 7:
                chaloTextStyleHelper5 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$4;
                searchFieldComponentUIState = (SearchFieldComponentUIState) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$3;
                ButtonUIStateFactory buttonUIStateFactory3 = (ButtonUIStateFactory) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$2;
                str20 = (String) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$1;
                str21 = (String) pbPassPurchaseLandingScreenComponent$createFromAndToStopCardUIState$1.L$0;
                ResultKt.b(objB6);
                buttonUIStateFactory2 = buttonUIStateFactory3;
                TextUIState.ChaloTextUIState chaloTextUIStateB10 = ChaloTextStyleHelper.b(chaloTextStyleHelper5, (String) objB6, ChaloColorToken.White.f9870a, 0, null, UIFontWeight.Bold, null, null, 108);
                UIShape.Rectangle rectangle10 = UIShape.d;
                if (str21 != null) {
                    z2 = z4;
                } else {
                    z2 = z4;
                }
                return new SearchFieldWithSwapButtonCardUIState(searchFieldComponentUIState, ButtonUIStateFactory.f(buttonUIStateFactory2, chaloTextUIStateB10, new m(24, str21, str20, this), rectangle10, z2, 0.0f, 36));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final ModeToReachFromStopUIState J0(Long l, String str, String str2, PBModeToReachStopType pBModeToReachStopType) {
        IconType iconType;
        if (l == null) {
            return null;
        }
        String strW = this.t.w(l.longValue() * ((long) 1000));
        if (str != null) {
            strW = vo1.n(strW, " ", str);
        }
        String str3 = strW;
        if (str3 == null) {
            return null;
        }
        int i = WhenMappings.f7651a[pBModeToReachStopType.ordinal()];
        if (i == 1) {
            iconType = IconType.WALK_TRIP_PLANNER;
        } else if (i == 2) {
            iconType = IconType.BUS_TRIP_PLANNER;
        } else {
            if (i != 3) {
                if (i == 4) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            iconType = IconType.AUTO_TRIP_PLANNER;
        }
        ImageUIState imageUIState = new ImageUIState(iconType, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().g), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        ChaloTextStyleHelper chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
        ChaloColorToken.Black_70 black_70 = ChaloColorToken.Black_70.f9767a;
        return new ModeToReachFromStopUIState(imageUIState, ChaloTextStyleHelper.c(chaloTextStyleHelper, str2, black_70, null, null, null, null, 124), ChaloTextStyleHelper.b(chaloTextStyleHelper, str3, black_70, 1, null, null, null, UITextOverflow.Ellipsis, 56));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0094  */
    /* JADX WARN: Code duplicated, block: B:22:0x009e  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:32:0x0137  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x011b, code lost:
    
        if (r5 == r3) goto L30;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x011b -> B:13:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K0(java.util.List r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent.K0(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:38:0x0115  */
    /* JADX WARN: Code duplicated, block: B:49:0x0160  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object L0(PBOriginDestinationAppModel pBOriginDestinationAppModel, ContinuationImpl continuationImpl) {
        PbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1 pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1;
        PBOriginDestinationAppModel pBOriginDestinationAppModel2;
        Long l;
        String str;
        PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent;
        String str2;
        Long l2;
        PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent2;
        Object objB;
        PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent3;
        ModeToReachFromStopUIState modeToReachFromStopUIStateJ0;
        PBOriginDestinationAppModel pBOriginDestinationAppModel3;
        StringProvider stringProvider;
        int i;
        TextUIState.ChaloTextUIState chaloTextUIStateG;
        Long l3;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel;
        ModeToReachFromStopUIState modeToReachFromStopUIState;
        Long l4;
        TextUIState.ChaloTextUIState chaloTextUIState;
        PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent4;
        String str3;
        String str4;
        ModeToReachFromStopUIState modeToReachFromStopUIState2;
        PBOriginDestinationAppModel pBOriginDestinationAppModel4;
        PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent5;
        Object objB2;
        PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent6;
        PBOriginDestinationAppModel pBOriginDestinationAppModel5;
        Long l5;
        String str5;
        if (continuationImpl instanceof PbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1) {
            pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1 = (PbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1) continuationImpl;
            int i2 = pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.label = i2 - Integer.MIN_VALUE;
            } else {
                pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1 = new PbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1(this, continuationImpl);
            }
        } else {
            pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1 = new PbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1(this, continuationImpl);
        }
        Object objB3 = pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.label;
        ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
        ChaloTextStyleHelper chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
        StringProvider stringProvider2 = this.l;
        if (i3 == 0) {
            ResultKt.b(objB3);
            Long l6 = pBOriginDestinationAppModel.e;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = this.C;
            if (pBStopPlaceSelectedAppModel2 == null || (str2 = pBStopPlaceSelectedAppModel2.c) == null) {
                pBOriginDestinationAppModel2 = pBOriginDestinationAppModel;
                l = l6;
                str = null;
                pbPassPurchaseLandingScreenComponent = this;
                pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$0 = pBOriginDestinationAppModel2;
                pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$1 = pbPassPurchaseLandingScreenComponent;
                pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$2 = l;
                pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$3 = str;
                pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.label = 2;
                objB = stringProvider2.b(StringEnum.PICKUP, new Object[0], pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1);
                if (objB != coroutineSingletons) {
                    pbPassPurchaseLandingScreenComponent3 = pbPassPurchaseLandingScreenComponent;
                    objB3 = objB;
                    PBOriginDestinationAppModel pBOriginDestinationAppModel6 = pBOriginDestinationAppModel2;
                    modeToReachFromStopUIStateJ0 = pbPassPurchaseLandingScreenComponent3.J0(l, str, (String) objB3, pBOriginDestinationAppModel6.g);
                    pBOriginDestinationAppModel3 = pBOriginDestinationAppModel6;
                    stringProvider = stringProvider2;
                    i = 0;
                    chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper, pBOriginDestinationAppModel6.d, black, null, null, null, null, 124);
                    l3 = pBOriginDestinationAppModel3.j;
                    pBStopPlaceSelectedAppModel = this.D;
                    if (pBStopPlaceSelectedAppModel != null) {
                    }
                    modeToReachFromStopUIState = modeToReachFromStopUIStateJ0;
                    l4 = l3;
                    chaloTextUIState = chaloTextUIStateG;
                    pbPassPurchaseLandingScreenComponent4 = this;
                    str3 = null;
                    pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$0 = pBOriginDestinationAppModel3;
                    pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$1 = modeToReachFromStopUIState;
                    pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$2 = chaloTextUIState;
                    pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$3 = pbPassPurchaseLandingScreenComponent4;
                    pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$4 = l4;
                    pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$5 = str3;
                    pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.DROP, new Object[i], pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1);
                    if (objB2 != coroutineSingletons) {
                        PBOriginDestinationAppModel pBOriginDestinationAppModel7 = pBOriginDestinationAppModel3;
                        pbPassPurchaseLandingScreenComponent6 = pbPassPurchaseLandingScreenComponent4;
                        objB3 = objB2;
                        pBOriginDestinationAppModel5 = pBOriginDestinationAppModel7;
                        l5 = l4;
                        str5 = str3;
                        return new OriginDestinationInfoUIState(modeToReachFromStopUIState, chaloTextUIState, pbPassPurchaseLandingScreenComponent6.J0(l5, str5, (String) objB3, pBOriginDestinationAppModel5.l), ChaloTextStyleHelper.g(chaloTextStyleHelper, pBOriginDestinationAppModel5.i, black, null, null, null, null, 124));
                    }
                }
            } else {
                pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$0 = pBOriginDestinationAppModel;
                pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$1 = this;
                pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$2 = l6;
                pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.label = 1;
                Object objB4 = stringProvider2.b(StringEnum.FROM_, new Object[]{str2}, pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1);
                if (objB4 != coroutineSingletons) {
                    pBOriginDestinationAppModel2 = pBOriginDestinationAppModel;
                    l2 = l6;
                    objB3 = objB4;
                    pbPassPurchaseLandingScreenComponent2 = this;
                }
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            l2 = (Long) pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$2;
            pbPassPurchaseLandingScreenComponent2 = (PbPassPurchaseLandingScreenComponent) pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$1;
            pBOriginDestinationAppModel2 = (PBOriginDestinationAppModel) pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$0;
            ResultKt.b(objB3);
        } else {
            if (i3 == 2) {
                str = (String) pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$3;
                l = (Long) pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$2;
                pbPassPurchaseLandingScreenComponent3 = (PbPassPurchaseLandingScreenComponent) pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$1;
                pBOriginDestinationAppModel2 = (PBOriginDestinationAppModel) pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$0;
                ResultKt.b(objB3);
                PBOriginDestinationAppModel pBOriginDestinationAppModel8 = pBOriginDestinationAppModel2;
                modeToReachFromStopUIStateJ0 = pbPassPurchaseLandingScreenComponent3.J0(l, str, (String) objB3, pBOriginDestinationAppModel8.g);
                pBOriginDestinationAppModel3 = pBOriginDestinationAppModel8;
                stringProvider = stringProvider2;
                i = 0;
                chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper, pBOriginDestinationAppModel8.d, black, null, null, null, null, 124);
                l3 = pBOriginDestinationAppModel3.j;
                pBStopPlaceSelectedAppModel = this.D;
                if (pBStopPlaceSelectedAppModel != null || (str4 = pBStopPlaceSelectedAppModel.c) == null) {
                    modeToReachFromStopUIState = modeToReachFromStopUIStateJ0;
                    l4 = l3;
                    chaloTextUIState = chaloTextUIStateG;
                    pbPassPurchaseLandingScreenComponent4 = this;
                    str3 = null;
                    pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$0 = pBOriginDestinationAppModel3;
                    pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$1 = modeToReachFromStopUIState;
                    pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$2 = chaloTextUIState;
                    pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$3 = pbPassPurchaseLandingScreenComponent4;
                    pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$4 = l4;
                    pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$5 = str3;
                    pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.DROP, new Object[i], pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1);
                    if (objB2 != coroutineSingletons) {
                        PBOriginDestinationAppModel pBOriginDestinationAppModel9 = pBOriginDestinationAppModel3;
                        pbPassPurchaseLandingScreenComponent6 = pbPassPurchaseLandingScreenComponent4;
                        objB3 = objB2;
                        pBOriginDestinationAppModel5 = pBOriginDestinationAppModel9;
                        l5 = l4;
                        str5 = str3;
                    }
                } else {
                    pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$0 = pBOriginDestinationAppModel3;
                    pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$1 = modeToReachFromStopUIStateJ0;
                    pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$2 = chaloTextUIStateG;
                    pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$3 = this;
                    pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$4 = l3;
                    pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.label = 3;
                    objB3 = stringProvider.b(StringEnum.TO_, new Object[]{str4}, pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1);
                    if (objB3 != coroutineSingletons) {
                        modeToReachFromStopUIState2 = modeToReachFromStopUIStateJ0;
                        pBOriginDestinationAppModel4 = pBOriginDestinationAppModel3;
                        l4 = l3;
                        pbPassPurchaseLandingScreenComponent5 = this;
                        str3 = (String) objB3;
                        pbPassPurchaseLandingScreenComponent4 = pbPassPurchaseLandingScreenComponent5;
                        chaloTextUIState = chaloTextUIStateG;
                        modeToReachFromStopUIState = modeToReachFromStopUIState2;
                        pBOriginDestinationAppModel3 = pBOriginDestinationAppModel4;
                        pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$0 = pBOriginDestinationAppModel3;
                        pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$1 = modeToReachFromStopUIState;
                        pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$2 = chaloTextUIState;
                        pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$3 = pbPassPurchaseLandingScreenComponent4;
                        pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$4 = l4;
                        pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$5 = str3;
                        pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.label = 4;
                        objB2 = stringProvider.b(StringEnum.DROP, new Object[i], pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1);
                        if (objB2 != coroutineSingletons) {
                            PBOriginDestinationAppModel pBOriginDestinationAppModel10 = pBOriginDestinationAppModel3;
                            pbPassPurchaseLandingScreenComponent6 = pbPassPurchaseLandingScreenComponent4;
                            objB3 = objB2;
                            pBOriginDestinationAppModel5 = pBOriginDestinationAppModel10;
                            l5 = l4;
                            str5 = str3;
                        }
                    }
                }
                return coroutineSingletons;
            }
            if (i3 == 3) {
                l4 = (Long) pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$4;
                pbPassPurchaseLandingScreenComponent5 = (PbPassPurchaseLandingScreenComponent) pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$3;
                chaloTextUIStateG = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$2;
                modeToReachFromStopUIState2 = (ModeToReachFromStopUIState) pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$1;
                pBOriginDestinationAppModel4 = (PBOriginDestinationAppModel) pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$0;
                ResultKt.b(objB3);
                i = 0;
                stringProvider = stringProvider2;
                str3 = (String) objB3;
                pbPassPurchaseLandingScreenComponent4 = pbPassPurchaseLandingScreenComponent5;
                chaloTextUIState = chaloTextUIStateG;
                modeToReachFromStopUIState = modeToReachFromStopUIState2;
                pBOriginDestinationAppModel3 = pBOriginDestinationAppModel4;
                pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$0 = pBOriginDestinationAppModel3;
                pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$1 = modeToReachFromStopUIState;
                pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$2 = chaloTextUIState;
                pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$3 = pbPassPurchaseLandingScreenComponent4;
                pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$4 = l4;
                pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$5 = str3;
                pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.label = 4;
                objB2 = stringProvider.b(StringEnum.DROP, new Object[i], pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1);
                if (objB2 != coroutineSingletons) {
                    PBOriginDestinationAppModel pBOriginDestinationAppModel11 = pBOriginDestinationAppModel3;
                    pbPassPurchaseLandingScreenComponent6 = pbPassPurchaseLandingScreenComponent4;
                    objB3 = objB2;
                    pBOriginDestinationAppModel5 = pBOriginDestinationAppModel11;
                    l5 = l4;
                    str5 = str3;
                }
                return coroutineSingletons;
            }
            if (i3 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str5 = (String) pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$5;
            l5 = (Long) pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$4;
            pbPassPurchaseLandingScreenComponent6 = (PbPassPurchaseLandingScreenComponent) pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$3;
            chaloTextUIState = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$2;
            modeToReachFromStopUIState = (ModeToReachFromStopUIState) pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$1;
            pBOriginDestinationAppModel5 = (PBOriginDestinationAppModel) pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$0;
            ResultKt.b(objB3);
        }
        return new OriginDestinationInfoUIState(modeToReachFromStopUIState, chaloTextUIState, pbPassPurchaseLandingScreenComponent6.J0(l5, str5, (String) objB3, pBOriginDestinationAppModel5.l), ChaloTextStyleHelper.g(chaloTextStyleHelper, pBOriginDestinationAppModel5.i, black, null, null, null, null, 124));
        PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent7 = pbPassPurchaseLandingScreenComponent2;
        l = l2;
        str = (String) objB3;
        pbPassPurchaseLandingScreenComponent = pbPassPurchaseLandingScreenComponent7;
        pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$0 = pBOriginDestinationAppModel2;
        pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$1 = pbPassPurchaseLandingScreenComponent;
        pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$2 = l;
        pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$3 = str;
        pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.label = 2;
        objB = stringProvider2.b(StringEnum.PICKUP, new Object[0], pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1);
        if (objB != coroutineSingletons) {
            pbPassPurchaseLandingScreenComponent3 = pbPassPurchaseLandingScreenComponent;
            objB3 = objB;
            PBOriginDestinationAppModel pBOriginDestinationAppModel12 = pBOriginDestinationAppModel2;
            modeToReachFromStopUIStateJ0 = pbPassPurchaseLandingScreenComponent3.J0(l, str, (String) objB3, pBOriginDestinationAppModel12.g);
            pBOriginDestinationAppModel3 = pBOriginDestinationAppModel12;
            stringProvider = stringProvider2;
            i = 0;
            chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper, pBOriginDestinationAppModel12.d, black, null, null, null, null, 124);
            l3 = pBOriginDestinationAppModel3.j;
            pBStopPlaceSelectedAppModel = this.D;
            if (pBStopPlaceSelectedAppModel != null) {
            }
            modeToReachFromStopUIState = modeToReachFromStopUIStateJ0;
            l4 = l3;
            chaloTextUIState = chaloTextUIStateG;
            pbPassPurchaseLandingScreenComponent4 = this;
            str3 = null;
            pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$0 = pBOriginDestinationAppModel3;
            pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$1 = modeToReachFromStopUIState;
            pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$2 = chaloTextUIState;
            pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$3 = pbPassPurchaseLandingScreenComponent4;
            pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$4 = l4;
            pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.L$5 = str3;
            pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1.label = 4;
            objB2 = stringProvider.b(StringEnum.DROP, new Object[i], pbPassPurchaseLandingScreenComponent$createOriginDestinationInfoUIState$1);
            if (objB2 != coroutineSingletons) {
                PBOriginDestinationAppModel pBOriginDestinationAppModel13 = pBOriginDestinationAppModel3;
                pbPassPurchaseLandingScreenComponent6 = pbPassPurchaseLandingScreenComponent4;
                objB3 = objB2;
                pBOriginDestinationAppModel5 = pBOriginDestinationAppModel13;
                l5 = l4;
                str5 = str3;
                return new OriginDestinationInfoUIState(modeToReachFromStopUIState, chaloTextUIState, pbPassPurchaseLandingScreenComponent6.J0(l5, str5, (String) objB3, pBOriginDestinationAppModel5.l), ChaloTextStyleHelper.g(chaloTextStyleHelper, pBOriginDestinationAppModel5.i, black, null, null, null, null, 124));
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object M0(PBOriginDestinationAppModel pBOriginDestinationAppModel, ContinuationImpl continuationImpl) {
        PbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1 pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1;
        float f;
        ChaloTextStyleHelper chaloTextStyleHelper;
        float f2;
        PBOriginDestinationAppModel pBOriginDestinationAppModel2;
        TextUIState.ChaloTextUIState chaloTextUIState;
        ButtonUIStateFactory buttonUIStateFactory;
        PBOriginDestinationAppModel pBOriginDestinationAppModel3 = pBOriginDestinationAppModel;
        if (continuationImpl instanceof PbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1) {
            pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1 = (PbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1) continuationImpl;
            int i = pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1 = new PbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1(this, continuationImpl);
            }
        } else {
            pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1 = new PbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1(this, continuationImpl);
        }
        Object objB = pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.label;
        StringProvider stringProvider = this.l;
        ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (pBOriginDestinationAppModel3.f7091a.isEmpty()) {
                return null;
            }
            pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.L$0 = pBOriginDestinationAppModel3;
            pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.L$1 = chaloTextStyleHelper2;
            f = 0.0f;
            pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.F$0 = 0.0f;
            pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.F$1 = 0.0f;
            pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.label = 1;
            objB = stringProvider.b(StringEnum.VIEW_STOPS, new Object[0], pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1);
            if (objB != coroutineSingletons) {
                chaloTextStyleHelper = chaloTextStyleHelper2;
                f2 = 0.0f;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            float f3 = pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.F$1;
            f2 = pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.F$0;
            ChaloTextStyleHelper chaloTextStyleHelper3 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.L$1;
            PBOriginDestinationAppModel pBOriginDestinationAppModel4 = (PBOriginDestinationAppModel) pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.L$0;
            ResultKt.b(objB);
            f = f3;
            pBOriginDestinationAppModel3 = pBOriginDestinationAppModel4;
            chaloTextStyleHelper = chaloTextStyleHelper3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloTextStyleHelper2 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.L$3;
            chaloTextUIState = (TextUIState.ChaloTextUIState) pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.L$2;
            buttonUIStateFactory = (ButtonUIStateFactory) pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.L$1;
            pBOriginDestinationAppModel2 = (PBOriginDestinationAppModel) pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.L$0;
            ResultKt.b(objB);
        }
        return new OriginDestinationSelectionCtaItemUIState(chaloTextUIState, ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.g(chaloTextStyleHelper2, (String) objB, ChaloColorToken.White.f9870a, null, null, null, null, 124), new gr0(this, pBOriginDestinationAppModel2, 2), UIShape.c, false, 0.0f, 52));
        TextUIState.ChaloTextUIState chaloTextUIStateG = ChaloTextStyleHelper.g(chaloTextStyleHelper, (String) objB, ChaloColorToken.ShadyGray.f9851a, null, null, UiEventHandler.Companion.a(new gr0(this, pBOriginDestinationAppModel3, 1)), null, 92);
        pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.L$0 = pBOriginDestinationAppModel3;
        ButtonUIStateFactory buttonUIStateFactory2 = ButtonUIStateFactory.f9921a;
        pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.L$1 = buttonUIStateFactory2;
        pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.L$2 = chaloTextUIStateG;
        pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.L$3 = chaloTextStyleHelper2;
        pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.F$0 = f2;
        pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.F$1 = f;
        pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.SELECT_STOPS, new Object[0], pbPassPurchaseLandingScreenComponent$createOriginDestinationSelectionCtaItemUIState$1);
        if (objB2 != coroutineSingletons) {
            pBOriginDestinationAppModel2 = pBOriginDestinationAppModel3;
            chaloTextUIState = chaloTextUIStateG;
            objB = objB2;
            buttonUIStateFactory = buttonUIStateFactory2;
            return new OriginDestinationSelectionCtaItemUIState(chaloTextUIState, ButtonUIStateFactory.f(buttonUIStateFactory, ChaloTextStyleHelper.g(chaloTextStyleHelper2, (String) objB, ChaloColorToken.White.f9870a, null, null, null, null, 124), new gr0(this, pBOriginDestinationAppModel2, 2), UIShape.c, false, 0.0f, 52));
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x015c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object N0(ContinuationImpl continuationImpl) {
        PbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1 pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1;
        List list;
        List list2;
        ChaloTextStyleHelper chaloTextStyleHelper;
        int i;
        ChaloTextStyleHelper chaloTextStyleHelper2;
        StringProvider stringProvider;
        Object objB;
        ChaloTextStyleHelper chaloTextStyleHelper3;
        List list3;
        Object objB2;
        ChaloTextStyleHelper chaloTextStyleHelper4;
        List list4;
        List list5;
        if (continuationImpl instanceof PbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1) {
            pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1 = (PbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1) continuationImpl;
            int i2 = pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.label = i2 - Integer.MIN_VALUE;
            } else {
                pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1 = new PbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1(this, continuationImpl);
            }
        } else {
            pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1 = new PbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1(this, continuationImpl);
        }
        Object obj = pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.label;
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        StringProvider stringProvider2 = this.l;
        ChaloTextStyleHelper chaloTextStyleHelper5 = ChaloTextStyleHelper.f10078a;
        if (i3 == 0) {
            ArrayList arrayListL = py.l(obj);
            pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.L$0 = arrayListL;
            pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.L$1 = arrayListL;
            pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.L$2 = chaloTextStyleHelper5;
            pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.label = 1;
            Object objB3 = stringProvider2.b(StringEnum.ONCE_YOU_BUY_PASS_YOU_CAN_BOOK_RIDES_ON_YOUR_PREFERRED_DAYS, new Object[0], pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1);
            if (objB3 != coroutineSingletons) {
                list = arrayListL;
                list2 = list;
                obj = objB3;
                chaloTextStyleHelper = chaloTextStyleHelper5;
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            chaloTextStyleHelper = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.L$2;
            List list6 = (List) pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.L$1;
            List list7 = (List) pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.L$0;
            ResultKt.b(obj);
            list2 = list6;
            list = list7;
        } else {
            if (i3 == 2) {
                ChaloTextStyleHelper chaloTextStyleHelper6 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.L$2;
                List list8 = (List) pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.L$1;
                list = (List) pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.L$0;
                ResultKt.b(obj);
                objB = obj;
                chaloTextStyleHelper2 = chaloTextStyleHelper5;
                chaloTextStyleHelper3 = chaloTextStyleHelper6;
                i = 0;
                list3 = list8;
                stringProvider = stringProvider2;
                list3.add(new TextWithLeftAndRightIconUIState(new ImageUIState(IconType.IC_CHECK_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), ChaloTextStyleHelper.c(chaloTextStyleHelper3, (String) objB, black_87, null, null, null, null, 124), null, ChaloThemeHelper.a().f, null, 20));
                pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.L$0 = list;
                pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.L$1 = list;
                pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.L$2 = chaloTextStyleHelper2;
                pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.label = 3;
                objB2 = stringProvider.b(StringEnum.YOU_CAN_CANCEL_YOUR_RIDE_FOR_FREE_UP_TO_30_MINUTES_BEFORE_THE_SCHEDULED_PICK_UP_TIME, new Object[i], pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1);
                if (objB2 != coroutineSingletons) {
                    chaloTextStyleHelper4 = chaloTextStyleHelper2;
                    obj = objB2;
                    list4 = list;
                    list5 = list4;
                }
                return coroutineSingletons;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChaloTextStyleHelper chaloTextStyleHelper7 = (ChaloTextStyleHelper) pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.L$2;
            list5 = (List) pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.L$1;
            list4 = (List) pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.L$0;
            ResultKt.b(obj);
            chaloTextStyleHelper4 = chaloTextStyleHelper7;
        }
        list5.add(new TextWithLeftAndRightIconUIState(new ImageUIState(IconType.IC_CHECK_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) obj, black_87, null, null, null, null, 124), null, ChaloThemeHelper.a().f, null, 20));
        return list4;
        String str = (String) obj;
        i = 0;
        chaloTextStyleHelper2 = chaloTextStyleHelper5;
        list2.add(new TextWithLeftAndRightIconUIState(new ImageUIState(IconType.IC_CHECK_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), ChaloTextStyleHelper.c(chaloTextStyleHelper, str, black_87, null, null, null, null, 124), null, ChaloThemeHelper.a().f, null, 20));
        pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.L$0 = list;
        pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.L$1 = list;
        pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.L$2 = chaloTextStyleHelper2;
        pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.label = 2;
        stringProvider = stringProvider2;
        objB = stringProvider.b(StringEnum.YOU_CAN_RESCHEDULE_YOUR_RIDE_FOR_FREE_TILL_YOUR_BUS_REACHES_YOUR_STOP, new Object[0], pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1);
        if (objB != coroutineSingletons) {
            chaloTextStyleHelper3 = chaloTextStyleHelper2;
            list3 = list;
            list3.add(new TextWithLeftAndRightIconUIState(new ImageUIState(IconType.IC_CHECK_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), ChaloTextStyleHelper.c(chaloTextStyleHelper3, (String) objB, black_87, null, null, null, null, 124), null, ChaloThemeHelper.a().f, null, 20));
            pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.L$0 = list;
            pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.L$1 = list;
            pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.L$2 = chaloTextStyleHelper2;
            pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1.label = 3;
            objB2 = stringProvider.b(StringEnum.YOU_CAN_CANCEL_YOUR_RIDE_FOR_FREE_UP_TO_30_MINUTES_BEFORE_THE_SCHEDULED_PICK_UP_TIME, new Object[i], pbPassPurchaseLandingScreenComponent$createPassInfoUIStateList$1);
            if (objB2 != coroutineSingletons) {
                chaloTextStyleHelper4 = chaloTextStyleHelper2;
                obj = objB2;
                list4 = list;
                list5 = list4;
                list5.add(new TextWithLeftAndRightIconUIState(new ImageUIState(IconType.IC_CHECK_ICON, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().i), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), ChaloTextStyleHelper.c(chaloTextStyleHelper4, (String) obj, black_87, null, null, null, null, 124), null, ChaloThemeHelper.a().f, null, 20));
                return list4;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O0(PbPassPurchaseLandingScreenIntent intent) {
        String strA;
        Source source;
        String strA2;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof PbPassPurchaseLandingScreenIntent.InitializationIntent;
        int i = 29;
        PremiumBusArgs.PremiumBusPassLandingScreenArgs premiumBusPassLandingScreenArgs = this.k;
        Object[] objArr = 0;
        ContextScope contextScope = this.j;
        final int i2 = 1;
        PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = null;
        pBStopPlaceSelectedAppModel = null;
        if (z) {
            PbPassPurchaseLandingScreenIntent.InitializationIntent initializationIntent = (PbPassPurchaseLandingScreenIntent.InitializationIntent) intent;
            PassLandingFlowType passLandingFlowType = initializationIntent.f7655a;
            if (this.d) {
                return;
            }
            this.d = true;
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("flowType", passLandingFlowType.toString()));
            String str = premiumBusPassLandingScreenArgs.f;
            if (str != null) {
                if (StringsKt.F(str)) {
                    str = null;
                }
                if (str != null) {
                    linkedHashMapK.put("attribution type", str);
                }
            }
            AnalyticsContractImplKt.b(this.s, "pb pass purchase landing screen opened", initializationIntent.b, linkedHashMapK, false, 24);
            E0(new ym0(initializationIntent, 17));
            if (passLandingFlowType instanceof PassLandingFlowType.WithConfigId) {
                BuildersKt.d(contextScope, null, null, new PbPassPurchaseLandingScreenComponent$handleWithConfigIdFlow$1(this, ((PassLandingFlowType.WithConfigId) passLandingFlowType).b, null), 3);
                return;
            } else {
                if (!passLandingFlowType.equals(PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                E0(new mq0(i));
                return;
            }
        }
        if (intent instanceof PbPassPurchaseLandingScreenIntent.ProceedBtnClickIntent) {
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = this.C;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel3 = this.D;
            AnalyticsContractImplKt.b(this.s, "pb pass purchase landing proceed btn clicked intent", Source.PB_PASS_PURCHASE_LANDING_SCREEN, MapsKt.i(new Pair("fromStopName", String.valueOf(pBStopPlaceSelectedAppModel2 != null ? pBStopPlaceSelectedAppModel2.c : null)), new Pair("toStopName", String.valueOf(pBStopPlaceSelectedAppModel3 != null ? pBStopPlaceSelectedAppModel3.c : null)), new Pair("fromStopId", String.valueOf(pBStopPlaceSelectedAppModel2 != null ? pBStopPlaceSelectedAppModel2.f7095a : null)), new Pair("toStopId", String.valueOf(pBStopPlaceSelectedAppModel3 != null ? pBStopPlaceSelectedAppModel3.f7095a : null))), false, 24);
            if (pBStopPlaceSelectedAppModel2 == null || pBStopPlaceSelectedAppModel3 == null) {
                BuildersKt.d(contextScope, null, null, new PbPassPurchaseLandingScreenComponent$handleProceedBtnClickedIntent$3(this, null), 3);
                return;
            } else {
                E0(new ir0(1));
                this.A = BuildersKt.d(contextScope, null, null, new PbPassPurchaseLandingScreenComponent$handleProceedBtnClickedIntent$2(this, pBStopPlaceSelectedAppModel2, pBStopPlaceSelectedAppModel3, null), 3);
                return;
            }
        }
        if (intent.equals(PbPassPurchaseLandingScreenIntent.ReportProblemClickedIntent.f7665a)) {
            BuildersKt.d(contextScope, null, null, new PbPassPurchaseLandingScreenComponent$handleReportProblemClickedIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(PbPassPurchaseLandingScreenIntent.SwapSearchFieldsClickedIntent.f7669a)) {
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel4 = this.C;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel5 = this.D;
            this.C = pBStopPlaceSelectedAppModel5;
            this.D = pBStopPlaceSelectedAppModel4;
            Source source2 = Source.PB_PASS_PURCHASE_LANDING_SCREEN;
            Pair pair = new Pair("fromStopId", String.valueOf(pBStopPlaceSelectedAppModel5 != null ? pBStopPlaceSelectedAppModel5.f7095a : null));
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel6 = this.D;
            Pair pair2 = new Pair("toStopId", String.valueOf(pBStopPlaceSelectedAppModel6 != null ? pBStopPlaceSelectedAppModel6.f7095a : null));
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel7 = this.C;
            Pair pair3 = new Pair("fromStopName", String.valueOf(pBStopPlaceSelectedAppModel7 != null ? pBStopPlaceSelectedAppModel7.c : null));
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel8 = this.D;
            AnalyticsContractImplKt.b(this.s, "pb pass landing swap btn clicked", source2, MapsKt.i(pair, pair2, pair3, new Pair("toStopName", String.valueOf(pBStopPlaceSelectedAppModel8 != null ? pBStopPlaceSelectedAppModel8.c : null))), false, 24);
            E0(new ym0(this, 19));
            return;
        }
        boolean zEquals = intent.equals(PbPassPurchaseLandingScreenIntent.BuyPassBtnClickIntent.f7653a);
        StateFlow stateFlow = this.f;
        if (zEquals) {
            Job job = this.z;
            if (job == null || !((AbstractCoroutine) job).isActive()) {
                E0(new mq0(28));
                AnalyticsContractImplKt.b(this.s, "pb pass landing buy pass btn clicked", Source.PB_PASS_PURCHASE_LANDING_SCREEN, null, false, 28);
                PassLandingFlowType passLandingFlowType2 = ((PbPassPurchaseLandingScreenDataState) stateFlow.getValue()).f7652a;
                if (!(passLandingFlowType2 instanceof PassLandingFlowType.WithConfigId)) {
                    if (!Intrinsics.d(passLandingFlowType2, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                String str2 = ((PassLandingFlowType.WithConfigId) passLandingFlowType2).b;
                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel9 = this.C;
                String str3 = pBStopPlaceSelectedAppModel9 != null ? pBStopPlaceSelectedAppModel9.f7095a : null;
                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel10 = this.D;
                P0(str2, str3, pBStopPlaceSelectedAppModel10 != null ? pBStopPlaceSelectedAppModel10.f7095a : null, null, null);
                return;
            }
            return;
        }
        if (intent instanceof PbPassPurchaseLandingScreenIntent.OriginDestinationPointSelectedIntent) {
            PbPassPurchaseLandingScreenIntent.OriginDestinationPointSelectedIntent originDestinationPointSelectedIntent = (PbPassPurchaseLandingScreenIntent.OriginDestinationPointSelectedIntent) intent;
            PBOriginDestinationAppModel pBOriginDestinationAppModel = originDestinationPointSelectedIntent.f7661a;
            E0(new mq0(27));
            Source source3 = Source.PB_PASS_PURCHASE_LANDING_SCREEN;
            String str4 = pBOriginDestinationAppModel.c;
            List list = pBOriginDestinationAppModel.f7091a;
            AnalyticsContractImplKt.b(this.s, "pb pass landing screen od pair clicked", source3, MapsKt.i(new Pair("fromStopId", str4), new Pair("toStopId", pBOriginDestinationAppModel.h), new Pair("routeId", CollectionsKt.F(list))), false, 24);
            PassLandingFlowType passLandingFlowType3 = ((PbPassPurchaseLandingScreenDataState) stateFlow.getValue()).f7652a;
            if (passLandingFlowType3 instanceof PassLandingFlowType.WithConfigId) {
                P0(((PassLandingFlowType.WithConfigId) passLandingFlowType3).b, pBOriginDestinationAppModel.c, pBOriginDestinationAppModel.h, (String) CollectionsKt.F(list), originDestinationPointSelectedIntent.f7661a);
                return;
            } else {
                if (!Intrinsics.d(passLandingFlowType3, PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                E0(new ir0(0));
                BuildersKt.d(contextScope, null, null, new PbPassPurchaseLandingScreenComponent$handleOriginDestinationPointSelectedIntent$3(this.C, this.D, this, originDestinationPointSelectedIntent, null), 3);
                return;
            }
        }
        if (intent instanceof PbPassPurchaseLandingScreenIntent.StopSelectionFieldClickedIntent) {
            PbPassPurchaseLandingScreenIntent.StopSelectionFieldClickedIntent stopSelectionFieldClickedIntent = (PbPassPurchaseLandingScreenIntent.StopSelectionFieldClickedIntent) intent;
            Job job2 = this.A;
            if (job2 == null || !((AbstractCoroutine) job2).isActive()) {
                String strA3 = KUUID.a();
                PremiumBusStopSearchSource premiumBusStopSearchSource = stopSelectionFieldClickedIntent.f7667a;
                int i3 = WhenMappings.b[premiumBusStopSearchSource.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    source = Source.PREMIUM_FROM_STOP_SELECTION;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    source = Source.PREMIUM_TO_STOP_SELECTION;
                }
                Source source4 = source;
                UniversalSearchFlowSource universalSearchFlowSource = source4 == Source.PREMIUM_FROM_STOP_SELECTION ? UniversalSearchFlowSource.PREMIUM_FROM_STOP_SELECTION : UniversalSearchFlowSource.PREMIUM_TO_STOP_SELECTION;
                UniversalSearchOptions universalSearchOptions = new UniversalSearchOptions(ArraysKt.j0(new UniversalSearchOption[]{new UniversalSearchOption.STOPS(true, true), new UniversalSearchOption.PLACES(true, true)}));
                try {
                    Json json = ChaloJson.b;
                    json.getClass();
                    strA2 = json.a(UniversalSearchOptions.INSTANCE.serializer(), universalSearchOptions);
                } catch (Exception unused) {
                    strA2 = null;
                }
                if (strA2 == null) {
                    return;
                }
                this.B = BuildersKt.d(contextScope, null, null, new PbPassPurchaseLandingScreenComponent$navigateToUniversalSearchForResult$1(this, strA3, premiumBusStopSearchSource, universalSearchFlowSource, source4, strA2, null), 3);
                return;
            }
            return;
        }
        if (intent instanceof PbPassPurchaseLandingScreenIntent.StopSelectionFieldResultIntent) {
            PbPassPurchaseLandingScreenIntent.StopSelectionFieldResultIntent stopSelectionFieldResultIntent = (PbPassPurchaseLandingScreenIntent.StopSelectionFieldResultIntent) intent;
            PremiumBusStopSearchSource premiumBusStopSearchSource2 = stopSelectionFieldResultIntent.b;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel11 = stopSelectionFieldResultIntent.f7668a;
            int i4 = WhenMappings.b[premiumBusStopSearchSource2.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                E0(new vg(premiumBusStopSearchSource2 == PremiumBusStopSearchSource.FROM_STOP_SUGGESTION, pBStopPlaceSelectedAppModel11, 1));
                return;
            }
            Object[] objArr2 = premiumBusStopSearchSource2 == PremiumBusStopSearchSource.FROM_STOP_SEARCH;
            final boolean z2 = ((objArr2 != false ? pBStopPlaceSelectedAppModel11 : this.C) == null || (objArr2 == false ? pBStopPlaceSelectedAppModel11 : this.D) == null) ? false : true;
            if (objArr2 != true) {
                this.D = pBStopPlaceSelectedAppModel11;
                E0(new Function1(this) { // from class: hr0
                    public final /* synthetic */ PbPassPurchaseLandingScreenComponent b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i2) {
                            case 0:
                                PbPassPurchaseLandingScreenDataState it = (PbPassPurchaseLandingScreenDataState) obj;
                                Intrinsics.i(it, "it");
                                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel12 = this.b.C;
                                return PbPassPurchaseLandingScreenDataState.a(it, null, false, false, false, null, pBStopPlaceSelectedAppModel12 != null ? pBStopPlaceSelectedAppModel12.c : null, null, null, Intrinsics.d(pBStopPlaceSelectedAppModel12 != null ? pBStopPlaceSelectedAppModel12.b : null, "userLocation"), z2, 959);
                            default:
                                PbPassPurchaseLandingScreenDataState it2 = (PbPassPurchaseLandingScreenDataState) obj;
                                Intrinsics.i(it2, "it");
                                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel13 = this.b.D;
                                return PbPassPurchaseLandingScreenDataState.a(it2, null, false, false, false, null, null, pBStopPlaceSelectedAppModel13 != null ? pBStopPlaceSelectedAppModel13.c : null, null, false, z2, 1919);
                        }
                    }
                });
                return;
            } else {
                this.C = pBStopPlaceSelectedAppModel11;
                final Object[] objArr3 = objArr == true ? 1 : 0;
                E0(new Function1(this) { // from class: hr0
                    public final /* synthetic */ PbPassPurchaseLandingScreenComponent b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (objArr3) {
                            case 0:
                                PbPassPurchaseLandingScreenDataState it = (PbPassPurchaseLandingScreenDataState) obj;
                                Intrinsics.i(it, "it");
                                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel12 = this.b.C;
                                return PbPassPurchaseLandingScreenDataState.a(it, null, false, false, false, null, pBStopPlaceSelectedAppModel12 != null ? pBStopPlaceSelectedAppModel12.c : null, null, null, Intrinsics.d(pBStopPlaceSelectedAppModel12 != null ? pBStopPlaceSelectedAppModel12.b : null, "userLocation"), z2, 959);
                            default:
                                PbPassPurchaseLandingScreenDataState it2 = (PbPassPurchaseLandingScreenDataState) obj;
                                Intrinsics.i(it2, "it");
                                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel13 = this.b.D;
                                return PbPassPurchaseLandingScreenDataState.a(it2, null, false, false, false, null, null, pBStopPlaceSelectedAppModel13 != null ? pBStopPlaceSelectedAppModel13.c : null, null, false, z2, 1919);
                        }
                    }
                });
                return;
            }
        }
        if (intent.equals(PbPassPurchaseLandingScreenIntent.CloseBottomSheetClickIntent.f7654a)) {
            E0(new mq0(24));
            return;
        }
        if (intent.equals(PbPassPurchaseLandingScreenIntent.NewRouteSuggestionCancelBtnClickIntent.f7656a)) {
            E0(new mq0(23));
            return;
        }
        if (intent.equals(PbPassPurchaseLandingScreenIntent.NewRouteSuggestionClickIntent.f7657a)) {
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel12 = this.C;
            PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel13 = this.D;
            if (pBStopPlaceSelectedAppModel12 == null || pBStopPlaceSelectedAppModel12.f == PremiumBusSelectedLocationType.LOCATION) {
                pBStopPlaceSelectedAppModel12 = null;
            }
            if (pBStopPlaceSelectedAppModel13 != null && pBStopPlaceSelectedAppModel13.f != PremiumBusSelectedLocationType.LOCATION) {
                pBStopPlaceSelectedAppModel = pBStopPlaceSelectedAppModel13;
            }
            E0(new jr0(pBStopPlaceSelectedAppModel12, pBStopPlaceSelectedAppModel, 0));
            return;
        }
        if (intent instanceof PbPassPurchaseLandingScreenIntent.NewRouteSuggestionSubmitBtnClickIntent) {
            E0(new mq0(25));
            return;
        }
        if (intent.equals(PbPassPurchaseLandingScreenIntent.NewRouteSuggestionSuccessOkayBtnClickIntent.f7659a)) {
            E0(new mq0(26));
            return;
        }
        boolean z3 = intent instanceof PbPassPurchaseLandingScreenIntent.OriginDestinationStopDetailsClickedIntent;
        ChaloNavigationManager chaloNavigationManager = this.v;
        if (z3) {
            PBOriginDestinationAppModel pBOriginDestinationAppModel2 = ((PbPassPurchaseLandingScreenIntent.OriginDestinationStopDetailsClickedIntent) intent).f7662a;
            ChaloNavigationManagerKt.e(chaloNavigationManager, new PremiumBusArgs.PremiumStopDetailsArgs(pBOriginDestinationAppModel2.c, pBOriginDestinationAppModel2.h, premiumBusPassLandingScreenArgs.f, pBOriginDestinationAppModel2.f7091a), null, 6);
            return;
        }
        if (intent.equals(PbPassPurchaseLandingScreenIntent.PBExploreAvailableRoutesClicked.f7663a)) {
            ChaloNavigationManagerKt.e(chaloNavigationManager, new WebViewArgs("https://chalo.com/mumbai/chalo-bus/routes", "", false, false), null, 6);
            return;
        }
        if (intent instanceof PbPassPurchaseLandingScreenIntent.PBRouteClicked) {
            RouteDetailsIntentModel routeDetailsIntentModel = new RouteDetailsIntentModel(null, null, Source.PB_PASS_PURCHASE_LANDING_SCREEN.getSourceName(), 174);
            try {
                Json json2 = ChaloJson.b;
                json2.getClass();
                strA = json2.a(RouteDetailsIntentModel.INSTANCE.serializer(), routeDetailsIntentModel);
            } catch (Exception unused2) {
                strA = null;
            }
            if (strA != null) {
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new RouteDetailsArgs(strA), null, "RouteDetailsTag", 2));
                return;
            }
            return;
        }
        if (intent.equals(PbPassPurchaseLandingScreenIntent.OnBackPressed.f7660a)) {
            ChaloNavigationManagerKt.c(chaloNavigationManager);
            return;
        }
        if (!(intent instanceof PbPassPurchaseLandingScreenIntent.RetryBtnClickIntent)) {
            throw new NoWhenBranchMatchedException();
        }
        PbPassPurchaseLandingScreenIntent.RetryBtnClickIntent retryBtnClickIntent = (PbPassPurchaseLandingScreenIntent.RetryBtnClickIntent) intent;
        E0(new ym0(retryBtnClickIntent, 18));
        Source source5 = retryBtnClickIntent.b;
        PassLandingFlowType passLandingFlowType4 = retryBtnClickIntent.f7666a;
        AnalyticsContractImplKt.b(this.s, "pb pass purchase retry btn clicked intent", source5, vo1.s("flowType", passLandingFlowType4.toString()), false, 24);
        if (passLandingFlowType4 instanceof PassLandingFlowType.WithConfigId) {
            BuildersKt.d(contextScope, null, null, new PbPassPurchaseLandingScreenComponent$handleWithConfigIdFlow$1(this, ((PassLandingFlowType.WithConfigId) passLandingFlowType4).b, null), 3);
        } else {
            if (!passLandingFlowType4.equals(PassLandingFlowType.WithoutConfigId.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new mq0(29));
        }
    }

    public final void P0(String str, String str2, String str3, String str4, PBOriginDestinationAppModel pBOriginDestinationAppModel) {
        Job job = this.z;
        if (job == null || !((AbstractCoroutine) job).isActive()) {
            this.z = BuildersKt.d(this.j, null, null, new PbPassPurchaseLandingScreenComponent$processODPairSelectionForPassPurchaseFlow$1(this, str, str2, str3, pBOriginDestinationAppModel, str4, null), 3);
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new PbPassPurchaseLandingScreenDataState(PassLandingFlowType.WithoutConfigId.INSTANCE, false, false, false, null, null, null, null, false, false, false);
    }
}
