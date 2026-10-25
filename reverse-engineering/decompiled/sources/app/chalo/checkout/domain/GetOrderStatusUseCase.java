package app.chalo.checkout.domain;

import app.chalo.checkout.data.exceptions.CheckoutRemoteDataException;
import app.chalo.checkout.data.model.api.response.OrderStatus;
import app.chalo.checkout.data.repository.ICheckoutRepository;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.dd;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/checkout/domain/GetOrderStatusUseCase;", "", "Companion", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetOrderStatusUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICheckoutRepository f1376a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/checkout/domain/GetOrderStatusUseCase$Companion;", "", "", "CHALO_ORDER_ID", "Ljava/lang/String;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public GetOrderStatusUseCase(ICheckoutRepository iCheckoutRepository) {
        this.f1376a = iCheckoutRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        GetOrderStatusUseCase$invoke$1 getOrderStatusUseCase$invoke$1;
        if (continuationImpl instanceof GetOrderStatusUseCase$invoke$1) {
            getOrderStatusUseCase$invoke$1 = (GetOrderStatusUseCase$invoke$1) continuationImpl;
            int i = getOrderStatusUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getOrderStatusUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getOrderStatusUseCase$invoke$1 = new GetOrderStatusUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getOrderStatusUseCase$invoke$1 = new GetOrderStatusUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = getOrderStatusUseCase$invoke$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getOrderStatusUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objA);
                Map mapH = MapsKt.h(new Pair("chaloOrderId", str));
                ICheckoutRepository iCheckoutRepository = this.f1376a;
                getOrderStatusUseCase$invoke$1.label = 1;
                objA = iCheckoutRepository.a(mapH, getOrderStatusUseCase$invoke$1);
                if (objA == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA);
            }
            return new ChaloUseCaseResult.Success((OrderStatus) objA);
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
