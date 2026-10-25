package app.chalo.checkout.domain.razorpay;

import app.chalo.checkout.domain.error.RazorpayVPAValidation;
import app.chalo.checkout.domain.error.VPAValidationError;
import app.chalo.checkout.utility.IRazorPayHelper;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.checkout.domain.razorpay.ValidateVPAUseCase", f = "ValidateVPAUseCase.kt", l = {13}, m = "invoke", v = 1)
final class ValidateVPAUseCase$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ValidateVPAUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateVPAUseCase$invoke$1(ValidateVPAUseCase validateVPAUseCase, Continuation continuation) {
        super(continuation);
        this.this$0 = validateVPAUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ValidateVPAUseCase$invoke$1 validateVPAUseCase$invoke$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        ValidateVPAUseCase validateVPAUseCase = this.this$0;
        validateVPAUseCase.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            validateVPAUseCase$invoke$1 = this;
        } else {
            validateVPAUseCase$invoke$1 = new ValidateVPAUseCase$invoke$1(validateVPAUseCase, this);
        }
        Object objE = validateVPAUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = validateVPAUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objE);
                IRazorPayHelper iRazorPayHelper = validateVPAUseCase.f1401a;
                validateVPAUseCase$invoke$1.label = 1;
                objE = iRazorPayHelper.e(validateVPAUseCase$invoke$1);
                if (objE == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objE);
            }
            int i3 = ValidateVPAUseCase.WhenMappings.f1402a[((RazorpayVPAValidation) objE).ordinal()];
            if (i3 == 1) {
                return new ChaloUseCaseResult.Success(Boolean.TRUE);
            }
            if (i3 == 2) {
                return new ChaloUseCaseResult.Failure(VPAValidationError.INVALID_VPA);
            }
            if (i3 == 3) {
                return new ChaloUseCaseResult.Failure(VPAValidationError.API_ERROR);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception unused) {
            return new ChaloUseCaseResult.Failure(VPAValidationError.API_ERROR);
        }
    }
}
