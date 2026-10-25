package app.chalo.livetracking.universalsearch.ui;

import app.chalo.livetracking.universalsearch.UniversalSearchResult;
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
@DebugMetadata(c = "app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent$handleUniversalSearchData$1", f = "UniversalPickerComponent.kt", l = {445, 450, 470}, m = "invokeSuspend", v = 1)
final class UniversalPickerComponent$handleUniversalSearchData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UniversalSearchResult $searchData;
    final /* synthetic */ boolean $shouldShowFavorite;
    Object L$0;
    int label;
    final /* synthetic */ UniversalPickerComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalPickerComponent$handleUniversalSearchData$1(UniversalPickerComponent universalPickerComponent, UniversalSearchResult universalSearchResult, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = universalPickerComponent;
        this.$searchData = universalSearchResult;
        this.$shouldShowFavorite = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UniversalPickerComponent$handleUniversalSearchData$1(this.this$0, this.$searchData, this.$shouldShowFavorite, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UniversalPickerComponent$handleUniversalSearchData$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
    
        if (app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent.F0(r1, r12, r2, r11) == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.label
            r2 = 2
            r3 = 1
            r4 = 3
            if (r1 == 0) goto L29
            if (r1 == r3) goto L25
            if (r1 == r2) goto L1c
            if (r1 != r4) goto L14
            kotlin.ResultKt.b(r12)
            goto L92
        L14:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1c:
            java.lang.Object r1 = r11.L$0
            app.chalo.livetracking.universalsearch.UniversalSearchResult r1 = (app.chalo.livetracking.universalsearch.UniversalSearchResult) r1
            kotlin.ResultKt.b(r12)
        L23:
            r6 = r1
            goto L6e
        L25:
            kotlin.ResultKt.b(r12)
            goto L45
        L29:
            kotlin.ResultKt.b(r12)
            app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent r12 = r11.this$0
            app.chalo.livetracking.universalsearch.domain.UniversalSearchResultFilteringHelper r1 = r12.r
            app.chalo.livetracking.universalsearch.UniversalSearchResult r5 = r11.$searchData
            kotlinx.coroutines.flow.StateFlow r12 = r12.f
            java.lang.Object r12 = r12.getValue()
            app.chalo.livetracking.universalsearch.ui.UniversalPickerViewState r12 = (app.chalo.livetracking.universalsearch.ui.UniversalPickerViewState) r12
            app.chalo.universalsearch.data.UniversalSearchOptions r12 = r12.m
            r11.label = r3
            java.lang.Object r12 = r1.c(r5, r12, r11)
            if (r12 != r0) goto L45
            goto L91
        L45:
            r1 = r12
            app.chalo.livetracking.universalsearch.UniversalSearchResult r1 = (app.chalo.livetracking.universalsearch.UniversalSearchResult) r1
            app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent r12 = r11.this$0
            app.chalo.livetracking.universalsearch.domain.ConvertSearchedResultItemsAppModelToUiModelUseCase r12 = r12.p
            app.chalo.livetracking.universalsearch.UniversalSearchResult r3 = r11.$searchData
            app.chalo.livetracking.universalsearch.data.model.app.SearchedResultItemsAppModel r3 = r3.c
            if (r3 != 0) goto L57
            app.chalo.livetracking.universalsearch.data.model.app.SearchedResultItemsAppModel r3 = new app.chalo.livetracking.universalsearch.data.model.app.SearchedResultItemsAppModel
            r3.<init>()
        L57:
            app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent r5 = r11.this$0
            kotlinx.coroutines.flow.StateFlow r5 = r5.f
            java.lang.Object r5 = r5.getValue()
            app.chalo.livetracking.universalsearch.ui.UniversalPickerViewState r5 = (app.chalo.livetracking.universalsearch.ui.UniversalPickerViewState) r5
            app.chalo.universalsearch.data.UniversalSearchOptions r5 = r5.m
            r11.L$0 = r1
            r11.label = r2
            java.lang.Object r12 = r12.c(r3, r5, r11)
            if (r12 != r0) goto L23
            goto L91
        L6e:
            r7 = r12
            java.util.List r7 = (java.util.List) r7
            app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent r9 = r11.this$0
            boolean r8 = r11.$shouldShowFavorite
            b5 r5 = new b5
            r10 = 3
            r5.<init>(r6, r7, r8, r9, r10)
            r9.E0(r5)
            app.chalo.utils.ChaloUseCaseResult r12 = r6.f4964a
            if (r12 == 0) goto L92
            app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent r1 = r11.this$0
            app.chalo.livetracking.universalsearch.data.model.app.SearchedResultItemsAppModel r2 = r6.c
            r3 = 0
            r11.L$0 = r3
            r11.label = r4
            java.lang.Object r12 = app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent.F0(r1, r12, r2, r11)
            if (r12 != r0) goto L92
        L91:
            return r0
        L92:
            kotlin.Unit r12 = kotlin.Unit.f17538a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent$handleUniversalSearchData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
