package app.chalo.checkout.domain;

import app.chalo.checkout.data.exceptions.CheckoutRemoteDataException;
import app.chalo.checkout.data.model.api.response.LazyPayResponseApiModel;
import app.chalo.checkout.data.model.app.PaymentMethodEligibilityDetails;
import app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel;
import app.chalo.checkout.data.model.app.PaymentMethodsAppModel;
import app.chalo.checkout.data.model.app.request.GetLazyPayUrlRequestAppModel;
import app.chalo.checkout.data.repository.ICheckoutRepository;
import app.chalo.checkout.data.resolver.CheckoutPaymentDataResolver;
import app.chalo.checkout.data.resolver.PaymentInfoState;
import app.chalo.features.checkout.CheckoutPaymentData;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.dd;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/GetLazyPayCheckoutUrlUseCase;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetLazyPayCheckoutUrlUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICheckoutRepository f1375a;
    public final CheckoutPaymentDataResolver b;

    public GetLazyPayCheckoutUrlUseCase(ICheckoutRepository iCheckoutRepository, CheckoutPaymentDataResolver checkoutPaymentDataResolver) {
        this.f1375a = iCheckoutRepository;
        this.b = checkoutPaymentDataResolver;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(ContinuationImpl continuationImpl) {
        GetLazyPayCheckoutUrlUseCase$invoke$1 getLazyPayCheckoutUrlUseCase$invoke$1;
        Object next;
        CheckoutPaymentDataResolver checkoutPaymentDataResolver = this.b;
        if (continuationImpl instanceof GetLazyPayCheckoutUrlUseCase$invoke$1) {
            getLazyPayCheckoutUrlUseCase$invoke$1 = (GetLazyPayCheckoutUrlUseCase$invoke$1) continuationImpl;
            int i = getLazyPayCheckoutUrlUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLazyPayCheckoutUrlUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getLazyPayCheckoutUrlUseCase$invoke$1 = new GetLazyPayCheckoutUrlUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getLazyPayCheckoutUrlUseCase$invoke$1 = new GetLazyPayCheckoutUrlUseCase$invoke$1(this, continuationImpl);
        }
        Object objC = getLazyPayCheckoutUrlUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getLazyPayCheckoutUrlUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objC);
                CheckoutPaymentData checkoutPaymentDataU = checkoutPaymentDataResolver.u();
                PaymentMethodsAppModel paymentMethodsAppModel = ((PaymentInfoState) checkoutPaymentDataResolver.P().getValue()).f1361a;
                Intrinsics.i(paymentMethodsAppModel, "<this>");
                Iterator it = paymentMethodsAppModel.b.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((PaymentMethodOptionsAppModel) next) instanceof PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.LazyPay));
                PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.LazyPay lazyPay = next instanceof PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.LazyPay ? (PaymentMethodOptionsAppModel.RazorPayPaymentMethodOption.LazyPay) next : null;
                PaymentMethodEligibilityDetails paymentMethodEligibilityDetails = lazyPay != null ? lazyPay.d : null;
                String str = paymentMethodEligibilityDetails != null ? paymentMethodEligibilityDetails.f1295a : null;
                if (str == null) {
                    str = "";
                }
                GetLazyPayUrlRequestAppModel getLazyPayUrlRequestAppModel = new GetLazyPayUrlRequestAppModel(str, checkoutPaymentDataU.b.f2697a, checkoutPaymentDataU.f2691a.f2689a);
                ICheckoutRepository iCheckoutRepository = this.f1375a;
                getLazyPayCheckoutUrlUseCase$invoke$1.label = 1;
                objC = iCheckoutRepository.c(getLazyPayUrlRequestAppModel, getLazyPayCheckoutUrlUseCase$invoke$1);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objC);
            }
            return new ChaloUseCaseResult.Success(((LazyPayResponseApiModel) objC).f1256a);
        } catch (Exception e) {
            if (e instanceof ChaloLocalException) {
                String message = e.getMessage();
                return new ChaloUseCaseResult.Failure(new CheckoutErrorType.Local(message != null ? message : "Something went wrong"));
            }
            if (!(e instanceof CheckoutRemoteDataException)) {
                if (e instanceof NetworkSuccessResponseParseException) {
                    return new ChaloUseCaseResult.Failure(CheckoutErrorType.ResponseParsing.d);
                }
                String message2 = e.getMessage();
                return new ChaloUseCaseResult.Failure(new CheckoutErrorType.Unknown(message2 != null ? message2 : "Something went wrong"));
            }
            String message3 = e.getMessage();
            CheckoutRemoteDataException checkoutRemoteDataException = (CheckoutRemoteDataException) e;
            GenericChaloErrorResponse errorResponse = checkoutRemoteDataException.getErrorResponse();
            String strC = dd.c(errorResponse != null ? new Integer(errorResponse.f6497a) : null, message3, " code: ");
            GenericChaloErrorResponse errorResponse2 = checkoutRemoteDataException.getErrorResponse();
            return new ChaloUseCaseResult.Failure(new CheckoutErrorType.API(strC, errorResponse2 != null ? new Integer(errorResponse2.f6497a) : null, false));
        }
    }
}
