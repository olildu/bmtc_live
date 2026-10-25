package app.chalo.core.navigation.wallet;

import app.chalo.core.component.AppComponentFactory;
import app.chalo.navigation.child.ChildComponent;
import app.chalo.navigation.parent.DefaultParentComponent;
import app.chalo.navigation.parent.ParentComponent;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.scenes.args.WalletAllTransactionsArgs;
import app.chalo.scenes.args.WalletBalanceArgs;
import app.chalo.scenes.args.WalletLoadBalanceSuccessArgs;
import app.chalo.scenes.args.WalletLoadMoneyArgs;
import app.chalo.scenes.args.WalletSceneArgs;
import app.chalo.scenes.args.WalletTransactionSummaryArgs;
import app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountComponent;
import app.chalo.wallet.ui.loadbalancesuccess.WalletLoadBalanceSuccessComponent;
import app.chalo.wallet.ui.mainbalance.WalletBalanceComponent;
import app.chalo.wallet.ui.transactionsummary.WalletTransactionSummaryComponent;
import com.arkivanov.decompose.ComponentContext;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/core/navigation/wallet/WalletParentComponent;", "Lapp/chalo/navigation/parent/ParentComponent;", "Lapp/chalo/scenes/args/WalletSceneArgs;", "Lapp/chalo/core/navigation/wallet/WalletParentComponent$WalletChild;", "Lapp/chalo/navigation/parent/DefaultParentComponent;", "WalletChild", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletParentComponent extends DefaultParentComponent<WalletSceneArgs, WalletChild> implements ParentComponent<WalletSceneArgs, WalletChild> {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/core/navigation/wallet/WalletParentComponent$WalletChild;", "Lapp/chalo/navigation/child/ChildComponent;", "WalletBalance", "WalletAllTransactions", "WalletTransactionSummary", "WalletLoadMoney", "WalletLoadBalanceSuccess", "Lapp/chalo/core/navigation/wallet/WalletParentComponent$WalletChild$WalletAllTransactions;", "Lapp/chalo/core/navigation/wallet/WalletParentComponent$WalletChild$WalletBalance;", "Lapp/chalo/core/navigation/wallet/WalletParentComponent$WalletChild$WalletLoadBalanceSuccess;", "Lapp/chalo/core/navigation/wallet/WalletParentComponent$WalletChild$WalletLoadMoney;", "Lapp/chalo/core/navigation/wallet/WalletParentComponent$WalletChild$WalletTransactionSummary;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class WalletChild implements ChildComponent {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/wallet/WalletParentComponent$WalletChild$WalletAllTransactions;", "Lapp/chalo/core/navigation/wallet/WalletParentComponent$WalletChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class WalletAllTransactions extends WalletChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WalletAllTransactionsComponent f2293a;

            public WalletAllTransactions(WalletAllTransactionsComponent walletAllTransactionsComponent) {
                this.f2293a = walletAllTransactionsComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2293a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WalletAllTransactions) && Intrinsics.d(this.f2293a, ((WalletAllTransactions) obj).f2293a);
            }

            public final int hashCode() {
                return this.f2293a.hashCode();
            }

            public final String toString() {
                return "WalletAllTransactions(component=" + this.f2293a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/wallet/WalletParentComponent$WalletChild$WalletBalance;", "Lapp/chalo/core/navigation/wallet/WalletParentComponent$WalletChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class WalletBalance extends WalletChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WalletBalanceComponent f2294a;

            public WalletBalance(WalletBalanceComponent walletBalanceComponent) {
                this.f2294a = walletBalanceComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2294a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WalletBalance) && Intrinsics.d(this.f2294a, ((WalletBalance) obj).f2294a);
            }

            public final int hashCode() {
                return this.f2294a.hashCode();
            }

            public final String toString() {
                return "WalletBalance(component=" + this.f2294a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/wallet/WalletParentComponent$WalletChild$WalletLoadBalanceSuccess;", "Lapp/chalo/core/navigation/wallet/WalletParentComponent$WalletChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class WalletLoadBalanceSuccess extends WalletChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WalletLoadBalanceSuccessComponent f2295a;

            public WalletLoadBalanceSuccess(WalletLoadBalanceSuccessComponent walletLoadBalanceSuccessComponent) {
                this.f2295a = walletLoadBalanceSuccessComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2295a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WalletLoadBalanceSuccess) && Intrinsics.d(this.f2295a, ((WalletLoadBalanceSuccess) obj).f2295a);
            }

            public final int hashCode() {
                return this.f2295a.hashCode();
            }

            public final String toString() {
                return "WalletLoadBalanceSuccess(component=" + this.f2295a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/wallet/WalletParentComponent$WalletChild$WalletLoadMoney;", "Lapp/chalo/core/navigation/wallet/WalletParentComponent$WalletChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class WalletLoadMoney extends WalletChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WalletLoadBalanceEnterAmountComponent f2296a;

            public WalletLoadMoney(WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent) {
                this.f2296a = walletLoadBalanceEnterAmountComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2296a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WalletLoadMoney) && Intrinsics.d(this.f2296a, ((WalletLoadMoney) obj).f2296a);
            }

            public final int hashCode() {
                return this.f2296a.hashCode();
            }

            public final String toString() {
                return "WalletLoadMoney(component=" + this.f2296a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/wallet/WalletParentComponent$WalletChild$WalletTransactionSummary;", "Lapp/chalo/core/navigation/wallet/WalletParentComponent$WalletChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class WalletTransactionSummary extends WalletChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WalletTransactionSummaryComponent f2297a;

            public WalletTransactionSummary(WalletTransactionSummaryComponent walletTransactionSummaryComponent) {
                this.f2297a = walletTransactionSummaryComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2297a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WalletTransactionSummary) && Intrinsics.d(this.f2297a, ((WalletTransactionSummary) obj).f2297a);
            }

            public final int hashCode() {
                return this.f2297a.hashCode();
            }

            public final String toString() {
                return "WalletTransactionSummary(component=" + this.f2297a + ")";
            }
        }
    }

    @Override // app.chalo.navigation.parent.DefaultParentComponent, app.chalo.navigation.parent.ParentComponent
    public final boolean Y(SceneArgs args) {
        Intrinsics.i(args, "args");
        return args instanceof WalletSceneArgs;
    }

    @Override // app.chalo.navigation.parent.DefaultParentComponent
    public final KSerializer a() {
        return WalletSceneArgs.INSTANCE.serializer();
    }

    @Override // app.chalo.navigation.parent.DefaultParentComponent
    public final ChildComponent m(SceneArgs sceneArgs, ComponentContext componentContext) {
        WalletSceneArgs args = (WalletSceneArgs) sceneArgs;
        Intrinsics.i(args, "args");
        Intrinsics.i(componentContext, "componentContext");
        boolean z = args instanceof WalletBalanceArgs;
        AppComponentFactory appComponentFactory = AppComponentFactory.f2029a;
        if (z) {
            return new WalletChild.WalletBalance((WalletBalanceComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[0], 0)));
        }
        if (args instanceof WalletAllTransactionsArgs) {
            return new WalletChild.WalletAllTransactions((WalletAllTransactionsComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[0], 0)));
        }
        if (args instanceof WalletTransactionSummaryArgs) {
            return new WalletChild.WalletTransactionSummary((WalletTransactionSummaryComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[0], 0)));
        }
        if (args instanceof WalletLoadMoneyArgs) {
            return new WalletChild.WalletLoadMoney((WalletLoadBalanceEnterAmountComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[0], 0)));
        }
        if (args instanceof WalletLoadBalanceSuccessArgs) {
            return new WalletChild.WalletLoadBalanceSuccess((WalletLoadBalanceSuccessComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[0], 0)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
