package app.chalo.premiumbus.ui.slotselection;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent$checkAndRaiseCustomerSupportBtnClickedEventForSingleSupportedValuePass$1", f = "PremiumBusSlotSelectionComponent.kt", l = {527}, m = "invokeSuspend", v = 1)
final class PremiumBusSlotSelectionComponent$checkAndRaiseCustomerSupportBtnClickedEventForSingleSupportedValuePass$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PremiumBusSlotSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSlotSelectionComponent$checkAndRaiseCustomerSupportBtnClickedEventForSingleSupportedValuePass$1(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSlotSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSlotSelectionComponent$checkAndRaiseCustomerSupportBtnClickedEventForSingleSupportedValuePass$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSlotSelectionComponent$checkAndRaiseCustomerSupportBtnClickedEventForSingleSupportedValuePass$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PBSlotSelectionScreenBottomSheetType pBSlotSelectionScreenBottomSheetType = ((PremiumBusSlotSelectionDataState) this.this$0.f.getValue()).f;
            if (pBSlotSelectionScreenBottomSheetType instanceof PBSlotSelectionScreenBottomSheetType.AvailablePurchaseOptions) {
                PBSlotSelectionScreenBottomSheetType.AvailablePurchaseOptions availablePurchaseOptions = (PBSlotSelectionScreenBottomSheetType.AvailablePurchaseOptions) pBSlotSelectionScreenBottomSheetType;
                ArrayList arrayList = availablePurchaseOptions.f7823a;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    if (obj2 instanceof PremiumBusPurchaseOptionUiModel.SuperPassOption) {
                        arrayList2.add(obj2);
                    }
                }
                PremiumBusPurchaseOptionUiModel.SuperPassOption superPassOption = (PremiumBusPurchaseOptionUiModel.SuperPassOption) CollectionsKt.H(arrayList2);
                String str = superPassOption != null ? superPassOption.d : null;
                if (availablePurchaseOptions.b && str != null && str.length() != 0) {
                    PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent = this.this$0;
                    this.label = 1;
                    if (PremiumBusSlotSelectionComponent.P0(premiumBusSlotSelectionComponent, str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else if (!(pBSlotSelectionScreenBottomSheetType instanceof PBSlotSelectionScreenBottomSheetType.ViewAllSlots) && !(pBSlotSelectionScreenBottomSheetType instanceof PBSlotSelectionScreenBottomSheetType.MultipleSlotSelectionCalendar) && !(pBSlotSelectionScreenBottomSheetType instanceof PBSlotSelectionScreenBottomSheetType.NearBySlotsAvailableSelectionBottomSheet) && pBSlotSelectionScreenBottomSheetType != null) {
                throw new NoWhenBranchMatchedException();
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
