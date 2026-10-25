package app.chalo.ncmc.ui.transactionhistory;

import androidx.paging.CachedPagingDataKt;
import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms__PagingDataTransformsKt;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.constants.Source;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.mvibase.simple.DataFetchOperationErrorReason;
import app.chalo.mvibase.simple.OperationFailureError;
import app.chalo.mvibase.simple.UseCaseOperationError;
import app.chalo.ncmc.cardreceipt.ChaloCardReceiptManager;
import app.chalo.ncmc.data.appmodel.ChaloCardUnsyncedRechargeDetails;
import app.chalo.ncmc.data.cardtransactions.CardTransaction;
import app.chalo.ncmc.domain.CardUnsyncedRechargesHelper;
import app.chalo.ncmc.domain.FetchChaloCardTransactionsFailureReason;
import app.chalo.ncmc.domain.FetchChaloCardTransactionsUseCase;
import app.chalo.ncmc.ui.CardTransactionDetailArgsModel;
import app.chalo.ncmc.ui.CardTransactionHistoryArgsModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.CardTransactionDetailArgs;
import app.chalo.scenes.args.CardTransactionHistoryArgs;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.f;
import defpackage.i4;
import defpackage.k2;
import defpackage.rf;
import defpackage.vo1;
import defpackage.we;
import java.util.ArrayList;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryIntent;", "Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryViewState;", "Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryDataState;", "Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistorySideEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CardTransactionHistoryComponent extends ChaloBaseStateMviComponent<CardTransactionHistoryIntent, CardTransactionHistoryViewState, CardTransactionHistoryViewState, CardTransactionHistorySideEffect> {
    public Flow A;
    public ChaloCardUnsyncedRechargeDetails B;
    public CardTransactionHistoryViewState C;
    public final ComponentContext k;
    public final FetchChaloCardTransactionsUseCase l;
    public final StringProvider m;
    public final CurrencyFeature n;
    public final TimeUtilsContract o;
    public final AnalyticsContract p;
    public final ChaloCardReceiptManager q;
    public final KotlinToastManager r;
    public final ChaloNavigationManager s;
    public final CardUnsyncedRechargesHelper t;
    public final ChaloNavigationManager u;
    public Job v;
    public final ArrayList w;
    public String x;
    public String y;
    public String z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/ui/transactionhistory/CardTransactionHistoryComponent$Companion;", "", "", "SOURCE", "Ljava/lang/String;", "CARD_TRANSACTION_STATE_KEEPER_KEY", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6425a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[FetchChaloCardTransactionsFailureReason.values().length];
            try {
                iArr[FetchChaloCardTransactionsFailureReason.UNKNOWN_SERVER_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FetchChaloCardTransactionsFailureReason.INTERNAL_SERVER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FetchChaloCardTransactionsFailureReason.CARD_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FetchChaloCardTransactionsFailureReason.CITY_NOT_FOUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FetchChaloCardTransactionsFailureReason.UNKNOWN_LOCAL_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f6425a = iArr;
            int[] iArr2 = new int[DataFetchOperationErrorReason.values().length];
            try {
                iArr2[DataFetchOperationErrorReason.NO_INTERNET_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DataFetchOperationErrorReason.SERVER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DataFetchOperationErrorReason.REQUEST_CANCELLATION_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DataFetchOperationErrorReason.API_CALL_AUTHORISATION_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[DataFetchOperationErrorReason.UNEXPECTED_EXCEPTION_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[DataFetchOperationErrorReason.UNKNOWN_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[DataFetchOperationErrorReason.SUCCESS_RESPONSE_PARSING_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[DataFetchOperationErrorReason.NO_UPDATE_IN_DATA_BASED_ON_ETAG.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[DataFetchOperationErrorReason.ERROR_RESPONSE_PARSING_ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            b = iArr2;
        }
    }

    public CardTransactionHistoryComponent(CardTransactionHistoryArgs cardTransactionHistoryArgs, ComponentContext componentContext, FetchChaloCardTransactionsUseCase fetchChaloCardTransactionsUseCase, StringProvider stringProvider, CurrencyFeature currencyFeature, TimeUtilsContract timeUtilsContract, AnalyticsContract analyticsContract, ChaloCardReceiptManager chaloCardReceiptManager, KotlinToastManager kotlinToastManager, ChaloNavigationManager chaloNavigationManager, CardUnsyncedRechargesHelper cardUnsyncedRechargesHelper, ChaloNavigationManager chaloNavigationManager2) {
        super(componentContext);
        this.k = componentContext;
        this.l = fetchChaloCardTransactionsUseCase;
        this.m = stringProvider;
        this.n = currencyFeature;
        this.o = timeUtilsContract;
        this.p = analyticsContract;
        this.q = chaloCardReceiptManager;
        this.r = kotlinToastManager;
        this.s = chaloNavigationManager;
        this.t = cardUnsyncedRechargesHelper;
        this.u = chaloNavigationManager2;
        this.w = new ArrayList();
        componentContext.getB().d("CardTransactionStateKeeperKey", CardTransactionHistoryViewState.INSTANCE.serializer(), new i4(this, 20));
        Json json = ChaloJson.b;
        String str = cardTransactionHistoryArgs.b;
        json.getClass();
        CardTransactionHistoryArgsModel cardTransactionHistoryArgsModel = (CardTransactionHistoryArgsModel) json.b(str, CardTransactionHistoryArgsModel.INSTANCE.serializer());
        I0(new CardTransactionHistoryIntent.InitialIntent(cardTransactionHistoryArgsModel.f6265a, cardTransactionHistoryArgsModel.b, cardTransactionHistoryArgsModel.c, cardTransactionHistoryArgsModel.d));
    }

    public static final void F0(final CardTransactionHistoryComponent cardTransactionHistoryComponent, ChaloUseCaseResult chaloUseCaseResult, boolean z) {
        Pair pair;
        cardTransactionHistoryComponent.getClass();
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            Flow flow = (Flow) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            cardTransactionHistoryComponent.J0("", true, z);
            final Flow flowM = FlowKt.m(flow);
            cardTransactionHistoryComponent.A = CachedPagingDataKt.cachedIn(new Flow<PagingData<CardTransactionUiModel>>() { // from class: app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryComponent$handleCardTransactionSuccess$$inlined$map$1

                /* JADX INFO: renamed from: app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryComponent$handleCardTransactionSuccess$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f6428a;
                    public final /* synthetic */ CardTransactionHistoryComponent b;

                    /* JADX INFO: renamed from: app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryComponent$handleCardTransactionSuccess$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryComponent$handleCardTransactionSuccess$$inlined$map$1$2", f = "CardTransactionHistoryComponent.kt", l = {50}, m = "emit", v = 1)
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

                    public AnonymousClass2(FlowCollector flowCollector, CardTransactionHistoryComponent cardTransactionHistoryComponent) {
                        this.f6428a = flowCollector;
                        this.b = cardTransactionHistoryComponent;
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
                            PagingData map = PagingDataTransforms__PagingDataTransformsKt.map((PagingData) obj, new CardTransactionHistoryComponent$handleCardTransactionSuccess$1$1(this.b, null));
                            anonymousClass1.label = 1;
                            if (this.f6428a.emit(map, anonymousClass1) == coroutineSingletons) {
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
                    Object objCollect = flowM.collect(new AnonymousClass2(flowCollector, cardTransactionHistoryComponent), continuation);
                    return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
                }
            }, cardTransactionHistoryComponent.j);
            cardTransactionHistoryComponent.E0(new we(3));
            return;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        UseCaseOperationError useCaseOperationError = (UseCaseOperationError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
        OperationFailureError operationFailureError = useCaseOperationError.f6000a;
        String str = useCaseOperationError.c;
        int i = useCaseOperationError.b;
        if (operationFailureError instanceof OperationFailureError.UseCaseSpecificError) {
            int i2 = WhenMappings.f6425a[((FetchChaloCardTransactionsFailureReason) ((OperationFailureError.UseCaseSpecificError) operationFailureError).f5999a).ordinal()];
            if (i2 == 1 || i2 == 2) {
                pair = new Pair(null, new CardTransactionHistoryUiErrorWrapper(i, ChaloCardTransactionsUiErrorType.API_FAILED));
            } else if (i2 == 3) {
                pair = new Pair(null, new CardTransactionHistoryUiErrorWrapper(i, ChaloCardTransactionsUiErrorType.CARD_NOT_FOUND));
            } else {
                if (i2 != 4 && i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                pair = new Pair(str, new CardTransactionHistoryUiErrorWrapper(i, ChaloCardTransactionsUiErrorType.GENERIC));
            }
        } else {
            if (!(operationFailureError instanceof OperationFailureError.DataFetchOperationFailure)) {
                throw new NoWhenBranchMatchedException();
            }
            switch (WhenMappings.b[((OperationFailureError.DataFetchOperationFailure) operationFailureError).f5998a.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    pair = new Pair(str, new CardTransactionHistoryUiErrorWrapper(i, ChaloCardTransactionsUiErrorType.GENERIC));
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    pair = new Pair(null, new CardTransactionHistoryUiErrorWrapper(i, ChaloCardTransactionsUiErrorType.GENERIC));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        String str2 = (String) pair.getFirst();
        CardTransactionHistoryUiErrorWrapper cardTransactionHistoryUiErrorWrapper = (CardTransactionHistoryUiErrorWrapper) pair.getSecond();
        cardTransactionHistoryComponent.J0(str2 == null ? cardTransactionHistoryUiErrorWrapper.b.name() : str2, false, z);
        cardTransactionHistoryComponent.A = null;
        cardTransactionHistoryComponent.E0(new f(18, str2, cardTransactionHistoryUiErrorWrapper));
    }

    public static final void G0(CardTransactionHistoryComponent cardTransactionHistoryComponent, CardTransaction cardTransaction, CardTransactionTypeUiModel cardTransactionTypeUiModel) {
        cardTransactionHistoryComponent.getClass();
        CardTransactionDetailArgsModel cardTransactionDetailArgsModel = new CardTransactionDetailArgsModel(cardTransaction, cardTransactionTypeUiModel);
        ChaloNavigationManager chaloNavigationManager = cardTransactionHistoryComponent.s;
        Json json = ChaloJson.b;
        json.getClass();
        ChaloNavigationManagerKt.e(chaloNavigationManager, new CardTransactionDetailArgs(json.a(CardTransactionDetailArgsModel.INSTANCE.serializer(), cardTransactionDetailArgsModel)), null, 6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object H0(CardTransactionHistoryComponent cardTransactionHistoryComponent, ChaloCardUnsyncedRechargeDetails chaloCardUnsyncedRechargeDetails, Continuation continuation) {
        CardTransactionHistoryComponent$setUnsyncedRechargesBannerDetails$1 cardTransactionHistoryComponent$setUnsyncedRechargesBannerDetails$1;
        cardTransactionHistoryComponent.getClass();
        if (continuation instanceof CardTransactionHistoryComponent$setUnsyncedRechargesBannerDetails$1) {
            cardTransactionHistoryComponent$setUnsyncedRechargesBannerDetails$1 = (CardTransactionHistoryComponent$setUnsyncedRechargesBannerDetails$1) continuation;
            int i = cardTransactionHistoryComponent$setUnsyncedRechargesBannerDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cardTransactionHistoryComponent$setUnsyncedRechargesBannerDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                cardTransactionHistoryComponent$setUnsyncedRechargesBannerDetails$1 = new CardTransactionHistoryComponent$setUnsyncedRechargesBannerDetails$1(cardTransactionHistoryComponent, continuation);
            }
        } else {
            cardTransactionHistoryComponent$setUnsyncedRechargesBannerDetails$1 = new CardTransactionHistoryComponent$setUnsyncedRechargesBannerDetails$1(cardTransactionHistoryComponent, continuation);
        }
        Object objB = cardTransactionHistoryComponent$setUnsyncedRechargesBannerDetails$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cardTransactionHistoryComponent$setUnsyncedRechargesBannerDetails$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            cardTransactionHistoryComponent.B = chaloCardUnsyncedRechargeDetails;
            String strA = cardTransactionHistoryComponent.n.a(chaloCardUnsyncedRechargeDetails.b, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
            cardTransactionHistoryComponent$setUnsyncedRechargesBannerDetails$1.label = 1;
            objB = cardTransactionHistoryComponent.m.b(StringEnum.RECHARGE_OF_X_PENDING, new Object[]{strA}, cardTransactionHistoryComponent$setUnsyncedRechargesBannerDetails$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        cardTransactionHistoryComponent.E0(new k2((String) objB, 6));
        return Unit.f17538a;
    }

    public final void I0(CardTransactionHistoryIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof CardTransactionHistoryIntent.InitialIntent;
        ContextScope contextScope = this.j;
        if (z) {
            CardTransactionHistoryIntent.InitialIntent initialIntent = (CardTransactionHistoryIntent.InitialIntent) intent;
            if (this.d) {
                return;
            }
            this.d = true;
            Source source = initialIntent.b;
            String str = initialIntent.f6431a;
            AnalyticsContractImplKt.b(this.p, "chalo card transactions opened", source, vo1.s("cardNumber", str), false, 24);
            this.x = str;
            this.y = initialIntent.c;
            this.z = initialIntent.d;
            this.A = null;
            E0(new rf(this, 0));
            this.v = BuildersKt.d(contextScope, null, null, new CardTransactionHistoryComponent$handleInitialIntent$2(this, null), 3);
            BuildersKt.d(contextScope, null, null, new CardTransactionHistoryComponent$handleInitialIntent$3(this, initialIntent, null), 3);
            return;
        }
        if (intent instanceof CardTransactionHistoryIntent.RefreshTransactionHistoryIntent) {
            Job job = this.v;
            if (job == null || !((AbstractCoroutine) job).isActive()) {
                AnalyticsContract.DefaultImpls.a(this.p, "chalo card transactions refresh clicked", "CardTransactionsViewModel", null, null, false, 28);
                String str2 = this.x;
                E0(new we(7));
                this.A = null;
                if (str2 == null) {
                    return;
                }
                this.v = BuildersKt.d(contextScope, null, null, new CardTransactionHistoryComponent$handleRefreshTransactionsIntent$2(this, str2, null), 3);
                return;
            }
            return;
        }
        if (intent instanceof CardTransactionHistoryIntent.RetryIntent) {
            Job job2 = this.v;
            if (job2 == null || !((AbstractCoroutine) job2).isActive()) {
                AnalyticsContract.DefaultImpls.a(this.p, "chalo card transactions retry clicked", "CardTransactionsViewModel", null, null, false, 28);
                String str3 = this.x;
                E0(new we(4));
                this.A = null;
                if (str3 == null) {
                    return;
                }
                this.v = BuildersKt.d(contextScope, null, null, new CardTransactionHistoryComponent$handleRetryIntent$2(this, str3, null), 3);
                return;
            }
            return;
        }
        if (intent instanceof CardTransactionHistoryIntent.TransactionClickedIntent) {
            BuildersKt.d(contextScope, null, null, new CardTransactionHistoryComponent$handleTransactionClickedIntent$1(this, (CardTransactionHistoryIntent.TransactionClickedIntent) intent, null), 3);
            return;
        }
        if (intent instanceof CardTransactionHistoryIntent.EmailAllTransactionHistoryClickedIntent) {
            AnalyticsContract.DefaultImpls.a(this.p, "chalo card transactions email all clicked", "CardTransactionsViewModel", null, null, false, 28);
            E0(new we(5));
        } else if (intent instanceof CardTransactionHistoryIntent.EmailAllTransactionHistoryDialogDismissed) {
            E0(new we(6));
        } else {
            if (!intent.equals(CardTransactionHistoryIntent.UnsyncedRechargeBannerViewMoreClickedIntent.f6434a)) {
                throw new NoWhenBranchMatchedException();
            }
            BuildersKt.d(contextScope, null, null, new CardTransactionHistoryComponent$handleRechargeBannerViewMoreClickedIntent$1(this, null), 3);
        }
    }

    public final void J0(String str, boolean z, boolean z2) {
        String str2 = this.x;
        if (str2 == null) {
            str2 = "";
        }
        AnalyticsContract.DefaultImpls.a(this.p, "chalo card transactions fetch result", "CardTransactionsViewModel", MapsKt.i(new Pair("cardNumber", str2), new Pair("isSuccessful", Boolean.valueOf(z)), new Pair("errorMessage", str), new Pair("isRefreshResult", Boolean.valueOf(z2))), null, false, 24);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (CardTransactionHistoryViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        if (this.C == null) {
            this.C = (CardTransactionHistoryViewState) this.f5983a.getB().a("CardTransactionStateKeeperKey", CardTransactionHistoryViewState.INSTANCE.serializer());
        }
        CardTransactionHistoryViewState cardTransactionHistoryViewState = this.C;
        return cardTransactionHistoryViewState == null ? new CardTransactionHistoryViewState() : cardTransactionHistoryViewState;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new CardTransactionHistoryViewState();
    }
}
