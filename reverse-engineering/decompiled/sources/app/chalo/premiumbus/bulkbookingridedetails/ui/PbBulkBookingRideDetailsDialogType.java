package app.chalo.premiumbus.bulkbookingridedetails.ui;

import app.chalo.compose.components.dialogs.ChaloDatePickerKt$betweenRange$1;
import defpackage.dd;
import defpackage.nf1;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsDialogType;", "", "ProductDisabledDialog", "DatePickerDialog", "PassDateChangeConfirmationDialog", "PassDateChangeFailureDialog", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsDialogType$DatePickerDialog;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsDialogType$PassDateChangeConfirmationDialog;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsDialogType$PassDateChangeFailureDialog;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsDialogType$ProductDisabledDialog;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PbBulkBookingRideDetailsDialogType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsDialogType$DatePickerDialog;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsDialogType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DatePickerDialog extends PbBulkBookingRideDetailsDialogType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6911a;
        public final ChaloDatePickerKt$betweenRange$1 b;

        public DatePickerDialog(long j, ChaloDatePickerKt$betweenRange$1 chaloDatePickerKt$betweenRange$1) {
            this.f6911a = j;
            this.b = chaloDatePickerKt$betweenRange$1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DatePickerDialog)) {
                return false;
            }
            DatePickerDialog datePickerDialog = (DatePickerDialog) obj;
            return this.f6911a == datePickerDialog.f6911a && this.b.equals(datePickerDialog.b);
        }

        public final int hashCode() {
            long j = this.f6911a;
            return this.b.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
        }

        public final String toString() {
            return "DatePickerDialog(initialSelectedDateInMillis=" + this.f6911a + ", selectableDates=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsDialogType$PassDateChangeConfirmationDialog;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsDialogType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassDateChangeConfirmationDialog extends PbBulkBookingRideDetailsDialogType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6912a;
        public final String b;
        public final long c;

        public PassDateChangeConfirmationDialog(String newStartDate, String newExpiryDate, long j) {
            Intrinsics.i(newStartDate, "newStartDate");
            Intrinsics.i(newExpiryDate, "newExpiryDate");
            this.f6912a = newStartDate;
            this.b = newExpiryDate;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PassDateChangeConfirmationDialog)) {
                return false;
            }
            PassDateChangeConfirmationDialog passDateChangeConfirmationDialog = (PassDateChangeConfirmationDialog) obj;
            return Intrinsics.d(this.f6912a, passDateChangeConfirmationDialog.f6912a) && Intrinsics.d(this.b, passDateChangeConfirmationDialog.b) && this.c == passDateChangeConfirmationDialog.c;
        }

        public final int hashCode() {
            int iE = nf1.e(this.f6912a.hashCode() * 31, 31, this.b);
            long j = this.c;
            return iE + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return uf0.m(this.c, ")", dd.e("PassDateChangeConfirmationDialog(newStartDate=", this.f6912a, ", newExpiryDate=", this.b, ", newStartDateInMillis="));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsDialogType$PassDateChangeFailureDialog;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsDialogType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassDateChangeFailureDialog extends PbBulkBookingRideDetailsDialogType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6913a;
        public final String b;

        public PassDateChangeFailureDialog(String messageTitle, String messageBody) {
            Intrinsics.i(messageTitle, "messageTitle");
            Intrinsics.i(messageBody, "messageBody");
            this.f6913a = messageTitle;
            this.b = messageBody;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PassDateChangeFailureDialog)) {
                return false;
            }
            PassDateChangeFailureDialog passDateChangeFailureDialog = (PassDateChangeFailureDialog) obj;
            return Intrinsics.d(this.f6913a, passDateChangeFailureDialog.f6913a) && Intrinsics.d(this.b, passDateChangeFailureDialog.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6913a.hashCode() * 31);
        }

        public final String toString() {
            return vo1.o("PassDateChangeFailureDialog(messageTitle=", this.f6913a, ", messageBody=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsDialogType$ProductDisabledDialog;", "Lapp/chalo/premiumbus/bulkbookingridedetails/ui/PbBulkBookingRideDetailsDialogType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProductDisabledDialog extends PbBulkBookingRideDetailsDialogType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductDisabledDialog f6914a = new ProductDisabledDialog();
    }
}
