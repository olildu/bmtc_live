package app.chalo.livetracking.frameworklivetracking;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.frameworklivetracking.RealTimeSocketManagerImpl", f = "RealTimeSocketManagerImpl.kt", l = {TypedValues.PositionType.TYPE_PERCENT_WIDTH, 386, 387, 395}, m = "updateRtsManagerOnCityUpdate", v = 1)
final class RealTimeSocketManagerImpl$updateRtsManagerOnCityUpdate$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RealTimeSocketManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTimeSocketManagerImpl$updateRtsManagerOnCityUpdate$1(RealTimeSocketManagerImpl realTimeSocketManagerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realTimeSocketManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RealTimeSocketManagerImpl.d(this.this$0, this);
    }
}
