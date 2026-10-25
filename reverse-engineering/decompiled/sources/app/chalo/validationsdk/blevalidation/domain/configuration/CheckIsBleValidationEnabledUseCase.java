package app.chalo.validationsdk.blevalidation.domain.configuration;

import app.chalo.contract.BasicInfoContract;
import app.chalo.models.validation.RegularBusProductAndValidationMethod;
import app.chalo.models.validation.RegularBusSlBleConfig;
import app.chalo.models.validation.ValidationProduct;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/domain/configuration/CheckIsBleValidationEnabledUseCase;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckIsBleValidationEnabledUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicInfoContract f10509a;
    public final GetRegularBusProductValidationMethodUseCase b;

    public CheckIsBleValidationEnabledUseCase(BasicInfoContract basicInfoContract, GetRegularBusProductValidationMethodUseCase getRegularBusProductValidationMethodUseCase) {
        this.f10509a = basicInfoContract;
        this.b = getRegularBusProductValidationMethodUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ValidationProduct validationProduct, ContinuationImpl continuationImpl) {
        CheckIsBleValidationEnabledUseCase$invoke$1 checkIsBleValidationEnabledUseCase$invoke$1;
        if (continuationImpl instanceof CheckIsBleValidationEnabledUseCase$invoke$1) {
            checkIsBleValidationEnabledUseCase$invoke$1 = (CheckIsBleValidationEnabledUseCase$invoke$1) continuationImpl;
            int i = checkIsBleValidationEnabledUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkIsBleValidationEnabledUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                checkIsBleValidationEnabledUseCase$invoke$1 = new CheckIsBleValidationEnabledUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            checkIsBleValidationEnabledUseCase$invoke$1 = new CheckIsBleValidationEnabledUseCase$invoke$1(this, continuationImpl);
        }
        Object objB = checkIsBleValidationEnabledUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkIsBleValidationEnabledUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            checkIsBleValidationEnabledUseCase$invoke$1.label = 1;
            objB = this.b.b(validationProduct, checkIsBleValidationEnabledUseCase$invoke$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        RegularBusSlBleConfig regularBusSlBleConfig = ((RegularBusProductAndValidationMethod) objB).b;
        return Boolean.valueOf(regularBusSlBleConfig != null ? regularBusSlBleConfig.a(this.f10509a.h()) : true);
    }
}
