package app.chalo.validationsdk.blevalidation.domain.configuration;

import app.chalo.models.validation.RegularBusProductAndValidationMethod;
import app.chalo.models.validation.RegularBusProductAndValidationMethodsForCity;
import app.chalo.models.validation.RegularBusSlBleConfig;
import app.chalo.models.validation.RegularBusSoundBasedValidationConfig;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.models.validation.ValidationProductKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/domain/configuration/GetRegularBusProductValidationMethodUseCase;", "", "Companion", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetRegularBusProductValidationMethodUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetRegularBusProductValidationMethodsConfigForCurrentCityUseCase f10510a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/domain/configuration/GetRegularBusProductValidationMethodUseCase$Companion;", "", "", "PREMIUM_RESERVE_TICKET", "Ljava/lang/String;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public GetRegularBusProductValidationMethodUseCase(GetRegularBusProductValidationMethodsConfigForCurrentCityUseCase getRegularBusProductValidationMethodsConfigForCurrentCityUseCase) {
        this.f10510a = getRegularBusProductValidationMethodsConfigForCurrentCityUseCase;
    }

    public static RegularBusProductAndValidationMethod a(String str) {
        return new RegularBusProductAndValidationMethod(str, new RegularBusSlBleConfig(), new RegularBusSoundBasedValidationConfig());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ValidationProduct validationProduct, ContinuationImpl continuationImpl) {
        GetRegularBusProductValidationMethodUseCase$invoke$1 getRegularBusProductValidationMethodUseCase$invoke$1;
        String str;
        Object next;
        if (continuationImpl instanceof GetRegularBusProductValidationMethodUseCase$invoke$1) {
            getRegularBusProductValidationMethodUseCase$invoke$1 = (GetRegularBusProductValidationMethodUseCase$invoke$1) continuationImpl;
            int i = getRegularBusProductValidationMethodUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRegularBusProductValidationMethodUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getRegularBusProductValidationMethodUseCase$invoke$1 = new GetRegularBusProductValidationMethodUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getRegularBusProductValidationMethodUseCase$invoke$1 = new GetRegularBusProductValidationMethodUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = getRegularBusProductValidationMethodUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getRegularBusProductValidationMethodUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            if ((validationProduct instanceof ValidationProduct.MobileTicketProduct.InstantTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.SingleJourneyTicketValidation) || (validationProduct instanceof ValidationProduct.QuickpayProduct.QuickpayValidation) || (validationProduct instanceof ValidationProduct.SuperPassProduct.MagicPassValidation) || (validationProduct instanceof ValidationProduct.SuperPassProduct.RideBasedPassValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.OndcMetroTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.OndcTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.MetroTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.MultiModalGroupTicketValidation)) {
                str = (String) ValidationProductKt.a(validationProduct).d();
            } else {
                if (!(validationProduct instanceof ValidationProduct.MobileTicketProduct.PremiumReserveTicketValidation)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "premiumReserveTicket";
            }
            getRegularBusProductValidationMethodUseCase$invoke$1.L$0 = str;
            getRegularBusProductValidationMethodUseCase$invoke$1.label = 1;
            objA = this.f10510a.a(getRegularBusProductValidationMethodUseCase$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) getRegularBusProductValidationMethodUseCase$invoke$1.L$0;
            ResultKt.b(objA);
        }
        RegularBusProductAndValidationMethodsForCity regularBusProductAndValidationMethodsForCity = (RegularBusProductAndValidationMethodsForCity) objA;
        if (regularBusProductAndValidationMethodsForCity == null) {
            return a(str);
        }
        Iterator it = regularBusProductAndValidationMethodsForCity.b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((RegularBusProductAndValidationMethod) next).f5696a, str));
        RegularBusProductAndValidationMethod regularBusProductAndValidationMethod = (RegularBusProductAndValidationMethod) next;
        return regularBusProductAndValidationMethod == null ? a(str) : regularBusProductAndValidationMethod;
    }
}
