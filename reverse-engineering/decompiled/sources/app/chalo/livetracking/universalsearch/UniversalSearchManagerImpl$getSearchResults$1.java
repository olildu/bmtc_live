package app.chalo.livetracking.universalsearch;

import app.chalo.livetracking.universalsearch.domain.TransitModeSearchFilter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.universalsearch.UniversalSearchManagerImpl$getSearchResults$1", f = "UniversalSearchManagerImpl.kt", l = {90, 90}, m = "invokeSuspend", v = 1)
final class UniversalSearchManagerImpl$getSearchResults$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $query;
    final /* synthetic */ TransitModeSearchFilter $transitModeSearchFilter;
    Object L$0;
    int label;
    final /* synthetic */ UniversalSearchManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalSearchManagerImpl$getSearchResults$1(UniversalSearchManagerImpl universalSearchManagerImpl, String str, TransitModeSearchFilter transitModeSearchFilter, Continuation continuation) {
        super(2, continuation);
        this.this$0 = universalSearchManagerImpl;
        this.$query = str;
        this.$transitModeSearchFilter = transitModeSearchFilter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UniversalSearchManagerImpl$getSearchResults$1(this.this$0, this.$query, this.$transitModeSearchFilter, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UniversalSearchManagerImpl$getSearchResults$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (app.chalo.livetracking.universalsearch.UniversalSearchManagerImpl.c(r1, (app.chalo.livetracking.universalsearch.data.model.app.SearchedResultItemsAppModel) r7, r6) == r0) goto L15;
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.ResultKt.b(r7)
            goto L44
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            java.lang.Object r1 = r6.L$0
            app.chalo.livetracking.universalsearch.UniversalSearchManagerImpl r1 = (app.chalo.livetracking.universalsearch.UniversalSearchManagerImpl) r1
            kotlin.ResultKt.b(r7)
            goto L36
        L20:
            kotlin.ResultKt.b(r7)
            app.chalo.livetracking.universalsearch.UniversalSearchManagerImpl r1 = r6.this$0
            app.chalo.livetracking.universalsearch.domain.FetchOfflineSearchResultUseCase r7 = r1.d
            java.lang.String r4 = r6.$query
            app.chalo.livetracking.universalsearch.domain.TransitModeSearchFilter r5 = r6.$transitModeSearchFilter
            r6.L$0 = r1
            r6.label = r3
            java.lang.Object r7 = r7.a(r4, r5, r6)
            if (r7 != r0) goto L36
            goto L43
        L36:
            app.chalo.livetracking.universalsearch.data.model.app.SearchedResultItemsAppModel r7 = (app.chalo.livetracking.universalsearch.data.model.app.SearchedResultItemsAppModel) r7
            r3 = 0
            r6.L$0 = r3
            r6.label = r2
            java.lang.Object r7 = app.chalo.livetracking.universalsearch.UniversalSearchManagerImpl.c(r1, r7, r6)
            if (r7 != r0) goto L44
        L43:
            return r0
        L44:
            kotlin.Unit r7 = kotlin.Unit.f17538a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.universalsearch.UniversalSearchManagerImpl$getSearchResults$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
