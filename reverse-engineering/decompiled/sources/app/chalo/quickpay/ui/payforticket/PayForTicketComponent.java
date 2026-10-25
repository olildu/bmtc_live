package app.chalo.quickpay.ui.payforticket;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.domain.GetClusterConfigForCityUseCase;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.domain.TicketPurchaseSceneResolverUseCase;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.TicketPurchaseArgs;
import app.chalo.scenes.args.WalletBalanceArgs;
import app.chalo.walletframework.wallet.domain.FetchWalletBalanceUseCase;
import app.chalo.walletframework.wallet.domain.resolver.ResolvedPrimaryWalletResult;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import com.arkivanov.decompose.ComponentContext;
import defpackage.do0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/quickpay/ui/payforticket/PayForTicketComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/quickpay/ui/payforticket/PayForTicketIntent;", "Lapp/chalo/quickpay/ui/payforticket/PayForTicketViewState;", "Lapp/chalo/quickpay/ui/payforticket/PayForTicketDataState;", "Lapp/chalo/quickpay/ui/payforticket/PayForTicketSideEffect;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PayForTicketComponent extends ChaloBaseStateMviComponent<PayForTicketIntent, PayForTicketViewState, PayForTicketViewState, PayForTicketSideEffect> {
    public final TicketPurchaseArgs.PayForTicketArgs k;
    public final GetWalletSetupConfigurationUseCase l;
    public final FetchWalletBalanceUseCase m;
    public final AnalyticsContract n;
    public final ChaloNavigationManager o;
    public final TicketPurchaseSceneResolverUseCase p;
    public final CurrencyFeature q;
    public final CityProvider r;
    public final GetClusterConfigForCityUseCase s;
    public final WalletResolver t;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8885a;

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
            f8885a = iArr;
        }
    }

    public PayForTicketComponent(ComponentContext componentContext, TicketPurchaseArgs.PayForTicketArgs payForTicketArgs, GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase, FetchWalletBalanceUseCase fetchWalletBalanceUseCase, AnalyticsContract analyticsContract, ChaloNavigationManager chaloNavigationManager, TicketPurchaseSceneResolverUseCase ticketPurchaseSceneResolverUseCase, CurrencyFeature currencyFeature, CityProvider cityProvider, GetClusterConfigForCityUseCase getClusterConfigForCityUseCase, WalletResolver walletResolver) {
        super(componentContext);
        this.k = payForTicketArgs;
        this.l = getWalletSetupConfigurationUseCase;
        this.m = fetchWalletBalanceUseCase;
        this.n = analyticsContract;
        this.o = chaloNavigationManager;
        this.p = ticketPurchaseSceneResolverUseCase;
        this.q = currencyFeature;
        this.r = cityProvider;
        this.s = getClusterConfigForCityUseCase;
        this.t = walletResolver;
        G0(new PayForTicketIntent.InitialIntent(payForTicketArgs.d));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object F0(PayForTicketComponent payForTicketComponent, ContinuationImpl continuationImpl) {
        PayForTicketComponent$resolvePrimaryWalletTypeIdentifier$1 payForTicketComponent$resolvePrimaryWalletTypeIdentifier$1;
        payForTicketComponent.getClass();
        if (continuationImpl instanceof PayForTicketComponent$resolvePrimaryWalletTypeIdentifier$1) {
            payForTicketComponent$resolvePrimaryWalletTypeIdentifier$1 = (PayForTicketComponent$resolvePrimaryWalletTypeIdentifier$1) continuationImpl;
            int i = payForTicketComponent$resolvePrimaryWalletTypeIdentifier$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                payForTicketComponent$resolvePrimaryWalletTypeIdentifier$1.label = i - Integer.MIN_VALUE;
            } else {
                payForTicketComponent$resolvePrimaryWalletTypeIdentifier$1 = new PayForTicketComponent$resolvePrimaryWalletTypeIdentifier$1(payForTicketComponent, continuationImpl);
            }
        } else {
            payForTicketComponent$resolvePrimaryWalletTypeIdentifier$1 = new PayForTicketComponent$resolvePrimaryWalletTypeIdentifier$1(payForTicketComponent, continuationImpl);
        }
        Object objA = payForTicketComponent$resolvePrimaryWalletTypeIdentifier$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = payForTicketComponent$resolvePrimaryWalletTypeIdentifier$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            WalletResolver walletResolver = payForTicketComponent.t;
            payForTicketComponent$resolvePrimaryWalletTypeIdentifier$1.label = 1;
            objA = walletResolver.a(payForTicketComponent$resolvePrimaryWalletTypeIdentifier$1);
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

    public final void G0(PayForTicketIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof PayForTicketIntent.InitialIntent;
        ContextScope contextScope = this.j;
        if (z) {
            E0(new do0(25));
            BuildersKt.d(contextScope, null, null, new PayForTicketComponent$handleInitializationIntent$2(this, (PayForTicketIntent.InitialIntent) intent, null), 3);
            return;
        }
        boolean zEquals = intent.equals(PayForTicketIntent.NavigateToQuickPayIntent.f8887a);
        TicketPurchaseArgs.PayForTicketArgs payForTicketArgs = this.k;
        ChaloNavigationManager chaloNavigationManager = this.o;
        if (zEquals) {
            AnalyticsContractImplKt.b(this.n, "chalo pay card clicked", Source.PAY_FOR_TICKET_SCREEN, MapsKt.d(), false, 8);
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new TicketPurchaseArgs.QuickPayArgs(payForTicketArgs.c), null, null, 6));
        } else if (intent.equals(PayForTicketIntent.NavigateToTicketBookingIntent.f8888a)) {
            AnalyticsContractImplKt.b(this.n, "find fare card clicked", Source.PAY_FOR_TICKET_SCREEN, MapsKt.d(), false, 8);
            BuildersKt.d(contextScope, null, null, new PayForTicketComponent$handleNavigateToMTicketBookingIntent$1(this, null), 3);
        } else {
            if (!intent.equals(PayForTicketIntent.NavigateToWalletBalanceIntent.f8889a)) {
                throw new NoWhenBranchMatchedException();
            }
            WalletBalanceArgs walletBalanceArgs = new WalletBalanceArgs();
            Source source = payForTicketArgs.c;
            int i = source == null ? -1 : WhenMappings.f8885a[source.ordinal()];
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(walletBalanceArgs, (i == 1 || i == 2) ? new ChaloNavOptions(new PopUpToConfig.Scene(ChaloScenes.WalletBalance, true), 2) : new ChaloNavOptions(PopUpToConfig.None.f9220a, 2), null, 4));
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (PayForTicketViewState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new PayForTicketViewState("", null, false, false, false);
    }
}
