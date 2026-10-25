package app.chalo.superpass.data.repository;

import app.chalo.superpass.data.models.pendingSuperPass.PendingSuperPass;
import app.chalo.superpass.data.parser.SuperPassJsonParser;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonArray;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/superpass/data/models/pendingSuperPass/PendingSuperPass;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.superpass.data.repository.SuperPassRepository$updatePendingSuperPassTable$lPendingSuperPassList$1", f = "SuperPassRepository.kt", l = {}, m = "invokeSuspend", v = 1)
final class SuperPassRepository$updatePendingSuperPassTable$lPendingSuperPassList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends PendingSuperPass>>, Object> {
    final /* synthetic */ JsonArray $lRecentTransactionsArray;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassRepository$updatePendingSuperPassTable$lPendingSuperPassList$1(JsonArray jsonArray, Continuation continuation) {
        super(2, continuation);
        this.$lRecentTransactionsArray = jsonArray;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperPassRepository$updatePendingSuperPassTable$lPendingSuperPassList$1(this.$lRecentTransactionsArray, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperPassRepository$updatePendingSuperPassTable$lPendingSuperPassList$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        SuperPassJsonParser superPassJsonParser = SuperPassJsonParser.f9587a;
        return SuperPassJsonParser.g(this.$lRecentTransactionsArray);
    }
}
