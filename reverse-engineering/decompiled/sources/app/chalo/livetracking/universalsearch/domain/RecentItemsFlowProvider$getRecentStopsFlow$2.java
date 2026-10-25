package app.chalo.livetracking.universalsearch.domain;

import androidx.constraintlayout.widget.ConstraintLayout;
import app.chalo.recent.database.repository.recent.StopRecentRepository;
import app.chalo.recent.model.app.RecentStopAppModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "", "Lapp/chalo/recent/model/app/RecentStopAppModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.universalsearch.domain.RecentItemsFlowProvider$getRecentStopsFlow$2", f = "RecentItemsFlowProvider.kt", l = {ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX}, m = "invokeSuspend", v = 1)
final class RecentItemsFlowProvider$getRecentStopsFlow$2 extends SuspendLambda implements Function1<Continuation<? super Flow<? extends List<? extends RecentStopAppModel>>>, Object> {
    final /* synthetic */ String $cityId;
    int label;
    final /* synthetic */ RecentItemsFlowProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentItemsFlowProvider$getRecentStopsFlow$2(RecentItemsFlowProvider recentItemsFlowProvider, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = recentItemsFlowProvider;
        this.$cityId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RecentItemsFlowProvider$getRecentStopsFlow$2(this.this$0, this.$cityId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RecentItemsFlowProvider$getRecentStopsFlow$2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        StopRecentRepository b = this.this$0.f5036a.getB();
        String str = this.$cityId;
        this.label = 1;
        Object objJ = b.j(str, this);
        return objJ == coroutineSingletons ? coroutineSingletons : objJ;
    }
}
