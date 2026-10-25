package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.home.domain.GetPremiumPassExpiryEligibilityForPurchaseUseCase;
import app.chalo.home.domain.PassExpiryEligibilityAndDate;
import app.chalo.models.SuperPassProductConfigurationProperties;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel$updatePassStartDateRolloverBanner$1", f = "ConfirmSuperPassPurchaseViewModel.kt", l = {1899, 1908}, m = "invokeSuspend", v = 1)
final class ConfirmSuperPassPurchaseViewModel$updatePassStartDateRolloverBanner$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $passStartTime;
    final /* synthetic */ SuperPassProductConfigurationProperties $superPassProductConfigurationProperties;
    Object L$0;
    int label;
    final /* synthetic */ ConfirmSuperPassPurchaseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmSuperPassPurchaseViewModel$updatePassStartDateRolloverBanner$1(ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel, SuperPassProductConfigurationProperties superPassProductConfigurationProperties, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = confirmSuperPassPurchaseViewModel;
        this.$superPassProductConfigurationProperties = superPassProductConfigurationProperties;
        this.$passStartTime = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConfirmSuperPassPurchaseViewModel$updatePassStartDateRolloverBanner$1(this.this$0, this.$superPassProductConfigurationProperties, this.$passStartTime, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfirmSuperPassPurchaseViewModel$updatePassStartDateRolloverBanner$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc A[LOOP:0: B:28:0x0086->B:36:0x00bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objA;
        Object objE;
        Long l;
        String str;
        long j;
        MutableStateFlow mutableStateFlow;
        Object value;
        long j2;
        ConfirmSuperPassPurchaseDataState confirmSuperPassPurchaseDataState;
        PassValidityInfo passValidityInfo;
        PassValidityInfo passValidityInfoA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            GetPremiumPassExpiryEligibilityForPurchaseUseCase getPremiumPassExpiryEligibilityForPurchaseUseCase = this.this$0.E;
            SuperPassProductConfigurationProperties superPassProductConfigurationProperties = this.$superPassProductConfigurationProperties;
            this.label = 1;
            objA = getPremiumPassExpiryEligibilityForPurchaseUseCase.a(superPassProductConfigurationProperties, this);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
            objA = obj;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l = (Long) this.L$0;
            ResultKt.b(obj);
            objE = obj;
        }
        str = (String) objE;
        ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel = this.this$0;
        j = this.$passStartTime;
        mutableStateFlow = confirmSuperPassPurchaseViewModel.e;
        while (true) {
            value = mutableStateFlow.getValue();
            j2 = j;
            confirmSuperPassPurchaseDataState = (ConfirmSuperPassPurchaseDataState) value;
            passValidityInfo = confirmSuperPassPurchaseDataState.j;
            if (passValidityInfo != null) {
                passValidityInfoA = PassValidityInfo.a(passValidityInfo, l, Long.valueOf(j2));
            } else {
                passValidityInfoA = null;
            }
            if (mutableStateFlow.c(value, ConfirmSuperPassPurchaseDataState.a(confirmSuperPassPurchaseDataState, false, false, null, null, null, str, null, null, passValidityInfoA, null, 1471))) {
                return Unit.f17538a;
            }
            j = j2;
        }
        PassExpiryEligibilityAndDate passExpiryEligibilityAndDate = (PassExpiryEligibilityAndDate) objA;
        ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel2 = this.this$0;
        Long l2 = new Long(this.$passStartTime);
        PassValidityInfo passValidityInfo2 = ((ConfirmSuperPassPurchaseDataState) this.this$0.f.getValue()).j;
        Long l3 = passValidityInfo2 != null ? passValidityInfo2.b : null;
        confirmSuperPassPurchaseViewModel2.getClass();
        Long lD = ConfirmSuperPassPurchaseViewModel.D(l2, l3);
        Long lA = passExpiryEligibilityAndDate.a();
        boolean z = lA != null && this.$passStartTime == lA.longValue();
        ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel3 = this.this$0;
        this.L$0 = lD;
        this.label = 2;
        objE = confirmSuperPassPurchaseViewModel3.E(z, lD, this);
        if (objE != coroutineSingletons) {
            l = lD;
            str = (String) objE;
            ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel4 = this.this$0;
            j = this.$passStartTime;
            mutableStateFlow = confirmSuperPassPurchaseViewModel4.e;
            while (true) {
                value = mutableStateFlow.getValue();
                j2 = j;
                confirmSuperPassPurchaseDataState = (ConfirmSuperPassPurchaseDataState) value;
                passValidityInfo = confirmSuperPassPurchaseDataState.j;
                if (passValidityInfo != null) {
                    passValidityInfoA = PassValidityInfo.a(passValidityInfo, l, Long.valueOf(j2));
                } else {
                    passValidityInfoA = null;
                }
                if (mutableStateFlow.c(value, ConfirmSuperPassPurchaseDataState.a(confirmSuperPassPurchaseDataState, false, false, null, null, null, str, null, null, passValidityInfoA, null, 1471))) {
                    return Unit.f17538a;
                }
                j = j2;
            }
        }
        return coroutineSingletons;
    }
}
