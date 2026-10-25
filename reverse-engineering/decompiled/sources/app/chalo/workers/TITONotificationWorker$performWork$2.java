package app.chalo.workers;

import androidx.compose.runtime.ComposerImplKt;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.work.ListenableWorker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.workers.TITONotificationWorker$performWork$2", f = "TITONotificationWorker.kt", l = {118, ComposerImplKt.nodeKey, TsExtractor.TS_STREAM_TYPE_E_AC3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 143}, m = "invokeSuspend", v = 1)
final class TITONotificationWorker$performWork$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    final /* synthetic */ TITONotificationWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TITONotificationWorker$performWork$2(TITONotificationWorker tITONotificationWorker, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tITONotificationWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TITONotificationWorker$performWork$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TITONotificationWorker$performWork$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0095 A[PHI: r0 r2 r4 r5 r11 r12 r13 r14
      0x0095: PHI (r0v18 boolean) = (r0v15 boolean), (r0v33 boolean) binds: [B:71:0x01b5, B:23:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r2v4 java.lang.Object) = (r2v3 java.lang.Object), (r2v16 java.lang.Object) binds: [B:71:0x01b5, B:23:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r4v14 app.chalo.tito.data.model.TITONotificationJobConfig) = 
      (r4v13 app.chalo.tito.data.model.TITONotificationJobConfig)
      (r4v21 app.chalo.tito.data.model.TITONotificationJobConfig)
     binds: [B:71:0x01b5, B:23:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r5v9 java.lang.String) = (r5v7 java.lang.String), (r5v17 java.lang.String) binds: [B:71:0x01b5, B:23:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r11v4 java.lang.String) = (r11v2 java.lang.String), (r11v10 java.lang.String) binds: [B:71:0x01b5, B:23:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r12v4 java.lang.String) = (r12v2 java.lang.String), (r12v10 java.lang.String) binds: [B:71:0x01b5, B:23:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r13v4 java.lang.String) = (r13v2 java.lang.String), (r13v11 java.lang.String) binds: [B:71:0x01b5, B:23:0x0092] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r14v8 long) = (r14v6 long), (r14v10 long) binds: [B:71:0x01b5, B:23:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0186 A[Catch: Exception -> 0x001d, PHI: r0 r5 r11 r12 r13 r14
      0x0186: PHI (r0v14 boolean) = (r0v6 boolean), (r0v17 boolean) binds: [B:58:0x015c, B:63:0x0182] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r5v6 java.lang.String) = (r5v5 java.lang.String), (r5v8 java.lang.String) binds: [B:58:0x015c, B:63:0x0182] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v3 java.lang.String) binds: [B:58:0x015c, B:63:0x0182] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r12v1 java.lang.String) = (r12v0 java.lang.String), (r12v3 java.lang.String) binds: [B:58:0x015c, B:63:0x0182] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v3 java.lang.String) binds: [B:58:0x015c, B:63:0x0182] A[DONT_GENERATE, DONT_INLINE]
      0x0186: PHI (r14v5 long) = (r14v4 long), (r14v7 long) binds: [B:58:0x015c, B:63:0x0182] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x001d, blocks: (B:9:0x0018, B:93:0x0231, B:16:0x0040, B:87:0x0212, B:19:0x0066, B:83:0x01f2, B:22:0x008f, B:73:0x01b9, B:75:0x01bf, B:77:0x01c4, B:79:0x01c8, B:97:0x0239, B:98:0x023e, B:26:0x00b1, B:62:0x017e, B:66:0x018c, B:68:0x0190, B:70:0x0195, B:65:0x0186, B:29:0x00bc, B:31:0x00d8, B:33:0x00dd, B:35:0x00ec, B:37:0x00f1, B:39:0x00ff, B:41:0x0104, B:43:0x0113, B:45:0x0118, B:47:0x0126, B:49:0x012b, B:51:0x0139, B:53:0x013e, B:55:0x014c, B:57:0x0151, B:59:0x015e), top: B:101:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0190 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:9:0x0018, B:93:0x0231, B:16:0x0040, B:87:0x0212, B:19:0x0066, B:83:0x01f2, B:22:0x008f, B:73:0x01b9, B:75:0x01bf, B:77:0x01c4, B:79:0x01c8, B:97:0x0239, B:98:0x023e, B:26:0x00b1, B:62:0x017e, B:66:0x018c, B:68:0x0190, B:70:0x0195, B:65:0x0186, B:29:0x00bc, B:31:0x00d8, B:33:0x00dd, B:35:0x00ec, B:37:0x00f1, B:39:0x00ff, B:41:0x0104, B:43:0x0113, B:45:0x0118, B:47:0x0126, B:49:0x012b, B:51:0x0139, B:53:0x013e, B:55:0x014c, B:57:0x0151, B:59:0x015e), top: B:101:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0195 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:9:0x0018, B:93:0x0231, B:16:0x0040, B:87:0x0212, B:19:0x0066, B:83:0x01f2, B:22:0x008f, B:73:0x01b9, B:75:0x01bf, B:77:0x01c4, B:79:0x01c8, B:97:0x0239, B:98:0x023e, B:26:0x00b1, B:62:0x017e, B:66:0x018c, B:68:0x0190, B:70:0x0195, B:65:0x0186, B:29:0x00bc, B:31:0x00d8, B:33:0x00dd, B:35:0x00ec, B:37:0x00f1, B:39:0x00ff, B:41:0x0104, B:43:0x0113, B:45:0x0118, B:47:0x0126, B:49:0x012b, B:51:0x0139, B:53:0x013e, B:55:0x014c, B:57:0x0151, B:59:0x015e), top: B:101:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bf A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:9:0x0018, B:93:0x0231, B:16:0x0040, B:87:0x0212, B:19:0x0066, B:83:0x01f2, B:22:0x008f, B:73:0x01b9, B:75:0x01bf, B:77:0x01c4, B:79:0x01c8, B:97:0x0239, B:98:0x023e, B:26:0x00b1, B:62:0x017e, B:66:0x018c, B:68:0x0190, B:70:0x0195, B:65:0x0186, B:29:0x00bc, B:31:0x00d8, B:33:0x00dd, B:35:0x00ec, B:37:0x00f1, B:39:0x00ff, B:41:0x0104, B:43:0x0113, B:45:0x0118, B:47:0x0126, B:49:0x012b, B:51:0x0139, B:53:0x013e, B:55:0x014c, B:57:0x0151, B:59:0x015e), top: B:101:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01c4 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:9:0x0018, B:93:0x0231, B:16:0x0040, B:87:0x0212, B:19:0x0066, B:83:0x01f2, B:22:0x008f, B:73:0x01b9, B:75:0x01bf, B:77:0x01c4, B:79:0x01c8, B:97:0x0239, B:98:0x023e, B:26:0x00b1, B:62:0x017e, B:66:0x018c, B:68:0x0190, B:70:0x0195, B:65:0x0186, B:29:0x00bc, B:31:0x00d8, B:33:0x00dd, B:35:0x00ec, B:37:0x00f1, B:39:0x00ff, B:41:0x0104, B:43:0x0113, B:45:0x0118, B:47:0x0126, B:49:0x012b, B:51:0x0139, B:53:0x013e, B:55:0x014c, B:57:0x0151, B:59:0x015e), top: B:101:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01c8 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:9:0x0018, B:93:0x0231, B:16:0x0040, B:87:0x0212, B:19:0x0066, B:83:0x01f2, B:22:0x008f, B:73:0x01b9, B:75:0x01bf, B:77:0x01c4, B:79:0x01c8, B:97:0x0239, B:98:0x023e, B:26:0x00b1, B:62:0x017e, B:66:0x018c, B:68:0x0190, B:70:0x0195, B:65:0x0186, B:29:0x00bc, B:31:0x00d8, B:33:0x00dd, B:35:0x00ec, B:37:0x00f1, B:39:0x00ff, B:41:0x0104, B:43:0x0113, B:45:0x0118, B:47:0x0126, B:49:0x012b, B:51:0x0139, B:53:0x013e, B:55:0x014c, B:57:0x0151, B:59:0x015e), top: B:101:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x020c  */
    /* JADX WARN: Code duplicated, block: B:86:0x020d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0239 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:9:0x0018, B:93:0x0231, B:16:0x0040, B:87:0x0212, B:19:0x0066, B:83:0x01f2, B:22:0x008f, B:73:0x01b9, B:75:0x01bf, B:77:0x01c4, B:79:0x01c8, B:97:0x0239, B:98:0x023e, B:26:0x00b1, B:62:0x017e, B:66:0x018c, B:68:0x0190, B:70:0x0195, B:65:0x0186, B:29:0x00bc, B:31:0x00d8, B:33:0x00dd, B:35:0x00ec, B:37:0x00f1, B:39:0x00ff, B:41:0x0104, B:43:0x0113, B:45:0x0118, B:47:0x0126, B:49:0x012b, B:51:0x0139, B:53:0x013e, B:55:0x014c, B:57:0x0151, B:59:0x015e), top: B:101:0x000c }] */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x022e, code lost:
    
        if (app.chalo.workers.TITONotificationWorker.e(r5, r2, r13, r3, r4, r0, r7, r8, r6) == r10) goto L92;
     */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.workers.TITONotificationWorker$performWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
