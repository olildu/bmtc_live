package app.chalo.wallet.ui.alltransactions;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.WalletAllTransactionsArgs;
import app.chalo.scenes.args.WalletTransactionSummaryArgs;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.wallet.ui.model.WalletTransactionUiModel;
import app.chalo.wallet.ui.model.WalletTransactionUiWrapper;
import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.resolver.ResolvedPrimaryWalletResult;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import com.arkivanov.decompose.ComponentContext;
import defpackage.ap1;
import defpackage.do1;
import defpackage.hb0;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsIntent;", "Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsState;", "Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsDataState;", "Lapp/chalo/wallet/ui/alltransactions/WalletAllTransactionsSideEffects;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletAllTransactionsComponent extends ChaloBaseStateMviComponent<WalletAllTransactionsIntent, WalletAllTransactionsState, WalletAllTransactionsState, WalletAllTransactionsSideEffects> {
    public final WalletAllTransactionsArgs k;
    public final WalletRepository l;
    public final StringProvider m;
    public final AnalyticsContract n;
    public final CurrencyFeature o;
    public final TimeUtilsContract p;
    public final GetWalletSetupConfigurationUseCase q;
    public final ChaloNavigationManager r;
    public final WalletResolver s;
    public final UserProfileDetailsProvider t;

    /* JADX INFO: renamed from: app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent$1", f = "WalletAllTransactionsComponent.kt", l = {60}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return WalletAllTransactionsComponent.this.new AnonymousClass1(continuation);
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
                WalletAllTransactionsComponent walletAllTransactionsComponent = WalletAllTransactionsComponent.this;
                this.label = 1;
                if (WalletAllTransactionsComponent.F0(walletAllTransactionsComponent, this) == coroutineSingletons) {
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

    public WalletAllTransactionsComponent(ComponentContext componentContext, WalletAllTransactionsArgs walletAllTransactionsArgs, WalletRepository walletRepository, StringProvider stringProvider, AnalyticsContract analyticsContract, CurrencyFeature currencyFeature, TimeUtilsContract timeUtilsContract, GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase, ChaloNavigationManager chaloNavigationManager, WalletResolver walletResolver, UserProfileDetailsProvider userProfileDetailsProvider) {
        super(componentContext);
        this.k = walletAllTransactionsArgs;
        this.l = walletRepository;
        this.m = stringProvider;
        this.n = analyticsContract;
        this.o = currencyFeature;
        this.p = timeUtilsContract;
        this.q = getWalletSetupConfigurationUseCase;
        this.r = chaloNavigationManager;
        this.s = walletResolver;
        this.t = userProfileDetailsProvider;
        AnalyticsContract.DefaultImpls.a(analyticsContract, "wallet all transaction fragment opened", Source.WALLET_ALL_TRANSACTIONS.getSourceName(), null, null, false, 28);
        BuildersKt.d(this.j, null, null, new AnonymousClass1(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object F0(WalletAllTransactionsComponent walletAllTransactionsComponent, ContinuationImpl continuationImpl) {
        WalletAllTransactionsComponent$initialiseWalletContext$1 walletAllTransactionsComponent$initialiseWalletContext$1;
        WalletAllTransactionsIntent loadAllTransactions;
        UserProfileDetailsProvider userProfileDetailsProvider = walletAllTransactionsComponent.t;
        if (continuationImpl instanceof WalletAllTransactionsComponent$initialiseWalletContext$1) {
            walletAllTransactionsComponent$initialiseWalletContext$1 = (WalletAllTransactionsComponent$initialiseWalletContext$1) continuationImpl;
            int i = walletAllTransactionsComponent$initialiseWalletContext$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletAllTransactionsComponent$initialiseWalletContext$1.label = i - Integer.MIN_VALUE;
            } else {
                walletAllTransactionsComponent$initialiseWalletContext$1 = new WalletAllTransactionsComponent$initialiseWalletContext$1(walletAllTransactionsComponent, continuationImpl);
            }
        } else {
            walletAllTransactionsComponent$initialiseWalletContext$1 = new WalletAllTransactionsComponent$initialiseWalletContext$1(walletAllTransactionsComponent, continuationImpl);
        }
        Object objA = walletAllTransactionsComponent$initialiseWalletContext$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletAllTransactionsComponent$initialiseWalletContext$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            WalletResolver walletResolver = walletAllTransactionsComponent.s;
            walletAllTransactionsComponent$initialiseWalletContext$1.label = 1;
            objA = walletResolver.a(walletAllTransactionsComponent$initialiseWalletContext$1);
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
            ResolvedPrimaryWalletResult.ResolvedWallet resolvedWallet = (ResolvedPrimaryWalletResult.ResolvedWallet) resolvedPrimaryWalletResult;
            WalletTypeIdentifier walletTypeIdentifier = resolvedWallet.f11098a;
            walletAllTransactionsComponent.E0(new hb0(resolvedWallet, 1));
            if (walletAllTransactionsComponent.k.c) {
                String strM = userProfileDetailsProvider.m();
                loadAllTransactions = new WalletAllTransactionsIntent.QuickPayTransactions(strM != null ? strM : "", walletTypeIdentifier);
            } else {
                String strM2 = userProfileDetailsProvider.m();
                loadAllTransactions = new WalletAllTransactionsIntent.LoadAllTransactions(strM2 != null ? strM2 : "", walletTypeIdentifier);
            }
            walletAllTransactionsComponent.H0(loadAllTransactions);
        } else {
            if (!Intrinsics.d(resolvedPrimaryWalletResult, ResolvedPrimaryWalletResult.NoWalletConfigEnabled.f11096a) && !Intrinsics.d(resolvedPrimaryWalletResult, ResolvedPrimaryWalletResult.NotLoggedIn.f11097a)) {
                throw new NoWhenBranchMatchedException();
            }
            walletAllTransactionsComponent.E0(new ap1(walletAllTransactionsComponent, 0));
            ChaloNavigationManagerKt.e(walletAllTransactionsComponent.r, new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), 4);
        }
        return Unit.f17538a;
    }

    public final ArrayList G0(List list) {
        ArrayList arrayList = new ArrayList();
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(new WalletTransactionUiWrapper((WalletTransactionUiModel) it.next(), false, 6));
        }
        arrayList.addAll(arrayList2);
        arrayList.add(new WalletTransactionUiWrapper(null, false, 3));
        if (!((WalletAllTransactionsState) this.f.getValue()).h) {
            arrayList.add(new WalletTransactionUiWrapper(null, false, 4));
        }
        return arrayList;
    }

    public final void H0(WalletAllTransactionsIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof WalletAllTransactionsIntent.QuickPayTransactions;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new WalletAllTransactionsComponent$handleQuickPayTransactions$1(this, (WalletAllTransactionsIntent.QuickPayTransactions) intent, null), 3);
            return;
        }
        if (intent instanceof WalletAllTransactionsIntent.LoadAllTransactions) {
            BuildersKt.d(contextScope, null, null, new WalletAllTransactionsComponent$handleLoadAllTransactions$1(this, (WalletAllTransactionsIntent.LoadAllTransactions) intent, null), 3);
            return;
        }
        if (intent instanceof WalletAllTransactionsIntent.SingleTransactionClicked) {
            WalletTransactionUiModel walletTransactionUiModel = ((WalletAllTransactionsIntent.SingleTransactionClicked) intent).f10821a;
            String sourceName = Source.WALLET_ALL_TRANSACTIONS.getSourceName();
            String str = walletTransactionUiModel.f10884a;
            String str2 = walletTransactionUiModel.c;
            WalletTransactionType walletTransactionType = walletTransactionUiModel.h;
            AnalyticsContract.DefaultImpls.a(this.n, "wallet all transaction event clicked", sourceName, MapsKt.i(new Pair("clicked transaction id", String.valueOf(str)), new Pair("wallet balance transaction title", walletTransactionUiModel.b), new Pair("wallet balance transaction date", walletTransactionUiModel.f), new Pair("wallet balance transaction type", walletTransactionType.name()), new Pair("wallet balance transaction status", walletTransactionUiModel.e), new Pair("wallet balance orderId", str2), new Pair("wallet balance transaction amount", walletTransactionUiModel.d), new Pair("wallet balance time long", Long.valueOf(walletTransactionUiModel.g))), null, false, 24);
            this.r.b(new ChaloNavigationRequest.Navigate(new WalletTransactionSummaryArgs(walletTransactionUiModel.f10884a, str2, walletTransactionType.name()), null, null, 6));
            return;
        }
        if (intent.equals(WalletAllTransactionsIntent.RequestHistoryButtonClicked.f10820a)) {
            AnalyticsContractImplKt.b(this.n, "wallet allTxn request history clicked", Source.WALLET_ALL_TRANSACTIONS, null, false, 28);
            E0(new do1(11));
        } else {
            if (!intent.equals(WalletAllTransactionsIntent.ContactSupportDialogOkayClicked.f10817a)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new do1(10));
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (WalletAllTransactionsState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        EmptyList emptyList = EmptyList.f17557a;
        return new WalletAllTransactionsState(emptyList, emptyList, true, false, false, null, false, true);
    }
}
