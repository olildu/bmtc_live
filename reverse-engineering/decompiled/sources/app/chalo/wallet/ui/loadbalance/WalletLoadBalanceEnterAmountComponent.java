package app.chalo.wallet.ui.loadbalance;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.ResultStateKeeperMeta;
import app.chalo.resultstatemanager.ResultStateRecoveredData;
import app.chalo.resultstatemanager.checkout.CheckoutResultState;
import app.chalo.resultstatemanager.checkout.CheckoutResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.WalletLoadMoneyArgs;
import app.chalo.usecase.LoadMoneyAmountValidationUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.wallet.domain.AddProcessingLoadMoneyTransactionsAndSyncWalletUseCase;
import app.chalo.wallet.domain.GetBannerForWalletScreenUseCase;
import app.chalo.wallet.domain.GetLoadMoneyDenominationsUseCase;
import app.chalo.wallet.domain.GetWalletLoadConfigAndPlaceRechargeOrderUseCase;
import app.chalo.wallet.ui.access.ProductFlow;
import app.chalo.wallet.ui.access.WalletAccessIntent;
import app.chalo.wallet.ui.base.WalletBaseComponent;
import app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStore;
import app.chalo.walletframework.wallet.data.model.WalletStatus;
import app.chalo.walletframework.wallet.data.model.WalletStatusKt;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.domain.FetchWalletBalanceUseCase;
import app.chalo.walletframework.wallet.domain.GetValidWalletLoadConfigFromConfigListUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletIdUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletStatusWithoutSyncUseCase;
import app.chalo.walletframework.wallet.domain.WalletStatusWithReclaimTime;
import app.chalo.walletframework.wallet.domain.WalletSyncAttemptFailureReason;
import app.chalo.walletframework.wallet.domain.WalletSyncFailureReason;
import app.chalo.walletframework.wallet.domain.WalletSyncOrchestrator;
import app.chalo.walletframework.wallet.domain.model.WalletLoadBalanceConfigAndRechargeOrderCombined;
import app.chalo.walletframework.wallet.domain.resolver.ResolvedPrimaryWalletResult;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.statekeeper.StateKeeper;
import defpackage.do1;
import defpackage.dp1;
import defpackage.fp1;
import defpackage.mn1;
import defpackage.p71;
import defpackage.va;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountComponent;", "Lapp/chalo/wallet/ui/base/WalletBaseComponent;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountIntent;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountDataState;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountViewState;", "Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountSideEffect;", "Companion", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletLoadBalanceEnterAmountComponent extends WalletBaseComponent<WalletLoadBalanceEnterAmountIntent, WalletLoadBalanceEnterAmountDataState, WalletLoadBalanceEnterAmountViewState, WalletLoadBalanceEnterAmountSideEffect> {
    public final FetchWalletBalanceUseCase A;
    public final CurrencyFeature B;
    public final GetBannerForWalletScreenUseCase C;
    public final ChaloNavigationManager D;
    public final UserProfileDetailsProvider E;
    public final TimeUtilsContract F;
    public final CheckoutResultStateManager G;
    public final WalletResolver H;
    public Job I;
    public Job J;
    public String K;
    public final WalletLoadMoneyArgs p;
    public final GetWalletStatusWithoutSyncUseCase q;
    public final LoadMoneyAmountValidationUseCase r;
    public final GetLoadMoneyDenominationsUseCase s;
    public final GetWalletLoadConfigAndPlaceRechargeOrderUseCase t;
    public final AddProcessingLoadMoneyTransactionsAndSyncWalletUseCase u;
    public final GetWalletIdUseCase v;
    public final WalletSyncOrchestrator w;
    public final WalletDataStore x;
    public final AnalyticsContract y;
    public final StringProvider z;

    /* JADX INFO: renamed from: app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountComponent$1", f = "WalletLoadBalanceEnterAmountComponent.kt", l = {95}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return WalletLoadBalanceEnterAmountComponent.this.new AnonymousClass1(continuation);
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
                WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent = WalletLoadBalanceEnterAmountComponent.this;
                this.label = 1;
                if (WalletLoadBalanceEnterAmountComponent.H0(walletLoadBalanceEnterAmountComponent, this) == coroutineSingletons) {
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/wallet/ui/loadbalance/WalletLoadBalanceEnterAmountComponent$Companion;", "", "", "BANNER_SCROLL_TIME", "J", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10828a;

        static {
            int[] iArr = new int[WalletSyncFailureReason.values().length];
            try {
                iArr[WalletSyncFailureReason.USER_NOT_LOGGED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletSyncFailureReason.KYC_NOT_DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletSyncFailureReason.BLOCKED_FOR_APP_RECLAIM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletSyncFailureReason.CHALO_TIME_NOT_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletSyncFailureReason.API_FETCH_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WalletSyncFailureReason.WALLET_TIMED_OUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f10828a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLoadBalanceEnterAmountComponent(ComponentContext componentContext, WalletLoadMoneyArgs args, p71 p71Var, GetWalletStatusWithoutSyncUseCase getWalletStatusWithoutSyncUseCase, LoadMoneyAmountValidationUseCase loadMoneyAmountValidationUseCase, GetLoadMoneyDenominationsUseCase getLoadMoneyDenominationsUseCase, GetWalletLoadConfigAndPlaceRechargeOrderUseCase getWalletLoadConfigAndPlaceRechargeOrderUseCase, AddProcessingLoadMoneyTransactionsAndSyncWalletUseCase addProcessingLoadMoneyTransactionsAndSyncWalletUseCase, GetWalletIdUseCase getWalletIdUseCase, WalletSyncOrchestrator walletSyncOrchestrator, GetValidWalletLoadConfigFromConfigListUseCase getValidWalletLoadConfigFromConfigListUseCase, WalletDataStore walletDataStore, AnalyticsContract analyticsContract, StringProvider stringProvider, FetchWalletBalanceUseCase fetchWalletBalanceUseCase, CurrencyFeature currencyFeature, GetBannerForWalletScreenUseCase getBannerForWalletScreenUseCase, ChaloNavigationManager chaloNavigationManager, UserProfileDetailsProvider userProfileDetailsProvider, TimeUtilsContract timeUtilsContract, CheckoutResultStateManager checkoutResultStateManager, WalletResolver walletResolver) {
        super(componentContext, p71Var);
        Intrinsics.i(componentContext, "componentContext");
        Intrinsics.i(args, "args");
        this.p = args;
        this.q = getWalletStatusWithoutSyncUseCase;
        this.r = loadMoneyAmountValidationUseCase;
        this.s = getLoadMoneyDenominationsUseCase;
        this.t = getWalletLoadConfigAndPlaceRechargeOrderUseCase;
        this.u = addProcessingLoadMoneyTransactionsAndSyncWalletUseCase;
        this.v = getWalletIdUseCase;
        this.w = walletSyncOrchestrator;
        this.x = walletDataStore;
        this.y = analyticsContract;
        this.z = stringProvider;
        this.A = fetchWalletBalanceUseCase;
        this.B = currencyFeature;
        this.C = getBannerForWalletScreenUseCase;
        this.D = chaloNavigationManager;
        this.E = userProfileDetailsProvider;
        this.F = timeUtilsContract;
        this.G = checkoutResultStateManager;
        this.H = walletResolver;
        BuildersKt.d(this.j, null, null, new AnonymousClass1(null), 3);
        StateKeeper b = componentContext.getB();
        ResultStateKeeperMeta.Companion companion = ResultStateKeeperMeta.INSTANCE;
        ResultStateRecoveredData resultStateRecoveredDataA = checkoutResultStateManager.a("WalletLoadBalance_SK_Key", b, companion.serializer(), companion.serializer(), new fp1(this, 0));
        if (resultStateRecoveredDataA != null) {
            this.J = BuildersKt.d(this.j, null, null, new WalletLoadBalanceEnterAmountComponent$2$1(this, resultStateRecoveredDataA, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object H0(WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent, ContinuationImpl continuationImpl) {
        WalletLoadBalanceEnterAmountComponent$initialiseWalletContext$1 walletLoadBalanceEnterAmountComponent$initialiseWalletContext$1;
        ResolvedPrimaryWalletResult resolvedPrimaryWalletResult;
        walletLoadBalanceEnterAmountComponent.getClass();
        if (continuationImpl instanceof WalletLoadBalanceEnterAmountComponent$initialiseWalletContext$1) {
            walletLoadBalanceEnterAmountComponent$initialiseWalletContext$1 = (WalletLoadBalanceEnterAmountComponent$initialiseWalletContext$1) continuationImpl;
            int i = walletLoadBalanceEnterAmountComponent$initialiseWalletContext$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoadBalanceEnterAmountComponent$initialiseWalletContext$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoadBalanceEnterAmountComponent$initialiseWalletContext$1 = new WalletLoadBalanceEnterAmountComponent$initialiseWalletContext$1(walletLoadBalanceEnterAmountComponent, continuationImpl);
            }
        } else {
            walletLoadBalanceEnterAmountComponent$initialiseWalletContext$1 = new WalletLoadBalanceEnterAmountComponent$initialiseWalletContext$1(walletLoadBalanceEnterAmountComponent, continuationImpl);
        }
        Object objA = walletLoadBalanceEnterAmountComponent$initialiseWalletContext$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletLoadBalanceEnterAmountComponent$initialiseWalletContext$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            WalletResolver walletResolver = walletLoadBalanceEnterAmountComponent.H;
            walletLoadBalanceEnterAmountComponent$initialiseWalletContext$1.label = 1;
            objA = walletResolver.a(walletLoadBalanceEnterAmountComponent$initialiseWalletContext$1);
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            ResultKt.b(objA);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            resolvedPrimaryWalletResult = (ResolvedPrimaryWalletResult) walletLoadBalanceEnterAmountComponent$initialiseWalletContext$1.L$0;
            ResultKt.b(objA);
        }
        walletLoadBalanceEnterAmountComponent.L0(new WalletLoadBalanceEnterAmountIntent.ViewCreated(((ResolvedPrimaryWalletResult.ResolvedWallet) resolvedPrimaryWalletResult).f11098a));
        return Unit.f17538a;
        ResolvedPrimaryWalletResult resolvedPrimaryWalletResult2 = (ResolvedPrimaryWalletResult) objA;
        if (resolvedPrimaryWalletResult2 instanceof ResolvedPrimaryWalletResult.ResolvedWallet) {
            ProductFlow productFlow = ProductFlow.WALLET_BALANCE;
            WalletTypeIdentifier walletTypeIdentifier = ((ResolvedPrimaryWalletResult.ResolvedWallet) resolvedPrimaryWalletResult2).f11098a;
            walletLoadBalanceEnterAmountComponent.G0(new WalletAccessIntent.InitialisationIntent(productFlow, false, walletTypeIdentifier));
            walletLoadBalanceEnterAmountComponent$initialiseWalletContext$1.L$0 = resolvedPrimaryWalletResult2;
            walletLoadBalanceEnterAmountComponent$initialiseWalletContext$1.label = 2;
            if (walletLoadBalanceEnterAmountComponent.M0(walletTypeIdentifier, walletLoadBalanceEnterAmountComponent$initialiseWalletContext$1) != obj) {
                resolvedPrimaryWalletResult = resolvedPrimaryWalletResult2;
                walletLoadBalanceEnterAmountComponent.L0(new WalletLoadBalanceEnterAmountIntent.ViewCreated(((ResolvedPrimaryWalletResult.ResolvedWallet) resolvedPrimaryWalletResult).f11098a));
            }
            return obj;
        }
        if (!Intrinsics.d(resolvedPrimaryWalletResult2, ResolvedPrimaryWalletResult.NoWalletConfigEnabled.f11096a) && !Intrinsics.d(resolvedPrimaryWalletResult2, ResolvedPrimaryWalletResult.NotLoggedIn.f11097a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f17538a;
    }

    public static final void I0(WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent, ResultStateData resultStateData) {
        walletLoadBalanceEnterAmountComponent.K = null;
        if (resultStateData instanceof ResultStateData.Cancelled) {
            return;
        }
        if (!(resultStateData instanceof ResultStateData.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        CheckoutResultState checkoutResultState = (CheckoutResultState) ((ResultStateData.Success) resultStateData).f9039a;
        if (checkoutResultState instanceof CheckoutResultState.Success) {
            walletLoadBalanceEnterAmountComponent.L0(new WalletLoadBalanceEnterAmountIntent.PaymentCompletedIntent(((CheckoutResultState.Success) checkoutResultState).f9055a));
            Job job = walletLoadBalanceEnterAmountComponent.J;
            if (job != null) {
                ((JobSupport) job).cancel(null);
                return;
            }
            return;
        }
        if (!checkoutResultState.equals(CheckoutResultState.Failed.f9054a)) {
            throw new NoWhenBranchMatchedException();
        }
        Job job2 = walletLoadBalanceEnterAmountComponent.J;
        if (job2 != null) {
            ((JobSupport) job2).cancel(null);
        }
    }

    public static final void J0(WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent, String str) {
        AnalyticsContract analyticsContract = walletLoadBalanceEnterAmountComponent.y;
        String strF = Reflection.a(WalletLoadBalanceEnterAmountComponent.class).f();
        if (strF == null) {
            strF = "WalletLoadBalanceEnterAmountComponent";
        }
        AnalyticsContract.DefaultImpls.a(analyticsContract, "load money wallet recharge order success", strF, vo1.s("walletLoadAmount", str), null, false, 24);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object K0(WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent, ContinuationImpl continuationImpl) {
        WalletLoadBalanceEnterAmountComponent$showMissingWalletContextError$1 walletLoadBalanceEnterAmountComponent$showMissingWalletContextError$1;
        walletLoadBalanceEnterAmountComponent.getClass();
        if (continuationImpl instanceof WalletLoadBalanceEnterAmountComponent$showMissingWalletContextError$1) {
            walletLoadBalanceEnterAmountComponent$showMissingWalletContextError$1 = (WalletLoadBalanceEnterAmountComponent$showMissingWalletContextError$1) continuationImpl;
            int i = walletLoadBalanceEnterAmountComponent$showMissingWalletContextError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoadBalanceEnterAmountComponent$showMissingWalletContextError$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoadBalanceEnterAmountComponent$showMissingWalletContextError$1 = new WalletLoadBalanceEnterAmountComponent$showMissingWalletContextError$1(walletLoadBalanceEnterAmountComponent, continuationImpl);
            }
        } else {
            walletLoadBalanceEnterAmountComponent$showMissingWalletContextError$1 = new WalletLoadBalanceEnterAmountComponent$showMissingWalletContextError$1(walletLoadBalanceEnterAmountComponent, continuationImpl);
        }
        Object objB = walletLoadBalanceEnterAmountComponent$showMissingWalletContextError$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletLoadBalanceEnterAmountComponent$showMissingWalletContextError$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            walletLoadBalanceEnterAmountComponent$showMissingWalletContextError$1.label = 1;
            objB = walletLoadBalanceEnterAmountComponent.z.b(StringEnum.TOAST_GENERIC_ERROR_MESSAGE, new Object[0], walletLoadBalanceEnterAmountComponent$showMissingWalletContextError$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        walletLoadBalanceEnterAmountComponent.E0(new mn1((String) objB, 3));
        return Unit.f17538a;
    }

    public final void L0(WalletLoadBalanceEnterAmountIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof WalletLoadBalanceEnterAmountIntent.ViewCreated;
        int i = 21;
        ContextScope contextScope = this.j;
        if (z) {
            WalletTypeIdentifier walletTypeIdentifier = ((WalletLoadBalanceEnterAmountIntent.ViewCreated) intent).f10840a;
            E0(new va(walletTypeIdentifier.d, i));
            BuildersKt.d(contextScope, null, null, new WalletLoadBalanceEnterAmountComponent$handleViewCreated$2(this, walletTypeIdentifier, null), 3);
            return;
        }
        if (intent instanceof WalletLoadBalanceEnterAmountIntent.AmountEnteredIntent) {
            BuildersKt.d(contextScope, null, null, new WalletLoadBalanceEnterAmountComponent$handleAmountEntered$1(this, (WalletLoadBalanceEnterAmountIntent.AmountEnteredIntent) intent, null), 3);
            return;
        }
        boolean z2 = intent instanceof WalletLoadBalanceEnterAmountIntent.NextBtnClickIntent;
        StateFlow stateFlow = this.f;
        if (z2) {
            String str = ((WalletLoadBalanceEnterAmountDataState) stateFlow.getValue()).c;
            if (str == null) {
                return;
            }
            int iB = (int) this.B.b(str);
            String sourceName = Source.WALLET_LOAD_BALANCE_ENTER_AMOUNT.getSourceName();
            Pair pair = new Pair("walletLoadAmount", str);
            List list = ((WalletLoadBalanceEnterAmountDataState) stateFlow.getValue()).e;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((SuggestAmountsDenominations) it.next()).f10826a));
            }
            AnalyticsContract.DefaultImpls.a(this.y, "wallet load balance fragment next button clicked", sourceName, MapsKt.i(pair, new Pair("loadSuggestedAmount", arrayList)), null, false, 24);
            E0(new do1(23));
            BuildersKt.d(contextScope, null, null, new WalletLoadBalanceEnterAmountComponent$handleNextBtnClick$2(this, iB, str, null), 3);
            return;
        }
        if (intent instanceof WalletLoadBalanceEnterAmountIntent.SuggestedDenominationClickedIntent) {
            int i2 = ((WalletLoadBalanceEnterAmountIntent.SuggestedDenominationClickedIntent) intent).f10838a;
            AnalyticsContract.DefaultImpls.a(this.y, "wallet suggested amount clicked", Source.WALLET_LOAD_BALANCE_ENTER_AMOUNT.getSourceName(), vo1.s("wallet suggested amount", String.valueOf(i2)), null, false, 24);
            r0(new WalletLoadBalanceEnterAmountSideEffect.SuggestedDenominationClicked(i2));
            return;
        }
        if (intent instanceof WalletLoadBalanceEnterAmountIntent.TnCAcceptClickIntent) {
            WalletLoadBalanceEnterAmountIntent.TnCAcceptClickIntent tnCAcceptClickIntent = (WalletLoadBalanceEnterAmountIntent.TnCAcceptClickIntent) intent;
            E0(new do1(24));
            WalletLoadBalanceConfigAndRechargeOrderCombined walletLoadBalanceConfigAndRechargeOrderCombined = ((WalletLoadBalanceEnterAmountDataState) stateFlow.getValue()).k;
            if (walletLoadBalanceConfigAndRechargeOrderCombined == null) {
                return;
            }
            BuildersKt.d(contextScope, null, null, new WalletLoadBalanceEnterAmountComponent$handleTnCAccepted$2(this, walletLoadBalanceConfigAndRechargeOrderCombined, tnCAcceptClickIntent, null), 3);
            return;
        }
        if (intent instanceof WalletLoadBalanceEnterAmountIntent.PaymentCompletedIntent) {
            WalletLoadBalanceEnterAmountIntent.PaymentCompletedIntent paymentCompletedIntent = (WalletLoadBalanceEnterAmountIntent.PaymentCompletedIntent) intent;
            E0(new do1(22));
            WalletLoadBalanceConfigAndRechargeOrderCombined walletLoadBalanceConfigAndRechargeOrderCombined2 = ((WalletLoadBalanceEnterAmountDataState) stateFlow.getValue()).k;
            if (walletLoadBalanceConfigAndRechargeOrderCombined2 == null) {
                return;
            }
            BuildersKt.d(contextScope, null, null, new WalletLoadBalanceEnterAmountComponent$handlePaymentCompleted$2(this, walletLoadBalanceConfigAndRechargeOrderCombined2, paymentCompletedIntent, null), 3);
            return;
        }
        if (intent instanceof WalletLoadBalanceEnterAmountIntent.BannerTimerIntent) {
            r0(WalletLoadBalanceEnterAmountSideEffect.ScrollBannerSideEffect.f10847a);
            return;
        }
        if (intent instanceof WalletLoadBalanceEnterAmountIntent.BannerClickedIntent) {
            AnalyticsContract.DefaultImpls.a(this.y, "wallet banner clicked", "WalletLoadMoney", null, null, false, 28);
            BuildersKt.d(contextScope, null, null, new WalletLoadBalanceEnterAmountComponent$handleBannerClicked$1((WalletLoadBalanceEnterAmountIntent.BannerClickedIntent) intent, this, null), 3);
        } else if (intent instanceof WalletLoadBalanceEnterAmountIntent.DismissDialog) {
            E0(new do1(i));
        } else {
            if (!(intent instanceof WalletLoadBalanceEnterAmountIntent.ScrollPromotionBanner)) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = ((WalletLoadBalanceEnterAmountIntent.ScrollPromotionBanner) intent).f10837a;
            if (((WalletLoadBalanceEnterAmountDataState) stateFlow.getValue()).h.size() <= 0) {
                return;
            }
            E0(new dp1(true, i3, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M0(WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        WalletLoadBalanceEnterAmountComponent$raiseRechargeFragmentOpenedEvent$1 walletLoadBalanceEnterAmountComponent$raiseRechargeFragmentOpenedEvent$1;
        WalletStatus walletStatus;
        if (continuationImpl instanceof WalletLoadBalanceEnterAmountComponent$raiseRechargeFragmentOpenedEvent$1) {
            walletLoadBalanceEnterAmountComponent$raiseRechargeFragmentOpenedEvent$1 = (WalletLoadBalanceEnterAmountComponent$raiseRechargeFragmentOpenedEvent$1) continuationImpl;
            int i = walletLoadBalanceEnterAmountComponent$raiseRechargeFragmentOpenedEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletLoadBalanceEnterAmountComponent$raiseRechargeFragmentOpenedEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                walletLoadBalanceEnterAmountComponent$raiseRechargeFragmentOpenedEvent$1 = new WalletLoadBalanceEnterAmountComponent$raiseRechargeFragmentOpenedEvent$1(this, continuationImpl);
            }
        } else {
            walletLoadBalanceEnterAmountComponent$raiseRechargeFragmentOpenedEvent$1 = new WalletLoadBalanceEnterAmountComponent$raiseRechargeFragmentOpenedEvent$1(this, continuationImpl);
        }
        Object objA = walletLoadBalanceEnterAmountComponent$raiseRechargeFragmentOpenedEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletLoadBalanceEnterAmountComponent$raiseRechargeFragmentOpenedEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            walletLoadBalanceEnterAmountComponent$raiseRechargeFragmentOpenedEvent$1.label = 1;
            objA = this.q.a(walletTypeIdentifier, walletLoadBalanceEnterAmountComponent$raiseRechargeFragmentOpenedEvent$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            walletStatus = (WalletStatus) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        } else {
            Intrinsics.g(chaloUseCaseResult, "null cannot be cast to non-null type app.chalo.utils.ChaloUseCaseResult.Failure<app.chalo.walletframework.wallet.data.model.WalletStatus, app.chalo.walletframework.wallet.domain.WalletStatusWithReclaimTime>");
            walletStatus = ((WalletStatusWithReclaimTime) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).f11077a;
        }
        AnalyticsContract.DefaultImpls.a(this.y, "wallet load balance enter amount fragment opened", "unknown", MapsKt.h(new Pair("kycDone", Boolean.valueOf(!WalletStatusKt.a(walletStatus)))), null, false, 24);
        return Unit.f17538a;
    }

    public final void N0(WalletSyncAttemptFailureReason walletSyncAttemptFailureReason) {
        String strF = Reflection.a(WalletLoadBalanceEnterAmountComponent.class).f();
        if (strF == null) {
            strF = "WalletLoadBalanceEnterAmountComponent";
        }
        Map mapS = vo1.s("walletSyncFailureReason", walletSyncAttemptFailureReason.name());
        AnalyticsContract.DefaultImpls.a(this.y, "load money wallet sync failed", strF, mapS, null, false, 24);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        WalletLoadBalanceEnterAmountDataState walletLoadBalanceEnterAmountDataState = (WalletLoadBalanceEnterAmountDataState) obj;
        return new WalletLoadBalanceEnterAmountViewState(walletLoadBalanceEnterAmountDataState.f10830a, walletLoadBalanceEnterAmountDataState.b, walletLoadBalanceEnterAmountDataState.c, walletLoadBalanceEnterAmountDataState.d, walletLoadBalanceEnterAmountDataState.e, walletLoadBalanceEnterAmountDataState.f, walletLoadBalanceEnterAmountDataState.g, walletLoadBalanceEnterAmountDataState.h, walletLoadBalanceEnterAmountDataState.i, walletLoadBalanceEnterAmountDataState.j, walletLoadBalanceEnterAmountDataState.l, walletLoadBalanceEnterAmountDataState.m, !walletLoadBalanceEnterAmountDataState.n);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        EmptyList emptyList = EmptyList.f17557a;
        return new WalletLoadBalanceEnterAmountDataState(false, false, null, null, emptyList, -1L, "", emptyList, null, null, null, "", 0, true);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void x0() {
    }

    @Override // app.chalo.wallet.ui.base.WalletBaseComponent
    public final void F0(boolean z) {
    }
}
