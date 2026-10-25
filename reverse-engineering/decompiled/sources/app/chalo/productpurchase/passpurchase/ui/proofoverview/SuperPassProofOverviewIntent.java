package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import app.chalo.fileupload.picker.BitmapImage;
import app.chalo.scenes.args.SuperPassPurchaseArgs;
import app.chalo.superpass.data.models.app.ProofDocumentProps;
import defpackage.b3;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent;", "", "InitializationIntent", "NameEnteredIntent", "AddPhotoButtonClickedIntent", "CancelProofUploadButtonClicked", "EditPhotoButtonClicked", "DownloadFormClicked", "NextButtonClickedIntent", "EnlargeImageIntent", "ConsentCheckboxToggledIntent", "DismissEnlargeImageIntent", "DismissCameraRationaleDialogIntent", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent$AddPhotoButtonClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent$CancelProofUploadButtonClicked;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent$ConsentCheckboxToggledIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent$DismissCameraRationaleDialogIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent$DismissEnlargeImageIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent$DownloadFormClicked;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent$EditPhotoButtonClicked;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent$EnlargeImageIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent$InitializationIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent$NameEnteredIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent$NextButtonClickedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SuperPassProofOverviewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent$AddPhotoButtonClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddPhotoButtonClickedIntent extends SuperPassProofOverviewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProofDocumentProps f8467a;
        public final boolean b;

        public AddPhotoButtonClickedIntent(ProofDocumentProps lProofDocumentProps, boolean z) {
            Intrinsics.i(lProofDocumentProps, "lProofDocumentProps");
            this.f8467a = lProofDocumentProps;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddPhotoButtonClickedIntent)) {
                return false;
            }
            AddPhotoButtonClickedIntent addPhotoButtonClickedIntent = (AddPhotoButtonClickedIntent) obj;
            return Intrinsics.d(this.f8467a, addPhotoButtonClickedIntent.f8467a) && this.b == addPhotoButtonClickedIntent.b;
        }

        public final int hashCode() {
            return (this.f8467a.hashCode() * 31) + (this.b ? 1231 : 1237);
        }

        public final String toString() {
            return "AddPhotoButtonClickedIntent(lProofDocumentProps=" + this.f8467a + ", lIsFromGuidelinesBtn=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent$CancelProofUploadButtonClicked;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CancelProofUploadButtonClicked extends SuperPassProofOverviewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProofDocumentProps f8468a;

        public CancelProofUploadButtonClicked(ProofDocumentProps proofDocumentProps) {
            Intrinsics.i(proofDocumentProps, "proofDocumentProps");
            this.f8468a = proofDocumentProps;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CancelProofUploadButtonClicked) && Intrinsics.d(this.f8468a, ((CancelProofUploadButtonClicked) obj).f8468a);
        }

        public final int hashCode() {
            return this.f8468a.hashCode();
        }

        public final String toString() {
            return "CancelProofUploadButtonClicked(proofDocumentProps=" + this.f8468a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent$ConsentCheckboxToggledIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConsentCheckboxToggledIntent extends SuperPassProofOverviewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConsentCheckboxToggledIntent f8469a = new ConsentCheckboxToggledIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConsentCheckboxToggledIntent);
        }

        public final int hashCode() {
            return -609696825;
        }

        public final String toString() {
            return "ConsentCheckboxToggledIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent$DismissCameraRationaleDialogIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DismissCameraRationaleDialogIntent extends SuperPassProofOverviewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissCameraRationaleDialogIntent f8470a = new DismissCameraRationaleDialogIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissCameraRationaleDialogIntent);
        }

        public final int hashCode() {
            return -1004381180;
        }

        public final String toString() {
            return "DismissCameraRationaleDialogIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent$DismissEnlargeImageIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DismissEnlargeImageIntent extends SuperPassProofOverviewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissEnlargeImageIntent f8471a = new DismissEnlargeImageIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissEnlargeImageIntent);
        }

        public final int hashCode() {
            return -1342749961;
        }

        public final String toString() {
            return "DismissEnlargeImageIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent$DownloadFormClicked;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DownloadFormClicked extends SuperPassProofOverviewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProofDocumentProps f8472a;

        public DownloadFormClicked(ProofDocumentProps proofDocumentProps) {
            Intrinsics.i(proofDocumentProps, "proofDocumentProps");
            this.f8472a = proofDocumentProps;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DownloadFormClicked) && Intrinsics.d(this.f8472a, ((DownloadFormClicked) obj).f8472a);
        }

        public final int hashCode() {
            return this.f8472a.hashCode();
        }

        public final String toString() {
            return "DownloadFormClicked(proofDocumentProps=" + this.f8472a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent$EditPhotoButtonClicked;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EditPhotoButtonClicked extends SuperPassProofOverviewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProofDocumentProps f8473a;

        public EditPhotoButtonClicked(ProofDocumentProps proofDocumentProps) {
            Intrinsics.i(proofDocumentProps, "proofDocumentProps");
            this.f8473a = proofDocumentProps;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EditPhotoButtonClicked) && Intrinsics.d(this.f8473a, ((EditPhotoButtonClicked) obj).f8473a);
        }

        public final int hashCode() {
            return this.f8473a.hashCode();
        }

        public final String toString() {
            return "EditPhotoButtonClicked(proofDocumentProps=" + this.f8473a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent$EnlargeImageIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EnlargeImageIntent extends SuperPassProofOverviewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8474a;
        public final BitmapImage b;
        public final boolean c;

        public EnlargeImageIntent(String str, BitmapImage bitmapImage, boolean z) {
            this.f8474a = str;
            this.b = bitmapImage;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnlargeImageIntent)) {
                return false;
            }
            EnlargeImageIntent enlargeImageIntent = (EnlargeImageIntent) obj;
            return Intrinsics.d(this.f8474a, enlargeImageIntent.f8474a) && Intrinsics.d(this.b, enlargeImageIntent.b) && this.c == enlargeImageIntent.c;
        }

        public final int hashCode() {
            String str = this.f8474a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            BitmapImage bitmapImage = this.b;
            return ((iHashCode + (bitmapImage != null ? bitmapImage.hashCode() : 0)) * 31) + (this.c ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EnlargeImageIntent(url=");
            sb.append(this.f8474a);
            sb.append(", localImage=");
            sb.append(this.b);
            sb.append(", isRejectedProofImage=");
            return b3.g(")", sb, this.c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent$InitializationIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends SuperPassProofOverviewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SuperPassPurchaseArgs.UserProofsOverviewArgs f8475a;

        static {
            SuperPassPurchaseArgs.UserProofsOverviewArgs.Companion companion = SuperPassPurchaseArgs.UserProofsOverviewArgs.INSTANCE;
        }

        public InitializationIntent(SuperPassPurchaseArgs.UserProofsOverviewArgs args) {
            Intrinsics.i(args, "args");
            this.f8475a = args;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && Intrinsics.d(this.f8475a, ((InitializationIntent) obj).f8475a);
        }

        public final int hashCode() {
            return this.f8475a.hashCode();
        }

        public final String toString() {
            return "InitializationIntent(args=" + this.f8475a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent$NameEnteredIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NameEnteredIntent extends SuperPassProofOverviewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8476a;

        public NameEnteredIntent(String name) {
            Intrinsics.i(name, "name");
            this.f8476a = name;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NameEnteredIntent) && Intrinsics.d(this.f8476a, ((NameEnteredIntent) obj).f8476a);
        }

        public final int hashCode() {
            return this.f8476a.hashCode();
        }

        public final String toString() {
            return vo1.B("NameEnteredIntent(name=", this.f8476a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent$NextButtonClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NextButtonClickedIntent extends SuperPassProofOverviewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NextButtonClickedIntent f8477a = new NextButtonClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NextButtonClickedIntent);
        }

        public final int hashCode() {
            return -1002323418;
        }

        public final String toString() {
            return "NextButtonClickedIntent";
        }
    }
}
