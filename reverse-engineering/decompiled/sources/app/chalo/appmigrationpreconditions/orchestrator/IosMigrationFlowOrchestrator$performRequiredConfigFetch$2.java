package app.chalo.appmigrationpreconditions.orchestrator;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.onboarding.migration.IosMigrationRequirement;
import app.chalo.utils.ChaloUseCaseResult;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.ib0;
import defpackage.vo1;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lapp/chalo/utils/ChaloUseCaseResult;", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.appmigrationpreconditions.orchestrator.IosMigrationFlowOrchestrator$performRequiredConfigFetch$2", f = "IosMigrationFlowOrchestrator.kt", l = {118}, m = "invokeSuspend", v = 1)
final class IosMigrationFlowOrchestrator$performRequiredConfigFetch$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChaloUseCaseResult<Unit, String>>, Object> {
    final /* synthetic */ List<IosMigrationRequirement> $list;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IosMigrationFlowOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IosMigrationFlowOrchestrator$performRequiredConfigFetch$2(List list, IosMigrationFlowOrchestrator iosMigrationFlowOrchestrator, Continuation continuation) {
        super(2, continuation);
        this.$list = list;
        this.this$0 = iosMigrationFlowOrchestrator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        IosMigrationFlowOrchestrator$performRequiredConfigFetch$2 iosMigrationFlowOrchestrator$performRequiredConfigFetch$2 = new IosMigrationFlowOrchestrator$performRequiredConfigFetch$2(this.$list, this.this$0, continuation);
        iosMigrationFlowOrchestrator$performRequiredConfigFetch$2.L$0 = obj;
        return iosMigrationFlowOrchestrator$performRequiredConfigFetch$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((IosMigrationFlowOrchestrator$performRequiredConfigFetch$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            if (this.$list.isEmpty()) {
                return new ChaloUseCaseResult.Success(Unit.f17538a);
            }
            this.this$0.getClass();
            AnalyticsContractImplKt.b(null, "ios migration config fetch", Source.APP_MIGRATION_PRECONDITION_SCREEN, vo1.s("result", CollectionsKt.O(this.$list, null, null, null, new ib0(9), 31)), false, 24);
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        List list = (List) obj;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((ChaloUseCaseResult) next) instanceof ChaloUseCaseResult.Failure));
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) next;
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            }
            if (((ChaloUseCaseResult) it2.next()) instanceof ChaloUseCaseResult.Failure) {
                break;
            }
            i2++;
        }
        IosMigrationFlowOrchestrator iosMigrationFlowOrchestrator = this.this$0;
        List<IosMigrationRequirement> list2 = this.$list;
        iosMigrationFlowOrchestrator.getClass();
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            AnalyticsContractImplKt.b(null, "ios migration config failed", Source.APP_MIGRATION_PRECONDITION_SCREEN, MapsKt.i(new Pair("result", CollectionsKt.O(list2, null, null, null, new ib0(7), 31)), new Pair("error message", ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a), new Pair(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2))), false, 24);
            throw null;
        }
        AnalyticsContractImplKt.b(null, "ios migration config success", Source.APP_MIGRATION_PRECONDITION_SCREEN, vo1.s("result", CollectionsKt.O(list2, null, null, null, new ib0(8), 31)), false, 24);
        throw null;
    }
}
