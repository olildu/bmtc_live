package app.chalo.productpurchase.passpurchase.ui.confirmation;

import defpackage.dd;
import defpackage.nf1;
import defpackage.r1;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/PassConfirmationBottomSheetType;", "", "PassAlreadyAvailed", "FareMappingFailed", "TermsAndConditions", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/PassConfirmationBottomSheetType$FareMappingFailed;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/PassConfirmationBottomSheetType$PassAlreadyAvailed;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/PassConfirmationBottomSheetType$TermsAndConditions;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PassConfirmationBottomSheetType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/PassConfirmationBottomSheetType$FareMappingFailed;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/PassConfirmationBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FareMappingFailed extends PassConfirmationBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8390a;
        public final String b;
        public final String c;

        public FareMappingFailed(String msg, String confirmBtnText, String cancelBtnText) {
            Intrinsics.i(msg, "msg");
            Intrinsics.i(confirmBtnText, "confirmBtnText");
            Intrinsics.i(cancelBtnText, "cancelBtnText");
            this.f8390a = msg;
            this.b = confirmBtnText;
            this.c = cancelBtnText;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getC() {
            return this.c;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getF8390a() {
            return this.f8390a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FareMappingFailed)) {
                return false;
            }
            FareMappingFailed fareMappingFailed = (FareMappingFailed) obj;
            return Intrinsics.d(this.f8390a, fareMappingFailed.f8390a) && Intrinsics.d(this.b, fareMappingFailed.b) && Intrinsics.d(this.c, fareMappingFailed.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + nf1.e(this.f8390a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return vo1.p(dd.e("FareMappingFailed(msg=", this.f8390a, ", confirmBtnText=", this.b, ", cancelBtnText="), this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/PassConfirmationBottomSheetType$PassAlreadyAvailed;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/PassConfirmationBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassAlreadyAvailed extends PassConfirmationBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8391a;

        public PassAlreadyAvailed(String str) {
            this.f8391a = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF8391a() {
            return this.f8391a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PassAlreadyAvailed) && Intrinsics.d(this.f8391a, ((PassAlreadyAvailed) obj).f8391a);
        }

        public final int hashCode() {
            return this.f8391a.hashCode();
        }

        public final String toString() {
            return vo1.B("PassAlreadyAvailed(msg=", this.f8391a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/PassConfirmationBottomSheetType$TermsAndConditions;", "Lapp/chalo/productpurchase/passpurchase/ui/confirmation/PassConfirmationBottomSheetType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TermsAndConditions extends PassConfirmationBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f8392a;

        public TermsAndConditions(List list) {
            this.f8392a = list;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF8392a() {
            return this.f8392a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TermsAndConditions) && Intrinsics.d(this.f8392a, ((TermsAndConditions) obj).f8392a);
        }

        public final int hashCode() {
            return this.f8392a.hashCode();
        }

        public final String toString() {
            return r1.d("TermsAndConditions(terms=", ")", this.f8392a);
        }
    }
}
