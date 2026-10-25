package app.chalo.premiumbus.ui.productselection;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.features.onetimeoffer.GetOneTimeOfferConfigUseCase;
import app.chalo.features.onetimeoffer.IUserPreferencesDataStore;
import app.chalo.features.onetimeoffer.models.OneTimeOfferConfigAppModel;
import app.chalo.features.onetimeoffer.models.OneTimeOfferConfigAppModelKt;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.navigation.ProductBookingNavigationManager;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.premiumbus.compose.PricingEngineRuleExpiryBannerUIState;
import app.chalo.premiumbus.data.models.app.ApplicableRuleAppModel;
import app.chalo.premiumbus.domain.PricingEngineRuleExpiryBannerUIStateBuilder;
import app.chalo.premiumbus.domain.PricingEngineRuleExpiryBannerUIStateBuilderKt;
import app.chalo.premiumbus.domain.PricingEngineRuleExpiryCountdownController;
import app.chalo.premiumbus.domain.PricingEngineRuleExpiryTickerDelegate;
import app.chalo.premiumbus.managers.PremiumBusBookingNavigationHelper;
import app.chalo.premiumbus.managers.PremiumBusPurchaseInfoManager;
import app.chalo.premiumbus.ui.productselection.PBProductConfigUiModel;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionComponent;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionIntent;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PBProductCardUiState;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PbProductItemCardPlanHighlightUIState;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PremiumBusProductSelectionViewState;
import app.chalo.premiumbus.ui.productselection.compose.uistate.ProductLabelSpecs;
import app.chalo.premiumbus.ui.productselection.compose.uistate.ProductLabelUiState;
import app.chalo.premiumbus.ui.slotselection.OfferTagUIState;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsAppModel;
import app.chalo.productbooking.common.data.models.app.ProductConfigCompleteDetailsListAppModel;
import app.chalo.productbooking.common.data.models.app.ProductImageAppModel;
import app.chalo.productbooking.common.data.models.app.ProductImageType;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase;
import app.chalo.productbooking.common.domain.FetchProductConfigsForUiUseCase;
import app.chalo.productbooking.common.domain.GetCompleteProductConfigFromLocalCacheUseCase;
import app.chalo.productbooking.common.domain.StoreCompleteProductConfigLocallyUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.PassLandingFlowType;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.scenes.args.PremiumBusProductSelectionConfig;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.cardwithtextleftandrighticon.CardWithTextLeftAndRightIconUiState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.ChaloTextStyleHelper;
import app.chalo.uistate.text.StyledTextDataUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TitleSubtitleUiSpecs;
import app.chalo.uistate.text.TitleSubtitleUiState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import defpackage.du0;
import defpackage.et0;
import defpackage.ku0;
import defpackage.lu0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.FilteringSequence;
import kotlin.text.StringsKt;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionIntent;", "Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionDataState;", "Lapp/chalo/premiumbus/ui/productselection/compose/uistate/PremiumBusProductSelectionViewState;", "Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionSideEffect;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusProductSelectionComponent extends ChaloBaseStateMviComponent<PremiumBusProductSelectionIntent, PremiumBusProductSelectionDataState, PremiumBusProductSelectionViewState, PremiumBusProductSelectionSideEffect> {
    public final IReportProblemFeature A;
    public final ProductBookingNavigationManager B;
    public final BasicInfoContract C;
    public final PricingEngineRuleExpiryTickerDelegate D;
    public Job E;
    public Job F;
    public Job G;
    public List H;
    public final PremiumBusArgs.PremiumProductSelectionArgs k;
    public final ComponentContext l;
    public final FetchProductConfigsForUiUseCase m;
    public final FetchCompleteProductConfigByIdUseCase n;
    public final GetCompleteProductConfigFromLocalCacheUseCase o;
    public final StoreCompleteProductConfigLocallyUseCase p;
    public final PremiumBusPurchaseInfoManager q;
    public final PremiumBusBookingNavigationHelper r;
    public final GetOneTimeOfferConfigUseCase s;
    public final IUserPreferencesDataStore t;
    public final AnalyticsContract u;
    public final CityProvider v;
    public final UserProfileDetailsProvider w;
    public final StringProvider x;
    public final ChaloNavigationManager y;
    public final KotlinToastManager z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ui/productselection/PremiumBusProductSelectionComponent$Companion;", "", "", "RIDE_BASED_PASS_SUB_TYPE", "Ljava/lang/String;", "MAGIC_SUPER_PASS_SUB_TYPE", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public PremiumBusProductSelectionComponent(PremiumBusArgs.PremiumProductSelectionArgs premiumProductSelectionArgs, ComponentContext componentContext, FetchProductConfigsForUiUseCase fetchProductConfigsForUiUseCase, FetchCompleteProductConfigByIdUseCase fetchCompleteProductConfigByIdUseCase, GetCompleteProductConfigFromLocalCacheUseCase getCompleteProductConfigFromLocalCacheUseCase, StoreCompleteProductConfigLocallyUseCase storeCompleteProductConfigLocallyUseCase, PremiumBusPurchaseInfoManager premiumBusPurchaseInfoManager, PremiumBusBookingNavigationHelper premiumBusBookingNavigationHelper, GetOneTimeOfferConfigUseCase getOneTimeOfferConfigUseCase, IUserPreferencesDataStore iUserPreferencesDataStore, AnalyticsContract analyticsContract, CityProvider cityProvider, UserProfileDetailsProvider userProfileDetailsProvider, StringProvider stringProvider, ChaloNavigationManager chaloNavigationManager, KotlinToastManager kotlinToastManager, IReportProblemFeature iReportProblemFeature, ProductBookingNavigationManager productBookingNavigationManager, BasicInfoContract basicInfoContract, PricingEngineRuleExpiryTickerDelegate pricingEngineRuleExpiryTickerDelegate) {
        super(componentContext);
        this.k = premiumProductSelectionArgs;
        this.l = componentContext;
        this.m = fetchProductConfigsForUiUseCase;
        this.n = fetchCompleteProductConfigByIdUseCase;
        this.o = getCompleteProductConfigFromLocalCacheUseCase;
        this.p = storeCompleteProductConfigLocallyUseCase;
        this.q = premiumBusPurchaseInfoManager;
        this.r = premiumBusBookingNavigationHelper;
        this.s = getOneTimeOfferConfigUseCase;
        this.t = iUserPreferencesDataStore;
        this.u = analyticsContract;
        this.v = cityProvider;
        this.w = userProfileDetailsProvider;
        this.x = stringProvider;
        this.y = chaloNavigationManager;
        this.z = kotlinToastManager;
        this.A = iReportProblemFeature;
        this.B = productBookingNavigationManager;
        this.C = basicInfoContract;
        this.D = pricingEngineRuleExpiryTickerDelegate;
        String str = premiumProductSelectionArgs.c;
        PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType = null;
        Object objB = null;
        if (str != null) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str, PremiumBusProductPurchaseFlowType.INSTANCE.serializer());
            } catch (Exception unused) {
            }
            premiumBusProductPurchaseFlowType = (PremiumBusProductPurchaseFlowType) objB;
        }
        PremiumBusArgs.PremiumProductSelectionArgs premiumProductSelectionArgs2 = this.k;
        if (premiumProductSelectionArgs2.c == null || premiumBusProductPurchaseFlowType != null) {
            K0(new PremiumBusProductSelectionIntent.InitializationIntent(premiumProductSelectionArgs2.e, premiumBusProductPurchaseFlowType));
        } else {
            ChaloNavigationManagerKt.c(this.y);
        }
    }

    public static Pair H0(PBProductConfigUiModel pBProductConfigUiModel) {
        List list = pBProductConfigUiModel.l;
        Object obj = null;
        if (list == null) {
            return null;
        }
        FilteringSequence.AnonymousClass1 anonymousClass1 = new FilteringSequence.AnonymousClass1();
        while (anonymousClass1.hasNext()) {
            Object next = anonymousClass1.next();
            if (!StringsKt.F((String) ((Pair) next).getSecond())) {
                obj = next;
                break;
            }
        }
        return (Pair) obj;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x02dc -> B:67:0x02df). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object p0(app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionDataState r38, kotlin.coroutines.jvm.internal.ContinuationImpl r39) {
        /*
            Method dump skipped, instruction units count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionComponent.p0(app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionDataState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object G0(ContinuationImpl continuationImpl) {
        PremiumBusProductSelectionComponent$createCustomerSupportCardUiState$1 premiumBusProductSelectionComponent$createCustomerSupportCardUiState$1;
        ImageUIState imageUIState;
        ImageUIState imageUIState2;
        ChaloTextStyleHelper chaloTextStyleHelper;
        if (continuationImpl instanceof PremiumBusProductSelectionComponent$createCustomerSupportCardUiState$1) {
            premiumBusProductSelectionComponent$createCustomerSupportCardUiState$1 = (PremiumBusProductSelectionComponent$createCustomerSupportCardUiState$1) continuationImpl;
            int i = premiumBusProductSelectionComponent$createCustomerSupportCardUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusProductSelectionComponent$createCustomerSupportCardUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusProductSelectionComponent$createCustomerSupportCardUiState$1 = new PremiumBusProductSelectionComponent$createCustomerSupportCardUiState$1(this, continuationImpl);
            }
        } else {
            premiumBusProductSelectionComponent$createCustomerSupportCardUiState$1 = new PremiumBusProductSelectionComponent$createCustomerSupportCardUiState$1(this, continuationImpl);
        }
        Object objB = premiumBusProductSelectionComponent$createCustomerSupportCardUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusProductSelectionComponent$createCustomerSupportCardUiState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            ImageUIState imageUIState3 = new ImageUIState(IconType.IC_CUSTOMER_SUPPORT_PROFILE, (String) null, ChaloColorToken.Black.f9759a, new ImageUISize(ChaloThemeHelper.a().k), (UIContentScale) null, 0.0f, (UiEventHandler) null, 242);
            ImageUIState imageUIState4 = new ImageUIState(IconType.IC_ARROW_RIGHT, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
            premiumBusProductSelectionComponent$createCustomerSupportCardUiState$1.L$0 = imageUIState3;
            premiumBusProductSelectionComponent$createCustomerSupportCardUiState$1.L$1 = imageUIState4;
            ChaloTextStyleHelper chaloTextStyleHelper2 = ChaloTextStyleHelper.f10078a;
            premiumBusProductSelectionComponent$createCustomerSupportCardUiState$1.L$2 = chaloTextStyleHelper2;
            premiumBusProductSelectionComponent$createCustomerSupportCardUiState$1.label = 1;
            objB = this.x.b(StringEnum.CUSTOMER_SUPPORT, new Object[0], premiumBusProductSelectionComponent$createCustomerSupportCardUiState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            imageUIState = imageUIState3;
            imageUIState2 = imageUIState4;
            chaloTextStyleHelper = chaloTextStyleHelper2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChaloTextStyleHelper chaloTextStyleHelper3 = (ChaloTextStyleHelper) premiumBusProductSelectionComponent$createCustomerSupportCardUiState$1.L$2;
            ImageUIState imageUIState5 = (ImageUIState) premiumBusProductSelectionComponent$createCustomerSupportCardUiState$1.L$1;
            ImageUIState imageUIState6 = (ImageUIState) premiumBusProductSelectionComponent$createCustomerSupportCardUiState$1.L$0;
            ResultKt.b(objB);
            imageUIState = imageUIState6;
            imageUIState2 = imageUIState5;
            chaloTextStyleHelper = chaloTextStyleHelper3;
        }
        return new CardWithTextLeftAndRightIconUiState(imageUIState, ChaloTextStyleHelper.b(chaloTextStyleHelper, (String) objB, ChaloColorToken.AlmostBlackColor.f9756a, 0, null, null, null, null, 124), imageUIState2, new ku0(this, 3), 1);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x014d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0158  */
    /* JADX WARN: Code duplicated, block: B:76:0x0177 A[PHI: r1 r3 r4 r5
      0x0177: PHI (r1v20 java.lang.Object) = (r1v26 java.lang.Object), (r1v26 java.lang.Object), (r1v28 java.lang.Object) binds: [B:67:0x0156, B:69:0x015a, B:74:0x0173] A[DONT_GENERATE, DONT_INLINE]
      0x0177: PHI (r3v23 java.lang.Object) = (r3v31 java.lang.Object), (r3v31 java.lang.Object), (r3v33 java.lang.Object) binds: [B:67:0x0156, B:69:0x015a, B:74:0x0173] A[DONT_GENERATE, DONT_INLINE]
      0x0177: PHI (r4v9 java.util.Iterator) = (r4v15 java.util.Iterator), (r4v15 java.util.Iterator), (r4v17 java.util.Iterator) binds: [B:67:0x0156, B:69:0x015a, B:74:0x0173] A[DONT_GENERATE, DONT_INLINE]
      0x0177: PHI (r5v3 java.util.Collection) = (r5v4 java.util.Collection), (r5v4 java.util.Collection), (r5v8 java.util.Collection) binds: [B:67:0x0156, B:69:0x015a, B:74:0x0173] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x017a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x016a -> B:73:0x016d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0177 -> B:77:0x0178). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object I0(app.chalo.scenes.args.PremiumBusProductSelectionConfig r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionComponent.I0(app.chalo.scenes.args.PremiumBusProductSelectionConfig, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [int] */
    public final Object J0(String str, ContinuationImpl continuationImpl) {
        PremiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1 premiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1;
        String str2;
        ?? r8;
        if (continuationImpl instanceof PremiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1) {
            premiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1 = (PremiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1) continuationImpl;
            int i = premiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1 = new PremiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1(this, continuationImpl);
            }
        } else {
            premiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1 = new PremiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1(this, continuationImpl);
        }
        Object objV = premiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.label;
        boolean z = false;
        if (i2 == 0) {
            ResultKt.b(objV);
            Flow flowA = this.t.a(str);
            premiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.L$0 = str;
            premiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.label = 1;
            objV = FlowKt.v(flowA, premiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1);
            if (objV != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str = (String) premiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.L$0;
            ResultKt.b(objV);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = premiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.I$0;
            str2 = (String) premiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.L$0;
            ResultKt.b(objV);
            r8 = i3;
        }
        if (OneTimeOfferConfigAppModelKt.a((OneTimeOfferConfigAppModel) objV, str2) && r8 != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
        Boolean bool = (Boolean) objV;
        ?? BooleanValue = bool != null ? bool.booleanValue() : 0;
        premiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.L$0 = str;
        premiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.I$0 = BooleanValue;
        premiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.label = 2;
        Object objA = this.s.a(premiumBusProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1);
        if (objA != coroutineSingletons) {
            str2 = str;
            r8 = BooleanValue;
            objV = objA;
            if (OneTimeOfferConfigAppModelKt.a((OneTimeOfferConfigAppModel) objV, str2)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return coroutineSingletons;
    }

    public final void K0(PremiumBusProductSelectionIntent premiumBusProductSelectionIntent) {
        C0(premiumBusProductSelectionIntent);
        if (premiumBusProductSelectionIntent instanceof PremiumBusProductSelectionIntent.InitializationIntent) {
            PremiumBusProductSelectionIntent.InitializationIntent initializationIntent = (PremiumBusProductSelectionIntent.InitializationIntent) premiumBusProductSelectionIntent;
            L0(initializationIntent.f7695a, initializationIntent.b, false);
            return;
        }
        boolean z = premiumBusProductSelectionIntent instanceof PremiumBusProductSelectionIntent.ProductTypeSelectedIntent;
        ContextScope contextScope = this.j;
        if (!z) {
            if (premiumBusProductSelectionIntent instanceof PremiumBusProductSelectionIntent.ReportProblemClickedIntent) {
                BuildersKt.d(contextScope, null, null, new PremiumBusProductSelectionComponent$handleReportProblemClickedIntent$1(this, null), 3);
                return;
            }
            if (premiumBusProductSelectionIntent instanceof PremiumBusProductSelectionIntent.FirstElementScrolledToTopIntent) {
                E0(new et0((PremiumBusProductSelectionIntent.FirstElementScrolledToTopIntent) premiumBusProductSelectionIntent, 16));
                return;
            }
            boolean zEquals = premiumBusProductSelectionIntent.equals(PremiumBusProductSelectionIntent.ToolBarEditBtnClickIntent.f7699a);
            ChaloNavigationManager chaloNavigationManager = this.y;
            if (zEquals) {
                ChaloNavigationManagerKt.e(chaloNavigationManager, new PremiumBusArgs.PremiumBusPassLandingScreenArgs(PassLandingFlowType.WithoutConfigId.INSTANCE, Source.PREMIUM_BUS_PRODUCT_SELECTION_SCREEN, (String) null, 12), null, 6);
                return;
            } else {
                if (!premiumBusProductSelectionIntent.equals(PremiumBusProductSelectionIntent.OnBackClickIntent.f7696a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ChaloNavigationManagerKt.c(chaloNavigationManager);
                return;
            }
        }
        PremiumBusProductSelectionIntent.ProductTypeSelectedIntent productTypeSelectedIntent = (PremiumBusProductSelectionIntent.ProductTypeSelectedIntent) premiumBusProductSelectionIntent;
        E0(new et0(productTypeSelectedIntent, 15));
        Job job = this.F;
        if (job == null || !((AbstractCoroutine) job).isActive()) {
            LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("configId", productTypeSelectedIntent.f7697a), new Pair("productType", productTypeSelectedIntent.b), new Pair("productSubType", productTypeSelectedIntent.c));
            String str = this.k.f;
            if (str != null) {
                if (StringsKt.F(str)) {
                    str = null;
                }
                if (str != null) {
                    linkedHashMapK.put("attribution type", str);
                }
            }
            AnalyticsContract.DefaultImpls.a(this.u, "product hook product selection screen clicked", Source.PREMIUM_BUS_PRODUCT_SELECTION_SCREEN.getSourceName(), linkedHashMapK, null, false, 24);
            E0(new du0(7));
            this.F = BuildersKt.d(contextScope, null, null, new PremiumBusProductSelectionComponent$handleProductTypeSelectedIntent$3(this, productTypeSelectedIntent, null), 3);
        }
    }

    public final void L0(PremiumBusProductSelectionConfig premiumBusProductSelectionConfig, PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType, boolean z) {
        if (z) {
            Job job = this.E;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            this.H = null;
        } else {
            Job job2 = this.E;
            if (job2 != null && ((AbstractCoroutine) job2).isActive()) {
                return;
            }
            List list = this.H;
            if (list != null && !list.isEmpty()) {
                return;
            }
        }
        if (premiumBusProductPurchaseFlowType != null) {
            this.r.X(premiumBusProductPurchaseFlowType);
        }
        E0(new lu0(0, premiumBusProductPurchaseFlowType, premiumBusProductSelectionConfig));
        this.E = BuildersKt.d(this.j, null, null, new PremiumBusProductSelectionComponent$requestProducts$3(this, premiumBusProductSelectionConfig, null), 3);
    }

    public final void M0() {
        this.D.a(this.j, new PremiumBusProductSelectionComponent$syncExpiryTicker$1(1, this, PremiumBusProductSelectionComponent.class, "expiryStatesForCurrentProducts", "expiryStatesForCurrentProducts(J)Ljava/util/List;", 0), new PremiumBusProductSelectionComponent$syncExpiryTicker$2(1, this, PremiumBusProductSelectionComponent.class, "triggerProductsRefetchAfterRuleExpiry", "triggerProductsRefetchAfterRuleExpiry()V", 4));
    }

    /* JADX WARN: Code duplicated, block: B:73:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:79:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object N0(final PBProductConfigUiModel pBProductConfigUiModel, ContinuationImpl continuationImpl) {
        PremiumBusProductSelectionComponent$toPBProductCardUiState$1 premiumBusProductSelectionComponent$toPBProductCardUiState$1;
        UIFontWeight uIFontWeight;
        DividerUIState dividerUIState;
        ButtonUIState buttonUIState;
        TextUIState.StyledTextUIState styledTextUIState;
        ButtonUIState buttonUIState2;
        Object obj;
        ButtonUIState buttonUIState3;
        OfferTagUIState offerTagUIState;
        PbProductItemCardPlanHighlightUIState pbProductItemCardPlanHighlightUIState;
        final PBProductConfigUiModel pBProductConfigUiModel2;
        TitleSubtitleUiState titleSubtitleUiState;
        ProductLabelUiState productLabelUiState;
        PricingEngineRuleExpiryBannerUIState pricingEngineRuleExpiryBannerUIState;
        ApplicableRuleAppModel applicableRuleAppModel;
        Long l;
        TitleSubtitleUiState titleSubtitleUiState2;
        DividerUIState dividerUIState2;
        Object obj2;
        PbProductItemCardPlanHighlightUIState pbProductItemCardPlanHighlightUIState2;
        ProductLabelUiState productLabelUiState2;
        ApplicableRuleAppModel applicableRuleAppModel2;
        String str;
        String str2;
        Iterator it;
        Object next;
        ProductImageAppModel productImageAppModel;
        ImageUrlUIState imageUrlUIState;
        if (continuationImpl instanceof PremiumBusProductSelectionComponent$toPBProductCardUiState$1) {
            premiumBusProductSelectionComponent$toPBProductCardUiState$1 = (PremiumBusProductSelectionComponent$toPBProductCardUiState$1) continuationImpl;
            int i = premiumBusProductSelectionComponent$toPBProductCardUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumBusProductSelectionComponent$toPBProductCardUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumBusProductSelectionComponent$toPBProductCardUiState$1 = new PremiumBusProductSelectionComponent$toPBProductCardUiState$1(this, continuationImpl);
            }
        } else {
            premiumBusProductSelectionComponent$toPBProductCardUiState$1 = new PremiumBusProductSelectionComponent$toPBProductCardUiState$1(this, continuationImpl);
        }
        PremiumBusProductSelectionComponent$toPBProductCardUiState$1 premiumBusProductSelectionComponent$toPBProductCardUiState$2 = premiumBusProductSelectionComponent$toPBProductCardUiState$1;
        Object obj3 = premiumBusProductSelectionComponent$toPBProductCardUiState$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumBusProductSelectionComponent$toPBProductCardUiState$2.label;
        if (i2 == 0) {
            ResultKt.b(obj3);
            Pair pairH0 = H0(pBProductConfigUiModel);
            String str3 = pBProductConfigUiModel.b;
            String str4 = pBProductConfigUiModel.e;
            String str5 = pBProductConfigUiModel.g;
            TitleSubtitleUiSpecs titleSubtitleUiSpecs = new TitleSubtitleUiSpecs(ChaloThemeHelper.a().d, 1);
            String str6 = pBProductConfigUiModel.c;
            UITextOverflow uITextOverflow = UITextOverflow.Ellipsis;
            ChaloTextStyleHelper chaloTextStyleHelper = ChaloTextStyleHelper.f10078a;
            ChaloColorToken.Black black = ChaloColorToken.Black.f9759a;
            TextUIState.ChaloTextUIState chaloTextUIStateE = ChaloTextStyleHelper.e(chaloTextStyleHelper, str6, black, null, null, uITextOverflow, 56);
            int length = str3.length();
            ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
            TitleSubtitleUiState titleSubtitleUiState3 = new TitleSubtitleUiState(titleSubtitleUiSpecs, chaloTextUIStateE, length > 0 ? ChaloTextStyleHelper.b(chaloTextStyleHelper, str3, shadyGray, 2, null, null, null, null, 120) : null, null, 8);
            ProductLabelUiState productLabelUiState3 = (!pBProductConfigUiModel.j.isEmpty() || (str2 = pBProductConfigUiModel.d) == null) ? null : new ProductLabelUiState(ChaloTextStyleHelper.h(str2, ChaloColorToken.OrangePrimary.f9835a, null, 124), new ProductLabelSpecs(new ChaloPadding(ChaloThemeHelper.a().e, 0.0f, 2), null, 6));
            if ((str5 == null || str5.length() == 0) && str4 == null) {
                uIFontWeight = null;
                dividerUIState = null;
            } else {
                uIFontWeight = null;
                dividerUIState = new DividerUIState(ChaloThemeHelper.a().b, ChaloColorToken.LightGray.f9814a, null, 4);
            }
            String str7 = pBProductConfigUiModel.f;
            TextUIState.ChaloTextUIState chaloTextUIStateH = str7 != null ? ChaloTextStyleHelper.h(str7, shadyGray, uIFontWeight, 120) : null;
            if (str5 != null) {
                String strE0 = StringsKt.e0(str5, "/", str5);
                String strH0 = StringsKt.h0(str5, "/");
                UITextStyle uITextStyle = UITextStyle.DisplayMedium;
                UIFontWeight uIFontWeight2 = UIFontWeight.Bold;
                buttonUIState = null;
                styledTextUIState = new TextUIState.StyledTextUIState(CollectionsKt.S(new StyledTextDataUIState(strH0, black, uIFontWeight2, uITextStyle, null, null, null, 1008), new StyledTextDataUIState(strE0, black, uIFontWeight2, UITextStyle.TitleLarge, null, null, null, 1008)), null, null, 30);
            } else {
                buttonUIState = null;
                styledTextUIState = null;
            }
            if (str4 != null) {
                final int i3 = 0;
                buttonUIState2 = new ButtonUIState(ChaloTextStyleHelper.b(chaloTextStyleHelper, str4, black, 1, null, UIFontWeight.SemiBold, null, uITextOverflow, 40), false, UIShape.d, null, null, UiEventHandler.Companion.a(new Function0(this) { // from class: mu0
                    public final /* synthetic */ PremiumBusProductSelectionComponent b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                PBProductConfigUiModel pBProductConfigUiModel3 = pBProductConfigUiModel;
                                this.b.K0(new PremiumBusProductSelectionIntent.ProductTypeSelectedIntent(pBProductConfigUiModel3.f7691a, pBProductConfigUiModel3.h, pBProductConfigUiModel3.i));
                                break;
                            default:
                                PBProductConfigUiModel pBProductConfigUiModel4 = pBProductConfigUiModel;
                                this.b.K0(new PremiumBusProductSelectionIntent.ProductTypeSelectedIntent(pBProductConfigUiModel4.f7691a, pBProductConfigUiModel4.h, pBProductConfigUiModel4.i));
                                break;
                        }
                        return Unit.f17538a;
                    }
                }), 0.0f, null, 218);
            } else {
                buttonUIState2 = buttonUIState;
            }
            String str8 = pBProductConfigUiModel.k;
            PbProductItemCardPlanHighlightUIState pbProductItemCardPlanHighlightUIState3 = new PbProductItemCardPlanHighlightUIState(buttonUIState2, chaloTextUIStateH, styledTextUIState, str8 != null ? new TextUIState.ChaloTextUIState(StringsKt.h0(str8, "/"), UITextStyle.BodyMedium, shadyGray, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, UITextDecoration.LineThrough, (UITextOverflow) null, (UIFontStyle) null, (String) null, 7608) : buttonUIState);
            Object offerTagUIState2 = (pairH0 == 0 || (str = (String) pairH0.e()) == null) ? buttonUIState : new OfferTagUIState(new TextUIState.ChaloTextUIState(str, UITextStyle.LabelSmall, ChaloColorToken.DiscountPercentTextGreen.f9792a, 0, (UITextAlign) null, UIFontWeight.SemiBold, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8120), new ImageUIState(IconType.IC_OFFER_GREEN, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), 9);
            Object obj4 = (pairH0 == 0 || (applicableRuleAppModel2 = (ApplicableRuleAppModel) pairH0.d()) == null) ? buttonUIState : applicableRuleAppModel2.i;
            if (pairH0 == 0 || (applicableRuleAppModel = (ApplicableRuleAppModel) pairH0.d()) == null || (l = applicableRuleAppModel.i) == null) {
                obj = obj4;
                buttonUIState3 = buttonUIState;
                offerTagUIState = offerTagUIState2;
                pbProductItemCardPlanHighlightUIState = pbProductItemCardPlanHighlightUIState3;
                pBProductConfigUiModel2 = pBProductConfigUiModel;
                titleSubtitleUiState = titleSubtitleUiState3;
                productLabelUiState = productLabelUiState3;
                pricingEngineRuleExpiryBannerUIState = buttonUIState3;
            } else {
                long jLongValue = l.longValue();
                long j = this.C.j();
                premiumBusProductSelectionComponent$toPBProductCardUiState$2.L$0 = pBProductConfigUiModel;
                premiumBusProductSelectionComponent$toPBProductCardUiState$2.L$1 = titleSubtitleUiState3;
                premiumBusProductSelectionComponent$toPBProductCardUiState$2.L$2 = productLabelUiState3;
                premiumBusProductSelectionComponent$toPBProductCardUiState$2.L$3 = dividerUIState;
                premiumBusProductSelectionComponent$toPBProductCardUiState$2.L$4 = pbProductItemCardPlanHighlightUIState3;
                premiumBusProductSelectionComponent$toPBProductCardUiState$2.L$5 = offerTagUIState2;
                premiumBusProductSelectionComponent$toPBProductCardUiState$2.L$6 = obj4;
                premiumBusProductSelectionComponent$toPBProductCardUiState$2.label = 1;
                ProductLabelUiState productLabelUiState4 = productLabelUiState3;
                ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().f, ChaloThemeHelper.a().g, ChaloThemeHelper.a().g, ChaloThemeHelper.a().f);
                UIShape uIShape = ChaloThemeHelper.d.f1923a;
                PricingEngineRuleExpiryBannerUIStateBuilder pricingEngineRuleExpiryBannerUIStateBuilder = this.D.b;
                TimeUtilsContract timeUtilsContract = pricingEngineRuleExpiryBannerUIStateBuilder.f7223a;
                StringProvider stringProvider = pricingEngineRuleExpiryBannerUIStateBuilder.b;
                obj = obj4;
                buttonUIState3 = null;
                Object objA = PricingEngineRuleExpiryBannerUIStateBuilderKt.a(jLongValue, j, timeUtilsContract, stringProvider, chaloPadding, uIShape, premiumBusProductSelectionComponent$toPBProductCardUiState$2);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                pBProductConfigUiModel2 = pBProductConfigUiModel;
                titleSubtitleUiState2 = titleSubtitleUiState3;
                obj3 = objA;
                dividerUIState2 = dividerUIState;
                obj2 = offerTagUIState2;
                pbProductItemCardPlanHighlightUIState2 = pbProductItemCardPlanHighlightUIState3;
                productLabelUiState2 = productLabelUiState4;
            }
            Long l2 = obj;
            it = pBProductConfigUiModel2.j.iterator();
            do {
                if (it.hasNext()) {
                    next = buttonUIState3;
                    break;
                }
                next = it.next();
            } while (((ProductImageAppModel) next).b != ProductImageType.PASS_CARD_INFO_URL);
            productImageAppModel = (ProductImageAppModel) next;
            if (productImageAppModel != null) {
                imageUrlUIState = new ImageUrlUIState(productImageAppModel.f8224a, null, UIContentScale.FillWidth, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
            } else {
                imageUrlUIState = buttonUIState3;
            }
            final int i4 = 1;
            return new PBProductCardUiState(imageUrlUIState, productLabelUiState, titleSubtitleUiState, dividerUIState, pbProductItemCardPlanHighlightUIState, offerTagUIState, l2, pricingEngineRuleExpiryBannerUIState, UiEventHandler.Companion.a(new Function0(this) { // from class: mu0
                public final /* synthetic */ PremiumBusProductSelectionComponent b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i4) {
                        case 0:
                            PBProductConfigUiModel pBProductConfigUiModel3 = pBProductConfigUiModel2;
                            this.b.K0(new PremiumBusProductSelectionIntent.ProductTypeSelectedIntent(pBProductConfigUiModel3.f7691a, pBProductConfigUiModel3.h, pBProductConfigUiModel3.i));
                            break;
                        default:
                            PBProductConfigUiModel pBProductConfigUiModel4 = pBProductConfigUiModel2;
                            this.b.K0(new PremiumBusProductSelectionIntent.ProductTypeSelectedIntent(pBProductConfigUiModel4.f7691a, pBProductConfigUiModel4.h, pBProductConfigUiModel4.i));
                            break;
                    }
                    return Unit.f17538a;
                }
            }));
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj = (Long) premiumBusProductSelectionComponent$toPBProductCardUiState$2.L$6;
        obj2 = (OfferTagUIState) premiumBusProductSelectionComponent$toPBProductCardUiState$2.L$5;
        pbProductItemCardPlanHighlightUIState2 = (PbProductItemCardPlanHighlightUIState) premiumBusProductSelectionComponent$toPBProductCardUiState$2.L$4;
        dividerUIState2 = (DividerUIState) premiumBusProductSelectionComponent$toPBProductCardUiState$2.L$3;
        productLabelUiState2 = (ProductLabelUiState) premiumBusProductSelectionComponent$toPBProductCardUiState$2.L$2;
        titleSubtitleUiState2 = (TitleSubtitleUiState) premiumBusProductSelectionComponent$toPBProductCardUiState$2.L$1;
        pBProductConfigUiModel2 = (PBProductConfigUiModel) premiumBusProductSelectionComponent$toPBProductCardUiState$2.L$0;
        ResultKt.b(obj3);
        buttonUIState3 = null;
        offerTagUIState = obj2;
        dividerUIState = dividerUIState2;
        productLabelUiState = productLabelUiState2;
        titleSubtitleUiState = titleSubtitleUiState2;
        pricingEngineRuleExpiryBannerUIState = (PricingEngineRuleExpiryBannerUIState) obj3;
        pbProductItemCardPlanHighlightUIState = pbProductItemCardPlanHighlightUIState2;
        Long l3 = obj;
        it = pBProductConfigUiModel2.j.iterator();
        do {
            if (it.hasNext()) {
                next = buttonUIState3;
                break;
            }
            next = it.next();
        } while (((ProductImageAppModel) next).b != ProductImageType.PASS_CARD_INFO_URL);
        productImageAppModel = (ProductImageAppModel) next;
        if (productImageAppModel != null) {
            imageUrlUIState = new ImageUrlUIState(productImageAppModel.f8224a, null, UIContentScale.FillWidth, null, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
        } else {
            imageUrlUIState = buttonUIState3;
        }
        final int i5 = 1;
        return new PBProductCardUiState(imageUrlUIState, productLabelUiState, titleSubtitleUiState, dividerUIState, pbProductItemCardPlanHighlightUIState, offerTagUIState, l3, pricingEngineRuleExpiryBannerUIState, UiEventHandler.Companion.a(new Function0(this) { // from class: mu0
            public final /* synthetic */ PremiumBusProductSelectionComponent b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        PBProductConfigUiModel pBProductConfigUiModel3 = pBProductConfigUiModel2;
                        this.b.K0(new PremiumBusProductSelectionIntent.ProductTypeSelectedIntent(pBProductConfigUiModel3.f7691a, pBProductConfigUiModel3.h, pBProductConfigUiModel3.i));
                        break;
                    default:
                        PBProductConfigUiModel pBProductConfigUiModel4 = pBProductConfigUiModel2;
                        this.b.K0(new PremiumBusProductSelectionIntent.ProductTypeSelectedIntent(pBProductConfigUiModel4.f7691a, pBProductConfigUiModel4.h, pBProductConfigUiModel4.i));
                        break;
                }
                return Unit.f17538a;
            }
        }));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new PremiumBusProductSelectionDataState(false, false, null, false, null, null, true, new PremiumBusProductSelectionConfig(false, 7), null);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void y0() {
        ProductConfigCompleteDetailsListAppModel productConfigCompleteDetailsListAppModelK0;
        ProductConfigCompleteDetailsAppModel productConfigCompleteDetailsAppModel;
        String str = ((PremiumBusProductSelectionDataState) this.f.getValue()).i;
        if (str == null || (productConfigCompleteDetailsListAppModelK0 = this.q.getO()) == null || (productConfigCompleteDetailsAppModel = productConfigCompleteDetailsListAppModelK0.f8205a) == null || !Intrinsics.d(productConfigCompleteDetailsAppModel.f8203a, str)) {
            return;
        }
        M0();
        Job job = this.G;
        if (job == null || !((AbstractCoroutine) job).isActive()) {
            this.G = BuildersKt.d(this.j, null, null, new PremiumBusProductSelectionComponent$onViewStateActive$1(this, str, productConfigCompleteDetailsAppModel, null), 3);
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void z0() {
        PricingEngineRuleExpiryCountdownController pricingEngineRuleExpiryCountdownController = this.D.f7229a;
        Job job = pricingEngineRuleExpiryCountdownController.b;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        pricingEngineRuleExpiryCountdownController.b = null;
    }
}
