package app.chalo.ncmc.ui.ncmconlinerecharge;

import app.chalo.constants.Source;
import app.chalo.ncmc.data.NcmcCardRechargeConfigAppModel;
import defpackage.d;
import defpackage.dd;
import defpackage.nf1;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent;", "", "ViewCreated", "AmountEnteredIntentOnlineRecharge", "NextBtnClickIntentOnline", "OnlineRechargeSuccessful", "TransferToOffline", "TncDialogueAccepted", "TncDialogueCancelled", "RechargeSuccessBottomSheetCancelCtaClicked", "RechargeSuccessBottomSheetDismissed", "Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent$AmountEnteredIntentOnlineRecharge;", "Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent$NextBtnClickIntentOnline;", "Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent$OnlineRechargeSuccessful;", "Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent$RechargeSuccessBottomSheetCancelCtaClicked;", "Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent$RechargeSuccessBottomSheetDismissed;", "Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent$TncDialogueAccepted;", "Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent$TncDialogueCancelled;", "Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent$TransferToOffline;", "Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent$ViewCreated;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NCMCOnlineRechargeIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent$AmountEnteredIntentOnlineRecharge;", "Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AmountEnteredIntentOnlineRecharge extends NCMCOnlineRechargeIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6403a;

        public AmountEnteredIntentOnlineRecharge(String enteredAmountString) {
            Intrinsics.i(enteredAmountString, "enteredAmountString");
            this.f6403a = enteredAmountString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AmountEnteredIntentOnlineRecharge) && Intrinsics.d(this.f6403a, ((AmountEnteredIntentOnlineRecharge) obj).f6403a);
        }

        public final int hashCode() {
            return this.f6403a.hashCode();
        }

        public final String toString() {
            return vo1.B("AmountEnteredIntentOnlineRecharge(enteredAmountString=", this.f6403a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent$NextBtnClickIntentOnline;", "Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NextBtnClickIntentOnline extends NCMCOnlineRechargeIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NextBtnClickIntentOnline f6404a = new NextBtnClickIntentOnline();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NextBtnClickIntentOnline);
        }

        public final int hashCode() {
            return -1186044827;
        }

        public final String toString() {
            return "NextBtnClickIntentOnline";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent$OnlineRechargeSuccessful;", "Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnlineRechargeSuccessful extends NCMCOnlineRechargeIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnlineRechargeSuccessful f6405a = new OnlineRechargeSuccessful();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnlineRechargeSuccessful);
        }

        public final int hashCode() {
            return -1997006229;
        }

        public final String toString() {
            return "OnlineRechargeSuccessful";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent$RechargeSuccessBottomSheetCancelCtaClicked;", "Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RechargeSuccessBottomSheetCancelCtaClicked extends NCMCOnlineRechargeIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RechargeSuccessBottomSheetCancelCtaClicked f6406a = new RechargeSuccessBottomSheetCancelCtaClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RechargeSuccessBottomSheetCancelCtaClicked);
        }

        public final int hashCode() {
            return 513682816;
        }

        public final String toString() {
            return "RechargeSuccessBottomSheetCancelCtaClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent$RechargeSuccessBottomSheetDismissed;", "Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RechargeSuccessBottomSheetDismissed extends NCMCOnlineRechargeIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RechargeSuccessBottomSheetDismissed f6407a = new RechargeSuccessBottomSheetDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RechargeSuccessBottomSheetDismissed);
        }

        public final int hashCode() {
            return 83555354;
        }

        public final String toString() {
            return "RechargeSuccessBottomSheetDismissed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent$TncDialogueAccepted;", "Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TncDialogueAccepted extends NCMCOnlineRechargeIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TncDialogueAccepted f6408a = new TncDialogueAccepted();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TncDialogueAccepted);
        }

        public final int hashCode() {
            return -1560801167;
        }

        public final String toString() {
            return "TncDialogueAccepted";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent$TncDialogueCancelled;", "Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TncDialogueCancelled extends NCMCOnlineRechargeIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TncDialogueCancelled f6409a = new TncDialogueCancelled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TncDialogueCancelled);
        }

        public final int hashCode() {
            return 1454166471;
        }

        public final String toString() {
            return "TncDialogueCancelled";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent$TransferToOffline;", "Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TransferToOffline extends NCMCOnlineRechargeIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TransferToOffline f6410a = new TransferToOffline();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TransferToOffline);
        }

        public final int hashCode() {
            return -121778938;
        }

        public final String toString() {
            return "TransferToOffline";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent$ViewCreated;", "Lapp/chalo/ncmc/ui/ncmconlinerecharge/NCMCOnlineRechargeIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ViewCreated extends NCMCOnlineRechargeIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Source f6411a;
        public final NcmcCardRechargeConfigAppModel b;
        public final long c;
        public final String d;
        public final String e;
        public final long f;

        public ViewCreated(long j, long j2, Source source, NcmcCardRechargeConfigAppModel ncmcCardRechargeConfigAppModel, String cardNo, String kitNo) {
            Intrinsics.i(source, "source");
            Intrinsics.i(ncmcCardRechargeConfigAppModel, "ncmcCardRechargeConfigAppModel");
            Intrinsics.i(cardNo, "cardNo");
            Intrinsics.i(kitNo, "kitNo");
            this.f6411a = source;
            this.b = ncmcCardRechargeConfigAppModel;
            this.c = j;
            this.d = cardNo;
            this.e = kitNo;
            this.f = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewCreated)) {
                return false;
            }
            ViewCreated viewCreated = (ViewCreated) obj;
            return this.f6411a == viewCreated.f6411a && Intrinsics.d(this.b, viewCreated.b) && this.c == viewCreated.c && Intrinsics.d(this.d, viewCreated.d) && Intrinsics.d(this.e, viewCreated.e) && this.f == viewCreated.f;
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.f6411a.hashCode() * 31)) * 31;
            long j = this.c;
            int iE = nf1.e(nf1.e((iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.d), 31, this.e);
            long j2 = this.f;
            return iE + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewCreated(source=");
            sb.append(this.f6411a);
            sb.append(", ncmcCardRechargeConfigAppModel=");
            sb.append(this.b);
            sb.append(", onlineBalance=");
            dd.k(this.c, ", cardNo=", this.d, sb);
            d.t(sb, ", kitNo=", this.e, ", loadLimitAmount=");
            return uf0.m(this.f, ")", sb);
        }
    }
}
