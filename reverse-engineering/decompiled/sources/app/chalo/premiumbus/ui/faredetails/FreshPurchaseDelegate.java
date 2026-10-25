package app.chalo.premiumbus.ui.faredetails;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.features.checkout.CheckoutAnalyticsData;
import app.chalo.features.checkout.CheckoutIntentModel;
import app.chalo.features.checkout.CheckoutIntentModelHelperKt;
import app.chalo.features.checkout.CheckoutOrderData;
import app.chalo.features.checkout.CheckoutPaymentData;
import app.chalo.features.checkout.CheckoutPaymentProviderVpaConfig;
import app.chalo.features.checkout.CheckoutProductData;
import app.chalo.features.checkout.CheckoutProductType;
import app.chalo.features.checkout.CheckoutUserDetails;
import app.chalo.instantticket.data.model.app.response.PassengerDetailAppModel;
import app.chalo.instantticket.data.model.app.response.PassengerSelectionPolicy;
import app.chalo.instantticket.data.model.app.response.SeatLimitAppModel;
import app.chalo.instantticket.domain.FetchMobileTicketFareUseCase;
import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.models.ordercreation.OrderBookingInfoAppModel;
import app.chalo.models.ordercreation.OrderPaymentProviderCustomerDetailsAppModel;
import app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.data.models.api.request.PBTicketSelectedPassengerApiRequestModel;
import app.chalo.premiumbus.data.models.api.request.PBTicketSelectedTripDetailsApiRequestModel;
import app.chalo.premiumbus.data.models.app.PremiumBusPassUpsellAppModel;
import app.chalo.premiumbus.domain.CreatePremiumReserveTicketOrderUseCase;
import app.chalo.premiumbus.domain.TriggerPremiumBusBookingBookingEventsUseCase;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsBottomSheetType;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsDataState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsDelegateRestoredState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsEntryContext;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsIntent;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSharedContext;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSwitchRequest;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase;
import app.chalo.productbooking.common.domain.StoreCompleteProductConfigLocallyUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.checkout.CheckoutResultState;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.CheckoutPaymentMainArgs;
import app.chalo.scenes.args.LoginOptionsArgs;
import app.chalo.scenes.args.PassSelectionArgs;
import app.chalo.scenes.args.PostPassPurchaseSuccessFlowType;
import app.chalo.usecase.CheckIsUserLoggedInUseCase;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.KUUID;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.timeutil.TimeUtilsContract;
import defpackage.on;
import defpackage.wn;
import defpackage.z20;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/FreshPurchaseDelegate;", "Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsDelegate;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FreshPurchaseDelegate implements PremiumBusFareDetailsDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusFareDetailsFlowType.FreshPurchase f7544a;
    public final FetchMobileTicketFareUseCase b;
    public final FetchCompleteProductConfigByIdUseCase c;
    public final StoreCompleteProductConfigLocallyUseCase d;
    public final CreatePremiumReserveTicketOrderUseCase e;
    public final AnalyticsContract f;
    public final CheckIsUserLoggedInUseCase g;
    public final TimeUtilsContract h;
    public final UserProfileDetailsProvider i;
    public final ChaloNavigationManager j;
    public final KotlinToastManager k;
    public final StringProvider l;
    public final SystemHelper m;
    public final ChaloTimeProvider n;
    public final PremiumBusFareDetailsStartedActionRunner o;
    public final TriggerPremiumBusBookingBookingEventsUseCase p;
    public final MutableStateFlow q;
    public final StateFlow r;
    public CoroutineScope s;
    public Job t;
    public Job u;
    public String v;
    public final LinkedHashSet w;
    public final LinkedHashSet x;
    public Function1 y;
    public Function1 z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/FreshPurchaseDelegate$Companion;", "", "", "ADULT_PASSENGER_ID", "Ljava/lang/String;", "", "RESOLVED_STATE_WAIT_FOR_ANALYTICS_MS", "J", "PREMIUM_RESERVE_TICKET_FLOW_TYPE", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7545a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[PremiumBusFareDetailsEntryContext.values().length];
            try {
                iArr[PremiumBusFareDetailsEntryContext.FromSeatSelection.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PremiumBusFareDetailsEntryContext.FromSlotSelection.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PremiumBusFareDetailsEntryContext.FromProductSelection.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PremiumBusFareDetailsEntryContext.FromStopSelection.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PremiumBusFareDetailsEntryContext.FromStopDetails.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f7545a = iArr;
            int[] iArr2 = new int[PassengerSelectionPolicy.values().length];
            try {
                iArr2[PassengerSelectionPolicy.Multiple.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PassengerSelectionPolicy.Single.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
        }
    }

    public FreshPurchaseDelegate(PremiumBusFareDetailsFlowType.FreshPurchase flowType, FetchMobileTicketFareUseCase fetchMobileTicketFareUseCase, FetchCompleteProductConfigByIdUseCase fetchCompleteProductConfigByIdUseCase, StoreCompleteProductConfigLocallyUseCase storeCompleteProductConfigLocallyUseCase, CreatePremiumReserveTicketOrderUseCase createPremiumReserveTicketOrderUseCase, AnalyticsContract analyticsContract, CheckIsUserLoggedInUseCase checkIsUserLoggedInUseCase, TimeUtilsContract timeUtilsContract, UserProfileDetailsProvider userProfileDetailsProvider, ChaloNavigationManager chaloNavigationManager, KotlinToastManager kotlinToastManager, StringProvider stringProvider, SystemHelper systemHelper, ChaloTimeProvider chaloTimeProvider, PremiumBusFareDetailsStartedActionRunner premiumBusFareDetailsStartedActionRunner, TriggerPremiumBusBookingBookingEventsUseCase triggerPremiumBusBookingBookingEventsUseCase) {
        Intrinsics.i(flowType, "flowType");
        this.f7544a = flowType;
        this.b = fetchMobileTicketFareUseCase;
        this.c = fetchCompleteProductConfigByIdUseCase;
        this.d = storeCompleteProductConfigLocallyUseCase;
        this.e = createPremiumReserveTicketOrderUseCase;
        this.f = analyticsContract;
        this.g = checkIsUserLoggedInUseCase;
        this.h = timeUtilsContract;
        this.i = userProfileDetailsProvider;
        this.j = chaloNavigationManager;
        this.k = kotlinToastManager;
        this.l = stringProvider;
        this.m = systemHelper;
        this.n = chaloTimeProvider;
        this.o = premiumBusFareDetailsStartedActionRunner;
        this.p = triggerPremiumBusBookingBookingEventsUseCase;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new PremiumBusFareDetailsDataState());
        this.q = mutableStateFlowA;
        this.r = FlowKt.c(mutableStateFlowA);
        this.w = new LinkedHashSet();
        this.x = new LinkedHashSet();
        int i = 17;
        this.y = new on(i);
        this.z = new z20(i);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0200  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b4, code lost:
    
        if (r3.c(r4, app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsDataState.a(r13, false, new app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsError((java.lang.String) r2, true), 0, null, false, false, r21, null, null, null, null, null, null, 0, null, null, null, false, null, 1048440)) != false) goto L138;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007d -> B:20:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(app.chalo.premiumbus.ui.faredetails.FreshPurchaseDelegate r38, app.chalo.instantticket.data.model.app.response.FetchMobileTicketFareResponseAppModel r39, kotlin.coroutines.jvm.internal.ContinuationImpl r40) {
        /*
            Method dump skipped, instruction units count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.ui.faredetails.FreshPurchaseDelegate.h(app.chalo.premiumbus.ui.faredetails.FreshPurchaseDelegate, app.chalo.instantticket.data.model.app.response.FetchMobileTicketFareResponseAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0159  */
    /* JADX WARN: Code duplicated, block: B:65:0x015d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0162  */
    /* JADX WARN: Code duplicated, block: B:72:0x016e  */
    /* JADX WARN: Code duplicated, block: B:78:0x017a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0192  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:89:0x0222  */
    /* JADX WARN: Code duplicated, block: B:90:0x0225  */
    public static final Object i(FreshPurchaseDelegate freshPurchaseDelegate, CreateOrderResponseAppModel createOrderResponseAppModel, String str, ContinuationImpl continuationImpl) {
        FreshPurchaseDelegate$handleNavigateToCheckoutScreen$1 freshPurchaseDelegate$handleNavigateToCheckoutScreen$1;
        Object value;
        String sourceName;
        Object value2;
        CreateOrderResponseAppModel createOrderResponseAppModel2;
        String agencyName;
        String source;
        String str2;
        String str3;
        String str4;
        char c;
        char c2;
        String strQ;
        OrderPaymentProviderInfoAppModel.ProviderConfigAppModel providerConfigAppModelC;
        OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel merchantUPIConfigAppModelA;
        String str5;
        String str6;
        String str7;
        String str8;
        CheckoutPaymentProviderVpaConfig checkoutPaymentProviderVpaConfig;
        String strA;
        String str9;
        String str10;
        String str11;
        OrderPaymentProviderCustomerDetailsAppModel orderPaymentProviderCustomerDetailsAppModel;
        Long l;
        MutableStateFlow mutableStateFlow = freshPurchaseDelegate.q;
        if (continuationImpl instanceof FreshPurchaseDelegate$handleNavigateToCheckoutScreen$1) {
            freshPurchaseDelegate$handleNavigateToCheckoutScreen$1 = (FreshPurchaseDelegate$handleNavigateToCheckoutScreen$1) continuationImpl;
            int i = freshPurchaseDelegate$handleNavigateToCheckoutScreen$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                freshPurchaseDelegate$handleNavigateToCheckoutScreen$1.label = i - Integer.MIN_VALUE;
            } else {
                freshPurchaseDelegate$handleNavigateToCheckoutScreen$1 = new FreshPurchaseDelegate$handleNavigateToCheckoutScreen$1(freshPurchaseDelegate, continuationImpl);
            }
        } else {
            freshPurchaseDelegate$handleNavigateToCheckoutScreen$1 = new FreshPurchaseDelegate$handleNavigateToCheckoutScreen$1(freshPurchaseDelegate, continuationImpl);
        }
        Object obj = freshPurchaseDelegate$handleNavigateToCheckoutScreen$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = freshPurchaseDelegate$handleNavigateToCheckoutScreen$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            JobKt.e(freshPurchaseDelegate$handleNavigateToCheckoutScreen$1.getContext());
            PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext = ((PremiumBusFareDetailsDataState) mutableStateFlow.getValue()).t;
            PremiumBusFareDetailsEntryContext premiumBusFareDetailsEntryContext = premiumBusFareDetailsSharedContext != null ? premiumBusFareDetailsSharedContext.d : null;
            int i3 = premiumBusFareDetailsEntryContext == null ? -1 : WhenMappings.f7545a[premiumBusFareDetailsEntryContext.ordinal()];
            if (i3 == -1) {
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.c(value, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 1048415)));
                return unit;
            }
            if (i3 == 1) {
                sourceName = Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN.getSourceName();
            } else {
                if (i3 != 2 && i3 != 3 && i3 != 4 && i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                sourceName = Source.PREMIUM_BUS_FARE_DETAILS_SCREEN.getSourceName();
            }
            String strA2 = KUUID.a();
            freshPurchaseDelegate.y.invoke(strA2);
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value2, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value2, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 1048415)));
            UserProfileDetailsProvider userProfileDetailsProvider = freshPurchaseDelegate.i;
            createOrderResponseAppModel2 = createOrderResponseAppModel;
            freshPurchaseDelegate$handleNavigateToCheckoutScreen$1.L$0 = createOrderResponseAppModel2;
            agencyName = str;
            freshPurchaseDelegate$handleNavigateToCheckoutScreen$1.L$1 = agencyName;
            freshPurchaseDelegate$handleNavigateToCheckoutScreen$1.L$2 = sourceName;
            freshPurchaseDelegate$handleNavigateToCheckoutScreen$1.L$3 = strA2;
            freshPurchaseDelegate$handleNavigateToCheckoutScreen$1.label = 1;
            Object objL = userProfileDetailsProvider.l(freshPurchaseDelegate$handleNavigateToCheckoutScreen$1);
            if (objL == coroutineSingletons) {
                return coroutineSingletons;
            }
            source = sourceName;
            obj = objL;
            str2 = strA2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) freshPurchaseDelegate$handleNavigateToCheckoutScreen$1.L$3;
            source = (String) freshPurchaseDelegate$handleNavigateToCheckoutScreen$1.L$2;
            String str12 = (String) freshPurchaseDelegate$handleNavigateToCheckoutScreen$1.L$1;
            CreateOrderResponseAppModel createOrderResponseAppModel3 = (CreateOrderResponseAppModel) freshPurchaseDelegate$handleNavigateToCheckoutScreen$1.L$0;
            ResultKt.b(obj);
            createOrderResponseAppModel2 = createOrderResponseAppModel3;
            agencyName = str12;
        }
        UserProfileAppModel userProfileAppModel = (UserProfileAppModel) obj;
        if (userProfileAppModel == null || (str3 = userProfileAppModel.i) == null) {
            str3 = "";
        }
        if (userProfileAppModel == null || (str4 = userProfileAppModel.e) == null) {
            str4 = "";
        }
        OrderBookingInfoAppModel orderBookingInfoAppModel = createOrderResponseAppModel2.c;
        try {
            if (orderBookingInfoAppModel != null && (l = orderBookingInfoAppModel.f5642a) != null) {
                c = 4;
                c2 = 3;
                strQ = freshPurchaseDelegate.h.Q(l.longValue());
                if (strQ == null) {
                }
                Intrinsics.i(agencyName, "agencyName");
                Intrinsics.i(source, "source");
                providerConfigAppModelC = CheckoutIntentModelHelperKt.c(createOrderResponseAppModel2);
                merchantUPIConfigAppModelA = CheckoutIntentModelHelperKt.a(createOrderResponseAppModel2);
                String str13 = createOrderResponseAppModel2.f;
                String str14 = createOrderResponseAppModel2.g;
                String str15 = createOrderResponseAppModel2.b;
                int i4 = createOrderResponseAppModel2.f5638a;
                String strValueOf = String.valueOf(i4);
                String str16 = createOrderResponseAppModel2.d;
                String str17 = createOrderResponseAppModel2.e;
                if (providerConfigAppModelC != null || (orderPaymentProviderCustomerDetailsAppModel = providerConfigAppModelC.e) == null) {
                    str5 = null;
                } else {
                    str5 = orderPaymentProviderCustomerDetailsAppModel.f5646a;
                }
                if (providerConfigAppModelC != null) {
                    str6 = providerConfigAppModelC.f;
                } else {
                    str6 = null;
                }
                if (providerConfigAppModelC != null || (str11 = providerConfigAppModelC.g) == null) {
                    str7 = "";
                } else {
                    str7 = str11;
                }
                if (providerConfigAppModelC != null || (str10 = providerConfigAppModelC.h) == null) {
                    str8 = "";
                } else {
                    str8 = str10;
                }
                CheckoutOrderData checkoutOrderData = new CheckoutOrderData(str13, str14, strValueOf, str16, str17, str5, str6, str15, str7, str8, null);
                CheckoutUserDetails checkoutUserDetails = new CheckoutUserDetails(str4, str3);
                OrderPaymentProviderInfoAppModel orderPaymentProviderInfoAppModel = createOrderResponseAppModel2.h;
                if (merchantUPIConfigAppModelA != null) {
                    checkoutPaymentProviderVpaConfig = new CheckoutPaymentProviderVpaConfig(merchantUPIConfigAppModelA.e, merchantUPIConfigAppModelA.f, merchantUPIConfigAppModelA.g);
                } else {
                    checkoutPaymentProviderVpaConfig = null;
                }
                CheckoutPaymentData checkoutPaymentData = new CheckoutPaymentData(checkoutOrderData, checkoutUserDetails, agencyName, orderPaymentProviderInfoAppModel, checkoutPaymentProviderVpaConfig);
                CheckoutProductType checkoutProductType = CheckoutProductType.PREMIUM_RESERVE_TICKET;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Pair pair = new Pair("transactionId", str15);
                Pair pair2 = new Pair("bookingDate", strQ);
                Pair pair3 = new Pair("productType", checkoutProductType.getType());
                Pair pair4 = new Pair("productSubType", checkoutProductType.getType());
                Pair pair5 = new Pair(PaymentConstants.AMOUNT, String.valueOf(i4));
                Pair[] pairArr = new Pair[5];
                pairArr[0] = pair;
                pairArr[1] = pair2;
                pairArr[2] = pair3;
                pairArr[c2] = pair4;
                pairArr[c] = pair5;
                linkedHashMap.putAll(MapsKt.i(pairArr));
                CheckoutIntentModel checkoutIntentModel = new CheckoutIntentModel(checkoutPaymentData, new CheckoutProductData(checkoutProductType, false, new CheckoutAnalyticsData(source, linkedHashMap)));
                ChaloNavigationManager chaloNavigationManager = freshPurchaseDelegate.j;
                Json json = ChaloJson.b;
                json.getClass();
                strA = json.a(CheckoutIntentModel.INSTANCE.serializer(), checkoutIntentModel);
                if (strA == null) {
                    str9 = "";
                } else {
                    str9 = strA;
                }
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new CheckoutPaymentMainArgs(str2, str9), null, "CheckoutTag", 2));
                return unit;
            }
            c = 4;
            c2 = 3;
            Json json2 = ChaloJson.b;
            json2.getClass();
            strA = json2.a(CheckoutIntentModel.INSTANCE.serializer(), checkoutIntentModel);
        } catch (Exception unused) {
            strA = null;
        }
        strQ = "";
        Intrinsics.i(agencyName, "agencyName");
        Intrinsics.i(source, "source");
        providerConfigAppModelC = CheckoutIntentModelHelperKt.c(createOrderResponseAppModel2);
        merchantUPIConfigAppModelA = CheckoutIntentModelHelperKt.a(createOrderResponseAppModel2);
        String str18 = createOrderResponseAppModel2.f;
        String str19 = createOrderResponseAppModel2.g;
        String str110 = createOrderResponseAppModel2.b;
        int i5 = createOrderResponseAppModel2.f5638a;
        String strValueOf2 = String.valueOf(i5);
        String str111 = createOrderResponseAppModel2.d;
        String str112 = createOrderResponseAppModel2.e;
        if (providerConfigAppModelC != null) {
            str5 = null;
        } else {
            str5 = null;
        }
        if (providerConfigAppModelC != null) {
            str6 = providerConfigAppModelC.f;
        } else {
            str6 = null;
        }
        if (providerConfigAppModelC != null) {
            str7 = "";
        } else {
            str7 = "";
        }
        if (providerConfigAppModelC != null) {
            str8 = "";
        } else {
            str8 = "";
        }
        CheckoutOrderData checkoutOrderData2 = new CheckoutOrderData(str18, str19, strValueOf2, str111, str112, str5, str6, str110, str7, str8, null);
        CheckoutUserDetails checkoutUserDetails2 = new CheckoutUserDetails(str4, str3);
        OrderPaymentProviderInfoAppModel orderPaymentProviderInfoAppModel2 = createOrderResponseAppModel2.h;
        if (merchantUPIConfigAppModelA != null) {
            checkoutPaymentProviderVpaConfig = new CheckoutPaymentProviderVpaConfig(merchantUPIConfigAppModelA.e, merchantUPIConfigAppModelA.f, merchantUPIConfigAppModelA.g);
        } else {
            checkoutPaymentProviderVpaConfig = null;
        }
        CheckoutPaymentData checkoutPaymentData2 = new CheckoutPaymentData(checkoutOrderData2, checkoutUserDetails2, agencyName, orderPaymentProviderInfoAppModel2, checkoutPaymentProviderVpaConfig);
        CheckoutProductType checkoutProductType2 = CheckoutProductType.PREMIUM_RESERVE_TICKET;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Pair pair6 = new Pair("transactionId", str110);
        Pair pair7 = new Pair("bookingDate", strQ);
        Pair pair8 = new Pair("productType", checkoutProductType2.getType());
        Pair pair9 = new Pair("productSubType", checkoutProductType2.getType());
        Pair pair10 = new Pair(PaymentConstants.AMOUNT, String.valueOf(i5));
        Pair[] pairArr2 = new Pair[5];
        pairArr2[0] = pair6;
        pairArr2[1] = pair7;
        pairArr2[2] = pair8;
        pairArr2[c2] = pair9;
        pairArr2[c] = pair10;
        linkedHashMap2.putAll(MapsKt.i(pairArr2));
        CheckoutIntentModel checkoutIntentModel2 = new CheckoutIntentModel(checkoutPaymentData2, new CheckoutProductData(checkoutProductType2, false, new CheckoutAnalyticsData(source, linkedHashMap2)));
        ChaloNavigationManager chaloNavigationManager2 = freshPurchaseDelegate.j;
        if (strA == null) {
            str9 = "";
        } else {
            str9 = strA;
        }
        chaloNavigationManager2.b(new ChaloNavigationRequest.Navigate(new CheckoutPaymentMainArgs(str2, str9), null, "CheckoutTag", 2));
        return unit;
    }

    public static long k(PassengerSelectionPolicy passengerSelectionPolicy, String str, Map map, LinkedHashMap linkedHashMap) {
        int i = WhenMappings.b[passengerSelectionPolicy.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (str == null) {
                map = MapsKt.d();
            } else {
                Integer num = (Integer) map.get(str);
                map = MapsKt.h(new Pair(str, Integer.valueOf(num != null ? num.intValue() : 0)));
            }
        }
        long j = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            long jIntValue = ((Number) entry.getValue()).intValue();
            PassengerDetailAppModel passengerDetailAppModel = (PassengerDetailAppModel) linkedHashMap.get(str2);
            long j2 = passengerDetailAppModel != null ? passengerDetailAppModel.h : 0L;
            Long.signum(jIntValue);
            j += jIntValue * j2;
        }
        return j;
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final /* bridge */ PremiumBusFareDetailsDelegateRestoredState b() {
        return null;
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final void c(a aVar) {
        this.y = aVar;
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final void d(CheckoutResultState checkoutResultState) {
        if (checkoutResultState.equals(CheckoutResultState.Failed.f9054a)) {
            return;
        }
        if (!(checkoutResultState instanceof CheckoutResultState.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((CheckoutResultState.Success) checkoutResultState).d;
        if (str != null) {
            e(new PremiumBusFareDetailsIntent.OnPaymentCompletedIntent(str));
        }
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final void dispose() {
        LinkedHashSet linkedHashSet = this.w;
        Iterator it = CollectionsKt.D0(linkedHashSet).iterator();
        while (it.hasNext()) {
            ((Job) it.next()).cancel(null);
        }
        linkedHashSet.clear();
        LinkedHashSet linkedHashSet2 = this.x;
        Iterator it2 = CollectionsKt.D0(linkedHashSet2).iterator();
        while (it2.hasNext()) {
            ((PremiumBusFareDetailsStartedAction) it2.next()).cancel();
        }
        linkedHashSet2.clear();
        this.t = null;
        this.u = null;
        this.s = null;
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final void e(PremiumBusFareDetailsIntent intent) {
        Object value;
        Object value2;
        List list;
        Object value3;
        String str;
        Object value4;
        Object value5;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataState;
        Object value6;
        Object value7;
        Object value8;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataStateA;
        Intrinsics.i(intent, "intent");
        boolean zEquals = intent.equals(PremiumBusFareDetailsIntent.InitializationIntent.f7592a);
        MutableStateFlow mutableStateFlow = this.q;
        if (zEquals) {
            do {
                value8 = mutableStateFlow.getValue();
                premiumBusFareDetailsDataStateA = (PremiumBusFareDetailsDataState) value8;
                if (!premiumBusFareDetailsDataStateA.f) {
                    premiumBusFareDetailsDataStateA = PremiumBusFareDetailsDataState.a(premiumBusFareDetailsDataStateA, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 786431);
                }
            } while (!mutableStateFlow.c(value8, premiumBusFareDetailsDataStateA));
            return;
        }
        boolean z = intent instanceof PremiumBusFareDetailsIntent.OnPayButtonClicked;
        ChaloNavigationManager chaloNavigationManager = this.j;
        PremiumBusFareDetailsFlowType.FreshPurchase freshPurchase = this.f7544a;
        if (z) {
            if (this.s == null) {
                return;
            }
            Object value9 = mutableStateFlow.getValue();
            PremiumBusFareDetailsDataState premiumBusFareDetailsDataState2 = (PremiumBusFareDetailsDataState) value9;
            if (!premiumBusFareDetailsDataState2.e() || premiumBusFareDetailsDataState2.f7578a) {
                value9 = null;
            }
            PremiumBusFareDetailsDataState premiumBusFareDetailsDataState3 = (PremiumBusFareDetailsDataState) value9;
            if (premiumBusFareDetailsDataState3 == null) {
                return;
            }
            Map map = premiumBusFareDetailsDataState3.l;
            PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext = ((PremiumBusFareDetailsDataState) mutableStateFlow.getValue()).t;
            if (premiumBusFareDetailsSharedContext == null) {
                return;
            }
            String str2 = freshPurchase.c;
            String str3 = freshPurchase.d;
            Source source = Source.INSTANT_TICKET_FARE_DETAILS_FRAGMENT;
            long j = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str4 = (String) entry.getKey();
                PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext2 = premiumBusFareDetailsSharedContext;
                long jIntValue = ((Number) entry.getValue()).intValue();
                PassengerDetailAppModel passengerDetailAppModel = (PassengerDetailAppModel) premiumBusFareDetailsDataState3.d().get(str4);
                long j2 = passengerDetailAppModel != null ? passengerDetailAppModel.h : 0L;
                Long.signum(jIntValue);
                j = (jIntValue * j2) + j;
                premiumBusFareDetailsSharedContext = premiumBusFareDetailsSharedContext2;
            }
            PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext3 = premiumBusFareDetailsSharedContext;
            boolean z2 = true;
            AnalyticsContractImplKt.b(this.f, "find my ticket fare fare details pay button clicked", source, MapsKt.l(MapsKt.i(new Pair(PaymentConstants.AMOUNT, Long.valueOf(j)), new Pair("flowType", "premiumReserveTicket")), map), false, 24);
            while (true) {
                Object value10 = mutableStateFlow.getValue();
                premiumBusFareDetailsDataState = (PremiumBusFareDetailsDataState) value10;
                if (mutableStateFlow.c(value10, PremiumBusFareDetailsDataState.a(premiumBusFareDetailsDataState, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, true, null, 786431))) {
                    break;
                } else {
                    z2 = true;
                }
            }
            if (premiumBusFareDetailsDataState.s) {
                return;
            }
            if (!this.g.a()) {
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new LoginOptionsArgs(Source.PREMIUM_BUS_FARE_DETAILS_SCREEN, z2), null, null, 6));
                do {
                    value7 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.c(value7, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value7, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 786431)));
                return;
            }
            do {
                value6 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value6, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value6, false, null, 0L, null, true, false, true, null, null, null, null, null, null, 0, null, null, null, false, null, 1048415)));
            long jK = k(premiumBusFareDetailsDataState3.m, premiumBusFareDetailsDataState3.n, ((PremiumBusFareDetailsDataState) mutableStateFlow.getValue()).l, ((PremiumBusFareDetailsDataState) mutableStateFlow.getValue()).d());
            Map mapB = premiumBusFareDetailsDataState3.b();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry2 : mapB.entrySet()) {
                String str5 = (String) entry2.getKey();
                int iIntValue = ((Number) entry2.getValue()).intValue();
                PBTicketSelectedPassengerApiRequestModel pBTicketSelectedPassengerApiRequestModel = iIntValue == 0 ? null : new PBTicketSelectedPassengerApiRequestModel(str5, iIntValue);
                if (pBTicketSelectedPassengerApiRequestModel != null) {
                    arrayList.add(pBTicketSelectedPassengerApiRequestModel);
                }
            }
            FareDetailsData fareDetailsData = premiumBusFareDetailsSharedContext3.c;
            m(new FreshPurchaseDelegate$handleOnPayButtonClickedIntent$3(this, premiumBusFareDetailsSharedContext3, str2, jK, new PBTicketSelectedTripDetailsApiRequestModel(fareDetailsData.f8185a.b, fareDetailsData.b.f8199a, fareDetailsData.c.f8199a), arrayList, premiumBusFareDetailsDataState3, str3, null));
            return;
        }
        if (intent.equals(PremiumBusFareDetailsIntent.RetryFareFetchClicked.f7601a)) {
            j();
            return;
        }
        if (intent instanceof PremiumBusFareDetailsIntent.OnPaymentCompletedIntent) {
            m(new FreshPurchaseDelegate$handleOnPaymentCompletedIntent$1(this, ((PremiumBusFareDetailsIntent.OnPaymentCompletedIntent) intent).f7596a, null));
            return;
        }
        if (intent.equals(PremiumBusFareDetailsIntent.NavigateToHomeScreenIntent.f7593a)) {
            PremiumBusFareDetailsDelegateSharedActionsKt.b(chaloNavigationManager);
            return;
        }
        if (intent.equals(PremiumBusFareDetailsIntent.TermsAndConditionsTextClickedIntent.f7605a)) {
            PremiumBusFareDetailsBottomSheetType.TncSection tncSectionD = PremiumBusFareDetailsDelegateSharedActionsKt.d(((PremiumBusFareDetailsDataState) mutableStateFlow.getValue()).j);
            if (tncSectionD == null) {
                return;
            }
            do {
                value5 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value5, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value5, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, tncSectionD, null, false, null, 983039)));
            return;
        }
        if (intent.equals(PremiumBusFareDetailsIntent.OnReadMoreFareNoteIntent.f7597a)) {
            Object value11 = mutableStateFlow.getValue();
            PremiumBusFareDetailsDataState premiumBusFareDetailsDataState4 = (PremiumBusFareDetailsDataState) (((PremiumBusFareDetailsDataState) value11).e() ? value11 : null);
            if (premiumBusFareDetailsDataState4 == null || (str = premiumBusFareDetailsDataState4.i) == null) {
                return;
            }
            do {
                value4 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value4, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value4, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, new PremiumBusFareDetailsBottomSheetType.FareNoteSection(str), null, false, null, 983039)));
            return;
        }
        if (intent.equals(PremiumBusFareDetailsIntent.OrderCreationErrorDialogOkClickedIntent.f7599a)) {
            do {
                value3 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value3, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value3, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 917503)));
            return;
        }
        if (intent.equals(PremiumBusFareDetailsIntent.FareValidationFailedBottomSheetPayButtonClickedIntent.f7589a)) {
            l();
            return;
        }
        if (intent.equals(PremiumBusFareDetailsIntent.FareValidationFailedDismissButtonClickedIntent.f7590a)) {
            l();
            return;
        }
        if (intent.equals(PremiumBusFareDetailsIntent.OnChangeSeatClickedIntent.f7594a)) {
            ChaloNavigationManagerKt.c(chaloNavigationManager);
            return;
        }
        if (intent instanceof PremiumBusFareDetailsIntent.IncreasePassengerCountClicked) {
            p(1, ((PremiumBusFareDetailsIntent.IncreasePassengerCountClicked) intent).f7591a);
            return;
        }
        if (intent instanceof PremiumBusFareDetailsIntent.DecreasePassengerCountClicked) {
            p(-1, ((PremiumBusFareDetailsIntent.DecreasePassengerCountClicked) intent).f7588a);
            return;
        }
        if (!(intent instanceof PremiumBusFareDetailsIntent.OnPassengerCategorySelectedIntent)) {
            if (intent instanceof PremiumBusFareDetailsIntent.SelectPassUpsellOfferIntent) {
                PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel = freshPurchase.e;
                if (premiumBusPassUpsellAppModel == null || !Intrinsics.d(premiumBusPassUpsellAppModel.f7102a, ((PremiumBusFareDetailsIntent.SelectPassUpsellOfferIntent) intent).f7603a)) {
                    premiumBusPassUpsellAppModel = null;
                }
                if (premiumBusPassUpsellAppModel != null) {
                    PremiumBusFareDetailsDataState premiumBusFareDetailsDataState5 = (PremiumBusFareDetailsDataState) mutableStateFlow.getValue();
                    PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext4 = premiumBusFareDetailsDataState5.t;
                    Integer numValueOf = (premiumBusFareDetailsSharedContext4 == null || (list = premiumBusFareDetailsSharedContext4.b) == null) ? null : Integer.valueOf(list.size());
                    int iIntValue2 = numValueOf != null ? numValueOf.intValue() : 0;
                    int iW0 = CollectionsKt.w0(premiumBusFareDetailsDataState5.b().values());
                    if (iIntValue2 > 1 || iW0 > 1) {
                        return;
                    }
                    this.z.invoke(new PremiumBusFareDetailsSwitchRequest.ToPassUpsellNudge(premiumBusPassUpsellAppModel));
                    return;
                }
                return;
            }
            if (intent.equals(PremiumBusFareDetailsIntent.BottomSheetDismissedIntent.f7586a)) {
                do {
                    value2 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.c(value2, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value2, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 983039)));
                return;
            }
            if (!intent.equals(PremiumBusFareDetailsIntent.SeeUpsellDetailsClickedIntent.f7602a)) {
                if (!intent.equals(PremiumBusFareDetailsIntent.OnStoppedIntent.f7598a) && !intent.equals(PremiumBusFareDetailsIntent.CancelOrderApiIntent.f7587a) && !intent.equals(PremiumBusFareDetailsIntent.RemoveUpsellPassIntent.f7600a) && !intent.equals(PremiumBusFareDetailsIntent.SwitchErrorDismissedIntent.f7604a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            PremiumBusPassUpsellAppModel premiumBusPassUpsellAppModel2 = freshPurchase.e;
            if (premiumBusPassUpsellAppModel2 == null) {
                return;
            }
            String str6 = premiumBusPassUpsellAppModel2.b;
            PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext5 = ((PremiumBusFareDetailsDataState) mutableStateFlow.getValue()).t;
            if (premiumBusFareDetailsSharedContext5 == null) {
                return;
            }
            Job job = this.u;
            if (job == null || !((AbstractCoroutine) job).isActive()) {
                SuperPassPurchaseStopsInfo superPassPurchaseStopsInfoE = PremiumBusFareDetailsDelegateSharedActionsKt.e(premiumBusFareDetailsSharedContext5.c);
                if (Intrinsics.d(this.v, str6)) {
                    n(str6, premiumBusFareDetailsSharedContext5, superPassPurchaseStopsInfoE);
                    return;
                }
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.c(value, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value, false, null, 0L, null, false, false, true, null, null, null, null, null, null, 0, null, null, null, false, null, 1048447)));
                this.u = m(new FreshPurchaseDelegate$handleSeeUpsellDetailsClickedIntent$2(this, premiumBusPassUpsellAppModel2, superPassPurchaseStopsInfoE, premiumBusFareDetailsSharedContext5, null));
                return;
            }
            return;
        }
        String str7 = ((PremiumBusFareDetailsIntent.OnPassengerCategorySelectedIntent) intent).f7595a;
        Object value12 = mutableStateFlow.getValue();
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataState6 = (PremiumBusFareDetailsDataState) value12;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataState7 = (PremiumBusFareDetailsDataState) ((!premiumBusFareDetailsDataState6.e() || premiumBusFareDetailsDataState6.f7578a) ? null : value12);
        if (premiumBusFareDetailsDataState7 == null) {
            return;
        }
        int i = WhenMappings.b[premiumBusFareDetailsDataState7.m.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            o(str7, premiumBusFareDetailsDataState7.l);
        } else {
            while (true) {
                Object value13 = mutableStateFlow.getValue();
                String str8 = str7;
                if (mutableStateFlow.c(value13, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value13, false, null, 0L, null, false, false, false, null, null, null, null, null, str8, 0, null, null, null, false, null, 1040383))) {
                    return;
                } else {
                    str7 = str8;
                }
            }
        }
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final void f(a aVar) {
        this.z = aVar;
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final void g(ContextScope scope, PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext) {
        FreshPurchaseDelegate freshPurchaseDelegate = this;
        PremiumBusFareDetailsSharedContext context = premiumBusFareDetailsSharedContext;
        Intrinsics.i(scope, "scope");
        Intrinsics.i(context, "context");
        freshPurchaseDelegate.s = scope;
        while (true) {
            MutableStateFlow mutableStateFlow = freshPurchaseDelegate.q;
            Object value = mutableStateFlow.getValue();
            PremiumBusFareDetailsDataState premiumBusFareDetailsDataState = (PremiumBusFareDetailsDataState) value;
            List list = context.c.f;
            if (list == null) {
                list = EmptyList.f17557a;
            }
            if (mutableStateFlow.c(value, PremiumBusFareDetailsDataState.a(premiumBusFareDetailsDataState, false, null, 0L, null, false, false, false, null, list, null, null, null, null, 0, null, null, null, false, premiumBusFareDetailsSharedContext, 523775))) {
                j();
                return;
            } else {
                freshPurchaseDelegate = this;
                context = premiumBusFareDetailsSharedContext;
            }
        }
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    /* JADX INFO: renamed from: getState, reason: from getter */
    public final StateFlow getQ() {
        return this.r;
    }

    public final void j() {
        Object value;
        if (this.s == null) {
            return;
        }
        MutableStateFlow mutableStateFlow = this.q;
        PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext = ((PremiumBusFareDetailsDataState) mutableStateFlow.getValue()).t;
        if (premiumBusFareDetailsSharedContext == null) {
            return;
        }
        Job job = this.t;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value, true, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 1048570)));
        this.t = m(new FreshPurchaseDelegate$fetchFare$2(premiumBusFareDetailsSharedContext, this, null));
    }

    public final void l() {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.q;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value, false, null, 0L, null, false, false, true, null, null, null, null, null, null, 0, null, null, null, false, null, 982911)));
        j();
    }

    public final Job m(Function2 function2) {
        CoroutineScope coroutineScope = this.s;
        if (coroutineScope == null) {
            return null;
        }
        Job jobD = BuildersKt.d(coroutineScope, null, null, function2, 3);
        this.w.add(jobD);
        ((JobSupport) jobD).w(new wn(29, this, jobD));
        return jobD;
    }

    public final void n(String str, PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext, SuperPassPurchaseStopsInfo superPassPurchaseStopsInfo) {
        Source source;
        Source source2 = Source.PREMIUM_BUS_FARE_DETAILS_SCREEN;
        int i = WhenMappings.f7545a[premiumBusFareDetailsSharedContext.d.ordinal()];
        if (i == 1) {
            source = Source.PREMIUM_BUS_SEAT_SELECTION_SCREEN;
        } else if (i == 2) {
            source = Source.PREMIUM_BUS_SLOT_SELECTION_SCREEN;
        } else if (i == 3) {
            source = Source.PREMIUM_BUS_PRODUCT_SELECTION_SCREEN;
        } else {
            if (i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            source = Source.PREMIUM_BUS_STOP_SELECTION_SCREEN;
        }
        Source source3 = source;
        Json json = ChaloJson.b;
        json.getClass();
        this.j.b(new ChaloNavigationRequest.Navigate(new PassSelectionArgs(str, source2, source3, json.a(SuperPassPurchaseStopsInfo.INSTANCE.serializer(), superPassPurchaseStopsInfo), PostPassPurchaseSuccessFlowType.PREMIUM_PASS_BOOKING_CONTINUE, 32), null, null, 6));
    }

    public final void o(String str, Map map) {
        MutableStateFlow mutableStateFlow;
        Object value;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataState;
        do {
            mutableStateFlow = this.q;
            value = mutableStateFlow.getValue();
            premiumBusFareDetailsDataState = (PremiumBusFareDetailsDataState) value;
        } while (!mutableStateFlow.c(value, PremiumBusFareDetailsDataState.a(premiumBusFareDetailsDataState, false, null, k(premiumBusFareDetailsDataState.m, str, map, premiumBusFareDetailsDataState.d()), null, false, false, false, null, null, null, map, null, str, 0, null, null, null, false, null, 1038327)));
    }

    public final void p(int i, String str) {
        MutableStateFlow mutableStateFlow = this.q;
        Object value = mutableStateFlow.getValue();
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataState = (PremiumBusFareDetailsDataState) value;
        if (!premiumBusFareDetailsDataState.e() || premiumBusFareDetailsDataState.f7578a) {
            value = null;
        }
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataState2 = (PremiumBusFareDetailsDataState) value;
        if (premiumBusFareDetailsDataState2 == null) {
            return;
        }
        Map map = premiumBusFareDetailsDataState2.l;
        PassengerDetailAppModel passengerDetailAppModel = (PassengerDetailAppModel) premiumBusFareDetailsDataState2.d().get(str);
        if (passengerDetailAppModel != null) {
            SeatLimitAppModel seatLimitAppModel = passengerDetailAppModel.i;
            Integer num = (Integer) map.get(str);
            if (num != null) {
                int iIntValue = num.intValue();
                if (i > 0) {
                    if (iIntValue >= seatLimitAppModel.b || CollectionsKt.w0(premiumBusFareDetailsDataState2.b().values()) >= premiumBusFareDetailsDataState2.o) {
                        return;
                    }
                } else if (iIntValue <= seatLimitAppModel.f3893a) {
                    return;
                }
                int i2 = iIntValue + i;
                Integer num2 = (Integer) ((PremiumBusFareDetailsDataState) mutableStateFlow.getValue()).l.get(str);
                AnalyticsContractImplKt.b(this.f, "find my ticket fare fare details passenger count changed", Source.INSTANT_TICKET_FARE_DETAILS_FRAGMENT, MapsKt.i(new Pair("previous value", Integer.valueOf(num2 != null ? num2.intValue() : 1)), new Pair("current value", Integer.valueOf(num2 != null ? num2.intValue() + i : 1)), new Pair("flowType", "premiumReserveTicket")), false, 24);
                o(premiumBusFareDetailsDataState2.n, MapsKt.m(map, new Pair(str, Integer.valueOf(i2))));
            }
        }
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final /* bridge */ void a(PremiumBusFareDetailsDelegateRestoredState premiumBusFareDetailsDelegateRestoredState) {
    }
}
