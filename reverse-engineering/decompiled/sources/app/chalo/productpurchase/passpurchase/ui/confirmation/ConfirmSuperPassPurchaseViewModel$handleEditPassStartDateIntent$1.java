package app.chalo.productpurchase.passpurchase.ui.confirmation;

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
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel$handleEditPassStartDateIntent$1", f = "ConfirmSuperPassPurchaseViewModel.kt", l = {439, 453, 460, 475, 482, 483, 489, 497}, m = "invokeSuspend", v = 1)
final class ConfirmSuperPassPurchaseViewModel$handleEditPassStartDateIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    long J$0;
    long J$1;
    long J$2;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ConfirmSuperPassPurchaseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmSuperPassPurchaseViewModel$handleEditPassStartDateIntent$1(ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = confirmSuperPassPurchaseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConfirmSuperPassPurchaseViewModel$handleEditPassStartDateIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ConfirmSuperPassPurchaseViewModel$handleEditPassStartDateIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d A[PHI: r2 r4 r18
      0x003d: PHI (r2v43 long) = (r2v38 long), (r2v47 long) binds: [B:64:0x01e4, B:9:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r4v14 java.lang.Object) = (r4v13 java.lang.Object), (r4v19 java.lang.Object) binds: [B:64:0x01e4, B:9:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r18v9 long) = (r18v6 long), (r18v10 long) binds: [B:64:0x01e4, B:9:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:32:0x010a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0128  */
    /* JADX WARN: Code duplicated, block: B:49:0x017c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0190  */
    /* JADX WARN: Code duplicated, block: B:55:0x01af  */
    /* JADX WARN: Code duplicated, block: B:72:0x022d  */
    /* JADX WARN: Code duplicated, block: B:76:0x023c  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d7, code lost:
    
        if (r11 == r1) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x015d, code lost:
    
        if (r3 == r1) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ce, code lost:
    
        if (r2 == r1) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0213, code lost:
    
        if (r4 == r1) goto L75;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel$handleEditPassStartDateIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
