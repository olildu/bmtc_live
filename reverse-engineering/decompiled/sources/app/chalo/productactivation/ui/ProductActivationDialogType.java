package app.chalo.productactivation.ui;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationDialogType;", "", "PassActivationConfirmationDialog", "ProductActivationFailedDialog", "MTicketActivationConfirmationDialog", "Lapp/chalo/productactivation/ui/ProductActivationDialogType$MTicketActivationConfirmationDialog;", "Lapp/chalo/productactivation/ui/ProductActivationDialogType$PassActivationConfirmationDialog;", "Lapp/chalo/productactivation/ui/ProductActivationDialogType$ProductActivationFailedDialog;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProductActivationDialogType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationDialogType$MTicketActivationConfirmationDialog;", "Lapp/chalo/productactivation/ui/ProductActivationDialogType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MTicketActivationConfirmationDialog extends ProductActivationDialogType {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MTicketActivationConfirmationDialog);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "MTicketActivationConfirmationDialog(bookingType=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationDialogType$PassActivationConfirmationDialog;", "Lapp/chalo/productactivation/ui/ProductActivationDialogType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassActivationConfirmationDialog extends ProductActivationDialogType {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PassActivationConfirmationDialog);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "PassActivationConfirmationDialog(bookingType=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productactivation/ui/ProductActivationDialogType$ProductActivationFailedDialog;", "Lapp/chalo/productactivation/ui/ProductActivationDialogType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductActivationFailedDialog extends ProductActivationDialogType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8030a;
        public final String b;

        public ProductActivationFailedDialog(String title, String message) {
            Intrinsics.i(title, "title");
            Intrinsics.i(message, "message");
            this.f8030a = title;
            this.b = message;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductActivationFailedDialog)) {
                return false;
            }
            ProductActivationFailedDialog productActivationFailedDialog = (ProductActivationFailedDialog) obj;
            return Intrinsics.d(this.f8030a, productActivationFailedDialog.f8030a) && Intrinsics.d(this.b, productActivationFailedDialog.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8030a.hashCode() * 31);
        }

        public final String toString() {
            return vo1.o("ProductActivationFailedDialog(title=", this.f8030a, ", message=", this.b, ")");
        }
    }
}
