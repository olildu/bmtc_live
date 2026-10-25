package app.chalo.titoridedetail.domain;

import app.chalo.models.validation.ValidationProduct;
import app.chalo.models.validation.ValidationProductKt;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.superpass.data.models.entities.SuperPassSubType;
import app.chalo.tito.domain.GetSuperPassForSuperPassIdUseCase;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/domain/HandleLastProductActivationOnTitoMissedTapOutUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HandleLastProductActivationOnTitoMissedTapOutUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetSuperPassForSuperPassIdUseCase f9693a;

    public HandleLastProductActivationOnTitoMissedTapOutUseCase(GetSuperPassForSuperPassIdUseCase getSuperPassForSuperPassIdUseCase) {
        this.f9693a = getSuperPassForSuperPassIdUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, ValidationProduct validationProduct, ContinuationImpl continuationImpl) {
        HandleLastProductActivationOnTitoMissedTapOutUseCase$invoke$1 handleLastProductActivationOnTitoMissedTapOutUseCase$invoke$1;
        if (continuationImpl instanceof HandleLastProductActivationOnTitoMissedTapOutUseCase$invoke$1) {
            handleLastProductActivationOnTitoMissedTapOutUseCase$invoke$1 = (HandleLastProductActivationOnTitoMissedTapOutUseCase$invoke$1) continuationImpl;
            int i = handleLastProductActivationOnTitoMissedTapOutUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                handleLastProductActivationOnTitoMissedTapOutUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                handleLastProductActivationOnTitoMissedTapOutUseCase$invoke$1 = new HandleLastProductActivationOnTitoMissedTapOutUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            handleLastProductActivationOnTitoMissedTapOutUseCase$invoke$1 = new HandleLastProductActivationOnTitoMissedTapOutUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = handleLastProductActivationOnTitoMissedTapOutUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = handleLastProductActivationOnTitoMissedTapOutUseCase$invoke$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objA);
            if ((validationProduct instanceof ValidationProduct.MobileTicketProduct.InstantTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.PremiumReserveTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.SingleJourneyTicketValidation) || (validationProduct instanceof ValidationProduct.QuickpayProduct.QuickpayValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.OndcMetroTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.OndcTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.MetroTicketValidation) || (validationProduct instanceof ValidationProduct.MobileTicketProduct.MultiModalGroupTicketValidation)) {
                return unit;
            }
            if (!(validationProduct instanceof ValidationProduct.SuperPassProduct.MagicPassValidation) && !(validationProduct instanceof ValidationProduct.SuperPassProduct.RideBasedPassValidation)) {
                throw new NoWhenBranchMatchedException();
            }
            String c = validationProduct.getC();
            SuperPassSubType.Companion companion = SuperPassSubType.INSTANCE;
            String str = (String) ValidationProductKt.a(validationProduct).e();
            companion.getClass();
            SuperPassSubType superPassSubTypeA = SuperPassSubType.Companion.a(str);
            handleLastProductActivationOnTitoMissedTapOutUseCase$invoke$1.J$0 = j;
            handleLastProductActivationOnTitoMissedTapOutUseCase$invoke$1.label = 1;
            objA = this.f9693a.a(c, superPassSubTypeA, handleLastProductActivationOnTitoMissedTapOutUseCase$invoke$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
            return unit;
        }
        j = handleLastProductActivationOnTitoMissedTapOutUseCase$invoke$1.J$0;
        ResultKt.b(objA);
        SuperPass superPass = (SuperPass) objA;
        if (superPass != null) {
            handleLastProductActivationOnTitoMissedTapOutUseCase$invoke$1.label = 2;
            if (superPass.n(j, handleLastProductActivationOnTitoMissedTapOutUseCase$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }
}
