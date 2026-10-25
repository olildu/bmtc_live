package defpackage;

import app.chalo.features.reportproblem.ReportProblemFeatureData;
import app.chalo.models.validation.BleValidationArgs;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.models.validation.ValidationProductKt;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PassInfo;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationDataState;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationIntent;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType;
import app.chalo.premiumbus.ui.slotselection.MultipleSlotSelectionCalendarState;
import app.chalo.premiumbus.ui.slotselection.PBSlotSelectionScreenBottomSheetType;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionDataState;
import app.chalo.uistate.dialog.MultiSelectionCalendarDataState;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.ui.BleValidationBottomsheetInfo;
import app.chalo.validationsdk.blevalidation.ui.BleValidationBottomsheetType;
import app.chalo.validationsdk.blevalidation.ui.BleValidationDialogInfo;
import app.chalo.validationsdk.blevalidation.ui.BleValidationLayoutInfo;
import app.chalo.validationsdk.blevalidation.ui.BleValidationLayoutType;
import app.chalo.validationsdk.blevalidation.ui.BleValidationMetaData;
import app.chalo.validationsdk.blevalidation.ui.BleValidationState;
import app.chalo.validationsdk.blevalidation.ui.ValidationProcessSpecificInfo;
import app.chalo.validationsdk.legacy.Product;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ta implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19640a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ta(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.f19640a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19640a) {
            case 0:
                BleValidationLayoutInfo bleValidationLayoutInfo = (BleValidationLayoutInfo) this.b;
                ValidationProcessSpecificInfo validationProcessSpecificInfo = (ValidationProcessSpecificInfo) this.c;
                BleValidationBottomsheetInfo bleValidationBottomsheetInfo = (BleValidationBottomsheetInfo) this.d;
                BleValidationDialogInfo bleValidationDialogInfo = (BleValidationDialogInfo) this.e;
                ReportProblemFeatureData reportProblemFeatureData = (ReportProblemFeatureData) this.f;
                ProductValidationData productValidationData = (ProductValidationData) this.g;
                BleValidationArgs bleValidationArgs = (BleValidationArgs) this.h;
                BleValidationState currentState = (BleValidationState) obj;
                Intrinsics.i(currentState, "currentState");
                BleValidationLayoutType bleValidationLayoutType = BleValidationLayoutType.BLE_VALIDATION;
                BleValidationBottomsheetType bleValidationBottomsheetType = BleValidationBottomsheetType.NONE;
                ValidationProduct validationProduct = bleValidationArgs.b;
                return BleValidationState.a(currentState, bleValidationLayoutType, bleValidationLayoutInfo, validationProcessSpecificInfo, bleValidationBottomsheetType, bleValidationBottomsheetInfo, false, bleValidationDialogInfo, false, null, new BleValidationMetaData(reportProblemFeatureData, productValidationData, new Product(validationProduct.getC(), (String) ValidationProductKt.a(validationProduct).d(), (String) ValidationProductKt.a(validationProduct).e()), bleValidationArgs, null, null), 3456);
            case 1:
                PremiumBusSeatSelectionFlowType.BulkBooking bulkBooking = (PremiumBusSeatSelectionFlowType.BulkBooking) this.b;
                PremiumBusBulkBookingConfirmationIntent.InitializationIntent initializationIntent = (PremiumBusBulkBookingConfirmationIntent.InitializationIntent) this.c;
                return PremiumBusBulkBookingConfirmationDataState.a((PremiumBusBulkBookingConfirmationDataState) obj, false, (String) this.d, bulkBooking.k, bulkBooking.j, (Map) this.e, null, (PassInfo) this.f, (String) this.g, bulkBooking.f, bulkBooking.g, bulkBooking.h, bulkBooking.i, (List) this.h, false, initializationIntent.f7497a.l, 8224);
            default:
                PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent = (PremiumBusSlotSelectionComponent) this.b;
                PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel = (PBAvailableSlotsTripAppModel) this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                MultiSelectionCalendarDataState multiSelectionCalendarDataState = (MultiSelectionCalendarDataState) this.f;
                return PremiumBusSlotSelectionDataState.a((PremiumBusSlotSelectionDataState) obj, false, false, false, null, null, new PBSlotSelectionScreenBottomSheetType.MultipleSlotSelectionCalendar(new MultipleSlotSelectionCalendarState.DataState(vo1.n(premiumBusSlotSelectionComponent.q.e(pBAvailableSlotsTripAppModel.g), " ", str), str2, multiSelectionCalendarDataState)), null, null, null, 0, null, null, null, false, null, null, null, null, false, null, null, null, 0, null, false, null, null, (List) this.g, (List) this.h, null, -1610612769);
        }
    }
}
