package app.chalo.multimodalticket.domain;

import androidx.media3.extractor.ts.PsExtractor;
import app.chalo.multimodalticket.data.model.MultiModalGroupTicketEntity;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.internal.CombineKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$convertAll$$inlined$flatMapLatest$1", f = "MultiModalGroupTicketEntityToAppModelConverter.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 1)
public final class MultiModalGroupTicketEntityToAppModelConverter$convertAll$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends MultiModalGroupTicketAppModel>>, List<? extends MultiModalGroupTicketEntity>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ MultiModalGroupTicketEntityToAppModelConverter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiModalGroupTicketEntityToAppModelConverter$convertAll$$inlined$flatMapLatest$1(Continuation continuation, MultiModalGroupTicketEntityToAppModelConverter multiModalGroupTicketEntityToAppModelConverter) {
        super(3, continuation);
        this.this$0 = multiModalGroupTicketEntityToAppModelConverter;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MultiModalGroupTicketEntityToAppModelConverter$convertAll$$inlined$flatMapLatest$1 multiModalGroupTicketEntityToAppModelConverter$convertAll$$inlined$flatMapLatest$1 = new MultiModalGroupTicketEntityToAppModelConverter$convertAll$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        multiModalGroupTicketEntityToAppModelConverter$convertAll$$inlined$flatMapLatest$1.L$0 = (FlowCollector) obj;
        multiModalGroupTicketEntityToAppModelConverter$convertAll$$inlined$flatMapLatest$1.L$1 = obj2;
        return multiModalGroupTicketEntityToAppModelConverter$convertAll$$inlined$flatMapLatest$1.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Flow flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            List list = (List) this.L$1;
            if (list.isEmpty()) {
                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(EmptyList.f17557a);
            } else {
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(MultiModalGroupTicketEntityToAppModelConverter.a(this.this$0, (MultiModalGroupTicketEntity) it.next()));
                }
                final Flow[] flowArr = (Flow[]) CollectionsKt.D0(arrayList).toArray(new Flow[0]);
                flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new Flow<List<? extends MultiModalGroupTicketAppModel>>() { // from class: app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$convertAll$lambda$0$$inlined$combine$1

                    /* JADX INFO: renamed from: app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$convertAll$lambda$0$$inlined$combine$1$3, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\u0007"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$convertAll$lambda$0$$inlined$combine$1$3", f = "MultiModalGroupTicketEntityToAppModelConverter.kt", l = {288}, m = "invokeSuspend", v = 1)
                    public final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends MultiModalGroupTicketAppModel>>, MultiModalGroupTicketAppModel[], Continuation<? super Unit>, Object> {
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
                                ArrayList arrayListG = ArraysKt.G((MultiModalGroupTicketAppModel[]) ((Object[]) this.L$1));
                                this.label = 1;
                                if (flowCollector.emit(arrayListG, this) == coroutineSingletons) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector2, Continuation continuation) {
                        final Flow[] flowArr2 = flowArr;
                        Object objA = CombineKt.a(continuation, new Function0<MultiModalGroupTicketAppModel[]>() { // from class: app.chalo.multimodalticket.domain.MultiModalGroupTicketEntityToAppModelConverter$convertAll$lambda$0$$inlined$combine$1.2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return new MultiModalGroupTicketAppModel[flowArr2.length];
                            }
                        }, new AnonymousClass3(3, null), flowCollector2, flowArr2);
                        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
                    }
                };
            }
            this.label = 1;
            if (FlowKt.r(flowCollector, flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2, this) == coroutineSingletons) {
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
