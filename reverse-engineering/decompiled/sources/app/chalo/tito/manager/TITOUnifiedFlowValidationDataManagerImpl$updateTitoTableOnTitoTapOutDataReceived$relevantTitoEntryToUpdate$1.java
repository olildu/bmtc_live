package app.chalo.tito.manager;

import app.chalo.titoridedetail.data.app.TITOValidationAppModel;
import app.chalo.titoridedetail.data.app.TitoValidationStatus;
import app.chalo.titoridedetail.data.app.TitoValidationStatusKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lapp/chalo/titoridedetail/data/app/TITOValidationAppModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.tito.manager.TITOUnifiedFlowValidationDataManagerImpl$updateTitoTableOnTitoTapOutDataReceived$relevantTitoEntryToUpdate$1", f = "TITOUnifiedFlowValidationDataManagerImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class TITOUnifiedFlowValidationDataManagerImpl$updateTitoTableOnTitoTapOutDataReceived$relevantTitoEntryToUpdate$1 extends SuspendLambda implements Function2<TITOValidationAppModel, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TITOUnifiedFlowValidationDataManagerImpl$updateTitoTableOnTitoTapOutDataReceived$relevantTitoEntryToUpdate$1 tITOUnifiedFlowValidationDataManagerImpl$updateTitoTableOnTitoTapOutDataReceived$relevantTitoEntryToUpdate$1 = new TITOUnifiedFlowValidationDataManagerImpl$updateTitoTableOnTitoTapOutDataReceived$relevantTitoEntryToUpdate$1(2, continuation);
        tITOUnifiedFlowValidationDataManagerImpl$updateTitoTableOnTitoTapOutDataReceived$relevantTitoEntryToUpdate$1.L$0 = obj;
        return tITOUnifiedFlowValidationDataManagerImpl$updateTitoTableOnTitoTapOutDataReceived$relevantTitoEntryToUpdate$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TITOUnifiedFlowValidationDataManagerImpl$updateTitoTableOnTitoTapOutDataReceived$relevantTitoEntryToUpdate$1) create((TITOValidationAppModel) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TitoValidationStatus titoValidationStatus;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        TITOValidationAppModel tITOValidationAppModel = (TITOValidationAppModel) this.L$0;
        boolean z = false;
        if (tITOValidationAppModel != null && (titoValidationStatus = tITOValidationAppModel.d) != null && TitoValidationStatusKt.a(titoValidationStatus)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
