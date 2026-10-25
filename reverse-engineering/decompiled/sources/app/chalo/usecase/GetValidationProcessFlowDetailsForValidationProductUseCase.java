package app.chalo.usecase;

import app.chalo.instantticket.config.datastore.ProductBookingDataStore;
import app.chalo.models.validation.ValidationProcessFlowDetails;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.ondc.model.api.OndcTicketConfiguration;
import app.chalo.productbooking.common.data.models.app.ProductValidationType;
import app.chalo.tito.domain.CheckIsUnifiedTitoFlowEnabledUseCase;
import app.chalo.tito.domain.GetActiveTitoEntryForProductUseCase;
import app.chalo.titoridedetail.data.app.TITOValidationAppModel;
import app.chalo.titoridedetail.data.app.TapInDetailAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.validationsdk.blevalidation.GetValidationProcessFlowDetailsForValidationProductHelper;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usecase/GetValidationProcessFlowDetailsForValidationProductUseCase;", "Lapp/chalo/validationsdk/blevalidation/GetValidationProcessFlowDetailsForValidationProductHelper;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetValidationProcessFlowDetailsForValidationProductUseCase implements GetValidationProcessFlowDetailsForValidationProductHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckIsUnifiedTitoFlowEnabledUseCase f10198a;
    public final GetActiveTitoEntryForProductUseCase b;
    public final ProductBookingDataStore c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10199a;

        static {
            int[] iArr = new int[ProductValidationType.values().length];
            try {
                iArr[ProductValidationType.VEHICLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductValidationType.QR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductValidationType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10199a = iArr;
        }
    }

    public GetValidationProcessFlowDetailsForValidationProductUseCase(CheckIsUnifiedTitoFlowEnabledUseCase checkIsUnifiedTitoFlowEnabledUseCase, GetActiveTitoEntryForProductUseCase getActiveTitoEntryForProductUseCase, ProductBookingDataStore productBookingDataStore) {
        this.f10198a = checkIsUnifiedTitoFlowEnabledUseCase;
        this.b = getActiveTitoEntryForProductUseCase;
        this.c = productBookingDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:39:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ValidationProduct validationProduct, ContinuationImpl continuationImpl) {
        GetValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1 getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1;
        ChaloUseCaseResult chaloUseCaseResult;
        Object objB;
        if (continuationImpl instanceof GetValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1) {
            getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1 = (GetValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1) continuationImpl;
            int i = getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1.label = i - Integer.MIN_VALUE;
            } else {
                getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1 = new GetValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1(this, continuationImpl);
            }
        } else {
            getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1 = new GetValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1(this, continuationImpl);
        }
        Object objA = getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            String c = validationProduct.getC();
            getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1.L$0 = validationProduct;
            getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1.label = 1;
            objA = this.b.a(c, getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1);
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            validationProduct = (ValidationProduct) getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1.L$0;
            ResultKt.b(objA);
        } else {
            if (i2 == 2) {
                validationProduct = (ValidationProduct) getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1.L$0;
                ResultKt.b(objA);
                chaloUseCaseResult = (ChaloUseCaseResult) objA;
                if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                    getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1.L$0 = validationProduct;
                    getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1.label = 3;
                    objA = this.f10198a.a(getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1);
                    if (objA != obj) {
                    }
                    return obj;
                }
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    throw new NoWhenBranchMatchedException();
                }
                TITOValidationAppModel tITOValidationAppModel = (TITOValidationAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                TapInDetailAppModel tapInDetailAppModel = tITOValidationAppModel.f9672a;
                return new ValidationProcessFlowDetails.TapOutValidation(tITOValidationAppModel.c.c, tapInDetailAppModel.c, tapInDetailAppModel.f9673a, tapInDetailAppModel.d);
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA);
                return objA;
            }
            validationProduct = (ValidationProduct) getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1.L$0;
            ResultKt.b(objA);
        }
        if (((Boolean) objA).booleanValue()) {
            return ValidationProcessFlowDetails.ConductorOrTapInUnifiedFlow.INSTANCE;
        }
        getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1.L$0 = null;
        getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1.label = 4;
        objB = b(validationProduct, getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1);
        if (objB != obj) {
            return obj;
        }
        return objB;
        getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1.L$0 = validationProduct;
        getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1.label = 2;
        objA = FlowKt.t((Flow) objA, getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1);
        if (objA != obj) {
            chaloUseCaseResult = (ChaloUseCaseResult) objA;
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    throw new NoWhenBranchMatchedException();
                }
                TITOValidationAppModel tITOValidationAppModel2 = (TITOValidationAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                TapInDetailAppModel tapInDetailAppModel2 = tITOValidationAppModel2.f9672a;
                return new ValidationProcessFlowDetails.TapOutValidation(tITOValidationAppModel2.c.c, tapInDetailAppModel2.c, tapInDetailAppModel2.f9673a, tapInDetailAppModel2.d);
            }
            getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1.L$0 = validationProduct;
            getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1.label = 3;
            objA = this.f10198a.a(getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1);
            if (objA != obj) {
                if (((Boolean) objA).booleanValue()) {
                    return ValidationProcessFlowDetails.ConductorOrTapInUnifiedFlow.INSTANCE;
                }
                getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1.L$0 = null;
                getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1.label = 4;
                objB = b(validationProduct, getValidationProcessFlowDetailsForValidationProductUseCase$getFlowDetailsFromValidationProduct$1);
                if (objB != obj) {
                    return objB;
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ValidationProduct validationProduct, ContinuationImpl continuationImpl) {
        GetValidationProcessFlowDetailsForValidationProductUseCase$getValidationProcessFlowDetailsForNonTitoValidation$1 getValidationProcessFlowDetailsForValidationProductUseCase$getValidationProcessFlowDetailsForNonTitoValidation$1;
        ProductValidationType productValidationType;
        if (continuationImpl instanceof GetValidationProcessFlowDetailsForValidationProductUseCase$getValidationProcessFlowDetailsForNonTitoValidation$1) {
            getValidationProcessFlowDetailsForValidationProductUseCase$getValidationProcessFlowDetailsForNonTitoValidation$1 = (GetValidationProcessFlowDetailsForValidationProductUseCase$getValidationProcessFlowDetailsForNonTitoValidation$1) continuationImpl;
            int i = getValidationProcessFlowDetailsForValidationProductUseCase$getValidationProcessFlowDetailsForNonTitoValidation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getValidationProcessFlowDetailsForValidationProductUseCase$getValidationProcessFlowDetailsForNonTitoValidation$1.label = i - Integer.MIN_VALUE;
            } else {
                getValidationProcessFlowDetailsForValidationProductUseCase$getValidationProcessFlowDetailsForNonTitoValidation$1 = new GetValidationProcessFlowDetailsForValidationProductUseCase$getValidationProcessFlowDetailsForNonTitoValidation$1(this, continuationImpl);
            }
        } else {
            getValidationProcessFlowDetailsForValidationProductUseCase$getValidationProcessFlowDetailsForNonTitoValidation$1 = new GetValidationProcessFlowDetailsForValidationProductUseCase$getValidationProcessFlowDetailsForNonTitoValidation$1(this, continuationImpl);
        }
        Object objC = getValidationProcessFlowDetailsForValidationProductUseCase$getValidationProcessFlowDetailsForNonTitoValidation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getValidationProcessFlowDetailsForValidationProductUseCase$getValidationProcessFlowDetailsForNonTitoValidation$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            if ((validationProduct instanceof ValidationProduct.QuickpayProduct) || (validationProduct instanceof ValidationProduct.SuperPassProduct) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.InstantTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.PremiumReserveTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.SingleJourneyTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.MetroTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.OndcMetroTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.MultiModalGroupTicketValidation)) {
                return ValidationProcessFlowDetails.ConductorValidation.INSTANCE;
            }
            if (!(validationProduct instanceof ValidationProduct.MobileTicketProduct.OndcTicketValidation)) {
                throw new NoWhenBranchMatchedException();
            }
            getValidationProcessFlowDetailsForValidationProductUseCase$getValidationProcessFlowDetailsForNonTitoValidation$1.label = 1;
            objC = this.c.c(getValidationProcessFlowDetailsForValidationProductUseCase$getValidationProcessFlowDetailsForNonTitoValidation$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        OndcTicketConfiguration ondcTicketConfiguration = (OndcTicketConfiguration) objC;
        if (ondcTicketConfiguration == null || (productValidationType = ondcTicketConfiguration.g) == null) {
            return ValidationProcessFlowDetails.ConductorValidation.INSTANCE;
        }
        int i3 = WhenMappings.f10199a[productValidationType.ordinal()];
        if (i3 == 1) {
            return ValidationProcessFlowDetails.VehicleBasedValidation.INSTANCE;
        }
        if (i3 == 2 || i3 == 3) {
            return ValidationProcessFlowDetails.ConductorValidation.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
