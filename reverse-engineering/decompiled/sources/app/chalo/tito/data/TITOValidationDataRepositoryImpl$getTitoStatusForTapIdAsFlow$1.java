package app.chalo.tito.data;

import app.chalo.tito.data.local.TITOValidationDataSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.tito.data.TITOValidationDataRepositoryImpl", f = "TITOValidationDataRepositoryImpl.kt", l = {37}, m = "getTitoStatusForTapIdAsFlow", v = 1)
final class TITOValidationDataRepositoryImpl$getTitoStatusForTapIdAsFlow$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TITOValidationDataRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TITOValidationDataRepositoryImpl$getTitoStatusForTapIdAsFlow$1(TITOValidationDataRepositoryImpl tITOValidationDataRepositoryImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = tITOValidationDataRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TITOValidationDataRepositoryImpl$getTitoStatusForTapIdAsFlow$1 tITOValidationDataRepositoryImpl$getTitoStatusForTapIdAsFlow$1;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        TITOValidationDataRepositoryImpl tITOValidationDataRepositoryImpl = this.this$0;
        tITOValidationDataRepositoryImpl.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            tITOValidationDataRepositoryImpl$getTitoStatusForTapIdAsFlow$1 = this;
        } else {
            tITOValidationDataRepositoryImpl$getTitoStatusForTapIdAsFlow$1 = new TITOValidationDataRepositoryImpl$getTitoStatusForTapIdAsFlow$1(tITOValidationDataRepositoryImpl, this);
        }
        Object objH = tITOValidationDataRepositoryImpl$getTitoStatusForTapIdAsFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tITOValidationDataRepositoryImpl$getTitoStatusForTapIdAsFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objH);
            TITOValidationDataSource tITOValidationDataSource = tITOValidationDataRepositoryImpl.f9629a;
            tITOValidationDataRepositoryImpl$getTitoStatusForTapIdAsFlow$1.label = 1;
            objH = tITOValidationDataSource.h(tITOValidationDataRepositoryImpl$getTitoStatusForTapIdAsFlow$1);
            if (objH == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objH);
        }
        return new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1((Flow) objH);
    }
}
