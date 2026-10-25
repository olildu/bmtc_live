package defpackage;

import app.chalo.premiumbus.ui.seatselection.GenderConfirmationBottomSheetType;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionDataState;
import app.chalo.premiumbus.ui.seatselection.SeatSelectionBottomSheetType;
import app.chalo.premiumbus.ui.seatselection.SeatSelectionDialogType;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDataState;
import app.chalo.premiumbus.ui.slotselection.SlotSelectionErrorScreenType;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vu0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19869a;

    public /* synthetic */ vu0(int i) {
        this.f19869a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19869a) {
            case 0:
                return PremiumBusSeatSelectionDataState.a((PremiumBusSeatSelectionDataState) obj, true, null, null, null, null, false, null, null, false, null, null, null, null, 65533);
            case 1:
                return PremiumBusSeatSelectionDataState.a((PremiumBusSeatSelectionDataState) obj, false, null, null, null, null, false, null, null, false, null, null, null, null, 65533);
            case 2:
                return PremiumBusSeatSelectionDataState.a((PremiumBusSeatSelectionDataState) obj, false, null, null, null, null, false, null, SeatSelectionDialogType.SeatChangeConfirmationDialog.f7757a, false, null, null, null, null, 65023);
            case 3:
                return PremiumBusSeatSelectionDataState.a((PremiumBusSeatSelectionDataState) obj, false, null, null, null, null, false, null, null, false, null, null, null, null, 65533);
            case 4:
                return PremiumBusSeatSelectionDataState.a((PremiumBusSeatSelectionDataState) obj, false, null, null, null, null, false, null, null, false, null, null, null, null, 65533);
            case 5:
                return PremiumBusSeatSelectionDataState.a((PremiumBusSeatSelectionDataState) obj, false, null, null, null, null, false, null, null, false, null, null, null, null, 65533);
            case 6:
                return PremiumBusSeatSelectionDataState.a((PremiumBusSeatSelectionDataState) obj, false, null, null, null, null, true, null, null, false, null, null, null, null, 65407);
            case 7:
                return PremiumBusSeatSelectionDataState.a((PremiumBusSeatSelectionDataState) obj, false, null, null, null, null, false, null, null, false, null, null, null, null, 65533);
            case 8:
                return PremiumBusSeatSelectionDataState.a((PremiumBusSeatSelectionDataState) obj, false, null, null, null, null, false, null, null, false, null, new SeatSelectionBottomSheetType.GenderPreferenceBottomSheet(GenderConfirmationBottomSheetType.GenderPreferenceSelectionLoading.f7715a), null, null, 61439);
            case 9:
                return PremiumBusSeatSelectionDataState.a((PremiumBusSeatSelectionDataState) obj, false, null, null, null, null, false, null, null, false, null, new SeatSelectionBottomSheetType.GenderPreferenceBottomSheet(GenderConfirmationBottomSheetType.GenderPreferenceSelectionError.f7714a), null, null, 61439);
            case 10:
                PremiumBusSlotSelectionDataState it = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it, "it");
                return PremiumBusSlotSelectionDataState.a(it, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -3);
            case 11:
                PremiumBusSlotSelectionDataState it2 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it2, "it");
                return PremiumBusSlotSelectionDataState.a(it2, false, false, false, SlotSelectionErrorScreenType.GENERIC_ERROR_SCREEN, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -16);
            case 12:
                PremiumBusSlotSelectionDataState it3 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it3, "it");
                return PremiumBusSlotSelectionDataState.a(it3, false, false, false, SlotSelectionErrorScreenType.NO_ROUTE_AVAILABLE, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -16);
            case 13:
                PremiumBusSlotSelectionDataState it4 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it4, "it");
                return PremiumBusSlotSelectionDataState.a(it4, false, false, false, SlotSelectionErrorScreenType.GENERIC_ERROR_SCREEN, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -16);
            case 14:
                PremiumBusSlotSelectionDataState it5 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it5, "it");
                return PremiumBusSlotSelectionDataState.a(it5, false, true, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -3);
            case 15:
                PremiumBusSlotSelectionDataState it6 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it6, "it");
                return PremiumBusSlotSelectionDataState.a(it6, true, false, true, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -14);
            case 16:
                PremiumBusSlotSelectionDataState it7 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it7, "it");
                return PremiumBusSlotSelectionDataState.a(it7, true, false, true, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -14);
            case 17:
                PremiumBusSlotSelectionDataState it8 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it8, "it");
                return PremiumBusSlotSelectionDataState.a(it8, false, false, false, SlotSelectionErrorScreenType.GENERIC_ERROR_SCREEN, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -16);
            case 18:
                PremiumBusSlotSelectionDataState it9 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it9, "it");
                return PremiumBusSlotSelectionDataState.a(it9, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -3);
            case 19:
                PremiumBusSlotSelectionDataState it10 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it10, "it");
                return PremiumBusSlotSelectionDataState.a(it10, false, false, false, SlotSelectionErrorScreenType.GENERIC_ERROR_SCREEN, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -15);
            case 20:
                PremiumBusSlotSelectionDataState it11 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it11, "it");
                return PremiumBusSlotSelectionDataState.a(it11, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -33554465);
            case 21:
                PremiumBusSlotSelectionDataState it12 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it12, "it");
                return PremiumBusSlotSelectionDataState.a(it12, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -33554465);
            case 22:
                PremiumBusSlotSelectionDataState it13 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it13, "it");
                return PremiumBusSlotSelectionDataState.a(it13, true, false, true, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -14);
            case 23:
                PremiumBusSlotSelectionDataState it14 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it14, "it");
                return PremiumBusSlotSelectionDataState.a(it14, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -65537);
            case 24:
                PremiumBusSlotSelectionDataState it15 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it15, "it");
                return PremiumBusSlotSelectionDataState.a(it15, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -98305);
            case 25:
                PremiumBusSlotSelectionDataState it16 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it16, "it");
                return PremiumBusSlotSelectionDataState.a(it16, false, false, false, SlotSelectionErrorScreenType.GENERIC_ERROR_SCREEN, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -15);
            case 26:
                PremiumBusSlotSelectionDataState it17 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it17, "it");
                return PremiumBusSlotSelectionDataState.a(it17, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -33);
            case 27:
                PremiumBusSlotSelectionDataState it18 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it18, "it");
                return PremiumBusSlotSelectionDataState.a(it18, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -35);
            case 28:
                PremiumBusSlotSelectionDataState it19 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it19, "it");
                return PremiumBusSlotSelectionDataState.a(it19, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -33);
            default:
                PremiumBusSlotSelectionDataState it20 = (PremiumBusSlotSelectionDataState) obj;
                Intrinsics.i(it20, "it");
                return PremiumBusSlotSelectionDataState.a(it20, false, false, false, null, null, null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, EmptyList.f17557a, Integer.MAX_VALUE);
        }
    }
}
