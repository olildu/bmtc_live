package app.chalo.ncmc.ui.cardrechargeamount;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.data.BookingsRequestType;
import app.chalo.data.CardRechargePaymentStatus;
import app.chalo.data.CardRechargeStatus;
import app.chalo.data.CardRechargeSummaryData;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.models.CardRechargeConfiguration;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.mvibase.simple.DataFetchOperationErrorReason;
import app.chalo.mvibase.simple.OperationFailureError;
import app.chalo.mvibase.simple.UseCaseOperationError;
import app.chalo.ncmc.data.appmodel.ChaloCardDetails;
import app.chalo.ncmc.data.appmodel.ChaloCardInfo;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeConfigAppModel;
import app.chalo.ncmc.data.appmodel.ChaloCardRechargeFareInfoAppModel;
import app.chalo.ncmc.data.appmodel.ChaloCardsAppModel;
import app.chalo.ncmc.domain.CreateCardRechargeOrderUseCase;
import app.chalo.ncmc.domain.FetchChaloCardInfoToShowFailureReason;
import app.chalo.ncmc.domain.FetchChaloCardInfoToShowUseCase;
import app.chalo.ncmc.domain.FetchChaloCardRechargeConfigurationFailureReason;
import app.chalo.ncmc.domain.FetchChaloCardRechargeConfigurationUseCase;
import app.chalo.ncmc.domain.GetAvailableChaloCardOptionsUseCase;
import app.chalo.ncmc.domain.GetLinkCardConfigUseCase;
import app.chalo.ncmc.domain.GetMaskedCardNoFromCardNoUseCase;
import app.chalo.ncmc.ui.CardRechargeEnterAmountArgsModel;
import app.chalo.ncmc.utils.CardsJsonKt;
import app.chalo.ncmc.utils.ChaloCardAnalyticsExtentionsKt;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.ResultStateKeeperMeta;
import app.chalo.resultstatemanager.ResultStateRecoveredData;
import app.chalo.resultstatemanager.checkout.CheckoutResultState;
import app.chalo.resultstatemanager.checkout.CheckoutResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.CardLinkingScreenArgs;
import app.chalo.scenes.args.CardRechargeEnterAmountArgs;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.TripSummaryArgs;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.statekeeper.StateKeeper;
import defpackage.aj;
import defpackage.bj;
import defpackage.ch;
import defpackage.cj;
import defpackage.pi;
import defpackage.s8;
import defpackage.vo1;
import defpackage.xa;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.HashMap;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountIntent;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountViewState;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountDataState;", "Lapp/chalo/ncmc/ui/cardrechargeamount/ChaloCardRechargeAmountSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloCardRechargeAmountComponent extends ChaloBaseStateMviComponent<ChaloCardRechargeAmountIntent, ChaloCardRechargeAmountViewState, ChaloCardRechargeAmountViewState, ChaloCardRechargeAmountSideEffect> {
    public Job A;
    public String B;
    public CardRechargeSummaryData C;
    public final ComponentContext k;
    public final CurrencyFeature l;
    public final FetchChaloCardInfoToShowUseCase m;
    public final FetchChaloCardRechargeConfigurationUseCase n;
    public final GetMaskedCardNoFromCardNoUseCase o;
    public final AnalyticsContract p;
    public final GetAvailableChaloCardOptionsUseCase q;
    public final GetLinkCardConfigUseCase r;
    public final CreateCardRechargeOrderUseCase s;
    public final UserProfileDetailsProvider t;
    public final TimeUtilsContract u;
    public final StringProvider v;
    public final ChaloNavigationManager w;
    public final KotlinToastManager x;
    public final CheckoutResultStateManager y;
    public final BasicInfoContract z;

    /* JADX INFO: renamed from: app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountComponent$1", f = "ChaloCardRechargeAmountComponent.kt", l = {112}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChaloCardRechargeAmountComponent.this.new AnonymousClass1(continuation);
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
                ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent = ChaloCardRechargeAmountComponent.this;
                CheckoutResultStateManager checkoutResultStateManager = chaloCardRechargeAmountComponent.y;
                StateKeeper b = chaloCardRechargeAmountComponent.f5983a.getB();
                ResultStateKeeperMeta.Companion companion = ResultStateKeeperMeta.INSTANCE;
                ResultStateRecoveredData resultStateRecoveredDataA = checkoutResultStateManager.a("ChaloCardRechargeAmount_SK_Key", b, companion.serializer(), companion.serializer(), new cj(ChaloCardRechargeAmountComponent.this, 0));
                if (resultStateRecoveredDataA != null) {
                    ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent2 = ChaloCardRechargeAmountComponent.this;
                    Flow flow = resultStateRecoveredDataA.b;
                    this.label = 1;
                    obj = chaloCardRechargeAmountComponent2.b.v(flow, this);
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
                ChaloCardRechargeAmountComponent.this.B = null;
                return unit;
            }
            if (!(resultStateData instanceof ResultStateData.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ChaloCardRechargeAmountComponent.this.B = null;
            CheckoutResultState checkoutResultState = (CheckoutResultState) ((ResultStateData.Success) resultStateData).f9039a;
            if (!checkoutResultState.equals(CheckoutResultState.Failed.f9054a)) {
                if (!(checkoutResultState instanceof CheckoutResultState.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent3 = ChaloCardRechargeAmountComponent.this;
                BuildersKt.d(chaloCardRechargeAmountComponent3.j, null, null, new ChaloCardRechargeAmountComponent$handlePaymentCompleted$1(chaloCardRechargeAmountComponent3, ((CheckoutResultState.Success) checkoutResultState).f9055a, null), 3);
                return unit;
            }
            return unit;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6289a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[FetchChaloCardInfoToShowFailureReason.values().length];
            try {
                iArr[FetchChaloCardInfoToShowFailureReason.API_CALL_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FetchChaloCardInfoToShowFailureReason.NO_CARD_LINKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FetchChaloCardInfoToShowFailureReason.FETCH_NCMC_CARD_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FetchChaloCardInfoToShowFailureReason.FETCH_NCMC_CARD_TIMEOUT_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6289a = iArr;
            int[] iArr2 = new int[DataFetchOperationErrorReason.values().length];
            try {
                iArr2[DataFetchOperationErrorReason.NO_INTERNET_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DataFetchOperationErrorReason.SERVER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DataFetchOperationErrorReason.REQUEST_CANCELLATION_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DataFetchOperationErrorReason.API_CALL_AUTHORISATION_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DataFetchOperationErrorReason.UNEXPECTED_EXCEPTION_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[DataFetchOperationErrorReason.UNKNOWN_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[DataFetchOperationErrorReason.SUCCESS_RESPONSE_PARSING_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[DataFetchOperationErrorReason.NO_UPDATE_IN_DATA_BASED_ON_ETAG.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[DataFetchOperationErrorReason.ERROR_RESPONSE_PARSING_ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            b = iArr2;
            int[] iArr3 = new int[FetchChaloCardRechargeConfigurationFailureReason.values().length];
            try {
                iArr3[FetchChaloCardRechargeConfigurationFailureReason.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[FetchChaloCardRechargeConfigurationFailureReason.NO_ACTIVE_RECHARGE_CONFIG_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            c = iArr3;
        }
    }

    public ChaloCardRechargeAmountComponent(CardRechargeEnterAmountArgs cardRechargeEnterAmountArgs, ComponentContext componentContext, CurrencyFeature currencyFeature, FetchChaloCardInfoToShowUseCase fetchChaloCardInfoToShowUseCase, FetchChaloCardRechargeConfigurationUseCase fetchChaloCardRechargeConfigurationUseCase, GetMaskedCardNoFromCardNoUseCase getMaskedCardNoFromCardNoUseCase, AnalyticsContract analyticsContract, GetAvailableChaloCardOptionsUseCase getAvailableChaloCardOptionsUseCase, GetLinkCardConfigUseCase getLinkCardConfigUseCase, CreateCardRechargeOrderUseCase createCardRechargeOrderUseCase, UserProfileDetailsProvider userProfileDetailsProvider, TimeUtilsContract timeUtilsContract, StringProvider stringProvider, ChaloNavigationManager chaloNavigationManager, KotlinToastManager kotlinToastManager, CheckoutResultStateManager checkoutResultStateManager, BasicInfoContract basicInfoContract) {
        super(componentContext);
        this.k = componentContext;
        this.l = currencyFeature;
        this.m = fetchChaloCardInfoToShowUseCase;
        this.n = fetchChaloCardRechargeConfigurationUseCase;
        this.o = getMaskedCardNoFromCardNoUseCase;
        this.p = analyticsContract;
        this.q = getAvailableChaloCardOptionsUseCase;
        this.r = getLinkCardConfigUseCase;
        this.s = createCardRechargeOrderUseCase;
        this.t = userProfileDetailsProvider;
        this.u = timeUtilsContract;
        this.v = stringProvider;
        this.w = chaloNavigationManager;
        this.x = kotlinToastManager;
        this.y = checkoutResultStateManager;
        this.z = basicInfoContract;
        Json json = CardsJsonKt.f6442a;
        String str = cardRechargeEnterAmountArgs.b;
        json.getClass();
        CardRechargeEnterAmountArgsModel cardRechargeEnterAmountArgsModel = (CardRechargeEnterAmountArgsModel) json.b(str, CardRechargeEnterAmountArgsModel.INSTANCE.serializer());
        L0(new ChaloCardRechargeAmountIntent.InitializationIntent(cardRechargeEnterAmountArgsModel.f6261a, cardRechargeEnterAmountArgsModel.b));
        this.A = BuildersKt.d(this.j, null, null, new AnonymousClass1(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d3, code lost:
    
        if (r1 == r3) goto L27;
     */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountComponent r35, kotlin.coroutines.jvm.internal.ContinuationImpl r36) {
        /*
            Method dump skipped, instruction units count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountComponent.F0(app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object G0(ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent, ChaloCardDetails chaloCardDetails, ContinuationImpl continuationImpl) {
        ChaloCardRechargeAmountComponent$fetchCardRechargeConfig$1 chaloCardRechargeAmountComponent$fetchCardRechargeConfig$1;
        chaloCardRechargeAmountComponent.getClass();
        if (continuationImpl instanceof ChaloCardRechargeAmountComponent$fetchCardRechargeConfig$1) {
            chaloCardRechargeAmountComponent$fetchCardRechargeConfig$1 = (ChaloCardRechargeAmountComponent$fetchCardRechargeConfig$1) continuationImpl;
            int i = chaloCardRechargeAmountComponent$fetchCardRechargeConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloCardRechargeAmountComponent$fetchCardRechargeConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloCardRechargeAmountComponent$fetchCardRechargeConfig$1 = new ChaloCardRechargeAmountComponent$fetchCardRechargeConfig$1(chaloCardRechargeAmountComponent, continuationImpl);
            }
        } else {
            chaloCardRechargeAmountComponent$fetchCardRechargeConfig$1 = new ChaloCardRechargeAmountComponent$fetchCardRechargeConfig$1(chaloCardRechargeAmountComponent, continuationImpl);
        }
        Object objB = chaloCardRechargeAmountComponent$fetchCardRechargeConfig$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloCardRechargeAmountComponent$fetchCardRechargeConfig$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objB);
            FetchChaloCardRechargeConfigurationUseCase fetchChaloCardRechargeConfigurationUseCase = chaloCardRechargeAmountComponent.n;
            chaloCardRechargeAmountComponent$fetchCardRechargeConfig$1.L$0 = chaloCardDetails;
            chaloCardRechargeAmountComponent$fetchCardRechargeConfig$1.label = 1;
            objB = fetchChaloCardRechargeConfigurationUseCase.b(chaloCardRechargeAmountComponent$fetchCardRechargeConfig$1);
            if (objB != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
            return unit;
        }
        chaloCardDetails = (ChaloCardDetails) chaloCardRechargeAmountComponent$fetchCardRechargeConfig$1.L$0;
        ResultKt.b(objB);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objB;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            if (chaloCardDetails != null) {
                chaloCardRechargeAmountComponent.K0(chaloCardDetails, (ChaloCardRechargeConfigAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
                return unit;
            }
            chaloCardRechargeAmountComponent$fetchCardRechargeConfig$1.L$0 = null;
            chaloCardRechargeAmountComponent$fetchCardRechargeConfig$1.label = 2;
            return chaloCardRechargeAmountComponent.I0((ChaloUseCaseResult.Success) chaloUseCaseResult, true, chaloCardRechargeAmountComponent$fetchCardRechargeConfig$1) == obj ? obj : unit;
        }
        OperationFailureError operationFailureError = ((UseCaseOperationError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f6000a;
        StateFlow stateFlow = chaloCardRechargeAmountComponent.f;
        if (operationFailureError instanceof OperationFailureError.DataFetchOperationFailure) {
            DataFetchOperationErrorReason dataFetchOperationErrorReason = ((OperationFailureError.DataFetchOperationFailure) operationFailureError).f5998a;
            AnalyticsContract.DefaultImpls.a(chaloCardRechargeAmountComponent.p, "chalo card recharge config fetch failed", "CHALO_CARD_RECHARGE_ENTER_AMOUNT_SCREEN", ChaloCardRechargeAmountContractKt.a((ChaloCardRechargeAmountViewState) stateFlow.getValue(), MapsKt.h(new Pair("chaloCardRechargeConfigFetchFailedReason", dataFetchOperationErrorReason.name()))), null, false, 24);
            switch (WhenMappings.b[dataFetchOperationErrorReason.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    chaloCardRechargeAmountComponent.E0(new bj(2));
                    return unit;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (!(operationFailureError instanceof OperationFailureError.UseCaseSpecificError)) {
            throw new NoWhenBranchMatchedException();
        }
        FetchChaloCardRechargeConfigurationFailureReason fetchChaloCardRechargeConfigurationFailureReason = (FetchChaloCardRechargeConfigurationFailureReason) ((OperationFailureError.UseCaseSpecificError) operationFailureError).f5999a;
        AnalyticsContract.DefaultImpls.a(chaloCardRechargeAmountComponent.p, "chalo card recharge config fetch failed", "CHALO_CARD_RECHARGE_ENTER_AMOUNT_SCREEN", ChaloCardRechargeAmountContractKt.a((ChaloCardRechargeAmountViewState) stateFlow.getValue(), MapsKt.h(new Pair("chaloCardRechargeConfigFetchFailedReason", fetchChaloCardRechargeConfigurationFailureReason.name()))), null, false, 24);
        int i3 = WhenMappings.c[fetchChaloCardRechargeConfigurationFailureReason.ordinal()];
        if (i3 == 1) {
            chaloCardRechargeAmountComponent.E0(new bj(3));
            return unit;
        }
        if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        chaloCardRechargeAmountComponent.E0(new bj(4));
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object H0(ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent, String str, String str2, long j, CardRechargeConfiguration cardRechargeConfiguration, String str3, ContinuationImpl continuationImpl) {
        ChaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1 chaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1;
        Object obj;
        String str4;
        CardRechargeConfiguration cardRechargeConfiguration2;
        String str5;
        String str6;
        long j2;
        chaloCardRechargeAmountComponent.getClass();
        if (continuationImpl instanceof ChaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1) {
            chaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1 = (ChaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1) continuationImpl;
            int i = chaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1 = new ChaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1(chaloCardRechargeAmountComponent, continuationImpl);
            }
        } else {
            chaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1 = new ChaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1(chaloCardRechargeAmountComponent, continuationImpl);
        }
        Object obj2 = chaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            BasicInfoContract basicInfoContract = chaloCardRechargeAmountComponent.z;
            chaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1.L$0 = str;
            chaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1.L$1 = str2;
            chaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1.L$2 = cardRechargeConfiguration;
            chaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1.L$3 = str3;
            chaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1.J$0 = j;
            chaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1.label = 1;
            Object objC = basicInfoContract.c(chaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objC;
            str4 = str2;
            cardRechargeConfiguration2 = cardRechargeConfiguration;
            str5 = str;
            str6 = str3;
            j2 = j;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = chaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1.J$0;
            String str7 = (String) chaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1.L$3;
            CardRechargeConfiguration cardRechargeConfiguration3 = (CardRechargeConfiguration) chaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1.L$2;
            String str8 = (String) chaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1.L$1;
            String str9 = (String) chaloCardRechargeAmountComponent$saveCardRechargeSummaryModel$1.L$0;
            ResultKt.b(obj2);
            obj = obj2;
            cardRechargeConfiguration2 = cardRechargeConfiguration3;
            str5 = str9;
            str6 = str7;
            str4 = str8;
            j2 = j3;
        }
        chaloCardRechargeAmountComponent.C = new CardRechargeSummaryData(str4, str5, j2, str6, ((Number) obj).longValue(), cardRechargeConfiguration2.b, cardRechargeConfiguration2.d, cardRechargeConfiguration2.c, cardRechargeConfiguration2.j, CardRechargePaymentStatus.SUCCESS, CardRechargeStatus.PENDING);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object I0(ChaloUseCaseResult.Success success, boolean z, ContinuationImpl continuationImpl) {
        ChaloCardRechargeAmountComponent$fetchChaloCardInfoData$1 chaloCardRechargeAmountComponent$fetchChaloCardInfoData$1;
        ChaloUseCaseResult.Success success2;
        Object objA;
        if (continuationImpl instanceof ChaloCardRechargeAmountComponent$fetchChaloCardInfoData$1) {
            chaloCardRechargeAmountComponent$fetchChaloCardInfoData$1 = (ChaloCardRechargeAmountComponent$fetchChaloCardInfoData$1) continuationImpl;
            int i = chaloCardRechargeAmountComponent$fetchChaloCardInfoData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloCardRechargeAmountComponent$fetchChaloCardInfoData$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloCardRechargeAmountComponent$fetchChaloCardInfoData$1 = new ChaloCardRechargeAmountComponent$fetchChaloCardInfoData$1(this, continuationImpl);
            }
        } else {
            chaloCardRechargeAmountComponent$fetchChaloCardInfoData$1 = new ChaloCardRechargeAmountComponent$fetchChaloCardInfoData$1(this, continuationImpl);
        }
        Object obj = chaloCardRechargeAmountComponent$fetchChaloCardInfoData$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloCardRechargeAmountComponent$fetchChaloCardInfoData$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            success2 = success;
            chaloCardRechargeAmountComponent$fetchChaloCardInfoData$1.L$0 = success2;
            chaloCardRechargeAmountComponent$fetchChaloCardInfoData$1.label = 1;
            objA = this.m.a(z, chaloCardRechargeAmountComponent$fetchChaloCardInfoData$1);
            if (objA != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ChaloUseCaseResult.Success success3 = (ChaloUseCaseResult.Success) chaloCardRechargeAmountComponent$fetchChaloCardInfoData$1.L$0;
        ResultKt.b(obj);
        objA = obj;
        success2 = success3;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        boolean z2 = chaloUseCaseResult instanceof ChaloUseCaseResult.Failure;
        StateFlow stateFlow = this.f;
        if (!z2) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ChaloCardsAppModel chaloCardsAppModel = (ChaloCardsAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            ChaloCardAnalyticsExtentionsKt.b(((ChaloCardInfo) chaloCardsAppModel.f6136a.get(0)).a(), new HashMap());
            AnalyticsContract.DefaultImpls.a(this.p, "chalo card info fetch success", "CHALO_CARD_RECHARGE_ENTER_AMOUNT_SCREEN", ChaloCardRechargeAmountContractKt.a((ChaloCardRechargeAmountViewState) stateFlow.getValue(), null), null, false, 24);
            K0(((ChaloCardInfo) chaloCardsAppModel.f6136a.get(0)).a(), (ChaloCardRechargeConfigAppModel) success2.f10419a);
            return unit;
        }
        FetchChaloCardInfoToShowFailureReason fetchChaloCardInfoToShowFailureReason = (FetchChaloCardInfoToShowFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
        AnalyticsContract.DefaultImpls.a(this.p, "chalo card info fetch failed", "CHALO_CARD_RECHARGE_ENTER_AMOUNT_SCREEN", ChaloCardRechargeAmountContractKt.a((ChaloCardRechargeAmountViewState) stateFlow.getValue(), MapsKt.h(new Pair("chaloCardInfoFetchFailedReason", fetchChaloCardInfoToShowFailureReason.name()))), null, false, 24);
        int i3 = WhenMappings.f6289a[fetchChaloCardInfoToShowFailureReason.ordinal()];
        if (i3 == 1) {
            E0(new bj(0));
            return unit;
        }
        if (i3 == 2) {
            E0(new bj(1));
            return unit;
        }
        if (i3 != 3 && i3 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        chaloCardRechargeAmountComponent$fetchChaloCardInfoData$1.L$0 = null;
        chaloCardRechargeAmountComponent$fetchChaloCardInfoData$1.label = 2;
        return I0(success2, false, chaloCardRechargeAmountComponent$fetchChaloCardInfoData$1) == obj2 ? obj2 : unit;
    }

    public final CardRechargeAmountErrorType J0(long j, long j2, long j3, long j4) {
        CurrencyFeature currencyFeature = this.l;
        if (j < j2) {
            return new CardRechargeAmountErrorType.ErrorAmountBelowMinimumRequiredAmount(currencyFeature.a(j2, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING));
        }
        if (j > j3) {
            return new CardRechargeAmountErrorType.ErrorRechargeLimitExceeded(String.valueOf(currencyFeature.f(j3, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING)));
        }
        return j % j4 != 0 ? new CardRechargeAmountErrorType.ErrorAmountNotInRequiredMultiples(String.valueOf(currencyFeature.f(j4, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING))) : CardRechargeAmountErrorType.NoError.f6284a;
    }

    public final void K0(ChaloCardDetails chaloCardDetails, ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel) {
        CardRechargeAmountLayoutType errorLayout;
        String strA;
        if (Intrinsics.d(chaloCardDetails.getH(), Boolean.TRUE)) {
            errorLayout = new CardRechargeAmountLayoutType.ErrorLayout(CardRechargeDataFetchErrorReason.CARD_BLOCKED);
        } else {
            errorLayout = !chaloCardDetails.getB() ? new CardRechargeAmountLayoutType.ErrorLayout(CardRechargeDataFetchErrorReason.CARD_RECHARGE_DISABLED) : CardRechargeAmountLayoutType.EnterAmountLayout.f6285a;
        }
        CardRechargeAmountLayoutType cardRechargeAmountLayoutType = errorLayout;
        String f6157a = chaloCardDetails.getF6157a();
        Long l = chaloCardRechargeConfigAppModel.b.f6132a;
        if (l != null) {
            strA = this.l.a(l.longValue(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
        } else {
            strA = null;
        }
        E0(new aj(this, f6157a, chaloCardRechargeConfigAppModel, chaloCardDetails, cardRechargeAmountLayoutType, strA));
    }

    public final void L0(ChaloCardRechargeAmountIntent intent) {
        CardRechargeAmountErrorType cardRechargeAmountErrorTypeJ0;
        CardRechargeAmountErrorType cardRechargeAmountErrorType;
        ChaloCardRechargeFareInfoAppModel chaloCardRechargeFareInfoAppModel;
        Long l;
        Long c;
        ChaloCardRechargeFareInfoAppModel chaloCardRechargeFareInfoAppModel2;
        Long l2;
        String str;
        ChaloCardRechargeAmountComponent chaloCardRechargeAmountComponent = this;
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof ChaloCardRechargeAmountIntent.InitializationIntent;
        ContextScope contextScope = chaloCardRechargeAmountComponent.j;
        if (z) {
            ChaloCardRechargeAmountIntent.InitializationIntent initializationIntent = (ChaloCardRechargeAmountIntent.InitializationIntent) intent;
            BuildersKt.d(contextScope, null, null, new ChaloCardRechargeAmountComponent$handleInitializationIntent$1(chaloCardRechargeAmountComponent, initializationIntent.b, initializationIntent.f6296a, null), 3);
            return;
        }
        boolean z2 = intent instanceof ChaloCardRechargeAmountIntent.OnAmountEnteredIntent;
        int i = 2;
        int i2 = 1;
        StateFlow stateFlow = chaloCardRechargeAmountComponent.f;
        if (!z2) {
            if (intent instanceof ChaloCardRechargeAmountIntent.CardDataFetchErrorActionClickedIntent) {
                BuildersKt.d(contextScope, null, null, new ChaloCardRechargeAmountComponent$handleCardDataFetchFailedActionClickedIntent$1(chaloCardRechargeAmountComponent, ((ChaloCardRechargeAmountIntent.CardDataFetchErrorActionClickedIntent) intent).f6295a, null), 3);
                return;
            }
            if (intent.equals(ChaloCardRechargeAmountIntent.ProceedBtnClickedIntent.f6300a)) {
                AnalyticsContract.DefaultImpls.a(chaloCardRechargeAmountComponent.p, "chalo card recharge proceed btn clicked", "CHALO_CARD_RECHARGE_ENTER_AMOUNT_SCREEN", ChaloCardRechargeAmountContractKt.a((ChaloCardRechargeAmountViewState) stateFlow.getValue(), null), null, false, 24);
                ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel = ((ChaloCardRechargeAmountViewState) stateFlow.getValue()).b;
                if (chaloCardRechargeConfigAppModel != null) {
                    AnalyticsContractImplKt.b(chaloCardRechargeAmountComponent.p, "terms and conditions open", Source.CHALO_CARD_RECHARGE_ENTER_AMOUNT_SCREEN, ChaloCardRechargeAmountContractKt.a((ChaloCardRechargeAmountViewState) stateFlow.getValue(), MapsKt.h(new Pair("rechargeAmount", Long.valueOf(((ChaloCardRechargeAmountViewState) stateFlow.getValue()).g)))), false, 24);
                    chaloCardRechargeAmountComponent.E0(new ch(chaloCardRechargeConfigAppModel, 9));
                    chaloCardRechargeAmountComponent.r0(ChaloCardRechargeAmountSideEffect.HideKeyboard.f6307a);
                    return;
                }
                return;
            }
            boolean zEquals = intent.equals(ChaloCardRechargeAmountIntent.UseLinkCodeClickedIntent.f6305a);
            ChaloNavigationManager chaloNavigationManager = chaloCardRechargeAmountComponent.w;
            if (zEquals) {
                AnalyticsContract.DefaultImpls.a(chaloCardRechargeAmountComponent.p, "chalo card info link card tut link btn clicked", "CHALO_CARD_RECHARGE_ENTER_AMOUNT_SCREEN", ChaloCardRechargeAmountContractKt.a((ChaloCardRechargeAmountViewState) stateFlow.getValue(), null), null, false, 24);
                ChaloNavigationManagerKt.e(chaloNavigationManager, new CardLinkingScreenArgs(Source.CHALO_CARD_RECHARGE_ENTER_AMOUNT_SCREEN), null, 6);
                return;
            }
            if (intent.equals(ChaloCardRechargeAmountIntent.TncDialogueAccepted.f6303a)) {
                chaloCardRechargeAmountComponent.M0(true);
                BuildersKt.d(contextScope, null, null, new ChaloCardRechargeAmountComponent$onTncAccepted$1(chaloCardRechargeAmountComponent, null), 3);
                return;
            }
            if (intent.equals(ChaloCardRechargeAmountIntent.TncDialogueCancelled.f6304a)) {
                chaloCardRechargeAmountComponent.M0(false);
                chaloCardRechargeAmountComponent.E0(new pi(27));
                return;
            }
            if (intent.equals(ChaloCardRechargeAmountIntent.OnBottomSheetPositiveBtnClicked.f6299a)) {
                ChaloNavigationManagerKt.c(chaloNavigationManager);
                return;
            }
            if (intent.equals(ChaloCardRechargeAmountIntent.BottomSheetDismissedIntent.f6294a)) {
                chaloCardRechargeAmountComponent.E0(new pi(29));
                return;
            }
            if (!intent.equals(ChaloCardRechargeAmountIntent.RechargeSuccessNegativeButtonClicked.f6301a)) {
                if (intent.equals(ChaloCardRechargeAmountIntent.RechargeSuccessPositiveButtonClicked.f6302a)) {
                    AnalyticsContractImplKt.b(chaloCardRechargeAmountComponent.p, "ocr payment success ok clicked", Source.CHALO_CARD_RECHARGE_ENTER_AMOUNT_SCREEN, ChaloCardRechargeAmountContractKt.a((ChaloCardRechargeAmountViewState) stateFlow.getValue(), MapsKt.h(new Pair("cardTransactionId", ((ChaloCardRechargeAmountViewState) stateFlow.getValue()).r))), false, 24);
                    ChaloNavigationManagerKt.f(chaloNavigationManager, new HomeArgs((String) null, (String) null, 7));
                    return;
                } else {
                    if (!intent.equals(ChaloCardRechargeAmountIntent.NavigateToHome.f6297a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ChaloNavigationManagerKt.f(chaloNavigationManager, new HomeArgs((String) null, (String) null, 7));
                    return;
                }
            }
            Source source = Source.CHALO_CARD_RECHARGE_ENTER_AMOUNT_SCREEN;
            AnalyticsContractImplKt.b(chaloCardRechargeAmountComponent.p, "ocr payment success recharge details clicked", source, ChaloCardRechargeAmountContractKt.a((ChaloCardRechargeAmountViewState) stateFlow.getValue(), MapsKt.h(new Pair("cardTransactionId", ((ChaloCardRechargeAmountViewState) stateFlow.getValue()).r))), false, 24);
            CardRechargeSummaryData cardRechargeSummaryData = chaloCardRechargeAmountComponent.C;
            if (cardRechargeSummaryData == null) {
                BuildersKt.d(contextScope, null, null, new ChaloCardRechargeAmountComponent$handleRechargeSuccessNegativeButtonClicked$2$1(chaloCardRechargeAmountComponent, null), 3);
                return;
            } else {
                ChaloNavigationManagerKt.e(chaloNavigationManager, new TripSummaryArgs.TicketSummaryScreen(source, new BookingsRequestType.CardRechargeType(((ChaloCardRechargeAmountViewState) stateFlow.getValue()).r, cardRechargeSummaryData)), null, 6);
                AnalyticsContractImplKt.b(chaloCardRechargeAmountComponent.p, "ocr payment summary activity open", source, ChaloCardRechargeAmountContractKt.a((ChaloCardRechargeAmountViewState) stateFlow.getValue(), MapsKt.i(new Pair("cardTransactionId", ((ChaloCardRechargeAmountViewState) stateFlow.getValue()).r), new Pair("paymentTime", String.valueOf(cardRechargeSummaryData.e)), new Pair("paymentStatus", cardRechargeSummaryData.j.name()), new Pair("rechargeStatus", cardRechargeSummaryData.k.name()), new Pair(PaymentConstants.AMOUNT, String.valueOf(cardRechargeSummaryData.c)))), false, 24);
                return;
            }
        }
        String str2 = ((ChaloCardRechargeAmountIntent.OnAmountEnteredIntent) intent).f6298a;
        if (str2.length() == 0) {
            chaloCardRechargeAmountComponent.E0(new pi(26));
        }
        long jB = chaloCardRechargeAmountComponent.l.b(str2);
        ChaloCardRechargeAmountFlowType chaloCardRechargeAmountFlowType = ((ChaloCardRechargeAmountViewState) stateFlow.getValue()).f6308a;
        boolean zD = Intrinsics.d(chaloCardRechargeAmountFlowType, ChaloCardRechargeAmountFlowType.Unknown.INSTANCE);
        CardRechargeAmountErrorType.NoError noError = CardRechargeAmountErrorType.NoError.f6284a;
        if (zD) {
            cardRechargeAmountErrorType = noError;
        } else {
            long jLongValue = 1;
            long jLongValue2 = 0;
            if (chaloCardRechargeAmountFlowType instanceof ChaloCardRechargeAmountFlowType.WithChaloCardDetails) {
                ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel2 = ((ChaloCardRechargeAmountViewState) stateFlow.getValue()).b;
                if (chaloCardRechargeConfigAppModel2 != null && (chaloCardRechargeFareInfoAppModel2 = chaloCardRechargeConfigAppModel2.b) != null && (l2 = chaloCardRechargeFareInfoAppModel2.f6132a) != null) {
                    jLongValue2 = l2.longValue();
                }
                ChaloCardDetails chaloCardDetails = ((ChaloCardRechargeAmountFlowType.WithChaloCardDetails) chaloCardRechargeAmountFlowType).b;
                long jLongValue3 = (chaloCardDetails == null || (c = chaloCardDetails.getC()) == null) ? Long.MAX_VALUE : c.longValue();
                ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel3 = ((ChaloCardRechargeAmountViewState) stateFlow.getValue()).b;
                if (chaloCardRechargeConfigAppModel3 != null && (chaloCardRechargeFareInfoAppModel = chaloCardRechargeConfigAppModel3.b) != null && (l = chaloCardRechargeFareInfoAppModel.b) != null) {
                    jLongValue = l.longValue();
                }
                cardRechargeAmountErrorTypeJ0 = chaloCardRechargeAmountComponent.J0(jB, jLongValue2, jLongValue3, jLongValue);
                chaloCardRechargeAmountComponent = this;
            } else {
                if (!(chaloCardRechargeAmountFlowType instanceof ChaloCardRechargeAmountFlowType.WithoutChaloCardDetails)) {
                    throw new NoWhenBranchMatchedException();
                }
                ChaloCardRechargeAmountFlowType.WithoutChaloCardDetails withoutChaloCardDetails = (ChaloCardRechargeAmountFlowType.WithoutChaloCardDetails) chaloCardRechargeAmountFlowType;
                ChaloCardRechargeConfigAppModel chaloCardRechargeConfigAppModel4 = withoutChaloCardDetails.c;
                Long l3 = chaloCardRechargeConfigAppModel4.b.f6132a;
                jLongValue2 = l3 != null ? l3.longValue() : 0L;
                long j = withoutChaloCardDetails.d;
                Long l4 = chaloCardRechargeConfigAppModel4.b.b;
                jLongValue = l4 != null ? l4.longValue() : 1L;
                chaloCardRechargeAmountComponent = this;
                cardRechargeAmountErrorTypeJ0 = chaloCardRechargeAmountComponent.J0(jB, jLongValue2, j, jLongValue);
            }
            cardRechargeAmountErrorType = cardRechargeAmountErrorTypeJ0;
        }
        if (!cardRechargeAmountErrorType.equals(noError)) {
            Source source2 = Source.CHALO_CARD_RECHARGE_ENTER_AMOUNT_SCREEN;
            if (cardRechargeAmountErrorType instanceof CardRechargeAmountErrorType.ErrorAmountNotInRequiredMultiples) {
                str = "errorAmountNotInRequiredMultiples";
            } else if (cardRechargeAmountErrorType instanceof CardRechargeAmountErrorType.ErrorAmountBelowMinimumRequiredAmount) {
                str = "errorAmountBelowMinAllowedAmount";
            } else {
                str = cardRechargeAmountErrorType instanceof CardRechargeAmountErrorType.ErrorRechargeLimitExceeded ? "errorRechargeLimitExceeded" : "noError";
            }
            AnalyticsContractImplKt.b(chaloCardRechargeAmountComponent.p, "ocr recharge amount error", source2, vo1.s("errorType", str), false, 24);
        }
        if (cardRechargeAmountErrorType instanceof CardRechargeAmountErrorType.ErrorAmountBelowMinimumRequiredAmount) {
            chaloCardRechargeAmountComponent.E0(new xa(jB, str2, i2));
            return;
        }
        if ((cardRechargeAmountErrorType instanceof CardRechargeAmountErrorType.ErrorAmountNotInRequiredMultiples) || (cardRechargeAmountErrorType instanceof CardRechargeAmountErrorType.ErrorRechargeLimitExceeded)) {
            chaloCardRechargeAmountComponent.E0(new s8(jB, str2, cardRechargeAmountErrorType, 3));
        } else {
            if (!cardRechargeAmountErrorType.equals(noError)) {
                throw new NoWhenBranchMatchedException();
            }
            chaloCardRechargeAmountComponent.E0(new xa(jB, str2, i));
        }
    }

    public final void M0(boolean z) {
        AnalyticsContractImplKt.b(this.p, z ? "terms accept" : "terms cancel", Source.CHALO_CARD_RECHARGE_ENTER_AMOUNT_SCREEN, ChaloCardRechargeAmountContractKt.a((ChaloCardRechargeAmountViewState) this.f.getValue(), null), false, 24);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (ChaloCardRechargeAmountViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new ChaloCardRechargeAmountViewState(null, null, 2097151);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new ChaloCardRechargeAmountViewState(null, null, 2097151);
    }
}
