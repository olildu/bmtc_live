package app.chalo.recent.localsource.recent;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.recent.localsource.recent.RecentPlaceLocalDataSourceImpl", f = "RecentPlaceLocalDataSourceImpl.kt", l = {25, 33, ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, 52}, m = "insertOrUpdateIfRequiredPlacesRecent", v = 1)
final class RecentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecentPlaceLocalDataSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentPlaceLocalDataSourceImpl$insertOrUpdateIfRequiredPlacesRecent$1(RecentPlaceLocalDataSourceImpl recentPlaceLocalDataSourceImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = recentPlaceLocalDataSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.j(null, false, this);
    }
}
