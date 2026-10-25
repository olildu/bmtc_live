package app.chalo.plotline;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.plotline.PlotlineContractImpl$setSuperPropertiesForPlotline$1", f = "PlotlineContractImpl.kt", l = {242}, m = "invokeSuspend", v = 1)
final class PlotlineContractImpl$setSuperPropertiesForPlotline$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<String, String> $superPropertiesMap;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PlotlineContractImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlotlineContractImpl$setSuperPropertiesForPlotline$1(PlotlineContractImpl plotlineContractImpl, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = plotlineContractImpl;
        this.$superPropertiesMap = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlotlineContractImpl$setSuperPropertiesForPlotline$1(this.this$0, this.$superPropertiesMap, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PlotlineContractImpl$setSuperPropertiesForPlotline$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PlotlineContractImpl plotlineContractImpl;
        Mutex mutex;
        Map<String, String> map;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            plotlineContractImpl = this.this$0;
            MutexImpl mutexImpl = plotlineContractImpl.s;
            Map<String, String> map2 = this.$superPropertiesMap;
            this.L$0 = mutexImpl;
            this.L$1 = plotlineContractImpl;
            this.L$2 = map2;
            this.label = 1;
            if (mutexImpl.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutex = mutexImpl;
            map = map2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) this.L$2;
            plotlineContractImpl = (PlotlineContractImpl) this.L$1;
            mutex = (Mutex) this.L$0;
            ResultKt.b(obj);
        }
        try {
            LinkedHashMap linkedHashMap = plotlineContractImpl.q;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            mutex.e(null);
            return Unit.f17538a;
        } catch (Throwable th) {
            mutex.e(null);
            throw th;
        }
    }
}
