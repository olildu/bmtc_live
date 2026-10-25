package app.chalo.features.chaloconfig.impl;

import app.chalo.features.chaloconfig.ChaloConfigCacheStatus;
import app.chalo.features.chaloconfig.ChaloConfigFetchStatus;
import app.chalo.features.chaloconfig.ChaloConfigStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.features.chaloconfig.impl.ChaloConfigFeatureImpl$initializeChaloConfigDataStatusCollection$1", f = "ChaloConfigFeatureImpl.kt", l = {79}, m = "invokeSuspend", v = 1)
final class ChaloConfigFeatureImpl$initializeChaloConfigDataStatusCollection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChaloConfigFeatureImpl this$0;

    /* JADX INFO: renamed from: app.chalo.features.chaloconfig.impl.ChaloConfigFeatureImpl$initializeChaloConfigDataStatusCollection$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lapp/chalo/features/chaloconfig/ChaloConfigStatus;", "cacheStatus", "Lapp/chalo/features/chaloconfig/ChaloConfigCacheStatus;", "fetchStatus", "Lapp/chalo/features/chaloconfig/ChaloConfigFetchStatus;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.features.chaloconfig.impl.ChaloConfigFeatureImpl$initializeChaloConfigDataStatusCollection$1$1", f = "ChaloConfigFeatureImpl.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function3<ChaloConfigCacheStatus, ChaloConfigFetchStatus, Continuation<? super ChaloConfigStatus>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (Continuation) obj3);
            anonymousClass1.L$0 = (ChaloConfigCacheStatus) obj;
            anonymousClass1.L$1 = (ChaloConfigFetchStatus) obj2;
            return anonymousClass1.invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return new ChaloConfigStatus((ChaloConfigCacheStatus) this.L$0, (ChaloConfigFetchStatus) this.L$1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloConfigFeatureImpl$initializeChaloConfigDataStatusCollection$1(ChaloConfigFeatureImpl chaloConfigFeatureImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloConfigFeatureImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloConfigFeatureImpl$initializeChaloConfigDataStatusCollection$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloConfigFeatureImpl$initializeChaloConfigDataStatusCollection$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ChaloConfigCacheManager chaloConfigCacheManager = this.this$0.f2656a;
            FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(chaloConfigCacheManager.i, chaloConfigCacheManager.g, new AnonymousClass1(3, null));
            final ChaloConfigFeatureImpl chaloConfigFeatureImpl = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.features.chaloconfig.impl.ChaloConfigFeatureImpl$initializeChaloConfigDataStatusCollection$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    chaloConfigFeatureImpl.d.emit((ChaloConfigStatus) obj2, continuation);
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(flowCollector, this) == coroutineSingletons) {
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
