package app.chalo.validationsdk.vehiclebasedvalidation.domain;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/domain/FetchOndcReceiptFailureReason;", "", "InvalidReceiptReceived", "ServerError", "LocalError", "ParseError", "Unknown", "Lapp/chalo/validationsdk/vehiclebasedvalidation/domain/FetchOndcReceiptFailureReason$InvalidReceiptReceived;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/domain/FetchOndcReceiptFailureReason$LocalError;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/domain/FetchOndcReceiptFailureReason$ParseError;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/domain/FetchOndcReceiptFailureReason$ServerError;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/domain/FetchOndcReceiptFailureReason$Unknown;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FetchOndcReceiptFailureReason {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/domain/FetchOndcReceiptFailureReason$InvalidReceiptReceived;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/domain/FetchOndcReceiptFailureReason;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InvalidReceiptReceived extends FetchOndcReceiptFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InvalidReceiptReceived f10713a = new InvalidReceiptReceived();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/domain/FetchOndcReceiptFailureReason$LocalError;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/domain/FetchOndcReceiptFailureReason;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocalError extends FetchOndcReceiptFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocalError f10714a = new LocalError();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/domain/FetchOndcReceiptFailureReason$ParseError;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/domain/FetchOndcReceiptFailureReason;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ParseError extends FetchOndcReceiptFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ParseError f10715a = new ParseError();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/domain/FetchOndcReceiptFailureReason$ServerError;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/domain/FetchOndcReceiptFailureReason;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServerError extends FetchOndcReceiptFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10716a;

        public ServerError(String str) {
            this.f10716a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ServerError) && Intrinsics.d(this.f10716a, ((ServerError) obj).f10716a);
        }

        public final int hashCode() {
            String str = this.f10716a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("ServerError(msg=", this.f10716a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/domain/FetchOndcReceiptFailureReason$Unknown;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/domain/FetchOndcReceiptFailureReason;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Unknown extends FetchOndcReceiptFailureReason {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unknown f10717a = new Unknown();
    }
}
