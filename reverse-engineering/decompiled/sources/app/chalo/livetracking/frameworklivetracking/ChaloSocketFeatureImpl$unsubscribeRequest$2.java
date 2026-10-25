package app.chalo.livetracking.frameworklivetracking;

import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.livetracking.frameworklivetracking.data.model.ChaloSocketRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$unsubscribeRequest$2", f = "ChaloSocketFeatureImpl.kt", l = {162, 168, TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend", v = 1)
final class ChaloSocketFeatureImpl$unsubscribeRequest$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $maxRetryAllowed;
    final /* synthetic */ ChaloSocketRequest $request;
    final /* synthetic */ Function0<Long> $retryUnsubscribeRequestDelay;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ ChaloSocketFeatureImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloSocketFeatureImpl$unsubscribeRequest$2(int i, ChaloSocketFeatureImpl chaloSocketFeatureImpl, ChaloSocketRequest chaloSocketRequest, Continuation continuation, Function0 function0) {
        super(2, continuation);
        this.$retryUnsubscribeRequestDelay = function0;
        this.$maxRetryAllowed = i;
        this.this$0 = chaloSocketFeatureImpl;
        this.$request = chaloSocketRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChaloSocketFeatureImpl$unsubscribeRequest$2 chaloSocketFeatureImpl$unsubscribeRequest$2 = new ChaloSocketFeatureImpl$unsubscribeRequest$2(this.$maxRetryAllowed, this.this$0, this.$request, continuation, this.$retryUnsubscribeRequestDelay);
        chaloSocketFeatureImpl$unsubscribeRequest$2.L$0 = obj;
        return chaloSocketFeatureImpl$unsubscribeRequest$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloSocketFeatureImpl$unsubscribeRequest$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00dc  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0105, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(r12, r19) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0146, code lost:
    
        if (kotlinx.coroutines.BuildersKt.g(getContext(), new app.chalo.livetracking.frameworklivetracking.ChaloSocketClient$sendMessage$2(r6, r7, r8, null, null), r19) == r1) goto L29;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0105 -> B:11:0x003f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.frameworklivetracking.ChaloSocketFeatureImpl$unsubscribeRequest$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
