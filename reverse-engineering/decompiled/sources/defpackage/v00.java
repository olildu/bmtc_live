package defpackage;

import androidx.media3.extractor.ts.PsExtractor;
import app.chalo.electricitybill.domain.EBillPaymentHistoryErrorState;
import app.chalo.electricitybill.exception.EBillFetchException;
import app.chalo.electricitybill.ui.ebillfetch.EBillFetchDataState;
import app.chalo.electricitybill.ui.paymenthistory.ElectricityPaymentHistoryDataState;
import app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateError;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsDialogType;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsViewState;
import app.chalo.premiumbus.domain.FetchEligibleStopsFailureReason;
import app.chalo.premiumbus.domain.ODPairAndSlotsFetchFailedReasons;
import app.chalo.premiumbus.ui.changestop.ChangeStopFailureType;
import app.chalo.premiumbus.ui.changestop.ChangeStopScreenState;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopComponent;
import app.chalo.premiumbus.ui.changestop.PremiumBusChangeStopDataState;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionDataState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDataState;
import app.chalo.premiumbus.ui.slotselection.SlotSelectionErrorScreenType;
import app.chalo.productbooking.common.domain.FetchProductConfigForUiErrorReason;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.StringResourcesBase;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v00 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19790a;
    public final /* synthetic */ ChaloUseCaseResult.Failure b;

    public /* synthetic */ v00(ChaloUseCaseResult.Failure failure, int i) {
        this.f19790a = i;
        this.b = failure;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19790a) {
            case 0:
                return EBillFetchDataState.a((EBillFetchDataState) obj, false, ((EBillFetchException) this.b.f10418a).getMsg(), false, "", false, false, false, null, PsExtractor.VIDEO_STREAM_MASK);
            case 1:
                Object obj2 = this.b.f10418a;
                return ElectricityPaymentHistoryDataState.a((ElectricityPaymentHistoryDataState) obj, false, null, ((EBillPaymentHistoryErrorState) obj2).getF2547a(), null, obj2 instanceof EBillPaymentHistoryErrorState.ApiFailedError, 10);
            case 2:
                Object obj3 = this.b.f10418a;
                return PbBulkBookingRideDetailsViewState.a((PbBulkBookingRideDetailsViewState) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, new PbBulkBookingRideDetailsDialogType.PassDateChangeFailureDialog(((UpdatePassStartDateError) obj3).getB(), ((UpdatePassStartDateError) obj3).getC()), null, null, false, null, false, 66027519);
            case 3:
                PremiumBusChangeStopDataState it = (PremiumBusChangeStopDataState) obj;
                Intrinsics.i(it, "it");
                int i = PremiumBusChangeStopComponent.WhenMappings.f7525a[((FetchEligibleStopsFailureReason) this.b.f10418a).ordinal()];
                if (i == 1 || i == 2 || i == 3 || i == 4) {
                    return PremiumBusChangeStopDataState.a(it, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ChangeStopScreenState.Failure(ChangeStopFailureType.LOAD_ERROR, null), 16383);
                }
                throw new NoWhenBranchMatchedException();
            case 4:
                PremiumBusProductSelectionDataState it2 = (PremiumBusProductSelectionDataState) obj;
                Intrinsics.i(it2, "it");
                return PremiumBusProductSelectionDataState.a(it2, false, false, null, true, Integer.valueOf(((FetchProductConfigForUiErrorReason) this.b.f10418a).getErrorCodes()), null, false, null, null, 486);
            case 5:
                return PremiumBusSlotSelectionDataState.a((PremiumBusSlotSelectionDataState) obj, false, false, false, SlotSelectionErrorScreenType.NO_ROUTE_AVAILABLE, new StringResourcesBase.GenericErrorMsgWithErrorCode(((ODPairAndSlotsFetchFailedReasons) this.b.f10418a).a()), null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -29);
            default:
                return PremiumBusSlotSelectionDataState.a((PremiumBusSlotSelectionDataState) obj, false, false, false, SlotSelectionErrorScreenType.NO_ROUTE_AVAILABLE, new StringResourcesBase.GenericErrorMsgWithErrorCode(((ODPairAndSlotsFetchFailedReasons) this.b.f10418a).a()), null, null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, null, null, null, -29);
        }
    }
}
