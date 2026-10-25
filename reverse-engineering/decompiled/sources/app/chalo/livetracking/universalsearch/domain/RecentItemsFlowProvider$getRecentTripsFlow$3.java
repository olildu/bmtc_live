package app.chalo.livetracking.universalsearch.domain;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.repository.recent.TripRecentRepository;
import app.chalo.recent.model.app.RecentTripAppModel;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "", "Lapp/chalo/recent/model/app/RecentTripAppModel;", "transitModes", "", "Lapp/chalo/providers/cityprovider/impl/data/models/app/ChaloTransitMode;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.universalsearch.domain.RecentItemsFlowProvider$getRecentTripsFlow$3", f = "RecentItemsFlowProvider.kt", l = {76}, m = "invokeSuspend", v = 1)
final class RecentItemsFlowProvider$getRecentTripsFlow$3 extends SuspendLambda implements Function2<Set<? extends ChaloTransitMode>, Continuation<? super Flow<? extends List<? extends RecentTripAppModel>>>, Object> {
    final /* synthetic */ String $cityId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RecentItemsFlowProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentItemsFlowProvider$getRecentTripsFlow$3(RecentItemsFlowProvider recentItemsFlowProvider, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = recentItemsFlowProvider;
        this.$cityId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RecentItemsFlowProvider$getRecentTripsFlow$3 recentItemsFlowProvider$getRecentTripsFlow$3 = new RecentItemsFlowProvider$getRecentTripsFlow$3(this.this$0, this.$cityId, continuation);
        recentItemsFlowProvider$getRecentTripsFlow$3.L$0 = obj;
        return recentItemsFlowProvider$getRecentTripsFlow$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RecentItemsFlowProvider$getRecentTripsFlow$3) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
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
        Set set = (Set) this.L$0;
        TripRecentRepository e = this.this$0.f5036a.getE();
        String str = this.$cityId;
        this.label = 1;
        Object objD = e.d(str, set, this);
        return objD == coroutineSingletons ? coroutineSingletons : objD;
    }
}
