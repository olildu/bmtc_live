package app.chalo.ncmc.ui.cardrechargeamount;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountErrorType;", "", "NoError", "ErrorAmountNotInRequiredMultiples", "ErrorAmountBelowMinimumRequiredAmount", "ErrorRechargeLimitExceeded", "Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountErrorType$ErrorAmountBelowMinimumRequiredAmount;", "Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountErrorType$ErrorAmountNotInRequiredMultiples;", "Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountErrorType$ErrorRechargeLimitExceeded;", "Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountErrorType$NoError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CardRechargeAmountErrorType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountErrorType$ErrorAmountBelowMinimumRequiredAmount;", "Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ErrorAmountBelowMinimumRequiredAmount extends CardRechargeAmountErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6281a;

        public ErrorAmountBelowMinimumRequiredAmount(String minimumRequiredAmountString) {
            Intrinsics.i(minimumRequiredAmountString, "minimumRequiredAmountString");
            this.f6281a = minimumRequiredAmountString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorAmountBelowMinimumRequiredAmount) && Intrinsics.d(this.f6281a, ((ErrorAmountBelowMinimumRequiredAmount) obj).f6281a);
        }

        public final int hashCode() {
            return this.f6281a.hashCode();
        }

        public final String toString() {
            return vo1.B("ErrorAmountBelowMinimumRequiredAmount(minimumRequiredAmountString=", this.f6281a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountErrorType$ErrorAmountNotInRequiredMultiples;", "Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ErrorAmountNotInRequiredMultiples extends CardRechargeAmountErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6282a;

        public ErrorAmountNotInRequiredMultiples(String requiredMultipleOfString) {
            Intrinsics.i(requiredMultipleOfString, "requiredMultipleOfString");
            this.f6282a = requiredMultipleOfString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorAmountNotInRequiredMultiples) && Intrinsics.d(this.f6282a, ((ErrorAmountNotInRequiredMultiples) obj).f6282a);
        }

        public final int hashCode() {
            return this.f6282a.hashCode();
        }

        public final String toString() {
            return vo1.B("ErrorAmountNotInRequiredMultiples(requiredMultipleOfString=", this.f6282a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountErrorType$ErrorRechargeLimitExceeded;", "Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ErrorRechargeLimitExceeded extends CardRechargeAmountErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6283a;

        public ErrorRechargeLimitExceeded(String rechargeLimitString) {
            Intrinsics.i(rechargeLimitString, "rechargeLimitString");
            this.f6283a = rechargeLimitString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorRechargeLimitExceeded) && Intrinsics.d(this.f6283a, ((ErrorRechargeLimitExceeded) obj).f6283a);
        }

        public final int hashCode() {
            return this.f6283a.hashCode();
        }

        public final String toString() {
            return vo1.B("ErrorRechargeLimitExceeded(rechargeLimitString=", this.f6283a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountErrorType$NoError;", "Lapp/chalo/ncmc/ui/cardrechargeamount/CardRechargeAmountErrorType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoError extends CardRechargeAmountErrorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoError f6284a = new NoError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoError);
        }

        public final int hashCode() {
            return -1065321504;
        }

        public final String toString() {
            return "NoError";
        }
    }
}
