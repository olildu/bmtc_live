package app.chalo.home.domain;

import app.chalo.models.UserBookingsStatusType;
import app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$map$1 implements Flow<List<? extends MultiModalGroupTicketAppModel>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Flow f3013a;
    public final /* synthetic */ GetAllRequestedBookedProductsUseCase b;
    public final /* synthetic */ UserBookingsStatusType c;

    /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$map$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FlowCollector f3014a;
        public final /* synthetic */ GetAllRequestedBookedProductsUseCase b;
        public final /* synthetic */ UserBookingsStatusType c;

        /* JADX INFO: renamed from: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$map$1$2$1, reason: invalid class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$map$1$2", f = "GetAllRequestedBookedProductsUseCase.kt", l = {51, 50}, m = "emit", v = 1)
        public final class AnonymousClass1 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(GetAllRequestedBookedProductsUseCase getAllRequestedBookedProductsUseCase, UserBookingsStatusType userBookingsStatusType, FlowCollector flowCollector) {
            this.f3014a = flowCollector;
            this.b = getAllRequestedBookedProductsUseCase;
            this.c = userBookingsStatusType;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x008c  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
        
            if (r2.emit(r13, r0) == r1) goto L38;
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r13
                app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$map$1$2$1 r0 = (app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$map$1$2$1 r0 = new app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$map$1$2$1
                r0.<init>(r13)
            L18:
                java.lang.Object r13 = r0.result
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3f
                if (r2 == r4) goto L33
                if (r2 != r3) goto L2b
                kotlin.ResultKt.b(r13)
                goto Lae
            L2b:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L33:
                java.lang.Object r12 = r0.L$1
                java.util.List r12 = (java.util.List) r12
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlin.ResultKt.b(r13)
                goto L57
            L3f:
                kotlin.ResultKt.b(r13)
                java.util.List r12 = (java.util.List) r12
                app.chalo.home.domain.GetAllRequestedBookedProductsUseCase r13 = r11.b
                app.chalo.contract.BasicInfoContract r13 = r13.k
                kotlinx.coroutines.flow.FlowCollector r2 = r11.f3014a
                r0.L$0 = r2
                r0.L$1 = r12
                r0.label = r4
                java.lang.Object r13 = r13.c(r0)
                if (r13 != r1) goto L57
                goto Lad
            L57:
                java.lang.Number r13 = (java.lang.Number) r13
                long r5 = r13.longValue()
                java.lang.Iterable r12 = (java.lang.Iterable) r12
                java.util.ArrayList r13 = new java.util.ArrayList
                r13.<init>()
                java.util.Iterator r12 = r12.iterator()
            L68:
                boolean r7 = r12.hasNext()
                if (r7 == 0) goto La0
                java.lang.Object r7 = r12.next()
                r8 = r7
                app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel r8 = (app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModel) r8
                int[] r9 = app.chalo.home.domain.GetAllRequestedBookedProductsUseCase.WhenMappings.f3000a
                app.chalo.models.UserBookingsStatusType r10 = r11.c
                int r10 = r10.ordinal()
                r9 = r9[r10]
                if (r9 == r4) goto L8c
                if (r9 == r3) goto L96
                r10 = 3
                if (r9 != r10) goto L90
                boolean r8 = app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModelKt.a(r8, r5)
                if (r8 != 0) goto L8e
            L8c:
                r8 = r4
                goto L9a
            L8e:
                r8 = 0
                goto L9a
            L90:
                kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                r12.<init>()
                throw r12
            L96:
                boolean r8 = app.chalo.multimodalticket.data.model.app.MultiModalGroupTicketAppModelKt.a(r8, r5)
            L9a:
                if (r8 == 0) goto L68
                r13.add(r7)
                goto L68
            La0:
                r12 = 0
                r0.L$0 = r12
                r0.L$1 = r12
                r0.label = r3
                java.lang.Object r12 = r2.emit(r13, r0)
                if (r12 != r1) goto Lae
            Lad:
                return r1
            Lae:
                kotlin.Unit r12 = kotlin.Unit.f17538a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public GetAllRequestedBookedProductsUseCase$getMultiModalGroupTicketsFlow$$inlined$map$1(GetAllRequestedBookedProductsUseCase getAllRequestedBookedProductsUseCase, UserBookingsStatusType userBookingsStatusType, Flow flow) {
        this.f3013a = flow;
        this.b = getAllRequestedBookedProductsUseCase;
        this.c = userBookingsStatusType;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f3013a.collect(new AnonymousClass2(this.b, this.c, flowCollector), continuation);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
    }
}
