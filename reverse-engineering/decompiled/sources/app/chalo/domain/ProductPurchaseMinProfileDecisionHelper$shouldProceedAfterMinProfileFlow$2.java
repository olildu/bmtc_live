package app.chalo.domain;

import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.minprofileupdate.MinProfileUpdateResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.domain.ProductPurchaseMinProfileDecisionHelper$shouldProceedAfterMinProfileFlow$2", f = "ProductPurchaseMinProfileDecisionHelper.kt", l = {48}, m = "invokeSuspend", v = 1)
final class ProductPurchaseMinProfileDecisionHelper$shouldProceedAfterMinProfileFlow$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ boolean $isSkipAllowed;
    final /* synthetic */ Function1<Continuation<? super ResultStateData<MinProfileUpdateResult>>, Object> $minProfileStateResult;
    final /* synthetic */ Function1<Boolean, Unit> $requestMinProfile;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductPurchaseMinProfileDecisionHelper$shouldProceedAfterMinProfileFlow$2(Function1 function1, boolean z, Function1 function2, Continuation continuation) {
        super(2, continuation);
        this.$requestMinProfile = function1;
        this.$isSkipAllowed = z;
        this.$minProfileStateResult = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ProductPurchaseMinProfileDecisionHelper$shouldProceedAfterMinProfileFlow$2 productPurchaseMinProfileDecisionHelper$shouldProceedAfterMinProfileFlow$2 = new ProductPurchaseMinProfileDecisionHelper$shouldProceedAfterMinProfileFlow$2(this.$requestMinProfile, this.$isSkipAllowed, this.$minProfileStateResult, continuation);
        productPurchaseMinProfileDecisionHelper$shouldProceedAfterMinProfileFlow$2.L$0 = obj;
        return productPurchaseMinProfileDecisionHelper$shouldProceedAfterMinProfileFlow$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductPurchaseMinProfileDecisionHelper$shouldProceedAfterMinProfileFlow$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            ResultKt.b(obj);
            Deferred deferredB = BuildersKt.b((CoroutineScope) this.L$0, null, null, new ProductPurchaseMinProfileDecisionHelper$shouldProceedAfterMinProfileFlow$2$asyncResult$1(this.$minProfileStateResult, null), 3);
            this.$requestMinProfile.invoke(Boolean.valueOf(this.$isSkipAllowed));
            this.label = 1;
            obj = deferredB.q(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ResultStateData resultStateData = (ResultStateData) obj;
        if (resultStateData instanceof ResultStateData.Cancelled) {
            z = this.$isSkipAllowed;
        } else {
            if (!(resultStateData instanceof ResultStateData.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            MinProfileUpdateResult minProfileUpdateResult = (MinProfileUpdateResult) ((ResultStateData.Success) resultStateData).f9039a;
            if (!minProfileUpdateResult.equals(MinProfileUpdateResult.ProfileUpdated.f9058a)) {
                if (!minProfileUpdateResult.equals(MinProfileUpdateResult.Skipped.f9059a) && !minProfileUpdateResult.equals(MinProfileUpdateResult.Dismissed.f9057a)) {
                    throw new NoWhenBranchMatchedException();
                }
                z = this.$isSkipAllowed;
            }
        }
        return Boolean.valueOf(z);
    }
}
