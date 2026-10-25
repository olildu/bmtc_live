package app.chalo.ncmc.ui.cardrechargeamount;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountLayoutType;", "", "FullScreenLoadingLayout", "EnterAmountLayout", "ErrorLayout", "RechargeSuccess", "Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountLayoutType$EnterAmountLayout;", "Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountLayoutType$ErrorLayout;", "Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountLayoutType$FullScreenLoadingLayout;", "Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountLayoutType$RechargeSuccess;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CardRechargeAmountLayoutType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountLayoutType$EnterAmountLayout;", "Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountLayoutType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EnterAmountLayout extends CardRechargeAmountLayoutType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnterAmountLayout f6285a = new EnterAmountLayout();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EnterAmountLayout);
        }

        public final int hashCode() {
            return 1318072747;
        }

        public final String toString() {
            return "EnterAmountLayout";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountLayoutType$ErrorLayout;", "Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountLayoutType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ErrorLayout extends CardRechargeAmountLayoutType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardRechargeDataFetchErrorReason f6286a;

        public ErrorLayout(CardRechargeDataFetchErrorReason errorReason) {
            Intrinsics.i(errorReason, "errorReason");
            this.f6286a = errorReason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorLayout) && this.f6286a == ((ErrorLayout) obj).f6286a;
        }

        public final int hashCode() {
            return this.f6286a.hashCode();
        }

        public final String toString() {
            return "ErrorLayout(errorReason=" + this.f6286a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountLayoutType$FullScreenLoadingLayout;", "Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountLayoutType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FullScreenLoadingLayout extends CardRechargeAmountLayoutType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FullScreenLoadingLayout f6287a = new FullScreenLoadingLayout();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FullScreenLoadingLayout);
        }

        public final int hashCode() {
            return 292324284;
        }

        public final String toString() {
            return "FullScreenLoadingLayout";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountLayoutType$RechargeSuccess;", "Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountLayoutType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RechargeSuccess extends CardRechargeAmountLayoutType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RechargeSuccess f6288a = new RechargeSuccess();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RechargeSuccess);
        }

        public final int hashCode() {
            return -1195330387;
        }

        public final String toString() {
            return "RechargeSuccess";
        }
    }
}
