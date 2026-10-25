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
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "Lapp/chalo/livetracking/universalsearch/domain/UniversalSearchResultSource;", "", "Lapp/chalo/livetracking/universalsearch/data/model/app/UniversalSearchRecentSearchItem;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.universalsearch.domain.FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$5", f = "FetchRecentSearchItemsFromDatabaseUseCase.kt", l = {67, EACTags.APPLICATION_IMAGE, EACTags.DEPRECATED}, m = "invokeSuspend", v = 1)
final class FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$5 extends SuspendLambda implements Function2<FlowCollector<? super Pair<? extends UniversalSearchResultSource, ? extends List<? extends UniversalSearchRecentSearchItem>>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currentCityName;
    final /* synthetic */ TransitModeSearchFilter $transitModeSearchFilter;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FetchRecentSearchItemsFromDatabaseUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$5(FetchRecentSearchItemsFromDatabaseUseCase fetchRecentSearchItemsFromDatabaseUseCase, String str, TransitModeSearchFilter transitModeSearchFilter, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fetchRecentSearchItemsFromDatabaseUseCase;
        this.$currentCityName = str;
        this.$transitModeSearchFilter = transitModeSearchFilter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$5 fetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$5 = new FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$5(this.this$0, this.$currentCityName, this.$transitModeSearchFilter, continuation);
        fetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$5.L$0 = obj;
        return fetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$5) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (r3.collect(r9, r8) == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            kotlin.ResultKt.b(r9)
            goto L73
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.b(r9)
            goto L5c
        L24:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.b(r9)
            goto L3f
        L2c:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
            r8.L$0 = r9
            r8.label = r4
            java.lang.Object r1 = r9.emit(r5, r8)
            if (r1 != r0) goto L3e
            goto L72
        L3e:
            r1 = r9
        L3f:
            app.chalo.livetracking.universalsearch.domain.FetchRecentSearchItemsFromDatabaseUseCase r9 = r8.this$0
            app.chalo.livetracking.universalsearch.domain.RecentItemsFlowProvider r9 = r9.f5018a
            java.lang.String r4 = r8.$currentCityName
            app.chalo.livetracking.universalsearch.domain.TransitModeSearchFilter r6 = r8.$transitModeSearchFilter
            r8.L$0 = r1
            r8.label = r3
            app.chalo.livetracking.universalsearch.domain.RecentItemsFlowProvider$getRecentTripsFlow$2 r3 = new app.chalo.livetracking.universalsearch.domain.RecentItemsFlowProvider$getRecentTripsFlow$2
            r3.<init>(r9, r4, r5)
            app.chalo.livetracking.universalsearch.domain.RecentItemsFlowProvider$getRecentTripsFlow$3 r7 = new app.chalo.livetracking.universalsearch.domain.RecentItemsFlowProvider$getRecentTripsFlow$3
            r7.<init>(r9, r4, r5)
            java.lang.Object r9 = app.chalo.livetracking.universalsearch.domain.RecentItemsFlowProvider.a(r6, r3, r7, r8)
            if (r9 != r0) goto L5c
            goto L72
        L5c:
            kotlinx.coroutines.flow.Flow r9 = (kotlinx.coroutines.flow.Flow) r9
            app.chalo.livetracking.universalsearch.domain.FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$5$invokeSuspend$$inlined$map$1 r3 = new app.chalo.livetracking.universalsearch.domain.FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$5$invokeSuspend$$inlined$map$1
            r3.<init>()
            app.chalo.livetracking.universalsearch.domain.FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$5$2 r9 = new app.chalo.livetracking.universalsearch.domain.FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$5$2
            r9.<init>()
            r8.L$0 = r5
            r8.label = r2
            java.lang.Object r9 = r3.collect(r9, r8)
            if (r9 != r0) goto L73
        L72:
            return r0
        L73:
            kotlin.Unit r9 = kotlin.Unit.f17538a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.universalsearch.domain.FetchRecentSearchItemsFromDatabaseUseCase$addAllRecentSearchedItemsToList$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
