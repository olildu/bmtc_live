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
@DebugMetadata(c = "app.chalo.home.ui.chalobus.ChaloBusComponent$handleProductPurchaseNudgeInfoCardClick$1", f = "ChaloBusComponent.kt", l = {544, 558, 571, 594, 620}, m = "invokeSuspend", v = 1)
final class ChaloBusComponent$handleProductPurchaseNudgeInfoCardClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChaloBusViewIntent.ProductPurchaseNudgeInfoCardClick $intent;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ ChaloBusComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloBusComponent$handleProductPurchaseNudgeInfoCardClick$1(ChaloBusComponent chaloBusComponent, ChaloBusViewIntent.ProductPurchaseNudgeInfoCardClick productPurchaseNudgeInfoCardClick, Continuation continuation) {
        super(2, continuation);
        this.this$0 = chaloBusComponent;
        this.$intent = productPurchaseNudgeInfoCardClick;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloBusComponent$handleProductPurchaseNudgeInfoCardClick$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChaloBusComponent$handleProductPurchaseNudgeInfoCardClick$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0132  */
    /* JADX WARN: Code duplicated, block: B:45:0x0169  */
    /* JADX WARN: Code duplicated, block: B:47:0x0179  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x0283  */
    /* JADX WARN: Code duplicated, block: B:87:0x0289  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cd, code lost:
    
        if (r4 == r6) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0189, code lost:
    
        if (r3 == r6) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x020f, code lost:
    
        if (r1 == r6) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x029b, code lost:
    
        if (r0 == r6) goto L89;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.chalobus.ChaloBusComponent$handleProductPurchaseNudgeInfoCardClick$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
