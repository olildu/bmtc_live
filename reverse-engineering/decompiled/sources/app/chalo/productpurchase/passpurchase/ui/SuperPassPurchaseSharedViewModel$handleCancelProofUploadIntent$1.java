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
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedViewModel$handleCancelProofUploadIntent$1", f = "SuperPassPurchaseSharedViewModel.kt", l = {330, 331}, m = "invokeSuspend", v = 1)
final class SuperPassPurchaseSharedViewModel$handleCancelProofUploadIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SuperPassPurchaseSharedIntent.CancelProofUploadIntent $intent;
    int label;
    final /* synthetic */ SuperPassPurchaseSharedViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassPurchaseSharedViewModel$handleCancelProofUploadIntent$1(SuperPassPurchaseSharedViewModel superPassPurchaseSharedViewModel, SuperPassPurchaseSharedIntent.CancelProofUploadIntent cancelProofUploadIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = superPassPurchaseSharedViewModel;
        this.$intent = cancelProofUploadIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperPassPurchaseSharedViewModel$handleCancelProofUploadIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperPassPurchaseSharedViewModel$handleCancelProofUploadIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r5 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r5)
            goto L55
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            kotlin.ResultKt.b(r5)
            goto L36
        L1c:
            kotlin.ResultKt.b(r5)
            app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedViewModel r5 = r4.this$0
            kotlin.Lazy r5 = r5.C
            java.lang.Object r5 = r5.getValue()
            app.chalo.utils.ConcurrentMutableMap r5 = (app.chalo.utils.ConcurrentMutableMap) r5
            app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedIntent$CancelProofUploadIntent r1 = r4.$intent
            java.lang.String r1 = r1.f8346a
            r4.label = r3
            java.lang.Object r5 = r5.e(r1, r4)
            if (r5 != r0) goto L36
            goto L54
        L36:
            kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
            if (r5 == 0) goto L3e
            r1 = 0
            r5.cancel(r1)
        L3e:
            app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedViewModel r5 = r4.this$0
            kotlin.Lazy r5 = r5.D
            java.lang.Object r5 = r5.getValue()
            app.chalo.utils.ConcurrentMutableMap r5 = (app.chalo.utils.ConcurrentMutableMap) r5
            app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedIntent$CancelProofUploadIntent r1 = r4.$intent
            java.lang.String r1 = r1.f8346a
            r4.label = r2
            java.lang.Object r5 = r5.e(r1, r4)
            if (r5 != r0) goto L55
        L54:
            return r0
        L55:
            app.chalo.productpurchase.passpurchase.data.ProofUploadDetails r5 = (app.chalo.productpurchase.passpurchase.data.ProofUploadDetails) r5
            app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedViewModel r0 = r4.this$0
            app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedIntent$CancelProofUploadIntent r1 = r4.$intent
            rw0 r2 = new rw0
            r3 = 17
            r2.<init>(r3, r0, r1, r5)
            java.util.Set r5 = app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedViewModel.G
            r0.E0(r2)
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedViewModel$handleCancelProofUploadIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
