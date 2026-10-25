package app.chalo.recent.database.repository.recent;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.recent.database.repository.recent.TripRecentRepositoryImpl$purgeOldEntries$2$1", f = "TripRecentRepositoryImpl.kt", l = {EACTags.DEPRECATED}, m = "emit", v = 1)
final class TripRecentRepositoryImpl$purgeOldEntries$2$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TripRecentRepositoryImpl$purgeOldEntries$2$1<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripRecentRepositoryImpl$purgeOldEntries$2$1$emit$1(TripRecentRepositoryImpl$purgeOldEntries$2$1 tripRecentRepositoryImpl$purgeOldEntries$2$1, Continuation continuation) {
        super(continuation);
        this.this$0 = tripRecentRepositoryImpl$purgeOldEntries$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
