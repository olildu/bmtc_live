package defpackage;

import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.premiumbus.data.GenderPreferenceSelectionStates;
import app.chalo.premiumbus.data.exceptions.PBChangeStopFailedException;
import app.chalo.premiumbus.data.exceptions.PBStopPointsFetchFailedException;
import app.chalo.premiumbus.data.exceptions.PBTripDetailsFetchFailedException;
import app.chalo.premiumbus.data.exceptions.PremiumBusAvailableOptionsFetchFailedException;
import app.chalo.premiumbus.data.exceptions.PremiumBusSeatSelectionLayoutFetchFailureException;
import app.chalo.premiumbus.data.models.app.SeatInfoAppModel;
import app.chalo.premiumbus.ui.seatselection.GenderConfirmationBottomSheetType;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionDataState;
import app.chalo.premiumbus.ui.seatselection.SeatSelectionBottomSheetType;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pu0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19070a;

    public /* synthetic */ pu0(int i) {
        this.f19070a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        switch (this.f19070a) {
            case 0:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                return new PremiumBusAvailableOptionsFetchFailedException(genericChaloErrorResponse, genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            case 1:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse2 == null || (str = genericChaloErrorResponse2.b) == null) {
                    str = "Something went wrong";
                }
                return new PBTripDetailsFetchFailedException(genericChaloErrorResponse2, str);
            case 2:
                GenericChaloErrorResponse genericChaloErrorResponse3 = (GenericChaloErrorResponse) obj;
                return new PBChangeStopFailedException(genericChaloErrorResponse3, genericChaloErrorResponse3 != null ? genericChaloErrorResponse3.b : null);
            case 3:
                GenericChaloErrorResponse genericChaloErrorResponse4 = (GenericChaloErrorResponse) obj;
                return new PBStopPointsFetchFailedException(genericChaloErrorResponse4 != null ? genericChaloErrorResponse4.b : null);
            case 4:
                GenericChaloErrorResponse genericChaloErrorResponse5 = (GenericChaloErrorResponse) obj;
                return new PremiumBusSeatSelectionLayoutFetchFailureException(genericChaloErrorResponse5, genericChaloErrorResponse5 != null ? genericChaloErrorResponse5.b : null);
            case 5:
                PremiumBusSeatSelectionDataState it = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it, "it");
                return PremiumBusSeatSelectionDataState.a(it, false, null, null, null, null, false, null, null, false, null, null, null, null, 65023);
            case 6:
                PremiumBusSeatSelectionDataState it2 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it2, "it");
                return PremiumBusSeatSelectionDataState.a(it2, false, null, null, null, null, false, null, null, false, null, null, null, null, 61439);
            case 7:
                PremiumBusSeatSelectionDataState it3 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it3, "it");
                return PremiumBusSeatSelectionDataState.a(it3, false, null, null, null, null, false, null, null, false, null, SeatSelectionBottomSheetType.PassengerCountSelection.f7755a, null, null, 61439);
            case 8:
                PremiumBusSeatSelectionDataState it4 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it4, "it");
                return PremiumBusSeatSelectionDataState.a(it4, false, null, null, null, null, false, null, null, false, null, null, null, null, 65533);
            case 9:
                SeatInfoAppModel it5 = (SeatInfoAppModel) obj;
                Intrinsics.i(it5, "it");
                return it5.c;
            case 10:
                SeatInfoAppModel it6 = (SeatInfoAppModel) obj;
                Intrinsics.i(it6, "it");
                return String.valueOf(it6.f7122a);
            case 11:
                SeatInfoAppModel it7 = (SeatInfoAppModel) obj;
                Intrinsics.i(it7, "it");
                return String.valueOf(it7.j);
            case 12:
                PremiumBusSeatSelectionDataState it8 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it8, "it");
                return PremiumBusSeatSelectionDataState.a(it8, false, null, null, null, null, false, null, null, false, null, null, null, null, 61439);
            case 13:
                PremiumBusSeatSelectionDataState it9 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it9, "it");
                return PremiumBusSeatSelectionDataState.a(it9, false, null, null, null, null, false, null, null, false, GenderPreferenceSelectionStates.SHOW_PREFERENCE_NUDGE_CARD, null, null, null, 59391);
            case 14:
                PremiumBusSeatSelectionDataState it10 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it10, "it");
                return PremiumBusSeatSelectionDataState.a(it10, false, null, null, null, null, false, null, null, false, null, null, null, null, 49151);
            case 15:
                PremiumBusSeatSelectionDataState it11 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it11, "it");
                return PremiumBusSeatSelectionDataState.a(it11, false, null, null, null, null, false, null, null, false, null, null, null, null, 61439);
            case 16:
                PremiumBusSeatSelectionDataState it12 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it12, "it");
                return PremiumBusSeatSelectionDataState.a(it12, false, null, null, null, null, false, null, null, false, null, new SeatSelectionBottomSheetType.GenderPreferenceBottomSheet(new GenderConfirmationBottomSheetType.PreferenceSelectionBottomSheetType(1)), null, null, 61439);
            case 17:
                PremiumBusSeatSelectionDataState it13 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it13, "it");
                return PremiumBusSeatSelectionDataState.a(it13, true, null, EmptyList.f17557a, null, null, false, null, null, false, null, null, null, null, 61421);
            case 18:
                PremiumBusSeatSelectionDataState it14 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it14, "it");
                return PremiumBusSeatSelectionDataState.a(it14, false, null, null, null, null, false, null, null, false, null, null, null, null, 61439);
            case 19:
                PremiumBusSeatSelectionDataState it15 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it15, "it");
                return PremiumBusSeatSelectionDataState.a(it15, false, null, null, null, null, false, null, null, false, GenderPreferenceSelectionStates.SHOW_PREFERENCE_NUDGE_CARD, null, null, null, 59391);
            case 20:
                PremiumBusSeatSelectionDataState it16 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it16, "it");
                return PremiumBusSeatSelectionDataState.a(it16, false, null, null, null, null, false, null, null, false, null, null, null, null, 65023);
            case 21:
                PremiumBusSeatSelectionDataState it17 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it17, "it");
                return PremiumBusSeatSelectionDataState.a(it17, false, null, null, null, EmptyList.f17557a, false, null, null, false, null, null, null, null, 65471);
            case 22:
                SeatInfoAppModel it18 = (SeatInfoAppModel) obj;
                Intrinsics.i(it18, "it");
                return String.valueOf(it18.f7122a);
            case 23:
                PremiumBusSeatSelectionDataState it19 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it19, "it");
                return PremiumBusSeatSelectionDataState.a(it19, false, null, null, 1, null, false, null, null, false, null, null, null, null, 65503);
            case 24:
                PremiumBusSeatSelectionDataState it20 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it20, "it");
                return PremiumBusSeatSelectionDataState.a(it20, false, null, null, 1, null, false, null, null, false, null, null, null, null, 65503);
            case 25:
                PremiumBusSeatSelectionDataState it21 = (PremiumBusSeatSelectionDataState) obj;
                Intrinsics.i(it21, "it");
                return PremiumBusSeatSelectionDataState.a(it21, true, null, null, null, null, false, null, null, false, null, null, null, null, 65533);
            case 26:
                return PremiumBusSeatSelectionDataState.a((PremiumBusSeatSelectionDataState) obj, false, null, EmptyList.f17557a, null, null, false, null, null, false, null, null, null, null, 64489);
            case 27:
                return PremiumBusSeatSelectionDataState.a((PremiumBusSeatSelectionDataState) obj, false, null, EmptyList.f17557a, null, null, false, null, null, false, null, null, null, null, 64489);
            case 28:
                return PremiumBusSeatSelectionDataState.a((PremiumBusSeatSelectionDataState) obj, false, null, null, null, null, false, null, null, false, null, null, null, null, 65529);
            default:
                return PremiumBusSeatSelectionDataState.a((PremiumBusSeatSelectionDataState) obj, false, null, null, null, null, false, null, null, false, null, null, null, null, 65529);
        }
    }
}
