package app.chalo.home.ui.chalobus;

import defpackage.ah;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusComponent$observeTabVisibility$1", f = "ChaloBusComponent.kt", l = {288}, m = "invokeSuspend", v = 1)
final class ChaloBusComponent$observeTabVisibility$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChaloBusComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusComponent$observeTabVisibility$1(ChaloBusComponent chaloBusComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBusComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloBusComponent$observeTabVisibility$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusComponent$observeTabVisibility$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            final ChaloBusComponent chaloBusComponent = this.this$0;
            Flow flow = chaloBusComponent.k0;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.home.ui.chalobus.ChaloBusComponent$observeTabVisibility$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ChaloBusViewIntent.ChaloBusScreenStopIntent chaloBusScreenStopIntent = ChaloBusViewIntent.ChaloBusScreenStopIntent.f3263a;
                    ChaloBusComponent chaloBusComponent2 = chaloBusComponent;
                    if (zBooleanValue && !chaloBusComponent2.f0) {
                        chaloBusComponent2.f0 = true;
                        if (!chaloBusComponent2.g0) {
                            chaloBusComponent2.g0 = true;
                            chaloBusComponent2.E0(new ah(7));
                        }
                        boolean z = chaloBusComponent2.i0;
                        ChaloBusViewIntent.ChaloBusScreenViewStartedIntent chaloBusScreenViewStartedIntent = ChaloBusViewIntent.ChaloBusScreenViewStartedIntent.f3264a;
                        if (z) {
                            chaloBusComponent2.i0 = false;
                            chaloBusComponent2.Z0(chaloBusScreenStopIntent);
                            chaloBusComponent2.Z0(chaloBusScreenViewStartedIntent);
                        } else {
                            chaloBusComponent2.Z0(chaloBusScreenViewStartedIntent);
                        }
                    } else if (!zBooleanValue && chaloBusComponent2.f0) {
                        chaloBusComponent2.f0 = false;
                        chaloBusComponent2.Z0(chaloBusScreenStopIntent);
                    }
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flow.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
