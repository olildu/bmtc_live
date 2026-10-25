package app.chalo.multimodalticket.domain;

import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketChildAppModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.CombineKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$$inlined$unsafeFlow$3", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiModalGroupTicketEntityToAppModelConverter$toAppModelFlow$$inlined$combine$1 implements Flow<List<? extends MultiModalGroupTicketChildAppModel>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Flow[] f5895a;

    /* JADX INFO: renamed from: app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$toAppModelFlow$$inlined$combine$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\u0007"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$toAppModelFlow$$inlined$combine$1$3", f = "MultiModalGroupTicketEntityToAppModelConverter.kt", l = {288}, m = "invokeSuspend", v = 1)
    public final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends MultiModalGroupTicketChildAppModel>>, MultiModalGroupTicketChildAppModel[], Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(3, (Continuation) obj3);
            anonymousClass3.L$0 = (FlowCollector) obj;
            anonymousClass3.L$1 = (Object[]) obj2;
            return anonymousClass3.invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                List listH0 = ArraysKt.h0((MultiModalGroupTicketChildAppModel[]) ((Object[]) this.L$1));
                this.label = 1;
                if (flowCollector.emit(listH0, this) == coroutineSingletons) {
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

    public MultiModalGroupTicketEntityToAppModelConverter$toAppModelFlow$$inlined$combine$1(Flow[] flowArr) {
        this.f5895a = flowArr;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        final Flow[] flowArr = this.f5895a;
        Object objA = CombineKt.a(continuation, new Function0<MultiModalGroupTicketChildAppModel[]>() { // from class: app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$toAppModelFlow$$inlined$combine$1.2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new MultiModalGroupTicketChildAppModel[flowArr.length];
            }
        }, new AnonymousClass3(3, null), flowCollector, flowArr);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
    }
}
