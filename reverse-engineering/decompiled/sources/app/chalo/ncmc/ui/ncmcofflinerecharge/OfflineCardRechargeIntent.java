package app.chalo.ncmc.ui.ncmcofflinerecharge;

import app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel;
import defpackage.cb0;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent;", "", "InitialIntent", "RechargeAmountEntered", "OnRechargeClicked", "OnAddMoneyClicked", "OnSnackbarDismissed", "TncDialogueAccepted", "TncDialogueCancelled", "OfflineRechargeSuccessfulPositiveBtnClicked", "OfflineRechargeSuccessfulNegativeBtnClicked", "NavigateToHome", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent$InitialIntent;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent$NavigateToHome;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent$OfflineRechargeSuccessfulNegativeBtnClicked;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent$OfflineRechargeSuccessfulPositiveBtnClicked;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent$OnAddMoneyClicked;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent$OnRechargeClicked;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent$OnSnackbarDismissed;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent$RechargeAmountEntered;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent$TncDialogueAccepted;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent$TncDialogueCancelled;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class OfflineCardRechargeIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent$InitialIntent;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialIntent extends OfflineCardRechargeIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NcmcCardRechargeConfigAppModel f6387a;
        public final String b;
        public final String c;
        public final Long d;
        public final Long e;
        public final Long f;

        public InitialIntent(NcmcCardRechargeConfigAppModel rechargeConfig, Long l, Long l2, Long l3, String cardNumber, String kitNumber) {
            Intrinsics.i(rechargeConfig, "rechargeConfig");
            Intrinsics.i(cardNumber, "cardNumber");
            Intrinsics.i(kitNumber, "kitNumber");
            this.f6387a = rechargeConfig;
            this.b = cardNumber;
            this.c = kitNumber;
            this.d = l;
            this.e = l2;
            this.f = l3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitialIntent)) {
                return false;
            }
            InitialIntent initialIntent = (InitialIntent) obj;
            return Intrinsics.d(this.f6387a, initialIntent.f6387a) && Intrinsics.d(this.b, initialIntent.b) && Intrinsics.d(this.c, initialIntent.c) && Intrinsics.d(this.d, initialIntent.d) && Intrinsics.d(this.e, initialIntent.e) && Intrinsics.d(this.f, initialIntent.f);
        }

        public final int hashCode() {
            int iE = nf1.e(nf1.e(this.f6387a.hashCode() * 31, 31, this.b), 31, this.c);
            Long l = this.d;
            int iHashCode = (iE + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.e;
            int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.f;
            return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitialIntent(rechargeConfig=");
            sb.append(this.f6387a);
            sb.append(", cardNumber=");
            sb.append(this.b);
            sb.append(", kitNumber=");
            cb0.r(this.d, this.c, ", onlineBalance=", ", minRechargeAmount=", sb);
            sb.append(this.e);
            sb.append(", maxRechargeAmount=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent$NavigateToHome;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigateToHome extends OfflineCardRechargeIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigateToHome f6388a = new NavigateToHome();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigateToHome);
        }

        public final int hashCode() {
            return 1239753445;
        }

        public final String toString() {
            return "NavigateToHome";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent$OfflineRechargeSuccessfulNegativeBtnClicked;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OfflineRechargeSuccessfulNegativeBtnClicked extends OfflineCardRechargeIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OfflineRechargeSuccessfulNegativeBtnClicked f6389a = new OfflineRechargeSuccessfulNegativeBtnClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OfflineRechargeSuccessfulNegativeBtnClicked);
        }

        public final int hashCode() {
            return -1417069206;
        }

        public final String toString() {
            return "OfflineRechargeSuccessfulNegativeBtnClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent$OfflineRechargeSuccessfulPositiveBtnClicked;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OfflineRechargeSuccessfulPositiveBtnClicked extends OfflineCardRechargeIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OfflineRechargeSuccessfulPositiveBtnClicked f6390a = new OfflineRechargeSuccessfulPositiveBtnClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OfflineRechargeSuccessfulPositiveBtnClicked);
        }

        public final int hashCode() {
            return -1123981778;
        }

        public final String toString() {
            return "OfflineRechargeSuccessfulPositiveBtnClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent$OnAddMoneyClicked;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnAddMoneyClicked extends OfflineCardRechargeIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnAddMoneyClicked f6391a = new OnAddMoneyClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnAddMoneyClicked);
        }

        public final int hashCode() {
            return 593308751;
        }

        public final String toString() {
            return "OnAddMoneyClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent$OnRechargeClicked;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnRechargeClicked extends OfflineCardRechargeIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnRechargeClicked f6392a = new OnRechargeClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnRechargeClicked);
        }

        public final int hashCode() {
            return -1784952505;
        }

        public final String toString() {
            return "OnRechargeClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent$OnSnackbarDismissed;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnSnackbarDismissed extends OfflineCardRechargeIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnSnackbarDismissed f6393a = new OnSnackbarDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnSnackbarDismissed);
        }

        public final int hashCode() {
            return -24505045;
        }

        public final String toString() {
            return "OnSnackbarDismissed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent$RechargeAmountEntered;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RechargeAmountEntered extends OfflineCardRechargeIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6394a;

        public RechargeAmountEntered(String amount) {
            Intrinsics.i(amount, "amount");
            this.f6394a = amount;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RechargeAmountEntered) && Intrinsics.d(this.f6394a, ((RechargeAmountEntered) obj).f6394a);
        }

        public final int hashCode() {
            return this.f6394a.hashCode();
        }

        public final String toString() {
            return vo1.B("RechargeAmountEntered(amount=", this.f6394a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent$TncDialogueAccepted;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TncDialogueAccepted extends OfflineCardRechargeIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TncDialogueAccepted f6395a = new TncDialogueAccepted();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TncDialogueAccepted);
        }

        public final int hashCode() {
            return 1164153102;
        }

        public final String toString() {
            return "TncDialogueAccepted";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent$TncDialogueCancelled;", "Lapp/chalo/ncmc/ui/ncmcofflinerecharge/OfflineCardRechargeIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TncDialogueCancelled extends OfflineCardRechargeIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TncDialogueCancelled f6396a = new TncDialogueCancelled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TncDialogueCancelled);
        }

        public final int hashCode() {
            return 28402890;
        }

        public final String toString() {
            return "TncDialogueCancelled";
        }
    }
}
