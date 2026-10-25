package app.chalo.domain;

import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.minprofileupdate.MinProfileUpdateResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lapp/chalo/resultstatemanager/ResultStateData;", "Lapp/chalo/resultstatemanager/minprofileupdate/MinProfileUpdateResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.domain.ProductPurchaseMinProfileDecisionHelper$shouldProceedAfterMinProfileFlow$2$asyncResult$1", f = "ProductPurchaseMinProfileDecisionHelper.kt", l = {44}, m = "invokeSuspend", v = 1)
final class ProductPurchaseMinProfileDecisionHelper$shouldProceedAfterMinProfileFlow$2$asyncResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResultStateData<MinProfileUpdateResult>>, Object> {
    final /* synthetic */ Function1<Continuation<? super ResultStateData<MinProfileUpdateResult>>, Object> $minProfileStateResult;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductPurchaseMinProfileDecisionHelper$shouldProceedAfterMinProfileFlow$2$asyncResult$1(Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$minProfileStateResult = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductPurchaseMinProfileDecisionHelper$shouldProceedAfterMinProfileFlow$2$asyncResult$1(this.$minProfileStateResult, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductPurchaseMinProfileDecisionHelper$shouldProceedAfterMinProfileFlow$2$asyncResult$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        Function1<Continuation<? super ResultStateData<MinProfileUpdateResult>>, Object> function1 = this.$minProfileStateResult;
        this.label = 1;
        Object objInvoke = function1.invoke(this);
        return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
    }
}
