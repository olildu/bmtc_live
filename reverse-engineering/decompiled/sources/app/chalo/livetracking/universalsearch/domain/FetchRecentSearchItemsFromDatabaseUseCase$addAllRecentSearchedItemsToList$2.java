package app.chalo.livetracking.universalsearch.domain;

import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "Lapp/chalo/livetracking/universalsearch/domain/UniversalSearchResultSource;", "", "Lapp/chalo/livetracking/universalsearch/data/model/app/UniversalSearchRecentSearchItem;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.universalsearch.domain.FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$2", f = "FetchRecentSearchItemsFromDatabaseUseCase.kt", l = {28, 29, 36}, m = "invokeSuspend", v = 1)
final class FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$2 extends SuspendLambda implements Function2<FlowCollector<? super Pair<? extends UniversalSearchResultSource, ? extends List<? extends UniversalSearchRecentSearchItem>>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currentCityName;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FetchRecentSearchItemsFromDatabaseUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$2(FetchRecentSearchItemsFromDatabaseUseCase fetchRecentSearchItemsFromDatabaseUseCase, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fetchRecentSearchItemsFromDatabaseUseCase;
        this.$currentCityName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$2 fetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$2 = new FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$2(this.this$0, this.$currentCityName, continuation);
        fetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$2.L$0 = obj;
        return fetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$2) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r3.collect(r7, r6) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r1 == 0) goto L2c
            if (r1 == r5) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r4) goto L14
            kotlin.ResultKt.b(r7)
            goto L6d
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            java.lang.Object r1 = r6.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.b(r7)
            goto L56
        L24:
            java.lang.Object r1 = r6.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.b(r7)
            goto L3f
        L2c:
            kotlin.ResultKt.b(r7)
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            r6.L$0 = r7
            r6.label = r5
            java.lang.Object r1 = r7.emit(r2, r6)
            if (r1 != r0) goto L3e
            goto L6c
        L3e:
            r1 = r7
        L3f:
            app.chalo.livetracking.universalsearch.domain.FetchRecentSearchItemsFromDatabaseUseCase r7 = r6.this$0
            app.chalo.livetracking.universalsearch.domain.RecentItemsFlowProvider r7 = r7.f5018a
            java.lang.String r5 = r6.$currentCityName
            r6.L$0 = r1
            r6.label = r3
            app.chalo.recent.database.repository.recent.RecentRepositoryProvider r7 = r7.f5036a
            app.chalo.recent.database.repository.recent.PlacesRecentRepository r7 = r7.getD()
            java.lang.Object r7 = r7.f(r5, r6)
            if (r7 != r0) goto L56
            goto L6c
        L56:
            kotlinx.coroutines.flow.Flow r7 = (kotlinx.coroutines.flow.Flow) r7
            app.chalo.livetracking.universalsearch.domain.FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$2$invokeSuspend$$inlined$map$1 r3 = new app.chalo.livetracking.universalsearch.domain.FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$2$invokeSuspend$$inlined$map$1
            r3.<init>()
            app.chalo.livetracking.universalsearch.domain.FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$2$2 r7 = new app.chalo.livetracking.universalsearch.domain.FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$2$2
            r7.<init>()
            r6.L$0 = r2
            r6.label = r4
            java.lang.Object r7 = r3.collect(r7, r6)
            if (r7 != r0) goto L6d
        L6c:
            return r0
        L6d:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.universalsearch.domain.FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
