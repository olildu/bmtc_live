package app.chalo.premiumbus.ui.faredetails;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.features.checkout.CheckoutIntentModel;
import app.chalo.models.productbooking.SuperPassPurchaseStopsInfo;
import app.chalo.network.config.ChaloJson;
import app.chalo.premiumbus.data.PassUpsellOrderError;
import app.chalo.premiumbus.data.PassUpsellOrderResult;
import app.chalo.premiumbus.data.PassUpsellPurchaseOffer;
import app.chalo.premiumbus.data.PassUpsellPurchaseWrapper;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsDataState;
import app.chalo.premiumbus.ui.faredetails.contract.PremiumBusFareDetailsSharedContext;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.CheckoutPaymentMainArgs;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.KUUID;
import defpackage.hq0;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.faredetails.TicketPurchaseWithPassUpsellNudgeDelegate$handleOnPayButtonClicked$3", f = "TicketPurchaseWithPassUpsellNudgeDelegate.kt", l = {340, 346, 354, 361}, m = "invokeSuspend", v = 1)
final class TicketPurchaseWithPassUpsellNudgeDelegate$handleOnPayButtonClicked$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusFareDetailsSharedContext $context;
    final /* synthetic */ PassUpsellPurchaseOffer $offer;
    Object L$0;
    int label;
    final /* synthetic */ TicketPurchaseWithPassUpsellNudgeDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketPurchaseWithPassUpsellNudgeDelegate$handleOnPayButtonClicked$3(TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate, PassUpsellPurchaseOffer passUpsellPurchaseOffer, PremiumBusFareDetailsSharedContext premiumBusFareDetailsSharedContext, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ticketPurchaseWithPassUpsellNudgeDelegate;
        this.$offer = passUpsellPurchaseOffer;
        this.$context = premiumBusFareDetailsSharedContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TicketPurchaseWithPassUpsellNudgeDelegate$handleOnPayButtonClicked$3(this.this$0, this.$offer, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TicketPurchaseWithPassUpsellNudgeDelegate$handleOnPayButtonClicked$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:33:0x0167  */
    /* JADX WARN: Code duplicated, block: B:42:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:47:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:51:0x0206  */
    /* JADX WARN: Code duplicated, block: B:52:0x0209  */
    /* JADX WARN: Code duplicated, block: B:54:0x020d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0213  */
    /* JADX WARN: Code duplicated, block: B:57:0x0217  */
    /* JADX WARN: Code duplicated, block: B:66:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:67:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:80:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:82:0x0300  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objJ;
        Object objB;
        Object value;
        Object value2;
        ChaloUseCaseResult chaloUseCaseResult;
        PassUpsellOrderError passUpsellOrderError;
        PassUpsellOrderError.OfferUnavailable offerUnavailable;
        String str;
        MutableStateFlow mutableStateFlow;
        Object value3;
        MutableStateFlow mutableStateFlow2;
        Object value4;
        KotlinToastManager kotlinToastManager;
        StringProvider stringProvider;
        Object objB2;
        KotlinToastManager kotlinToastManager2;
        TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate;
        PassUpsellPurchaseOffer passUpsellPurchaseOffer;
        MutableStateFlow mutableStateFlow3;
        Object value5;
        String strA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate2 = this.this$0;
            this.label = 1;
            objJ = TicketPurchaseWithPassUpsellNudgeDelegate.j(ticketPurchaseWithPassUpsellNudgeDelegate2, this);
            if (objJ != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ResultKt.b(obj);
                    return unit;
                }
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinToastManager2 = (KotlinToastManager) this.L$0;
                ResultKt.b(obj);
                objB2 = obj;
                hq0.s(kotlinToastManager2, (String) objB2);
                return unit;
            }
            ResultKt.b(obj);
            objB = obj;
            chaloUseCaseResult = (ChaloUseCaseResult) objB;
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate3 = this.this$0;
                PassUpsellOrderResult passUpsellOrderResult = (PassUpsellOrderResult) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                PassUpsellPurchaseOffer passUpsellPurchaseOffer2 = this.$offer;
                AnalyticsContractImplKt.b(ticketPurchaseWithPassUpsellNudgeDelegate3.e, "mPass order created", Source.PREMIUM_BUS_FARE_DETAILS_SCREEN, MapsKt.i(new Pair(PaymentConstants.ORDER_ID_CAMEL, passUpsellOrderResult.f6956a), new Pair("passId", passUpsellOrderResult.b), new Pair(PaymentConstants.AMOUNT, String.valueOf(passUpsellPurchaseOffer2.d)), new Pair("productType", passUpsellPurchaseOffer2.e), new Pair("productSubType", passUpsellPurchaseOffer2.f), new Pair("flowType", "premiumReserveTicketWithPassUpsell")), false, 24);
                ticketPurchaseWithPassUpsellNudgeDelegate = this.this$0;
                this.label = 3;
                ticketPurchaseWithPassUpsellNudgeDelegate.getClass();
                ticketPurchaseWithPassUpsellNudgeDelegate.u = passUpsellOrderResult.b;
                passUpsellPurchaseOffer = ticketPurchaseWithPassUpsellNudgeDelegate.t;
                if (passUpsellPurchaseOffer != null) {
                    ticketPurchaseWithPassUpsellNudgeDelegate.v = passUpsellPurchaseOffer.e;
                    ticketPurchaseWithPassUpsellNudgeDelegate.w = passUpsellPurchaseOffer.f;
                }
                String strA2 = KUUID.a();
                ticketPurchaseWithPassUpsellNudgeDelegate.s.invoke(strA2);
                mutableStateFlow3 = ticketPurchaseWithPassUpsellNudgeDelegate.p;
                do {
                    value5 = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.c(value5, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value5, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 1048415)));
                ChaloNavigationManager chaloNavigationManager = ticketPurchaseWithPassUpsellNudgeDelegate.m;
                ChaloJson chaloJson = ChaloJson.f6455a;
                CheckoutIntentModel checkoutIntentModel = passUpsellOrderResult.c;
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
                if (unit != coroutineSingletons) {
                    return unit;
                }
            } else {
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                    throw new NoWhenBranchMatchedException();
                }
                TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate4 = this.this$0;
                passUpsellOrderError = (PassUpsellOrderError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                ticketPurchaseWithPassUpsellNudgeDelegate4.getClass();
                offerUnavailable = PassUpsellOrderError.OfferUnavailable.f6954a;
                if (Intrinsics.d(passUpsellOrderError, offerUnavailable)) {
                    str = "Offer Unavailable";
                } else if (passUpsellOrderError instanceof PassUpsellOrderError.OrderCreationFailed) {
                    str = ((PassUpsellOrderError.OrderCreationFailed) passUpsellOrderError).f6955a;
                } else {
                    if (passUpsellOrderError instanceof PassUpsellOrderError.Local) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = ((PassUpsellOrderError.Local) passUpsellOrderError).f6953a;
                }
                AnalyticsContractImplKt.b(ticketPurchaseWithPassUpsellNudgeDelegate4.e, "mPass order creation failed", Source.PREMIUM_BUS_FARE_DETAILS_SCREEN, MapsKt.i(new Pair("failureReason", str), new Pair("flowType", "premiumReserveTicketWithPassUpsell")), false, 24);
                mutableStateFlow = this.this$0.p;
                do {
                    value3 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.c(value3, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value3, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 786431)));
                mutableStateFlow2 = this.this$0.p;
                do {
                    value4 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.c(value4, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value4, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 1048415)));
                TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate5 = this.this$0;
                kotlinToastManager = ticketPurchaseWithPassUpsellNudgeDelegate5.j;
                this.L$0 = kotlinToastManager;
                this.label = 4;
                stringProvider = ticketPurchaseWithPassUpsellNudgeDelegate5.l;
                if (passUpsellOrderError instanceof PassUpsellOrderError.OrderCreationFailed) {
                    objB2 = ((PassUpsellOrderError.OrderCreationFailed) passUpsellOrderError).f6955a;
                } else {
                    if (Intrinsics.d(passUpsellOrderError, offerUnavailable) && !(passUpsellOrderError instanceof PassUpsellOrderError.Local)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objB2 = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                }
                if (objB2 != coroutineSingletons) {
                    kotlinToastManager2 = kotlinToastManager;
                    hq0.s(kotlinToastManager2, (String) objB2);
                    return unit;
                }
            }
            return coroutineSingletons;
        }
        ResultKt.b(obj);
        objJ = obj;
        if (((Boolean) objJ).booleanValue()) {
            PassUpsellPurchaseWrapper passUpsellPurchaseWrapper = this.this$0.c;
            PassUpsellPurchaseOffer passUpsellPurchaseOffer3 = this.$offer;
            SuperPassPurchaseStopsInfo superPassPurchaseStopsInfoE = PremiumBusFareDetailsDelegateSharedActionsKt.e(this.$context.c);
            String sourceName = Source.PREMIUM_BUS_FARE_DETAILS_SCREEN.getSourceName();
            this.label = 2;
            objB = passUpsellPurchaseWrapper.b(passUpsellPurchaseOffer3, superPassPurchaseStopsInfoE, sourceName, this);
            if (objB != coroutineSingletons) {
                chaloUseCaseResult = (ChaloUseCaseResult) objB;
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate6 = this.this$0;
                    PassUpsellOrderResult passUpsellOrderResult2 = (PassUpsellOrderResult) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                    PassUpsellPurchaseOffer passUpsellPurchaseOffer4 = this.$offer;
                    AnalyticsContractImplKt.b(ticketPurchaseWithPassUpsellNudgeDelegate6.e, "mPass order created", Source.PREMIUM_BUS_FARE_DETAILS_SCREEN, MapsKt.i(new Pair(PaymentConstants.ORDER_ID_CAMEL, passUpsellOrderResult2.f6956a), new Pair("passId", passUpsellOrderResult2.b), new Pair(PaymentConstants.AMOUNT, String.valueOf(passUpsellPurchaseOffer4.d)), new Pair("productType", passUpsellPurchaseOffer4.e), new Pair("productSubType", passUpsellPurchaseOffer4.f), new Pair("flowType", "premiumReserveTicketWithPassUpsell")), false, 24);
                    ticketPurchaseWithPassUpsellNudgeDelegate = this.this$0;
                    this.label = 3;
                    ticketPurchaseWithPassUpsellNudgeDelegate.getClass();
                    ticketPurchaseWithPassUpsellNudgeDelegate.u = passUpsellOrderResult2.b;
                    passUpsellPurchaseOffer = ticketPurchaseWithPassUpsellNudgeDelegate.t;
                    if (passUpsellPurchaseOffer != null) {
                        ticketPurchaseWithPassUpsellNudgeDelegate.v = passUpsellPurchaseOffer.e;
                        ticketPurchaseWithPassUpsellNudgeDelegate.w = passUpsellPurchaseOffer.f;
                    }
                    String strA3 = KUUID.a();
                    ticketPurchaseWithPassUpsellNudgeDelegate.s.invoke(strA3);
                    mutableStateFlow3 = ticketPurchaseWithPassUpsellNudgeDelegate.p;
                    do {
                        value5 = mutableStateFlow3.getValue();
                    } while (!mutableStateFlow3.c(value5, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value5, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 1048415)));
                    ChaloNavigationManager chaloNavigationManager2 = ticketPurchaseWithPassUpsellNudgeDelegate.m;
                    ChaloJson chaloJson2 = ChaloJson.f6455a;
                    CheckoutIntentModel checkoutIntentModel2 = passUpsellOrderResult2.c;
                    Json json2 = ChaloJson.b;
                    json2.getClass();
                    strA = json2.a(CheckoutIntentModel.INSTANCE.serializer(), checkoutIntentModel2);
                    if (strA == null) {
                        strA = "";
                    }
                    chaloNavigationManager2.b(new ChaloNavigationRequest.Navigate(new CheckoutPaymentMainArgs(strA3, strA), null, "CheckoutTag", 2));
                    if (unit != coroutineSingletons) {
                    }
                } else {
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate7 = this.this$0;
                    passUpsellOrderError = (PassUpsellOrderError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                    ticketPurchaseWithPassUpsellNudgeDelegate7.getClass();
                    offerUnavailable = PassUpsellOrderError.OfferUnavailable.f6954a;
                    if (Intrinsics.d(passUpsellOrderError, offerUnavailable)) {
                        str = "Offer Unavailable";
                    } else if (passUpsellOrderError instanceof PassUpsellOrderError.OrderCreationFailed) {
                        str = ((PassUpsellOrderError.OrderCreationFailed) passUpsellOrderError).f6955a;
                    } else {
                        if (passUpsellOrderError instanceof PassUpsellOrderError.Local) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = ((PassUpsellOrderError.Local) passUpsellOrderError).f6953a;
                    }
                    AnalyticsContractImplKt.b(ticketPurchaseWithPassUpsellNudgeDelegate7.e, "mPass order creation failed", Source.PREMIUM_BUS_FARE_DETAILS_SCREEN, MapsKt.i(new Pair("failureReason", str), new Pair("flowType", "premiumReserveTicketWithPassUpsell")), false, 24);
                    mutableStateFlow = this.this$0.p;
                    do {
                        value3 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.c(value3, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value3, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 786431)));
                    mutableStateFlow2 = this.this$0.p;
                    do {
                        value4 = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.c(value4, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value4, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 1048415)));
                    TicketPurchaseWithPassUpsellNudgeDelegate ticketPurchaseWithPassUpsellNudgeDelegate8 = this.this$0;
                    kotlinToastManager = ticketPurchaseWithPassUpsellNudgeDelegate8.j;
                    this.L$0 = kotlinToastManager;
                    this.label = 4;
                    stringProvider = ticketPurchaseWithPassUpsellNudgeDelegate8.l;
                    if (passUpsellOrderError instanceof PassUpsellOrderError.OrderCreationFailed) {
                        objB2 = ((PassUpsellOrderError.OrderCreationFailed) passUpsellOrderError).f6955a;
                    } else {
                        if (Intrinsics.d(passUpsellOrderError, offerUnavailable)) {
                        }
                        objB2 = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
                    }
                    if (objB2 != coroutineSingletons) {
                        kotlinToastManager2 = kotlinToastManager;
                        hq0.s(kotlinToastManager2, (String) objB2);
                        return unit;
                    }
                }
            }
            return coroutineSingletons;
        }
        MutableStateFlow mutableStateFlow4 = this.this$0.p;
        do {
            value = mutableStateFlow4.getValue();
        } while (!mutableStateFlow4.c(value, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 786431)));
        MutableStateFlow mutableStateFlow5 = this.this$0.p;
        do {
            value2 = mutableStateFlow5.getValue();
        } while (!mutableStateFlow5.c(value2, PremiumBusFareDetailsDataState.a((PremiumBusFareDetailsDataState) value2, false, null, 0L, null, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, 1048415)));
        return unit;
    }
}
