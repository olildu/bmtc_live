package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofItemsUIState;", "", "UserNameProof", "ImageProof", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofItemsUIState$ImageProof;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofItemsUIState$UserNameProof;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SuperPassProofItemsUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofItemsUIState$ImageProof;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofItemsUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageProof extends SuperPassProofItemsUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SuperPassProofImageUISpec f8462a;
        public final TextUIState b;
        public final TextUIState c;
        public final SuperPassProofRejectionReasonUIState d;
        public final SuperPassProofUploadedImageUIState e;
        public final DividerUIState f;

        public ImageProof(SuperPassProofImageUISpec superPassProofImageUISpec, TextUIState.ChaloTextUIState proofName, TextUIState textUIState, SuperPassProofRejectionReasonUIState superPassProofRejectionReasonUIState, SuperPassProofUploadedImageUIState uploadedImage, DividerUIState dividerUIState) {
            Intrinsics.i(proofName, "proofName");
            Intrinsics.i(uploadedImage, "uploadedImage");
            this.f8462a = superPassProofImageUISpec;
            this.b = proofName;
            this.c = textUIState;
            this.d = superPassProofRejectionReasonUIState;
            this.e = uploadedImage;
            this.f = dividerUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageProof)) {
                return false;
            }
            ImageProof imageProof = (ImageProof) obj;
            return Intrinsics.d(this.f8462a, imageProof.f8462a) && Intrinsics.d(this.b, imageProof.b) && Intrinsics.d(this.c, imageProof.c) && Intrinsics.d(this.d, imageProof.d) && Intrinsics.d(this.e, imageProof.e) && Intrinsics.d(this.f, imageProof.f);
        }

        public final int hashCode() {
            int iC = pk0.c(this.b, this.f8462a.hashCode() * 31, 31);
            TextUIState textUIState = this.c;
            int iHashCode = (iC + (textUIState == null ? 0 : textUIState.hashCode())) * 31;
            SuperPassProofRejectionReasonUIState superPassProofRejectionReasonUIState = this.d;
            int iHashCode2 = (this.e.hashCode() + ((iHashCode + (superPassProofRejectionReasonUIState == null ? 0 : superPassProofRejectionReasonUIState.hashCode())) * 31)) * 31;
            DividerUIState dividerUIState = this.f;
            return iHashCode2 + (dividerUIState != null ? dividerUIState.hashCode() : 0);
        }

        public final String toString() {
            return "ImageProof(spec=" + this.f8462a + ", proofName=" + this.b + ", desc=" + this.c + ", rejectionReasons=" + this.d + ", uploadedImage=" + this.e + ", bottomDivider=" + this.f + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofItemsUIState$UserNameProof;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofItemsUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserNameProof extends SuperPassProofItemsUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SuperPassProofUserNameUISpec f8463a;
        public final TextUIState b;
        public final TextUIState c;
        public final SuperPassProofRejectionReasonUIState d;
        public final TextUIState e;
        public final SuperPassProofRejectionReasonUIState f;
        public final BaseTextFieldUIState.TextFieldUIState g;

        public UserNameProof(SuperPassProofUserNameUISpec superPassProofUserNameUISpec, TextUIState title, TextUIState subtitle, SuperPassProofRejectionReasonUIState superPassProofRejectionReasonUIState, TextUIState.ChaloTextUIState chaloTextUIState, SuperPassProofRejectionReasonUIState superPassProofRejectionReasonUIState2, BaseTextFieldUIState.TextFieldUIState textFieldUIState) {
            Intrinsics.i(title, "title");
            Intrinsics.i(subtitle, "subtitle");
            this.f8463a = superPassProofUserNameUISpec;
            this.b = title;
            this.c = subtitle;
            this.d = superPassProofRejectionReasonUIState;
            this.e = chaloTextUIState;
            this.f = superPassProofRejectionReasonUIState2;
            this.g = textFieldUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserNameProof)) {
                return false;
            }
            UserNameProof userNameProof = (UserNameProof) obj;
            return Intrinsics.d(this.f8463a, userNameProof.f8463a) && Intrinsics.d(this.b, userNameProof.b) && Intrinsics.d(this.c, userNameProof.c) && Intrinsics.d(this.d, userNameProof.d) && Intrinsics.d(this.e, userNameProof.e) && Intrinsics.d(this.f, userNameProof.f) && Intrinsics.d(this.g, userNameProof.g);
        }

        public final int hashCode() {
            int iC = pk0.c(this.c, pk0.c(this.b, this.f8463a.hashCode() * 31, 31), 31);
            SuperPassProofRejectionReasonUIState superPassProofRejectionReasonUIState = this.d;
            int iHashCode = (iC + (superPassProofRejectionReasonUIState == null ? 0 : superPassProofRejectionReasonUIState.hashCode())) * 31;
            TextUIState textUIState = this.e;
            int iHashCode2 = (iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31;
            SuperPassProofRejectionReasonUIState superPassProofRejectionReasonUIState2 = this.f;
            int iHashCode3 = (iHashCode2 + (superPassProofRejectionReasonUIState2 == null ? 0 : superPassProofRejectionReasonUIState2.hashCode())) * 31;
            BaseTextFieldUIState.TextFieldUIState textFieldUIState = this.g;
            return iHashCode3 + (textFieldUIState != null ? textFieldUIState.hashCode() : 0);
        }

        public final String toString() {
            return "UserNameProof(spec=" + this.f8463a + ", title=" + this.b + ", subtitle=" + this.c + ", generalRejectionReasons=" + this.d + ", userNameRejectionTitle=" + this.e + ", profileRejectionReasons=" + this.f + ", fullNameTextField=" + this.g + ")";
        }
    }
}
