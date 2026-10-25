package app.chalo.userprofile.ui.minprofileupdate;

import androidx.compose.material3.SelectableDates;
import app.chalo.contract.BasicInfoContract;
import defpackage.s8;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent$handleDobFieldClickedIntent$1", f = "MinProfileUpdateComponent.kt", l = {352, 353}, m = "invokeSuspend", v = 1)
final class MinProfileUpdateComponent$handleDobFieldClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    long J$0;
    Object L$0;
    int label;
    final /* synthetic */ MinProfileUpdateComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinProfileUpdateComponent$handleDobFieldClickedIntent$1(MinProfileUpdateComponent minProfileUpdateComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = minProfileUpdateComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MinProfileUpdateComponent$handleDobFieldClickedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MinProfileUpdateComponent$handleDobFieldClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Long l;
        long j;
        Long l2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i == 1) {
                l = (Long) this.L$0;
                ResultKt.b(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j2 = this.J$0;
                Long l3 = (Long) this.L$0;
                ResultKt.b(obj);
                j = j2;
                l2 = l3;
            }
            this.this$0.E0(new s8(l2, j, (SelectableDates) obj, 4));
            return unit;
        }
        ResultKt.b(obj);
        MinProfileInputState minProfileInputState = (MinProfileInputState) CollectionsKt.L(((MinProfileUpdateDataState) this.this$0.f.getValue()).d, ((MinProfileUpdateDataState) this.this$0.f.getValue()).b);
        if (minProfileInputState != null && (minProfileInputState instanceof MinProfileInputState.NameAndDobInput)) {
            Long l4 = ((MinProfileInputState.NameAndDobInput) minProfileInputState).b;
            BasicInfoContract basicInfoContract = this.this$0.A;
            this.L$0 = l4;
            this.label = 1;
            Object objC = basicInfoContract.c(this);
            if (objC != coroutineSingletons) {
                l = l4;
                obj = objC;
            }
            return coroutineSingletons;
        }
        return unit;
        long jLongValue = ((Number) obj).longValue();
        MinProfileUpdateComponent minProfileUpdateComponent = this.this$0;
        this.L$0 = l;
        this.J$0 = jLongValue;
        this.label = 2;
        obj = minProfileUpdateComponent.P0(this);
        if (obj != coroutineSingletons) {
            j = jLongValue;
            l2 = l;
            this.this$0.E0(new s8(l2, j, (SelectableDates) obj, 4));
            return unit;
        }
        return coroutineSingletons;
    }
}
