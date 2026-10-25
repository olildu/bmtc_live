package app.chalo.quickpay.ui.tripamount;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.ResolveSupportPolicyUseCase;
import app.chalo.constants.Source;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.helper.UrlOpenHelper;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountDataState;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountIntent;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountScreenBottomSheetType;
import app.chalo.quickpay.partialchangehandler.tripamount.QuickpayTripAmountSideEffect;
import app.chalo.quickpay.partialchangehandler.tripamount.TripAmountState;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.TicketPurchaseArgs;
import app.chalo.wallet.domain.ValidateQuickPayAmountUseCase;
import app.chalo.wallet.domain.ValidateQuickPayUseCase;
import app.chalo.wallet.ui.access.ProductFlow;
import app.chalo.wallet.ui.access.WalletAccessIntent;
import app.chalo.wallet.ui.base.WalletBaseComponent;
import app.chalo.walletframework.quickpay.domain.GetQuickPayDisclaimerTextUseCase;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.domain.FetchWalletBalanceUseCase;
import app.chalo.walletframework.wallet.domain.RefreshQuickPayPrerequisitesUseCase;
import app.chalo.walletframework.wallet.domain.SatisfiesQuickPayPrerequisitesUseCase;
import app.chalo.walletframework.wallet.domain.resolver.ResolvedPrimaryWalletResult;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import com.arkivanov.decompose.ComponentContext;
import defpackage.d01;
import defpackage.kz0;
import defpackage.p71;
import defpackage.vw0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/quickpay/ui/tripamount/QuickpayTripAmountComponent;", "Lapp/chalo/wallet/ui/base/WalletBaseComponent;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountDataState;", "Lapp/chalo/quickpay/ui/tripamount/QuickPayTripAmountUIState;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountSideEffect;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickpayTripAmountComponent extends WalletBaseComponent<QuickpayTripAmountIntent, QuickpayTripAmountDataState, QuickPayTripAmountUIState, QuickpayTripAmountSideEffect> {
    public final QuickPayBottomSheetHelper A;
    public final UrlOpenHelper B;
    public final GetWalletSetupConfigurationUseCase C;
    public final QuickpayTripAmountUIStateFactory D;
    public final WalletResolver E;
    public final KotlinToastManager F;
    public final StringProvider G;
    public final ResolveSupportPolicyUseCase H;
    public boolean I;
    public final TicketPurchaseArgs.QuickPayArgs p;
    public final ValidateQuickPayUseCase q;
    public final ValidateQuickPayAmountUseCase r;
    public final SatisfiesQuickPayPrerequisitesUseCase s;
    public final RefreshQuickPayPrerequisitesUseCase t;
    public final AnalyticsContract u;
    public final UserProfileDetailsProvider v;
    public final GetQuickPayDisclaimerTextUseCase w;
    public final FetchWalletBalanceUseCase x;
    public final CurrencyFeature y;
    public final ChaloNavigationManager z;

    /* JADX INFO: renamed from: app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent$1", f = "QuickpayTripAmountComponent.kt", l = {87}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return QuickpayTripAmountComponent.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                final QuickpayTripAmountComponent quickpayTripAmountComponent = QuickpayTripAmountComponent.this;
                StateFlow stateFlow = quickpayTripAmountComponent.A.e;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        quickpayTripAmountComponent.E0(new vw0((QuickpayTripAmountScreenBottomSheetType) obj2, 14));
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (stateFlow.collect(flowCollector, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent$2", f = "QuickpayTripAmountComponent.kt", l = {95}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return QuickpayTripAmountComponent.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                QuickpayTripAmountComponent quickpayTripAmountComponent = QuickpayTripAmountComponent.this;
                this.label = 1;
                if (QuickpayTripAmountComponent.H0(quickpayTripAmountComponent, this) == coroutineSingletons) {
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

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8901a;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.WALLET_BALANCE_COMPONENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.WALLET_LOAD_BALANCE_ENTER_AMOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8901a = iArr;
        }
    }

    public QuickpayTripAmountComponent(TicketPurchaseArgs.QuickPayArgs quickPayArgs, ComponentContext componentContext, p71 p71Var, ValidateQuickPayUseCase validateQuickPayUseCase, ValidateQuickPayAmountUseCase validateQuickPayAmountUseCase, SatisfiesQuickPayPrerequisitesUseCase satisfiesQuickPayPrerequisitesUseCase, RefreshQuickPayPrerequisitesUseCase refreshQuickPayPrerequisitesUseCase, AnalyticsContract analyticsContract, UserProfileDetailsProvider userProfileDetailsProvider, GetQuickPayDisclaimerTextUseCase getQuickPayDisclaimerTextUseCase, FetchWalletBalanceUseCase fetchWalletBalanceUseCase, CurrencyFeature currencyFeature, ChaloNavigationManager chaloNavigationManager, QuickPayBottomSheetHelper quickPayBottomSheetHelper, UrlOpenHelper urlOpenHelper, GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase, QuickpayTripAmountUIStateFactory quickpayTripAmountUIStateFactory, WalletResolver walletResolver, KotlinToastManager kotlinToastManager, StringProvider stringProvider, ResolveSupportPolicyUseCase resolveSupportPolicyUseCase) {
        super(componentContext, p71Var);
        this.p = quickPayArgs;
        this.q = validateQuickPayUseCase;
        this.r = validateQuickPayAmountUseCase;
        this.s = satisfiesQuickPayPrerequisitesUseCase;
        this.t = refreshQuickPayPrerequisitesUseCase;
        this.u = analyticsContract;
        this.v = userProfileDetailsProvider;
        this.w = getQuickPayDisclaimerTextUseCase;
        this.x = fetchWalletBalanceUseCase;
        this.y = currencyFeature;
        this.z = chaloNavigationManager;
        this.A = quickPayBottomSheetHelper;
        this.B = urlOpenHelper;
        this.C = getWalletSetupConfigurationUseCase;
        this.D = quickpayTripAmountUIStateFactory;
        this.E = walletResolver;
        this.F = kotlinToastManager;
        this.G = stringProvider;
        this.H = resolveSupportPolicyUseCase;
        D0(new AnonymousClass1(null));
        BuildersKt.d(this.j, null, null, new AnonymousClass2(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object H0(QuickpayTripAmountComponent quickpayTripAmountComponent, ContinuationImpl continuationImpl) {
        QuickpayTripAmountComponent$initialiseWalletContext$1 quickpayTripAmountComponent$initialiseWalletContext$1;
        quickpayTripAmountComponent.getClass();
        if (continuationImpl instanceof QuickpayTripAmountComponent$initialiseWalletContext$1) {
            quickpayTripAmountComponent$initialiseWalletContext$1 = (QuickpayTripAmountComponent$initialiseWalletContext$1) continuationImpl;
            int i = quickpayTripAmountComponent$initialiseWalletContext$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickpayTripAmountComponent$initialiseWalletContext$1.label = i - Integer.MIN_VALUE;
            } else {
                quickpayTripAmountComponent$initialiseWalletContext$1 = new QuickpayTripAmountComponent$initialiseWalletContext$1(quickpayTripAmountComponent, continuationImpl);
            }
        } else {
            quickpayTripAmountComponent$initialiseWalletContext$1 = new QuickpayTripAmountComponent$initialiseWalletContext$1(quickpayTripAmountComponent, continuationImpl);
        }
        Object objI0 = quickpayTripAmountComponent$initialiseWalletContext$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickpayTripAmountComponent$initialiseWalletContext$1.label;
        if (i2 == 0) {
            ResultKt.b(objI0);
            quickpayTripAmountComponent$initialiseWalletContext$1.label = 1;
            objI0 = quickpayTripAmountComponent.I0(quickpayTripAmountComponent$initialiseWalletContext$1);
            if (objI0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objI0);
        }
        WalletTypeIdentifier walletTypeIdentifier = (WalletTypeIdentifier) objI0;
        if (walletTypeIdentifier == null) {
            quickpayTripAmountComponent.E0(new kz0(28));
        } else {
            quickpayTripAmountComponent.G0(new WalletAccessIntent.InitialisationIntent(ProductFlow.QUICK_PAY, false, walletTypeIdentifier));
            TicketPurchaseArgs.QuickPayArgs quickPayArgs = quickpayTripAmountComponent.p;
            quickpayTripAmountComponent.J0(new QuickpayTripAmountIntent.ViewCreatedIntent(quickPayArgs.c, quickPayArgs.e, quickPayArgs.d, walletTypeIdentifier));
        }
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I0(ContinuationImpl continuationImpl) {
        QuickpayTripAmountComponent$identifyWalletIdentifier$1 quickpayTripAmountComponent$identifyWalletIdentifier$1;
        if (continuationImpl instanceof QuickpayTripAmountComponent$identifyWalletIdentifier$1) {
            quickpayTripAmountComponent$identifyWalletIdentifier$1 = (QuickpayTripAmountComponent$identifyWalletIdentifier$1) continuationImpl;
            int i = quickpayTripAmountComponent$identifyWalletIdentifier$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickpayTripAmountComponent$identifyWalletIdentifier$1.label = i - Integer.MIN_VALUE;
            } else {
                quickpayTripAmountComponent$identifyWalletIdentifier$1 = new QuickpayTripAmountComponent$identifyWalletIdentifier$1(this, continuationImpl);
            }
        } else {
            quickpayTripAmountComponent$identifyWalletIdentifier$1 = new QuickpayTripAmountComponent$identifyWalletIdentifier$1(this, continuationImpl);
        }
        Object objA = quickpayTripAmountComponent$identifyWalletIdentifier$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickpayTripAmountComponent$identifyWalletIdentifier$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            quickpayTripAmountComponent$identifyWalletIdentifier$1.label = 1;
            objA = this.E.a(quickpayTripAmountComponent$identifyWalletIdentifier$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        ResolvedPrimaryWalletResult resolvedPrimaryWalletResult = (ResolvedPrimaryWalletResult) objA;
        if (resolvedPrimaryWalletResult instanceof ResolvedPrimaryWalletResult.ResolvedWallet) {
            return ((ResolvedPrimaryWalletResult.ResolvedWallet) resolvedPrimaryWalletResult).f11098a;
        }
        if (Intrinsics.d(resolvedPrimaryWalletResult, ResolvedPrimaryWalletResult.NoWalletConfigEnabled.f11096a) || Intrinsics.d(resolvedPrimaryWalletResult, ResolvedPrimaryWalletResult.NotLoggedIn.f11097a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void J0(QuickpayTripAmountIntent intent) {
        Object value;
        Intrinsics.i(intent, "intent");
        boolean z = intent instanceof QuickpayTripAmountIntent.ViewCreatedIntent;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new QuickpayTripAmountComponent$handleViewCreatedIntent$1(this, (QuickpayTripAmountIntent.ViewCreatedIntent) intent, null), 3);
            return;
        }
        if (intent instanceof QuickpayTripAmountIntent.ValidateIntent) {
            BuildersKt.d(contextScope, null, null, new QuickpayTripAmountComponent$handleValidateIntent$1(this, (QuickpayTripAmountIntent.ValidateIntent) intent, null), 3);
            return;
        }
        if (intent instanceof QuickpayTripAmountIntent.PrerequisitesIntent) {
            BuildersKt.d(contextScope, null, null, new QuickpayTripAmountComponent$handlePrerequisitesIntent$1(this, null), 3);
            return;
        }
        if (intent instanceof QuickpayTripAmountIntent.NextIntent) {
            BuildersKt.d(contextScope, null, null, new QuickpayTripAmountComponent$handleNextIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(QuickpayTripAmountIntent.QuickPayHistoryClickedIntent.f8880a)) {
            AnalyticsContractImplKt.b(this.u, "chalo pay trip amount fragment chalo pay history clicked", Source.CHALO_PAY_PAGE, null, false, 28);
            if (!((Boolean) this.v.getG().getValue()).booleanValue()) {
                q0(new d01(this, 0));
                return;
            } else {
                E0(new kz0(27));
                q0(new d01(this, 1));
                return;
            }
        }
        if (intent.equals(QuickpayTripAmountIntent.NavigateToWalletBalanceIntent.f8873a)) {
            AnalyticsContractImplKt.b(this.u, "chalo pay card clicked", Source.QUICK_PAY_TRIP_AMOUNT_SCREEN_LEGACY, null, false, 28);
            E0(new kz0(29));
            q0(new d01(this, 2));
            return;
        }
        if (intent instanceof QuickpayTripAmountIntent.QuickPayBottomSheetPayClickedIntent) {
            BuildersKt.d(contextScope, null, null, new QuickpayTripAmountComponent$handleQuickPayBottomSheetPayClickedIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(QuickpayTripAmountIntent.OpenTncLinkIntent.f8877a)) {
            String str = ((QuickpayTripAmountDataState) this.f.getValue()).j;
            if (StringsKt.F(str)) {
                return;
            }
            this.B.a(str, null);
            return;
        }
        if (intent.equals(QuickpayTripAmountIntent.OnStartIntent.f8876a)) {
            BuildersKt.d(contextScope, null, null, new QuickpayTripAmountComponent$handleOnStartIntent$1(this, null), 3);
            return;
        }
        if (!intent.equals(QuickpayTripAmountIntent.OnBottomSheetDismissIntent.f8875a)) {
            throw new NoWhenBranchMatchedException();
        }
        this.I = false;
        MutableStateFlow mutableStateFlow = this.A.d;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, null));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        QuickpayTripAmountComponent$convertToUiState$2 quickpayTripAmountComponent$convertToUiState$2 = new QuickpayTripAmountComponent$convertToUiState$2(1, this, QuickpayTripAmountComponent.class, "processIntent", "processIntent(Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountIntent;)V", 0);
        return this.D.b((QuickpayTripAmountDataState) obj, quickpayTripAmountComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new QuickpayTripAmountDataState(TripAmountState.NO_AMOUNT_ENTERED, null, null, -1L, true, false, null, -1L, true, "");
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void y0() {
        J0(QuickpayTripAmountIntent.OnStartIntent.f8876a);
    }
}
