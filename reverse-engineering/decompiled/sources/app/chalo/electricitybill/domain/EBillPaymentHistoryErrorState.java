package app.chalo.electricitybill.domain;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/electricitybill/domain/EBillPaymentHistoryErrorState;", "", "EmptyList", "ApiFailedError", "Lapp/chalo/electricitybill/domain/EBillPaymentHistoryErrorState$ApiFailedError;", "Lapp/chalo/electricitybill/domain/EBillPaymentHistoryErrorState$EmptyList;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EBillPaymentHistoryErrorState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2547a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/domain/EBillPaymentHistoryErrorState$ApiFailedError;", "Lapp/chalo/electricitybill/domain/EBillPaymentHistoryErrorState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ApiFailedError extends EBillPaymentHistoryErrorState {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApiFailedError(String message) {
            super(message);
            Intrinsics.i(message, "message");
            this.b = message;
        }

        @Override // app.chalo.electricitybill.domain.EBillPaymentHistoryErrorState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF2547a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApiFailedError) && Intrinsics.d(this.b, ((ApiFailedError) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("ApiFailedError(message=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/domain/EBillPaymentHistoryErrorState$EmptyList;", "Lapp/chalo/electricitybill/domain/EBillPaymentHistoryErrorState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EmptyList extends EBillPaymentHistoryErrorState {
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmptyList(String message) {
            super(message);
            Intrinsics.i(message, "message");
            this.b = message;
        }

        @Override // app.chalo.electricitybill.domain.EBillPaymentHistoryErrorState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF2547a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmptyList) && Intrinsics.d(this.b, ((EmptyList) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("EmptyList(message=", this.b, ")");
        }
    }

    public EBillPaymentHistoryErrorState(String str) {
        this.f2547a = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public String getF2547a() {
        return this.f2547a;
    }
}
