package app.chalo.superpass.data.repository;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.superpass.data.repository.SuperPassRepository$deleteSuperPassProductData$2", f = "SuperPassRepository.kt", l = {78, 79, 80}, m = "invokeSuspend", v = 1)
final class SuperPassRepository$deleteSuperPassProductData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SuperPassRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassRepository$deleteSuperPassProductData$2(SuperPassRepository superPassRepository, Continuation continuation) {
        super(2, continuation);
        this.this$0 = superPassRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperPassRepository$deleteSuperPassProductData$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperPassRepository$deleteSuperPassProductData$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objC;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            SuperPassRepository superPassRepository = this.this$0;
            this.label = 1;
            Object objL = superPassRepository.b.l(this);
            if (objL != coroutineSingletons) {
                objL = unit;
            }
            if (objL != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            ResultKt.b(obj);
        }
        SuperPassRepository superPassRepository2 = this.this$0;
        this.label = 3;
        objC = superPassRepository2.b.C(this);
        if (objC != coroutineSingletons) {
            objC = unit;
        }
        if (objC != coroutineSingletons) {
            return coroutineSingletons;
        }
        return unit;
        SuperPassRepository superPassRepository3 = this.this$0;
        this.label = 2;
        Object objO = superPassRepository3.b.o(this);
        if (objO != coroutineSingletons) {
            objO = unit;
        }
        if (objO != coroutineSingletons) {
            SuperPassRepository superPassRepository4 = this.this$0;
            this.label = 3;
            objC = superPassRepository4.b.C(this);
            if (objC != coroutineSingletons) {
                objC = unit;
            }
            if (objC != coroutineSingletons) {
                return unit;
            }
        }
        return coroutineSingletons;
    }
}
