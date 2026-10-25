package app.chalo.wallet.ui.loadbalance;

import app.chalo.constants.Source;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.TicketPurchaseArgs;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountComponent$handleBannerClicked$1", f = "WalletLoadBalanceEnterAmountComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class WalletLoadBalanceEnterAmountComponent$handleBannerClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WalletLoadBalanceEnterAmountIntent.BannerClickedIntent $intent;
    int label;
    final /* synthetic */ WalletLoadBalanceEnterAmountComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLoadBalanceEnterAmountComponent$handleBannerClicked$1(WalletLoadBalanceEnterAmountIntent.BannerClickedIntent bannerClickedIntent, WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent, Continuation continuation) {
        super(2, continuation);
        this.$intent = bannerClickedIntent;
        this.this$0 = walletLoadBalanceEnterAmountComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalletLoadBalanceEnterAmountComponent$handleBannerClicked$1(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        WalletLoadBalanceEnterAmountComponent$handleBannerClicked$1 walletLoadBalanceEnterAmountComponent$handleBannerClicked$1 = (WalletLoadBalanceEnterAmountComponent$handleBannerClicked$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        walletLoadBalanceEnterAmountComponent$handleBannerClicked$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        String str = this.$intent.f10832a.b;
        if (str != null && StringsKt.m(str, "openChaloPay", false)) {
            ChaloNavigationManagerKt.e(this.this$0.D, new TicketPurchaseArgs.QuickPayArgs(Source.WALLET_LOAD_BALANCE_ENTER_AMOUNT), null, 6);
        } else if (str != null) {
            StringsKt.m(str, "openWalletRecharge", false);
        }
        return Unit.f17538a;
    }
}
