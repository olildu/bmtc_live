package app.chalo.quickpay.partialchangehandler.tripamount;

import defpackage.vo1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountScreenBottomSheetType;", "", "QuickPayConfirmationBottomSheet", "QuickPayPrerequisitesBottomSheet", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountScreenBottomSheetType$QuickPayConfirmationBottomSheet;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountScreenBottomSheetType$QuickPayPrerequisitesBottomSheet;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class QuickpayTripAmountScreenBottomSheetType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountScreenBottomSheetType$QuickPayConfirmationBottomSheet;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountScreenBottomSheetType;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuickPayConfirmationBottomSheet extends QuickpayTripAmountScreenBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8883a;
        public final boolean b;
        public final long c;
        public final QuickpayBottomSheetError d;
        public final boolean e;

        public QuickPayConfirmationBottomSheet(long j, boolean z, long j2, QuickpayBottomSheetError quickpayBottomSheetError, boolean z2) {
            this.f8883a = j;
            this.b = z;
            this.c = j2;
            this.d = quickpayBottomSheetError;
            this.e = z2;
        }

        public static QuickPayConfirmationBottomSheet a(QuickPayConfirmationBottomSheet quickPayConfirmationBottomSheet, boolean z, long j, QuickpayBottomSheetError quickpayBottomSheetError, int i) {
            long j2 = quickPayConfirmationBottomSheet.f8883a;
            if ((i & 2) != 0) {
                z = quickPayConfirmationBottomSheet.b;
            }
            boolean z2 = z;
            if ((i & 4) != 0) {
                j = quickPayConfirmationBottomSheet.c;
            }
            long j3 = j;
            if ((i & 8) != 0) {
                quickpayBottomSheetError = quickPayConfirmationBottomSheet.d;
            }
            return new QuickPayConfirmationBottomSheet(j2, z2, j3, quickpayBottomSheetError, quickPayConfirmationBottomSheet.e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuickPayConfirmationBottomSheet)) {
                return false;
            }
            QuickPayConfirmationBottomSheet quickPayConfirmationBottomSheet = (QuickPayConfirmationBottomSheet) obj;
            return this.f8883a == quickPayConfirmationBottomSheet.f8883a && this.b == quickPayConfirmationBottomSheet.b && this.c == quickPayConfirmationBottomSheet.c && this.d == quickPayConfirmationBottomSheet.d && this.e == quickPayConfirmationBottomSheet.e;
        }

        public final int hashCode() {
            long j = this.f8883a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            int i2 = this.b ? 1231 : 1237;
            long j2 = this.c;
            int i3 = (((i + i2) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
            QuickpayBottomSheetError quickpayBottomSheetError = this.d;
            return ((i3 + (quickpayBottomSheetError == null ? 0 : quickpayBottomSheetError.hashCode())) * 31) + (this.e ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QuickPayConfirmationBottomSheet(amount=");
            sb.append(this.f8883a);
            sb.append(", isLoading=");
            sb.append(this.b);
            xs.r(this.c, ", remainingBalance=", ", error=", sb);
            sb.append(this.d);
            sb.append(", shouldShowYesBankBranding=");
            sb.append(this.e);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountScreenBottomSheetType$QuickPayPrerequisitesBottomSheet;", "Lapp/chalo/quickpay/partialchangehandler/tripamount/QuickpayTripAmountScreenBottomSheetType;", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuickPayPrerequisitesBottomSheet extends QuickpayTripAmountScreenBottomSheetType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8884a;

        public QuickPayPrerequisitesBottomSheet(String str) {
            this.f8884a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QuickPayPrerequisitesBottomSheet) && Intrinsics.d(this.f8884a, ((QuickPayPrerequisitesBottomSheet) obj).f8884a);
        }

        public final int hashCode() {
            String str = this.f8884a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("QuickPayPrerequisitesBottomSheet(amount=", this.f8884a, ")");
        }
    }
}
