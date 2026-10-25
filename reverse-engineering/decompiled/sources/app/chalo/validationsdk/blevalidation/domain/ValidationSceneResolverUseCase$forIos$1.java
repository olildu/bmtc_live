package app.chalo.validationsdk.blevalidation.domain;

import app.chalo.models.validation.BleValidationArgs;
import app.chalo.scenes.args.ValidationArgs;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.domain.ValidationSceneResolverUseCase", f = "ValidationSceneResolverUseCase.kt", l = {71}, m = "forIos", v = 1)
final class ValidationSceneResolverUseCase$forIos$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ValidationSceneResolverUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidationSceneResolverUseCase$forIos$1(ValidationSceneResolverUseCase validationSceneResolverUseCase, Continuation continuation) {
        super(continuation);
        this.this$0 = validationSceneResolverUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ValidationSceneResolverUseCase$forIos$1 validationSceneResolverUseCase$forIos$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        ValidationSceneResolverUseCase validationSceneResolverUseCase = this.this$0;
        validationSceneResolverUseCase.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            validationSceneResolverUseCase$forIos$1 = this;
        } else {
            validationSceneResolverUseCase$forIos$1 = new ValidationSceneResolverUseCase$forIos$1(validationSceneResolverUseCase, this);
        }
        Object obj2 = validationSceneResolverUseCase$forIos$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = validationSceneResolverUseCase$forIos$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        BleValidationArgs bleValidationArgs = (BleValidationArgs) validationSceneResolverUseCase$forIos$1.L$0;
        ResultKt.b(obj2);
        return !((Boolean) obj2).booleanValue() ? new ValidationArgs.QrValidationScreenArgs(bleValidationArgs) : new ValidationArgs.BleValidationScreenArgs(bleValidationArgs, false);
    }
}
