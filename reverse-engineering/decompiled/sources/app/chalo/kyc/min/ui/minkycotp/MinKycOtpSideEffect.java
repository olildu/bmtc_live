package app.chalo.kyc.min.ui.minkycotp;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpSideEffect;", "", "BringFocusOnOtpField", "ClearFocus", "HandleKeyboardVisibility", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpSideEffect$BringFocusOnOtpField;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpSideEffect$ClearFocus;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpSideEffect$HandleKeyboardVisibility;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MinKycOtpSideEffect {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpSideEffect$BringFocusOnOtpField;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpSideEffect;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BringFocusOnOtpField extends MinKycOtpSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BringFocusOnOtpField f4156a = new BringFocusOnOtpField();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpSideEffect$ClearFocus;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpSideEffect;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ClearFocus extends MinKycOtpSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ClearFocus f4157a = new ClearFocus();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpSideEffect$HandleKeyboardVisibility;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpSideEffect;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HandleKeyboardVisibility extends MinKycOtpSideEffect {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HandleKeyboardVisibility);
        }

        public final int hashCode() {
            return 1237;
        }

        public final String toString() {
            return "HandleKeyboardVisibility(show=false)";
        }
    }
}
