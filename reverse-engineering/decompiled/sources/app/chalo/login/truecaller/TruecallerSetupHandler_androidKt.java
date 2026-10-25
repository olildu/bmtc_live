package app.chalo.login.truecaller;

import com.truecaller.android.sdk.TrueError;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"Landroid/content/Intent;", "TruecallerData", "login_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TruecallerSetupHandler_androidKt {
    public static final TruecallerError a(TrueError trueError) {
        switch (trueError.getErrorType()) {
            case 0:
                return TruecallerError.INTERNAL;
            case 1:
                return TruecallerError.NETWORK;
            case 2:
                return TruecallerError.USER_DENIED;
            case 3:
                return TruecallerError.PROFILE_NOT_FOUND;
            case 4:
                return TruecallerError.UNAUTHORIZED_USER;
            case 5:
                return TruecallerError.TRUECALLER_CLOSED_UNEXPECTEDLY;
            case 6:
                return TruecallerError.TRUESDK_TOO_OLD;
            case 7:
                return TruecallerError.POSSIBLE_REQ_CODE_COLLISION;
            case 8:
                return TruecallerError.RESPONSE_SIGNATURE_MISMATCH;
            case 9:
                return TruecallerError.REQUEST_NONCE_MISMATCH;
            case 10:
                return TruecallerError.INVALID_ACCOUNT_STATE;
            case 11:
                return TruecallerError.TC_NOT_INSTALLED;
            case 12:
                return TruecallerError.PARTNER_INFO_NULL;
            case 13:
                return TruecallerError.USER_DENIED_WHILE_LOADING;
            case 14:
                return TruecallerError.CONTINUE_WITH_DIFFERENT_NUMBER;
            case 15:
                return TruecallerError.ACTIVITY_NOT_FOUND;
            case 16:
                return TruecallerError.DEVICE_NOT_SUPPORTED;
            default:
                return TruecallerError.UNKNOWN;
        }
    }
}
