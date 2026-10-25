package app.chalo.productpurchase.passpurchase.ui.enteruserdetails;

import app.chalo.contract.BasicInfoContract;
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
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel$handleDobFieldClickedIntent$1", f = "SuperPassEnterUserDetailsViewModel.kt", l = {368, 369}, m = "invokeSuspend", v = 1)
final class SuperPassEnterUserDetailsViewModel$handleDobFieldClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    long J$0;
    int label;
    final /* synthetic */ SuperPassEnterUserDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassEnterUserDetailsViewModel$handleDobFieldClickedIntent$1(SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = superPassEnterUserDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperPassEnterUserDetailsViewModel$handleDobFieldClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperPassEnterUserDetailsViewModel$handleDobFieldClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object objQ;
        long j;
        long jLongValue;
        MutableStateFlow mutableStateFlow;
        Object value;
        SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState;
        Long l;
        long jLongValue2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            BasicInfoContract basicInfoContract = this.this$0.n;
            this.label = 1;
            objC = basicInfoContract.c(this);
            if (objC != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
            objC = obj;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = this.J$0;
            ResultKt.b(obj);
            j = j2;
            objQ = obj;
        }
        jLongValue = ((Number) objQ).longValue();
        this.this$0.i(new SuperPassEnterUserDetailsEffect.FocusRequester(false));
        mutableStateFlow = this.this$0.e;
        do {
            value = mutableStateFlow.getValue();
            superPassEnterUserDetailsDataState = (SuperPassEnterUserDetailsDataState) value;
            l = superPassEnterUserDetailsDataState.c;
            if (l == null) {
                jLongValue2 = j;
            } else {
                if (l.longValue() == -1) {
                    l = null;
                }
                if (l != null) {
                    jLongValue2 = l.longValue();
                } else {
                    jLongValue2 = j;
                }
            }
        } while (!mutableStateFlow.c(value, SuperPassEnterUserDetailsDataState.a(superPassEnterUserDetailsDataState, null, null, null, null, false, null, new SuperPassBasicDetailsDialogType.DobDatePicker(Long.valueOf(jLongValue2), jLongValue, j), 63)));
        return Unit.f17538a;
        long jLongValue3 = ((Number) objC).longValue();
        SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel = this.this$0;
        this.J$0 = jLongValue3;
        this.label = 2;
        objQ = SuperPassEnterUserDetailsViewModel.q(superPassEnterUserDetailsViewModel, this);
        if (objQ != coroutineSingletons) {
            j = jLongValue3;
            jLongValue = ((Number) objQ).longValue();
            this.this$0.i(new SuperPassEnterUserDetailsEffect.FocusRequester(false));
            mutableStateFlow = this.this$0.e;
            do {
                value = mutableStateFlow.getValue();
                superPassEnterUserDetailsDataState = (SuperPassEnterUserDetailsDataState) value;
                l = superPassEnterUserDetailsDataState.c;
                if (l == null) {
                    jLongValue2 = j;
                } else {
                    if (l.longValue() == -1) {
                        l = null;
                    }
                    if (l != null) {
                        jLongValue2 = l.longValue();
                    } else {
                        jLongValue2 = j;
                    }
                }
            } while (!mutableStateFlow.c(value, SuperPassEnterUserDetailsDataState.a(superPassEnterUserDetailsDataState, null, null, null, null, false, null, new SuperPassBasicDetailsDialogType.DobDatePicker(Long.valueOf(jLongValue2), jLongValue, j), 63)));
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }
}
