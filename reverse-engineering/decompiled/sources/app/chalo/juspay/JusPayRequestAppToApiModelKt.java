package app.chalo.juspay;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JusPayRequestAppToApiModelKt {
    public static final JusPaySDKRequestApiModel a(JusPaySDKRequestAppModel jusPaySDKRequestAppModel, String requestId, String signature, String signaturePayload, String merchantKeyId, String clientId) {
        JusPayRequestPayload upiUiScanPay;
        Intrinsics.i(jusPaySDKRequestAppModel, "<this>");
        JusPayAction jusPayAction = jusPaySDKRequestAppModel.f4005a;
        Intrinsics.i(requestId, "requestId");
        Intrinsics.i(signature, "signature");
        Intrinsics.i(signaturePayload, "signaturePayload");
        Intrinsics.i(merchantKeyId, "merchantKeyId");
        Intrinsics.i(clientId, "clientId");
        if (jusPaySDKRequestAppModel instanceof JusPaySDKRequestAppModel.InitiateSDK) {
            JusPaySDKRequestAppModel.InitiateSDK initiateSDK = (JusPaySDKRequestAppModel.InitiateSDK) jusPaySDKRequestAppModel;
            upiUiScanPay = new JusPayRequestPayload.InitiateSDK(signature, signaturePayload, jusPayAction.getActionName(), merchantKeyId, initiateSDK.b, clientId, initiateSDK.d, initiateSDK.c.getEnvName(), Intrinsics.d(initiateSDK.e, Boolean.TRUE) ? 1 : null, initiateSDK.f);
        } else if (jusPaySDKRequestAppModel instanceof JusPaySDKRequestAppModel.GetUpiSessionToken) {
            upiUiScanPay = new JusPayRequestPayload.GetUpiSessionToken(merchantKeyId, signature, signaturePayload, jusPayAction.getActionName());
        } else if (jusPaySDKRequestAppModel instanceof JusPaySDKRequestAppModel.OnBoardingAndPay) {
            upiUiScanPay = new JusPayRequestPayload.OnBoardingAndPay(signature, signaturePayload, jusPayAction.getActionName(), merchantKeyId, ((JusPaySDKRequestAppModel.OnBoardingAndPay) jusPaySDKRequestAppModel).c, Boolean.FALSE);
        } else if (jusPaySDKRequestAppModel instanceof JusPaySDKRequestAppModel.UpdateSessionToken) {
            upiUiScanPay = new JusPayRequestPayload.UpdateSessionToken(merchantKeyId, signature, signaturePayload, jusPayAction.getActionName());
        } else if (jusPaySDKRequestAppModel.equals(JusPaySDKRequestAppModel.AccountManagement.b)) {
            upiUiScanPay = new JusPayRequestPayload.Management(merchantKeyId, signature, signaturePayload, jusPayAction.getActionName());
        } else {
            if (!(jusPaySDKRequestAppModel instanceof JusPaySDKRequestAppModel.UpiUiScanPay)) {
                throw new NoWhenBranchMatchedException();
            }
            JusPaySDKRequestAppModel.UpiUiScanPay upiUiScanPay2 = (JusPaySDKRequestAppModel.UpiUiScanPay) jusPaySDKRequestAppModel;
            upiUiScanPay = new JusPayRequestPayload.UpiUiScanPay(merchantKeyId, signature, signaturePayload, jusPayAction.getActionName(), upiUiScanPay2.b, upiUiScanPay2.c);
        }
        return new JusPaySDKRequestApiModel(requestId, upiUiScanPay);
    }
}
