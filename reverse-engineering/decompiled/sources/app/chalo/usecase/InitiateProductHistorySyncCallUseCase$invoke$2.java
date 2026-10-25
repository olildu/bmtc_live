package app.chalo.usecase;

import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import app.chalo.constants.Source;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lapp/chalo/utils/ChaloUseCaseResult;", "", "Lapp/chalo/usecase/ProductHistorySyncErrorType;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.usecase.InitiateProductHistorySyncCallUseCase$invoke$2", f = "InitiateProductHistorySyncCallUseCase.kt", l = {107, 109, 113, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID}, m = "invokeSuspend", v = 1)
final class InitiateProductHistorySyncCallUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChaloUseCaseResult<Boolean, ProductHistorySyncErrorType>>, Object> {
    final /* synthetic */ boolean $fetchBackingProductConfigs;
    final /* synthetic */ Source $source;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InitiateProductHistorySyncCallUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateProductHistorySyncCallUseCase$invoke$2(InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, boolean z, Source source, Continuation continuation) {
        super(2, continuation);
        this.this$0 = initiateProductHistorySyncCallUseCase;
        this.$fetchBackingProductConfigs = z;
        this.$source = source;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InitiateProductHistorySyncCallUseCase$invoke$2 initiateProductHistorySyncCallUseCase$invoke$2 = new InitiateProductHistorySyncCallUseCase$invoke$2(this.this$0, this.$fetchBackingProductConfigs, this.$source, continuation);
        initiateProductHistorySyncCallUseCase$invoke$2.L$0 = obj;
        return initiateProductHistorySyncCallUseCase$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InitiateProductHistorySyncCallUseCase$invoke$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00be A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:8:0x0013, B:60:0x0137, B:15:0x002c, B:54:0x00fb, B:56:0x0114, B:57:0x0121, B:18:0x0039, B:39:0x00b8, B:41:0x00be, B:43:0x00c7, B:45:0x00cb, B:50:0x00e5, B:51:0x00ea, B:52:0x00eb, B:53:0x00fa, B:21:0x0048, B:31:0x009a, B:33:0x00a5, B:35:0x00a9, B:62:0x013a, B:63:0x013f, B:64:0x0140, B:65:0x0146, B:24:0x0055, B:26:0x005f, B:28:0x006e), top: B:101:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:8:0x0013, B:60:0x0137, B:15:0x002c, B:54:0x00fb, B:56:0x0114, B:57:0x0121, B:18:0x0039, B:39:0x00b8, B:41:0x00be, B:43:0x00c7, B:45:0x00cb, B:50:0x00e5, B:51:0x00ea, B:52:0x00eb, B:53:0x00fa, B:21:0x0048, B:31:0x009a, B:33:0x00a5, B:35:0x00a9, B:62:0x013a, B:63:0x013f, B:64:0x0140, B:65:0x0146, B:24:0x0055, B:26:0x005f, B:28:0x006e), top: B:101:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:8:0x0013, B:60:0x0137, B:15:0x002c, B:54:0x00fb, B:56:0x0114, B:57:0x0121, B:18:0x0039, B:39:0x00b8, B:41:0x00be, B:43:0x00c7, B:45:0x00cb, B:50:0x00e5, B:51:0x00ea, B:52:0x00eb, B:53:0x00fa, B:21:0x0048, B:31:0x009a, B:33:0x00a5, B:35:0x00a9, B:62:0x013a, B:63:0x013f, B:64:0x0140, B:65:0x0146, B:24:0x0055, B:26:0x005f, B:28:0x006e), top: B:101:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e5 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:8:0x0013, B:60:0x0137, B:15:0x002c, B:54:0x00fb, B:56:0x0114, B:57:0x0121, B:18:0x0039, B:39:0x00b8, B:41:0x00be, B:43:0x00c7, B:45:0x00cb, B:50:0x00e5, B:51:0x00ea, B:52:0x00eb, B:53:0x00fa, B:21:0x0048, B:31:0x009a, B:33:0x00a5, B:35:0x00a9, B:62:0x013a, B:63:0x013f, B:64:0x0140, B:65:0x0146, B:24:0x0055, B:26:0x005f, B:28:0x006e), top: B:101:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00eb A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:8:0x0013, B:60:0x0137, B:15:0x002c, B:54:0x00fb, B:56:0x0114, B:57:0x0121, B:18:0x0039, B:39:0x00b8, B:41:0x00be, B:43:0x00c7, B:45:0x00cb, B:50:0x00e5, B:51:0x00ea, B:52:0x00eb, B:53:0x00fa, B:21:0x0048, B:31:0x009a, B:33:0x00a5, B:35:0x00a9, B:62:0x013a, B:63:0x013f, B:64:0x0140, B:65:0x0146, B:24:0x0055, B:26:0x005f, B:28:0x006e), top: B:101:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00fb A[Catch: Exception -> 0x0019, PHI: r4 r5
      0x00fb: PHI (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v7 java.lang.String) binds: [B:40:0x00bc, B:49:0x00e2] A[DONT_GENERATE, DONT_INLINE]
      0x00fb: PHI (r5v7 app.chalo.utils.ChaloUseCaseResult) = (r5v6 app.chalo.utils.ChaloUseCaseResult), (r5v11 app.chalo.utils.ChaloUseCaseResult) binds: [B:40:0x00bc, B:49:0x00e2] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0019, blocks: (B:8:0x0013, B:60:0x0137, B:15:0x002c, B:54:0x00fb, B:56:0x0114, B:57:0x0121, B:18:0x0039, B:39:0x00b8, B:41:0x00be, B:43:0x00c7, B:45:0x00cb, B:50:0x00e5, B:51:0x00ea, B:52:0x00eb, B:53:0x00fa, B:21:0x0048, B:31:0x009a, B:33:0x00a5, B:35:0x00a9, B:62:0x013a, B:63:0x013f, B:64:0x0140, B:65:0x0146, B:24:0x0055, B:26:0x005f, B:28:0x006e), top: B:101:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0114 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:8:0x0013, B:60:0x0137, B:15:0x002c, B:54:0x00fb, B:56:0x0114, B:57:0x0121, B:18:0x0039, B:39:0x00b8, B:41:0x00be, B:43:0x00c7, B:45:0x00cb, B:50:0x00e5, B:51:0x00ea, B:52:0x00eb, B:53:0x00fa, B:21:0x0048, B:31:0x009a, B:33:0x00a5, B:35:0x00a9, B:62:0x013a, B:63:0x013f, B:64:0x0140, B:65:0x0146, B:24:0x0055, B:26:0x005f, B:28:0x006e), top: B:101:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0121 A[Catch: Exception -> 0x0019, TryCatch #0 {Exception -> 0x0019, blocks: (B:8:0x0013, B:60:0x0137, B:15:0x002c, B:54:0x00fb, B:56:0x0114, B:57:0x0121, B:18:0x0039, B:39:0x00b8, B:41:0x00be, B:43:0x00c7, B:45:0x00cb, B:50:0x00e5, B:51:0x00ea, B:52:0x00eb, B:53:0x00fa, B:21:0x0048, B:31:0x009a, B:33:0x00a5, B:35:0x00a9, B:62:0x013a, B:63:0x013f, B:64:0x0140, B:65:0x0146, B:24:0x0055, B:26:0x005f, B:28:0x006e), top: B:101:0x0009 }] */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0134, code lost:
    
        if (r1 == r0) goto L59;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.usecase.InitiateProductHistorySyncCallUseCase$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
