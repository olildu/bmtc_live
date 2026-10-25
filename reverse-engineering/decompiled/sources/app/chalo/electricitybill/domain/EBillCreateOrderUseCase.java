package app.chalo.electricitybill.domain;

import app.chalo.electricitybill.data.exceptions.ElectricityBillPaymentOrderCreationException;
import app.chalo.electricitybill.data.model.appmodel.ElectricityBillAppModel;
import app.chalo.electricitybill.data.repository.ElectricityBillRepository;
import app.chalo.electricitybill.exception.EBillPaymentException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/domain/EBillCreateOrderUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EBillCreateOrderUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ElectricityBillRepository f2544a;
    public final UserProfileDetailsProvider b;
    public final CityProvider c;

    public EBillCreateOrderUseCase(ElectricityBillRepository electricityBillRepository, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider) {
        this.f2544a = electricityBillRepository;
        this.b = userProfileDetailsProvider;
        this.c = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(ElectricityBillAppModel electricityBillAppModel, ContinuationImpl continuationImpl) {
        EBillCreateOrderUseCase$createOrder$1 eBillCreateOrderUseCase$createOrder$1;
        String str;
        if (continuationImpl instanceof EBillCreateOrderUseCase$createOrder$1) {
            eBillCreateOrderUseCase$createOrder$1 = (EBillCreateOrderUseCase$createOrder$1) continuationImpl;
            int i = eBillCreateOrderUseCase$createOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eBillCreateOrderUseCase$createOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                eBillCreateOrderUseCase$createOrder$1 = new EBillCreateOrderUseCase$createOrder$1(this, continuationImpl);
            }
        } else {
            eBillCreateOrderUseCase$createOrder$1 = new EBillCreateOrderUseCase$createOrder$1(this, continuationImpl);
        }
        EBillCreateOrderUseCase$createOrder$1 eBillCreateOrderUseCase$createOrder$2 = eBillCreateOrderUseCase$createOrder$1;
        Object objC = eBillCreateOrderUseCase$createOrder$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = eBillCreateOrderUseCase$createOrder$2.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objC);
                ElectricityBillRepository electricityBillRepository = this.f2544a;
                String strM = this.b.m();
                String str2 = "";
                if (strM == null) {
                    strM = "";
                }
                String strB = CityProviderKt.b(this.c);
                if (strB != null) {
                    str2 = strB;
                }
                int i3 = electricityBillAppModel.g;
                long j = electricityBillAppModel.b;
                long j2 = electricityBillAppModel.f2538a;
                String str3 = electricityBillAppModel.c;
                String str4 = electricityBillAppModel.d;
                eBillCreateOrderUseCase$createOrder$2.label = 1;
                objC = electricityBillRepository.c(strM, str2, i3, "ebill_dakjh", j, j2, str3, str4, eBillCreateOrderUseCase$createOrder$2);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objC);
            }
            return new ChaloUseCaseResult.Success(objC);
        } catch (ElectricityBillPaymentOrderCreationException e) {
            GenericChaloErrorResponse errorResponse = e.getErrorResponse();
            if (errorResponse == null || (str = errorResponse.b) == null) {
                str = "Something went wrong";
            }
            return new ChaloUseCaseResult.Failure(new EBillPaymentException(str));
        } catch (Exception e2) {
            return new ChaloUseCaseResult.Failure(new EBillPaymentException(e2.getMessage()));
        }
    }
}
