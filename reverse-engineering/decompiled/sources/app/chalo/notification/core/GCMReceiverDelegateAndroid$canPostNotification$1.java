package app.chalo.notification.core;

import androidx.compose.ui.spatial.RectListKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.notification.core.GCMReceiverDelegateAndroid", f = "GCMReceiver.android.kt", l = {RectListKt.BitOffsetForGesturable, 63}, m = "canPostNotification", v = 1)
final class GCMReceiverDelegateAndroid$canPostNotification$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GCMReceiverDelegateAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMReceiverDelegateAndroid$canPostNotification$1(GCMReceiverDelegateAndroid gCMReceiverDelegateAndroid, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gCMReceiverDelegateAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}
