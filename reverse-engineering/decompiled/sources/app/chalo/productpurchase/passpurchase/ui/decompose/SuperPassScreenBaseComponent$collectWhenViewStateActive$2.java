package app.chalo.productpurchase.passpurchase.ui.decompose;

import app.chalo.mvibase.simple.ViewStateCollectionResult;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\n"}, d2 = {"<anonymous>", "Lapp/chalo/mvibase/simple/ViewStateCollectionResult;", "T", "isViewStateCollectionActive", "", "flowResult", "Lkotlin/Pair;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.decompose.SuperPassScreenBaseComponent$collectWhenViewStateActive$2", f = "SuperPassScreenBaseComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class SuperPassScreenBaseComponent$collectWhenViewStateActive$2 extends SuspendLambda implements Function3<Boolean, Pair<Object, ? extends Integer>, Continuation<? super ViewStateCollectionResult<Object>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        SuperPassScreenBaseComponent$collectWhenViewStateActive$2 superPassScreenBaseComponent$collectWhenViewStateActive$2 = new SuperPassScreenBaseComponent$collectWhenViewStateActive$2(3, (Continuation) obj3);
        superPassScreenBaseComponent$collectWhenViewStateActive$2.Z$0 = zBooleanValue;
        superPassScreenBaseComponent$collectWhenViewStateActive$2.L$0 = (Pair) obj2;
        return superPassScreenBaseComponent$collectWhenViewStateActive$2.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        boolean z = this.Z$0;
        Pair pair = (Pair) this.L$0;
        return z ? new ViewStateCollectionResult.Data(pair.d(), ((Number) pair.e()).intValue()) : ViewStateCollectionResult.ScreenNotActive.f6002a;
    }
}
