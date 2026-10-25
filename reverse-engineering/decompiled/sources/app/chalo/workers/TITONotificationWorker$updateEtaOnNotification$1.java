package app.chalo.workers;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.workers.TITONotificationWorker", f = "TITONotificationWorker.kt", l = {205, 213, 225}, m = "updateEtaOnNotification", v = 1)
final class TITONotificationWorker$updateEtaOnNotification$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TITONotificationWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TITONotificationWorker$updateEtaOnNotification$1(TITONotificationWorker tITONotificationWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = tITONotificationWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TITONotificationWorker.e(this.this$0, false, null, null, null, 0L, null, null, this);
    }
}
