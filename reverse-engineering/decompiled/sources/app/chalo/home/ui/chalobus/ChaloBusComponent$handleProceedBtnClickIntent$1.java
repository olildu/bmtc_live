package app.chalo.home.ui.chalobus;

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
@DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusComponent$handleProceedBtnClickIntent$1", f = "ChaloBusComponent.kt", l = {1248, 1257, 1271, 1298}, m = "invokeSuspend", v = 1)
final class ChaloBusComponent$handleProceedBtnClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ ChaloBusComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusComponent$handleProceedBtnClickIntent$1(ChaloBusComponent chaloBusComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBusComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloBusComponent$handleProceedBtnClickIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusComponent$handleProceedBtnClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:28:0x010f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0116  */
    /* JADX WARN: Code duplicated, block: B:32:0x0140  */
    /* JADX WARN: Code duplicated, block: B:33:0x0147  */
    /* JADX WARN: Code duplicated, block: B:36:0x0157  */
    /* JADX WARN: Code duplicated, block: B:37:0x015e  */
    /* JADX WARN: Code duplicated, block: B:41:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:46:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:50:0x0204  */
    /* JADX WARN: Code duplicated, block: B:53:0x0214  */
    /* JADX WARN: Code duplicated, block: B:54:0x0217  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x022f, code lost:
    
        if (r9 == r8) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02a4, code lost:
    
        if (r0 == r8) goto L75;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.chalobus.ChaloBusComponent$handleProceedBtnClickIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
