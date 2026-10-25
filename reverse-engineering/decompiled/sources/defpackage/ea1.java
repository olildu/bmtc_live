package defpackage;

import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.ui.slotselection.BookingSelectionType;
import app.chalo.premiumbus.ui.slotselection.PBSlotSelectionScreenBottomSheetType;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ea1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15534a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ PBSlotSelectionScreenBottomSheetType c;

    public /* synthetic */ ea1(PBSlotSelectionScreenBottomSheetType pBSlotSelectionScreenBottomSheetType, Function1 function1, int i) {
        this.f15534a = i;
        this.c = pBSlotSelectionScreenBottomSheetType;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15534a) {
            case 0:
                this.b.invoke(new PremiumBusSlotSelectionIntent.NearBySlotsBottomSheetConfirmRidesClickIntent(((PBSlotSelectionScreenBottomSheetType.NearBySlotsAvailableSelectionBottomSheet) this.c).f7825a));
                break;
            case 1:
                this.b.invoke(new PremiumBusSlotSelectionIntent.NearBySlotsBottomSheetGoBackClickIntent(((PBSlotSelectionScreenBottomSheetType.NearBySlotsAvailableSelectionBottomSheet) this.c).f7825a));
                break;
            case 2:
                PBSlotSelectionScreenBottomSheetType.ViewAllSlots viewAllSlots = (PBSlotSelectionScreenBottomSheetType.ViewAllSlots) this.c;
                PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel = viewAllSlots.b;
                if (pBAvailableSlotsTripAppModel != null) {
                    this.b.invoke(new PremiumBusSlotSelectionIntent.ConfirmSlotClickedIntent(pBAvailableSlotsTripAppModel, BookingSelectionType.SINGLE_RIDE, viewAllSlots.d));
                }
                return Unit.f17538a;
            default:
                PBSlotSelectionScreenBottomSheetType.ViewAllSlots viewAllSlots2 = (PBSlotSelectionScreenBottomSheetType.ViewAllSlots) this.c;
                PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel2 = viewAllSlots2.b;
                if (pBAvailableSlotsTripAppModel2 != null) {
                    this.b.invoke(new PremiumBusSlotSelectionIntent.ConfirmSlotClickedIntent(pBAvailableSlotsTripAppModel2, BookingSelectionType.MULTIPLE_RIDE, viewAllSlots2.d));
                }
                return Unit.f17538a;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ ea1(Function1 function1, PBSlotSelectionScreenBottomSheetType pBSlotSelectionScreenBottomSheetType, int i) {
        this.f15534a = i;
        this.b = function1;
        this.c = pBSlotSelectionScreenBottomSheetType;
    }
}
