package app.chalo.productpurchase.passselection.ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passselection.ui.PassSelectionComponent$handlePassFareMappingSelectedIntent$1", f = "PassSelectionComponent.kt", l = {262, 266}, m = "invokeSuspend", v = 1)
final class PassSelectionComponent$handlePassFareMappingSelectedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PassSelectionIntent.PassFareMappingSelectedIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ PassSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassSelectionComponent$handlePassFareMappingSelectedIntent$1(PassSelectionIntent.PassFareMappingSelectedIntent passFareMappingSelectedIntent, PassSelectionComponent passSelectionComponent, Continuation continuation) {
        super(2, continuation);
        this.$intent = passFareMappingSelectedIntent;
        this.this$0 = passSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassSelectionComponent$handlePassFareMappingSelectedIntent$1(this.$intent, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PassSelectionComponent$handlePassFareMappingSelectedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f5, code lost:
    
        if (r0 == r7) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passselection.ui.PassSelectionComponent$handlePassFareMappingSelectedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
