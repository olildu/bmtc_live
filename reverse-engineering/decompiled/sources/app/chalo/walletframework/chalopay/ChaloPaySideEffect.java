package app.chalo.walletframework.chalopay;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect;", "", "NavigateToFullKycInfo", "NavigateToKYCFlow", "NavigateToBackendReclaimMoreInfo", "NavigateToLogin", "HandleErrorInformation", "NavigateToUserBlockedMoreInfo", "NavigateToAppReclaimInfo", "WalletStatusFetched", "Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect$HandleErrorInformation;", "Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect$NavigateToAppReclaimInfo;", "Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect$NavigateToBackendReclaimMoreInfo;", "Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect$NavigateToFullKycInfo;", "Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect$NavigateToKYCFlow;", "Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect$NavigateToLogin;", "Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect$NavigateToUserBlockedMoreInfo;", "Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect$WalletStatusFetched;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloPaySideEffect {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect$HandleErrorInformation;", "Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HandleErrorInformation extends ChaloPaySideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10901a;

        public HandleErrorInformation(String message) {
            Intrinsics.i(message, "message");
            this.f10901a = message;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleErrorInformation) && Intrinsics.d(this.f10901a, ((HandleErrorInformation) obj).f10901a);
        }

        public final int hashCode() {
            return this.f10901a.hashCode();
        }

        public final String toString() {
            return vo1.B("HandleErrorInformation(message=", this.f10901a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect$NavigateToAppReclaimInfo;", "Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToAppReclaimInfo extends ChaloPaySideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigateToAppReclaimInfo f10902a = new NavigateToAppReclaimInfo();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect$NavigateToBackendReclaimMoreInfo;", "Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToBackendReclaimMoreInfo extends ChaloPaySideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigateToBackendReclaimMoreInfo f10903a = new NavigateToBackendReclaimMoreInfo();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect$NavigateToFullKycInfo;", "Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToFullKycInfo extends ChaloPaySideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigateToFullKycInfo f10904a = new NavigateToFullKycInfo();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect$NavigateToKYCFlow;", "Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToKYCFlow extends ChaloPaySideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigateToKYCFlow f10905a = new NavigateToKYCFlow();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect$NavigateToLogin;", "Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToLogin extends ChaloPaySideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigateToLogin f10906a = new NavigateToLogin();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect$NavigateToUserBlockedMoreInfo;", "Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NavigateToUserBlockedMoreInfo extends ChaloPaySideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigateToUserBlockedMoreInfo f10907a = new NavigateToUserBlockedMoreInfo();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect$WalletStatusFetched;", "Lapp/chalo/walletframework/chalopay/ChaloPaySideEffect;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WalletStatusFetched extends ChaloPaySideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WalletStatusFetched f10908a = new WalletStatusFetched();
    }
}
