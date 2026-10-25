package app.chalo.validationsdk.multiproductvalidation.ui;

import androidx.constraintlayout.core.motion.utils.TypedValues;
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
@DebugMetadata(c = "app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent$handlePunchEventReceivedIntent$1", f = "MultiProductValidationComponent.kt", l = {TypedValues.PositionType.TYPE_PERCENT_X, 375, 380, 390, 394, 397}, m = "invokeSuspend", v = 1)
final class MultiProductValidationComponent$handlePunchEventReceivedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MultiProductValidationIntent.PunchEventReceivedIntent $intent;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MultiProductValidationComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProductValidationComponent$handlePunchEventReceivedIntent$1(MultiProductValidationComponent multiProductValidationComponent, MultiProductValidationIntent.PunchEventReceivedIntent punchEventReceivedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = multiProductValidationComponent;
        this.$intent = punchEventReceivedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultiProductValidationComponent$handlePunchEventReceivedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MultiProductValidationComponent$handlePunchEventReceivedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d A[PHI: r1 r3 r4 r11
      0x005d: PHI (r1v9 app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationIntent$PunchEventReceivedIntent) = 
      (r1v6 app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationIntent$PunchEventReceivedIntent)
      (r1v12 app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationIntent$PunchEventReceivedIntent)
     binds: [B:40:0x00f1, B:18:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r3v10 app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent) = 
      (r3v7 app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent)
      (r3v14 app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent)
     binds: [B:40:0x00f1, B:18:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r4v10 kotlinx.coroutines.sync.Mutex) = (r4v7 kotlinx.coroutines.sync.Mutex), (r4v13 kotlinx.coroutines.sync.Mutex) binds: [B:40:0x00f1, B:18:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r11v15 java.lang.Object) = (r11v14 java.lang.Object), (r11v0 java.lang.Object) binds: [B:40:0x00f1, B:18:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1 A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:18:0x005a, B:23:0x0072, B:36:0x00cc, B:39:0x00d6, B:30:0x00a3, B:33:0x00b1), top: B:81:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cc A[Catch: all -> 0x0062, PHI: r1 r3 r4 r11
      0x00cc: PHI (r1v6 app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationIntent$PunchEventReceivedIntent) = 
      (r1v3 app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationIntent$PunchEventReceivedIntent)
      (r1v8 app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationIntent$PunchEventReceivedIntent)
     binds: [B:34:0x00c8, B:23:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r3v7 app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent) = 
      (r3v4 app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent)
      (r3v9 app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent)
     binds: [B:34:0x00c8, B:23:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r4v7 kotlinx.coroutines.sync.Mutex) = (r4v4 kotlinx.coroutines.sync.Mutex), (r4v9 kotlinx.coroutines.sync.Mutex) binds: [B:34:0x00c8, B:23:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r11v10 java.lang.Object) = (r11v9 java.lang.Object), (r11v0 java.lang.Object) binds: [B:34:0x00c8, B:23:0x0072] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0062, blocks: (B:18:0x005a, B:23:0x0072, B:36:0x00cc, B:39:0x00d6, B:30:0x00a3, B:33:0x00b1), top: B:81:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d6 A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #1 {all -> 0x0062, blocks: (B:18:0x005a, B:23:0x0072, B:36:0x00cc, B:39:0x00d6, B:30:0x00a3, B:33:0x00b1), top: B:81:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f9 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:71:0x018c, B:74:0x0192, B:75:0x019b, B:42:0x00f5, B:44:0x00f9, B:46:0x0108, B:48:0x0114, B:50:0x011a, B:51:0x0124, B:53:0x012a, B:57:0x013d, B:59:0x0145, B:64:0x015d), top: B:81:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0108 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:71:0x018c, B:74:0x0192, B:75:0x019b, B:42:0x00f5, B:44:0x00f9, B:46:0x0108, B:48:0x0114, B:50:0x011a, B:51:0x0124, B:53:0x012a, B:57:0x013d, B:59:0x0145, B:64:0x015d), top: B:81:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0114 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:71:0x018c, B:74:0x0192, B:75:0x019b, B:42:0x00f5, B:44:0x00f9, B:46:0x0108, B:48:0x0114, B:50:0x011a, B:51:0x0124, B:53:0x012a, B:57:0x013d, B:59:0x0145, B:64:0x015d), top: B:81:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0119  */
    /* JADX WARN: Code duplicated, block: B:53:0x012a A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:71:0x018c, B:74:0x0192, B:75:0x019b, B:42:0x00f5, B:44:0x00f9, B:46:0x0108, B:48:0x0114, B:50:0x011a, B:51:0x0124, B:53:0x012a, B:57:0x013d, B:59:0x0145, B:64:0x015d), top: B:81:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0145 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:71:0x018c, B:74:0x0192, B:75:0x019b, B:42:0x00f5, B:44:0x00f9, B:46:0x0108, B:48:0x0114, B:50:0x011a, B:51:0x0124, B:53:0x012a, B:57:0x013d, B:59:0x0145, B:64:0x015d), top: B:81:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0156  */
    /* JADX WARN: Code duplicated, block: B:62:0x0157  */
    /* JADX WARN: Code duplicated, block: B:64:0x015d A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:71:0x018c, B:74:0x0192, B:75:0x019b, B:42:0x00f5, B:44:0x00f9, B:46:0x0108, B:48:0x0114, B:50:0x011a, B:51:0x0124, B:53:0x012a, B:57:0x013d, B:59:0x0145, B:64:0x015d), top: B:81:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x018a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0192 A[Catch: all -> 0x0021, TRY_ENTER, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:71:0x018c, B:74:0x0192, B:75:0x019b, B:42:0x00f5, B:44:0x00f9, B:46:0x0108, B:48:0x0114, B:50:0x011a, B:51:0x0124, B:53:0x012a, B:57:0x013d, B:59:0x0145, B:64:0x015d), top: B:81:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x019b A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:71:0x018c, B:74:0x0192, B:75:0x019b, B:42:0x00f5, B:44:0x00f9, B:46:0x0108, B:48:0x0114, B:50:0x011a, B:51:0x0124, B:53:0x012a, B:57:0x013d, B:59:0x0145, B:64:0x015d), top: B:81:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016f, code lost:
    
        if (app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent.I0(r4, r11, null, r10) == r0) goto L69;
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0063: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:100), block:B:21:0x0063 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent$handlePunchEventReceivedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
