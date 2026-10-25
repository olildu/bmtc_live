package app.chalo.recent.domain;

import app.chalo.recent.model.app.RecentsType;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/recent/model/app/RecentsType;", "flow1", "flow2", "flow3", "flow4"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.recent.domain.FetchRecentDataFromDbBasedOnSpecialStatusUseCase$fetchRecentDataFromDb$2", f = "FetchRecentDataFromDbBasedOnSpecialStatusUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
final class FetchRecentDataFromDbBasedOnSpecialStatusUseCase$fetchRecentDataFromDb$2 extends SuspendLambda implements Function5<List<? extends RecentsType>, List<? extends RecentsType>, List<? extends RecentsType>, List<? extends RecentsType>, Continuation<? super List<? extends RecentsType>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        FetchRecentDataFromDbBasedOnSpecialStatusUseCase$fetchRecentDataFromDb$2 fetchRecentDataFromDbBasedOnSpecialStatusUseCase$fetchRecentDataFromDb$2 = new FetchRecentDataFromDbBasedOnSpecialStatusUseCase$fetchRecentDataFromDb$2(5, (Continuation) obj5);
        fetchRecentDataFromDbBasedOnSpecialStatusUseCase$fetchRecentDataFromDb$2.L$0 = (List) obj;
        fetchRecentDataFromDbBasedOnSpecialStatusUseCase$fetchRecentDataFromDb$2.L$1 = (List) obj2;
        fetchRecentDataFromDbBasedOnSpecialStatusUseCase$fetchRecentDataFromDb$2.L$2 = (List) obj3;
        fetchRecentDataFromDbBasedOnSpecialStatusUseCase$fetchRecentDataFromDb$2.L$3 = (List) obj4;
        return fetchRecentDataFromDbBasedOnSpecialStatusUseCase$fetchRecentDataFromDb$2.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        List list = (List) this.L$0;
        List list2 = (List) this.L$1;
        List list3 = (List) this.L$2;
        List list4 = list2;
        List list5 = list3;
        return CollectionsKt.c0((List) this.L$3, CollectionsKt.c0(list5, CollectionsKt.c0(list4, list)));
    }
}
