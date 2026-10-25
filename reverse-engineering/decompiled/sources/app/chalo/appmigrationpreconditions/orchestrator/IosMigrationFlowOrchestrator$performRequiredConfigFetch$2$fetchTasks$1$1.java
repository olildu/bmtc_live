package app.chalo.appmigrationpreconditions.orchestrator;

import app.chalo.onboarding.migration.IosMigrationRequirement;
import app.chalo.utils.ChaloUseCaseResult;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lapp/chalo/utils/ChaloUseCaseResult;", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.appmigrationpreconditions.orchestrator.IosMigrationFlowOrchestrator$performRequiredConfigFetch$2$fetchTasks$1$1", f = "IosMigrationFlowOrchestrator.kt", l = {FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 112, 113}, m = "invokeSuspend", v = 1)
final class IosMigrationFlowOrchestrator$performRequiredConfigFetch$2$fetchTasks$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChaloUseCaseResult<Unit, String>>, Object> {
    final /* synthetic */ IosMigrationRequirement $it;
    Object L$0;
    int label;
    final /* synthetic */ IosMigrationFlowOrchestrator this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f961a;

        static {
            int[] iArr = new int[IosMigrationRequirement.values().length];
            try {
                iArr[IosMigrationRequirement.HISTORY_CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IosMigrationRequirement.HOMESCREEN_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IosMigrationRequirement.CHALO_CONFIG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f961a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IosMigrationFlowOrchestrator$performRequiredConfigFetch$2$fetchTasks$1$1(IosMigrationRequirement iosMigrationRequirement, IosMigrationFlowOrchestrator iosMigrationFlowOrchestrator, Continuation continuation) {
        super(2, continuation);
        this.$it = iosMigrationRequirement;
        this.this$0 = iosMigrationFlowOrchestrator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IosMigrationFlowOrchestrator$performRequiredConfigFetch$2$fetchTasks$1$1(this.$it, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((IosMigrationFlowOrchestrator$performRequiredConfigFetch$2$fetchTasks$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ec, code lost:
    
        if (r6 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0100, code lost:
    
        if (r6 == r0) goto L68;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.appmigrationpreconditions.orchestrator.IosMigrationFlowOrchestrator$performRequiredConfigFetch$2$fetchTasks$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
