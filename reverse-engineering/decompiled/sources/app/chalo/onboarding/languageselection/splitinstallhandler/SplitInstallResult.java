package app.chalo.onboarding.languageselection.splitinstallhandler;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult;", "", "Installed", "Failed", "Unknown", "Canceled", "Canceling", "Downloaded", "Downloading", "Installing", "Pending", "RequiresUserConfirmation", "Error", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult$Canceled;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult$Canceling;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult$Downloaded;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult$Downloading;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult$Error;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult$Failed;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult$Installed;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult$Installing;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult$Pending;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult$RequiresUserConfirmation;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult$Unknown;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SplitInstallResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult$Canceled;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Canceled extends SplitInstallResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Canceled f6668a = new Canceled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Canceled);
        }

        public final int hashCode() {
            return -668644877;
        }

        public final String toString() {
            return "Canceled";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult$Canceling;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Canceling extends SplitInstallResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Canceling f6669a = new Canceling();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Canceling);
        }

        public final int hashCode() {
            return 746849550;
        }

        public final String toString() {
            return "Canceling";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult$Downloaded;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Downloaded extends SplitInstallResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Downloaded f6670a = new Downloaded();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Downloaded);
        }

        public final int hashCode() {
            return 1827383809;
        }

        public final String toString() {
            return "Downloaded";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult$Downloading;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Downloading extends SplitInstallResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Downloading f6671a = new Downloading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Downloading);
        }

        public final int hashCode() {
            return 814327488;
        }

        public final String toString() {
            return "Downloading";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult$Error;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends SplitInstallResult {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Error(exception=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult$Failed;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failed extends SplitInstallResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Failed f6672a = new Failed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public final int hashCode() {
            return 978905111;
        }

        public final String toString() {
            return "Failed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult$Installed;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Installed extends SplitInstallResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Installed f6673a = new Installed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Installed);
        }

        public final int hashCode() {
            return 299310432;
        }

        public final String toString() {
            return "Installed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult$Installing;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Installing extends SplitInstallResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Installing f6674a = new Installing();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Installing);
        }

        public final int hashCode() {
            return 688693057;
        }

        public final String toString() {
            return "Installing";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult$Pending;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Pending extends SplitInstallResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pending f6675a = new Pending();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Pending);
        }

        public final int hashCode() {
            return 685289725;
        }

        public final String toString() {
            return "Pending";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult$RequiresUserConfirmation;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RequiresUserConfirmation extends SplitInstallResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RequiresUserConfirmation f6676a = new RequiresUserConfirmation();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RequiresUserConfirmation);
        }

        public final int hashCode() {
            return -1709336376;
        }

        public final String toString() {
            return "RequiresUserConfirmation";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult$Unknown;", "Lapp/chalo/onboarding/languageselection/splitinstallhandler/SplitInstallResult;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends SplitInstallResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unknown f6677a = new Unknown();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public final int hashCode() {
            return 1083036592;
        }

        public final String toString() {
            return "Unknown";
        }
    }
}
