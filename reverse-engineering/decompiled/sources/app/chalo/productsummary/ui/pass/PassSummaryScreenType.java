package app.chalo.productsummary.ui.pass;

import app.chalo.productsummary.ui.data.FullScreenImageUIState;
import app.chalo.uistate.dialog.LoadingDialogUIState;
import app.chalo.uistate.error.StandardErrorScreenUIState;
import com.inmobi.unification.sdk.InitializationStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/productsummary/ui/pass/PassSummaryScreenType;", "", InitializationStatus.SUCCESS, "Error", "Loading", "Lapp/chalo/productsummary/ui/pass/PassSummaryScreenType$Error;", "Lapp/chalo/productsummary/ui/pass/PassSummaryScreenType$Loading;", "Lapp/chalo/productsummary/ui/pass/PassSummaryScreenType$Success;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PassSummaryScreenType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/pass/PassSummaryScreenType$Error;", "Lapp/chalo/productsummary/ui/pass/PassSummaryScreenType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends PassSummaryScreenType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StandardErrorScreenUIState.ErrorWithMsgAndRetry f8777a;

        public Error(StandardErrorScreenUIState.ErrorWithMsgAndRetry errorWithMsgAndRetry) {
            this.f8777a = errorWithMsgAndRetry;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.d(this.f8777a, ((Error) obj).f8777a);
        }

        public final int hashCode() {
            return this.f8777a.hashCode();
        }

        public final String toString() {
            return "Error(errorUIState=" + this.f8777a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/pass/PassSummaryScreenType$Loading;", "Lapp/chalo/productsummary/ui/pass/PassSummaryScreenType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loading extends PassSummaryScreenType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoadingDialogUIState f8778a;

        public Loading(LoadingDialogUIState loadingDialogUIState) {
            this.f8778a = loadingDialogUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.d(this.f8778a, ((Loading) obj).f8778a);
        }

        public final int hashCode() {
            return this.f8778a.hashCode();
        }

        public final String toString() {
            return "Loading(loadingDialogUIState=" + this.f8778a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/pass/PassSummaryScreenType$Success;", "Lapp/chalo/productsummary/ui/pass/PassSummaryScreenType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends PassSummaryScreenType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PassSummarySuccessScreenUIState f8779a;
        public final FullScreenImageUIState b;

        public Success(PassSummarySuccessScreenUIState passSummarySuccessScreenUIState, FullScreenImageUIState fullScreenImageUIState) {
            Intrinsics.i(passSummarySuccessScreenUIState, "passSummarySuccessScreenUIState");
            this.f8779a = passSummarySuccessScreenUIState;
            this.b = fullScreenImageUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.d(this.f8779a, success.f8779a) && Intrinsics.d(this.b, success.b);
        }

        public final int hashCode() {
            int iHashCode = this.f8779a.hashCode() * 31;
            FullScreenImageUIState fullScreenImageUIState = this.b;
            return iHashCode + (fullScreenImageUIState == null ? 0 : fullScreenImageUIState.hashCode());
        }

        public final String toString() {
            return "Success(passSummarySuccessScreenUIState=" + this.f8779a + ", fullScreenImageUIState=" + this.b + ")";
        }
    }
}
