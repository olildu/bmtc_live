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
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedViewModel$handleUploadProofImageIntent$1", f = "SuperPassPurchaseSharedViewModel.kt", l = {352, 353, 373, 441}, m = "invokeSuspend", v = 1)
final class SuperPassPurchaseSharedViewModel$handleUploadProofImageIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SuperPassPurchaseSharedIntent.UploadProofImageIntent $intent;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ SuperPassPurchaseSharedViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassPurchaseSharedViewModel$handleUploadProofImageIntent$1(SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel, SuperPassPurchaseSharedIntent.UploadProofImageIntent uploadProofImageIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = superPassPurchaseSharedViewModel;
        this.$intent = uploadProofImageIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperPassPurchaseSharedViewModel$handleUploadProofImageIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperPassPurchaseSharedViewModel$handleUploadProofImageIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c2 A[PHI: r12
      0x00c2: PHI (r12v20 java.lang.Object) = (r12v19 java.lang.Object), (r12v0 java.lang.Object) binds: [B:27:0x00bf, B:11:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c6  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f6, code lost:
    
        if (r1.c(r3, r12, r11) == r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedViewModel$handleUploadProofImageIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
