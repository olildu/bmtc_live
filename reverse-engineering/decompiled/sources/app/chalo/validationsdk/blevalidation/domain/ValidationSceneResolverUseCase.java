package app.chalo.validationsdk.blevalidation.domain;

import app.chalo.blevalidation.IsBluetoothFeatureAvailableUseCase;
import app.chalo.models.validation.BleValidationArgs;
import app.chalo.models.validation.ValidationProcessFlowDetails;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.scenes.args.ValidationArgs;
import app.chalo.validationsdk.blevalidation.domain.configuration.CheckIsBleValidationEnabledUseCase;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/domain/ValidationSceneResolverUseCase;", "", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ValidationSceneResolverUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IsBluetoothFeatureAvailableUseCase f10508a;
    public final CheckIsBleValidationEnabledUseCase b;

    public ValidationSceneResolverUseCase(IsBluetoothFeatureAvailableUseCase isBluetoothFeatureAvailableUseCase, CheckIsBleValidationEnabledUseCase checkIsBleValidationEnabledUseCase) {
        this.f10508a = isBluetoothFeatureAvailableUseCase;
        this.b = checkIsBleValidationEnabledUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(BleValidationArgs bleValidationArgs, ContinuationImpl continuationImpl) {
        ValidationSceneResolverUseCase$forAndroid$1 validationSceneResolverUseCase$forAndroid$1;
        if (continuationImpl instanceof ValidationSceneResolverUseCase$forAndroid$1) {
            validationSceneResolverUseCase$forAndroid$1 = (ValidationSceneResolverUseCase$forAndroid$1) continuationImpl;
            int i = validationSceneResolverUseCase$forAndroid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                validationSceneResolverUseCase$forAndroid$1.label = i - Integer.MIN_VALUE;
            } else {
                validationSceneResolverUseCase$forAndroid$1 = new ValidationSceneResolverUseCase$forAndroid$1(this, continuationImpl);
            }
        } else {
            validationSceneResolverUseCase$forAndroid$1 = new ValidationSceneResolverUseCase$forAndroid$1(this, continuationImpl);
        }
        Object objA = validationSceneResolverUseCase$forAndroid$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = validationSceneResolverUseCase$forAndroid$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(objA);
            ValidationProduct validationProduct = bleValidationArgs.b;
            if ((validationProduct instanceof ValidationProduct.MobileTicketProduct.OndcMetroTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.OndcTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.MetroTicketValidation)) {
                return bleValidationArgs.c instanceof ValidationProcessFlowDetails.VehicleBasedValidation ? new ValidationArgs.QrScannerValidationArgs(bleValidationArgs) : new ValidationArgs.QrValidationScreenArgs(bleValidationArgs);
            }
            if (!(validationProduct instanceof ValidationProduct.MobileTicketProduct.InstantTicketValidation) && !(validationProduct instanceof ValidationProduct.MobileTicketProduct.PremiumReserveTicketValidation) && !(validationProduct instanceof ValidationProduct.MobileTicketProduct.SingleJourneyTicketValidation) && !(validationProduct instanceof ValidationProduct.QuickpayProduct.QuickpayValidation) && !(validationProduct instanceof ValidationProduct.SuperPassProduct.MagicPassValidation) && !(validationProduct instanceof ValidationProduct.SuperPassProduct.RideBasedPassValidation)) {
                if (validationProduct instanceof ValidationProduct.MobileTicketProduct.MultiModalGroupTicketValidation) {
                    return new ValidationArgs.MultiProductValidation(bleValidationArgs);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (this.f10508a.a()) {
                validationSceneResolverUseCase$forAndroid$1.L$0 = bleValidationArgs;
                validationSceneResolverUseCase$forAndroid$1.label = 1;
                objA = this.b.a(validationProduct, validationSceneResolverUseCase$forAndroid$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return z ? new ValidationArgs.QrValidationScreenArgs(bleValidationArgs) : new ValidationArgs.BleValidationScreenArgs(bleValidationArgs, false);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bleValidationArgs = (BleValidationArgs) validationSceneResolverUseCase$forAndroid$1.L$0;
        ResultKt.b(objA);
        if (((Boolean) objA).booleanValue()) {
            z = false;
        }
        if (z) {
        }
    }
}
