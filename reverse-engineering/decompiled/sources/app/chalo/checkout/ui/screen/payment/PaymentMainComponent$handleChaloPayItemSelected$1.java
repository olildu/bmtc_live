package app.chalo.checkout.ui.screen.payment;

import app.chalo.checkout.analytics.ICheckoutAnalyticsHelper;
import app.chalo.walletframework.chalopay.ChaloPayManager;
import app.chalo.walletframework.chalopay.ChaloPayWalletState;
import app.chalo.walletframework.chalopay.WalletCTA;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import defpackage.jq0;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.ui.screen.payment.PaymentMainComponent$handleChaloPayItemSelected$1", f = "PaymentMainComponent.kt", l = {2394, 2399}, m = "invokeSuspend", v = 1)
final class PaymentMainComponent$handleChaloPayItemSelected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isClosedLoopWallet;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaymentMainComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMainComponent$handleChaloPayItemSelected$1(PaymentMainComponent paymentMainComponent, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = paymentMainComponent;
        this.$isClosedLoopWallet = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PaymentMainComponent$handleChaloPayItemSelected$1 paymentMainComponent$handleChaloPayItemSelected$1 = new PaymentMainComponent$handleChaloPayItemSelected$1(this.this$0, this.$isClosedLoopWallet, continuation);
        paymentMainComponent$handleChaloPayItemSelected$1.L$0 = obj;
        return paymentMainComponent$handleChaloPayItemSelected$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMainComponent$handleChaloPayItemSelected$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            if (!Intrinsics.d(((ChaloPayWalletState) this.this$0.x.d().getValue()).b, Boolean.TRUE)) {
                PaymentMainComponent paymentMainComponent = this.this$0;
                this.L$0 = coroutineScope;
                this.label = 1;
                obj = paymentMainComponent.X.b(this);
                if (obj != coroutineSingletons) {
                }
            }
            if (((ChaloPayWalletState) this.this$0.x.d().getValue()).h != WalletCTA.RECHARGE) {
                this.this$0.s1(PaymentViewIntent.ProceedWithChaloPayModeIntent.f1570a);
                return unit;
            }
            this.this$0.E0(new jq0(28));
            PaymentMainComponent paymentMainComponent2 = this.this$0;
            ICheckoutAnalyticsHelper iCheckoutAnalyticsHelper = paymentMainComponent2.t;
            String strValueOf = String.valueOf(((ChaloPayWalletState) paymentMainComponent2.x.d().getValue()).g);
            Locale locale = Locale.ROOT;
            String lowerCase = strValueOf.toLowerCase(locale);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            Pair pair = new Pair("chaloPayWalletState", lowerCase);
            Pair pair2 = new Pair("chaloPayWalletBalance", String.valueOf(((ChaloPayWalletState) this.this$0.x.d().getValue()).f));
            String lowerCase2 = String.valueOf(((ChaloPayWalletState) this.this$0.x.d().getValue()).h).toLowerCase(locale);
            Intrinsics.h(lowerCase2, "toLowerCase(...)");
            iCheckoutAnalyticsHelper.h("chaloPayBottomsheetOpened", MapsKt.i(pair, pair2, new Pair("bottomsheetCTA", lowerCase2)), this.$isClosedLoopWallet);
            return unit;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        WalletTypeIdentifier walletTypeIdentifier = (WalletTypeIdentifier) obj;
        if (walletTypeIdentifier == null) {
            this.this$0.l1();
            return unit;
        }
        PaymentMainComponent paymentMainComponent3 = this.this$0;
        paymentMainComponent3.f0 = Boolean.TRUE;
        ChaloPayManager chaloPayManager = paymentMainComponent3.x;
        this.L$0 = null;
        this.label = 2;
        return chaloPayManager.b(walletTypeIdentifier, this) == coroutineSingletons ? coroutineSingletons : unit;
    }
}
