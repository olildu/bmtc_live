package app.chalo.checkout.data.repository;

import app.chalo.checkout.data.model.api.request.ChaloPayOrderRequestApiModel;
import app.chalo.checkout.data.model.api.request.ChaloPayPaymentRequestApiModel;
import app.chalo.checkout.data.model.api.request.ClosedLoopWalletPaymentRequestApiModel;
import app.chalo.checkout.data.model.api.request.LazyPayRequestApiModel;
import app.chalo.checkout.data.model.api.request.PaymentStatusRequestApiModel;
import app.chalo.checkout.data.model.api.response.ChaloPayOrderResponseApiModel;
import app.chalo.checkout.data.model.api.response.ChaloPayPaymentResponseApiModel;
import app.chalo.checkout.data.model.api.response.ChaloPayPaymentResponseApiModelKt;
import app.chalo.checkout.data.model.api.response.OrderStatus;
import app.chalo.checkout.data.model.api.response.OrderStatusResponseAPIModel;
import app.chalo.checkout.data.model.api.response.PaymentStatus;
import app.chalo.checkout.data.model.api.response.PaymentStatusResponseAPIModel;
import app.chalo.checkout.data.model.app.ChaloPayOrderResponseAppModel;
import app.chalo.checkout.data.model.app.request.ChaloPayOrderRequestAppModel;
import app.chalo.checkout.data.model.app.request.ChaloPayPaymentRequestAppModel;
import app.chalo.checkout.data.model.app.request.ClosedLoopWalletPaymentRequestAppModel;
import app.chalo.checkout.data.model.app.request.GetLazyPayUrlRequestAppModel;
import app.chalo.checkout.data.model.app.request.PaymentStatusRequestAppModel;
import app.chalo.checkout.data.repository.remote.ICheckoutRemoteDataSource;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/repository/CheckoutRepository;", "Lapp/chalo/checkout/data/repository/ICheckoutRepository;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckoutRepository implements ICheckoutRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICheckoutRemoteDataSource f1350a;

    public CheckoutRepository(ICheckoutRemoteDataSource iCheckoutRemoteDataSource) {
        this.f1350a = iCheckoutRemoteDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.checkout.data.repository.ICheckoutRepository
    public final Enum a(Map map, ContinuationImpl continuationImpl) {
        CheckoutRepository$getOrderStatus$1 checkoutRepository$getOrderStatus$1;
        if (continuationImpl instanceof CheckoutRepository$getOrderStatus$1) {
            checkoutRepository$getOrderStatus$1 = (CheckoutRepository$getOrderStatus$1) continuationImpl;
            int i = checkoutRepository$getOrderStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutRepository$getOrderStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutRepository$getOrderStatus$1 = new CheckoutRepository$getOrderStatus$1(this, continuationImpl);
            }
        } else {
            checkoutRepository$getOrderStatus$1 = new CheckoutRepository$getOrderStatus$1(this, continuationImpl);
        }
        Object objA = checkoutRepository$getOrderStatus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutRepository$getOrderStatus$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            checkoutRepository$getOrderStatus$1.label = 1;
            objA = this.f1350a.a(map, checkoutRepository$getOrderStatus$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        OrderStatusResponseAPIModel orderStatusResponseAPIModel = (OrderStatusResponseAPIModel) objA;
        Intrinsics.i(orderStatusResponseAPIModel, "<this>");
        String str = orderStatusResponseAPIModel.c;
        OrderStatus orderStatus = OrderStatus.SUCCESS;
        if (Intrinsics.d(str, orderStatus.getStatus())) {
            return orderStatus;
        }
        OrderStatus orderStatus2 = OrderStatus.PENDING;
        if (Intrinsics.d(str, orderStatus2.getStatus())) {
            return orderStatus2;
        }
        OrderStatus orderStatus3 = OrderStatus.FAILED;
        return Intrinsics.d(str, orderStatus3.getStatus()) ? orderStatus3 : OrderStatus.UNKNOWN;
    }

    @Override // app.chalo.checkout.data.repository.ICheckoutRepository
    public final Object b(Map map, Continuation continuation) {
        return this.f1350a.d(map, (ContinuationImpl) continuation);
    }

    @Override // app.chalo.checkout.data.repository.ICheckoutRepository
    public final Object c(GetLazyPayUrlRequestAppModel getLazyPayUrlRequestAppModel, Continuation continuation) {
        return this.f1350a.c(new LazyPayRequestApiModel(getLazyPayUrlRequestAppModel.f1338a, getLazyPayUrlRequestAppModel.c, getLazyPayUrlRequestAppModel.b), (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.checkout.data.repository.ICheckoutRepository
    public final Enum d(PaymentStatusRequestAppModel paymentStatusRequestAppModel, ContinuationImpl continuationImpl) {
        CheckoutRepository$getPaymentStatus$1 checkoutRepository$getPaymentStatus$1;
        if (continuationImpl instanceof CheckoutRepository$getPaymentStatus$1) {
            checkoutRepository$getPaymentStatus$1 = (CheckoutRepository$getPaymentStatus$1) continuationImpl;
            int i = checkoutRepository$getPaymentStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutRepository$getPaymentStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutRepository$getPaymentStatus$1 = new CheckoutRepository$getPaymentStatus$1(this, continuationImpl);
            }
        } else {
            checkoutRepository$getPaymentStatus$1 = new CheckoutRepository$getPaymentStatus$1(this, continuationImpl);
        }
        Object objF = checkoutRepository$getPaymentStatus$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutRepository$getPaymentStatus$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            Intrinsics.i(paymentStatusRequestAppModel, "<this>");
            PaymentStatusRequestApiModel paymentStatusRequestApiModel = new PaymentStatusRequestApiModel(paymentStatusRequestAppModel.f1339a, paymentStatusRequestAppModel.b, paymentStatusRequestAppModel.c, paymentStatusRequestAppModel.d);
            checkoutRepository$getPaymentStatus$1.label = 1;
            objF = this.f1350a.f(paymentStatusRequestApiModel, checkoutRepository$getPaymentStatus$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        PaymentStatusResponseAPIModel paymentStatusResponseAPIModel = (PaymentStatusResponseAPIModel) objF;
        Intrinsics.i(paymentStatusResponseAPIModel, "<this>");
        String str = paymentStatusResponseAPIModel.f1268a;
        PaymentStatus paymentStatus = PaymentStatus.SUCCESS;
        if (Intrinsics.d(str, paymentStatus.getStatus())) {
            return paymentStatus;
        }
        PaymentStatus paymentStatus2 = PaymentStatus.PENDING;
        if (Intrinsics.d(str, paymentStatus2.getStatus())) {
            return paymentStatus2;
        }
        PaymentStatus paymentStatus3 = PaymentStatus.FAILED;
        return Intrinsics.d(str, paymentStatus3.getStatus()) ? paymentStatus3 : PaymentStatus.UNKNOWN;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.checkout.data.repository.ICheckoutRepository
    public final Object e(ClosedLoopWalletPaymentRequestAppModel closedLoopWalletPaymentRequestAppModel, ContinuationImpl continuationImpl) {
        CheckoutRepository$makeClosedLoopWalletPayment$1 checkoutRepository$makeClosedLoopWalletPayment$1;
        if (continuationImpl instanceof CheckoutRepository$makeClosedLoopWalletPayment$1) {
            checkoutRepository$makeClosedLoopWalletPayment$1 = (CheckoutRepository$makeClosedLoopWalletPayment$1) continuationImpl;
            int i = checkoutRepository$makeClosedLoopWalletPayment$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutRepository$makeClosedLoopWalletPayment$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutRepository$makeClosedLoopWalletPayment$1 = new CheckoutRepository$makeClosedLoopWalletPayment$1(this, continuationImpl);
            }
        } else {
            checkoutRepository$makeClosedLoopWalletPayment$1 = new CheckoutRepository$makeClosedLoopWalletPayment$1(this, continuationImpl);
        }
        Object objG = checkoutRepository$makeClosedLoopWalletPayment$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutRepository$makeClosedLoopWalletPayment$1.label;
        if (i2 == 0) {
            ResultKt.b(objG);
            Intrinsics.i(closedLoopWalletPaymentRequestAppModel, "<this>");
            ClosedLoopWalletPaymentRequestApiModel closedLoopWalletPaymentRequestApiModel = new ClosedLoopWalletPaymentRequestApiModel(closedLoopWalletPaymentRequestAppModel.d, closedLoopWalletPaymentRequestAppModel.f1337a, closedLoopWalletPaymentRequestAppModel.b, closedLoopWalletPaymentRequestAppModel.c, closedLoopWalletPaymentRequestAppModel.e, closedLoopWalletPaymentRequestAppModel.f);
            checkoutRepository$makeClosedLoopWalletPayment$1.label = 1;
            objG = this.f1350a.g(closedLoopWalletPaymentRequestApiModel, checkoutRepository$makeClosedLoopWalletPayment$1);
            if (objG == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objG);
        }
        return ChaloPayPaymentResponseApiModelKt.a((ChaloPayPaymentResponseApiModel) objG);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.checkout.data.repository.ICheckoutRepository
    public final Object f(ChaloPayOrderRequestAppModel chaloPayOrderRequestAppModel, ContinuationImpl continuationImpl) {
        CheckoutRepository$createChaloPayOrder$1 checkoutRepository$createChaloPayOrder$1;
        if (continuationImpl instanceof CheckoutRepository$createChaloPayOrder$1) {
            checkoutRepository$createChaloPayOrder$1 = (CheckoutRepository$createChaloPayOrder$1) continuationImpl;
            int i = checkoutRepository$createChaloPayOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutRepository$createChaloPayOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutRepository$createChaloPayOrder$1 = new CheckoutRepository$createChaloPayOrder$1(this, continuationImpl);
            }
        } else {
            checkoutRepository$createChaloPayOrder$1 = new CheckoutRepository$createChaloPayOrder$1(this, continuationImpl);
        }
        Object objB = checkoutRepository$createChaloPayOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutRepository$createChaloPayOrder$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            Intrinsics.i(chaloPayOrderRequestAppModel, "<this>");
            ChaloPayOrderRequestApiModel chaloPayOrderRequestApiModel = new ChaloPayOrderRequestApiModel(chaloPayOrderRequestAppModel.f1335a, chaloPayOrderRequestAppModel.b, chaloPayOrderRequestAppModel.c, chaloPayOrderRequestAppModel.d);
            checkoutRepository$createChaloPayOrder$1.label = 1;
            objB = this.f1350a.b(chaloPayOrderRequestApiModel, checkoutRepository$createChaloPayOrder$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        ChaloPayOrderResponseApiModel chaloPayOrderResponseApiModel = (ChaloPayOrderResponseApiModel) objB;
        Intrinsics.i(chaloPayOrderResponseApiModel, "<this>");
        Integer num = chaloPayOrderResponseApiModel.f1252a;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        String str = chaloPayOrderResponseApiModel.b;
        if (str == null) {
            return null;
        }
        return new ChaloPayOrderResponseAppModel(iIntValue, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.checkout.data.repository.ICheckoutRepository
    public final Object g(ChaloPayPaymentRequestAppModel chaloPayPaymentRequestAppModel, ContinuationImpl continuationImpl) {
        CheckoutRepository$makeChaloPayment$1 checkoutRepository$makeChaloPayment$1;
        if (continuationImpl instanceof CheckoutRepository$makeChaloPayment$1) {
            checkoutRepository$makeChaloPayment$1 = (CheckoutRepository$makeChaloPayment$1) continuationImpl;
            int i = checkoutRepository$makeChaloPayment$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkoutRepository$makeChaloPayment$1.label = i - Integer.MIN_VALUE;
            } else {
                checkoutRepository$makeChaloPayment$1 = new CheckoutRepository$makeChaloPayment$1(this, continuationImpl);
            }
        } else {
            checkoutRepository$makeChaloPayment$1 = new CheckoutRepository$makeChaloPayment$1(this, continuationImpl);
        }
        Object objE = checkoutRepository$makeChaloPayment$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkoutRepository$makeChaloPayment$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            Intrinsics.i(chaloPayPaymentRequestAppModel, "<this>");
            ChaloPayPaymentRequestApiModel chaloPayPaymentRequestApiModel = new ChaloPayPaymentRequestApiModel(chaloPayPaymentRequestAppModel.f1336a, chaloPayPaymentRequestAppModel.b, chaloPayPaymentRequestAppModel.c, chaloPayPaymentRequestAppModel.d, chaloPayPaymentRequestAppModel.e);
            checkoutRepository$makeChaloPayment$1.label = 1;
            objE = this.f1350a.e(chaloPayPaymentRequestApiModel, checkoutRepository$makeChaloPayment$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objE);
        }
        return ChaloPayPaymentResponseApiModelKt.a((ChaloPayPaymentResponseApiModel) objE);
    }
}
