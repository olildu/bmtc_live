package app.chalo.wallet.ui.transactionsummary;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.contract.NavigationContract;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.WalletTransactionSummaryArgs;
import app.chalo.wallet.data.mapper.WalletTransactionQuickPayLoadMoneyStatusMapperKt;
import app.chalo.wallet.domain.GetWalletTransactionSummaryUseCase;
import app.chalo.wallet.ui.transactionsummary.model.WalletTransactionSummaryNavigationModel;
import app.chalo.wallet.ui.transactionsummary.model.WalletTransactionSummaryUiModel;
import app.chalo.walletframework.quickpay.data.model.QuickPayOrderStatus;
import app.chalo.walletframework.wallet.data.model.WalletTransactionType;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import com.arkivanov.decompose.ComponentContext;
import defpackage.jp1;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/wallet/ui/transactionsummary/WalletTransactionSummaryComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/wallet/ui/transactionsummary/WalletTransactionSummaryIntent;", "Lapp/chalo/wallet/ui/transactionsummary/WalletTransactionSummaryState;", "Lapp/chalo/wallet/ui/transactionsummary/WalletTransactionSummaryDataState;", "Lapp/chalo/wallet/ui/transactionsummary/WalletTransactionSummarySideEffects;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletTransactionSummaryComponent extends ChaloBaseStateMviComponent<WalletTransactionSummaryIntent, WalletTransactionSummaryState, WalletTransactionSummaryState, WalletTransactionSummarySideEffects> {
    public final WalletTransactionSummaryArgs k;
    public final GetWalletTransactionSummaryUseCase l;
    public final AnalyticsContract m;
    public final StringProvider n;
    public final GetWalletSetupConfigurationUseCase o;
    public final ChaloNavigationManager p;
    public final UserProfileDetailsProvider q;
    public final NavigationContract r;
    public final KotlinToastManager s;
    public final WalletResolver t;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10891a;

        static {
            int[] iArr = new int[WalletTransactionType.values().length];
            try {
                iArr[WalletTransactionType.QUICK_PAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f10891a = iArr;
        }
    }

    public WalletTransactionSummaryComponent(ComponentContext componentContext, WalletTransactionSummaryArgs walletTransactionSummaryArgs, GetWalletTransactionSummaryUseCase getWalletTransactionSummaryUseCase, AnalyticsContract analyticsContract, StringProvider stringProvider, GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase, ChaloNavigationManager chaloNavigationManager, UserProfileDetailsProvider userProfileDetailsProvider, NavigationContract navigationContract, KotlinToastManager kotlinToastManager, WalletResolver walletResolver) {
        WalletTransactionType next;
        super(componentContext);
        this.k = walletTransactionSummaryArgs;
        this.l = getWalletTransactionSummaryUseCase;
        this.m = analyticsContract;
        this.n = stringProvider;
        this.o = getWalletSetupConfigurationUseCase;
        this.p = chaloNavigationManager;
        this.q = userProfileDetailsProvider;
        this.r = navigationContract;
        this.s = kotlinToastManager;
        this.t = walletResolver;
        AnalyticsContract.DefaultImpls.a(analyticsContract, "wallet transaction summary fragment opened", Source.WALLET_TRANSACTION_SUMMARY.getSourceName(), null, null, false, 28);
        WalletTransactionType.Companion companion = WalletTransactionType.INSTANCE;
        String str = walletTransactionSummaryArgs.e;
        companion.getClass();
        Intrinsics.i(str, "str");
        Iterator<WalletTransactionType> it = WalletTransactionType.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(next.name(), str));
        WalletTransactionType walletTransactionType = next;
        String strM = this.q.m();
        if (strM == null || walletTransactionType == null) {
            q0(new jp1(this, 0));
        } else {
            WalletTransactionSummaryArgs walletTransactionSummaryArgs2 = this.k;
            G0(new WalletTransactionSummaryIntent.LoadTransactionDetailsAndReclaimDuration(strM, new WalletTransactionSummaryNavigationModel(walletTransactionSummaryArgs2.c, walletTransactionSummaryArgs2.d, walletTransactionType)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object F0(WalletTransactionSummaryComponent walletTransactionSummaryComponent, WalletTransactionType walletTransactionType, WalletTransactionSummaryUiModel walletTransactionSummaryUiModel, ContinuationImpl continuationImpl) {
        WalletTransactionSummaryComponent$shouldShowViewReceipt$1 walletTransactionSummaryComponent$shouldShowViewReceipt$1;
        boolean zD;
        String str;
        walletTransactionSummaryComponent.getClass();
        if (continuationImpl instanceof WalletTransactionSummaryComponent$shouldShowViewReceipt$1) {
            walletTransactionSummaryComponent$shouldShowViewReceipt$1 = (WalletTransactionSummaryComponent$shouldShowViewReceipt$1) continuationImpl;
            int i = walletTransactionSummaryComponent$shouldShowViewReceipt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletTransactionSummaryComponent$shouldShowViewReceipt$1.label = i - Integer.MIN_VALUE;
            } else {
                walletTransactionSummaryComponent$shouldShowViewReceipt$1 = new WalletTransactionSummaryComponent$shouldShowViewReceipt$1(walletTransactionSummaryComponent, continuationImpl);
            }
        } else {
            walletTransactionSummaryComponent$shouldShowViewReceipt$1 = new WalletTransactionSummaryComponent$shouldShowViewReceipt$1(walletTransactionSummaryComponent, continuationImpl);
        }
        Object objA = walletTransactionSummaryComponent$shouldShowViewReceipt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletTransactionSummaryComponent$shouldShowViewReceipt$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            if (WhenMappings.f10891a[walletTransactionType.ordinal()] == 1) {
                String str2 = walletTransactionSummaryUiModel.h;
                QuickPayOrderStatus quickPayOrderStatus = QuickPayOrderStatus.SUCCESS;
                StringProvider stringProvider = walletTransactionSummaryComponent.n;
                walletTransactionSummaryComponent$shouldShowViewReceipt$1.L$0 = str2;
                walletTransactionSummaryComponent$shouldShowViewReceipt$1.label = 1;
                objA = WalletTransactionQuickPayLoadMoneyStatusMapperKt.a(quickPayOrderStatus, stringProvider, walletTransactionSummaryComponent$shouldShowViewReceipt$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = str2;
            } else {
                zD = false;
            }
            return Boolean.valueOf(zD);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) walletTransactionSummaryComponent$shouldShowViewReceipt$1.L$0;
        ResultKt.b(objA);
        zD = Intrinsics.d(str, objA);
        return Boolean.valueOf(zD);
    }

    public final void G0(WalletTransactionSummaryIntent walletTransactionSummaryIntent) {
        C0(walletTransactionSummaryIntent);
        if (walletTransactionSummaryIntent instanceof WalletTransactionSummaryIntent.LoadTransactionDetailsAndReclaimDuration) {
            BuildersKt.d(this.j, null, null, new WalletTransactionSummaryComponent$handleLoadTransactionDetailsAndReclaimDuration$1(this, (WalletTransactionSummaryIntent.LoadTransactionDetailsAndReclaimDuration) walletTransactionSummaryIntent, null), 3);
        } else {
            if (!(walletTransactionSummaryIntent instanceof WalletTransactionSummaryIntent.ViewReceiptClicked)) {
                throw new NoWhenBranchMatchedException();
            }
            String sourceName = Source.WALLET_TRANSACTION_SUMMARY_SCREEN.getSourceName();
            StateFlow stateFlow = this.f;
            NavigationContract.DefaultImpls.b(this.r, sourceName, ((WalletTransactionSummaryState) stateFlow.getValue()).c, ((WalletTransactionSummaryState) stateFlow.getValue()).d, "quickpay", "quickpay", null, 224);
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (WalletTransactionSummaryState) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new WalletTransactionSummaryState("", "", "", "", "", "", "", "", false, false, false, false, IconType.WALLET_TRANSACTION_PENDING, 24L, false);
    }
}
