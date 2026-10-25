package app.chalo.juspay;

import defpackage.dd;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/juspay/JusPaySDKRequestAppModel;", "", "InitiateSDK", "GetUpiSessionToken", "OnBoardingAndPay", "UpiUiScanPay", "UpdateSessionToken", "AccountManagement", "Lapp/chalo/juspay/JusPaySDKRequestAppModel$AccountManagement;", "Lapp/chalo/juspay/JusPaySDKRequestAppModel$GetUpiSessionToken;", "Lapp/chalo/juspay/JusPaySDKRequestAppModel$InitiateSDK;", "Lapp/chalo/juspay/JusPaySDKRequestAppModel$OnBoardingAndPay;", "Lapp/chalo/juspay/JusPaySDKRequestAppModel$UpdateSessionToken;", "Lapp/chalo/juspay/JusPaySDKRequestAppModel$UpiUiScanPay;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class JusPaySDKRequestAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JusPayAction f4005a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JusPaySDKRequestAppModel$AccountManagement;", "Lapp/chalo/juspay/JusPaySDKRequestAppModel;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AccountManagement extends JusPaySDKRequestAppModel {
        public static final AccountManagement b = new AccountManagement(JusPayAction.Management);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AccountManagement);
        }

        public final int hashCode() {
            return 557176081;
        }

        public final String toString() {
            return "AccountManagement";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JusPaySDKRequestAppModel$GetUpiSessionToken;", "Lapp/chalo/juspay/JusPaySDKRequestAppModel;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GetUpiSessionToken extends JusPaySDKRequestAppModel {
        public static final GetUpiSessionToken b = new GetUpiSessionToken(JusPayAction.GetUpiSessionToken);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GetUpiSessionToken);
        }

        public final int hashCode() {
            return 151804026;
        }

        public final String toString() {
            return "GetUpiSessionToken";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JusPaySDKRequestAppModel$InitiateSDK;", "Lapp/chalo/juspay/JusPaySDKRequestAppModel;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitiateSDK extends JusPaySDKRequestAppModel {
        public final String b;
        public final JusPayEnvironment c;
        public final Boolean d;
        public final Boolean e;
        public final Boolean f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitiateSDK(JusPayEnvironment environment) {
            super(JusPayAction.Initiate);
            Boolean bool = Boolean.TRUE;
            Boolean bool2 = Boolean.FALSE;
            Intrinsics.i(environment, "environment");
            this.b = "BHIM";
            this.c = environment;
            this.d = bool;
            this.e = bool2;
            this.f = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitiateSDK)) {
                return false;
            }
            InitiateSDK initiateSDK = (InitiateSDK) obj;
            return Intrinsics.d(this.b, initiateSDK.b) && this.c == initiateSDK.c && Intrinsics.d(this.d, initiateSDK.d) && Intrinsics.d(this.e, initiateSDK.e) && Intrinsics.d(this.f, initiateSDK.f);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
            Boolean bool = this.d;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.e;
            int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.f;
            return iHashCode3 + (bool3 != null ? bool3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitiateSDK(issuingBank=");
            sb.append(this.b);
            sb.append(", environment=");
            sb.append(this.c);
            sb.append(", handleLoadingStateViaClient=");
            hq0.u(sb, this.d, ", getUserInteractionEvents=", this.e, ", shouldCreateCustomer=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JusPaySDKRequestAppModel$OnBoardingAndPay;", "Lapp/chalo/juspay/JusPaySDKRequestAppModel;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBoardingAndPay extends JusPaySDKRequestAppModel {
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnBoardingAndPay(String amount, String str, String chaloOrderId, String productType) {
            super(JusPayAction.OnBoardingAndPay);
            Intrinsics.i(amount, "amount");
            Intrinsics.i(chaloOrderId, "chaloOrderId");
            Intrinsics.i(productType, "productType");
            this.b = amount;
            this.c = str;
            this.d = chaloOrderId;
            this.e = productType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBoardingAndPay)) {
                return false;
            }
            OnBoardingAndPay onBoardingAndPay = (OnBoardingAndPay) obj;
            return Intrinsics.d(this.b, onBoardingAndPay.b) && Intrinsics.d(this.c, onBoardingAndPay.c) && Intrinsics.d(this.d, onBoardingAndPay.d) && Intrinsics.d(this.e, onBoardingAndPay.e);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            String str = this.c;
            return ((this.e.hashCode() + nf1.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31) + 1237;
        }

        public final String toString() {
            return r30.i(dd.e("OnBoardingAndPay(amount=", this.b, ", userAccountReferenceNumber=", this.c, ", chaloOrderId="), this.d, ", productType=", this.e, ", handleTransactionStatusScreenViaSDK=false)");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JusPaySDKRequestAppModel$UpdateSessionToken;", "Lapp/chalo/juspay/JusPaySDKRequestAppModel;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateSessionToken extends JusPaySDKRequestAppModel {
        public static final UpdateSessionToken b = new UpdateSessionToken(JusPayAction.UpdateAuth);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UpdateSessionToken);
        }

        public final int hashCode() {
            return 719940043;
        }

        public final String toString() {
            return "UpdateSessionToken";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JusPaySDKRequestAppModel$UpiUiScanPay;", "Lapp/chalo/juspay/JusPaySDKRequestAppModel;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpiUiScanPay extends JusPaySDKRequestAppModel {
        public final String b;
        public final Boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpiUiScanPay() {
            super(JusPayAction.UpiUiScanPay);
            Boolean bool = Boolean.TRUE;
            this.b = "cameraqr";
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpiUiScanPay)) {
                return false;
            }
            UpiUiScanPay upiUiScanPay = (UpiUiScanPay) obj;
            return Intrinsics.d(this.b, upiUiScanPay.b) && Intrinsics.d(this.c, upiUiScanPay.c);
        }

        public final int hashCode() {
            String str = this.b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.c;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            return "UpiUiScanPay(urlData=null, entryType=" + this.b + ", handleTransactionStatusScreenViaSDK=" + this.c + ")";
        }
    }

    public JusPaySDKRequestAppModel(JusPayAction jusPayAction) {
        this.f4005a = jusPayAction;
    }
}
