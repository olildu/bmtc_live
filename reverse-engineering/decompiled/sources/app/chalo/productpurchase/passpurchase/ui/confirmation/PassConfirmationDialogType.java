package app.chalo.productpurchase.passpurchase.ui.confirmation;

import defpackage.t10;
import defpackage.uf0;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/PassConfirmationDialogType;", "", "Loading", "PassStartTimeChangeDialog", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/PassConfirmationDialogType$Loading;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/PassConfirmationDialogType$PassStartTimeChangeDialog;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PassConfirmationDialogType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/PassConfirmationDialogType$Loading;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/PassConfirmationDialogType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loading extends PassConfirmationDialogType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f8393a = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1256313353;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/PassConfirmationDialogType$PassStartTimeChangeDialog;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/PassConfirmationDialogType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassStartTimeChangeDialog extends PassConfirmationDialogType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8394a;
        public final long b;
        public final long c;
        public final long d;

        public PassStartTimeChangeDialog(long j, long j2, long j3, String title) {
            Intrinsics.i(title, "title");
            this.f8394a = title;
            this.b = j;
            this.c = j2;
            this.d = j3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getB() {
            return this.b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getD() {
            return this.d;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getC() {
            return this.c;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getF8394a() {
            return this.f8394a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PassStartTimeChangeDialog)) {
                return false;
            }
            PassStartTimeChangeDialog passStartTimeChangeDialog = (PassStartTimeChangeDialog) obj;
            return Intrinsics.d(this.f8394a, passStartTimeChangeDialog.f8394a) && this.b == passStartTimeChangeDialog.b && this.c == passStartTimeChangeDialog.c && this.d == passStartTimeChangeDialog.d;
        }

        public final int hashCode() {
            int iHashCode = this.f8394a.hashCode() * 31;
            long j = this.b;
            int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.c;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.d;
            return i2 + ((int) (j3 ^ (j3 >>> 32)));
        }

        public final String toString() {
            StringBuilder sbM = t10.m(this.b, "PassStartTimeChangeDialog(title=", this.f8394a, ", currentSelection=");
            xs.r(this.c, ", startTs=", ", endTS=", sbM);
            return uf0.m(this.d, ")", sbM);
        }
    }
}
