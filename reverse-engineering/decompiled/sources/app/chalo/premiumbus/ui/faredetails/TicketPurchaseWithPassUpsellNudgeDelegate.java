package app.chalo.premiumbus.ui.faredetails;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.domain.ProductPurchaseMinProfileDecision;
import app.chalo.domain.ProductPurchaseMinProfileDecisionHelper;
import app.chalo.domain.ResolveProductPurchaseMinProfileDecisionUseCase;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.login.userprofiling.hookorchestrator.UserProfilingHookSlot;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.data.PassUpsellPurchaseOffer;
import app.chalo.premiumbus.data.PassUpsellPurchaseWrapper;
import app.chalo.premiumbus.data.models.api.request.PBTicketSelectedTripDetailsApiRequestModel;
import app.chalo.premiumbus.data.models.app.PBReserveTicketThroughPassResponseAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusUpsellRideOutcome;
import app.chalo.premiumbus.domain.ReserveSeatThroughPassErrorReasons;
import app.chalo.premiumbus.domain.ReserveSeatThroughPassUseCase;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsBottomSheetType;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsDataState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsDelegateRestoredState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsError;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsIntent;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSharedContext;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSwitchRequest;
import app.chalo.productbooking.common.data.models.app.FareDetailsData;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.DecomposeResultStateDataCollector;
import app.chalo.resultstatemanager.ResultStateDataCollector;
import app.chalo.resultstatemanager.checkout.CheckoutResultState;
import app.chalo.resultstatemanager.minprofileupdate.MinProfileUpdateResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.LoginOptionsArgs;
import app.chalo.scenes.args.ProductActivationArgs;
import app.chalo.usecase.CheckIsUserLoggedInUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.KUUID;
import defpackage.hi1;
import defpackage.on;
import defpackage.pg1;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/TicketPurchaseWithPassUpsellNudgeDelegate;", "Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsDelegate;", "Lapp/chalo/resultstatemanager/ResultStateDataCollector;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TicketPurchaseWithPassUpsellNudgeDelegate implements PremiumBusFareDetailsDelegate, ResultStateDataCollector {
    public Job A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DecomposeResultStateDataCollector f7558a;
    public final PremiumBusFareDetailsFlowType.PassUpsellNudge b;
    public final PassUpsellPurchaseWrapper c;
    public final ReserveSeatThroughPassUseCase d;
    public final AnalyticsContract e;
    public final CheckIsUserLoggedInUseCase f;
    public final ResolveProductPurchaseMinProfileDecisionUseCase g;
    public final ProductPurchaseMinProfileDecisionHelper h;
    public final MinProfileUpdateResultStateManager i;
    public final KotlinToastManager j;
    public final CurrencyFeature k;
    public final StringProvider l;
    public final ChaloNavigationManager m;
    public final CrashlyticsLogger n;
    public final ProductsSyncContract o;
    public final MutableStateFlow p;
    public final StateFlow q;
    public Function1 r;
    public Function1 s;
    public PassUpsellPurchaseOffer t;
    public String u;
    public String v;
    public String w;
    public CoroutineScope x;
    public final LinkedHashSet y;
    public Job z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/TicketPurchaseWithPassUpsellNudgeDelegate$Companion;", "", "", "TAG", "Ljava/lang/String;", "PASS_UPSELL_FLOW_TYPE", "OFFER_UNAVAILABLE_FAILURE_REASON", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public TicketPurchaseWithPassUpsellNudgeDelegate(PremiumBusFareDetailsFlowType.PassUpsellNudge flowType, PassUpsellPurchaseWrapper passUpsellPurchaseWrapper, ReserveSeatThroughPassUseCase reserveSeatThroughPassUseCase, AnalyticsContract analyticsContract, CheckIsUserLoggedInUseCase checkIsUserLoggedInUseCase, ResolveProductPurchaseMinProfileDecisionUseCase resolveProductPurchaseMinProfileDecisionUseCase, ProductPurchaseMinProfileDecisionHelper productPurchaseMinProfileDecisionHelper, MinProfileUpdateResultStateManager minProfileUpdateResultStateManager, KotlinToastManager kotlinToastManager, CurrencyFeature currencyFeature, StringProvider stringProvider, ChaloNavigationManager chaloNavigationManager, CrashlyticsLogger crashlyticsLogger, DecomposeResultStateDataCollector decomposeResultStateDataCollector, ProductsSyncContract productsSyncContract) {
        Intrinsics.i(flowType, "flowType");
        this.f7558a = decomposeResultStateDataCollector;
        this.b = flowType;
        this.c = passUpsellPurchaseWrapper;
        this.d = reserveSeatThroughPassUseCase;
        this.e = analyticsContract;
        this.f = checkIsUserLoggedInUseCase;
        this.g = resolveProductPurchaseMinProfileDecisionUseCase;
        this.h = productPurchaseMinProfileDecisionHelper;
        this.i = minProfileUpdateResultStateManager;
        this.j = kotlinToastManager;
        this.k = currencyFeature;
        this.l = stringProvider;
        this.m = chaloNavigationManager;
        this.n = crashlyticsLogger;
        this.o = productsSyncContract;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new PremiumBusFareDetailsDataState());
        this.p = mutableStateFlowA;
        this.q = FlowKt.c(mutableStateFlowA);
        this.r = new hi1(8);
        this.s = new on(17);
        this.y = new LinkedHashSet();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object h(TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate, boolean z, ContinuationImpl continuationImpl) {
        TicketPurchaseWithPassUpsellNudgeDelegate$emitError$1 ticketPurchaseWithPassUpsellNudgeDelegate$emitError$1;
        boolean z2;
        Object value;
        ticketPurchaseWithPassUpsellNudgeDelegate.getClass();
        if (continuationImpl instanceof TicketPurchaseWithPassUpsellNudgeDelegate$emitError$1) {
            ticketPurchaseWithPassUpsellNudgeDelegate$emitError$1 = (TicketPurchaseWithPassUpsellNudgeDelegate$emitError$1) continuationImpl;
            int i = ticketPurchaseWithPassUpsellNudgeDelegate$emitError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ticketPurchaseWithPassUpsellNudgeDelegate$emitError$1.label = i - Integer.MIN_VALUE;
            } else {
                ticketPurchaseWithPassUpsellNudgeDelegate$emitError$1 = new TicketPurchaseWithPassUpsellNudgeDelegate$emitError$1(ticketPurchaseWithPassUpsellNudgeDelegate, continuationImpl);
            }
        } else {
            ticketPurchaseWithPassUpsellNudgeDelegate$emitError$1 = new TicketPurchaseWithPassUpsellNudgeDelegate$emitError$1(ticketPurchaseWithPassUpsellNudgeDelegate, continuationImpl);
        }
        Object objB = ticketPurchaseWithPassUpsellNudgeDelegate$emitError$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ticketPurchaseWithPassUpsellNudgeDelegate$emitError$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            ticketPurchaseWithPassUpsellNudgeDelegate$emitError$1.Z$0 = z;
            ticketPurchaseWithPassUpsellNudgeDelegate$emitError$1.label = 1;
            objB = ticketPurchaseWithPassUpsellNudgeDelegate.l.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], ticketPurchaseWithPassUpsellNudgeDelegate$emitError$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            z2 = z;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = ticketPurchaseWithPassUpsellNudgeDelegate$emitError$1.Z$0;
            ResultKt.b(objB);
        }
        String str = (String) objB;
        MutableStateFlow mutableStateFlow = ticketPurchaseWithPassUpsellNudgeDelegate.p;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value, false, new PremiumBusFareDetailsError(str, z2), 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 1048568)));
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e5 A[PHI: r5
      0x00e5: PHI (r5v26 java.lang.String) = (r5v24 java.lang.String), (r5v29 java.lang.String) binds: [B:37:0x00f0, B:31:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x020d  */
    /* JADX WARN: Code duplicated, block: B:73:0x023d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0240  */
    /* JADX WARN: Code duplicated, block: B:76:0x0244  */
    /* JADX WARN: Code duplicated, block: B:82:0x027e  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public static final Object i(TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate, String str, ContinuationImpl continuationImpl) {
        TicketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$1 ticketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$1;
        PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext;
        Object obj;
        String str2;
        Object value;
        String str3;
        ChaloUseCaseResult chaloUseCaseResult;
        String str4;
        Object value2;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataStateA;
        Object value3;
        ChaloUseCaseResult chaloUseCaseResult2;
        Object value4;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataStateA2;
        PremiumBusUpsellRideOutcome premiumBusUpsellRideOutcomeN;
        MutableStateFlow mutableStateFlow = ticketPurchaseWithPassUpsellNudgeDelegate.p;
        AnalyticsContract analyticsContract = ticketPurchaseWithPassUpsellNudgeDelegate.e;
        if (continuationImpl instanceof TicketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$1) {
            ticketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$1 = (TicketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$1) continuationImpl;
            int i = ticketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ticketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$1.label = i - Integer.MIN_VALUE;
            } else {
                ticketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$1 = new TicketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$1(ticketPurchaseWithPassUpsellNudgeDelegate, continuationImpl);
            }
        } else {
            ticketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$1 = new TicketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$1(ticketPurchaseWithPassUpsellNudgeDelegate, continuationImpl);
        }
        TicketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$1 ticketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$2 = ticketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$1;
        Object obj2 = ticketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ticketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$2.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext2 = ((PremiumBusFareDetailsDataState) mutableStateFlow.getValue()).t;
            if (premiumBusFareDetailsSharedContext2 != null) {
                FareDetailsData fareDetailsData = premiumBusFareDetailsSharedContext2.c;
                PBTicketSelectedTripDetailsApiRequestModel pBTicketSelectedTripDetailsApiRequestModel = new PBTicketSelectedTripDetailsApiRequestModel(fareDetailsData.f8185a.b, fareDetailsData.b.f8199a, fareDetailsData.c.f8199a);
                ReserveSeatThroughPassUseCase reserveSeatThroughPassUseCase = ticketPurchaseWithPassUpsellNudgeDelegate.d;
                String str5 = premiumBusFareDetailsSharedContext2.f7607a;
                List list = premiumBusFareDetailsSharedContext2.b;
                ticketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$2.L$0 = str;
                ticketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$2.L$1 = premiumBusFareDetailsSharedContext2;
                ticketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$2.label = 1;
                Object objA = reserveSeatThroughPassUseCase.a(pBTicketSelectedTripDetailsApiRequestModel, str5, str, list, ticketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$2);
                if (objA != coroutineSingletons) {
                    premiumBusFareDetailsSharedContext = premiumBusFareDetailsSharedContext2;
                    obj = objA;
                    str2 = str;
                }
                return coroutineSingletons;
            }
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 1048383)));
            return Unit.f17538a;
        }
        if (i2 == 1) {
            PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext3 = (PremiumBusFareDetailsSharedContext) ticketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$2.L$1;
            String str6 = (String) ticketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$2.L$0;
            ResultKt.b(obj2);
            obj = obj2;
            str2 = str6;
            premiumBusFareDetailsSharedContext = premiumBusFareDetailsSharedContext3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloUseCaseResult = (ChaloUseCaseResult) ticketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$2.L$1;
            str3 = (String) ticketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$2.L$0;
            ResultKt.b(obj2);
        }
        chaloUseCaseResult2 = (ChaloUseCaseResult) obj2;
        do {
            value4 = mutableStateFlow.getValue();
            premiumBusFareDetailsDataStateA2 = (PremiumBusFareDetailsDataState) value4;
            if (premiumBusFareDetailsDataStateA2.e()) {
                premiumBusFareDetailsDataStateA2 = PremiumBusFareDetailsDataState.a(premiumBusFareDetailsDataStateA2, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 1048543);
            }
        } while (!mutableStateFlow.c(value4, premiumBusFareDetailsDataStateA2));
        if (chaloUseCaseResult2 instanceof ChaloUseCaseResult.Failure) {
            premiumBusUpsellRideOutcomeN = PremiumBusUpsellRideOutcome.BookedButUnconfirmed.INSTANCE;
        } else {
            if (chaloUseCaseResult2 instanceof ChaloUseCaseResult.Success) {
                throw new NoWhenBranchMatchedException();
            }
            premiumBusUpsellRideOutcomeN = n(chaloUseCaseResult);
        }
        ticketPurchaseWithPassUpsellNudgeDelegate.l(str3, premiumBusUpsellRideOutcomeN);
        do {
            value3 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value3, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value3, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 1048511)));
        return Unit.f17538a;
        ChaloUseCaseResult chaloUseCaseResult3 = (ChaloUseCaseResult) obj;
        if (!(chaloUseCaseResult3 instanceof ChaloUseCaseResult.Failure)) {
            if (!(chaloUseCaseResult3 instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            PBReserveTicketThroughPassResponseAppModel pBReserveTicketThroughPassResponseAppModel = (PBReserveTicketThroughPassResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult3).f10419a;
            AnalyticsContractImplKt.b(analyticsContract, "pb ticket booked through pass success", Source.PREMIUM_BUS_FARE_DETAILS_SCREEN, MapsKt.i(new Pair("bookingId", pBReserveTicketThroughPassResponseAppModel.f7094a), new Pair("tripId", premiumBusFareDetailsSharedContext.f7607a), new Pair("passId", str2), new Pair("pass status", pBReserveTicketThroughPassResponseAppModel.b), new Pair("flowType", "premiumReserveTicketWithPassUpsell")), false, 24);
            ProductsSyncContract productsSyncContract = ticketPurchaseWithPassUpsellNudgeDelegate.o;
            ticketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$2.L$0 = str2;
            ticketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$2.L$1 = chaloUseCaseResult3;
            ticketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$2.label = 2;
            Object objB = productsSyncContract.b(ticketPurchaseWithPassUpsellNudgeDelegate$reserveSeatThroughPurchasedPass$2);
            if (objB != coroutineSingletons) {
                str3 = str2;
                obj2 = objB;
                chaloUseCaseResult = chaloUseCaseResult3;
                chaloUseCaseResult2 = (ChaloUseCaseResult) obj2;
                do {
                    value4 = mutableStateFlow.getValue();
                    premiumBusFareDetailsDataStateA2 = (PremiumBusFareDetailsDataState) value4;
                    if (premiumBusFareDetailsDataStateA2.e()) {
                        premiumBusFareDetailsDataStateA2 = PremiumBusFareDetailsDataState.a(premiumBusFareDetailsDataStateA2, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 1048543);
                    }
                } while (!mutableStateFlow.c(value4, premiumBusFareDetailsDataStateA2));
                if (chaloUseCaseResult2 instanceof ChaloUseCaseResult.Failure) {
                    premiumBusUpsellRideOutcomeN = PremiumBusUpsellRideOutcome.BookedButUnconfirmed.INSTANCE;
                } else {
                    if (chaloUseCaseResult2 instanceof ChaloUseCaseResult.Success) {
                        throw new NoWhenBranchMatchedException();
                    }
                    premiumBusUpsellRideOutcomeN = n(chaloUseCaseResult);
                }
                ticketPurchaseWithPassUpsellNudgeDelegate.l(str3, premiumBusUpsellRideOutcomeN);
            }
            return coroutineSingletons;
        }
        ReserveSeatThroughPassErrorReasons reserveSeatThroughPassErrorReasons = (ReserveSeatThroughPassErrorReasons) ((ChaloUseCaseResult.Failure) chaloUseCaseResult3).f10418a;
        String str7 = "";
        if (reserveSeatThroughPassErrorReasons instanceof ReserveSeatThroughPassErrorReasons.ServerError) {
            str4 = ((ReserveSeatThroughPassErrorReasons.ServerError) reserveSeatThroughPassErrorReasons).f7247a;
            if (str4 != null) {
                str7 = str4;
            }
        } else if (reserveSeatThroughPassErrorReasons instanceof ReserveSeatThroughPassErrorReasons.GenderMismatchError) {
            str4 = ((ReserveSeatThroughPassErrorReasons.GenderMismatchError) reserveSeatThroughPassErrorReasons).f7243a;
            if (str4 != null) {
                str7 = str4;
            }
        } else if (!Intrinsics.d(reserveSeatThroughPassErrorReasons, ReserveSeatThroughPassErrorReasons.UserNotLoggedIn.f7249a) && !Intrinsics.d(reserveSeatThroughPassErrorReasons, ReserveSeatThroughPassErrorReasons.LocalError.f7245a) && !Intrinsics.d(reserveSeatThroughPassErrorReasons, ReserveSeatThroughPassErrorReasons.ParseError.f7246a) && !Intrinsics.d(reserveSeatThroughPassErrorReasons, ReserveSeatThroughPassErrorReasons.UnknownError.f7248a) && !Intrinsics.d(reserveSeatThroughPassErrorReasons, ReserveSeatThroughPassErrorReasons.HistoryCallFailed.f7244a)) {
            throw new NoWhenBranchMatchedException();
        }
        AnalyticsContractImplKt.b(analyticsContract, "pb ticket booked through pass failure", Source.PREMIUM_BUS_FARE_DETAILS_SCREEN, MapsKt.i(new Pair("error", reserveSeatThroughPassErrorReasons.a()), new Pair("errorMessage", str7), new Pair("flowType", "premiumReserveTicketWithPassUpsell")), false, 24);
        do {
            value2 = mutableStateFlow.getValue();
            premiumBusFareDetailsDataStateA = (PremiumBusFareDetailsDataState) value2;
            if (premiumBusFareDetailsDataStateA.e()) {
                premiumBusFareDetailsDataStateA = PremiumBusFareDetailsDataState.a(premiumBusFareDetailsDataStateA, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 1048543);
            }
        } while (!mutableStateFlow.c(value2, premiumBusFareDetailsDataStateA));
        ticketPurchaseWithPassUpsellNudgeDelegate.l(str2, n(chaloUseCaseResult3));
        do {
            value3 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value3, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value3, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 1048511)));
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object j(TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate, ContinuationImpl continuationImpl) throws Throwable {
        TicketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$1 ticketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$1;
        ticketPurchaseWithPassUpsellNudgeDelegate.getClass();
        if (continuationImpl instanceof TicketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$1) {
            ticketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$1 = (TicketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$1) continuationImpl;
            int i = ticketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ticketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$1.label = i - Integer.MIN_VALUE;
            } else {
                ticketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$1 = new TicketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$1(ticketPurchaseWithPassUpsellNudgeDelegate, continuationImpl);
            }
        } else {
            ticketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$1 = new TicketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$1(ticketPurchaseWithPassUpsellNudgeDelegate, continuationImpl);
        }
        TicketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$1 ticketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$2 = ticketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$1;
        Object objA = ticketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ticketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$2.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            ResolveProductPurchaseMinProfileDecisionUseCase resolveProductPurchaseMinProfileDecisionUseCase = ticketPurchaseWithPassUpsellNudgeDelegate.g;
            Source source = Source.PREMIUM_BUS_FARE_DETAILS_SCREEN;
            String ruleId = UserProfilingHookSlot.CONFIRM_SUPER_PASS_PURCHASE_MIN_PROFILE_FLOW.getRuleId();
            ticketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$2.label = 1;
            objA = resolveProductPurchaseMinProfileDecisionUseCase.a(source, ruleId, ticketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$2);
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
        ProductPurchaseMinProfileDecisionHelper productPurchaseMinProfileDecisionHelper = ticketPurchaseWithPassUpsellNudgeDelegate.h;
        Source source2 = Source.PREMIUM_BUS_FARE_DETAILS_SCREEN;
        pg1 pg1Var = new pg1(12, ticketPurchaseWithPassUpsellNudgeDelegate, strA);
        TicketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$3 ticketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$3 = new TicketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$3(ticketPurchaseWithPassUpsellNudgeDelegate, strA, null);
        ticketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$2.label = 2;
        Object objA2 = productPurchaseMinProfileDecisionHelper.a((ProductPurchaseMinProfileDecision) objA, source2, pg1Var, ticketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$3, ticketPurchaseWithPassUpsellNudgeDelegate$shouldProceedWithOrderCreation$2);
        return objA2 == coroutineSingletons ? coroutineSingletons : objA2;
    }

    public static PremiumBusUpsellRideOutcome n(ChaloUseCaseResult chaloUseCaseResult) {
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            return new PremiumBusUpsellRideOutcome.Booked(((PBReserveTicketThroughPassResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f7094a);
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        ReserveSeatThroughPassErrorReasons reserveSeatThroughPassErrorReasons = (ReserveSeatThroughPassErrorReasons) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
        if (Intrinsics.d(reserveSeatThroughPassErrorReasons, ReserveSeatThroughPassErrorReasons.HistoryCallFailed.f7244a)) {
            return PremiumBusUpsellRideOutcome.BookedButUnconfirmed.INSTANCE;
        }
        if (reserveSeatThroughPassErrorReasons instanceof ReserveSeatThroughPassErrorReasons.ServerError) {
            return new PremiumBusUpsellRideOutcome.Failed(((ReserveSeatThroughPassErrorReasons.ServerError) reserveSeatThroughPassErrorReasons).f7247a);
        }
        if (reserveSeatThroughPassErrorReasons instanceof ReserveSeatThroughPassErrorReasons.GenderMismatchError) {
            return new PremiumBusUpsellRideOutcome.Failed(((ReserveSeatThroughPassErrorReasons.GenderMismatchError) reserveSeatThroughPassErrorReasons).f7243a);
        }
        if (Intrinsics.d(reserveSeatThroughPassErrorReasons, ReserveSeatThroughPassErrorReasons.LocalError.f7245a) || Intrinsics.d(reserveSeatThroughPassErrorReasons, ReserveSeatThroughPassErrorReasons.ParseError.f7246a) || Intrinsics.d(reserveSeatThroughPassErrorReasons, ReserveSeatThroughPassErrorReasons.UnknownError.f7248a) || Intrinsics.d(reserveSeatThroughPassErrorReasons, ReserveSeatThroughPassErrorReasons.UserNotLoggedIn.f7249a)) {
            return new PremiumBusUpsellRideOutcome.Failed(null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final void a(PremiumBusFareDetailsDelegateRestoredState premiumBusFareDetailsDelegateRestoredState) {
        this.u = premiumBusFareDetailsDelegateRestoredState.f7580a;
        this.v = premiumBusFareDetailsDelegateRestoredState.b;
        this.w = premiumBusFareDetailsDelegateRestoredState.c;
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final PremiumBusFareDetailsDelegateRestoredState b() {
        String str = this.u;
        if (str != null) {
            return new PremiumBusFareDetailsDelegateRestoredState(str, this.v, this.w);
        }
        return null;
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final void c(a aVar) {
        this.s = aVar;
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final void d(CheckoutResultState checkoutResultState) {
        MutableStateFlow mutableStateFlow;
        Object value;
        Object value2;
        Object value3;
        this.s.invoke(null);
        do {
            mutableStateFlow = this.p;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 786431)));
        if (checkoutResultState.equals(CheckoutResultState.Failed.f9054a)) {
            do {
                value3 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.c(value3, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value3, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 1048415)));
            return;
        }
        if (!(checkoutResultState instanceof CheckoutResultState.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = this.u;
        if (str == null) {
            return;
        }
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value2, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value2, false, null, 0L, null, false, true, true, null, null, null, null, null, null, 0, null, null, null, false, null, 1048383)));
        Job job = this.A;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.A = k(new TicketPurchaseWithPassUpsellNudgeDelegate$onRecoveredCheckoutResult$4(this, str, null));
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final void dispose() {
        LinkedHashSet linkedHashSet = this.y;
        Iterator it = CollectionsKt.D0(linkedHashSet).iterator();
        while (it.hasNext()) {
            ((Job) it.next()).cancel(null);
        }
        linkedHashSet.clear();
        this.z = null;
        this.A = null;
        this.x = null;
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final void e(PremiumBusFareDetailsIntent intent) {
        Object value;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataStateA;
        Object value2;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataStateA2;
        PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext;
        Object value3;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataState;
        Object value4;
        Object value5;
        Object value6;
        PremiumBusFareDetailsDataState premiumBusFareDetailsDataStateA3;
        Intrinsics.i(intent, "intent");
        boolean zEquals = intent.equals(PremiumBusFareDetailsIntent.NavigateToHomeScreenIntent.f7593a);
        ChaloNavigationManager chaloNavigationManager = this.m;
        if (zEquals) {
            PremiumBusFareDetailsDelegateSharedActionsKt.b(chaloNavigationManager);
            return;
        }
        boolean zEquals2 = intent.equals(PremiumBusFareDetailsIntent.TermsAndConditionsTextClickedIntent.f7605a);
        MutableStateFlow mutableStateFlow = this.p;
        if (zEquals2) {
            PremiumBusFareDetailsBottomSheetType.TncSection tncSectionD = PremiumBusFareDetailsDelegateSharedActionsKt.d(((PremiumBusFareDetailsDataState) mutableStateFlow.getValue()).j);
            if (tncSectionD == null) {
                return;
            }
            do {
                value6 = mutableStateFlow.getValue();
                premiumBusFareDetailsDataStateA3 = (PremiumBusFareDetailsDataState) value6;
                if (premiumBusFareDetailsDataStateA3.e()) {
                    premiumBusFareDetailsDataStateA3 = PremiumBusFareDetailsDataState.a(premiumBusFareDetailsDataStateA3, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, tncSectionD, null, false, null, 983039);
                }
            } while (!mutableStateFlow.c(value6, premiumBusFareDetailsDataStateA3));
            return;
        }
        if (intent.equals(PremiumBusFareDetailsIntent.OnChangeSeatClickedIntent.f7594a)) {
            ChaloNavigationManagerKt.c(chaloNavigationManager);
            return;
        }
        if (intent.equals(PremiumBusFareDetailsIntent.RemoveUpsellPassIntent.f7600a)) {
            this.r.invoke(PremiumBusFareDetailsSwitchRequest.ToFreshPurchase.f7610a);
            return;
        }
        if (intent instanceof PremiumBusFareDetailsIntent.OnPayButtonClicked) {
            PassUpsellPurchaseOffer passUpsellPurchaseOffer = this.t;
            if (passUpsellPurchaseOffer == null || (premiumBusFareDetailsSharedContext = ((PremiumBusFareDetailsDataState) mutableStateFlow.getValue()).t) == null || !((PremiumBusFareDetailsDataState) mutableStateFlow.getValue()).e()) {
                return;
            }
            AnalyticsContractImplKt.b(this.e, "find my ticket fare fare details pay button clicked", Source.INSTANT_TICKET_FARE_DETAILS_FRAGMENT, MapsKt.i(new Pair(PaymentConstants.AMOUNT, Long.valueOf(((PremiumBusFareDetailsDataState) mutableStateFlow.getValue()).d)), new Pair("flowType", "premiumReserveTicketWithPassUpsell")), false, 24);
            if (((PremiumBusFareDetailsDataState) mutableStateFlow.getValue()).c()) {
                return;
            }
            do {
                value3 = mutableStateFlow.getValue();
                premiumBusFareDetailsDataState = (PremiumBusFareDetailsDataState) value3;
            } while (!mutableStateFlow.c(value3, PremiumBusFareDetailsDataState.a(premiumBusFareDetailsDataState, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, true, null, 786431)));
            if (premiumBusFareDetailsDataState.s) {
                return;
            }
            if (this.f.a()) {
                do {
                    value4 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.c(value4, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value4, false, null, 0L, null, true, false, true, null, null, null, null, null, null, 0, null, null, null, false, null, 1048415)));
                this.A = k(new TicketPurchaseWithPassUpsellNudgeDelegate$handleOnPayButtonClicked$3(this, passUpsellPurchaseOffer, premiumBusFareDetailsSharedContext, null));
                return;
            } else {
                chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new LoginOptionsArgs(Source.PREMIUM_BUS_FARE_DETAILS_SCREEN, true), null, null, 6));
                do {
                    value5 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.c(value5, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value5, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 786431)));
                return;
            }
        }
        if (intent.equals(PremiumBusFareDetailsIntent.BottomSheetDismissedIntent.f7586a)) {
            do {
                value2 = mutableStateFlow.getValue();
                premiumBusFareDetailsDataStateA2 = (PremiumBusFareDetailsDataState) value2;
                if (premiumBusFareDetailsDataStateA2.e()) {
                    premiumBusFareDetailsDataStateA2 = PremiumBusFareDetailsDataState.a(premiumBusFareDetailsDataStateA2, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 983039);
                }
            } while (!mutableStateFlow.c(value2, premiumBusFareDetailsDataStateA2));
            return;
        }
        if (intent.equals(PremiumBusFareDetailsIntent.InitializationIntent.f7592a)) {
            do {
                value = mutableStateFlow.getValue();
                premiumBusFareDetailsDataStateA = (PremiumBusFareDetailsDataState) value;
                if (!premiumBusFareDetailsDataStateA.f) {
                    premiumBusFareDetailsDataStateA = PremiumBusFareDetailsDataState.a(premiumBusFareDetailsDataStateA, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 786431);
                }
            } while (!mutableStateFlow.c(value, premiumBusFareDetailsDataStateA));
            return;
        }
        if (intent.equals(PremiumBusFareDetailsIntent.RetryFareFetchClicked.f7601a)) {
            PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext2 = ((PremiumBusFareDetailsDataState) mutableStateFlow.getValue()).t;
            if (premiumBusFareDetailsSharedContext2 != null) {
                m(premiumBusFareDetailsSharedContext2);
                return;
            }
            return;
        }
        if (!intent.equals(PremiumBusFareDetailsIntent.OnStoppedIntent.f7598a) && !intent.equals(PremiumBusFareDetailsIntent.CancelOrderApiIntent.f7587a) && !(intent instanceof PremiumBusFareDetailsIntent.OnPaymentCompletedIntent) && !intent.equals(PremiumBusFareDetailsIntent.OnReadMoreFareNoteIntent.f7597a) && !intent.equals(PremiumBusFareDetailsIntent.OrderCreationErrorDialogOkClickedIntent.f7599a) && !intent.equals(PremiumBusFareDetailsIntent.FareValidationFailedBottomSheetPayButtonClickedIntent.f7589a) && !intent.equals(PremiumBusFareDetailsIntent.FareValidationFailedDismissButtonClickedIntent.f7590a) && !(intent instanceof PremiumBusFareDetailsIntent.IncreasePassengerCountClicked) && !(intent instanceof PremiumBusFareDetailsIntent.DecreasePassengerCountClicked) && !(intent instanceof PremiumBusFareDetailsIntent.OnPassengerCategorySelectedIntent) && !(intent instanceof PremiumBusFareDetailsIntent.SelectPassUpsellOfferIntent) && !intent.equals(PremiumBusFareDetailsIntent.SeeUpsellDetailsClickedIntent.f7602a) && !intent.equals(PremiumBusFareDetailsIntent.SwitchErrorDismissedIntent.f7604a)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final void f(a aVar) {
        this.r = aVar;
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    public final void g(ContextScope scope, PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext) {
        TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate = this;
        PremiumBusFareDetailsSharedContext context = premiumBusFareDetailsSharedContext;
        Intrinsics.i(scope, "scope");
        Intrinsics.i(context, "context");
        ticketPurchaseWithPassUpsellNudgeDelegate.x = scope;
        while (true) {
            MutableStateFlow mutableStateFlow = ticketPurchaseWithPassUpsellNudgeDelegate.p;
            Object value = mutableStateFlow.getValue();
            PremiumBusFareDetailsDataState premiumBusFareDetailsDataState = (PremiumBusFareDetailsDataState) value;
            List list = context.c.f;
            if (list == null) {
                list = EmptyList.f17557a;
            }
            context = premiumBusFareDetailsSharedContext;
            if (mutableStateFlow.c(value, PremiumBusFareDetailsDataState.a(premiumBusFareDetailsDataState, false, null, 0L, null, false, false, false, null, list, null, null, null, null, 0, null, null, null, false, premiumBusFareDetailsSharedContext, 523775))) {
                m(context);
                return;
            }
            ticketPurchaseWithPassUpsellNudgeDelegate = this;
        }
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegate
    /* JADX INFO: renamed from: getState, reason: from getter */
    public final StateFlow getQ() {
        return this.q;
    }

    public final Job k(Function2 function2) {
        CoroutineScope coroutineScope = this.x;
        if (coroutineScope == null) {
            return null;
        }
        Job jobD = BuildersKt.d(coroutineScope, null, null, function2, 3);
        this.y.add(jobD);
        ((JobSupport) jobD).w(new pg1(11, this, jobD));
        return jobD;
    }

    public final void l(String str, PremiumBusUpsellRideOutcome premiumBusUpsellRideOutcome) {
        String str2 = this.v;
        String str3 = this.w;
        if (str2 == null || str3 == null) {
            return;
        }
        String strA = null;
        HomeArgs homeArgs = new HomeArgs((String) null, (String) null, 7);
        Source source = Source.PREMIUM_BUS_FARE_DETAILS_SCREEN;
        try {
            Json json = ChaloJson.b;
            json.getClass();
            strA = json.a(PremiumBusUpsellRideOutcome.INSTANCE.serializer(), premiumBusUpsellRideOutcome);
        } catch (Exception unused) {
        }
        ChaloNavigationManagerKt.b(this.m, homeArgs, new ProductActivationArgs(str, str2, str3, source, null, null, strA, 496));
    }

    public final void m(PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext) {
        MutableStateFlow mutableStateFlow;
        Object value;
        do {
            mutableStateFlow = this.p;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value, true, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 1048570)));
        Job job = this.z;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.z = k(new TicketPurchaseWithPassUpsellNudgeDelegate$resolvePassOffer$2(this, premiumBusFareDetailsSharedContext, null));
    }

    @Override // app.chalo.resultstatemanager.ResultStateDataCollector
    public final Object v(Flow flow, Continuation continuation) {
        return this.f7558a.v(flow, continuation);
    }
}
