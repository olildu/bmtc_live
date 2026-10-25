package app.chalo.validation.superpass;

import app.chalo.contract.BasicInfoContract;
import app.chalo.superpass.data.models.entities.SuperPass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validation.superpass.SuperPassProductValidationModelKt$toSuperPassProductValidationModel$4", f = "SuperPassProductValidationModel.kt", l = {70, 70}, m = "invokeSuspend", v = 1)
final class SuperPassProductValidationModelKt$toSuperPassProductValidationModel$4 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    final /* synthetic */ BasicInfoContract $basicInfoContract;
    final /* synthetic */ SuperPass $this_toSuperPassProductValidationModel;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassProductValidationModelKt$toSuperPassProductValidationModel$4(SuperPass superPass, BasicInfoContract basicInfoContract, Continuation continuation) {
        super(1, continuation);
        this.$this_toSuperPassProductValidationModel = superPass;
        this.$basicInfoContract = basicInfoContract;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SuperPassProductValidationModelKt$toSuperPassProductValidationModel$4(this.$this_toSuperPassProductValidationModel, this.$basicInfoContract, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((SuperPassProductValidationModelKt$toSuperPassProductValidationModel$4) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SuperPass superPass;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            superPass = this.$this_toSuperPassProductValidationModel;
            BasicInfoContract basicInfoContract = this.$basicInfoContract;
            this.L$0 = superPass;
            this.label = 1;
            obj = basicInfoContract.c(this);
            if (obj != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        superPass = (SuperPass) this.L$0;
        ResultKt.b(obj);
        long jLongValue = ((Number) obj).longValue();
        this.L$0 = null;
        this.label = 2;
        Object objM = superPass.m(jLongValue, this);
        return objM == coroutineSingletons ? coroutineSingletons : objM;
    }
}
