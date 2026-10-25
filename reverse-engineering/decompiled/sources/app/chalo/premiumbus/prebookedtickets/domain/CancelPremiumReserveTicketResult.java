package app.chalo.premiumbus.prebookedtickets.domain;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/domain/CancelPremiumReserveTicketResult;", "", InitializationStatus.SUCCESS, "ServerError", "LocalError", "TicketSyncFailed", "UnknownError", "Lapp/chalo/premiumbus/prebookedtickets/domain/CancelPremiumReserveTicketResult$LocalError;", "Lapp/chalo/premiumbus/prebookedtickets/domain/CancelPremiumReserveTicketResult$ServerError;", "Lapp/chalo/premiumbus/prebookedtickets/domain/CancelPremiumReserveTicketResult$Success;", "Lapp/chalo/premiumbus/prebookedtickets/domain/CancelPremiumReserveTicketResult$TicketSyncFailed;", "Lapp/chalo/premiumbus/prebookedtickets/domain/CancelPremiumReserveTicketResult$UnknownError;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CancelPremiumReserveTicketResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/domain/CancelPremiumReserveTicketResult$LocalError;", "Lapp/chalo/premiumbus/prebookedtickets/domain/CancelPremiumReserveTicketResult;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LocalError extends CancelPremiumReserveTicketResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocalError f7295a = new LocalError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LocalError);
        }

        public final int hashCode() {
            return -1398225022;
        }

        public final String toString() {
            return "LocalError";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/domain/CancelPremiumReserveTicketResult$ServerError;", "Lapp/chalo/premiumbus/prebookedtickets/domain/CancelPremiumReserveTicketResult;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServerError extends CancelPremiumReserveTicketResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7296a;

        public ServerError(String str) {
            this.f7296a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ServerError) && Intrinsics.d(this.f7296a, ((ServerError) obj).f7296a);
        }

        public final int hashCode() {
            String str = this.f7296a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("ServerError(msg=", this.f7296a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/domain/CancelPremiumReserveTicketResult$Success;", "Lapp/chalo/premiumbus/prebookedtickets/domain/CancelPremiumReserveTicketResult;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends CancelPremiumReserveTicketResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7297a;

        public Success(String str) {
            this.f7297a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.d(this.f7297a, ((Success) obj).f7297a);
        }

        public final int hashCode() {
            String str = this.f7297a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("Success(cancellationMessage=", this.f7297a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/domain/CancelPremiumReserveTicketResult$TicketSyncFailed;", "Lapp/chalo/premiumbus/prebookedtickets/domain/CancelPremiumReserveTicketResult;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TicketSyncFailed extends CancelPremiumReserveTicketResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TicketSyncFailed f7298a = new TicketSyncFailed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TicketSyncFailed);
        }

        public final int hashCode() {
            return 987942217;
        }

        public final String toString() {
            return "TicketSyncFailed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/domain/CancelPremiumReserveTicketResult$UnknownError;", "Lapp/chalo/premiumbus/prebookedtickets/domain/CancelPremiumReserveTicketResult;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UnknownError extends CancelPremiumReserveTicketResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnknownError f7299a = new UnknownError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UnknownError);
        }

        public final int hashCode() {
            return -2096940861;
        }

        public final String toString() {
            return "UnknownError";
        }
    }

    public final int a() {
        if (this instanceof Success) {
            return -1;
        }
        if (equals(LocalError.f7295a)) {
            return 104;
        }
        if (this instanceof ServerError) {
            return 107;
        }
        if (equals(TicketSyncFailed.f7298a)) {
            return FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD;
        }
        if (equals(UnknownError.f7299a)) {
            return 109;
        }
        throw new NoWhenBranchMatchedException();
    }
}
