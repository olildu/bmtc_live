package app.chalo.home.ui.base;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent", f = "HomeComponent.kt", l = {TypedValues.TransitionType.TYPE_INTERPOLATOR, TypedValues.TransitionType.TYPE_STAGGERED, TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, 710, 711, 715, 731}, m = "resolveAndPresentHomeUserProfilingHooks", v = 1)
final class HomeComponent$resolveAndPresentHomeUserProfilingHooks$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeComponent$resolveAndPresentHomeUserProfilingHooks$1(HomeComponent homeComponent, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = homeComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HomeComponent.T0(this.this$0, this);
    }
}
