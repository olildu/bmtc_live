package app.chalo.productpurchase.passselection.ui;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.SnapshotStateKt;
import defpackage.ge0;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passselection.ui.PassSelectionScreenKt$PassCategorySelection$1$1$1", f = "PassSelectionScreen.kt", l = {154}, m = "invokeSuspend", v = 1)
final class PassSelectionScreenKt$PassCategorySelection$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ PassSelectionScreenTypeUIState.CategorySelection $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassSelectionScreenKt$PassCategorySelection$1$1$1(PagerState pagerState, PassSelectionScreenTypeUIState.CategorySelection categorySelection, Continuation continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
        this.$state = categorySelection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassSelectionScreenKt$PassCategorySelection$1$1$1(this.$pagerState, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PassSelectionScreenKt$PassCategorySelection$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new ge0(this.$pagerState, 6));
            final PassSelectionScreenTypeUIState.CategorySelection categorySelection = this.$state;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.productpurchase.passselection.ui.PassSelectionScreenKt$PassCategorySelection$1$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    String str;
                    int iIntValue = ((Number) obj2).intValue();
                    PassSelectionComponent$categorySelection$4 passSelectionComponent$categorySelection$4 = categorySelection.d;
                    PassSelectionComponent passSelectionComponent = passSelectionComponent$categorySelection$4.f8532a;
                    PassSelectionCategorySelectionData passSelectionCategorySelectionData = (PassSelectionCategorySelectionData) CollectionsKt.L(iIntValue, (List) passSelectionComponent$categorySelection$4.b.f.getValue());
                    if (passSelectionCategorySelectionData == null || (str = passSelectionCategorySelectionData.f8531a.f8639a) == null) {
                        str = "";
                    }
                    passSelectionComponent.N0(new PassSelectionIntent.CategoryPageSelectedIntent(str, iIntValue));
                    return Unit.f17538a;
                }
            };
            this.label = 1;
            if (flowSnapshotFlow.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f17538a;
    }
}
