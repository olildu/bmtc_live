package app.chalo.features.chaloconfig.impl;

import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigCacheStatus;
import app.chalo.features.chaloconfig.ChaloConfigFetchStatus;
import app.chalo.features.chaloconfig.data.ChaloConfigRepository;
import app.chalo.features.chaloconfig.domain.ChaloConfigDataSnapshotTracker;
import app.chalo.features.chaloconfig.domain.ProcessAndStoreChaloConfigApiResponseUseCase;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.language.data.Language;
import app.chalo.providers.CoroutineContextProvider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/features/chaloconfig/impl/ChaloConfigCacheManager;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloConfigCacheManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LanguageFeature f2652a;
    public final ChaloConfigRepository b;
    public final ProcessAndStoreChaloConfigApiResponseUseCase c;
    public final BasicInfoContract d;
    public final CrashlyticsLogger e;
    public final ChaloConfigDataSnapshotTracker f;
    public final StateFlow g;
    public final MutableStateFlow h;
    public final StateFlow i;
    public final BufferedChannel j;
    public final ContextScope k;

    /* JADX INFO: renamed from: app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager$2", f = "ChaloConfigCacheManager.kt", l = {57}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ChaloConfigCacheManager.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return ((AnonymousClass2) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                ChaloConfigCacheManager chaloConfigCacheManager = ChaloConfigCacheManager.this;
                this.label = 1;
                if (ChaloConfigCacheManager.b(chaloConfigCacheManager, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/chalo/features/chaloconfig/ChaloConfigFetchStatus;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager$3", f = "ChaloConfigCacheManager.kt", l = {85, 87, TsExtractor.TS_STREAM_TYPE_DVBSUBS, 99, 101, 114, 118, TsExtractor.TS_STREAM_TYPE_AC3, 133, TsExtractor.TS_STREAM_TYPE_E_AC3, 137, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 149, 154}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super ChaloConfigFetchStatus>, Boolean, Continuation<? super Unit>, Object> {
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        public AnonymousClass3(Continuation continuation) {
            super(3, continuation);
        }

        public static final void h(Ref.BooleanRef booleanRef, ChaloConfigCacheManager chaloConfigCacheManager, long j) {
            if (booleanRef.element) {
                return;
            }
            chaloConfigCacheManager.f.b(j);
            booleanRef.element = true;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            ((Boolean) obj2).booleanValue();
            AnonymousClass3 anonymousClass3 = ChaloConfigCacheManager.this.new AnonymousClass3((Continuation) obj3);
            anonymousClass3.L$0 = (FlowCollector) obj;
            return anonymousClass3.invokeSuspend(Unit.f17538a);
        }

        /* JADX WARN: Code duplicated, block: B:120:0x0278 A[Catch: all -> 0x0021, TryCatch #1 {all -> 0x0021, blocks: (B:7:0x001c, B:13:0x0037, B:139:0x02f2, B:16:0x0047, B:132:0x02c1, B:19:0x0057, B:123:0x0294, B:125:0x0298, B:127:0x02a8, B:128:0x02aa, B:135:0x02da, B:22:0x006b, B:118:0x0274, B:120:0x0278, B:142:0x030e, B:144:0x0312, B:146:0x0316, B:148:0x031a, B:150:0x031e, B:153:0x0323, B:154:0x0328, B:155:0x0329, B:159:0x034f, B:114:0x024e, B:29:0x0082, B:86:0x01d9, B:87:0x01db, B:89:0x01df, B:92:0x01f7, B:94:0x01fb, B:97:0x0217, B:98:0x021c, B:105:0x022c, B:106:0x0235, B:107:0x0236, B:108:0x023f, B:46:0x00d1, B:67:0x0165, B:69:0x0175, B:72:0x017f, B:74:0x0189, B:77:0x0194, B:49:0x00e6, B:64:0x014c, B:52:0x00f8, B:58:0x0123, B:60:0x0133, B:61:0x0135, B:55:0x0111), top: B:163:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:122:0x0292  */
        /* JADX WARN: Code duplicated, block: B:123:0x0294 A[Catch: all -> 0x0021, PHI: r0 r1 r3 r4
          0x0294: PHI (r0v16 java.lang.Object) = (r0v14 java.lang.Object), (r0v94 java.lang.Object) binds: [B:121:0x0290, B:20:0x005a] A[DONT_GENERATE, DONT_INLINE]
          0x0294: PHI (r1v3 long) = (r1v1 long), (r1v33 long) binds: [B:121:0x0290, B:20:0x005a] A[DONT_GENERATE, DONT_INLINE]
          0x0294: PHI (r3v3 kotlin.jvm.internal.Ref$BooleanRef) = (r3v1 kotlin.jvm.internal.Ref$BooleanRef), (r3v42 kotlin.jvm.internal.Ref$BooleanRef) binds: [B:121:0x0290, B:20:0x005a] A[DONT_GENERATE, DONT_INLINE]
          0x0294: PHI (r4v3 kotlinx.coroutines.flow.FlowCollector) = (r4v1 kotlinx.coroutines.flow.FlowCollector), (r4v34 kotlinx.coroutines.flow.FlowCollector) binds: [B:121:0x0290, B:20:0x005a] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0021, blocks: (B:7:0x001c, B:13:0x0037, B:139:0x02f2, B:16:0x0047, B:132:0x02c1, B:19:0x0057, B:123:0x0294, B:125:0x0298, B:127:0x02a8, B:128:0x02aa, B:135:0x02da, B:22:0x006b, B:118:0x0274, B:120:0x0278, B:142:0x030e, B:144:0x0312, B:146:0x0316, B:148:0x031a, B:150:0x031e, B:153:0x0323, B:154:0x0328, B:155:0x0329, B:159:0x034f, B:114:0x024e, B:29:0x0082, B:86:0x01d9, B:87:0x01db, B:89:0x01df, B:92:0x01f7, B:94:0x01fb, B:97:0x0217, B:98:0x021c, B:105:0x022c, B:106:0x0235, B:107:0x0236, B:108:0x023f, B:46:0x00d1, B:67:0x0165, B:69:0x0175, B:72:0x017f, B:74:0x0189, B:77:0x0194, B:49:0x00e6, B:64:0x014c, B:52:0x00f8, B:58:0x0123, B:60:0x0133, B:61:0x0135, B:55:0x0111), top: B:163:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:125:0x0298 A[Catch: all -> 0x0021, TryCatch #1 {all -> 0x0021, blocks: (B:7:0x001c, B:13:0x0037, B:139:0x02f2, B:16:0x0047, B:132:0x02c1, B:19:0x0057, B:123:0x0294, B:125:0x0298, B:127:0x02a8, B:128:0x02aa, B:135:0x02da, B:22:0x006b, B:118:0x0274, B:120:0x0278, B:142:0x030e, B:144:0x0312, B:146:0x0316, B:148:0x031a, B:150:0x031e, B:153:0x0323, B:154:0x0328, B:155:0x0329, B:159:0x034f, B:114:0x024e, B:29:0x0082, B:86:0x01d9, B:87:0x01db, B:89:0x01df, B:92:0x01f7, B:94:0x01fb, B:97:0x0217, B:98:0x021c, B:105:0x022c, B:106:0x0235, B:107:0x0236, B:108:0x023f, B:46:0x00d1, B:67:0x0165, B:69:0x0175, B:72:0x017f, B:74:0x0189, B:77:0x0194, B:49:0x00e6, B:64:0x014c, B:52:0x00f8, B:58:0x0123, B:60:0x0133, B:61:0x0135, B:55:0x0111), top: B:163:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:127:0x02a8 A[Catch: all -> 0x0021, TryCatch #1 {all -> 0x0021, blocks: (B:7:0x001c, B:13:0x0037, B:139:0x02f2, B:16:0x0047, B:132:0x02c1, B:19:0x0057, B:123:0x0294, B:125:0x0298, B:127:0x02a8, B:128:0x02aa, B:135:0x02da, B:22:0x006b, B:118:0x0274, B:120:0x0278, B:142:0x030e, B:144:0x0312, B:146:0x0316, B:148:0x031a, B:150:0x031e, B:153:0x0323, B:154:0x0328, B:155:0x0329, B:159:0x034f, B:114:0x024e, B:29:0x0082, B:86:0x01d9, B:87:0x01db, B:89:0x01df, B:92:0x01f7, B:94:0x01fb, B:97:0x0217, B:98:0x021c, B:105:0x022c, B:106:0x0235, B:107:0x0236, B:108:0x023f, B:46:0x00d1, B:67:0x0165, B:69:0x0175, B:72:0x017f, B:74:0x0189, B:77:0x0194, B:49:0x00e6, B:64:0x014c, B:52:0x00f8, B:58:0x0123, B:60:0x0133, B:61:0x0135, B:55:0x0111), top: B:163:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:130:0x02be  */
        /* JADX WARN: Code duplicated, block: B:131:0x02c0  */
        /* JADX WARN: Code duplicated, block: B:134:0x02d8  */
        /* JADX WARN: Code duplicated, block: B:135:0x02da A[Catch: all -> 0x0021, TryCatch #1 {all -> 0x0021, blocks: (B:7:0x001c, B:13:0x0037, B:139:0x02f2, B:16:0x0047, B:132:0x02c1, B:19:0x0057, B:123:0x0294, B:125:0x0298, B:127:0x02a8, B:128:0x02aa, B:135:0x02da, B:22:0x006b, B:118:0x0274, B:120:0x0278, B:142:0x030e, B:144:0x0312, B:146:0x0316, B:148:0x031a, B:150:0x031e, B:153:0x0323, B:154:0x0328, B:155:0x0329, B:159:0x034f, B:114:0x024e, B:29:0x0082, B:86:0x01d9, B:87:0x01db, B:89:0x01df, B:92:0x01f7, B:94:0x01fb, B:97:0x0217, B:98:0x021c, B:105:0x022c, B:106:0x0235, B:107:0x0236, B:108:0x023f, B:46:0x00d1, B:67:0x0165, B:69:0x0175, B:72:0x017f, B:74:0x0189, B:77:0x0194, B:49:0x00e6, B:64:0x014c, B:52:0x00f8, B:58:0x0123, B:60:0x0133, B:61:0x0135, B:55:0x0111), top: B:163:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:137:0x02f0  */
        /* JADX WARN: Code duplicated, block: B:138:0x02f1  */
        /* JADX WARN: Code duplicated, block: B:141:0x030d  */
        /* JADX WARN: Code duplicated, block: B:142:0x030e A[Catch: all -> 0x0021, TryCatch #1 {all -> 0x0021, blocks: (B:7:0x001c, B:13:0x0037, B:139:0x02f2, B:16:0x0047, B:132:0x02c1, B:19:0x0057, B:123:0x0294, B:125:0x0298, B:127:0x02a8, B:128:0x02aa, B:135:0x02da, B:22:0x006b, B:118:0x0274, B:120:0x0278, B:142:0x030e, B:144:0x0312, B:146:0x0316, B:148:0x031a, B:150:0x031e, B:153:0x0323, B:154:0x0328, B:155:0x0329, B:159:0x034f, B:114:0x024e, B:29:0x0082, B:86:0x01d9, B:87:0x01db, B:89:0x01df, B:92:0x01f7, B:94:0x01fb, B:97:0x0217, B:98:0x021c, B:105:0x022c, B:106:0x0235, B:107:0x0236, B:108:0x023f, B:46:0x00d1, B:67:0x0165, B:69:0x0175, B:72:0x017f, B:74:0x0189, B:77:0x0194, B:49:0x00e6, B:64:0x014c, B:52:0x00f8, B:58:0x0123, B:60:0x0133, B:61:0x0135, B:55:0x0111), top: B:163:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:60:0x0133 A[Catch: all -> 0x0021, ChaloLocalException -> 0x0070, CancellationException -> 0x0073, Exception -> 0x024e, TryCatch #1 {all -> 0x0021, blocks: (B:7:0x001c, B:13:0x0037, B:139:0x02f2, B:16:0x0047, B:132:0x02c1, B:19:0x0057, B:123:0x0294, B:125:0x0298, B:127:0x02a8, B:128:0x02aa, B:135:0x02da, B:22:0x006b, B:118:0x0274, B:120:0x0278, B:142:0x030e, B:144:0x0312, B:146:0x0316, B:148:0x031a, B:150:0x031e, B:153:0x0323, B:154:0x0328, B:155:0x0329, B:159:0x034f, B:114:0x024e, B:29:0x0082, B:86:0x01d9, B:87:0x01db, B:89:0x01df, B:92:0x01f7, B:94:0x01fb, B:97:0x0217, B:98:0x021c, B:105:0x022c, B:106:0x0235, B:107:0x0236, B:108:0x023f, B:46:0x00d1, B:67:0x0165, B:69:0x0175, B:72:0x017f, B:74:0x0189, B:77:0x0194, B:49:0x00e6, B:64:0x014c, B:52:0x00f8, B:58:0x0123, B:60:0x0133, B:61:0x0135, B:55:0x0111), top: B:163:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:63:0x014a  */
        /* JADX WARN: Code duplicated, block: B:64:0x014c A[Catch: all -> 0x0021, ChaloLocalException -> 0x0070, CancellationException -> 0x0073, Exception -> 0x024e, PHI: r0 r1 r3 r4 r5
          0x014c: PHI (r0v50 app.chalo.features.language.data.Language) = (r0v46 app.chalo.features.language.data.Language), (r0v52 app.chalo.features.language.data.Language) binds: [B:62:0x0148, B:50:0x00e9] A[DONT_GENERATE, DONT_INLINE]
          0x014c: PHI (r1v10 long) = (r1v8 long), (r1v11 long) binds: [B:62:0x0148, B:50:0x00e9] A[DONT_GENERATE, DONT_INLINE]
          0x014c: PHI (r3v11 kotlin.jvm.internal.Ref$BooleanRef) = (r3v8 kotlin.jvm.internal.Ref$BooleanRef), (r3v13 kotlin.jvm.internal.Ref$BooleanRef) binds: [B:62:0x0148, B:50:0x00e9] A[DONT_GENERATE, DONT_INLINE]
          0x014c: PHI (r4v14 kotlinx.coroutines.flow.FlowCollector) = (r4v11 kotlinx.coroutines.flow.FlowCollector), (r4v16 kotlinx.coroutines.flow.FlowCollector) binds: [B:62:0x0148, B:50:0x00e9] A[DONT_GENERATE, DONT_INLINE]
          0x014c: PHI (r5v19 java.lang.Object) = (r5v18 java.lang.Object), (r5v22 java.lang.Object) binds: [B:62:0x0148, B:50:0x00e9] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0021, blocks: (B:7:0x001c, B:13:0x0037, B:139:0x02f2, B:16:0x0047, B:132:0x02c1, B:19:0x0057, B:123:0x0294, B:125:0x0298, B:127:0x02a8, B:128:0x02aa, B:135:0x02da, B:22:0x006b, B:118:0x0274, B:120:0x0278, B:142:0x030e, B:144:0x0312, B:146:0x0316, B:148:0x031a, B:150:0x031e, B:153:0x0323, B:154:0x0328, B:155:0x0329, B:159:0x034f, B:114:0x024e, B:29:0x0082, B:86:0x01d9, B:87:0x01db, B:89:0x01df, B:92:0x01f7, B:94:0x01fb, B:97:0x0217, B:98:0x021c, B:105:0x022c, B:106:0x0235, B:107:0x0236, B:108:0x023f, B:46:0x00d1, B:67:0x0165, B:69:0x0175, B:72:0x017f, B:74:0x0189, B:77:0x0194, B:49:0x00e6, B:64:0x014c, B:52:0x00f8, B:58:0x0123, B:60:0x0133, B:61:0x0135, B:55:0x0111), top: B:163:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:66:0x0163  */
        /* JADX WARN: Code duplicated, block: B:67:0x0165 A[Catch: all -> 0x0021, ChaloLocalException -> 0x0070, CancellationException -> 0x0073, Exception -> 0x024e, PHI: r0 r1 r3 r4 r5
          0x0165: PHI (r0v53 app.chalo.features.language.data.Language) = (r0v50 app.chalo.features.language.data.Language), (r0v56 app.chalo.features.language.data.Language) binds: [B:65:0x0161, B:47:0x00d4] A[DONT_GENERATE, DONT_INLINE]
          0x0165: PHI (r1v12 long) = (r1v10 long), (r1v14 long) binds: [B:65:0x0161, B:47:0x00d4] A[DONT_GENERATE, DONT_INLINE]
          0x0165: PHI (r3v14 kotlin.jvm.internal.Ref$BooleanRef) = (r3v11 kotlin.jvm.internal.Ref$BooleanRef), (r3v16 kotlin.jvm.internal.Ref$BooleanRef) binds: [B:65:0x0161, B:47:0x00d4] A[DONT_GENERATE, DONT_INLINE]
          0x0165: PHI (r4v17 kotlinx.coroutines.flow.FlowCollector) = (r4v14 kotlinx.coroutines.flow.FlowCollector), (r4v19 kotlinx.coroutines.flow.FlowCollector) binds: [B:65:0x0161, B:47:0x00d4] A[DONT_GENERATE, DONT_INLINE]
          0x0165: PHI (r5v23 java.lang.Object) = (r5v21 java.lang.Object), (r5v32 java.lang.Object) binds: [B:65:0x0161, B:47:0x00d4] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0021, blocks: (B:7:0x001c, B:13:0x0037, B:139:0x02f2, B:16:0x0047, B:132:0x02c1, B:19:0x0057, B:123:0x0294, B:125:0x0298, B:127:0x02a8, B:128:0x02aa, B:135:0x02da, B:22:0x006b, B:118:0x0274, B:120:0x0278, B:142:0x030e, B:144:0x0312, B:146:0x0316, B:148:0x031a, B:150:0x031e, B:153:0x0323, B:154:0x0328, B:155:0x0329, B:159:0x034f, B:114:0x024e, B:29:0x0082, B:86:0x01d9, B:87:0x01db, B:89:0x01df, B:92:0x01f7, B:94:0x01fb, B:97:0x0217, B:98:0x021c, B:105:0x022c, B:106:0x0235, B:107:0x0236, B:108:0x023f, B:46:0x00d1, B:67:0x0165, B:69:0x0175, B:72:0x017f, B:74:0x0189, B:77:0x0194, B:49:0x00e6, B:64:0x014c, B:52:0x00f8, B:58:0x0123, B:60:0x0133, B:61:0x0135, B:55:0x0111), top: B:163:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:69:0x0175 A[Catch: all -> 0x0021, ChaloLocalException -> 0x0070, CancellationException -> 0x0073, Exception -> 0x024e, TryCatch #1 {all -> 0x0021, blocks: (B:7:0x001c, B:13:0x0037, B:139:0x02f2, B:16:0x0047, B:132:0x02c1, B:19:0x0057, B:123:0x0294, B:125:0x0298, B:127:0x02a8, B:128:0x02aa, B:135:0x02da, B:22:0x006b, B:118:0x0274, B:120:0x0278, B:142:0x030e, B:144:0x0312, B:146:0x0316, B:148:0x031a, B:150:0x031e, B:153:0x0323, B:154:0x0328, B:155:0x0329, B:159:0x034f, B:114:0x024e, B:29:0x0082, B:86:0x01d9, B:87:0x01db, B:89:0x01df, B:92:0x01f7, B:94:0x01fb, B:97:0x0217, B:98:0x021c, B:105:0x022c, B:106:0x0235, B:107:0x0236, B:108:0x023f, B:46:0x00d1, B:67:0x0165, B:69:0x0175, B:72:0x017f, B:74:0x0189, B:77:0x0194, B:49:0x00e6, B:64:0x014c, B:52:0x00f8, B:58:0x0123, B:60:0x0133, B:61:0x0135, B:55:0x0111), top: B:163:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:71:0x017d  */
        /* JADX WARN: Code duplicated, block: B:74:0x0189 A[Catch: all -> 0x0021, ChaloLocalException -> 0x0070, CancellationException -> 0x0073, Exception -> 0x024e, TRY_LEAVE, TryCatch #1 {all -> 0x0021, blocks: (B:7:0x001c, B:13:0x0037, B:139:0x02f2, B:16:0x0047, B:132:0x02c1, B:19:0x0057, B:123:0x0294, B:125:0x0298, B:127:0x02a8, B:128:0x02aa, B:135:0x02da, B:22:0x006b, B:118:0x0274, B:120:0x0278, B:142:0x030e, B:144:0x0312, B:146:0x0316, B:148:0x031a, B:150:0x031e, B:153:0x0323, B:154:0x0328, B:155:0x0329, B:159:0x034f, B:114:0x024e, B:29:0x0082, B:86:0x01d9, B:87:0x01db, B:89:0x01df, B:92:0x01f7, B:94:0x01fb, B:97:0x0217, B:98:0x021c, B:105:0x022c, B:106:0x0235, B:107:0x0236, B:108:0x023f, B:46:0x00d1, B:67:0x0165, B:69:0x0175, B:72:0x017f, B:74:0x0189, B:77:0x0194, B:49:0x00e6, B:64:0x014c, B:52:0x00f8, B:58:0x0123, B:60:0x0133, B:61:0x0135, B:55:0x0111), top: B:163:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:77:0x0194 A[Catch: all -> 0x0021, ChaloLocalException -> 0x0070, CancellationException -> 0x0073, Exception -> 0x024e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0021, blocks: (B:7:0x001c, B:13:0x0037, B:139:0x02f2, B:16:0x0047, B:132:0x02c1, B:19:0x0057, B:123:0x0294, B:125:0x0298, B:127:0x02a8, B:128:0x02aa, B:135:0x02da, B:22:0x006b, B:118:0x0274, B:120:0x0278, B:142:0x030e, B:144:0x0312, B:146:0x0316, B:148:0x031a, B:150:0x031e, B:153:0x0323, B:154:0x0328, B:155:0x0329, B:159:0x034f, B:114:0x024e, B:29:0x0082, B:86:0x01d9, B:87:0x01db, B:89:0x01df, B:92:0x01f7, B:94:0x01fb, B:97:0x0217, B:98:0x021c, B:105:0x022c, B:106:0x0235, B:107:0x0236, B:108:0x023f, B:46:0x00d1, B:67:0x0165, B:69:0x0175, B:72:0x017f, B:74:0x0189, B:77:0x0194, B:49:0x00e6, B:64:0x014c, B:52:0x00f8, B:58:0x0123, B:60:0x0133, B:61:0x0135, B:55:0x0111), top: B:163:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:80:0x01af  */
        /* JADX WARN: Code duplicated, block: B:85:0x01d6  */
        /* JADX WARN: Code duplicated, block: B:89:0x01df A[Catch: all -> 0x0021, ChaloLocalException -> 0x0070, CancellationException -> 0x0073, Exception -> 0x024e, TryCatch #1 {all -> 0x0021, blocks: (B:7:0x001c, B:13:0x0037, B:139:0x02f2, B:16:0x0047, B:132:0x02c1, B:19:0x0057, B:123:0x0294, B:125:0x0298, B:127:0x02a8, B:128:0x02aa, B:135:0x02da, B:22:0x006b, B:118:0x0274, B:120:0x0278, B:142:0x030e, B:144:0x0312, B:146:0x0316, B:148:0x031a, B:150:0x031e, B:153:0x0323, B:154:0x0328, B:155:0x0329, B:159:0x034f, B:114:0x024e, B:29:0x0082, B:86:0x01d9, B:87:0x01db, B:89:0x01df, B:92:0x01f7, B:94:0x01fb, B:97:0x0217, B:98:0x021c, B:105:0x022c, B:106:0x0235, B:107:0x0236, B:108:0x023f, B:46:0x00d1, B:67:0x0165, B:69:0x0175, B:72:0x017f, B:74:0x0189, B:77:0x0194, B:49:0x00e6, B:64:0x014c, B:52:0x00f8, B:58:0x0123, B:60:0x0133, B:61:0x0135, B:55:0x0111), top: B:163:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:91:0x01f5  */
        /* JADX WARN: Code duplicated, block: B:92:0x01f7 A[Catch: all -> 0x0021, ChaloLocalException -> 0x0070, CancellationException -> 0x0073, Exception -> 0x024e, TryCatch #1 {all -> 0x0021, blocks: (B:7:0x001c, B:13:0x0037, B:139:0x02f2, B:16:0x0047, B:132:0x02c1, B:19:0x0057, B:123:0x0294, B:125:0x0298, B:127:0x02a8, B:128:0x02aa, B:135:0x02da, B:22:0x006b, B:118:0x0274, B:120:0x0278, B:142:0x030e, B:144:0x0312, B:146:0x0316, B:148:0x031a, B:150:0x031e, B:153:0x0323, B:154:0x0328, B:155:0x0329, B:159:0x034f, B:114:0x024e, B:29:0x0082, B:86:0x01d9, B:87:0x01db, B:89:0x01df, B:92:0x01f7, B:94:0x01fb, B:97:0x0217, B:98:0x021c, B:105:0x022c, B:106:0x0235, B:107:0x0236, B:108:0x023f, B:46:0x00d1, B:67:0x0165, B:69:0x0175, B:72:0x017f, B:74:0x0189, B:77:0x0194, B:49:0x00e6, B:64:0x014c, B:52:0x00f8, B:58:0x0123, B:60:0x0133, B:61:0x0135, B:55:0x0111), top: B:163:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:94:0x01fb A[Catch: all -> 0x0021, ChaloLocalException -> 0x0070, CancellationException -> 0x0073, Exception -> 0x024e, TryCatch #1 {all -> 0x0021, blocks: (B:7:0x001c, B:13:0x0037, B:139:0x02f2, B:16:0x0047, B:132:0x02c1, B:19:0x0057, B:123:0x0294, B:125:0x0298, B:127:0x02a8, B:128:0x02aa, B:135:0x02da, B:22:0x006b, B:118:0x0274, B:120:0x0278, B:142:0x030e, B:144:0x0312, B:146:0x0316, B:148:0x031a, B:150:0x031e, B:153:0x0323, B:154:0x0328, B:155:0x0329, B:159:0x034f, B:114:0x024e, B:29:0x0082, B:86:0x01d9, B:87:0x01db, B:89:0x01df, B:92:0x01f7, B:94:0x01fb, B:97:0x0217, B:98:0x021c, B:105:0x022c, B:106:0x0235, B:107:0x0236, B:108:0x023f, B:46:0x00d1, B:67:0x0165, B:69:0x0175, B:72:0x017f, B:74:0x0189, B:77:0x0194, B:49:0x00e6, B:64:0x014c, B:52:0x00f8, B:58:0x0123, B:60:0x0133, B:61:0x0135, B:55:0x0111), top: B:163:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:96:0x0215  */
        /* JADX WARN: Code duplicated, block: B:97:0x0217 A[Catch: all -> 0x0021, ChaloLocalException -> 0x0070, CancellationException -> 0x0073, Exception -> 0x024e, TryCatch #1 {all -> 0x0021, blocks: (B:7:0x001c, B:13:0x0037, B:139:0x02f2, B:16:0x0047, B:132:0x02c1, B:19:0x0057, B:123:0x0294, B:125:0x0298, B:127:0x02a8, B:128:0x02aa, B:135:0x02da, B:22:0x006b, B:118:0x0274, B:120:0x0278, B:142:0x030e, B:144:0x0312, B:146:0x0316, B:148:0x031a, B:150:0x031e, B:153:0x0323, B:154:0x0328, B:155:0x0329, B:159:0x034f, B:114:0x024e, B:29:0x0082, B:86:0x01d9, B:87:0x01db, B:89:0x01df, B:92:0x01f7, B:94:0x01fb, B:97:0x0217, B:98:0x021c, B:105:0x022c, B:106:0x0235, B:107:0x0236, B:108:0x023f, B:46:0x00d1, B:67:0x0165, B:69:0x0175, B:72:0x017f, B:74:0x0189, B:77:0x0194, B:49:0x00e6, B:64:0x014c, B:52:0x00f8, B:58:0x0123, B:60:0x0133, B:61:0x0135, B:55:0x0111), top: B:163:0x000a }] */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x0269, code lost:
        
            if (r4.emit(r0, r16) == r7) goto L157;
         */
        /* JADX WARN: Code restructure failed: missing block: B:156:0x034b, code lost:
        
            if (r4.emit(r0, r16) == r7) goto L157;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 888
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ChaloConfigCacheManager(LanguageFeature languageFeature, ChaloConfigRepository chaloConfigRepository, ProcessAndStoreChaloConfigApiResponseUseCase processAndStoreChaloConfigApiResponseUseCase, BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger, ChaloConfigDataSnapshotTracker chaloConfigDataSnapshotTracker, CoroutineContextProvider coroutineContextProvider) {
        this.f2652a = languageFeature;
        this.b = chaloConfigRepository;
        this.c = processAndStoreChaloConfigApiResponseUseCase;
        this.d = basicInfoContract;
        this.e = crashlyticsLogger;
        this.f = chaloConfigDataSnapshotTracker;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(ChaloConfigCacheStatus.CACHE_STATUS_UNKNOWN);
        this.h = mutableStateFlowA;
        this.i = FlowKt.c(mutableStateFlowA);
        BufferedChannel bufferedChannelA = ChannelKt.a(-2, 6, null);
        this.j = bufferedChannelA;
        ContextScope contextScopeA = CoroutineScopeKt.a(coroutineContextProvider.b());
        this.k = contextScopeA;
        BuildersKt.d(contextScopeA, null, null, new ChaloConfigCacheManager$initializeCachedDataStatusCollection$1(this, null), 3);
        final Flow flowD = FlowKt.D(bufferedChannelA);
        this.g = FlowKt.G(FlowKt.H(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new Flow<Boolean>() { // from class: app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager$special$$inlined$filter$1

            /* JADX INFO: renamed from: app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager$special$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f2655a;
                public final /* synthetic */ ChaloConfigCacheManager b;

                /* JADX INFO: renamed from: app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager$special$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager$special$$inlined$filter$1$2", f = "ChaloConfigCacheManager.kt", l = {51, 50}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, ChaloConfigCacheManager chaloConfigCacheManager) {
                    this.f2655a = flowCollector;
                    this.b = chaloConfigCacheManager;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
                
                    if (r7.emit(r2, r0) == r1) goto L24;
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager$special$$inlined$filter$1$2$1 r0 = (app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager$special$$inlined$filter$1$2$1 r0 = new app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager$special$$inlined$filter$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3c
                        if (r2 == r4) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.ResultKt.b(r8)
                        goto L70
                    L2a:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L32:
                        java.lang.Object r7 = r0.L$1
                        kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                        java.lang.Object r2 = r0.L$0
                        kotlin.ResultKt.b(r8)
                        goto L5a
                    L3c:
                        kotlin.ResultKt.b(r8)
                        r8 = r7
                        java.lang.Boolean r8 = (java.lang.Boolean) r8
                        boolean r8 = r8.booleanValue()
                        r0.L$0 = r7
                        kotlinx.coroutines.flow.FlowCollector r2 = r6.f2655a
                        r0.L$1 = r2
                        r0.label = r4
                        app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager r4 = r6.b
                        java.lang.Object r8 = app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager.a(r4, r8, r0)
                        if (r8 != r1) goto L57
                        goto L6f
                    L57:
                        r5 = r2
                        r2 = r7
                        r7 = r5
                    L5a:
                        java.lang.Boolean r8 = (java.lang.Boolean) r8
                        boolean r8 = r8.booleanValue()
                        if (r8 == 0) goto L70
                        r8 = 0
                        r0.L$0 = r8
                        r0.L$1 = r8
                        r0.label = r3
                        java.lang.Object r7 = r7.emit(r2, r0)
                        if (r7 != r1) goto L70
                    L6f:
                        return r1
                    L70:
                        kotlin.Unit r7 = kotlin.Unit.f17538a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowD.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        }, new AnonymousClass2(null)), new AnonymousClass3(null)), contextScopeA, SharingStarted.Companion.f17836a, ChaloConfigFetchStatus.FETCHING_NOT_STARTED);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(ChaloConfigCacheManager chaloConfigCacheManager, boolean z, ContinuationImpl continuationImpl) {
        ChaloConfigCacheManager$shouldScheduleRequest$1 chaloConfigCacheManager$shouldScheduleRequest$1;
        chaloConfigCacheManager.getClass();
        if (continuationImpl instanceof ChaloConfigCacheManager$shouldScheduleRequest$1) {
            chaloConfigCacheManager$shouldScheduleRequest$1 = (ChaloConfigCacheManager$shouldScheduleRequest$1) continuationImpl;
            int i = chaloConfigCacheManager$shouldScheduleRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloConfigCacheManager$shouldScheduleRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloConfigCacheManager$shouldScheduleRequest$1 = new ChaloConfigCacheManager$shouldScheduleRequest$1(chaloConfigCacheManager, continuationImpl);
            }
        } else {
            chaloConfigCacheManager$shouldScheduleRequest$1 = new ChaloConfigCacheManager$shouldScheduleRequest$1(chaloConfigCacheManager, continuationImpl);
        }
        Object objC = chaloConfigCacheManager$shouldScheduleRequest$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloConfigCacheManager$shouldScheduleRequest$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            if (!z) {
                chaloConfigCacheManager$shouldScheduleRequest$1.label = 1;
                objC = chaloConfigCacheManager.c(chaloConfigCacheManager$shouldScheduleRequest$1);
                if (objC != obj) {
                }
            }
            return Boolean.TRUE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
            return objC;
        }
        ResultKt.b(objC);
        if (!((Boolean) objC).booleanValue()) {
            chaloConfigCacheManager$shouldScheduleRequest$1.label = 2;
            Object objD = chaloConfigCacheManager.d(chaloConfigCacheManager$shouldScheduleRequest$1);
            return objD == obj ? obj : objD;
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(ChaloConfigCacheManager chaloConfigCacheManager, ContinuationImpl continuationImpl) {
        ChaloConfigCacheManager$updateCacheStatusAccordingToRequestParameters$1 chaloConfigCacheManager$updateCacheStatusAccordingToRequestParameters$1;
        chaloConfigCacheManager.getClass();
        if (continuationImpl instanceof ChaloConfigCacheManager$updateCacheStatusAccordingToRequestParameters$1) {
            chaloConfigCacheManager$updateCacheStatusAccordingToRequestParameters$1 = (ChaloConfigCacheManager$updateCacheStatusAccordingToRequestParameters$1) continuationImpl;
            int i = chaloConfigCacheManager$updateCacheStatusAccordingToRequestParameters$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloConfigCacheManager$updateCacheStatusAccordingToRequestParameters$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloConfigCacheManager$updateCacheStatusAccordingToRequestParameters$1 = new ChaloConfigCacheManager$updateCacheStatusAccordingToRequestParameters$1(chaloConfigCacheManager, continuationImpl);
            }
        } else {
            chaloConfigCacheManager$updateCacheStatusAccordingToRequestParameters$1 = new ChaloConfigCacheManager$updateCacheStatusAccordingToRequestParameters$1(chaloConfigCacheManager, continuationImpl);
        }
        Object objD = chaloConfigCacheManager$updateCacheStatusAccordingToRequestParameters$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloConfigCacheManager$updateCacheStatusAccordingToRequestParameters$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objD);
            chaloConfigCacheManager$updateCacheStatusAccordingToRequestParameters$1.label = 1;
            objD = chaloConfigCacheManager.d(chaloConfigCacheManager$updateCacheStatusAccordingToRequestParameters$1);
            if (objD != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
            return unit;
        }
        ResultKt.b(objD);
        if (((Boolean) objD).booleanValue()) {
            ChaloConfigRepository chaloConfigRepository = chaloConfigCacheManager.b;
            ChaloConfigCacheStatus chaloConfigCacheStatus = ChaloConfigCacheStatus.OLD_LANGUAGE_DATA_CACHED;
            chaloConfigCacheManager$updateCacheStatusAccordingToRequestParameters$1.label = 2;
            if (chaloConfigRepository.g(chaloConfigCacheStatus, chaloConfigCacheManager$updateCacheStatusAccordingToRequestParameters$1) == obj) {
                return obj;
            }
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r6 == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager$isCacheEmptyOrExpired$1
            if (r0 == 0) goto L13
            r0 = r6
            app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager$isCacheEmptyOrExpired$1 r0 = (app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager$isCacheEmptyOrExpired$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager$isCacheEmptyOrExpired$1 r0 = new app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager$isCacheEmptyOrExpired$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r6)
            goto L4f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.ResultKt.b(r6)
            goto L44
        L36:
            kotlin.ResultKt.b(r6)
            r0.label = r4
            app.chalo.features.chaloconfig.data.ChaloConfigRepository r6 = r5.b
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L44
            goto L4e
        L44:
            kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.v(r6, r0)
            if (r6 != r1) goto L4f
        L4e:
            return r1
        L4f:
            app.chalo.features.chaloconfig.ChaloConfigCacheStatus r6 = (app.chalo.features.chaloconfig.ChaloConfigCacheStatus) r6
            if (r6 == 0) goto L59
            app.chalo.features.chaloconfig.ChaloConfigCacheStatus r0 = app.chalo.features.chaloconfig.ChaloConfigCacheStatus.CACHE_EXPIRED
            if (r6 != r0) goto L58
            goto L59
        L58:
            r4 = 0
        L59:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.features.chaloconfig.impl.ChaloConfigCacheManager.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ContinuationImpl continuationImpl) {
        ChaloConfigCacheManager$isOldLanguageCached$1 chaloConfigCacheManager$isOldLanguageCached$1;
        boolean z;
        if (continuationImpl instanceof ChaloConfigCacheManager$isOldLanguageCached$1) {
            chaloConfigCacheManager$isOldLanguageCached$1 = (ChaloConfigCacheManager$isOldLanguageCached$1) continuationImpl;
            int i = chaloConfigCacheManager$isOldLanguageCached$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloConfigCacheManager$isOldLanguageCached$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloConfigCacheManager$isOldLanguageCached$1 = new ChaloConfigCacheManager$isOldLanguageCached$1(this, continuationImpl);
            }
        } else {
            chaloConfigCacheManager$isOldLanguageCached$1 = new ChaloConfigCacheManager$isOldLanguageCached$1(this, continuationImpl);
        }
        Object objJ = chaloConfigCacheManager$isOldLanguageCached$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloConfigCacheManager$isOldLanguageCached$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ);
            chaloConfigCacheManager$isOldLanguageCached$1.label = 1;
            objJ = this.b.j(chaloConfigCacheManager$isOldLanguageCached$1);
            if (objJ == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objJ);
        }
        Language language = (Language) objJ;
        if (language != null) {
            Language language2 = (Language) this.f2652a.getE().getValue();
            if (language2 == null) {
                language2 = Language.ENGLISH;
            }
            z = language != language2;
        }
        return Boolean.valueOf(z);
    }
}
