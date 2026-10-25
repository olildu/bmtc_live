package app.chalo.home.domain;

import androidx.media3.extractor.ts.TsExtractor;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lapp/chalo/home/domain/ChaloUserBookingType;", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$stabilize$2", f = "GetAllRequestedBookedProductsUseCase.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS_HD, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 140}, m = "invokeSuspend", v = 1)
final class GetAllRequestedBookedProductsUseCase$stabilize$2 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends ChaloUserBookingType>>, List<? extends ChaloUserBookingType>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.BooleanRef $isFirstEmissionDone;
    final /* synthetic */ long $threshold;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAllRequestedBookedProductsUseCase$stabilize$2(Ref.BooleanRef booleanRef, long j, Continuation continuation) {
        super(3, continuation);
        this.$isFirstEmissionDone = booleanRef;
        this.$threshold = j;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetAllRequestedBookedProductsUseCase$stabilize$2 getAllRequestedBookedProductsUseCase$stabilize$2 = new GetAllRequestedBookedProductsUseCase$stabilize$2(this.$isFirstEmissionDone, this.$threshold, (Continuation) obj3);
        getAllRequestedBookedProductsUseCase$stabilize$2.L$0 = (FlowCollector) obj;
        getAllRequestedBookedProductsUseCase$stabilize$2.L$1 = (List) obj2;
        return getAllRequestedBookedProductsUseCase$stabilize$2.invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r5.emit(r1, r8) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r3.emit(r1, r8) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L33
            if (r1 == r4) goto L27
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.ResultKt.b(r9)
            goto L75
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            java.lang.Object r1 = r8.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r3 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3
            kotlin.ResultKt.b(r9)
            goto L67
        L27:
            java.lang.Object r1 = r8.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            kotlin.ResultKt.b(r9)
            goto L53
        L33:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.L$0
            r5 = r9
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            java.lang.Object r9 = r8.L$1
            r1 = r9
            java.util.List r1 = (java.util.List) r1
            kotlin.jvm.internal.Ref$BooleanRef r9 = r8.$isFirstEmissionDone
            boolean r9 = r9.element
            if (r9 != 0) goto L57
            r8.L$0 = r5
            r8.L$1 = r1
            r8.label = r4
            java.lang.Object r9 = r5.emit(r1, r8)
            if (r9 != r0) goto L53
            goto L74
        L53:
            kotlin.jvm.internal.Ref$BooleanRef r9 = r8.$isFirstEmissionDone
            r9.element = r4
        L57:
            long r6 = r8.$threshold
            r8.L$0 = r5
            r8.L$1 = r1
            r8.label = r3
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.b(r6, r8)
            if (r9 != r0) goto L66
            goto L74
        L66:
            r3 = r5
        L67:
            r9 = 0
            r8.L$0 = r9
            r8.L$1 = r9
            r8.label = r2
            java.lang.Object r9 = r3.emit(r1, r8)
            if (r9 != r0) goto L75
        L74:
            return r0
        L75:
            kotlin.Unit r9 = kotlin.Unit.f17538a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.domain.GetAllRequestedBookedProductsUseCase$stabilize$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
