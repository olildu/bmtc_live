package app.chalo.juspay;

import in.juspay.hyper.constants.Labels;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lapp/chalo/juspay/JusPayAction;", "", "actionName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getActionName", "()Ljava/lang/String;", "Initiate", "GetUpiSessionToken", "OnBoardingAndPay", "UpdateAuth", "Management", "Unknown", "UpiUiScanPay", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum JusPayAction {
    Initiate(Labels.HyperSdk.INITIATE),
    GetUpiSessionToken("upiGetSessionToken"),
    OnBoardingAndPay("onboardingAndPay"),
    UpdateAuth("updateAuth"),
    Management("management"),
    Unknown("unknown"),
    UpiUiScanPay("upiUiScanPay");

    private final String actionName;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JusPayAction$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Code duplicated, block: B:10:0x001c  */
        /* JADX WARN: Code duplicated, block: B:12:0x001f A[RETURN] */
        public static JusPayAction a(String str) {
            for (JusPayAction jusPayAction : JusPayAction.values()) {
                if (StringsKt.x(jusPayAction.getActionName(), str, true)) {
                    if (jusPayAction == null) {
                        return JusPayAction.Unknown;
                    }
                    return jusPayAction;
                }
            }
            jusPayAction = null;
            if (jusPayAction == null) {
                return JusPayAction.Unknown;
            }
            return jusPayAction;
        }
    }

    JusPayAction(String str) {
        this.actionName = str;
    }

    public static EnumEntries<JusPayAction> getEntries() {
        return $ENTRIES;
    }

    public final String getActionName() {
        return this.actionName;
    }
}
