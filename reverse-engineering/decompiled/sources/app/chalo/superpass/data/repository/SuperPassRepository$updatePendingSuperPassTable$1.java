package app.chalo.superpass.data.repository;

import androidx.compose.runtime.ComposerImplKt;
import app.chalo.superpass.data.dao.SuperPassDao;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.BuildersKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.superpass.data.repository.SuperPassRepository", f = "SuperPassRepository.kt", l = {115, 122, ComposerImplKt.nodeKey, WebSocketProtocol.PAYLOAD_SHORT}, m = "updatePendingSuperPassTable", v = 1)
final class SuperPassRepository$updatePendingSuperPassTable$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SuperPassRepository this$0;

    /* JADX WARN: Code duplicated, block: B:24:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0074 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        SuperPassRepository superPassRepository = this.this$0;
        SuperPassDao superPassDao = superPassRepository.b;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            CoroutineContext coroutineContext = (CoroutineContext) superPassRepository.i.getValue();
            SuperPassRepository$updatePendingSuperPassTable$2 superPassRepository$updatePendingSuperPassTable$2 = new SuperPassRepository$updatePendingSuperPassTable$2(superPassRepository, null);
            this.label = 1;
            if (BuildersKt.g(coroutineContext, superPassRepository$updatePendingSuperPassTable$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return unit;
        }
        if (i2 == 1) {
            ResultKt.b(obj);
            return unit;
        }
        if (i2 == 2) {
            ResultKt.b(obj);
            list = (List) obj;
            String strK = superPassRepository.k();
            this.L$0 = list;
            this.label = 3;
            if (superPassDao.a(strK, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        list = (List) this.L$0;
        ResultKt.b(obj);
        this.L$0 = null;
        this.label = 4;
        if (superPassDao.n(list, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return unit;
    }
}
