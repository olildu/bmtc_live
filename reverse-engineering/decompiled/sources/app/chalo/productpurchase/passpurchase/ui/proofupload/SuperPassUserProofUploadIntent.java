package app.chalo.productpurchase.passpurchase.ui.proofupload;

import app.chalo.scenes.args.SuperPassPurchaseArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadIntent;", "", "InitializationIntent", "NextBtnClickedIntent", "WatchTutorialClickedIntent", "ZoomPlaceholderImageIntent", "DismissCameraRationaleDialogIntent", "DismissZoomedImageIntent", "Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadIntent$DismissCameraRationaleDialogIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadIntent$DismissZoomedImageIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadIntent$InitializationIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadIntent$NextBtnClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadIntent$WatchTutorialClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadIntent$ZoomPlaceholderImageIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SuperPassUserProofUploadIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadIntent$DismissCameraRationaleDialogIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DismissCameraRationaleDialogIntent extends SuperPassUserProofUploadIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissCameraRationaleDialogIntent f8502a = new DismissCameraRationaleDialogIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissCameraRationaleDialogIntent);
        }

        public final int hashCode() {
            return 699136175;
        }

        public final String toString() {
            return "DismissCameraRationaleDialogIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadIntent$DismissZoomedImageIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DismissZoomedImageIntent extends SuperPassUserProofUploadIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissZoomedImageIntent f8503a = new DismissZoomedImageIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissZoomedImageIntent);
        }

        public final int hashCode() {
            return 360037950;
        }

        public final String toString() {
            return "DismissZoomedImageIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadIntent$InitializationIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends SuperPassUserProofUploadIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SuperPassPurchaseArgs.ProofUploadInternalArgs f8504a;

        static {
            SuperPassPurchaseArgs.ProofUploadInternalArgs.Companion companion = SuperPassPurchaseArgs.ProofUploadInternalArgs.INSTANCE;
        }

        public InitializationIntent(SuperPassPurchaseArgs.ProofUploadInternalArgs args) {
            Intrinsics.i(args, "args");
            this.f8504a = args;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && Intrinsics.d(this.f8504a, ((InitializationIntent) obj).f8504a);
        }

        public final int hashCode() {
            return this.f8504a.c.hashCode();
        }

        public final String toString() {
            return "InitializationIntent(args=" + this.f8504a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadIntent$NextBtnClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NextBtnClickedIntent extends SuperPassUserProofUploadIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NextBtnClickedIntent f8505a = new NextBtnClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NextBtnClickedIntent);
        }

        public final int hashCode() {
            return 312493597;
        }

        public final String toString() {
            return "NextBtnClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadIntent$WatchTutorialClickedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WatchTutorialClickedIntent extends SuperPassUserProofUploadIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WatchTutorialClickedIntent f8506a = new WatchTutorialClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof WatchTutorialClickedIntent);
        }

        public final int hashCode() {
            return 319201145;
        }

        public final String toString() {
            return "WatchTutorialClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadIntent$ZoomPlaceholderImageIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ZoomPlaceholderImageIntent extends SuperPassUserProofUploadIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ZoomPlaceholderImageIntent f8507a = new ZoomPlaceholderImageIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ZoomPlaceholderImageIntent);
        }

        public final int hashCode() {
            return 1684098618;
        }

        public final String toString() {
            return "ZoomPlaceholderImageIntent";
        }
    }
}
