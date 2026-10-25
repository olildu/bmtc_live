package app.chalo.instantticket.ui.faredetails.contract;

import app.chalo.ondc.model.app.response.OndcBookingUiModel;
import defpackage.r1;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsBottomSheetType;", "", "TncSection", "FareNoteSection", "UserBillingDetails", "FinalFare", "FareBreakupAndFinalFare", "FareValidationFailed", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsBottomSheetType$FareBreakupAndFinalFare;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsBottomSheetType$FareNoteSection;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsBottomSheetType$FareValidationFailed;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsBottomSheetType$FinalFare;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsBottomSheetType$TncSection;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsBottomSheetType$UserBillingDetails;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FareDetailsBottomSheetType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsBottomSheetType$FareBreakupAndFinalFare;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FareBreakupAndFinalFare extends FareDetailsBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OndcBookingUiModel f3921a;

        public FareBreakupAndFinalFare(OndcBookingUiModel data) {
            Intrinsics.i(data, "data");
            this.f3921a = data;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FareBreakupAndFinalFare) && Intrinsics.d(this.f3921a, ((FareBreakupAndFinalFare) obj).f3921a);
        }

        public final int hashCode() {
            return this.f3921a.hashCode();
        }

        public final String toString() {
            return "FareBreakupAndFinalFare(data=" + this.f3921a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsBottomSheetType$FareNoteSection;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FareNoteSection extends FareDetailsBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3922a;

        public FareNoteSection(String fareNote) {
            Intrinsics.i(fareNote, "fareNote");
            this.f3922a = fareNote;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FareNoteSection) && Intrinsics.d(this.f3922a, ((FareNoteSection) obj).f3922a);
        }

        public final int hashCode() {
            return this.f3922a.hashCode();
        }

        public final String toString() {
            return vo1.B("FareNoteSection(fareNote=", this.f3922a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsBottomSheetType$FareValidationFailed;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FareValidationFailed extends FareDetailsBottomSheetType {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FareValidationFailed);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "FareValidationFailed(message=null, finalFare=0)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsBottomSheetType$FinalFare;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FinalFare extends FareDetailsBottomSheetType {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FinalFare);
        }

        public final int hashCode() {
            return 24;
        }

        public final String toString() {
            return "FinalFare(validityInHrs=24)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsBottomSheetType$TncSection;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TncSection extends FareDetailsBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f3923a;

        public TncSection(List tncList) {
            Intrinsics.i(tncList, "tncList");
            this.f3923a = tncList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TncSection) && Intrinsics.d(this.f3923a, ((TncSection) obj).f3923a);
        }

        public final int hashCode() {
            return this.f3923a.hashCode();
        }

        public final String toString() {
            return r1.d("TncSection(tncList=", ")", this.f3923a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsBottomSheetType$UserBillingDetails;", "Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsBottomSheetType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UserBillingDetails extends FareDetailsBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UserBillingDetails f3924a = new UserBillingDetails();
    }
}
