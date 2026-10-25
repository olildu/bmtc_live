package app.chalo.juspay;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lapp/chalo/juspay/JuspayOperationUpdate;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.juspay.JuspayControllerImpl$operationFlow$1", f = "JuspayControllerImpl.kt", l = {478, 483, 487, 489, 492, 498, TypedValues.PositionType.TYPE_PERCENT_X, 509, 558, 549, 551, 558, 558}, m = "invokeSuspend", v = 1)
final class JuspayControllerImpl$operationFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super JuspayOperationUpdate>, Continuation<? super Unit>, Object> {
    final /* synthetic */ JusPaySDKRequestAppModel $request;
    final /* synthetic */ String $source;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ JuspayControllerImpl this$0;

    /* JADX INFO: renamed from: app.chalo.juspay.JuspayControllerImpl$operationFlow$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.juspay.JuspayControllerImpl$operationFlow$1$2", f = "JuspayControllerImpl.kt", l = {559}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ JuspayControllerImpl this$0;

        /* JADX INFO: renamed from: app.chalo.juspay.JuspayControllerImpl$operationFlow$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.juspay.JuspayControllerImpl$operationFlow$1$2$1", f = "JuspayControllerImpl.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ JuspayControllerImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(JuspayControllerImpl juspayControllerImpl, Continuation continuation) {
                super(2, continuation);
                this.this$0 = juspayControllerImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2);
                Unit unit = Unit.f17538a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                this.this$0.d.c.onBackPressed();
                return Unit.f17538a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(JuspayControllerImpl juspayControllerImpl, Continuation continuation) {
            super(2, continuation);
            this.this$0 = juspayControllerImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                JuspayControllerImpl juspayControllerImpl = this.this$0;
                Job jobD = BuildersKt.d(juspayControllerImpl.e, null, null, new AnonymousClass1(juspayControllerImpl, null), 3);
                this.label = 1;
                if (((JobSupport) jobD).V0(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JuspayControllerImpl$operationFlow$1(JuspayControllerImpl juspayControllerImpl, String str, JusPaySDKRequestAppModel jusPaySDKRequestAppModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = juspayControllerImpl;
        this.$source = str;
        this.$request = jusPaySDKRequestAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        JuspayControllerImpl$operationFlow$1 juspayControllerImpl$operationFlow$1 = new JuspayControllerImpl$operationFlow$1(this.this$0, this.$source, this.$request, continuation);
        juspayControllerImpl$operationFlow$1.L$0 = obj;
        return juspayControllerImpl$operationFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((JuspayControllerImpl$operationFlow$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ee A[Catch: all -> 0x01e9, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x01e9, blocks: (B:77:0x0192, B:85:0x01a7, B:102:0x01ee, B:106:0x0205, B:80:0x0199, B:83:0x01a1), top: B:140:0x0192 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0230  */
    /* JADX WARN: Code duplicated, block: B:113:0x0251  */
    /* JADX WARN: Code duplicated, block: B:116:0x0257 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:133:0x02a8, B:134:0x02af, B:10:0x0024, B:121:0x0273, B:97:0x01e4, B:114:0x0253, B:116:0x0257, B:118:0x025b, B:126:0x0282, B:128:0x0286, B:130:0x028a, B:23:0x005f, B:96:0x01e0, B:89:0x01bf, B:91:0x01c3, B:93:0x01c7, B:29:0x0087, B:31:0x0090, B:34:0x009d, B:61:0x0120, B:63:0x012a, B:68:0x0143, B:70:0x014f, B:73:0x0168, B:38:0x00ae, B:58:0x010d, B:55:0x00fd), top: B:137:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:118:0x025b A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:133:0x02a8, B:134:0x02af, B:10:0x0024, B:121:0x0273, B:97:0x01e4, B:114:0x0253, B:116:0x0257, B:118:0x025b, B:126:0x0282, B:128:0x0286, B:130:0x028a, B:23:0x005f, B:96:0x01e0, B:89:0x01bf, B:91:0x01c3, B:93:0x01c7, B:29:0x0087, B:31:0x0090, B:34:0x009d, B:61:0x0120, B:63:0x012a, B:68:0x0143, B:70:0x014f, B:73:0x0168, B:38:0x00ae, B:58:0x010d, B:55:0x00fd), top: B:137:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0272  */
    /* JADX WARN: Code duplicated, block: B:128:0x0286 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:133:0x02a8, B:134:0x02af, B:10:0x0024, B:121:0x0273, B:97:0x01e4, B:114:0x0253, B:116:0x0257, B:118:0x025b, B:126:0x0282, B:128:0x0286, B:130:0x028a, B:23:0x005f, B:96:0x01e0, B:89:0x01bf, B:91:0x01c3, B:93:0x01c7, B:29:0x0087, B:31:0x0090, B:34:0x009d, B:61:0x0120, B:63:0x012a, B:68:0x0143, B:70:0x014f, B:73:0x0168, B:38:0x00ae, B:58:0x010d, B:55:0x00fd), top: B:137:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:130:0x028a A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:133:0x02a8, B:134:0x02af, B:10:0x0024, B:121:0x0273, B:97:0x01e4, B:114:0x0253, B:116:0x0257, B:118:0x025b, B:126:0x0282, B:128:0x0286, B:130:0x028a, B:23:0x005f, B:96:0x01e0, B:89:0x01bf, B:91:0x01c3, B:93:0x01c7, B:29:0x0087, B:31:0x0090, B:34:0x009d, B:61:0x0120, B:63:0x012a, B:68:0x0143, B:70:0x014f, B:73:0x0168, B:38:0x00ae, B:58:0x010d, B:55:0x00fd), top: B:137:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a2 A[PHI: r0 r8 r9
      0x00a2: PHI (r0v19 app.chalo.juspay.JuspayInitiateConditions) = (r0v16 app.chalo.juspay.JuspayInitiateConditions), (r0v29 app.chalo.juspay.JuspayInitiateConditions) binds: [B:59:0x011c, B:35:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r8v5 kotlinx.coroutines.channels.ProducerScope) = (r8v2 kotlinx.coroutines.channels.ProducerScope), (r8v10 kotlinx.coroutines.channels.ProducerScope) binds: [B:59:0x011c, B:35:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r9v7 java.lang.Object) = (r9v6 java.lang.Object), (r9v10 java.lang.Object) binds: [B:59:0x011c, B:35:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x011e  */
    /* JADX WARN: Code duplicated, block: B:63:0x012a A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:133:0x02a8, B:134:0x02af, B:10:0x0024, B:121:0x0273, B:97:0x01e4, B:114:0x0253, B:116:0x0257, B:118:0x025b, B:126:0x0282, B:128:0x0286, B:130:0x028a, B:23:0x005f, B:96:0x01e0, B:89:0x01bf, B:91:0x01c3, B:93:0x01c7, B:29:0x0087, B:31:0x0090, B:34:0x009d, B:61:0x0120, B:63:0x012a, B:68:0x0143, B:70:0x014f, B:73:0x0168, B:38:0x00ae, B:58:0x010d, B:55:0x00fd), top: B:137:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0143 A[Catch: all -> 0x0021, TRY_ENTER, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:133:0x02a8, B:134:0x02af, B:10:0x0024, B:121:0x0273, B:97:0x01e4, B:114:0x0253, B:116:0x0257, B:118:0x025b, B:126:0x0282, B:128:0x0286, B:130:0x028a, B:23:0x005f, B:96:0x01e0, B:89:0x01bf, B:91:0x01c3, B:93:0x01c7, B:29:0x0087, B:31:0x0090, B:34:0x009d, B:61:0x0120, B:63:0x012a, B:68:0x0143, B:70:0x014f, B:73:0x0168, B:38:0x00ae, B:58:0x010d, B:55:0x00fd), top: B:137:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:70:0x014f A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:133:0x02a8, B:134:0x02af, B:10:0x0024, B:121:0x0273, B:97:0x01e4, B:114:0x0253, B:116:0x0257, B:118:0x025b, B:126:0x0282, B:128:0x0286, B:130:0x028a, B:23:0x005f, B:96:0x01e0, B:89:0x01bf, B:91:0x01c3, B:93:0x01c7, B:29:0x0087, B:31:0x0090, B:34:0x009d, B:61:0x0120, B:63:0x012a, B:68:0x0143, B:70:0x014f, B:73:0x0168, B:38:0x00ae, B:58:0x010d, B:55:0x00fd), top: B:137:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0166  */
    /* JADX WARN: Code duplicated, block: B:73:0x0168 A[Catch: all -> 0x0021, TRY_LEAVE, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:133:0x02a8, B:134:0x02af, B:10:0x0024, B:121:0x0273, B:97:0x01e4, B:114:0x0253, B:116:0x0257, B:118:0x025b, B:126:0x0282, B:128:0x0286, B:130:0x028a, B:23:0x005f, B:96:0x01e0, B:89:0x01bf, B:91:0x01c3, B:93:0x01c7, B:29:0x0087, B:31:0x0090, B:34:0x009d, B:61:0x0120, B:63:0x012a, B:68:0x0143, B:70:0x014f, B:73:0x0168, B:38:0x00ae, B:58:0x010d, B:55:0x00fd), top: B:137:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:76:0x018f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0198 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x0199 A[Catch: all -> 0x01e9, TryCatch #3 {all -> 0x01e9, blocks: (B:77:0x0192, B:85:0x01a7, B:102:0x01ee, B:106:0x0205, B:80:0x0199, B:83:0x01a1), top: B:140:0x0192 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01a7 A[Catch: all -> 0x01e9, TRY_LEAVE, TryCatch #3 {all -> 0x01e9, blocks: (B:77:0x0192, B:85:0x01a7, B:102:0x01ee, B:106:0x0205, B:80:0x0199, B:83:0x01a1), top: B:140:0x0192 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c3 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:133:0x02a8, B:134:0x02af, B:10:0x0024, B:121:0x0273, B:97:0x01e4, B:114:0x0253, B:116:0x0257, B:118:0x025b, B:126:0x0282, B:128:0x0286, B:130:0x028a, B:23:0x005f, B:96:0x01e0, B:89:0x01bf, B:91:0x01c3, B:93:0x01c7, B:29:0x0087, B:31:0x0090, B:34:0x009d, B:61:0x0120, B:63:0x012a, B:68:0x0143, B:70:0x014f, B:73:0x0168, B:38:0x00ae, B:58:0x010d, B:55:0x00fd), top: B:137:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01c7 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:133:0x02a8, B:134:0x02af, B:10:0x0024, B:121:0x0273, B:97:0x01e4, B:114:0x0253, B:116:0x0257, B:118:0x025b, B:126:0x0282, B:128:0x0286, B:130:0x028a, B:23:0x005f, B:96:0x01e0, B:89:0x01bf, B:91:0x01c3, B:93:0x01c7, B:29:0x0087, B:31:0x0090, B:34:0x009d, B:61:0x0120, B:63:0x012a, B:68:0x0143, B:70:0x014f, B:73:0x0168, B:38:0x00ae, B:58:0x010d, B:55:0x00fd), top: B:137:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01de  */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02a5, code lost:
    
        if (kotlinx.coroutines.BuildersKt.g(r3, r4, r22) == r2) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0135, code lost:
    
        if (r11.send(r4, r22) == r2) goto L132;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.channels.ProducerScope, kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r20v0, types: [kotlinx.coroutines.channels.ProducerScope] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.internal.Ref$BooleanRef] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v0, types: [app.chalo.juspay.JuspayOperationUpdate$Abandoned, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.Ref$BooleanRef] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v18, types: [kotlinx.coroutines.channels.ProducerScope] */
    /* JADX WARN: Type inference failed for: r8v21 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.juspay.JuspayControllerImpl$operationFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
