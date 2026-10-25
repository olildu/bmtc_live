package app.chalo.ncmc.ui.landing;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType;", "", "AllCardOption", "SpecificCardOption", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloCardOperationType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType;", "Recharge", "BuyNewCard", "UpdateBalance", "ChangePin", "Block", "BalanceEnquiry", "ActivateNCMCCard", "ActivateCardForMetro", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption$ActivateCardForMetro;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption$ActivateNCMCCard;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption$BalanceEnquiry;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption$Block;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption$BuyNewCard;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption$ChangePin;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption$Recharge;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption$UpdateBalance;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class AllCardOption extends ChaloCardOperationType {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption$ActivateCardForMetro;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ActivateCardForMetro extends AllCardOption {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ActivateCardForMetro f6360a = new ActivateCardForMetro();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ActivateCardForMetro);
            }

            public final int hashCode() {
                return 1648988525;
            }

            public final String toString() {
                return "ActivateCardForMetro";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption$ActivateNCMCCard;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ActivateNCMCCard extends AllCardOption {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ActivateNCMCCard f6361a = new ActivateNCMCCard();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ActivateNCMCCard);
            }

            public final int hashCode() {
                return -1703067000;
            }

            public final String toString() {
                return "ActivateNCMCCard";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption$BalanceEnquiry;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BalanceEnquiry extends AllCardOption {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final BalanceEnquiry f6362a = new BalanceEnquiry();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof BalanceEnquiry);
            }

            public final int hashCode() {
                return -1872123487;
            }

            public final String toString() {
                return "BalanceEnquiry";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption$Block;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Block extends AllCardOption {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Block f6363a = new Block();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Block);
            }

            public final int hashCode() {
                return -1657756685;
            }

            public final String toString() {
                return "Block";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption$BuyNewCard;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BuyNewCard extends AllCardOption {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final BuyNewCard f6364a = new BuyNewCard();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof BuyNewCard);
            }

            public final int hashCode() {
                return -802721852;
            }

            public final String toString() {
                return "BuyNewCard";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption$ChangePin;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ChangePin extends AllCardOption {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ChangePin f6365a = new ChangePin();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ChangePin);
            }

            public final int hashCode() {
                return -1368652757;
            }

            public final String toString() {
                return "ChangePin";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption$Recharge;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Recharge extends AllCardOption {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Recharge f6366a = new Recharge();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Recharge);
            }

            public final int hashCode() {
                return 1458019713;
            }

            public final String toString() {
                return "Recharge";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption$UpdateBalance;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$AllCardOption;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UpdateBalance extends AllCardOption {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final UpdateBalance f6367a = new UpdateBalance();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof UpdateBalance);
            }

            public final int hashCode() {
                return -1037294791;
            }

            public final String toString() {
                return "UpdateBalance";
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType;", "Recharge", "ViewOfflineBalance", "ViewTransactions", "UpdateBalance", "ChangePin", "Block", "Unlink", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption$Block;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption$ChangePin;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption$Recharge;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption$Unlink;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption$UpdateBalance;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption$ViewOfflineBalance;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption$ViewTransactions;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class SpecificCardOption extends ChaloCardOperationType {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption$Block;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Block extends SpecificCardOption {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Block f6368a = new Block();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Block);
            }

            public final int hashCode() {
                return 399395752;
            }

            public final String toString() {
                return "Block";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption$ChangePin;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ChangePin extends SpecificCardOption {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f6369a;

            public ChangePin(String kitNumber) {
                Intrinsics.i(kitNumber, "kitNumber");
                this.f6369a = kitNumber;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangePin) && Intrinsics.d(this.f6369a, ((ChangePin) obj).f6369a);
            }

            public final int hashCode() {
                return this.f6369a.hashCode();
            }

            public final String toString() {
                return vo1.B("ChangePin(kitNumber=", this.f6369a, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption$Recharge;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Recharge extends SpecificCardOption {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Recharge f6370a = new Recharge();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Recharge);
            }

            public final int hashCode() {
                return 1197923756;
            }

            public final String toString() {
                return "Recharge";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption$Unlink;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Unlink extends SpecificCardOption {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Unlink f6371a = new Unlink();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Unlink);
            }

            public final int hashCode() {
                return 42083928;
            }

            public final String toString() {
                return "Unlink";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption$UpdateBalance;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UpdateBalance extends SpecificCardOption {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final UpdateBalance f6372a = new UpdateBalance();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof UpdateBalance);
            }

            public final int hashCode() {
                return -929741330;
            }

            public final String toString() {
                return "UpdateBalance";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption$ViewOfflineBalance;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ViewOfflineBalance extends SpecificCardOption {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ViewOfflineBalance f6373a = new ViewOfflineBalance();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ViewOfflineBalance);
            }

            public final int hashCode() {
                return -1057078717;
            }

            public final String toString() {
                return "ViewOfflineBalance";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption$ViewTransactions;", "Lapp/chalo/ncmc/ui/landing/ChaloCardOperationType$SpecificCardOption;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ViewTransactions extends SpecificCardOption {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ViewTransactions f6374a = new ViewTransactions();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ViewTransactions);
            }

            public final int hashCode() {
                return 1541657247;
            }

            public final String toString() {
                return "ViewTransactions";
            }
        }
    }
}
