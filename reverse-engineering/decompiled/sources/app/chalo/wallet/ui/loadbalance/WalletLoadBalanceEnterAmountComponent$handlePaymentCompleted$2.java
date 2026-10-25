package app.chalo.wallet.ui.loadbalance;

import app.chalo.models.ordercreation.CreateOrderResponseAppModel;
import app.chalo.models.ordercreation.OrderBookingInfoAppModel;
import app.chalo.wallet.domain.AddProcessingLoadMoneyTransactionsAndSyncWalletUseCase;
import app.chalo.wallet.ui.access.WalletAccessState;
import app.chalo.wallet.ui.moneyaddedbottomsheet.model.WalletMoneyAddedNavigationModel;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.domain.GetWalletIdUseCase;
import app.chalo.walletframework.wallet.domain.WalletSyncAttemptFailureReason;
import app.chalo.walletframework.wallet.domain.WalletSyncFailureReason;
import app.chalo.walletframework.wallet.domain.model.LoadMoneyPaymentCompleteData;
import app.chalo.walletframework.wallet.domain.model.WalletLoadBalanceConfigAndRechargeOrderCombined;
import com.google.android.gms.wallet.WalletConstants;
import defpackage.cm1;
import defpackage.do1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountComponent$handlePaymentCompleted$2", f = "WalletLoadBalanceEnterAmountComponent.kt", l = {WalletConstants.ERROR_CODE_INVALID_TRANSACTION, WalletConstants.ERROR_CODE_UNKNOWN, WalletConstants.ERROR_CODE_ILLEGAL_CALLER, 429}, m = "invokeSuspend", v = 1)
final class WalletLoadBalanceEnterAmountComponent$handlePaymentCompleted$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WalletLoadBalanceEnterAmountIntent.PaymentCompletedIntent $intent;
    final /* synthetic */ WalletLoadBalanceConfigAndRechargeOrderCombined $walletLoadConfigAndOrderCombined;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ WalletLoadBalanceEnterAmountComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLoadBalanceEnterAmountComponent$handlePaymentCompleted$2(WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent, WalletLoadBalanceConfigAndRechargeOrderCombined walletLoadBalanceConfigAndRechargeOrderCombined, WalletLoadBalanceEnterAmountIntent.PaymentCompletedIntent paymentCompletedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = walletLoadBalanceEnterAmountComponent;
        this.$walletLoadConfigAndOrderCombined = walletLoadBalanceConfigAndRechargeOrderCombined;
        this.$intent = paymentCompletedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WalletLoadBalanceEnterAmountComponent$handlePaymentCompleted$2 walletLoadBalanceEnterAmountComponent$handlePaymentCompleted$2 = new WalletLoadBalanceEnterAmountComponent$handlePaymentCompleted$2(this.this$0, this.$walletLoadConfigAndOrderCombined, this.$intent, continuation);
        walletLoadBalanceEnterAmountComponent$handlePaymentCompleted$2.L$0 = obj;
        return walletLoadBalanceEnterAmountComponent$handlePaymentCompleted$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WalletLoadBalanceEnterAmountComponent$handlePaymentCompleted$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WalletSyncAttemptFailureReason walletSyncAttemptFailureReason;
        WalletTypeIdentifier walletTypeIdentifier;
        Object objA;
        String str;
        Object objA2;
        LoadMoneyPaymentCompleteData loadMoneyPaymentCompleteData;
        Long l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                String strM = this.this$0.E.m();
                if (strM != null) {
                    walletTypeIdentifier = ((WalletAccessState) this.this$0.m.a()).b;
                    if (walletTypeIdentifier == null) {
                        WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent = this.this$0;
                        this.label = 1;
                        if (WalletLoadBalanceEnterAmountComponent.K0(walletLoadBalanceEnterAmountComponent, this) == coroutineSingletons) {
                        }
                    } else {
                        GetWalletIdUseCase getWalletIdUseCase = this.this$0.v;
                        this.L$0 = coroutineScope;
                        this.L$1 = strM;
                        this.L$2 = walletTypeIdentifier;
                        this.label = 2;
                        objA = getWalletIdUseCase.a(walletTypeIdentifier, this);
                        if (objA != coroutineSingletons) {
                            str = strM;
                        }
                    }
                    return coroutineSingletons;
                }
                return unit;
            }
            if (i == 1) {
                ResultKt.b(obj);
                return unit;
            }
            if (i == 2) {
                WalletTypeIdentifier walletTypeIdentifier2 = (WalletTypeIdentifier) this.L$2;
                String str2 = (String) this.L$1;
                ResultKt.b(obj);
                walletTypeIdentifier = walletTypeIdentifier2;
                str = str2;
                objA = obj;
            } else {
                if (i == 3) {
                    ResultKt.b(obj);
                    return unit;
                }
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                loadMoneyPaymentCompleteData = (LoadMoneyPaymentCompleteData) this.L$0;
                ResultKt.b(obj);
                objA2 = obj;
            }
            this.this$0.E0(new do1(26));
            WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent2 = this.this$0;
            walletLoadBalanceEnterAmountComponent2.q0(new cm1(9, walletLoadBalanceEnterAmountComponent2, (WalletMoneyAddedNavigationModel) objA2));
            WalletLoadBalanceEnterAmountComponent.J0(this.this$0, String.valueOf(loadMoneyPaymentCompleteData.b));
            return unit;
            String str3 = (String) objA;
            if (str3 == null) {
                WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent3 = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                if (WalletLoadBalanceEnterAmountComponent.K0(walletLoadBalanceEnterAmountComponent3, this) != coroutineSingletons) {
                    return unit;
                }
            } else {
                CreateOrderResponseAppModel createOrderResponseAppModel = this.$walletLoadConfigAndOrderCombined.b;
                String str4 = createOrderResponseAppModel.f;
                int i2 = createOrderResponseAppModel.f5638a;
                OrderBookingInfoAppModel orderBookingInfoAppModel = createOrderResponseAppModel.c;
                long jLongValue = (orderBookingInfoAppModel == null || (l = orderBookingInfoAppModel.f5642a) == null) ? -1L : l.longValue();
                String str5 = this.$walletLoadConfigAndOrderCombined.b.b;
                if (str5 == null) {
                    str5 = "";
                }
                LoadMoneyPaymentCompleteData loadMoneyPaymentCompleteData2 = new LoadMoneyPaymentCompleteData(i2, jLongValue, str4, str5, this.$intent.f10836a, str, str3);
                AddProcessingLoadMoneyTransactionsAndSyncWalletUseCase addProcessingLoadMoneyTransactionsAndSyncWalletUseCase = this.this$0.u;
                this.L$0 = loadMoneyPaymentCompleteData2;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                objA2 = addProcessingLoadMoneyTransactionsAndSyncWalletUseCase.a(loadMoneyPaymentCompleteData2, walletTypeIdentifier, this);
                if (objA2 != coroutineSingletons) {
                    loadMoneyPaymentCompleteData = loadMoneyPaymentCompleteData2;
                    this.this$0.E0(new do1(26));
                    WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent4 = this.this$0;
                    walletLoadBalanceEnterAmountComponent4.q0(new cm1(9, walletLoadBalanceEnterAmountComponent4, (WalletMoneyAddedNavigationModel) objA2));
                    WalletLoadBalanceEnterAmountComponent.J0(this.this$0, String.valueOf(loadMoneyPaymentCompleteData.b));
                    return unit;
                }
            }
            return coroutineSingletons;
        } catch (Exception unused) {
            this.this$0.E0(new do1(27));
            WalletLoadBalanceEnterAmountComponent walletLoadBalanceEnterAmountComponent5 = this.this$0;
            WalletSyncFailureReason walletSyncFailureReason = WalletSyncFailureReason.API_FETCH_FAILED;
            String str6 = this.$walletLoadConfigAndOrderCombined.b.f;
            walletLoadBalanceEnterAmountComponent5.getClass();
            switch (WalletLoadBalanceEnterAmountComponent.WhenMappings.f10828a[walletSyncFailureReason.ordinal()]) {
                case 1:
                    walletSyncAttemptFailureReason = WalletSyncAttemptFailureReason.USER_NOT_LOGGED_IN;
                    break;
                case 2:
                    walletSyncAttemptFailureReason = WalletSyncAttemptFailureReason.KYC_NOT_DONE;
                    break;
                case 3:
                    walletSyncAttemptFailureReason = WalletSyncAttemptFailureReason.BLOCKED_FOR_APP_RECLAIM;
                    break;
                case 4:
                    walletSyncAttemptFailureReason = WalletSyncAttemptFailureReason.CHALO_TIME_NOT_AVAILABLE;
                    break;
                case 5:
                    walletSyncAttemptFailureReason = WalletSyncAttemptFailureReason.SYNC_API_FETCH_FAILED;
                    break;
                case 6:
                    walletSyncAttemptFailureReason = WalletSyncAttemptFailureReason.WALLET_TIMED_OUT;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            walletLoadBalanceEnterAmountComponent5.N0(walletSyncAttemptFailureReason);
            this.this$0.E0(new do1(28));
            return unit;
        }
    }
}
