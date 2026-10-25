package app.chalo.livetracking.universalsearch.domain;

import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00042\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00042\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u0004H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/livetracking/universalsearch/data/model/app/UniversalSearchRecentSearchItem;", "flow1", "Lkotlin/Pair;", "Lapp/chalo/livetracking/universalsearch/domain/UniversalSearchResultSource;", "flow2", "flow3", "flow4"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.universalsearch.domain.FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$6", f = "FetchRecentSearchItemsFromDatabaseUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
final class FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$6 extends SuspendLambda implements Function5<Pair<? extends UniversalSearchResultSource, ? extends List<? extends UniversalSearchRecentSearchItem>>, Pair<? extends UniversalSearchResultSource, ? extends List<? extends UniversalSearchRecentSearchItem>>, Pair<? extends UniversalSearchResultSource, ? extends List<? extends UniversalSearchRecentSearchItem>>, Pair<? extends UniversalSearchResultSource, ? extends List<? extends UniversalSearchRecentSearchItem>>, Continuation<? super List<? extends UniversalSearchRecentSearchItem>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$6 fetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$6 = new FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$6(5, (Continuation) obj5);
        fetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$6.L$0 = (Pair) obj;
        fetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$6.L$1 = (Pair) obj2;
        fetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$6.L$2 = (Pair) obj3;
        fetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$6.L$3 = (Pair) obj4;
        return fetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$6.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        Pair pair = (Pair) this.L$0;
        Pair pair2 = (Pair) this.L$1;
        Pair pair3 = (Pair) this.L$2;
        Pair pair4 = (Pair) this.L$3;
        return CollectionsKt.v0(new FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$6$invokeSuspend$$inlined$sortedByDescending$1(), CollectionsKt.I(ArraysKt.G(new List[]{pair != null ? (List) pair.e() : null, pair2 != null ? (List) pair2.e() : null, pair3 != null ? (List) pair3.e() : null, pair4 != null ? (List) pair4.e() : null})));
    }
}
