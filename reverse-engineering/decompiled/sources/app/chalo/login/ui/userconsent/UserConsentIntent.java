package app.chalo.login.ui.userconsent;

import app.chalo.userconsent.UserConsentFlowType;
import defpackage.cb0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lapp/chalo/login/ui/userconsent/UserConsentIntent;", "", "InitializationIntent", "RetryFetchIntent", "AcceptConsentIntent", "DenyConsentIntent", "SkipConsentIntent", "BackClickedIntent", "DismissConsentRequiredDialog", "WebViewPageLoadIntent", "WebViewErrorReceivedIntent", "Lapp/chalo/login/ui/userconsent/UserConsentIntent$AcceptConsentIntent;", "Lapp/chalo/login/ui/userconsent/UserConsentIntent$BackClickedIntent;", "Lapp/chalo/login/ui/userconsent/UserConsentIntent$DenyConsentIntent;", "Lapp/chalo/login/ui/userconsent/UserConsentIntent$DismissConsentRequiredDialog;", "Lapp/chalo/login/ui/userconsent/UserConsentIntent$InitializationIntent;", "Lapp/chalo/login/ui/userconsent/UserConsentIntent$RetryFetchIntent;", "Lapp/chalo/login/ui/userconsent/UserConsentIntent$SkipConsentIntent;", "Lapp/chalo/login/ui/userconsent/UserConsentIntent$WebViewErrorReceivedIntent;", "Lapp/chalo/login/ui/userconsent/UserConsentIntent$WebViewPageLoadIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UserConsentIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/userconsent/UserConsentIntent$AcceptConsentIntent;", "Lapp/chalo/login/ui/userconsent/UserConsentIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AcceptConsentIntent extends UserConsentIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AcceptConsentIntent f5350a = new AcceptConsentIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/userconsent/UserConsentIntent$BackClickedIntent;", "Lapp/chalo/login/ui/userconsent/UserConsentIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BackClickedIntent extends UserConsentIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackClickedIntent f5351a = new BackClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/userconsent/UserConsentIntent$DenyConsentIntent;", "Lapp/chalo/login/ui/userconsent/UserConsentIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DenyConsentIntent extends UserConsentIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DenyConsentIntent f5352a = new DenyConsentIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/userconsent/UserConsentIntent$DismissConsentRequiredDialog;", "Lapp/chalo/login/ui/userconsent/UserConsentIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DismissConsentRequiredDialog extends UserConsentIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissConsentRequiredDialog f5353a = new DismissConsentRequiredDialog();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/userconsent/UserConsentIntent$InitializationIntent;", "Lapp/chalo/login/ui/userconsent/UserConsentIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends UserConsentIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserConsentFlowType f5354a;

        static {
            UserConsentFlowType.Companion companion = UserConsentFlowType.INSTANCE;
        }

        public InitializationIntent(UserConsentFlowType flowType) {
            Intrinsics.i(flowType, "flowType");
            this.f5354a = flowType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && Intrinsics.d(this.f5354a, ((InitializationIntent) obj).f5354a);
        }

        public final int hashCode() {
            return this.f5354a.hashCode();
        }

        public final String toString() {
            return "InitializationIntent(flowType=" + this.f5354a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/userconsent/UserConsentIntent$RetryFetchIntent;", "Lapp/chalo/login/ui/userconsent/UserConsentIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RetryFetchIntent extends UserConsentIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RetryFetchIntent f5355a = new RetryFetchIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/userconsent/UserConsentIntent$SkipConsentIntent;", "Lapp/chalo/login/ui/userconsent/UserConsentIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SkipConsentIntent extends UserConsentIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SkipConsentIntent f5356a = new SkipConsentIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/userconsent/UserConsentIntent$WebViewErrorReceivedIntent;", "Lapp/chalo/login/ui/userconsent/UserConsentIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WebViewErrorReceivedIntent extends UserConsentIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WebViewErrorReceivedIntent f5357a = new WebViewErrorReceivedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/userconsent/UserConsentIntent$WebViewPageLoadIntent;", "Lapp/chalo/login/ui/userconsent/UserConsentIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WebViewPageLoadIntent extends UserConsentIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f5358a;

        public WebViewPageLoadIntent(boolean z) {
            this.f5358a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WebViewPageLoadIntent) && this.f5358a == ((WebViewPageLoadIntent) obj).f5358a;
        }

        public final int hashCode() {
            return this.f5358a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("WebViewPageLoadIntent(showLoading=", ")", this.f5358a);
        }
    }
}
