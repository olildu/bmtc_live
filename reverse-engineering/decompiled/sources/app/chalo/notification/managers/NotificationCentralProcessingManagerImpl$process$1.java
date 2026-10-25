package app.chalo.notification.managers;

import in.juspay.hyper.constants.Labels;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.notification.managers.NotificationCentralProcessingManagerImpl", f = "NotificationCentralProcessingManagerImpl.kt", l = {64, 65, EACTags.DISPLAY_IMAGE, 70, EACTags.HISTORICAL_BYTES, 88, 106, 119, 131, 152, 153, 156}, m = Labels.HyperSdk.PROCESS, v = 1)
final class NotificationCentralProcessingManagerImpl$process$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationCentralProcessingManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationCentralProcessingManagerImpl$process$1(NotificationCentralProcessingManagerImpl notificationCentralProcessingManagerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = notificationCentralProcessingManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
