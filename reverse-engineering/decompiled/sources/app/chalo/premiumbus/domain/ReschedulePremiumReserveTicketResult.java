package app.chalo.premiumbus.domain;

import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.math.Primes;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/premiumbus/domain/ReschedulePremiumReserveTicketResult;", "", InitializationStatus.SUCCESS, "ServerError", "ParsingError", "LocalError", "TicketSyncFailedError", "UnknownError", "Lapp/chalo/premiumbus/domain/ReschedulePremiumReserveTicketResult$LocalError;", "Lapp/chalo/premiumbus/domain/ReschedulePremiumReserveTicketResult$ParsingError;", "Lapp/chalo/premiumbus/domain/ReschedulePremiumReserveTicketResult$ServerError;", "Lapp/chalo/premiumbus/domain/ReschedulePremiumReserveTicketResult$Success;", "Lapp/chalo/premiumbus/domain/ReschedulePremiumReserveTicketResult$TicketSyncFailedError;", "Lapp/chalo/premiumbus/domain/ReschedulePremiumReserveTicketResult$UnknownError;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ReschedulePremiumReserveTicketResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ReschedulePremiumReserveTicketResult$LocalError;", "Lapp/chalo/premiumbus/domain/ReschedulePremiumReserveTicketResult;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocalError extends ReschedulePremiumReserveTicketResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocalError f7236a = new LocalError();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ReschedulePremiumReserveTicketResult$ParsingError;", "Lapp/chalo/premiumbus/domain/ReschedulePremiumReserveTicketResult;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ParsingError extends ReschedulePremiumReserveTicketResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ParsingError f7237a = new ParsingError();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ReschedulePremiumReserveTicketResult$ServerError;", "Lapp/chalo/premiumbus/domain/ReschedulePremiumReserveTicketResult;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServerError extends ReschedulePremiumReserveTicketResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7238a;

        public ServerError(String str) {
            this.f7238a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ServerError) && Intrinsics.d(this.f7238a, ((ServerError) obj).f7238a);
        }

        public final int hashCode() {
            String str = this.f7238a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("ServerError(msg=", this.f7238a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ReschedulePremiumReserveTicketResult$Success;", "Lapp/chalo/premiumbus/domain/ReschedulePremiumReserveTicketResult;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends ReschedulePremiumReserveTicketResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7239a;

        public Success(String bookingId) {
            Intrinsics.i(bookingId, "bookingId");
            this.f7239a = bookingId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.d(this.f7239a, ((Success) obj).f7239a);
        }

        public final int hashCode() {
            return this.f7239a.hashCode();
        }

        public final String toString() {
            return vo1.B("Success(bookingId=", this.f7239a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ReschedulePremiumReserveTicketResult$TicketSyncFailedError;", "Lapp/chalo/premiumbus/domain/ReschedulePremiumReserveTicketResult;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TicketSyncFailedError extends ReschedulePremiumReserveTicketResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TicketSyncFailedError f7240a = new TicketSyncFailedError();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ReschedulePremiumReserveTicketResult$UnknownError;", "Lapp/chalo/premiumbus/domain/ReschedulePremiumReserveTicketResult;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnknownError extends ReschedulePremiumReserveTicketResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnknownError f7241a = new UnknownError();
    }

    public final int a() {
        if (this instanceof Success) {
            return -1;
        }
        if (equals(LocalError.f7236a)) {
            return 212;
        }
        if (equals(ParsingError.f7237a)) {
            return 213;
        }
        if (this instanceof ServerError) {
            return 210;
        }
        if (equals(TicketSyncFailedError.f7240a)) {
            return Primes.SMALL_FACTOR_LIMIT;
        }
        if (equals(UnknownError.f7241a)) {
            return 214;
        }
        throw new NoWhenBranchMatchedException();
    }
}
