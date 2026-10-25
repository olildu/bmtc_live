package app.chalo.home.ui.chalobusrouteinfo;

import androidx.media3.extractor.ts.TsExtractor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoComponent$fetchRouteSchedules$1", f = "ChaloBusRouteInfoComponent.kt", l = {TsExtractor.TS_STREAM_TYPE_AC3, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 141}, m = "invokeSuspend", v = 1)
final class ChaloBusRouteInfoComponent$fetchRouteSchedules$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ChaloBusRouteInfoComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusRouteInfoComponent$fetchRouteSchedules$1(ChaloBusRouteInfoComponent chaloBusRouteInfoComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBusRouteInfoComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloBusRouteInfoComponent$fetchRouteSchedules$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusRouteInfoComponent$fetchRouteSchedules$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b A[LOOP:0: B:26:0x0095->B:28:0x009b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:39:0x0108  */
    /* JADX WARN: Code duplicated, block: B:44:0x0135 A[LOOP:3: B:43:0x0133->B:44:0x0135, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0159  */
    /* JADX WARN: Code duplicated, block: B:50:0x0171 A[LOOP:5: B:48:0x016b->B:50:0x0171, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x01c5 A[LOOP:6: B:53:0x01bf->B:55:0x01c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:64:0x022a  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoComponent.F0(r3, r2, r19) == r1) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoComponent$fetchRouteSchedules$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
