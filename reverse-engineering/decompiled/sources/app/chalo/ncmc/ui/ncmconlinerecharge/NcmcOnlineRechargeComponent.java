package app.chalo.ncmc.ui.ncmconlinerecharge;

import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.constants.Source;
import app.chalo.extensions.StringExtsKt;
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
import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.models.ordercreation.OrderBookingInfoAppModel;
import app.chalo.models.ordercreation.OrderPaymentProviderCustomerDetailsAppModel;
import app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel;
import app.chalo.ncmc.domain.CreateNcmcOnlineRechargeOrderUseCase;
import app.chalo.ncmc.domain.NcmcCreateOnlineOrderFailureDetails;
import app.chalo.ncmc.ui.NcmcOnlineRechargeArgsModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.ResultStateKeeperMeta;
import app.chalo.resultstatemanager.ResultStateRecoveredData;
import app.chalo.resultstatemanager.checkout.CheckoutResultState;
import app.chalo.resultstatemanager.checkout.CheckoutResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.CheckoutPaymentMainArgs;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.NcmcOnlineRechargeArgs;
import app.chalo.usecase.LoadMoneyAmountValidationUseCase;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.KUUID;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.statekeeper.StateKeeper;
import defpackage.ej0;
import defpackage.gd0;
import defpackage.im0;
import defpackage.vo1;
import defpackage.za0;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/ui/ncmconlinerecharge/NcmcOnlineRechargeComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent;", "Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeViewState;", "Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeDataState;", "Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NcmcOnlineRechargeComponent extends ChaloBaseStateMviComponent<NCMCOnlineRechargeIntent, NCMCOnlineRechargeViewState, NCMCOnlineRechargeViewState, NCMCOnlineRechargeSideEffect> {
    public final ComponentContext k;
    public final LoadMoneyAmountValidationUseCase l;
    public final CreateNcmcOnlineRechargeOrderUseCase m;
    public final UserProfileDetailsProvider n;
    public final AnalyticsContract o;
    public final CurrencyFeature p;
    public final StringProvider q;
    public final TimeUtilsContract r;
    public final ChaloNavigationManager s;
    public final KotlinToastManager t;
    public final CheckoutResultStateManager u;
    public NcmcCardRechargeConfigAppModel v;
    public Job w;
    public String x;

    /* JADX INFO: renamed from: app.chalo.ncmc.ui.ncmconlinerecharge.NcmcOnlineRechargeComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.ncmc.ui.ncmconlinerecharge.NcmcOnlineRechargeComponent$1", f = "NCMCOnlineRechargeComponent.kt", l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return NcmcOnlineRechargeComponent.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            Unit unit = Unit.f17538a;
            if (i == 0) {
                ResultKt.b(obj);
                NcmcOnlineRechargeComponent ncmcOnlineRechargeComponent = NcmcOnlineRechargeComponent.this;
                CheckoutResultStateManager checkoutResultStateManager = ncmcOnlineRechargeComponent.u;
                StateKeeper b = ncmcOnlineRechargeComponent.f5983a.getB();
                ResultStateKeeperMeta.Companion companion = ResultStateKeeperMeta.INSTANCE;
                ResultStateRecoveredData resultStateRecoveredDataA = checkoutResultStateManager.a("NCMCOnlineRecharge_SK_Key", b, companion.serializer(), companion.serializer(), new gd0(NcmcOnlineRechargeComponent.this, 25));
                if (resultStateRecoveredDataA != null) {
                    NcmcOnlineRechargeComponent ncmcOnlineRechargeComponent2 = NcmcOnlineRechargeComponent.this;
                    Flow flow = resultStateRecoveredDataA.b;
                    this.label = 1;
                    obj = ncmcOnlineRechargeComponent2.b.v(flow, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return unit;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            ResultStateData resultStateData = (ResultStateData) obj;
            if (resultStateData instanceof ResultStateData.Cancelled) {
                NcmcOnlineRechargeComponent.this.x = null;
                return unit;
            }
            if (!(resultStateData instanceof ResultStateData.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            NcmcOnlineRechargeComponent.this.x = null;
            CheckoutResultState checkoutResultState = (CheckoutResultState) ((ResultStateData.Success) resultStateData).f9039a;
            if (!checkoutResultState.equals(CheckoutResultState.Failed.f9054a)) {
                if (!(checkoutResultState instanceof CheckoutResultState.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                NcmcOnlineRechargeComponent.this.G0(NCMCOnlineRechargeIntent.OnlineRechargeSuccessful.f6405a);
                return unit;
            }
            return unit;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6414a;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.NCMC_OFFLINE_BALANCE_RECHARGE_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6414a = iArr;
        }
    }

    public NcmcOnlineRechargeComponent(NcmcOnlineRechargeArgs ncmcOnlineRechargeArgs, ComponentContext componentContext, LoadMoneyAmountValidationUseCase loadMoneyAmountValidationUseCase, CreateNcmcOnlineRechargeOrderUseCase createNcmcOnlineRechargeOrderUseCase, UserProfileDetailsProvider userProfileDetailsProvider, AnalyticsContract analyticsContract, CurrencyFeature currencyFeature, StringProvider stringProvider, TimeUtilsContract timeUtilsContract, ChaloNavigationManager chaloNavigationManager, KotlinToastManager kotlinToastManager, CheckoutResultStateManager checkoutResultStateManager) {
        super(componentContext);
        this.k = componentContext;
        this.l = loadMoneyAmountValidationUseCase;
        this.m = createNcmcOnlineRechargeOrderUseCase;
        this.n = userProfileDetailsProvider;
        this.o = analyticsContract;
        this.p = currencyFeature;
        this.q = stringProvider;
        this.r = timeUtilsContract;
        this.s = chaloNavigationManager;
        this.t = kotlinToastManager;
        this.u = checkoutResultStateManager;
        Json json = ChaloJson.b;
        String str = ncmcOnlineRechargeArgs.b;
        json.getClass();
        NcmcOnlineRechargeArgsModel ncmcOnlineRechargeArgsModel = (NcmcOnlineRechargeArgsModel) json.b(str, NcmcOnlineRechargeArgsModel.INSTANCE.serializer());
        Source source = ncmcOnlineRechargeArgsModel.f6269a;
        NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel = ncmcOnlineRechargeArgsModel.b;
        G0(new NCMCOnlineRechargeIntent.ViewCreated(ncmcOnlineRechargeArgsModel.d, ncmcOnlineRechargeArgsModel.f, source, ncmcCardRechargeConfigAppModel, ncmcOnlineRechargeArgsModel.c, ncmcOnlineRechargeArgsModel.e));
        this.w = BuildersKt.d(this.j, null, null, new AnonymousClass1(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r5v19 */
    public static final Object F0(NcmcOnlineRechargeComponent ncmcOnlineRechargeComponent, ContinuationImpl continuationImpl) {
        NcmcOnlineRechargeComponent$createOnlineRechargeOrder$1 ncmcOnlineRechargeComponent$createOnlineRechargeOrder$1;
        String str;
        Object objA;
        ChaloUseCaseResult chaloUseCaseResult;
        String str2;
        String str3;
        String str4;
        String str5;
        ?? r5;
        String strA;
        String str6;
        String str7;
        OrderPaymentProviderCustomerDetailsAppModel orderPaymentProviderCustomerDetailsAppModel;
        Long l;
        String str8;
        String str9;
        StateFlow stateFlow = ncmcOnlineRechargeComponent.f;
        if (continuationImpl instanceof NcmcOnlineRechargeComponent$createOnlineRechargeOrder$1) {
            ncmcOnlineRechargeComponent$createOnlineRechargeOrder$1 = (NcmcOnlineRechargeComponent$createOnlineRechargeOrder$1) continuationImpl;
            int i = ncmcOnlineRechargeComponent$createOnlineRechargeOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncmcOnlineRechargeComponent$createOnlineRechargeOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                ncmcOnlineRechargeComponent$createOnlineRechargeOrder$1 = new NcmcOnlineRechargeComponent$createOnlineRechargeOrder$1(ncmcOnlineRechargeComponent, continuationImpl);
            }
        } else {
            ncmcOnlineRechargeComponent$createOnlineRechargeOrder$1 = new NcmcOnlineRechargeComponent$createOnlineRechargeOrder$1(ncmcOnlineRechargeComponent, continuationImpl);
        }
        NcmcOnlineRechargeComponent$createOnlineRechargeOrder$1 ncmcOnlineRechargeComponent$createOnlineRechargeOrder$2 = ncmcOnlineRechargeComponent$createOnlineRechargeOrder$1;
        Object obj = ncmcOnlineRechargeComponent$createOnlineRechargeOrder$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ncmcOnlineRechargeComponent$createOnlineRechargeOrder$2.label;
        int i3 = 5;
        long jLongValue = -1;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.b(obj);
                objA = obj;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str9 = (String) ncmcOnlineRechargeComponent$createOnlineRechargeOrder$2.L$1;
                chaloUseCaseResult = (ChaloUseCaseResult) ncmcOnlineRechargeComponent$createOnlineRechargeOrder$2.L$0;
                ResultKt.b(obj);
            }
            String strB = StringExtsKt.b(str9, (String) obj);
            AnalyticsContractImplKt.b(ncmcOnlineRechargeComponent.o, "ncmc recharge api error", Source.NCMC_ONLINE_RECHARGE_SCREEN, NcmcOnlineRechargeContractKt.a((NCMCOnlineRechargeViewState) stateFlow.getValue(), MapsKt.h(new Pair("failureReason", String.valueOf(((NcmcCreateOnlineOrderFailureDetails) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f6245a)))), false, 24);
            KotlinToastManagerKt.a(ncmcOnlineRechargeComponent.t, strB, ToastLength.LONG);
            return Unit.f17538a;
        }
        ResultKt.b(obj);
        ncmcOnlineRechargeComponent.E0(new im0(i3));
        AnalyticsContractImplKt.b(ncmcOnlineRechargeComponent.o, "ncmc tnc accepted loading", Source.NCMC_ONLINE_RECHARGE_SCREEN, NcmcOnlineRechargeContractKt.a((NCMCOnlineRechargeViewState) stateFlow.getValue(), null), false, 24);
        CreateNcmcOnlineRechargeOrderUseCase createNcmcOnlineRechargeOrderUseCase = ncmcOnlineRechargeComponent.m;
        Long l2 = ((NCMCOnlineRechargeViewState) stateFlow.getValue()).h;
        long jLongValue2 = l2 != null ? l2.longValue() : -1L;
        NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel = ncmcOnlineRechargeComponent.v;
        if (ncmcCardRechargeConfigAppModel == null || (str = ncmcCardRechargeConfigAppModel.f6033a) == null) {
            str = "";
        }
        String str10 = ((NCMCOnlineRechargeViewState) stateFlow.getValue()).o;
        if (str10 == null) {
            str10 = "";
        }
        String str11 = ((NCMCOnlineRechargeViewState) stateFlow.getValue()).p;
        if (str11 == null) {
            str11 = "";
        }
        ncmcOnlineRechargeComponent$createOnlineRechargeOrder$2.label = 1;
        objA = createNcmcOnlineRechargeOrderUseCase.a(jLongValue2, str, str10, str11, ncmcOnlineRechargeComponent$createOnlineRechargeOrder$2);
        if (objA != coroutineSingletons) {
        }
        return coroutineSingletons;
        chaloUseCaseResult = (ChaloUseCaseResult) objA;
        ncmcOnlineRechargeComponent.E0(new im0(6));
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            String str12 = ((NcmcCreateOnlineOrderFailureDetails) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f6245a;
            ncmcOnlineRechargeComponent$createOnlineRechargeOrder$2.L$0 = chaloUseCaseResult;
            ncmcOnlineRechargeComponent$createOnlineRechargeOrder$2.L$1 = str12;
            ncmcOnlineRechargeComponent$createOnlineRechargeOrder$2.label = 2;
            Object objB = ncmcOnlineRechargeComponent.q.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], ncmcOnlineRechargeComponent$createOnlineRechargeOrder$2);
            if (objB != coroutineSingletons) {
                str9 = str12;
                obj = objB;
                String strB2 = StringExtsKt.b(str9, (String) obj);
                AnalyticsContractImplKt.b(ncmcOnlineRechargeComponent.o, "ncmc recharge api error", Source.NCMC_ONLINE_RECHARGE_SCREEN, NcmcOnlineRechargeContractKt.a((NCMCOnlineRechargeViewState) stateFlow.getValue(), MapsKt.h(new Pair("failureReason", String.valueOf(((NcmcCreateOnlineOrderFailureDetails) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f6245a)))), false, 24);
                KotlinToastManagerKt.a(ncmcOnlineRechargeComponent.t, strB2, ToastLength.LONG);
            }
            return coroutineSingletons;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        AnalyticsContract analyticsContract = ncmcOnlineRechargeComponent.o;
        Source source = Source.NCMC_ONLINE_RECHARGE_SCREEN;
        NCMCOnlineRechargeViewState nCMCOnlineRechargeViewState = (NCMCOnlineRechargeViewState) stateFlow.getValue();
        CreateOrderResponseAppModel createOrderResponseAppModel = (CreateOrderResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        AnalyticsContractImplKt.b(analyticsContract, "ncmc online recharge order created", source, NcmcOnlineRechargeContractKt.a(nCMCOnlineRechargeViewState, MapsKt.h(new Pair(PaymentConstants.ORDER_ID_CAMEL, createOrderResponseAppModel.f))), false, 24);
        UserProfileAppModel userProfileAppModelF = ncmcOnlineRechargeComponent.n.f();
        NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel2 = ncmcOnlineRechargeComponent.v;
        String str13 = (ncmcCardRechargeConfigAppModel2 == null || (str8 = ncmcCardRechargeConfigAppModel2.f) == null) ? "" : str8;
        if (ncmcCardRechargeConfigAppModel2 == null || (str2 = ncmcCardRechargeConfigAppModel2.l) == null) {
            str2 = "";
        }
        if (ncmcCardRechargeConfigAppModel2 == null || (str3 = ncmcCardRechargeConfigAppModel2.m) == null) {
            str3 = "";
        }
        if (userProfileAppModelF == null || (str4 = userProfileAppModelF.i) == null) {
            str4 = "";
        }
        if (userProfileAppModelF == null || (str5 = userProfileAppModelF.e) == null) {
            str5 = "";
        }
        TimeUtilsContract timeUtilsContract = ncmcOnlineRechargeComponent.r;
        OrderBookingInfoAppModel orderBookingInfoAppModel = createOrderResponseAppModel.c;
        if (orderBookingInfoAppModel != null && (l = orderBookingInfoAppModel.f5642a) != null) {
            jLongValue = l.longValue();
        }
        String bookingDate = timeUtilsContract.Q(jLongValue);
        String source2 = source.getSourceName();
        Intrinsics.i(bookingDate, "bookingDate");
        Intrinsics.i(source2, "source");
        OrderPaymentProviderInfoAppModel.ProviderConfigAppModel providerConfigAppModelC = CheckoutIntentModelHelperKt.c(createOrderResponseAppModel);
        OrderPaymentProviderInfoAppModel.MerchantUPIConfigAppModel merchantUPIConfigAppModelA = CheckoutIntentModelHelperKt.a(createOrderResponseAppModel);
        String str14 = createOrderResponseAppModel.f;
        String str15 = createOrderResponseAppModel.g;
        String str16 = createOrderResponseAppModel.b;
        int i4 = createOrderResponseAppModel.f5638a;
        CheckoutPaymentData checkoutPaymentData = new CheckoutPaymentData(new CheckoutOrderData(str14, str15, String.valueOf(i4), createOrderResponseAppModel.d, createOrderResponseAppModel.e, (providerConfigAppModelC == null || (orderPaymentProviderCustomerDetailsAppModel = providerConfigAppModelC.e) == null) ? null : orderPaymentProviderCustomerDetailsAppModel.f5646a, providerConfigAppModelC != null ? providerConfigAppModelC.f : null, str16, (providerConfigAppModelC == null || (str7 = providerConfigAppModelC.g) == null) ? "" : str7, (providerConfigAppModelC == null || (str6 = providerConfigAppModelC.h) == null) ? "" : str6, null), new CheckoutUserDetails(str5, str4), str13, createOrderResponseAppModel.h, merchantUPIConfigAppModelA != null ? new CheckoutPaymentProviderVpaConfig(merchantUPIConfigAppModelA.e, merchantUPIConfigAppModelA.f, merchantUPIConfigAppModelA.g) : null);
        CheckoutProductType checkoutProductType = CheckoutProductType.NCMC;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(MapsKt.i(new Pair("transactionId", str16), new Pair("bookingDate", bookingDate), new Pair("productType", str2), new Pair("productSubType", str3), new Pair(PaymentConstants.AMOUNT, String.valueOf(i4))));
        CheckoutIntentModel checkoutIntentModel = new CheckoutIntentModel(checkoutPaymentData, new CheckoutProductData(checkoutProductType, false, new CheckoutAnalyticsData(source2, linkedHashMap)));
        String strA2 = KUUID.a();
        ncmcOnlineRechargeComponent.x = strA2;
        Job job = ncmcOnlineRechargeComponent.w;
        if (job != null) {
            r5 = 0;
            ((JobSupport) job).cancel(null);
        } else {
            r5 = 0;
        }
        ncmcOnlineRechargeComponent.w = BuildersKt.d(ncmcOnlineRechargeComponent.j, r5, r5, new NcmcOnlineRechargeComponent$listenForCheckoutResult$1(ncmcOnlineRechargeComponent, strA2, r5), 3);
        ChaloNavigationManager chaloNavigationManager = ncmcOnlineRechargeComponent.s;
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
        return Unit.f17538a;
    }

    public final void G0(NCMCOnlineRechargeIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof NCMCOnlineRechargeIntent.AmountEnteredIntentOnlineRecharge;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new NcmcOnlineRechargeComponent$handleAmountEnteredIntent$1(this, ((NCMCOnlineRechargeIntent.AmountEnteredIntentOnlineRecharge) intent).f6403a, null), 3);
            return;
        }
        boolean zEquals = intent.equals(NCMCOnlineRechargeIntent.NextBtnClickIntentOnline.f6404a);
        StateFlow stateFlow = this.f;
        if (zEquals) {
            r0(NCMCOnlineRechargeSideEffect.HideKeyboard.f6412a);
            AnalyticsContractImplKt.b(this.o, "ncmc load balance next clicked", Source.NCMC_ONLINE_RECHARGE_SCREEN, NcmcOnlineRechargeContractKt.a((NCMCOnlineRechargeViewState) stateFlow.getValue(), null), false, 24);
            BuildersKt.d(contextScope, null, null, new NcmcOnlineRechargeComponent$initiateOnlineRecharge$1(this, null), 3);
            return;
        }
        boolean z2 = intent instanceof NCMCOnlineRechargeIntent.ViewCreated;
        CurrencyFeature currencyFeature = this.p;
        if (z2) {
            NCMCOnlineRechargeIntent.ViewCreated viewCreated = (NCMCOnlineRechargeIntent.ViewCreated) intent;
            NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel = viewCreated.b;
            AnalyticsContractImplKt.b(this.o, "ncmc load balance view created", Source.NCMC_ONLINE_RECHARGE_SCREEN, NcmcOnlineRechargeContractKt.a((NCMCOnlineRechargeViewState) stateFlow.getValue(), null), false, 24);
            String strA = currencyFeature.a(ncmcCardRechargeConfigAppModel.g.f5577a, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
            this.v = ncmcCardRechargeConfigAppModel;
            E0(new za0(13, viewCreated, this, strA));
            return;
        }
        if (intent.equals(NCMCOnlineRechargeIntent.OnlineRechargeSuccessful.f6405a)) {
            E0(new ej0(11, vo1.A(currencyFeature.d(), ((NCMCOnlineRechargeViewState) stateFlow.getValue()).d), WhenMappings.f6414a[((NCMCOnlineRechargeViewState) stateFlow.getValue()).f6413a.ordinal()] == 1 ? NcmcOnlineRechargeSuccessBottomSheetType.WITH_OPTION_TO_TRANSFER_TO_OFFLINE : NcmcOnlineRechargeSuccessBottomSheetType.DEFAULT));
            AnalyticsContractImplKt.b(this.o, "ncmc online recharge completed", Source.NCMC_ONLINE_RECHARGE_SCREEN, null, false, 28);
            return;
        }
        boolean zEquals2 = intent.equals(NCMCOnlineRechargeIntent.TransferToOffline.f6410a);
        ChaloNavigationManager chaloNavigationManager = this.s;
        if (zEquals2) {
            ChaloNavigationManagerKt.c(chaloNavigationManager);
            return;
        }
        if (intent.equals(NCMCOnlineRechargeIntent.TncDialogueAccepted.f6408a)) {
            BuildersKt.d(contextScope, null, null, new NcmcOnlineRechargeComponent$initiateOnlineRecharge$1(this, null), 3);
            return;
        }
        if (intent.equals(NCMCOnlineRechargeIntent.TncDialogueCancelled.f6409a)) {
            E0(new im0(8));
        } else if (intent.equals(NCMCOnlineRechargeIntent.RechargeSuccessBottomSheetCancelCtaClicked.f6406a)) {
            ChaloNavigationManagerKt.f(chaloNavigationManager, new HomeArgs((String) null, (String) null, 7));
        } else {
            if (!intent.equals(NCMCOnlineRechargeIntent.RechargeSuccessBottomSheetDismissed.f6407a)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new im0(7));
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (NCMCOnlineRechargeViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new NCMCOnlineRechargeViewState(131071);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new NCMCOnlineRechargeViewState(131071);
    }
}
