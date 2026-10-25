package app.chalo.premiumbus.ui.slotselection.compose;

import androidx.compose.foundation.pager.PagerState;
import app.chalo.premiumbus.ui.slotselection.ODPairWithSlotsCardAndSectionInfoUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionViewState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.compose.PremiumBusSlotSelectionScreenKt$PremiumBusSlotsPager$2$1$4$1", f = "PremiumBusSlotSelectionScreen.kt", l = {354}, m = "invokeSuspend", v = 1)
final class PremiumBusSlotSelectionScreenKt$PremiumBusSlotsPager$2$1$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Long, Unit> $onSectionItemClicked;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ List<ODPairWithSlotsCardAndSectionInfoUIState> $slotSectionList;
    final /* synthetic */ PremiumBusSlotSelectionViewState $viewState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSlotSelectionScreenKt$PremiumBusSlotsPager$2$1$4$1(List list, PagerState pagerState, PremiumBusSlotSelectionViewState premiumBusSlotSelectionViewState, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$slotSectionList = list;
        this.$pagerState = pagerState;
        this.$viewState = premiumBusSlotSelectionViewState;
        this.$onSectionItemClicked = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSlotSelectionScreenKt$PremiumBusSlotsPager$2$1$4$1(this.$slotSectionList, this.$pagerState, this.$viewState, this.$onSectionItemClicked, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSlotSelectionScreenKt$PremiumBusSlotsPager$2$1$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ODPairWithSlotsCardAndSectionInfoUIState oDPairWithSlotsCardAndSectionInfoUIState = (ODPairWithSlotsCardAndSectionInfoUIState) CollectionsKt.L(this.$pagerState.getCurrentPage(), this.$slotSectionList);
            if (oDPairWithSlotsCardAndSectionInfoUIState != null) {
                long j = oDPairWithSlotsCardAndSectionInfoUIState.f7816a;
                Long l = this.$viewState.b;
                if (l == null || j != l.longValue()) {
                    this.$onSectionItemClicked.invoke(new Long(j));
                    PagerState pagerState = this.$pagerState;
                    int currentPage = pagerState.getCurrentPage();
                    this.label = 1;
                    if (PagerState.scrollToPage$default(pagerState, currentPage, 0.0f, this, 2, null) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
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
