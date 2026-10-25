package app.chalo.instantticket.ui.faredetails;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.ResolveSupportPolicyUseCase;
import app.chalo.config.CountryPhoneNumberConfig;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.constants.Source;
import app.chalo.domain.GetCurrentCityPhoneNumberConfigUseCase;
import app.chalo.domain.PhoneNumberValidationResult;
import app.chalo.domain.ProductPurchaseMinProfileDecision;
import app.chalo.domain.ProductPurchaseMinProfileDecisionHelper;
import app.chalo.domain.ResolveProductPurchaseMinProfileDecisionUseCase;
import app.chalo.domain.ValidatePhoneNumberUseCase;
import app.chalo.features.checkout.CheckoutAnalyticsData;
import app.chalo.features.checkout.CheckoutIntentModel;
import app.chalo.features.checkout.CheckoutIntentModelHelperKt;
import app.chalo.features.checkout.CheckoutOrderData;
import app.chalo.features.checkout.CheckoutPaymentData;
import app.chalo.features.checkout.CheckoutPaymentProviderVpaConfig;
import app.chalo.features.checkout.CheckoutProductData;
import app.chalo.features.checkout.CheckoutProductType;
import app.chalo.features.checkout.CheckoutUserDetails;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.instantticket.config.datastore.ProductBookingDataStore;
import app.chalo.instantticket.config.models.InstantTicketConfiguration;
import app.chalo.instantticket.data.model.api.request.FareRequestFilters;
import app.chalo.instantticket.data.model.app.request.PassengerDetailData;
import app.chalo.instantticket.data.model.app.response.FareBreakupAppModel;
import app.chalo.instantticket.data.model.app.response.FareBreakupOperationType;
import app.chalo.instantticket.data.model.app.response.PassengerDetailAppModel;
import app.chalo.instantticket.data.model.app.response.PassengerSelectionPolicy;
import app.chalo.instantticket.data.model.app.response.SeatLimitAppModel;
import app.chalo.instantticket.data.model.ui.FareBreakupUiModel;
import app.chalo.instantticket.data.model.ui.PassengerFareDetailsUiModel;
import app.chalo.instantticket.domain.CreateInstantTicketOrderUseCase;
import app.chalo.instantticket.domain.FetchMobileTicketFareUseCase;
import app.chalo.instantticket.domain.ValidateInstantTicketFareUseCase;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsIntent;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsSideEffect;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsViewState;
import app.chalo.login.userprofiling.hookorchestrator.UserProfilingHookSlot;
import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.models.ordercreation.OrderBookingInfoAppModel;
import app.chalo.models.ordercreation.OrderPaymentProviderCustomerDetailsAppModel;
import app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.ondc.domain.CompleteOndcPurchaseAndStoreTicketUseCase;
import app.chalo.ondc.domain.CreateOndcBookingUseCase;
import app.chalo.ondc.domain.CreateOndcOrderUseCase;
import app.chalo.ondc.model.api.request.OndcTicketTripDetails;
import app.chalo.ondc.model.app.response.OndcBookingAppModel;
import app.chalo.ondc.model.app.response.OndcBookingUiModel;
import app.chalo.ondc.model.app.response.OndcFareBreakupUiModel;
import app.chalo.premiumbus.ProductBookingNavigation;
import app.chalo.premiumbus.helper.InstantTicketConfigHelper;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.productbooking.common.data.models.app.FareDetailsRouteData;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.productbooking.common.ui.FareBreakupOperationUIProperties;
import app.chalo.productbooking.common.ui.FareBreakupOperationUIPropertiesKt;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.ResultStateKeeperMeta;
import app.chalo.resultstatemanager.ResultStateRecoveredData;
import app.chalo.resultstatemanager.checkout.CheckoutResultState;
import app.chalo.resultstatemanager.checkout.CheckoutResultStateManager;
import app.chalo.resultstatemanager.minprofileupdate.MinProfileUpdateResultStateManager;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.CheckoutPaymentMainArgs;
import app.chalo.scenes.args.FareDetailsArgs;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.LoginOptionsArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.usecase.CheckIsUserLoggedInUseCase;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.KUUID;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.statekeeper.StateKeeper;
import defpackage.n10;
import defpackage.p10;
import defpackage.qi;
import defpackage.qp;
import defpackage.s20;
import defpackage.ui;
import defpackage.vo1;
import defpackage.w20;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/FareDetailsComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsViewState;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsSideEffect;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FareDetailsComponent extends ChaloBaseStateMviComponent<FareDetailsIntent, FareDetailsViewState, FareDetailsViewState, FareDetailsSideEffect> {
    public final CheckoutResultStateManager A;
    public final InstantTicketConfigHelper B;
    public final CompleteOndcPurchaseAndStoreTicketUseCase C;
    public final ResolveProductPurchaseMinProfileDecisionUseCase D;
    public final MinProfileUpdateResultStateManager E;
    public final ProductPurchaseMinProfileDecisionHelper F;
    public final ResolveSupportPolicyUseCase G;
    public ProductBookingNavigation H;
    public boolean I;
    public boolean J;
    public Job K;
    public String L;
    public FareDetailsData M;
    public Map N;
    public Map O;
    public Object P;
    public final CurrencyRoundOffLogic Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public String V;
    public boolean W;
    public final FetchMobileTicketFareUseCase k;
    public final ValidateInstantTicketFareUseCase l;
    public final StringProvider m;
    public final CurrencyFeature n;
    public final ProductBookingDataStore o;
    public final CreateInstantTicketOrderUseCase p;
    public final AnalyticsContract q;
    public final CheckIsUserLoggedInUseCase r;
    public final TimeUtilsContract s;
    public final UserProfileDetailsProvider t;
    public final CreateOndcBookingUseCase u;
    public final CreateOndcOrderUseCase v;
    public final GetCurrentCityPhoneNumberConfigUseCase w;
    public final ValidatePhoneNumberUseCase x;
    public final ChaloNavigationManager y;
    public final KotlinToastManager z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3906a;

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
            f3906a = iArr;
        }
    }

    public FareDetailsComponent(FareDetailsArgs fareDetailsArgs, ComponentContext componentContext, FetchMobileTicketFareUseCase fetchMobileTicketFareUseCase, ValidateInstantTicketFareUseCase validateInstantTicketFareUseCase, StringProvider stringProvider, CurrencyFeature currencyFeature, ProductBookingDataStore productBookingDataStore, CreateInstantTicketOrderUseCase createInstantTicketOrderUseCase, AnalyticsContract analyticsContract, CheckIsUserLoggedInUseCase checkIsUserLoggedInUseCase, TimeUtilsContract timeUtilsContract, UserProfileDetailsProvider userProfileDetailsProvider, CreateOndcBookingUseCase createOndcBookingUseCase, CreateOndcOrderUseCase createOndcOrderUseCase, GetCurrentCityPhoneNumberConfigUseCase getCurrentCityPhoneNumberConfigUseCase, ValidatePhoneNumberUseCase validatePhoneNumberUseCase, ChaloNavigationManager chaloNavigationManager, KotlinToastManager kotlinToastManager, CheckoutResultStateManager checkoutResultStateManager, InstantTicketConfigHelper instantTicketConfigHelper, CompleteOndcPurchaseAndStoreTicketUseCase completeOndcPurchaseAndStoreTicketUseCase, ResolveProductPurchaseMinProfileDecisionUseCase resolveProductPurchaseMinProfileDecisionUseCase, MinProfileUpdateResultStateManager minProfileUpdateResultStateManager, ProductPurchaseMinProfileDecisionHelper productPurchaseMinProfileDecisionHelper, ResolveSupportPolicyUseCase resolveSupportPolicyUseCase) {
        super(componentContext);
        this.k = fetchMobileTicketFareUseCase;
        this.l = validateInstantTicketFareUseCase;
        this.m = stringProvider;
        this.n = currencyFeature;
        this.o = productBookingDataStore;
        this.p = createInstantTicketOrderUseCase;
        this.q = analyticsContract;
        this.r = checkIsUserLoggedInUseCase;
        this.s = timeUtilsContract;
        this.t = userProfileDetailsProvider;
        this.u = createOndcBookingUseCase;
        this.v = createOndcOrderUseCase;
        this.w = getCurrentCityPhoneNumberConfigUseCase;
        this.x = validatePhoneNumberUseCase;
        this.y = chaloNavigationManager;
        this.z = kotlinToastManager;
        this.A = checkoutResultStateManager;
        this.B = instantTicketConfigHelper;
        this.C = completeOndcPurchaseAndStoreTicketUseCase;
        this.D = resolveProductPurchaseMinProfileDecisionUseCase;
        this.E = minProfileUpdateResultStateManager;
        this.F = productPurchaseMinProfileDecisionHelper;
        this.G = resolveSupportPolicyUseCase;
        this.M = new FareDetailsData(new FareDetailsRouteData("", "", ChaloTransitMode.BUS), new ProductBookingStopDetails("", "", null), new ProductBookingStopDetails("", "", null), EmptyList.f17557a, null, null, null, null, null, 4080);
        this.N = new LinkedHashMap();
        this.O = MapsKt.d();
        this.P = MapsKt.d();
        this.Q = CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING;
        Json json = ChaloJson.b;
        String str = fareDetailsArgs.b;
        json.getClass();
        Z0(new FareDetailsIntent.InitialIntent((FareDetailsData) json.b(str, FareDetailsData.INSTANCE.serializer()), (FareDetailsScreenType) json.b(fareDetailsArgs.d, FareDetailsScreenType.INSTANCE.serializer()), (ProductBookingNavigation) json.b(fareDetailsArgs.c, ProductBookingNavigation.INSTANCE.serializer()), fareDetailsArgs.e));
        StateKeeper b = componentContext.getB();
        ResultStateKeeperMeta.Companion companion = ResultStateKeeperMeta.INSTANCE;
        ResultStateRecoveredData resultStateRecoveredDataA = checkoutResultStateManager.a("FareDetails_SK_Key", b, companion.serializer(), companion.serializer(), new s20(this, 7));
        if (resultStateRecoveredDataA != null) {
            this.K = BuildersKt.d(this.j, null, null, new FareDetailsComponent$1$1(this, resultStateRecoveredDataA, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        if (r13 == r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cf, code lost:
    
        if (r13 == r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ea, code lost:
    
        if (r13 == r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0114, code lost:
    
        if (r13 == r2) goto L61;
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
    public static final java.lang.Object F0(app.chalo.instantticket.ui.faredetails.FareDetailsComponent r11, java.lang.String r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.instantticket.ui.faredetails.FareDetailsComponent.F0(app.chalo.instantticket.ui.faredetails.FareDetailsComponent, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object G0(FareDetailsComponent fareDetailsComponent, OndcBookingAppModel ondcBookingAppModel, ContinuationImpl continuationImpl) {
        FareDetailsComponent$convertToOndcUiModel$1 fareDetailsComponent$convertToOndcUiModel$1;
        ArrayList arrayList;
        Long l;
        fareDetailsComponent.getClass();
        CurrencyFeature currencyFeature = fareDetailsComponent.n;
        if (continuationImpl instanceof FareDetailsComponent$convertToOndcUiModel$1) {
            fareDetailsComponent$convertToOndcUiModel$1 = (FareDetailsComponent$convertToOndcUiModel$1) continuationImpl;
            int i = fareDetailsComponent$convertToOndcUiModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fareDetailsComponent$convertToOndcUiModel$1.label = i - Integer.MIN_VALUE;
            } else {
                fareDetailsComponent$convertToOndcUiModel$1 = new FareDetailsComponent$convertToOndcUiModel$1(fareDetailsComponent, continuationImpl);
            }
        } else {
            fareDetailsComponent$convertToOndcUiModel$1 = new FareDetailsComponent$convertToOndcUiModel$1(fareDetailsComponent, continuationImpl);
        }
        Object objB = fareDetailsComponent$convertToOndcUiModel$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fareDetailsComponent$convertToOndcUiModel$1.label;
        int i3 = 0;
        if (i2 == 0) {
            ResultKt.b(objB);
            fareDetailsComponent$convertToOndcUiModel$1.L$0 = ondcBookingAppModel;
            fareDetailsComponent$convertToOndcUiModel$1.label = 1;
            objB = fareDetailsComponent.m.b(StringEnum.TOTAL_FARE, new Object[0], fareDetailsComponent$convertToOndcUiModel$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ondcBookingAppModel = (OndcBookingAppModel) fareDetailsComponent$convertToOndcUiModel$1.L$0;
            ResultKt.b(objB);
        }
        int i4 = ondcBookingAppModel.c;
        List list = ondcBookingAppModel.b;
        OndcFareBreakupUiModel ondcFareBreakupUiModel = new OndcFareBreakupUiModel(ChaloColorTokenKt.c(ChaloColorToken.Black.f9759a), (String) objB, currencyFeature.a(i4, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING));
        String strA = null;
        if (list != null) {
            List<FareBreakupAppModel> list2 = list;
            arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            for (FareBreakupAppModel fareBreakupAppModel : list2) {
                FareBreakupOperationUIProperties fareBreakupOperationUIPropertiesA = FareBreakupOperationUIPropertiesKt.a(fareBreakupAppModel.b, (3 & 1) != 0 ? ChaloColorToken.Black.f9759a : ChaloColorToken.AlmostBlackColor.f9756a, (3 & 2) != 0);
                arrayList.add(new OndcFareBreakupUiModel(ChaloColorTokenKt.c(fareBreakupOperationUIPropertiesA.b), fareBreakupAppModel.f3890a, vo1.A(fareBreakupOperationUIPropertiesA.f8267a, currencyFeature.a(fareBreakupAppModel.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING))));
            }
        } else {
            arrayList = null;
        }
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((FareBreakupAppModel) obj).b == FareBreakupOperationType.SUBTRACTION) {
                    arrayList2.add(obj);
                }
            }
            int size = arrayList2.size();
            long j = 0;
            while (i3 < size) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                j += ((FareBreakupAppModel) obj2).c;
            }
            l = new Long(j);
        } else {
            l = null;
        }
        if (l != null) {
            if (l.longValue() <= 0) {
                l = null;
            }
            if (l != null) {
                strA = currencyFeature.a(l.longValue(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
            }
        }
        return new OndcBookingUiModel(arrayList, ondcFareBreakupUiModel, strA, ondcBookingAppModel.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object H0(FareDetailsComponent fareDetailsComponent, FareDetailsScreenType fareDetailsScreenType, ContinuationImpl continuationImpl) {
        FareDetailsComponent$getFareFetchRequestFilterForProductFlowType$1 fareDetailsComponent$getFareFetchRequestFilterForProductFlowType$1;
        String str;
        fareDetailsComponent.getClass();
        if (continuationImpl instanceof FareDetailsComponent$getFareFetchRequestFilterForProductFlowType$1) {
            fareDetailsComponent$getFareFetchRequestFilterForProductFlowType$1 = (FareDetailsComponent$getFareFetchRequestFilterForProductFlowType$1) continuationImpl;
            int i = fareDetailsComponent$getFareFetchRequestFilterForProductFlowType$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fareDetailsComponent$getFareFetchRequestFilterForProductFlowType$1.label = i - Integer.MIN_VALUE;
            } else {
                fareDetailsComponent$getFareFetchRequestFilterForProductFlowType$1 = new FareDetailsComponent$getFareFetchRequestFilterForProductFlowType$1(fareDetailsComponent, continuationImpl);
            }
        } else {
            fareDetailsComponent$getFareFetchRequestFilterForProductFlowType$1 = new FareDetailsComponent$getFareFetchRequestFilterForProductFlowType$1(fareDetailsComponent, continuationImpl);
        }
        Object objB = fareDetailsComponent$getFareFetchRequestFilterForProductFlowType$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fareDetailsComponent$getFareFetchRequestFilterForProductFlowType$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            if (!Intrinsics.d(fareDetailsScreenType, FareDetailsScreenType.InstantTicket.INSTANCE)) {
                if (!(fareDetailsScreenType instanceof FareDetailsScreenType.ONDCTicket)) {
                    throw new NoWhenBranchMatchedException();
                }
                FareDetailsScreenType.ONDCTicket oNDCTicket = (FareDetailsScreenType.ONDCTicket) fareDetailsScreenType;
                return new FareRequestFilters.OndcTicketFilter(oNDCTicket.c, oNDCTicket.g, oNDCTicket.f);
            }
            String str2 = fareDetailsComponent.V;
            if (str2 == null || str2.length() == 0) {
                InstantTicketConfigHelper instantTicketConfigHelper = fareDetailsComponent.B;
                fareDetailsComponent$getFareFetchRequestFilterForProductFlowType$1.label = 1;
                objB = instantTicketConfigHelper.b(true, fareDetailsComponent$getFareFetchRequestFilterForProductFlowType$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                str = fareDetailsComponent.V;
            }
            if (str != null || str.length() == 0) {
                return null;
            }
            return new FareRequestFilters.InstantTicketFilter(str);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objB);
        InstantTicketConfiguration instantTicketConfiguration = (InstantTicketConfiguration) objB;
        str = instantTicketConfiguration != null ? instantTicketConfiguration.f3831a : null;
        if (str != null) {
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    public static final long I0(FareDetailsComponent fareDetailsComponent) {
        fareDetailsComponent.getClass();
        long j = 0;
        for (Map.Entry entry : U0(fareDetailsComponent).entrySet()) {
            long jIntValue = ((Number) entry.getValue()).intValue();
            PassengerDetailAppModel passengerDetailAppModel = (PassengerDetailAppModel) fareDetailsComponent.P.get(entry.getKey());
            long j2 = passengerDetailAppModel != null ? passengerDetailAppModel.h : 0L;
            Long.signum(jIntValue);
            j += jIntValue * j2;
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:19:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0077  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0077 -> B:21:0x007a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object J0(app.chalo.instantticket.ui.faredetails.FareDetailsComponent r6, java.util.List r7, java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof app.chalo.instantticket.ui.faredetails.FareDetailsComponent$getPassengerFareDetailsUiModelMap$1
            if (r0 == 0) goto L16
            r0 = r9
            app.chalo.instantticket.ui.faredetails.FareDetailsComponent$getPassengerFareDetailsUiModelMap$1 r0 = (app.chalo.instantticket.ui.faredetails.FareDetailsComponent$getPassengerFareDetailsUiModelMap$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            app.chalo.instantticket.ui.faredetails.FareDetailsComponent$getPassengerFareDetailsUiModelMap$1 r0 = new app.chalo.instantticket.ui.faredetails.FareDetailsComponent$getPassengerFareDetailsUiModelMap$1
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r7 = r0.L$4
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r8 = r0.L$3
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.L$2
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.L$1
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r0.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.b(r9)
            goto L7a
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            java.util.LinkedHashMap r9 = defpackage.d.o(r9)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
            r7 = r9
        L52:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L80
            java.lang.Object r9 = r2.next()
            app.chalo.instantticket.data.model.app.response.PassengerDetailAppModel r9 = (app.chalo.instantticket.data.model.app.response.PassengerDetailAppModel) r9
            java.lang.String r4 = r9.d
            app.chalo.instantticket.data.model.app.response.SeatLimitAppModel r5 = r9.i
            int r5 = r5.f3893a
            r0.L$0 = r8
            r0.L$1 = r7
            r0.L$2 = r2
            r0.L$3 = r4
            r0.L$4 = r7
            r0.label = r3
            java.lang.Object r9 = r6.W0(r9, r5, r8, r0)
            if (r9 != r1) goto L77
            return r1
        L77:
            r5 = r8
            r8 = r4
            r4 = r7
        L7a:
            r7.put(r8, r9)
            r7 = r4
            r8 = r5
            goto L52
        L80:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.instantticket.ui.faredetails.FareDetailsComponent.J0(app.chalo.instantticket.ui.faredetails.FareDetailsComponent, java.util.List, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:134:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:137:0x02da  */
    /* JADX WARN: Code duplicated, block: B:143:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:149:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:152:0x030c  */
    /* JADX WARN: Code duplicated, block: B:153:0x0319  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:62:0x0102  */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r4v35 */
    public static final void K0(FareDetailsComponent fareDetailsComponent, CreateOrderResponseAppModel createOrderResponseAppModel, String agencyName) {
        String sourceName;
        String str;
        String str2;
        Object obj;
        Object obj2;
        String str3;
        OrderPaymentProviderInfoAppModel.ProviderConfigAppModel providerConfigAppModelC;
        OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel merchantUPIConfigAppModelA;
        String str4;
        String str5;
        String str6;
        String str7;
        CheckoutPaymentProviderVpaConfig checkoutPaymentProviderVpaConfig;
        CheckoutIntentModel checkoutIntentModel;
        String str8;
        String str9;
        OrderPaymentProviderCustomerDetailsAppModel orderPaymentProviderCustomerDetailsAppModel;
        Long l;
        String str10;
        String str11;
        String str12;
        String str13;
        OrderPaymentProviderCustomerDetailsAppModel orderPaymentProviderCustomerDetailsAppModel2;
        Long l2;
        String strQ;
        ?? r4;
        String strA;
        String str14;
        String str15;
        Object obj3;
        String str16;
        OrderPaymentProviderInfoAppModel.ProviderConfigAppModel providerConfigAppModelC2;
        OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel merchantUPIConfigAppModelA2;
        String str17;
        String str18;
        String str19;
        String str20;
        CheckoutPaymentProviderVpaConfig checkoutPaymentProviderVpaConfig2;
        String str21;
        String str22;
        OrderPaymentProviderCustomerDetailsAppModel orderPaymentProviderCustomerDetailsAppModel3;
        Long l3;
        TimeUtilsContract timeUtilsContract = fareDetailsComponent.s;
        ProductBookingNavigation productBookingNavigation = fareDetailsComponent.H;
        if (productBookingNavigation instanceof ProductBookingNavigation.InstantTicket.FreshPurchase) {
            sourceName = Source.INSTANT_TICKET_FRAGMENT.getSourceName();
        } else {
            if (!Intrinsics.d(productBookingNavigation, ProductBookingNavigation.OndcMetroBooking.INSTANCE) && !(productBookingNavigation instanceof ProductBookingNavigation.ONDCTicket)) {
                if (!(productBookingNavigation instanceof ProductBookingNavigation.StopBasedPassFreshPurchase) && productBookingNavigation != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            sourceName = Source.ONDC_FARE_DETAILS_SCREEN.getSourceName();
        }
        String source = sourceName;
        UserProfileAppModel userProfileAppModelF = fareDetailsComponent.t.f();
        ProductBookingNavigation productBookingNavigation2 = fareDetailsComponent.H;
        if (productBookingNavigation2 instanceof ProductBookingNavigation.InstantTicket.FreshPurchase) {
            if (userProfileAppModelF == null || (str14 = userProfileAppModelF.i) == null) {
                str14 = "";
            }
            if (userProfileAppModelF == null || (str15 = userProfileAppModelF.e) == null) {
                str15 = "";
            }
            OrderBookingInfoAppModel orderBookingInfoAppModel = createOrderResponseAppModel.c;
            if (orderBookingInfoAppModel == null || (l3 = orderBookingInfoAppModel.f5642a) == null) {
                obj3 = "bookingDate";
            } else {
                obj3 = "bookingDate";
                String strQ2 = timeUtilsContract.Q(l3.longValue());
                if (strQ2 != null) {
                    str16 = strQ2;
                }
                Intrinsics.i(agencyName, "agencyName");
                Intrinsics.i(source, "source");
                providerConfigAppModelC2 = CheckoutIntentModelHelperKt.c(createOrderResponseAppModel);
                merchantUPIConfigAppModelA2 = CheckoutIntentModelHelperKt.a(createOrderResponseAppModel);
                String str23 = createOrderResponseAppModel.f;
                String str24 = createOrderResponseAppModel.g;
                String str25 = createOrderResponseAppModel.b;
                int i = createOrderResponseAppModel.f5638a;
                String strValueOf = String.valueOf(i);
                String str26 = createOrderResponseAppModel.d;
                String str27 = createOrderResponseAppModel.e;
                if (providerConfigAppModelC2 != null || (orderPaymentProviderCustomerDetailsAppModel3 = providerConfigAppModelC2.e) == null) {
                    str17 = null;
                } else {
                    str17 = orderPaymentProviderCustomerDetailsAppModel3.f5646a;
                }
                if (providerConfigAppModelC2 != null) {
                    str18 = providerConfigAppModelC2.f;
                } else {
                    str18 = null;
                }
                if (providerConfigAppModelC2 != null || (str22 = providerConfigAppModelC2.g) == null) {
                    str19 = "";
                } else {
                    str19 = str22;
                }
                if (providerConfigAppModelC2 != null || (str21 = providerConfigAppModelC2.h) == null) {
                    str20 = "";
                } else {
                    str20 = str21;
                }
                CheckoutOrderData checkoutOrderData = new CheckoutOrderData(str23, str24, strValueOf, str26, str27, str17, str18, str25, str19, str20, null);
                CheckoutUserDetails checkoutUserDetails = new CheckoutUserDetails(str15, str14);
                OrderPaymentProviderInfoAppModel orderPaymentProviderInfoAppModel = createOrderResponseAppModel.h;
                if (merchantUPIConfigAppModelA2 != null) {
                    checkoutPaymentProviderVpaConfig2 = new CheckoutPaymentProviderVpaConfig(merchantUPIConfigAppModelA2.e, merchantUPIConfigAppModelA2.f, merchantUPIConfigAppModelA2.g);
                } else {
                    checkoutPaymentProviderVpaConfig2 = null;
                }
                CheckoutPaymentData checkoutPaymentData = new CheckoutPaymentData(checkoutOrderData, checkoutUserDetails, agencyName, orderPaymentProviderInfoAppModel, checkoutPaymentProviderVpaConfig2);
                CheckoutProductType checkoutProductType = CheckoutProductType.INSTANT_TICKET;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(MapsKt.i(new Pair("transactionId", str25), new Pair(obj3, str16), new Pair("productType", checkoutProductType.getType()), new Pair("productSubType", checkoutProductType.getType()), new Pair(PaymentConstants.AMOUNT, String.valueOf(i))));
                checkoutIntentModel = new CheckoutIntentModel(checkoutPaymentData, new CheckoutProductData(checkoutProductType, false, new CheckoutAnalyticsData(source, linkedHashMap)));
            }
            str16 = "";
            Intrinsics.i(agencyName, "agencyName");
            Intrinsics.i(source, "source");
            providerConfigAppModelC2 = CheckoutIntentModelHelperKt.c(createOrderResponseAppModel);
            merchantUPIConfigAppModelA2 = CheckoutIntentModelHelperKt.a(createOrderResponseAppModel);
            String str28 = createOrderResponseAppModel.f;
            String str29 = createOrderResponseAppModel.g;
            String str210 = createOrderResponseAppModel.b;
            int i2 = createOrderResponseAppModel.f5638a;
            String strValueOf2 = String.valueOf(i2);
            String str211 = createOrderResponseAppModel.d;
            String str212 = createOrderResponseAppModel.e;
            if (providerConfigAppModelC2 != null) {
                str17 = null;
            } else {
                str17 = null;
            }
            if (providerConfigAppModelC2 != null) {
                str18 = providerConfigAppModelC2.f;
            } else {
                str18 = null;
            }
            if (providerConfigAppModelC2 != null) {
                str19 = "";
            } else {
                str19 = "";
            }
            if (providerConfigAppModelC2 != null) {
                str20 = "";
            } else {
                str20 = "";
            }
            CheckoutOrderData checkoutOrderData2 = new CheckoutOrderData(str28, str29, strValueOf2, str211, str212, str17, str18, str210, str19, str20, null);
            CheckoutUserDetails checkoutUserDetails2 = new CheckoutUserDetails(str15, str14);
            OrderPaymentProviderInfoAppModel orderPaymentProviderInfoAppModel2 = createOrderResponseAppModel.h;
            if (merchantUPIConfigAppModelA2 != null) {
                checkoutPaymentProviderVpaConfig2 = new CheckoutPaymentProviderVpaConfig(merchantUPIConfigAppModelA2.e, merchantUPIConfigAppModelA2.f, merchantUPIConfigAppModelA2.g);
            } else {
                checkoutPaymentProviderVpaConfig2 = null;
            }
            CheckoutPaymentData checkoutPaymentData2 = new CheckoutPaymentData(checkoutOrderData2, checkoutUserDetails2, agencyName, orderPaymentProviderInfoAppModel2, checkoutPaymentProviderVpaConfig2);
            CheckoutProductType checkoutProductType2 = CheckoutProductType.INSTANT_TICKET;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.putAll(MapsKt.i(new Pair("transactionId", str210), new Pair(obj3, str16), new Pair("productType", checkoutProductType2.getType()), new Pair("productSubType", checkoutProductType2.getType()), new Pair(PaymentConstants.AMOUNT, String.valueOf(i2))));
            checkoutIntentModel = new CheckoutIntentModel(checkoutPaymentData2, new CheckoutProductData(checkoutProductType2, false, new CheckoutAnalyticsData(source, linkedHashMap2)));
        } else if (productBookingNavigation2 instanceof ProductBookingNavigation.ONDCTicket) {
            if (userProfileAppModelF == null || (str10 = userProfileAppModelF.i) == null) {
                str10 = "";
            }
            if (userProfileAppModelF == null || (str11 = userProfileAppModelF.e) == null) {
                str11 = "";
            }
            OrderBookingInfoAppModel orderBookingInfoAppModel2 = createOrderResponseAppModel.c;
            String str30 = (orderBookingInfoAppModel2 == null || (l2 = orderBookingInfoAppModel2.f5642a) == null || (strQ = timeUtilsContract.Q(l2.longValue())) == null) ? "" : strQ;
            Intrinsics.i(agencyName, "agencyName");
            Intrinsics.i(source, "source");
            OrderPaymentProviderInfoAppModel.ProviderConfigAppModel providerConfigAppModelC3 = CheckoutIntentModelHelperKt.c(createOrderResponseAppModel);
            OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel merchantUPIConfigAppModelA3 = CheckoutIntentModelHelperKt.a(createOrderResponseAppModel);
            String str31 = createOrderResponseAppModel.f;
            String str32 = createOrderResponseAppModel.g;
            String str33 = createOrderResponseAppModel.b;
            int i3 = createOrderResponseAppModel.f5638a;
            CheckoutPaymentData checkoutPaymentData3 = new CheckoutPaymentData(new CheckoutOrderData(str31, str32, String.valueOf(i3), createOrderResponseAppModel.d, createOrderResponseAppModel.e, (providerConfigAppModelC3 == null || (orderPaymentProviderCustomerDetailsAppModel2 = providerConfigAppModelC3.e) == null) ? null : orderPaymentProviderCustomerDetailsAppModel2.f5646a, providerConfigAppModelC3 != null ? providerConfigAppModelC3.f : null, str33, (providerConfigAppModelC3 == null || (str13 = providerConfigAppModelC3.g) == null) ? "" : str13, (providerConfigAppModelC3 == null || (str12 = providerConfigAppModelC3.h) == null) ? "" : str12, null), new CheckoutUserDetails(str11, str10), agencyName, createOrderResponseAppModel.h, merchantUPIConfigAppModelA3 != null ? new CheckoutPaymentProviderVpaConfig(merchantUPIConfigAppModelA3.e, merchantUPIConfigAppModelA3.f, merchantUPIConfigAppModelA3.g) : null);
            CheckoutProductType checkoutProductType3 = CheckoutProductType.ONDC_TICKET;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.putAll(MapsKt.i(new Pair("transactionId", str33), new Pair("bookingDate", str30), new Pair("productType", checkoutProductType3.getType()), new Pair("productSubType", checkoutProductType3.getType()), new Pair(PaymentConstants.AMOUNT, String.valueOf(i3))));
            checkoutIntentModel = new CheckoutIntentModel(checkoutPaymentData3, new CheckoutProductData(checkoutProductType3, false, new CheckoutAnalyticsData(source, linkedHashMap3)));
        } else {
            if (!Intrinsics.d(productBookingNavigation2, ProductBookingNavigation.OndcMetroBooking.INSTANCE)) {
                if (!(productBookingNavigation2 instanceof ProductBookingNavigation.StopBasedPassFreshPurchase) && productBookingNavigation2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            if (userProfileAppModelF == null || (str = userProfileAppModelF.i) == null) {
                str = "";
            }
            if (userProfileAppModelF == null || (str2 = userProfileAppModelF.e) == null) {
                str2 = "";
            }
            OrderBookingInfoAppModel orderBookingInfoAppModel3 = createOrderResponseAppModel.c;
            if (orderBookingInfoAppModel3 == null || (l = orderBookingInfoAppModel3.f5642a) == null) {
                obj = PaymentConstants.AMOUNT;
                obj2 = "productSubType";
            } else {
                obj = PaymentConstants.AMOUNT;
                obj2 = "productSubType";
                String strQ3 = timeUtilsContract.Q(l.longValue());
                if (strQ3 != null) {
                    str3 = strQ3;
                }
                Intrinsics.i(agencyName, "agencyName");
                Intrinsics.i(source, "source");
                providerConfigAppModelC = CheckoutIntentModelHelperKt.c(createOrderResponseAppModel);
                merchantUPIConfigAppModelA = CheckoutIntentModelHelperKt.a(createOrderResponseAppModel);
                String str34 = createOrderResponseAppModel.f;
                String str35 = createOrderResponseAppModel.b;
                String str36 = createOrderResponseAppModel.g;
                Object obj4 = obj2;
                int i4 = createOrderResponseAppModel.f5638a;
                String strValueOf3 = String.valueOf(i4);
                String str37 = createOrderResponseAppModel.d;
                String str38 = createOrderResponseAppModel.e;
                if (providerConfigAppModelC != null || (orderPaymentProviderCustomerDetailsAppModel = providerConfigAppModelC.e) == null) {
                    str4 = null;
                } else {
                    str4 = orderPaymentProviderCustomerDetailsAppModel.f5646a;
                }
                if (providerConfigAppModelC != null) {
                    str5 = providerConfigAppModelC.f;
                } else {
                    str5 = null;
                }
                if (providerConfigAppModelC != null || (str9 = providerConfigAppModelC.g) == null) {
                    str6 = "";
                } else {
                    str6 = str9;
                }
                if (providerConfigAppModelC != null || (str8 = providerConfigAppModelC.h) == null) {
                    str7 = "";
                } else {
                    str7 = str8;
                }
                CheckoutOrderData checkoutOrderData3 = new CheckoutOrderData(str34, str36, strValueOf3, str37, str38, str4, str5, str35, str6, str7, null);
                CheckoutUserDetails checkoutUserDetails3 = new CheckoutUserDetails(str2, str);
                OrderPaymentProviderInfoAppModel orderPaymentProviderInfoAppModel3 = createOrderResponseAppModel.h;
                if (merchantUPIConfigAppModelA != null) {
                    checkoutPaymentProviderVpaConfig = new CheckoutPaymentProviderVpaConfig(merchantUPIConfigAppModelA.e, merchantUPIConfigAppModelA.f, merchantUPIConfigAppModelA.g);
                } else {
                    checkoutPaymentProviderVpaConfig = null;
                }
                CheckoutPaymentData checkoutPaymentData4 = new CheckoutPaymentData(checkoutOrderData3, checkoutUserDetails3, agencyName, orderPaymentProviderInfoAppModel3, checkoutPaymentProviderVpaConfig);
                CheckoutProductType checkoutProductType4 = CheckoutProductType.ONDC_METRO_TICKET;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.putAll(MapsKt.i(new Pair("transactionId", str35), new Pair("bookingDate", str3), new Pair("productType", "mobileTicket"), new Pair(obj4, "ondcMetroTicket"), new Pair(obj, String.valueOf(i4))));
                checkoutIntentModel = new CheckoutIntentModel(checkoutPaymentData4, new CheckoutProductData(checkoutProductType4, false, new CheckoutAnalyticsData(source, linkedHashMap4)));
            }
            str3 = "";
            Intrinsics.i(agencyName, "agencyName");
            Intrinsics.i(source, "source");
            providerConfigAppModelC = CheckoutIntentModelHelperKt.c(createOrderResponseAppModel);
            merchantUPIConfigAppModelA = CheckoutIntentModelHelperKt.a(createOrderResponseAppModel);
            String str39 = createOrderResponseAppModel.f;
            String str310 = createOrderResponseAppModel.b;
            String str311 = createOrderResponseAppModel.g;
            Object obj5 = obj2;
            int i5 = createOrderResponseAppModel.f5638a;
            String strValueOf4 = String.valueOf(i5);
            String str312 = createOrderResponseAppModel.d;
            String str313 = createOrderResponseAppModel.e;
            if (providerConfigAppModelC != null) {
                str4 = null;
            } else {
                str4 = null;
            }
            if (providerConfigAppModelC != null) {
                str5 = providerConfigAppModelC.f;
            } else {
                str5 = null;
            }
            if (providerConfigAppModelC != null) {
                str6 = "";
            } else {
                str6 = "";
            }
            if (providerConfigAppModelC != null) {
                str7 = "";
            } else {
                str7 = "";
            }
            CheckoutOrderData checkoutOrderData4 = new CheckoutOrderData(str39, str311, strValueOf4, str312, str313, str4, str5, str310, str6, str7, null);
            CheckoutUserDetails checkoutUserDetails4 = new CheckoutUserDetails(str2, str);
            OrderPaymentProviderInfoAppModel orderPaymentProviderInfoAppModel4 = createOrderResponseAppModel.h;
            if (merchantUPIConfigAppModelA != null) {
                checkoutPaymentProviderVpaConfig = new CheckoutPaymentProviderVpaConfig(merchantUPIConfigAppModelA.e, merchantUPIConfigAppModelA.f, merchantUPIConfigAppModelA.g);
            } else {
                checkoutPaymentProviderVpaConfig = null;
            }
            CheckoutPaymentData checkoutPaymentData5 = new CheckoutPaymentData(checkoutOrderData4, checkoutUserDetails4, agencyName, orderPaymentProviderInfoAppModel4, checkoutPaymentProviderVpaConfig);
            CheckoutProductType checkoutProductType5 = CheckoutProductType.ONDC_METRO_TICKET;
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            linkedHashMap5.putAll(MapsKt.i(new Pair("transactionId", str310), new Pair("bookingDate", str3), new Pair("productType", "mobileTicket"), new Pair(obj5, "ondcMetroTicket"), new Pair(obj, String.valueOf(i5))));
            checkoutIntentModel = new CheckoutIntentModel(checkoutPaymentData5, new CheckoutProductData(checkoutProductType5, false, new CheckoutAnalyticsData(source, linkedHashMap5)));
        }
        String strA2 = KUUID.a();
        fareDetailsComponent.L = strA2;
        Job job = fareDetailsComponent.K;
        if (job != null) {
            r4 = 0;
            ((JobSupport) job).cancel(null);
        } else {
            r4 = 0;
        }
        fareDetailsComponent.K = BuildersKt.d(fareDetailsComponent.j, r4, r4, new FareDetailsComponent$startCollectingForCheckoutResult$1(fareDetailsComponent, strA2, r4), 3);
        ChaloNavigationManager chaloNavigationManager = fareDetailsComponent.y;
        try {
            Json json = ChaloJson.b;
            json.getClass();
            strA = json.a(CheckoutIntentModel.INSTANCE.serializer(), checkoutIntentModel);
        } catch (Exception unused) {
            strA = null;
        }
        if (strA == null) {
            strA = "";
        }
        chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new CheckoutPaymentMainArgs(strA2, strA), null, "CheckoutTag", 2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object L0(FareDetailsComponent fareDetailsComponent, String str, ContinuationImpl continuationImpl) {
        FareDetailsComponent$handleUserMobileNumberChangedIntent$1 fareDetailsComponent$handleUserMobileNumberChangedIntent$1;
        fareDetailsComponent.getClass();
        if (continuationImpl instanceof FareDetailsComponent$handleUserMobileNumberChangedIntent$1) {
            fareDetailsComponent$handleUserMobileNumberChangedIntent$1 = (FareDetailsComponent$handleUserMobileNumberChangedIntent$1) continuationImpl;
            int i = fareDetailsComponent$handleUserMobileNumberChangedIntent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fareDetailsComponent$handleUserMobileNumberChangedIntent$1.label = i - Integer.MIN_VALUE;
            } else {
                fareDetailsComponent$handleUserMobileNumberChangedIntent$1 = new FareDetailsComponent$handleUserMobileNumberChangedIntent$1(fareDetailsComponent, continuationImpl);
            }
        } else {
            fareDetailsComponent$handleUserMobileNumberChangedIntent$1 = new FareDetailsComponent$handleUserMobileNumberChangedIntent$1(fareDetailsComponent, continuationImpl);
        }
        Object objA = fareDetailsComponent$handleUserMobileNumberChangedIntent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fareDetailsComponent$handleUserMobileNumberChangedIntent$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objA);
            GetCurrentCityPhoneNumberConfigUseCase getCurrentCityPhoneNumberConfigUseCase = fareDetailsComponent.w;
            fareDetailsComponent$handleUserMobileNumberChangedIntent$1.L$0 = str;
            fareDetailsComponent$handleUserMobileNumberChangedIntent$1.label = 1;
            objA = getCurrentCityPhoneNumberConfigUseCase.a(fareDetailsComponent$handleUserMobileNumberChangedIntent$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) fareDetailsComponent$handleUserMobileNumberChangedIntent$1.L$0;
            ResultKt.b(objA);
        }
        fareDetailsComponent.x.getClass();
        int i3 = WhenMappings.f3906a[ValidatePhoneNumberUseCase.a(str, (CountryPhoneNumberConfig) objA).ordinal()];
        if (i3 != 1) {
            if (i3 != 2 && i3 != 3 && i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        fareDetailsComponent.E0(new ui(str, z, 3));
        return Unit.f17538a;
    }

    public static final void M0(FareDetailsComponent fareDetailsComponent, ResultStateData resultStateData) {
        if (!(resultStateData instanceof ResultStateData.Cancelled)) {
            fareDetailsComponent.getClass();
            if (!(resultStateData instanceof ResultStateData.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            CheckoutResultState checkoutResultState = (CheckoutResultState) ((ResultStateData.Success) resultStateData).f9039a;
            if (checkoutResultState instanceof CheckoutResultState.Success) {
                String str = ((CheckoutResultState.Success) checkoutResultState).d;
                if (str != null) {
                    fareDetailsComponent.Z0(new FareDetailsIntent.OnPaymentCompletedIntent(str));
                }
            } else if (!checkoutResultState.equals(CheckoutResultState.Failed.f9054a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        fareDetailsComponent.L = null;
    }

    public static final boolean N0(FareDetailsComponent fareDetailsComponent) {
        fareDetailsComponent.getClass();
        Iterator it = U0(fareDetailsComponent).values().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Number) it.next()).intValue();
        }
        FareDetailsScreenType fareDetailsScreenType = ((FareDetailsViewState) fareDetailsComponent.f.getValue()).n;
        if (Intrinsics.d(fareDetailsScreenType, FareDetailsScreenType.InstantTicket.INSTANCE) || (fareDetailsScreenType instanceof FareDetailsScreenType.ONDCTicket)) {
            if (iIntValue > 0) {
                return true;
            }
        } else if (fareDetailsScreenType != null) {
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object O0(FareDetailsComponent fareDetailsComponent, ContinuationImpl continuationImpl) throws Throwable {
        FareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$1 fareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$1;
        fareDetailsComponent.getClass();
        if (continuationImpl instanceof FareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$1) {
            fareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$1 = (FareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$1) continuationImpl;
            int i = fareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$1.label = i - Integer.MIN_VALUE;
            } else {
                fareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$1 = new FareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$1(fareDetailsComponent, continuationImpl);
            }
        } else {
            fareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$1 = new FareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$1(fareDetailsComponent, continuationImpl);
        }
        FareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$1 fareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$2 = fareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$1;
        Object objA = fareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$2.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            ResolveProductPurchaseMinProfileDecisionUseCase resolveProductPurchaseMinProfileDecisionUseCase = fareDetailsComponent.D;
            Source source = Source.INSTANT_TICKET_FARE_DETAILS_FRAGMENT;
            String ruleId = UserProfilingHookSlot.INSTANT_TICKET_MIN_PROFILE_FLOW.getRuleId();
            fareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$2.label = 1;
            objA = resolveProductPurchaseMinProfileDecisionUseCase.a(source, ruleId, fareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$2);
            if (objA != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
            return objA;
        }
        ResultKt.b(objA);
        String strA = KUUID.a();
        ProductPurchaseMinProfileDecisionHelper productPurchaseMinProfileDecisionHelper = fareDetailsComponent.F;
        Source source2 = Source.INSTANT_TICKET_FARE_DETAILS_FRAGMENT;
        w20 w20Var = new w20(fareDetailsComponent, strA, 0);
        FareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$3 fareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$3 = new FareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$3(fareDetailsComponent, strA, null);
        fareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$2.label = 2;
        Object objA2 = productPurchaseMinProfileDecisionHelper.a((ProductPurchaseMinProfileDecision) objA, source2, w20Var, fareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$3, fareDetailsComponent$shouldProceedWithInstantTicketOrderCreation$2);
        return objA2 == coroutineSingletons ? coroutineSingletons : objA2;
    }

    public static final boolean P0(FareDetailsComponent fareDetailsComponent) {
        Collection collectionValues = fareDetailsComponent.O.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((PassengerFareDetailsUiModel) obj).h != 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        return fareDetailsComponent.W;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0075  */
    /* JADX WARN: Code duplicated, block: B:22:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x009e  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x009e -> B:24:0x00a0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object Q0(app.chalo.instantticket.ui.faredetails.FareDetailsComponent r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof app.chalo.instantticket.ui.faredetails.FareDetailsComponent$updatePassengerFareDetailsUiModelMapOnCategorySelected$1
            if (r0 == 0) goto L16
            r0 = r10
            app.chalo.instantticket.ui.faredetails.FareDetailsComponent$updatePassengerFareDetailsUiModelMapOnCategorySelected$1 r0 = (app.chalo.instantticket.ui.faredetails.FareDetailsComponent$updatePassengerFareDetailsUiModelMapOnCategorySelected$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            app.chalo.instantticket.ui.faredetails.FareDetailsComponent$updatePassengerFareDetailsUiModelMapOnCategorySelected$1 r0 = new app.chalo.instantticket.ui.faredetails.FareDetailsComponent$updatePassengerFareDetailsUiModelMapOnCategorySelected$1
            r0.<init>(r9, r10)
        L1b:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L4a
            if (r2 != r3) goto L42
            java.lang.Object r2 = r0.L$4
            app.chalo.instantticket.data.model.ui.PassengerFareDetailsUiModel r2 = (app.chalo.instantticket.data.model.ui.PassengerFareDetailsUiModel) r2
            java.lang.Object r4 = r0.L$3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r0.L$2
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.L$1
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r0.L$0
            java.util.Map r7 = (java.util.Map) r7
            kotlin.ResultKt.b(r10)
            r8 = r6
            r6 = r5
            r5 = r7
            r7 = r8
            goto La0
        L42:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L4a:
            kotlin.ResultKt.b(r10)
            java.util.Map r10 = r9.O
            java.util.Set r10 = r10.entrySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.v(r10, r2)
            int r2 = kotlin.collections.MapsKt.g(r2)
            r4 = 16
            if (r2 >= r4) goto L64
            r2 = r4
        L64:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r2)
            java.util.Iterator r10 = r10.iterator()
            r6 = r10
            r5 = r4
        L6f:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto Lbc
            java.lang.Object r10 = r6.next()
            r4 = r10
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r10 = r4.getValue()
            r2 = r10
            app.chalo.instantticket.data.model.ui.PassengerFareDetailsUiModel r2 = (app.chalo.instantticket.data.model.ui.PassengerFareDetailsUiModel) r2
            java.lang.Object r10 = r4.getKey()
            java.lang.String r10 = (java.lang.String) r10
            int r7 = r2.h
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r5
            r0.L$3 = r4
            r0.L$4 = r2
            r0.label = r3
            java.lang.Object r10 = r9.X0(r7, r10, r0)
            if (r10 != r1) goto L9e
            return r1
        L9e:
            r7 = r6
            r6 = r5
        La0:
            app.chalo.instantticket.data.model.ui.PassengerFareDetailsUiModel r10 = (app.chalo.instantticket.data.model.ui.PassengerFareDetailsUiModel) r10
            if (r10 != 0) goto La5
            goto La6
        La5:
            r2 = r10
        La6:
            java.lang.Object r10 = r4.getKey()
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r10, r2)
            java.lang.Object r10 = r4.d()
            java.lang.Object r2 = r4.e()
            r6.put(r10, r2)
            r6 = r7
            goto L6f
        Lbc:
            r9.O = r5
            kotlin.Unit r9 = kotlin.Unit.f17538a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.instantticket.ui.faredetails.FareDetailsComponent.Q0(app.chalo.instantticket.ui.faredetails.FareDetailsComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static void S0(FareDetailsComponent fareDetailsComponent, FareDetailsData fareDetailsData, FareDetailsScreenType fareDetailsScreenType) {
        fareDetailsComponent.E0(new p10(17));
        BuildersKt.d(fareDetailsComponent.j, null, null, new FareDetailsComponent$fetchFare$2(fareDetailsComponent, fareDetailsScreenType, null, fareDetailsData, null), 3);
    }

    public static Map U0(FareDetailsComponent fareDetailsComponent) {
        return fareDetailsComponent.T0(((FareDetailsViewState) fareDetailsComponent.f.getValue()).G, ((FareDetailsViewState) fareDetailsComponent.f.getValue()).H);
    }

    public static boolean b1(FareDetailsComponent fareDetailsComponent) {
        return fareDetailsComponent.a1(((FareDetailsViewState) fareDetailsComponent.f.getValue()).G, ((FareDetailsViewState) fareDetailsComponent.f.getValue()).H);
    }

    public final void R0(String str, String str2, String str3) {
        String str4 = this.V;
        if (str4 == null) {
            return;
        }
        E0(new p10(13));
        Map mapU0 = U0(this);
        Set setEntrySet = this.O.entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator it = setEntrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                FareDetailsData fareDetailsData = this.M;
                BuildersKt.d(this.j, null, null, new FareDetailsComponent$createOndcBooking$2(this, str4, str, arrayList, new OndcTicketTripDetails(fareDetailsData.b.f8199a, fareDetailsData.c.f8199a, fareDetailsData.f8185a.b, str3), str2, null), 3);
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str5 = (String) entry.getKey();
            Integer num = (Integer) mapU0.get(str5);
            int iIntValue = num != null ? num.intValue() : 0;
            PassengerDetailData passengerDetailData = iIntValue > 0 ? new PassengerDetailData(iIntValue, str5, ((PassengerFareDetailsUiModel) entry.getValue()).b) : null;
            if (passengerDetailData != null) {
                arrayList.add(passengerDetailData);
            }
        }
    }

    public final Map T0(PassengerSelectionPolicy passengerSelectionPolicy, String str) {
        if (passengerSelectionPolicy != PassengerSelectionPolicy.Single || str == null) {
            return this.N;
        }
        Integer num = (Integer) this.N.get(str);
        return MapsKt.h(new Pair(str, Integer.valueOf(num != null ? num.intValue() : 0)));
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    public final long V0() {
        long j = 0;
        for (Map.Entry entry : this.N.entrySet()) {
            long jIntValue = ((Number) entry.getValue()).intValue();
            PassengerDetailAppModel passengerDetailAppModel = (PassengerDetailAppModel) this.P.get(entry.getKey());
            long j2 = passengerDetailAppModel != null ? passengerDetailAppModel.h : 0L;
            Long.signum(jIntValue);
            j += jIntValue * j2;
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x014c A[LOOP:0: B:57:0x0146->B:59:0x014c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x017f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object W0(PassengerDetailAppModel passengerDetailAppModel, int i, String str, ContinuationImpl continuationImpl) {
        FareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1 fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1;
        String str2;
        int i2;
        boolean z;
        PassengerDetailAppModel passengerDetailAppModel2;
        String str3;
        String str4;
        String str5;
        String str6;
        PassengerDetailAppModel passengerDetailAppModel3;
        String str7;
        int i3;
        String str8;
        String str9;
        String str10;
        int iIntValue;
        String str11;
        ArrayList arrayList;
        int i4 = i;
        if (continuationImpl instanceof FareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1) {
            fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1 = (FareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1) continuationImpl;
            int i5 = fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.label = i5 - Integer.MIN_VALUE;
            } else {
                fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1 = new FareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1(this, continuationImpl);
            }
        } else {
            fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1 = new FareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1(this, continuationImpl);
        }
        Object obj = fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.label;
        CurrencyFeature currencyFeature = this.n;
        StateFlow stateFlow = this.f;
        if (i6 == 0) {
            ResultKt.b(obj);
            str2 = str == null ? ((FareDetailsViewState) stateFlow.getValue()).H : str;
            i2 = str2 != null ? 1 : 0;
            long j = passengerDetailAppModel.f3892a;
            CurrencyRoundOffLogic currencyRoundOffLogic = CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING;
            String strA = currencyFeature.a(j, currencyRoundOffLogic);
            z = false;
            String strA2 = currencyFeature.a(passengerDetailAppModel.f3892a * ((long) i4), currencyRoundOffLogic);
            String strA3 = currencyFeature.a(passengerDetailAppModel.h, currencyRoundOffLogic);
            Object obj2 = null;
            if (passengerDetailAppModel.e) {
                Integer num = passengerDetailAppModel.f;
                fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.L$0 = passengerDetailAppModel;
                fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.L$1 = str;
                fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.L$2 = str2;
                fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.L$3 = passengerDetailAppModel;
                fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.L$4 = strA;
                fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.L$5 = strA2;
                fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.L$6 = strA3;
                fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.I$0 = i4;
                fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.I$1 = i2;
                fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.label = 1;
                if (num != null && (iIntValue = num.intValue()) > 0) {
                    Object objB = this.m.b(StringEnum.DISCOUNT_X_OFF, new Object[]{new Integer(iIntValue)}, fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1);
                    if (objB != coroutineSingletons) {
                        objB = (String) objB;
                    }
                    obj2 = objB;
                }
                if (obj2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                passengerDetailAppModel2 = passengerDetailAppModel;
                i3 = i2;
                str8 = strA2;
                obj = obj2;
                str7 = str;
                str9 = strA3;
                str10 = strA;
                passengerDetailAppModel3 = passengerDetailAppModel2;
            } else {
                passengerDetailAppModel2 = passengerDetailAppModel;
                str3 = strA3;
                str4 = strA2;
                str5 = strA;
                str6 = null;
                passengerDetailAppModel3 = passengerDetailAppModel2;
                str7 = str;
            }
            boolean z2 = (i2 != 0 ? i4 < passengerDetailAppModel2.i.b : passengerDetailAppModel3.d.equals(str2) && i4 < passengerDetailAppModel2.i.b) ? z : true;
            boolean z3 = (i2 != 0 ? i4 > passengerDetailAppModel2.i.f3893a : passengerDetailAppModel3.d.equals(str2) && i4 > passengerDetailAppModel2.i.f3893a) ? z : true;
            str11 = passengerDetailAppModel3.d;
            String str12 = passengerDetailAppModel3.g;
            boolean z4 = passengerDetailAppModel3.e;
            SeatLimitAppModel seatLimitAppModel = passengerDetailAppModel2.i;
            int i7 = seatLimitAppModel.f3893a;
            int i8 = seatLimitAppModel.b;
            List<FareBreakupAppModel> list = passengerDetailAppModel3.c;
            arrayList = new ArrayList(CollectionsKt.v(list, 10));
            for (FareBreakupAppModel fareBreakupAppModel : list) {
                arrayList.add(new FareBreakupUiModel(fareBreakupAppModel.f3890a, FareBreakupOperationUIPropertiesKt.a(fareBreakupAppModel.b, (3 & 1) != 0 ? ChaloColorToken.Black.f9759a : ChaloColorToken.AlmostBlackColor.f9756a, (3 & 2) != 0).f8267a, currencyFeature.a(((long) i4) * fareBreakupAppModel.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)));
                str11 = str11;
            }
            String str13 = str11;
            String str14 = passengerDetailAppModel3.d;
            if (str7 == null) {
                str7 = ((FareDetailsViewState) stateFlow.getValue()).H;
            }
            return new PassengerFareDetailsUiModel(str13, str12, z4, str6, str5, str3, arrayList, i4, i7, i8, z2, z3, str4, str14.equals(str7));
        }
        if (i6 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i3 = fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.I$1;
        i4 = fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.I$0;
        str9 = (String) fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.L$6;
        str8 = (String) fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.L$5;
        str10 = (String) fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.L$4;
        passengerDetailAppModel3 = (PassengerDetailAppModel) fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.L$3;
        str2 = (String) fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.L$2;
        str7 = (String) fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.L$1;
        passengerDetailAppModel2 = (PassengerDetailAppModel) fareDetailsComponent$getPassengerFareDetailsUiModelFromAppModel$1.L$0;
        ResultKt.b(obj);
        z = false;
        str3 = str9;
        str6 = (String) obj;
        str4 = str8;
        str5 = str10;
        i2 = i3;
        if (i2 != 0) {
        }
        if (i2 != 0) {
        }
        str11 = passengerDetailAppModel3.d;
        String str15 = passengerDetailAppModel3.g;
        boolean z5 = passengerDetailAppModel3.e;
        SeatLimitAppModel seatLimitAppModel2 = passengerDetailAppModel2.i;
        int i9 = seatLimitAppModel2.f3893a;
        int i10 = seatLimitAppModel2.b;
        List<FareBreakupAppModel> list2 = passengerDetailAppModel3.c;
        arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        while (r7.hasNext()) {
            arrayList.add(new FareBreakupUiModel(fareBreakupAppModel.f3890a, FareBreakupOperationUIPropertiesKt.a(fareBreakupAppModel.b, (3 & 1) != 0 ? ChaloColorToken.Black.f9759a : ChaloColorToken.AlmostBlackColor.f9756a, (3 & 2) != 0).f8267a, currencyFeature.a(((long) i4) * fareBreakupAppModel.c, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)));
            str11 = str11;
        }
        String str16 = str11;
        String str17 = passengerDetailAppModel3.d;
        if (str7 == null) {
            str7 = ((FareDetailsViewState) stateFlow.getValue()).H;
        }
        return new PassengerFareDetailsUiModel(str16, str15, z5, str6, str5, str3, arrayList, i4, i9, i10, z2, z3, str4, str17.equals(str7));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final Object X0(int i, String str, ContinuationImpl continuationImpl) {
        PassengerDetailAppModel passengerDetailAppModel = (PassengerDetailAppModel) this.P.get(str);
        if (passengerDetailAppModel == null) {
            return null;
        }
        Object objW0 = W0(passengerDetailAppModel, i, null, continuationImpl);
        return objW0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objW0 : (PassengerFareDetailsUiModel) objW0;
    }

    public final void Y0() {
        E0(new p10(10));
        r0(FareDetailsSideEffect.HideBottomSheet.f3948a);
        FareDetailsScreenType fareDetailsScreenType = ((FareDetailsViewState) this.f.getValue()).n;
        if (fareDetailsScreenType != null) {
            S0(this, this.M, fareDetailsScreenType);
        } else {
            E0(new p10(11));
        }
    }

    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, java.util.Map] */
    public final void Z0(FareDetailsIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof FareDetailsIntent.InitialIntent;
        int i = 3;
        int i2 = 1;
        ContextScope contextScope = this.j;
        if (z) {
            FareDetailsIntent.InitialIntent initialIntent = (FareDetailsIntent.InitialIntent) intent;
            FareDetailsScreenType fareDetailsScreenType = initialIntent.b;
            FareDetailsData fareDetailsData = initialIntent.f3933a;
            ProductBookingNavigation productBookingNavigation = initialIntent.c;
            this.M = fareDetailsData;
            this.V = fareDetailsScreenType instanceof FareDetailsScreenType.ONDCTicket ? ((FareDetailsScreenType.ONDCTicket) fareDetailsScreenType).d : initialIntent.d;
            this.H = productBookingNavigation;
            Long l = fareDetailsData.e;
            String strJ = l != null ? this.s.j(l.longValue()) : null;
            BuildersKt.d(contextScope, null, null, new FareDetailsComponent$createBrandingTypeForProductFlow$1(productBookingNavigation, this, null), 3);
            fareDetailsScreenType.getClass();
            this.W = !(fareDetailsScreenType instanceof FareDetailsScreenType.ONDCTicket);
            E0(new qi(initialIntent, strJ, fareDetailsScreenType instanceof FareDetailsScreenType.InstantTicket, i2));
            S0(this, this.M, fareDetailsScreenType);
            BuildersKt.d(contextScope, null, null, new FareDetailsComponent$handleInitialIntent$2(this, null), 3);
            return;
        }
        boolean z2 = intent instanceof FareDetailsIntent.IncreasePassengerCountClicked;
        StateFlow stateFlow = this.f;
        if (z2) {
            String str = ((FareDetailsIntent.IncreasePassengerCountClicked) intent).f3932a;
            Integer num = (Integer) this.N.get(str);
            if (num != null) {
                int iIntValue = num.intValue();
                PassengerDetailAppModel passengerDetailAppModel = (PassengerDetailAppModel) this.P.get(str);
                if (passengerDetailAppModel == null || iIntValue >= passengerDetailAppModel.i.b || b1(this)) {
                    return;
                }
                int i3 = iIntValue + 1;
                Source source = Source.INSTANT_TICKET_FARE_DETAILS_FRAGMENT;
                Pair pair = new Pair("previous value", num);
                Pair pair2 = new Pair("current value", Integer.valueOf(i3));
                FareDetailsScreenType fareDetailsScreenType2 = ((FareDetailsViewState) stateFlow.getValue()).n;
                AnalyticsContractImplKt.b(this.q, "find my ticket fare fare details passenger count changed", source, MapsKt.i(pair, pair2, new Pair("flowType", String.valueOf(fareDetailsScreenType2 != null ? fareDetailsScreenType2.f3908a : null))), false, 24);
                BuildersKt.d(contextScope, null, null, new FareDetailsComponent$handleIncreasePassengerCountClickedIntent$1(this, str, i3, null), 3);
                return;
            }
            return;
        }
        if (intent instanceof FareDetailsIntent.DecreasePassengerCountClicked) {
            String str2 = ((FareDetailsIntent.DecreasePassengerCountClicked) intent).f3926a;
            Integer num2 = (Integer) this.N.get(str2);
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                PassengerDetailAppModel passengerDetailAppModel2 = (PassengerDetailAppModel) this.P.get(str2);
                if (passengerDetailAppModel2 == null || iIntValue2 <= passengerDetailAppModel2.i.f3893a) {
                    return;
                }
                int i4 = iIntValue2 - 1;
                Source source2 = Source.INSTANT_TICKET_FARE_DETAILS_FRAGMENT;
                Pair pair3 = new Pair("previous value", num2);
                Pair pair4 = new Pair("current value", Integer.valueOf(i4));
                FareDetailsScreenType fareDetailsScreenType3 = ((FareDetailsViewState) stateFlow.getValue()).n;
                AnalyticsContractImplKt.b(this.q, "find my ticket fare fare details passenger count changed", source2, MapsKt.i(pair3, pair4, new Pair("flowType", String.valueOf(fareDetailsScreenType3 != null ? fareDetailsScreenType3.f3908a : null))), false, 24);
                BuildersKt.d(contextScope, null, null, new FareDetailsComponent$handleDecreasePassengerCountClickedIntent$1(this, str2, i4, null), 3);
                return;
            }
            return;
        }
        boolean z3 = intent instanceof FareDetailsIntent.OnPayButtonClicked;
        ChaloNavigationManager chaloNavigationManager = this.y;
        if (z3) {
            FareDetailsScreenType fareDetailsScreenType4 = ((FareDetailsViewState) stateFlow.getValue()).n;
            if (fareDetailsScreenType4 == null) {
                return;
            }
            Source source3 = Source.INSTANT_TICKET_FARE_DETAILS_FRAGMENT;
            AnalyticsContractImplKt.b(this.q, "find my ticket fare fare details pay button clicked", source3, MapsKt.l(MapsKt.i(new Pair(PaymentConstants.AMOUNT, Long.valueOf(V0())), new Pair("flowType", fareDetailsScreenType4.f3908a)), this.N), false, 24);
            if (fareDetailsScreenType4.equals(FareDetailsScreenType.InstantTicket.INSTANCE)) {
                if (this.I) {
                    return;
                }
                this.I = true;
                E0(new p10(8));
                AnalyticsContractImplKt.b(this.q, "find my ticket fare fare details pay button clicked", source3, MapsKt.l(MapsKt.h(new Pair(PaymentConstants.AMOUNT, Long.valueOf(V0()))), this.N), false, 24);
                BuildersKt.d(contextScope, null, null, new FareDetailsComponent$handlePayButtonClickedForInstantTicket$2(this, null), 3);
                return;
            }
            if (!(fareDetailsScreenType4 instanceof FareDetailsScreenType.ONDCTicket)) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.I) {
                return;
            }
            this.I = true;
            if (!this.r.a()) {
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new LoginOptionsArgs(Source.PREMIUM_BUS_FARE_DETAILS_SCREEN, true), null, null, 6));
                this.I = false;
                return;
            }
            FareDetailsScreenType fareDetailsScreenType5 = ((FareDetailsViewState) stateFlow.getValue()).n;
            if (fareDetailsScreenType5 != null && (fareDetailsScreenType5 instanceof FareDetailsScreenType.ONDCTicket)) {
                FareDetailsScreenType.ONDCTicket oNDCTicket = (FareDetailsScreenType.ONDCTicket) fareDetailsScreenType5;
                R0(oNDCTicket.c, oNDCTicket.f, oNDCTicket.g);
                return;
            }
            return;
        }
        if (intent instanceof FareDetailsIntent.RetryFareFetchClicked) {
            FareDetailsScreenType fareDetailsScreenType6 = ((FareDetailsViewState) stateFlow.getValue()).n;
            if (fareDetailsScreenType6 != null) {
                S0(this, this.M, fareDetailsScreenType6);
                return;
            } else {
                E0(new p10(22));
                return;
            }
        }
        if (intent instanceof FareDetailsIntent.InitiateOnlinePaymentIntent) {
            if (this.R) {
                return;
            }
            this.S = false;
            E0(new p10(14));
            BuildersKt.d(contextScope, null, null, new FareDetailsComponent$handleInitiateOnlinePaymentIntent$2(this, null), 3);
            return;
        }
        if (intent instanceof FareDetailsIntent.OnStoppedIntent) {
            this.R = false;
            return;
        }
        if (intent instanceof FareDetailsIntent.CancelOrderApiIntent) {
            if (this.T) {
                return;
            }
            this.S = true;
            return;
        }
        if (intent instanceof FareDetailsIntent.OnPaymentCompletedIntent) {
            BuildersKt.d(contextScope, null, null, new FareDetailsComponent$handleOnPaymentCompletedIntent$1(this, ((FareDetailsIntent.OnPaymentCompletedIntent) intent).f3937a, false, null), 3);
            return;
        }
        int i5 = 4;
        if (intent.equals(FareDetailsIntent.NavigateToHomeScreenIntent.f3935a)) {
            E0(new p10(16));
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 2), null, 4));
            return;
        }
        boolean z4 = intent instanceof FareDetailsIntent.TermsAndConditionsTextClickedIntent;
        FareDetailsSideEffect.ShowBottomSheet showBottomSheet = FareDetailsSideEffect.ShowBottomSheet.f3949a;
        if (z4) {
            E0(new qp(this, 26));
            r0(showBottomSheet);
            return;
        }
        if (intent instanceof FareDetailsIntent.OnReadMoreFareNoteIntent) {
            String str3 = ((FareDetailsViewState) stateFlow.getValue()).r;
            if (str3 == null) {
                return;
            }
            E0(new n10(str3, i5));
            r0(showBottomSheet);
            return;
        }
        if (intent instanceof FareDetailsIntent.OrderCreationErrorDialogOkClickedIntent) {
            E0(new p10(9));
            return;
        }
        if (intent.equals(FareDetailsIntent.UserBillingInfoBottomSheetProceedClickedIntent.f3945a)) {
            FareDetailsScreenType fareDetailsScreenType7 = ((FareDetailsViewState) stateFlow.getValue()).n;
            if (fareDetailsScreenType7 != null && (fareDetailsScreenType7 instanceof FareDetailsScreenType.ONDCTicket)) {
                FareDetailsScreenType.ONDCTicket oNDCTicket2 = (FareDetailsScreenType.ONDCTicket) fareDetailsScreenType7;
                R0(oNDCTicket2.c, oNDCTicket2.f, oNDCTicket2.g);
                return;
            }
            return;
        }
        if (intent.equals(FareDetailsIntent.FinalFareBottomSheetPayButtonClickedIntent.f3930a)) {
            if (this.J) {
                return;
            }
            this.J = true;
            BuildersKt.d(contextScope, null, null, new FareDetailsComponent$handleFinalFareBottomSheetPayButtonClickedIntent$1(this, null), 3);
            return;
        }
        if (intent instanceof FareDetailsIntent.UserBillingInfoMobileNumberChangedIntent) {
            BuildersKt.d(contextScope, null, null, new FareDetailsComponent$processIntent$1(this, intent, null), 3);
            return;
        }
        if (intent instanceof FareDetailsIntent.UserBillingInfoNameChangedIntent) {
            String str4 = ((FareDetailsIntent.UserBillingInfoNameChangedIntent) intent).f3947a;
            E0(new ui(str4, !StringsKt.F(str4), 4));
            return;
        }
        if (intent.equals(FareDetailsIntent.FinalFareBottomSheetTermsAndConditionsTextClickedIntent.f3931a)) {
            Source source4 = Source.INSTANT_TICKET_FARE_DETAILS_FRAGMENT;
            FareDetailsScreenType fareDetailsScreenType8 = ((FareDetailsViewState) stateFlow.getValue()).n;
            AnalyticsContractImplKt.b(this.q, "fare details final amount bottomsheet tnc clicked", source4, vo1.s("flowType", String.valueOf(fareDetailsScreenType8 != null ? fareDetailsScreenType8.f3908a : null)), false, 24);
            E0(new p10(20));
            return;
        }
        if (intent.equals(FareDetailsIntent.FinalFareBottomSheetCancelButtonClickedIntent.f3929a)) {
            if (this.J) {
                return;
            }
            E0(new p10(12));
            r0(FareDetailsSideEffect.HideBottomSheet.f3948a);
            return;
        }
        if (intent.equals(FareDetailsIntent.OnTncDialoguePositiveBtnClickedIntent.f3941a)) {
            this.J = false;
            E0(new p10(21));
            return;
        }
        if (intent.equals(FareDetailsIntent.OnStartIntent.f3939a)) {
            this.I = false;
            this.J = false;
            return;
        }
        if (intent instanceof FareDetailsIntent.OnPassengerCategorySelectedIntent) {
            String str5 = ((FareDetailsIntent.OnPassengerCategorySelectedIntent) intent).f3936a;
            if (((FareDetailsViewState) stateFlow.getValue()).G == PassengerSelectionPolicy.Single) {
                BuildersKt.d(contextScope, null, null, new FareDetailsComponent$handleOnPassengerCategorySelectedIntent$1(this, str5, null), 3);
                return;
            } else {
                E0(new n10(str5, i));
                return;
            }
        }
        if (intent.equals(FareDetailsIntent.FareValidationFailedBottomSheetPayButtonClickedIntent.f3927a)) {
            Y0();
        } else {
            if (!intent.equals(FareDetailsIntent.FareValidationFailedDismissButtonClickedIntent.f3928a)) {
                throw new NoWhenBranchMatchedException();
            }
            Y0();
        }
    }

    public final boolean a1(PassengerSelectionPolicy passengerSelectionPolicy, String str) {
        Iterator it = T0(passengerSelectionPolicy, str).values().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Number) it.next()).intValue();
        }
        return iIntValue >= this.U;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (FareDetailsViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new FareDetailsViewState();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new FareDetailsViewState();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void y0() {
        Z0(FareDetailsIntent.OnStartIntent.f3939a);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void z0() {
        if (Intrinsics.d(((FareDetailsViewState) this.f.getValue()).n, FareDetailsScreenType.InstantTicket.INSTANCE)) {
            Z0(FareDetailsIntent.OnStoppedIntent.f3940a);
        }
    }
}
