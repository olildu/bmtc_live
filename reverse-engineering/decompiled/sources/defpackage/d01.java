package defpackage;

import app.chalo.constants.Source;
import app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.LoginOptionsArgs;
import app.chalo.scenes.args.WalletAllTransactionsArgs;
import app.chalo.scenes.args.WalletBalanceArgs;
import app.chalo.scenes.args.WalletLoadMoneyArgs;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d01 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15416a;
    public final /* synthetic */ QuickpayTripAmountComponent b;

    public /* synthetic */ d01(QuickpayTripAmountComponent quickpayTripAmountComponent, int i) {
        this.f15416a = i;
        this.b = quickpayTripAmountComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15416a) {
            case 0:
                ChaloNavigationManagerKt.e(this.b.z, new LoginOptionsArgs(Source.QUICK_PAY_TRIP_AMOUNT_SCREEN, true), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), 4);
                break;
            case 1:
                ChaloNavigationManagerKt.e(this.b.z, new WalletAllTransactionsArgs(true), null, 6);
                break;
            case 2:
                QuickpayTripAmountComponent quickpayTripAmountComponent = this.b;
                ChaloNavigationManager chaloNavigationManager = quickpayTripAmountComponent.z;
                WalletBalanceArgs walletBalanceArgs = new WalletBalanceArgs();
                Source source = quickpayTripAmountComponent.p.c;
                int i = source == null ? -1 : QuickpayTripAmountComponent.WhenMappings.f8901a[source.ordinal()];
                ChaloNavigationManagerKt.e(chaloNavigationManager, walletBalanceArgs, (i == 1 || i == 2) ? new ChaloNavOptions(new PopUpToConfig.Scene(ChaloScenes.WalletBalance, true), 2) : new ChaloNavOptions(PopUpToConfig.None.f9220a, 2), 4);
                break;
            default:
                ChaloNavigationManagerKt.e(this.b.z, new WalletLoadMoneyArgs(7), null, 6);
                break;
        }
        return Unit.f17538a;
    }
}
