package app.chalo.productpurchase.passpurchase.ui;

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
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedViewModel$handleUploadProofImageIntent$1$job$1", f = "SuperPassPurchaseSharedViewModel.kt", l = {376, 407, 408, 435}, m = "invokeSuspend", v = 1)
final class SuperPassPurchaseSharedViewModel$handleUploadProofImageIntent$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SuperPassPurchaseSharedIntent.UploadProofImageIntent $intent;
    Object L$0;
    int label;
    final /* synthetic */ SuperPassPurchaseSharedViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassPurchaseSharedViewModel$handleUploadProofImageIntent$1$job$1(SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel, SuperPassPurchaseSharedIntent.UploadProofImageIntent uploadProofImageIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = superPassPurchaseSharedViewModel;
        this.$intent = uploadProofImageIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperPassPurchaseSharedViewModel$handleUploadProofImageIntent$1$job$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperPassPurchaseSharedViewModel$handleUploadProofImageIntent$1$job$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ac  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e6, code lost:
    
        if (r9.e(r1, r8) == r0) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedViewModel$handleUploadProofImageIntent$1$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
