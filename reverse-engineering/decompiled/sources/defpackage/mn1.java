package defpackage;

import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.login.ui.userconsent.UserConsentDataState;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountDataState;
import app.chalo.wallet.ui.loadbalancesuccess.WalletLoadBalanceSuccessViewState;
import app.chalo.wallet.ui.mainbalance.WalletBalanceDataState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mn1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18413a;
    public final /* synthetic */ String b;

    public /* synthetic */ mn1(String str, int i) {
        this.f18413a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18413a) {
            case 0:
                UserConsentDataState it = (UserConsentDataState) obj;
                Intrinsics.i(it, "it");
                return UserConsentDataState.a(it, null, null, null, false, this.b, false, false, false, 167);
            case 1:
                return UserConsentDataState.a((UserConsentDataState) obj, null, null, null, false, this.b, false, false, false, 175);
            case 2:
                return WalletBalanceDataState.a((WalletBalanceDataState) obj, false, null, false, null, null, 0, 0, null, false, false, this.b, false, null, 14334);
            case 3:
                WalletLoadBalanceEnterAmountDataState it2 = (WalletLoadBalanceEnterAmountDataState) obj;
                Intrinsics.i(it2, "it");
                return WalletLoadBalanceEnterAmountDataState.a(it2, false, false, null, null, null, 0L, null, null, null, this.b, null, null, 0, false, 31742);
            case 4:
                WalletLoadBalanceEnterAmountDataState state = (WalletLoadBalanceEnterAmountDataState) obj;
                Intrinsics.i(state, "state");
                return WalletLoadBalanceEnterAmountDataState.a(state, false, false, this.b, null, null, 0L, null, null, null, null, null, null, 0, false, 32763);
            case 5:
                return WalletLoadBalanceEnterAmountDataState.a((WalletLoadBalanceEnterAmountDataState) obj, false, false, null, null, null, 0L, null, null, null, this.b, null, null, 0, false, 31742);
            case 6:
                return WalletLoadBalanceEnterAmountDataState.a((WalletLoadBalanceEnterAmountDataState) obj, false, false, null, null, null, 0L, null, null, null, this.b, null, null, 0, false, 31742);
            case 7:
                ((WalletLoadBalanceSuccessViewState) obj).getClass();
                String amountInCurrencyString = this.b;
                Intrinsics.i(amountInCurrencyString, "amountInCurrencyString");
                return new WalletLoadBalanceSuccessViewState(amountInCurrencyString);
            case 8:
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, this.b);
                return Unit.f17538a;
            default:
                return WideNavigationRailKt.ModalWideNavigationRailContent_pU6N4AM$lambda$18$lambda$17(this.b, (SemanticsPropertyReceiver) obj);
        }
    }
}
