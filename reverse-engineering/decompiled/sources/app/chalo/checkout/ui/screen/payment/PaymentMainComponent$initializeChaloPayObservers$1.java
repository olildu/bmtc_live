package app.chalo.checkout.ui.screen.payment;

import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.walletframework.chalopay.ChaloPayWalletState;
import app.chalo.walletframework.chalopay.WalletCTA;
import app.chalo.walletframework.chalopay.WalletStatusForUI;
import defpackage.os;
import java.util.List;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.ui.screen.payment.PaymentMainComponent$initializeChaloPayObservers$1", f = "PaymentMainComponent.kt", l = {388}, m = "invokeSuspend", v = 1)
final class PaymentMainComponent$initializeChaloPayObservers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PaymentMainComponent this$0;

    /* JADX INFO: renamed from: app.chalo.checkout.ui.screen.payment.PaymentMainComponent$initializeChaloPayObservers$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    final class AnonymousClass1<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PaymentMainComponent f1538a;

        public AnonymousClass1(PaymentMainComponent paymentMainComponent) {
            this.f1538a = paymentMainComponent;
        }

        /* JADX WARN: Code duplicated, block: B:43:0x0100  */
        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(ChaloPayWalletState chaloPayWalletState, Continuation continuation) {
            PaymentMainComponent$initializeChaloPayObservers$1$1$emit$1 paymentMainComponent$initializeChaloPayObservers$1$1$emit$1;
            long jLongValue;
            String str;
            Object objI0;
            Object objB;
            ChaloPayWalletState chaloPayWalletState2;
            List list;
            String str2;
            long j;
            String str3;
            Object objX0;
            List list2;
            String str4;
            String str5;
            long j2;
            ChaloPayWalletState chaloPayWalletState3 = chaloPayWalletState;
            if (continuation instanceof PaymentMainComponent$initializeChaloPayObservers$1$1$emit$1) {
                paymentMainComponent$initializeChaloPayObservers$1$1$emit$1 = (PaymentMainComponent$initializeChaloPayObservers$1$1$emit$1) continuation;
                int i = paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    paymentMainComponent$initializeChaloPayObservers$1$1$emit$1 = new PaymentMainComponent$initializeChaloPayObservers$1$1$emit$1(this, continuation);
                }
            } else {
                paymentMainComponent$initializeChaloPayObservers$1$1$emit$1 = new PaymentMainComponent$initializeChaloPayObservers$1$1$emit$1(this, continuation);
            }
            Object obj = paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.label;
            Unit unit = Unit.f17538a;
            PaymentMainComponent paymentMainComponent = this.f1538a;
            if (i2 == 0) {
                ResultKt.b(obj);
                Long l = chaloPayWalletState3.f;
                if (l != null) {
                    jLongValue = l.longValue();
                    str = paymentMainComponent.m.u().f2691a.c;
                    if (str.length() != 0) {
                        paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.L$0 = chaloPayWalletState3;
                        paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.L$1 = str;
                        paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.J$0 = jLongValue;
                        paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.label = 1;
                        objI0 = PaymentMainComponent.I0(paymentMainComponent, paymentMainComponent$initializeChaloPayObservers$1$1$emit$1);
                        if (objI0 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                }
                return unit;
            }
            if (i2 == 1) {
                jLongValue = paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.J$0;
                String str6 = (String) paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.L$1;
                ChaloPayWalletState chaloPayWalletState4 = (ChaloPayWalletState) paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.L$0;
                ResultKt.b(obj);
                str = str6;
                chaloPayWalletState3 = chaloPayWalletState4;
                objI0 = obj;
            } else {
                if (i2 == 2) {
                    j = paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.J$0;
                    list = (List) paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.L$2;
                    str2 = (String) paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.L$1;
                    chaloPayWalletState2 = (ChaloPayWalletState) paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.L$0;
                    ResultKt.b(obj);
                    str3 = (String) obj;
                    WalletCTA walletCTA = chaloPayWalletState2.h;
                    paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.L$0 = str2;
                    paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.L$1 = list;
                    paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.L$2 = str3;
                    paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.J$0 = j;
                    paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.label = 3;
                    objX0 = paymentMainComponent.X0(walletCTA, paymentMainComponent$initializeChaloPayObservers$1$1$emit$1);
                    if (objX0 != coroutineSingletons) {
                        list2 = list;
                        str4 = str3;
                        obj = objX0;
                        str5 = str2;
                        j2 = j;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j3 = paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.J$0;
                String str7 = (String) paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.L$2;
                List list3 = (List) paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.L$1;
                String str8 = (String) paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.L$0;
                ResultKt.b(obj);
                str4 = str7;
                str5 = str8;
                j2 = j3;
                list2 = list3;
            }
            PaymentMainComponent paymentMainComponent2 = this.f1538a;
            paymentMainComponent2.E0(new os(str4, (String) obj, paymentMainComponent2, str5, j2, list2));
            return unit;
            List list4 = (List) objI0;
            WalletStatusForUI walletStatusForUI = chaloPayWalletState3.g;
            paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.L$0 = chaloPayWalletState3;
            paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.L$1 = str;
            paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.L$2 = list4;
            paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.J$0 = jLongValue;
            paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.label = 2;
            StringProvider stringProvider = paymentMainComponent.A;
            switch (walletStatusForUI == null ? -1 : PaymentMainComponent.WhenMappings.m[walletStatusForUI.ordinal()]) {
                case -1:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    objB = "";
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    objB = stringProvider.b(StringEnum.WALLET_SYNC_ERROR, new Object[0], paymentMainComponent$initializeChaloPayObservers$1$1$emit$1);
                    break;
                case 2:
                    objB = stringProvider.b(StringEnum.INSUFFICIENT_BALANCE_ERROR, new Object[0], paymentMainComponent$initializeChaloPayObservers$1$1$emit$1);
                    break;
            }
            if (objB != coroutineSingletons) {
                long j4 = jLongValue;
                chaloPayWalletState2 = chaloPayWalletState3;
                list = list4;
                str2 = str;
                obj = objB;
                j = j4;
                str3 = (String) obj;
                WalletCTA walletCTA2 = chaloPayWalletState2.h;
                paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.L$0 = str2;
                paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.L$1 = list;
                paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.L$2 = str3;
                paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.J$0 = j;
                paymentMainComponent$initializeChaloPayObservers$1$1$emit$1.label = 3;
                objX0 = paymentMainComponent.X0(walletCTA2, paymentMainComponent$initializeChaloPayObservers$1$1$emit$1);
                if (objX0 != coroutineSingletons) {
                    list2 = list;
                    str4 = str3;
                    obj = objX0;
                    str5 = str2;
                    j2 = j;
                    PaymentMainComponent paymentMainComponent3 = this.f1538a;
                    paymentMainComponent3.E0(new os(str4, (String) obj, paymentMainComponent3, str5, j2, list2));
                    return unit;
                }
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMainComponent$initializeChaloPayObservers$1(PaymentMainComponent paymentMainComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = paymentMainComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMainComponent$initializeChaloPayObservers$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMainComponent$initializeChaloPayObservers$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow stateFlowD = this.this$0.x.d();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
            this.label = 1;
            if (stateFlowD.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
