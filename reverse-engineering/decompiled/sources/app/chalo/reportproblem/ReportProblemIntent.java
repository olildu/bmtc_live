package app.chalo.reportproblem;

import app.chalo.features.network.NetworkConnectionType;
import app.chalo.features.reportproblem.ReportProblemFeatureProblem;
import app.chalo.scenes.args.ReportProblemArgs;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lapp/chalo/reportproblem/ReportProblemIntent;", "", "InitFreshChat", "ProblemItemClicked", "ReclaimRequestDialogPositiveBtnClicked", "ReclaimRequestDialogNegativeBtnClicked", "ReclaimResponseDialogPositiveBtnClickedWithAutoLink", "ReclaimResponseDialogPositiveBtnClickedWithoutAutoLink", "ReclaimResponseDialogNegativeBtnClicked", "ContactSupportClicked", "OnBackPressed", "InternetConnectionIntent", "Lapp/chalo/reportproblem/ReportProblemIntent$ContactSupportClicked;", "Lapp/chalo/reportproblem/ReportProblemIntent$InitFreshChat;", "Lapp/chalo/reportproblem/ReportProblemIntent$InternetConnectionIntent;", "Lapp/chalo/reportproblem/ReportProblemIntent$OnBackPressed;", "Lapp/chalo/reportproblem/ReportProblemIntent$ProblemItemClicked;", "Lapp/chalo/reportproblem/ReportProblemIntent$ReclaimRequestDialogNegativeBtnClicked;", "Lapp/chalo/reportproblem/ReportProblemIntent$ReclaimRequestDialogPositiveBtnClicked;", "Lapp/chalo/reportproblem/ReportProblemIntent$ReclaimResponseDialogNegativeBtnClicked;", "Lapp/chalo/reportproblem/ReportProblemIntent$ReclaimResponseDialogPositiveBtnClickedWithAutoLink;", "Lapp/chalo/reportproblem/ReportProblemIntent$ReclaimResponseDialogPositiveBtnClickedWithoutAutoLink;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ReportProblemIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/reportproblem/ReportProblemIntent$ContactSupportClicked;", "Lapp/chalo/reportproblem/ReportProblemIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContactSupportClicked extends ReportProblemIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9019a;

        public ContactSupportClicked(String contact) {
            Intrinsics.i(contact, "contact");
            this.f9019a = contact;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContactSupportClicked) && Intrinsics.d(this.f9019a, ((ContactSupportClicked) obj).f9019a);
        }

        public final int hashCode() {
            return this.f9019a.hashCode();
        }

        public final String toString() {
            return vo1.B("ContactSupportClicked(contact=", this.f9019a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/reportproblem/ReportProblemIntent$InitFreshChat;", "Lapp/chalo/reportproblem/ReportProblemIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitFreshChat extends ReportProblemIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReportProblemArgs f9020a;

        static {
            ReportProblemArgs.Companion companion = ReportProblemArgs.INSTANCE;
        }

        public InitFreshChat(ReportProblemArgs reportProblemArgs) {
            this.f9020a = reportProblemArgs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitFreshChat) && Intrinsics.d(this.f9020a, ((InitFreshChat) obj).f9020a);
        }

        public final int hashCode() {
            return this.f9020a.hashCode();
        }

        public final String toString() {
            return "InitFreshChat(args=" + this.f9020a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/reportproblem/ReportProblemIntent$InternetConnectionIntent;", "Lapp/chalo/reportproblem/ReportProblemIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InternetConnectionIntent extends ReportProblemIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NetworkConnectionType f9021a;

        public InternetConnectionIntent(NetworkConnectionType currentNetworkConnectionType) {
            Intrinsics.i(currentNetworkConnectionType, "currentNetworkConnectionType");
            this.f9021a = currentNetworkConnectionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InternetConnectionIntent) && this.f9021a == ((InternetConnectionIntent) obj).f9021a;
        }

        public final int hashCode() {
            return this.f9021a.hashCode();
        }

        public final String toString() {
            return "InternetConnectionIntent(currentNetworkConnectionType=" + this.f9021a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/reportproblem/ReportProblemIntent$OnBackPressed;", "Lapp/chalo/reportproblem/ReportProblemIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBackPressed extends ReportProblemIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBackPressed f9022a = new OnBackPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnBackPressed);
        }

        public final int hashCode() {
            return -37649898;
        }

        public final String toString() {
            return "OnBackPressed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/reportproblem/ReportProblemIntent$ProblemItemClicked;", "Lapp/chalo/reportproblem/ReportProblemIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProblemItemClicked extends ReportProblemIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReportProblemFeatureProblem f9023a;

        static {
            ReportProblemFeatureProblem.Companion companion = ReportProblemFeatureProblem.INSTANCE;
        }

        public ProblemItemClicked(ReportProblemFeatureProblem reportProblemFeatureProblem) {
            this.f9023a = reportProblemFeatureProblem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProblemItemClicked) && Intrinsics.d(this.f9023a, ((ProblemItemClicked) obj).f9023a);
        }

        public final int hashCode() {
            return this.f9023a.hashCode();
        }

        public final String toString() {
            return "ProblemItemClicked(problem=" + this.f9023a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/reportproblem/ReportProblemIntent$ReclaimRequestDialogNegativeBtnClicked;", "Lapp/chalo/reportproblem/ReportProblemIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReclaimRequestDialogNegativeBtnClicked extends ReportProblemIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReclaimRequestDialogNegativeBtnClicked f9024a = new ReclaimRequestDialogNegativeBtnClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReclaimRequestDialogNegativeBtnClicked);
        }

        public final int hashCode() {
            return -849144012;
        }

        public final String toString() {
            return "ReclaimRequestDialogNegativeBtnClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/reportproblem/ReportProblemIntent$ReclaimRequestDialogPositiveBtnClicked;", "Lapp/chalo/reportproblem/ReportProblemIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReclaimRequestDialogPositiveBtnClicked extends ReportProblemIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReclaimRequestDialogPositiveBtnClicked f9025a = new ReclaimRequestDialogPositiveBtnClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReclaimRequestDialogPositiveBtnClicked);
        }

        public final int hashCode() {
            return -556056584;
        }

        public final String toString() {
            return "ReclaimRequestDialogPositiveBtnClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/reportproblem/ReportProblemIntent$ReclaimResponseDialogNegativeBtnClicked;", "Lapp/chalo/reportproblem/ReportProblemIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReclaimResponseDialogNegativeBtnClicked extends ReportProblemIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReclaimResponseDialogNegativeBtnClicked f9026a = new ReclaimResponseDialogNegativeBtnClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReclaimResponseDialogNegativeBtnClicked);
        }

        public final int hashCode() {
            return 981719756;
        }

        public final String toString() {
            return "ReclaimResponseDialogNegativeBtnClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/reportproblem/ReportProblemIntent$ReclaimResponseDialogPositiveBtnClickedWithAutoLink;", "Lapp/chalo/reportproblem/ReportProblemIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReclaimResponseDialogPositiveBtnClickedWithAutoLink extends ReportProblemIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReclaimResponseDialogPositiveBtnClickedWithAutoLink f9027a = new ReclaimResponseDialogPositiveBtnClickedWithAutoLink();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReclaimResponseDialogPositiveBtnClickedWithAutoLink);
        }

        public final int hashCode() {
            return -627310369;
        }

        public final String toString() {
            return "ReclaimResponseDialogPositiveBtnClickedWithAutoLink";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/reportproblem/ReportProblemIntent$ReclaimResponseDialogPositiveBtnClickedWithoutAutoLink;", "Lapp/chalo/reportproblem/ReportProblemIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReclaimResponseDialogPositiveBtnClickedWithoutAutoLink extends ReportProblemIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReclaimResponseDialogPositiveBtnClickedWithoutAutoLink f9028a = new ReclaimResponseDialogPositiveBtnClickedWithoutAutoLink();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReclaimResponseDialogPositiveBtnClickedWithoutAutoLink);
        }

        public final int hashCode() {
            return 1922158977;
        }

        public final String toString() {
            return "ReclaimResponseDialogPositiveBtnClickedWithoutAutoLink";
        }
    }
}
