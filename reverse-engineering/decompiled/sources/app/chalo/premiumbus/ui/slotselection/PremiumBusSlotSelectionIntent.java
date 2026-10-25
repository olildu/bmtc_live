package app.chalo.premiumbus.ui.slotselection;

import app.chalo.constants.Source;
import app.chalo.premiumbus.PremiumBusProductPurchaseFlowType;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsInfoAppModel;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsTripAppModel;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.productbooking.common.data.models.app.response.PBBulkBookingAvailableSlotsTripAppResponseModel;
import defpackage.b3;
import defpackage.gf;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.r1;
import defpackage.vo1;
import defpackage.xs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.LocalDateTime;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u0082\u0001\u001b\u001d\u001e\u001f !\"#$%&'()*+,-./01234567¨\u00068"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "", "InitializationIntent", "ViewAllSlotsClickIntent", "SlotClickedIntent", "OriginDestinationStopDetailsClickedIntent", "ConfirmSlotClickedIntent", "ExploreAvailableRoutesClickIntent", "PurchaseOptionClickedIntent", "SectionItemClickedIntent", "ErrorScreenRetryBtnClickedIntent", "ErrorSnackBarActionBtnClickIntent", "CloseBottomSheetBtnClickIntent", "BackBtnClickIntent", "PassPurchaseNudgeCardClickedIntent", "DismissSnackBar", "LoadMoreSlotsIntent", "CallCustomerSupportBtnClickIntent", "AggregateSlotFetchErrorBottomSheetRetryBtnClickIntent", "DismissMultipleSlotSelectionCalendarIntent", "MultipleSlotSelectionCalendarDismissClickIntent", "MultipleSlotSelectionCalendarCancelClickIntent", "MultipleSlotSelectionCalendarProceedClickIntent", "MultipleSlotSelectionCalendarDateClickIntent", "NearBySlotsBottomSheetGoBackClickIntent", "NearBySlotsBottomSheetConfirmRidesClickIntent", "DateAndSlotSelectedForBulkBookingRemoveClickIntent", "SelectNearBySlotClickedForBulkBookingIntent", "SelectNearByViewMoreClickedForBulkBookingIntent", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$AggregateSlotFetchErrorBottomSheetRetryBtnClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$BackBtnClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$CallCustomerSupportBtnClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$CloseBottomSheetBtnClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$ConfirmSlotClickedIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$DateAndSlotSelectedForBulkBookingRemoveClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$DismissMultipleSlotSelectionCalendarIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$DismissSnackBar;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$ErrorScreenRetryBtnClickedIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$ErrorSnackBarActionBtnClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$ExploreAvailableRoutesClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$InitializationIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$LoadMoreSlotsIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$MultipleSlotSelectionCalendarCancelClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$MultipleSlotSelectionCalendarDateClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$MultipleSlotSelectionCalendarDismissClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$MultipleSlotSelectionCalendarProceedClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$NearBySlotsBottomSheetConfirmRidesClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$NearBySlotsBottomSheetGoBackClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$OriginDestinationStopDetailsClickedIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$PassPurchaseNudgeCardClickedIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$PurchaseOptionClickedIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$SectionItemClickedIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$SelectNearBySlotClickedForBulkBookingIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$SelectNearByViewMoreClickedForBulkBookingIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$SlotClickedIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$ViewAllSlotsClickIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusSlotSelectionIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$AggregateSlotFetchErrorBottomSheetRetryBtnClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AggregateSlotFetchErrorBottomSheetRetryBtnClickIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBAvailableSlotsTripAppModel f7862a;
        public final String b;
        public final String c;

        public AggregateSlotFetchErrorBottomSheetRetryBtnClickIntent(PBAvailableSlotsTripAppModel slot, String passId, String productSubType) {
            Intrinsics.i(slot, "slot");
            Intrinsics.i(passId, "passId");
            Intrinsics.i(productSubType, "productSubType");
            this.f7862a = slot;
            this.b = passId;
            this.c = productSubType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AggregateSlotFetchErrorBottomSheetRetryBtnClickIntent)) {
                return false;
            }
            AggregateSlotFetchErrorBottomSheetRetryBtnClickIntent aggregateSlotFetchErrorBottomSheetRetryBtnClickIntent = (AggregateSlotFetchErrorBottomSheetRetryBtnClickIntent) obj;
            return Intrinsics.d(this.f7862a, aggregateSlotFetchErrorBottomSheetRetryBtnClickIntent.f7862a) && Intrinsics.d(this.b, aggregateSlotFetchErrorBottomSheetRetryBtnClickIntent.b) && Intrinsics.d(this.c, aggregateSlotFetchErrorBottomSheetRetryBtnClickIntent.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + nf1.e(this.f7862a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AggregateSlotFetchErrorBottomSheetRetryBtnClickIntent(slot=");
            sb.append(this.f7862a);
            sb.append(", passId=");
            sb.append(this.b);
            sb.append(", productSubType=");
            return vo1.p(sb, this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$BackBtnClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BackBtnClickIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackBtnClickIntent f7863a = new BackBtnClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$CallCustomerSupportBtnClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CallCustomerSupportBtnClickIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7864a;

        public CallCustomerSupportBtnClickIntent(String customerSupportNumber) {
            Intrinsics.i(customerSupportNumber, "customerSupportNumber");
            this.f7864a = customerSupportNumber;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CallCustomerSupportBtnClickIntent) && Intrinsics.d(this.f7864a, ((CallCustomerSupportBtnClickIntent) obj).f7864a);
        }

        public final int hashCode() {
            return this.f7864a.hashCode();
        }

        public final String toString() {
            return vo1.B("CallCustomerSupportBtnClickIntent(customerSupportNumber=", this.f7864a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$CloseBottomSheetBtnClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CloseBottomSheetBtnClickIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CloseBottomSheetBtnClickIntent f7865a = new CloseBottomSheetBtnClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$ConfirmSlotClickedIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConfirmSlotClickedIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBAvailableSlotsTripAppModel f7866a;
        public final BookingSelectionType b;
        public final List c;

        public ConfirmSlotClickedIntent(PBAvailableSlotsTripAppModel selectedSlot, BookingSelectionType bookingSelectionType, List list) {
            Intrinsics.i(selectedSlot, "selectedSlot");
            Intrinsics.i(bookingSelectionType, "bookingSelectionType");
            this.f7866a = selectedSlot;
            this.b = bookingSelectionType;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfirmSlotClickedIntent)) {
                return false;
            }
            ConfirmSlotClickedIntent confirmSlotClickedIntent = (ConfirmSlotClickedIntent) obj;
            return Intrinsics.d(this.f7866a, confirmSlotClickedIntent.f7866a) && this.b == confirmSlotClickedIntent.b && Intrinsics.d(this.c, confirmSlotClickedIntent.c);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.f7866a.hashCode() * 31)) * 31;
            List list = this.c;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConfirmSlotClickedIntent(selectedSlot=");
            sb.append(this.f7866a);
            sb.append(", bookingSelectionType=");
            sb.append(this.b);
            sb.append(", odPairsWithSlots=");
            return xs.l(sb, this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$DateAndSlotSelectedForBulkBookingRemoveClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateAndSlotSelectedForBulkBookingRemoveClickIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateAndSlotSelectedForBulkBooking f7867a;

        public DateAndSlotSelectedForBulkBookingRemoveClickIntent(DateAndSlotSelectedForBulkBooking dateAndSlotSelectedForBulkBooking) {
            this.f7867a = dateAndSlotSelectedForBulkBooking;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DateAndSlotSelectedForBulkBookingRemoveClickIntent) && Intrinsics.d(this.f7867a, ((DateAndSlotSelectedForBulkBookingRemoveClickIntent) obj).f7867a);
        }

        public final int hashCode() {
            return this.f7867a.hashCode();
        }

        public final String toString() {
            return "DateAndSlotSelectedForBulkBookingRemoveClickIntent(slot=" + this.f7867a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$DismissMultipleSlotSelectionCalendarIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DismissMultipleSlotSelectionCalendarIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissMultipleSlotSelectionCalendarIntent f7868a = new DismissMultipleSlotSelectionCalendarIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissMultipleSlotSelectionCalendarIntent);
        }

        public final int hashCode() {
            return -8678612;
        }

        public final String toString() {
            return "DismissMultipleSlotSelectionCalendarIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$DismissSnackBar;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DismissSnackBar extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissSnackBar f7869a = new DismissSnackBar();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$ErrorScreenRetryBtnClickedIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ErrorScreenRetryBtnClickedIntent extends PremiumBusSlotSelectionIntent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ErrorScreenRetryBtnClickedIntent);
        }

        public final int hashCode() {
            return (int) 0;
        }

        public final String toString() {
            return "ErrorScreenRetryBtnClickedIntent(sectionId=0)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$ErrorSnackBarActionBtnClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ErrorSnackBarActionBtnClickIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ErrorSnackBarActionBtnClickIntent f7870a = new ErrorSnackBarActionBtnClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$ExploreAvailableRoutesClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ExploreAvailableRoutesClickIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExploreAvailableRoutesClickIntent f7871a = new ExploreAvailableRoutesClickIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$InitializationIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusProductPurchaseFlowType f7872a;
        public final Source b;

        public InitializationIntent(PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType, Source previousSource) {
            Intrinsics.i(previousSource, "previousSource");
            this.f7872a = premiumBusProductPurchaseFlowType;
            this.b = previousSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitializationIntent)) {
                return false;
            }
            InitializationIntent initializationIntent = (InitializationIntent) obj;
            return Intrinsics.d(this.f7872a, initializationIntent.f7872a) && this.b == initializationIntent.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f7872a.hashCode() * 31);
        }

        public final String toString() {
            return "InitializationIntent(premiumBusProductPurchaseFlowType=" + this.f7872a + ", previousSource=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$LoadMoreSlotsIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LoadMoreSlotsIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LoadMoreSlotsIntent f7873a = new LoadMoreSlotsIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$MultipleSlotSelectionCalendarCancelClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultipleSlotSelectionCalendarCancelClickIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MultipleSlotSelectionCalendarCancelClickIntent f7874a = new MultipleSlotSelectionCalendarCancelClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MultipleSlotSelectionCalendarCancelClickIntent);
        }

        public final int hashCode() {
            return -1626728596;
        }

        public final String toString() {
            return "MultipleSlotSelectionCalendarCancelClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$MultipleSlotSelectionCalendarDateClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultipleSlotSelectionCalendarDateClickIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDateTime f7875a;

        public MultipleSlotSelectionCalendarDateClickIntent(LocalDateTime selectedDateTime) {
            Intrinsics.i(selectedDateTime, "selectedDateTime");
            this.f7875a = selectedDateTime;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultipleSlotSelectionCalendarDateClickIntent) && Intrinsics.d(this.f7875a, ((MultipleSlotSelectionCalendarDateClickIntent) obj).f7875a);
        }

        public final int hashCode() {
            return this.f7875a.hashCode();
        }

        public final String toString() {
            return "MultipleSlotSelectionCalendarDateClickIntent(selectedDateTime=" + this.f7875a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$MultipleSlotSelectionCalendarDismissClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultipleSlotSelectionCalendarDismissClickIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MultipleSlotSelectionCalendarDismissClickIntent f7876a = new MultipleSlotSelectionCalendarDismissClickIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MultipleSlotSelectionCalendarDismissClickIntent);
        }

        public final int hashCode() {
            return -87027304;
        }

        public final String toString() {
            return "MultipleSlotSelectionCalendarDismissClickIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$MultipleSlotSelectionCalendarProceedClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultipleSlotSelectionCalendarProceedClickIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f7877a;

        public MultipleSlotSelectionCalendarProceedClickIntent(ArrayList arrayList) {
            this.f7877a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultipleSlotSelectionCalendarProceedClickIntent) && this.f7877a.equals(((MultipleSlotSelectionCalendarProceedClickIntent) obj).f7877a);
        }

        public final int hashCode() {
            return this.f7877a.hashCode();
        }

        public final String toString() {
            return gf.i("MultipleSlotSelectionCalendarProceedClickIntent(selectedDates=", ")", this.f7877a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$NearBySlotsBottomSheetConfirmRidesClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NearBySlotsBottomSheetConfirmRidesClickIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f7878a;

        public NearBySlotsBottomSheetConfirmRidesClickIntent(ArrayList arrayList) {
            this.f7878a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NearBySlotsBottomSheetConfirmRidesClickIntent) && this.f7878a.equals(((NearBySlotsBottomSheetConfirmRidesClickIntent) obj).f7878a);
        }

        public final int hashCode() {
            return this.f7878a.hashCode();
        }

        public final String toString() {
            return gf.i("NearBySlotsBottomSheetConfirmRidesClickIntent(slotsSelectedForBulkBooking=", ")", this.f7878a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$NearBySlotsBottomSheetGoBackClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NearBySlotsBottomSheetGoBackClickIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f7879a;

        public NearBySlotsBottomSheetGoBackClickIntent(ArrayList arrayList) {
            this.f7879a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NearBySlotsBottomSheetGoBackClickIntent) && this.f7879a.equals(((NearBySlotsBottomSheetGoBackClickIntent) obj).f7879a);
        }

        public final int hashCode() {
            return this.f7879a.hashCode();
        }

        public final String toString() {
            return gf.i("NearBySlotsBottomSheetGoBackClickIntent(slotsSelectedForBulkBooking=", ")", this.f7879a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$OriginDestinationStopDetailsClickedIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OriginDestinationStopDetailsClickedIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBOriginDestinationAppModel f7880a;

        public OriginDestinationStopDetailsClickedIntent(PBOriginDestinationAppModel pBOriginDestinationAppModel) {
            this.f7880a = pBOriginDestinationAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OriginDestinationStopDetailsClickedIntent) && Intrinsics.d(this.f7880a, ((OriginDestinationStopDetailsClickedIntent) obj).f7880a);
        }

        public final int hashCode() {
            return this.f7880a.hashCode();
        }

        public final String toString() {
            return "OriginDestinationStopDetailsClickedIntent(selected=" + this.f7880a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$PassPurchaseNudgeCardClickedIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassPurchaseNudgeCardClickedIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBAvailableSlotsTripAppModel f7881a;

        public PassPurchaseNudgeCardClickedIntent(PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel) {
            this.f7881a = pBAvailableSlotsTripAppModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PassPurchaseNudgeCardClickedIntent) && Intrinsics.d(this.f7881a, ((PassPurchaseNudgeCardClickedIntent) obj).f7881a);
        }

        public final int hashCode() {
            PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel = this.f7881a;
            if (pBAvailableSlotsTripAppModel == null) {
                return 0;
            }
            return pBAvailableSlotsTripAppModel.hashCode();
        }

        public final String toString() {
            return "PassPurchaseNudgeCardClickedIntent(slot=" + this.f7881a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$PurchaseOptionClickedIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PurchaseOptionClickedIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PremiumBusPurchaseOptionUiModel f7882a;

        public PurchaseOptionClickedIntent(PremiumBusPurchaseOptionUiModel option) {
            Intrinsics.i(option, "option");
            this.f7882a = option;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PurchaseOptionClickedIntent) && Intrinsics.d(this.f7882a, ((PurchaseOptionClickedIntent) obj).f7882a);
        }

        public final int hashCode() {
            return this.f7882a.hashCode();
        }

        public final String toString() {
            return "PurchaseOptionClickedIntent(option=" + this.f7882a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$SectionItemClickedIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SectionItemClickedIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7883a;

        public SectionItemClickedIntent(long j) {
            this.f7883a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SectionItemClickedIntent) && this.f7883a == ((SectionItemClickedIntent) obj).f7883a;
        }

        public final int hashCode() {
            long j = this.f7883a;
            return (int) (j ^ (j >>> 32));
        }

        public final String toString() {
            return hq0.e(this.f7883a, "SectionItemClickedIntent(sectionId=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$SelectNearBySlotClickedForBulkBookingIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectNearBySlotClickedForBulkBookingIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBBulkBookingAvailableSlotsTripAppResponseModel f7884a;

        public SelectNearBySlotClickedForBulkBookingIntent(PBBulkBookingAvailableSlotsTripAppResponseModel nearBySlot) {
            Intrinsics.i(nearBySlot, "nearBySlot");
            this.f7884a = nearBySlot;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectNearBySlotClickedForBulkBookingIntent) && Intrinsics.d(this.f7884a, ((SelectNearBySlotClickedForBulkBookingIntent) obj).f7884a);
        }

        public final int hashCode() {
            return this.f7884a.hashCode();
        }

        public final String toString() {
            return "SelectNearBySlotClickedForBulkBookingIntent(nearBySlot=" + this.f7884a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$SelectNearByViewMoreClickedForBulkBookingIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectNearByViewMoreClickedForBulkBookingIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f7885a;

        public SelectNearByViewMoreClickedForBulkBookingIntent(List nearBySlots) {
            Intrinsics.i(nearBySlots, "nearBySlots");
            this.f7885a = nearBySlots;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectNearByViewMoreClickedForBulkBookingIntent) && Intrinsics.d(this.f7885a, ((SelectNearByViewMoreClickedForBulkBookingIntent) obj).f7885a);
        }

        public final int hashCode() {
            return this.f7885a.hashCode();
        }

        public final String toString() {
            return r1.d("SelectNearByViewMoreClickedForBulkBookingIntent(nearBySlots=", ")", this.f7885a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$SlotClickedIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SlotClickedIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBAvailableSlotsTripAppModel f7886a;
        public final int b;

        public SlotClickedIntent(PBAvailableSlotsTripAppModel pBAvailableSlotsTripAppModel, int i) {
            this.f7886a = pBAvailableSlotsTripAppModel;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SlotClickedIntent)) {
                return false;
            }
            SlotClickedIntent slotClickedIntent = (SlotClickedIntent) obj;
            return Intrinsics.d(this.f7886a, slotClickedIntent.f7886a) && this.b == slotClickedIntent.b;
        }

        public final int hashCode() {
            return (this.f7886a.hashCode() * 31) + this.b;
        }

        public final String toString() {
            return "SlotClickedIntent(slot=" + this.f7886a + ", odCardIndex=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent$ViewAllSlotsClickIntent;", "Lapp/chalo/premiumbus/ui/slotselection/PremiumBusSlotSelectionIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewAllSlotsClickIntent extends PremiumBusSlotSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PBOriginDestinationAppModel f7887a;
        public final PBAvailableSlotsInfoAppModel b;
        public final int c;

        public ViewAllSlotsClickIntent(PBOriginDestinationAppModel pBOriginDestinationAppModel, PBAvailableSlotsInfoAppModel data, int i) {
            Intrinsics.i(data, "data");
            this.f7887a = pBOriginDestinationAppModel;
            this.b = data;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewAllSlotsClickIntent)) {
                return false;
            }
            ViewAllSlotsClickIntent viewAllSlotsClickIntent = (ViewAllSlotsClickIntent) obj;
            return Intrinsics.d(this.f7887a, viewAllSlotsClickIntent.f7887a) && Intrinsics.d(this.b, viewAllSlotsClickIntent.b) && this.c == viewAllSlotsClickIntent.c;
        }

        public final int hashCode() {
            return ((this.b.hashCode() + (this.f7887a.hashCode() * 31)) * 31) + this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewAllSlotsClickIntent(odPairInfo=");
            sb.append(this.f7887a);
            sb.append(", data=");
            sb.append(this.b);
            sb.append(", cardIndex=");
            return b3.f(")", this.c, sb);
        }
    }
}
