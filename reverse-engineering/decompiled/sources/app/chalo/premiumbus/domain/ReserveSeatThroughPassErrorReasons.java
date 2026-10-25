package app.chalo.premiumbus.domain;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassErrorReasons;", "", "UserNotLoggedIn", "ServerError", "LocalError", "ParseError", "UnknownError", "HistoryCallFailed", "GenderMismatchError", "Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassErrorReasons$GenderMismatchError;", "Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassErrorReasons$HistoryCallFailed;", "Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassErrorReasons$LocalError;", "Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassErrorReasons$ParseError;", "Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassErrorReasons$ServerError;", "Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassErrorReasons$UnknownError;", "Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassErrorReasons$UserNotLoggedIn;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ReserveSeatThroughPassErrorReasons {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassErrorReasons$GenderMismatchError;", "Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassErrorReasons;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenderMismatchError extends ReserveSeatThroughPassErrorReasons {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7243a;

        public GenderMismatchError(String str) {
            this.f7243a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GenderMismatchError) && Intrinsics.d(this.f7243a, ((GenderMismatchError) obj).f7243a);
        }

        public final int hashCode() {
            String str = this.f7243a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("GenderMismatchError(message=", this.f7243a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassErrorReasons$HistoryCallFailed;", "Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassErrorReasons;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HistoryCallFailed extends ReserveSeatThroughPassErrorReasons {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HistoryCallFailed f7244a = new HistoryCallFailed();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassErrorReasons$LocalError;", "Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassErrorReasons;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocalError extends ReserveSeatThroughPassErrorReasons {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocalError f7245a = new LocalError();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassErrorReasons$ParseError;", "Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassErrorReasons;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ParseError extends ReserveSeatThroughPassErrorReasons {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ParseError f7246a = new ParseError();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassErrorReasons$ServerError;", "Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassErrorReasons;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServerError extends ReserveSeatThroughPassErrorReasons {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7247a;

        public ServerError(String str) {
            this.f7247a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ServerError) && Intrinsics.d(this.f7247a, ((ServerError) obj).f7247a);
        }

        public final int hashCode() {
            String str = this.f7247a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return vo1.B("ServerError(errorMsg=", this.f7247a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassErrorReasons$UnknownError;", "Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassErrorReasons;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnknownError extends ReserveSeatThroughPassErrorReasons {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnknownError f7248a = new UnknownError();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassErrorReasons$UserNotLoggedIn;", "Lapp/chalo/premiumbus/domain/ReserveSeatThroughPassErrorReasons;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UserNotLoggedIn extends ReserveSeatThroughPassErrorReasons {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UserNotLoggedIn f7249a = new UserNotLoggedIn();
    }

    public final String a() {
        if (this instanceof UserNotLoggedIn) {
            return "User Not Logged In";
        }
        if (this instanceof ServerError) {
            return "Server Error";
        }
        if (this instanceof LocalError) {
            return "Local Error";
        }
        if (this instanceof ParseError) {
            return "Parse Error";
        }
        if (this instanceof UnknownError) {
            return "Unknown Error";
        }
        if (this instanceof HistoryCallFailed) {
            return "History Call Failed";
        }
        if (this instanceof GenderMismatchError) {
            return "Gender Mismatch Error";
        }
        throw new NoWhenBranchMatchedException();
    }
}
